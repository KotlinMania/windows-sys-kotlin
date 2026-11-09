@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

private val _windowsWin32SecurityNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun AccessCheck(psecuritydescriptor: PSECURITY_DESCRIPTOR, clienttoken: HANDLE, desiredaccess: UInt, genericmapping: Long, privilegeset: Long, privilegesetlength: Long, grantedaccess: Long, accessstatus: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_AccessCheck(psecuritydescriptor.toString(), clienttoken.toString(), desiredaccess.toInt(), genericmapping.toString(), privilegeset.toString(), privilegesetlength.toString(), grantedaccess.toString(), accessstatus.toString()) as Int) else 0

public actual fun AccessCheckAndAuditAlarmA(subsystemname: PCSTR, handleid: Long, objecttypename: PCSTR, objectname: PCSTR, securitydescriptor: PSECURITY_DESCRIPTOR, desiredaccess: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccess: Long, accessstatus: Long, pfgenerateonclose: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_AccessCheckAndAuditAlarmA(subsystemname.toString(), handleid.toString(), objecttypename.toString(), objectname.toString(), securitydescriptor.toString(), desiredaccess.toInt(), genericmapping.toString(), objectcreation, grantedaccess.toString(), accessstatus.toString(), pfgenerateonclose.toString()) as Int) else 0

public actual fun AccessCheckAndAuditAlarmW(subsystemname: PCWSTR, handleid: Long, objecttypename: PCWSTR, objectname: PCWSTR, securitydescriptor: PSECURITY_DESCRIPTOR, desiredaccess: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccess: Long, accessstatus: Long, pfgenerateonclose: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_AccessCheckAndAuditAlarmW(subsystemname.toString(), handleid.toString(), objecttypename.toString(), objectname.toString(), securitydescriptor.toString(), desiredaccess.toInt(), genericmapping.toString(), objectcreation, grantedaccess.toString(), accessstatus.toString(), pfgenerateonclose.toString()) as Int) else 0

public actual fun AccessCheckByType(psecuritydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, clienttoken: HANDLE, desiredaccess: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, privilegeset: Long, privilegesetlength: Long, grantedaccess: Long, accessstatus: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_AccessCheckByType(psecuritydescriptor.toString(), principalselfsid.toString(), clienttoken.toString(), desiredaccess.toInt(), objecttypelist.toString(), objecttypelistlength.toInt(), genericmapping.toString(), privilegeset.toString(), privilegesetlength.toString(), grantedaccess.toString(), accessstatus.toString()) as Int) else 0

public actual fun AccessCheckByTypeAndAuditAlarmA(subsystemname: PCSTR, handleid: Long, objecttypename: PCSTR, objectname: PCSTR, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccess: Long, accessstatus: Long, pfgenerateonclose: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_AccessCheckByTypeAndAuditAlarmA(subsystemname.toString(), handleid.toString(), objecttypename.toString(), objectname.toString(), securitydescriptor.toString(), principalselfsid.toString(), desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.toString(), objecttypelistlength.toInt(), genericmapping.toString(), objectcreation, grantedaccess.toString(), accessstatus.toString(), pfgenerateonclose.toString()) as Int) else 0

public actual fun AccessCheckByTypeAndAuditAlarmW(subsystemname: PCWSTR, handleid: Long, objecttypename: PCWSTR, objectname: PCWSTR, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccess: Long, accessstatus: Long, pfgenerateonclose: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_AccessCheckByTypeAndAuditAlarmW(subsystemname.toString(), handleid.toString(), objecttypename.toString(), objectname.toString(), securitydescriptor.toString(), principalselfsid.toString(), desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.toString(), objecttypelistlength.toInt(), genericmapping.toString(), objectcreation, grantedaccess.toString(), accessstatus.toString(), pfgenerateonclose.toString()) as Int) else 0

public actual fun AccessCheckByTypeResultList(psecuritydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, clienttoken: HANDLE, desiredaccess: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, privilegeset: Long, privilegesetlength: Long, grantedaccesslist: Long, accessstatuslist: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_AccessCheckByTypeResultList(psecuritydescriptor.toString(), principalselfsid.toString(), clienttoken.toString(), desiredaccess.toInt(), objecttypelist.toString(), objecttypelistlength.toInt(), genericmapping.toString(), privilegeset.toString(), privilegesetlength.toString(), grantedaccesslist.toString(), accessstatuslist.toString()) as Int) else 0

public actual fun AccessCheckByTypeResultListAndAuditAlarmA(subsystemname: PCSTR, handleid: Long, objecttypename: PCSTR, objectname: PCSTR, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccess: Long, accessstatuslist: Long, pfgenerateonclose: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_AccessCheckByTypeResultListAndAuditAlarmA(subsystemname.toString(), handleid.toString(), objecttypename.toString(), objectname.toString(), securitydescriptor.toString(), principalselfsid.toString(), desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.toString(), objecttypelistlength.toInt(), genericmapping.toString(), objectcreation, grantedaccess.toString(), accessstatuslist.toString(), pfgenerateonclose.toString()) as Int) else 0

public actual fun AccessCheckByTypeResultListAndAuditAlarmByHandleA(subsystemname: PCSTR, handleid: Long, clienttoken: HANDLE, objecttypename: PCSTR, objectname: PCSTR, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccess: Long, accessstatuslist: Long, pfgenerateonclose: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_AccessCheckByTypeResultListAndAuditAlarmByHandleA(subsystemname.toString(), handleid.toString(), clienttoken.toString(), objecttypename.toString(), objectname.toString(), securitydescriptor.toString(), principalselfsid.toString(), desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.toString(), objecttypelistlength.toInt(), genericmapping.toString(), objectcreation, grantedaccess.toString(), accessstatuslist.toString(), pfgenerateonclose.toString()) as Int) else 0

