@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.tapi

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.WPARAM

private val _windowsWin32DevicesTapiNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun GetTnefStreamCodepage(lpstream: Long, lpulcodepage: Long, lpulsubcodepage: Long): HRESULT =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_GetTnefStreamCodepage(lpstream.toString(), lpulcodepage.toString(), lpulsubcodepage.toString()) as Int) else 0

public actual fun OpenTnefStream(lpvsupport: Long, lpstream: Long, lpszstreamname: Long, ulflags: UInt, lpmessage: Long, wkeyval: UShort, lpptnef: Long): HRESULT =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_OpenTnefStream(lpvsupport.toString(), lpstream.toString(), lpszstreamname.toString(), ulflags.toInt(), lpmessage.toString(), wkeyval.toInt(), lpptnef.toString()) as Int) else 0

public actual fun OpenTnefStreamEx(lpvsupport: Long, lpstream: Long, lpszstreamname: Long, ulflags: UInt, lpmessage: Long, wkeyval: UShort, lpadressbook: Long, lpptnef: Long): HRESULT =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_OpenTnefStreamEx(lpvsupport.toString(), lpstream.toString(), lpszstreamname.toString(), ulflags.toInt(), lpmessage.toString(), wkeyval.toInt(), lpadressbook.toString(), lpptnef.toString()) as Int) else 0

public actual fun lineAccept(hcall: UInt, lpsuseruserinfo: PCSTR, dwsize: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineAccept(hcall.toInt(), lpsuseruserinfo.toString(), dwsize.toInt()) as Int) else 0

public actual fun lineAddProvider(lpszproviderfilename: PCSTR, hwndowner: HWND, lpdwpermanentproviderid: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineAddProvider(lpszproviderfilename.toString(), hwndowner.toString(), lpdwpermanentproviderid.toString()) as Int) else 0

public actual fun lineAddProviderA(lpszproviderfilename: PCSTR, hwndowner: HWND, lpdwpermanentproviderid: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineAddProviderA(lpszproviderfilename.toString(), hwndowner.toString(), lpdwpermanentproviderid.toString()) as Int) else 0

public actual fun lineAddProviderW(lpszproviderfilename: PCWSTR, hwndowner: HWND, lpdwpermanentproviderid: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineAddProviderW(lpszproviderfilename.toString(), hwndowner.toString(), lpdwpermanentproviderid.toString()) as Int) else 0

public actual fun lineAddToConference(hconfcall: UInt, hconsultcall: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineAddToConference(hconfcall.toInt(), hconsultcall.toInt()) as Int) else 0

public actual fun lineAgentSpecific(hline: UInt, dwaddressid: UInt, dwagentextensionidindex: UInt, lpparams: Long, dwsize: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineAgentSpecific(hline.toInt(), dwaddressid.toInt(), dwagentextensionidindex.toInt(), lpparams.toString(), dwsize.toInt()) as Int) else 0

public actual fun lineAnswer(hcall: UInt, lpsuseruserinfo: PCSTR, dwsize: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineAnswer(hcall.toInt(), lpsuseruserinfo.toString(), dwsize.toInt()) as Int) else 0

public actual fun lineBlindTransfer(hcall: UInt, lpszdestaddress: PCSTR, dwcountrycode: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineBlindTransfer(hcall.toInt(), lpszdestaddress.toString(), dwcountrycode.toInt()) as Int) else 0

public actual fun lineBlindTransferA(hcall: UInt, lpszdestaddress: PCSTR, dwcountrycode: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineBlindTransferA(hcall.toInt(), lpszdestaddress.toString(), dwcountrycode.toInt()) as Int) else 0

public actual fun lineBlindTransferW(hcall: UInt, lpszdestaddressw: PCWSTR, dwcountrycode: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineBlindTransferW(hcall.toInt(), lpszdestaddressw.toString(), dwcountrycode.toInt()) as Int) else 0

public actual fun lineClose(hline: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineClose(hline.toInt()) as Int) else 0

public actual fun lineCompleteCall(hcall: UInt, lpdwcompletionid: Long, dwcompletionmode: UInt, dwmessageid: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineCompleteCall(hcall.toInt(), lpdwcompletionid.toString(), dwcompletionmode.toInt(), dwmessageid.toInt()) as Int) else 0

public actual fun lineCompleteTransfer(hcall: UInt, hconsultcall: UInt, lphconfcall: Long, dwtransfermode: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineCompleteTransfer(hcall.toInt(), hconsultcall.toInt(), lphconfcall.toString(), dwtransfermode.toInt()) as Int) else 0

public actual fun lineConfigDialog(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCSTR): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineConfigDialog(dwdeviceid.toInt(), hwndowner.toString(), lpszdeviceclass.toString()) as Int) else 0

public actual fun lineConfigDialogA(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCSTR): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineConfigDialogA(dwdeviceid.toInt(), hwndowner.toString(), lpszdeviceclass.toString()) as Int) else 0

public actual fun lineConfigDialogEdit(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCSTR, lpdeviceconfigin: Long, dwsize: UInt, lpdeviceconfigout: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineConfigDialogEdit(dwdeviceid.toInt(), hwndowner.toString(), lpszdeviceclass.toString(), lpdeviceconfigin.toString(), dwsize.toInt(), lpdeviceconfigout.toString()) as Int) else 0

public actual fun lineConfigDialogEditA(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCSTR, lpdeviceconfigin: Long, dwsize: UInt, lpdeviceconfigout: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineConfigDialogEditA(dwdeviceid.toInt(), hwndowner.toString(), lpszdeviceclass.toString(), lpdeviceconfigin.toString(), dwsize.toInt(), lpdeviceconfigout.toString()) as Int) else 0

public actual fun lineConfigDialogEditW(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCWSTR, lpdeviceconfigin: Long, dwsize: UInt, lpdeviceconfigout: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineConfigDialogEditW(dwdeviceid.toInt(), hwndowner.toString(), lpszdeviceclass.toString(), lpdeviceconfigin.toString(), dwsize.toInt(), lpdeviceconfigout.toString()) as Int) else 0

public actual fun lineConfigDialogW(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCWSTR): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineConfigDialogW(dwdeviceid.toInt(), hwndowner.toString(), lpszdeviceclass.toString()) as Int) else 0

public actual fun lineConfigProvider(hwndowner: HWND, dwpermanentproviderid: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineConfigProvider(hwndowner.toString(), dwpermanentproviderid.toInt()) as Int) else 0

public actual fun lineCreateAgentA(hline: UInt, lpszagentid: PCSTR, lpszagentpin: PCSTR, lphagent: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineCreateAgentA(hline.toInt(), lpszagentid.toString(), lpszagentpin.toString(), lphagent.toString()) as Int) else 0

public actual fun lineCreateAgentSessionA(hline: UInt, hagent: UInt, lpszagentpin: PCSTR, dwworkingaddressid: UInt, lpgroupid: Long, lphagentsession: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineCreateAgentSessionA(hline.toInt(), hagent.toInt(), lpszagentpin.toString(), dwworkingaddressid.toInt(), lpgroupid.toString(), lphagentsession.toString()) as Int) else 0

public actual fun lineCreateAgentSessionW(hline: UInt, hagent: UInt, lpszagentpin: PCWSTR, dwworkingaddressid: UInt, lpgroupid: Long, lphagentsession: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineCreateAgentSessionW(hline.toInt(), hagent.toInt(), lpszagentpin.toString(), dwworkingaddressid.toInt(), lpgroupid.toString(), lphagentsession.toString()) as Int) else 0

public actual fun lineCreateAgentW(hline: UInt, lpszagentid: PCWSTR, lpszagentpin: PCWSTR, lphagent: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineCreateAgentW(hline.toInt(), lpszagentid.toString(), lpszagentpin.toString(), lphagent.toString()) as Int) else 0

public actual fun lineDeallocateCall(hcall: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineDeallocateCall(hcall.toInt()) as Int) else 0

public actual fun lineDevSpecific(hline: UInt, dwaddressid: UInt, hcall: UInt, lpparams: Long, dwsize: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineDevSpecific(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), lpparams.toString(), dwsize.toInt()) as Int) else 0

public actual fun lineDevSpecificFeature(hline: UInt, dwfeature: UInt, lpparams: Long, dwsize: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineDevSpecificFeature(hline.toInt(), dwfeature.toInt(), lpparams.toString(), dwsize.toInt()) as Int) else 0

