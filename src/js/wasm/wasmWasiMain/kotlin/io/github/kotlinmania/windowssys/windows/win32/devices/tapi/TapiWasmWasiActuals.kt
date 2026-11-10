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

public actual fun getTnefStreamCodepage(lpstream: COpaquePointer?, lpulcodepage: COpaquePointer?, lpulsubcodepage: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openTnefStream(lpvsupport: COpaquePointer?, lpstream: COpaquePointer?, lpszstreamname: COpaquePointer?, ulflags: UInt, lpmessage: COpaquePointer?, wkeyval: UShort, lpptnef: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openTnefStreamEx(lpvsupport: COpaquePointer?, lpstream: COpaquePointer?, lpszstreamname: COpaquePointer?, ulflags: UInt, lpmessage: COpaquePointer?, wkeyval: UShort, lpadressbook: COpaquePointer?, lpptnef: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineAccept(hcall: UInt, lpsuseruserinfo: Pcstr, dwsize: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineAddProvider(lpszproviderfilename: Pcstr, hwndowner: Hwnd, lpdwpermanentproviderid: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineAddProviderA(lpszproviderfilename: Pcstr, hwndowner: Hwnd, lpdwpermanentproviderid: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineAddProviderW(lpszproviderfilename: Pcwstr, hwndowner: Hwnd, lpdwpermanentproviderid: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineAddToConference(hconfcall: UInt, hconsultcall: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineAgentSpecific(hline: UInt, dwaddressid: UInt, dwagentextensionidindex: UInt, lpparams: COpaquePointer?, dwsize: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineAnswer(hcall: UInt, lpsuseruserinfo: Pcstr, dwsize: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineBlindTransfer(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineBlindTransferA(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineBlindTransferW(hcall: UInt, lpszdestaddressw: Pcwstr, dwcountrycode: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineClose(hline: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineCompleteCall(hcall: UInt, lpdwcompletionid: COpaquePointer?, dwcompletionmode: UInt, dwmessageid: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineCompleteTransfer(hcall: UInt, hconsultcall: UInt, lphconfcall: COpaquePointer?, dwtransfermode: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineConfigDialog(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineConfigDialogA(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineConfigDialogEdit(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr, lpdeviceconfigin: COpaquePointer?, dwsize: UInt, lpdeviceconfigout: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineConfigDialogEditA(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr, lpdeviceconfigin: COpaquePointer?, dwsize: UInt, lpdeviceconfigout: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineConfigDialogEditW(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcwstr, lpdeviceconfigin: COpaquePointer?, dwsize: UInt, lpdeviceconfigout: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineConfigDialogW(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcwstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineConfigProvider(hwndowner: Hwnd, dwpermanentproviderid: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineCreateAgentA(hline: UInt, lpszagentid: Pcstr, lpszagentpin: Pcstr, lphagent: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineCreateAgentSessionA(hline: UInt, hagent: UInt, lpszagentpin: Pcstr, dwworkingaddressid: UInt, lpgroupid: COpaquePointer?, lphagentsession: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineCreateAgentSessionW(hline: UInt, hagent: UInt, lpszagentpin: Pcwstr, dwworkingaddressid: UInt, lpgroupid: COpaquePointer?, lphagentsession: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineCreateAgentW(hline: UInt, lpszagentid: Pcwstr, lpszagentpin: Pcwstr, lphagent: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineDeallocateCall(hcall: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineDevSpecific(hline: UInt, dwaddressid: UInt, hcall: UInt, lpparams: COpaquePointer?, dwsize: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineDevSpecificFeature(hline: UInt, dwfeature: UInt, lpparams: COpaquePointer?, dwsize: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineDial(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineDialA(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineDialW(hcall: UInt, lpszdestaddress: Pcwstr, dwcountrycode: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineDrop(hcall: UInt, lpsuseruserinfo: Pcstr, dwsize: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineForward(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: COpaquePointer?, dwnumringsnoanswer: UInt, lphconsultcall: COpaquePointer?, lpcallparams: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineForwardA(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: COpaquePointer?, dwnumringsnoanswer: UInt, lphconsultcall: COpaquePointer?, lpcallparams: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineForwardW(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: COpaquePointer?, dwnumringsnoanswer: UInt, lphconsultcall: COpaquePointer?, lpcallparams: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGatherDigits(hcall: UInt, dwdigitmodes: UInt, lpsdigits: Pstr, dwnumdigits: UInt, lpszterminationdigits: Pcstr, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGatherDigitsA(hcall: UInt, dwdigitmodes: UInt, lpsdigits: Pstr, dwnumdigits: UInt, lpszterminationdigits: Pcstr, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGatherDigitsW(hcall: UInt, dwdigitmodes: UInt, lpsdigits: Pwstr, dwnumdigits: UInt, lpszterminationdigits: Pcwstr, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGenerateDigits(hcall: UInt, dwdigitmode: UInt, lpszdigits: Pcstr, dwduration: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGenerateDigitsA(hcall: UInt, dwdigitmode: UInt, lpszdigits: Pcstr, dwduration: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGenerateDigitsW(hcall: UInt, dwdigitmode: UInt, lpszdigits: Pcwstr, dwduration: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGenerateTone(hcall: UInt, dwtonemode: UInt, dwduration: UInt, dwnumtones: UInt, lptones: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetAddressCaps(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetAddressCapsA(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetAddressCapsW(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetAddressID(hline: UInt, lpdwaddressid: COpaquePointer?, dwaddressmode: UInt, lpsaddress: Pcstr, dwsize: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetAddressIDA(hline: UInt, lpdwaddressid: COpaquePointer?, dwaddressmode: UInt, lpsaddress: Pcstr, dwsize: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetAddressIDW(hline: UInt, lpdwaddressid: COpaquePointer?, dwaddressmode: UInt, lpsaddress: Pcwstr, dwsize: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetAddressStatus(hline: UInt, dwaddressid: UInt, lpaddressstatus: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetAddressStatusA(hline: UInt, dwaddressid: UInt, lpaddressstatus: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetAddressStatusW(hline: UInt, dwaddressid: UInt, lpaddressstatus: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetAgentActivityListA(hline: UInt, dwaddressid: UInt, lpagentactivitylist: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetAgentActivityListW(hline: UInt, dwaddressid: UInt, lpagentactivitylist: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetAgentCapsA(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwappapiversion: UInt, lpagentcaps: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetAgentCapsW(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwappapiversion: UInt, lpagentcaps: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetAgentGroupListA(hline: UInt, dwaddressid: UInt, lpagentgrouplist: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetAgentGroupListW(hline: UInt, dwaddressid: UInt, lpagentgrouplist: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetAgentInfo(hline: UInt, hagent: UInt, lpagentinfo: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetAgentSessionInfo(hline: UInt, hagentsession: UInt, lpagentsessioninfo: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetAgentSessionList(hline: UInt, hagent: UInt, lpagentsessionlist: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetAgentStatusA(hline: UInt, dwaddressid: UInt, lpagentstatus: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetAgentStatusW(hline: UInt, dwaddressid: UInt, lpagentstatus: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetAppPriority(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: COpaquePointer?, dwrequestmode: UInt, lpextensionname: COpaquePointer?, lpdwpriority: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetAppPriorityA(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: COpaquePointer?, dwrequestmode: UInt, lpextensionname: COpaquePointer?, lpdwpriority: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetAppPriorityW(lpszappfilename: Pcwstr, dwmediamode: UInt, lpextensionid: COpaquePointer?, dwrequestmode: UInt, lpextensionname: COpaquePointer?, lpdwpriority: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetCallInfo(hcall: UInt, lpcallinfo: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetCallInfoA(hcall: UInt, lpcallinfo: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetCallInfoW(hcall: UInt, lpcallinfo: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetCallStatus(hcall: UInt, lpcallstatus: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetConfRelatedCalls(hcall: UInt, lpcalllist: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetCountry(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetCountryA(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetCountryW(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetDevCaps(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetDevCapsA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetDevCapsW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetDevConfig(dwdeviceid: UInt, lpdeviceconfig: COpaquePointer?, lpszdeviceclass: Pcstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetDevConfigA(dwdeviceid: UInt, lpdeviceconfig: COpaquePointer?, lpszdeviceclass: Pcstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetDevConfigW(dwdeviceid: UInt, lpdeviceconfig: COpaquePointer?, lpszdeviceclass: Pcwstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetGroupListA(hline: UInt, lpgrouplist: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetGroupListW(hline: UInt, lpgrouplist: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetID(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: COpaquePointer?, lpszdeviceclass: Pcstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetIDA(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: COpaquePointer?, lpszdeviceclass: Pcstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetIDW(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: COpaquePointer?, lpszdeviceclass: Pcwstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetIcon(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetIconA(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetIconW(dwdeviceid: UInt, lpszdeviceclass: Pcwstr, lphicon: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetLineDevStatus(hline: UInt, lplinedevstatus: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetLineDevStatusA(hline: UInt, lplinedevstatus: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetLineDevStatusW(hline: UInt, lplinedevstatus: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetMessage(hlineapp: UInt, lpmessage: COpaquePointer?, dwtimeout: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetNewCalls(hline: UInt, dwaddressid: UInt, dwselect: UInt, lpcalllist: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetNumRings(hline: UInt, dwaddressid: UInt, lpdwnumrings: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetProviderList(dwapiversion: UInt, lpproviderlist: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetProviderListA(dwapiversion: UInt, lpproviderlist: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetProviderListW(dwapiversion: UInt, lpproviderlist: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetProxyStatus(hlineapp: UInt, dwdeviceid: UInt, dwappapiversion: UInt, lplineproxyreqestlist: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetQueueInfo(hline: UInt, dwqueueid: UInt, lplinequeueinfo: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetQueueListA(hline: UInt, lpgroupid: COpaquePointer?, lpqueuelist: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetQueueListW(hline: UInt, lpgroupid: COpaquePointer?, lpqueuelist: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetRequest(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetRequestA(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetRequestW(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetStatusMessages(hline: UInt, lpdwlinestates: COpaquePointer?, lpdwaddressstates: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetTranslateCaps(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetTranslateCapsA(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineGetTranslateCapsW(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineHandoff(hcall: UInt, lpszfilename: Pcstr, dwmediamode: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineHandoffA(hcall: UInt, lpszfilename: Pcstr, dwmediamode: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineHandoffW(hcall: UInt, lpszfilename: Pcwstr, dwmediamode: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineHold(hcall: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineInitialize(lphlineapp: COpaquePointer?, hinstance: Hinstance, lpfncallback: Linecallback, lpszappname: Pcstr, lpdwnumdevs: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineInitializeExA(lphlineapp: COpaquePointer?, hinstance: Hinstance, lpfncallback: Linecallback, lpszfriendlyappname: Pcstr, lpdwnumdevs: COpaquePointer?, lpdwapiversion: COpaquePointer?, lplineinitializeexparams: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineInitializeExW(lphlineapp: COpaquePointer?, hinstance: Hinstance, lpfncallback: Linecallback, lpszfriendlyappname: Pcwstr, lpdwnumdevs: COpaquePointer?, lpdwapiversion: COpaquePointer?, lplineinitializeexparams: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineMakeCall(hline: UInt, lphcall: COpaquePointer?, lpszdestaddress: Pcstr, dwcountrycode: UInt, lpcallparams: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineMakeCallA(hline: UInt, lphcall: COpaquePointer?, lpszdestaddress: Pcstr, dwcountrycode: UInt, lpcallparams: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineMakeCallW(hline: UInt, lphcall: COpaquePointer?, lpszdestaddress: Pcwstr, dwcountrycode: UInt, lpcallparams: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineMonitorDigits(hcall: UInt, dwdigitmodes: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineMonitorMedia(hcall: UInt, dwmediamodes: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineMonitorTones(hcall: UInt, lptonelist: COpaquePointer?, dwnumentries: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineNegotiateAPIVersion(hlineapp: UInt, dwdeviceid: UInt, dwapilowversion: UInt, dwapihighversion: UInt, lpdwapiversion: COpaquePointer?, lpextensionid: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineNegotiateExtVersion(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextlowversion: UInt, dwexthighversion: UInt, lpdwextversion: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineOpen(hlineapp: UInt, dwdeviceid: UInt, lphline: COpaquePointer?, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineOpenA(hlineapp: UInt, dwdeviceid: UInt, lphline: COpaquePointer?, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineOpenW(hlineapp: UInt, dwdeviceid: UInt, lphline: COpaquePointer?, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun linePark(hcall: UInt, dwparkmode: UInt, lpszdiraddress: Pcstr, lpnondiraddress: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineParkA(hcall: UInt, dwparkmode: UInt, lpszdiraddress: Pcstr, lpnondiraddress: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineParkW(hcall: UInt, dwparkmode: UInt, lpszdiraddress: Pcwstr, lpnondiraddress: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun linePickup(hline: UInt, dwaddressid: UInt, lphcall: COpaquePointer?, lpszdestaddress: Pcstr, lpszgroupid: Pcstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun linePickupA(hline: UInt, dwaddressid: UInt, lphcall: COpaquePointer?, lpszdestaddress: Pcstr, lpszgroupid: Pcstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun linePickupW(hline: UInt, dwaddressid: UInt, lphcall: COpaquePointer?, lpszdestaddress: Pcwstr, lpszgroupid: Pcwstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun linePrepareAddToConference(hconfcall: UInt, lphconsultcall: COpaquePointer?, lpcallparams: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun linePrepareAddToConferenceA(hconfcall: UInt, lphconsultcall: COpaquePointer?, lpcallparams: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun linePrepareAddToConferenceW(hconfcall: UInt, lphconsultcall: COpaquePointer?, lpcallparams: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineProxyMessage(hline: UInt, hcall: UInt, dwmsg: UInt, dwparam1: UInt, dwparam2: UInt, dwparam3: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineProxyResponse(hline: UInt, lpproxyrequest: COpaquePointer?, dwresult: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineRedirect(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineRedirectA(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineRedirectW(hcall: UInt, lpszdestaddress: Pcwstr, dwcountrycode: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineRegisterRequestRecipient(hlineapp: UInt, dwregistrationinstance: UInt, dwrequestmode: UInt, benable: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineReleaseUserUserInfo(hcall: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineRemoveFromConference(hcall: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineRemoveProvider(dwpermanentproviderid: UInt, hwndowner: Hwnd): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineSecureCall(hcall: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineSendUserUserInfo(hcall: UInt, lpsuseruserinfo: Pcstr, dwsize: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineSetAgentActivity(hline: UInt, dwaddressid: UInt, dwactivityid: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineSetAgentGroup(hline: UInt, dwaddressid: UInt, lpagentgrouplist: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineSetAgentMeasurementPeriod(hline: UInt, hagent: UInt, dwmeasurementperiod: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineSetAgentSessionState(hline: UInt, hagentsession: UInt, dwagentsessionstate: UInt, dwnextagentsessionstate: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineSetAgentState(hline: UInt, dwaddressid: UInt, dwagentstate: UInt, dwnextagentstate: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineSetAgentStateEx(hline: UInt, hagent: UInt, dwagentstate: UInt, dwnextagentstate: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineSetAppPriority(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: COpaquePointer?, dwrequestmode: UInt, lpszextensionname: Pcstr, dwpriority: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineSetAppPriorityA(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: COpaquePointer?, dwrequestmode: UInt, lpszextensionname: Pcstr, dwpriority: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineSetAppPriorityW(lpszappfilename: Pcwstr, dwmediamode: UInt, lpextensionid: COpaquePointer?, dwrequestmode: UInt, lpszextensionname: Pcwstr, dwpriority: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineSetAppSpecific(hcall: UInt, dwappspecific: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineSetCallData(hcall: UInt, lpcalldata: COpaquePointer?, dwsize: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineSetCallParams(hcall: UInt, dwbearermode: UInt, dwminrate: UInt, dwmaxrate: UInt, lpdialparams: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineSetCallPrivilege(hcall: UInt, dwcallprivilege: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineSetCallQualityOfService(hcall: UInt, lpsendingflowspec: COpaquePointer?, dwsendingflowspecsize: UInt, lpreceivingflowspec: COpaquePointer?, dwreceivingflowspecsize: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineSetCallTreatment(hcall: UInt, dwtreatment: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineSetCurrentLocation(hlineapp: UInt, dwlocation: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineSetDevConfig(dwdeviceid: UInt, lpdeviceconfig: COpaquePointer?, dwsize: UInt, lpszdeviceclass: Pcstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineSetDevConfigA(dwdeviceid: UInt, lpdeviceconfig: COpaquePointer?, dwsize: UInt, lpszdeviceclass: Pcstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineSetDevConfigW(dwdeviceid: UInt, lpdeviceconfig: COpaquePointer?, dwsize: UInt, lpszdeviceclass: Pcwstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineSetLineDevStatus(hline: UInt, dwstatustochange: UInt, fstatus: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineSetMediaControl(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdigitlist: COpaquePointer?, dwdigitnumentries: UInt, lpmedialist: COpaquePointer?, dwmedianumentries: UInt, lptonelist: COpaquePointer?, dwtonenumentries: UInt, lpcallstatelist: COpaquePointer?, dwcallstatenumentries: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineSetMediaMode(hcall: UInt, dwmediamodes: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineSetNumRings(hline: UInt, dwaddressid: UInt, dwnumrings: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineSetQueueMeasurementPeriod(hline: UInt, dwqueueid: UInt, dwmeasurementperiod: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineSetStatusMessages(hline: UInt, dwlinestates: UInt, dwaddressstates: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineSetTerminal(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, dwterminalmodes: UInt, dwterminalid: UInt, benable: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineSetTollList(hlineapp: UInt, dwdeviceid: UInt, lpszaddressin: Pcstr, dwtolllistoption: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineSetTollListA(hlineapp: UInt, dwdeviceid: UInt, lpszaddressin: Pcstr, dwtolllistoption: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineSetTollListW(hlineapp: UInt, dwdeviceid: UInt, lpszaddressinw: Pcwstr, dwtolllistoption: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineSetupConference(hcall: UInt, hline: UInt, lphconfcall: COpaquePointer?, lphconsultcall: COpaquePointer?, dwnumparties: UInt, lpcallparams: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineSetupConferenceA(hcall: UInt, hline: UInt, lphconfcall: COpaquePointer?, lphconsultcall: COpaquePointer?, dwnumparties: UInt, lpcallparams: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineSetupConferenceW(hcall: UInt, hline: UInt, lphconfcall: COpaquePointer?, lphconsultcall: COpaquePointer?, dwnumparties: UInt, lpcallparams: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineSetupTransfer(hcall: UInt, lphconsultcall: COpaquePointer?, lpcallparams: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineSetupTransferA(hcall: UInt, lphconsultcall: COpaquePointer?, lpcallparams: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineSetupTransferW(hcall: UInt, lphconsultcall: COpaquePointer?, lpcallparams: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineShutdown(hlineapp: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineSwapHold(hactivecall: UInt, hheldcall: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineTranslateAddress(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: Pcstr, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineTranslateAddressA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: Pcstr, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineTranslateAddressW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: Pcwstr, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineTranslateDialog(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: Hwnd, lpszaddressin: Pcstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineTranslateDialogA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: Hwnd, lpszaddressin: Pcstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineTranslateDialogW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: Hwnd, lpszaddressin: Pcwstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineUncompleteCall(hline: UInt, dwcompletionid: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineUnhold(hcall: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineUnpark(hline: UInt, dwaddressid: UInt, lphcall: COpaquePointer?, lpszdestaddress: Pcstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineUnparkA(hline: UInt, dwaddressid: UInt, lphcall: COpaquePointer?, lpszdestaddress: Pcstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineUnparkW(hline: UInt, dwaddressid: UInt, lphcall: COpaquePointer?, lpszdestaddress: Pcwstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneClose(hphone: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneConfigDialog(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneConfigDialogA(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneConfigDialogW(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcwstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneDevSpecific(hphone: UInt, lpparams: COpaquePointer?, dwsize: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneGetButtonInfo(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneGetButtonInfoA(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneGetButtonInfoW(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneGetData(hphone: UInt, dwdataid: UInt, lpdata: COpaquePointer?, dwsize: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneGetDevCaps(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneGetDevCapsA(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneGetDevCapsW(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneGetDisplay(hphone: UInt, lpdisplay: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneGetGain(hphone: UInt, dwhookswitchdev: UInt, lpdwgain: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneGetHookSwitch(hphone: UInt, lpdwhookswitchdevs: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneGetID(hphone: UInt, lpdeviceid: COpaquePointer?, lpszdeviceclass: Pcstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneGetIDA(hphone: UInt, lpdeviceid: COpaquePointer?, lpszdeviceclass: Pcstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneGetIDW(hphone: UInt, lpdeviceid: COpaquePointer?, lpszdeviceclass: Pcwstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneGetIcon(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneGetIconA(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneGetIconW(dwdeviceid: UInt, lpszdeviceclass: Pcwstr, lphicon: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneGetLamp(hphone: UInt, dwbuttonlampid: UInt, lpdwlampmode: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneGetMessage(hphoneapp: UInt, lpmessage: COpaquePointer?, dwtimeout: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneGetRing(hphone: UInt, lpdwringmode: COpaquePointer?, lpdwvolume: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneGetStatus(hphone: UInt, lpphonestatus: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneGetStatusA(hphone: UInt, lpphonestatus: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneGetStatusMessages(hphone: UInt, lpdwphonestates: COpaquePointer?, lpdwbuttonmodes: COpaquePointer?, lpdwbuttonstates: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneGetStatusW(hphone: UInt, lpphonestatus: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneGetVolume(hphone: UInt, dwhookswitchdev: UInt, lpdwvolume: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneInitialize(lphphoneapp: COpaquePointer?, hinstance: Hinstance, lpfncallback: Phonecallback, lpszappname: Pcstr, lpdwnumdevs: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneInitializeExA(lphphoneapp: COpaquePointer?, hinstance: Hinstance, lpfncallback: Phonecallback, lpszfriendlyappname: Pcstr, lpdwnumdevs: COpaquePointer?, lpdwapiversion: COpaquePointer?, lpphoneinitializeexparams: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneInitializeExW(lphphoneapp: COpaquePointer?, hinstance: Hinstance, lpfncallback: Phonecallback, lpszfriendlyappname: Pcwstr, lpdwnumdevs: COpaquePointer?, lpdwapiversion: COpaquePointer?, lpphoneinitializeexparams: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneNegotiateAPIVersion(hphoneapp: UInt, dwdeviceid: UInt, dwapilowversion: UInt, dwapihighversion: UInt, lpdwapiversion: COpaquePointer?, lpextensionid: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneNegotiateExtVersion(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextlowversion: UInt, dwexthighversion: UInt, lpdwextversion: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneOpen(hphoneapp: UInt, dwdeviceid: UInt, lphphone: COpaquePointer?, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivilege: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneSetButtonInfo(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneSetButtonInfoA(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneSetButtonInfoW(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneSetData(hphone: UInt, dwdataid: UInt, lpdata: COpaquePointer?, dwsize: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneSetDisplay(hphone: UInt, dwrow: UInt, dwcolumn: UInt, lpsdisplay: Pcstr, dwsize: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneSetGain(hphone: UInt, dwhookswitchdev: UInt, dwgain: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneSetHookSwitch(hphone: UInt, dwhookswitchdevs: UInt, dwhookswitchmode: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneSetLamp(hphone: UInt, dwbuttonlampid: UInt, dwlampmode: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneSetRing(hphone: UInt, dwringmode: UInt, dwvolume: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneSetStatusMessages(hphone: UInt, dwphonestates: UInt, dwbuttonmodes: UInt, dwbuttonstates: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneSetVolume(hphone: UInt, dwhookswitchdev: UInt, dwvolume: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun phoneShutdown(hphoneapp: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tapiGetLocationInfo(lpszcountrycode: Pstr, lpszcitycode: Pstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tapiGetLocationInfoA(lpszcountrycode: Pstr, lpszcitycode: Pstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tapiGetLocationInfoW(lpszcountrycodew: Pwstr, lpszcitycodew: Pwstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tapiRequestDrop(hwnd: Hwnd, wrequestid: Wparam): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tapiRequestMakeCall(lpszdestaddress: Pcstr, lpszappname: Pcstr, lpszcalledparty: Pcstr, lpszcomment: Pcstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tapiRequestMakeCallA(lpszdestaddress: Pcstr, lpszappname: Pcstr, lpszcalledparty: Pcstr, lpszcomment: Pcstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tapiRequestMakeCallW(lpszdestaddress: Pcwstr, lpszappname: Pcwstr, lpszcalledparty: Pcwstr, lpszcomment: Pcwstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tapiRequestMediaCall(hwnd: Hwnd, wrequestid: Wparam, lpszdeviceclass: Pcstr, lpdeviceid: Pcstr, dwsize: UInt, dwsecure: UInt, lpszdestaddress: Pcstr, lpszappname: Pcstr, lpszcalledparty: Pcstr, lpszcomment: Pcstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tapiRequestMediaCallA(hwnd: Hwnd, wrequestid: Wparam, lpszdeviceclass: Pcstr, lpdeviceid: Pcstr, dwsize: UInt, dwsecure: UInt, lpszdestaddress: Pcstr, lpszappname: Pcstr, lpszcalledparty: Pcstr, lpszcomment: Pcstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tapiRequestMediaCallW(hwnd: Hwnd, wrequestid: Wparam, lpszdeviceclass: Pcwstr, lpdeviceid: Pcwstr, dwsize: UInt, dwsecure: UInt, lpszdestaddress: Pcwstr, lpszappname: Pcwstr, lpszcalledparty: Pcwstr, lpszcomment: Pcwstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