public actual fun AccessCheckByTypeResultListAndAuditAlarmByHandleW(subsystemname: PCWSTR, handleid: Long, clienttoken: HANDLE, objecttypename: PCWSTR, objectname: PCWSTR, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccesslist: Long, accessstatuslist: Long, pfgenerateonclose: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_AccessCheckByTypeResultListAndAuditAlarmByHandleW(subsystemname.toString(), handleid.toString(), clienttoken.toString(), objecttypename.toString(), objectname.toString(), securitydescriptor.toString(), principalselfsid.toString(), desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.toString(), objecttypelistlength.toInt(), genericmapping.toString(), objectcreation, grantedaccesslist.toString(), accessstatuslist.toString(), pfgenerateonclose.toString()) as Int) else 0

public actual fun AccessCheckByTypeResultListAndAuditAlarmW(subsystemname: PCWSTR, handleid: Long, objecttypename: PCWSTR, objectname: PCWSTR, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccesslist: Long, accessstatuslist: Long, pfgenerateonclose: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_AccessCheckByTypeResultListAndAuditAlarmW(subsystemname.toString(), handleid.toString(), objecttypename.toString(), objectname.toString(), securitydescriptor.toString(), principalselfsid.toString(), desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.toString(), objecttypelistlength.toInt(), genericmapping.toString(), objectcreation, grantedaccesslist.toString(), accessstatuslist.toString(), pfgenerateonclose.toString()) as Int) else 0

public actual fun AddAccessAllowedAce(pacl: Long, dwacerevision: ACE_REVISION, accessmask: UInt, psid: PSID): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_AddAccessAllowedAce(pacl.toString(), dwacerevision.toInt(), accessmask.toInt(), psid.toString()) as Int) else 0

public actual fun AddAccessAllowedAceEx(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, psid: PSID): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_AddAccessAllowedAceEx(pacl.toString(), dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), psid.toString()) as Int) else 0

public actual fun AddAccessAllowedObjectAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, objecttypeguid: Long, inheritedobjecttypeguid: Long, psid: PSID): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_AddAccessAllowedObjectAce(pacl.toString(), dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), objecttypeguid.toString(), inheritedobjecttypeguid.toString(), psid.toString()) as Int) else 0

public actual fun AddAccessDeniedAce(pacl: Long, dwacerevision: ACE_REVISION, accessmask: UInt, psid: PSID): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_AddAccessDeniedAce(pacl.toString(), dwacerevision.toInt(), accessmask.toInt(), psid.toString()) as Int) else 0

public actual fun AddAccessDeniedAceEx(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, psid: PSID): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_AddAccessDeniedAceEx(pacl.toString(), dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), psid.toString()) as Int) else 0

public actual fun AddAccessDeniedObjectAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, objecttypeguid: Long, inheritedobjecttypeguid: Long, psid: PSID): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_AddAccessDeniedObjectAce(pacl.toString(), dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), objecttypeguid.toString(), inheritedobjecttypeguid.toString(), psid.toString()) as Int) else 0

public actual fun AddAce(pacl: Long, dwacerevision: ACE_REVISION, dwstartingaceindex: UInt, pacelist: Long, nacelistlength: UInt): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_AddAce(pacl.toString(), dwacerevision.toInt(), dwstartingaceindex.toInt(), pacelist.toString(), nacelistlength.toInt()) as Int) else 0

public actual fun AddAuditAccessAce(pacl: Long, dwacerevision: ACE_REVISION, dwaccessmask: UInt, psid: PSID, bauditsuccess: BOOL, bauditfailure: BOOL): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_AddAuditAccessAce(pacl.toString(), dwacerevision.toInt(), dwaccessmask.toInt(), psid.toString(), bauditsuccess, bauditfailure) as Int) else 0

public actual fun AddAuditAccessAceEx(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, dwaccessmask: UInt, psid: PSID, bauditsuccess: BOOL, bauditfailure: BOOL): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_AddAuditAccessAceEx(pacl.toString(), dwacerevision.toInt(), aceflags.toInt(), dwaccessmask.toInt(), psid.toString(), bauditsuccess, bauditfailure) as Int) else 0

public actual fun AddAuditAccessObjectAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, objecttypeguid: Long, inheritedobjecttypeguid: Long, psid: PSID, bauditsuccess: BOOL, bauditfailure: BOOL): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_AddAuditAccessObjectAce(pacl.toString(), dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), objecttypeguid.toString(), inheritedobjecttypeguid.toString(), psid.toString(), bauditsuccess, bauditfailure) as Int) else 0

public actual fun AddConditionalAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, acetype: UByte, accessmask: UInt, psid: PSID, conditionstr: PCWSTR, returnlength: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_AddConditionalAce(pacl.toString(), dwacerevision.toInt(), aceflags.toInt(), acetype.toInt(), accessmask.toInt(), psid.toString(), conditionstr.toString(), returnlength.toString()) as Int) else 0

public actual fun AddMandatoryAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, mandatorypolicy: UInt, plabelsid: PSID): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_AddMandatoryAce(pacl.toString(), dwacerevision.toInt(), aceflags.toInt(), mandatorypolicy.toInt(), plabelsid.toString()) as Int) else 0

public actual fun AddResourceAttributeAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, psid: PSID, pattributeinfo: Long, preturnlength: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_AddResourceAttributeAce(pacl.toString(), dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), psid.toString(), pattributeinfo.toString(), preturnlength.toString()) as Int) else 0

public actual fun AddScopedPolicyIDAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, psid: PSID): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_AddScopedPolicyIDAce(pacl.toString(), dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), psid.toString()) as Int) else 0

public actual fun AdjustTokenGroups(tokenhandle: HANDLE, resettodefault: BOOL, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_AdjustTokenGroups(tokenhandle.toString(), resettodefault, newstate.toString(), bufferlength.toInt(), previousstate.toString(), returnlength.toString()) as Int) else 0