public actual fun lineDial(hcall: UInt, lpszdestaddress: PCSTR, dwcountrycode: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineDial(hcall.toInt(), lpszdestaddress.toString(), dwcountrycode.toInt()) as Int) else 0

public actual fun lineDialA(hcall: UInt, lpszdestaddress: PCSTR, dwcountrycode: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineDialA(hcall.toInt(), lpszdestaddress.toString(), dwcountrycode.toInt()) as Int) else 0

public actual fun lineDialW(hcall: UInt, lpszdestaddress: PCWSTR, dwcountrycode: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineDialW(hcall.toInt(), lpszdestaddress.toString(), dwcountrycode.toInt()) as Int) else 0

public actual fun lineDrop(hcall: UInt, lpsuseruserinfo: PCSTR, dwsize: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineDrop(hcall.toInt(), lpsuseruserinfo.toString(), dwsize.toInt()) as Int) else 0

public actual fun lineForward(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: Long, dwnumringsnoanswer: UInt, lphconsultcall: Long, lpcallparams: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineForward(hline.toInt(), balladdresses.toInt(), dwaddressid.toInt(), lpforwardlist.toString(), dwnumringsnoanswer.toInt(), lphconsultcall.toString(), lpcallparams.toString()) as Int) else 0

public actual fun lineForwardA(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: Long, dwnumringsnoanswer: UInt, lphconsultcall: Long, lpcallparams: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineForwardA(hline.toInt(), balladdresses.toInt(), dwaddressid.toInt(), lpforwardlist.toString(), dwnumringsnoanswer.toInt(), lphconsultcall.toString(), lpcallparams.toString()) as Int) else 0

public actual fun lineForwardW(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: Long, dwnumringsnoanswer: UInt, lphconsultcall: Long, lpcallparams: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineForwardW(hline.toInt(), balladdresses.toInt(), dwaddressid.toInt(), lpforwardlist.toString(), dwnumringsnoanswer.toInt(), lphconsultcall.toString(), lpcallparams.toString()) as Int) else 0

public actual fun lineGatherDigits(hcall: UInt, dwdigitmodes: UInt, lpsdigits: PSTR, dwnumdigits: UInt, lpszterminationdigits: PCSTR, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGatherDigits(hcall.toInt(), dwdigitmodes.toInt(), lpsdigits.toString(), dwnumdigits.toInt(), lpszterminationdigits.toString(), dwfirstdigittimeout.toInt(), dwinterdigittimeout.toInt()) as Int) else 0

public actual fun lineGatherDigitsA(hcall: UInt, dwdigitmodes: UInt, lpsdigits: PSTR, dwnumdigits: UInt, lpszterminationdigits: PCSTR, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGatherDigitsA(hcall.toInt(), dwdigitmodes.toInt(), lpsdigits.toString(), dwnumdigits.toInt(), lpszterminationdigits.toString(), dwfirstdigittimeout.toInt(), dwinterdigittimeout.toInt()) as Int) else 0

public actual fun lineGatherDigitsW(hcall: UInt, dwdigitmodes: UInt, lpsdigits: PWSTR, dwnumdigits: UInt, lpszterminationdigits: PCWSTR, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGatherDigitsW(hcall.toInt(), dwdigitmodes.toInt(), lpsdigits.toString(), dwnumdigits.toInt(), lpszterminationdigits.toString(), dwfirstdigittimeout.toInt(), dwinterdigittimeout.toInt()) as Int) else 0

public actual fun lineGenerateDigits(hcall: UInt, dwdigitmode: UInt, lpszdigits: PCSTR, dwduration: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGenerateDigits(hcall.toInt(), dwdigitmode.toInt(), lpszdigits.toString(), dwduration.toInt()) as Int) else 0

public actual fun lineGenerateDigitsA(hcall: UInt, dwdigitmode: UInt, lpszdigits: PCSTR, dwduration: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGenerateDigitsA(hcall.toInt(), dwdigitmode.toInt(), lpszdigits.toString(), dwduration.toInt()) as Int) else 0

public actual fun lineGenerateDigitsW(hcall: UInt, dwdigitmode: UInt, lpszdigits: PCWSTR, dwduration: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGenerateDigitsW(hcall.toInt(), dwdigitmode.toInt(), lpszdigits.toString(), dwduration.toInt()) as Int) else 0

public actual fun lineGenerateTone(hcall: UInt, dwtonemode: UInt, dwduration: UInt, dwnumtones: UInt, lptones: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGenerateTone(hcall.toInt(), dwtonemode.toInt(), dwduration.toInt(), dwnumtones.toInt(), lptones.toString()) as Int) else 0

public actual fun lineGetAddressCaps(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAddressCaps(hlineapp.toInt(), dwdeviceid.toInt(), dwaddressid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lpaddresscaps.toString()) as Int) else 0

public actual fun lineGetAddressCapsA(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAddressCapsA(hlineapp.toInt(), dwdeviceid.toInt(), dwaddressid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lpaddresscaps.toString()) as Int) else 0

public actual fun lineGetAddressCapsW(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAddressCapsW(hlineapp.toInt(), dwdeviceid.toInt(), dwaddressid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lpaddresscaps.toString()) as Int) else 0

public actual fun lineGetAddressID(hline: UInt, lpdwaddressid: Long, dwaddressmode: UInt, lpsaddress: PCSTR, dwsize: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAddressID(hline.toInt(), lpdwaddressid.toString(), dwaddressmode.toInt(), lpsaddress.toString(), dwsize.toInt()) as Int) else 0

public actual fun lineGetAddressIDA(hline: UInt, lpdwaddressid: Long, dwaddressmode: UInt, lpsaddress: PCSTR, dwsize: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAddressIDA(hline.toInt(), lpdwaddressid.toString(), dwaddressmode.toInt(), lpsaddress.toString(), dwsize.toInt()) as Int) else 0

public actual fun lineGetAddressIDW(hline: UInt, lpdwaddressid: Long, dwaddressmode: UInt, lpsaddress: PCWSTR, dwsize: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAddressIDW(hline.toInt(), lpdwaddressid.toString(), dwaddressmode.toInt(), lpsaddress.toString(), dwsize.toInt()) as Int) else 0

public actual fun lineGetAddressStatus(hline: UInt, dwaddressid: UInt, lpaddressstatus: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAddressStatus(hline.toInt(), dwaddressid.toInt(), lpaddressstatus.toString()) as Int) else 0

public actual fun lineGetAddressStatusA(hline: UInt, dwaddressid: UInt, lpaddressstatus: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAddressStatusA(hline.toInt(), dwaddressid.toInt(), lpaddressstatus.toString()) as Int) else 0

public actual fun lineGetAddressStatusW(hline: UInt, dwaddressid: UInt, lpaddressstatus: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAddressStatusW(hline.toInt(), dwaddressid.toInt(), lpaddressstatus.toString()) as Int) else 0

public actual fun lineGetAgentActivityListA(hline: UInt, dwaddressid: UInt, lpagentactivitylist: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAgentActivityListA(hline.toInt(), dwaddressid.toInt(), lpagentactivitylist.toString()) as Int) else 0

public actual fun lineGetAgentActivityListW(hline: UInt, dwaddressid: UInt, lpagentactivitylist: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAgentActivityListW(hline.toInt(), dwaddressid.toInt(), lpagentactivitylist.toString()) as Int) else 0

public actual fun lineGetAgentCapsA(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwappapiversion: UInt, lpagentcaps: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAgentCapsA(hlineapp.toInt(), dwdeviceid.toInt(), dwaddressid.toInt(), dwappapiversion.toInt(), lpagentcaps.toString()) as Int) else 0

public actual fun lineGetAgentCapsW(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwappapiversion: UInt, lpagentcaps: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAgentCapsW(hlineapp.toInt(), dwdeviceid.toInt(), dwaddressid.toInt(), dwappapiversion.toInt(), lpagentcaps.toString()) as Int) else 0

public actual fun lineGetAgentGroupListA(hline: UInt, dwaddressid: UInt, lpagentgrouplist: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAgentGroupListA(hline.toInt(), dwaddressid.toInt(), lpagentgrouplist.toString()) as Int) else 0

