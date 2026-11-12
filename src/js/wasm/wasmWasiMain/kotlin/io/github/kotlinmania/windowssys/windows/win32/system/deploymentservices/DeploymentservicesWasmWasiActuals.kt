@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun pxeAsyncRecvDone(hclientrequest: Handle, action: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeAsyncRecvDone")

public actual fun pxeDhcpAppendOption(preplypacket: MutPtr, umaxreplypacketlen: UInt, pureplypacketlen: MutPtr, boption: UByte, boptionlen: UByte, pvalue: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeDhcpAppendOption")

public actual fun pxeDhcpAppendOptionRaw(preplypacket: MutPtr, umaxreplypacketlen: UInt, pureplypacketlen: MutPtr, ubufferlen: UShort, pbuffer: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeDhcpAppendOptionRaw")

public actual fun pxeDhcpGetOptionValue(ppacket: ConstPtr, upacketlen: UInt, uinstance: UInt, boption: UByte, pboptionlen: MutPtr, ppoptionvalue: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeDhcpGetOptionValue")

public actual fun pxeDhcpGetVendorOptionValue(ppacket: ConstPtr, upacketlen: UInt, boption: UByte, uinstance: UInt, pboptionlen: MutPtr, ppoptionvalue: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeDhcpGetVendorOptionValue")

public actual fun pxeDhcpInitialize(precvpacket: ConstPtr, urecvpacketlen: UInt, preplypacket: MutPtr, umaxreplypacketlen: UInt, pureplypacketlen: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeDhcpInitialize")

public actual fun pxeDhcpIsValid(ppacket: ConstPtr, upacketlen: UInt, brequestpacket: Bool, pbpxeoptionpresent: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeDhcpIsValid")

public actual fun pxeDhcpv6AppendOption(preply: MutPtr, cbreply: UInt, pcbreplyused: MutPtr, woptiontype: UShort, cboption: UShort, poption: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6AppendOption")

public actual fun pxeDhcpv6AppendOptionRaw(preply: MutPtr, cbreply: UInt, pcbreplyused: MutPtr, cbbuffer: UShort, pbuffer: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6AppendOptionRaw")

public actual fun pxeDhcpv6CreateRelayRepl(prelaymessages: ConstPtr, nrelaymessages: UInt, pinnerpacket: ConstPtr, cbinnerpacket: UInt, preplybuffer: MutPtr, cbreplybuffer: UInt, pcbreplybuffer: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6CreateRelayRepl")

public actual fun pxeDhcpv6GetOptionValue(ppacket: ConstPtr, upacketlen: UInt, uinstance: UInt, woption: UShort, pwoptionlen: MutPtr, ppoptionvalue: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6GetOptionValue")

public actual fun pxeDhcpv6GetVendorOptionValue(ppacket: ConstPtr, upacketlen: UInt, dwenterprisenumber: UInt, woption: UShort, uinstance: UInt, pwoptionlen: MutPtr, ppoptionvalue: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6GetVendorOptionValue")

public actual fun pxeDhcpv6Initialize(prequest: ConstPtr, cbrequest: UInt, preply: MutPtr, cbreply: UInt, pcbreplyused: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6Initialize")

public actual fun pxeDhcpv6IsValid(ppacket: ConstPtr, upacketlen: UInt, brequestpacket: Bool, pbpxeoptionpresent: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6IsValid")

public actual fun pxeDhcpv6ParseRelayForw(prelayforwpacket: ConstPtr, urelayforwpacketlen: UInt, prelaymessages: MutPtr, nrelaymessages: UInt, pnrelaymessages: MutPtr, ppinnerpacket: MutPtr, pcbinnerpacket: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6ParseRelayForw")

public actual fun pxeGetServerInfo(uinfotype: UInt, pbuffer: MutPtr, ubufferlen: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeGetServerInfo")

public actual fun pxeGetServerInfoEx(uinfotype: UInt, pbuffer: MutPtr, ubufferlen: UInt, pubufferused: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeGetServerInfoEx")

public actual fun pxePacketAllocate(hprovider: Handle, hclientrequest: Handle, usize: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxePacketAllocate")

public actual fun pxePacketFree(hprovider: Handle, hclientrequest: Handle, ppacket: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxePacketFree")

public actual fun pxeProviderEnumClose(henum: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeProviderEnumClose")

public actual fun pxeProviderEnumFirst(phenum: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeProviderEnumFirst")

public actual fun pxeProviderEnumNext(henum: Handle, ppprovider: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeProviderEnumNext")

public actual fun pxeProviderFreeInfo(pprovider: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeProviderFreeInfo")

public actual fun pxeProviderQueryIndex(pszprovidername: Pcwstr, puindex: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeProviderQueryIndex")

public actual fun pxeProviderRegister(pszprovidername: Pcwstr, pszmodulepath: Pcwstr, index: UInt, biscritical: Bool, phproviderkey: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeProviderRegister")

public actual fun pxeProviderSetAttribute(hprovider: Handle, attribute: UInt, pparameterbuffer: ConstPtr, uparamlen: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeProviderSetAttribute")

public actual fun pxeProviderUnRegister(pszprovidername: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeProviderUnRegister")

public actual fun pxeRegisterCallback(hprovider: Handle, callbacktype: UInt, pcallbackfunction: ConstPtr, pcontext: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeRegisterCallback")

public actual fun pxeSendReply(hclientrequest: Handle, ppacket: ConstPtr, upacketlen: UInt, paddress: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeSendReply")

public actual fun pxeTrace(hprovider: Handle, severity: UInt, pszformat: Pcwstr, vararg variadicArgs: Long): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeTrace")

public actual fun pxeTraceV(hprovider: Handle, severity: UInt, pszformat: Pcwstr, params: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesPxeTraceV")

public actual fun wdsBpAddOption(hhandle: Handle, uoption: UInt, uvaluelen: UInt, pvalue: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsBpAddOption")

public actual fun wdsBpCloseHandle(hhandle: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsBpCloseHandle")

public actual fun wdsBpGetOptionBuffer(hhandle: Handle, ubufferlen: UInt, pbuffer: MutPtr, pubytes: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsBpGetOptionBuffer")

public actual fun wdsBpInitialize(bpackettype: UByte, phhandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsBpInitialize")

public actual fun wdsBpParseInitialize(ppacket: ConstPtr, upacketlen: UInt, pbpackettype: MutPtr, phhandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsBpParseInitialize")

public actual fun wdsBpParseInitializev6(ppacket: ConstPtr, upacketlen: UInt, pbpackettype: MutPtr, phhandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsBpParseInitializev6")

public actual fun wdsBpQueryOption(hhandle: Handle, uoption: UInt, uvaluelen: UInt, pvalue: MutPtr, pubytes: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsBpQueryOption")

public actual fun wdsCliAuthorizeSession(hsession: Handle, pcred: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliAuthorizeSession")

public actual fun wdsCliCancelTransfer(htransfer: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliCancelTransfer")

public actual fun wdsCliClose(handle: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliClose")

public actual fun wdsCliCreateSession(pwszserver: Pcwstr, pcred: ConstPtr, phsession: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliCreateSession")

public actual fun wdsCliFindFirstImage(hsession: Handle, phfindhandle: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliFindFirstImage")

public actual fun wdsCliFindNextImage(handle: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliFindNextImage")

public actual fun wdsCliFreeStringArray(ppwszarray: MutPtr, ulcount: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliFreeStringArray")

public actual fun wdsCliGetDriverQueryXml(pwszwindirpath: Pcwstr, ppwszdriverquery: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetDriverQueryXml")

public actual fun wdsCliGetEnumerationFlags(handle: Handle, pdwflags: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetEnumerationFlags")

public actual fun wdsCliGetImageArchitecture(hifh: Handle, pdwvalue: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageArchitecture")

public actual fun wdsCliGetImageDescription(hifh: Handle, ppwszvalue: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageDescription")

public actual fun wdsCliGetImageFiles(hifh: Handle, pppwszfiles: MutPtr, pdwcount: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageFiles")

public actual fun wdsCliGetImageGroup(hifh: Handle, ppwszvalue: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageGroup")

public actual fun wdsCliGetImageHalName(hifh: Handle, ppwszvalue: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageHalName")

public actual fun wdsCliGetImageHandleFromFindHandle(findhandle: Handle, phimagehandle: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageHandleFromFindHandle")

public actual fun wdsCliGetImageHandleFromTransferHandle(htransfer: Handle, phimagehandle: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageHandleFromTransferHandle")

public actual fun wdsCliGetImageIndex(hifh: Handle, pdwvalue: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageIndex")

public actual fun wdsCliGetImageLanguage(hifh: Handle, ppwszvalue: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageLanguage")

public actual fun wdsCliGetImageLanguages(hifh: Handle, pppszvalues: MutPtr, pdwnumvalues: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageLanguages")

public actual fun wdsCliGetImageLastModifiedTime(hifh: Handle, ppsystimevalue: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageLastModifiedTime")

public actual fun wdsCliGetImageName(hifh: Handle, ppwszvalue: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageName")

public actual fun wdsCliGetImageNamespace(hifh: Handle, ppwszvalue: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageNamespace")

public actual fun wdsCliGetImageParameter(hifh: Handle, paramtype: WdsCliImageParamType, presponse: MutPtr, uresponselen: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageParameter")

public actual fun wdsCliGetImagePath(hifh: Handle, ppwszvalue: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImagePath")

public actual fun wdsCliGetImageSize(hifh: Handle, pullvalue: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageSize")

public actual fun wdsCliGetImageType(hifh: Handle, pimagetype: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageType")

public actual fun wdsCliGetImageVersion(hifh: Handle, ppwszvalue: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageVersion")

public actual fun wdsCliGetTransferSize(hifh: Handle, pullvalue: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliGetTransferSize")

public actual fun wdsCliInitializeLog(hsession: Handle, ulclientarchitecture: CpuArchitecture, pwszclientid: Pcwstr, pwszclientaddress: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliInitializeLog")

public actual fun wdsCliLog(hsession: Handle, ulloglevel: UInt, ulmessagecode: UInt, vararg variadicArgs: Long): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliLog")

public actual fun wdsCliObtainDriverPackages(himage: Handle, ppwszservername: MutPtr, pppwszdriverpackages: MutPtr, pulcount: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliObtainDriverPackages")

public actual fun wdsCliObtainDriverPackagesEx(hsession: Handle, pwszmachineinfo: Pcwstr, ppwszservername: MutPtr, pppwszdriverpackages: MutPtr, pulcount: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliObtainDriverPackagesEx")

public actual fun wdsCliRegisterTrace(pfn: PfnWdsCliTraceFunction): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliRegisterTrace")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDeploymentservicesWdsCliSetTransferBufferSize")
private external fun wasiWindowssysWindowsWin32SystemDeploymentservicesWdsCliSetTransferBufferSize(ulsizeinbytes: Int): Unit

public actual fun wdsCliSetTransferBufferSize(ulsizeinbytes: UInt): Unit =
    wasiWindowssysWindowsWin32SystemDeploymentservicesWdsCliSetTransferBufferSize(ulsizeinbytes.toInt())

public actual fun wdsCliTransferFile(pwszserver: Pcwstr, pwsznamespace: Pcwstr, pwszremotefilepath: Pcwstr, pwszlocalfilepath: Pcwstr, dwflags: UInt, dwreserved: UInt, pfnwdsclicallback: PfnWdsCliCallback, pvuserdata: ConstPtr, phtransfer: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliTransferFile")

public actual fun wdsCliTransferImage(himage: Handle, pwszlocalpath: Pcwstr, dwflags: UInt, dwreserved: UInt, pfnwdsclicallback: PfnWdsCliCallback, pvuserdata: ConstPtr, phtransfer: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliTransferImage")

public actual fun wdsCliWaitForTransfer(htransfer: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsCliWaitForTransfer")

public actual fun wdsTransportClientAddRefBuffer(pvbuffer: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientAddRefBuffer")

public actual fun wdsTransportClientCancelSession(hsessionkey: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCancelSession")

public actual fun wdsTransportClientCancelSessionEx(hsessionkey: Handle, dwerrorcode: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCancelSessionEx")

public actual fun wdsTransportClientCloseSession(hsessionkey: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCloseSession")

public actual fun wdsTransportClientCompleteReceive(hsessionkey: Handle, ulsize: UInt, pulloffset: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCompleteReceive")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientInitialize")
private external fun wasiWindowssysWindowsWin32SystemDeploymentservicesWdsTransportClientInitialize(): Int

public actual fun wdsTransportClientInitialize(): UInt =
    wasiWindowssysWindowsWin32SystemDeploymentservicesWdsTransportClientInitialize().toUInt()

public actual fun wdsTransportClientInitializeSession(psessionrequest: ConstPtr, pcallerdata: ConstPtr, hsessionkey: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientInitializeSession")

public actual fun wdsTransportClientQueryStatus(hsessionkey: Handle, pustatus: MutPtr, puerrorcode: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientQueryStatus")

public actual fun wdsTransportClientRegisterCallback(hsessionkey: Handle, callbackid: TransportclientCallbackId, pfncallback: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientRegisterCallback")

public actual fun wdsTransportClientReleaseBuffer(pvbuffer: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientReleaseBuffer")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientShutdown")
private external fun wasiWindowssysWindowsWin32SystemDeploymentservicesWdsTransportClientShutdown(): Int

public actual fun wdsTransportClientShutdown(): UInt =
    wasiWindowssysWindowsWin32SystemDeploymentservicesWdsTransportClientShutdown().toUInt()

public actual fun wdsTransportClientStartSession(hsessionkey: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientStartSession")

public actual fun wdsTransportClientWaitForCompletion(hsessionkey: Handle, utimeout: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientWaitForCompletion")

public actual fun wdsTransportServerAllocateBuffer(hprovider: Handle, ulbuffersize: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerAllocateBuffer")

public actual fun wdsTransportServerCompleteRead(hprovider: Handle, ulbytesread: UInt, pvuserdata: ConstPtr, hreadresult: Hresult): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerCompleteRead")

public actual fun wdsTransportServerFreeBuffer(hprovider: Handle, pvbuffer: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerFreeBuffer")

public actual fun wdsTransportServerRegisterCallback(hprovider: Handle, callbackid: TransportproviderCallbackId, pfncallback: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerRegisterCallback")

public actual fun wdsTransportServerTrace(hprovider: Handle, severity: UInt, pwszformat: Pcwstr, vararg variadicArgs: Long): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerTrace")

public actual fun wdsTransportServerTraceV(hprovider: Handle, severity: UInt, pwszformat: Pcwstr, params: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerTraceV")
