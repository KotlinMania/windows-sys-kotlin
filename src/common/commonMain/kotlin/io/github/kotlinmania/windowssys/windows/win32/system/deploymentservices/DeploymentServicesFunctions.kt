package io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun pxeAsyncRecvDone(hclientrequest: Handle, action: UInt): UInt

public expect fun pxeDhcpAppendOption(preplypacket: COpaquePointer?, umaxreplypacketlen: UInt, pureplypacketlen: COpaquePointer?, boption: UByte, boptionlen: UByte, pvalue: COpaquePointer?): UInt

public expect fun pxeDhcpAppendOptionRaw(preplypacket: COpaquePointer?, umaxreplypacketlen: UInt, pureplypacketlen: COpaquePointer?, ubufferlen: UShort, pbuffer: COpaquePointer?): UInt

public expect fun pxeDhcpGetOptionValue(ppacket: COpaquePointer?, upacketlen: UInt, uinstance: UInt, boption: UByte, pboptionlen: COpaquePointer?, ppoptionvalue: COpaquePointer?): UInt

public expect fun pxeDhcpGetVendorOptionValue(ppacket: COpaquePointer?, upacketlen: UInt, boption: UByte, uinstance: UInt, pboptionlen: COpaquePointer?, ppoptionvalue: COpaquePointer?): UInt

public expect fun pxeDhcpInitialize(precvpacket: COpaquePointer?, urecvpacketlen: UInt, preplypacket: COpaquePointer?, umaxreplypacketlen: UInt, pureplypacketlen: COpaquePointer?): UInt

public expect fun pxeDhcpIsValid(ppacket: COpaquePointer?, upacketlen: UInt, brequestpacket: Bool, pbpxeoptionpresent: COpaquePointer?): UInt

public expect fun pxeDhcpv6AppendOption(preply: COpaquePointer?, cbreply: UInt, pcbreplyused: COpaquePointer?, woptiontype: UShort, cboption: UShort, poption: COpaquePointer?): UInt

public expect fun pxeDhcpv6AppendOptionRaw(preply: COpaquePointer?, cbreply: UInt, pcbreplyused: COpaquePointer?, cbbuffer: UShort, pbuffer: COpaquePointer?): UInt

public expect fun pxeDhcpv6CreateRelayRepl(prelaymessages: COpaquePointer?, nrelaymessages: UInt, pinnerpacket: COpaquePointer?, cbinnerpacket: UInt, preplybuffer: COpaquePointer?, cbreplybuffer: UInt, pcbreplybuffer: COpaquePointer?): UInt

public expect fun pxeDhcpv6GetOptionValue(ppacket: COpaquePointer?, upacketlen: UInt, uinstance: UInt, woption: UShort, pwoptionlen: COpaquePointer?, ppoptionvalue: COpaquePointer?): UInt

public expect fun pxeDhcpv6GetVendorOptionValue(ppacket: COpaquePointer?, upacketlen: UInt, dwenterprisenumber: UInt, woption: UShort, uinstance: UInt, pwoptionlen: COpaquePointer?, ppoptionvalue: COpaquePointer?): UInt

public expect fun pxeDhcpv6Initialize(prequest: COpaquePointer?, cbrequest: UInt, preply: COpaquePointer?, cbreply: UInt, pcbreplyused: COpaquePointer?): UInt

public expect fun pxeDhcpv6IsValid(ppacket: COpaquePointer?, upacketlen: UInt, brequestpacket: Bool, pbpxeoptionpresent: COpaquePointer?): UInt

public expect fun pxeDhcpv6ParseRelayForw(prelayforwpacket: COpaquePointer?, urelayforwpacketlen: UInt, prelaymessages: COpaquePointer?, nrelaymessages: UInt, pnrelaymessages: COpaquePointer?, ppinnerpacket: COpaquePointer?, pcbinnerpacket: COpaquePointer?): UInt

public expect fun pxeGetServerInfo(uinfotype: UInt, pbuffer: COpaquePointer?, ubufferlen: UInt): UInt

public expect fun pxeGetServerInfoEx(uinfotype: UInt, pbuffer: COpaquePointer?, ubufferlen: UInt, pubufferused: COpaquePointer?): UInt

public expect fun pxePacketAllocate(hprovider: Handle, hclientrequest: Handle, usize: UInt): COpaquePointer?

public expect fun pxePacketFree(hprovider: Handle, hclientrequest: Handle, ppacket: COpaquePointer?): UInt

public expect fun pxeProviderEnumClose(henum: Handle): UInt

public expect fun pxeProviderEnumFirst(phenum: COpaquePointer?): UInt

public expect fun pxeProviderEnumNext(henum: Handle, ppprovider: COpaquePointer?): UInt