public actual fun lineGetAgentGroupListW(hline: UInt, dwaddressid: UInt, lpagentgrouplist: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAgentGroupListW(hline.toInt(), dwaddressid.toInt(), lpagentgrouplist.toString()) as Int) else 0

public actual fun lineGetAgentInfo(hline: UInt, hagent: UInt, lpagentinfo: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAgentInfo(hline.toInt(), hagent.toInt(), lpagentinfo.toString()) as Int) else 0

public actual fun lineGetAgentSessionInfo(hline: UInt, hagentsession: UInt, lpagentsessioninfo: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAgentSessionInfo(hline.toInt(), hagentsession.toInt(), lpagentsessioninfo.toString()) as Int) else 0

public actual fun lineGetAgentSessionList(hline: UInt, hagent: UInt, lpagentsessionlist: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAgentSessionList(hline.toInt(), hagent.toInt(), lpagentsessionlist.toString()) as Int) else 0

public actual fun lineGetAgentStatusA(hline: UInt, dwaddressid: UInt, lpagentstatus: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAgentStatusA(hline.toInt(), dwaddressid.toInt(), lpagentstatus.toString()) as Int) else 0

public actual fun lineGetAgentStatusW(hline: UInt, dwaddressid: UInt, lpagentstatus: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAgentStatusW(hline.toInt(), dwaddressid.toInt(), lpagentstatus.toString()) as Int) else 0

public actual fun lineGetAppPriority(lpszappfilename: PCSTR, dwmediamode: UInt, lpextensionid: Long, dwrequestmode: UInt, lpextensionname: Long, lpdwpriority: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAppPriority(lpszappfilename.toString(), dwmediamode.toInt(), lpextensionid.toString(), dwrequestmode.toInt(), lpextensionname.toString(), lpdwpriority.toString()) as Int) else 0

public actual fun lineGetAppPriorityA(lpszappfilename: PCSTR, dwmediamode: UInt, lpextensionid: Long, dwrequestmode: UInt, lpextensionname: Long, lpdwpriority: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAppPriorityA(lpszappfilename.toString(), dwmediamode.toInt(), lpextensionid.toString(), dwrequestmode.toInt(), lpextensionname.toString(), lpdwpriority.toString()) as Int) else 0

public actual fun lineGetAppPriorityW(lpszappfilename: PCWSTR, dwmediamode: UInt, lpextensionid: Long, dwrequestmode: UInt, lpextensionname: Long, lpdwpriority: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetAppPriorityW(lpszappfilename.toString(), dwmediamode.toInt(), lpextensionid.toString(), dwrequestmode.toInt(), lpextensionname.toString(), lpdwpriority.toString()) as Int) else 0

public actual fun lineGetCallInfo(hcall: UInt, lpcallinfo: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetCallInfo(hcall.toInt(), lpcallinfo.toString()) as Int) else 0

public actual fun lineGetCallInfoA(hcall: UInt, lpcallinfo: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetCallInfoA(hcall.toInt(), lpcallinfo.toString()) as Int) else 0

public actual fun lineGetCallInfoW(hcall: UInt, lpcallinfo: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetCallInfoW(hcall.toInt(), lpcallinfo.toString()) as Int) else 0

public actual fun lineGetCallStatus(hcall: UInt, lpcallstatus: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetCallStatus(hcall.toInt(), lpcallstatus.toString()) as Int) else 0

public actual fun lineGetConfRelatedCalls(hcall: UInt, lpcalllist: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetConfRelatedCalls(hcall.toInt(), lpcalllist.toString()) as Int) else 0

public actual fun lineGetCountry(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetCountry(dwcountryid.toInt(), dwapiversion.toInt(), lplinecountrylist.toString()) as Int) else 0

public actual fun lineGetCountryA(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetCountryA(dwcountryid.toInt(), dwapiversion.toInt(), lplinecountrylist.toString()) as Int) else 0

public actual fun lineGetCountryW(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetCountryW(dwcountryid.toInt(), dwapiversion.toInt(), lplinecountrylist.toString()) as Int) else 0

public actual fun lineGetDevCaps(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetDevCaps(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lplinedevcaps.toString()) as Int) else 0

public actual fun lineGetDevCapsA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetDevCapsA(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lplinedevcaps.toString()) as Int) else 0

public actual fun lineGetDevCapsW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetDevCapsW(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lplinedevcaps.toString()) as Int) else 0

public actual fun lineGetDevConfig(dwdeviceid: UInt, lpdeviceconfig: Long, lpszdeviceclass: PCSTR): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetDevConfig(dwdeviceid.toInt(), lpdeviceconfig.toString(), lpszdeviceclass.toString()) as Int) else 0

public actual fun lineGetDevConfigA(dwdeviceid: UInt, lpdeviceconfig: Long, lpszdeviceclass: PCSTR): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetDevConfigA(dwdeviceid.toInt(), lpdeviceconfig.toString(), lpszdeviceclass.toString()) as Int) else 0

public actual fun lineGetDevConfigW(dwdeviceid: UInt, lpdeviceconfig: Long, lpszdeviceclass: PCWSTR): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetDevConfigW(dwdeviceid.toInt(), lpdeviceconfig.toString(), lpszdeviceclass.toString()) as Int) else 0

public actual fun lineGetGroupListA(hline: UInt, lpgrouplist: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetGroupListA(hline.toInt(), lpgrouplist.toString()) as Int) else 0

public actual fun lineGetGroupListW(hline: UInt, lpgrouplist: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetGroupListW(hline.toInt(), lpgrouplist.toString()) as Int) else 0

public actual fun lineGetID(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: Long, lpszdeviceclass: PCSTR): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetID(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), dwselect.toInt(), lpdeviceid.toString(), lpszdeviceclass.toString()) as Int) else 0

public actual fun lineGetIDA(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: Long, lpszdeviceclass: PCSTR): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetIDA(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), dwselect.toInt(), lpdeviceid.toString(), lpszdeviceclass.toString()) as Int) else 0

public actual fun lineGetIDW(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: Long, lpszdeviceclass: PCWSTR): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetIDW(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), dwselect.toInt(), lpdeviceid.toString(), lpszdeviceclass.toString()) as Int) else 0

public actual fun lineGetIcon(dwdeviceid: UInt, lpszdeviceclass: PCSTR, lphicon: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetIcon(dwdeviceid.toInt(), lpszdeviceclass.toString(), lphicon.toString()) as Int) else 0

public actual fun lineGetIconA(dwdeviceid: UInt, lpszdeviceclass: PCSTR, lphicon: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetIconA(dwdeviceid.toInt(), lpszdeviceclass.toString(), lphicon.toString()) as Int) else 0

public actual fun lineGetIconW(dwdeviceid: UInt, lpszdeviceclass: PCWSTR, lphicon: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetIconW(dwdeviceid.toInt(), lpszdeviceclass.toString(), lphicon.toString()) as Int) else 0

public actual fun lineGetLineDevStatus(hline: UInt, lplinedevstatus: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetLineDevStatus(hline.toInt(), lplinedevstatus.toString()) as Int) else 0

public actual fun lineGetLineDevStatusA(hline: UInt, lplinedevstatus: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetLineDevStatusA(hline.toInt(), lplinedevstatus.toString()) as Int) else 0

public actual fun lineGetLineDevStatusW(hline: UInt, lplinedevstatus: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetLineDevStatusW(hline.toInt(), lplinedevstatus.toString()) as Int) else 0

public actual fun lineGetMessage(hlineapp: UInt, lpmessage: Long, dwtimeout: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetMessage(hlineapp.toInt(), lpmessage.toString(), dwtimeout.toInt()) as Int) else 0

public actual fun lineGetNewCalls(hline: UInt, dwaddressid: UInt, dwselect: UInt, lpcalllist: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetNewCalls(hline.toInt(), dwaddressid.toInt(), dwselect.toInt(), lpcalllist.toString()) as Int) else 0

public actual fun lineGetNumRings(hline: UInt, dwaddressid: UInt, lpdwnumrings: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetNumRings(hline.toInt(), dwaddressid.toInt(), lpdwnumrings.toString()) as Int) else 0

public actual fun lineGetProviderList(dwapiversion: UInt, lpproviderlist: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetProviderList(dwapiversion.toInt(), lpproviderlist.toString()) as Int) else 0

