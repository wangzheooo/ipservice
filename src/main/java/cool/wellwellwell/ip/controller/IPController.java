package cool.wellwellwell.ip.controller;

import cool.wellwellwell.ip.utils.IPUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: auther
 * @Date: 2021/4/22 11:24
 * @Description:
 */
@Controller
public class IPController {

    @ResponseBody
    @RequestMapping("/")
    public String getIp(HttpServletRequest request) {
        return IPUtils.getIpAddr(request);
    }

}