public actual fun AdjustTokenPrivileges(tokenhandle: HANDLE, disableallprivileges: BOOL, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_AdjustTokenPrivileges(tokenhandle.toString(), disableallprivileges, newstate.toString(), bufferlength.toInt(), previousstate.toString(), returnlength.toString()) as Int) else 0

public actual fun AllocateAndInitializeSid(pidentifierauthority: Long, nsubauthoritycount: UByte, nsubauthority0: UInt, nsubauthority1: UInt, nsubauthority2: UInt, nsubauthority3: UInt, nsubauthority4: UInt, nsubauthority5: UInt, nsubauthority6: UInt, nsubauthority7: UInt, psid: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_AllocateAndInitializeSid(pidentifierauthority.toString(), nsubauthoritycount.toInt(), nsubauthority0.toInt(), nsubauthority1.toInt(), nsubauthority2.toInt(), nsubauthority3.toInt(), nsubauthority4.toInt(), nsubauthority5.toInt(), nsubauthority6.toInt(), nsubauthority7.toInt(), psid.toString()) as Int) else 0

public actual fun AllocateLocallyUniqueId(luid: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_AllocateLocallyUniqueId(luid.toString()) as Int) else 0

public actual fun AreAllAccessesGranted(grantedaccess: UInt, desiredaccess: UInt): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_AreAllAccessesGranted(grantedaccess.toInt(), desiredaccess.toInt()) as Int) else 0

public actual fun AreAnyAccessesGranted(grantedaccess: UInt, desiredaccess: UInt): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_AreAnyAccessesGranted(grantedaccess.toInt(), desiredaccess.toInt()) as Int) else 0

public actual fun CheckTokenCapability(tokenhandle: HANDLE, capabilitysidtocheck: PSID, hascapability: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_CheckTokenCapability(tokenhandle.toString(), capabilitysidtocheck.toString(), hascapability.toString()) as Int) else 0

public actual fun CheckTokenMembership(tokenhandle: HANDLE, sidtocheck: PSID, ismember: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_CheckTokenMembership(tokenhandle.toString(), sidtocheck.toString(), ismember.toString()) as Int) else 0

public actual fun CheckTokenMembershipEx(tokenhandle: HANDLE, sidtocheck: PSID, flags: UInt, ismember: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_CheckTokenMembershipEx(tokenhandle.toString(), sidtocheck.toString(), flags.toInt(), ismember.toString()) as Int) else 0

public actual fun ConvertToAutoInheritPrivateObjectSecurity(parentdescriptor: PSECURITY_DESCRIPTOR, currentsecuritydescriptor: PSECURITY_DESCRIPTOR, newsecuritydescriptor: Long, objecttype: Long, isdirectoryobject: Boolean, genericmapping: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_ConvertToAutoInheritPrivateObjectSecurity(parentdescriptor.toString(), currentsecuritydescriptor.toString(), newsecuritydescriptor.toString(), objecttype.toString(), isdirectoryobject, genericmapping.toString()) as Int) else 0

public actual fun CopySid(ndestinationsidlength: UInt, pdestinationsid: PSID, psourcesid: PSID): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_CopySid(ndestinationsidlength.toInt(), pdestinationsid.toString(), psourcesid.toString()) as Int) else 0

public actual fun CreatePrivateObjectSecurity(parentdescriptor: PSECURITY_DESCRIPTOR, creatordescriptor: PSECURITY_DESCRIPTOR, newdescriptor: Long, isdirectoryobject: BOOL, token: HANDLE, genericmapping: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_CreatePrivateObjectSecurity(parentdescriptor.toString(), creatordescriptor.toString(), newdescriptor.toString(), isdirectoryobject, token.toString(), genericmapping.toString()) as Int) else 0

public actual fun CreatePrivateObjectSecurityEx(parentdescriptor: PSECURITY_DESCRIPTOR, creatordescriptor: PSECURITY_DESCRIPTOR, newdescriptor: Long, objecttype: Long, iscontainerobject: BOOL, autoinheritflags: SECURITY_AUTO_INHERIT_FLAGS, token: HANDLE, genericmapping: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_CreatePrivateObjectSecurityEx(parentdescriptor.toString(), creatordescriptor.toString(), newdescriptor.toString(), objecttype.toString(), iscontainerobject, autoinheritflags.toInt(), token.toString(), genericmapping.toString()) as Int) else 0

public actual fun CreatePrivateObjectSecurityWithMultipleInheritance(parentdescriptor: PSECURITY_DESCRIPTOR, creatordescriptor: PSECURITY_DESCRIPTOR, newdescriptor: Long, objecttypes: Long, guidcount: UInt, iscontainerobject: BOOL, autoinheritflags: SECURITY_AUTO_INHERIT_FLAGS, token: HANDLE, genericmapping: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_CreatePrivateObjectSecurityWithMultipleInheritance(parentdescriptor.toString(), creatordescriptor.toString(), newdescriptor.toString(), objecttypes.toString(), guidcount.toInt(), iscontainerobject, autoinheritflags.toInt(), token.toString(), genericmapping.toString()) as Int) else 0

public actual fun CreateRestrictedToken(existingtokenhandle: HANDLE, flags: CREATE_RESTRICTED_TOKEN_FLAGS, disablesidcount: UInt, sidstodisable: Long, deleteprivilegecount: UInt, privilegestodelete: Long, restrictedsidcount: UInt, sidstorestrict: Long, newtokenhandle: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_CreateRestrictedToken(existingtokenhandle.toString(), flags.toInt(), disablesidcount.toInt(), sidstodisable.toString(), deleteprivilegecount.toInt(), privilegestodelete.toString(), restrictedsidcount.toInt(), sidstorestrict.toString(), newtokenhandle.toString()) as Int) else 0