public actual fun lineGetProviderListA(dwapiversion: UInt, lpproviderlist: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetProviderListA(dwapiversion.toInt(), lpproviderlist.toString()) as Int) else 0

public actual fun lineGetProviderListW(dwapiversion: UInt, lpproviderlist: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetProviderListW(dwapiversion.toInt(), lpproviderlist.toString()) as Int) else 0

public actual fun lineGetProxyStatus(hlineapp: UInt, dwdeviceid: UInt, dwappapiversion: UInt, lplineproxyreqestlist: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetProxyStatus(hlineapp.toInt(), dwdeviceid.toInt(), dwappapiversion.toInt(), lplineproxyreqestlist.toString()) as Int) else 0

public actual fun lineGetQueueInfo(hline: UInt, dwqueueid: UInt, lplinequeueinfo: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetQueueInfo(hline.toInt(), dwqueueid.toInt(), lplinequeueinfo.toString()) as Int) else 0

public actual fun lineGetQueueListA(hline: UInt, lpgroupid: Long, lpqueuelist: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetQueueListA(hline.toInt(), lpgroupid.toString(), lpqueuelist.toString()) as Int) else 0

public actual fun lineGetQueueListW(hline: UInt, lpgroupid: Long, lpqueuelist: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetQueueListW(hline.toInt(), lpgroupid.toString(), lpqueuelist.toString()) as Int) else 0

public actual fun lineGetRequest(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetRequest(hlineapp.toInt(), dwrequestmode.toInt(), lprequestbuffer.toString()) as Int) else 0

public actual fun lineGetRequestA(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetRequestA(hlineapp.toInt(), dwrequestmode.toInt(), lprequestbuffer.toString()) as Int) else 0

public actual fun lineGetRequestW(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetRequestW(hlineapp.toInt(), dwrequestmode.toInt(), lprequestbuffer.toString()) as Int) else 0

public actual fun lineGetStatusMessages(hline: UInt, lpdwlinestates: Long, lpdwaddressstates: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetStatusMessages(hline.toInt(), lpdwlinestates.toString(), lpdwaddressstates.toString()) as Int) else 0

public actual fun lineGetTranslateCaps(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetTranslateCaps(hlineapp.toInt(), dwapiversion.toInt(), lptranslatecaps.toString()) as Int) else 0

public actual fun lineGetTranslateCapsA(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetTranslateCapsA(hlineapp.toInt(), dwapiversion.toInt(), lptranslatecaps.toString()) as Int) else 0

public actual fun lineGetTranslateCapsW(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineGetTranslateCapsW(hlineapp.toInt(), dwapiversion.toInt(), lptranslatecaps.toString()) as Int) else 0

public actual fun lineHandoff(hcall: UInt, lpszfilename: PCSTR, dwmediamode: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineHandoff(hcall.toInt(), lpszfilename.toString(), dwmediamode.toInt()) as Int) else 0

public actual fun lineHandoffA(hcall: UInt, lpszfilename: PCSTR, dwmediamode: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineHandoffA(hcall.toInt(), lpszfilename.toString(), dwmediamode.toInt()) as Int) else 0

public actual fun lineHandoffW(hcall: UInt, lpszfilename: PCWSTR, dwmediamode: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineHandoffW(hcall.toInt(), lpszfilename.toString(), dwmediamode.toInt()) as Int) else 0

public actual fun lineHold(hcall: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineHold(hcall.toInt()) as Int) else 0

public actual fun lineInitialize(lphlineapp: Long, hinstance: HINSTANCE, lpfncallback: LINECALLBACK, lpszappname: PCSTR, lpdwnumdevs: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineInitialize(lphlineapp.toString(), hinstance.toString(), lpfncallback.toLong().toString(), lpszappname.toString(), lpdwnumdevs.toString()) as Int) else 0

public actual fun lineInitializeExA(lphlineapp: Long, hinstance: HINSTANCE, lpfncallback: LINECALLBACK, lpszfriendlyappname: PCSTR, lpdwnumdevs: Long, lpdwapiversion: Long, lplineinitializeexparams: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineInitializeExA(lphlineapp.toString(), hinstance.toString(), lpfncallback.toLong().toString(), lpszfriendlyappname.toString(), lpdwnumdevs.toString(), lpdwapiversion.toString(), lplineinitializeexparams.toString()) as Int) else 0

public actual fun lineInitializeExW(lphlineapp: Long, hinstance: HINSTANCE, lpfncallback: LINECALLBACK, lpszfriendlyappname: PCWSTR, lpdwnumdevs: Long, lpdwapiversion: Long, lplineinitializeexparams: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineInitializeExW(lphlineapp.toString(), hinstance.toString(), lpfncallback.toLong().toString(), lpszfriendlyappname.toString(), lpdwnumdevs.toString(), lpdwapiversion.toString(), lplineinitializeexparams.toString()) as Int) else 0

public actual fun lineMakeCall(hline: UInt, lphcall: Long, lpszdestaddress: PCSTR, dwcountrycode: UInt, lpcallparams: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineMakeCall(hline.toInt(), lphcall.toString(), lpszdestaddress.toString(), dwcountrycode.toInt(), lpcallparams.toString()) as Int) else 0

public actual fun lineMakeCallA(hline: UInt, lphcall: Long, lpszdestaddress: PCSTR, dwcountrycode: UInt, lpcallparams: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineMakeCallA(hline.toInt(), lphcall.toString(), lpszdestaddress.toString(), dwcountrycode.toInt(), lpcallparams.toString()) as Int) else 0

public actual fun lineMakeCallW(hline: UInt, lphcall: Long, lpszdestaddress: PCWSTR, dwcountrycode: UInt, lpcallparams: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineMakeCallW(hline.toInt(), lphcall.toString(), lpszdestaddress.toString(), dwcountrycode.toInt(), lpcallparams.toString()) as Int) else 0

public actual fun lineMonitorDigits(hcall: UInt, dwdigitmodes: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineMonitorDigits(hcall.toInt(), dwdigitmodes.toInt()) as Int) else 0

public actual fun lineMonitorMedia(hcall: UInt, dwmediamodes: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineMonitorMedia(hcall.toInt(), dwmediamodes.toInt()) as Int) else 0

public actual fun lineMonitorTones(hcall: UInt, lptonelist: Long, dwnumentries: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineMonitorTones(hcall.toInt(), lptonelist.toString(), dwnumentries.toInt()) as Int) else 0

public actual fun lineNegotiateAPIVersion(hlineapp: UInt, dwdeviceid: UInt, dwapilowversion: UInt, dwapihighversion: UInt, lpdwapiversion: Long, lpextensionid: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineNegotiateAPIVersion(hlineapp.toInt(), dwdeviceid.toInt(), dwapilowversion.toInt(), dwapihighversion.toInt(), lpdwapiversion.toString(), lpextensionid.toString()) as Int) else 0

public actual fun lineNegotiateExtVersion(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextlowversion: UInt, dwexthighversion: UInt, lpdwextversion: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineNegotiateExtVersion(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextlowversion.toInt(), dwexthighversion.toInt(), lpdwextversion.toString()) as Int) else 0

public actual fun lineOpen(hlineapp: UInt, dwdeviceid: UInt, lphline: Long, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineOpen(hlineapp.toInt(), dwdeviceid.toInt(), lphline.toString(), dwapiversion.toInt(), dwextversion.toInt(), dwcallbackinstance.toString(), dwprivileges.toInt(), dwmediamodes.toInt(), lpcallparams.toString()) as Int) else 0

public actual fun lineOpenA(hlineapp: UInt, dwdeviceid: UInt, lphline: Long, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineOpenA(hlineapp.toInt(), dwdeviceid.toInt(), lphline.toString(), dwapiversion.toInt(), dwextversion.toInt(), dwcallbackinstance.toString(), dwprivileges.toInt(), dwmediamodes.toInt(), lpcallparams.toString()) as Int) else 0

public actual fun lineOpenW(hlineapp: UInt, dwdeviceid: UInt, lphline: Long, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineOpenW(hlineapp.toInt(), dwdeviceid.toInt(), lphline.toString(), dwapiversion.toInt(), dwextversion.toInt(), dwcallbackinstance.toString(), dwprivileges.toInt(), dwmediamodes.toInt(), lpcallparams.toString()) as Int) else 0

