//
// This file generated by rdl 1.4.11. Do not modify!
//

package com.yahoo.athenz.zms;
import java.util.List;
import com.yahoo.rdl.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

//
// DomainDataCheck - Domain data object representing the results of a check
// operation looking for dangling roles, policies and trust relationships that
// are set either on tenant or provider side only
//
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
public class DomainDataCheck {
    @RdlOptional
    public List<String> danglingRoles;
    @RdlOptional
    public List<DanglingPolicy> danglingPolicies;
    public int policyCount;
    public int assertionCount;
    public int roleWildCardCount;
    @RdlOptional
    public List<String> providersWithoutTrust;
    @RdlOptional
    public List<String> tenantsWithoutAssumeRole;

    public DomainDataCheck setDanglingRoles(List<String> danglingRoles) {
        this.danglingRoles = danglingRoles;
        return this;
    }
    public List<String> getDanglingRoles() {
        return danglingRoles;
    }
    public DomainDataCheck setDanglingPolicies(List<DanglingPolicy> danglingPolicies) {
        this.danglingPolicies = danglingPolicies;
        return this;
    }
    public List<DanglingPolicy> getDanglingPolicies() {
        return danglingPolicies;
    }
    public DomainDataCheck setPolicyCount(int policyCount) {
        this.policyCount = policyCount;
        return this;
    }
    public int getPolicyCount() {
        return policyCount;
    }
    public DomainDataCheck setAssertionCount(int assertionCount) {
        this.assertionCount = assertionCount;
        return this;
    }
    public int getAssertionCount() {
        return assertionCount;
    }
    public DomainDataCheck setRoleWildCardCount(int roleWildCardCount) {
        this.roleWildCardCount = roleWildCardCount;
        return this;
    }
    public int getRoleWildCardCount() {
        return roleWildCardCount;
    }
    public DomainDataCheck setProvidersWithoutTrust(List<String> providersWithoutTrust) {
        this.providersWithoutTrust = providersWithoutTrust;
        return this;
    }
    public List<String> getProvidersWithoutTrust() {
        return providersWithoutTrust;
    }
    public DomainDataCheck setTenantsWithoutAssumeRole(List<String> tenantsWithoutAssumeRole) {
        this.tenantsWithoutAssumeRole = tenantsWithoutAssumeRole;
        return this;
    }
    public List<String> getTenantsWithoutAssumeRole() {
        return tenantsWithoutAssumeRole;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != DomainDataCheck.class) {
                return false;
            }
            DomainDataCheck a = (DomainDataCheck) another;
            if (danglingRoles == null ? a.danglingRoles != null : !danglingRoles.equals(a.danglingRoles)) {
                return false;
            }
            if (danglingPolicies == null ? a.danglingPolicies != null : !danglingPolicies.equals(a.danglingPolicies)) {
                return false;
            }
            if (policyCount != a.policyCount) {
                return false;
            }
            if (assertionCount != a.assertionCount) {
                return false;
            }
            if (roleWildCardCount != a.roleWildCardCount) {
                return false;
            }
            if (providersWithoutTrust == null ? a.providersWithoutTrust != null : !providersWithoutTrust.equals(a.providersWithoutTrust)) {
                return false;
            }
            if (tenantsWithoutAssumeRole == null ? a.tenantsWithoutAssumeRole != null : !tenantsWithoutAssumeRole.equals(a.tenantsWithoutAssumeRole)) {
                return false;
            }
        }
        return true;
    }
}