public actual fun CreateWellKnownSid(wellknownsidtype: WELL_KNOWN_SID_TYPE, domainsid: PSID, psid: PSID, cbsid: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_CreateWellKnownSid(wellknownsidtype, domainsid.toString(), psid.toString(), cbsid.toString()) as Int) else 0

public actual fun DeleteAce(pacl: Long, dwaceindex: UInt): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_DeleteAce(pacl.toString(), dwaceindex.toInt()) as Int) else 0

public actual fun DeriveCapabilitySidsFromName(capname: PCWSTR, capabilitygroupsids: Long, capabilitygroupsidcount: Long, capabilitysids: Long, capabilitysidcount: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_DeriveCapabilitySidsFromName(capname.toString(), capabilitygroupsids.toString(), capabilitygroupsidcount.toString(), capabilitysids.toString(), capabilitysidcount.toString()) as Int) else 0

public actual fun DestroyPrivateObjectSecurity(objectdescriptor: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_DestroyPrivateObjectSecurity(objectdescriptor.toString()) as Int) else 0

public actual fun DuplicateToken(existingtokenhandle: HANDLE, impersonationlevel: SECURITY_IMPERSONATION_LEVEL, duplicatetokenhandle: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_DuplicateToken(existingtokenhandle.toString(), impersonationlevel, duplicatetokenhandle.toString()) as Int) else 0

public actual fun DuplicateTokenEx(hexistingtoken: HANDLE, dwdesiredaccess: TOKEN_ACCESS_MASK, lptokenattributes: Long, impersonationlevel: SECURITY_IMPERSONATION_LEVEL, tokentype: TOKEN_TYPE, phnewtoken: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_DuplicateTokenEx(hexistingtoken.toString(), dwdesiredaccess.toInt(), lptokenattributes.toString(), impersonationlevel, tokentype, phnewtoken.toString()) as Int) else 0

public actual fun EqualDomainSid(psid1: PSID, psid2: PSID, pfequal: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_EqualDomainSid(psid1.toString(), psid2.toString(), pfequal.toString()) as Int) else 0

public actual fun EqualPrefixSid(psid1: PSID, psid2: PSID): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_EqualPrefixSid(psid1.toString(), psid2.toString()) as Int) else 0

public actual fun EqualSid(psid1: PSID, psid2: PSID): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_EqualSid(psid1.toString(), psid2.toString()) as Int) else 0

public actual fun FindFirstFreeAce(pacl: Long, pace: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_FindFirstFreeAce(pacl.toString(), pace.toString()) as Int) else 0

public actual fun FreeSid(psid: PSID): Long =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_FreeSid(psid.toString()) as String).toLong() else 0L

public actual fun GetAce(pacl: Long, dwaceindex: UInt, pace: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_GetAce(pacl.toString(), dwaceindex.toInt(), pace.toString()) as Int) else 0

public actual fun GetAclInformation(pacl: Long, paclinformation: Long, naclinformationlength: UInt, dwaclinformationclass: ACL_INFORMATION_CLASS): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_GetAclInformation(pacl.toString(), paclinformation.toString(), naclinformationlength.toInt(), dwaclinformationclass) as Int) else 0

public actual fun GetAppContainerAce(acl: Long, startingaceindex: UInt, appcontainerace: Long, appcontaineraceindex: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_GetAppContainerAce(acl.toString(), startingaceindex.toInt(), appcontainerace.toString(), appcontaineraceindex.toString()) as Int) else 0

public actual fun GetCachedSigningLevel(file: HANDLE, flags: Long, signinglevel: Long, thumbprint: Long, thumbprintsize: Long, thumbprintalgorithm: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_GetCachedSigningLevel(file.toString(), flags.toString(), signinglevel.toString(), thumbprint.toString(), thumbprintsize.toString(), thumbprintalgorithm.toString()) as Int) else 0

public actual fun GetFileSecurityA(lpfilename: PCSTR, requestedinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_GetFileSecurityA(lpfilename.toString(), requestedinformation.toInt(), psecuritydescriptor.toString(), nlength.toInt(), lpnlengthneeded.toString()) as Int) else 0

public actual fun GetFileSecurityW(lpfilename: PCWSTR, requestedinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_GetFileSecurityW(lpfilename.toString(), requestedinformation.toInt(), psecuritydescriptor.toString(), nlength.toInt(), lpnlengthneeded.toString()) as Int) else 0

public actual fun GetKernelObjectSecurity(handle: HANDLE, requestedinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_GetKernelObjectSecurity(handle.toString(), requestedinformation.toInt(), psecuritydescriptor.toString(), nlength.toInt(), lpnlengthneeded.toString()) as Int) else 0

public actual fun GetLengthSid(psid: PSID): UInt =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_GetLengthSid(psid.toString()) as Int).toUInt() else 0u

public actual fun GetPrivateObjectSecurity(objectdescriptor: PSECURITY_DESCRIPTOR, securityinformation: OBJECT_SECURITY_INFORMATION, resultantdescriptor: PSECURITY_DESCRIPTOR, descriptorlength: UInt, returnlength: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_GetPrivateObjectSecurity(objectdescriptor.toString(), securityinformation.toInt(), resultantdescriptor.toString(), descriptorlength.toInt(), returnlength.toString()) as Int) else 0

public actual fun GetSecurityDescriptorControl(psecuritydescriptor: PSECURITY_DESCRIPTOR, pcontrol: Long, lpdwrevision: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_GetSecurityDescriptorControl(psecuritydescriptor.toString(), pcontrol.toString(), lpdwrevision.toString()) as Int) else 0

public actual fun GetSecurityDescriptorDacl(psecuritydescriptor: PSECURITY_DESCRIPTOR, lpbdaclpresent: Long, pdacl: Long, lpbdacldefaulted: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_GetSecurityDescriptorDacl(psecuritydescriptor.toString(), lpbdaclpresent.toString(), pdacl.toString(), lpbdacldefaulted.toString()) as Int) else 0

