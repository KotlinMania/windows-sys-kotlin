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

public expect fun pxeAsyncRecvDone(hclientrequest: Handle, action: UInt): UInt

public expect fun pxeDhcpAppendOption(preplypacket: MutPtr<CVoid>, umaxreplypacketlen: UInt, pureplypacketlen: MutPtr<UInt>, boption: UByte, boptionlen: UByte, pvalue: ConstPtr<CVoid>): UInt

public expect fun pxeDhcpAppendOptionRaw(preplypacket: MutPtr<CVoid>, umaxreplypacketlen: UInt, pureplypacketlen: MutPtr<UInt>, ubufferlen: UShort, pbuffer: ConstPtr<CVoid>): UInt

public expect fun pxeDhcpGetOptionValue(ppacket: ConstPtr<CVoid>, upacketlen: UInt, uinstance: UInt, boption: UByte, pboptionlen: MutPtr<UByte>, ppoptionvalue: MutPtr<MutPtr<CVoid>>): UInt

public expect fun pxeDhcpGetVendorOptionValue(ppacket: ConstPtr<CVoid>, upacketlen: UInt, boption: UByte, uinstance: UInt, pboptionlen: MutPtr<UByte>, ppoptionvalue: MutPtr<MutPtr<CVoid>>): UInt

public expect fun pxeDhcpInitialize(precvpacket: ConstPtr<CVoid>, urecvpacketlen: UInt, preplypacket: MutPtr<CVoid>, umaxreplypacketlen: UInt, pureplypacketlen: MutPtr<UInt>): UInt

public expect fun pxeDhcpIsValid(ppacket: ConstPtr<CVoid>, upacketlen: UInt, brequestpacket: Bool, pbpxeoptionpresent: MutPtr<Bool>): UInt

public expect fun pxeDhcpv6AppendOption(preply: MutPtr<CVoid>, cbreply: UInt, pcbreplyused: MutPtr<UInt>, woptiontype: UShort, cboption: UShort, poption: ConstPtr<CVoid>): UInt

public expect fun pxeDhcpv6AppendOptionRaw(preply: MutPtr<CVoid>, cbreply: UInt, pcbreplyused: MutPtr<UInt>, cbbuffer: UShort, pbuffer: ConstPtr<CVoid>): UInt

public expect fun pxeDhcpv6CreateRelayRepl(prelaymessages: ConstPtr<PxeDhcpv6NestedRelayMessage>, nrelaymessages: UInt, pinnerpacket: ConstPtr<UByte>, cbinnerpacket: UInt, preplybuffer: MutPtr<CVoid>, cbreplybuffer: UInt, pcbreplybuffer: MutPtr<UInt>): UInt

public expect fun pxeDhcpv6GetOptionValue(ppacket: ConstPtr<CVoid>, upacketlen: UInt, uinstance: UInt, woption: UShort, pwoptionlen: MutPtr<UShort>, ppoptionvalue: MutPtr<MutPtr<CVoid>>): UInt

public expect fun pxeDhcpv6GetVendorOptionValue(ppacket: ConstPtr<CVoid>, upacketlen: UInt, dwenterprisenumber: UInt, woption: UShort, uinstance: UInt, pwoptionlen: MutPtr<UShort>, ppoptionvalue: MutPtr<MutPtr<CVoid>>): UInt

public expect fun pxeDhcpv6Initialize(prequest: ConstPtr<CVoid>, cbrequest: UInt, preply: MutPtr<CVoid>, cbreply: UInt, pcbreplyused: MutPtr<UInt>): UInt

public expect fun pxeDhcpv6IsValid(ppacket: ConstPtr<CVoid>, upacketlen: UInt, brequestpacket: Bool, pbpxeoptionpresent: MutPtr<Bool>): UInt

public expect fun pxeDhcpv6ParseRelayForw(prelayforwpacket: ConstPtr<CVoid>, urelayforwpacketlen: UInt, prelaymessages: MutPtr<PxeDhcpv6NestedRelayMessage>, nrelaymessages: UInt, pnrelaymessages: MutPtr<UInt>, ppinnerpacket: MutPtr<MutPtr<UByte>>, pcbinnerpacket: MutPtr<UInt>): UInt

public expect fun pxeGetServerInfo(uinfotype: UInt, pbuffer: MutPtr<CVoid>, ubufferlen: UInt): UInt

public expect fun pxeGetServerInfoEx(uinfotype: UInt, pbuffer: MutPtr<CVoid>, ubufferlen: UInt, pubufferused: MutPtr<UInt>): UInt

public expect fun pxePacketAllocate(hprovider: Handle, hclientrequest: Handle, usize: UInt): MutPtr<CVoid>

public expect fun pxePacketFree(hprovider: Handle, hclientrequest: Handle, ppacket: ConstPtr<CVoid>): UInt

public expect fun pxeProviderEnumClose(henum: Handle): UInt

public expect fun pxeProviderEnumFirst(phenum: MutPtr<Handle>): UInt

public expect fun pxeProviderEnumNext(henum: Handle, ppprovider: MutPtr<MutPtr<PxeProvider>>): UInt