public expect fun pxeProviderFreeInfo(pprovider: COpaquePointer?): UInt

public expect fun pxeProviderQueryIndex(pszprovidername: Pcwstr, puindex: COpaquePointer?): UInt

public expect fun pxeProviderRegister(pszprovidername: Pcwstr, pszmodulepath: Pcwstr, index: UInt, biscritical: Bool, phproviderkey: COpaquePointer?): UInt

public expect fun pxeProviderSetAttribute(hprovider: Handle, attribute: UInt, pparameterbuffer: COpaquePointer?, uparamlen: UInt): UInt

public expect fun pxeProviderUnRegister(pszprovidername: Pcwstr): UInt

public expect fun pxeRegisterCallback(hprovider: Handle, callbacktype: UInt, pcallbackfunction: COpaquePointer?, pcontext: COpaquePointer?): UInt

public expect fun pxeSendReply(hclientrequest: Handle, ppacket: COpaquePointer?, upacketlen: UInt, paddress: COpaquePointer?): UInt

public expect fun pxeTrace(hprovider: Handle, severity: UInt, pszformat: Pcwstr, vararg variadicArgs: Long): UInt

public expect fun pxeTraceV(hprovider: Handle, severity: UInt, pszformat: Pcwstr, params: COpaquePointer?): UInt

public expect fun wdsBpAddOption(hhandle: Handle, uoption: UInt, uvaluelen: UInt, pvalue: COpaquePointer?): UInt

public expect fun wdsBpCloseHandle(hhandle: Handle): UInt

public expect fun wdsBpGetOptionBuffer(hhandle: Handle, ubufferlen: UInt, pbuffer: COpaquePointer?, pubytes: COpaquePointer?): UInt

public expect fun wdsBpInitialize(bpackettype: UByte, phhandle: COpaquePointer?): UInt

public expect fun wdsBpParseInitialize(ppacket: COpaquePointer?, upacketlen: UInt, pbpackettype: COpaquePointer?, phhandle: COpaquePointer?): UInt

public expect fun wdsBpParseInitializev6(ppacket: COpaquePointer?, upacketlen: UInt, pbpackettype: COpaquePointer?, phhandle: COpaquePointer?): UInt

public expect fun wdsBpQueryOption(hhandle: Handle, uoption: UInt, uvaluelen: UInt, pvalue: COpaquePointer?, pubytes: COpaquePointer?): UInt

public expect fun wdsCliAuthorizeSession(hsession: Handle, pcred: COpaquePointer?): Hresult

public expect fun wdsCliCancelTransfer(htransfer: Handle): Hresult

public expect fun wdsCliClose(handle: Handle): Hresult

public expect fun wdsCliCreateSession(pwszserver: Pcwstr, pcred: COpaquePointer?, phsession: COpaquePointer?): Hresult

public expect fun wdsCliFindFirstImage(hsession: Handle, phfindhandle: COpaquePointer?): Hresult

public expect fun wdsCliFindNextImage(handle: Handle): Hresult

public expect fun wdsCliFreeStringArray(ppwszarray: COpaquePointer?, ulcount: UInt): Hresult

public expect fun wdsCliGetDriverQueryXml(pwszwindirpath: Pcwstr, ppwszdriverquery: COpaquePointer?): Hresult

public expect fun wdsCliGetEnumerationFlags(handle: Handle, pdwflags: COpaquePointer?): Hresult

public expect fun wdsCliGetImageArchitecture(hifh: Handle, pdwvalue: COpaquePointer?): Hresult

