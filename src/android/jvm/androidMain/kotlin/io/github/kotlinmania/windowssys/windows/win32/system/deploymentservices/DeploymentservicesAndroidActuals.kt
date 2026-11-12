@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32SystemDeploymentservicesJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesPxeAsyncRecvDone(hclientrequest: Long, action: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesPxeDhcpAppendOption(preplypacket: Long, umaxreplypacketlen: Int, pureplypacketlen: Long, boption: Byte, boptionlen: Byte, pvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesPxeDhcpAppendOptionRaw(preplypacket: Long, umaxreplypacketlen: Int, pureplypacketlen: Long, ubufferlen: Short, pbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesPxeDhcpGetOptionValue(ppacket: Long, upacketlen: Int, uinstance: Int, boption: Byte, pboptionlen: Long, ppoptionvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesPxeDhcpGetVendorOptionValue(ppacket: Long, upacketlen: Int, boption: Byte, uinstance: Int, pboptionlen: Long, ppoptionvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesPxeDhcpInitialize(precvpacket: Long, urecvpacketlen: Int, preplypacket: Long, umaxreplypacketlen: Int, pureplypacketlen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesPxeDhcpIsValid(ppacket: Long, upacketlen: Int, brequestpacket: Int, pbpxeoptionpresent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6AppendOption(preply: Long, cbreply: Int, pcbreplyused: Long, woptiontype: Short, cboption: Short, poption: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6AppendOptionRaw(preply: Long, cbreply: Int, pcbreplyused: Long, cbbuffer: Short, pbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6CreateRelayRepl(prelaymessages: Long, nrelaymessages: Int, pinnerpacket: Long, cbinnerpacket: Int, preplybuffer: Long, cbreplybuffer: Int, pcbreplybuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6GetOptionValue(ppacket: Long, upacketlen: Int, uinstance: Int, woption: Short, pwoptionlen: Long, ppoptionvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6GetVendorOptionValue(ppacket: Long, upacketlen: Int, dwenterprisenumber: Int, woption: Short, uinstance: Int, pwoptionlen: Long, ppoptionvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6Initialize(prequest: Long, cbrequest: Int, preply: Long, cbreply: Int, pcbreplyused: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6IsValid(ppacket: Long, upacketlen: Int, brequestpacket: Int, pbpxeoptionpresent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6ParseRelayForw(prelayforwpacket: Long, urelayforwpacketlen: Int, prelaymessages: Long, nrelaymessages: Int, pnrelaymessages: Long, ppinnerpacket: Long, pcbinnerpacket: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesPxeGetServerInfo(uinfotype: Int, pbuffer: Long, ubufferlen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesPxeGetServerInfoEx(uinfotype: Int, pbuffer: Long, ubufferlen: Int, pubufferused: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesPxePacketAllocate(hprovider: Long, hclientrequest: Long, usize: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesPxePacketFree(hprovider: Long, hclientrequest: Long, ppacket: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesPxeProviderEnumClose(henum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesPxeProviderEnumFirst(phenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesPxeProviderEnumNext(henum: Long, ppprovider: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesPxeProviderFreeInfo(pprovider: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesPxeProviderQueryIndex(pszprovidername: Long, puindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesPxeProviderRegister(pszprovidername: Long, pszmodulepath: Long, index: Int, biscritical: Int, phproviderkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesPxeProviderSetAttribute(hprovider: Long, attribute: Int, pparameterbuffer: Long, uparamlen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesPxeProviderUnRegister(pszprovidername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesPxeRegisterCallback(hprovider: Long, callbacktype: Int, pcallbackfunction: Long, pcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesPxeSendReply(hclientrequest: Long, ppacket: Long, upacketlen: Int, paddress: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesPxeTrace(hprovider: Long, severity: Int, pszformat: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesPxeTraceV(hprovider: Long, severity: Int, pszformat: Long, params: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsBpAddOption(hhandle: Long, uoption: Int, uvaluelen: Int, pvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsBpCloseHandle(hhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsBpGetOptionBuffer(hhandle: Long, ubufferlen: Int, pbuffer: Long, pubytes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsBpInitialize(bpackettype: Byte, phhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsBpParseInitialize(ppacket: Long, upacketlen: Int, pbpackettype: Long, phhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsBpParseInitializev6(ppacket: Long, upacketlen: Int, pbpackettype: Long, phhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsBpQueryOption(hhandle: Long, uoption: Int, uvaluelen: Int, pvalue: Long, pubytes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsCliAuthorizeSession(hsession: Long, pcred: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsCliCancelTransfer(htransfer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsCliClose(handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsCliCreateSession(pwszserver: Long, pcred: Long, phsession: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsCliFindFirstImage(hsession: Long, phfindhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsCliFindNextImage(handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsCliFreeStringArray(ppwszarray: Long, ulcount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsCliGetDriverQueryXml(pwszwindirpath: Long, ppwszdriverquery: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsCliGetEnumerationFlags(handle: Long, pdwflags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageArchitecture(hifh: Long, pdwvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageDescription(hifh: Long, ppwszvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageFiles(hifh: Long, pppwszfiles: Long, pdwcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageGroup(hifh: Long, ppwszvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageHalName(hifh: Long, ppwszvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageHandleFromFindHandle(findhandle: Long, phimagehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageHandleFromTransferHandle(htransfer: Long, phimagehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageIndex(hifh: Long, pdwvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageLanguage(hifh: Long, ppwszvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageLanguages(hifh: Long, pppszvalues: Long, pdwnumvalues: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageLastModifiedTime(hifh: Long, ppsystimevalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageName(hifh: Long, ppwszvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageNamespace(hifh: Long, ppwszvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageParameter(hifh: Long, paramtype: Int, presponse: Long, uresponselen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImagePath(hifh: Long, ppwszvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageSize(hifh: Long, pullvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageType(hifh: Long, pimagetype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageVersion(hifh: Long, ppwszvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsCliGetTransferSize(hifh: Long, pullvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsCliInitializeLog(hsession: Long, ulclientarchitecture: Int, pwszclientid: Long, pwszclientaddress: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsCliLog(hsession: Long, ulloglevel: Int, ulmessagecode: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsCliObtainDriverPackages(himage: Long, ppwszservername: Long, pppwszdriverpackages: Long, pulcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsCliObtainDriverPackagesEx(hsession: Long, pwszmachineinfo: Long, ppwszservername: Long, pppwszdriverpackages: Long, pulcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsCliRegisterTrace(pfn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsCliSetTransferBufferSize(ulsizeinbytes: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsCliTransferFile(pwszserver: Long, pwsznamespace: Long, pwszremotefilepath: Long, pwszlocalfilepath: Long, dwflags: Int, dwreserved: Int, pfnwdsclicallback: Long, pvuserdata: Long, phtransfer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsCliTransferImage(himage: Long, pwszlocalpath: Long, dwflags: Int, dwreserved: Int, pfnwdsclicallback: Long, pvuserdata: Long, phtransfer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsCliWaitForTransfer(htransfer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientAddRefBuffer(pvbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCancelSession(hsessionkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCancelSessionEx(hsessionkey: Long, dwerrorcode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCloseSession(hsessionkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCompleteReceive(hsessionkey: Long, ulsize: Int, pulloffset: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientInitialize(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientInitializeSession(psessionrequest: Long, pcallerdata: Long, hsessionkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientQueryStatus(hsessionkey: Long, pustatus: Long, puerrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientRegisterCallback(hsessionkey: Long, callbackid: Int, pfncallback: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientReleaseBuffer(pvbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientShutdown(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientStartSession(hsessionkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientWaitForCompletion(hsessionkey: Long, utimeout: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerAllocateBuffer(hprovider: Long, ulbuffersize: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerCompleteRead(hprovider: Long, ulbytesread: Int, pvuserdata: Long, hreadresult: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerFreeBuffer(hprovider: Long, pvbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerRegisterCallback(hprovider: Long, callbackid: Int, pfncallback: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerTrace(hprovider: Long, severity: Int, pwszformat: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerTraceV(hprovider: Long, severity: Int, pwszformat: Long, params: Long): Int
}

public actual fun pxeAsyncRecvDone(hclientrequest: Handle, action: UInt): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesPxeAsyncRecvDone(hclientrequest.rawAddress, action.toInt()).toUInt()

public actual fun pxeDhcpAppendOption(preplypacket: MutPtr<CVoid>, umaxreplypacketlen: UInt, pureplypacketlen: MutPtr<UInt>, boption: UByte, boptionlen: UByte, pvalue: ConstPtr<CVoid>): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpAppendOption(preplypacket.rawAddress, umaxreplypacketlen.toInt(), pureplypacketlen.rawAddress, boption.toByte(), boptionlen.toByte(), pvalue.rawAddress).toUInt()

public actual fun pxeDhcpAppendOptionRaw(preplypacket: MutPtr<CVoid>, umaxreplypacketlen: UInt, pureplypacketlen: MutPtr<UInt>, ubufferlen: UShort, pbuffer: ConstPtr<CVoid>): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpAppendOptionRaw(preplypacket.rawAddress, umaxreplypacketlen.toInt(), pureplypacketlen.rawAddress, ubufferlen.toShort(), pbuffer.rawAddress).toUInt()

public actual fun pxeDhcpGetOptionValue(ppacket: ConstPtr<CVoid>, upacketlen: UInt, uinstance: UInt, boption: UByte, pboptionlen: MutPtr<UByte>, ppoptionvalue: MutPtr<MutPtr<CVoid>>): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpGetOptionValue(ppacket.rawAddress, upacketlen.toInt(), uinstance.toInt(), boption.toByte(), pboptionlen.rawAddress, ppoptionvalue.rawAddress).toUInt()

public actual fun pxeDhcpGetVendorOptionValue(ppacket: ConstPtr<CVoid>, upacketlen: UInt, boption: UByte, uinstance: UInt, pboptionlen: MutPtr<UByte>, ppoptionvalue: MutPtr<MutPtr<CVoid>>): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpGetVendorOptionValue(ppacket.rawAddress, upacketlen.toInt(), boption.toByte(), uinstance.toInt(), pboptionlen.rawAddress, ppoptionvalue.rawAddress).toUInt()

public actual fun pxeDhcpInitialize(precvpacket: ConstPtr<CVoid>, urecvpacketlen: UInt, preplypacket: MutPtr<CVoid>, umaxreplypacketlen: UInt, pureplypacketlen: MutPtr<UInt>): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpInitialize(precvpacket.rawAddress, urecvpacketlen.toInt(), preplypacket.rawAddress, umaxreplypacketlen.toInt(), pureplypacketlen.rawAddress).toUInt()

public actual fun pxeDhcpIsValid(ppacket: ConstPtr<CVoid>, upacketlen: UInt, brequestpacket: Bool, pbpxeoptionpresent: MutPtr<Bool>): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpIsValid(ppacket.rawAddress, upacketlen.toInt(), brequestpacket, pbpxeoptionpresent.rawAddress).toUInt()

public actual fun pxeDhcpv6AppendOption(preply: MutPtr<CVoid>, cbreply: UInt, pcbreplyused: MutPtr<UInt>, woptiontype: UShort, cboption: UShort, poption: ConstPtr<CVoid>): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6AppendOption(preply.rawAddress, cbreply.toInt(), pcbreplyused.rawAddress, woptiontype.toShort(), cboption.toShort(), poption.rawAddress).toUInt()

public actual fun pxeDhcpv6AppendOptionRaw(preply: MutPtr<CVoid>, cbreply: UInt, pcbreplyused: MutPtr<UInt>, cbbuffer: UShort, pbuffer: ConstPtr<CVoid>): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6AppendOptionRaw(preply.rawAddress, cbreply.toInt(), pcbreplyused.rawAddress, cbbuffer.toShort(), pbuffer.rawAddress).toUInt()

public actual fun pxeDhcpv6CreateRelayRepl(prelaymessages: ConstPtr<PxeDhcpv6NestedRelayMessage>, nrelaymessages: UInt, pinnerpacket: ConstPtr<UByte>, cbinnerpacket: UInt, preplybuffer: MutPtr<CVoid>, cbreplybuffer: UInt, pcbreplybuffer: MutPtr<UInt>): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6CreateRelayRepl(prelaymessages.rawAddress, nrelaymessages.toInt(), pinnerpacket.rawAddress, cbinnerpacket.toInt(), preplybuffer.rawAddress, cbreplybuffer.toInt(), pcbreplybuffer.rawAddress).toUInt()

public actual fun pxeDhcpv6GetOptionValue(ppacket: ConstPtr<CVoid>, upacketlen: UInt, uinstance: UInt, woption: UShort, pwoptionlen: MutPtr<UShort>, ppoptionvalue: MutPtr<MutPtr<CVoid>>): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6GetOptionValue(ppacket.rawAddress, upacketlen.toInt(), uinstance.toInt(), woption.toShort(), pwoptionlen.rawAddress, ppoptionvalue.rawAddress).toUInt()

public actual fun pxeDhcpv6GetVendorOptionValue(ppacket: ConstPtr<CVoid>, upacketlen: UInt, dwenterprisenumber: UInt, woption: UShort, uinstance: UInt, pwoptionlen: MutPtr<UShort>, ppoptionvalue: MutPtr<MutPtr<CVoid>>): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6GetVendorOptionValue(ppacket.rawAddress, upacketlen.toInt(), dwenterprisenumber.toInt(), woption.toShort(), uinstance.toInt(), pwoptionlen.rawAddress, ppoptionvalue.rawAddress).toUInt()

public actual fun pxeDhcpv6Initialize(prequest: ConstPtr<CVoid>, cbrequest: UInt, preply: MutPtr<CVoid>, cbreply: UInt, pcbreplyused: MutPtr<UInt>): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6Initialize(prequest.rawAddress, cbrequest.toInt(), preply.rawAddress, cbreply.toInt(), pcbreplyused.rawAddress).toUInt()

public actual fun pxeDhcpv6IsValid(ppacket: ConstPtr<CVoid>, upacketlen: UInt, brequestpacket: Bool, pbpxeoptionpresent: MutPtr<Bool>): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6IsValid(ppacket.rawAddress, upacketlen.toInt(), brequestpacket, pbpxeoptionpresent.rawAddress).toUInt()

public actual fun pxeDhcpv6ParseRelayForw(prelayforwpacket: ConstPtr<CVoid>, urelayforwpacketlen: UInt, prelaymessages: MutPtr<PxeDhcpv6NestedRelayMessage>, nrelaymessages: UInt, pnrelaymessages: MutPtr<UInt>, ppinnerpacket: MutPtr<MutPtr<UByte>>, pcbinnerpacket: MutPtr<UInt>): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6ParseRelayForw(prelayforwpacket.rawAddress, urelayforwpacketlen.toInt(), prelaymessages.rawAddress, nrelaymessages.toInt(), pnrelaymessages.rawAddress, ppinnerpacket.rawAddress, pcbinnerpacket.rawAddress).toUInt()

public actual fun pxeGetServerInfo(uinfotype: UInt, pbuffer: MutPtr<CVoid>, ubufferlen: UInt): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesPxeGetServerInfo(uinfotype.toInt(), pbuffer.rawAddress, ubufferlen.toInt()).toUInt()

public actual fun pxeGetServerInfoEx(uinfotype: UInt, pbuffer: MutPtr<CVoid>, ubufferlen: UInt, pubufferused: MutPtr<UInt>): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesPxeGetServerInfoEx(uinfotype.toInt(), pbuffer.rawAddress, ubufferlen.toInt(), pubufferused.rawAddress).toUInt()

public actual fun pxePacketAllocate(hprovider: Handle, hclientrequest: Handle, usize: UInt): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesPxePacketAllocate(hprovider.rawAddress, hclientrequest.rawAddress, usize.toInt()))

public actual fun pxePacketFree(hprovider: Handle, hclientrequest: Handle, ppacket: ConstPtr<CVoid>): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesPxePacketFree(hprovider.rawAddress, hclientrequest.rawAddress, ppacket.rawAddress).toUInt()

public actual fun pxeProviderEnumClose(henum: Handle): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesPxeProviderEnumClose(henum.rawAddress).toUInt()

public actual fun pxeProviderEnumFirst(phenum: MutPtr<Handle>): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesPxeProviderEnumFirst(phenum.rawAddress).toUInt()

public actual fun pxeProviderEnumNext(henum: Handle, ppprovider: MutPtr<MutPtr<PxeProvider>>): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesPxeProviderEnumNext(henum.rawAddress, ppprovider.rawAddress).toUInt()

public actual fun pxeProviderFreeInfo(pprovider: ConstPtr<PxeProvider>): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesPxeProviderFreeInfo(pprovider.rawAddress).toUInt()

public actual fun pxeProviderQueryIndex(pszprovidername: Pcwstr, puindex: MutPtr<UInt>): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesPxeProviderQueryIndex(pszprovidername.rawAddress, puindex.rawAddress).toUInt()

public actual fun pxeProviderRegister(pszprovidername: Pcwstr, pszmodulepath: Pcwstr, index: UInt, biscritical: Bool, phproviderkey: MutPtr<Hkey>): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesPxeProviderRegister(pszprovidername.rawAddress, pszmodulepath.rawAddress, index.toInt(), biscritical, phproviderkey.rawAddress).toUInt()

public actual fun pxeProviderSetAttribute(hprovider: Handle, attribute: UInt, pparameterbuffer: ConstPtr<CVoid>, uparamlen: UInt): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesPxeProviderSetAttribute(hprovider.rawAddress, attribute.toInt(), pparameterbuffer.rawAddress, uparamlen.toInt()).toUInt()

public actual fun pxeProviderUnRegister(pszprovidername: Pcwstr): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesPxeProviderUnRegister(pszprovidername.rawAddress).toUInt()

public actual fun pxeRegisterCallback(hprovider: Handle, callbacktype: UInt, pcallbackfunction: ConstPtr<CVoid>, pcontext: ConstPtr<CVoid>): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesPxeRegisterCallback(hprovider.rawAddress, callbacktype.toInt(), pcallbackfunction.rawAddress, pcontext.rawAddress).toUInt()

public actual fun pxeSendReply(hclientrequest: Handle, ppacket: ConstPtr<CVoid>, upacketlen: UInt, paddress: ConstPtr<PxeAddress>): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesPxeSendReply(hclientrequest.rawAddress, ppacket.rawAddress, upacketlen.toInt(), paddress.rawAddress).toUInt()

public actual fun pxeTrace(hprovider: Handle, severity: UInt, pszformat: Pcwstr, vararg variadicArgs: Long): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesPxeTrace(hprovider.rawAddress, severity.toInt(), pszformat.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).toUInt()

public actual fun pxeTraceV(hprovider: Handle, severity: UInt, pszformat: Pcwstr, params: ConstPtr<Byte>): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesPxeTraceV(hprovider.rawAddress, severity.toInt(), pszformat.rawAddress, params.rawAddress).toUInt()

public actual fun wdsBpAddOption(hhandle: Handle, uoption: UInt, uvaluelen: UInt, pvalue: ConstPtr<CVoid>): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsBpAddOption(hhandle.rawAddress, uoption.toInt(), uvaluelen.toInt(), pvalue.rawAddress).toUInt()

public actual fun wdsBpCloseHandle(hhandle: Handle): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsBpCloseHandle(hhandle.rawAddress).toUInt()

public actual fun wdsBpGetOptionBuffer(hhandle: Handle, ubufferlen: UInt, pbuffer: MutPtr<CVoid>, pubytes: MutPtr<UInt>): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsBpGetOptionBuffer(hhandle.rawAddress, ubufferlen.toInt(), pbuffer.rawAddress, pubytes.rawAddress).toUInt()

public actual fun wdsBpInitialize(bpackettype: UByte, phhandle: MutPtr<Handle>): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsBpInitialize(bpackettype.toByte(), phhandle.rawAddress).toUInt()

public actual fun wdsBpParseInitialize(ppacket: ConstPtr<CVoid>, upacketlen: UInt, pbpackettype: MutPtr<UByte>, phhandle: MutPtr<Handle>): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsBpParseInitialize(ppacket.rawAddress, upacketlen.toInt(), pbpackettype.rawAddress, phhandle.rawAddress).toUInt()

public actual fun wdsBpParseInitializev6(ppacket: ConstPtr<CVoid>, upacketlen: UInt, pbpackettype: MutPtr<UByte>, phhandle: MutPtr<Handle>): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsBpParseInitializev6(ppacket.rawAddress, upacketlen.toInt(), pbpackettype.rawAddress, phhandle.rawAddress).toUInt()

public actual fun wdsBpQueryOption(hhandle: Handle, uoption: UInt, uvaluelen: UInt, pvalue: MutPtr<CVoid>, pubytes: MutPtr<UInt>): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsBpQueryOption(hhandle.rawAddress, uoption.toInt(), uvaluelen.toInt(), pvalue.rawAddress, pubytes.rawAddress).toUInt()

public actual fun wdsCliAuthorizeSession(hsession: Handle, pcred: ConstPtr<WdsCliCred>): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsCliAuthorizeSession(hsession.rawAddress, pcred.rawAddress)

public actual fun wdsCliCancelTransfer(htransfer: Handle): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsCliCancelTransfer(htransfer.rawAddress)

public actual fun wdsCliClose(handle: Handle): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsCliClose(handle.rawAddress)

public actual fun wdsCliCreateSession(pwszserver: Pcwstr, pcred: ConstPtr<WdsCliCred>, phsession: MutPtr<Handle>): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsCliCreateSession(pwszserver.rawAddress, pcred.rawAddress, phsession.rawAddress)

public actual fun wdsCliFindFirstImage(hsession: Handle, phfindhandle: MutPtr<Handle>): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsCliFindFirstImage(hsession.rawAddress, phfindhandle.rawAddress)

public actual fun wdsCliFindNextImage(handle: Handle): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsCliFindNextImage(handle.rawAddress)

public actual fun wdsCliFreeStringArray(ppwszarray: MutPtr<Pwstr>, ulcount: UInt): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsCliFreeStringArray(ppwszarray.rawAddress, ulcount.toInt())

public actual fun wdsCliGetDriverQueryXml(pwszwindirpath: Pcwstr, ppwszdriverquery: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetDriverQueryXml(pwszwindirpath.rawAddress, ppwszdriverquery.rawAddress)

public actual fun wdsCliGetEnumerationFlags(handle: Handle, pdwflags: MutPtr<UInt>): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetEnumerationFlags(handle.rawAddress, pdwflags.rawAddress)

public actual fun wdsCliGetImageArchitecture(hifh: Handle, pdwvalue: MutPtr<CpuArchitecture>): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageArchitecture(hifh.rawAddress, pdwvalue.rawAddress)

public actual fun wdsCliGetImageDescription(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageDescription(hifh.rawAddress, ppwszvalue.rawAddress)

public actual fun wdsCliGetImageFiles(hifh: Handle, pppwszfiles: MutPtr<MutPtr<Pwstr>>, pdwcount: MutPtr<UInt>): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageFiles(hifh.rawAddress, pppwszfiles.rawAddress, pdwcount.rawAddress)

public actual fun wdsCliGetImageGroup(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageGroup(hifh.rawAddress, ppwszvalue.rawAddress)

public actual fun wdsCliGetImageHalName(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageHalName(hifh.rawAddress, ppwszvalue.rawAddress)

public actual fun wdsCliGetImageHandleFromFindHandle(findhandle: Handle, phimagehandle: MutPtr<Handle>): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageHandleFromFindHandle(findhandle.rawAddress, phimagehandle.rawAddress)

public actual fun wdsCliGetImageHandleFromTransferHandle(htransfer: Handle, phimagehandle: MutPtr<Handle>): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageHandleFromTransferHandle(htransfer.rawAddress, phimagehandle.rawAddress)

public actual fun wdsCliGetImageIndex(hifh: Handle, pdwvalue: MutPtr<UInt>): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageIndex(hifh.rawAddress, pdwvalue.rawAddress)

public actual fun wdsCliGetImageLanguage(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageLanguage(hifh.rawAddress, ppwszvalue.rawAddress)

public actual fun wdsCliGetImageLanguages(hifh: Handle, pppszvalues: MutPtr<MutPtr<MutPtr<Byte>>>, pdwnumvalues: MutPtr<UInt>): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageLanguages(hifh.rawAddress, pppszvalues.rawAddress, pdwnumvalues.rawAddress)

public actual fun wdsCliGetImageLastModifiedTime(hifh: Handle, ppsystimevalue: MutPtr<MutPtr<Systemtime>>): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageLastModifiedTime(hifh.rawAddress, ppsystimevalue.rawAddress)

public actual fun wdsCliGetImageName(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageName(hifh.rawAddress, ppwszvalue.rawAddress)

public actual fun wdsCliGetImageNamespace(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageNamespace(hifh.rawAddress, ppwszvalue.rawAddress)

public actual fun wdsCliGetImageParameter(hifh: Handle, paramtype: WdsCliImageParamType, presponse: MutPtr<CVoid>, uresponselen: UInt): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageParameter(hifh.rawAddress, paramtype, presponse.rawAddress, uresponselen.toInt())

public actual fun wdsCliGetImagePath(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImagePath(hifh.rawAddress, ppwszvalue.rawAddress)

public actual fun wdsCliGetImageSize(hifh: Handle, pullvalue: MutPtr<ULong>): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageSize(hifh.rawAddress, pullvalue.rawAddress)

public actual fun wdsCliGetImageType(hifh: Handle, pimagetype: MutPtr<WdsCliImageType>): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageType(hifh.rawAddress, pimagetype.rawAddress)

public actual fun wdsCliGetImageVersion(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageVersion(hifh.rawAddress, ppwszvalue.rawAddress)

public actual fun wdsCliGetTransferSize(hifh: Handle, pullvalue: MutPtr<ULong>): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetTransferSize(hifh.rawAddress, pullvalue.rawAddress)

public actual fun wdsCliInitializeLog(hsession: Handle, ulclientarchitecture: CpuArchitecture, pwszclientid: Pcwstr, pwszclientaddress: Pcwstr): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsCliInitializeLog(hsession.rawAddress, ulclientarchitecture.toInt(), pwszclientid.rawAddress, pwszclientaddress.rawAddress)

public actual fun wdsCliLog(hsession: Handle, ulloglevel: UInt, ulmessagecode: UInt, vararg variadicArgs: Long): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsCliLog(hsession.rawAddress, ulloglevel.toInt(), ulmessagecode.toInt(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun wdsCliObtainDriverPackages(himage: Handle, ppwszservername: MutPtr<Pwstr>, pppwszdriverpackages: MutPtr<MutPtr<Pwstr>>, pulcount: MutPtr<UInt>): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsCliObtainDriverPackages(himage.rawAddress, ppwszservername.rawAddress, pppwszdriverpackages.rawAddress, pulcount.rawAddress)

public actual fun wdsCliObtainDriverPackagesEx(hsession: Handle, pwszmachineinfo: Pcwstr, ppwszservername: MutPtr<Pwstr>, pppwszdriverpackages: MutPtr<MutPtr<Pwstr>>, pulcount: MutPtr<UInt>): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsCliObtainDriverPackagesEx(hsession.rawAddress, pwszmachineinfo.rawAddress, ppwszservername.rawAddress, pppwszdriverpackages.rawAddress, pulcount.rawAddress)

public actual fun wdsCliRegisterTrace(pfn: PfnWdsCliTraceFunction): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsCliRegisterTrace(0L)

public actual fun wdsCliSetTransferBufferSize(ulsizeinbytes: UInt) {
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsCliSetTransferBufferSize(ulsizeinbytes.toInt())
}

public actual fun wdsCliTransferFile(pwszserver: Pcwstr, pwsznamespace: Pcwstr, pwszremotefilepath: Pcwstr, pwszlocalfilepath: Pcwstr, dwflags: UInt, dwreserved: UInt, pfnwdsclicallback: PfnWdsCliCallback, pvuserdata: ConstPtr<CVoid>, phtransfer: MutPtr<Handle>): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsCliTransferFile(pwszserver.rawAddress, pwsznamespace.rawAddress, pwszremotefilepath.rawAddress, pwszlocalfilepath.rawAddress, dwflags.toInt(), dwreserved.toInt(), 0L, pvuserdata.rawAddress, phtransfer.rawAddress)

public actual fun wdsCliTransferImage(himage: Handle, pwszlocalpath: Pcwstr, dwflags: UInt, dwreserved: UInt, pfnwdsclicallback: PfnWdsCliCallback, pvuserdata: ConstPtr<CVoid>, phtransfer: MutPtr<Handle>): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsCliTransferImage(himage.rawAddress, pwszlocalpath.rawAddress, dwflags.toInt(), dwreserved.toInt(), 0L, pvuserdata.rawAddress, phtransfer.rawAddress)

public actual fun wdsCliWaitForTransfer(htransfer: Handle): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsCliWaitForTransfer(htransfer.rawAddress)

public actual fun wdsTransportClientAddRefBuffer(pvbuffer: ConstPtr<CVoid>): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientAddRefBuffer(pvbuffer.rawAddress).toUInt()

public actual fun wdsTransportClientCancelSession(hsessionkey: Handle): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCancelSession(hsessionkey.rawAddress).toUInt()

public actual fun wdsTransportClientCancelSessionEx(hsessionkey: Handle, dwerrorcode: UInt): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCancelSessionEx(hsessionkey.rawAddress, dwerrorcode.toInt()).toUInt()

public actual fun wdsTransportClientCloseSession(hsessionkey: Handle): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCloseSession(hsessionkey.rawAddress).toUInt()

public actual fun wdsTransportClientCompleteReceive(hsessionkey: Handle, ulsize: UInt, pulloffset: ConstPtr<ULong>): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCompleteReceive(hsessionkey.rawAddress, ulsize.toInt(), pulloffset.rawAddress).toUInt()

public actual fun wdsTransportClientInitialize(): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientInitialize().toUInt()

public actual fun wdsTransportClientInitializeSession(psessionrequest: ConstPtr<WdsTransportclientRequest>, pcallerdata: ConstPtr<CVoid>, hsessionkey: MutPtr<Handle>): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientInitializeSession(psessionrequest.rawAddress, pcallerdata.rawAddress, hsessionkey.rawAddress).toUInt()

public actual fun wdsTransportClientQueryStatus(hsessionkey: Handle, pustatus: MutPtr<UInt>, puerrorcode: MutPtr<UInt>): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientQueryStatus(hsessionkey.rawAddress, pustatus.rawAddress, puerrorcode.rawAddress).toUInt()

public actual fun wdsTransportClientRegisterCallback(hsessionkey: Handle, callbackid: TransportclientCallbackId, pfncallback: ConstPtr<CVoid>): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientRegisterCallback(hsessionkey.rawAddress, callbackid, pfncallback.rawAddress).toUInt()

public actual fun wdsTransportClientReleaseBuffer(pvbuffer: ConstPtr<CVoid>): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientReleaseBuffer(pvbuffer.rawAddress).toUInt()

public actual fun wdsTransportClientShutdown(): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientShutdown().toUInt()

public actual fun wdsTransportClientStartSession(hsessionkey: Handle): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientStartSession(hsessionkey.rawAddress).toUInt()

public actual fun wdsTransportClientWaitForCompletion(hsessionkey: Handle, utimeout: UInt): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientWaitForCompletion(hsessionkey.rawAddress, utimeout.toInt()).toUInt()

public actual fun wdsTransportServerAllocateBuffer(hprovider: Handle, ulbuffersize: UInt): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerAllocateBuffer(hprovider.rawAddress, ulbuffersize.toInt()))

public actual fun wdsTransportServerCompleteRead(hprovider: Handle, ulbytesread: UInt, pvuserdata: ConstPtr<CVoid>, hreadresult: Hresult): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerCompleteRead(hprovider.rawAddress, ulbytesread.toInt(), pvuserdata.rawAddress, hreadresult)

public actual fun wdsTransportServerFreeBuffer(hprovider: Handle, pvbuffer: ConstPtr<CVoid>): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerFreeBuffer(hprovider.rawAddress, pvbuffer.rawAddress)

public actual fun wdsTransportServerRegisterCallback(hprovider: Handle, callbackid: TransportproviderCallbackId, pfncallback: ConstPtr<CVoid>): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerRegisterCallback(hprovider.rawAddress, callbackid, pfncallback.rawAddress)

public actual fun wdsTransportServerTrace(hprovider: Handle, severity: UInt, pwszformat: Pcwstr, vararg variadicArgs: Long): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerTrace(hprovider.rawAddress, severity.toInt(), pwszformat.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun wdsTransportServerTraceV(hprovider: Handle, severity: UInt, pwszformat: Pcwstr, params: ConstPtr<Byte>): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerTraceV(hprovider.rawAddress, severity.toInt(), pwszformat.rawAddress, params.rawAddress)