public actual fun linePark(hcall: UInt, dwparkmode: UInt, lpszdiraddress: PCSTR, lpnondiraddress: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_linePark(hcall.toInt(), dwparkmode.toInt(), lpszdiraddress.toString(), lpnondiraddress.toString()) as Int) else 0

public actual fun lineParkA(hcall: UInt, dwparkmode: UInt, lpszdiraddress: PCSTR, lpnondiraddress: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineParkA(hcall.toInt(), dwparkmode.toInt(), lpszdiraddress.toString(), lpnondiraddress.toString()) as Int) else 0

public actual fun lineParkW(hcall: UInt, dwparkmode: UInt, lpszdiraddress: PCWSTR, lpnondiraddress: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineParkW(hcall.toInt(), dwparkmode.toInt(), lpszdiraddress.toString(), lpnondiraddress.toString()) as Int) else 0

public actual fun linePickup(hline: UInt, dwaddressid: UInt, lphcall: Long, lpszdestaddress: PCSTR, lpszgroupid: PCSTR): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_linePickup(hline.toInt(), dwaddressid.toInt(), lphcall.toString(), lpszdestaddress.toString(), lpszgroupid.toString()) as Int) else 0

public actual fun linePickupA(hline: UInt, dwaddressid: UInt, lphcall: Long, lpszdestaddress: PCSTR, lpszgroupid: PCSTR): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_linePickupA(hline.toInt(), dwaddressid.toInt(), lphcall.toString(), lpszdestaddress.toString(), lpszgroupid.toString()) as Int) else 0

public actual fun linePickupW(hline: UInt, dwaddressid: UInt, lphcall: Long, lpszdestaddress: PCWSTR, lpszgroupid: PCWSTR): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_linePickupW(hline.toInt(), dwaddressid.toInt(), lphcall.toString(), lpszdestaddress.toString(), lpszgroupid.toString()) as Int) else 0

public actual fun linePrepareAddToConference(hconfcall: UInt, lphconsultcall: Long, lpcallparams: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_linePrepareAddToConference(hconfcall.toInt(), lphconsultcall.toString(), lpcallparams.toString()) as Int) else 0

public actual fun linePrepareAddToConferenceA(hconfcall: UInt, lphconsultcall: Long, lpcallparams: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_linePrepareAddToConferenceA(hconfcall.toInt(), lphconsultcall.toString(), lpcallparams.toString()) as Int) else 0

public actual fun linePrepareAddToConferenceW(hconfcall: UInt, lphconsultcall: Long, lpcallparams: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_linePrepareAddToConferenceW(hconfcall.toInt(), lphconsultcall.toString(), lpcallparams.toString()) as Int) else 0

public actual fun lineProxyMessage(hline: UInt, hcall: UInt, dwmsg: UInt, dwparam1: UInt, dwparam2: UInt, dwparam3: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineProxyMessage(hline.toInt(), hcall.toInt(), dwmsg.toInt(), dwparam1.toInt(), dwparam2.toInt(), dwparam3.toInt()) as Int) else 0

public actual fun lineProxyResponse(hline: UInt, lpproxyrequest: Long, dwresult: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineProxyResponse(hline.toInt(), lpproxyrequest.toString(), dwresult.toInt()) as Int) else 0

public actual fun lineRedirect(hcall: UInt, lpszdestaddress: PCSTR, dwcountrycode: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineRedirect(hcall.toInt(), lpszdestaddress.toString(), dwcountrycode.toInt()) as Int) else 0

public actual fun lineRedirectA(hcall: UInt, lpszdestaddress: PCSTR, dwcountrycode: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineRedirectA(hcall.toInt(), lpszdestaddress.toString(), dwcountrycode.toInt()) as Int) else 0

public actual fun lineRedirectW(hcall: UInt, lpszdestaddress: PCWSTR, dwcountrycode: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineRedirectW(hcall.toInt(), lpszdestaddress.toString(), dwcountrycode.toInt()) as Int) else 0

public actual fun lineRegisterRequestRecipient(hlineapp: UInt, dwregistrationinstance: UInt, dwrequestmode: UInt, benable: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineRegisterRequestRecipient(hlineapp.toInt(), dwregistrationinstance.toInt(), dwrequestmode.toInt(), benable.toInt()) as Int) else 0

public actual fun lineReleaseUserUserInfo(hcall: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineReleaseUserUserInfo(hcall.toInt()) as Int) else 0

public actual fun lineRemoveFromConference(hcall: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineRemoveFromConference(hcall.toInt()) as Int) else 0

public actual fun lineRemoveProvider(dwpermanentproviderid: UInt, hwndowner: HWND): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineRemoveProvider(dwpermanentproviderid.toInt(), hwndowner.toString()) as Int) else 0

public actual fun lineSecureCall(hcall: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSecureCall(hcall.toInt()) as Int) else 0

public actual fun lineSendUserUserInfo(hcall: UInt, lpsuseruserinfo: PCSTR, dwsize: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSendUserUserInfo(hcall.toInt(), lpsuseruserinfo.toString(), dwsize.toInt()) as Int) else 0

public actual fun lineSetAgentActivity(hline: UInt, dwaddressid: UInt, dwactivityid: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetAgentActivity(hline.toInt(), dwaddressid.toInt(), dwactivityid.toInt()) as Int) else 0

public actual fun lineSetAgentGroup(hline: UInt, dwaddressid: UInt, lpagentgrouplist: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetAgentGroup(hline.toInt(), dwaddressid.toInt(), lpagentgrouplist.toString()) as Int) else 0

public actual fun lineSetAgentMeasurementPeriod(hline: UInt, hagent: UInt, dwmeasurementperiod: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetAgentMeasurementPeriod(hline.toInt(), hagent.toInt(), dwmeasurementperiod.toInt()) as Int) else 0

public actual fun lineSetAgentSessionState(hline: UInt, hagentsession: UInt, dwagentsessionstate: UInt, dwnextagentsessionstate: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetAgentSessionState(hline.toInt(), hagentsession.toInt(), dwagentsessionstate.toInt(), dwnextagentsessionstate.toInt()) as Int) else 0

public actual fun lineSetAgentState(hline: UInt, dwaddressid: UInt, dwagentstate: UInt, dwnextagentstate: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetAgentState(hline.toInt(), dwaddressid.toInt(), dwagentstate.toInt(), dwnextagentstate.toInt()) as Int) else 0

public actual fun lineSetAgentStateEx(hline: UInt, hagent: UInt, dwagentstate: UInt, dwnextagentstate: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetAgentStateEx(hline.toInt(), hagent.toInt(), dwagentstate.toInt(), dwnextagentstate.toInt()) as Int) else 0

public actual fun lineSetAppPriority(lpszappfilename: PCSTR, dwmediamode: UInt, lpextensionid: Long, dwrequestmode: UInt, lpszextensionname: PCSTR, dwpriority: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetAppPriority(lpszappfilename.toString(), dwmediamode.toInt(), lpextensionid.toString(), dwrequestmode.toInt(), lpszextensionname.toString(), dwpriority.toInt()) as Int) else 0

public actual fun lineSetAppPriorityA(lpszappfilename: PCSTR, dwmediamode: UInt, lpextensionid: Long, dwrequestmode: UInt, lpszextensionname: PCSTR, dwpriority: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetAppPriorityA(lpszappfilename.toString(), dwmediamode.toInt(), lpextensionid.toString(), dwrequestmode.toInt(), lpszextensionname.toString(), dwpriority.toInt()) as Int) else 0

public actual fun lineSetAppPriorityW(lpszappfilename: PCWSTR, dwmediamode: UInt, lpextensionid: Long, dwrequestmode: UInt, lpszextensionname: PCWSTR, dwpriority: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetAppPriorityW(lpszappfilename.toString(), dwmediamode.toInt(), lpextensionid.toString(), dwrequestmode.toInt(), lpszextensionname.toString(), dwpriority.toInt()) as Int) else 0

public actual fun lineSetAppSpecific(hcall: UInt, dwappspecific: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetAppSpecific(hcall.toInt(), dwappspecific.toInt()) as Int) else 0

public actual fun lineSetCallData(hcall: UInt, lpcalldata: Long, dwsize: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetCallData(hcall.toInt(), lpcalldata.toString(), dwsize.toInt()) as Int) else 0

