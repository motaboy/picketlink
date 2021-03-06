package org.picketlink.permission.spi;

import java.util.Collection;
import java.util.List;

import org.picketlink.permission.Permission;
import org.picketlink.permission.PermissionQuery;

/**
 * 
 * @author Shane Bryzak
 */
public interface PermissionStore
{
    List<Permission> getPermissions(PermissionQuery query);

    boolean grantPermission(Permission permission);

    boolean grantPermissions(Collection<Permission> permissions);

    boolean revokePermission(Permission permission);

    boolean revokePermissions(Collection<Permission> permissions);

    List<String> listAvailableActions(Object target);

    void clearPermissions(Object target);

    boolean isEnabled();
}