public expect fun pxeProviderFreeInfo(pprovider: ConstPtr<PxeProvider>): UInt

public expect fun pxeProviderQueryIndex(pszprovidername: Pcwstr, puindex: MutPtr<UInt>): UInt

public expect fun pxeProviderRegister(pszprovidername: Pcwstr, pszmodulepath: Pcwstr, index: UInt, biscritical: Bool, phproviderkey: MutPtr<Hkey>): UInt

public expect fun pxeProviderSetAttribute(hprovider: Handle, attribute: UInt, pparameterbuffer: ConstPtr<CVoid>, uparamlen: UInt): UInt

public expect fun pxeProviderUnRegister(pszprovidername: Pcwstr): UInt

public expect fun pxeRegisterCallback(hprovider: Handle, callbacktype: UInt, pcallbackfunction: ConstPtr<CVoid>, pcontext: ConstPtr<CVoid>): UInt

public expect fun pxeSendReply(hclientrequest: Handle, ppacket: ConstPtr<CVoid>, upacketlen: UInt, paddress: ConstPtr<PxeAddress>): UInt

public expect fun pxeTrace(hprovider: Handle, severity: UInt, pszformat: Pcwstr, vararg variadicArgs: Long): UInt

public expect fun pxeTraceV(hprovider: Handle, severity: UInt, pszformat: Pcwstr, params: ConstPtr<Byte>): UInt

public expect fun wdsBpAddOption(hhandle: Handle, uoption: UInt, uvaluelen: UInt, pvalue: ConstPtr<CVoid>): UInt

public expect fun wdsBpCloseHandle(hhandle: Handle): UInt

public expect fun wdsBpGetOptionBuffer(hhandle: Handle, ubufferlen: UInt, pbuffer: MutPtr<CVoid>, pubytes: MutPtr<UInt>): UInt

public expect fun wdsBpInitialize(bpackettype: UByte, phhandle: MutPtr<Handle>): UInt

public expect fun wdsBpParseInitialize(ppacket: ConstPtr<CVoid>, upacketlen: UInt, pbpackettype: MutPtr<UByte>, phhandle: MutPtr<Handle>): UInt

public expect fun wdsBpParseInitializev6(ppacket: ConstPtr<CVoid>, upacketlen: UInt, pbpackettype: MutPtr<UByte>, phhandle: MutPtr<Handle>): UInt

public expect fun wdsBpQueryOption(hhandle: Handle, uoption: UInt, uvaluelen: UInt, pvalue: MutPtr<CVoid>, pubytes: MutPtr<UInt>): UInt

public expect fun wdsCliAuthorizeSession(hsession: Handle, pcred: ConstPtr<WdsCliCred>): Hresult

public expect fun wdsCliCancelTransfer(htransfer: Handle): Hresult

public expect fun wdsCliClose(handle: Handle): Hresult

public expect fun wdsCliCreateSession(pwszserver: Pcwstr, pcred: ConstPtr<WdsCliCred>, phsession: MutPtr<Handle>): Hresult

public expect fun wdsCliFindFirstImage(hsession: Handle, phfindhandle: MutPtr<Handle>): Hresult

public expect fun wdsCliFindNextImage(handle: Handle): Hresult

public expect fun wdsCliFreeStringArray(ppwszarray: MutPtr<Pwstr>, ulcount: UInt): Hresult

public expect fun wdsCliGetDriverQueryXml(pwszwindirpath: Pcwstr, ppwszdriverquery: MutPtr<Pwstr>): Hresult

public expect fun wdsCliGetEnumerationFlags(handle: Handle, pdwflags: MutPtr<UInt>): Hresult

public expect fun wdsCliGetImageArchitecture(hifh: Handle, pdwvalue: MutPtr<CpuArchitecture>): Hresult

public expect fun wdsCliGetImageDescription(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult

public expect fun wdsCliGetImageFiles(hifh: Handle, pppwszfiles: MutPtr<MutPtr<Pwstr>>, pdwcount: MutPtr<UInt>): Hresult

public expect fun wdsCliGetImageGroup(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult

public expect fun wdsCliGetImageHalName(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult

public expect fun wdsCliGetImageHandleFromFindHandle(findhandle: Handle, phimagehandle: MutPtr<Handle>): Hresult

public expect fun wdsCliGetImageHandleFromTransferHandle(htransfer: Handle, phimagehandle: MutPtr<Handle>): Hresult

public expect fun wdsCliGetImageIndex(hifh: Handle, pdwvalue: MutPtr<UInt>): Hresult

public expect fun wdsCliGetImageLanguage(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult

public expect fun wdsCliGetImageLanguages(hifh: Handle, pppszvalues: MutPtr<MutPtr<MutPtr<Byte>>>, pdwnumvalues: MutPtr<UInt>): Hresult

public expect fun wdsCliGetImageLastModifiedTime(hifh: Handle, ppsystimevalue: MutPtr<MutPtr<Systemtime>>): Hresult

public expect fun wdsCliGetImageName(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult

public expect fun wdsCliGetImageNamespace(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult

public expect fun wdsCliGetImageParameter(hifh: Handle, paramtype: WdsCliImageParamType, presponse: MutPtr<CVoid>, uresponselen: UInt): Hresult

public expect fun wdsCliGetImagePath(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult

public expect fun wdsCliGetImageSize(hifh: Handle, pullvalue: MutPtr<ULong>): Hresult

public expect fun wdsCliGetImageType(hifh: Handle, pimagetype: MutPtr<WdsCliImageType>): Hresult

public expect fun wdsCliGetImageVersion(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult

public expect fun wdsCliGetTransferSize(hifh: Handle, pullvalue: MutPtr<ULong>): Hresult

public expect fun wdsCliInitializeLog(hsession: Handle, ulclientarchitecture: CpuArchitecture, pwszclientid: Pcwstr, pwszclientaddress: Pcwstr): Hresult

public expect fun wdsCliLog(hsession: Handle, ulloglevel: UInt, ulmessagecode: UInt, vararg variadicArgs: Long): Hresult

public expect fun wdsCliObtainDriverPackages(himage: Handle, ppwszservername: MutPtr<Pwstr>, pppwszdriverpackages: MutPtr<MutPtr<Pwstr>>, pulcount: MutPtr<UInt>): Hresult

public expect fun wdsCliObtainDriverPackagesEx(hsession: Handle, pwszmachineinfo: Pcwstr, ppwszservername: MutPtr<Pwstr>, pppwszdriverpackages: MutPtr<MutPtr<Pwstr>>, pulcount: MutPtr<UInt>): Hresult

public expect fun wdsCliRegisterTrace(pfn: PfnWdsCliTraceFunction): Hresult

public expect fun wdsCliSetTransferBufferSize(ulsizeinbytes: UInt)

public expect fun wdsCliTransferFile(pwszserver: Pcwstr, pwsznamespace: Pcwstr, pwszremotefilepath: Pcwstr, pwszlocalfilepath: Pcwstr, dwflags: UInt, dwreserved: UInt, pfnwdsclicallback: PfnWdsCliCallback, pvuserdata: ConstPtr<CVoid>, phtransfer: MutPtr<Handle>): Hresult

public expect fun wdsCliTransferImage(himage: Handle, pwszlocalpath: Pcwstr, dwflags: UInt, dwreserved: UInt, pfnwdsclicallback: PfnWdsCliCallback, pvuserdata: ConstPtr<CVoid>, phtransfer: MutPtr<Handle>): Hresult

public expect fun wdsCliWaitForTransfer(htransfer: Handle): Hresult

public expect fun wdsTransportClientAddRefBuffer(pvbuffer: ConstPtr<CVoid>): UInt

public expect fun wdsTransportClientCancelSession(hsessionkey: Handle): UInt

public expect fun wdsTransportClientCancelSessionEx(hsessionkey: Handle, dwerrorcode: UInt): UInt

public expect fun wdsTransportClientCloseSession(hsessionkey: Handle): UInt

public expect fun wdsTransportClientCompleteReceive(hsessionkey: Handle, ulsize: UInt, pulloffset: ConstPtr<ULong>): UInt

public expect fun wdsTransportClientInitialize(): UInt

public expect fun wdsTransportClientInitializeSession(psessionrequest: ConstPtr<WdsTransportclientRequest>, pcallerdata: ConstPtr<CVoid>, hsessionkey: MutPtr<Handle>): UInt

public expect fun wdsTransportClientQueryStatus(hsessionkey: Handle, pustatus: MutPtr<UInt>, puerrorcode: MutPtr<UInt>): UInt

public expect fun wdsTransportClientRegisterCallback(hsessionkey: Handle, callbackid: TransportclientCallbackId, pfncallback: ConstPtr<CVoid>): UInt

public expect fun wdsTransportClientReleaseBuffer(pvbuffer: ConstPtr<CVoid>): UInt

public expect fun wdsTransportClientShutdown(): UInt

public expect fun wdsTransportClientStartSession(hsessionkey: Handle): UInt

public expect fun wdsTransportClientWaitForCompletion(hsessionkey: Handle, utimeout: UInt): UInt

public expect fun wdsTransportServerAllocateBuffer(hprovider: Handle, ulbuffersize: UInt): MutPtr<CVoid>

public expect fun wdsTransportServerCompleteRead(hprovider: Handle, ulbytesread: UInt, pvuserdata: ConstPtr<CVoid>, hreadresult: Hresult): Hresult

public expect fun wdsTransportServerFreeBuffer(hprovider: Handle, pvbuffer: ConstPtr<CVoid>): Hresult

public expect fun wdsTransportServerRegisterCallback(hprovider: Handle, callbackid: TransportproviderCallbackId, pfncallback: ConstPtr<CVoid>): Hresult

public expect fun wdsTransportServerTrace(hprovider: Handle, severity: UInt, pwszformat: Pcwstr, vararg variadicArgs: Long): Hresult

public expect fun wdsTransportServerTraceV(hprovider: Handle, severity: UInt, pwszformat: Pcwstr, params: ConstPtr<Byte>): Hresult