public actual fun lineSetCallParams(hcall: UInt, dwbearermode: UInt, dwminrate: UInt, dwmaxrate: UInt, lpdialparams: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetCallParams(hcall.toInt(), dwbearermode.toInt(), dwminrate.toInt(), dwmaxrate.toInt(), lpdialparams.toString()) as Int) else 0

public actual fun lineSetCallPrivilege(hcall: UInt, dwcallprivilege: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetCallPrivilege(hcall.toInt(), dwcallprivilege.toInt()) as Int) else 0

public actual fun lineSetCallQualityOfService(hcall: UInt, lpsendingflowspec: Long, dwsendingflowspecsize: UInt, lpreceivingflowspec: Long, dwreceivingflowspecsize: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetCallQualityOfService(hcall.toInt(), lpsendingflowspec.toString(), dwsendingflowspecsize.toInt(), lpreceivingflowspec.toString(), dwreceivingflowspecsize.toInt()) as Int) else 0

public actual fun lineSetCallTreatment(hcall: UInt, dwtreatment: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetCallTreatment(hcall.toInt(), dwtreatment.toInt()) as Int) else 0

public actual fun lineSetCurrentLocation(hlineapp: UInt, dwlocation: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetCurrentLocation(hlineapp.toInt(), dwlocation.toInt()) as Int) else 0

public actual fun lineSetDevConfig(dwdeviceid: UInt, lpdeviceconfig: Long, dwsize: UInt, lpszdeviceclass: PCSTR): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetDevConfig(dwdeviceid.toInt(), lpdeviceconfig.toString(), dwsize.toInt(), lpszdeviceclass.toString()) as Int) else 0

public actual fun lineSetDevConfigA(dwdeviceid: UInt, lpdeviceconfig: Long, dwsize: UInt, lpszdeviceclass: PCSTR): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetDevConfigA(dwdeviceid.toInt(), lpdeviceconfig.toString(), dwsize.toInt(), lpszdeviceclass.toString()) as Int) else 0

public actual fun lineSetDevConfigW(dwdeviceid: UInt, lpdeviceconfig: Long, dwsize: UInt, lpszdeviceclass: PCWSTR): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetDevConfigW(dwdeviceid.toInt(), lpdeviceconfig.toString(), dwsize.toInt(), lpszdeviceclass.toString()) as Int) else 0

public actual fun lineSetLineDevStatus(hline: UInt, dwstatustochange: UInt, fstatus: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetLineDevStatus(hline.toInt(), dwstatustochange.toInt(), fstatus.toInt()) as Int) else 0

public actual fun lineSetMediaControl(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdigitlist: Long, dwdigitnumentries: UInt, lpmedialist: Long, dwmedianumentries: UInt, lptonelist: Long, dwtonenumentries: UInt, lpcallstatelist: Long, dwcallstatenumentries: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetMediaControl(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), dwselect.toInt(), lpdigitlist.toString(), dwdigitnumentries.toInt(), lpmedialist.toString(), dwmedianumentries.toInt(), lptonelist.toString(), dwtonenumentries.toInt(), lpcallstatelist.toString(), dwcallstatenumentries.toInt()) as Int) else 0

public actual fun lineSetMediaMode(hcall: UInt, dwmediamodes: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetMediaMode(hcall.toInt(), dwmediamodes.toInt()) as Int) else 0

public actual fun lineSetNumRings(hline: UInt, dwaddressid: UInt, dwnumrings: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetNumRings(hline.toInt(), dwaddressid.toInt(), dwnumrings.toInt()) as Int) else 0

public actual fun lineSetQueueMeasurementPeriod(hline: UInt, dwqueueid: UInt, dwmeasurementperiod: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetQueueMeasurementPeriod(hline.toInt(), dwqueueid.toInt(), dwmeasurementperiod.toInt()) as Int) else 0

public actual fun lineSetStatusMessages(hline: UInt, dwlinestates: UInt, dwaddressstates: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetStatusMessages(hline.toInt(), dwlinestates.toInt(), dwaddressstates.toInt()) as Int) else 0

public actual fun lineSetTerminal(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, dwterminalmodes: UInt, dwterminalid: UInt, benable: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetTerminal(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), dwselect.toInt(), dwterminalmodes.toInt(), dwterminalid.toInt(), benable.toInt()) as Int) else 0

public actual fun lineSetTollList(hlineapp: UInt, dwdeviceid: UInt, lpszaddressin: PCSTR, dwtolllistoption: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetTollList(hlineapp.toInt(), dwdeviceid.toInt(), lpszaddressin.toString(), dwtolllistoption.toInt()) as Int) else 0

public actual fun lineSetTollListA(hlineapp: UInt, dwdeviceid: UInt, lpszaddressin: PCSTR, dwtolllistoption: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetTollListA(hlineapp.toInt(), dwdeviceid.toInt(), lpszaddressin.toString(), dwtolllistoption.toInt()) as Int) else 0

public actual fun lineSetTollListW(hlineapp: UInt, dwdeviceid: UInt, lpszaddressinw: PCWSTR, dwtolllistoption: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetTollListW(hlineapp.toInt(), dwdeviceid.toInt(), lpszaddressinw.toString(), dwtolllistoption.toInt()) as Int) else 0

public actual fun lineSetupConference(hcall: UInt, hline: UInt, lphconfcall: Long, lphconsultcall: Long, dwnumparties: UInt, lpcallparams: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetupConference(hcall.toInt(), hline.toInt(), lphconfcall.toString(), lphconsultcall.toString(), dwnumparties.toInt(), lpcallparams.toString()) as Int) else 0

public actual fun lineSetupConferenceA(hcall: UInt, hline: UInt, lphconfcall: Long, lphconsultcall: Long, dwnumparties: UInt, lpcallparams: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetupConferenceA(hcall.toInt(), hline.toInt(), lphconfcall.toString(), lphconsultcall.toString(), dwnumparties.toInt(), lpcallparams.toString()) as Int) else 0

public actual fun lineSetupConferenceW(hcall: UInt, hline: UInt, lphconfcall: Long, lphconsultcall: Long, dwnumparties: UInt, lpcallparams: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetupConferenceW(hcall.toInt(), hline.toInt(), lphconfcall.toString(), lphconsultcall.toString(), dwnumparties.toInt(), lpcallparams.toString()) as Int) else 0

public actual fun lineSetupTransfer(hcall: UInt, lphconsultcall: Long, lpcallparams: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetupTransfer(hcall.toInt(), lphconsultcall.toString(), lpcallparams.toString()) as Int) else 0

public actual fun lineSetupTransferA(hcall: UInt, lphconsultcall: Long, lpcallparams: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetupTransferA(hcall.toInt(), lphconsultcall.toString(), lpcallparams.toString()) as Int) else 0

public actual fun lineSetupTransferW(hcall: UInt, lphconsultcall: Long, lpcallparams: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSetupTransferW(hcall.toInt(), lphconsultcall.toString(), lpcallparams.toString()) as Int) else 0

public actual fun lineShutdown(hlineapp: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineShutdown(hlineapp.toInt()) as Int) else 0

public actual fun lineSwapHold(hactivecall: UInt, hheldcall: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineSwapHold(hactivecall.toInt(), hheldcall.toInt()) as Int) else 0

public actual fun lineTranslateAddress(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: PCSTR, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineTranslateAddress(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), lpszaddressin.toString(), dwcard.toInt(), dwtranslateoptions.toInt(), lptranslateoutput.toString()) as Int) else 0

public actual fun lineTranslateAddressA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: PCSTR, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineTranslateAddressA(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), lpszaddressin.toString(), dwcard.toInt(), dwtranslateoptions.toInt(), lptranslateoutput.toString()) as Int) else 0

public actual fun lineTranslateAddressW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: PCWSTR, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineTranslateAddressW(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), lpszaddressin.toString(), dwcard.toInt(), dwtranslateoptions.toInt(), lptranslateoutput.toString()) as Int) else 0

public actual fun lineTranslateDialog(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: HWND, lpszaddressin: PCSTR): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineTranslateDialog(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), hwndowner.toString(), lpszaddressin.toString()) as Int) else 0

public actual fun lineTranslateDialogA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: HWND, lpszaddressin: PCSTR): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineTranslateDialogA(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), hwndowner.toString(), lpszaddressin.toString()) as Int) else 0

public actual fun lineTranslateDialogW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: HWND, lpszaddressin: PCWSTR): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineTranslateDialogW(hlineapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), hwndowner.toString(), lpszaddressin.toString()) as Int) else 0

