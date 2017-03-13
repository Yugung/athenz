//
// This file generated by rdl 1.4.11. Do not modify!
//

package com.yahoo.athenz.zms;
import com.yahoo.rdl.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

//
// RoleMember -
//
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
public class RoleMember {
    public String memberName;
    @RdlOptional
    public Timestamp expiration;

    public RoleMember setMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }
    public String getMemberName() {
        return memberName;
    }
    public RoleMember setExpiration(Timestamp expiration) {
        this.expiration = expiration;
        return this;
    }
    public Timestamp getExpiration() {
        return expiration;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != RoleMember.class) {
                return false;
            }
            RoleMember a = (RoleMember) another;
            if (memberName == null ? a.memberName != null : !memberName.equals(a.memberName)) {
                return false;
            }
            if (expiration == null ? a.expiration != null : !expiration.equals(a.expiration)) {
                return false;
            }
        }
        return true;
    }
}