public actual fun GetSecurityDescriptorGroup(psecuritydescriptor: PSECURITY_DESCRIPTOR, pgroup: Long, lpbgroupdefaulted: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_GetSecurityDescriptorGroup(psecuritydescriptor.toString(), pgroup.toString(), lpbgroupdefaulted.toString()) as Int) else 0

public actual fun GetSecurityDescriptorLength(psecuritydescriptor: PSECURITY_DESCRIPTOR): UInt =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_GetSecurityDescriptorLength(psecuritydescriptor.toString()) as Int).toUInt() else 0u

public actual fun GetSecurityDescriptorOwner(psecuritydescriptor: PSECURITY_DESCRIPTOR, powner: Long, lpbownerdefaulted: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_GetSecurityDescriptorOwner(psecuritydescriptor.toString(), powner.toString(), lpbownerdefaulted.toString()) as Int) else 0

public actual fun GetSecurityDescriptorRMControl(securitydescriptor: PSECURITY_DESCRIPTOR, rmcontrol: Long): UInt =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_GetSecurityDescriptorRMControl(securitydescriptor.toString(), rmcontrol.toString()) as Int).toUInt() else 0u

public actual fun GetSecurityDescriptorSacl(psecuritydescriptor: PSECURITY_DESCRIPTOR, lpbsaclpresent: Long, psacl: Long, lpbsacldefaulted: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_GetSecurityDescriptorSacl(psecuritydescriptor.toString(), lpbsaclpresent.toString(), psacl.toString(), lpbsacldefaulted.toString()) as Int) else 0

public actual fun GetSidIdentifierAuthority(psid: PSID): Long =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_GetSidIdentifierAuthority(psid.toString()) as String).toLong() else 0L

public actual fun GetSidLengthRequired(nsubauthoritycount: UByte): UInt =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_GetSidLengthRequired(nsubauthoritycount.toInt()) as Int).toUInt() else 0u

public actual fun GetSidSubAuthority(psid: PSID, nsubauthority: UInt): Long =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_GetSidSubAuthority(psid.toString(), nsubauthority.toInt()) as String).toLong() else 0L

public actual fun GetSidSubAuthorityCount(psid: PSID): Long =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_GetSidSubAuthorityCount(psid.toString()) as String).toLong() else 0L

public actual fun GetTokenInformation(tokenhandle: HANDLE, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt, returnlength: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_GetTokenInformation(tokenhandle.toString(), tokeninformationclass, tokeninformation.toString(), tokeninformationlength.toInt(), returnlength.toString()) as Int) else 0

public actual fun GetUserObjectSecurity(hobj: HANDLE, psirequested: Long, psid: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_GetUserObjectSecurity(hobj.toString(), psirequested.toString(), psid.toString(), nlength.toInt(), lpnlengthneeded.toString()) as Int) else 0

public actual fun GetWindowsAccountDomainSid(psid: PSID, pdomainsid: PSID, cbdomainsid: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_GetWindowsAccountDomainSid(psid.toString(), pdomainsid.toString(), cbdomainsid.toString()) as Int) else 0

public actual fun ImpersonateAnonymousToken(threadhandle: HANDLE): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_ImpersonateAnonymousToken(threadhandle.toString()) as Int) else 0

public actual fun ImpersonateLoggedOnUser(htoken: HANDLE): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_ImpersonateLoggedOnUser(htoken.toString()) as Int) else 0

public actual fun ImpersonateSelf(impersonationlevel: SECURITY_IMPERSONATION_LEVEL): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_ImpersonateSelf(impersonationlevel) as Int) else 0

public actual fun InitializeAcl(pacl: Long, nacllength: UInt, dwaclrevision: ACE_REVISION): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_InitializeAcl(pacl.toString(), nacllength.toInt(), dwaclrevision.toInt()) as Int) else 0

public actual fun InitializeSecurityDescriptor(psecuritydescriptor: PSECURITY_DESCRIPTOR, dwrevision: UInt): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_InitializeSecurityDescriptor(psecuritydescriptor.toString(), dwrevision.toInt()) as Int) else 0

public actual fun InitializeSid(sid: PSID, pidentifierauthority: Long, nsubauthoritycount: UByte): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_InitializeSid(sid.toString(), pidentifierauthority.toString(), nsubauthoritycount.toInt()) as Int) else 0

public actual fun IsTokenRestricted(tokenhandle: HANDLE): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_IsTokenRestricted(tokenhandle.toString()) as Int) else 0

public actual fun IsValidAcl(pacl: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_IsValidAcl(pacl.toString()) as Int) else 0

public actual fun IsValidSecurityDescriptor(psecuritydescriptor: PSECURITY_DESCRIPTOR): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_IsValidSecurityDescriptor(psecuritydescriptor.toString()) as Int) else 0

public actual fun IsValidSid(psid: PSID): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_IsValidSid(psid.toString()) as Int) else 0

public actual fun IsWellKnownSid(psid: PSID, wellknownsidtype: WELL_KNOWN_SID_TYPE): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_IsWellKnownSid(psid.toString(), wellknownsidtype) as Int) else 0

public actual fun LogonUserA(lpszusername: PCSTR, lpszdomain: PCSTR, lpszpassword: PCSTR, dwlogontype: LOGON32_LOGON, dwlogonprovider: LOGON32_PROVIDER, phtoken: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_LogonUserA(lpszusername.toString(), lpszdomain.toString(), lpszpassword.toString(), dwlogontype.toInt(), dwlogonprovider.toInt(), phtoken.toString()) as Int) else 0

