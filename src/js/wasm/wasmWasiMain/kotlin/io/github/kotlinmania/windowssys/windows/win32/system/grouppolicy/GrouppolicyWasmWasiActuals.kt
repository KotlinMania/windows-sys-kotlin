@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.GenericMapping
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectTypeList
import io.github.kotlinmania.windowssys.windows.win32.security.PrivilegeSet
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.Appcategoryinfolist

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun browseForGPO(lpbrowseinfo: MutPtr<Gpobrowseinfo>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemGrouppolicyBrowseForGPO")

public actual fun commandLineFromMsiDescriptor(descriptor: Pcwstr, commandline: Pwstr, commandlinelength: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemGrouppolicyCommandLineFromMsiDescriptor")

public actual fun createGPOLink(lpgpo: Pcwstr, lpcontainer: Pcwstr, fhighpriority: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemGrouppolicyCreateGPOLink")

public actual fun deleteAllGPOLinks(lpcontainer: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemGrouppolicyDeleteAllGPOLinks")

public actual fun deleteGPOLink(lpgpo: Pcwstr, lpcontainer: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemGrouppolicyDeleteGPOLink")

public actual fun enterCriticalPolicySection(bmachine: Bool): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemGrouppolicyEnterCriticalPolicySection")

public actual fun exportRSoPData(lpnamespace: Pcwstr, lpfilename: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemGrouppolicyExportRSoPData")

public actual fun freeGPOListA(pgpolist: ConstPtr<GroupPolicyObjecta>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemGrouppolicyFreeGPOListA")

public actual fun freeGPOListW(pgpolist: ConstPtr<GroupPolicyObjectw>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemGrouppolicyFreeGPOListW")

public actual fun generateGPNotification(bmachine: Bool, lpwszmgmtproduct: Pcwstr, dwmgmtproductoptions: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemGrouppolicyGenerateGPNotification")

public actual fun getAppliedGPOListA(dwflags: UInt, pmachinename: Pcstr, psiduser: Psid, pguidextension: ConstPtr<Guid>, ppgpolist: MutPtr<MutPtr<GroupPolicyObjecta>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemGrouppolicyGetAppliedGPOListA")

public actual fun getAppliedGPOListW(dwflags: UInt, pmachinename: Pcwstr, psiduser: Psid, pguidextension: ConstPtr<Guid>, ppgpolist: MutPtr<MutPtr<GroupPolicyObjectw>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemGrouppolicyGetAppliedGPOListW")

public actual fun getGPOListA(htoken: Handle, lpname: Pcstr, lphostname: Pcstr, lpcomputername: Pcstr, dwflags: UInt, pgpolist: MutPtr<MutPtr<GroupPolicyObjecta>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemGrouppolicyGetGPOListA")

public actual fun getGPOListW(htoken: Handle, lpname: Pcwstr, lphostname: Pcwstr, lpcomputername: Pcwstr, dwflags: UInt, pgpolist: MutPtr<MutPtr<GroupPolicyObjectw>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemGrouppolicyGetGPOListW")

public actual fun getLocalManagedApplicationData(productcode: Pcwstr, displayname: MutPtr<Pwstr>, supporturl: MutPtr<Pwstr>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemGrouppolicyGetLocalManagedApplicationData")

public actual fun getLocalManagedApplications(buserapps: Bool, pdwapps: MutPtr<UInt>, prglocalapps: MutPtr<MutPtr<Localmanagedapplication>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemGrouppolicyGetLocalManagedApplications")

public actual fun getManagedApplicationCategories(dwreserved: UInt, pappcategory: MutPtr<Appcategoryinfolist>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemGrouppolicyGetManagedApplicationCategories")

public actual fun getManagedApplications(pcategory: ConstPtr<Guid>, dwqueryflags: UInt, dwinfolevel: UInt, pdwapps: MutPtr<UInt>, prgmanagedapps: MutPtr<MutPtr<Managedapplication>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemGrouppolicyGetManagedApplications")

public actual fun importRSoPData(lpnamespace: Pcwstr, lpfilename: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemGrouppolicyImportRSoPData")

public actual fun installApplication(pinstallinfo: ConstPtr<Installdata>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemGrouppolicyInstallApplication")

public actual fun leaveCriticalPolicySection(hsection: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemGrouppolicyLeaveCriticalPolicySection")

public actual fun processGroupPolicyCompleted(extensionid: ConstPtr<Guid>, pasynchandle: ULong, dwstatus: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemGrouppolicyProcessGroupPolicyCompleted")

public actual fun processGroupPolicyCompletedEx(extensionid: ConstPtr<Guid>, pasynchandle: ULong, dwstatus: UInt, rsopstatus: Hresult): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemGrouppolicyProcessGroupPolicyCompletedEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemGrouppolicyRefreshPolicy")
private external fun wasiWindowssysWindowsWin32SystemGrouppolicyRefreshPolicy(bmachine: Int): Int

public actual fun refreshPolicy(bmachine: Bool): Bool =
    wasiWindowssysWindowsWin32SystemGrouppolicyRefreshPolicy(bmachine)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemGrouppolicyRefreshPolicyEx")
private external fun wasiWindowssysWindowsWin32SystemGrouppolicyRefreshPolicyEx(bmachine: Int, dwoptions: Int): Int

public actual fun refreshPolicyEx(bmachine: Bool, dwoptions: UInt): Bool =
    wasiWindowssysWindowsWin32SystemGrouppolicyRefreshPolicyEx(bmachine, dwoptions.toInt())

public actual fun registerGPNotification(hevent: Handle, bmachine: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemGrouppolicyRegisterGPNotification")

public actual fun rsopAccessCheckByType(psecuritydescriptor: PsecurityDescriptor, pprincipalselfsid: Psid, prsoptoken: ConstPtr<CVoid>, dwdesiredaccessmask: UInt, pobjecttypelist: ConstPtr<ObjectTypeList>, objecttypelistlength: UInt, pgenericmapping: ConstPtr<GenericMapping>, pprivilegeset: ConstPtr<PrivilegeSet>, pdwprivilegesetlength: ConstPtr<UInt>, pdwgrantedaccessmask: MutPtr<UInt>, pbaccessstatus: MutPtr<Bool>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemGrouppolicyRsopAccessCheckByType")

public actual fun rsopFileAccessCheck(pszfilename: Pcwstr, prsoptoken: ConstPtr<CVoid>, dwdesiredaccessmask: UInt, pdwgrantedaccessmask: MutPtr<UInt>, pbaccessstatus: MutPtr<Bool>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemGrouppolicyRsopFileAccessCheck")

public actual fun rsopResetPolicySettingStatus(dwflags: UInt, pservices: MutPtr<CVoid>, psettinginstance: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemGrouppolicyRsopResetPolicySettingStatus")

public actual fun rsopSetPolicySettingStatus(dwflags: UInt, pservices: MutPtr<CVoid>, psettinginstance: MutPtr<CVoid>, ninfo: UInt, pstatus: ConstPtr<Policysettingstatusinfo>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemGrouppolicyRsopSetPolicySettingStatus")

public actual fun uninstallApplication(productcode: Pcwstr, dwstatus: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemGrouppolicyUninstallApplication")

public actual fun unregisterGPNotification(hevent: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemGrouppolicyUnregisterGPNotification")
