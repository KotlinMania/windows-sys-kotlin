package io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun pxeAsyncRecvDone(hclientrequest: Handle, action: UInt): UInt

public expect fun pxeDhcpAppendOption(preplypacket: MutPtr, umaxreplypacketlen: UInt, pureplypacketlen: MutPtr, boption: UByte, boptionlen: UByte, pvalue: ConstPtr): UInt

public expect fun pxeDhcpAppendOptionRaw(preplypacket: MutPtr, umaxreplypacketlen: UInt, pureplypacketlen: MutPtr, ubufferlen: UShort, pbuffer: ConstPtr): UInt

public expect fun pxeDhcpGetOptionValue(ppacket: ConstPtr, upacketlen: UInt, uinstance: UInt, boption: UByte, pboptionlen: MutPtr, ppoptionvalue: MutPtr): UInt

public expect fun pxeDhcpGetVendorOptionValue(ppacket: ConstPtr, upacketlen: UInt, boption: UByte, uinstance: UInt, pboptionlen: MutPtr, ppoptionvalue: MutPtr): UInt

public expect fun pxeDhcpInitialize(precvpacket: ConstPtr, urecvpacketlen: UInt, preplypacket: MutPtr, umaxreplypacketlen: UInt, pureplypacketlen: MutPtr): UInt

public expect fun pxeDhcpIsValid(ppacket: ConstPtr, upacketlen: UInt, brequestpacket: Bool, pbpxeoptionpresent: MutPtr): UInt

public expect fun pxeDhcpv6AppendOption(preply: MutPtr, cbreply: UInt, pcbreplyused: MutPtr, woptiontype: UShort, cboption: UShort, poption: ConstPtr): UInt

public expect fun pxeDhcpv6AppendOptionRaw(preply: MutPtr, cbreply: UInt, pcbreplyused: MutPtr, cbbuffer: UShort, pbuffer: ConstPtr): UInt

public expect fun pxeDhcpv6CreateRelayRepl(prelaymessages: ConstPtr, nrelaymessages: UInt, pinnerpacket: ConstPtr, cbinnerpacket: UInt, preplybuffer: MutPtr, cbreplybuffer: UInt, pcbreplybuffer: MutPtr): UInt

public expect fun pxeDhcpv6GetOptionValue(ppacket: ConstPtr, upacketlen: UInt, uinstance: UInt, woption: UShort, pwoptionlen: MutPtr, ppoptionvalue: MutPtr): UInt

public expect fun pxeDhcpv6GetVendorOptionValue(ppacket: ConstPtr, upacketlen: UInt, dwenterprisenumber: UInt, woption: UShort, uinstance: UInt, pwoptionlen: MutPtr, ppoptionvalue: MutPtr): UInt

public expect fun pxeDhcpv6Initialize(prequest: ConstPtr, cbrequest: UInt, preply: MutPtr, cbreply: UInt, pcbreplyused: MutPtr): UInt

public expect fun pxeDhcpv6IsValid(ppacket: ConstPtr, upacketlen: UInt, brequestpacket: Bool, pbpxeoptionpresent: MutPtr): UInt

public expect fun pxeDhcpv6ParseRelayForw(prelayforwpacket: ConstPtr, urelayforwpacketlen: UInt, prelaymessages: MutPtr, nrelaymessages: UInt, pnrelaymessages: MutPtr, ppinnerpacket: MutPtr, pcbinnerpacket: MutPtr): UInt

public expect fun pxeGetServerInfo(uinfotype: UInt, pbuffer: MutPtr, ubufferlen: UInt): UInt

public expect fun pxeGetServerInfoEx(uinfotype: UInt, pbuffer: MutPtr, ubufferlen: UInt, pubufferused: MutPtr): UInt

public expect fun pxePacketAllocate(hprovider: Handle, hclientrequest: Handle, usize: UInt): MutPtr

public expect fun pxePacketFree(hprovider: Handle, hclientrequest: Handle, ppacket: ConstPtr): UInt

public expect fun pxeProviderEnumClose(henum: Handle): UInt

public expect fun pxeProviderEnumFirst(phenum: MutPtr): UInt

public expect fun pxeProviderEnumNext(henum: Handle, ppprovider: MutPtr): UInt

public expect fun pxeProviderFreeInfo(pprovider: ConstPtr): UInt

public expect fun pxeProviderQueryIndex(pszprovidername: Pcwstr, puindex: MutPtr): UInt

public expect fun pxeProviderRegister(pszprovidername: Pcwstr, pszmodulepath: Pcwstr, index: UInt, biscritical: Bool, phproviderkey: MutPtr): UInt

public expect fun pxeProviderSetAttribute(hprovider: Handle, attribute: UInt, pparameterbuffer: ConstPtr, uparamlen: UInt): UInt

public expect fun pxeProviderUnRegister(pszprovidername: Pcwstr): UInt

public expect fun pxeRegisterCallback(hprovider: Handle, callbacktype: UInt, pcallbackfunction: ConstPtr, pcontext: ConstPtr): UInt

public expect fun pxeSendReply(hclientrequest: Handle, ppacket: ConstPtr, upacketlen: UInt, paddress: ConstPtr): UInt

public expect fun pxeTrace(hprovider: Handle, severity: UInt, pszformat: Pcwstr, vararg variadicArgs: Long): UInt

public expect fun pxeTraceV(hprovider: Handle, severity: UInt, pszformat: Pcwstr, params: ConstPtr): UInt

public expect fun wdsBpAddOption(hhandle: Handle, uoption: UInt, uvaluelen: UInt, pvalue: ConstPtr): UInt

public expect fun wdsBpCloseHandle(hhandle: Handle): UInt

public expect fun wdsBpGetOptionBuffer(hhandle: Handle, ubufferlen: UInt, pbuffer: MutPtr, pubytes: MutPtr): UInt

public expect fun wdsBpInitialize(bpackettype: UByte, phhandle: MutPtr): UInt

public expect fun wdsBpParseInitialize(ppacket: ConstPtr, upacketlen: UInt, pbpackettype: MutPtr, phhandle: MutPtr): UInt

public expect fun wdsBpParseInitializev6(ppacket: ConstPtr, upacketlen: UInt, pbpackettype: MutPtr, phhandle: MutPtr): UInt

public expect fun wdsBpQueryOption(hhandle: Handle, uoption: UInt, uvaluelen: UInt, pvalue: MutPtr, pubytes: MutPtr): UInt

public expect fun wdsCliAuthorizeSession(hsession: Handle, pcred: ConstPtr): Hresult

public expect fun wdsCliCancelTransfer(htransfer: Handle): Hresult

public expect fun wdsCliClose(handle: Handle): Hresult

public expect fun wdsCliCreateSession(pwszserver: Pcwstr, pcred: ConstPtr, phsession: MutPtr): Hresult

public expect fun wdsCliFindFirstImage(hsession: Handle, phfindhandle: MutPtr): Hresult

public expect fun wdsCliFindNextImage(handle: Handle): Hresult

public expect fun wdsCliFreeStringArray(ppwszarray: MutPtr, ulcount: UInt): Hresult

public expect fun wdsCliGetDriverQueryXml(pwszwindirpath: Pcwstr, ppwszdriverquery: MutPtr): Hresult

public expect fun wdsCliGetEnumerationFlags(handle: Handle, pdwflags: MutPtr): Hresult

public expect fun wdsCliGetImageArchitecture(hifh: Handle, pdwvalue: MutPtr): Hresult

public expect fun wdsCliGetImageDescription(hifh: Handle, ppwszvalue: MutPtr): Hresult

public expect fun wdsCliGetImageFiles(hifh: Handle, pppwszfiles: MutPtr, pdwcount: MutPtr): Hresult

public expect fun wdsCliGetImageGroup(hifh: Handle, ppwszvalue: MutPtr): Hresult

public expect fun wdsCliGetImageHalName(hifh: Handle, ppwszvalue: MutPtr): Hresult

public expect fun wdsCliGetImageHandleFromFindHandle(findhandle: Handle, phimagehandle: MutPtr): Hresult

public expect fun wdsCliGetImageHandleFromTransferHandle(htransfer: Handle, phimagehandle: MutPtr): Hresult

public expect fun wdsCliGetImageIndex(hifh: Handle, pdwvalue: MutPtr): Hresult

public expect fun wdsCliGetImageLanguage(hifh: Handle, ppwszvalue: MutPtr): Hresult

public expect fun wdsCliGetImageLanguages(hifh: Handle, pppszvalues: MutPtr, pdwnumvalues: MutPtr): Hresult

public expect fun wdsCliGetImageLastModifiedTime(hifh: Handle, ppsystimevalue: MutPtr): Hresult

public expect fun wdsCliGetImageName(hifh: Handle, ppwszvalue: MutPtr): Hresult

public expect fun wdsCliGetImageNamespace(hifh: Handle, ppwszvalue: MutPtr): Hresult

public expect fun wdsCliGetImageParameter(hifh: Handle, paramtype: WdsCliImageParamType, presponse: MutPtr, uresponselen: UInt): Hresult

