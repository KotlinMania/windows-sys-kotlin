@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.tapi

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon

private val windowsWin32DevicesTapiNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun getTnefStreamCodepage(lpstream: MutPtr<CVoid>, lpulcodepage: MutPtr<UInt>, lpulsubcodepage: MutPtr<UInt>): Hresult =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiGetTnefStreamCodepage(lpstream.rawAddress.toString(), lpulcodepage.rawAddress.toString(), lpulsubcodepage.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTnefStream(lpvsupport: MutPtr<CVoid>, lpstream: MutPtr<CVoid>, lpszstreamname: ConstPtr<Byte>, ulflags: UInt, lpmessage: MutPtr<CVoid>, wkeyval: UShort, lpptnef: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiOpenTnefStream(lpvsupport.rawAddress.toString(), lpstream.rawAddress.toString(), lpszstreamname.rawAddress.toString(), ulflags.toInt(), lpmessage.rawAddress.toString(), wkeyval.toInt(), lpptnef.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTnefStreamEx(lpvsupport: MutPtr<CVoid>, lpstream: MutPtr<CVoid>, lpszstreamname: ConstPtr<Byte>, ulflags: UInt, lpmessage: MutPtr<CVoid>, wkeyval: UShort, lpadressbook: MutPtr<CVoid>, lpptnef: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiOpenTnefStreamEx(lpvsupport.rawAddress.toString(), lpstream.rawAddress.toString(), lpszstreamname.rawAddress.toString(), ulflags.toInt(), lpmessage.rawAddress.toString(), wkeyval.toInt(), lpadressbook.rawAddress.toString(), lpptnef.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineAccept(hcall: UInt, lpsuseruserinfo: Pcstr, dwsize: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineAccept(hcall.toInt(), lpsuseruserinfo.rawAddress.toString(), dwsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineAddProvider(lpszproviderfilename: Pcstr, hwndowner: Hwnd, lpdwpermanentproviderid: MutPtr<UInt>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineAddProvider(lpszproviderfilename.rawAddress.toString(), hwndowner.rawAddress.toString(), lpdwpermanentproviderid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineAddProviderA(lpszproviderfilename: Pcstr, hwndowner: Hwnd, lpdwpermanentproviderid: MutPtr<UInt>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineAddProviderA(lpszproviderfilename.rawAddress.toString(), hwndowner.rawAddress.toString(), lpdwpermanentproviderid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineAddProviderW(lpszproviderfilename: Pcwstr, hwndowner: Hwnd, lpdwpermanentproviderid: MutPtr<UInt>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineAddProviderW(lpszproviderfilename.rawAddress.toString(), hwndowner.rawAddress.toString(), lpdwpermanentproviderid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineAddToConference(hconfcall: UInt, hconsultcall: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineAddToConference(hconfcall.toInt(), hconsultcall.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineAgentSpecific(hline: UInt, dwaddressid: UInt, dwagentextensionidindex: UInt, lpparams: MutPtr<CVoid>, dwsize: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineAgentSpecific(hline.toInt(), dwaddressid.toInt(), dwagentextensionidindex.toInt(), lpparams.rawAddress.toString(), dwsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineAnswer(hcall: UInt, lpsuseruserinfo: Pcstr, dwsize: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineAnswer(hcall.toInt(), lpsuseruserinfo.rawAddress.toString(), dwsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineBlindTransfer(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineBlindTransfer(hcall.toInt(), lpszdestaddress.rawAddress.toString(), dwcountrycode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineBlindTransferA(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineBlindTransferA(hcall.toInt(), lpszdestaddress.rawAddress.toString(), dwcountrycode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineBlindTransferW(hcall: UInt, lpszdestaddressw: Pcwstr, dwcountrycode: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineBlindTransferW(hcall.toInt(), lpszdestaddressw.rawAddress.toString(), dwcountrycode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineClose(hline: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineClose(hline.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineCompleteCall(hcall: UInt, lpdwcompletionid: MutPtr<UInt>, dwcompletionmode: UInt, dwmessageid: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineCompleteCall(hcall.toInt(), lpdwcompletionid.rawAddress.toString(), dwcompletionmode.toInt(), dwmessageid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineCompleteTransfer(hcall: UInt, hconsultcall: UInt, lphconfcall: MutPtr<UInt>, dwtransfermode: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineCompleteTransfer(hcall.toInt(), hconsultcall.toInt(), lphconfcall.rawAddress.toString(), dwtransfermode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineConfigDialog(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineConfigDialog(dwdeviceid.toInt(), hwndowner.rawAddress.toString(), lpszdeviceclass.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineConfigDialogA(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineConfigDialogA(dwdeviceid.toInt(), hwndowner.rawAddress.toString(), lpszdeviceclass.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineConfigDialogEdit(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr, lpdeviceconfigin: ConstPtr<CVoid>, dwsize: UInt, lpdeviceconfigout: MutPtr<Varstring>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineConfigDialogEdit(dwdeviceid.toInt(), hwndowner.rawAddress.toString(), lpszdeviceclass.rawAddress.toString(), lpdeviceconfigin.rawAddress.toString(), dwsize.toInt(), lpdeviceconfigout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineConfigDialogEditA(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr, lpdeviceconfigin: ConstPtr<CVoid>, dwsize: UInt, lpdeviceconfigout: MutPtr<Varstring>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineConfigDialogEditA(dwdeviceid.toInt(), hwndowner.rawAddress.toString(), lpszdeviceclass.rawAddress.toString(), lpdeviceconfigin.rawAddress.toString(), dwsize.toInt(), lpdeviceconfigout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineConfigDialogEditW(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcwstr, lpdeviceconfigin: ConstPtr<CVoid>, dwsize: UInt, lpdeviceconfigout: MutPtr<Varstring>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineConfigDialogEditW(dwdeviceid.toInt(), hwndowner.rawAddress.toString(), lpszdeviceclass.rawAddress.toString(), lpdeviceconfigin.rawAddress.toString(), dwsize.toInt(), lpdeviceconfigout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineConfigDialogW(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcwstr): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineConfigDialogW(dwdeviceid.toInt(), hwndowner.rawAddress.toString(), lpszdeviceclass.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineConfigProvider(hwndowner: Hwnd, dwpermanentproviderid: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineConfigProvider(hwndowner.rawAddress.toString(), dwpermanentproviderid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineCreateAgentA(hline: UInt, lpszagentid: Pcstr, lpszagentpin: Pcstr, lphagent: MutPtr<UInt>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineCreateAgentA(hline.toInt(), lpszagentid.rawAddress.toString(), lpszagentpin.rawAddress.toString(), lphagent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineCreateAgentSessionA(hline: UInt, hagent: UInt, lpszagentpin: Pcstr, dwworkingaddressid: UInt, lpgroupid: MutPtr<Guid>, lphagentsession: MutPtr<UInt>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineCreateAgentSessionA(hline.toInt(), hagent.toInt(), lpszagentpin.rawAddress.toString(), dwworkingaddressid.toInt(), lpgroupid.rawAddress.toString(), lphagentsession.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineCreateAgentSessionW(hline: UInt, hagent: UInt, lpszagentpin: Pcwstr, dwworkingaddressid: UInt, lpgroupid: MutPtr<Guid>, lphagentsession: MutPtr<UInt>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineCreateAgentSessionW(hline.toInt(), hagent.toInt(), lpszagentpin.rawAddress.toString(), dwworkingaddressid.toInt(), lpgroupid.rawAddress.toString(), lphagentsession.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineCreateAgentW(hline: UInt, lpszagentid: Pcwstr, lpszagentpin: Pcwstr, lphagent: MutPtr<UInt>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineCreateAgentW(hline.toInt(), lpszagentid.rawAddress.toString(), lpszagentpin.rawAddress.toString(), lphagent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineDeallocateCall(hcall: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineDeallocateCall(hcall.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineDevSpecific(hline: UInt, dwaddressid: UInt, hcall: UInt, lpparams: MutPtr<CVoid>, dwsize: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineDevSpecific(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), lpparams.rawAddress.toString(), dwsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineDevSpecificFeature(hline: UInt, dwfeature: UInt, lpparams: MutPtr<CVoid>, dwsize: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineDevSpecificFeature(hline.toInt(), dwfeature.toInt(), lpparams.rawAddress.toString(), dwsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineDial(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineDial(hcall.toInt(), lpszdestaddress.rawAddress.toString(), dwcountrycode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineDialA(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineDialA(hcall.toInt(), lpszdestaddress.rawAddress.toString(), dwcountrycode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineDialW(hcall: UInt, lpszdestaddress: Pcwstr, dwcountrycode: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineDialW(hcall.toInt(), lpszdestaddress.rawAddress.toString(), dwcountrycode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineDrop(hcall: UInt, lpsuseruserinfo: Pcstr, dwsize: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineDrop(hcall.toInt(), lpsuseruserinfo.rawAddress.toString(), dwsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineForward(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: ConstPtr<Lineforwardlist>, dwnumringsnoanswer: UInt, lphconsultcall: MutPtr<UInt>, lpcallparams: ConstPtr<Linecallparams>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineForward(hline.toInt(), balladdresses.toInt(), dwaddressid.toInt(), lpforwardlist.rawAddress.toString(), dwnumringsnoanswer.toInt(), lphconsultcall.rawAddress.toString(), lpcallparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineForwardA(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: ConstPtr<Lineforwardlist>, dwnumringsnoanswer: UInt, lphconsultcall: MutPtr<UInt>, lpcallparams: ConstPtr<Linecallparams>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineForwardA(hline.toInt(), balladdresses.toInt(), dwaddressid.toInt(), lpforwardlist.rawAddress.toString(), dwnumringsnoanswer.toInt(), lphconsultcall.rawAddress.toString(), lpcallparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineForwardW(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: ConstPtr<Lineforwardlist>, dwnumringsnoanswer: UInt, lphconsultcall: MutPtr<UInt>, lpcallparams: ConstPtr<Linecallparams>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineForwardW(hline.toInt(), balladdresses.toInt(), dwaddressid.toInt(), lpforwardlist.rawAddress.toString(), dwnumringsnoanswer.toInt(), lphconsultcall.rawAddress.toString(), lpcallparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGatherDigits(hcall: UInt, dwdigitmodes: UInt, lpsdigits: Pstr, dwnumdigits: UInt, lpszterminationdigits: Pcstr, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGatherDigits(hcall.toInt(), dwdigitmodes.toInt(), lpsdigits.rawAddress.toString(), dwnumdigits.toInt(), lpszterminationdigits.rawAddress.toString(), dwfirstdigittimeout.toInt(), dwinterdigittimeout.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGatherDigitsA(hcall: UInt, dwdigitmodes: UInt, lpsdigits: Pstr, dwnumdigits: UInt, lpszterminationdigits: Pcstr, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGatherDigitsA(hcall.toInt(), dwdigitmodes.toInt(), lpsdigits.rawAddress.toString(), dwnumdigits.toInt(), lpszterminationdigits.rawAddress.toString(), dwfirstdigittimeout.toInt(), dwinterdigittimeout.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGatherDigitsW(hcall: UInt, dwdigitmodes: UInt, lpsdigits: Pwstr, dwnumdigits: UInt, lpszterminationdigits: Pcwstr, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGatherDigitsW(hcall.toInt(), dwdigitmodes.toInt(), lpsdigits.rawAddress.toString(), dwnumdigits.toInt(), lpszterminationdigits.rawAddress.toString(), dwfirstdigittimeout.toInt(), dwinterdigittimeout.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGenerateDigits(hcall: UInt, dwdigitmode: UInt, lpszdigits: Pcstr, dwduration: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGenerateDigits(hcall.toInt(), dwdigitmode.toInt(), lpszdigits.rawAddress.toString(), dwduration.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGenerateDigitsA(hcall: UInt, dwdigitmode: UInt, lpszdigits: Pcstr, dwduration: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGenerateDigitsA(hcall.toInt(), dwdigitmode.toInt(), lpszdigits.rawAddress.toString(), dwduration.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGenerateDigitsW(hcall: UInt, dwdigitmode: UInt, lpszdigits: Pcwstr, dwduration: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGenerateDigitsW(hcall.toInt(), dwdigitmode.toInt(), lpszdigits.rawAddress.toString(), dwduration.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGenerateTone(hcall: UInt, dwtonemode: UInt, dwduration: UInt, dwnumtones: UInt, lptones: ConstPtr<Linegeneratetone>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGenerateTone(hcall.toInt(), dwtonemode.toInt(), dwduration.toInt(), dwnumtones.toInt(), lptones.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAddressCaps(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: MutPtr<Lineaddresscaps>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetAddressCaps(hlineapp.toInt(), dwdeviceid.toInt(), dwaddressid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lpaddresscaps.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAddressCapsA(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: MutPtr<Lineaddresscaps>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetAddressCapsA(hlineapp.toInt(), dwdeviceid.toInt(), dwaddressid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lpaddresscaps.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAddressCapsW(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: MutPtr<Lineaddresscaps>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetAddressCapsW(hlineapp.toInt(), dwdeviceid.toInt(), dwaddressid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lpaddresscaps.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAddressID(hline: UInt, lpdwaddressid: MutPtr<UInt>, dwaddressmode: UInt, lpsaddress: Pcstr, dwsize: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetAddressID(hline.toInt(), lpdwaddressid.rawAddress.toString(), dwaddressmode.toInt(), lpsaddress.rawAddress.toString(), dwsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAddressIDA(hline: UInt, lpdwaddressid: MutPtr<UInt>, dwaddressmode: UInt, lpsaddress: Pcstr, dwsize: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetAddressIDA(hline.toInt(), lpdwaddressid.rawAddress.toString(), dwaddressmode.toInt(), lpsaddress.rawAddress.toString(), dwsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAddressIDW(hline: UInt, lpdwaddressid: MutPtr<UInt>, dwaddressmode: UInt, lpsaddress: Pcwstr, dwsize: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetAddressIDW(hline.toInt(), lpdwaddressid.rawAddress.toString(), dwaddressmode.toInt(), lpsaddress.rawAddress.toString(), dwsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAddressStatus(hline: UInt, dwaddressid: UInt, lpaddressstatus: MutPtr<Lineaddressstatus>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetAddressStatus(hline.toInt(), dwaddressid.toInt(), lpaddressstatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAddressStatusA(hline: UInt, dwaddressid: UInt, lpaddressstatus: MutPtr<Lineaddressstatus>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetAddressStatusA(hline.toInt(), dwaddressid.toInt(), lpaddressstatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAddressStatusW(hline: UInt, dwaddressid: UInt, lpaddressstatus: MutPtr<Lineaddressstatus>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetAddressStatusW(hline.toInt(), dwaddressid.toInt(), lpaddressstatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAgentActivityListA(hline: UInt, dwaddressid: UInt, lpagentactivitylist: MutPtr<Lineagentactivitylist>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetAgentActivityListA(hline.toInt(), dwaddressid.toInt(), lpagentactivitylist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAgentActivityListW(hline: UInt, dwaddressid: UInt, lpagentactivitylist: MutPtr<Lineagentactivitylist>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetAgentActivityListW(hline.toInt(), dwaddressid.toInt(), lpagentactivitylist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAgentCapsA(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwappapiversion: UInt, lpagentcaps: MutPtr<Lineagentcaps>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetAgentCapsA(hlineapp.toInt(), dwdeviceid.toInt(), dwaddressid.toInt(), dwappapiversion.toInt(), lpagentcaps.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAgentCapsW(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwappapiversion: UInt, lpagentcaps: MutPtr<Lineagentcaps>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetAgentCapsW(hlineapp.toInt(), dwdeviceid.toInt(), dwaddressid.toInt(), dwappapiversion.toInt(), lpagentcaps.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAgentGroupListA(hline: UInt, dwaddressid: UInt, lpagentgrouplist: MutPtr<Lineagentgrouplist>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetAgentGroupListA(hline.toInt(), dwaddressid.toInt(), lpagentgrouplist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAgentGroupListW(hline: UInt, dwaddressid: UInt, lpagentgrouplist: MutPtr<Lineagentgrouplist>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetAgentGroupListW(hline.toInt(), dwaddressid.toInt(), lpagentgrouplist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAgentInfo(hline: UInt, hagent: UInt, lpagentinfo: MutPtr<Lineagentinfo>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetAgentInfo(hline.toInt(), hagent.toInt(), lpagentinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAgentSessionInfo(hline: UInt, hagentsession: UInt, lpagentsessioninfo: MutPtr<Lineagentsessioninfo>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetAgentSessionInfo(hline.toInt(), hagentsession.toInt(), lpagentsessioninfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAgentSessionList(hline: UInt, hagent: UInt, lpagentsessionlist: MutPtr<Lineagentsessionlist>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetAgentSessionList(hline.toInt(), hagent.toInt(), lpagentsessionlist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAgentStatusA(hline: UInt, dwaddressid: UInt, lpagentstatus: MutPtr<Lineagentstatus>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetAgentStatusA(hline.toInt(), dwaddressid.toInt(), lpagentstatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAgentStatusW(hline: UInt, dwaddressid: UInt, lpagentstatus: MutPtr<Lineagentstatus>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetAgentStatusW(hline.toInt(), dwaddressid.toInt(), lpagentstatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAppPriority(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: MutPtr<Lineextensionid>, dwrequestmode: UInt, lpextensionname: MutPtr<Varstring>, lpdwpriority: MutPtr<UInt>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetAppPriority(lpszappfilename.rawAddress.toString(), dwmediamode.toInt(), lpextensionid.rawAddress.toString(), dwrequestmode.toInt(), lpextensionname.rawAddress.toString(), lpdwpriority.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAppPriorityA(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: MutPtr<Lineextensionid>, dwrequestmode: UInt, lpextensionname: MutPtr<Varstring>, lpdwpriority: MutPtr<UInt>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetAppPriorityA(lpszappfilename.rawAddress.toString(), dwmediamode.toInt(), lpextensionid.rawAddress.toString(), dwrequestmode.toInt(), lpextensionname.rawAddress.toString(), lpdwpriority.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetAppPriorityW(lpszappfilename: Pcwstr, dwmediamode: UInt, lpextensionid: MutPtr<Lineextensionid>, dwrequestmode: UInt, lpextensionname: MutPtr<Varstring>, lpdwpriority: MutPtr<UInt>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetAppPriorityW(lpszappfilename.rawAddress.toString(), dwmediamode.toInt(), lpextensionid.rawAddress.toString(), dwrequestmode.toInt(), lpextensionname.rawAddress.toString(), lpdwpriority.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetCallInfo(hcall: UInt, lpcallinfo: MutPtr<Linecallinfo>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetCallInfo(hcall.toInt(), lpcallinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetCallInfoA(hcall: UInt, lpcallinfo: MutPtr<Linecallinfo>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetCallInfoA(hcall.toInt(), lpcallinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetCallInfoW(hcall: UInt, lpcallinfo: MutPtr<Linecallinfo>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetCallInfoW(hcall.toInt(), lpcallinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetCallStatus(hcall: UInt, lpcallstatus: MutPtr<Linecallstatus>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetCallStatus(hcall.toInt(), lpcallstatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetConfRelatedCalls(hcall: UInt, lpcalllist: MutPtr<Linecalllist>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetConfRelatedCalls(hcall.toInt(), lpcalllist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetCountry(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: MutPtr<Linecountrylist>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetCountry(dwcountryid.toInt(), dwapiversion.toInt(), lplinecountrylist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetCountryA(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: MutPtr<Linecountrylist>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetCountryA(dwcountryid.toInt(), dwapiversion.toInt(), lplinecountrylist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetCountryW(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: MutPtr<Linecountrylist>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetCountryW(dwcountryid.toInt(), dwapiversion.toInt(), lplinecountrylist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetDevCaps(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: MutPtr<Linedevcaps>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetDevCaps(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lplinedevcaps.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetDevCapsA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: MutPtr<Linedevcaps>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetDevCapsA(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lplinedevcaps.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetDevCapsW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: MutPtr<Linedevcaps>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetDevCapsW(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lplinedevcaps.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetDevConfig(dwdeviceid: UInt, lpdeviceconfig: MutPtr<Varstring>, lpszdeviceclass: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetDevConfig(dwdeviceid.toInt(), lpdeviceconfig.rawAddress.toString(), lpszdeviceclass.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetDevConfigA(dwdeviceid: UInt, lpdeviceconfig: MutPtr<Varstring>, lpszdeviceclass: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetDevConfigA(dwdeviceid.toInt(), lpdeviceconfig.rawAddress.toString(), lpszdeviceclass.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetDevConfigW(dwdeviceid: UInt, lpdeviceconfig: MutPtr<Varstring>, lpszdeviceclass: Pcwstr): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetDevConfigW(dwdeviceid.toInt(), lpdeviceconfig.rawAddress.toString(), lpszdeviceclass.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetGroupListA(hline: UInt, lpgrouplist: MutPtr<Lineagentgrouplist>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetGroupListA(hline.toInt(), lpgrouplist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetGroupListW(hline: UInt, lpgrouplist: MutPtr<Lineagentgrouplist>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetGroupListW(hline.toInt(), lpgrouplist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetID(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: MutPtr<Varstring>, lpszdeviceclass: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetID(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), dwselect.toInt(), lpdeviceid.rawAddress.toString(), lpszdeviceclass.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetIDA(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: MutPtr<Varstring>, lpszdeviceclass: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetIDA(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), dwselect.toInt(), lpdeviceid.rawAddress.toString(), lpszdeviceclass.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetIDW(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: MutPtr<Varstring>, lpszdeviceclass: Pcwstr): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetIDW(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), dwselect.toInt(), lpdeviceid.rawAddress.toString(), lpszdeviceclass.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetIcon(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: MutPtr<Hicon>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetIcon(dwdeviceid.toInt(), lpszdeviceclass.rawAddress.toString(), lphicon.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetIconA(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: MutPtr<Hicon>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetIconA(dwdeviceid.toInt(), lpszdeviceclass.rawAddress.toString(), lphicon.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetIconW(dwdeviceid: UInt, lpszdeviceclass: Pcwstr, lphicon: MutPtr<Hicon>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetIconW(dwdeviceid.toInt(), lpszdeviceclass.rawAddress.toString(), lphicon.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetLineDevStatus(hline: UInt, lplinedevstatus: MutPtr<Linedevstatus>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetLineDevStatus(hline.toInt(), lplinedevstatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetLineDevStatusA(hline: UInt, lplinedevstatus: MutPtr<Linedevstatus>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetLineDevStatusA(hline.toInt(), lplinedevstatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetLineDevStatusW(hline: UInt, lplinedevstatus: MutPtr<Linedevstatus>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetLineDevStatusW(hline.toInt(), lplinedevstatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetMessage(hlineapp: UInt, lpmessage: MutPtr<Linemessage>, dwtimeout: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetMessage(hlineapp.toInt(), lpmessage.rawAddress.toString(), dwtimeout.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetNewCalls(hline: UInt, dwaddressid: UInt, dwselect: UInt, lpcalllist: MutPtr<Linecalllist>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetNewCalls(hline.toInt(), dwaddressid.toInt(), dwselect.toInt(), lpcalllist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetNumRings(hline: UInt, dwaddressid: UInt, lpdwnumrings: MutPtr<UInt>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetNumRings(hline.toInt(), dwaddressid.toInt(), lpdwnumrings.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetProviderList(dwapiversion: UInt, lpproviderlist: MutPtr<Lineproviderlist>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetProviderList(dwapiversion.toInt(), lpproviderlist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetProviderListA(dwapiversion: UInt, lpproviderlist: MutPtr<Lineproviderlist>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetProviderListA(dwapiversion.toInt(), lpproviderlist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetProviderListW(dwapiversion: UInt, lpproviderlist: MutPtr<Lineproviderlist>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetProviderListW(dwapiversion.toInt(), lpproviderlist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetProxyStatus(hlineapp: UInt, dwdeviceid: UInt, dwappapiversion: UInt, lplineproxyreqestlist: MutPtr<Lineproxyrequestlist>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetProxyStatus(hlineapp.toInt(), dwdeviceid.toInt(), dwappapiversion.toInt(), lplineproxyreqestlist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetQueueInfo(hline: UInt, dwqueueid: UInt, lplinequeueinfo: MutPtr<Linequeueinfo>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetQueueInfo(hline.toInt(), dwqueueid.toInt(), lplinequeueinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetQueueListA(hline: UInt, lpgroupid: MutPtr<Guid>, lpqueuelist: MutPtr<Linequeuelist>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetQueueListA(hline.toInt(), lpgroupid.rawAddress.toString(), lpqueuelist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetQueueListW(hline: UInt, lpgroupid: MutPtr<Guid>, lpqueuelist: MutPtr<Linequeuelist>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetQueueListW(hline.toInt(), lpgroupid.rawAddress.toString(), lpqueuelist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetRequest(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: MutPtr<CVoid>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetRequest(hlineapp.toInt(), dwrequestmode.toInt(), lprequestbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetRequestA(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: MutPtr<CVoid>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetRequestA(hlineapp.toInt(), dwrequestmode.toInt(), lprequestbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetRequestW(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: MutPtr<CVoid>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetRequestW(hlineapp.toInt(), dwrequestmode.toInt(), lprequestbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetStatusMessages(hline: UInt, lpdwlinestates: MutPtr<UInt>, lpdwaddressstates: MutPtr<UInt>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetStatusMessages(hline.toInt(), lpdwlinestates.rawAddress.toString(), lpdwaddressstates.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetTranslateCaps(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: MutPtr<Linetranslatecaps>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetTranslateCaps(hlineapp.toInt(), dwapiversion.toInt(), lptranslatecaps.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetTranslateCapsA(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: MutPtr<Linetranslatecaps>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetTranslateCapsA(hlineapp.toInt(), dwapiversion.toInt(), lptranslatecaps.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineGetTranslateCapsW(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: MutPtr<Linetranslatecaps>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineGetTranslateCapsW(hlineapp.toInt(), dwapiversion.toInt(), lptranslatecaps.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineHandoff(hcall: UInt, lpszfilename: Pcstr, dwmediamode: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineHandoff(hcall.toInt(), lpszfilename.rawAddress.toString(), dwmediamode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineHandoffA(hcall: UInt, lpszfilename: Pcstr, dwmediamode: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineHandoffA(hcall.toInt(), lpszfilename.rawAddress.toString(), dwmediamode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineHandoffW(hcall: UInt, lpszfilename: Pcwstr, dwmediamode: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineHandoffW(hcall.toInt(), lpszfilename.rawAddress.toString(), dwmediamode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineHold(hcall: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineHold(hcall.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineInitialize(lphlineapp: MutPtr<UInt>, hinstance: Hinstance, lpfncallback: Linecallback, lpszappname: Pcstr, lpdwnumdevs: MutPtr<UInt>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineInitialize(lphlineapp.rawAddress.toString(), hinstance.rawAddress.toString(), 0L.toString(), lpszappname.rawAddress.toString(), lpdwnumdevs.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineInitializeExA(lphlineapp: MutPtr<UInt>, hinstance: Hinstance, lpfncallback: Linecallback, lpszfriendlyappname: Pcstr, lpdwnumdevs: MutPtr<UInt>, lpdwapiversion: MutPtr<UInt>, lplineinitializeexparams: MutPtr<Lineinitializeexparams>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineInitializeExA(lphlineapp.rawAddress.toString(), hinstance.rawAddress.toString(), 0L.toString(), lpszfriendlyappname.rawAddress.toString(), lpdwnumdevs.rawAddress.toString(), lpdwapiversion.rawAddress.toString(), lplineinitializeexparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineInitializeExW(lphlineapp: MutPtr<UInt>, hinstance: Hinstance, lpfncallback: Linecallback, lpszfriendlyappname: Pcwstr, lpdwnumdevs: MutPtr<UInt>, lpdwapiversion: MutPtr<UInt>, lplineinitializeexparams: MutPtr<Lineinitializeexparams>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineInitializeExW(lphlineapp.rawAddress.toString(), hinstance.rawAddress.toString(), 0L.toString(), lpszfriendlyappname.rawAddress.toString(), lpdwnumdevs.rawAddress.toString(), lpdwapiversion.rawAddress.toString(), lplineinitializeexparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineMakeCall(hline: UInt, lphcall: MutPtr<UInt>, lpszdestaddress: Pcstr, dwcountrycode: UInt, lpcallparams: ConstPtr<Linecallparams>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineMakeCall(hline.toInt(), lphcall.rawAddress.toString(), lpszdestaddress.rawAddress.toString(), dwcountrycode.toInt(), lpcallparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineMakeCallA(hline: UInt, lphcall: MutPtr<UInt>, lpszdestaddress: Pcstr, dwcountrycode: UInt, lpcallparams: ConstPtr<Linecallparams>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineMakeCallA(hline.toInt(), lphcall.rawAddress.toString(), lpszdestaddress.rawAddress.toString(), dwcountrycode.toInt(), lpcallparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineMakeCallW(hline: UInt, lphcall: MutPtr<UInt>, lpszdestaddress: Pcwstr, dwcountrycode: UInt, lpcallparams: ConstPtr<Linecallparams>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineMakeCallW(hline.toInt(), lphcall.rawAddress.toString(), lpszdestaddress.rawAddress.toString(), dwcountrycode.toInt(), lpcallparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineMonitorDigits(hcall: UInt, dwdigitmodes: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineMonitorDigits(hcall.toInt(), dwdigitmodes.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineMonitorMedia(hcall: UInt, dwmediamodes: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineMonitorMedia(hcall.toInt(), dwmediamodes.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineMonitorTones(hcall: UInt, lptonelist: ConstPtr<Linemonitortone>, dwnumentries: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineMonitorTones(hcall.toInt(), lptonelist.rawAddress.toString(), dwnumentries.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineNegotiateAPIVersion(hlineapp: UInt, dwdeviceid: UInt, dwapilowversion: UInt, dwapihighversion: UInt, lpdwapiversion: MutPtr<UInt>, lpextensionid: MutPtr<Lineextensionid>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineNegotiateAPIVersion(hlineapp.toInt(), dwdeviceid.toInt(), dwapilowversion.toInt(), dwapihighversion.toInt(), lpdwapiversion.rawAddress.toString(), lpextensionid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineNegotiateExtVersion(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextlowversion: UInt, dwexthighversion: UInt, lpdwextversion: MutPtr<UInt>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineNegotiateExtVersion(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextlowversion.toInt(), dwexthighversion.toInt(), lpdwextversion.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineOpen(hlineapp: UInt, dwdeviceid: UInt, lphline: MutPtr<UInt>, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: ConstPtr<Linecallparams>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineOpen(hlineapp.toInt(), dwdeviceid.toInt(), lphline.rawAddress.toString(), dwapiversion.toInt(), dwextversion.toInt(), dwcallbackinstance.toString(), dwprivileges.toInt(), dwmediamodes.toInt(), lpcallparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineOpenA(hlineapp: UInt, dwdeviceid: UInt, lphline: MutPtr<UInt>, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: ConstPtr<Linecallparams>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineOpenA(hlineapp.toInt(), dwdeviceid.toInt(), lphline.rawAddress.toString(), dwapiversion.toInt(), dwextversion.toInt(), dwcallbackinstance.toString(), dwprivileges.toInt(), dwmediamodes.toInt(), lpcallparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineOpenW(hlineapp: UInt, dwdeviceid: UInt, lphline: MutPtr<UInt>, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: ConstPtr<Linecallparams>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineOpenW(hlineapp.toInt(), dwdeviceid.toInt(), lphline.rawAddress.toString(), dwapiversion.toInt(), dwextversion.toInt(), dwcallbackinstance.toString(), dwprivileges.toInt(), dwmediamodes.toInt(), lpcallparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun linePark(hcall: UInt, dwparkmode: UInt, lpszdiraddress: Pcstr, lpnondiraddress: MutPtr<Varstring>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLinePark(hcall.toInt(), dwparkmode.toInt(), lpszdiraddress.rawAddress.toString(), lpnondiraddress.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineParkA(hcall: UInt, dwparkmode: UInt, lpszdiraddress: Pcstr, lpnondiraddress: MutPtr<Varstring>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineParkA(hcall.toInt(), dwparkmode.toInt(), lpszdiraddress.rawAddress.toString(), lpnondiraddress.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineParkW(hcall: UInt, dwparkmode: UInt, lpszdiraddress: Pcwstr, lpnondiraddress: MutPtr<Varstring>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineParkW(hcall.toInt(), dwparkmode.toInt(), lpszdiraddress.rawAddress.toString(), lpnondiraddress.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun linePickup(hline: UInt, dwaddressid: UInt, lphcall: MutPtr<UInt>, lpszdestaddress: Pcstr, lpszgroupid: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLinePickup(hline.toInt(), dwaddressid.toInt(), lphcall.rawAddress.toString(), lpszdestaddress.rawAddress.toString(), lpszgroupid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun linePickupA(hline: UInt, dwaddressid: UInt, lphcall: MutPtr<UInt>, lpszdestaddress: Pcstr, lpszgroupid: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLinePickupA(hline.toInt(), dwaddressid.toInt(), lphcall.rawAddress.toString(), lpszdestaddress.rawAddress.toString(), lpszgroupid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun linePickupW(hline: UInt, dwaddressid: UInt, lphcall: MutPtr<UInt>, lpszdestaddress: Pcwstr, lpszgroupid: Pcwstr): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLinePickupW(hline.toInt(), dwaddressid.toInt(), lphcall.rawAddress.toString(), lpszdestaddress.rawAddress.toString(), lpszgroupid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun linePrepareAddToConference(hconfcall: UInt, lphconsultcall: MutPtr<UInt>, lpcallparams: ConstPtr<Linecallparams>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLinePrepareAddToConference(hconfcall.toInt(), lphconsultcall.rawAddress.toString(), lpcallparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun linePrepareAddToConferenceA(hconfcall: UInt, lphconsultcall: MutPtr<UInt>, lpcallparams: ConstPtr<Linecallparams>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLinePrepareAddToConferenceA(hconfcall.toInt(), lphconsultcall.rawAddress.toString(), lpcallparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun linePrepareAddToConferenceW(hconfcall: UInt, lphconsultcall: MutPtr<UInt>, lpcallparams: ConstPtr<Linecallparams>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLinePrepareAddToConferenceW(hconfcall.toInt(), lphconsultcall.rawAddress.toString(), lpcallparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineProxyMessage(hline: UInt, hcall: UInt, dwmsg: UInt, dwparam1: UInt, dwparam2: UInt, dwparam3: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineProxyMessage(hline.toInt(), hcall.toInt(), dwmsg.toInt(), dwparam1.toInt(), dwparam2.toInt(), dwparam3.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineProxyResponse(hline: UInt, lpproxyrequest: MutPtr<Lineproxyrequest>, dwresult: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineProxyResponse(hline.toInt(), lpproxyrequest.rawAddress.toString(), dwresult.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineRedirect(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineRedirect(hcall.toInt(), lpszdestaddress.rawAddress.toString(), dwcountrycode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineRedirectA(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineRedirectA(hcall.toInt(), lpszdestaddress.rawAddress.toString(), dwcountrycode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineRedirectW(hcall: UInt, lpszdestaddress: Pcwstr, dwcountrycode: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineRedirectW(hcall.toInt(), lpszdestaddress.rawAddress.toString(), dwcountrycode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineRegisterRequestRecipient(hlineapp: UInt, dwregistrationinstance: UInt, dwrequestmode: UInt, benable: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineRegisterRequestRecipient(hlineapp.toInt(), dwregistrationinstance.toInt(), dwrequestmode.toInt(), benable.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineReleaseUserUserInfo(hcall: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineReleaseUserUserInfo(hcall.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineRemoveFromConference(hcall: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineRemoveFromConference(hcall.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineRemoveProvider(dwpermanentproviderid: UInt, hwndowner: Hwnd): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineRemoveProvider(dwpermanentproviderid.toInt(), hwndowner.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSecureCall(hcall: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineSecureCall(hcall.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSendUserUserInfo(hcall: UInt, lpsuseruserinfo: Pcstr, dwsize: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineSendUserUserInfo(hcall.toInt(), lpsuseruserinfo.rawAddress.toString(), dwsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetAgentActivity(hline: UInt, dwaddressid: UInt, dwactivityid: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineSetAgentActivity(hline.toInt(), dwaddressid.toInt(), dwactivityid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetAgentGroup(hline: UInt, dwaddressid: UInt, lpagentgrouplist: MutPtr<Lineagentgrouplist>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineSetAgentGroup(hline.toInt(), dwaddressid.toInt(), lpagentgrouplist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetAgentMeasurementPeriod(hline: UInt, hagent: UInt, dwmeasurementperiod: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineSetAgentMeasurementPeriod(hline.toInt(), hagent.toInt(), dwmeasurementperiod.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetAgentSessionState(hline: UInt, hagentsession: UInt, dwagentsessionstate: UInt, dwnextagentsessionstate: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineSetAgentSessionState(hline.toInt(), hagentsession.toInt(), dwagentsessionstate.toInt(), dwnextagentsessionstate.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetAgentState(hline: UInt, dwaddressid: UInt, dwagentstate: UInt, dwnextagentstate: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineSetAgentState(hline.toInt(), dwaddressid.toInt(), dwagentstate.toInt(), dwnextagentstate.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetAgentStateEx(hline: UInt, hagent: UInt, dwagentstate: UInt, dwnextagentstate: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineSetAgentStateEx(hline.toInt(), hagent.toInt(), dwagentstate.toInt(), dwnextagentstate.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetAppPriority(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: MutPtr<Lineextensionid>, dwrequestmode: UInt, lpszextensionname: Pcstr, dwpriority: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineSetAppPriority(lpszappfilename.rawAddress.toString(), dwmediamode.toInt(), lpextensionid.rawAddress.toString(), dwrequestmode.toInt(), lpszextensionname.rawAddress.toString(), dwpriority.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetAppPriorityA(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: MutPtr<Lineextensionid>, dwrequestmode: UInt, lpszextensionname: Pcstr, dwpriority: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineSetAppPriorityA(lpszappfilename.rawAddress.toString(), dwmediamode.toInt(), lpextensionid.rawAddress.toString(), dwrequestmode.toInt(), lpszextensionname.rawAddress.toString(), dwpriority.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetAppPriorityW(lpszappfilename: Pcwstr, dwmediamode: UInt, lpextensionid: MutPtr<Lineextensionid>, dwrequestmode: UInt, lpszextensionname: Pcwstr, dwpriority: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineSetAppPriorityW(lpszappfilename.rawAddress.toString(), dwmediamode.toInt(), lpextensionid.rawAddress.toString(), dwrequestmode.toInt(), lpszextensionname.rawAddress.toString(), dwpriority.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetAppSpecific(hcall: UInt, dwappspecific: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineSetAppSpecific(hcall.toInt(), dwappspecific.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetCallData(hcall: UInt, lpcalldata: MutPtr<CVoid>, dwsize: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineSetCallData(hcall.toInt(), lpcalldata.rawAddress.toString(), dwsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetCallParams(hcall: UInt, dwbearermode: UInt, dwminrate: UInt, dwmaxrate: UInt, lpdialparams: ConstPtr<Linedialparams>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineSetCallParams(hcall.toInt(), dwbearermode.toInt(), dwminrate.toInt(), dwmaxrate.toInt(), lpdialparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetCallPrivilege(hcall: UInt, dwcallprivilege: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineSetCallPrivilege(hcall.toInt(), dwcallprivilege.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetCallQualityOfService(hcall: UInt, lpsendingflowspec: MutPtr<CVoid>, dwsendingflowspecsize: UInt, lpreceivingflowspec: MutPtr<CVoid>, dwreceivingflowspecsize: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineSetCallQualityOfService(hcall.toInt(), lpsendingflowspec.rawAddress.toString(), dwsendingflowspecsize.toInt(), lpreceivingflowspec.rawAddress.toString(), dwreceivingflowspecsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetCallTreatment(hcall: UInt, dwtreatment: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineSetCallTreatment(hcall.toInt(), dwtreatment.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetCurrentLocation(hlineapp: UInt, dwlocation: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineSetCurrentLocation(hlineapp.toInt(), dwlocation.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetDevConfig(dwdeviceid: UInt, lpdeviceconfig: ConstPtr<CVoid>, dwsize: UInt, lpszdeviceclass: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineSetDevConfig(dwdeviceid.toInt(), lpdeviceconfig.rawAddress.toString(), dwsize.toInt(), lpszdeviceclass.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetDevConfigA(dwdeviceid: UInt, lpdeviceconfig: ConstPtr<CVoid>, dwsize: UInt, lpszdeviceclass: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineSetDevConfigA(dwdeviceid.toInt(), lpdeviceconfig.rawAddress.toString(), dwsize.toInt(), lpszdeviceclass.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetDevConfigW(dwdeviceid: UInt, lpdeviceconfig: ConstPtr<CVoid>, dwsize: UInt, lpszdeviceclass: Pcwstr): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineSetDevConfigW(dwdeviceid.toInt(), lpdeviceconfig.rawAddress.toString(), dwsize.toInt(), lpszdeviceclass.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetLineDevStatus(hline: UInt, dwstatustochange: UInt, fstatus: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineSetLineDevStatus(hline.toInt(), dwstatustochange.toInt(), fstatus.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetMediaControl(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdigitlist: ConstPtr<Linemediacontroldigit>, dwdigitnumentries: UInt, lpmedialist: ConstPtr<Linemediacontrolmedia>, dwmedianumentries: UInt, lptonelist: ConstPtr<Linemediacontroltone>, dwtonenumentries: UInt, lpcallstatelist: ConstPtr<Linemediacontrolcallstate>, dwcallstatenumentries: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineSetMediaControl(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), dwselect.toInt(), lpdigitlist.rawAddress.toString(), dwdigitnumentries.toInt(), lpmedialist.rawAddress.toString(), dwmedianumentries.toInt(), lptonelist.rawAddress.toString(), dwtonenumentries.toInt(), lpcallstatelist.rawAddress.toString(), dwcallstatenumentries.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetMediaMode(hcall: UInt, dwmediamodes: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineSetMediaMode(hcall.toInt(), dwmediamodes.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetNumRings(hline: UInt, dwaddressid: UInt, dwnumrings: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineSetNumRings(hline.toInt(), dwaddressid.toInt(), dwnumrings.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetQueueMeasurementPeriod(hline: UInt, dwqueueid: UInt, dwmeasurementperiod: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineSetQueueMeasurementPeriod(hline.toInt(), dwqueueid.toInt(), dwmeasurementperiod.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetStatusMessages(hline: UInt, dwlinestates: UInt, dwaddressstates: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineSetStatusMessages(hline.toInt(), dwlinestates.toInt(), dwaddressstates.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetTerminal(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, dwterminalmodes: UInt, dwterminalid: UInt, benable: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineSetTerminal(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), dwselect.toInt(), dwterminalmodes.toInt(), dwterminalid.toInt(), benable.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetTollList(hlineapp: UInt, dwdeviceid: UInt, lpszaddressin: Pcstr, dwtolllistoption: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineSetTollList(hlineapp.toInt(), dwdeviceid.toInt(), lpszaddressin.rawAddress.toString(), dwtolllistoption.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetTollListA(hlineapp: UInt, dwdeviceid: UInt, lpszaddressin: Pcstr, dwtolllistoption: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineSetTollListA(hlineapp.toInt(), dwdeviceid.toInt(), lpszaddressin.rawAddress.toString(), dwtolllistoption.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetTollListW(hlineapp: UInt, dwdeviceid: UInt, lpszaddressinw: Pcwstr, dwtolllistoption: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineSetTollListW(hlineapp.toInt(), dwdeviceid.toInt(), lpszaddressinw.rawAddress.toString(), dwtolllistoption.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetupConference(hcall: UInt, hline: UInt, lphconfcall: MutPtr<UInt>, lphconsultcall: MutPtr<UInt>, dwnumparties: UInt, lpcallparams: ConstPtr<Linecallparams>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineSetupConference(hcall.toInt(), hline.toInt(), lphconfcall.rawAddress.toString(), lphconsultcall.rawAddress.toString(), dwnumparties.toInt(), lpcallparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetupConferenceA(hcall: UInt, hline: UInt, lphconfcall: MutPtr<UInt>, lphconsultcall: MutPtr<UInt>, dwnumparties: UInt, lpcallparams: ConstPtr<Linecallparams>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineSetupConferenceA(hcall.toInt(), hline.toInt(), lphconfcall.rawAddress.toString(), lphconsultcall.rawAddress.toString(), dwnumparties.toInt(), lpcallparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetupConferenceW(hcall: UInt, hline: UInt, lphconfcall: MutPtr<UInt>, lphconsultcall: MutPtr<UInt>, dwnumparties: UInt, lpcallparams: ConstPtr<Linecallparams>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineSetupConferenceW(hcall.toInt(), hline.toInt(), lphconfcall.rawAddress.toString(), lphconsultcall.rawAddress.toString(), dwnumparties.toInt(), lpcallparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetupTransfer(hcall: UInt, lphconsultcall: MutPtr<UInt>, lpcallparams: ConstPtr<Linecallparams>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineSetupTransfer(hcall.toInt(), lphconsultcall.rawAddress.toString(), lpcallparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetupTransferA(hcall: UInt, lphconsultcall: MutPtr<UInt>, lpcallparams: ConstPtr<Linecallparams>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineSetupTransferA(hcall.toInt(), lphconsultcall.rawAddress.toString(), lpcallparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSetupTransferW(hcall: UInt, lphconsultcall: MutPtr<UInt>, lpcallparams: ConstPtr<Linecallparams>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineSetupTransferW(hcall.toInt(), lphconsultcall.rawAddress.toString(), lpcallparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineShutdown(hlineapp: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineShutdown(hlineapp.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineSwapHold(hactivecall: UInt, hheldcall: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineSwapHold(hactivecall.toInt(), hheldcall.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineTranslateAddress(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: Pcstr, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: MutPtr<Linetranslateoutput>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineTranslateAddress(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), lpszaddressin.rawAddress.toString(), dwcard.toInt(), dwtranslateoptions.toInt(), lptranslateoutput.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineTranslateAddressA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: Pcstr, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: MutPtr<Linetranslateoutput>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineTranslateAddressA(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), lpszaddressin.rawAddress.toString(), dwcard.toInt(), dwtranslateoptions.toInt(), lptranslateoutput.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineTranslateAddressW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: Pcwstr, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: MutPtr<Linetranslateoutput>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineTranslateAddressW(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), lpszaddressin.rawAddress.toString(), dwcard.toInt(), dwtranslateoptions.toInt(), lptranslateoutput.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineTranslateDialog(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: Hwnd, lpszaddressin: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineTranslateDialog(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), hwndowner.rawAddress.toString(), lpszaddressin.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineTranslateDialogA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: Hwnd, lpszaddressin: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineTranslateDialogA(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), hwndowner.rawAddress.toString(), lpszaddressin.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineTranslateDialogW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: Hwnd, lpszaddressin: Pcwstr): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineTranslateDialogW(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), hwndowner.rawAddress.toString(), lpszaddressin.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineUncompleteCall(hline: UInt, dwcompletionid: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineUncompleteCall(hline.toInt(), dwcompletionid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineUnhold(hcall: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineUnhold(hcall.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineUnpark(hline: UInt, dwaddressid: UInt, lphcall: MutPtr<UInt>, lpszdestaddress: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineUnpark(hline.toInt(), dwaddressid.toInt(), lphcall.rawAddress.toString(), lpszdestaddress.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineUnparkA(hline: UInt, dwaddressid: UInt, lphcall: MutPtr<UInt>, lpszdestaddress: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineUnparkA(hline.toInt(), dwaddressid.toInt(), lphcall.rawAddress.toString(), lpszdestaddress.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineUnparkW(hline: UInt, dwaddressid: UInt, lphcall: MutPtr<UInt>, lpszdestaddress: Pcwstr): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiLineUnparkW(hline.toInt(), dwaddressid.toInt(), lphcall.rawAddress.toString(), lpszdestaddress.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneClose(hphone: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneClose(hphone.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneConfigDialog(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneConfigDialog(dwdeviceid.toInt(), hwndowner.rawAddress.toString(), lpszdeviceclass.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneConfigDialogA(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneConfigDialogA(dwdeviceid.toInt(), hwndowner.rawAddress.toString(), lpszdeviceclass.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneConfigDialogW(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcwstr): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneConfigDialogW(dwdeviceid.toInt(), hwndowner.rawAddress.toString(), lpszdeviceclass.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneDevSpecific(hphone: UInt, lpparams: MutPtr<CVoid>, dwsize: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneDevSpecific(hphone.toInt(), lpparams.rawAddress.toString(), dwsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetButtonInfo(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: MutPtr<Phonebuttoninfo>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneGetButtonInfo(hphone.toInt(), dwbuttonlampid.toInt(), lpbuttoninfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetButtonInfoA(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: MutPtr<Phonebuttoninfo>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneGetButtonInfoA(hphone.toInt(), dwbuttonlampid.toInt(), lpbuttoninfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetButtonInfoW(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: MutPtr<Phonebuttoninfo>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneGetButtonInfoW(hphone.toInt(), dwbuttonlampid.toInt(), lpbuttoninfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetData(hphone: UInt, dwdataid: UInt, lpdata: MutPtr<CVoid>, dwsize: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneGetData(hphone.toInt(), dwdataid.toInt(), lpdata.rawAddress.toString(), dwsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetDevCaps(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: MutPtr<Phonecaps>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneGetDevCaps(hphoneapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lpphonecaps.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetDevCapsA(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: MutPtr<Phonecaps>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneGetDevCapsA(hphoneapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lpphonecaps.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetDevCapsW(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: MutPtr<Phonecaps>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneGetDevCapsW(hphoneapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lpphonecaps.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetDisplay(hphone: UInt, lpdisplay: MutPtr<Varstring>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneGetDisplay(hphone.toInt(), lpdisplay.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetGain(hphone: UInt, dwhookswitchdev: UInt, lpdwgain: MutPtr<UInt>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneGetGain(hphone.toInt(), dwhookswitchdev.toInt(), lpdwgain.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetHookSwitch(hphone: UInt, lpdwhookswitchdevs: MutPtr<UInt>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneGetHookSwitch(hphone.toInt(), lpdwhookswitchdevs.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetID(hphone: UInt, lpdeviceid: MutPtr<Varstring>, lpszdeviceclass: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneGetID(hphone.toInt(), lpdeviceid.rawAddress.toString(), lpszdeviceclass.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetIDA(hphone: UInt, lpdeviceid: MutPtr<Varstring>, lpszdeviceclass: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneGetIDA(hphone.toInt(), lpdeviceid.rawAddress.toString(), lpszdeviceclass.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetIDW(hphone: UInt, lpdeviceid: MutPtr<Varstring>, lpszdeviceclass: Pcwstr): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneGetIDW(hphone.toInt(), lpdeviceid.rawAddress.toString(), lpszdeviceclass.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetIcon(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: MutPtr<Hicon>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneGetIcon(dwdeviceid.toInt(), lpszdeviceclass.rawAddress.toString(), lphicon.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetIconA(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: MutPtr<Hicon>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneGetIconA(dwdeviceid.toInt(), lpszdeviceclass.rawAddress.toString(), lphicon.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetIconW(dwdeviceid: UInt, lpszdeviceclass: Pcwstr, lphicon: MutPtr<Hicon>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneGetIconW(dwdeviceid.toInt(), lpszdeviceclass.rawAddress.toString(), lphicon.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetLamp(hphone: UInt, dwbuttonlampid: UInt, lpdwlampmode: MutPtr<UInt>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneGetLamp(hphone.toInt(), dwbuttonlampid.toInt(), lpdwlampmode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetMessage(hphoneapp: UInt, lpmessage: MutPtr<Phonemessage>, dwtimeout: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneGetMessage(hphoneapp.toInt(), lpmessage.rawAddress.toString(), dwtimeout.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetRing(hphone: UInt, lpdwringmode: MutPtr<UInt>, lpdwvolume: MutPtr<UInt>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneGetRing(hphone.toInt(), lpdwringmode.rawAddress.toString(), lpdwvolume.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetStatus(hphone: UInt, lpphonestatus: MutPtr<Phonestatus>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneGetStatus(hphone.toInt(), lpphonestatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetStatusA(hphone: UInt, lpphonestatus: MutPtr<Phonestatus>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneGetStatusA(hphone.toInt(), lpphonestatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetStatusMessages(hphone: UInt, lpdwphonestates: MutPtr<UInt>, lpdwbuttonmodes: MutPtr<UInt>, lpdwbuttonstates: MutPtr<UInt>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneGetStatusMessages(hphone.toInt(), lpdwphonestates.rawAddress.toString(), lpdwbuttonmodes.rawAddress.toString(), lpdwbuttonstates.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetStatusW(hphone: UInt, lpphonestatus: MutPtr<Phonestatus>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneGetStatusW(hphone.toInt(), lpphonestatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneGetVolume(hphone: UInt, dwhookswitchdev: UInt, lpdwvolume: MutPtr<UInt>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneGetVolume(hphone.toInt(), dwhookswitchdev.toInt(), lpdwvolume.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneInitialize(lphphoneapp: MutPtr<UInt>, hinstance: Hinstance, lpfncallback: Phonecallback, lpszappname: Pcstr, lpdwnumdevs: MutPtr<UInt>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneInitialize(lphphoneapp.rawAddress.toString(), hinstance.rawAddress.toString(), 0L.toString(), lpszappname.rawAddress.toString(), lpdwnumdevs.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneInitializeExA(lphphoneapp: MutPtr<UInt>, hinstance: Hinstance, lpfncallback: Phonecallback, lpszfriendlyappname: Pcstr, lpdwnumdevs: MutPtr<UInt>, lpdwapiversion: MutPtr<UInt>, lpphoneinitializeexparams: MutPtr<Phoneinitializeexparams>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneInitializeExA(lphphoneapp.rawAddress.toString(), hinstance.rawAddress.toString(), 0L.toString(), lpszfriendlyappname.rawAddress.toString(), lpdwnumdevs.rawAddress.toString(), lpdwapiversion.rawAddress.toString(), lpphoneinitializeexparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneInitializeExW(lphphoneapp: MutPtr<UInt>, hinstance: Hinstance, lpfncallback: Phonecallback, lpszfriendlyappname: Pcwstr, lpdwnumdevs: MutPtr<UInt>, lpdwapiversion: MutPtr<UInt>, lpphoneinitializeexparams: MutPtr<Phoneinitializeexparams>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneInitializeExW(lphphoneapp.rawAddress.toString(), hinstance.rawAddress.toString(), 0L.toString(), lpszfriendlyappname.rawAddress.toString(), lpdwnumdevs.rawAddress.toString(), lpdwapiversion.rawAddress.toString(), lpphoneinitializeexparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneNegotiateAPIVersion(hphoneapp: UInt, dwdeviceid: UInt, dwapilowversion: UInt, dwapihighversion: UInt, lpdwapiversion: MutPtr<UInt>, lpextensionid: MutPtr<Phoneextensionid>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneNegotiateAPIVersion(hphoneapp.toInt(), dwdeviceid.toInt(), dwapilowversion.toInt(), dwapihighversion.toInt(), lpdwapiversion.rawAddress.toString(), lpextensionid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneNegotiateExtVersion(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextlowversion: UInt, dwexthighversion: UInt, lpdwextversion: MutPtr<UInt>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneNegotiateExtVersion(hphoneapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextlowversion.toInt(), dwexthighversion.toInt(), lpdwextversion.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneOpen(hphoneapp: UInt, dwdeviceid: UInt, lphphone: MutPtr<UInt>, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivilege: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneOpen(hphoneapp.toInt(), dwdeviceid.toInt(), lphphone.rawAddress.toString(), dwapiversion.toInt(), dwextversion.toInt(), dwcallbackinstance.toString(), dwprivilege.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneSetButtonInfo(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: ConstPtr<Phonebuttoninfo>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneSetButtonInfo(hphone.toInt(), dwbuttonlampid.toInt(), lpbuttoninfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneSetButtonInfoA(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: ConstPtr<Phonebuttoninfo>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneSetButtonInfoA(hphone.toInt(), dwbuttonlampid.toInt(), lpbuttoninfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneSetButtonInfoW(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: ConstPtr<Phonebuttoninfo>): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneSetButtonInfoW(hphone.toInt(), dwbuttonlampid.toInt(), lpbuttoninfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneSetData(hphone: UInt, dwdataid: UInt, lpdata: ConstPtr<CVoid>, dwsize: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneSetData(hphone.toInt(), dwdataid.toInt(), lpdata.rawAddress.toString(), dwsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneSetDisplay(hphone: UInt, dwrow: UInt, dwcolumn: UInt, lpsdisplay: Pcstr, dwsize: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneSetDisplay(hphone.toInt(), dwrow.toInt(), dwcolumn.toInt(), lpsdisplay.rawAddress.toString(), dwsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneSetGain(hphone: UInt, dwhookswitchdev: UInt, dwgain: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneSetGain(hphone.toInt(), dwhookswitchdev.toInt(), dwgain.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneSetHookSwitch(hphone: UInt, dwhookswitchdevs: UInt, dwhookswitchmode: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneSetHookSwitch(hphone.toInt(), dwhookswitchdevs.toInt(), dwhookswitchmode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneSetLamp(hphone: UInt, dwbuttonlampid: UInt, dwlampmode: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneSetLamp(hphone.toInt(), dwbuttonlampid.toInt(), dwlampmode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneSetRing(hphone: UInt, dwringmode: UInt, dwvolume: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneSetRing(hphone.toInt(), dwringmode.toInt(), dwvolume.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneSetStatusMessages(hphone: UInt, dwphonestates: UInt, dwbuttonmodes: UInt, dwbuttonstates: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneSetStatusMessages(hphone.toInt(), dwphonestates.toInt(), dwbuttonmodes.toInt(), dwbuttonstates.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneSetVolume(hphone: UInt, dwhookswitchdev: UInt, dwvolume: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneSetVolume(hphone.toInt(), dwhookswitchdev.toInt(), dwvolume.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun phoneShutdown(hphoneapp: UInt): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiPhoneShutdown(hphoneapp.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tapiGetLocationInfo(lpszcountrycode: Pstr, lpszcitycode: Pstr): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiTapiGetLocationInfo(lpszcountrycode.rawAddress.toString(), lpszcitycode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tapiGetLocationInfoA(lpszcountrycode: Pstr, lpszcitycode: Pstr): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiTapiGetLocationInfoA(lpszcountrycode.rawAddress.toString(), lpszcitycode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tapiGetLocationInfoW(lpszcountrycodew: Pwstr, lpszcitycodew: Pwstr): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiTapiGetLocationInfoW(lpszcountrycodew.rawAddress.toString(), lpszcitycodew.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tapiRequestDrop(hwnd: Hwnd, wrequestid: Wparam): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiTapiRequestDrop(hwnd.rawAddress.toString(), wrequestid.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tapiRequestMakeCall(lpszdestaddress: Pcstr, lpszappname: Pcstr, lpszcalledparty: Pcstr, lpszcomment: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiTapiRequestMakeCall(lpszdestaddress.rawAddress.toString(), lpszappname.rawAddress.toString(), lpszcalledparty.rawAddress.toString(), lpszcomment.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tapiRequestMakeCallA(lpszdestaddress: Pcstr, lpszappname: Pcstr, lpszcalledparty: Pcstr, lpszcomment: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiTapiRequestMakeCallA(lpszdestaddress.rawAddress.toString(), lpszappname.rawAddress.toString(), lpszcalledparty.rawAddress.toString(), lpszcomment.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tapiRequestMakeCallW(lpszdestaddress: Pcwstr, lpszappname: Pcwstr, lpszcalledparty: Pcwstr, lpszcomment: Pcwstr): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiTapiRequestMakeCallW(lpszdestaddress.rawAddress.toString(), lpszappname.rawAddress.toString(), lpszcalledparty.rawAddress.toString(), lpszcomment.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tapiRequestMediaCall(hwnd: Hwnd, wrequestid: Wparam, lpszdeviceclass: Pcstr, lpdeviceid: Pcstr, dwsize: UInt, dwsecure: UInt, lpszdestaddress: Pcstr, lpszappname: Pcstr, lpszcalledparty: Pcstr, lpszcomment: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiTapiRequestMediaCall(hwnd.rawAddress.toString(), wrequestid.toString(), lpszdeviceclass.rawAddress.toString(), lpdeviceid.rawAddress.toString(), dwsize.toInt(), dwsecure.toInt(), lpszdestaddress.rawAddress.toString(), lpszappname.rawAddress.toString(), lpszcalledparty.rawAddress.toString(), lpszcomment.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tapiRequestMediaCallA(hwnd: Hwnd, wrequestid: Wparam, lpszdeviceclass: Pcstr, lpdeviceid: Pcstr, dwsize: UInt, dwsecure: UInt, lpszdestaddress: Pcstr, lpszappname: Pcstr, lpszcalledparty: Pcstr, lpszcomment: Pcstr): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiTapiRequestMediaCallA(hwnd.rawAddress.toString(), wrequestid.toString(), lpszdeviceclass.rawAddress.toString(), lpdeviceid.rawAddress.toString(), dwsize.toInt(), dwsecure.toInt(), lpszdestaddress.rawAddress.toString(), lpszappname.rawAddress.toString(), lpszcalledparty.rawAddress.toString(), lpszcomment.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tapiRequestMediaCallW(hwnd: Hwnd, wrequestid: Wparam, lpszdeviceclass: Pcwstr, lpdeviceid: Pcwstr, dwsize: UInt, dwsecure: UInt, lpszdestaddress: Pcwstr, lpszappname: Pcwstr, lpszcalledparty: Pcwstr, lpszcomment: Pcwstr): Int =
    if (windowsWin32DevicesTapiNapiAddon != null) (windowsWin32DevicesTapiNapiAddon.windowssysWindowsWin32DevicesTapiTapiRequestMediaCallW(hwnd.rawAddress.toString(), wrequestid.toString(), lpszdeviceclass.rawAddress.toString(), lpdeviceid.rawAddress.toString(), dwsize.toInt(), dwsecure.toInt(), lpszdestaddress.rawAddress.toString(), lpszappname.rawAddress.toString(), lpszcalledparty.rawAddress.toString(), lpszcomment.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