public actual fun lineUncompleteCall(hline: UInt, dwcompletionid: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineUncompleteCall(hline.toInt(), dwcompletionid.toInt()) as Int) else 0

public actual fun lineUnhold(hcall: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineUnhold(hcall.toInt()) as Int) else 0

public actual fun lineUnpark(hline: UInt, dwaddressid: UInt, lphcall: Long, lpszdestaddress: PCSTR): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineUnpark(hline.toInt(), dwaddressid.toInt(), lphcall.toString(), lpszdestaddress.toString()) as Int) else 0

public actual fun lineUnparkA(hline: UInt, dwaddressid: UInt, lphcall: Long, lpszdestaddress: PCSTR): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineUnparkA(hline.toInt(), dwaddressid.toInt(), lphcall.toString(), lpszdestaddress.toString()) as Int) else 0

public actual fun lineUnparkW(hline: UInt, dwaddressid: UInt, lphcall: Long, lpszdestaddress: PCWSTR): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_lineUnparkW(hline.toInt(), dwaddressid.toInt(), lphcall.toString(), lpszdestaddress.toString()) as Int) else 0

public actual fun phoneClose(hphone: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneClose(hphone.toInt()) as Int) else 0

public actual fun phoneConfigDialog(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCSTR): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneConfigDialog(dwdeviceid.toInt(), hwndowner.toString(), lpszdeviceclass.toString()) as Int) else 0

public actual fun phoneConfigDialogA(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCSTR): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneConfigDialogA(dwdeviceid.toInt(), hwndowner.toString(), lpszdeviceclass.toString()) as Int) else 0

public actual fun phoneConfigDialogW(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCWSTR): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneConfigDialogW(dwdeviceid.toInt(), hwndowner.toString(), lpszdeviceclass.toString()) as Int) else 0

public actual fun phoneDevSpecific(hphone: UInt, lpparams: Long, dwsize: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneDevSpecific(hphone.toInt(), lpparams.toString(), dwsize.toInt()) as Int) else 0

public actual fun phoneGetButtonInfo(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetButtonInfo(hphone.toInt(), dwbuttonlampid.toInt(), lpbuttoninfo.toString()) as Int) else 0

public actual fun phoneGetButtonInfoA(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetButtonInfoA(hphone.toInt(), dwbuttonlampid.toInt(), lpbuttoninfo.toString()) as Int) else 0

public actual fun phoneGetButtonInfoW(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetButtonInfoW(hphone.toInt(), dwbuttonlampid.toInt(), lpbuttoninfo.toString()) as Int) else 0

public actual fun phoneGetData(hphone: UInt, dwdataid: UInt, lpdata: Long, dwsize: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetData(hphone.toInt(), dwdataid.toInt(), lpdata.toString(), dwsize.toInt()) as Int) else 0

public actual fun phoneGetDevCaps(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetDevCaps(hphoneapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lpphonecaps.toString()) as Int) else 0

public actual fun phoneGetDevCapsA(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetDevCapsA(hphoneapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lpphonecaps.toString()) as Int) else 0

public actual fun phoneGetDevCapsW(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetDevCapsW(hphoneapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextversion.toInt(), lpphonecaps.toString()) as Int) else 0

public actual fun phoneGetDisplay(hphone: UInt, lpdisplay: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetDisplay(hphone.toInt(), lpdisplay.toString()) as Int) else 0

public actual fun phoneGetGain(hphone: UInt, dwhookswitchdev: UInt, lpdwgain: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetGain(hphone.toInt(), dwhookswitchdev.toInt(), lpdwgain.toString()) as Int) else 0

public actual fun phoneGetHookSwitch(hphone: UInt, lpdwhookswitchdevs: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetHookSwitch(hphone.toInt(), lpdwhookswitchdevs.toString()) as Int) else 0

public actual fun phoneGetID(hphone: UInt, lpdeviceid: Long, lpszdeviceclass: PCSTR): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetID(hphone.toInt(), lpdeviceid.toString(), lpszdeviceclass.toString()) as Int) else 0

public actual fun phoneGetIDA(hphone: UInt, lpdeviceid: Long, lpszdeviceclass: PCSTR): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetIDA(hphone.toInt(), lpdeviceid.toString(), lpszdeviceclass.toString()) as Int) else 0

public actual fun phoneGetIDW(hphone: UInt, lpdeviceid: Long, lpszdeviceclass: PCWSTR): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetIDW(hphone.toInt(), lpdeviceid.toString(), lpszdeviceclass.toString()) as Int) else 0

public actual fun phoneGetIcon(dwdeviceid: UInt, lpszdeviceclass: PCSTR, lphicon: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetIcon(dwdeviceid.toInt(), lpszdeviceclass.toString(), lphicon.toString()) as Int) else 0

public actual fun phoneGetIconA(dwdeviceid: UInt, lpszdeviceclass: PCSTR, lphicon: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetIconA(dwdeviceid.toInt(), lpszdeviceclass.toString(), lphicon.toString()) as Int) else 0

public actual fun phoneGetIconW(dwdeviceid: UInt, lpszdeviceclass: PCWSTR, lphicon: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetIconW(dwdeviceid.toInt(), lpszdeviceclass.toString(), lphicon.toString()) as Int) else 0

public actual fun phoneGetLamp(hphone: UInt, dwbuttonlampid: UInt, lpdwlampmode: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetLamp(hphone.toInt(), dwbuttonlampid.toInt(), lpdwlampmode.toString()) as Int) else 0

public actual fun phoneGetMessage(hphoneapp: UInt, lpmessage: Long, dwtimeout: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetMessage(hphoneapp.toInt(), lpmessage.toString(), dwtimeout.toInt()) as Int) else 0

public actual fun phoneGetRing(hphone: UInt, lpdwringmode: Long, lpdwvolume: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetRing(hphone.toInt(), lpdwringmode.toString(), lpdwvolume.toString()) as Int) else 0

public actual fun phoneGetStatus(hphone: UInt, lpphonestatus: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetStatus(hphone.toInt(), lpphonestatus.toString()) as Int) else 0

public actual fun phoneGetStatusA(hphone: UInt, lpphonestatus: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetStatusA(hphone.toInt(), lpphonestatus.toString()) as Int) else 0

public actual fun phoneGetStatusMessages(hphone: UInt, lpdwphonestates: Long, lpdwbuttonmodes: Long, lpdwbuttonstates: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetStatusMessages(hphone.toInt(), lpdwphonestates.toString(), lpdwbuttonmodes.toString(), lpdwbuttonstates.toString()) as Int) else 0

public actual fun phoneGetStatusW(hphone: UInt, lpphonestatus: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetStatusW(hphone.toInt(), lpphonestatus.toString()) as Int) else 0

public actual fun phoneGetVolume(hphone: UInt, dwhookswitchdev: UInt, lpdwvolume: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneGetVolume(hphone.toInt(), dwhookswitchdev.toInt(), lpdwvolume.toString()) as Int) else 0

public actual fun phoneInitialize(lphphoneapp: Long, hinstance: HINSTANCE, lpfncallback: PHONECALLBACK, lpszappname: PCSTR, lpdwnumdevs: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneInitialize(lphphoneapp.toString(), hinstance.toString(), lpfncallback.toLong().toString(), lpszappname.toString(), lpdwnumdevs.toString()) as Int) else 0

public actual fun phoneInitializeExA(lphphoneapp: Long, hinstance: HINSTANCE, lpfncallback: PHONECALLBACK, lpszfriendlyappname: PCSTR, lpdwnumdevs: Long, lpdwapiversion: Long, lpphoneinitializeexparams: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneInitializeExA(lphphoneapp.toString(), hinstance.toString(), lpfncallback.toLong().toString(), lpszfriendlyappname.toString(), lpdwnumdevs.toString(), lpdwapiversion.toString(), lpphoneinitializeexparams.toString()) as Int) else 0

public actual fun phoneInitializeExW(lphphoneapp: Long, hinstance: HINSTANCE, lpfncallback: PHONECALLBACK, lpszfriendlyappname: PCWSTR, lpdwnumdevs: Long, lpdwapiversion: Long, lpphoneinitializeexparams: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneInitializeExW(lphphoneapp.toString(), hinstance.toString(), lpfncallback.toLong().toString(), lpszfriendlyappname.toString(), lpdwnumdevs.toString(), lpdwapiversion.toString(), lpphoneinitializeexparams.toString()) as Int) else 0

