@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

private val windowsWin32SecurityNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun accessCheck(psecuritydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, genericmapping: ConstPtr, privilegeset: MutPtr, privilegesetlength: MutPtr, grantedaccess: MutPtr, accessstatus: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityAccessCheck(psecuritydescriptor.rawAddress.toString(), clienttoken.rawAddress.toString(), desiredaccess.toInt(), genericmapping.rawAddress.toString(), privilegeset.rawAddress.toString(), privilegesetlength.rawAddress.toString(), grantedaccess.rawAddress.toString(), accessstatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessCheckAndAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccess: MutPtr, accessstatus: MutPtr, pfgenerateonclose: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityAccessCheckAndAuditAlarmA(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), desiredaccess.toInt(), genericmapping.rawAddress.toString(), objectcreation, grantedaccess.rawAddress.toString(), accessstatus.rawAddress.toString(), pfgenerateonclose.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessCheckAndAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccess: MutPtr, accessstatus: MutPtr, pfgenerateonclose: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityAccessCheckAndAuditAlarmW(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), desiredaccess.toInt(), genericmapping.rawAddress.toString(), objectcreation, grantedaccess.rawAddress.toString(), accessstatus.rawAddress.toString(), pfgenerateonclose.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessCheckByType(psecuritydescriptor: PsecurityDescriptor, principalselfsid: Psid, clienttoken: Handle, desiredaccess: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, privilegeset: MutPtr, privilegesetlength: MutPtr, grantedaccess: MutPtr, accessstatus: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityAccessCheckByType(psecuritydescriptor.rawAddress.toString(), principalselfsid.rawAddress.toString(), clienttoken.rawAddress.toString(), desiredaccess.toInt(), objecttypelist.rawAddress.toString(), objecttypelistlength.toInt(), genericmapping.rawAddress.toString(), privilegeset.rawAddress.toString(), privilegesetlength.rawAddress.toString(), grantedaccess.rawAddress.toString(), accessstatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessCheckByTypeAndAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccess: MutPtr, accessstatus: MutPtr, pfgenerateonclose: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityAccessCheckByTypeAndAuditAlarmA(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), principalselfsid.rawAddress.toString(), desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.rawAddress.toString(), objecttypelistlength.toInt(), genericmapping.rawAddress.toString(), objectcreation, grantedaccess.rawAddress.toString(), accessstatus.rawAddress.toString(), pfgenerateonclose.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessCheckByTypeAndAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccess: MutPtr, accessstatus: MutPtr, pfgenerateonclose: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityAccessCheckByTypeAndAuditAlarmW(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), principalselfsid.rawAddress.toString(), desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.rawAddress.toString(), objecttypelistlength.toInt(), genericmapping.rawAddress.toString(), objectcreation, grantedaccess.rawAddress.toString(), accessstatus.rawAddress.toString(), pfgenerateonclose.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessCheckByTypeResultList(psecuritydescriptor: PsecurityDescriptor, principalselfsid: Psid, clienttoken: Handle, desiredaccess: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, privilegeset: MutPtr, privilegesetlength: MutPtr, grantedaccesslist: MutPtr, accessstatuslist: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityAccessCheckByTypeResultList(psecuritydescriptor.rawAddress.toString(), principalselfsid.rawAddress.toString(), clienttoken.rawAddress.toString(), desiredaccess.toInt(), objecttypelist.rawAddress.toString(), objecttypelistlength.toInt(), genericmapping.rawAddress.toString(), privilegeset.rawAddress.toString(), privilegesetlength.rawAddress.toString(), grantedaccesslist.rawAddress.toString(), accessstatuslist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessCheckByTypeResultListAndAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccess: MutPtr, accessstatuslist: MutPtr, pfgenerateonclose: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmA(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), principalselfsid.rawAddress.toString(), desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.rawAddress.toString(), objecttypelistlength.toInt(), genericmapping.rawAddress.toString(), objectcreation, grantedaccess.rawAddress.toString(), accessstatuslist.rawAddress.toString(), pfgenerateonclose.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessCheckByTypeResultListAndAuditAlarmByHandleA(subsystemname: Pcstr, handleid: ConstPtr, clienttoken: Handle, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccess: MutPtr, accessstatuslist: MutPtr, pfgenerateonclose: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmByHandleA(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), clienttoken.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), principalselfsid.rawAddress.toString(), desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.rawAddress.toString(), objecttypelistlength.toInt(), genericmapping.rawAddress.toString(), objectcreation, grantedaccess.rawAddress.toString(), accessstatuslist.rawAddress.toString(), pfgenerateonclose.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessCheckByTypeResultListAndAuditAlarmByHandleW(subsystemname: Pcwstr, handleid: ConstPtr, clienttoken: Handle, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccesslist: MutPtr, accessstatuslist: MutPtr, pfgenerateonclose: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmByHandleW(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), clienttoken.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), principalselfsid.rawAddress.toString(), desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.rawAddress.toString(), objecttypelistlength.toInt(), genericmapping.rawAddress.toString(), objectcreation, grantedaccesslist.rawAddress.toString(), accessstatuslist.rawAddress.toString(), pfgenerateonclose.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessCheckByTypeResultListAndAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccesslist: MutPtr, accessstatuslist: MutPtr, pfgenerateonclose: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmW(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), principalselfsid.rawAddress.toString(), desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.rawAddress.toString(), objecttypelistlength.toInt(), genericmapping.rawAddress.toString(), objectcreation, grantedaccesslist.rawAddress.toString(), accessstatuslist.rawAddress.toString(), pfgenerateonclose.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addAccessAllowedAce(pacl: MutPtr, dwacerevision: AceRevision, accessmask: UInt, psid: Psid): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityAddAccessAllowedAce(pacl.rawAddress.toString(), dwacerevision.toInt(), accessmask.toInt(), psid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addAccessAllowedAceEx(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityAddAccessAllowedAceEx(pacl.rawAddress.toString(), dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), psid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addAccessAllowedObjectAce(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, objecttypeguid: ConstPtr, inheritedobjecttypeguid: ConstPtr, psid: Psid): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityAddAccessAllowedObjectAce(pacl.rawAddress.toString(), dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), objecttypeguid.rawAddress.toString(), inheritedobjecttypeguid.rawAddress.toString(), psid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addAccessDeniedAce(pacl: MutPtr, dwacerevision: AceRevision, accessmask: UInt, psid: Psid): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityAddAccessDeniedAce(pacl.rawAddress.toString(), dwacerevision.toInt(), accessmask.toInt(), psid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addAccessDeniedAceEx(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityAddAccessDeniedAceEx(pacl.rawAddress.toString(), dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), psid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addAccessDeniedObjectAce(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, objecttypeguid: ConstPtr, inheritedobjecttypeguid: ConstPtr, psid: Psid): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityAddAccessDeniedObjectAce(pacl.rawAddress.toString(), dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), objecttypeguid.rawAddress.toString(), inheritedobjecttypeguid.rawAddress.toString(), psid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addAce(pacl: MutPtr, dwacerevision: AceRevision, dwstartingaceindex: UInt, pacelist: ConstPtr, nacelistlength: UInt): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityAddAce(pacl.rawAddress.toString(), dwacerevision.toInt(), dwstartingaceindex.toInt(), pacelist.rawAddress.toString(), nacelistlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addAuditAccessAce(pacl: MutPtr, dwacerevision: AceRevision, dwaccessmask: UInt, psid: Psid, bauditsuccess: Bool, bauditfailure: Bool): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityAddAuditAccessAce(pacl.rawAddress.toString(), dwacerevision.toInt(), dwaccessmask.toInt(), psid.rawAddress.toString(), bauditsuccess, bauditfailure) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addAuditAccessAceEx(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, dwaccessmask: UInt, psid: Psid, bauditsuccess: Bool, bauditfailure: Bool): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityAddAuditAccessAceEx(pacl.rawAddress.toString(), dwacerevision.toInt(), aceflags.toInt(), dwaccessmask.toInt(), psid.rawAddress.toString(), bauditsuccess, bauditfailure) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addAuditAccessObjectAce(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, objecttypeguid: ConstPtr, inheritedobjecttypeguid: ConstPtr, psid: Psid, bauditsuccess: Bool, bauditfailure: Bool): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityAddAuditAccessObjectAce(pacl.rawAddress.toString(), dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), objecttypeguid.rawAddress.toString(), inheritedobjecttypeguid.rawAddress.toString(), psid.rawAddress.toString(), bauditsuccess, bauditfailure) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addConditionalAce(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, acetype: UByte, accessmask: UInt, psid: Psid, conditionstr: Pcwstr, returnlength: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityAddConditionalAce(pacl.rawAddress.toString(), dwacerevision.toInt(), aceflags.toInt(), acetype.toInt(), accessmask.toInt(), psid.rawAddress.toString(), conditionstr.rawAddress.toString(), returnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addMandatoryAce(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, mandatorypolicy: UInt, plabelsid: Psid): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityAddMandatoryAce(pacl.rawAddress.toString(), dwacerevision.toInt(), aceflags.toInt(), mandatorypolicy.toInt(), plabelsid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addResourceAttributeAce(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid, pattributeinfo: ConstPtr, preturnlength: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityAddResourceAttributeAce(pacl.rawAddress.toString(), dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), psid.rawAddress.toString(), pattributeinfo.rawAddress.toString(), preturnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addScopedPolicyIDAce(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityAddScopedPolicyIDAce(pacl.rawAddress.toString(), dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), psid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun adjustTokenGroups(tokenhandle: Handle, resettodefault: Bool, newstate: ConstPtr, bufferlength: UInt, previousstate: MutPtr, returnlength: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityAdjustTokenGroups(tokenhandle.rawAddress.toString(), resettodefault, newstate.rawAddress.toString(), bufferlength.toInt(), previousstate.rawAddress.toString(), returnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun adjustTokenPrivileges(tokenhandle: Handle, disableallprivileges: Bool, newstate: ConstPtr, bufferlength: UInt, previousstate: MutPtr, returnlength: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityAdjustTokenPrivileges(tokenhandle.rawAddress.toString(), disableallprivileges, newstate.rawAddress.toString(), bufferlength.toInt(), previousstate.rawAddress.toString(), returnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allocateAndInitializeSid(pidentifierauthority: ConstPtr, nsubauthoritycount: UByte, nsubauthority0: UInt, nsubauthority1: UInt, nsubauthority2: UInt, nsubauthority3: UInt, nsubauthority4: UInt, nsubauthority5: UInt, nsubauthority6: UInt, nsubauthority7: UInt, psid: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityAllocateAndInitializeSid(pidentifierauthority.rawAddress.toString(), nsubauthoritycount.toInt(), nsubauthority0.toInt(), nsubauthority1.toInt(), nsubauthority2.toInt(), nsubauthority3.toInt(), nsubauthority4.toInt(), nsubauthority5.toInt(), nsubauthority6.toInt(), nsubauthority7.toInt(), psid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allocateLocallyUniqueId(luid: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityAllocateLocallyUniqueId(luid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun areAllAccessesGranted(grantedaccess: UInt, desiredaccess: UInt): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityAreAllAccessesGranted(grantedaccess.toInt(), desiredaccess.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun areAnyAccessesGranted(grantedaccess: UInt, desiredaccess: UInt): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityAreAnyAccessesGranted(grantedaccess.toInt(), desiredaccess.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkTokenCapability(tokenhandle: Handle, capabilitysidtocheck: Psid, hascapability: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityCheckTokenCapability(tokenhandle.rawAddress.toString(), capabilitysidtocheck.rawAddress.toString(), hascapability.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkTokenMembership(tokenhandle: Handle, sidtocheck: Psid, ismember: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityCheckTokenMembership(tokenhandle.rawAddress.toString(), sidtocheck.rawAddress.toString(), ismember.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkTokenMembershipEx(tokenhandle: Handle, sidtocheck: Psid, flags: UInt, ismember: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityCheckTokenMembershipEx(tokenhandle.rawAddress.toString(), sidtocheck.rawAddress.toString(), flags.toInt(), ismember.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertToAutoInheritPrivateObjectSecurity(parentdescriptor: PsecurityDescriptor, currentsecuritydescriptor: PsecurityDescriptor, newsecuritydescriptor: MutPtr, objecttype: ConstPtr, isdirectoryobject: Boolean, genericmapping: ConstPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityConvertToAutoInheritPrivateObjectSecurity(parentdescriptor.rawAddress.toString(), currentsecuritydescriptor.rawAddress.toString(), newsecuritydescriptor.rawAddress.toString(), objecttype.rawAddress.toString(), isdirectoryobject, genericmapping.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copySid(ndestinationsidlength: UInt, pdestinationsid: Psid, psourcesid: Psid): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityCopySid(ndestinationsidlength.toInt(), pdestinationsid.rawAddress.toString(), psourcesid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPrivateObjectSecurity(parentdescriptor: PsecurityDescriptor, creatordescriptor: PsecurityDescriptor, newdescriptor: MutPtr, isdirectoryobject: Bool, token: Handle, genericmapping: ConstPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityCreatePrivateObjectSecurity(parentdescriptor.rawAddress.toString(), creatordescriptor.rawAddress.toString(), newdescriptor.rawAddress.toString(), isdirectoryobject, token.rawAddress.toString(), genericmapping.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPrivateObjectSecurityEx(parentdescriptor: PsecurityDescriptor, creatordescriptor: PsecurityDescriptor, newdescriptor: MutPtr, objecttype: ConstPtr, iscontainerobject: Bool, autoinheritflags: SecurityAutoInheritFlags, token: Handle, genericmapping: ConstPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityCreatePrivateObjectSecurityEx(parentdescriptor.rawAddress.toString(), creatordescriptor.rawAddress.toString(), newdescriptor.rawAddress.toString(), objecttype.rawAddress.toString(), iscontainerobject, autoinheritflags.toInt(), token.rawAddress.toString(), genericmapping.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPrivateObjectSecurityWithMultipleInheritance(parentdescriptor: PsecurityDescriptor, creatordescriptor: PsecurityDescriptor, newdescriptor: MutPtr, objecttypes: ConstPtr, guidcount: UInt, iscontainerobject: Bool, autoinheritflags: SecurityAutoInheritFlags, token: Handle, genericmapping: ConstPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityCreatePrivateObjectSecurityWithMultipleInheritance(parentdescriptor.rawAddress.toString(), creatordescriptor.rawAddress.toString(), newdescriptor.rawAddress.toString(), objecttypes.rawAddress.toString(), guidcount.toInt(), iscontainerobject, autoinheritflags.toInt(), token.rawAddress.toString(), genericmapping.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createRestrictedToken(existingtokenhandle: Handle, flags: CreateRestrictedTokenFlags, disablesidcount: UInt, sidstodisable: ConstPtr, deleteprivilegecount: UInt, privilegestodelete: ConstPtr, restrictedsidcount: UInt, sidstorestrict: ConstPtr, newtokenhandle: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityCreateRestrictedToken(existingtokenhandle.rawAddress.toString(), flags.toInt(), disablesidcount.toInt(), sidstodisable.rawAddress.toString(), deleteprivilegecount.toInt(), privilegestodelete.rawAddress.toString(), restrictedsidcount.toInt(), sidstorestrict.rawAddress.toString(), newtokenhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createWellKnownSid(wellknownsidtype: WellKnownSidType, domainsid: Psid, psid: Psid, cbsid: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityCreateWellKnownSid(wellknownsidtype, domainsid.rawAddress.toString(), psid.rawAddress.toString(), cbsid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteAce(pacl: MutPtr, dwaceindex: UInt): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityDeleteAce(pacl.rawAddress.toString(), dwaceindex.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deriveCapabilitySidsFromName(capname: Pcwstr, capabilitygroupsids: MutPtr, capabilitygroupsidcount: MutPtr, capabilitysids: MutPtr, capabilitysidcount: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityDeriveCapabilitySidsFromName(capname.rawAddress.toString(), capabilitygroupsids.rawAddress.toString(), capabilitygroupsidcount.rawAddress.toString(), capabilitysids.rawAddress.toString(), capabilitysidcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyPrivateObjectSecurity(objectdescriptor: ConstPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityDestroyPrivateObjectSecurity(objectdescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplicateToken(existingtokenhandle: Handle, impersonationlevel: SecurityImpersonationLevel, duplicatetokenhandle: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityDuplicateToken(existingtokenhandle.rawAddress.toString(), impersonationlevel, duplicatetokenhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplicateTokenEx(hexistingtoken: Handle, dwdesiredaccess: TokenAccessMask, lptokenattributes: ConstPtr, impersonationlevel: SecurityImpersonationLevel, tokentype: TokenType, phnewtoken: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityDuplicateTokenEx(hexistingtoken.rawAddress.toString(), dwdesiredaccess.toInt(), lptokenattributes.rawAddress.toString(), impersonationlevel, tokentype, phnewtoken.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun equalDomainSid(psid1: Psid, psid2: Psid, pfequal: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityEqualDomainSid(psid1.rawAddress.toString(), psid2.rawAddress.toString(), pfequal.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun equalPrefixSid(psid1: Psid, psid2: Psid): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityEqualPrefixSid(psid1.rawAddress.toString(), psid2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun equalSid(psid1: Psid, psid2: Psid): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityEqualSid(psid1.rawAddress.toString(), psid2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstFreeAce(pacl: ConstPtr, pace: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityFindFirstFreeAce(pacl.rawAddress.toString(), pace.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeSid(psid: Psid): MutPtr =
    if (windowsWin32SecurityNapiAddon != null) MutPtr((windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityFreeSid(psid.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAce(pacl: ConstPtr, dwaceindex: UInt, pace: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityGetAce(pacl.rawAddress.toString(), dwaceindex.toInt(), pace.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAclInformation(pacl: ConstPtr, paclinformation: MutPtr, naclinformationlength: UInt, dwaclinformationclass: AclInformationClass): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityGetAclInformation(pacl.rawAddress.toString(), paclinformation.rawAddress.toString(), naclinformationlength.toInt(), dwaclinformationclass) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAppContainerAce(acl: ConstPtr, startingaceindex: UInt, appcontainerace: MutPtr, appcontaineraceindex: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityGetAppContainerAce(acl.rawAddress.toString(), startingaceindex.toInt(), appcontainerace.rawAddress.toString(), appcontaineraceindex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCachedSigningLevel(file: Handle, flags: MutPtr, signinglevel: MutPtr, thumbprint: MutPtr, thumbprintsize: MutPtr, thumbprintalgorithm: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityGetCachedSigningLevel(file.rawAddress.toString(), flags.rawAddress.toString(), signinglevel.rawAddress.toString(), thumbprint.rawAddress.toString(), thumbprintsize.rawAddress.toString(), thumbprintalgorithm.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileSecurityA(lpfilename: Pcstr, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityGetFileSecurityA(lpfilename.rawAddress.toString(), requestedinformation.toInt(), psecuritydescriptor.rawAddress.toString(), nlength.toInt(), lpnlengthneeded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileSecurityW(lpfilename: Pcwstr, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityGetFileSecurityW(lpfilename.rawAddress.toString(), requestedinformation.toInt(), psecuritydescriptor.rawAddress.toString(), nlength.toInt(), lpnlengthneeded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKernelObjectSecurity(handle: Handle, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityGetKernelObjectSecurity(handle.rawAddress.toString(), requestedinformation.toInt(), psecuritydescriptor.rawAddress.toString(), nlength.toInt(), lpnlengthneeded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLengthSid(psid: Psid): UInt =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityGetLengthSid(psid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrivateObjectSecurity(objectdescriptor: PsecurityDescriptor, securityinformation: ObjectSecurityInformation, resultantdescriptor: PsecurityDescriptor, descriptorlength: UInt, returnlength: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityGetPrivateObjectSecurity(objectdescriptor.rawAddress.toString(), securityinformation.toInt(), resultantdescriptor.rawAddress.toString(), descriptorlength.toInt(), returnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSecurityDescriptorControl(psecuritydescriptor: PsecurityDescriptor, pcontrol: MutPtr, lpdwrevision: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityGetSecurityDescriptorControl(psecuritydescriptor.rawAddress.toString(), pcontrol.rawAddress.toString(), lpdwrevision.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSecurityDescriptorDacl(psecuritydescriptor: PsecurityDescriptor, lpbdaclpresent: MutPtr, pdacl: MutPtr, lpbdacldefaulted: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityGetSecurityDescriptorDacl(psecuritydescriptor.rawAddress.toString(), lpbdaclpresent.rawAddress.toString(), pdacl.rawAddress.toString(), lpbdacldefaulted.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSecurityDescriptorGroup(psecuritydescriptor: PsecurityDescriptor, pgroup: MutPtr, lpbgroupdefaulted: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityGetSecurityDescriptorGroup(psecuritydescriptor.rawAddress.toString(), pgroup.rawAddress.toString(), lpbgroupdefaulted.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSecurityDescriptorLength(psecuritydescriptor: PsecurityDescriptor): UInt =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityGetSecurityDescriptorLength(psecuritydescriptor.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSecurityDescriptorOwner(psecuritydescriptor: PsecurityDescriptor, powner: MutPtr, lpbownerdefaulted: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityGetSecurityDescriptorOwner(psecuritydescriptor.rawAddress.toString(), powner.rawAddress.toString(), lpbownerdefaulted.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSecurityDescriptorRMControl(securitydescriptor: PsecurityDescriptor, rmcontrol: MutPtr): UInt =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityGetSecurityDescriptorRMControl(securitydescriptor.rawAddress.toString(), rmcontrol.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSecurityDescriptorSacl(psecuritydescriptor: PsecurityDescriptor, lpbsaclpresent: MutPtr, psacl: MutPtr, lpbsacldefaulted: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityGetSecurityDescriptorSacl(psecuritydescriptor.rawAddress.toString(), lpbsaclpresent.rawAddress.toString(), psacl.rawAddress.toString(), lpbsacldefaulted.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSidIdentifierAuthority(psid: Psid): MutPtr =
    if (windowsWin32SecurityNapiAddon != null) MutPtr((windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityGetSidIdentifierAuthority(psid.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSidLengthRequired(nsubauthoritycount: UByte): UInt =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityGetSidLengthRequired(nsubauthoritycount.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSidSubAuthority(psid: Psid, nsubauthority: UInt): MutPtr =
    if (windowsWin32SecurityNapiAddon != null) MutPtr((windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityGetSidSubAuthority(psid.rawAddress.toString(), nsubauthority.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSidSubAuthorityCount(psid: Psid): MutPtr =
    if (windowsWin32SecurityNapiAddon != null) MutPtr((windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityGetSidSubAuthorityCount(psid.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTokenInformation(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: MutPtr, tokeninformationlength: UInt, returnlength: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityGetTokenInformation(tokenhandle.rawAddress.toString(), tokeninformationclass, tokeninformation.rawAddress.toString(), tokeninformationlength.toInt(), returnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserObjectSecurity(hobj: Handle, psirequested: ConstPtr, psid: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityGetUserObjectSecurity(hobj.rawAddress.toString(), psirequested.rawAddress.toString(), psid.rawAddress.toString(), nlength.toInt(), lpnlengthneeded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowsAccountDomainSid(psid: Psid, pdomainsid: Psid, cbdomainsid: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityGetWindowsAccountDomainSid(psid.rawAddress.toString(), pdomainsid.rawAddress.toString(), cbdomainsid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun impersonateAnonymousToken(threadhandle: Handle): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityImpersonateAnonymousToken(threadhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun impersonateLoggedOnUser(htoken: Handle): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityImpersonateLoggedOnUser(htoken.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun impersonateSelf(impersonationlevel: SecurityImpersonationLevel): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityImpersonateSelf(impersonationlevel) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeAcl(pacl: MutPtr, nacllength: UInt, dwaclrevision: AceRevision): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityInitializeAcl(pacl.rawAddress.toString(), nacllength.toInt(), dwaclrevision.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeSecurityDescriptor(psecuritydescriptor: PsecurityDescriptor, dwrevision: UInt): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityInitializeSecurityDescriptor(psecuritydescriptor.rawAddress.toString(), dwrevision.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeSid(sid: Psid, pidentifierauthority: ConstPtr, nsubauthoritycount: UByte): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityInitializeSid(sid.rawAddress.toString(), pidentifierauthority.rawAddress.toString(), nsubauthoritycount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isTokenRestricted(tokenhandle: Handle): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityIsTokenRestricted(tokenhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isValidAcl(pacl: ConstPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityIsValidAcl(pacl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isValidSecurityDescriptor(psecuritydescriptor: PsecurityDescriptor): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityIsValidSecurityDescriptor(psecuritydescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isValidSid(psid: Psid): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityIsValidSid(psid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isWellKnownSid(psid: Psid, wellknownsidtype: WellKnownSidType): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityIsWellKnownSid(psid.rawAddress.toString(), wellknownsidtype) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun logonUserA(lpszusername: Pcstr, lpszdomain: Pcstr, lpszpassword: Pcstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityLogonUserA(lpszusername.rawAddress.toString(), lpszdomain.rawAddress.toString(), lpszpassword.rawAddress.toString(), dwlogontype.toInt(), dwlogonprovider.toInt(), phtoken.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun logonUserExA(lpszusername: Pcstr, lpszdomain: Pcstr, lpszpassword: Pcstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: MutPtr, pplogonsid: MutPtr, ppprofilebuffer: MutPtr, pdwprofilelength: MutPtr, pquotalimits: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityLogonUserExA(lpszusername.rawAddress.toString(), lpszdomain.rawAddress.toString(), lpszpassword.rawAddress.toString(), dwlogontype.toInt(), dwlogonprovider.toInt(), phtoken.rawAddress.toString(), pplogonsid.rawAddress.toString(), ppprofilebuffer.rawAddress.toString(), pdwprofilelength.rawAddress.toString(), pquotalimits.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun logonUserExW(lpszusername: Pcwstr, lpszdomain: Pcwstr, lpszpassword: Pcwstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: MutPtr, pplogonsid: MutPtr, ppprofilebuffer: MutPtr, pdwprofilelength: MutPtr, pquotalimits: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityLogonUserExW(lpszusername.rawAddress.toString(), lpszdomain.rawAddress.toString(), lpszpassword.rawAddress.toString(), dwlogontype.toInt(), dwlogonprovider.toInt(), phtoken.rawAddress.toString(), pplogonsid.rawAddress.toString(), ppprofilebuffer.rawAddress.toString(), pdwprofilelength.rawAddress.toString(), pquotalimits.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun logonUserW(lpszusername: Pcwstr, lpszdomain: Pcwstr, lpszpassword: Pcwstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityLogonUserW(lpszusername.rawAddress.toString(), lpszdomain.rawAddress.toString(), lpszpassword.rawAddress.toString(), dwlogontype.toInt(), dwlogonprovider.toInt(), phtoken.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupAccountNameA(lpsystemname: Pcstr, lpaccountname: Pcstr, sid: Psid, cbsid: MutPtr, referenceddomainname: Pstr, cchreferenceddomainname: MutPtr, peuse: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityLookupAccountNameA(lpsystemname.rawAddress.toString(), lpaccountname.rawAddress.toString(), sid.rawAddress.toString(), cbsid.rawAddress.toString(), referenceddomainname.rawAddress.toString(), cchreferenceddomainname.rawAddress.toString(), peuse.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupAccountNameW(lpsystemname: Pcwstr, lpaccountname: Pcwstr, sid: Psid, cbsid: MutPtr, referenceddomainname: Pwstr, cchreferenceddomainname: MutPtr, peuse: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityLookupAccountNameW(lpsystemname.rawAddress.toString(), lpaccountname.rawAddress.toString(), sid.rawAddress.toString(), cbsid.rawAddress.toString(), referenceddomainname.rawAddress.toString(), cchreferenceddomainname.rawAddress.toString(), peuse.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupAccountSidA(lpsystemname: Pcstr, sid: Psid, name: Pstr, cchname: MutPtr, referenceddomainname: Pstr, cchreferenceddomainname: MutPtr, peuse: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityLookupAccountSidA(lpsystemname.rawAddress.toString(), sid.rawAddress.toString(), name.rawAddress.toString(), cchname.rawAddress.toString(), referenceddomainname.rawAddress.toString(), cchreferenceddomainname.rawAddress.toString(), peuse.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupAccountSidW(lpsystemname: Pcwstr, sid: Psid, name: Pwstr, cchname: MutPtr, referenceddomainname: Pwstr, cchreferenceddomainname: MutPtr, peuse: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityLookupAccountSidW(lpsystemname.rawAddress.toString(), sid.rawAddress.toString(), name.rawAddress.toString(), cchname.rawAddress.toString(), referenceddomainname.rawAddress.toString(), cchreferenceddomainname.rawAddress.toString(), peuse.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupPrivilegeDisplayNameA(lpsystemname: Pcstr, lpname: Pcstr, lpdisplayname: Pstr, cchdisplayname: MutPtr, lplanguageid: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityLookupPrivilegeDisplayNameA(lpsystemname.rawAddress.toString(), lpname.rawAddress.toString(), lpdisplayname.rawAddress.toString(), cchdisplayname.rawAddress.toString(), lplanguageid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupPrivilegeDisplayNameW(lpsystemname: Pcwstr, lpname: Pcwstr, lpdisplayname: Pwstr, cchdisplayname: MutPtr, lplanguageid: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityLookupPrivilegeDisplayNameW(lpsystemname.rawAddress.toString(), lpname.rawAddress.toString(), lpdisplayname.rawAddress.toString(), cchdisplayname.rawAddress.toString(), lplanguageid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupPrivilegeNameA(lpsystemname: Pcstr, lpluid: ConstPtr, lpname: Pstr, cchname: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityLookupPrivilegeNameA(lpsystemname.rawAddress.toString(), lpluid.rawAddress.toString(), lpname.rawAddress.toString(), cchname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupPrivilegeNameW(lpsystemname: Pcwstr, lpluid: ConstPtr, lpname: Pwstr, cchname: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityLookupPrivilegeNameW(lpsystemname.rawAddress.toString(), lpluid.rawAddress.toString(), lpname.rawAddress.toString(), cchname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupPrivilegeValueA(lpsystemname: Pcstr, lpname: Pcstr, lpluid: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityLookupPrivilegeValueA(lpsystemname.rawAddress.toString(), lpname.rawAddress.toString(), lpluid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupPrivilegeValueW(lpsystemname: Pcwstr, lpname: Pcwstr, lpluid: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityLookupPrivilegeValueW(lpsystemname.rawAddress.toString(), lpname.rawAddress.toString(), lpluid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun makeAbsoluteSD(pselfrelativesecuritydescriptor: PsecurityDescriptor, pabsolutesecuritydescriptor: PsecurityDescriptor, lpdwabsolutesecuritydescriptorsize: MutPtr, pdacl: MutPtr, lpdwdaclsize: MutPtr, psacl: MutPtr, lpdwsaclsize: MutPtr, powner: Psid, lpdwownersize: MutPtr, pprimarygroup: Psid, lpdwprimarygroupsize: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityMakeAbsoluteSD(pselfrelativesecuritydescriptor.rawAddress.toString(), pabsolutesecuritydescriptor.rawAddress.toString(), lpdwabsolutesecuritydescriptorsize.rawAddress.toString(), pdacl.rawAddress.toString(), lpdwdaclsize.rawAddress.toString(), psacl.rawAddress.toString(), lpdwsaclsize.rawAddress.toString(), powner.rawAddress.toString(), lpdwownersize.rawAddress.toString(), pprimarygroup.rawAddress.toString(), lpdwprimarygroupsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun makeSelfRelativeSD(pabsolutesecuritydescriptor: PsecurityDescriptor, pselfrelativesecuritydescriptor: PsecurityDescriptor, lpdwbufferlength: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityMakeSelfRelativeSD(pabsolutesecuritydescriptor.rawAddress.toString(), pselfrelativesecuritydescriptor.rawAddress.toString(), lpdwbufferlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapGenericMask(accessmask: MutPtr, genericmapping: ConstPtr) {
    if (windowsWin32SecurityNapiAddon != null) {
        windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityMapGenericMask(accessmask.rawAddress.toString(), genericmapping.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun objectCloseAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr, generateonclose: Bool): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityObjectCloseAuditAlarmA(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), generateonclose) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun objectCloseAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr, generateonclose: Bool): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityObjectCloseAuditAlarmW(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), generateonclose) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun objectDeleteAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr, generateonclose: Bool): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityObjectDeleteAuditAlarmA(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), generateonclose) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun objectDeleteAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr, generateonclose: Bool): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityObjectDeleteAuditAlarmW(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), generateonclose) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun objectOpenAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr, objecttypename: Pcstr, objectname: Pcstr, psecuritydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: ConstPtr, objectcreation: Bool, accessgranted: Bool, generateonclose: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityObjectOpenAuditAlarmA(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), psecuritydescriptor.rawAddress.toString(), clienttoken.rawAddress.toString(), desiredaccess.toInt(), grantedaccess.toInt(), privileges.rawAddress.toString(), objectcreation, accessgranted, generateonclose.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun objectOpenAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr, objecttypename: Pcwstr, objectname: Pcwstr, psecuritydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: ConstPtr, objectcreation: Bool, accessgranted: Bool, generateonclose: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityObjectOpenAuditAlarmW(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), psecuritydescriptor.rawAddress.toString(), clienttoken.rawAddress.toString(), desiredaccess.toInt(), grantedaccess.toInt(), privileges.rawAddress.toString(), objectcreation, accessgranted, generateonclose.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun objectPrivilegeAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr, clienttoken: Handle, desiredaccess: UInt, privileges: ConstPtr, accessgranted: Bool): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityObjectPrivilegeAuditAlarmA(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), clienttoken.rawAddress.toString(), desiredaccess.toInt(), privileges.rawAddress.toString(), accessgranted) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun objectPrivilegeAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr, clienttoken: Handle, desiredaccess: UInt, privileges: ConstPtr, accessgranted: Bool): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityObjectPrivilegeAuditAlarmW(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), clienttoken.rawAddress.toString(), desiredaccess.toInt(), privileges.rawAddress.toString(), accessgranted) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun privilegeCheck(clienttoken: Handle, requiredprivileges: MutPtr, pfresult: MutPtr): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityPrivilegeCheck(clienttoken.rawAddress.toString(), requiredprivileges.rawAddress.toString(), pfresult.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun privilegedServiceAuditAlarmA(subsystemname: Pcstr, servicename: Pcstr, clienttoken: Handle, privileges: ConstPtr, accessgranted: Bool): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityPrivilegedServiceAuditAlarmA(subsystemname.rawAddress.toString(), servicename.rawAddress.toString(), clienttoken.rawAddress.toString(), privileges.rawAddress.toString(), accessgranted) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun privilegedServiceAuditAlarmW(subsystemname: Pcwstr, servicename: Pcwstr, clienttoken: Handle, privileges: ConstPtr, accessgranted: Bool): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityPrivilegedServiceAuditAlarmW(subsystemname.rawAddress.toString(), servicename.rawAddress.toString(), clienttoken.rawAddress.toString(), privileges.rawAddress.toString(), accessgranted) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun querySecurityAccessMask(securityinformation: ObjectSecurityInformation, desiredaccess: MutPtr) {
    if (windowsWin32SecurityNapiAddon != null) {
        windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityQuerySecurityAccessMask(securityinformation.toInt(), desiredaccess.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun revertToSelf(): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityRevertToSelf() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlConvertSidToUnicodeString(unicodestring: MutPtr, sid: Psid, allocatedestinationstring: Boolean): Ntstatus =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityRtlConvertSidToUnicodeString(unicodestring.rawAddress.toString(), sid.rawAddress.toString(), allocatedestinationstring) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlNormalizeSecurityDescriptor(securitydescriptor: MutPtr, securitydescriptorlength: UInt, newsecuritydescriptor: MutPtr, newsecuritydescriptorlength: MutPtr, checkonly: Boolean): Boolean =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecurityRtlNormalizeSecurityDescriptor(securitydescriptor.rawAddress.toString(), securitydescriptorlength.toInt(), newsecuritydescriptor.rawAddress.toString(), newsecuritydescriptorlength.rawAddress.toString(), checkonly) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setAclInformation(pacl: MutPtr, paclinformation: ConstPtr, naclinformationlength: UInt, dwaclinformationclass: AclInformationClass): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecuritySetAclInformation(pacl.rawAddress.toString(), paclinformation.rawAddress.toString(), naclinformationlength.toInt(), dwaclinformationclass) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCachedSigningLevel(sourcefiles: ConstPtr, sourcefilecount: UInt, flags: UInt, targetfile: Handle): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecuritySetCachedSigningLevel(sourcefiles.rawAddress.toString(), sourcefilecount.toInt(), flags.toInt(), targetfile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileSecurityA(lpfilename: Pcstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecuritySetFileSecurityA(lpfilename.rawAddress.toString(), securityinformation.toInt(), psecuritydescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileSecurityW(lpfilename: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecuritySetFileSecurityW(lpfilename.rawAddress.toString(), securityinformation.toInt(), psecuritydescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setKernelObjectSecurity(handle: Handle, securityinformation: ObjectSecurityInformation, securitydescriptor: PsecurityDescriptor): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecuritySetKernelObjectSecurity(handle.rawAddress.toString(), securityinformation.toInt(), securitydescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPrivateObjectSecurity(securityinformation: ObjectSecurityInformation, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: MutPtr, genericmapping: ConstPtr, token: Handle): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecuritySetPrivateObjectSecurity(securityinformation.toInt(), modificationdescriptor.rawAddress.toString(), objectssecuritydescriptor.rawAddress.toString(), genericmapping.rawAddress.toString(), token.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPrivateObjectSecurityEx(securityinformation: ObjectSecurityInformation, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: MutPtr, autoinheritflags: SecurityAutoInheritFlags, genericmapping: ConstPtr, token: Handle): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecuritySetPrivateObjectSecurityEx(securityinformation.toInt(), modificationdescriptor.rawAddress.toString(), objectssecuritydescriptor.rawAddress.toString(), autoinheritflags.toInt(), genericmapping.rawAddress.toString(), token.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSecurityAccessMask(securityinformation: ObjectSecurityInformation, desiredaccess: MutPtr) {
    if (windowsWin32SecurityNapiAddon != null) {
        windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecuritySetSecurityAccessMask(securityinformation.toInt(), desiredaccess.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setSecurityDescriptorControl(psecuritydescriptor: PsecurityDescriptor, controlbitsofinterest: SecurityDescriptorControl, controlbitstoset: SecurityDescriptorControl): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecuritySetSecurityDescriptorControl(psecuritydescriptor.rawAddress.toString(), controlbitsofinterest.toInt(), controlbitstoset.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSecurityDescriptorDacl(psecuritydescriptor: PsecurityDescriptor, bdaclpresent: Bool, pdacl: ConstPtr, bdacldefaulted: Bool): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecuritySetSecurityDescriptorDacl(psecuritydescriptor.rawAddress.toString(), bdaclpresent, pdacl.rawAddress.toString(), bdacldefaulted) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSecurityDescriptorGroup(psecuritydescriptor: PsecurityDescriptor, pgroup: Psid, bgroupdefaulted: Bool): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecuritySetSecurityDescriptorGroup(psecuritydescriptor.rawAddress.toString(), pgroup.rawAddress.toString(), bgroupdefaulted) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSecurityDescriptorOwner(psecuritydescriptor: PsecurityDescriptor, powner: Psid, bownerdefaulted: Bool): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecuritySetSecurityDescriptorOwner(psecuritydescriptor.rawAddress.toString(), powner.rawAddress.toString(), bownerdefaulted) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSecurityDescriptorRMControl(securitydescriptor: PsecurityDescriptor, rmcontrol: ConstPtr): UInt =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecuritySetSecurityDescriptorRMControl(securitydescriptor.rawAddress.toString(), rmcontrol.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSecurityDescriptorSacl(psecuritydescriptor: PsecurityDescriptor, bsaclpresent: Bool, psacl: ConstPtr, bsacldefaulted: Bool): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecuritySetSecurityDescriptorSacl(psecuritydescriptor.rawAddress.toString(), bsaclpresent, psacl.rawAddress.toString(), bsacldefaulted) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTokenInformation(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: ConstPtr, tokeninformationlength: UInt): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecuritySetTokenInformation(tokenhandle.rawAddress.toString(), tokeninformationclass, tokeninformation.rawAddress.toString(), tokeninformationlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUserObjectSecurity(hobj: Handle, psirequested: ConstPtr, psid: PsecurityDescriptor): Bool =
    if (windowsWin32SecurityNapiAddon != null) (windowsWin32SecurityNapiAddon.windowssysWindowsWin32SecuritySetUserObjectSecurity(hobj.rawAddress.toString(), psirequested.rawAddress.toString(), psid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