public expect fun wdsCliGetImageDescription(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult

public expect fun wdsCliGetImageFiles(hifh: Handle, pppwszfiles: COpaquePointer?, pdwcount: COpaquePointer?): Hresult

public expect fun wdsCliGetImageGroup(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult

public expect fun wdsCliGetImageHalName(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult

public expect fun wdsCliGetImageHandleFromFindHandle(findhandle: Handle, phimagehandle: COpaquePointer?): Hresult

public expect fun wdsCliGetImageHandleFromTransferHandle(htransfer: Handle, phimagehandle: COpaquePointer?): Hresult

public expect fun wdsCliGetImageIndex(hifh: Handle, pdwvalue: COpaquePointer?): Hresult

public expect fun wdsCliGetImageLanguage(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult

public expect fun wdsCliGetImageLanguages(hifh: Handle, pppszvalues: COpaquePointer?, pdwnumvalues: COpaquePointer?): Hresult

public expect fun wdsCliGetImageLastModifiedTime(hifh: Handle, ppsystimevalue: COpaquePointer?): Hresult

public expect fun wdsCliGetImageName(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult

public expect fun wdsCliGetImageNamespace(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult

public expect fun wdsCliGetImageParameter(hifh: Handle, paramtype: WdsCliImageParamType, presponse: COpaquePointer?, uresponselen: UInt): Hresult

public expect fun wdsCliGetImagePath(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult

public expect fun wdsCliGetImageSize(hifh: Handle, pullvalue: COpaquePointer?): Hresult

public expect fun wdsCliGetImageType(hifh: Handle, pimagetype: COpaquePointer?): Hresult

public expect fun wdsCliGetImageVersion(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult

public expect fun wdsCliGetTransferSize(hifh: Handle, pullvalue: COpaquePointer?): Hresult

public expect fun wdsCliInitializeLog(hsession: Handle, ulclientarchitecture: CpuArchitecture, pwszclientid: Pcwstr, pwszclientaddress: Pcwstr): Hresult

public expect fun wdsCliLog(hsession: Handle, ulloglevel: UInt, ulmessagecode: UInt, vararg variadicArgs: Long): Hresult

public expect fun wdsCliObtainDriverPackages(himage: Handle, ppwszservername: COpaquePointer?, pppwszdriverpackages: COpaquePointer?, pulcount: COpaquePointer?): Hresult

public expect fun wdsCliObtainDriverPackagesEx(hsession: Handle, pwszmachineinfo: Pcwstr, ppwszservername: COpaquePointer?, pppwszdriverpackages: COpaquePointer?, pulcount: COpaquePointer?): Hresult

public expect fun wdsCliRegisterTrace(pfn: PfnWdsCliTraceFunction): Hresult

public expect fun wdsCliSetTransferBufferSize(ulsizeinbytes: UInt)

public expect fun wdsCliTransferFile(pwszserver: Pcwstr, pwsznamespace: Pcwstr, pwszremotefilepath: Pcwstr, pwszlocalfilepath: Pcwstr, dwflags: UInt, dwreserved: UInt, pfnwdsclicallback: PfnWdsCliCallback, pvuserdata: COpaquePointer?, phtransfer: COpaquePointer?): Hresult

public expect fun wdsCliTransferImage(himage: Handle, pwszlocalpath: Pcwstr, dwflags: UInt, dwreserved: UInt, pfnwdsclicallback: PfnWdsCliCallback, pvuserdata: COpaquePointer?, phtransfer: COpaquePointer?): Hresult

public expect fun wdsCliWaitForTransfer(htransfer: Handle): Hresult

public expect fun wdsTransportClientAddRefBuffer(pvbuffer: COpaquePointer?): UInt

public expect fun wdsTransportClientCancelSession(hsessionkey: Handle): UInt

public expect fun wdsTransportClientCancelSessionEx(hsessionkey: Handle, dwerrorcode: UInt): UInt

public expect fun wdsTransportClientCloseSession(hsessionkey: Handle): UInt

public expect fun wdsTransportClientCompleteReceive(hsessionkey: Handle, ulsize: UInt, pulloffset: COpaquePointer?): UInt

public expect fun wdsTransportClientInitialize(): UInt

public expect fun wdsTransportClientInitializeSession(psessionrequest: COpaquePointer?, pcallerdata: COpaquePointer?, hsessionkey: COpaquePointer?): UInt

public expect fun wdsTransportClientQueryStatus(hsessionkey: Handle, pustatus: COpaquePointer?, puerrorcode: COpaquePointer?): UInt

public expect fun wdsTransportClientRegisterCallback(hsessionkey: Handle, callbackid: TransportclientCallbackId, pfncallback: COpaquePointer?): UInt

public expect fun wdsTransportClientReleaseBuffer(pvbuffer: COpaquePointer?): UInt

public expect fun wdsTransportClientShutdown(): UInt

public expect fun wdsTransportClientStartSession(hsessionkey: Handle): UInt

public expect fun wdsTransportClientWaitForCompletion(hsessionkey: Handle, utimeout: UInt): UInt

public expect fun wdsTransportServerAllocateBuffer(hprovider: Handle, ulbuffersize: UInt): COpaquePointer?

public expect fun wdsTransportServerCompleteRead(hprovider: Handle, ulbytesread: UInt, pvuserdata: COpaquePointer?, hreadresult: Hresult): Hresult

public expect fun wdsTransportServerFreeBuffer(hprovider: Handle, pvbuffer: COpaquePointer?): Hresult

public expect fun wdsTransportServerRegisterCallback(hprovider: Handle, callbackid: TransportproviderCallbackId, pfncallback: COpaquePointer?): Hresult

public expect fun wdsTransportServerTrace(hprovider: Handle, severity: UInt, pwszformat: Pcwstr, vararg variadicArgs: Long): Hresult

public expect fun wdsTransportServerTraceV(hprovider: Handle, severity: UInt, pwszformat: Pcwstr, params: COpaquePointer?): Hresult