public expect fun wdsCliGetImagePath(hifh: Handle, ppwszvalue: MutPtr): Hresult

public expect fun wdsCliGetImageSize(hifh: Handle, pullvalue: MutPtr): Hresult

public expect fun wdsCliGetImageType(hifh: Handle, pimagetype: MutPtr): Hresult

public expect fun wdsCliGetImageVersion(hifh: Handle, ppwszvalue: MutPtr): Hresult

public expect fun wdsCliGetTransferSize(hifh: Handle, pullvalue: MutPtr): Hresult

public expect fun wdsCliInitializeLog(hsession: Handle, ulclientarchitecture: CpuArchitecture, pwszclientid: Pcwstr, pwszclientaddress: Pcwstr): Hresult

public expect fun wdsCliLog(hsession: Handle, ulloglevel: UInt, ulmessagecode: UInt, vararg variadicArgs: Long): Hresult

public expect fun wdsCliObtainDriverPackages(himage: Handle, ppwszservername: MutPtr, pppwszdriverpackages: MutPtr, pulcount: MutPtr): Hresult

public expect fun wdsCliObtainDriverPackagesEx(hsession: Handle, pwszmachineinfo: Pcwstr, ppwszservername: MutPtr, pppwszdriverpackages: MutPtr, pulcount: MutPtr): Hresult

public expect fun wdsCliRegisterTrace(pfn: PfnWdsCliTraceFunction): Hresult

public expect fun wdsCliSetTransferBufferSize(ulsizeinbytes: UInt)

public expect fun wdsCliTransferFile(pwszserver: Pcwstr, pwsznamespace: Pcwstr, pwszremotefilepath: Pcwstr, pwszlocalfilepath: Pcwstr, dwflags: UInt, dwreserved: UInt, pfnwdsclicallback: PfnWdsCliCallback, pvuserdata: ConstPtr, phtransfer: MutPtr): Hresult

public expect fun wdsCliTransferImage(himage: Handle, pwszlocalpath: Pcwstr, dwflags: UInt, dwreserved: UInt, pfnwdsclicallback: PfnWdsCliCallback, pvuserdata: ConstPtr, phtransfer: MutPtr): Hresult

public expect fun wdsCliWaitForTransfer(htransfer: Handle): Hresult

public expect fun wdsTransportClientAddRefBuffer(pvbuffer: ConstPtr): UInt

public expect fun wdsTransportClientCancelSession(hsessionkey: Handle): UInt

public expect fun wdsTransportClientCancelSessionEx(hsessionkey: Handle, dwerrorcode: UInt): UInt

public expect fun wdsTransportClientCloseSession(hsessionkey: Handle): UInt

public expect fun wdsTransportClientCompleteReceive(hsessionkey: Handle, ulsize: UInt, pulloffset: ConstPtr): UInt

public expect fun wdsTransportClientInitialize(): UInt

public expect fun wdsTransportClientInitializeSession(psessionrequest: ConstPtr, pcallerdata: ConstPtr, hsessionkey: MutPtr): UInt

public expect fun wdsTransportClientQueryStatus(hsessionkey: Handle, pustatus: MutPtr, puerrorcode: MutPtr): UInt

public expect fun wdsTransportClientRegisterCallback(hsessionkey: Handle, callbackid: TransportclientCallbackId, pfncallback: ConstPtr): UInt

public expect fun wdsTransportClientReleaseBuffer(pvbuffer: ConstPtr): UInt

public expect fun wdsTransportClientShutdown(): UInt

public expect fun wdsTransportClientStartSession(hsessionkey: Handle): UInt

public expect fun wdsTransportClientWaitForCompletion(hsessionkey: Handle, utimeout: UInt): UInt

public expect fun wdsTransportServerAllocateBuffer(hprovider: Handle, ulbuffersize: UInt): MutPtr

public expect fun wdsTransportServerCompleteRead(hprovider: Handle, ulbytesread: UInt, pvuserdata: ConstPtr, hreadresult: Hresult): Hresult

public expect fun wdsTransportServerFreeBuffer(hprovider: Handle, pvbuffer: ConstPtr): Hresult

public expect fun wdsTransportServerRegisterCallback(hprovider: Handle, callbackid: TransportproviderCallbackId, pfncallback: ConstPtr): Hresult

public expect fun wdsTransportServerTrace(hprovider: Handle, severity: UInt, pwszformat: Pcwstr, vararg variadicArgs: Long): Hresult

public expect fun wdsTransportServerTraceV(hprovider: Handle, severity: UInt, pwszformat: Pcwstr, params: ConstPtr): Hresult
