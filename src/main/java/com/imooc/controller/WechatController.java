package com.imooc.controller;

import com.imooc.enums.ResultEnum;
import com.imooc.exception.SellException;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.result.WxMpOAuth2AccessToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URLEncoder;

@Controller
@RequestMapping("/wechat")
@Slf4j
public class WechatController {

    @Autowired
    private WxMpService wxMpService;


    @GetMapping("/authorize")
    public  String  authorize(@RequestParam("returnUrl") String returnUrl){
    //1.配置


    //2.调用方法
    String url = "http://xiaoxuanzi.natapp1.cc/sell/wechat/userInfo";
    String redirecUrl =  wxMpService.oauth2buildAuthorizationUrl(url, WxConsts.OAUTH2_SCOPE_USER_INFO, URLEncoder.encode(returnUrl));
    log.info("[微信网页授权] 获取code,result={}",redirecUrl);
    return "redirect:" + redirecUrl;


     }

    @GetMapping("/userInfo")
    public  String userInfo(@RequestParam("code") String code,
                          @RequestParam("state") String returnUrl) {
        WxMpOAuth2AccessToken wxMpOAuth2AccessToken = new WxMpOAuth2AccessToken();
        try {
            wxMpOAuth2AccessToken =   wxMpService.oauth2getAccessToken(code);
        }catch (WxErrorException e) {
            log.error("微信网页授权",e);
            e.printStackTrace();
            throw  new SellException(ResultEnum.WXCHAT_MP_ERROR.getCode(),e.getError().getErrorMsg());
        }

        String openId = wxMpOAuth2AccessToken.getOpenId();

        return "redirect:" + returnUrl + "?openid=" + openId;

    }

//   "http://xiaoxuanzi.natapp1.cc/sell/wechat/authorize?returnUrl=http://www.imooc.com";
//    https://open.weixin.qq.com/connect/oauth2/authorize?appid=wxf03386eb7da44c89&redirect_uri=http%3A%2F%2Fxiaoxuanzi.natapp1.cc%2Fsell%2Fwechat%2FuserInfo&response_type=code&scope=snsapi_userinfo&state=http%3A%2F%2Fwww.imooc.com&connect_redirect=1#wechat_redirect



}