public actual fun LogonUserExA(lpszusername: PCSTR, lpszdomain: PCSTR, lpszpassword: PCSTR, dwlogontype: LOGON32_LOGON, dwlogonprovider: LOGON32_PROVIDER, phtoken: Long, pplogonsid: Long, ppprofilebuffer: Long, pdwprofilelength: Long, pquotalimits: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_LogonUserExA(lpszusername.toString(), lpszdomain.toString(), lpszpassword.toString(), dwlogontype.toInt(), dwlogonprovider.toInt(), phtoken.toString(), pplogonsid.toString(), ppprofilebuffer.toString(), pdwprofilelength.toString(), pquotalimits.toString()) as Int) else 0

public actual fun LogonUserExW(lpszusername: PCWSTR, lpszdomain: PCWSTR, lpszpassword: PCWSTR, dwlogontype: LOGON32_LOGON, dwlogonprovider: LOGON32_PROVIDER, phtoken: Long, pplogonsid: Long, ppprofilebuffer: Long, pdwprofilelength: Long, pquotalimits: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_LogonUserExW(lpszusername.toString(), lpszdomain.toString(), lpszpassword.toString(), dwlogontype.toInt(), dwlogonprovider.toInt(), phtoken.toString(), pplogonsid.toString(), ppprofilebuffer.toString(), pdwprofilelength.toString(), pquotalimits.toString()) as Int) else 0

public actual fun LogonUserW(lpszusername: PCWSTR, lpszdomain: PCWSTR, lpszpassword: PCWSTR, dwlogontype: LOGON32_LOGON, dwlogonprovider: LOGON32_PROVIDER, phtoken: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_LogonUserW(lpszusername.toString(), lpszdomain.toString(), lpszpassword.toString(), dwlogontype.toInt(), dwlogonprovider.toInt(), phtoken.toString()) as Int) else 0

public actual fun LookupAccountNameA(lpsystemname: PCSTR, lpaccountname: PCSTR, sid: PSID, cbsid: Long, referenceddomainname: PSTR, cchreferenceddomainname: Long, peuse: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_LookupAccountNameA(lpsystemname.toString(), lpaccountname.toString(), sid.toString(), cbsid.toString(), referenceddomainname.toString(), cchreferenceddomainname.toString(), peuse.toString()) as Int) else 0

public actual fun LookupAccountNameW(lpsystemname: PCWSTR, lpaccountname: PCWSTR, sid: PSID, cbsid: Long, referenceddomainname: PWSTR, cchreferenceddomainname: Long, peuse: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_LookupAccountNameW(lpsystemname.toString(), lpaccountname.toString(), sid.toString(), cbsid.toString(), referenceddomainname.toString(), cchreferenceddomainname.toString(), peuse.toString()) as Int) else 0

public actual fun LookupAccountSidA(lpsystemname: PCSTR, sid: PSID, name: PSTR, cchname: Long, referenceddomainname: PSTR, cchreferenceddomainname: Long, peuse: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_LookupAccountSidA(lpsystemname.toString(), sid.toString(), name.toString(), cchname.toString(), referenceddomainname.toString(), cchreferenceddomainname.toString(), peuse.toString()) as Int) else 0

public actual fun LookupAccountSidW(lpsystemname: PCWSTR, sid: PSID, name: PWSTR, cchname: Long, referenceddomainname: PWSTR, cchreferenceddomainname: Long, peuse: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_LookupAccountSidW(lpsystemname.toString(), sid.toString(), name.toString(), cchname.toString(), referenceddomainname.toString(), cchreferenceddomainname.toString(), peuse.toString()) as Int) else 0

public actual fun LookupPrivilegeDisplayNameA(lpsystemname: PCSTR, lpname: PCSTR, lpdisplayname: PSTR, cchdisplayname: Long, lplanguageid: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_LookupPrivilegeDisplayNameA(lpsystemname.toString(), lpname.toString(), lpdisplayname.toString(), cchdisplayname.toString(), lplanguageid.toString()) as Int) else 0

public actual fun LookupPrivilegeDisplayNameW(lpsystemname: PCWSTR, lpname: PCWSTR, lpdisplayname: PWSTR, cchdisplayname: Long, lplanguageid: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_LookupPrivilegeDisplayNameW(lpsystemname.toString(), lpname.toString(), lpdisplayname.toString(), cchdisplayname.toString(), lplanguageid.toString()) as Int) else 0

public actual fun LookupPrivilegeNameA(lpsystemname: PCSTR, lpluid: Long, lpname: PSTR, cchname: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_LookupPrivilegeNameA(lpsystemname.toString(), lpluid.toString(), lpname.toString(), cchname.toString()) as Int) else 0

public actual fun LookupPrivilegeNameW(lpsystemname: PCWSTR, lpluid: Long, lpname: PWSTR, cchname: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_LookupPrivilegeNameW(lpsystemname.toString(), lpluid.toString(), lpname.toString(), cchname.toString()) as Int) else 0

public actual fun LookupPrivilegeValueA(lpsystemname: PCSTR, lpname: PCSTR, lpluid: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_LookupPrivilegeValueA(lpsystemname.toString(), lpname.toString(), lpluid.toString()) as Int) else 0

public actual fun LookupPrivilegeValueW(lpsystemname: PCWSTR, lpname: PCWSTR, lpluid: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_LookupPrivilegeValueW(lpsystemname.toString(), lpname.toString(), lpluid.toString()) as Int) else 0

public actual fun MakeAbsoluteSD(pselfrelativesecuritydescriptor: PSECURITY_DESCRIPTOR, pabsolutesecuritydescriptor: PSECURITY_DESCRIPTOR, lpdwabsolutesecuritydescriptorsize: Long, pdacl: Long, lpdwdaclsize: Long, psacl: Long, lpdwsaclsize: Long, powner: PSID, lpdwownersize: Long, pprimarygroup: PSID, lpdwprimarygroupsize: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_MakeAbsoluteSD(pselfrelativesecuritydescriptor.toString(), pabsolutesecuritydescriptor.toString(), lpdwabsolutesecuritydescriptorsize.toString(), pdacl.toString(), lpdwdaclsize.toString(), psacl.toString(), lpdwsaclsize.toString(), powner.toString(), lpdwownersize.toString(), pprimarygroup.toString(), lpdwprimarygroupsize.toString()) as Int) else 0

