@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun AccessCheck(psecuritydescriptor: PSECURITY_DESCRIPTOR, clienttoken: HANDLE, desiredaccess: UInt, genericmapping: Long, privilegeset: Long, privilegesetlength: Long, grantedaccess: Long, accessstatus: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_AccessCheck(psecuritydescriptor.toCPointer<ByteVar>(), clienttoken.toCPointer<ByteVar>(), desiredaccess, genericmapping.toCPointer<ByteVar>(), privilegeset.toCPointer<ByteVar>(), privilegesetlength.toCPointer<ByteVar>(), grantedaccess.toCPointer<ByteVar>(), accessstatus.toCPointer<ByteVar>())

public actual fun AccessCheckAndAuditAlarmA(subsystemname: PCSTR, handleid: Long, objecttypename: PCSTR, objectname: PCSTR, securitydescriptor: PSECURITY_DESCRIPTOR, desiredaccess: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccess: Long, accessstatus: Long, pfgenerateonclose: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_AccessCheckAndAuditAlarmA(subsystemname.toCPointer<ByteVar>(), handleid.toCPointer<ByteVar>(), objecttypename.toCPointer<ByteVar>(), objectname.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>(), desiredaccess, genericmapping.toCPointer<ByteVar>(), objectcreation, grantedaccess.toCPointer<ByteVar>(), accessstatus.toCPointer<ByteVar>(), pfgenerateonclose.toCPointer<ByteVar>())

public actual fun AccessCheckAndAuditAlarmW(subsystemname: PCWSTR, handleid: Long, objecttypename: PCWSTR, objectname: PCWSTR, securitydescriptor: PSECURITY_DESCRIPTOR, desiredaccess: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccess: Long, accessstatus: Long, pfgenerateonclose: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_AccessCheckAndAuditAlarmW(subsystemname.toCPointer<ByteVar>(), handleid.toCPointer<ByteVar>(), objecttypename.toCPointer<ByteVar>(), objectname.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>(), desiredaccess, genericmapping.toCPointer<ByteVar>(), objectcreation, grantedaccess.toCPointer<ByteVar>(), accessstatus.toCPointer<ByteVar>(), pfgenerateonclose.toCPointer<ByteVar>())

public actual fun AccessCheckByType(psecuritydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, clienttoken: HANDLE, desiredaccess: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, privilegeset: Long, privilegesetlength: Long, grantedaccess: Long, accessstatus: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_AccessCheckByType(psecuritydescriptor.toCPointer<ByteVar>(), principalselfsid.toCPointer<ByteVar>(), clienttoken.toCPointer<ByteVar>(), desiredaccess, objecttypelist.toCPointer<ByteVar>(), objecttypelistlength, genericmapping.toCPointer<ByteVar>(), privilegeset.toCPointer<ByteVar>(), privilegesetlength.toCPointer<ByteVar>(), grantedaccess.toCPointer<ByteVar>(), accessstatus.toCPointer<ByteVar>())

public actual fun AccessCheckByTypeAndAuditAlarmA(subsystemname: PCSTR, handleid: Long, objecttypename: PCSTR, objectname: PCSTR, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccess: Long, accessstatus: Long, pfgenerateonclose: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_AccessCheckByTypeAndAuditAlarmA(subsystemname.toCPointer<ByteVar>(), handleid.toCPointer<ByteVar>(), objecttypename.toCPointer<ByteVar>(), objectname.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>(), principalselfsid.toCPointer<ByteVar>(), desiredaccess, audittype, flags, objecttypelist.toCPointer<ByteVar>(), objecttypelistlength, genericmapping.toCPointer<ByteVar>(), objectcreation, grantedaccess.toCPointer<ByteVar>(), accessstatus.toCPointer<ByteVar>(), pfgenerateonclose.toCPointer<ByteVar>())

public actual fun AccessCheckByTypeAndAuditAlarmW(subsystemname: PCWSTR, handleid: Long, objecttypename: PCWSTR, objectname: PCWSTR, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccess: Long, accessstatus: Long, pfgenerateonclose: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_AccessCheckByTypeAndAuditAlarmW(subsystemname.toCPointer<ByteVar>(), handleid.toCPointer<ByteVar>(), objecttypename.toCPointer<ByteVar>(), objectname.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>(), principalselfsid.toCPointer<ByteVar>(), desiredaccess, audittype, flags, objecttypelist.toCPointer<ByteVar>(), objecttypelistlength, genericmapping.toCPointer<ByteVar>(), objectcreation, grantedaccess.toCPointer<ByteVar>(), accessstatus.toCPointer<ByteVar>(), pfgenerateonclose.toCPointer<ByteVar>())

public actual fun AccessCheckByTypeResultList(psecuritydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, clienttoken: HANDLE, desiredaccess: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, privilegeset: Long, privilegesetlength: Long, grantedaccesslist: Long, accessstatuslist: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_AccessCheckByTypeResultList(psecuritydescriptor.toCPointer<ByteVar>(), principalselfsid.toCPointer<ByteVar>(), clienttoken.toCPointer<ByteVar>(), desiredaccess, objecttypelist.toCPointer<ByteVar>(), objecttypelistlength, genericmapping.toCPointer<ByteVar>(), privilegeset.toCPointer<ByteVar>(), privilegesetlength.toCPointer<ByteVar>(), grantedaccesslist.toCPointer<ByteVar>(), accessstatuslist.toCPointer<ByteVar>())

public actual fun AccessCheckByTypeResultListAndAuditAlarmA(subsystemname: PCSTR, handleid: Long, objecttypename: PCSTR, objectname: PCSTR, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccess: Long, accessstatuslist: Long, pfgenerateonclose: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_AccessCheckByTypeResultListAndAuditAlarmA(subsystemname.toCPointer<ByteVar>(), handleid.toCPointer<ByteVar>(), objecttypename.toCPointer<ByteVar>(), objectname.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>(), principalselfsid.toCPointer<ByteVar>(), desiredaccess, audittype, flags, objecttypelist.toCPointer<ByteVar>(), objecttypelistlength, genericmapping.toCPointer<ByteVar>(), objectcreation, grantedaccess.toCPointer<ByteVar>(), accessstatuslist.toCPointer<ByteVar>(), pfgenerateonclose.toCPointer<ByteVar>())

public actual fun AccessCheckByTypeResultListAndAuditAlarmByHandleA(subsystemname: PCSTR, handleid: Long, clienttoken: HANDLE, objecttypename: PCSTR, objectname: PCSTR, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccess: Long, accessstatuslist: Long, pfgenerateonclose: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_AccessCheckByTypeResultListAndAuditAlarmByHandleA(subsystemname.toCPointer<ByteVar>(), handleid.toCPointer<ByteVar>(), clienttoken.toCPointer<ByteVar>(), objecttypename.toCPointer<ByteVar>(), objectname.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>(), principalselfsid.toCPointer<ByteVar>(), desiredaccess, audittype, flags, objecttypelist.toCPointer<ByteVar>(), objecttypelistlength, genericmapping.toCPointer<ByteVar>(), objectcreation, grantedaccess.toCPointer<ByteVar>(), accessstatuslist.toCPointer<ByteVar>(), pfgenerateonclose.toCPointer<ByteVar>())

public actual fun AccessCheckByTypeResultListAndAuditAlarmByHandleW(subsystemname: PCWSTR, handleid: Long, clienttoken: HANDLE, objecttypename: PCWSTR, objectname: PCWSTR, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccesslist: Long, accessstatuslist: Long, pfgenerateonclose: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_AccessCheckByTypeResultListAndAuditAlarmByHandleW(subsystemname.toCPointer<ByteVar>(), handleid.toCPointer<ByteVar>(), clienttoken.toCPointer<ByteVar>(), objecttypename.toCPointer<ByteVar>(), objectname.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>(), principalselfsid.toCPointer<ByteVar>(), desiredaccess, audittype, flags, objecttypelist.toCPointer<ByteVar>(), objecttypelistlength, genericmapping.toCPointer<ByteVar>(), objectcreation, grantedaccesslist.toCPointer<ByteVar>(), accessstatuslist.toCPointer<ByteVar>(), pfgenerateonclose.toCPointer<ByteVar>())

public actual fun AccessCheckByTypeResultListAndAuditAlarmW(subsystemname: PCWSTR, handleid: Long, objecttypename: PCWSTR, objectname: PCWSTR, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: BOOL, grantedaccesslist: Long, accessstatuslist: Long, pfgenerateonclose: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_AccessCheckByTypeResultListAndAuditAlarmW(subsystemname.toCPointer<ByteVar>(), handleid.toCPointer<ByteVar>(), objecttypename.toCPointer<ByteVar>(), objectname.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>(), principalselfsid.toCPointer<ByteVar>(), desiredaccess, audittype, flags, objecttypelist.toCPointer<ByteVar>(), objecttypelistlength, genericmapping.toCPointer<ByteVar>(), objectcreation, grantedaccesslist.toCPointer<ByteVar>(), accessstatuslist.toCPointer<ByteVar>(), pfgenerateonclose.toCPointer<ByteVar>())

public actual fun AddAccessAllowedAce(pacl: Long, dwacerevision: ACE_REVISION, accessmask: UInt, psid: PSID): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_AddAccessAllowedAce(pacl.toCPointer<ByteVar>(), dwacerevision, accessmask, psid.toCPointer<ByteVar>())

public actual fun AddAccessAllowedAceEx(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, psid: PSID): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_AddAccessAllowedAceEx(pacl.toCPointer<ByteVar>(), dwacerevision, aceflags, accessmask, psid.toCPointer<ByteVar>())

public actual fun AddAccessAllowedObjectAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, objecttypeguid: Long, inheritedobjecttypeguid: Long, psid: PSID): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_AddAccessAllowedObjectAce(pacl.toCPointer<ByteVar>(), dwacerevision, aceflags, accessmask, objecttypeguid.toCPointer<ByteVar>(), inheritedobjecttypeguid.toCPointer<ByteVar>(), psid.toCPointer<ByteVar>())

public actual fun AddAccessDeniedAce(pacl: Long, dwacerevision: ACE_REVISION, accessmask: UInt, psid: PSID): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_AddAccessDeniedAce(pacl.toCPointer<ByteVar>(), dwacerevision, accessmask, psid.toCPointer<ByteVar>())

public actual fun AddAccessDeniedAceEx(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, psid: PSID): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_AddAccessDeniedAceEx(pacl.toCPointer<ByteVar>(), dwacerevision, aceflags, accessmask, psid.toCPointer<ByteVar>())

public actual fun AddAccessDeniedObjectAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, objecttypeguid: Long, inheritedobjecttypeguid: Long, psid: PSID): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_AddAccessDeniedObjectAce(pacl.toCPointer<ByteVar>(), dwacerevision, aceflags, accessmask, objecttypeguid.toCPointer<ByteVar>(), inheritedobjecttypeguid.toCPointer<ByteVar>(), psid.toCPointer<ByteVar>())

public actual fun AddAce(pacl: Long, dwacerevision: ACE_REVISION, dwstartingaceindex: UInt, pacelist: Long, nacelistlength: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_AddAce(pacl.toCPointer<ByteVar>(), dwacerevision, dwstartingaceindex, pacelist.toCPointer<ByteVar>(), nacelistlength)

public actual fun AddAuditAccessAce(pacl: Long, dwacerevision: ACE_REVISION, dwaccessmask: UInt, psid: PSID, bauditsuccess: BOOL, bauditfailure: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_AddAuditAccessAce(pacl.toCPointer<ByteVar>(), dwacerevision, dwaccessmask, psid.toCPointer<ByteVar>(), bauditsuccess, bauditfailure)

public actual fun AddAuditAccessAceEx(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, dwaccessmask: UInt, psid: PSID, bauditsuccess: BOOL, bauditfailure: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_AddAuditAccessAceEx(pacl.toCPointer<ByteVar>(), dwacerevision, aceflags, dwaccessmask, psid.toCPointer<ByteVar>(), bauditsuccess, bauditfailure)

public actual fun AddAuditAccessObjectAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, objecttypeguid: Long, inheritedobjecttypeguid: Long, psid: PSID, bauditsuccess: BOOL, bauditfailure: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_AddAuditAccessObjectAce(pacl.toCPointer<ByteVar>(), dwacerevision, aceflags, accessmask, objecttypeguid.toCPointer<ByteVar>(), inheritedobjecttypeguid.toCPointer<ByteVar>(), psid.toCPointer<ByteVar>(), bauditsuccess, bauditfailure)

public actual fun AddConditionalAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, acetype: UByte, accessmask: UInt, psid: PSID, conditionstr: PCWSTR, returnlength: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_AddConditionalAce(pacl.toCPointer<ByteVar>(), dwacerevision, aceflags, acetype, accessmask, psid.toCPointer<ByteVar>(), conditionstr.toCPointer<ByteVar>(), returnlength.toCPointer<ByteVar>())

public actual fun AddMandatoryAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, mandatorypolicy: UInt, plabelsid: PSID): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_AddMandatoryAce(pacl.toCPointer<ByteVar>(), dwacerevision, aceflags, mandatorypolicy, plabelsid.toCPointer<ByteVar>())

public actual fun AddResourceAttributeAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, psid: PSID, pattributeinfo: Long, preturnlength: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_AddResourceAttributeAce(pacl.toCPointer<ByteVar>(), dwacerevision, aceflags, accessmask, psid.toCPointer<ByteVar>(), pattributeinfo.toCPointer<ByteVar>(), preturnlength.toCPointer<ByteVar>())

public actual fun AddScopedPolicyIDAce(pacl: Long, dwacerevision: ACE_REVISION, aceflags: ACE_FLAGS, accessmask: UInt, psid: PSID): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_AddScopedPolicyIDAce(pacl.toCPointer<ByteVar>(), dwacerevision, aceflags, accessmask, psid.toCPointer<ByteVar>())

public actual fun AdjustTokenGroups(tokenhandle: HANDLE, resettodefault: BOOL, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_AdjustTokenGroups(tokenhandle.toCPointer<ByteVar>(), resettodefault, newstate.toCPointer<ByteVar>(), bufferlength, previousstate.toCPointer<ByteVar>(), returnlength.toCPointer<ByteVar>())

public actual fun AdjustTokenPrivileges(tokenhandle: HANDLE, disableallprivileges: BOOL, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_AdjustTokenPrivileges(tokenhandle.toCPointer<ByteVar>(), disableallprivileges, newstate.toCPointer<ByteVar>(), bufferlength, previousstate.toCPointer<ByteVar>(), returnlength.toCPointer<ByteVar>())

public actual fun AllocateAndInitializeSid(pidentifierauthority: Long, nsubauthoritycount: UByte, nsubauthority0: UInt, nsubauthority1: UInt, nsubauthority2: UInt, nsubauthority3: UInt, nsubauthority4: UInt, nsubauthority5: UInt, nsubauthority6: UInt, nsubauthority7: UInt, psid: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_AllocateAndInitializeSid(pidentifierauthority.toCPointer<ByteVar>(), nsubauthoritycount, nsubauthority0, nsubauthority1, nsubauthority2, nsubauthority3, nsubauthority4, nsubauthority5, nsubauthority6, nsubauthority7, psid.toCPointer<ByteVar>())

public actual fun AllocateLocallyUniqueId(luid: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_AllocateLocallyUniqueId(luid.toCPointer<ByteVar>())

public actual fun AreAllAccessesGranted(grantedaccess: UInt, desiredaccess: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_AreAllAccessesGranted(grantedaccess, desiredaccess)

public actual fun AreAnyAccessesGranted(grantedaccess: UInt, desiredaccess: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_AreAnyAccessesGranted(grantedaccess, desiredaccess)

public actual fun CheckTokenCapability(tokenhandle: HANDLE, capabilitysidtocheck: PSID, hascapability: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_CheckTokenCapability(tokenhandle.toCPointer<ByteVar>(), capabilitysidtocheck.toCPointer<ByteVar>(), hascapability.toCPointer<ByteVar>())

public actual fun CheckTokenMembership(tokenhandle: HANDLE, sidtocheck: PSID, ismember: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_CheckTokenMembership(tokenhandle.toCPointer<ByteVar>(), sidtocheck.toCPointer<ByteVar>(), ismember.toCPointer<ByteVar>())

public actual fun CheckTokenMembershipEx(tokenhandle: HANDLE, sidtocheck: PSID, flags: UInt, ismember: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_CheckTokenMembershipEx(tokenhandle.toCPointer<ByteVar>(), sidtocheck.toCPointer<ByteVar>(), flags, ismember.toCPointer<ByteVar>())

public actual fun ConvertToAutoInheritPrivateObjectSecurity(parentdescriptor: PSECURITY_DESCRIPTOR, currentsecuritydescriptor: PSECURITY_DESCRIPTOR, newsecuritydescriptor: Long, objecttype: Long, isdirectoryobject: Boolean, genericmapping: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_ConvertToAutoInheritPrivateObjectSecurity(parentdescriptor.toCPointer<ByteVar>(), currentsecuritydescriptor.toCPointer<ByteVar>(), newsecuritydescriptor.toCPointer<ByteVar>(), objecttype.toCPointer<ByteVar>(), isdirectoryobject, genericmapping.toCPointer<ByteVar>())

public actual fun CopySid(ndestinationsidlength: UInt, pdestinationsid: PSID, psourcesid: PSID): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_CopySid(ndestinationsidlength, pdestinationsid.toCPointer<ByteVar>(), psourcesid.toCPointer<ByteVar>())

public actual fun CreatePrivateObjectSecurity(parentdescriptor: PSECURITY_DESCRIPTOR, creatordescriptor: PSECURITY_DESCRIPTOR, newdescriptor: Long, isdirectoryobject: BOOL, token: HANDLE, genericmapping: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_CreatePrivateObjectSecurity(parentdescriptor.toCPointer<ByteVar>(), creatordescriptor.toCPointer<ByteVar>(), newdescriptor.toCPointer<ByteVar>(), isdirectoryobject, token.toCPointer<ByteVar>(), genericmapping.toCPointer<ByteVar>())

public actual fun CreatePrivateObjectSecurityEx(parentdescriptor: PSECURITY_DESCRIPTOR, creatordescriptor: PSECURITY_DESCRIPTOR, newdescriptor: Long, objecttype: Long, iscontainerobject: BOOL, autoinheritflags: SECURITY_AUTO_INHERIT_FLAGS, token: HANDLE, genericmapping: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_CreatePrivateObjectSecurityEx(parentdescriptor.toCPointer<ByteVar>(), creatordescriptor.toCPointer<ByteVar>(), newdescriptor.toCPointer<ByteVar>(), objecttype.toCPointer<ByteVar>(), iscontainerobject, autoinheritflags, token.toCPointer<ByteVar>(), genericmapping.toCPointer<ByteVar>())

public actual fun CreatePrivateObjectSecurityWithMultipleInheritance(parentdescriptor: PSECURITY_DESCRIPTOR, creatordescriptor: PSECURITY_DESCRIPTOR, newdescriptor: Long, objecttypes: Long, guidcount: UInt, iscontainerobject: BOOL, autoinheritflags: SECURITY_AUTO_INHERIT_FLAGS, token: HANDLE, genericmapping: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_CreatePrivateObjectSecurityWithMultipleInheritance(parentdescriptor.toCPointer<ByteVar>(), creatordescriptor.toCPointer<ByteVar>(), newdescriptor.toCPointer<ByteVar>(), objecttypes.toCPointer<ByteVar>(), guidcount, iscontainerobject, autoinheritflags, token.toCPointer<ByteVar>(), genericmapping.toCPointer<ByteVar>())

public actual fun CreateRestrictedToken(existingtokenhandle: HANDLE, flags: CREATE_RESTRICTED_TOKEN_FLAGS, disablesidcount: UInt, sidstodisable: Long, deleteprivilegecount: UInt, privilegestodelete: Long, restrictedsidcount: UInt, sidstorestrict: Long, newtokenhandle: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_CreateRestrictedToken(existingtokenhandle.toCPointer<ByteVar>(), flags, disablesidcount, sidstodisable.toCPointer<ByteVar>(), deleteprivilegecount, privilegestodelete.toCPointer<ByteVar>(), restrictedsidcount, sidstorestrict.toCPointer<ByteVar>(), newtokenhandle.toCPointer<ByteVar>())

public actual fun CreateWellKnownSid(wellknownsidtype: WELL_KNOWN_SID_TYPE, domainsid: PSID, psid: PSID, cbsid: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_CreateWellKnownSid(wellknownsidtype, domainsid.toCPointer<ByteVar>(), psid.toCPointer<ByteVar>(), cbsid.toCPointer<ByteVar>())

public actual fun DeleteAce(pacl: Long, dwaceindex: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_DeleteAce(pacl.toCPointer<ByteVar>(), dwaceindex)

public actual fun DeriveCapabilitySidsFromName(capname: PCWSTR, capabilitygroupsids: Long, capabilitygroupsidcount: Long, capabilitysids: Long, capabilitysidcount: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_DeriveCapabilitySidsFromName(capname.toCPointer<ByteVar>(), capabilitygroupsids.toCPointer<ByteVar>(), capabilitygroupsidcount.toCPointer<ByteVar>(), capabilitysids.toCPointer<ByteVar>(), capabilitysidcount.toCPointer<ByteVar>())

public actual fun DestroyPrivateObjectSecurity(objectdescriptor: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_DestroyPrivateObjectSecurity(objectdescriptor.toCPointer<ByteVar>())

public actual fun DuplicateToken(existingtokenhandle: HANDLE, impersonationlevel: SECURITY_IMPERSONATION_LEVEL, duplicatetokenhandle: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_DuplicateToken(existingtokenhandle.toCPointer<ByteVar>(), impersonationlevel, duplicatetokenhandle.toCPointer<ByteVar>())

public actual fun DuplicateTokenEx(hexistingtoken: HANDLE, dwdesiredaccess: TOKEN_ACCESS_MASK, lptokenattributes: Long, impersonationlevel: SECURITY_IMPERSONATION_LEVEL, tokentype: TOKEN_TYPE, phnewtoken: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_DuplicateTokenEx(hexistingtoken.toCPointer<ByteVar>(), dwdesiredaccess, lptokenattributes.toCPointer<ByteVar>(), impersonationlevel, tokentype, phnewtoken.toCPointer<ByteVar>())

public actual fun EqualDomainSid(psid1: PSID, psid2: PSID, pfequal: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_EqualDomainSid(psid1.toCPointer<ByteVar>(), psid2.toCPointer<ByteVar>(), pfequal.toCPointer<ByteVar>())

public actual fun EqualPrefixSid(psid1: PSID, psid2: PSID): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_EqualPrefixSid(psid1.toCPointer<ByteVar>(), psid2.toCPointer<ByteVar>())

public actual fun EqualSid(psid1: PSID, psid2: PSID): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_EqualSid(psid1.toCPointer<ByteVar>(), psid2.toCPointer<ByteVar>())

public actual fun FindFirstFreeAce(pacl: Long, pace: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_FindFirstFreeAce(pacl.toCPointer<ByteVar>(), pace.toCPointer<ByteVar>())

public actual fun FreeSid(psid: PSID): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_FreeSid(psid.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun GetAce(pacl: Long, dwaceindex: UInt, pace: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_GetAce(pacl.toCPointer<ByteVar>(), dwaceindex, pace.toCPointer<ByteVar>())

public actual fun GetAclInformation(pacl: Long, paclinformation: Long, naclinformationlength: UInt, dwaclinformationclass: ACL_INFORMATION_CLASS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_GetAclInformation(pacl.toCPointer<ByteVar>(), paclinformation.toCPointer<ByteVar>(), naclinformationlength, dwaclinformationclass)

public actual fun GetAppContainerAce(acl: Long, startingaceindex: UInt, appcontainerace: Long, appcontaineraceindex: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_GetAppContainerAce(acl.toCPointer<ByteVar>(), startingaceindex, appcontainerace.toCPointer<ByteVar>(), appcontaineraceindex.toCPointer<ByteVar>())

public actual fun GetCachedSigningLevel(file: HANDLE, flags: Long, signinglevel: Long, thumbprint: Long, thumbprintsize: Long, thumbprintalgorithm: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_GetCachedSigningLevel(file.toCPointer<ByteVar>(), flags.toCPointer<ByteVar>(), signinglevel.toCPointer<ByteVar>(), thumbprint.toCPointer<ByteVar>(), thumbprintsize.toCPointer<ByteVar>(), thumbprintalgorithm.toCPointer<ByteVar>())

public actual fun GetFileSecurityA(lpfilename: PCSTR, requestedinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_GetFileSecurityA(lpfilename.toCPointer<ByteVar>(), requestedinformation, psecuritydescriptor.toCPointer<ByteVar>(), nlength, lpnlengthneeded.toCPointer<ByteVar>())

public actual fun GetFileSecurityW(lpfilename: PCWSTR, requestedinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_GetFileSecurityW(lpfilename.toCPointer<ByteVar>(), requestedinformation, psecuritydescriptor.toCPointer<ByteVar>(), nlength, lpnlengthneeded.toCPointer<ByteVar>())

public actual fun GetKernelObjectSecurity(handle: HANDLE, requestedinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_GetKernelObjectSecurity(handle.toCPointer<ByteVar>(), requestedinformation, psecuritydescriptor.toCPointer<ByteVar>(), nlength, lpnlengthneeded.toCPointer<ByteVar>())

public actual fun GetLengthSid(psid: PSID): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_GetLengthSid(psid.toCPointer<ByteVar>())

public actual fun GetPrivateObjectSecurity(objectdescriptor: PSECURITY_DESCRIPTOR, securityinformation: OBJECT_SECURITY_INFORMATION, resultantdescriptor: PSECURITY_DESCRIPTOR, descriptorlength: UInt, returnlength: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_GetPrivateObjectSecurity(objectdescriptor.toCPointer<ByteVar>(), securityinformation, resultantdescriptor.toCPointer<ByteVar>(), descriptorlength, returnlength.toCPointer<ByteVar>())

public actual fun GetSecurityDescriptorControl(psecuritydescriptor: PSECURITY_DESCRIPTOR, pcontrol: Long, lpdwrevision: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_GetSecurityDescriptorControl(psecuritydescriptor.toCPointer<ByteVar>(), pcontrol.toCPointer<ByteVar>(), lpdwrevision.toCPointer<ByteVar>())

public actual fun GetSecurityDescriptorDacl(psecuritydescriptor: PSECURITY_DESCRIPTOR, lpbdaclpresent: Long, pdacl: Long, lpbdacldefaulted: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_GetSecurityDescriptorDacl(psecuritydescriptor.toCPointer<ByteVar>(), lpbdaclpresent.toCPointer<ByteVar>(), pdacl.toCPointer<ByteVar>(), lpbdacldefaulted.toCPointer<ByteVar>())

public actual fun GetSecurityDescriptorGroup(psecuritydescriptor: PSECURITY_DESCRIPTOR, pgroup: Long, lpbgroupdefaulted: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_GetSecurityDescriptorGroup(psecuritydescriptor.toCPointer<ByteVar>(), pgroup.toCPointer<ByteVar>(), lpbgroupdefaulted.toCPointer<ByteVar>())

public actual fun GetSecurityDescriptorLength(psecuritydescriptor: PSECURITY_DESCRIPTOR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_GetSecurityDescriptorLength(psecuritydescriptor.toCPointer<ByteVar>())

public actual fun GetSecurityDescriptorOwner(psecuritydescriptor: PSECURITY_DESCRIPTOR, powner: Long, lpbownerdefaulted: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_GetSecurityDescriptorOwner(psecuritydescriptor.toCPointer<ByteVar>(), powner.toCPointer<ByteVar>(), lpbownerdefaulted.toCPointer<ByteVar>())

public actual fun GetSecurityDescriptorRMControl(securitydescriptor: PSECURITY_DESCRIPTOR, rmcontrol: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_GetSecurityDescriptorRMControl(securitydescriptor.toCPointer<ByteVar>(), rmcontrol.toCPointer<ByteVar>())

public actual fun GetSecurityDescriptorSacl(psecuritydescriptor: PSECURITY_DESCRIPTOR, lpbsaclpresent: Long, psacl: Long, lpbsacldefaulted: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_GetSecurityDescriptorSacl(psecuritydescriptor.toCPointer<ByteVar>(), lpbsaclpresent.toCPointer<ByteVar>(), psacl.toCPointer<ByteVar>(), lpbsacldefaulted.toCPointer<ByteVar>())

public actual fun GetSidIdentifierAuthority(psid: PSID): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_GetSidIdentifierAuthority(psid.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun GetSidLengthRequired(nsubauthoritycount: UByte): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_GetSidLengthRequired(nsubauthoritycount)

public actual fun GetSidSubAuthority(psid: PSID, nsubauthority: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_GetSidSubAuthority(psid.toCPointer<ByteVar>(), nsubauthority)?.toLong() ?: 0L

public actual fun GetSidSubAuthorityCount(psid: PSID): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_GetSidSubAuthorityCount(psid.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun GetTokenInformation(tokenhandle: HANDLE, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt, returnlength: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_GetTokenInformation(tokenhandle.toCPointer<ByteVar>(), tokeninformationclass, tokeninformation.toCPointer<ByteVar>(), tokeninformationlength, returnlength.toCPointer<ByteVar>())

public actual fun GetUserObjectSecurity(hobj: HANDLE, psirequested: Long, psid: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_GetUserObjectSecurity(hobj.toCPointer<ByteVar>(), psirequested.toCPointer<ByteVar>(), psid.toCPointer<ByteVar>(), nlength, lpnlengthneeded.toCPointer<ByteVar>())

public actual fun GetWindowsAccountDomainSid(psid: PSID, pdomainsid: PSID, cbdomainsid: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_GetWindowsAccountDomainSid(psid.toCPointer<ByteVar>(), pdomainsid.toCPointer<ByteVar>(), cbdomainsid.toCPointer<ByteVar>())

public actual fun ImpersonateAnonymousToken(threadhandle: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_ImpersonateAnonymousToken(threadhandle.toCPointer<ByteVar>())

public actual fun ImpersonateLoggedOnUser(htoken: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_ImpersonateLoggedOnUser(htoken.toCPointer<ByteVar>())

public actual fun ImpersonateSelf(impersonationlevel: SECURITY_IMPERSONATION_LEVEL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_ImpersonateSelf(impersonationlevel)

public actual fun InitializeAcl(pacl: Long, nacllength: UInt, dwaclrevision: ACE_REVISION): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_InitializeAcl(pacl.toCPointer<ByteVar>(), nacllength, dwaclrevision)

public actual fun InitializeSecurityDescriptor(psecuritydescriptor: PSECURITY_DESCRIPTOR, dwrevision: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_InitializeSecurityDescriptor(psecuritydescriptor.toCPointer<ByteVar>(), dwrevision)

public actual fun InitializeSid(sid: PSID, pidentifierauthority: Long, nsubauthoritycount: UByte): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_InitializeSid(sid.toCPointer<ByteVar>(), pidentifierauthority.toCPointer<ByteVar>(), nsubauthoritycount)

public actual fun IsTokenRestricted(tokenhandle: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_IsTokenRestricted(tokenhandle.toCPointer<ByteVar>())

public actual fun IsValidAcl(pacl: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_IsValidAcl(pacl.toCPointer<ByteVar>())

public actual fun IsValidSecurityDescriptor(psecuritydescriptor: PSECURITY_DESCRIPTOR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_IsValidSecurityDescriptor(psecuritydescriptor.toCPointer<ByteVar>())

public actual fun IsValidSid(psid: PSID): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_IsValidSid(psid.toCPointer<ByteVar>())

public actual fun IsWellKnownSid(psid: PSID, wellknownsidtype: WELL_KNOWN_SID_TYPE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_IsWellKnownSid(psid.toCPointer<ByteVar>(), wellknownsidtype)

public actual fun LogonUserA(lpszusername: PCSTR, lpszdomain: PCSTR, lpszpassword: PCSTR, dwlogontype: LOGON32_LOGON, dwlogonprovider: LOGON32_PROVIDER, phtoken: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_LogonUserA(lpszusername.toCPointer<ByteVar>(), lpszdomain.toCPointer<ByteVar>(), lpszpassword.toCPointer<ByteVar>(), dwlogontype, dwlogonprovider, phtoken.toCPointer<ByteVar>())

public actual fun LogonUserExA(lpszusername: PCSTR, lpszdomain: PCSTR, lpszpassword: PCSTR, dwlogontype: LOGON32_LOGON, dwlogonprovider: LOGON32_PROVIDER, phtoken: Long, pplogonsid: Long, ppprofilebuffer: Long, pdwprofilelength: Long, pquotalimits: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_LogonUserExA(lpszusername.toCPointer<ByteVar>(), lpszdomain.toCPointer<ByteVar>(), lpszpassword.toCPointer<ByteVar>(), dwlogontype, dwlogonprovider, phtoken.toCPointer<ByteVar>(), pplogonsid.toCPointer<ByteVar>(), ppprofilebuffer.toCPointer<ByteVar>(), pdwprofilelength.toCPointer<ByteVar>(), pquotalimits.toCPointer<ByteVar>())

public actual fun LogonUserExW(lpszusername: PCWSTR, lpszdomain: PCWSTR, lpszpassword: PCWSTR, dwlogontype: LOGON32_LOGON, dwlogonprovider: LOGON32_PROVIDER, phtoken: Long, pplogonsid: Long, ppprofilebuffer: Long, pdwprofilelength: Long, pquotalimits: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_LogonUserExW(lpszusername.toCPointer<ByteVar>(), lpszdomain.toCPointer<ByteVar>(), lpszpassword.toCPointer<ByteVar>(), dwlogontype, dwlogonprovider, phtoken.toCPointer<ByteVar>(), pplogonsid.toCPointer<ByteVar>(), ppprofilebuffer.toCPointer<ByteVar>(), pdwprofilelength.toCPointer<ByteVar>(), pquotalimits.toCPointer<ByteVar>())

public actual fun LogonUserW(lpszusername: PCWSTR, lpszdomain: PCWSTR, lpszpassword: PCWSTR, dwlogontype: LOGON32_LOGON, dwlogonprovider: LOGON32_PROVIDER, phtoken: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_LogonUserW(lpszusername.toCPointer<ByteVar>(), lpszdomain.toCPointer<ByteVar>(), lpszpassword.toCPointer<ByteVar>(), dwlogontype, dwlogonprovider, phtoken.toCPointer<ByteVar>())

public actual fun LookupAccountNameA(lpsystemname: PCSTR, lpaccountname: PCSTR, sid: PSID, cbsid: Long, referenceddomainname: PSTR, cchreferenceddomainname: Long, peuse: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_LookupAccountNameA(lpsystemname.toCPointer<ByteVar>(), lpaccountname.toCPointer<ByteVar>(), sid.toCPointer<ByteVar>(), cbsid.toCPointer<ByteVar>(), referenceddomainname.toCPointer<ByteVar>(), cchreferenceddomainname.toCPointer<ByteVar>(), peuse.toCPointer<ByteVar>())

public actual fun LookupAccountNameW(lpsystemname: PCWSTR, lpaccountname: PCWSTR, sid: PSID, cbsid: Long, referenceddomainname: PWSTR, cchreferenceddomainname: Long, peuse: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_LookupAccountNameW(lpsystemname.toCPointer<ByteVar>(), lpaccountname.toCPointer<ByteVar>(), sid.toCPointer<ByteVar>(), cbsid.toCPointer<ByteVar>(), referenceddomainname.toCPointer<ByteVar>(), cchreferenceddomainname.toCPointer<ByteVar>(), peuse.toCPointer<ByteVar>())

public actual fun LookupAccountSidA(lpsystemname: PCSTR, sid: PSID, name: PSTR, cchname: Long, referenceddomainname: PSTR, cchreferenceddomainname: Long, peuse: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_LookupAccountSidA(lpsystemname.toCPointer<ByteVar>(), sid.toCPointer<ByteVar>(), name.toCPointer<ByteVar>(), cchname.toCPointer<ByteVar>(), referenceddomainname.toCPointer<ByteVar>(), cchreferenceddomainname.toCPointer<ByteVar>(), peuse.toCPointer<ByteVar>())

public actual fun LookupAccountSidW(lpsystemname: PCWSTR, sid: PSID, name: PWSTR, cchname: Long, referenceddomainname: PWSTR, cchreferenceddomainname: Long, peuse: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_LookupAccountSidW(lpsystemname.toCPointer<ByteVar>(), sid.toCPointer<ByteVar>(), name.toCPointer<ByteVar>(), cchname.toCPointer<ByteVar>(), referenceddomainname.toCPointer<ByteVar>(), cchreferenceddomainname.toCPointer<ByteVar>(), peuse.toCPointer<ByteVar>())

public actual fun LookupPrivilegeDisplayNameA(lpsystemname: PCSTR, lpname: PCSTR, lpdisplayname: PSTR, cchdisplayname: Long, lplanguageid: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_LookupPrivilegeDisplayNameA(lpsystemname.toCPointer<ByteVar>(), lpname.toCPointer<ByteVar>(), lpdisplayname.toCPointer<ByteVar>(), cchdisplayname.toCPointer<ByteVar>(), lplanguageid.toCPointer<ByteVar>())

public actual fun LookupPrivilegeDisplayNameW(lpsystemname: PCWSTR, lpname: PCWSTR, lpdisplayname: PWSTR, cchdisplayname: Long, lplanguageid: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_LookupPrivilegeDisplayNameW(lpsystemname.toCPointer<ByteVar>(), lpname.toCPointer<ByteVar>(), lpdisplayname.toCPointer<ByteVar>(), cchdisplayname.toCPointer<ByteVar>(), lplanguageid.toCPointer<ByteVar>())

public actual fun LookupPrivilegeNameA(lpsystemname: PCSTR, lpluid: Long, lpname: PSTR, cchname: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_LookupPrivilegeNameA(lpsystemname.toCPointer<ByteVar>(), lpluid.toCPointer<ByteVar>(), lpname.toCPointer<ByteVar>(), cchname.toCPointer<ByteVar>())

public actual fun LookupPrivilegeNameW(lpsystemname: PCWSTR, lpluid: Long, lpname: PWSTR, cchname: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_LookupPrivilegeNameW(lpsystemname.toCPointer<ByteVar>(), lpluid.toCPointer<ByteVar>(), lpname.toCPointer<ByteVar>(), cchname.toCPointer<ByteVar>())

public actual fun LookupPrivilegeValueA(lpsystemname: PCSTR, lpname: PCSTR, lpluid: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_LookupPrivilegeValueA(lpsystemname.toCPointer<ByteVar>(), lpname.toCPointer<ByteVar>(), lpluid.toCPointer<ByteVar>())

public actual fun LookupPrivilegeValueW(lpsystemname: PCWSTR, lpname: PCWSTR, lpluid: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_LookupPrivilegeValueW(lpsystemname.toCPointer<ByteVar>(), lpname.toCPointer<ByteVar>(), lpluid.toCPointer<ByteVar>())

public actual fun MakeAbsoluteSD(pselfrelativesecuritydescriptor: PSECURITY_DESCRIPTOR, pabsolutesecuritydescriptor: PSECURITY_DESCRIPTOR, lpdwabsolutesecuritydescriptorsize: Long, pdacl: Long, lpdwdaclsize: Long, psacl: Long, lpdwsaclsize: Long, powner: PSID, lpdwownersize: Long, pprimarygroup: PSID, lpdwprimarygroupsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_MakeAbsoluteSD(pselfrelativesecuritydescriptor.toCPointer<ByteVar>(), pabsolutesecuritydescriptor.toCPointer<ByteVar>(), lpdwabsolutesecuritydescriptorsize.toCPointer<ByteVar>(), pdacl.toCPointer<ByteVar>(), lpdwdaclsize.toCPointer<ByteVar>(), psacl.toCPointer<ByteVar>(), lpdwsaclsize.toCPointer<ByteVar>(), powner.toCPointer<ByteVar>(), lpdwownersize.toCPointer<ByteVar>(), pprimarygroup.toCPointer<ByteVar>(), lpdwprimarygroupsize.toCPointer<ByteVar>())

public actual fun MakeSelfRelativeSD(pabsolutesecuritydescriptor: PSECURITY_DESCRIPTOR, pselfrelativesecuritydescriptor: PSECURITY_DESCRIPTOR, lpdwbufferlength: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_MakeSelfRelativeSD(pabsolutesecuritydescriptor.toCPointer<ByteVar>(), pselfrelativesecuritydescriptor.toCPointer<ByteVar>(), lpdwbufferlength.toCPointer<ByteVar>())

public actual fun MapGenericMask(accessmask: Long, genericmapping: Long) {
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_MapGenericMask(accessmask.toCPointer<ByteVar>(), genericmapping.toCPointer<ByteVar>())
}

public actual fun ObjectCloseAuditAlarmA(subsystemname: PCSTR, handleid: Long, generateonclose: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_ObjectCloseAuditAlarmA(subsystemname.toCPointer<ByteVar>(), handleid.toCPointer<ByteVar>(), generateonclose)

public actual fun ObjectCloseAuditAlarmW(subsystemname: PCWSTR, handleid: Long, generateonclose: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_ObjectCloseAuditAlarmW(subsystemname.toCPointer<ByteVar>(), handleid.toCPointer<ByteVar>(), generateonclose)

public actual fun ObjectDeleteAuditAlarmA(subsystemname: PCSTR, handleid: Long, generateonclose: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_ObjectDeleteAuditAlarmA(subsystemname.toCPointer<ByteVar>(), handleid.toCPointer<ByteVar>(), generateonclose)

public actual fun ObjectDeleteAuditAlarmW(subsystemname: PCWSTR, handleid: Long, generateonclose: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_ObjectDeleteAuditAlarmW(subsystemname.toCPointer<ByteVar>(), handleid.toCPointer<ByteVar>(), generateonclose)

public actual fun ObjectOpenAuditAlarmA(subsystemname: PCSTR, handleid: Long, objecttypename: PCSTR, objectname: PCSTR, psecuritydescriptor: PSECURITY_DESCRIPTOR, clienttoken: HANDLE, desiredaccess: UInt, grantedaccess: UInt, privileges: Long, objectcreation: BOOL, accessgranted: BOOL, generateonclose: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_ObjectOpenAuditAlarmA(subsystemname.toCPointer<ByteVar>(), handleid.toCPointer<ByteVar>(), objecttypename.toCPointer<ByteVar>(), objectname.toCPointer<ByteVar>(), psecuritydescriptor.toCPointer<ByteVar>(), clienttoken.toCPointer<ByteVar>(), desiredaccess, grantedaccess, privileges.toCPointer<ByteVar>(), objectcreation, accessgranted, generateonclose.toCPointer<ByteVar>())

public actual fun ObjectOpenAuditAlarmW(subsystemname: PCWSTR, handleid: Long, objecttypename: PCWSTR, objectname: PCWSTR, psecuritydescriptor: PSECURITY_DESCRIPTOR, clienttoken: HANDLE, desiredaccess: UInt, grantedaccess: UInt, privileges: Long, objectcreation: BOOL, accessgranted: BOOL, generateonclose: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_ObjectOpenAuditAlarmW(subsystemname.toCPointer<ByteVar>(), handleid.toCPointer<ByteVar>(), objecttypename.toCPointer<ByteVar>(), objectname.toCPointer<ByteVar>(), psecuritydescriptor.toCPointer<ByteVar>(), clienttoken.toCPointer<ByteVar>(), desiredaccess, grantedaccess, privileges.toCPointer<ByteVar>(), objectcreation, accessgranted, generateonclose.toCPointer<ByteVar>())

public actual fun ObjectPrivilegeAuditAlarmA(subsystemname: PCSTR, handleid: Long, clienttoken: HANDLE, desiredaccess: UInt, privileges: Long, accessgranted: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_ObjectPrivilegeAuditAlarmA(subsystemname.toCPointer<ByteVar>(), handleid.toCPointer<ByteVar>(), clienttoken.toCPointer<ByteVar>(), desiredaccess, privileges.toCPointer<ByteVar>(), accessgranted)

public actual fun ObjectPrivilegeAuditAlarmW(subsystemname: PCWSTR, handleid: Long, clienttoken: HANDLE, desiredaccess: UInt, privileges: Long, accessgranted: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_ObjectPrivilegeAuditAlarmW(subsystemname.toCPointer<ByteVar>(), handleid.toCPointer<ByteVar>(), clienttoken.toCPointer<ByteVar>(), desiredaccess, privileges.toCPointer<ByteVar>(), accessgranted)

public actual fun PrivilegeCheck(clienttoken: HANDLE, requiredprivileges: Long, pfresult: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_PrivilegeCheck(clienttoken.toCPointer<ByteVar>(), requiredprivileges.toCPointer<ByteVar>(), pfresult.toCPointer<ByteVar>())

public actual fun PrivilegedServiceAuditAlarmA(subsystemname: PCSTR, servicename: PCSTR, clienttoken: HANDLE, privileges: Long, accessgranted: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_PrivilegedServiceAuditAlarmA(subsystemname.toCPointer<ByteVar>(), servicename.toCPointer<ByteVar>(), clienttoken.toCPointer<ByteVar>(), privileges.toCPointer<ByteVar>(), accessgranted)

public actual fun PrivilegedServiceAuditAlarmW(subsystemname: PCWSTR, servicename: PCWSTR, clienttoken: HANDLE, privileges: Long, accessgranted: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_PrivilegedServiceAuditAlarmW(subsystemname.toCPointer<ByteVar>(), servicename.toCPointer<ByteVar>(), clienttoken.toCPointer<ByteVar>(), privileges.toCPointer<ByteVar>(), accessgranted)

public actual fun QuerySecurityAccessMask(securityinformation: OBJECT_SECURITY_INFORMATION, desiredaccess: Long) {
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_QuerySecurityAccessMask(securityinformation, desiredaccess.toCPointer<ByteVar>())
}

public actual fun RevertToSelf(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_RevertToSelf()

public actual fun RtlConvertSidToUnicodeString(unicodestring: Long, sid: PSID, allocatedestinationstring: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_RtlConvertSidToUnicodeString(unicodestring.toCPointer<ByteVar>(), sid.toCPointer<ByteVar>(), allocatedestinationstring)

public actual fun RtlNormalizeSecurityDescriptor(securitydescriptor: Long, securitydescriptorlength: UInt, newsecuritydescriptor: Long, newsecuritydescriptorlength: Long, checkonly: Boolean): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_RtlNormalizeSecurityDescriptor(securitydescriptor.toCPointer<ByteVar>(), securitydescriptorlength, newsecuritydescriptor.toCPointer<ByteVar>(), newsecuritydescriptorlength.toCPointer<ByteVar>(), checkonly)

public actual fun SetAclInformation(pacl: Long, paclinformation: Long, naclinformationlength: UInt, dwaclinformationclass: ACL_INFORMATION_CLASS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_SetAclInformation(pacl.toCPointer<ByteVar>(), paclinformation.toCPointer<ByteVar>(), naclinformationlength, dwaclinformationclass)

public actual fun SetCachedSigningLevel(sourcefiles: Long, sourcefilecount: UInt, flags: UInt, targetfile: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_SetCachedSigningLevel(sourcefiles.toCPointer<ByteVar>(), sourcefilecount, flags, targetfile.toCPointer<ByteVar>())

public actual fun SetFileSecurityA(lpfilename: PCSTR, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_SetFileSecurityA(lpfilename.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor.toCPointer<ByteVar>())

public actual fun SetFileSecurityW(lpfilename: PCWSTR, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_SetFileSecurityW(lpfilename.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor.toCPointer<ByteVar>())

public actual fun SetKernelObjectSecurity(handle: HANDLE, securityinformation: OBJECT_SECURITY_INFORMATION, securitydescriptor: PSECURITY_DESCRIPTOR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_SetKernelObjectSecurity(handle.toCPointer<ByteVar>(), securityinformation, securitydescriptor.toCPointer<ByteVar>())

public actual fun SetPrivateObjectSecurity(securityinformation: OBJECT_SECURITY_INFORMATION, modificationdescriptor: PSECURITY_DESCRIPTOR, objectssecuritydescriptor: Long, genericmapping: Long, token: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_SetPrivateObjectSecurity(securityinformation, modificationdescriptor.toCPointer<ByteVar>(), objectssecuritydescriptor.toCPointer<ByteVar>(), genericmapping.toCPointer<ByteVar>(), token.toCPointer<ByteVar>())

public actual fun SetPrivateObjectSecurityEx(securityinformation: OBJECT_SECURITY_INFORMATION, modificationdescriptor: PSECURITY_DESCRIPTOR, objectssecuritydescriptor: Long, autoinheritflags: SECURITY_AUTO_INHERIT_FLAGS, genericmapping: Long, token: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_SetPrivateObjectSecurityEx(securityinformation, modificationdescriptor.toCPointer<ByteVar>(), objectssecuritydescriptor.toCPointer<ByteVar>(), autoinheritflags, genericmapping.toCPointer<ByteVar>(), token.toCPointer<ByteVar>())

public actual fun SetSecurityAccessMask(securityinformation: OBJECT_SECURITY_INFORMATION, desiredaccess: Long) {
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_SetSecurityAccessMask(securityinformation, desiredaccess.toCPointer<ByteVar>())
}

public actual fun SetSecurityDescriptorControl(psecuritydescriptor: PSECURITY_DESCRIPTOR, controlbitsofinterest: SECURITY_DESCRIPTOR_CONTROL, controlbitstoset: SECURITY_DESCRIPTOR_CONTROL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_SetSecurityDescriptorControl(psecuritydescriptor.toCPointer<ByteVar>(), controlbitsofinterest, controlbitstoset)

public actual fun SetSecurityDescriptorDacl(psecuritydescriptor: PSECURITY_DESCRIPTOR, bdaclpresent: BOOL, pdacl: Long, bdacldefaulted: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_SetSecurityDescriptorDacl(psecuritydescriptor.toCPointer<ByteVar>(), bdaclpresent, pdacl.toCPointer<ByteVar>(), bdacldefaulted)

public actual fun SetSecurityDescriptorGroup(psecuritydescriptor: PSECURITY_DESCRIPTOR, pgroup: PSID, bgroupdefaulted: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_SetSecurityDescriptorGroup(psecuritydescriptor.toCPointer<ByteVar>(), pgroup.toCPointer<ByteVar>(), bgroupdefaulted)

public actual fun SetSecurityDescriptorOwner(psecuritydescriptor: PSECURITY_DESCRIPTOR, powner: PSID, bownerdefaulted: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_SetSecurityDescriptorOwner(psecuritydescriptor.toCPointer<ByteVar>(), powner.toCPointer<ByteVar>(), bownerdefaulted)

public actual fun SetSecurityDescriptorRMControl(securitydescriptor: PSECURITY_DESCRIPTOR, rmcontrol: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_SetSecurityDescriptorRMControl(securitydescriptor.toCPointer<ByteVar>(), rmcontrol.toCPointer<ByteVar>())

public actual fun SetSecurityDescriptorSacl(psecuritydescriptor: PSECURITY_DESCRIPTOR, bsaclpresent: BOOL, psacl: Long, bsacldefaulted: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_SetSecurityDescriptorSacl(psecuritydescriptor.toCPointer<ByteVar>(), bsaclpresent, psacl.toCPointer<ByteVar>(), bsacldefaulted)

public actual fun SetTokenInformation(tokenhandle: HANDLE, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_SetTokenInformation(tokenhandle.toCPointer<ByteVar>(), tokeninformationclass, tokeninformation.toCPointer<ByteVar>(), tokeninformationlength)

public actual fun SetUserObjectSecurity(hobj: HANDLE, psirequested: Long, psid: PSECURITY_DESCRIPTOR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cinterop.windowssys_windows_win32_security_SetUserObjectSecurity(hobj.toCPointer<ByteVar>(), psirequested.toCPointer<ByteVar>(), psid.toCPointer<ByteVar>())
