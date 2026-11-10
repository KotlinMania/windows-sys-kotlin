@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

private val _windowsWin32SecurityNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun accessCheck(psecuritydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, genericmapping: COpaquePointer?, privilegeset: COpaquePointer?, privilegesetlength: COpaquePointer?, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_accessCheck((psecuritydescriptor?.value ?: 0L).toString(), (clienttoken?.value ?: 0L).toString(), desiredaccess.toInt(), (genericmapping?.value ?: 0L).toString(), (privilegeset?.value ?: 0L).toString(), (privilegesetlength?.value ?: 0L).toString(), (grantedaccess?.value ?: 0L).toString(), (accessstatus?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessCheckAndAuditAlarmA(subsystemname: Pcstr, handleid: COpaquePointer?, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: COpaquePointer?, objectcreation: Bool, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, pfgenerateonclose: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_accessCheckAndAuditAlarmA((subsystemname?.value ?: 0L).toString(), (handleid?.value ?: 0L).toString(), (objecttypename?.value ?: 0L).toString(), (objectname?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString(), desiredaccess.toInt(), (genericmapping?.value ?: 0L).toString(), objectcreation, (grantedaccess?.value ?: 0L).toString(), (accessstatus?.value ?: 0L).toString(), (pfgenerateonclose?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessCheckAndAuditAlarmW(subsystemname: Pcwstr, handleid: COpaquePointer?, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: COpaquePointer?, objectcreation: Bool, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, pfgenerateonclose: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_accessCheckAndAuditAlarmW((subsystemname?.value ?: 0L).toString(), (handleid?.value ?: 0L).toString(), (objecttypename?.value ?: 0L).toString(), (objectname?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString(), desiredaccess.toInt(), (genericmapping?.value ?: 0L).toString(), objectcreation, (grantedaccess?.value ?: 0L).toString(), (accessstatus?.value ?: 0L).toString(), (pfgenerateonclose?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessCheckByType(psecuritydescriptor: PsecurityDescriptor, principalselfsid: Psid, clienttoken: Handle, desiredaccess: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, privilegeset: COpaquePointer?, privilegesetlength: COpaquePointer?, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_accessCheckByType((psecuritydescriptor?.value ?: 0L).toString(), (principalselfsid?.value ?: 0L).toString(), (clienttoken?.value ?: 0L).toString(), desiredaccess.toInt(), (objecttypelist?.value ?: 0L).toString(), objecttypelistlength.toInt(), (genericmapping?.value ?: 0L).toString(), (privilegeset?.value ?: 0L).toString(), (privilegesetlength?.value ?: 0L).toString(), (grantedaccess?.value ?: 0L).toString(), (accessstatus?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessCheckByTypeAndAuditAlarmA(subsystemname: Pcstr, handleid: COpaquePointer?, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Bool, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, pfgenerateonclose: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_accessCheckByTypeAndAuditAlarmA((subsystemname?.value ?: 0L).toString(), (handleid?.value ?: 0L).toString(), (objecttypename?.value ?: 0L).toString(), (objectname?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString(), (principalselfsid?.value ?: 0L).toString(), desiredaccess.toInt(), audittype, flags.toInt(), (objecttypelist?.value ?: 0L).toString(), objecttypelistlength.toInt(), (genericmapping?.value ?: 0L).toString(), objectcreation, (grantedaccess?.value ?: 0L).toString(), (accessstatus?.value ?: 0L).toString(), (pfgenerateonclose?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessCheckByTypeAndAuditAlarmW(subsystemname: Pcwstr, handleid: COpaquePointer?, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Bool, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, pfgenerateonclose: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_accessCheckByTypeAndAuditAlarmW((subsystemname?.value ?: 0L).toString(), (handleid?.value ?: 0L).toString(), (objecttypename?.value ?: 0L).toString(), (objectname?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString(), (principalselfsid?.value ?: 0L).toString(), desiredaccess.toInt(), audittype, flags.toInt(), (objecttypelist?.value ?: 0L).toString(), objecttypelistlength.toInt(), (genericmapping?.value ?: 0L).toString(), objectcreation, (grantedaccess?.value ?: 0L).toString(), (accessstatus?.value ?: 0L).toString(), (pfgenerateonclose?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessCheckByTypeResultList(psecuritydescriptor: PsecurityDescriptor, principalselfsid: Psid, clienttoken: Handle, desiredaccess: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, privilegeset: COpaquePointer?, privilegesetlength: COpaquePointer?, grantedaccesslist: COpaquePointer?, accessstatuslist: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_accessCheckByTypeResultList((psecuritydescriptor?.value ?: 0L).toString(), (principalselfsid?.value ?: 0L).toString(), (clienttoken?.value ?: 0L).toString(), desiredaccess.toInt(), (objecttypelist?.value ?: 0L).toString(), objecttypelistlength.toInt(), (genericmapping?.value ?: 0L).toString(), (privilegeset?.value ?: 0L).toString(), (privilegesetlength?.value ?: 0L).toString(), (grantedaccesslist?.value ?: 0L).toString(), (accessstatuslist?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessCheckByTypeResultListAndAuditAlarmA(subsystemname: Pcstr, handleid: COpaquePointer?, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Bool, grantedaccess: COpaquePointer?, accessstatuslist: COpaquePointer?, pfgenerateonclose: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_accessCheckByTypeResultListAndAuditAlarmA((subsystemname?.value ?: 0L).toString(), (handleid?.value ?: 0L).toString(), (objecttypename?.value ?: 0L).toString(), (objectname?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString(), (principalselfsid?.value ?: 0L).toString(), desiredaccess.toInt(), audittype, flags.toInt(), (objecttypelist?.value ?: 0L).toString(), objecttypelistlength.toInt(), (genericmapping?.value ?: 0L).toString(), objectcreation, (grantedaccess?.value ?: 0L).toString(), (accessstatuslist?.value ?: 0L).toString(), (pfgenerateonclose?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessCheckByTypeResultListAndAuditAlarmByHandleA(subsystemname: Pcstr, handleid: COpaquePointer?, clienttoken: Handle, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Bool, grantedaccess: COpaquePointer?, accessstatuslist: COpaquePointer?, pfgenerateonclose: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_accessCheckByTypeResultListAndAuditAlarmByHandleA((subsystemname?.value ?: 0L).toString(), (handleid?.value ?: 0L).toString(), (clienttoken?.value ?: 0L).toString(), (objecttypename?.value ?: 0L).toString(), (objectname?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString(), (principalselfsid?.value ?: 0L).toString(), desiredaccess.toInt(), audittype, flags.toInt(), (objecttypelist?.value ?: 0L).toString(), objecttypelistlength.toInt(), (genericmapping?.value ?: 0L).toString(), objectcreation, (grantedaccess?.value ?: 0L).toString(), (accessstatuslist?.value ?: 0L).toString(), (pfgenerateonclose?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessCheckByTypeResultListAndAuditAlarmByHandleW(subsystemname: Pcwstr, handleid: COpaquePointer?, clienttoken: Handle, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Bool, grantedaccesslist: COpaquePointer?, accessstatuslist: COpaquePointer?, pfgenerateonclose: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_accessCheckByTypeResultListAndAuditAlarmByHandleW((subsystemname?.value ?: 0L).toString(), (handleid?.value ?: 0L).toString(), (clienttoken?.value ?: 0L).toString(), (objecttypename?.value ?: 0L).toString(), (objectname?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString(), (principalselfsid?.value ?: 0L).toString(), desiredaccess.toInt(), audittype, flags.toInt(), (objecttypelist?.value ?: 0L).toString(), objecttypelistlength.toInt(), (genericmapping?.value ?: 0L).toString(), objectcreation, (grantedaccesslist?.value ?: 0L).toString(), (accessstatuslist?.value ?: 0L).toString(), (pfgenerateonclose?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessCheckByTypeResultListAndAuditAlarmW(subsystemname: Pcwstr, handleid: COpaquePointer?, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Bool, grantedaccesslist: COpaquePointer?, accessstatuslist: COpaquePointer?, pfgenerateonclose: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_accessCheckByTypeResultListAndAuditAlarmW((subsystemname?.value ?: 0L).toString(), (handleid?.value ?: 0L).toString(), (objecttypename?.value ?: 0L).toString(), (objectname?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString(), (principalselfsid?.value ?: 0L).toString(), desiredaccess.toInt(), audittype, flags.toInt(), (objecttypelist?.value ?: 0L).toString(), objecttypelistlength.toInt(), (genericmapping?.value ?: 0L).toString(), objectcreation, (grantedaccesslist?.value ?: 0L).toString(), (accessstatuslist?.value ?: 0L).toString(), (pfgenerateonclose?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addAccessAllowedAce(pacl: COpaquePointer?, dwacerevision: AceRevision, accessmask: UInt, psid: Psid): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_addAccessAllowedAce((pacl?.value ?: 0L).toString(), dwacerevision.toInt(), accessmask.toInt(), (psid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addAccessAllowedAceEx(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_addAccessAllowedAceEx((pacl?.value ?: 0L).toString(), dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), (psid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addAccessAllowedObjectAce(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, objecttypeguid: COpaquePointer?, inheritedobjecttypeguid: COpaquePointer?, psid: Psid): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_addAccessAllowedObjectAce((pacl?.value ?: 0L).toString(), dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), (objecttypeguid?.value ?: 0L).toString(), (inheritedobjecttypeguid?.value ?: 0L).toString(), (psid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addAccessDeniedAce(pacl: COpaquePointer?, dwacerevision: AceRevision, accessmask: UInt, psid: Psid): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_addAccessDeniedAce((pacl?.value ?: 0L).toString(), dwacerevision.toInt(), accessmask.toInt(), (psid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addAccessDeniedAceEx(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_addAccessDeniedAceEx((pacl?.value ?: 0L).toString(), dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), (psid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addAccessDeniedObjectAce(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, objecttypeguid: COpaquePointer?, inheritedobjecttypeguid: COpaquePointer?, psid: Psid): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_addAccessDeniedObjectAce((pacl?.value ?: 0L).toString(), dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), (objecttypeguid?.value ?: 0L).toString(), (inheritedobjecttypeguid?.value ?: 0L).toString(), (psid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addAce(pacl: COpaquePointer?, dwacerevision: AceRevision, dwstartingaceindex: UInt, pacelist: COpaquePointer?, nacelistlength: UInt): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_addAce((pacl?.value ?: 0L).toString(), dwacerevision.toInt(), dwstartingaceindex.toInt(), (pacelist?.value ?: 0L).toString(), nacelistlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addAuditAccessAce(pacl: COpaquePointer?, dwacerevision: AceRevision, dwaccessmask: UInt, psid: Psid, bauditsuccess: Bool, bauditfailure: Bool): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_addAuditAccessAce((pacl?.value ?: 0L).toString(), dwacerevision.toInt(), dwaccessmask.toInt(), (psid?.value ?: 0L).toString(), bauditsuccess, bauditfailure) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addAuditAccessAceEx(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, dwaccessmask: UInt, psid: Psid, bauditsuccess: Bool, bauditfailure: Bool): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_addAuditAccessAceEx((pacl?.value ?: 0L).toString(), dwacerevision.toInt(), aceflags.toInt(), dwaccessmask.toInt(), (psid?.value ?: 0L).toString(), bauditsuccess, bauditfailure) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addAuditAccessObjectAce(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, objecttypeguid: COpaquePointer?, inheritedobjecttypeguid: COpaquePointer?, psid: Psid, bauditsuccess: Bool, bauditfailure: Bool): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_addAuditAccessObjectAce((pacl?.value ?: 0L).toString(), dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), (objecttypeguid?.value ?: 0L).toString(), (inheritedobjecttypeguid?.value ?: 0L).toString(), (psid?.value ?: 0L).toString(), bauditsuccess, bauditfailure) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addConditionalAce(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, acetype: UByte, accessmask: UInt, psid: Psid, conditionstr: Pcwstr, returnlength: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_addConditionalAce((pacl?.value ?: 0L).toString(), dwacerevision.toInt(), aceflags.toInt(), acetype.toInt(), accessmask.toInt(), (psid?.value ?: 0L).toString(), (conditionstr?.value ?: 0L).toString(), (returnlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addMandatoryAce(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, mandatorypolicy: UInt, plabelsid: Psid): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_addMandatoryAce((pacl?.value ?: 0L).toString(), dwacerevision.toInt(), aceflags.toInt(), mandatorypolicy.toInt(), (plabelsid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addResourceAttributeAce(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid, pattributeinfo: COpaquePointer?, preturnlength: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_addResourceAttributeAce((pacl?.value ?: 0L).toString(), dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), (psid?.value ?: 0L).toString(), (pattributeinfo?.value ?: 0L).toString(), (preturnlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addScopedPolicyIDAce(pacl: COpaquePointer?, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_addScopedPolicyIDAce((pacl?.value ?: 0L).toString(), dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), (psid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun adjustTokenGroups(tokenhandle: Handle, resettodefault: Bool, newstate: COpaquePointer?, bufferlength: UInt, previousstate: COpaquePointer?, returnlength: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_adjustTokenGroups((tokenhandle?.value ?: 0L).toString(), resettodefault, (newstate?.value ?: 0L).toString(), bufferlength.toInt(), (previousstate?.value ?: 0L).toString(), (returnlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun adjustTokenPrivileges(tokenhandle: Handle, disableallprivileges: Bool, newstate: COpaquePointer?, bufferlength: UInt, previousstate: COpaquePointer?, returnlength: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_adjustTokenPrivileges((tokenhandle?.value ?: 0L).toString(), disableallprivileges, (newstate?.value ?: 0L).toString(), bufferlength.toInt(), (previousstate?.value ?: 0L).toString(), (returnlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allocateAndInitializeSid(pidentifierauthority: COpaquePointer?, nsubauthoritycount: UByte, nsubauthority0: UInt, nsubauthority1: UInt, nsubauthority2: UInt, nsubauthority3: UInt, nsubauthority4: UInt, nsubauthority5: UInt, nsubauthority6: UInt, nsubauthority7: UInt, psid: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_allocateAndInitializeSid((pidentifierauthority?.value ?: 0L).toString(), nsubauthoritycount.toInt(), nsubauthority0.toInt(), nsubauthority1.toInt(), nsubauthority2.toInt(), nsubauthority3.toInt(), nsubauthority4.toInt(), nsubauthority5.toInt(), nsubauthority6.toInt(), nsubauthority7.toInt(), (psid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allocateLocallyUniqueId(luid: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_allocateLocallyUniqueId((luid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun areAllAccessesGranted(grantedaccess: UInt, desiredaccess: UInt): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_areAllAccessesGranted(grantedaccess.toInt(), desiredaccess.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun areAnyAccessesGranted(grantedaccess: UInt, desiredaccess: UInt): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_areAnyAccessesGranted(grantedaccess.toInt(), desiredaccess.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkTokenCapability(tokenhandle: Handle, capabilitysidtocheck: Psid, hascapability: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_checkTokenCapability((tokenhandle?.value ?: 0L).toString(), (capabilitysidtocheck?.value ?: 0L).toString(), (hascapability?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkTokenMembership(tokenhandle: Handle, sidtocheck: Psid, ismember: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_checkTokenMembership((tokenhandle?.value ?: 0L).toString(), (sidtocheck?.value ?: 0L).toString(), (ismember?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkTokenMembershipEx(tokenhandle: Handle, sidtocheck: Psid, flags: UInt, ismember: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_checkTokenMembershipEx((tokenhandle?.value ?: 0L).toString(), (sidtocheck?.value ?: 0L).toString(), flags.toInt(), (ismember?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertToAutoInheritPrivateObjectSecurity(parentdescriptor: PsecurityDescriptor, currentsecuritydescriptor: PsecurityDescriptor, newsecuritydescriptor: COpaquePointer?, objecttype: COpaquePointer?, isdirectoryobject: Boolean, genericmapping: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_convertToAutoInheritPrivateObjectSecurity((parentdescriptor?.value ?: 0L).toString(), (currentsecuritydescriptor?.value ?: 0L).toString(), (newsecuritydescriptor?.value ?: 0L).toString(), (objecttype?.value ?: 0L).toString(), isdirectoryobject, (genericmapping?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copySid(ndestinationsidlength: UInt, pdestinationsid: Psid, psourcesid: Psid): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_copySid(ndestinationsidlength.toInt(), (pdestinationsid?.value ?: 0L).toString(), (psourcesid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPrivateObjectSecurity(parentdescriptor: PsecurityDescriptor, creatordescriptor: PsecurityDescriptor, newdescriptor: COpaquePointer?, isdirectoryobject: Bool, token: Handle, genericmapping: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_createPrivateObjectSecurity((parentdescriptor?.value ?: 0L).toString(), (creatordescriptor?.value ?: 0L).toString(), (newdescriptor?.value ?: 0L).toString(), isdirectoryobject, (token?.value ?: 0L).toString(), (genericmapping?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPrivateObjectSecurityEx(parentdescriptor: PsecurityDescriptor, creatordescriptor: PsecurityDescriptor, newdescriptor: COpaquePointer?, objecttype: COpaquePointer?, iscontainerobject: Bool, autoinheritflags: SecurityAutoInheritFlags, token: Handle, genericmapping: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_createPrivateObjectSecurityEx((parentdescriptor?.value ?: 0L).toString(), (creatordescriptor?.value ?: 0L).toString(), (newdescriptor?.value ?: 0L).toString(), (objecttype?.value ?: 0L).toString(), iscontainerobject, autoinheritflags.toInt(), (token?.value ?: 0L).toString(), (genericmapping?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPrivateObjectSecurityWithMultipleInheritance(parentdescriptor: PsecurityDescriptor, creatordescriptor: PsecurityDescriptor, newdescriptor: COpaquePointer?, objecttypes: COpaquePointer?, guidcount: UInt, iscontainerobject: Bool, autoinheritflags: SecurityAutoInheritFlags, token: Handle, genericmapping: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_createPrivateObjectSecurityWithMultipleInheritance((parentdescriptor?.value ?: 0L).toString(), (creatordescriptor?.value ?: 0L).toString(), (newdescriptor?.value ?: 0L).toString(), (objecttypes?.value ?: 0L).toString(), guidcount.toInt(), iscontainerobject, autoinheritflags.toInt(), (token?.value ?: 0L).toString(), (genericmapping?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createRestrictedToken(existingtokenhandle: Handle, flags: CreateRestrictedTokenFlags, disablesidcount: UInt, sidstodisable: COpaquePointer?, deleteprivilegecount: UInt, privilegestodelete: COpaquePointer?, restrictedsidcount: UInt, sidstorestrict: COpaquePointer?, newtokenhandle: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_createRestrictedToken((existingtokenhandle?.value ?: 0L).toString(), flags.toInt(), disablesidcount.toInt(), (sidstodisable?.value ?: 0L).toString(), deleteprivilegecount.toInt(), (privilegestodelete?.value ?: 0L).toString(), restrictedsidcount.toInt(), (sidstorestrict?.value ?: 0L).toString(), (newtokenhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createWellKnownSid(wellknownsidtype: WellKnownSidType, domainsid: Psid, psid: Psid, cbsid: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_createWellKnownSid(wellknownsidtype, (domainsid?.value ?: 0L).toString(), (psid?.value ?: 0L).toString(), (cbsid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteAce(pacl: COpaquePointer?, dwaceindex: UInt): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_deleteAce((pacl?.value ?: 0L).toString(), dwaceindex.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deriveCapabilitySidsFromName(capname: Pcwstr, capabilitygroupsids: COpaquePointer?, capabilitygroupsidcount: COpaquePointer?, capabilitysids: COpaquePointer?, capabilitysidcount: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_deriveCapabilitySidsFromName((capname?.value ?: 0L).toString(), (capabilitygroupsids?.value ?: 0L).toString(), (capabilitygroupsidcount?.value ?: 0L).toString(), (capabilitysids?.value ?: 0L).toString(), (capabilitysidcount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyPrivateObjectSecurity(objectdescriptor: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_destroyPrivateObjectSecurity((objectdescriptor?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplicateToken(existingtokenhandle: Handle, impersonationlevel: SecurityImpersonationLevel, duplicatetokenhandle: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_duplicateToken((existingtokenhandle?.value ?: 0L).toString(), impersonationlevel, (duplicatetokenhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplicateTokenEx(hexistingtoken: Handle, dwdesiredaccess: TokenAccessMask, lptokenattributes: COpaquePointer?, impersonationlevel: SecurityImpersonationLevel, tokentype: TokenType, phnewtoken: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_duplicateTokenEx((hexistingtoken?.value ?: 0L).toString(), dwdesiredaccess.toInt(), (lptokenattributes?.value ?: 0L).toString(), impersonationlevel, tokentype, (phnewtoken?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun equalDomainSid(psid1: Psid, psid2: Psid, pfequal: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_equalDomainSid((psid1?.value ?: 0L).toString(), (psid2?.value ?: 0L).toString(), (pfequal?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun equalPrefixSid(psid1: Psid, psid2: Psid): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_equalPrefixSid((psid1?.value ?: 0L).toString(), (psid2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun equalSid(psid1: Psid, psid2: Psid): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_equalSid((psid1?.value ?: 0L).toString(), (psid2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstFreeAce(pacl: COpaquePointer?, pace: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_findFirstFreeAce((pacl?.value ?: 0L).toString(), (pace?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeSid(psid: Psid): COpaquePointer? =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_freeSid((psid?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAce(pacl: COpaquePointer?, dwaceindex: UInt, pace: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_getAce((pacl?.value ?: 0L).toString(), dwaceindex.toInt(), (pace?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAclInformation(pacl: COpaquePointer?, paclinformation: COpaquePointer?, naclinformationlength: UInt, dwaclinformationclass: AclInformationClass): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_getAclInformation((pacl?.value ?: 0L).toString(), (paclinformation?.value ?: 0L).toString(), naclinformationlength.toInt(), dwaclinformationclass) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAppContainerAce(acl: COpaquePointer?, startingaceindex: UInt, appcontainerace: COpaquePointer?, appcontaineraceindex: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_getAppContainerAce((acl?.value ?: 0L).toString(), startingaceindex.toInt(), (appcontainerace?.value ?: 0L).toString(), (appcontaineraceindex?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCachedSigningLevel(file: Handle, flags: COpaquePointer?, signinglevel: COpaquePointer?, thumbprint: COpaquePointer?, thumbprintsize: COpaquePointer?, thumbprintalgorithm: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_getCachedSigningLevel((file?.value ?: 0L).toString(), (flags?.value ?: 0L).toString(), (signinglevel?.value ?: 0L).toString(), (thumbprint?.value ?: 0L).toString(), (thumbprintsize?.value ?: 0L).toString(), (thumbprintalgorithm?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileSecurityA(lpfilename: Pcstr, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_getFileSecurityA((lpfilename?.value ?: 0L).toString(), requestedinformation.toInt(), (psecuritydescriptor?.value ?: 0L).toString(), nlength.toInt(), (lpnlengthneeded?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileSecurityW(lpfilename: Pcwstr, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_getFileSecurityW((lpfilename?.value ?: 0L).toString(), requestedinformation.toInt(), (psecuritydescriptor?.value ?: 0L).toString(), nlength.toInt(), (lpnlengthneeded?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKernelObjectSecurity(handle: Handle, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_getKernelObjectSecurity((handle?.value ?: 0L).toString(), requestedinformation.toInt(), (psecuritydescriptor?.value ?: 0L).toString(), nlength.toInt(), (lpnlengthneeded?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLengthSid(psid: Psid): UInt =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_getLengthSid((psid?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrivateObjectSecurity(objectdescriptor: PsecurityDescriptor, securityinformation: ObjectSecurityInformation, resultantdescriptor: PsecurityDescriptor, descriptorlength: UInt, returnlength: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_getPrivateObjectSecurity((objectdescriptor?.value ?: 0L).toString(), securityinformation.toInt(), (resultantdescriptor?.value ?: 0L).toString(), descriptorlength.toInt(), (returnlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSecurityDescriptorControl(psecuritydescriptor: PsecurityDescriptor, pcontrol: COpaquePointer?, lpdwrevision: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_getSecurityDescriptorControl((psecuritydescriptor?.value ?: 0L).toString(), (pcontrol?.value ?: 0L).toString(), (lpdwrevision?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSecurityDescriptorDacl(psecuritydescriptor: PsecurityDescriptor, lpbdaclpresent: COpaquePointer?, pdacl: COpaquePointer?, lpbdacldefaulted: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_getSecurityDescriptorDacl((psecuritydescriptor?.value ?: 0L).toString(), (lpbdaclpresent?.value ?: 0L).toString(), (pdacl?.value ?: 0L).toString(), (lpbdacldefaulted?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSecurityDescriptorGroup(psecuritydescriptor: PsecurityDescriptor, pgroup: COpaquePointer?, lpbgroupdefaulted: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_getSecurityDescriptorGroup((psecuritydescriptor?.value ?: 0L).toString(), (pgroup?.value ?: 0L).toString(), (lpbgroupdefaulted?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSecurityDescriptorLength(psecuritydescriptor: PsecurityDescriptor): UInt =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_getSecurityDescriptorLength((psecuritydescriptor?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSecurityDescriptorOwner(psecuritydescriptor: PsecurityDescriptor, powner: COpaquePointer?, lpbownerdefaulted: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_getSecurityDescriptorOwner((psecuritydescriptor?.value ?: 0L).toString(), (powner?.value ?: 0L).toString(), (lpbownerdefaulted?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSecurityDescriptorRMControl(securitydescriptor: PsecurityDescriptor, rmcontrol: COpaquePointer?): UInt =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_getSecurityDescriptorRMControl((securitydescriptor?.value ?: 0L).toString(), (rmcontrol?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSecurityDescriptorSacl(psecuritydescriptor: PsecurityDescriptor, lpbsaclpresent: COpaquePointer?, psacl: COpaquePointer?, lpbsacldefaulted: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_getSecurityDescriptorSacl((psecuritydescriptor?.value ?: 0L).toString(), (lpbsaclpresent?.value ?: 0L).toString(), (psacl?.value ?: 0L).toString(), (lpbsacldefaulted?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSidIdentifierAuthority(psid: Psid): COpaquePointer? =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_getSidIdentifierAuthority((psid?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSidLengthRequired(nsubauthoritycount: UByte): UInt =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_getSidLengthRequired(nsubauthoritycount.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSidSubAuthority(psid: Psid, nsubauthority: UInt): COpaquePointer? =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_getSidSubAuthority((psid?.value ?: 0L).toString(), nsubauthority.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSidSubAuthorityCount(psid: Psid): COpaquePointer? =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_getSidSubAuthorityCount((psid?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTokenInformation(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: COpaquePointer?, tokeninformationlength: UInt, returnlength: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_getTokenInformation((tokenhandle?.value ?: 0L).toString(), tokeninformationclass, (tokeninformation?.value ?: 0L).toString(), tokeninformationlength.toInt(), (returnlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserObjectSecurity(hobj: Handle, psirequested: COpaquePointer?, psid: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_getUserObjectSecurity((hobj?.value ?: 0L).toString(), (psirequested?.value ?: 0L).toString(), (psid?.value ?: 0L).toString(), nlength.toInt(), (lpnlengthneeded?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowsAccountDomainSid(psid: Psid, pdomainsid: Psid, cbdomainsid: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_getWindowsAccountDomainSid((psid?.value ?: 0L).toString(), (pdomainsid?.value ?: 0L).toString(), (cbdomainsid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun impersonateAnonymousToken(threadhandle: Handle): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_impersonateAnonymousToken((threadhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun impersonateLoggedOnUser(htoken: Handle): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_impersonateLoggedOnUser((htoken?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun impersonateSelf(impersonationlevel: SecurityImpersonationLevel): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_impersonateSelf(impersonationlevel) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeAcl(pacl: COpaquePointer?, nacllength: UInt, dwaclrevision: AceRevision): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_initializeAcl((pacl?.value ?: 0L).toString(), nacllength.toInt(), dwaclrevision.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeSecurityDescriptor(psecuritydescriptor: PsecurityDescriptor, dwrevision: UInt): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_initializeSecurityDescriptor((psecuritydescriptor?.value ?: 0L).toString(), dwrevision.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeSid(sid: Psid, pidentifierauthority: COpaquePointer?, nsubauthoritycount: UByte): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_initializeSid((sid?.value ?: 0L).toString(), (pidentifierauthority?.value ?: 0L).toString(), nsubauthoritycount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isTokenRestricted(tokenhandle: Handle): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_isTokenRestricted((tokenhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isValidAcl(pacl: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_isValidAcl((pacl?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isValidSecurityDescriptor(psecuritydescriptor: PsecurityDescriptor): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_isValidSecurityDescriptor((psecuritydescriptor?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isValidSid(psid: Psid): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_isValidSid((psid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isWellKnownSid(psid: Psid, wellknownsidtype: WellKnownSidType): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_isWellKnownSid((psid?.value ?: 0L).toString(), wellknownsidtype) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun logonUserA(lpszusername: Pcstr, lpszdomain: Pcstr, lpszpassword: Pcstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_logonUserA((lpszusername?.value ?: 0L).toString(), (lpszdomain?.value ?: 0L).toString(), (lpszpassword?.value ?: 0L).toString(), dwlogontype.toInt(), dwlogonprovider.toInt(), (phtoken?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun logonUserExA(lpszusername: Pcstr, lpszdomain: Pcstr, lpszpassword: Pcstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: COpaquePointer?, pplogonsid: COpaquePointer?, ppprofilebuffer: COpaquePointer?, pdwprofilelength: COpaquePointer?, pquotalimits: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_logonUserExA((lpszusername?.value ?: 0L).toString(), (lpszdomain?.value ?: 0L).toString(), (lpszpassword?.value ?: 0L).toString(), dwlogontype.toInt(), dwlogonprovider.toInt(), (phtoken?.value ?: 0L).toString(), (pplogonsid?.value ?: 0L).toString(), (ppprofilebuffer?.value ?: 0L).toString(), (pdwprofilelength?.value ?: 0L).toString(), (pquotalimits?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun logonUserExW(lpszusername: Pcwstr, lpszdomain: Pcwstr, lpszpassword: Pcwstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: COpaquePointer?, pplogonsid: COpaquePointer?, ppprofilebuffer: COpaquePointer?, pdwprofilelength: COpaquePointer?, pquotalimits: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_logonUserExW((lpszusername?.value ?: 0L).toString(), (lpszdomain?.value ?: 0L).toString(), (lpszpassword?.value ?: 0L).toString(), dwlogontype.toInt(), dwlogonprovider.toInt(), (phtoken?.value ?: 0L).toString(), (pplogonsid?.value ?: 0L).toString(), (ppprofilebuffer?.value ?: 0L).toString(), (pdwprofilelength?.value ?: 0L).toString(), (pquotalimits?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun logonUserW(lpszusername: Pcwstr, lpszdomain: Pcwstr, lpszpassword: Pcwstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_logonUserW((lpszusername?.value ?: 0L).toString(), (lpszdomain?.value ?: 0L).toString(), (lpszpassword?.value ?: 0L).toString(), dwlogontype.toInt(), dwlogonprovider.toInt(), (phtoken?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupAccountNameA(lpsystemname: Pcstr, lpaccountname: Pcstr, sid: Psid, cbsid: COpaquePointer?, referenceddomainname: Pstr, cchreferenceddomainname: COpaquePointer?, peuse: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_lookupAccountNameA((lpsystemname?.value ?: 0L).toString(), (lpaccountname?.value ?: 0L).toString(), (sid?.value ?: 0L).toString(), (cbsid?.value ?: 0L).toString(), (referenceddomainname?.value ?: 0L).toString(), (cchreferenceddomainname?.value ?: 0L).toString(), (peuse?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupAccountNameW(lpsystemname: Pcwstr, lpaccountname: Pcwstr, sid: Psid, cbsid: COpaquePointer?, referenceddomainname: Pwstr, cchreferenceddomainname: COpaquePointer?, peuse: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_lookupAccountNameW((lpsystemname?.value ?: 0L).toString(), (lpaccountname?.value ?: 0L).toString(), (sid?.value ?: 0L).toString(), (cbsid?.value ?: 0L).toString(), (referenceddomainname?.value ?: 0L).toString(), (cchreferenceddomainname?.value ?: 0L).toString(), (peuse?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupAccountSidA(lpsystemname: Pcstr, sid: Psid, name: Pstr, cchname: COpaquePointer?, referenceddomainname: Pstr, cchreferenceddomainname: COpaquePointer?, peuse: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_lookupAccountSidA((lpsystemname?.value ?: 0L).toString(), (sid?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (cchname?.value ?: 0L).toString(), (referenceddomainname?.value ?: 0L).toString(), (cchreferenceddomainname?.value ?: 0L).toString(), (peuse?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupAccountSidW(lpsystemname: Pcwstr, sid: Psid, name: Pwstr, cchname: COpaquePointer?, referenceddomainname: Pwstr, cchreferenceddomainname: COpaquePointer?, peuse: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_lookupAccountSidW((lpsystemname?.value ?: 0L).toString(), (sid?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (cchname?.value ?: 0L).toString(), (referenceddomainname?.value ?: 0L).toString(), (cchreferenceddomainname?.value ?: 0L).toString(), (peuse?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupPrivilegeDisplayNameA(lpsystemname: Pcstr, lpname: Pcstr, lpdisplayname: Pstr, cchdisplayname: COpaquePointer?, lplanguageid: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_lookupPrivilegeDisplayNameA((lpsystemname?.value ?: 0L).toString(), (lpname?.value ?: 0L).toString(), (lpdisplayname?.value ?: 0L).toString(), (cchdisplayname?.value ?: 0L).toString(), (lplanguageid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupPrivilegeDisplayNameW(lpsystemname: Pcwstr, lpname: Pcwstr, lpdisplayname: Pwstr, cchdisplayname: COpaquePointer?, lplanguageid: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_lookupPrivilegeDisplayNameW((lpsystemname?.value ?: 0L).toString(), (lpname?.value ?: 0L).toString(), (lpdisplayname?.value ?: 0L).toString(), (cchdisplayname?.value ?: 0L).toString(), (lplanguageid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupPrivilegeNameA(lpsystemname: Pcstr, lpluid: COpaquePointer?, lpname: Pstr, cchname: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_lookupPrivilegeNameA((lpsystemname?.value ?: 0L).toString(), (lpluid?.value ?: 0L).toString(), (lpname?.value ?: 0L).toString(), (cchname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupPrivilegeNameW(lpsystemname: Pcwstr, lpluid: COpaquePointer?, lpname: Pwstr, cchname: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_lookupPrivilegeNameW((lpsystemname?.value ?: 0L).toString(), (lpluid?.value ?: 0L).toString(), (lpname?.value ?: 0L).toString(), (cchname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupPrivilegeValueA(lpsystemname: Pcstr, lpname: Pcstr, lpluid: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_lookupPrivilegeValueA((lpsystemname?.value ?: 0L).toString(), (lpname?.value ?: 0L).toString(), (lpluid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupPrivilegeValueW(lpsystemname: Pcwstr, lpname: Pcwstr, lpluid: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_lookupPrivilegeValueW((lpsystemname?.value ?: 0L).toString(), (lpname?.value ?: 0L).toString(), (lpluid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun makeAbsoluteSD(pselfrelativesecuritydescriptor: PsecurityDescriptor, pabsolutesecuritydescriptor: PsecurityDescriptor, lpdwabsolutesecuritydescriptorsize: COpaquePointer?, pdacl: COpaquePointer?, lpdwdaclsize: COpaquePointer?, psacl: COpaquePointer?, lpdwsaclsize: COpaquePointer?, powner: Psid, lpdwownersize: COpaquePointer?, pprimarygroup: Psid, lpdwprimarygroupsize: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_makeAbsoluteSD((pselfrelativesecuritydescriptor?.value ?: 0L).toString(), (pabsolutesecuritydescriptor?.value ?: 0L).toString(), (lpdwabsolutesecuritydescriptorsize?.value ?: 0L).toString(), (pdacl?.value ?: 0L).toString(), (lpdwdaclsize?.value ?: 0L).toString(), (psacl?.value ?: 0L).toString(), (lpdwsaclsize?.value ?: 0L).toString(), (powner?.value ?: 0L).toString(), (lpdwownersize?.value ?: 0L).toString(), (pprimarygroup?.value ?: 0L).toString(), (lpdwprimarygroupsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun makeSelfRelativeSD(pabsolutesecuritydescriptor: PsecurityDescriptor, pselfrelativesecuritydescriptor: PsecurityDescriptor, lpdwbufferlength: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_makeSelfRelativeSD((pabsolutesecuritydescriptor?.value ?: 0L).toString(), (pselfrelativesecuritydescriptor?.value ?: 0L).toString(), (lpdwbufferlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapGenericMask(accessmask: COpaquePointer?, genericmapping: COpaquePointer?) {
    if (_windowsWin32SecurityNapiAddon != null) {
        _windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_mapGenericMask((accessmask?.value ?: 0L).toString(), (genericmapping?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun objectCloseAuditAlarmA(subsystemname: Pcstr, handleid: COpaquePointer?, generateonclose: Bool): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_objectCloseAuditAlarmA((subsystemname?.value ?: 0L).toString(), (handleid?.value ?: 0L).toString(), generateonclose) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun objectCloseAuditAlarmW(subsystemname: Pcwstr, handleid: COpaquePointer?, generateonclose: Bool): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_objectCloseAuditAlarmW((subsystemname?.value ?: 0L).toString(), (handleid?.value ?: 0L).toString(), generateonclose) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun objectDeleteAuditAlarmA(subsystemname: Pcstr, handleid: COpaquePointer?, generateonclose: Bool): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_objectDeleteAuditAlarmA((subsystemname?.value ?: 0L).toString(), (handleid?.value ?: 0L).toString(), generateonclose) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun objectDeleteAuditAlarmW(subsystemname: Pcwstr, handleid: COpaquePointer?, generateonclose: Bool): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_objectDeleteAuditAlarmW((subsystemname?.value ?: 0L).toString(), (handleid?.value ?: 0L).toString(), generateonclose) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun objectOpenAuditAlarmA(subsystemname: Pcstr, handleid: COpaquePointer?, objecttypename: Pcstr, objectname: Pcstr, psecuritydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: COpaquePointer?, objectcreation: Bool, accessgranted: Bool, generateonclose: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_objectOpenAuditAlarmA((subsystemname?.value ?: 0L).toString(), (handleid?.value ?: 0L).toString(), (objecttypename?.value ?: 0L).toString(), (objectname?.value ?: 0L).toString(), (psecuritydescriptor?.value ?: 0L).toString(), (clienttoken?.value ?: 0L).toString(), desiredaccess.toInt(), grantedaccess.toInt(), (privileges?.value ?: 0L).toString(), objectcreation, accessgranted, (generateonclose?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun objectOpenAuditAlarmW(subsystemname: Pcwstr, handleid: COpaquePointer?, objecttypename: Pcwstr, objectname: Pcwstr, psecuritydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: COpaquePointer?, objectcreation: Bool, accessgranted: Bool, generateonclose: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_objectOpenAuditAlarmW((subsystemname?.value ?: 0L).toString(), (handleid?.value ?: 0L).toString(), (objecttypename?.value ?: 0L).toString(), (objectname?.value ?: 0L).toString(), (psecuritydescriptor?.value ?: 0L).toString(), (clienttoken?.value ?: 0L).toString(), desiredaccess.toInt(), grantedaccess.toInt(), (privileges?.value ?: 0L).toString(), objectcreation, accessgranted, (generateonclose?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun objectPrivilegeAuditAlarmA(subsystemname: Pcstr, handleid: COpaquePointer?, clienttoken: Handle, desiredaccess: UInt, privileges: COpaquePointer?, accessgranted: Bool): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_objectPrivilegeAuditAlarmA((subsystemname?.value ?: 0L).toString(), (handleid?.value ?: 0L).toString(), (clienttoken?.value ?: 0L).toString(), desiredaccess.toInt(), (privileges?.value ?: 0L).toString(), accessgranted) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun objectPrivilegeAuditAlarmW(subsystemname: Pcwstr, handleid: COpaquePointer?, clienttoken: Handle, desiredaccess: UInt, privileges: COpaquePointer?, accessgranted: Bool): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_objectPrivilegeAuditAlarmW((subsystemname?.value ?: 0L).toString(), (handleid?.value ?: 0L).toString(), (clienttoken?.value ?: 0L).toString(), desiredaccess.toInt(), (privileges?.value ?: 0L).toString(), accessgranted) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun privilegeCheck(clienttoken: Handle, requiredprivileges: COpaquePointer?, pfresult: COpaquePointer?): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_privilegeCheck((clienttoken?.value ?: 0L).toString(), (requiredprivileges?.value ?: 0L).toString(), (pfresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun privilegedServiceAuditAlarmA(subsystemname: Pcstr, servicename: Pcstr, clienttoken: Handle, privileges: COpaquePointer?, accessgranted: Bool): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_privilegedServiceAuditAlarmA((subsystemname?.value ?: 0L).toString(), (servicename?.value ?: 0L).toString(), (clienttoken?.value ?: 0L).toString(), (privileges?.value ?: 0L).toString(), accessgranted) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun privilegedServiceAuditAlarmW(subsystemname: Pcwstr, servicename: Pcwstr, clienttoken: Handle, privileges: COpaquePointer?, accessgranted: Bool): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_privilegedServiceAuditAlarmW((subsystemname?.value ?: 0L).toString(), (servicename?.value ?: 0L).toString(), (clienttoken?.value ?: 0L).toString(), (privileges?.value ?: 0L).toString(), accessgranted) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun querySecurityAccessMask(securityinformation: ObjectSecurityInformation, desiredaccess: COpaquePointer?) {
    if (_windowsWin32SecurityNapiAddon != null) {
        _windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_querySecurityAccessMask(securityinformation.toInt(), (desiredaccess?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun revertToSelf(): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_revertToSelf() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlConvertSidToUnicodeString(unicodestring: COpaquePointer?, sid: Psid, allocatedestinationstring: Boolean): Ntstatus =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_rtlConvertSidToUnicodeString((unicodestring?.value ?: 0L).toString(), (sid?.value ?: 0L).toString(), allocatedestinationstring) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlNormalizeSecurityDescriptor(securitydescriptor: COpaquePointer?, securitydescriptorlength: UInt, newsecuritydescriptor: COpaquePointer?, newsecuritydescriptorlength: COpaquePointer?, checkonly: Boolean): Boolean =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_rtlNormalizeSecurityDescriptor((securitydescriptor?.value ?: 0L).toString(), securitydescriptorlength.toInt(), (newsecuritydescriptor?.value ?: 0L).toString(), (newsecuritydescriptorlength?.value ?: 0L).toString(), checkonly) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setAclInformation(pacl: COpaquePointer?, paclinformation: COpaquePointer?, naclinformationlength: UInt, dwaclinformationclass: AclInformationClass): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_setAclInformation((pacl?.value ?: 0L).toString(), (paclinformation?.value ?: 0L).toString(), naclinformationlength.toInt(), dwaclinformationclass) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCachedSigningLevel(sourcefiles: COpaquePointer?, sourcefilecount: UInt, flags: UInt, targetfile: Handle): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_setCachedSigningLevel((sourcefiles?.value ?: 0L).toString(), sourcefilecount.toInt(), flags.toInt(), (targetfile?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileSecurityA(lpfilename: Pcstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_setFileSecurityA((lpfilename?.value ?: 0L).toString(), securityinformation.toInt(), (psecuritydescriptor?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileSecurityW(lpfilename: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_setFileSecurityW((lpfilename?.value ?: 0L).toString(), securityinformation.toInt(), (psecuritydescriptor?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setKernelObjectSecurity(handle: Handle, securityinformation: ObjectSecurityInformation, securitydescriptor: PsecurityDescriptor): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_setKernelObjectSecurity((handle?.value ?: 0L).toString(), securityinformation.toInt(), (securitydescriptor?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPrivateObjectSecurity(securityinformation: ObjectSecurityInformation, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: COpaquePointer?, genericmapping: COpaquePointer?, token: Handle): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_setPrivateObjectSecurity(securityinformation.toInt(), (modificationdescriptor?.value ?: 0L).toString(), (objectssecuritydescriptor?.value ?: 0L).toString(), (genericmapping?.value ?: 0L).toString(), (token?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPrivateObjectSecurityEx(securityinformation: ObjectSecurityInformation, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: COpaquePointer?, autoinheritflags: SecurityAutoInheritFlags, genericmapping: COpaquePointer?, token: Handle): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_setPrivateObjectSecurityEx(securityinformation.toInt(), (modificationdescriptor?.value ?: 0L).toString(), (objectssecuritydescriptor?.value ?: 0L).toString(), autoinheritflags.toInt(), (genericmapping?.value ?: 0L).toString(), (token?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSecurityAccessMask(securityinformation: ObjectSecurityInformation, desiredaccess: COpaquePointer?) {
    if (_windowsWin32SecurityNapiAddon != null) {
        _windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_setSecurityAccessMask(securityinformation.toInt(), (desiredaccess?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setSecurityDescriptorControl(psecuritydescriptor: PsecurityDescriptor, controlbitsofinterest: SecurityDescriptorControl, controlbitstoset: SecurityDescriptorControl): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_setSecurityDescriptorControl((psecuritydescriptor?.value ?: 0L).toString(), controlbitsofinterest.toInt(), controlbitstoset.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSecurityDescriptorDacl(psecuritydescriptor: PsecurityDescriptor, bdaclpresent: Bool, pdacl: COpaquePointer?, bdacldefaulted: Bool): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_setSecurityDescriptorDacl((psecuritydescriptor?.value ?: 0L).toString(), bdaclpresent, (pdacl?.value ?: 0L).toString(), bdacldefaulted) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSecurityDescriptorGroup(psecuritydescriptor: PsecurityDescriptor, pgroup: Psid, bgroupdefaulted: Bool): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_setSecurityDescriptorGroup((psecuritydescriptor?.value ?: 0L).toString(), (pgroup?.value ?: 0L).toString(), bgroupdefaulted) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSecurityDescriptorOwner(psecuritydescriptor: PsecurityDescriptor, powner: Psid, bownerdefaulted: Bool): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_setSecurityDescriptorOwner((psecuritydescriptor?.value ?: 0L).toString(), (powner?.value ?: 0L).toString(), bownerdefaulted) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSecurityDescriptorRMControl(securitydescriptor: PsecurityDescriptor, rmcontrol: COpaquePointer?): UInt =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_setSecurityDescriptorRMControl((securitydescriptor?.value ?: 0L).toString(), (rmcontrol?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSecurityDescriptorSacl(psecuritydescriptor: PsecurityDescriptor, bsaclpresent: Bool, psacl: COpaquePointer?, bsacldefaulted: Bool): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_setSecurityDescriptorSacl((psecuritydescriptor?.value ?: 0L).toString(), bsaclpresent, (psacl?.value ?: 0L).toString(), bsacldefaulted) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTokenInformation(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: COpaquePointer?, tokeninformationlength: UInt): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_setTokenInformation((tokenhandle?.value ?: 0L).toString(), tokeninformationclass, (tokeninformation?.value ?: 0L).toString(), tokeninformationlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUserObjectSecurity(hobj: Handle, psirequested: COpaquePointer?, psid: PsecurityDescriptor): Bool =
    if (_windowsWin32SecurityNapiAddon != null) (_windowsWin32SecurityNapiAddon.windowssys_windows_win32_security_setUserObjectSecurity((hobj?.value ?: 0L).toString(), (psirequested?.value ?: 0L).toString(), (psid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
