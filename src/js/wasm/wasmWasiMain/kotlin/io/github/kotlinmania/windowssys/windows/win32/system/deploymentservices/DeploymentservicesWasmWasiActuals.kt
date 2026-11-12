@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun pxeAsyncRecvDone(hclientrequest: Handle, action: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeAsyncRecvDone")

public actual fun pxeDhcpAppendOption(preplypacket: MutPtr<CVoid>, umaxreplypacketlen: UInt, pureplypacketlen: MutPtr<UInt>, boption: UByte, boptionlen: UByte, pvalue: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeDhcpAppendOption")

public actual fun pxeDhcpAppendOptionRaw(preplypacket: MutPtr<CVoid>, umaxreplypacketlen: UInt, pureplypacketlen: MutPtr<UInt>, ubufferlen: UShort, pbuffer: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeDhcpAppendOptionRaw")

public actual fun pxeDhcpGetOptionValue(ppacket: ConstPtr<CVoid>, upacketlen: UInt, uinstance: UInt, boption: UByte, pboptionlen: MutPtr<UByte>, ppoptionvalue: MutPtr<MutPtr<CVoid>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeDhcpGetOptionValue")

public actual fun pxeDhcpGetVendorOptionValue(ppacket: ConstPtr<CVoid>, upacketlen: UInt, boption: UByte, uinstance: UInt, pboptionlen: MutPtr<UByte>, ppoptionvalue: MutPtr<MutPtr<CVoid>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeDhcpGetVendorOptionValue")

public actual fun pxeDhcpInitialize(precvpacket: ConstPtr<CVoid>, urecvpacketlen: UInt, preplypacket: MutPtr<CVoid>, umaxreplypacketlen: UInt, pureplypacketlen: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeDhcpInitialize")

public actual fun pxeDhcpIsValid(ppacket: ConstPtr<CVoid>, upacketlen: UInt, brequestpacket: Bool, pbpxeoptionpresent: MutPtr<Bool>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeDhcpIsValid")

public actual fun pxeDhcpv6AppendOption(preply: MutPtr<CVoid>, cbreply: UInt, pcbreplyused: MutPtr<UInt>, woptiontype: UShort, cboption: UShort, poption: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6AppendOption")

public actual fun pxeDhcpv6AppendOptionRaw(preply: MutPtr<CVoid>, cbreply: UInt, pcbreplyused: MutPtr<UInt>, cbbuffer: UShort, pbuffer: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6AppendOptionRaw")

public actual fun pxeDhcpv6CreateRelayRepl(prelaymessages: ConstPtr<PxeDhcpv6NestedRelayMessage>, nrelaymessages: UInt, pinnerpacket: ConstPtr<UByte>, cbinnerpacket: UInt, preplybuffer: MutPtr<CVoid>, cbreplybuffer: UInt, pcbreplybuffer: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6CreateRelayRepl")

public actual fun pxeDhcpv6GetOptionValue(ppacket: ConstPtr<CVoid>, upacketlen: UInt, uinstance: UInt, woption: UShort, pwoptionlen: MutPtr<UShort>, ppoptionvalue: MutPtr<MutPtr<CVoid>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6GetOptionValue")

public actual fun pxeDhcpv6GetVendorOptionValue(ppacket: ConstPtr<CVoid>, upacketlen: UInt, dwenterprisenumber: UInt, woption: UShort, uinstance: UInt, pwoptionlen: MutPtr<UShort>, ppoptionvalue: MutPtr<MutPtr<CVoid>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6GetVendorOptionValue")

public actual fun pxeDhcpv6Initialize(prequest: ConstPtr<CVoid>, cbrequest: UInt, preply: MutPtr<CVoid>, cbreply: UInt, pcbreplyused: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6Initialize")

public actual fun pxeDhcpv6IsValid(ppacket: ConstPtr<CVoid>, upacketlen: UInt, brequestpacket: Bool, pbpxeoptionpresent: MutPtr<Bool>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6IsValid")

public actual fun pxeDhcpv6ParseRelayForw(prelayforwpacket: ConstPtr<CVoid>, urelayforwpacketlen: UInt, prelaymessages: MutPtr<PxeDhcpv6NestedRelayMessage>, nrelaymessages: UInt, pnrelaymessages: MutPtr<UInt>, ppinnerpacket: MutPtr<MutPtr<UByte>>, pcbinnerpacket: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6ParseRelayForw")

public actual fun pxeGetServerInfo(uinfotype: UInt, pbuffer: MutPtr<CVoid>, ubufferlen: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeGetServerInfo")

public actual fun pxeGetServerInfoEx(uinfotype: UInt, pbuffer: MutPtr<CVoid>, ubufferlen: UInt, pubufferused: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeGetServerInfoEx")

public actual fun pxePacketAllocate(hprovider: Handle, hclientrequest: Handle, usize: UInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxePacketAllocate")

public actual fun pxePacketFree(hprovider: Handle, hclientrequest: Handle, ppacket: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxePacketFree")

public actual fun pxeProviderEnumClose(henum: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeProviderEnumClose")

public actual fun pxeProviderEnumFirst(phenum: MutPtr<Handle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeProviderEnumFirst")

public actual fun pxeProviderEnumNext(henum: Handle, ppprovider: MutPtr<MutPtr<PxeProvider>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeProviderEnumNext")

public actual fun pxeProviderFreeInfo(pprovider: ConstPtr<PxeProvider>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeProviderFreeInfo")

public actual fun pxeProviderQueryIndex(pszprovidername: Pcwstr, puindex: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeProviderQueryIndex")

public actual fun pxeProviderRegister(pszprovidername: Pcwstr, pszmodulepath: Pcwstr, index: UInt, biscritical: Bool, phproviderkey: MutPtr<Hkey>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeProviderRegister")

public actual fun pxeProviderSetAttribute(hprovider: Handle, attribute: UInt, pparameterbuffer: ConstPtr<CVoid>, uparamlen: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeProviderSetAttribute")

public actual fun pxeProviderUnRegister(pszprovidername: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeProviderUnRegister")

public actual fun pxeRegisterCallback(hprovider: Handle, callbacktype: UInt, pcallbackfunction: ConstPtr<CVoid>, pcontext: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeRegisterCallback")

public actual fun pxeSendReply(hclientrequest: Handle, ppacket: ConstPtr<CVoid>, upacketlen: UInt, paddress: ConstPtr<PxeAddress>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeSendReply")

public actual fun pxeTrace(hprovider: Handle, severity: UInt, pszformat: Pcwstr, vararg variadicArgs: Long): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeTrace")

public actual fun pxeTraceV(hprovider: Handle, severity: UInt, pszformat: Pcwstr, params: ConstPtr<Byte>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeTraceV")

public actual fun wdsBpAddOption(hhandle: Handle, uoption: UInt, uvaluelen: UInt, pvalue: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsBpAddOption")

public actual fun wdsBpCloseHandle(hhandle: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsBpCloseHandle")

public actual fun wdsBpGetOptionBuffer(hhandle: Handle, ubufferlen: UInt, pbuffer: MutPtr<CVoid>, pubytes: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsBpGetOptionBuffer")

public actual fun wdsBpInitialize(bpackettype: UByte, phhandle: MutPtr<Handle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsBpInitialize")

public actual fun wdsBpParseInitialize(ppacket: ConstPtr<CVoid>, upacketlen: UInt, pbpackettype: MutPtr<UByte>, phhandle: MutPtr<Handle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsBpParseInitialize")

public actual fun wdsBpParseInitializev6(ppacket: ConstPtr<CVoid>, upacketlen: UInt, pbpackettype: MutPtr<UByte>, phhandle: MutPtr<Handle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsBpParseInitializev6")

public actual fun wdsBpQueryOption(hhandle: Handle, uoption: UInt, uvaluelen: UInt, pvalue: MutPtr<CVoid>, pubytes: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsBpQueryOption")

public actual fun wdsCliAuthorizeSession(hsession: Handle, pcred: ConstPtr<WdsCliCred>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliAuthorizeSession")

public actual fun wdsCliCancelTransfer(htransfer: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliCancelTransfer")

public actual fun wdsCliClose(handle: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliClose")

public actual fun wdsCliCreateSession(pwszserver: Pcwstr, pcred: ConstPtr<WdsCliCred>, phsession: MutPtr<Handle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliCreateSession")

public actual fun wdsCliFindFirstImage(hsession: Handle, phfindhandle: MutPtr<Handle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliFindFirstImage")

public actual fun wdsCliFindNextImage(handle: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliFindNextImage")

public actual fun wdsCliFreeStringArray(ppwszarray: MutPtr<Pwstr>, ulcount: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliFreeStringArray")

public actual fun wdsCliGetDriverQueryXml(pwszwindirpath: Pcwstr, ppwszdriverquery: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetDriverQueryXml")

public actual fun wdsCliGetEnumerationFlags(handle: Handle, pdwflags: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetEnumerationFlags")

public actual fun wdsCliGetImageArchitecture(hifh: Handle, pdwvalue: MutPtr<CpuArchitecture>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageArchitecture")

public actual fun wdsCliGetImageDescription(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageDescription")

public actual fun wdsCliGetImageFiles(hifh: Handle, pppwszfiles: MutPtr<MutPtr<Pwstr>>, pdwcount: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageFiles")

public actual fun wdsCliGetImageGroup(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageGroup")

public actual fun wdsCliGetImageHalName(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageHalName")

public actual fun wdsCliGetImageHandleFromFindHandle(findhandle: Handle, phimagehandle: MutPtr<Handle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageHandleFromFindHandle")

public actual fun wdsCliGetImageHandleFromTransferHandle(htransfer: Handle, phimagehandle: MutPtr<Handle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageHandleFromTransferHandle")

public actual fun wdsCliGetImageIndex(hifh: Handle, pdwvalue: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageIndex")

public actual fun wdsCliGetImageLanguage(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageLanguage")

public actual fun wdsCliGetImageLanguages(hifh: Handle, pppszvalues: MutPtr<MutPtr<MutPtr<Byte>>>, pdwnumvalues: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageLanguages")

public actual fun wdsCliGetImageLastModifiedTime(hifh: Handle, ppsystimevalue: MutPtr<MutPtr<Systemtime>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageLastModifiedTime")

public actual fun wdsCliGetImageName(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageName")

public actual fun wdsCliGetImageNamespace(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageNamespace")

public actual fun wdsCliGetImageParameter(hifh: Handle, paramtype: WdsCliImageParamType, presponse: MutPtr<CVoid>, uresponselen: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageParameter")

public actual fun wdsCliGetImagePath(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImagePath")

public actual fun wdsCliGetImageSize(hifh: Handle, pullvalue: MutPtr<ULong>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageSize")

public actual fun wdsCliGetImageType(hifh: Handle, pimagetype: MutPtr<WdsCliImageType>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageType")

public actual fun wdsCliGetImageVersion(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageVersion")

public actual fun wdsCliGetTransferSize(hifh: Handle, pullvalue: MutPtr<ULong>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetTransferSize")

public actual fun wdsCliInitializeLog(hsession: Handle, ulclientarchitecture: CpuArchitecture, pwszclientid: Pcwstr, pwszclientaddress: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliInitializeLog")

public actual fun wdsCliLog(hsession: Handle, ulloglevel: UInt, ulmessagecode: UInt, vararg variadicArgs: Long): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliLog")

public actual fun wdsCliObtainDriverPackages(himage: Handle, ppwszservername: MutPtr<Pwstr>, pppwszdriverpackages: MutPtr<MutPtr<Pwstr>>, pulcount: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliObtainDriverPackages")

public actual fun wdsCliObtainDriverPackagesEx(hsession: Handle, pwszmachineinfo: Pcwstr, ppwszservername: MutPtr<Pwstr>, pppwszdriverpackages: MutPtr<MutPtr<Pwstr>>, pulcount: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliObtainDriverPackagesEx")

public actual fun wdsCliRegisterTrace(pfn: PfnWdsCliTraceFunction): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliRegisterTrace")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDeploymentservicesWdsCliSetTransferBufferSize")
private external fun wasiWindowssysWindowsWin32SystemDeploymentservicesWdsCliSetTransferBufferSize(ulsizeinbytes: Int): Unit

public actual fun wdsCliSetTransferBufferSize(ulsizeinbytes: UInt): Unit =
    wasiWindowssysWindowsWin32SystemDeploymentservicesWdsCliSetTransferBufferSize(ulsizeinbytes.toInt())

public actual fun wdsCliTransferFile(pwszserver: Pcwstr, pwsznamespace: Pcwstr, pwszremotefilepath: Pcwstr, pwszlocalfilepath: Pcwstr, dwflags: UInt, dwreserved: UInt, pfnwdsclicallback: PfnWdsCliCallback, pvuserdata: ConstPtr<CVoid>, phtransfer: MutPtr<Handle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliTransferFile")

public actual fun wdsCliTransferImage(himage: Handle, pwszlocalpath: Pcwstr, dwflags: UInt, dwreserved: UInt, pfnwdsclicallback: PfnWdsCliCallback, pvuserdata: ConstPtr<CVoid>, phtransfer: MutPtr<Handle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliTransferImage")

public actual fun wdsCliWaitForTransfer(htransfer: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliWaitForTransfer")

public actual fun wdsTransportClientAddRefBuffer(pvbuffer: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientAddRefBuffer")

public actual fun wdsTransportClientCancelSession(hsessionkey: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCancelSession")

public actual fun wdsTransportClientCancelSessionEx(hsessionkey: Handle, dwerrorcode: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCancelSessionEx")

public actual fun wdsTransportClientCloseSession(hsessionkey: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCloseSession")

public actual fun wdsTransportClientCompleteReceive(hsessionkey: Handle, ulsize: UInt, pulloffset: ConstPtr<ULong>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCompleteReceive")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientInitialize")
private external fun wasiWindowssysWindowsWin32SystemDeploymentservicesWdsTransportClientInitialize(): Int

public actual fun wdsTransportClientInitialize(): UInt =
    wasiWindowssysWindowsWin32SystemDeploymentservicesWdsTransportClientInitialize().toUInt()

public actual fun wdsTransportClientInitializeSession(psessionrequest: ConstPtr<WdsTransportclientRequest>, pcallerdata: ConstPtr<CVoid>, hsessionkey: MutPtr<Handle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientInitializeSession")

public actual fun wdsTransportClientQueryStatus(hsessionkey: Handle, pustatus: MutPtr<UInt>, puerrorcode: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientQueryStatus")

public actual fun wdsTransportClientRegisterCallback(hsessionkey: Handle, callbackid: TransportclientCallbackId, pfncallback: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientRegisterCallback")

public actual fun wdsTransportClientReleaseBuffer(pvbuffer: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientReleaseBuffer")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientShutdown")
private external fun wasiWindowssysWindowsWin32SystemDeploymentservicesWdsTransportClientShutdown(): Int

public actual fun wdsTransportClientShutdown(): UInt =
    wasiWindowssysWindowsWin32SystemDeploymentservicesWdsTransportClientShutdown().toUInt()

public actual fun wdsTransportClientStartSession(hsessionkey: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientStartSession")

public actual fun wdsTransportClientWaitForCompletion(hsessionkey: Handle, utimeout: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientWaitForCompletion")

public actual fun wdsTransportServerAllocateBuffer(hprovider: Handle, ulbuffersize: UInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerAllocateBuffer")

public actual fun wdsTransportServerCompleteRead(hprovider: Handle, ulbytesread: UInt, pvuserdata: ConstPtr<CVoid>, hreadresult: Hresult): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerCompleteRead")

public actual fun wdsTransportServerFreeBuffer(hprovider: Handle, pvbuffer: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerFreeBuffer")

public actual fun wdsTransportServerRegisterCallback(hprovider: Handle, callbackid: TransportproviderCallbackId, pfncallback: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerRegisterCallback")

public actual fun wdsTransportServerTrace(hprovider: Handle, severity: UInt, pwszformat: Pcwstr, vararg variadicArgs: Long): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerTrace")

public actual fun wdsTransportServerTraceV(hprovider: Handle, severity: UInt, pwszformat: Pcwstr, params: ConstPtr<Byte>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerTraceV")