public actual fun MakeSelfRelativeSD(pabsolutesecuritydescriptor: PSECURITY_DESCRIPTOR, pselfrelativesecuritydescriptor: PSECURITY_DESCRIPTOR, lpdwbufferlength: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_MakeSelfRelativeSD(pabsolutesecuritydescriptor.toString(), pselfrelativesecuritydescriptor.toString(), lpdwbufferlength.toString()) as Int) else 0

public actual fun MapGenericMask(accessmask: Long, genericmapping: Long) {
    if (_windowsWin32SecurityNapiAddon != null) {
        _windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_MapGenericMask(accessmask.toString(), genericmapping.toString())
    }
}

public actual fun ObjectCloseAuditAlarmA(subsystemname: PCSTR, handleid: Long, generateonclose: BOOL): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_ObjectCloseAuditAlarmA(subsystemname.toString(), handleid.toString(), generateonclose) as Int) else 0

public actual fun ObjectCloseAuditAlarmW(subsystemname: PCWSTR, handleid: Long, generateonclose: BOOL): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_ObjectCloseAuditAlarmW(subsystemname.toString(), handleid.toString(), generateonclose) as Int) else 0

public actual fun ObjectDeleteAuditAlarmA(subsystemname: PCSTR, handleid: Long, generateonclose: BOOL): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_ObjectDeleteAuditAlarmA(subsystemname.toString(), handleid.toString(), generateonclose) as Int) else 0

public actual fun ObjectDeleteAuditAlarmW(subsystemname: PCWSTR, handleid: Long, generateonclose: BOOL): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_ObjectDeleteAuditAlarmW(subsystemname.toString(), handleid.toString(), generateonclose) as Int) else 0

public actual fun ObjectOpenAuditAlarmA(subsystemname: PCSTR, handleid: Long, objecttypename: PCSTR, objectname: PCSTR, psecuritydescriptor: PSECURITY_DESCRIPTOR, clienttoken: HANDLE, desiredaccess: UInt, grantedaccess: UInt, privileges: Long, objectcreation: BOOL, accessgranted: BOOL, generateonclose: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_ObjectOpenAuditAlarmA(subsystemname.toString(), handleid.toString(), objecttypename.toString(), objectname.toString(), psecuritydescriptor.toString(), clienttoken.toString(), desiredaccess.toInt(), grantedaccess.toInt(), privileges.toString(), objectcreation, accessgranted, generateonclose.toString()) as Int) else 0

public actual fun ObjectOpenAuditAlarmW(subsystemname: PCWSTR, handleid: Long, objecttypename: PCWSTR, objectname: PCWSTR, psecuritydescriptor: PSECURITY_DESCRIPTOR, clienttoken: HANDLE, desiredaccess: UInt, grantedaccess: UInt, privileges: Long, objectcreation: BOOL, accessgranted: BOOL, generateonclose: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_ObjectOpenAuditAlarmW(subsystemname.toString(), handleid.toString(), objecttypename.toString(), objectname.toString(), psecuritydescriptor.toString(), clienttoken.toString(), desiredaccess.toInt(), grantedaccess.toInt(), privileges.toString(), objectcreation, accessgranted, generateonclose.toString()) as Int) else 0

public actual fun ObjectPrivilegeAuditAlarmA(subsystemname: PCSTR, handleid: Long, clienttoken: HANDLE, desiredaccess: UInt, privileges: Long, accessgranted: BOOL): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_ObjectPrivilegeAuditAlarmA(subsystemname.toString(), handleid.toString(), clienttoken.toString(), desiredaccess.toInt(), privileges.toString(), accessgranted) as Int) else 0

public actual fun ObjectPrivilegeAuditAlarmW(subsystemname: PCWSTR, handleid: Long, clienttoken: HANDLE, desiredaccess: UInt, privileges: Long, accessgranted: BOOL): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_ObjectPrivilegeAuditAlarmW(subsystemname.toString(), handleid.toString(), clienttoken.toString(), desiredaccess.toInt(), privileges.toString(), accessgranted) as Int) else 0

public actual fun PrivilegeCheck(clienttoken: HANDLE, requiredprivileges: Long, pfresult: Long): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_PrivilegeCheck(clienttoken.toString(), requiredprivileges.toString(), pfresult.toString()) as Int) else 0

public actual fun PrivilegedServiceAuditAlarmA(subsystemname: PCSTR, servicename: PCSTR, clienttoken: HANDLE, privileges: Long, accessgranted: BOOL): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_PrivilegedServiceAuditAlarmA(subsystemname.toString(), servicename.toString(), clienttoken.toString(), privileges.toString(), accessgranted) as Int) else 0

public actual fun PrivilegedServiceAuditAlarmW(subsystemname: PCWSTR, servicename: PCWSTR, clienttoken: HANDLE, privileges: Long, accessgranted: BOOL): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_PrivilegedServiceAuditAlarmW(subsystemname.toString(), servicename.toString(), clienttoken.toString(), privileges.toString(), accessgranted) as Int) else 0

public actual fun QuerySecurityAccessMask(securityinformation: OBJECT_SECURITY_INFORMATION, desiredaccess: Long) {
    if (_windowsWin32SecurityNapiAddon != null) {
        _windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_QuerySecurityAccessMask(securityinformation.toInt(), desiredaccess.toString())
    }
}

public actual fun RevertToSelf(): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_RevertToSelf() as Int) else 0

public actual fun RtlConvertSidToUnicodeString(unicodestring: Long, sid: PSID, allocatedestinationstring: Boolean): NTSTATUS =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_RtlConvertSidToUnicodeString(unicodestring.toString(), sid.toString(), allocatedestinationstring) as Int) else 0

