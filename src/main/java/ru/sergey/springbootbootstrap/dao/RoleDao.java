package ru.sergey.springbootbootstrap.dao;

import ru.sergey.springbootbootstrap.model.Role;

import java.util.List;

public interface RoleDao {

    List<Role> getAllRoles();

    Role getRole(String userRole);

    Role getRoleById(Long id);

    void addRole(Role role);
}
