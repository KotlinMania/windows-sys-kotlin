@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private object WindowsWin32SystemDeploymentservicesJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_PxeAsyncRecvDone(hclientrequest: Long, action: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_PxeDhcpAppendOption(preplypacket: Long, umaxreplypacketlen: Int, pureplypacketlen: Long, boption: Byte, boptionlen: Byte, pvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_PxeDhcpAppendOptionRaw(preplypacket: Long, umaxreplypacketlen: Int, pureplypacketlen: Long, ubufferlen: Short, pbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_PxeDhcpGetOptionValue(ppacket: Long, upacketlen: Int, uinstance: Int, boption: Byte, pboptionlen: Long, ppoptionvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_PxeDhcpGetVendorOptionValue(ppacket: Long, upacketlen: Int, boption: Byte, uinstance: Int, pboptionlen: Long, ppoptionvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_PxeDhcpInitialize(precvpacket: Long, urecvpacketlen: Int, preplypacket: Long, umaxreplypacketlen: Int, pureplypacketlen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_PxeDhcpIsValid(ppacket: Long, upacketlen: Int, brequestpacket: Int, pbpxeoptionpresent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_PxeDhcpv6AppendOption(preply: Long, cbreply: Int, pcbreplyused: Long, woptiontype: Short, cboption: Short, poption: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_PxeDhcpv6AppendOptionRaw(preply: Long, cbreply: Int, pcbreplyused: Long, cbbuffer: Short, pbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_PxeDhcpv6CreateRelayRepl(prelaymessages: Long, nrelaymessages: Int, pinnerpacket: Long, cbinnerpacket: Int, preplybuffer: Long, cbreplybuffer: Int, pcbreplybuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_PxeDhcpv6GetOptionValue(ppacket: Long, upacketlen: Int, uinstance: Int, woption: Short, pwoptionlen: Long, ppoptionvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_PxeDhcpv6GetVendorOptionValue(ppacket: Long, upacketlen: Int, dwenterprisenumber: Int, woption: Short, uinstance: Int, pwoptionlen: Long, ppoptionvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_PxeDhcpv6Initialize(prequest: Long, cbrequest: Int, preply: Long, cbreply: Int, pcbreplyused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_PxeDhcpv6IsValid(ppacket: Long, upacketlen: Int, brequestpacket: Int, pbpxeoptionpresent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_PxeDhcpv6ParseRelayForw(prelayforwpacket: Long, urelayforwpacketlen: Int, prelaymessages: Long, nrelaymessages: Int, pnrelaymessages: Long, ppinnerpacket: Long, pcbinnerpacket: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_PxeGetServerInfo(uinfotype: Int, pbuffer: Long, ubufferlen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_PxeGetServerInfoEx(uinfotype: Int, pbuffer: Long, ubufferlen: Int, pubufferused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_PxePacketAllocate(hprovider: Long, hclientrequest: Long, usize: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_PxePacketFree(hprovider: Long, hclientrequest: Long, ppacket: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_PxeProviderEnumClose(henum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_PxeProviderEnumFirst(phenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_PxeProviderEnumNext(henum: Long, ppprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_PxeProviderFreeInfo(pprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_PxeProviderQueryIndex(pszprovidername: Long, puindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_PxeProviderRegister(pszprovidername: Long, pszmodulepath: Long, index: Int, biscritical: Int, phproviderkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_PxeProviderSetAttribute(hprovider: Long, attribute: Int, pparameterbuffer: Long, uparamlen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_PxeProviderUnRegister(pszprovidername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_PxeRegisterCallback(hprovider: Long, callbacktype: Int, pcallbackfunction: Long, pcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_PxeSendReply(hclientrequest: Long, ppacket: Long, upacketlen: Int, paddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_PxeTraceV(hprovider: Long, severity: Int, pszformat: Long, params: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsBpAddOption(hhandle: Long, uoption: Int, uvaluelen: Int, pvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsBpCloseHandle(hhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsBpGetOptionBuffer(hhandle: Long, ubufferlen: Int, pbuffer: Long, pubytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsBpInitialize(bpackettype: Byte, phhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsBpParseInitialize(ppacket: Long, upacketlen: Int, pbpackettype: Long, phhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsBpParseInitializev6(ppacket: Long, upacketlen: Int, pbpackettype: Long, phhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsBpQueryOption(hhandle: Long, uoption: Int, uvaluelen: Int, pvalue: Long, pubytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsCliAuthorizeSession(hsession: Long, pcred: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsCliCancelTransfer(htransfer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsCliClose(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsCliCreateSession(pwszserver: Long, pcred: Long, phsession: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsCliFindFirstImage(hsession: Long, phfindhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsCliFindNextImage(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsCliFreeStringArray(ppwszarray: Long, ulcount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsCliGetDriverQueryXml(pwszwindirpath: Long, ppwszdriverquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsCliGetEnumerationFlags(handle: Long, pdwflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsCliGetImageArchitecture(hifh: Long, pdwvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsCliGetImageDescription(hifh: Long, ppwszvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsCliGetImageFiles(hifh: Long, pppwszfiles: Long, pdwcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsCliGetImageGroup(hifh: Long, ppwszvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsCliGetImageHalName(hifh: Long, ppwszvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsCliGetImageHandleFromFindHandle(findhandle: Long, phimagehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsCliGetImageHandleFromTransferHandle(htransfer: Long, phimagehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsCliGetImageIndex(hifh: Long, pdwvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsCliGetImageLanguage(hifh: Long, ppwszvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsCliGetImageLanguages(hifh: Long, pppszvalues: Long, pdwnumvalues: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsCliGetImageLastModifiedTime(hifh: Long, ppsystimevalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsCliGetImageName(hifh: Long, ppwszvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsCliGetImageNamespace(hifh: Long, ppwszvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsCliGetImageParameter(hifh: Long, paramtype: Int, presponse: Long, uresponselen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsCliGetImagePath(hifh: Long, ppwszvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsCliGetImageSize(hifh: Long, pullvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsCliGetImageType(hifh: Long, pimagetype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsCliGetImageVersion(hifh: Long, ppwszvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsCliGetTransferSize(hifh: Long, pullvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsCliInitializeLog(hsession: Long, ulclientarchitecture: Int, pwszclientid: Long, pwszclientaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsCliObtainDriverPackages(himage: Long, ppwszservername: Long, pppwszdriverpackages: Long, pulcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsCliObtainDriverPackagesEx(hsession: Long, pwszmachineinfo: Long, ppwszservername: Long, pppwszdriverpackages: Long, pulcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsCliRegisterTrace(pfn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsCliSetTransferBufferSize(ulsizeinbytes: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsCliTransferFile(pwszserver: Long, pwsznamespace: Long, pwszremotefilepath: Long, pwszlocalfilepath: Long, dwflags: Int, dwreserved: Int, pfnwdsclicallback: Long, pvuserdata: Long, phtransfer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsCliTransferImage(himage: Long, pwszlocalpath: Long, dwflags: Int, dwreserved: Int, pfnwdsclicallback: Long, pvuserdata: Long, phtransfer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsCliWaitForTransfer(htransfer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsTransportClientAddRefBuffer(pvbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsTransportClientCancelSession(hsessionkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsTransportClientCancelSessionEx(hsessionkey: Long, dwerrorcode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsTransportClientCloseSession(hsessionkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsTransportClientCompleteReceive(hsessionkey: Long, ulsize: Int, pulloffset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsTransportClientInitialize(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsTransportClientInitializeSession(psessionrequest: Long, pcallerdata: Long, hsessionkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsTransportClientQueryStatus(hsessionkey: Long, pustatus: Long, puerrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsTransportClientRegisterCallback(hsessionkey: Long, callbackid: Int, pfncallback: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsTransportClientReleaseBuffer(pvbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsTransportClientShutdown(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsTransportClientStartSession(hsessionkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsTransportClientWaitForCompletion(hsessionkey: Long, utimeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsTransportServerAllocateBuffer(hprovider: Long, ulbuffersize: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsTransportServerCompleteRead(hprovider: Long, ulbytesread: Int, pvuserdata: Long, hreadresult: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsTransportServerFreeBuffer(hprovider: Long, pvbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsTransportServerRegisterCallback(hprovider: Long, callbackid: Int, pfncallback: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_WdsTransportServerTraceV(hprovider: Long, severity: Int, pwszformat: Long, params: Long): Int
}

public actual fun PxeAsyncRecvDone(hclientrequest: HANDLE, action: UInt): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_PxeAsyncRecvDone(hclientrequest, action.toInt()).toUInt()

public actual fun PxeDhcpAppendOption(preplypacket: Long, umaxreplypacketlen: UInt, pureplypacketlen: Long, boption: UByte, boptionlen: UByte, pvalue: Long): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_PxeDhcpAppendOption(preplypacket, umaxreplypacketlen.toInt(), pureplypacketlen, boption.toByte(), boptionlen.toByte(), pvalue).toUInt()

public actual fun PxeDhcpAppendOptionRaw(preplypacket: Long, umaxreplypacketlen: UInt, pureplypacketlen: Long, ubufferlen: UShort, pbuffer: Long): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_PxeDhcpAppendOptionRaw(preplypacket, umaxreplypacketlen.toInt(), pureplypacketlen, ubufferlen.toShort(), pbuffer).toUInt()

public actual fun PxeDhcpGetOptionValue(ppacket: Long, upacketlen: UInt, uinstance: UInt, boption: UByte, pboptionlen: Long, ppoptionvalue: Long): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_PxeDhcpGetOptionValue(ppacket, upacketlen.toInt(), uinstance.toInt(), boption.toByte(), pboptionlen, ppoptionvalue).toUInt()

public actual fun PxeDhcpGetVendorOptionValue(ppacket: Long, upacketlen: UInt, boption: UByte, uinstance: UInt, pboptionlen: Long, ppoptionvalue: Long): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_PxeDhcpGetVendorOptionValue(ppacket, upacketlen.toInt(), boption.toByte(), uinstance.toInt(), pboptionlen, ppoptionvalue).toUInt()

public actual fun PxeDhcpInitialize(precvpacket: Long, urecvpacketlen: UInt, preplypacket: Long, umaxreplypacketlen: UInt, pureplypacketlen: Long): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_PxeDhcpInitialize(precvpacket, urecvpacketlen.toInt(), preplypacket, umaxreplypacketlen.toInt(), pureplypacketlen).toUInt()

public actual fun PxeDhcpIsValid(ppacket: Long, upacketlen: UInt, brequestpacket: BOOL, pbpxeoptionpresent: Long): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_PxeDhcpIsValid(ppacket, upacketlen.toInt(), brequestpacket, pbpxeoptionpresent).toUInt()

public actual fun PxeDhcpv6AppendOption(preply: Long, cbreply: UInt, pcbreplyused: Long, woptiontype: UShort, cboption: UShort, poption: Long): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_PxeDhcpv6AppendOption(preply, cbreply.toInt(), pcbreplyused, woptiontype.toShort(), cboption.toShort(), poption).toUInt()

public actual fun PxeDhcpv6AppendOptionRaw(preply: Long, cbreply: UInt, pcbreplyused: Long, cbbuffer: UShort, pbuffer: Long): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_PxeDhcpv6AppendOptionRaw(preply, cbreply.toInt(), pcbreplyused, cbbuffer.toShort(), pbuffer).toUInt()

public actual fun PxeDhcpv6CreateRelayRepl(prelaymessages: Long, nrelaymessages: UInt, pinnerpacket: Long, cbinnerpacket: UInt, preplybuffer: Long, cbreplybuffer: UInt, pcbreplybuffer: Long): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_PxeDhcpv6CreateRelayRepl(prelaymessages, nrelaymessages.toInt(), pinnerpacket, cbinnerpacket.toInt(), preplybuffer, cbreplybuffer.toInt(), pcbreplybuffer).toUInt()

public actual fun PxeDhcpv6GetOptionValue(ppacket: Long, upacketlen: UInt, uinstance: UInt, woption: UShort, pwoptionlen: Long, ppoptionvalue: Long): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_PxeDhcpv6GetOptionValue(ppacket, upacketlen.toInt(), uinstance.toInt(), woption.toShort(), pwoptionlen, ppoptionvalue).toUInt()

public actual fun PxeDhcpv6GetVendorOptionValue(ppacket: Long, upacketlen: UInt, dwenterprisenumber: UInt, woption: UShort, uinstance: UInt, pwoptionlen: Long, ppoptionvalue: Long): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_PxeDhcpv6GetVendorOptionValue(ppacket, upacketlen.toInt(), dwenterprisenumber.toInt(), woption.toShort(), uinstance.toInt(), pwoptionlen, ppoptionvalue).toUInt()

public actual fun PxeDhcpv6Initialize(prequest: Long, cbrequest: UInt, preply: Long, cbreply: UInt, pcbreplyused: Long): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_PxeDhcpv6Initialize(prequest, cbrequest.toInt(), preply, cbreply.toInt(), pcbreplyused).toUInt()

public actual fun PxeDhcpv6IsValid(ppacket: Long, upacketlen: UInt, brequestpacket: BOOL, pbpxeoptionpresent: Long): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_PxeDhcpv6IsValid(ppacket, upacketlen.toInt(), brequestpacket, pbpxeoptionpresent).toUInt()

public actual fun PxeDhcpv6ParseRelayForw(prelayforwpacket: Long, urelayforwpacketlen: UInt, prelaymessages: Long, nrelaymessages: UInt, pnrelaymessages: Long, ppinnerpacket: Long, pcbinnerpacket: Long): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_PxeDhcpv6ParseRelayForw(prelayforwpacket, urelayforwpacketlen.toInt(), prelaymessages, nrelaymessages.toInt(), pnrelaymessages, ppinnerpacket, pcbinnerpacket).toUInt()

public actual fun PxeGetServerInfo(uinfotype: UInt, pbuffer: Long, ubufferlen: UInt): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_PxeGetServerInfo(uinfotype.toInt(), pbuffer, ubufferlen.toInt()).toUInt()

public actual fun PxeGetServerInfoEx(uinfotype: UInt, pbuffer: Long, ubufferlen: UInt, pubufferused: Long): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_PxeGetServerInfoEx(uinfotype.toInt(), pbuffer, ubufferlen.toInt(), pubufferused).toUInt()

public actual fun PxePacketAllocate(hprovider: HANDLE, hclientrequest: HANDLE, usize: UInt): Long =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_PxePacketAllocate(hprovider, hclientrequest, usize.toInt())

public actual fun PxePacketFree(hprovider: HANDLE, hclientrequest: HANDLE, ppacket: Long): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_PxePacketFree(hprovider, hclientrequest, ppacket).toUInt()

public actual fun PxeProviderEnumClose(henum: HANDLE): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_PxeProviderEnumClose(henum).toUInt()

public actual fun PxeProviderEnumFirst(phenum: Long): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_PxeProviderEnumFirst(phenum).toUInt()

public actual fun PxeProviderEnumNext(henum: HANDLE, ppprovider: Long): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_PxeProviderEnumNext(henum, ppprovider).toUInt()

public actual fun PxeProviderFreeInfo(pprovider: Long): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_PxeProviderFreeInfo(pprovider).toUInt()

public actual fun PxeProviderQueryIndex(pszprovidername: PCWSTR, puindex: Long): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_PxeProviderQueryIndex(pszprovidername, puindex).toUInt()

public actual fun PxeProviderRegister(pszprovidername: PCWSTR, pszmodulepath: PCWSTR, index: UInt, biscritical: BOOL, phproviderkey: Long): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_PxeProviderRegister(pszprovidername, pszmodulepath, index.toInt(), biscritical, phproviderkey).toUInt()

public actual fun PxeProviderSetAttribute(hprovider: HANDLE, attribute: UInt, pparameterbuffer: Long, uparamlen: UInt): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_PxeProviderSetAttribute(hprovider, attribute.toInt(), pparameterbuffer, uparamlen.toInt()).toUInt()

public actual fun PxeProviderUnRegister(pszprovidername: PCWSTR): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_PxeProviderUnRegister(pszprovidername).toUInt()

public actual fun PxeRegisterCallback(hprovider: HANDLE, callbacktype: UInt, pcallbackfunction: Long, pcontext: Long): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_PxeRegisterCallback(hprovider, callbacktype.toInt(), pcallbackfunction, pcontext).toUInt()

public actual fun PxeSendReply(hclientrequest: HANDLE, ppacket: Long, upacketlen: UInt, paddress: Long): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_PxeSendReply(hclientrequest, ppacket, upacketlen.toInt(), paddress).toUInt()

public actual fun PxeTrace(hprovider: HANDLE, severity: UInt, pszformat: PCWSTR): UInt =
    0u

public actual fun PxeTraceV(hprovider: HANDLE, severity: UInt, pszformat: PCWSTR, params: Long): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_PxeTraceV(hprovider, severity.toInt(), pszformat, params).toUInt()

public actual fun WdsBpAddOption(hhandle: HANDLE, uoption: UInt, uvaluelen: UInt, pvalue: Long): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsBpAddOption(hhandle, uoption.toInt(), uvaluelen.toInt(), pvalue).toUInt()

public actual fun WdsBpCloseHandle(hhandle: HANDLE): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsBpCloseHandle(hhandle).toUInt()

public actual fun WdsBpGetOptionBuffer(hhandle: HANDLE, ubufferlen: UInt, pbuffer: Long, pubytes: Long): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsBpGetOptionBuffer(hhandle, ubufferlen.toInt(), pbuffer, pubytes).toUInt()

public actual fun WdsBpInitialize(bpackettype: UByte, phhandle: Long): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsBpInitialize(bpackettype.toByte(), phhandle).toUInt()

public actual fun WdsBpParseInitialize(ppacket: Long, upacketlen: UInt, pbpackettype: Long, phhandle: Long): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsBpParseInitialize(ppacket, upacketlen.toInt(), pbpackettype, phhandle).toUInt()

public actual fun WdsBpParseInitializev6(ppacket: Long, upacketlen: UInt, pbpackettype: Long, phhandle: Long): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsBpParseInitializev6(ppacket, upacketlen.toInt(), pbpackettype, phhandle).toUInt()

public actual fun WdsBpQueryOption(hhandle: HANDLE, uoption: UInt, uvaluelen: UInt, pvalue: Long, pubytes: Long): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsBpQueryOption(hhandle, uoption.toInt(), uvaluelen.toInt(), pvalue, pubytes).toUInt()

public actual fun WdsCliAuthorizeSession(hsession: HANDLE, pcred: Long): HRESULT =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsCliAuthorizeSession(hsession, pcred)

public actual fun WdsCliCancelTransfer(htransfer: HANDLE): HRESULT =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsCliCancelTransfer(htransfer)

public actual fun WdsCliClose(handle: HANDLE): HRESULT =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsCliClose(handle)

public actual fun WdsCliCreateSession(pwszserver: PCWSTR, pcred: Long, phsession: Long): HRESULT =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsCliCreateSession(pwszserver, pcred, phsession)

public actual fun WdsCliFindFirstImage(hsession: HANDLE, phfindhandle: Long): HRESULT =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsCliFindFirstImage(hsession, phfindhandle)

public actual fun WdsCliFindNextImage(handle: HANDLE): HRESULT =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsCliFindNextImage(handle)

public actual fun WdsCliFreeStringArray(ppwszarray: Long, ulcount: UInt): HRESULT =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsCliFreeStringArray(ppwszarray, ulcount.toInt())

public actual fun WdsCliGetDriverQueryXml(pwszwindirpath: PCWSTR, ppwszdriverquery: Long): HRESULT =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsCliGetDriverQueryXml(pwszwindirpath, ppwszdriverquery)

public actual fun WdsCliGetEnumerationFlags(handle: HANDLE, pdwflags: Long): HRESULT =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsCliGetEnumerationFlags(handle, pdwflags)

public actual fun WdsCliGetImageArchitecture(hifh: HANDLE, pdwvalue: Long): HRESULT =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageArchitecture(hifh, pdwvalue)

public actual fun WdsCliGetImageDescription(hifh: HANDLE, ppwszvalue: Long): HRESULT =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageDescription(hifh, ppwszvalue)

public actual fun WdsCliGetImageFiles(hifh: HANDLE, pppwszfiles: Long, pdwcount: Long): HRESULT =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageFiles(hifh, pppwszfiles, pdwcount)

public actual fun WdsCliGetImageGroup(hifh: HANDLE, ppwszvalue: Long): HRESULT =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageGroup(hifh, ppwszvalue)

public actual fun WdsCliGetImageHalName(hifh: HANDLE, ppwszvalue: Long): HRESULT =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageHalName(hifh, ppwszvalue)

public actual fun WdsCliGetImageHandleFromFindHandle(findhandle: HANDLE, phimagehandle: Long): HRESULT =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageHandleFromFindHandle(findhandle, phimagehandle)

public actual fun WdsCliGetImageHandleFromTransferHandle(htransfer: HANDLE, phimagehandle: Long): HRESULT =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageHandleFromTransferHandle(htransfer, phimagehandle)

public actual fun WdsCliGetImageIndex(hifh: HANDLE, pdwvalue: Long): HRESULT =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageIndex(hifh, pdwvalue)

public actual fun WdsCliGetImageLanguage(hifh: HANDLE, ppwszvalue: Long): HRESULT =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageLanguage(hifh, ppwszvalue)

public actual fun WdsCliGetImageLanguages(hifh: HANDLE, pppszvalues: Long, pdwnumvalues: Long): HRESULT =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageLanguages(hifh, pppszvalues, pdwnumvalues)

public actual fun WdsCliGetImageLastModifiedTime(hifh: HANDLE, ppsystimevalue: Long): HRESULT =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageLastModifiedTime(hifh, ppsystimevalue)

public actual fun WdsCliGetImageName(hifh: HANDLE, ppwszvalue: Long): HRESULT =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageName(hifh, ppwszvalue)

public actual fun WdsCliGetImageNamespace(hifh: HANDLE, ppwszvalue: Long): HRESULT =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageNamespace(hifh, ppwszvalue)

public actual fun WdsCliGetImageParameter(hifh: HANDLE, paramtype: WDS_CLI_IMAGE_PARAM_TYPE, presponse: Long, uresponselen: UInt): HRESULT =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageParameter(hifh, paramtype, presponse, uresponselen.toInt())

public actual fun WdsCliGetImagePath(hifh: HANDLE, ppwszvalue: Long): HRESULT =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsCliGetImagePath(hifh, ppwszvalue)

public actual fun WdsCliGetImageSize(hifh: HANDLE, pullvalue: Long): HRESULT =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageSize(hifh, pullvalue)

public actual fun WdsCliGetImageType(hifh: HANDLE, pimagetype: Long): HRESULT =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageType(hifh, pimagetype)

public actual fun WdsCliGetImageVersion(hifh: HANDLE, ppwszvalue: Long): HRESULT =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageVersion(hifh, ppwszvalue)

public actual fun WdsCliGetTransferSize(hifh: HANDLE, pullvalue: Long): HRESULT =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsCliGetTransferSize(hifh, pullvalue)

public actual fun WdsCliInitializeLog(hsession: HANDLE, ulclientarchitecture: CPU_ARCHITECTURE, pwszclientid: PCWSTR, pwszclientaddress: PCWSTR): HRESULT =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsCliInitializeLog(hsession, ulclientarchitecture.toInt(), pwszclientid, pwszclientaddress)

public actual fun WdsCliLog(hsession: HANDLE, ulloglevel: UInt, ulmessagecode: UInt): HRESULT =
    0

public actual fun WdsCliObtainDriverPackages(himage: HANDLE, ppwszservername: Long, pppwszdriverpackages: Long, pulcount: Long): HRESULT =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsCliObtainDriverPackages(himage, ppwszservername, pppwszdriverpackages, pulcount)

public actual fun WdsCliObtainDriverPackagesEx(hsession: HANDLE, pwszmachineinfo: PCWSTR, ppwszservername: Long, pppwszdriverpackages: Long, pulcount: Long): HRESULT =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsCliObtainDriverPackagesEx(hsession, pwszmachineinfo, ppwszservername, pppwszdriverpackages, pulcount)

public actual fun WdsCliRegisterTrace(pfn: PFN_WdsCliTraceFunction): HRESULT =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsCliRegisterTrace(pfn.toLong())

public actual fun WdsCliSetTransferBufferSize(ulsizeinbytes: UInt) {
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsCliSetTransferBufferSize(ulsizeinbytes.toInt())
}

public actual fun WdsCliTransferFile(pwszserver: PCWSTR, pwsznamespace: PCWSTR, pwszremotefilepath: PCWSTR, pwszlocalfilepath: PCWSTR, dwflags: UInt, dwreserved: UInt, pfnwdsclicallback: PFN_WdsCliCallback, pvuserdata: Long, phtransfer: Long): HRESULT =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsCliTransferFile(pwszserver, pwsznamespace, pwszremotefilepath, pwszlocalfilepath, dwflags.toInt(), dwreserved.toInt(), pfnwdsclicallback.toLong(), pvuserdata, phtransfer)

public actual fun WdsCliTransferImage(himage: HANDLE, pwszlocalpath: PCWSTR, dwflags: UInt, dwreserved: UInt, pfnwdsclicallback: PFN_WdsCliCallback, pvuserdata: Long, phtransfer: Long): HRESULT =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsCliTransferImage(himage, pwszlocalpath, dwflags.toInt(), dwreserved.toInt(), pfnwdsclicallback.toLong(), pvuserdata, phtransfer)

public actual fun WdsCliWaitForTransfer(htransfer: HANDLE): HRESULT =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsCliWaitForTransfer(htransfer)

public actual fun WdsTransportClientAddRefBuffer(pvbuffer: Long): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsTransportClientAddRefBuffer(pvbuffer).toUInt()

public actual fun WdsTransportClientCancelSession(hsessionkey: HANDLE): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsTransportClientCancelSession(hsessionkey).toUInt()

public actual fun WdsTransportClientCancelSessionEx(hsessionkey: HANDLE, dwerrorcode: UInt): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsTransportClientCancelSessionEx(hsessionkey, dwerrorcode.toInt()).toUInt()

public actual fun WdsTransportClientCloseSession(hsessionkey: HANDLE): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsTransportClientCloseSession(hsessionkey).toUInt()

public actual fun WdsTransportClientCompleteReceive(hsessionkey: HANDLE, ulsize: UInt, pulloffset: Long): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsTransportClientCompleteReceive(hsessionkey, ulsize.toInt(), pulloffset).toUInt()

public actual fun WdsTransportClientInitialize(): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsTransportClientInitialize().toUInt()

public actual fun WdsTransportClientInitializeSession(psessionrequest: Long, pcallerdata: Long, hsessionkey: Long): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsTransportClientInitializeSession(psessionrequest, pcallerdata, hsessionkey).toUInt()

public actual fun WdsTransportClientQueryStatus(hsessionkey: HANDLE, pustatus: Long, puerrorcode: Long): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsTransportClientQueryStatus(hsessionkey, pustatus, puerrorcode).toUInt()

public actual fun WdsTransportClientRegisterCallback(hsessionkey: HANDLE, callbackid: TRANSPORTCLIENT_CALLBACK_ID, pfncallback: Long): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsTransportClientRegisterCallback(hsessionkey, callbackid, pfncallback).toUInt()

public actual fun WdsTransportClientReleaseBuffer(pvbuffer: Long): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsTransportClientReleaseBuffer(pvbuffer).toUInt()

public actual fun WdsTransportClientShutdown(): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsTransportClientShutdown().toUInt()

public actual fun WdsTransportClientStartSession(hsessionkey: HANDLE): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsTransportClientStartSession(hsessionkey).toUInt()

public actual fun WdsTransportClientWaitForCompletion(hsessionkey: HANDLE, utimeout: UInt): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsTransportClientWaitForCompletion(hsessionkey, utimeout.toInt()).toUInt()

public actual fun WdsTransportServerAllocateBuffer(hprovider: HANDLE, ulbuffersize: UInt): Long =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsTransportServerAllocateBuffer(hprovider, ulbuffersize.toInt())

public actual fun WdsTransportServerCompleteRead(hprovider: HANDLE, ulbytesread: UInt, pvuserdata: Long, hreadresult: HRESULT): HRESULT =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsTransportServerCompleteRead(hprovider, ulbytesread.toInt(), pvuserdata, hreadresult)

public actual fun WdsTransportServerFreeBuffer(hprovider: HANDLE, pvbuffer: Long): HRESULT =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsTransportServerFreeBuffer(hprovider, pvbuffer)

public actual fun WdsTransportServerRegisterCallback(hprovider: HANDLE, callbackid: TRANSPORTPROVIDER_CALLBACK_ID, pfncallback: Long): HRESULT =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsTransportServerRegisterCallback(hprovider, callbackid, pfncallback)

public actual fun WdsTransportServerTrace(hprovider: HANDLE, severity: UInt, pwszformat: PCWSTR): HRESULT =
    0

public actual fun WdsTransportServerTraceV(hprovider: HANDLE, severity: UInt, pwszformat: PCWSTR, params: Long): HRESULT =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_WdsTransportServerTraceV(hprovider, severity.toInt(), pwszformat, params)
