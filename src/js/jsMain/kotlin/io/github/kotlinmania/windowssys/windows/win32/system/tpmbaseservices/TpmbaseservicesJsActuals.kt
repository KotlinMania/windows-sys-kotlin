@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PWSTR

private val _windowsWin32SystemTpmbaseservicesNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun GetDeviceID(pbwindowsaik: Long, cbwindowsaik: UInt, pcbresult: Long, pfprotectedbytpm: Long): HRESULT =
    if (_windowsWin32SystemTpmbaseservicesNapiAddon != null) (_windowsWin32SystemTpmbaseservicesNapiAddon.windowssys_windows_win32_system_tpmbaseservices_GetDeviceID(pbwindowsaik.toString(), cbwindowsaik.toInt(), pcbresult.toString(), pfprotectedbytpm.toString()) as Int) else 0

public actual fun GetDeviceIDString(pszwindowsaik: PWSTR, cchwindowsaik: UInt, pcchresult: Long, pfprotectedbytpm: Long): HRESULT =
    if (_windowsWin32SystemTpmbaseservicesNapiAddon != null) (_windowsWin32SystemTpmbaseservicesNapiAddon.windowssys_windows_win32_system_tpmbaseservices_GetDeviceIDString(pszwindowsaik.toString(), cchwindowsaik.toInt(), pcchresult.toString(), pfprotectedbytpm.toString()) as Int) else 0

public actual fun Tbsi_Context_Create(pcontextparams: Long, phcontext: Long): UInt =
    if (_windowsWin32SystemTpmbaseservicesNapiAddon != null) (_windowsWin32SystemTpmbaseservicesNapiAddon.windowssys_windows_win32_system_tpmbaseservices_Tbsi_Context_Create(pcontextparams.toString(), phcontext.toString()) as Int).toUInt() else 0u

public actual fun Tbsi_Create_Windows_Key(keyhandle: UInt): UInt =
    if (_windowsWin32SystemTpmbaseservicesNapiAddon != null) (_windowsWin32SystemTpmbaseservicesNapiAddon.windowssys_windows_win32_system_tpmbaseservices_Tbsi_Create_Windows_Key(keyhandle.toInt()) as Int).toUInt() else 0u

public actual fun Tbsi_GetDeviceInfo(size: UInt, info: Long): UInt =
    if (_windowsWin32SystemTpmbaseservicesNapiAddon != null) (_windowsWin32SystemTpmbaseservicesNapiAddon.windowssys_windows_win32_system_tpmbaseservices_Tbsi_GetDeviceInfo(size.toInt(), info.toString()) as Int).toUInt() else 0u

public actual fun Tbsi_Get_OwnerAuth(hcontext: Long, ownerauthtype: UInt, poutputbuf: Long, poutputbuflen: Long): UInt =
    if (_windowsWin32SystemTpmbaseservicesNapiAddon != null) (_windowsWin32SystemTpmbaseservicesNapiAddon.windowssys_windows_win32_system_tpmbaseservices_Tbsi_Get_OwnerAuth(hcontext.toString(), ownerauthtype.toInt(), poutputbuf.toString(), poutputbuflen.toString()) as Int).toUInt() else 0u

public actual fun Tbsi_Get_TCG_Log(hcontext: Long, poutputbuf: Long, poutputbuflen: Long): UInt =
    if (_windowsWin32SystemTpmbaseservicesNapiAddon != null) (_windowsWin32SystemTpmbaseservicesNapiAddon.windowssys_windows_win32_system_tpmbaseservices_Tbsi_Get_TCG_Log(hcontext.toString(), poutputbuf.toString(), poutputbuflen.toString()) as Int).toUInt() else 0u

public actual fun Tbsi_Get_TCG_Log_Ex(logtype: UInt, pboutput: Long, pcboutput: Long): UInt =
    if (_windowsWin32SystemTpmbaseservicesNapiAddon != null) (_windowsWin32SystemTpmbaseservicesNapiAddon.windowssys_windows_win32_system_tpmbaseservices_Tbsi_Get_TCG_Log_Ex(logtype.toInt(), pboutput.toString(), pcboutput.toString()) as Int).toUInt() else 0u

public actual fun Tbsi_Is_Tpm_Present(): BOOL =
    if (_windowsWin32SystemTpmbaseservicesNapiAddon != null) (_windowsWin32SystemTpmbaseservicesNapiAddon.windowssys_windows_win32_system_tpmbaseservices_Tbsi_Is_Tpm_Present() as Int) else 0

public actual fun Tbsi_Physical_Presence_Command(hcontext: Long, pabinput: Long, cbinput: UInt, paboutput: Long, pcboutput: Long): UInt =
    if (_windowsWin32SystemTpmbaseservicesNapiAddon != null) (_windowsWin32SystemTpmbaseservicesNapiAddon.windowssys_windows_win32_system_tpmbaseservices_Tbsi_Physical_Presence_Command(hcontext.toString(), pabinput.toString(), cbinput.toInt(), paboutput.toString(), pcboutput.toString()) as Int).toUInt() else 0u

public actual fun Tbsi_Revoke_Attestation(): UInt =
    if (_windowsWin32SystemTpmbaseservicesNapiAddon != null) (_windowsWin32SystemTpmbaseservicesNapiAddon.windowssys_windows_win32_system_tpmbaseservices_Tbsi_Revoke_Attestation() as Int).toUInt() else 0u

public actual fun Tbsip_Cancel_Commands(hcontext: Long): UInt =
    if (_windowsWin32SystemTpmbaseservicesNapiAddon != null) (_windowsWin32SystemTpmbaseservicesNapiAddon.windowssys_windows_win32_system_tpmbaseservices_Tbsip_Cancel_Commands(hcontext.toString()) as Int).toUInt() else 0u

public actual fun Tbsip_Context_Close(hcontext: Long): UInt =
    if (_windowsWin32SystemTpmbaseservicesNapiAddon != null) (_windowsWin32SystemTpmbaseservicesNapiAddon.windowssys_windows_win32_system_tpmbaseservices_Tbsip_Context_Close(hcontext.toString()) as Int).toUInt() else 0u

public actual fun Tbsip_Submit_Command(hcontext: Long, locality: TBS_COMMAND_LOCALITY, priority: TBS_COMMAND_PRIORITY, pabcommand: Long, cbcommand: UInt, pabresult: Long, pcbresult: Long): UInt =
    if (_windowsWin32SystemTpmbaseservicesNapiAddon != null) (_windowsWin32SystemTpmbaseservicesNapiAddon.windowssys_windows_win32_system_tpmbaseservices_Tbsip_Submit_Command(hcontext.toString(), locality.toInt(), priority.toInt(), pabcommand.toString(), cbcommand.toInt(), pabresult.toString(), pcbresult.toString()) as Int).toUInt() else 0u
