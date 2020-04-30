package io.jpress.web.writerDirective;

import com.jfinal.aop.Inject;
import com.jfinal.core.Controller;
import com.jfinal.template.Env;
import com.jfinal.template.io.Writer;
import com.jfinal.template.stat.Scope;
import io.jboot.web.controller.JbootControllerContext;
import io.jboot.web.directive.annotation.JFinalDirective;
import io.jboot.web.directive.base.JbootDirectiveBase;
import io.jpress.model.User;
import io.jpress.service.UserFavoriteService;

@JFinalDirective("centerFavorite")
public class CenterFavoriteDirective extends JbootDirectiveBase {
    @Inject
    private UserFavoriteService favoriteService;
    @Override
    public void onRender(Env env, Scope scope, Writer writer) {
        Controller controller = JbootControllerContext.get();
        User user = controller.getAttr("centerUser");
        //
        Long writerId = getPara(0, scope);
        //被访问者ID
        boolean articleFav = favoriteService.isFollowFav(user.getId(), writerId);
        if (articleFav){
            scope.setLocal("isFav", articleFav);
        }else {
            scope.setLocal("isFav", null);
        }


        renderBody(env, scope, writer);
    }
    @Override
    public boolean hasEnd() {
        return true;
    }
}
