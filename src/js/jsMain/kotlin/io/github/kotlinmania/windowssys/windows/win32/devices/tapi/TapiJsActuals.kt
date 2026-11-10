@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.tapi

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam

private val _windowsWin32DevicesTapiNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun getTnefStreamCodepage(lpstream: COpaquePointer?, lpulcodepage: COpaquePointer?, lpulsubcodepage: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_getTnefStreamCodepage((lpstream?.value ?: 0L).toString(), (lpulcodepage?.value ?: 0L).toString(), (lpulsubcodepage?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTnefStream(lpvsupport: COpaquePointer?, lpstream: COpaquePointer?, lpszstreamname: COpaquePointer?, ulflags: UInt, lpmessage: COpaquePointer?, wkeyval: UShort, lpptnef: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_openTnefStream((lpvsupport?.value ?: 0L).toString(), (lpstream?.value ?: 0L).toString(), (lpszstreamname?.value ?: 0L).toString(), ulflags.toInt(), (lpmessage?.value ?: 0L).toString(), wkeyval.toInt(), (lpptnef?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTnefStreamEx(lpvsupport: COpaquePointer?, lpstream: COpaquePointer?, lpszstreamname: COpaquePointer?, ulflags: UInt, lpmessage: COpaquePointer?, wkeyval: UShort, lpadressbook: COpaquePointer?, lpptnef: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_openTnefStreamEx((lpvsupport?.value ?: 0L).toString(), (lpstream?.value ?: 0L).toString(), (lpszstreamname?.value ?: 0L).toString(), ulflags.toInt(), (lpmessage?.value ?: 0L).toString(), wkeyval.toInt(), (lpadressbook?.value ?: 0L).toString(), (lpptnef?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineAccept(hcall: UInt, lpsuseruserinfo: Pcstr, dwsize: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineAccept(hcall.toInt(), (lpsuseruserinfo?.value ?: 0L).toString(), dwsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineAddProvider(lpszproviderfilename: Pcstr, hwndowner: Hwnd, lpdwpermanentproviderid: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineAddProvider((lpszproviderfilename?.value ?: 0L).toString(), (hwndowner?.value ?: 0L).toString(), (lpdwpermanentproviderid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineAddProviderA(lpszproviderfilename: Pcstr, hwndowner: Hwnd, lpdwpermanentproviderid: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineAddProviderA((lpszproviderfilename?.value ?: 0L).toString(), (hwndowner?.value ?: 0L).toString(), (lpdwpermanentproviderid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineAddProviderW(lpszproviderfilename: Pcwstr, hwndowner: Hwnd, lpdwpermanentproviderid: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineAddProviderW((lpszproviderfilename?.value ?: 0L).toString(), (hwndowner?.value ?: 0L).toString(), (lpdwpermanentproviderid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineAddToConference(hconfcall: UInt, hconsultcall: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineAddToConference(hconfcall.toInt(), hconsultcall.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineAgentSpecific(hline: UInt, dwaddressid: UInt, dwagentextensionidindex: UInt, lpparams: COpaquePointer?, dwsize: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineAgentSpecific(hline.toInt(), dwaddressid.toInt(), dwagentextensionidindex.toInt(), (lpparams?.value ?: 0L).toString(), dwsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineAnswer(hcall: UInt, lpsuseruserinfo: Pcstr, dwsize: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineAnswer(hcall.toInt(), (lpsuseruserinfo?.value ?: 0L).toString(), dwsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineBlindTransfer(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineBlindTransfer(hcall.toInt(), (lpszdestaddress?.value ?: 0L).toString(), dwcountrycode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineBlindTransferA(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineBlindTransferA(hcall.toInt(), (lpszdestaddress?.value ?: 0L).toString(), dwcountrycode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineBlindTransferW(hcall: UInt, lpszdestaddressw: Pcwstr, dwcountrycode: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineBlindTransferW(hcall.toInt(), (lpszdestaddressw?.value ?: 0L).toString(), dwcountrycode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineClose(hline: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineClose(hline.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineCompleteCall(hcall: UInt, lpdwcompletionid: COpaquePointer?, dwcompletionmode: UInt, dwmessageid: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineCompleteCall(hcall.toInt(), (lpdwcompletionid?.value ?: 0L).toString(), dwcompletionmode.toInt(), dwmessageid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineCompleteTransfer(hcall: UInt, hconsultcall: UInt, lphconfcall: COpaquePointer?, dwtransfermode: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineCompleteTransfer(hcall.toInt(), hconsultcall.toInt(), (lphconfcall?.value ?: 0L).toString(), dwtransfermode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineConfigDialog(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineConfigDialog(dwdeviceid.toInt(), (hwndowner?.value ?: 0L).toString(), (lpszdeviceclass?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineConfigDialogA(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineConfigDialogA(dwdeviceid.toInt(), (hwndowner?.value ?: 0L).toString(), (lpszdeviceclass?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineConfigDialogEdit(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr, lpdeviceconfigin: COpaquePointer?, dwsize: UInt, lpdeviceconfigout: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineConfigDialogEdit(dwdeviceid.toInt(), (hwndowner?.value ?: 0L).toString(), (lpszdeviceclass?.value ?: 0L).toString(), (lpdeviceconfigin?.value ?: 0L).toString(), dwsize.toInt(), (lpdeviceconfigout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineConfigDialogEditA(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr, lpdeviceconfigin: COpaquePointer?, dwsize: UInt, lpdeviceconfigout: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineConfigDialogEditA(dwdeviceid.toInt(), (hwndowner?.value ?: 0L).toString(), (lpszdeviceclass?.value ?: 0L).toString(), (lpdeviceconfigin?.value ?: 0L).toString(), dwsize.toInt(), (lpdeviceconfigout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineConfigDialogEditW(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcwstr, lpdeviceconfigin: COpaquePointer?, dwsize: UInt, lpdeviceconfigout: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineConfigDialogEditW(dwdeviceid.toInt(), (hwndowner?.value ?: 0L).toString(), (lpszdeviceclass?.value ?: 0L).toString(), (lpdeviceconfigin?.value ?: 0L).toString(), dwsize.toInt(), (lpdeviceconfigout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineConfigDialogW(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcwstr): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineConfigDialogW(dwdeviceid.toInt(), (hwndowner?.value ?: 0L).toString(), (lpszdeviceclass?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineConfigProvider(hwndowner: Hwnd, dwpermanentproviderid: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineConfigProvider((hwndowner?.value ?: 0L).toString(), dwpermanentproviderid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineCreateAgentA(hline: UInt, lpszagentid: Pcstr, lpszagentpin: Pcstr, lphagent: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineCreateAgentA(hline.toInt(), (lpszagentid?.value ?: 0L).toString(), (lpszagentpin?.value ?: 0L).toString(), (lphagent?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineCreateAgentSessionA(hline: UInt, hagent: UInt, lpszagentpin: Pcstr, dwworkingaddressid: UInt, lpgroupid: COpaquePointer?, lphagentsession: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineCreateAgentSessionA(hline.toInt(), hagent.toInt(), (lpszagentpin?.value ?: 0L).toString(), dwworkingaddressid.toInt(), (lpgroupid?.value ?: 0L).toString(), (lphagentsession?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineCreateAgentSessionW(hline: UInt, hagent: UInt, lpszagentpin: Pcwstr, dwworkingaddressid: UInt, lpgroupid: COpaquePointer?, lphagentsession: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineCreateAgentSessionW(hline.toInt(), hagent.toInt(), (lpszagentpin?.value ?: 0L).toString(), dwworkingaddressid.toInt(), (lpgroupid?.value ?: 0L).toString(), (lphagentsession?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineCreateAgentW(hline: UInt, lpszagentid: Pcwstr, lpszagentpin: Pcwstr, lphagent: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineCreateAgentW(hline.toInt(), (lpszagentid?.value ?: 0L).toString(), (lpszagentpin?.value ?: 0L).toString(), (lphagent?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineDeallocateCall(hcall: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineDeallocateCall(hcall.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineDevSpecific(hline: UInt, dwaddressid: UInt, hcall: UInt, lpparams: COpaquePointer?, dwsize: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineDevSpecific(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), (lpparams?.value ?: 0L).toString(), dwsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineDevSpecificFeature(hline: UInt, dwfeature: UInt, lpparams: COpaquePointer?, dwsize: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineDevSpecificFeature(hline.toInt(), dwfeature.toInt(), (lpparams?.value ?: 0L).toString(), dwsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineDial(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineDial(hcall.toInt(), (lpszdestaddress?.value ?: 0L).toString(), dwcountrycode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineDialA(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineDialA(hcall.toInt(), (lpszdestaddress?.value ?: 0L).toString(), dwcountrycode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineDialW(hcall: UInt, lpszdestaddress: Pcwstr, dwcountrycode: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineDialW(hcall.toInt(), (lpszdestaddress?.value ?: 0L).toString(), dwcountrycode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineDrop(hcall: UInt, lpsuseruserinfo: Pcstr, dwsize: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineDrop(hcall.toInt(), (lpsuseruserinfo?.value ?: 0L).toString(), dwsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineForward(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: COpaquePointer?, dwnumringsnoanswer: UInt, lphconsultcall: COpaquePointer?, lpcallparams: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineForward(hline.toInt(), balladdresses.toInt(), dwaddressid.toInt(), (lpforwardlist?.value ?: 0L).toString(), dwnumringsnoanswer.toInt(), (lphconsultcall?.value ?: 0L).toString(), (lpcallparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineForwardA(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: COpaquePointer?, dwnumringsnoanswer: UInt, lphconsultcall: COpaquePointer?, lpcallparams: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineForwardA(hline.toInt(), balladdresses.toInt(), dwaddressid.toInt(), (lpforwardlist?.value ?: 0L).toString(), dwnumringsnoanswer.toInt(), (lphconsultcall?.value ?: 0L).toString(), (lpcallparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineForwardW(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: COpaquePointer?, dwnumringsnoanswer: UInt, lphconsultcall: COpaquePointer?, lpcallparams: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineForwardW(hline.toInt(), balladdresses.toInt(), dwaddressid.toInt(), (lpforwardlist?.value ?: 0L).toString(), dwnumringsnoanswer.toInt(), (lphconsultcall?.value ?: 0L).toString(), (lpcallparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGatherDigits(hcall: UInt, dwdigitmodes: UInt, lpsdigits: Pstr, dwnumdigits: UInt, lpszterminationdigits: Pcstr, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGatherDigits(hcall.toInt(), dwdigitmodes.toInt(), (lpsdigits?.value ?: 0L).toString(), dwnumdigits.toInt(), (lpszterminationdigits?.value ?: 0L).toString(), dwfirstdigittimeout.toInt(), dwinterdigittimeout.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGatherDigitsA(hcall: UInt, dwdigitmodes: UInt, lpsdigits: Pstr, dwnumdigits: UInt, lpszterminationdigits: Pcstr, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGatherDigitsA(hcall.toInt(), dwdigitmodes.toInt(), (lpsdigits?.value ?: 0L).toString(), dwnumdigits.toInt(), (lpszterminationdigits?.value ?: 0L).toString(), dwfirstdigittimeout.toInt(), dwinterdigittimeout.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGatherDigitsW(hcall: UInt, dwdigitmodes: UInt, lpsdigits: Pwstr, dwnumdigits: UInt, lpszterminationdigits: Pcwstr, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGatherDigitsW(hcall.toInt(), dwdigitmodes.toInt(), (lpsdigits?.value ?: 0L).toString(), dwnumdigits.toInt(), (lpszterminationdigits?.value ?: 0L).toString(), dwfirstdigittimeout.toInt(), dwinterdigittimeout.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGenerateDigits(hcall: UInt, dwdigitmode: UInt, lpszdigits: Pcstr, dwduration: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGenerateDigits(hcall.toInt(), dwdigitmode.toInt(), (lpszdigits?.value ?: 0L).toString(), dwduration.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGenerateDigitsA(hcall: UInt, dwdigitmode: UInt, lpszdigits: Pcstr, dwduration: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGenerateDigitsA(hcall.toInt(), dwdigitmode.toInt(), (lpszdigits?.value ?: 0L).toString(), dwduration.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGenerateDigitsW(hcall: UInt, dwdigitmode: UInt, lpszdigits: Pcwstr, dwduration: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGenerateDigitsW(hcall.toInt(), dwdigitmode.toInt(), (lpszdigits?.value ?: 0L).toString(), dwduration.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGenerateTone(hcall: UInt, dwtonemode: UInt, dwduration: UInt, dwnumtones: UInt, lptones: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGenerateTone(hcall.toInt(), dwtonemode.toInt(), dwduration.toInt(), dwnumtones.toInt(), (lptones?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAddressCaps(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAddressCaps(hlineapp.toInt(), dwdeviceid.toInt(), dwaddressid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), (lpaddresscaps?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAddressCapsA(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAddressCapsA(hlineapp.toInt(), dwdeviceid.toInt(), dwaddressid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), (lpaddresscaps?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAddressCapsW(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAddressCapsW(hlineapp.toInt(), dwdeviceid.toInt(), dwaddressid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), (lpaddresscaps?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAddressID(hline: UInt, lpdwaddressid: COpaquePointer?, dwaddressmode: UInt, lpsaddress: Pcstr, dwsize: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAddressID(hline.toInt(), (lpdwaddressid?.value ?: 0L).toString(), dwaddressmode.toInt(), (lpsaddress?.value ?: 0L).toString(), dwsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAddressIDA(hline: UInt, lpdwaddressid: COpaquePointer?, dwaddressmode: UInt, lpsaddress: Pcstr, dwsize: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAddressIDA(hline.toInt(), (lpdwaddressid?.value ?: 0L).toString(), dwaddressmode.toInt(), (lpsaddress?.value ?: 0L).toString(), dwsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAddressIDW(hline: UInt, lpdwaddressid: COpaquePointer?, dwaddressmode: UInt, lpsaddress: Pcwstr, dwsize: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAddressIDW(hline.toInt(), (lpdwaddressid?.value ?: 0L).toString(), dwaddressmode.toInt(), (lpsaddress?.value ?: 0L).toString(), dwsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAddressStatus(hline: UInt, dwaddressid: UInt, lpaddressstatus: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAddressStatus(hline.toInt(), dwaddressid.toInt(), (lpaddressstatus?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAddressStatusA(hline: UInt, dwaddressid: UInt, lpaddressstatus: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAddressStatusA(hline.toInt(), dwaddressid.toInt(), (lpaddressstatus?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAddressStatusW(hline: UInt, dwaddressid: UInt, lpaddressstatus: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAddressStatusW(hline.toInt(), dwaddressid.toInt(), (lpaddressstatus?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAgentActivityListA(hline: UInt, dwaddressid: UInt, lpagentactivitylist: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAgentActivityListA(hline.toInt(), dwaddressid.toInt(), (lpagentactivitylist?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAgentActivityListW(hline: UInt, dwaddressid: UInt, lpagentactivitylist: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAgentActivityListW(hline.toInt(), dwaddressid.toInt(), (lpagentactivitylist?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAgentCapsA(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwappapiversion: UInt, lpagentcaps: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAgentCapsA(hlineapp.toInt(), dwdeviceid.toInt(), dwaddressid.toInt(), dwappapiversion.toInt(), (lpagentcaps?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAgentCapsW(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwappapiversion: UInt, lpagentcaps: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAgentCapsW(hlineapp.toInt(), dwdeviceid.toInt(), dwaddressid.toInt(), dwappapiversion.toInt(), (lpagentcaps?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAgentGroupListA(hline: UInt, dwaddressid: UInt, lpagentgrouplist: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAgentGroupListA(hline.toInt(), dwaddressid.toInt(), (lpagentgrouplist?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAgentGroupListW(hline: UInt, dwaddressid: UInt, lpagentgrouplist: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAgentGroupListW(hline.toInt(), dwaddressid.toInt(), (lpagentgrouplist?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAgentInfo(hline: UInt, hagent: UInt, lpagentinfo: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAgentInfo(hline.toInt(), hagent.toInt(), (lpagentinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAgentSessionInfo(hline: UInt, hagentsession: UInt, lpagentsessioninfo: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAgentSessionInfo(hline.toInt(), hagentsession.toInt(), (lpagentsessioninfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAgentSessionList(hline: UInt, hagent: UInt, lpagentsessionlist: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAgentSessionList(hline.toInt(), hagent.toInt(), (lpagentsessionlist?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAgentStatusA(hline: UInt, dwaddressid: UInt, lpagentstatus: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAgentStatusA(hline.toInt(), dwaddressid.toInt(), (lpagentstatus?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAgentStatusW(hline: UInt, dwaddressid: UInt, lpagentstatus: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAgentStatusW(hline.toInt(), dwaddressid.toInt(), (lpagentstatus?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAppPriority(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: COpaquePointer?, dwrequestmode: UInt, lpextensionname: COpaquePointer?, lpdwpriority: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAppPriority((lpszappfilename?.value ?: 0L).toString(), dwmediamode.toInt(), (lpextensionid?.value ?: 0L).toString(), dwrequestmode.toInt(), (lpextensionname?.value ?: 0L).toString(), (lpdwpriority?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAppPriorityA(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: COpaquePointer?, dwrequestmode: UInt, lpextensionname: COpaquePointer?, lpdwpriority: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAppPriorityA((lpszappfilename?.value ?: 0L).toString(), dwmediamode.toInt(), (lpextensionid?.value ?: 0L).toString(), dwrequestmode.toInt(), (lpextensionname?.value ?: 0L).toString(), (lpdwpriority?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAppPriorityW(lpszappfilename: Pcwstr, dwmediamode: UInt, lpextensionid: COpaquePointer?, dwrequestmode: UInt, lpextensionname: COpaquePointer?, lpdwpriority: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAppPriorityW((lpszappfilename?.value ?: 0L).toString(), dwmediamode.toInt(), (lpextensionid?.value ?: 0L).toString(), dwrequestmode.toInt(), (lpextensionname?.value ?: 0L).toString(), (lpdwpriority?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetCallInfo(hcall: UInt, lpcallinfo: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetCallInfo(hcall.toInt(), (lpcallinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetCallInfoA(hcall: UInt, lpcallinfo: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetCallInfoA(hcall.toInt(), (lpcallinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetCallInfoW(hcall: UInt, lpcallinfo: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetCallInfoW(hcall.toInt(), (lpcallinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetCallStatus(hcall: UInt, lpcallstatus: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetCallStatus(hcall.toInt(), (lpcallstatus?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetConfRelatedCalls(hcall: UInt, lpcalllist: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetConfRelatedCalls(hcall.toInt(), (lpcalllist?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetCountry(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetCountry(dwcountryid.toInt(), dwapiversion.toInt(), (lplinecountrylist?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetCountryA(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetCountryA(dwcountryid.toInt(), dwapiversion.toInt(), (lplinecountrylist?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetCountryW(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetCountryW(dwcountryid.toInt(), dwapiversion.toInt(), (lplinecountrylist?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetDevCaps(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetDevCaps(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), (lplinedevcaps?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetDevCapsA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetDevCapsA(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), (lplinedevcaps?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetDevCapsW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetDevCapsW(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), (lplinedevcaps?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetDevConfig(dwdeviceid: UInt, lpdeviceconfig: COpaquePointer?, lpszdeviceclass: Pcstr): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetDevConfig(dwdeviceid.toInt(), (lpdeviceconfig?.value ?: 0L).toString(), (lpszdeviceclass?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetDevConfigA(dwdeviceid: UInt, lpdeviceconfig: COpaquePointer?, lpszdeviceclass: Pcstr): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetDevConfigA(dwdeviceid.toInt(), (lpdeviceconfig?.value ?: 0L).toString(), (lpszdeviceclass?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetDevConfigW(dwdeviceid: UInt, lpdeviceconfig: COpaquePointer?, lpszdeviceclass: Pcwstr): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetDevConfigW(dwdeviceid.toInt(), (lpdeviceconfig?.value ?: 0L).toString(), (lpszdeviceclass?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetGroupListA(hline: UInt, lpgrouplist: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetGroupListA(hline.toInt(), (lpgrouplist?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetGroupListW(hline: UInt, lpgrouplist: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetGroupListW(hline.toInt(), (lpgrouplist?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetID(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: COpaquePointer?, lpszdeviceclass: Pcstr): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetID(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), dwselect.toInt(), (lpdeviceid?.value ?: 0L).toString(), (lpszdeviceclass?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetIDA(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: COpaquePointer?, lpszdeviceclass: Pcstr): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetIDA(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), dwselect.toInt(), (lpdeviceid?.value ?: 0L).toString(), (lpszdeviceclass?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetIDW(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: COpaquePointer?, lpszdeviceclass: Pcwstr): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetIDW(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), dwselect.toInt(), (lpdeviceid?.value ?: 0L).toString(), (lpszdeviceclass?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetIcon(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetIcon(dwdeviceid.toInt(), (lpszdeviceclass?.value ?: 0L).toString(), (lphicon?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetIconA(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetIconA(dwdeviceid.toInt(), (lpszdeviceclass?.value ?: 0L).toString(), (lphicon?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetIconW(dwdeviceid: UInt, lpszdeviceclass: Pcwstr, lphicon: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetIconW(dwdeviceid.toInt(), (lpszdeviceclass?.value ?: 0L).toString(), (lphicon?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetLineDevStatus(hline: UInt, lplinedevstatus: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetLineDevStatus(hline.toInt(), (lplinedevstatus?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetLineDevStatusA(hline: UInt, lplinedevstatus: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetLineDevStatusA(hline.toInt(), (lplinedevstatus?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetLineDevStatusW(hline: UInt, lplinedevstatus: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetLineDevStatusW(hline.toInt(), (lplinedevstatus?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetMessage(hlineapp: UInt, lpmessage: COpaquePointer?, dwtimeout: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetMessage(hlineapp.toInt(), (lpmessage?.value ?: 0L).toString(), dwtimeout.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetNewCalls(hline: UInt, dwaddressid: UInt, dwselect: UInt, lpcalllist: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetNewCalls(hline.toInt(), dwaddressid.toInt(), dwselect.toInt(), (lpcalllist?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetNumRings(hline: UInt, dwaddressid: UInt, lpdwnumrings: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetNumRings(hline.toInt(), dwaddressid.toInt(), (lpdwnumrings?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetProviderList(dwapiversion: UInt, lpproviderlist: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetProviderList(dwapiversion.toInt(), (lpproviderlist?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetProviderListA(dwapiversion: UInt, lpproviderlist: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetProviderListA(dwapiversion.toInt(), (lpproviderlist?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetProviderListW(dwapiversion: UInt, lpproviderlist: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetProviderListW(dwapiversion.toInt(), (lpproviderlist?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetProxyStatus(hlineapp: UInt, dwdeviceid: UInt, dwappapiversion: UInt, lplineproxyreqestlist: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetProxyStatus(hlineapp.toInt(), dwdeviceid.toInt(), dwappapiversion.toInt(), (lplineproxyreqestlist?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetQueueInfo(hline: UInt, dwqueueid: UInt, lplinequeueinfo: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetQueueInfo(hline.toInt(), dwqueueid.toInt(), (lplinequeueinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetQueueListA(hline: UInt, lpgroupid: COpaquePointer?, lpqueuelist: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetQueueListA(hline.toInt(), (lpgroupid?.value ?: 0L).toString(), (lpqueuelist?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetQueueListW(hline: UInt, lpgroupid: COpaquePointer?, lpqueuelist: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetQueueListW(hline.toInt(), (lpgroupid?.value ?: 0L).toString(), (lpqueuelist?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetRequest(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetRequest(hlineapp.toInt(), dwrequestmode.toInt(), (lprequestbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetRequestA(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetRequestA(hlineapp.toInt(), dwrequestmode.toInt(), (lprequestbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetRequestW(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetRequestW(hlineapp.toInt(), dwrequestmode.toInt(), (lprequestbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetStatusMessages(hline: UInt, lpdwlinestates: COpaquePointer?, lpdwaddressstates: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetStatusMessages(hline.toInt(), (lpdwlinestates?.value ?: 0L).toString(), (lpdwaddressstates?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetTranslateCaps(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetTranslateCaps(hlineapp.toInt(), dwapiversion.toInt(), (lptranslatecaps?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetTranslateCapsA(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetTranslateCapsA(hlineapp.toInt(), dwapiversion.toInt(), (lptranslatecaps?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetTranslateCapsW(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetTranslateCapsW(hlineapp.toInt(), dwapiversion.toInt(), (lptranslatecaps?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineHandoff(hcall: UInt, lpszfilename: Pcstr, dwmediamode: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineHandoff(hcall.toInt(), (lpszfilename?.value ?: 0L).toString(), dwmediamode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineHandoffA(hcall: UInt, lpszfilename: Pcstr, dwmediamode: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineHandoffA(hcall.toInt(), (lpszfilename?.value ?: 0L).toString(), dwmediamode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineHandoffW(hcall: UInt, lpszfilename: Pcwstr, dwmediamode: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineHandoffW(hcall.toInt(), (lpszfilename?.value ?: 0L).toString(), dwmediamode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineHold(hcall: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineHold(hcall.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineInitialize(lphlineapp: COpaquePointer?, hinstance: Hinstance, lpfncallback: Linecallback, lpszappname: Pcstr, lpdwnumdevs: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineInitialize((lphlineapp?.value ?: 0L).toString(), (hinstance?.value ?: 0L).toString(), 0L.toString(), (lpszappname?.value ?: 0L).toString(), (lpdwnumdevs?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineInitializeExA(lphlineapp: COpaquePointer?, hinstance: Hinstance, lpfncallback: Linecallback, lpszfriendlyappname: Pcstr, lpdwnumdevs: COpaquePointer?, lpdwapiversion: COpaquePointer?, lplineinitializeexparams: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineInitializeExA((lphlineapp?.value ?: 0L).toString(), (hinstance?.value ?: 0L).toString(), 0L.toString(), (lpszfriendlyappname?.value ?: 0L).toString(), (lpdwnumdevs?.value ?: 0L).toString(), (lpdwapiversion?.value ?: 0L).toString(), (lplineinitializeexparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineInitializeExW(lphlineapp: COpaquePointer?, hinstance: Hinstance, lpfncallback: Linecallback, lpszfriendlyappname: Pcwstr, lpdwnumdevs: COpaquePointer?, lpdwapiversion: COpaquePointer?, lplineinitializeexparams: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineInitializeExW((lphlineapp?.value ?: 0L).toString(), (hinstance?.value ?: 0L).toString(), 0L.toString(), (lpszfriendlyappname?.value ?: 0L).toString(), (lpdwnumdevs?.value ?: 0L).toString(), (lpdwapiversion?.value ?: 0L).toString(), (lplineinitializeexparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineMakeCall(hline: UInt, lphcall: COpaquePointer?, lpszdestaddress: Pcstr, dwcountrycode: UInt, lpcallparams: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineMakeCall(hline.toInt(), (lphcall?.value ?: 0L).toString(), (lpszdestaddress?.value ?: 0L).toString(), dwcountrycode.toInt(), (lpcallparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineMakeCallA(hline: UInt, lphcall: COpaquePointer?, lpszdestaddress: Pcstr, dwcountrycode: UInt, lpcallparams: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineMakeCallA(hline.toInt(), (lphcall?.value ?: 0L).toString(), (lpszdestaddress?.value ?: 0L).toString(), dwcountrycode.toInt(), (lpcallparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineMakeCallW(hline: UInt, lphcall: COpaquePointer?, lpszdestaddress: Pcwstr, dwcountrycode: UInt, lpcallparams: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineMakeCallW(hline.toInt(), (lphcall?.value ?: 0L).toString(), (lpszdestaddress?.value ?: 0L).toString(), dwcountrycode.toInt(), (lpcallparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineMonitorDigits(hcall: UInt, dwdigitmodes: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineMonitorDigits(hcall.toInt(), dwdigitmodes.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineMonitorMedia(hcall: UInt, dwmediamodes: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineMonitorMedia(hcall.toInt(), dwmediamodes.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineMonitorTones(hcall: UInt, lptonelist: COpaquePointer?, dwnumentries: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineMonitorTones(hcall.toInt(), (lptonelist?.value ?: 0L).toString(), dwnumentries.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineNegotiateAPIVersion(hlineapp: UInt, dwdeviceid: UInt, dwapilowversion: UInt, dwapihighversion: UInt, lpdwapiversion: COpaquePointer?, lpextensionid: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineNegotiateAPIVersion(hlineapp.toInt(), dwdeviceid.toInt(), dwapilowversion.toInt(), dwapihighversion.toInt(), (lpdwapiversion?.value ?: 0L).toString(), (lpextensionid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineNegotiateExtVersion(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextlowversion: UInt, dwexthighversion: UInt, lpdwextversion: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineNegotiateExtVersion(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextlowversion.toInt(), dwexthighversion.toInt(), (lpdwextversion?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineOpen(hlineapp: UInt, dwdeviceid: UInt, lphline: COpaquePointer?, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineOpen(hlineapp.toInt(), dwdeviceid.toInt(), (lphline?.value ?: 0L).toString(), dwapiversion.toInt(), dwextversion.toInt(), dwcallbackinstance.toString(), dwprivileges.toInt(), dwmediamodes.toInt(), (lpcallparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineOpenA(hlineapp: UInt, dwdeviceid: UInt, lphline: COpaquePointer?, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineOpenA(hlineapp.toInt(), dwdeviceid.toInt(), (lphline?.value ?: 0L).toString(), dwapiversion.toInt(), dwextversion.toInt(), dwcallbackinstance.toString(), dwprivileges.toInt(), dwmediamodes.toInt(), (lpcallparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineOpenW(hlineapp: UInt, dwdeviceid: UInt, lphline: COpaquePointer?, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineOpenW(hlineapp.toInt(), dwdeviceid.toInt(), (lphline?.value ?: 0L).toString(), dwapiversion.toInt(), dwextversion.toInt(), dwcallbackinstance.toString(), dwprivileges.toInt(), dwmediamodes.toInt(), (lpcallparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun linePark(hcall: UInt, dwparkmode: UInt, lpszdiraddress: Pcstr, lpnondiraddress: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_linePark(hcall.toInt(), dwparkmode.toInt(), (lpszdiraddress?.value ?: 0L).toString(), (lpnondiraddress?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineParkA(hcall: UInt, dwparkmode: UInt, lpszdiraddress: Pcstr, lpnondiraddress: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineParkA(hcall.toInt(), dwparkmode.toInt(), (lpszdiraddress?.value ?: 0L).toString(), (lpnondiraddress?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineParkW(hcall: UInt, dwparkmode: UInt, lpszdiraddress: Pcwstr, lpnondiraddress: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineParkW(hcall.toInt(), dwparkmode.toInt(), (lpszdiraddress?.value ?: 0L).toString(), (lpnondiraddress?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun linePickup(hline: UInt, dwaddressid: UInt, lphcall: COpaquePointer?, lpszdestaddress: Pcstr, lpszgroupid: Pcstr): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_linePickup(hline.toInt(), dwaddressid.toInt(), (lphcall?.value ?: 0L).toString(), (lpszdestaddress?.value ?: 0L).toString(), (lpszgroupid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun linePickupA(hline: UInt, dwaddressid: UInt, lphcall: COpaquePointer?, lpszdestaddress: Pcstr, lpszgroupid: Pcstr): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_linePickupA(hline.toInt(), dwaddressid.toInt(), (lphcall?.value ?: 0L).toString(), (lpszdestaddress?.value ?: 0L).toString(), (lpszgroupid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun linePickupW(hline: UInt, dwaddressid: UInt, lphcall: COpaquePointer?, lpszdestaddress: Pcwstr, lpszgroupid: Pcwstr): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_linePickupW(hline.toInt(), dwaddressid.toInt(), (lphcall?.value ?: 0L).toString(), (lpszdestaddress?.value ?: 0L).toString(), (lpszgroupid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun linePrepareAddToConference(hconfcall: UInt, lphconsultcall: COpaquePointer?, lpcallparams: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_linePrepareAddToConference(hconfcall.toInt(), (lphconsultcall?.value ?: 0L).toString(), (lpcallparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun linePrepareAddToConferenceA(hconfcall: UInt, lphconsultcall: COpaquePointer?, lpcallparams: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_linePrepareAddToConferenceA(hconfcall.toInt(), (lphconsultcall?.value ?: 0L).toString(), (lpcallparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun linePrepareAddToConferenceW(hconfcall: UInt, lphconsultcall: COpaquePointer?, lpcallparams: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_linePrepareAddToConferenceW(hconfcall.toInt(), (lphconsultcall?.value ?: 0L).toString(), (lpcallparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineProxyMessage(hline: UInt, hcall: UInt, dwmsg: UInt, dwparam1: UInt, dwparam2: UInt, dwparam3: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineProxyMessage(hline.toInt(), hcall.toInt(), dwmsg.toInt(), dwparam1.toInt(), dwparam2.toInt(), dwparam3.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineProxyResponse(hline: UInt, lpproxyrequest: COpaquePointer?, dwresult: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineProxyResponse(hline.toInt(), (lpproxyrequest?.value ?: 0L).toString(), dwresult.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineRedirect(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineRedirect(hcall.toInt(), (lpszdestaddress?.value ?: 0L).toString(), dwcountrycode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineRedirectA(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineRedirectA(hcall.toInt(), (lpszdestaddress?.value ?: 0L).toString(), dwcountrycode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineRedirectW(hcall: UInt, lpszdestaddress: Pcwstr, dwcountrycode: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineRedirectW(hcall.toInt(), (lpszdestaddress?.value ?: 0L).toString(), dwcountrycode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineRegisterRequestRecipient(hlineapp: UInt, dwregistrationinstance: UInt, dwrequestmode: UInt, benable: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineRegisterRequestRecipient(hlineapp.toInt(), dwregistrationinstance.toInt(), dwrequestmode.toInt(), benable.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineReleaseUserUserInfo(hcall: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineReleaseUserUserInfo(hcall.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineRemoveFromConference(hcall: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineRemoveFromConference(hcall.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineRemoveProvider(dwpermanentproviderid: UInt, hwndowner: Hwnd): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineRemoveProvider(dwpermanentproviderid.toInt(), (hwndowner?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSecureCall(hcall: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSecureCall(hcall.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSendUserUserInfo(hcall: UInt, lpsuseruserinfo: Pcstr, dwsize: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSendUserUserInfo(hcall.toInt(), (lpsuseruserinfo?.value ?: 0L).toString(), dwsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetAgentActivity(hline: UInt, dwaddressid: UInt, dwactivityid: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetAgentActivity(hline.toInt(), dwaddressid.toInt(), dwactivityid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetAgentGroup(hline: UInt, dwaddressid: UInt, lpagentgrouplist: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetAgentGroup(hline.toInt(), dwaddressid.toInt(), (lpagentgrouplist?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetAgentMeasurementPeriod(hline: UInt, hagent: UInt, dwmeasurementperiod: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetAgentMeasurementPeriod(hline.toInt(), hagent.toInt(), dwmeasurementperiod.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetAgentSessionState(hline: UInt, hagentsession: UInt, dwagentsessionstate: UInt, dwnextagentsessionstate: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetAgentSessionState(hline.toInt(), hagentsession.toInt(), dwagentsessionstate.toInt(), dwnextagentsessionstate.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetAgentState(hline: UInt, dwaddressid: UInt, dwagentstate: UInt, dwnextagentstate: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetAgentState(hline.toInt(), dwaddressid.toInt(), dwagentstate.toInt(), dwnextagentstate.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetAgentStateEx(hline: UInt, hagent: UInt, dwagentstate: UInt, dwnextagentstate: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetAgentStateEx(hline.toInt(), hagent.toInt(), dwagentstate.toInt(), dwnextagentstate.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetAppPriority(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: COpaquePointer?, dwrequestmode: UInt, lpszextensionname: Pcstr, dwpriority: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetAppPriority((lpszappfilename?.value ?: 0L).toString(), dwmediamode.toInt(), (lpextensionid?.value ?: 0L).toString(), dwrequestmode.toInt(), (lpszextensionname?.value ?: 0L).toString(), dwpriority.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetAppPriorityA(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: COpaquePointer?, dwrequestmode: UInt, lpszextensionname: Pcstr, dwpriority: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetAppPriorityA((lpszappfilename?.value ?: 0L).toString(), dwmediamode.toInt(), (lpextensionid?.value ?: 0L).toString(), dwrequestmode.toInt(), (lpszextensionname?.value ?: 0L).toString(), dwpriority.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetAppPriorityW(lpszappfilename: Pcwstr, dwmediamode: UInt, lpextensionid: COpaquePointer?, dwrequestmode: UInt, lpszextensionname: Pcwstr, dwpriority: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetAppPriorityW((lpszappfilename?.value ?: 0L).toString(), dwmediamode.toInt(), (lpextensionid?.value ?: 0L).toString(), dwrequestmode.toInt(), (lpszextensionname?.value ?: 0L).toString(), dwpriority.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetAppSpecific(hcall: UInt, dwappspecific: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetAppSpecific(hcall.toInt(), dwappspecific.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetCallData(hcall: UInt, lpcalldata: COpaquePointer?, dwsize: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetCallData(hcall.toInt(), (lpcalldata?.value ?: 0L).toString(), dwsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetCallParams(hcall: UInt, dwbearermode: UInt, dwminrate: UInt, dwmaxrate: UInt, lpdialparams: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetCallParams(hcall.toInt(), dwbearermode.toInt(), dwminrate.toInt(), dwmaxrate.toInt(), (lpdialparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetCallPrivilege(hcall: UInt, dwcallprivilege: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetCallPrivilege(hcall.toInt(), dwcallprivilege.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetCallQualityOfService(hcall: UInt, lpsendingflowspec: COpaquePointer?, dwsendingflowspecsize: UInt, lpreceivingflowspec: COpaquePointer?, dwreceivingflowspecsize: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetCallQualityOfService(hcall.toInt(), (lpsendingflowspec?.value ?: 0L).toString(), dwsendingflowspecsize.toInt(), (lpreceivingflowspec?.value ?: 0L).toString(), dwreceivingflowspecsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetCallTreatment(hcall: UInt, dwtreatment: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetCallTreatment(hcall.toInt(), dwtreatment.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetCurrentLocation(hlineapp: UInt, dwlocation: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetCurrentLocation(hlineapp.toInt(), dwlocation.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetDevConfig(dwdeviceid: UInt, lpdeviceconfig: COpaquePointer?, dwsize: UInt, lpszdeviceclass: Pcstr): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetDevConfig(dwdeviceid.toInt(), (lpdeviceconfig?.value ?: 0L).toString(), dwsize.toInt(), (lpszdeviceclass?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetDevConfigA(dwdeviceid: UInt, lpdeviceconfig: COpaquePointer?, dwsize: UInt, lpszdeviceclass: Pcstr): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetDevConfigA(dwdeviceid.toInt(), (lpdeviceconfig?.value ?: 0L).toString(), dwsize.toInt(), (lpszdeviceclass?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetDevConfigW(dwdeviceid: UInt, lpdeviceconfig: COpaquePointer?, dwsize: UInt, lpszdeviceclass: Pcwstr): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetDevConfigW(dwdeviceid.toInt(), (lpdeviceconfig?.value ?: 0L).toString(), dwsize.toInt(), (lpszdeviceclass?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetLineDevStatus(hline: UInt, dwstatustochange: UInt, fstatus: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetLineDevStatus(hline.toInt(), dwstatustochange.toInt(), fstatus.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetMediaControl(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdigitlist: COpaquePointer?, dwdigitnumentries: UInt, lpmedialist: COpaquePointer?, dwmedianumentries: UInt, lptonelist: COpaquePointer?, dwtonenumentries: UInt, lpcallstatelist: COpaquePointer?, dwcallstatenumentries: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetMediaControl(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), dwselect.toInt(), (lpdigitlist?.value ?: 0L).toString(), dwdigitnumentries.toInt(), (lpmedialist?.value ?: 0L).toString(), dwmedianumentries.toInt(), (lptonelist?.value ?: 0L).toString(), dwtonenumentries.toInt(), (lpcallstatelist?.value ?: 0L).toString(), dwcallstatenumentries.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetMediaMode(hcall: UInt, dwmediamodes: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetMediaMode(hcall.toInt(), dwmediamodes.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetNumRings(hline: UInt, dwaddressid: UInt, dwnumrings: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetNumRings(hline.toInt(), dwaddressid.toInt(), dwnumrings.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetQueueMeasurementPeriod(hline: UInt, dwqueueid: UInt, dwmeasurementperiod: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetQueueMeasurementPeriod(hline.toInt(), dwqueueid.toInt(), dwmeasurementperiod.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetStatusMessages(hline: UInt, dwlinestates: UInt, dwaddressstates: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetStatusMessages(hline.toInt(), dwlinestates.toInt(), dwaddressstates.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetTerminal(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, dwterminalmodes: UInt, dwterminalid: UInt, benable: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetTerminal(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), dwselect.toInt(), dwterminalmodes.toInt(), dwterminalid.toInt(), benable.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetTollList(hlineapp: UInt, dwdeviceid: UInt, lpszaddressin: Pcstr, dwtolllistoption: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetTollList(hlineapp.toInt(), dwdeviceid.toInt(), (lpszaddressin?.value ?: 0L).toString(), dwtolllistoption.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetTollListA(hlineapp: UInt, dwdeviceid: UInt, lpszaddressin: Pcstr, dwtolllistoption: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetTollListA(hlineapp.toInt(), dwdeviceid.toInt(), (lpszaddressin?.value ?: 0L).toString(), dwtolllistoption.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetTollListW(hlineapp: UInt, dwdeviceid: UInt, lpszaddressinw: Pcwstr, dwtolllistoption: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetTollListW(hlineapp.toInt(), dwdeviceid.toInt(), (lpszaddressinw?.value ?: 0L).toString(), dwtolllistoption.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetupConference(hcall: UInt, hline: UInt, lphconfcall: COpaquePointer?, lphconsultcall: COpaquePointer?, dwnumparties: UInt, lpcallparams: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetupConference(hcall.toInt(), hline.toInt(), (lphconfcall?.value ?: 0L).toString(), (lphconsultcall?.value ?: 0L).toString(), dwnumparties.toInt(), (lpcallparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetupConferenceA(hcall: UInt, hline: UInt, lphconfcall: COpaquePointer?, lphconsultcall: COpaquePointer?, dwnumparties: UInt, lpcallparams: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetupConferenceA(hcall.toInt(), hline.toInt(), (lphconfcall?.value ?: 0L).toString(), (lphconsultcall?.value ?: 0L).toString(), dwnumparties.toInt(), (lpcallparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetupConferenceW(hcall: UInt, hline: UInt, lphconfcall: COpaquePointer?, lphconsultcall: COpaquePointer?, dwnumparties: UInt, lpcallparams: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetupConferenceW(hcall.toInt(), hline.toInt(), (lphconfcall?.value ?: 0L).toString(), (lphconsultcall?.value ?: 0L).toString(), dwnumparties.toInt(), (lpcallparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetupTransfer(hcall: UInt, lphconsultcall: COpaquePointer?, lpcallparams: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetupTransfer(hcall.toInt(), (lphconsultcall?.value ?: 0L).toString(), (lpcallparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetupTransferA(hcall: UInt, lphconsultcall: COpaquePointer?, lpcallparams: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetupTransferA(hcall.toInt(), (lphconsultcall?.value ?: 0L).toString(), (lpcallparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetupTransferW(hcall: UInt, lphconsultcall: COpaquePointer?, lpcallparams: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetupTransferW(hcall.toInt(), (lphconsultcall?.value ?: 0L).toString(), (lpcallparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineShutdown(hlineapp: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineShutdown(hlineapp.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSwapHold(hactivecall: UInt, hheldcall: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSwapHold(hactivecall.toInt(), hheldcall.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineTranslateAddress(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: Pcstr, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineTranslateAddress(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), (lpszaddressin?.value ?: 0L).toString(), dwcard.toInt(), dwtranslateoptions.toInt(), (lptranslateoutput?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineTranslateAddressA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: Pcstr, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineTranslateAddressA(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), (lpszaddressin?.value ?: 0L).toString(), dwcard.toInt(), dwtranslateoptions.toInt(), (lptranslateoutput?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineTranslateAddressW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: Pcwstr, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineTranslateAddressW(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), (lpszaddressin?.value ?: 0L).toString(), dwcard.toInt(), dwtranslateoptions.toInt(), (lptranslateoutput?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineTranslateDialog(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: Hwnd, lpszaddressin: Pcstr): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineTranslateDialog(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), (hwndowner?.value ?: 0L).toString(), (lpszaddressin?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineTranslateDialogA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: Hwnd, lpszaddressin: Pcstr): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineTranslateDialogA(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), (hwndowner?.value ?: 0L).toString(), (lpszaddressin?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineTranslateDialogW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: Hwnd, lpszaddressin: Pcwstr): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineTranslateDialogW(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), (hwndowner?.value ?: 0L).toString(), (lpszaddressin?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineUncompleteCall(hline: UInt, dwcompletionid: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineUncompleteCall(hline.toInt(), dwcompletionid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineUnhold(hcall: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineUnhold(hcall.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineUnpark(hline: UInt, dwaddressid: UInt, lphcall: COpaquePointer?, lpszdestaddress: Pcstr): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineUnpark(hline.toInt(), dwaddressid.toInt(), (lphcall?.value ?: 0L).toString(), (lpszdestaddress?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineUnparkA(hline: UInt, dwaddressid: UInt, lphcall: COpaquePointer?, lpszdestaddress: Pcstr): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineUnparkA(hline.toInt(), dwaddressid.toInt(), (lphcall?.value ?: 0L).toString(), (lpszdestaddress?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineUnparkW(hline: UInt, dwaddressid: UInt, lphcall: COpaquePointer?, lpszdestaddress: Pcwstr): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineUnparkW(hline.toInt(), dwaddressid.toInt(), (lphcall?.value ?: 0L).toString(), (lpszdestaddress?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneClose(hphone: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneClose(hphone.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneConfigDialog(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneConfigDialog(dwdeviceid.toInt(), (hwndowner?.value ?: 0L).toString(), (lpszdeviceclass?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneConfigDialogA(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneConfigDialogA(dwdeviceid.toInt(), (hwndowner?.value ?: 0L).toString(), (lpszdeviceclass?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneConfigDialogW(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcwstr): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneConfigDialogW(dwdeviceid.toInt(), (hwndowner?.value ?: 0L).toString(), (lpszdeviceclass?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneDevSpecific(hphone: UInt, lpparams: COpaquePointer?, dwsize: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneDevSpecific(hphone.toInt(), (lpparams?.value ?: 0L).toString(), dwsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetButtonInfo(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetButtonInfo(hphone.toInt(), dwbuttonlampid.toInt(), (lpbuttoninfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetButtonInfoA(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetButtonInfoA(hphone.toInt(), dwbuttonlampid.toInt(), (lpbuttoninfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetButtonInfoW(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetButtonInfoW(hphone.toInt(), dwbuttonlampid.toInt(), (lpbuttoninfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetData(hphone: UInt, dwdataid: UInt, lpdata: COpaquePointer?, dwsize: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetData(hphone.toInt(), dwdataid.toInt(), (lpdata?.value ?: 0L).toString(), dwsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetDevCaps(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetDevCaps(hphoneapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), (lpphonecaps?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetDevCapsA(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetDevCapsA(hphoneapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), (lpphonecaps?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetDevCapsW(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetDevCapsW(hphoneapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), (lpphonecaps?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetDisplay(hphone: UInt, lpdisplay: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetDisplay(hphone.toInt(), (lpdisplay?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetGain(hphone: UInt, dwhookswitchdev: UInt, lpdwgain: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetGain(hphone.toInt(), dwhookswitchdev.toInt(), (lpdwgain?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetHookSwitch(hphone: UInt, lpdwhookswitchdevs: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetHookSwitch(hphone.toInt(), (lpdwhookswitchdevs?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetID(hphone: UInt, lpdeviceid: COpaquePointer?, lpszdeviceclass: Pcstr): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetID(hphone.toInt(), (lpdeviceid?.value ?: 0L).toString(), (lpszdeviceclass?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetIDA(hphone: UInt, lpdeviceid: COpaquePointer?, lpszdeviceclass: Pcstr): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetIDA(hphone.toInt(), (lpdeviceid?.value ?: 0L).toString(), (lpszdeviceclass?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetIDW(hphone: UInt, lpdeviceid: COpaquePointer?, lpszdeviceclass: Pcwstr): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetIDW(hphone.toInt(), (lpdeviceid?.value ?: 0L).toString(), (lpszdeviceclass?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetIcon(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetIcon(dwdeviceid.toInt(), (lpszdeviceclass?.value ?: 0L).toString(), (lphicon?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetIconA(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetIconA(dwdeviceid.toInt(), (lpszdeviceclass?.value ?: 0L).toString(), (lphicon?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetIconW(dwdeviceid: UInt, lpszdeviceclass: Pcwstr, lphicon: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetIconW(dwdeviceid.toInt(), (lpszdeviceclass?.value ?: 0L).toString(), (lphicon?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetLamp(hphone: UInt, dwbuttonlampid: UInt, lpdwlampmode: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetLamp(hphone.toInt(), dwbuttonlampid.toInt(), (lpdwlampmode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetMessage(hphoneapp: UInt, lpmessage: COpaquePointer?, dwtimeout: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetMessage(hphoneapp.toInt(), (lpmessage?.value ?: 0L).toString(), dwtimeout.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetRing(hphone: UInt, lpdwringmode: COpaquePointer?, lpdwvolume: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetRing(hphone.toInt(), (lpdwringmode?.value ?: 0L).toString(), (lpdwvolume?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetStatus(hphone: UInt, lpphonestatus: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetStatus(hphone.toInt(), (lpphonestatus?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetStatusA(hphone: UInt, lpphonestatus: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetStatusA(hphone.toInt(), (lpphonestatus?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetStatusMessages(hphone: UInt, lpdwphonestates: COpaquePointer?, lpdwbuttonmodes: COpaquePointer?, lpdwbuttonstates: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetStatusMessages(hphone.toInt(), (lpdwphonestates?.value ?: 0L).toString(), (lpdwbuttonmodes?.value ?: 0L).toString(), (lpdwbuttonstates?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetStatusW(hphone: UInt, lpphonestatus: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetStatusW(hphone.toInt(), (lpphonestatus?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetVolume(hphone: UInt, dwhookswitchdev: UInt, lpdwvolume: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetVolume(hphone.toInt(), dwhookswitchdev.toInt(), (lpdwvolume?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneInitialize(lphphoneapp: COpaquePointer?, hinstance: Hinstance, lpfncallback: Phonecallback, lpszappname: Pcstr, lpdwnumdevs: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneInitialize((lphphoneapp?.value ?: 0L).toString(), (hinstance?.value ?: 0L).toString(), 0L.toString(), (lpszappname?.value ?: 0L).toString(), (lpdwnumdevs?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneInitializeExA(lphphoneapp: COpaquePointer?, hinstance: Hinstance, lpfncallback: Phonecallback, lpszfriendlyappname: Pcstr, lpdwnumdevs: COpaquePointer?, lpdwapiversion: COpaquePointer?, lpphoneinitializeexparams: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneInitializeExA((lphphoneapp?.value ?: 0L).toString(), (hinstance?.value ?: 0L).toString(), 0L.toString(), (lpszfriendlyappname?.value ?: 0L).toString(), (lpdwnumdevs?.value ?: 0L).toString(), (lpdwapiversion?.value ?: 0L).toString(), (lpphoneinitializeexparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneInitializeExW(lphphoneapp: COpaquePointer?, hinstance: Hinstance, lpfncallback: Phonecallback, lpszfriendlyappname: Pcwstr, lpdwnumdevs: COpaquePointer?, lpdwapiversion: COpaquePointer?, lpphoneinitializeexparams: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneInitializeExW((lphphoneapp?.value ?: 0L).toString(), (hinstance?.value ?: 0L).toString(), 0L.toString(), (lpszfriendlyappname?.value ?: 0L).toString(), (lpdwnumdevs?.value ?: 0L).toString(), (lpdwapiversion?.value ?: 0L).toString(), (lpphoneinitializeexparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneNegotiateAPIVersion(hphoneapp: UInt, dwdeviceid: UInt, dwapilowversion: UInt, dwapihighversion: UInt, lpdwapiversion: COpaquePointer?, lpextensionid: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneNegotiateAPIVersion(hphoneapp.toInt(), dwdeviceid.toInt(), dwapilowversion.toInt(), dwapihighversion.toInt(), (lpdwapiversion?.value ?: 0L).toString(), (lpextensionid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneNegotiateExtVersion(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextlowversion: UInt, dwexthighversion: UInt, lpdwextversion: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneNegotiateExtVersion(hphoneapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextlowversion.toInt(), dwexthighversion.toInt(), (lpdwextversion?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneOpen(hphoneapp: UInt, dwdeviceid: UInt, lphphone: COpaquePointer?, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivilege: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneOpen(hphoneapp.toInt(), dwdeviceid.toInt(), (lphphone?.value ?: 0L).toString(), dwapiversion.toInt(), dwextversion.toInt(), dwcallbackinstance.toString(), dwprivilege.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneSetButtonInfo(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneSetButtonInfo(hphone.toInt(), dwbuttonlampid.toInt(), (lpbuttoninfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneSetButtonInfoA(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneSetButtonInfoA(hphone.toInt(), dwbuttonlampid.toInt(), (lpbuttoninfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneSetButtonInfoW(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: COpaquePointer?): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneSetButtonInfoW(hphone.toInt(), dwbuttonlampid.toInt(), (lpbuttoninfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneSetData(hphone: UInt, dwdataid: UInt, lpdata: COpaquePointer?, dwsize: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneSetData(hphone.toInt(), dwdataid.toInt(), (lpdata?.value ?: 0L).toString(), dwsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneSetDisplay(hphone: UInt, dwrow: UInt, dwcolumn: UInt, lpsdisplay: Pcstr, dwsize: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneSetDisplay(hphone.toInt(), dwrow.toInt(), dwcolumn.toInt(), (lpsdisplay?.value ?: 0L).toString(), dwsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneSetGain(hphone: UInt, dwhookswitchdev: UInt, dwgain: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneSetGain(hphone.toInt(), dwhookswitchdev.toInt(), dwgain.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneSetHookSwitch(hphone: UInt, dwhookswitchdevs: UInt, dwhookswitchmode: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneSetHookSwitch(hphone.toInt(), dwhookswitchdevs.toInt(), dwhookswitchmode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneSetLamp(hphone: UInt, dwbuttonlampid: UInt, dwlampmode: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneSetLamp(hphone.toInt(), dwbuttonlampid.toInt(), dwlampmode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneSetRing(hphone: UInt, dwringmode: UInt, dwvolume: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneSetRing(hphone.toInt(), dwringmode.toInt(), dwvolume.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneSetStatusMessages(hphone: UInt, dwphonestates: UInt, dwbuttonmodes: UInt, dwbuttonstates: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneSetStatusMessages(hphone.toInt(), dwphonestates.toInt(), dwbuttonmodes.toInt(), dwbuttonstates.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneSetVolume(hphone: UInt, dwhookswitchdev: UInt, dwvolume: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneSetVolume(hphone.toInt(), dwhookswitchdev.toInt(), dwvolume.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneShutdown(hphoneapp: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneShutdown(hphoneapp.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tapiGetLocationInfo(lpszcountrycode: Pstr, lpszcitycode: Pstr): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_tapiGetLocationInfo((lpszcountrycode?.value ?: 0L).toString(), (lpszcitycode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tapiGetLocationInfoA(lpszcountrycode: Pstr, lpszcitycode: Pstr): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_tapiGetLocationInfoA((lpszcountrycode?.value ?: 0L).toString(), (lpszcitycode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tapiGetLocationInfoW(lpszcountrycodew: Pwstr, lpszcitycodew: Pwstr): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_tapiGetLocationInfoW((lpszcountrycodew?.value ?: 0L).toString(), (lpszcitycodew?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tapiRequestDrop(hwnd: Hwnd, wrequestid: Wparam): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_tapiRequestDrop((hwnd?.value ?: 0L).toString(), wrequestid.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tapiRequestMakeCall(lpszdestaddress: Pcstr, lpszappname: Pcstr, lpszcalledparty: Pcstr, lpszcomment: Pcstr): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_tapiRequestMakeCall((lpszdestaddress?.value ?: 0L).toString(), (lpszappname?.value ?: 0L).toString(), (lpszcalledparty?.value ?: 0L).toString(), (lpszcomment?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tapiRequestMakeCallA(lpszdestaddress: Pcstr, lpszappname: Pcstr, lpszcalledparty: Pcstr, lpszcomment: Pcstr): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_tapiRequestMakeCallA((lpszdestaddress?.value ?: 0L).toString(), (lpszappname?.value ?: 0L).toString(), (lpszcalledparty?.value ?: 0L).toString(), (lpszcomment?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tapiRequestMakeCallW(lpszdestaddress: Pcwstr, lpszappname: Pcwstr, lpszcalledparty: Pcwstr, lpszcomment: Pcwstr): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_tapiRequestMakeCallW((lpszdestaddress?.value ?: 0L).toString(), (lpszappname?.value ?: 0L).toString(), (lpszcalledparty?.value ?: 0L).toString(), (lpszcomment?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tapiRequestMediaCall(hwnd: Hwnd, wrequestid: Wparam, lpszdeviceclass: Pcstr, lpdeviceid: Pcstr, dwsize: UInt, dwsecure: UInt, lpszdestaddress: Pcstr, lpszappname: Pcstr, lpszcalledparty: Pcstr, lpszcomment: Pcstr): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_tapiRequestMediaCall((hwnd?.value ?: 0L).toString(), wrequestid.toString(), (lpszdeviceclass?.value ?: 0L).toString(), (lpdeviceid?.value ?: 0L).toString(), dwsize.toInt(), dwsecure.toInt(), (lpszdestaddress?.value ?: 0L).toString(), (lpszappname?.value ?: 0L).toString(), (lpszcalledparty?.value ?: 0L).toString(), (lpszcomment?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tapiRequestMediaCallA(hwnd: Hwnd, wrequestid: Wparam, lpszdeviceclass: Pcstr, lpdeviceid: Pcstr, dwsize: UInt, dwsecure: UInt, lpszdestaddress: Pcstr, lpszappname: Pcstr, lpszcalledparty: Pcstr, lpszcomment: Pcstr): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_tapiRequestMediaCallA((hwnd?.value ?: 0L).toString(), wrequestid.toString(), (lpszdeviceclass?.value ?: 0L).toString(), (lpdeviceid?.value ?: 0L).toString(), dwsize.toInt(), dwsecure.toInt(), (lpszdestaddress?.value ?: 0L).toString(), (lpszappname?.value ?: 0L).toString(), (lpszcalledparty?.value ?: 0L).toString(), (lpszcomment?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tapiRequestMediaCallW(hwnd: Hwnd, wrequestid: Wparam, lpszdeviceclass: Pcwstr, lpdeviceid: Pcwstr, dwsize: UInt, dwsecure: UInt, lpszdestaddress: Pcwstr, lpszappname: Pcwstr, lpszcalledparty: Pcwstr, lpszcomment: Pcwstr): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_tapiRequestMediaCallW((hwnd?.value ?: 0L).toString(), wrequestid.toString(), (lpszdeviceclass?.value ?: 0L).toString(), (lpdeviceid?.value ?: 0L).toString(), dwsize.toInt(), dwsecure.toInt(), (lpszdestaddress?.value ?: 0L).toString(), (lpszappname?.value ?: 0L).toString(), (lpszcalledparty?.value ?: 0L).toString(), (lpszcomment?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