public actual fun phoneNegotiateAPIVersion(hphoneapp: UInt, dwdeviceid: UInt, dwapilowversion: UInt, dwapihighversion: UInt, lpdwapiversion: Long, lpextensionid: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneNegotiateAPIVersion(hphoneapp.toInt(), dwdeviceid.toInt(), dwapilowversion.toInt(), dwapihighversion.toInt(), lpdwapiversion.toString(), lpextensionid.toString()) as Int) else 0

public actual fun phoneNegotiateExtVersion(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextlowversion: UInt, dwexthighversion: UInt, lpdwextversion: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneNegotiateExtVersion(hphoneapp.toInt(), dwdeviceid.toInt(), dwapiversion.toInt(), dwextlowversion.toInt(), dwexthighversion.toInt(), lpdwextversion.toString()) as Int) else 0

public actual fun phoneOpen(hphoneapp: UInt, dwdeviceid: UInt, lphphone: Long, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivilege: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneOpen(hphoneapp.toInt(), dwdeviceid.toInt(), lphphone.toString(), dwapiversion.toInt(), dwextversion.toInt(), dwcallbackinstance.toString(), dwprivilege.toInt()) as Int) else 0

public actual fun phoneSetButtonInfo(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneSetButtonInfo(hphone.toInt(), dwbuttonlampid.toInt(), lpbuttoninfo.toString()) as Int) else 0

public actual fun phoneSetButtonInfoA(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneSetButtonInfoA(hphone.toInt(), dwbuttonlampid.toInt(), lpbuttoninfo.toString()) as Int) else 0

public actual fun phoneSetButtonInfoW(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: Long): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneSetButtonInfoW(hphone.toInt(), dwbuttonlampid.toInt(), lpbuttoninfo.toString()) as Int) else 0

public actual fun phoneSetData(hphone: UInt, dwdataid: UInt, lpdata: Long, dwsize: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneSetData(hphone.toInt(), dwdataid.toInt(), lpdata.toString(), dwsize.toInt()) as Int) else 0

public actual fun phoneSetDisplay(hphone: UInt, dwrow: UInt, dwcolumn: UInt, lpsdisplay: PCSTR, dwsize: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneSetDisplay(hphone.toInt(), dwrow.toInt(), dwcolumn.toInt(), lpsdisplay.toString(), dwsize.toInt()) as Int) else 0

public actual fun phoneSetGain(hphone: UInt, dwhookswitchdev: UInt, dwgain: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneSetGain(hphone.toInt(), dwhookswitchdev.toInt(), dwgain.toInt()) as Int) else 0

public actual fun phoneSetHookSwitch(hphone: UInt, dwhookswitchdevs: UInt, dwhookswitchmode: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneSetHookSwitch(hphone.toInt(), dwhookswitchdevs.toInt(), dwhookswitchmode.toInt()) as Int) else 0

public actual fun phoneSetLamp(hphone: UInt, dwbuttonlampid: UInt, dwlampmode: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneSetLamp(hphone.toInt(), dwbuttonlampid.toInt(), dwlampmode.toInt()) as Int) else 0

public actual fun phoneSetRing(hphone: UInt, dwringmode: UInt, dwvolume: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneSetRing(hphone.toInt(), dwringmode.toInt(), dwvolume.toInt()) as Int) else 0

public actual fun phoneSetStatusMessages(hphone: UInt, dwphonestates: UInt, dwbuttonmodes: UInt, dwbuttonstates: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneSetStatusMessages(hphone.toInt(), dwphonestates.toInt(), dwbuttonmodes.toInt(), dwbuttonstates.toInt()) as Int) else 0

public actual fun phoneSetVolume(hphone: UInt, dwhookswitchdev: UInt, dwvolume: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneSetVolume(hphone.toInt(), dwhookswitchdev.toInt(), dwvolume.toInt()) as Int) else 0

public actual fun phoneShutdown(hphoneapp: UInt): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_phoneShutdown(hphoneapp.toInt()) as Int) else 0

public actual fun tapiGetLocationInfo(lpszcountrycode: PSTR, lpszcitycode: PSTR): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_tapiGetLocationInfo(lpszcountrycode.toString(), lpszcitycode.toString()) as Int) else 0

public actual fun tapiGetLocationInfoA(lpszcountrycode: PSTR, lpszcitycode: PSTR): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_tapiGetLocationInfoA(lpszcountrycode.toString(), lpszcitycode.toString()) as Int) else 0

public actual fun tapiGetLocationInfoW(lpszcountrycodew: PWSTR, lpszcitycodew: PWSTR): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_tapiGetLocationInfoW(lpszcountrycodew.toString(), lpszcitycodew.toString()) as Int) else 0

public actual fun tapiRequestDrop(hwnd: HWND, wrequestid: WPARAM): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_tapiRequestDrop(hwnd.toString(), wrequestid.toString()) as Int) else 0

public actual fun tapiRequestMakeCall(lpszdestaddress: PCSTR, lpszappname: PCSTR, lpszcalledparty: PCSTR, lpszcomment: PCSTR): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_tapiRequestMakeCall(lpszdestaddress.toString(), lpszappname.toString(), lpszcalledparty.toString(), lpszcomment.toString()) as Int) else 0

public actual fun tapiRequestMakeCallA(lpszdestaddress: PCSTR, lpszappname: PCSTR, lpszcalledparty: PCSTR, lpszcomment: PCSTR): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_tapiRequestMakeCallA(lpszdestaddress.toString(), lpszappname.toString(), lpszcalledparty.toString(), lpszcomment.toString()) as Int) else 0

public actual fun tapiRequestMakeCallW(lpszdestaddress: PCWSTR, lpszappname: PCWSTR, lpszcalledparty: PCWSTR, lpszcomment: PCWSTR): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_tapiRequestMakeCallW(lpszdestaddress.toString(), lpszappname.toString(), lpszcalledparty.toString(), lpszcomment.toString()) as Int) else 0

public actual fun tapiRequestMediaCall(hwnd: HWND, wrequestid: WPARAM, lpszdeviceclass: PCSTR, lpdeviceid: PCSTR, dwsize: UInt, dwsecure: UInt, lpszdestaddress: PCSTR, lpszappname: PCSTR, lpszcalledparty: PCSTR, lpszcomment: PCSTR): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_tapiRequestMediaCall(hwnd.toString(), wrequestid.toString(), lpszdeviceclass.toString(), lpdeviceid.toString(), dwsize.toInt(), dwsecure.toInt(), lpszdestaddress.toString(), lpszappname.toString(), lpszcalledparty.toString(), lpszcomment.toString()) as Int) else 0

public actual fun tapiRequestMediaCallA(hwnd: HWND, wrequestid: WPARAM, lpszdeviceclass: PCSTR, lpdeviceid: PCSTR, dwsize: UInt, dwsecure: UInt, lpszdestaddress: PCSTR, lpszappname: PCSTR, lpszcalledparty: PCSTR, lpszcomment: PCSTR): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_tapiRequestMediaCallA(hwnd.toString(), wrequestid.toString(), lpszdeviceclass.toString(), lpdeviceid.toString(), dwsize.toInt(), dwsecure.toInt(), lpszdestaddress.toString(), lpszappname.toString(), lpszcalledparty.toString(), lpszcomment.toString()) as Int) else 0

public actual fun tapiRequestMediaCallW(hwnd: HWND, wrequestid: WPARAM, lpszdeviceclass: PCWSTR, lpdeviceid: PCWSTR, dwsize: UInt, dwsecure: UInt, lpszdestaddress: PCWSTR, lpszappname: PCWSTR, lpszcalledparty: PCWSTR, lpszcomment: PCWSTR): Int =
    if (_windowsWin32DevicesTapiNapiAddon != null) (_windowsWin32DevicesTapiNapiAddon.windowssys_windows_win32_devices_tapi_tapiRequestMediaCallW(hwnd.toString(), wrequestid.toString(), lpszdeviceclass.toString(), lpdeviceid.toString(), dwsize.toInt(), dwsecure.toInt(), lpszdestaddress.toString(), lpszappname.toString(), lpszcalledparty.toString(), lpszcomment.toString()) as Int) else 0