public actual fun RtlNormalizeSecurityDescriptor(securitydescriptor: Long, securitydescriptorlength: UInt, newsecuritydescriptor: Long, newsecuritydescriptorlength: Long, checkonly: Boolean): Boolean =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_RtlNormalizeSecurityDescriptor(securitydescriptor.toString(), securitydescriptorlength.toInt(), newsecuritydescriptor.toString(), newsecuritydescriptorlength.toString(), checkonly) as Boolean) else false

public actual fun SetAclInformation(pacl: Long, paclinformation: Long, naclinformationlength: UInt, dwaclinformationclass: ACL_INFORMATION_CLASS): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_SetAclInformation(pacl.toString(), paclinformation.toString(), naclinformationlength.toInt(), dwaclinformationclass) as Int) else 0

public actual fun SetCachedSigningLevel(sourcefiles: Long, sourcefilecount: UInt, flags: UInt, targetfile: HANDLE): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_SetCachedSigningLevel(sourcefiles.toString(), sourcefilecount.toInt(), flags.toInt(), targetfile.toString()) as Int) else 0

public actual fun SetFileSecurityA(lpfilename: PCSTR, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_SetFileSecurityA(lpfilename.toString(), securityinformation.toInt(), psecuritydescriptor.toString()) as Int) else 0

public actual fun SetFileSecurityW(lpfilename: PCWSTR, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_SetFileSecurityW(lpfilename.toString(), securityinformation.toInt(), psecuritydescriptor.toString()) as Int) else 0

public actual fun SetKernelObjectSecurity(handle: HANDLE, securityinformation: OBJECT_SECURITY_INFORMATION, securitydescriptor: PSECURITY_DESCRIPTOR): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_SetKernelObjectSecurity(handle.toString(), securityinformation.toInt(), securitydescriptor.toString()) as Int) else 0

public actual fun SetPrivateObjectSecurity(securityinformation: OBJECT_SECURITY_INFORMATION, modificationdescriptor: PSECURITY_DESCRIPTOR, objectssecuritydescriptor: Long, genericmapping: Long, token: HANDLE): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_SetPrivateObjectSecurity(securityinformation.toInt(), modificationdescriptor.toString(), objectssecuritydescriptor.toString(), genericmapping.toString(), token.toString()) as Int) else 0

public actual fun SetPrivateObjectSecurityEx(securityinformation: OBJECT_SECURITY_INFORMATION, modificationdescriptor: PSECURITY_DESCRIPTOR, objectssecuritydescriptor: Long, autoinheritflags: SECURITY_AUTO_INHERIT_FLAGS, genericmapping: Long, token: HANDLE): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_SetPrivateObjectSecurityEx(securityinformation.toInt(), modificationdescriptor.toString(), objectssecuritydescriptor.toString(), autoinheritflags.toInt(), genericmapping.toString(), token.toString()) as Int) else 0

public actual fun SetSecurityAccessMask(securityinformation: OBJECT_SECURITY_INFORMATION, desiredaccess: Long) {
    if (_windowsWin32SecurityNapiAddon != null) {
        _windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_SetSecurityAccessMask(securityinformation.toInt(), desiredaccess.toString())
    }
}

public actual fun SetSecurityDescriptorControl(psecuritydescriptor: PSECURITY_DESCRIPTOR, controlbitsofinterest: SECURITY_DESCRIPTOR_CONTROL, controlbitstoset: SECURITY_DESCRIPTOR_CONTROL): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_SetSecurityDescriptorControl(psecuritydescriptor.toString(), controlbitsofinterest.toInt(), controlbitstoset.toInt()) as Int) else 0

public actual fun SetSecurityDescriptorDacl(psecuritydescriptor: PSECURITY_DESCRIPTOR, bdaclpresent: BOOL, pdacl: Long, bdacldefaulted: BOOL): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_SetSecurityDescriptorDacl(psecuritydescriptor.toString(), bdaclpresent, pdacl.toString(), bdacldefaulted) as Int) else 0

public actual fun SetSecurityDescriptorGroup(psecuritydescriptor: PSECURITY_DESCRIPTOR, pgroup: PSID, bgroupdefaulted: BOOL): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_SetSecurityDescriptorGroup(psecuritydescriptor.toString(), pgroup.toString(), bgroupdefaulted) as Int) else 0

public actual fun SetSecurityDescriptorOwner(psecuritydescriptor: PSECURITY_DESCRIPTOR, powner: PSID, bownerdefaulted: BOOL): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_SetSecurityDescriptorOwner(psecuritydescriptor.toString(), powner.toString(), bownerdefaulted) as Int) else 0

public actual fun SetSecurityDescriptorRMControl(securitydescriptor: PSECURITY_DESCRIPTOR, rmcontrol: Long): UInt =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_SetSecurityDescriptorRMControl(securitydescriptor.toString(), rmcontrol.toString()) as Int).toUInt() else 0u

public actual fun SetSecurityDescriptorSacl(psecuritydescriptor: PSECURITY_DESCRIPTOR, bsaclpresent: BOOL, psacl: Long, bsacldefaulted: BOOL): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_SetSecurityDescriptorSacl(psecuritydescriptor.toString(), bsaclpresent, psacl.toString(), bsacldefaulted) as Int) else 0

public actual fun SetTokenInformation(tokenhandle: HANDLE, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_SetTokenInformation(tokenhandle.toString(), tokeninformationclass, tokeninformation.toString(), tokeninformationlength.toInt()) as Int) else 0

public actual fun SetUserObjectSecurity(hobj: HANDLE, psirequested: Long, psid: PSECURITY_DESCRIPTOR): BOOL =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_SetUserObjectSecurity(hobj.toString(), psirequested.toString(), psid.toString()) as Int) else 0
