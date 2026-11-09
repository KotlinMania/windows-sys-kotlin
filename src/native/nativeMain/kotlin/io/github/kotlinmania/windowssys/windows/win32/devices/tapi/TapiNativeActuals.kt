@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.tapi

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.WPARAM
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun GetTnefStreamCodepage(lpstream: Long, lpulcodepage: Long, lpulsubcodepage: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_GetTnefStreamCodepage(lpstream.toCPointer<ByteVar>(), lpulcodepage.toCPointer<ByteVar>(), lpulsubcodepage.toCPointer<ByteVar>())

public actual fun OpenTnefStream(lpvsupport: Long, lpstream: Long, lpszstreamname: Long, ulflags: UInt, lpmessage: Long, wkeyval: UShort, lpptnef: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_OpenTnefStream(lpvsupport.toCPointer<ByteVar>(), lpstream.toCPointer<ByteVar>(), lpszstreamname.toCPointer<ByteVar>(), ulflags, lpmessage.toCPointer<ByteVar>(), wkeyval, lpptnef.toCPointer<ByteVar>())

public actual fun OpenTnefStreamEx(lpvsupport: Long, lpstream: Long, lpszstreamname: Long, ulflags: UInt, lpmessage: Long, wkeyval: UShort, lpadressbook: Long, lpptnef: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_OpenTnefStreamEx(lpvsupport.toCPointer<ByteVar>(), lpstream.toCPointer<ByteVar>(), lpszstreamname.toCPointer<ByteVar>(), ulflags, lpmessage.toCPointer<ByteVar>(), wkeyval, lpadressbook.toCPointer<ByteVar>(), lpptnef.toCPointer<ByteVar>())

public actual fun lineAccept(hcall: UInt, lpsuseruserinfo: PCSTR, dwsize: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineAccept(hcall, lpsuseruserinfo.toCPointer<ByteVar>(), dwsize)

public actual fun lineAddProvider(lpszproviderfilename: PCSTR, hwndowner: HWND, lpdwpermanentproviderid: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineAddProvider(lpszproviderfilename.toCPointer<ByteVar>(), hwndowner.toCPointer<ByteVar>(), lpdwpermanentproviderid.toCPointer<ByteVar>())

public actual fun lineAddProviderA(lpszproviderfilename: PCSTR, hwndowner: HWND, lpdwpermanentproviderid: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineAddProviderA(lpszproviderfilename.toCPointer<ByteVar>(), hwndowner.toCPointer<ByteVar>(), lpdwpermanentproviderid.toCPointer<ByteVar>())

public actual fun lineAddProviderW(lpszproviderfilename: PCWSTR, hwndowner: HWND, lpdwpermanentproviderid: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineAddProviderW(lpszproviderfilename.toCPointer<ByteVar>(), hwndowner.toCPointer<ByteVar>(), lpdwpermanentproviderid.toCPointer<ByteVar>())

public actual fun lineAddToConference(hconfcall: UInt, hconsultcall: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineAddToConference(hconfcall, hconsultcall)

public actual fun lineAgentSpecific(hline: UInt, dwaddressid: UInt, dwagentextensionidindex: UInt, lpparams: Long, dwsize: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineAgentSpecific(hline, dwaddressid, dwagentextensionidindex, lpparams.toCPointer<ByteVar>(), dwsize)

public actual fun lineAnswer(hcall: UInt, lpsuseruserinfo: PCSTR, dwsize: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineAnswer(hcall, lpsuseruserinfo.toCPointer<ByteVar>(), dwsize)

public actual fun lineBlindTransfer(hcall: UInt, lpszdestaddress: PCSTR, dwcountrycode: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineBlindTransfer(hcall, lpszdestaddress.toCPointer<ByteVar>(), dwcountrycode)

public actual fun lineBlindTransferA(hcall: UInt, lpszdestaddress: PCSTR, dwcountrycode: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineBlindTransferA(hcall, lpszdestaddress.toCPointer<ByteVar>(), dwcountrycode)

public actual fun lineBlindTransferW(hcall: UInt, lpszdestaddressw: PCWSTR, dwcountrycode: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineBlindTransferW(hcall, lpszdestaddressw.toCPointer<ByteVar>(), dwcountrycode)

public actual fun lineClose(hline: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineClose(hline)

public actual fun lineCompleteCall(hcall: UInt, lpdwcompletionid: Long, dwcompletionmode: UInt, dwmessageid: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineCompleteCall(hcall, lpdwcompletionid.toCPointer<ByteVar>(), dwcompletionmode, dwmessageid)

public actual fun lineCompleteTransfer(hcall: UInt, hconsultcall: UInt, lphconfcall: Long, dwtransfermode: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineCompleteTransfer(hcall, hconsultcall, lphconfcall.toCPointer<ByteVar>(), dwtransfermode)

public actual fun lineConfigDialog(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineConfigDialog(dwdeviceid, hwndowner.toCPointer<ByteVar>(), lpszdeviceclass.toCPointer<ByteVar>())

public actual fun lineConfigDialogA(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineConfigDialogA(dwdeviceid, hwndowner.toCPointer<ByteVar>(), lpszdeviceclass.toCPointer<ByteVar>())

public actual fun lineConfigDialogEdit(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCSTR, lpdeviceconfigin: Long, dwsize: UInt, lpdeviceconfigout: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineConfigDialogEdit(dwdeviceid, hwndowner.toCPointer<ByteVar>(), lpszdeviceclass.toCPointer<ByteVar>(), lpdeviceconfigin.toCPointer<ByteVar>(), dwsize, lpdeviceconfigout.toCPointer<ByteVar>())

public actual fun lineConfigDialogEditA(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCSTR, lpdeviceconfigin: Long, dwsize: UInt, lpdeviceconfigout: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineConfigDialogEditA(dwdeviceid, hwndowner.toCPointer<ByteVar>(), lpszdeviceclass.toCPointer<ByteVar>(), lpdeviceconfigin.toCPointer<ByteVar>(), dwsize, lpdeviceconfigout.toCPointer<ByteVar>())

public actual fun lineConfigDialogEditW(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCWSTR, lpdeviceconfigin: Long, dwsize: UInt, lpdeviceconfigout: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineConfigDialogEditW(dwdeviceid, hwndowner.toCPointer<ByteVar>(), lpszdeviceclass.toCPointer<ByteVar>(), lpdeviceconfigin.toCPointer<ByteVar>(), dwsize, lpdeviceconfigout.toCPointer<ByteVar>())

public actual fun lineConfigDialogW(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineConfigDialogW(dwdeviceid, hwndowner.toCPointer<ByteVar>(), lpszdeviceclass.toCPointer<ByteVar>())

public actual fun lineConfigProvider(hwndowner: HWND, dwpermanentproviderid: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineConfigProvider(hwndowner.toCPointer<ByteVar>(), dwpermanentproviderid)

public actual fun lineCreateAgentA(hline: UInt, lpszagentid: PCSTR, lpszagentpin: PCSTR, lphagent: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineCreateAgentA(hline, lpszagentid.toCPointer<ByteVar>(), lpszagentpin.toCPointer<ByteVar>(), lphagent.toCPointer<ByteVar>())

public actual fun lineCreateAgentSessionA(hline: UInt, hagent: UInt, lpszagentpin: PCSTR, dwworkingaddressid: UInt, lpgroupid: Long, lphagentsession: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineCreateAgentSessionA(hline, hagent, lpszagentpin.toCPointer<ByteVar>(), dwworkingaddressid, lpgroupid.toCPointer<ByteVar>(), lphagentsession.toCPointer<ByteVar>())

public actual fun lineCreateAgentSessionW(hline: UInt, hagent: UInt, lpszagentpin: PCWSTR, dwworkingaddressid: UInt, lpgroupid: Long, lphagentsession: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineCreateAgentSessionW(hline, hagent, lpszagentpin.toCPointer<ByteVar>(), dwworkingaddressid, lpgroupid.toCPointer<ByteVar>(), lphagentsession.toCPointer<ByteVar>())

public actual fun lineCreateAgentW(hline: UInt, lpszagentid: PCWSTR, lpszagentpin: PCWSTR, lphagent: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineCreateAgentW(hline, lpszagentid.toCPointer<ByteVar>(), lpszagentpin.toCPointer<ByteVar>(), lphagent.toCPointer<ByteVar>())

public actual fun lineDeallocateCall(hcall: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineDeallocateCall(hcall)

public actual fun lineDevSpecific(hline: UInt, dwaddressid: UInt, hcall: UInt, lpparams: Long, dwsize: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineDevSpecific(hline, dwaddressid, hcall, lpparams.toCPointer<ByteVar>(), dwsize)

public actual fun lineDevSpecificFeature(hline: UInt, dwfeature: UInt, lpparams: Long, dwsize: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineDevSpecificFeature(hline, dwfeature, lpparams.toCPointer<ByteVar>(), dwsize)

public actual fun lineDial(hcall: UInt, lpszdestaddress: PCSTR, dwcountrycode: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineDial(hcall, lpszdestaddress.toCPointer<ByteVar>(), dwcountrycode)

public actual fun lineDialA(hcall: UInt, lpszdestaddress: PCSTR, dwcountrycode: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineDialA(hcall, lpszdestaddress.toCPointer<ByteVar>(), dwcountrycode)

public actual fun lineDialW(hcall: UInt, lpszdestaddress: PCWSTR, dwcountrycode: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineDialW(hcall, lpszdestaddress.toCPointer<ByteVar>(), dwcountrycode)

public actual fun lineDrop(hcall: UInt, lpsuseruserinfo: PCSTR, dwsize: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineDrop(hcall, lpsuseruserinfo.toCPointer<ByteVar>(), dwsize)

public actual fun lineForward(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: Long, dwnumringsnoanswer: UInt, lphconsultcall: Long, lpcallparams: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineForward(hline, balladdresses, dwaddressid, lpforwardlist.toCPointer<ByteVar>(), dwnumringsnoanswer, lphconsultcall.toCPointer<ByteVar>(), lpcallparams.toCPointer<ByteVar>())

public actual fun lineForwardA(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: Long, dwnumringsnoanswer: UInt, lphconsultcall: Long, lpcallparams: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineForwardA(hline, balladdresses, dwaddressid, lpforwardlist.toCPointer<ByteVar>(), dwnumringsnoanswer, lphconsultcall.toCPointer<ByteVar>(), lpcallparams.toCPointer<ByteVar>())

public actual fun lineForwardW(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: Long, dwnumringsnoanswer: UInt, lphconsultcall: Long, lpcallparams: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineForwardW(hline, balladdresses, dwaddressid, lpforwardlist.toCPointer<ByteVar>(), dwnumringsnoanswer, lphconsultcall.toCPointer<ByteVar>(), lpcallparams.toCPointer<ByteVar>())

public actual fun lineGatherDigits(hcall: UInt, dwdigitmodes: UInt, lpsdigits: PSTR, dwnumdigits: UInt, lpszterminationdigits: PCSTR, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGatherDigits(hcall, dwdigitmodes, lpsdigits.toCPointer<ByteVar>(), dwnumdigits, lpszterminationdigits.toCPointer<ByteVar>(), dwfirstdigittimeout, dwinterdigittimeout)

public actual fun lineGatherDigitsA(hcall: UInt, dwdigitmodes: UInt, lpsdigits: PSTR, dwnumdigits: UInt, lpszterminationdigits: PCSTR, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGatherDigitsA(hcall, dwdigitmodes, lpsdigits.toCPointer<ByteVar>(), dwnumdigits, lpszterminationdigits.toCPointer<ByteVar>(), dwfirstdigittimeout, dwinterdigittimeout)

public actual fun lineGatherDigitsW(hcall: UInt, dwdigitmodes: UInt, lpsdigits: PWSTR, dwnumdigits: UInt, lpszterminationdigits: PCWSTR, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGatherDigitsW(hcall, dwdigitmodes, lpsdigits.toCPointer<ByteVar>(), dwnumdigits, lpszterminationdigits.toCPointer<ByteVar>(), dwfirstdigittimeout, dwinterdigittimeout)

public actual fun lineGenerateDigits(hcall: UInt, dwdigitmode: UInt, lpszdigits: PCSTR, dwduration: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGenerateDigits(hcall, dwdigitmode, lpszdigits.toCPointer<ByteVar>(), dwduration)

public actual fun lineGenerateDigitsA(hcall: UInt, dwdigitmode: UInt, lpszdigits: PCSTR, dwduration: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGenerateDigitsA(hcall, dwdigitmode, lpszdigits.toCPointer<ByteVar>(), dwduration)

public actual fun lineGenerateDigitsW(hcall: UInt, dwdigitmode: UInt, lpszdigits: PCWSTR, dwduration: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGenerateDigitsW(hcall, dwdigitmode, lpszdigits.toCPointer<ByteVar>(), dwduration)

public actual fun lineGenerateTone(hcall: UInt, dwtonemode: UInt, dwduration: UInt, dwnumtones: UInt, lptones: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGenerateTone(hcall, dwtonemode, dwduration, dwnumtones, lptones.toCPointer<ByteVar>())

public actual fun lineGetAddressCaps(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetAddressCaps(hlineapp, dwdeviceid, dwaddressid, dwapiversion, dwextversion, lpaddresscaps.toCPointer<ByteVar>())

public actual fun lineGetAddressCapsA(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetAddressCapsA(hlineapp, dwdeviceid, dwaddressid, dwapiversion, dwextversion, lpaddresscaps.toCPointer<ByteVar>())

public actual fun lineGetAddressCapsW(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetAddressCapsW(hlineapp, dwdeviceid, dwaddressid, dwapiversion, dwextversion, lpaddresscaps.toCPointer<ByteVar>())

public actual fun lineGetAddressID(hline: UInt, lpdwaddressid: Long, dwaddressmode: UInt, lpsaddress: PCSTR, dwsize: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetAddressID(hline, lpdwaddressid.toCPointer<ByteVar>(), dwaddressmode, lpsaddress.toCPointer<ByteVar>(), dwsize)

public actual fun lineGetAddressIDA(hline: UInt, lpdwaddressid: Long, dwaddressmode: UInt, lpsaddress: PCSTR, dwsize: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetAddressIDA(hline, lpdwaddressid.toCPointer<ByteVar>(), dwaddressmode, lpsaddress.toCPointer<ByteVar>(), dwsize)

public actual fun lineGetAddressIDW(hline: UInt, lpdwaddressid: Long, dwaddressmode: UInt, lpsaddress: PCWSTR, dwsize: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetAddressIDW(hline, lpdwaddressid.toCPointer<ByteVar>(), dwaddressmode, lpsaddress.toCPointer<ByteVar>(), dwsize)

public actual fun lineGetAddressStatus(hline: UInt, dwaddressid: UInt, lpaddressstatus: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetAddressStatus(hline, dwaddressid, lpaddressstatus.toCPointer<ByteVar>())

public actual fun lineGetAddressStatusA(hline: UInt, dwaddressid: UInt, lpaddressstatus: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetAddressStatusA(hline, dwaddressid, lpaddressstatus.toCPointer<ByteVar>())

public actual fun lineGetAddressStatusW(hline: UInt, dwaddressid: UInt, lpaddressstatus: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetAddressStatusW(hline, dwaddressid, lpaddressstatus.toCPointer<ByteVar>())

public actual fun lineGetAgentActivityListA(hline: UInt, dwaddressid: UInt, lpagentactivitylist: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetAgentActivityListA(hline, dwaddressid, lpagentactivitylist.toCPointer<ByteVar>())

public actual fun lineGetAgentActivityListW(hline: UInt, dwaddressid: UInt, lpagentactivitylist: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetAgentActivityListW(hline, dwaddressid, lpagentactivitylist.toCPointer<ByteVar>())

public actual fun lineGetAgentCapsA(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwappapiversion: UInt, lpagentcaps: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetAgentCapsA(hlineapp, dwdeviceid, dwaddressid, dwappapiversion, lpagentcaps.toCPointer<ByteVar>())

public actual fun lineGetAgentCapsW(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwappapiversion: UInt, lpagentcaps: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetAgentCapsW(hlineapp, dwdeviceid, dwaddressid, dwappapiversion, lpagentcaps.toCPointer<ByteVar>())

public actual fun lineGetAgentGroupListA(hline: UInt, dwaddressid: UInt, lpagentgrouplist: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetAgentGroupListA(hline, dwaddressid, lpagentgrouplist.toCPointer<ByteVar>())

public actual fun lineGetAgentGroupListW(hline: UInt, dwaddressid: UInt, lpagentgrouplist: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetAgentGroupListW(hline, dwaddressid, lpagentgrouplist.toCPointer<ByteVar>())

public actual fun lineGetAgentInfo(hline: UInt, hagent: UInt, lpagentinfo: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetAgentInfo(hline, hagent, lpagentinfo.toCPointer<ByteVar>())

public actual fun lineGetAgentSessionInfo(hline: UInt, hagentsession: UInt, lpagentsessioninfo: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetAgentSessionInfo(hline, hagentsession, lpagentsessioninfo.toCPointer<ByteVar>())

public actual fun lineGetAgentSessionList(hline: UInt, hagent: UInt, lpagentsessionlist: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetAgentSessionList(hline, hagent, lpagentsessionlist.toCPointer<ByteVar>())

public actual fun lineGetAgentStatusA(hline: UInt, dwaddressid: UInt, lpagentstatus: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetAgentStatusA(hline, dwaddressid, lpagentstatus.toCPointer<ByteVar>())

public actual fun lineGetAgentStatusW(hline: UInt, dwaddressid: UInt, lpagentstatus: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetAgentStatusW(hline, dwaddressid, lpagentstatus.toCPointer<ByteVar>())

public actual fun lineGetAppPriority(lpszappfilename: PCSTR, dwmediamode: UInt, lpextensionid: Long, dwrequestmode: UInt, lpextensionname: Long, lpdwpriority: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetAppPriority(lpszappfilename.toCPointer<ByteVar>(), dwmediamode, lpextensionid.toCPointer<ByteVar>(), dwrequestmode, lpextensionname.toCPointer<ByteVar>(), lpdwpriority.toCPointer<ByteVar>())

public actual fun lineGetAppPriorityA(lpszappfilename: PCSTR, dwmediamode: UInt, lpextensionid: Long, dwrequestmode: UInt, lpextensionname: Long, lpdwpriority: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetAppPriorityA(lpszappfilename.toCPointer<ByteVar>(), dwmediamode, lpextensionid.toCPointer<ByteVar>(), dwrequestmode, lpextensionname.toCPointer<ByteVar>(), lpdwpriority.toCPointer<ByteVar>())

public actual fun lineGetAppPriorityW(lpszappfilename: PCWSTR, dwmediamode: UInt, lpextensionid: Long, dwrequestmode: UInt, lpextensionname: Long, lpdwpriority: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetAppPriorityW(lpszappfilename.toCPointer<ByteVar>(), dwmediamode, lpextensionid.toCPointer<ByteVar>(), dwrequestmode, lpextensionname.toCPointer<ByteVar>(), lpdwpriority.toCPointer<ByteVar>())

public actual fun lineGetCallInfo(hcall: UInt, lpcallinfo: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetCallInfo(hcall, lpcallinfo.toCPointer<ByteVar>())

public actual fun lineGetCallInfoA(hcall: UInt, lpcallinfo: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetCallInfoA(hcall, lpcallinfo.toCPointer<ByteVar>())

public actual fun lineGetCallInfoW(hcall: UInt, lpcallinfo: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetCallInfoW(hcall, lpcallinfo.toCPointer<ByteVar>())

public actual fun lineGetCallStatus(hcall: UInt, lpcallstatus: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetCallStatus(hcall, lpcallstatus.toCPointer<ByteVar>())

public actual fun lineGetConfRelatedCalls(hcall: UInt, lpcalllist: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetConfRelatedCalls(hcall, lpcalllist.toCPointer<ByteVar>())

public actual fun lineGetCountry(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetCountry(dwcountryid, dwapiversion, lplinecountrylist.toCPointer<ByteVar>())

public actual fun lineGetCountryA(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetCountryA(dwcountryid, dwapiversion, lplinecountrylist.toCPointer<ByteVar>())

public actual fun lineGetCountryW(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetCountryW(dwcountryid, dwapiversion, lplinecountrylist.toCPointer<ByteVar>())

public actual fun lineGetDevCaps(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetDevCaps(hlineapp, dwdeviceid, dwapiversion, dwextversion, lplinedevcaps.toCPointer<ByteVar>())

public actual fun lineGetDevCapsA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetDevCapsA(hlineapp, dwdeviceid, dwapiversion, dwextversion, lplinedevcaps.toCPointer<ByteVar>())

public actual fun lineGetDevCapsW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetDevCapsW(hlineapp, dwdeviceid, dwapiversion, dwextversion, lplinedevcaps.toCPointer<ByteVar>())

public actual fun lineGetDevConfig(dwdeviceid: UInt, lpdeviceconfig: Long, lpszdeviceclass: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetDevConfig(dwdeviceid, lpdeviceconfig.toCPointer<ByteVar>(), lpszdeviceclass.toCPointer<ByteVar>())

public actual fun lineGetDevConfigA(dwdeviceid: UInt, lpdeviceconfig: Long, lpszdeviceclass: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetDevConfigA(dwdeviceid, lpdeviceconfig.toCPointer<ByteVar>(), lpszdeviceclass.toCPointer<ByteVar>())

public actual fun lineGetDevConfigW(dwdeviceid: UInt, lpdeviceconfig: Long, lpszdeviceclass: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetDevConfigW(dwdeviceid, lpdeviceconfig.toCPointer<ByteVar>(), lpszdeviceclass.toCPointer<ByteVar>())

public actual fun lineGetGroupListA(hline: UInt, lpgrouplist: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetGroupListA(hline, lpgrouplist.toCPointer<ByteVar>())

public actual fun lineGetGroupListW(hline: UInt, lpgrouplist: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetGroupListW(hline, lpgrouplist.toCPointer<ByteVar>())

public actual fun lineGetID(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: Long, lpszdeviceclass: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetID(hline, dwaddressid, hcall, dwselect, lpdeviceid.toCPointer<ByteVar>(), lpszdeviceclass.toCPointer<ByteVar>())

public actual fun lineGetIDA(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: Long, lpszdeviceclass: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetIDA(hline, dwaddressid, hcall, dwselect, lpdeviceid.toCPointer<ByteVar>(), lpszdeviceclass.toCPointer<ByteVar>())

public actual fun lineGetIDW(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: Long, lpszdeviceclass: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetIDW(hline, dwaddressid, hcall, dwselect, lpdeviceid.toCPointer<ByteVar>(), lpszdeviceclass.toCPointer<ByteVar>())

public actual fun lineGetIcon(dwdeviceid: UInt, lpszdeviceclass: PCSTR, lphicon: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetIcon(dwdeviceid, lpszdeviceclass.toCPointer<ByteVar>(), lphicon.toCPointer<ByteVar>())

public actual fun lineGetIconA(dwdeviceid: UInt, lpszdeviceclass: PCSTR, lphicon: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetIconA(dwdeviceid, lpszdeviceclass.toCPointer<ByteVar>(), lphicon.toCPointer<ByteVar>())

public actual fun lineGetIconW(dwdeviceid: UInt, lpszdeviceclass: PCWSTR, lphicon: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetIconW(dwdeviceid, lpszdeviceclass.toCPointer<ByteVar>(), lphicon.toCPointer<ByteVar>())

public actual fun lineGetLineDevStatus(hline: UInt, lplinedevstatus: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetLineDevStatus(hline, lplinedevstatus.toCPointer<ByteVar>())

public actual fun lineGetLineDevStatusA(hline: UInt, lplinedevstatus: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetLineDevStatusA(hline, lplinedevstatus.toCPointer<ByteVar>())

public actual fun lineGetLineDevStatusW(hline: UInt, lplinedevstatus: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetLineDevStatusW(hline, lplinedevstatus.toCPointer<ByteVar>())

public actual fun lineGetMessage(hlineapp: UInt, lpmessage: Long, dwtimeout: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetMessage(hlineapp, lpmessage.toCPointer<ByteVar>(), dwtimeout)

public actual fun lineGetNewCalls(hline: UInt, dwaddressid: UInt, dwselect: UInt, lpcalllist: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetNewCalls(hline, dwaddressid, dwselect, lpcalllist.toCPointer<ByteVar>())

public actual fun lineGetNumRings(hline: UInt, dwaddressid: UInt, lpdwnumrings: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetNumRings(hline, dwaddressid, lpdwnumrings.toCPointer<ByteVar>())

public actual fun lineGetProviderList(dwapiversion: UInt, lpproviderlist: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetProviderList(dwapiversion, lpproviderlist.toCPointer<ByteVar>())

public actual fun lineGetProviderListA(dwapiversion: UInt, lpproviderlist: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetProviderListA(dwapiversion, lpproviderlist.toCPointer<ByteVar>())

public actual fun lineGetProviderListW(dwapiversion: UInt, lpproviderlist: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetProviderListW(dwapiversion, lpproviderlist.toCPointer<ByteVar>())

public actual fun lineGetProxyStatus(hlineapp: UInt, dwdeviceid: UInt, dwappapiversion: UInt, lplineproxyreqestlist: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetProxyStatus(hlineapp, dwdeviceid, dwappapiversion, lplineproxyreqestlist.toCPointer<ByteVar>())

public actual fun lineGetQueueInfo(hline: UInt, dwqueueid: UInt, lplinequeueinfo: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetQueueInfo(hline, dwqueueid, lplinequeueinfo.toCPointer<ByteVar>())

public actual fun lineGetQueueListA(hline: UInt, lpgroupid: Long, lpqueuelist: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetQueueListA(hline, lpgroupid.toCPointer<ByteVar>(), lpqueuelist.toCPointer<ByteVar>())

public actual fun lineGetQueueListW(hline: UInt, lpgroupid: Long, lpqueuelist: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetQueueListW(hline, lpgroupid.toCPointer<ByteVar>(), lpqueuelist.toCPointer<ByteVar>())

public actual fun lineGetRequest(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetRequest(hlineapp, dwrequestmode, lprequestbuffer.toCPointer<ByteVar>())

public actual fun lineGetRequestA(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetRequestA(hlineapp, dwrequestmode, lprequestbuffer.toCPointer<ByteVar>())

public actual fun lineGetRequestW(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetRequestW(hlineapp, dwrequestmode, lprequestbuffer.toCPointer<ByteVar>())

public actual fun lineGetStatusMessages(hline: UInt, lpdwlinestates: Long, lpdwaddressstates: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetStatusMessages(hline, lpdwlinestates.toCPointer<ByteVar>(), lpdwaddressstates.toCPointer<ByteVar>())

public actual fun lineGetTranslateCaps(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetTranslateCaps(hlineapp, dwapiversion, lptranslatecaps.toCPointer<ByteVar>())

public actual fun lineGetTranslateCapsA(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetTranslateCapsA(hlineapp, dwapiversion, lptranslatecaps.toCPointer<ByteVar>())

public actual fun lineGetTranslateCapsW(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineGetTranslateCapsW(hlineapp, dwapiversion, lptranslatecaps.toCPointer<ByteVar>())

public actual fun lineHandoff(hcall: UInt, lpszfilename: PCSTR, dwmediamode: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineHandoff(hcall, lpszfilename.toCPointer<ByteVar>(), dwmediamode)

public actual fun lineHandoffA(hcall: UInt, lpszfilename: PCSTR, dwmediamode: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineHandoffA(hcall, lpszfilename.toCPointer<ByteVar>(), dwmediamode)

public actual fun lineHandoffW(hcall: UInt, lpszfilename: PCWSTR, dwmediamode: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineHandoffW(hcall, lpszfilename.toCPointer<ByteVar>(), dwmediamode)

public actual fun lineHold(hcall: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineHold(hcall)

public actual fun lineInitialize(lphlineapp: Long, hinstance: HINSTANCE, lpfncallback: LINECALLBACK, lpszappname: PCSTR, lpdwnumdevs: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineInitialize(lphlineapp.toCPointer<ByteVar>(), hinstance.toCPointer<ByteVar>(), lpfncallback.toLong().toCPointer<ByteVar>(), lpszappname.toCPointer<ByteVar>(), lpdwnumdevs.toCPointer<ByteVar>())

public actual fun lineInitializeExA(lphlineapp: Long, hinstance: HINSTANCE, lpfncallback: LINECALLBACK, lpszfriendlyappname: PCSTR, lpdwnumdevs: Long, lpdwapiversion: Long, lplineinitializeexparams: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineInitializeExA(lphlineapp.toCPointer<ByteVar>(), hinstance.toCPointer<ByteVar>(), lpfncallback.toLong().toCPointer<ByteVar>(), lpszfriendlyappname.toCPointer<ByteVar>(), lpdwnumdevs.toCPointer<ByteVar>(), lpdwapiversion.toCPointer<ByteVar>(), lplineinitializeexparams.toCPointer<ByteVar>())

public actual fun lineInitializeExW(lphlineapp: Long, hinstance: HINSTANCE, lpfncallback: LINECALLBACK, lpszfriendlyappname: PCWSTR, lpdwnumdevs: Long, lpdwapiversion: Long, lplineinitializeexparams: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineInitializeExW(lphlineapp.toCPointer<ByteVar>(), hinstance.toCPointer<ByteVar>(), lpfncallback.toLong().toCPointer<ByteVar>(), lpszfriendlyappname.toCPointer<ByteVar>(), lpdwnumdevs.toCPointer<ByteVar>(), lpdwapiversion.toCPointer<ByteVar>(), lplineinitializeexparams.toCPointer<ByteVar>())

public actual fun lineMakeCall(hline: UInt, lphcall: Long, lpszdestaddress: PCSTR, dwcountrycode: UInt, lpcallparams: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineMakeCall(hline, lphcall.toCPointer<ByteVar>(), lpszdestaddress.toCPointer<ByteVar>(), dwcountrycode, lpcallparams.toCPointer<ByteVar>())

public actual fun lineMakeCallA(hline: UInt, lphcall: Long, lpszdestaddress: PCSTR, dwcountrycode: UInt, lpcallparams: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineMakeCallA(hline, lphcall.toCPointer<ByteVar>(), lpszdestaddress.toCPointer<ByteVar>(), dwcountrycode, lpcallparams.toCPointer<ByteVar>())

public actual fun lineMakeCallW(hline: UInt, lphcall: Long, lpszdestaddress: PCWSTR, dwcountrycode: UInt, lpcallparams: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineMakeCallW(hline, lphcall.toCPointer<ByteVar>(), lpszdestaddress.toCPointer<ByteVar>(), dwcountrycode, lpcallparams.toCPointer<ByteVar>())

public actual fun lineMonitorDigits(hcall: UInt, dwdigitmodes: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineMonitorDigits(hcall, dwdigitmodes)

public actual fun lineMonitorMedia(hcall: UInt, dwmediamodes: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineMonitorMedia(hcall, dwmediamodes)

public actual fun lineMonitorTones(hcall: UInt, lptonelist: Long, dwnumentries: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineMonitorTones(hcall, lptonelist.toCPointer<ByteVar>(), dwnumentries)

public actual fun lineNegotiateAPIVersion(hlineapp: UInt, dwdeviceid: UInt, dwapilowversion: UInt, dwapihighversion: UInt, lpdwapiversion: Long, lpextensionid: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineNegotiateAPIVersion(hlineapp, dwdeviceid, dwapilowversion, dwapihighversion, lpdwapiversion.toCPointer<ByteVar>(), lpextensionid.toCPointer<ByteVar>())

public actual fun lineNegotiateExtVersion(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextlowversion: UInt, dwexthighversion: UInt, lpdwextversion: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineNegotiateExtVersion(hlineapp, dwdeviceid, dwapiversion, dwextlowversion, dwexthighversion, lpdwextversion.toCPointer<ByteVar>())

public actual fun lineOpen(hlineapp: UInt, dwdeviceid: UInt, lphline: Long, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineOpen(hlineapp, dwdeviceid, lphline.toCPointer<ByteVar>(), dwapiversion, dwextversion, dwcallbackinstance, dwprivileges, dwmediamodes, lpcallparams.toCPointer<ByteVar>())

public actual fun lineOpenA(hlineapp: UInt, dwdeviceid: UInt, lphline: Long, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineOpenA(hlineapp, dwdeviceid, lphline.toCPointer<ByteVar>(), dwapiversion, dwextversion, dwcallbackinstance, dwprivileges, dwmediamodes, lpcallparams.toCPointer<ByteVar>())

public actual fun lineOpenW(hlineapp: UInt, dwdeviceid: UInt, lphline: Long, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineOpenW(hlineapp, dwdeviceid, lphline.toCPointer<ByteVar>(), dwapiversion, dwextversion, dwcallbackinstance, dwprivileges, dwmediamodes, lpcallparams.toCPointer<ByteVar>())

public actual fun linePark(hcall: UInt, dwparkmode: UInt, lpszdiraddress: PCSTR, lpnondiraddress: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_linePark(hcall, dwparkmode, lpszdiraddress.toCPointer<ByteVar>(), lpnondiraddress.toCPointer<ByteVar>())

public actual fun lineParkA(hcall: UInt, dwparkmode: UInt, lpszdiraddress: PCSTR, lpnondiraddress: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineParkA(hcall, dwparkmode, lpszdiraddress.toCPointer<ByteVar>(), lpnondiraddress.toCPointer<ByteVar>())

public actual fun lineParkW(hcall: UInt, dwparkmode: UInt, lpszdiraddress: PCWSTR, lpnondiraddress: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineParkW(hcall, dwparkmode, lpszdiraddress.toCPointer<ByteVar>(), lpnondiraddress.toCPointer<ByteVar>())

public actual fun linePickup(hline: UInt, dwaddressid: UInt, lphcall: Long, lpszdestaddress: PCSTR, lpszgroupid: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_linePickup(hline, dwaddressid, lphcall.toCPointer<ByteVar>(), lpszdestaddress.toCPointer<ByteVar>(), lpszgroupid.toCPointer<ByteVar>())

public actual fun linePickupA(hline: UInt, dwaddressid: UInt, lphcall: Long, lpszdestaddress: PCSTR, lpszgroupid: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_linePickupA(hline, dwaddressid, lphcall.toCPointer<ByteVar>(), lpszdestaddress.toCPointer<ByteVar>(), lpszgroupid.toCPointer<ByteVar>())

public actual fun linePickupW(hline: UInt, dwaddressid: UInt, lphcall: Long, lpszdestaddress: PCWSTR, lpszgroupid: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_linePickupW(hline, dwaddressid, lphcall.toCPointer<ByteVar>(), lpszdestaddress.toCPointer<ByteVar>(), lpszgroupid.toCPointer<ByteVar>())

public actual fun linePrepareAddToConference(hconfcall: UInt, lphconsultcall: Long, lpcallparams: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_linePrepareAddToConference(hconfcall, lphconsultcall.toCPointer<ByteVar>(), lpcallparams.toCPointer<ByteVar>())

public actual fun linePrepareAddToConferenceA(hconfcall: UInt, lphconsultcall: Long, lpcallparams: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_linePrepareAddToConferenceA(hconfcall, lphconsultcall.toCPointer<ByteVar>(), lpcallparams.toCPointer<ByteVar>())

public actual fun linePrepareAddToConferenceW(hconfcall: UInt, lphconsultcall: Long, lpcallparams: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_linePrepareAddToConferenceW(hconfcall, lphconsultcall.toCPointer<ByteVar>(), lpcallparams.toCPointer<ByteVar>())

public actual fun lineProxyMessage(hline: UInt, hcall: UInt, dwmsg: UInt, dwparam1: UInt, dwparam2: UInt, dwparam3: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineProxyMessage(hline, hcall, dwmsg, dwparam1, dwparam2, dwparam3)

public actual fun lineProxyResponse(hline: UInt, lpproxyrequest: Long, dwresult: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineProxyResponse(hline, lpproxyrequest.toCPointer<ByteVar>(), dwresult)

public actual fun lineRedirect(hcall: UInt, lpszdestaddress: PCSTR, dwcountrycode: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineRedirect(hcall, lpszdestaddress.toCPointer<ByteVar>(), dwcountrycode)

public actual fun lineRedirectA(hcall: UInt, lpszdestaddress: PCSTR, dwcountrycode: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineRedirectA(hcall, lpszdestaddress.toCPointer<ByteVar>(), dwcountrycode)

public actual fun lineRedirectW(hcall: UInt, lpszdestaddress: PCWSTR, dwcountrycode: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineRedirectW(hcall, lpszdestaddress.toCPointer<ByteVar>(), dwcountrycode)

public actual fun lineRegisterRequestRecipient(hlineapp: UInt, dwregistrationinstance: UInt, dwrequestmode: UInt, benable: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineRegisterRequestRecipient(hlineapp, dwregistrationinstance, dwrequestmode, benable)

public actual fun lineReleaseUserUserInfo(hcall: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineReleaseUserUserInfo(hcall)

public actual fun lineRemoveFromConference(hcall: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineRemoveFromConference(hcall)

public actual fun lineRemoveProvider(dwpermanentproviderid: UInt, hwndowner: HWND): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineRemoveProvider(dwpermanentproviderid, hwndowner.toCPointer<ByteVar>())

public actual fun lineSecureCall(hcall: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineSecureCall(hcall)

public actual fun lineSendUserUserInfo(hcall: UInt, lpsuseruserinfo: PCSTR, dwsize: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineSendUserUserInfo(hcall, lpsuseruserinfo.toCPointer<ByteVar>(), dwsize)

public actual fun lineSetAgentActivity(hline: UInt, dwaddressid: UInt, dwactivityid: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineSetAgentActivity(hline, dwaddressid, dwactivityid)

public actual fun lineSetAgentGroup(hline: UInt, dwaddressid: UInt, lpagentgrouplist: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineSetAgentGroup(hline, dwaddressid, lpagentgrouplist.toCPointer<ByteVar>())

public actual fun lineSetAgentMeasurementPeriod(hline: UInt, hagent: UInt, dwmeasurementperiod: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineSetAgentMeasurementPeriod(hline, hagent, dwmeasurementperiod)

public actual fun lineSetAgentSessionState(hline: UInt, hagentsession: UInt, dwagentsessionstate: UInt, dwnextagentsessionstate: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineSetAgentSessionState(hline, hagentsession, dwagentsessionstate, dwnextagentsessionstate)

public actual fun lineSetAgentState(hline: UInt, dwaddressid: UInt, dwagentstate: UInt, dwnextagentstate: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineSetAgentState(hline, dwaddressid, dwagentstate, dwnextagentstate)

public actual fun lineSetAgentStateEx(hline: UInt, hagent: UInt, dwagentstate: UInt, dwnextagentstate: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineSetAgentStateEx(hline, hagent, dwagentstate, dwnextagentstate)

public actual fun lineSetAppPriority(lpszappfilename: PCSTR, dwmediamode: UInt, lpextensionid: Long, dwrequestmode: UInt, lpszextensionname: PCSTR, dwpriority: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineSetAppPriority(lpszappfilename.toCPointer<ByteVar>(), dwmediamode, lpextensionid.toCPointer<ByteVar>(), dwrequestmode, lpszextensionname.toCPointer<ByteVar>(), dwpriority)

public actual fun lineSetAppPriorityA(lpszappfilename: PCSTR, dwmediamode: UInt, lpextensionid: Long, dwrequestmode: UInt, lpszextensionname: PCSTR, dwpriority: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineSetAppPriorityA(lpszappfilename.toCPointer<ByteVar>(), dwmediamode, lpextensionid.toCPointer<ByteVar>(), dwrequestmode, lpszextensionname.toCPointer<ByteVar>(), dwpriority)

public actual fun lineSetAppPriorityW(lpszappfilename: PCWSTR, dwmediamode: UInt, lpextensionid: Long, dwrequestmode: UInt, lpszextensionname: PCWSTR, dwpriority: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineSetAppPriorityW(lpszappfilename.toCPointer<ByteVar>(), dwmediamode, lpextensionid.toCPointer<ByteVar>(), dwrequestmode, lpszextensionname.toCPointer<ByteVar>(), dwpriority)

public actual fun lineSetAppSpecific(hcall: UInt, dwappspecific: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineSetAppSpecific(hcall, dwappspecific)

public actual fun lineSetCallData(hcall: UInt, lpcalldata: Long, dwsize: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineSetCallData(hcall, lpcalldata.toCPointer<ByteVar>(), dwsize)

public actual fun lineSetCallParams(hcall: UInt, dwbearermode: UInt, dwminrate: UInt, dwmaxrate: UInt, lpdialparams: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineSetCallParams(hcall, dwbearermode, dwminrate, dwmaxrate, lpdialparams.toCPointer<ByteVar>())

public actual fun lineSetCallPrivilege(hcall: UInt, dwcallprivilege: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineSetCallPrivilege(hcall, dwcallprivilege)

public actual fun lineSetCallQualityOfService(hcall: UInt, lpsendingflowspec: Long, dwsendingflowspecsize: UInt, lpreceivingflowspec: Long, dwreceivingflowspecsize: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineSetCallQualityOfService(hcall, lpsendingflowspec.toCPointer<ByteVar>(), dwsendingflowspecsize, lpreceivingflowspec.toCPointer<ByteVar>(), dwreceivingflowspecsize)

public actual fun lineSetCallTreatment(hcall: UInt, dwtreatment: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineSetCallTreatment(hcall, dwtreatment)

public actual fun lineSetCurrentLocation(hlineapp: UInt, dwlocation: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineSetCurrentLocation(hlineapp, dwlocation)

public actual fun lineSetDevConfig(dwdeviceid: UInt, lpdeviceconfig: Long, dwsize: UInt, lpszdeviceclass: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineSetDevConfig(dwdeviceid, lpdeviceconfig.toCPointer<ByteVar>(), dwsize, lpszdeviceclass.toCPointer<ByteVar>())

public actual fun lineSetDevConfigA(dwdeviceid: UInt, lpdeviceconfig: Long, dwsize: UInt, lpszdeviceclass: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineSetDevConfigA(dwdeviceid, lpdeviceconfig.toCPointer<ByteVar>(), dwsize, lpszdeviceclass.toCPointer<ByteVar>())

public actual fun lineSetDevConfigW(dwdeviceid: UInt, lpdeviceconfig: Long, dwsize: UInt, lpszdeviceclass: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineSetDevConfigW(dwdeviceid, lpdeviceconfig.toCPointer<ByteVar>(), dwsize, lpszdeviceclass.toCPointer<ByteVar>())

public actual fun lineSetLineDevStatus(hline: UInt, dwstatustochange: UInt, fstatus: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineSetLineDevStatus(hline, dwstatustochange, fstatus)

public actual fun lineSetMediaControl(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdigitlist: Long, dwdigitnumentries: UInt, lpmedialist: Long, dwmedianumentries: UInt, lptonelist: Long, dwtonenumentries: UInt, lpcallstatelist: Long, dwcallstatenumentries: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineSetMediaControl(hline, dwaddressid, hcall, dwselect, lpdigitlist.toCPointer<ByteVar>(), dwdigitnumentries, lpmedialist.toCPointer<ByteVar>(), dwmedianumentries, lptonelist.toCPointer<ByteVar>(), dwtonenumentries, lpcallstatelist.toCPointer<ByteVar>(), dwcallstatenumentries)

public actual fun lineSetMediaMode(hcall: UInt, dwmediamodes: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineSetMediaMode(hcall, dwmediamodes)

public actual fun lineSetNumRings(hline: UInt, dwaddressid: UInt, dwnumrings: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineSetNumRings(hline, dwaddressid, dwnumrings)

public actual fun lineSetQueueMeasurementPeriod(hline: UInt, dwqueueid: UInt, dwmeasurementperiod: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineSetQueueMeasurementPeriod(hline, dwqueueid, dwmeasurementperiod)

public actual fun lineSetStatusMessages(hline: UInt, dwlinestates: UInt, dwaddressstates: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineSetStatusMessages(hline, dwlinestates, dwaddressstates)

public actual fun lineSetTerminal(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, dwterminalmodes: UInt, dwterminalid: UInt, benable: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineSetTerminal(hline, dwaddressid, hcall, dwselect, dwterminalmodes, dwterminalid, benable)

public actual fun lineSetTollList(hlineapp: UInt, dwdeviceid: UInt, lpszaddressin: PCSTR, dwtolllistoption: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineSetTollList(hlineapp, dwdeviceid, lpszaddressin.toCPointer<ByteVar>(), dwtolllistoption)

public actual fun lineSetTollListA(hlineapp: UInt, dwdeviceid: UInt, lpszaddressin: PCSTR, dwtolllistoption: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineSetTollListA(hlineapp, dwdeviceid, lpszaddressin.toCPointer<ByteVar>(), dwtolllistoption)

public actual fun lineSetTollListW(hlineapp: UInt, dwdeviceid: UInt, lpszaddressinw: PCWSTR, dwtolllistoption: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineSetTollListW(hlineapp, dwdeviceid, lpszaddressinw.toCPointer<ByteVar>(), dwtolllistoption)

public actual fun lineSetupConference(hcall: UInt, hline: UInt, lphconfcall: Long, lphconsultcall: Long, dwnumparties: UInt, lpcallparams: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineSetupConference(hcall, hline, lphconfcall.toCPointer<ByteVar>(), lphconsultcall.toCPointer<ByteVar>(), dwnumparties, lpcallparams.toCPointer<ByteVar>())

public actual fun lineSetupConferenceA(hcall: UInt, hline: UInt, lphconfcall: Long, lphconsultcall: Long, dwnumparties: UInt, lpcallparams: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineSetupConferenceA(hcall, hline, lphconfcall.toCPointer<ByteVar>(), lphconsultcall.toCPointer<ByteVar>(), dwnumparties, lpcallparams.toCPointer<ByteVar>())

public actual fun lineSetupConferenceW(hcall: UInt, hline: UInt, lphconfcall: Long, lphconsultcall: Long, dwnumparties: UInt, lpcallparams: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineSetupConferenceW(hcall, hline, lphconfcall.toCPointer<ByteVar>(), lphconsultcall.toCPointer<ByteVar>(), dwnumparties, lpcallparams.toCPointer<ByteVar>())

public actual fun lineSetupTransfer(hcall: UInt, lphconsultcall: Long, lpcallparams: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineSetupTransfer(hcall, lphconsultcall.toCPointer<ByteVar>(), lpcallparams.toCPointer<ByteVar>())

public actual fun lineSetupTransferA(hcall: UInt, lphconsultcall: Long, lpcallparams: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineSetupTransferA(hcall, lphconsultcall.toCPointer<ByteVar>(), lpcallparams.toCPointer<ByteVar>())

public actual fun lineSetupTransferW(hcall: UInt, lphconsultcall: Long, lpcallparams: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineSetupTransferW(hcall, lphconsultcall.toCPointer<ByteVar>(), lpcallparams.toCPointer<ByteVar>())

public actual fun lineShutdown(hlineapp: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineShutdown(hlineapp)

public actual fun lineSwapHold(hactivecall: UInt, hheldcall: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineSwapHold(hactivecall, hheldcall)

public actual fun lineTranslateAddress(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: PCSTR, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineTranslateAddress(hlineapp, dwdeviceid, dwapiversion, lpszaddressin.toCPointer<ByteVar>(), dwcard, dwtranslateoptions, lptranslateoutput.toCPointer<ByteVar>())

public actual fun lineTranslateAddressA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: PCSTR, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineTranslateAddressA(hlineapp, dwdeviceid, dwapiversion, lpszaddressin.toCPointer<ByteVar>(), dwcard, dwtranslateoptions, lptranslateoutput.toCPointer<ByteVar>())

public actual fun lineTranslateAddressW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: PCWSTR, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineTranslateAddressW(hlineapp, dwdeviceid, dwapiversion, lpszaddressin.toCPointer<ByteVar>(), dwcard, dwtranslateoptions, lptranslateoutput.toCPointer<ByteVar>())

public actual fun lineTranslateDialog(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: HWND, lpszaddressin: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineTranslateDialog(hlineapp, dwdeviceid, dwapiversion, hwndowner.toCPointer<ByteVar>(), lpszaddressin.toCPointer<ByteVar>())

public actual fun lineTranslateDialogA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: HWND, lpszaddressin: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineTranslateDialogA(hlineapp, dwdeviceid, dwapiversion, hwndowner.toCPointer<ByteVar>(), lpszaddressin.toCPointer<ByteVar>())

public actual fun lineTranslateDialogW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: HWND, lpszaddressin: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineTranslateDialogW(hlineapp, dwdeviceid, dwapiversion, hwndowner.toCPointer<ByteVar>(), lpszaddressin.toCPointer<ByteVar>())

public actual fun lineUncompleteCall(hline: UInt, dwcompletionid: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineUncompleteCall(hline, dwcompletionid)

public actual fun lineUnhold(hcall: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineUnhold(hcall)

public actual fun lineUnpark(hline: UInt, dwaddressid: UInt, lphcall: Long, lpszdestaddress: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineUnpark(hline, dwaddressid, lphcall.toCPointer<ByteVar>(), lpszdestaddress.toCPointer<ByteVar>())

public actual fun lineUnparkA(hline: UInt, dwaddressid: UInt, lphcall: Long, lpszdestaddress: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineUnparkA(hline, dwaddressid, lphcall.toCPointer<ByteVar>(), lpszdestaddress.toCPointer<ByteVar>())

public actual fun lineUnparkW(hline: UInt, dwaddressid: UInt, lphcall: Long, lpszdestaddress: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_lineUnparkW(hline, dwaddressid, lphcall.toCPointer<ByteVar>(), lpszdestaddress.toCPointer<ByteVar>())

public actual fun phoneClose(hphone: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneClose(hphone)

public actual fun phoneConfigDialog(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneConfigDialog(dwdeviceid, hwndowner.toCPointer<ByteVar>(), lpszdeviceclass.toCPointer<ByteVar>())

public actual fun phoneConfigDialogA(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneConfigDialogA(dwdeviceid, hwndowner.toCPointer<ByteVar>(), lpszdeviceclass.toCPointer<ByteVar>())

public actual fun phoneConfigDialogW(dwdeviceid: UInt, hwndowner: HWND, lpszdeviceclass: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneConfigDialogW(dwdeviceid, hwndowner.toCPointer<ByteVar>(), lpszdeviceclass.toCPointer<ByteVar>())

public actual fun phoneDevSpecific(hphone: UInt, lpparams: Long, dwsize: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneDevSpecific(hphone, lpparams.toCPointer<ByteVar>(), dwsize)

public actual fun phoneGetButtonInfo(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneGetButtonInfo(hphone, dwbuttonlampid, lpbuttoninfo.toCPointer<ByteVar>())

public actual fun phoneGetButtonInfoA(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneGetButtonInfoA(hphone, dwbuttonlampid, lpbuttoninfo.toCPointer<ByteVar>())

public actual fun phoneGetButtonInfoW(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneGetButtonInfoW(hphone, dwbuttonlampid, lpbuttoninfo.toCPointer<ByteVar>())

public actual fun phoneGetData(hphone: UInt, dwdataid: UInt, lpdata: Long, dwsize: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneGetData(hphone, dwdataid, lpdata.toCPointer<ByteVar>(), dwsize)

public actual fun phoneGetDevCaps(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneGetDevCaps(hphoneapp, dwdeviceid, dwapiversion, dwextversion, lpphonecaps.toCPointer<ByteVar>())

public actual fun phoneGetDevCapsA(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneGetDevCapsA(hphoneapp, dwdeviceid, dwapiversion, dwextversion, lpphonecaps.toCPointer<ByteVar>())

public actual fun phoneGetDevCapsW(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneGetDevCapsW(hphoneapp, dwdeviceid, dwapiversion, dwextversion, lpphonecaps.toCPointer<ByteVar>())

public actual fun phoneGetDisplay(hphone: UInt, lpdisplay: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneGetDisplay(hphone, lpdisplay.toCPointer<ByteVar>())

public actual fun phoneGetGain(hphone: UInt, dwhookswitchdev: UInt, lpdwgain: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneGetGain(hphone, dwhookswitchdev, lpdwgain.toCPointer<ByteVar>())

public actual fun phoneGetHookSwitch(hphone: UInt, lpdwhookswitchdevs: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneGetHookSwitch(hphone, lpdwhookswitchdevs.toCPointer<ByteVar>())

public actual fun phoneGetID(hphone: UInt, lpdeviceid: Long, lpszdeviceclass: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneGetID(hphone, lpdeviceid.toCPointer<ByteVar>(), lpszdeviceclass.toCPointer<ByteVar>())

public actual fun phoneGetIDA(hphone: UInt, lpdeviceid: Long, lpszdeviceclass: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneGetIDA(hphone, lpdeviceid.toCPointer<ByteVar>(), lpszdeviceclass.toCPointer<ByteVar>())

public actual fun phoneGetIDW(hphone: UInt, lpdeviceid: Long, lpszdeviceclass: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneGetIDW(hphone, lpdeviceid.toCPointer<ByteVar>(), lpszdeviceclass.toCPointer<ByteVar>())

public actual fun phoneGetIcon(dwdeviceid: UInt, lpszdeviceclass: PCSTR, lphicon: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneGetIcon(dwdeviceid, lpszdeviceclass.toCPointer<ByteVar>(), lphicon.toCPointer<ByteVar>())

public actual fun phoneGetIconA(dwdeviceid: UInt, lpszdeviceclass: PCSTR, lphicon: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneGetIconA(dwdeviceid, lpszdeviceclass.toCPointer<ByteVar>(), lphicon.toCPointer<ByteVar>())

public actual fun phoneGetIconW(dwdeviceid: UInt, lpszdeviceclass: PCWSTR, lphicon: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneGetIconW(dwdeviceid, lpszdeviceclass.toCPointer<ByteVar>(), lphicon.toCPointer<ByteVar>())

public actual fun phoneGetLamp(hphone: UInt, dwbuttonlampid: UInt, lpdwlampmode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneGetLamp(hphone, dwbuttonlampid, lpdwlampmode.toCPointer<ByteVar>())

public actual fun phoneGetMessage(hphoneapp: UInt, lpmessage: Long, dwtimeout: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneGetMessage(hphoneapp, lpmessage.toCPointer<ByteVar>(), dwtimeout)

public actual fun phoneGetRing(hphone: UInt, lpdwringmode: Long, lpdwvolume: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneGetRing(hphone, lpdwringmode.toCPointer<ByteVar>(), lpdwvolume.toCPointer<ByteVar>())

public actual fun phoneGetStatus(hphone: UInt, lpphonestatus: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneGetStatus(hphone, lpphonestatus.toCPointer<ByteVar>())

public actual fun phoneGetStatusA(hphone: UInt, lpphonestatus: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneGetStatusA(hphone, lpphonestatus.toCPointer<ByteVar>())

public actual fun phoneGetStatusMessages(hphone: UInt, lpdwphonestates: Long, lpdwbuttonmodes: Long, lpdwbuttonstates: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneGetStatusMessages(hphone, lpdwphonestates.toCPointer<ByteVar>(), lpdwbuttonmodes.toCPointer<ByteVar>(), lpdwbuttonstates.toCPointer<ByteVar>())

public actual fun phoneGetStatusW(hphone: UInt, lpphonestatus: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneGetStatusW(hphone, lpphonestatus.toCPointer<ByteVar>())

public actual fun phoneGetVolume(hphone: UInt, dwhookswitchdev: UInt, lpdwvolume: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneGetVolume(hphone, dwhookswitchdev, lpdwvolume.toCPointer<ByteVar>())

public actual fun phoneInitialize(lphphoneapp: Long, hinstance: HINSTANCE, lpfncallback: PHONECALLBACK, lpszappname: PCSTR, lpdwnumdevs: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneInitialize(lphphoneapp.toCPointer<ByteVar>(), hinstance.toCPointer<ByteVar>(), lpfncallback.toLong().toCPointer<ByteVar>(), lpszappname.toCPointer<ByteVar>(), lpdwnumdevs.toCPointer<ByteVar>())

public actual fun phoneInitializeExA(lphphoneapp: Long, hinstance: HINSTANCE, lpfncallback: PHONECALLBACK, lpszfriendlyappname: PCSTR, lpdwnumdevs: Long, lpdwapiversion: Long, lpphoneinitializeexparams: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneInitializeExA(lphphoneapp.toCPointer<ByteVar>(), hinstance.toCPointer<ByteVar>(), lpfncallback.toLong().toCPointer<ByteVar>(), lpszfriendlyappname.toCPointer<ByteVar>(), lpdwnumdevs.toCPointer<ByteVar>(), lpdwapiversion.toCPointer<ByteVar>(), lpphoneinitializeexparams.toCPointer<ByteVar>())

public actual fun phoneInitializeExW(lphphoneapp: Long, hinstance: HINSTANCE, lpfncallback: PHONECALLBACK, lpszfriendlyappname: PCWSTR, lpdwnumdevs: Long, lpdwapiversion: Long, lpphoneinitializeexparams: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneInitializeExW(lphphoneapp.toCPointer<ByteVar>(), hinstance.toCPointer<ByteVar>(), lpfncallback.toLong().toCPointer<ByteVar>(), lpszfriendlyappname.toCPointer<ByteVar>(), lpdwnumdevs.toCPointer<ByteVar>(), lpdwapiversion.toCPointer<ByteVar>(), lpphoneinitializeexparams.toCPointer<ByteVar>())

public actual fun phoneNegotiateAPIVersion(hphoneapp: UInt, dwdeviceid: UInt, dwapilowversion: UInt, dwapihighversion: UInt, lpdwapiversion: Long, lpextensionid: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneNegotiateAPIVersion(hphoneapp, dwdeviceid, dwapilowversion, dwapihighversion, lpdwapiversion.toCPointer<ByteVar>(), lpextensionid.toCPointer<ByteVar>())

public actual fun phoneNegotiateExtVersion(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextlowversion: UInt, dwexthighversion: UInt, lpdwextversion: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneNegotiateExtVersion(hphoneapp, dwdeviceid, dwapiversion, dwextlowversion, dwexthighversion, lpdwextversion.toCPointer<ByteVar>())

public actual fun phoneOpen(hphoneapp: UInt, dwdeviceid: UInt, lphphone: Long, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivilege: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneOpen(hphoneapp, dwdeviceid, lphphone.toCPointer<ByteVar>(), dwapiversion, dwextversion, dwcallbackinstance, dwprivilege)

public actual fun phoneSetButtonInfo(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneSetButtonInfo(hphone, dwbuttonlampid, lpbuttoninfo.toCPointer<ByteVar>())

public actual fun phoneSetButtonInfoA(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneSetButtonInfoA(hphone, dwbuttonlampid, lpbuttoninfo.toCPointer<ByteVar>())

public actual fun phoneSetButtonInfoW(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneSetButtonInfoW(hphone, dwbuttonlampid, lpbuttoninfo.toCPointer<ByteVar>())

public actual fun phoneSetData(hphone: UInt, dwdataid: UInt, lpdata: Long, dwsize: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneSetData(hphone, dwdataid, lpdata.toCPointer<ByteVar>(), dwsize)

public actual fun phoneSetDisplay(hphone: UInt, dwrow: UInt, dwcolumn: UInt, lpsdisplay: PCSTR, dwsize: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneSetDisplay(hphone, dwrow, dwcolumn, lpsdisplay.toCPointer<ByteVar>(), dwsize)

public actual fun phoneSetGain(hphone: UInt, dwhookswitchdev: UInt, dwgain: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneSetGain(hphone, dwhookswitchdev, dwgain)

public actual fun phoneSetHookSwitch(hphone: UInt, dwhookswitchdevs: UInt, dwhookswitchmode: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneSetHookSwitch(hphone, dwhookswitchdevs, dwhookswitchmode)

public actual fun phoneSetLamp(hphone: UInt, dwbuttonlampid: UInt, dwlampmode: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneSetLamp(hphone, dwbuttonlampid, dwlampmode)

public actual fun phoneSetRing(hphone: UInt, dwringmode: UInt, dwvolume: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneSetRing(hphone, dwringmode, dwvolume)

public actual fun phoneSetStatusMessages(hphone: UInt, dwphonestates: UInt, dwbuttonmodes: UInt, dwbuttonstates: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneSetStatusMessages(hphone, dwphonestates, dwbuttonmodes, dwbuttonstates)

public actual fun phoneSetVolume(hphone: UInt, dwhookswitchdev: UInt, dwvolume: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneSetVolume(hphone, dwhookswitchdev, dwvolume)

public actual fun phoneShutdown(hphoneapp: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_phoneShutdown(hphoneapp)

public actual fun tapiGetLocationInfo(lpszcountrycode: PSTR, lpszcitycode: PSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_tapiGetLocationInfo(lpszcountrycode.toCPointer<ByteVar>(), lpszcitycode.toCPointer<ByteVar>())

public actual fun tapiGetLocationInfoA(lpszcountrycode: PSTR, lpszcitycode: PSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_tapiGetLocationInfoA(lpszcountrycode.toCPointer<ByteVar>(), lpszcitycode.toCPointer<ByteVar>())

public actual fun tapiGetLocationInfoW(lpszcountrycodew: PWSTR, lpszcitycodew: PWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_tapiGetLocationInfoW(lpszcountrycodew.toCPointer<ByteVar>(), lpszcitycodew.toCPointer<ByteVar>())

public actual fun tapiRequestDrop(hwnd: HWND, wrequestid: WPARAM): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_tapiRequestDrop(hwnd.toCPointer<ByteVar>(), wrequestid)

public actual fun tapiRequestMakeCall(lpszdestaddress: PCSTR, lpszappname: PCSTR, lpszcalledparty: PCSTR, lpszcomment: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_tapiRequestMakeCall(lpszdestaddress.toCPointer<ByteVar>(), lpszappname.toCPointer<ByteVar>(), lpszcalledparty.toCPointer<ByteVar>(), lpszcomment.toCPointer<ByteVar>())

public actual fun tapiRequestMakeCallA(lpszdestaddress: PCSTR, lpszappname: PCSTR, lpszcalledparty: PCSTR, lpszcomment: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_tapiRequestMakeCallA(lpszdestaddress.toCPointer<ByteVar>(), lpszappname.toCPointer<ByteVar>(), lpszcalledparty.toCPointer<ByteVar>(), lpszcomment.toCPointer<ByteVar>())

public actual fun tapiRequestMakeCallW(lpszdestaddress: PCWSTR, lpszappname: PCWSTR, lpszcalledparty: PCWSTR, lpszcomment: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_tapiRequestMakeCallW(lpszdestaddress.toCPointer<ByteVar>(), lpszappname.toCPointer<ByteVar>(), lpszcalledparty.toCPointer<ByteVar>(), lpszcomment.toCPointer<ByteVar>())

public actual fun tapiRequestMediaCall(hwnd: HWND, wrequestid: WPARAM, lpszdeviceclass: PCSTR, lpdeviceid: PCSTR, dwsize: UInt, dwsecure: UInt, lpszdestaddress: PCSTR, lpszappname: PCSTR, lpszcalledparty: PCSTR, lpszcomment: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_tapiRequestMediaCall(hwnd.toCPointer<ByteVar>(), wrequestid, lpszdeviceclass.toCPointer<ByteVar>(), lpdeviceid.toCPointer<ByteVar>(), dwsize, dwsecure, lpszdestaddress.toCPointer<ByteVar>(), lpszappname.toCPointer<ByteVar>(), lpszcalledparty.toCPointer<ByteVar>(), lpszcomment.toCPointer<ByteVar>())

public actual fun tapiRequestMediaCallA(hwnd: HWND, wrequestid: WPARAM, lpszdeviceclass: PCSTR, lpdeviceid: PCSTR, dwsize: UInt, dwsecure: UInt, lpszdestaddress: PCSTR, lpszappname: PCSTR, lpszcalledparty: PCSTR, lpszcomment: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_tapiRequestMediaCallA(hwnd.toCPointer<ByteVar>(), wrequestid, lpszdeviceclass.toCPointer<ByteVar>(), lpdeviceid.toCPointer<ByteVar>(), dwsize, dwsecure, lpszdestaddress.toCPointer<ByteVar>(), lpszappname.toCPointer<ByteVar>(), lpszcalledparty.toCPointer<ByteVar>(), lpszcomment.toCPointer<ByteVar>())

public actual fun tapiRequestMediaCallW(hwnd: HWND, wrequestid: WPARAM, lpszdeviceclass: PCWSTR, lpdeviceid: PCWSTR, dwsize: UInt, dwsecure: UInt, lpszdestaddress: PCWSTR, lpszappname: PCWSTR, lpszcalledparty: PCWSTR, lpszcomment: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.tapi.cinterop.windowssys_windows_win32_devices_tapi_tapiRequestMediaCallW(hwnd.toCPointer<ByteVar>(), wrequestid, lpszdeviceclass.toCPointer<ByteVar>(), lpdeviceid.toCPointer<ByteVar>(), dwsize, dwsecure, lpszdestaddress.toCPointer<ByteVar>(), lpszappname.toCPointer<ByteVar>(), lpszcalledparty.toCPointer<ByteVar>(), lpszcomment.toCPointer<ByteVar>())
