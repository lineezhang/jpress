package io.jpress.model;

import io.jboot.db.annotation.Table;
import io.jpress.model.base.BaseMemberGroup;

/**
 * Generated by JPress.
 */
@Table(tableName = "member_group", primaryKey = "id")
public class MemberGroup extends BaseMemberGroup<MemberGroup> {

    private static final long serialVersionUID = 1L;

    public static final int STATUS_NORMAL = 9;
    public static final int STATUS_UNNORMAL = 1;

    public boolean isShowInUcenter(){
        return getWithUcenter() != null && getWithUcenter();
    }

    public boolean isNormal(){
       return getStatus() != null && getStatus() == STATUS_NORMAL;
    }

	
}
