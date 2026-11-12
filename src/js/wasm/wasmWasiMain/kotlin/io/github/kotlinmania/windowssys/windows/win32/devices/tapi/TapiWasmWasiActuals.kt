@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.tapi

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun getTnefStreamCodepage(lpstream: MutPtr, lpulcodepage: MutPtr, lpulsubcodepage: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiGetTnefStreamCodepage")

public actual fun openTnefStream(lpvsupport: MutPtr, lpstream: MutPtr, lpszstreamname: ConstPtr, ulflags: UInt, lpmessage: MutPtr, wkeyval: UShort, lpptnef: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiOpenTnefStream")

public actual fun openTnefStreamEx(lpvsupport: MutPtr, lpstream: MutPtr, lpszstreamname: ConstPtr, ulflags: UInt, lpmessage: MutPtr, wkeyval: UShort, lpadressbook: MutPtr, lpptnef: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiOpenTnefStreamEx")

public actual fun lineAccept(hcall: UInt, lpsuseruserinfo: Pcstr, dwsize: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineAccept")

public actual fun lineAddProvider(lpszproviderfilename: Pcstr, hwndowner: Hwnd, lpdwpermanentproviderid: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineAddProvider")

public actual fun lineAddProviderA(lpszproviderfilename: Pcstr, hwndowner: Hwnd, lpdwpermanentproviderid: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineAddProviderA")

public actual fun lineAddProviderW(lpszproviderfilename: Pcwstr, hwndowner: Hwnd, lpdwpermanentproviderid: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineAddProviderW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesTapiLineAddToConference")
private external fun wasiWindowssysWindowsWin32DevicesTapiLineAddToConference(hconfcall: Int, hconsultcall: Int): Int

public actual fun lineAddToConference(hconfcall: UInt, hconsultcall: UInt): Int =
    wasiWindowssysWindowsWin32DevicesTapiLineAddToConference(hconfcall.toInt(), hconsultcall.toInt())

public actual fun lineAgentSpecific(hline: UInt, dwaddressid: UInt, dwagentextensionidindex: UInt, lpparams: MutPtr, dwsize: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineAgentSpecific")

public actual fun lineAnswer(hcall: UInt, lpsuseruserinfo: Pcstr, dwsize: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineAnswer")

public actual fun lineBlindTransfer(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineBlindTransfer")

public actual fun lineBlindTransferA(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineBlindTransferA")

public actual fun lineBlindTransferW(hcall: UInt, lpszdestaddressw: Pcwstr, dwcountrycode: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineBlindTransferW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesTapiLineClose")
private external fun wasiWindowssysWindowsWin32DevicesTapiLineClose(hline: Int): Int

public actual fun lineClose(hline: UInt): Int =
    wasiWindowssysWindowsWin32DevicesTapiLineClose(hline.toInt())

public actual fun lineCompleteCall(hcall: UInt, lpdwcompletionid: MutPtr, dwcompletionmode: UInt, dwmessageid: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineCompleteCall")

public actual fun lineCompleteTransfer(hcall: UInt, hconsultcall: UInt, lphconfcall: MutPtr, dwtransfermode: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineCompleteTransfer")

public actual fun lineConfigDialog(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineConfigDialog")

public actual fun lineConfigDialogA(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineConfigDialogA")

public actual fun lineConfigDialogEdit(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr, lpdeviceconfigin: ConstPtr, dwsize: UInt, lpdeviceconfigout: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineConfigDialogEdit")

public actual fun lineConfigDialogEditA(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr, lpdeviceconfigin: ConstPtr, dwsize: UInt, lpdeviceconfigout: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineConfigDialogEditA")

public actual fun lineConfigDialogEditW(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcwstr, lpdeviceconfigin: ConstPtr, dwsize: UInt, lpdeviceconfigout: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineConfigDialogEditW")

public actual fun lineConfigDialogW(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineConfigDialogW")

public actual fun lineConfigProvider(hwndowner: Hwnd, dwpermanentproviderid: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineConfigProvider")

public actual fun lineCreateAgentA(hline: UInt, lpszagentid: Pcstr, lpszagentpin: Pcstr, lphagent: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineCreateAgentA")

public actual fun lineCreateAgentSessionA(hline: UInt, hagent: UInt, lpszagentpin: Pcstr, dwworkingaddressid: UInt, lpgroupid: MutPtr, lphagentsession: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineCreateAgentSessionA")

public actual fun lineCreateAgentSessionW(hline: UInt, hagent: UInt, lpszagentpin: Pcwstr, dwworkingaddressid: UInt, lpgroupid: MutPtr, lphagentsession: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineCreateAgentSessionW")

public actual fun lineCreateAgentW(hline: UInt, lpszagentid: Pcwstr, lpszagentpin: Pcwstr, lphagent: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineCreateAgentW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesTapiLineDeallocateCall")
private external fun wasiWindowssysWindowsWin32DevicesTapiLineDeallocateCall(hcall: Int): Int

public actual fun lineDeallocateCall(hcall: UInt): Int =
    wasiWindowssysWindowsWin32DevicesTapiLineDeallocateCall(hcall.toInt())

public actual fun lineDevSpecific(hline: UInt, dwaddressid: UInt, hcall: UInt, lpparams: MutPtr, dwsize: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineDevSpecific")

public actual fun lineDevSpecificFeature(hline: UInt, dwfeature: UInt, lpparams: MutPtr, dwsize: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineDevSpecificFeature")

public actual fun lineDial(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineDial")

public actual fun lineDialA(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineDialA")

public actual fun lineDialW(hcall: UInt, lpszdestaddress: Pcwstr, dwcountrycode: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineDialW")

public actual fun lineDrop(hcall: UInt, lpsuseruserinfo: Pcstr, dwsize: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineDrop")

public actual fun lineForward(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: ConstPtr, dwnumringsnoanswer: UInt, lphconsultcall: MutPtr, lpcallparams: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineForward")

public actual fun lineForwardA(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: ConstPtr, dwnumringsnoanswer: UInt, lphconsultcall: MutPtr, lpcallparams: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineForwardA")

public actual fun lineForwardW(hline: UInt, balladdresses: UInt, dwaddressid: UInt, lpforwardlist: ConstPtr, dwnumringsnoanswer: UInt, lphconsultcall: MutPtr, lpcallparams: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineForwardW")

public actual fun lineGatherDigits(hcall: UInt, dwdigitmodes: UInt, lpsdigits: Pstr, dwnumdigits: UInt, lpszterminationdigits: Pcstr, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGatherDigits")

public actual fun lineGatherDigitsA(hcall: UInt, dwdigitmodes: UInt, lpsdigits: Pstr, dwnumdigits: UInt, lpszterminationdigits: Pcstr, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGatherDigitsA")

public actual fun lineGatherDigitsW(hcall: UInt, dwdigitmodes: UInt, lpsdigits: Pwstr, dwnumdigits: UInt, lpszterminationdigits: Pcwstr, dwfirstdigittimeout: UInt, dwinterdigittimeout: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGatherDigitsW")

public actual fun lineGenerateDigits(hcall: UInt, dwdigitmode: UInt, lpszdigits: Pcstr, dwduration: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGenerateDigits")

public actual fun lineGenerateDigitsA(hcall: UInt, dwdigitmode: UInt, lpszdigits: Pcstr, dwduration: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGenerateDigitsA")

public actual fun lineGenerateDigitsW(hcall: UInt, dwdigitmode: UInt, lpszdigits: Pcwstr, dwduration: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGenerateDigitsW")

public actual fun lineGenerateTone(hcall: UInt, dwtonemode: UInt, dwduration: UInt, dwnumtones: UInt, lptones: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGenerateTone")

public actual fun lineGetAddressCaps(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetAddressCaps")

public actual fun lineGetAddressCapsA(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetAddressCapsA")

public actual fun lineGetAddressCapsW(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwapiversion: UInt, dwextversion: UInt, lpaddresscaps: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetAddressCapsW")

public actual fun lineGetAddressID(hline: UInt, lpdwaddressid: MutPtr, dwaddressmode: UInt, lpsaddress: Pcstr, dwsize: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetAddressID")

public actual fun lineGetAddressIDA(hline: UInt, lpdwaddressid: MutPtr, dwaddressmode: UInt, lpsaddress: Pcstr, dwsize: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetAddressIDA")

public actual fun lineGetAddressIDW(hline: UInt, lpdwaddressid: MutPtr, dwaddressmode: UInt, lpsaddress: Pcwstr, dwsize: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetAddressIDW")

public actual fun lineGetAddressStatus(hline: UInt, dwaddressid: UInt, lpaddressstatus: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetAddressStatus")

public actual fun lineGetAddressStatusA(hline: UInt, dwaddressid: UInt, lpaddressstatus: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetAddressStatusA")

public actual fun lineGetAddressStatusW(hline: UInt, dwaddressid: UInt, lpaddressstatus: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetAddressStatusW")

public actual fun lineGetAgentActivityListA(hline: UInt, dwaddressid: UInt, lpagentactivitylist: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetAgentActivityListA")

public actual fun lineGetAgentActivityListW(hline: UInt, dwaddressid: UInt, lpagentactivitylist: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetAgentActivityListW")

public actual fun lineGetAgentCapsA(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwappapiversion: UInt, lpagentcaps: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetAgentCapsA")

public actual fun lineGetAgentCapsW(hlineapp: UInt, dwdeviceid: UInt, dwaddressid: UInt, dwappapiversion: UInt, lpagentcaps: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetAgentCapsW")

public actual fun lineGetAgentGroupListA(hline: UInt, dwaddressid: UInt, lpagentgrouplist: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetAgentGroupListA")

public actual fun lineGetAgentGroupListW(hline: UInt, dwaddressid: UInt, lpagentgrouplist: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetAgentGroupListW")

public actual fun lineGetAgentInfo(hline: UInt, hagent: UInt, lpagentinfo: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetAgentInfo")

public actual fun lineGetAgentSessionInfo(hline: UInt, hagentsession: UInt, lpagentsessioninfo: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetAgentSessionInfo")

public actual fun lineGetAgentSessionList(hline: UInt, hagent: UInt, lpagentsessionlist: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetAgentSessionList")

public actual fun lineGetAgentStatusA(hline: UInt, dwaddressid: UInt, lpagentstatus: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetAgentStatusA")

public actual fun lineGetAgentStatusW(hline: UInt, dwaddressid: UInt, lpagentstatus: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetAgentStatusW")

public actual fun lineGetAppPriority(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: MutPtr, dwrequestmode: UInt, lpextensionname: MutPtr, lpdwpriority: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetAppPriority")

public actual fun lineGetAppPriorityA(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: MutPtr, dwrequestmode: UInt, lpextensionname: MutPtr, lpdwpriority: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetAppPriorityA")

public actual fun lineGetAppPriorityW(lpszappfilename: Pcwstr, dwmediamode: UInt, lpextensionid: MutPtr, dwrequestmode: UInt, lpextensionname: MutPtr, lpdwpriority: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetAppPriorityW")

public actual fun lineGetCallInfo(hcall: UInt, lpcallinfo: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetCallInfo")

public actual fun lineGetCallInfoA(hcall: UInt, lpcallinfo: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetCallInfoA")

public actual fun lineGetCallInfoW(hcall: UInt, lpcallinfo: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetCallInfoW")

public actual fun lineGetCallStatus(hcall: UInt, lpcallstatus: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetCallStatus")

public actual fun lineGetConfRelatedCalls(hcall: UInt, lpcalllist: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetConfRelatedCalls")

public actual fun lineGetCountry(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetCountry")

public actual fun lineGetCountryA(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetCountryA")

public actual fun lineGetCountryW(dwcountryid: UInt, dwapiversion: UInt, lplinecountrylist: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetCountryW")

public actual fun lineGetDevCaps(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetDevCaps")

public actual fun lineGetDevCapsA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetDevCapsA")

public actual fun lineGetDevCapsW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lplinedevcaps: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetDevCapsW")

public actual fun lineGetDevConfig(dwdeviceid: UInt, lpdeviceconfig: MutPtr, lpszdeviceclass: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetDevConfig")

public actual fun lineGetDevConfigA(dwdeviceid: UInt, lpdeviceconfig: MutPtr, lpszdeviceclass: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetDevConfigA")

public actual fun lineGetDevConfigW(dwdeviceid: UInt, lpdeviceconfig: MutPtr, lpszdeviceclass: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetDevConfigW")

public actual fun lineGetGroupListA(hline: UInt, lpgrouplist: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetGroupListA")

public actual fun lineGetGroupListW(hline: UInt, lpgrouplist: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetGroupListW")

public actual fun lineGetID(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: MutPtr, lpszdeviceclass: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetID")

public actual fun lineGetIDA(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: MutPtr, lpszdeviceclass: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetIDA")

public actual fun lineGetIDW(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdeviceid: MutPtr, lpszdeviceclass: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetIDW")

public actual fun lineGetIcon(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetIcon")

public actual fun lineGetIconA(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetIconA")

public actual fun lineGetIconW(dwdeviceid: UInt, lpszdeviceclass: Pcwstr, lphicon: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetIconW")

public actual fun lineGetLineDevStatus(hline: UInt, lplinedevstatus: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetLineDevStatus")

public actual fun lineGetLineDevStatusA(hline: UInt, lplinedevstatus: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetLineDevStatusA")

public actual fun lineGetLineDevStatusW(hline: UInt, lplinedevstatus: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetLineDevStatusW")

public actual fun lineGetMessage(hlineapp: UInt, lpmessage: MutPtr, dwtimeout: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetMessage")

public actual fun lineGetNewCalls(hline: UInt, dwaddressid: UInt, dwselect: UInt, lpcalllist: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetNewCalls")

public actual fun lineGetNumRings(hline: UInt, dwaddressid: UInt, lpdwnumrings: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetNumRings")

public actual fun lineGetProviderList(dwapiversion: UInt, lpproviderlist: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetProviderList")

public actual fun lineGetProviderListA(dwapiversion: UInt, lpproviderlist: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetProviderListA")

public actual fun lineGetProviderListW(dwapiversion: UInt, lpproviderlist: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetProviderListW")

public actual fun lineGetProxyStatus(hlineapp: UInt, dwdeviceid: UInt, dwappapiversion: UInt, lplineproxyreqestlist: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetProxyStatus")

public actual fun lineGetQueueInfo(hline: UInt, dwqueueid: UInt, lplinequeueinfo: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetQueueInfo")

public actual fun lineGetQueueListA(hline: UInt, lpgroupid: MutPtr, lpqueuelist: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetQueueListA")

public actual fun lineGetQueueListW(hline: UInt, lpgroupid: MutPtr, lpqueuelist: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetQueueListW")

public actual fun lineGetRequest(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetRequest")

public actual fun lineGetRequestA(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetRequestA")

public actual fun lineGetRequestW(hlineapp: UInt, dwrequestmode: UInt, lprequestbuffer: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetRequestW")

public actual fun lineGetStatusMessages(hline: UInt, lpdwlinestates: MutPtr, lpdwaddressstates: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetStatusMessages")

public actual fun lineGetTranslateCaps(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetTranslateCaps")

public actual fun lineGetTranslateCapsA(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetTranslateCapsA")

public actual fun lineGetTranslateCapsW(hlineapp: UInt, dwapiversion: UInt, lptranslatecaps: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineGetTranslateCapsW")

public actual fun lineHandoff(hcall: UInt, lpszfilename: Pcstr, dwmediamode: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineHandoff")

public actual fun lineHandoffA(hcall: UInt, lpszfilename: Pcstr, dwmediamode: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineHandoffA")

public actual fun lineHandoffW(hcall: UInt, lpszfilename: Pcwstr, dwmediamode: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineHandoffW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesTapiLineHold")
private external fun wasiWindowssysWindowsWin32DevicesTapiLineHold(hcall: Int): Int

public actual fun lineHold(hcall: UInt): Int =
    wasiWindowssysWindowsWin32DevicesTapiLineHold(hcall.toInt())

public actual fun lineInitialize(lphlineapp: MutPtr, hinstance: Hinstance, lpfncallback: Linecallback, lpszappname: Pcstr, lpdwnumdevs: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineInitialize")

public actual fun lineInitializeExA(lphlineapp: MutPtr, hinstance: Hinstance, lpfncallback: Linecallback, lpszfriendlyappname: Pcstr, lpdwnumdevs: MutPtr, lpdwapiversion: MutPtr, lplineinitializeexparams: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineInitializeExA")

public actual fun lineInitializeExW(lphlineapp: MutPtr, hinstance: Hinstance, lpfncallback: Linecallback, lpszfriendlyappname: Pcwstr, lpdwnumdevs: MutPtr, lpdwapiversion: MutPtr, lplineinitializeexparams: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineInitializeExW")

public actual fun lineMakeCall(hline: UInt, lphcall: MutPtr, lpszdestaddress: Pcstr, dwcountrycode: UInt, lpcallparams: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineMakeCall")

public actual fun lineMakeCallA(hline: UInt, lphcall: MutPtr, lpszdestaddress: Pcstr, dwcountrycode: UInt, lpcallparams: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineMakeCallA")

public actual fun lineMakeCallW(hline: UInt, lphcall: MutPtr, lpszdestaddress: Pcwstr, dwcountrycode: UInt, lpcallparams: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineMakeCallW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesTapiLineMonitorDigits")
private external fun wasiWindowssysWindowsWin32DevicesTapiLineMonitorDigits(hcall: Int, dwdigitmodes: Int): Int

public actual fun lineMonitorDigits(hcall: UInt, dwdigitmodes: UInt): Int =
    wasiWindowssysWindowsWin32DevicesTapiLineMonitorDigits(hcall.toInt(), dwdigitmodes.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesTapiLineMonitorMedia")
private external fun wasiWindowssysWindowsWin32DevicesTapiLineMonitorMedia(hcall: Int, dwmediamodes: Int): Int

public actual fun lineMonitorMedia(hcall: UInt, dwmediamodes: UInt): Int =
    wasiWindowssysWindowsWin32DevicesTapiLineMonitorMedia(hcall.toInt(), dwmediamodes.toInt())

public actual fun lineMonitorTones(hcall: UInt, lptonelist: ConstPtr, dwnumentries: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineMonitorTones")

public actual fun lineNegotiateAPIVersion(hlineapp: UInt, dwdeviceid: UInt, dwapilowversion: UInt, dwapihighversion: UInt, lpdwapiversion: MutPtr, lpextensionid: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineNegotiateAPIVersion")

public actual fun lineNegotiateExtVersion(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextlowversion: UInt, dwexthighversion: UInt, lpdwextversion: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineNegotiateExtVersion")

public actual fun lineOpen(hlineapp: UInt, dwdeviceid: UInt, lphline: MutPtr, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineOpen")

public actual fun lineOpenA(hlineapp: UInt, dwdeviceid: UInt, lphline: MutPtr, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineOpenA")

public actual fun lineOpenW(hlineapp: UInt, dwdeviceid: UInt, lphline: MutPtr, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivileges: UInt, dwmediamodes: UInt, lpcallparams: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineOpenW")

public actual fun linePark(hcall: UInt, dwparkmode: UInt, lpszdiraddress: Pcstr, lpnondiraddress: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLinePark")

public actual fun lineParkA(hcall: UInt, dwparkmode: UInt, lpszdiraddress: Pcstr, lpnondiraddress: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineParkA")

public actual fun lineParkW(hcall: UInt, dwparkmode: UInt, lpszdiraddress: Pcwstr, lpnondiraddress: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineParkW")

public actual fun linePickup(hline: UInt, dwaddressid: UInt, lphcall: MutPtr, lpszdestaddress: Pcstr, lpszgroupid: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLinePickup")

public actual fun linePickupA(hline: UInt, dwaddressid: UInt, lphcall: MutPtr, lpszdestaddress: Pcstr, lpszgroupid: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLinePickupA")

public actual fun linePickupW(hline: UInt, dwaddressid: UInt, lphcall: MutPtr, lpszdestaddress: Pcwstr, lpszgroupid: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLinePickupW")

public actual fun linePrepareAddToConference(hconfcall: UInt, lphconsultcall: MutPtr, lpcallparams: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLinePrepareAddToConference")

public actual fun linePrepareAddToConferenceA(hconfcall: UInt, lphconsultcall: MutPtr, lpcallparams: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLinePrepareAddToConferenceA")

public actual fun linePrepareAddToConferenceW(hconfcall: UInt, lphconsultcall: MutPtr, lpcallparams: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLinePrepareAddToConferenceW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesTapiLineProxyMessage")
private external fun wasiWindowssysWindowsWin32DevicesTapiLineProxyMessage(hline: Int, hcall: Int, dwmsg: Int, dwparam1: Int, dwparam2: Int, dwparam3: Int): Int

public actual fun lineProxyMessage(hline: UInt, hcall: UInt, dwmsg: UInt, dwparam1: UInt, dwparam2: UInt, dwparam3: UInt): Int =
    wasiWindowssysWindowsWin32DevicesTapiLineProxyMessage(hline.toInt(), hcall.toInt(), dwmsg.toInt(), dwparam1.toInt(), dwparam2.toInt(), dwparam3.toInt())

public actual fun lineProxyResponse(hline: UInt, lpproxyrequest: MutPtr, dwresult: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineProxyResponse")

public actual fun lineRedirect(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineRedirect")

public actual fun lineRedirectA(hcall: UInt, lpszdestaddress: Pcstr, dwcountrycode: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineRedirectA")

public actual fun lineRedirectW(hcall: UInt, lpszdestaddress: Pcwstr, dwcountrycode: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineRedirectW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesTapiLineRegisterRequestRecipient")
private external fun wasiWindowssysWindowsWin32DevicesTapiLineRegisterRequestRecipient(hlineapp: Int, dwregistrationinstance: Int, dwrequestmode: Int, benable: Int): Int

public actual fun lineRegisterRequestRecipient(hlineapp: UInt, dwregistrationinstance: UInt, dwrequestmode: UInt, benable: UInt): Int =
    wasiWindowssysWindowsWin32DevicesTapiLineRegisterRequestRecipient(hlineapp.toInt(), dwregistrationinstance.toInt(), dwrequestmode.toInt(), benable.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesTapiLineReleaseUserUserInfo")
private external fun wasiWindowssysWindowsWin32DevicesTapiLineReleaseUserUserInfo(hcall: Int): Int

public actual fun lineReleaseUserUserInfo(hcall: UInt): Int =
    wasiWindowssysWindowsWin32DevicesTapiLineReleaseUserUserInfo(hcall.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesTapiLineRemoveFromConference")
private external fun wasiWindowssysWindowsWin32DevicesTapiLineRemoveFromConference(hcall: Int): Int

public actual fun lineRemoveFromConference(hcall: UInt): Int =
    wasiWindowssysWindowsWin32DevicesTapiLineRemoveFromConference(hcall.toInt())

public actual fun lineRemoveProvider(dwpermanentproviderid: UInt, hwndowner: Hwnd): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineRemoveProvider")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesTapiLineSecureCall")
private external fun wasiWindowssysWindowsWin32DevicesTapiLineSecureCall(hcall: Int): Int

public actual fun lineSecureCall(hcall: UInt): Int =
    wasiWindowssysWindowsWin32DevicesTapiLineSecureCall(hcall.toInt())

public actual fun lineSendUserUserInfo(hcall: UInt, lpsuseruserinfo: Pcstr, dwsize: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineSendUserUserInfo")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesTapiLineSetAgentActivity")
private external fun wasiWindowssysWindowsWin32DevicesTapiLineSetAgentActivity(hline: Int, dwaddressid: Int, dwactivityid: Int): Int

public actual fun lineSetAgentActivity(hline: UInt, dwaddressid: UInt, dwactivityid: UInt): Int =
    wasiWindowssysWindowsWin32DevicesTapiLineSetAgentActivity(hline.toInt(), dwaddressid.toInt(), dwactivityid.toInt())

public actual fun lineSetAgentGroup(hline: UInt, dwaddressid: UInt, lpagentgrouplist: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineSetAgentGroup")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesTapiLineSetAgentMeasurementPeriod")
private external fun wasiWindowssysWindowsWin32DevicesTapiLineSetAgentMeasurementPeriod(hline: Int, hagent: Int, dwmeasurementperiod: Int): Int

public actual fun lineSetAgentMeasurementPeriod(hline: UInt, hagent: UInt, dwmeasurementperiod: UInt): Int =
    wasiWindowssysWindowsWin32DevicesTapiLineSetAgentMeasurementPeriod(hline.toInt(), hagent.toInt(), dwmeasurementperiod.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesTapiLineSetAgentSessionState")
private external fun wasiWindowssysWindowsWin32DevicesTapiLineSetAgentSessionState(hline: Int, hagentsession: Int, dwagentsessionstate: Int, dwnextagentsessionstate: Int): Int

public actual fun lineSetAgentSessionState(hline: UInt, hagentsession: UInt, dwagentsessionstate: UInt, dwnextagentsessionstate: UInt): Int =
    wasiWindowssysWindowsWin32DevicesTapiLineSetAgentSessionState(hline.toInt(), hagentsession.toInt(), dwagentsessionstate.toInt(), dwnextagentsessionstate.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesTapiLineSetAgentState")
private external fun wasiWindowssysWindowsWin32DevicesTapiLineSetAgentState(hline: Int, dwaddressid: Int, dwagentstate: Int, dwnextagentstate: Int): Int

public actual fun lineSetAgentState(hline: UInt, dwaddressid: UInt, dwagentstate: UInt, dwnextagentstate: UInt): Int =
    wasiWindowssysWindowsWin32DevicesTapiLineSetAgentState(hline.toInt(), dwaddressid.toInt(), dwagentstate.toInt(), dwnextagentstate.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesTapiLineSetAgentStateEx")
private external fun wasiWindowssysWindowsWin32DevicesTapiLineSetAgentStateEx(hline: Int, hagent: Int, dwagentstate: Int, dwnextagentstate: Int): Int

public actual fun lineSetAgentStateEx(hline: UInt, hagent: UInt, dwagentstate: UInt, dwnextagentstate: UInt): Int =
    wasiWindowssysWindowsWin32DevicesTapiLineSetAgentStateEx(hline.toInt(), hagent.toInt(), dwagentstate.toInt(), dwnextagentstate.toInt())

public actual fun lineSetAppPriority(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: MutPtr, dwrequestmode: UInt, lpszextensionname: Pcstr, dwpriority: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineSetAppPriority")

public actual fun lineSetAppPriorityA(lpszappfilename: Pcstr, dwmediamode: UInt, lpextensionid: MutPtr, dwrequestmode: UInt, lpszextensionname: Pcstr, dwpriority: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineSetAppPriorityA")

public actual fun lineSetAppPriorityW(lpszappfilename: Pcwstr, dwmediamode: UInt, lpextensionid: MutPtr, dwrequestmode: UInt, lpszextensionname: Pcwstr, dwpriority: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineSetAppPriorityW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesTapiLineSetAppSpecific")
private external fun wasiWindowssysWindowsWin32DevicesTapiLineSetAppSpecific(hcall: Int, dwappspecific: Int): Int

public actual fun lineSetAppSpecific(hcall: UInt, dwappspecific: UInt): Int =
    wasiWindowssysWindowsWin32DevicesTapiLineSetAppSpecific(hcall.toInt(), dwappspecific.toInt())

public actual fun lineSetCallData(hcall: UInt, lpcalldata: MutPtr, dwsize: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineSetCallData")

public actual fun lineSetCallParams(hcall: UInt, dwbearermode: UInt, dwminrate: UInt, dwmaxrate: UInt, lpdialparams: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineSetCallParams")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesTapiLineSetCallPrivilege")
private external fun wasiWindowssysWindowsWin32DevicesTapiLineSetCallPrivilege(hcall: Int, dwcallprivilege: Int): Int

public actual fun lineSetCallPrivilege(hcall: UInt, dwcallprivilege: UInt): Int =
    wasiWindowssysWindowsWin32DevicesTapiLineSetCallPrivilege(hcall.toInt(), dwcallprivilege.toInt())

public actual fun lineSetCallQualityOfService(hcall: UInt, lpsendingflowspec: MutPtr, dwsendingflowspecsize: UInt, lpreceivingflowspec: MutPtr, dwreceivingflowspecsize: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineSetCallQualityOfService")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesTapiLineSetCallTreatment")
private external fun wasiWindowssysWindowsWin32DevicesTapiLineSetCallTreatment(hcall: Int, dwtreatment: Int): Int

public actual fun lineSetCallTreatment(hcall: UInt, dwtreatment: UInt): Int =
    wasiWindowssysWindowsWin32DevicesTapiLineSetCallTreatment(hcall.toInt(), dwtreatment.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesTapiLineSetCurrentLocation")
private external fun wasiWindowssysWindowsWin32DevicesTapiLineSetCurrentLocation(hlineapp: Int, dwlocation: Int): Int

public actual fun lineSetCurrentLocation(hlineapp: UInt, dwlocation: UInt): Int =
    wasiWindowssysWindowsWin32DevicesTapiLineSetCurrentLocation(hlineapp.toInt(), dwlocation.toInt())

public actual fun lineSetDevConfig(dwdeviceid: UInt, lpdeviceconfig: ConstPtr, dwsize: UInt, lpszdeviceclass: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineSetDevConfig")

public actual fun lineSetDevConfigA(dwdeviceid: UInt, lpdeviceconfig: ConstPtr, dwsize: UInt, lpszdeviceclass: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineSetDevConfigA")

public actual fun lineSetDevConfigW(dwdeviceid: UInt, lpdeviceconfig: ConstPtr, dwsize: UInt, lpszdeviceclass: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineSetDevConfigW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesTapiLineSetLineDevStatus")
private external fun wasiWindowssysWindowsWin32DevicesTapiLineSetLineDevStatus(hline: Int, dwstatustochange: Int, fstatus: Int): Int

public actual fun lineSetLineDevStatus(hline: UInt, dwstatustochange: UInt, fstatus: UInt): Int =
    wasiWindowssysWindowsWin32DevicesTapiLineSetLineDevStatus(hline.toInt(), dwstatustochange.toInt(), fstatus.toInt())

public actual fun lineSetMediaControl(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, lpdigitlist: ConstPtr, dwdigitnumentries: UInt, lpmedialist: ConstPtr, dwmedianumentries: UInt, lptonelist: ConstPtr, dwtonenumentries: UInt, lpcallstatelist: ConstPtr, dwcallstatenumentries: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineSetMediaControl")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesTapiLineSetMediaMode")
private external fun wasiWindowssysWindowsWin32DevicesTapiLineSetMediaMode(hcall: Int, dwmediamodes: Int): Int

public actual fun lineSetMediaMode(hcall: UInt, dwmediamodes: UInt): Int =
    wasiWindowssysWindowsWin32DevicesTapiLineSetMediaMode(hcall.toInt(), dwmediamodes.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesTapiLineSetNumRings")
private external fun wasiWindowssysWindowsWin32DevicesTapiLineSetNumRings(hline: Int, dwaddressid: Int, dwnumrings: Int): Int

public actual fun lineSetNumRings(hline: UInt, dwaddressid: UInt, dwnumrings: UInt): Int =
    wasiWindowssysWindowsWin32DevicesTapiLineSetNumRings(hline.toInt(), dwaddressid.toInt(), dwnumrings.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesTapiLineSetQueueMeasurementPeriod")
private external fun wasiWindowssysWindowsWin32DevicesTapiLineSetQueueMeasurementPeriod(hline: Int, dwqueueid: Int, dwmeasurementperiod: Int): Int

public actual fun lineSetQueueMeasurementPeriod(hline: UInt, dwqueueid: UInt, dwmeasurementperiod: UInt): Int =
    wasiWindowssysWindowsWin32DevicesTapiLineSetQueueMeasurementPeriod(hline.toInt(), dwqueueid.toInt(), dwmeasurementperiod.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesTapiLineSetStatusMessages")
private external fun wasiWindowssysWindowsWin32DevicesTapiLineSetStatusMessages(hline: Int, dwlinestates: Int, dwaddressstates: Int): Int

public actual fun lineSetStatusMessages(hline: UInt, dwlinestates: UInt, dwaddressstates: UInt): Int =
    wasiWindowssysWindowsWin32DevicesTapiLineSetStatusMessages(hline.toInt(), dwlinestates.toInt(), dwaddressstates.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesTapiLineSetTerminal")
private external fun wasiWindowssysWindowsWin32DevicesTapiLineSetTerminal(hline: Int, dwaddressid: Int, hcall: Int, dwselect: Int, dwterminalmodes: Int, dwterminalid: Int, benable: Int): Int

public actual fun lineSetTerminal(hline: UInt, dwaddressid: UInt, hcall: UInt, dwselect: UInt, dwterminalmodes: UInt, dwterminalid: UInt, benable: UInt): Int =
    wasiWindowssysWindowsWin32DevicesTapiLineSetTerminal(hline.toInt(), dwaddressid.toInt(), hcall.toInt(), dwselect.toInt(), dwterminalmodes.toInt(), dwterminalid.toInt(), benable.toInt())

public actual fun lineSetTollList(hlineapp: UInt, dwdeviceid: UInt, lpszaddressin: Pcstr, dwtolllistoption: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineSetTollList")

public actual fun lineSetTollListA(hlineapp: UInt, dwdeviceid: UInt, lpszaddressin: Pcstr, dwtolllistoption: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineSetTollListA")

public actual fun lineSetTollListW(hlineapp: UInt, dwdeviceid: UInt, lpszaddressinw: Pcwstr, dwtolllistoption: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineSetTollListW")

public actual fun lineSetupConference(hcall: UInt, hline: UInt, lphconfcall: MutPtr, lphconsultcall: MutPtr, dwnumparties: UInt, lpcallparams: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineSetupConference")

public actual fun lineSetupConferenceA(hcall: UInt, hline: UInt, lphconfcall: MutPtr, lphconsultcall: MutPtr, dwnumparties: UInt, lpcallparams: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineSetupConferenceA")

public actual fun lineSetupConferenceW(hcall: UInt, hline: UInt, lphconfcall: MutPtr, lphconsultcall: MutPtr, dwnumparties: UInt, lpcallparams: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineSetupConferenceW")

public actual fun lineSetupTransfer(hcall: UInt, lphconsultcall: MutPtr, lpcallparams: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineSetupTransfer")

public actual fun lineSetupTransferA(hcall: UInt, lphconsultcall: MutPtr, lpcallparams: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineSetupTransferA")

public actual fun lineSetupTransferW(hcall: UInt, lphconsultcall: MutPtr, lpcallparams: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineSetupTransferW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesTapiLineShutdown")
private external fun wasiWindowssysWindowsWin32DevicesTapiLineShutdown(hlineapp: Int): Int

public actual fun lineShutdown(hlineapp: UInt): Int =
    wasiWindowssysWindowsWin32DevicesTapiLineShutdown(hlineapp.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesTapiLineSwapHold")
private external fun wasiWindowssysWindowsWin32DevicesTapiLineSwapHold(hactivecall: Int, hheldcall: Int): Int

public actual fun lineSwapHold(hactivecall: UInt, hheldcall: UInt): Int =
    wasiWindowssysWindowsWin32DevicesTapiLineSwapHold(hactivecall.toInt(), hheldcall.toInt())

public actual fun lineTranslateAddress(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: Pcstr, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineTranslateAddress")

public actual fun lineTranslateAddressA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: Pcstr, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineTranslateAddressA")

public actual fun lineTranslateAddressW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, lpszaddressin: Pcwstr, dwcard: UInt, dwtranslateoptions: UInt, lptranslateoutput: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineTranslateAddressW")

public actual fun lineTranslateDialog(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: Hwnd, lpszaddressin: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineTranslateDialog")

public actual fun lineTranslateDialogA(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: Hwnd, lpszaddressin: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineTranslateDialogA")

public actual fun lineTranslateDialogW(hlineapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, hwndowner: Hwnd, lpszaddressin: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineTranslateDialogW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesTapiLineUncompleteCall")
private external fun wasiWindowssysWindowsWin32DevicesTapiLineUncompleteCall(hline: Int, dwcompletionid: Int): Int

public actual fun lineUncompleteCall(hline: UInt, dwcompletionid: UInt): Int =
    wasiWindowssysWindowsWin32DevicesTapiLineUncompleteCall(hline.toInt(), dwcompletionid.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesTapiLineUnhold")
private external fun wasiWindowssysWindowsWin32DevicesTapiLineUnhold(hcall: Int): Int

public actual fun lineUnhold(hcall: UInt): Int =
    wasiWindowssysWindowsWin32DevicesTapiLineUnhold(hcall.toInt())

public actual fun lineUnpark(hline: UInt, dwaddressid: UInt, lphcall: MutPtr, lpszdestaddress: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineUnpark")

public actual fun lineUnparkA(hline: UInt, dwaddressid: UInt, lphcall: MutPtr, lpszdestaddress: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineUnparkA")

public actual fun lineUnparkW(hline: UInt, dwaddressid: UInt, lphcall: MutPtr, lpszdestaddress: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiLineUnparkW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesTapiPhoneClose")
private external fun wasiWindowssysWindowsWin32DevicesTapiPhoneClose(hphone: Int): Int

public actual fun phoneClose(hphone: UInt): Int =
    wasiWindowssysWindowsWin32DevicesTapiPhoneClose(hphone.toInt())

public actual fun phoneConfigDialog(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiPhoneConfigDialog")

public actual fun phoneConfigDialogA(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiPhoneConfigDialogA")

public actual fun phoneConfigDialogW(dwdeviceid: UInt, hwndowner: Hwnd, lpszdeviceclass: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiPhoneConfigDialogW")

public actual fun phoneDevSpecific(hphone: UInt, lpparams: MutPtr, dwsize: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiPhoneDevSpecific")

public actual fun phoneGetButtonInfo(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiPhoneGetButtonInfo")

public actual fun phoneGetButtonInfoA(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiPhoneGetButtonInfoA")

public actual fun phoneGetButtonInfoW(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiPhoneGetButtonInfoW")

public actual fun phoneGetData(hphone: UInt, dwdataid: UInt, lpdata: MutPtr, dwsize: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiPhoneGetData")

public actual fun phoneGetDevCaps(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiPhoneGetDevCaps")

public actual fun phoneGetDevCapsA(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiPhoneGetDevCapsA")

public actual fun phoneGetDevCapsW(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextversion: UInt, lpphonecaps: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiPhoneGetDevCapsW")

public actual fun phoneGetDisplay(hphone: UInt, lpdisplay: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiPhoneGetDisplay")

public actual fun phoneGetGain(hphone: UInt, dwhookswitchdev: UInt, lpdwgain: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiPhoneGetGain")

public actual fun phoneGetHookSwitch(hphone: UInt, lpdwhookswitchdevs: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiPhoneGetHookSwitch")

public actual fun phoneGetID(hphone: UInt, lpdeviceid: MutPtr, lpszdeviceclass: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiPhoneGetID")

public actual fun phoneGetIDA(hphone: UInt, lpdeviceid: MutPtr, lpszdeviceclass: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiPhoneGetIDA")

public actual fun phoneGetIDW(hphone: UInt, lpdeviceid: MutPtr, lpszdeviceclass: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiPhoneGetIDW")

public actual fun phoneGetIcon(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiPhoneGetIcon")

public actual fun phoneGetIconA(dwdeviceid: UInt, lpszdeviceclass: Pcstr, lphicon: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiPhoneGetIconA")

public actual fun phoneGetIconW(dwdeviceid: UInt, lpszdeviceclass: Pcwstr, lphicon: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiPhoneGetIconW")

public actual fun phoneGetLamp(hphone: UInt, dwbuttonlampid: UInt, lpdwlampmode: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiPhoneGetLamp")

public actual fun phoneGetMessage(hphoneapp: UInt, lpmessage: MutPtr, dwtimeout: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiPhoneGetMessage")

public actual fun phoneGetRing(hphone: UInt, lpdwringmode: MutPtr, lpdwvolume: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiPhoneGetRing")

public actual fun phoneGetStatus(hphone: UInt, lpphonestatus: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiPhoneGetStatus")

public actual fun phoneGetStatusA(hphone: UInt, lpphonestatus: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiPhoneGetStatusA")

public actual fun phoneGetStatusMessages(hphone: UInt, lpdwphonestates: MutPtr, lpdwbuttonmodes: MutPtr, lpdwbuttonstates: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiPhoneGetStatusMessages")

public actual fun phoneGetStatusW(hphone: UInt, lpphonestatus: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiPhoneGetStatusW")

public actual fun phoneGetVolume(hphone: UInt, dwhookswitchdev: UInt, lpdwvolume: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiPhoneGetVolume")

public actual fun phoneInitialize(lphphoneapp: MutPtr, hinstance: Hinstance, lpfncallback: Phonecallback, lpszappname: Pcstr, lpdwnumdevs: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiPhoneInitialize")

public actual fun phoneInitializeExA(lphphoneapp: MutPtr, hinstance: Hinstance, lpfncallback: Phonecallback, lpszfriendlyappname: Pcstr, lpdwnumdevs: MutPtr, lpdwapiversion: MutPtr, lpphoneinitializeexparams: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiPhoneInitializeExA")

public actual fun phoneInitializeExW(lphphoneapp: MutPtr, hinstance: Hinstance, lpfncallback: Phonecallback, lpszfriendlyappname: Pcwstr, lpdwnumdevs: MutPtr, lpdwapiversion: MutPtr, lpphoneinitializeexparams: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiPhoneInitializeExW")

public actual fun phoneNegotiateAPIVersion(hphoneapp: UInt, dwdeviceid: UInt, dwapilowversion: UInt, dwapihighversion: UInt, lpdwapiversion: MutPtr, lpextensionid: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiPhoneNegotiateAPIVersion")

public actual fun phoneNegotiateExtVersion(hphoneapp: UInt, dwdeviceid: UInt, dwapiversion: UInt, dwextlowversion: UInt, dwexthighversion: UInt, lpdwextversion: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiPhoneNegotiateExtVersion")

public actual fun phoneOpen(hphoneapp: UInt, dwdeviceid: UInt, lphphone: MutPtr, dwapiversion: UInt, dwextversion: UInt, dwcallbackinstance: ULong, dwprivilege: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiPhoneOpen")

public actual fun phoneSetButtonInfo(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiPhoneSetButtonInfo")

public actual fun phoneSetButtonInfoA(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiPhoneSetButtonInfoA")

public actual fun phoneSetButtonInfoW(hphone: UInt, dwbuttonlampid: UInt, lpbuttoninfo: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiPhoneSetButtonInfoW")

public actual fun phoneSetData(hphone: UInt, dwdataid: UInt, lpdata: ConstPtr, dwsize: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiPhoneSetData")

public actual fun phoneSetDisplay(hphone: UInt, dwrow: UInt, dwcolumn: UInt, lpsdisplay: Pcstr, dwsize: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiPhoneSetDisplay")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesTapiPhoneSetGain")
private external fun wasiWindowssysWindowsWin32DevicesTapiPhoneSetGain(hphone: Int, dwhookswitchdev: Int, dwgain: Int): Int

public actual fun phoneSetGain(hphone: UInt, dwhookswitchdev: UInt, dwgain: UInt): Int =
    wasiWindowssysWindowsWin32DevicesTapiPhoneSetGain(hphone.toInt(), dwhookswitchdev.toInt(), dwgain.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesTapiPhoneSetHookSwitch")
private external fun wasiWindowssysWindowsWin32DevicesTapiPhoneSetHookSwitch(hphone: Int, dwhookswitchdevs: Int, dwhookswitchmode: Int): Int

public actual fun phoneSetHookSwitch(hphone: UInt, dwhookswitchdevs: UInt, dwhookswitchmode: UInt): Int =
    wasiWindowssysWindowsWin32DevicesTapiPhoneSetHookSwitch(hphone.toInt(), dwhookswitchdevs.toInt(), dwhookswitchmode.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesTapiPhoneSetLamp")
private external fun wasiWindowssysWindowsWin32DevicesTapiPhoneSetLamp(hphone: Int, dwbuttonlampid: Int, dwlampmode: Int): Int

public actual fun phoneSetLamp(hphone: UInt, dwbuttonlampid: UInt, dwlampmode: UInt): Int =
    wasiWindowssysWindowsWin32DevicesTapiPhoneSetLamp(hphone.toInt(), dwbuttonlampid.toInt(), dwlampmode.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesTapiPhoneSetRing")
private external fun wasiWindowssysWindowsWin32DevicesTapiPhoneSetRing(hphone: Int, dwringmode: Int, dwvolume: Int): Int

public actual fun phoneSetRing(hphone: UInt, dwringmode: UInt, dwvolume: UInt): Int =
    wasiWindowssysWindowsWin32DevicesTapiPhoneSetRing(hphone.toInt(), dwringmode.toInt(), dwvolume.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesTapiPhoneSetStatusMessages")
private external fun wasiWindowssysWindowsWin32DevicesTapiPhoneSetStatusMessages(hphone: Int, dwphonestates: Int, dwbuttonmodes: Int, dwbuttonstates: Int): Int

public actual fun phoneSetStatusMessages(hphone: UInt, dwphonestates: UInt, dwbuttonmodes: UInt, dwbuttonstates: UInt): Int =
    wasiWindowssysWindowsWin32DevicesTapiPhoneSetStatusMessages(hphone.toInt(), dwphonestates.toInt(), dwbuttonmodes.toInt(), dwbuttonstates.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesTapiPhoneSetVolume")
private external fun wasiWindowssysWindowsWin32DevicesTapiPhoneSetVolume(hphone: Int, dwhookswitchdev: Int, dwvolume: Int): Int

public actual fun phoneSetVolume(hphone: UInt, dwhookswitchdev: UInt, dwvolume: UInt): Int =
    wasiWindowssysWindowsWin32DevicesTapiPhoneSetVolume(hphone.toInt(), dwhookswitchdev.toInt(), dwvolume.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesTapiPhoneShutdown")
private external fun wasiWindowssysWindowsWin32DevicesTapiPhoneShutdown(hphoneapp: Int): Int

public actual fun phoneShutdown(hphoneapp: UInt): Int =
    wasiWindowssysWindowsWin32DevicesTapiPhoneShutdown(hphoneapp.toInt())

public actual fun tapiGetLocationInfo(lpszcountrycode: Pstr, lpszcitycode: Pstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiTapiGetLocationInfo")

public actual fun tapiGetLocationInfoA(lpszcountrycode: Pstr, lpszcitycode: Pstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiTapiGetLocationInfoA")

public actual fun tapiGetLocationInfoW(lpszcountrycodew: Pwstr, lpszcitycodew: Pwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiTapiGetLocationInfoW")

public actual fun tapiRequestDrop(hwnd: Hwnd, wrequestid: Wparam): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiTapiRequestDrop")

public actual fun tapiRequestMakeCall(lpszdestaddress: Pcstr, lpszappname: Pcstr, lpszcalledparty: Pcstr, lpszcomment: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiTapiRequestMakeCall")

public actual fun tapiRequestMakeCallA(lpszdestaddress: Pcstr, lpszappname: Pcstr, lpszcalledparty: Pcstr, lpszcomment: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiTapiRequestMakeCallA")

public actual fun tapiRequestMakeCallW(lpszdestaddress: Pcwstr, lpszappname: Pcwstr, lpszcalledparty: Pcwstr, lpszcomment: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiTapiRequestMakeCallW")

public actual fun tapiRequestMediaCall(hwnd: Hwnd, wrequestid: Wparam, lpszdeviceclass: Pcstr, lpdeviceid: Pcstr, dwsize: UInt, dwsecure: UInt, lpszdestaddress: Pcstr, lpszappname: Pcstr, lpszcalledparty: Pcstr, lpszcomment: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiTapiRequestMediaCall")

public actual fun tapiRequestMediaCallA(hwnd: Hwnd, wrequestid: Wparam, lpszdeviceclass: Pcstr, lpdeviceid: Pcstr, dwsize: UInt, dwsecure: UInt, lpszdestaddress: Pcstr, lpszappname: Pcstr, lpszcalledparty: Pcstr, lpszcomment: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiTapiRequestMediaCallA")

public actual fun tapiRequestMediaCallW(hwnd: Hwnd, wrequestid: Wparam, lpszdeviceclass: Pcwstr, lpdeviceid: Pcwstr, dwsize: UInt, dwsecure: UInt, lpszdestaddress: Pcwstr, lpszappname: Pcwstr, lpszcalledparty: Pcwstr, lpszcomment: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesTapiTapiRequestMediaCallW")
