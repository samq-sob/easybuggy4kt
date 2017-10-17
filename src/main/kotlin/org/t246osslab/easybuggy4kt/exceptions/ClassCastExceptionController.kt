package org.t246osslab.easybuggy4kt.exceptions

import javax.servlet.http.HttpServletRequest

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class ClassCastExceptionController {

    @RequestMapping(value = "/cce")
    fun process(req: HttpServletRequest) {
        req.setAttribute("param1", "value1")
        req.setAttribute("param2", req.getAttribute("param1") as Array<String>)
    }
}