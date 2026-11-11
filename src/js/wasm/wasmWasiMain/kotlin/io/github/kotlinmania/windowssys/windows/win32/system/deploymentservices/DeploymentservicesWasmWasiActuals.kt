@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public actual fun pxeAsyncRecvDone(hclientrequest: Handle, action: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pxeDhcpAppendOption(preplypacket: COpaquePointer?, umaxreplypacketlen: UInt, pureplypacketlen: COpaquePointer?, boption: UByte, boptionlen: UByte, pvalue: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pxeDhcpAppendOptionRaw(preplypacket: COpaquePointer?, umaxreplypacketlen: UInt, pureplypacketlen: COpaquePointer?, ubufferlen: UShort, pbuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pxeDhcpGetOptionValue(ppacket: COpaquePointer?, upacketlen: UInt, uinstance: UInt, boption: UByte, pboptionlen: COpaquePointer?, ppoptionvalue: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pxeDhcpGetVendorOptionValue(ppacket: COpaquePointer?, upacketlen: UInt, boption: UByte, uinstance: UInt, pboptionlen: COpaquePointer?, ppoptionvalue: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pxeDhcpInitialize(precvpacket: COpaquePointer?, urecvpacketlen: UInt, preplypacket: COpaquePointer?, umaxreplypacketlen: UInt, pureplypacketlen: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pxeDhcpIsValid(ppacket: COpaquePointer?, upacketlen: UInt, brequestpacket: Bool, pbpxeoptionpresent: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pxeDhcpv6AppendOption(preply: COpaquePointer?, cbreply: UInt, pcbreplyused: COpaquePointer?, woptiontype: UShort, cboption: UShort, poption: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pxeDhcpv6AppendOptionRaw(preply: COpaquePointer?, cbreply: UInt, pcbreplyused: COpaquePointer?, cbbuffer: UShort, pbuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pxeDhcpv6CreateRelayRepl(prelaymessages: COpaquePointer?, nrelaymessages: UInt, pinnerpacket: COpaquePointer?, cbinnerpacket: UInt, preplybuffer: COpaquePointer?, cbreplybuffer: UInt, pcbreplybuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pxeDhcpv6GetOptionValue(ppacket: COpaquePointer?, upacketlen: UInt, uinstance: UInt, woption: UShort, pwoptionlen: COpaquePointer?, ppoptionvalue: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pxeDhcpv6GetVendorOptionValue(ppacket: COpaquePointer?, upacketlen: UInt, dwenterprisenumber: UInt, woption: UShort, uinstance: UInt, pwoptionlen: COpaquePointer?, ppoptionvalue: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pxeDhcpv6Initialize(prequest: COpaquePointer?, cbrequest: UInt, preply: COpaquePointer?, cbreply: UInt, pcbreplyused: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pxeDhcpv6IsValid(ppacket: COpaquePointer?, upacketlen: UInt, brequestpacket: Bool, pbpxeoptionpresent: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pxeDhcpv6ParseRelayForw(prelayforwpacket: COpaquePointer?, urelayforwpacketlen: UInt, prelaymessages: COpaquePointer?, nrelaymessages: UInt, pnrelaymessages: COpaquePointer?, ppinnerpacket: COpaquePointer?, pcbinnerpacket: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pxeGetServerInfo(uinfotype: UInt, pbuffer: COpaquePointer?, ubufferlen: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pxeGetServerInfoEx(uinfotype: UInt, pbuffer: COpaquePointer?, ubufferlen: UInt, pubufferused: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pxePacketAllocate(hprovider: Handle, hclientrequest: Handle, usize: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pxePacketFree(hprovider: Handle, hclientrequest: Handle, ppacket: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pxeProviderEnumClose(henum: Handle): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pxeProviderEnumFirst(phenum: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pxeProviderEnumNext(henum: Handle, ppprovider: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pxeProviderFreeInfo(pprovider: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pxeProviderQueryIndex(pszprovidername: Pcwstr, puindex: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pxeProviderRegister(pszprovidername: Pcwstr, pszmodulepath: Pcwstr, index: UInt, biscritical: Bool, phproviderkey: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pxeProviderSetAttribute(hprovider: Handle, attribute: UInt, pparameterbuffer: COpaquePointer?, uparamlen: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pxeProviderUnRegister(pszprovidername: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pxeRegisterCallback(hprovider: Handle, callbacktype: UInt, pcallbackfunction: COpaquePointer?, pcontext: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pxeSendReply(hclientrequest: Handle, ppacket: COpaquePointer?, upacketlen: UInt, paddress: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pxeTrace(hprovider: Handle, severity: UInt, pszformat: Pcwstr, vararg variadicArgs: Long): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pxeTraceV(hprovider: Handle, severity: UInt, pszformat: Pcwstr, params: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsBpAddOption(hhandle: Handle, uoption: UInt, uvaluelen: UInt, pvalue: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsBpCloseHandle(hhandle: Handle): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsBpGetOptionBuffer(hhandle: Handle, ubufferlen: UInt, pbuffer: COpaquePointer?, pubytes: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsBpInitialize(bpackettype: UByte, phhandle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsBpParseInitialize(ppacket: COpaquePointer?, upacketlen: UInt, pbpackettype: COpaquePointer?, phhandle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsBpParseInitializev6(ppacket: COpaquePointer?, upacketlen: UInt, pbpackettype: COpaquePointer?, phhandle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsBpQueryOption(hhandle: Handle, uoption: UInt, uvaluelen: UInt, pvalue: COpaquePointer?, pubytes: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsCliAuthorizeSession(hsession: Handle, pcred: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsCliCancelTransfer(htransfer: Handle): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsCliClose(handle: Handle): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsCliCreateSession(pwszserver: Pcwstr, pcred: COpaquePointer?, phsession: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsCliFindFirstImage(hsession: Handle, phfindhandle: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsCliFindNextImage(handle: Handle): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsCliFreeStringArray(ppwszarray: COpaquePointer?, ulcount: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsCliGetDriverQueryXml(pwszwindirpath: Pcwstr, ppwszdriverquery: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsCliGetEnumerationFlags(handle: Handle, pdwflags: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsCliGetImageArchitecture(hifh: Handle, pdwvalue: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsCliGetImageDescription(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsCliGetImageFiles(hifh: Handle, pppwszfiles: COpaquePointer?, pdwcount: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsCliGetImageGroup(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsCliGetImageHalName(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsCliGetImageHandleFromFindHandle(findhandle: Handle, phimagehandle: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsCliGetImageHandleFromTransferHandle(htransfer: Handle, phimagehandle: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsCliGetImageIndex(hifh: Handle, pdwvalue: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsCliGetImageLanguage(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsCliGetImageLanguages(hifh: Handle, pppszvalues: COpaquePointer?, pdwnumvalues: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsCliGetImageLastModifiedTime(hifh: Handle, ppsystimevalue: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsCliGetImageName(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsCliGetImageNamespace(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsCliGetImageParameter(hifh: Handle, paramtype: WdsCliImageParamType, presponse: COpaquePointer?, uresponselen: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsCliGetImagePath(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsCliGetImageSize(hifh: Handle, pullvalue: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsCliGetImageType(hifh: Handle, pimagetype: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsCliGetImageVersion(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsCliGetTransferSize(hifh: Handle, pullvalue: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsCliInitializeLog(hsession: Handle, ulclientarchitecture: CpuArchitecture, pwszclientid: Pcwstr, pwszclientaddress: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsCliLog(hsession: Handle, ulloglevel: UInt, ulmessagecode: UInt, vararg variadicArgs: Long): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsCliObtainDriverPackages(himage: Handle, ppwszservername: COpaquePointer?, pppwszdriverpackages: COpaquePointer?, pulcount: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsCliObtainDriverPackagesEx(hsession: Handle, pwszmachineinfo: Pcwstr, ppwszservername: COpaquePointer?, pppwszdriverpackages: COpaquePointer?, pulcount: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsCliRegisterTrace(pfn: PfnWdsCliTraceFunction): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsCliSetTransferBufferSize(ulsizeinbytes: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun wdsCliTransferFile(pwszserver: Pcwstr, pwsznamespace: Pcwstr, pwszremotefilepath: Pcwstr, pwszlocalfilepath: Pcwstr, dwflags: UInt, dwreserved: UInt, pfnwdsclicallback: PfnWdsCliCallback, pvuserdata: COpaquePointer?, phtransfer: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsCliTransferImage(himage: Handle, pwszlocalpath: Pcwstr, dwflags: UInt, dwreserved: UInt, pfnwdsclicallback: PfnWdsCliCallback, pvuserdata: COpaquePointer?, phtransfer: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsCliWaitForTransfer(htransfer: Handle): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsTransportClientAddRefBuffer(pvbuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsTransportClientCancelSession(hsessionkey: Handle): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsTransportClientCancelSessionEx(hsessionkey: Handle, dwerrorcode: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsTransportClientCloseSession(hsessionkey: Handle): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsTransportClientCompleteReceive(hsessionkey: Handle, ulsize: UInt, pulloffset: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsTransportClientInitialize(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsTransportClientInitializeSession(psessionrequest: COpaquePointer?, pcallerdata: COpaquePointer?, hsessionkey: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsTransportClientQueryStatus(hsessionkey: Handle, pustatus: COpaquePointer?, puerrorcode: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsTransportClientRegisterCallback(hsessionkey: Handle, callbackid: TransportclientCallbackId, pfncallback: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsTransportClientReleaseBuffer(pvbuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsTransportClientShutdown(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsTransportClientStartSession(hsessionkey: Handle): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsTransportClientWaitForCompletion(hsessionkey: Handle, utimeout: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsTransportServerAllocateBuffer(hprovider: Handle, ulbuffersize: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsTransportServerCompleteRead(hprovider: Handle, ulbytesread: UInt, pvuserdata: COpaquePointer?, hreadresult: Hresult): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsTransportServerFreeBuffer(hprovider: Handle, pvbuffer: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsTransportServerRegisterCallback(hprovider: Handle, callbackid: TransportproviderCallbackId, pfncallback: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsTransportServerTrace(hprovider: Handle, severity: UInt, pwszformat: Pcwstr, vararg variadicArgs: Long): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wdsTransportServerTraceV(hprovider: Handle, severity: UInt, pwszformat: Pcwstr, params: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
