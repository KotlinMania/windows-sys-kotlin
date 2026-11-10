@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32SystemDeploymentservicesJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_pxeAsyncRecvDone(hclientrequest: Long, action: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_pxeDhcpAppendOption(preplypacket: Long, umaxreplypacketlen: Int, pureplypacketlen: Long, boption: Byte, boptionlen: Byte, pvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_pxeDhcpAppendOptionRaw(preplypacket: Long, umaxreplypacketlen: Int, pureplypacketlen: Long, ubufferlen: Short, pbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_pxeDhcpGetOptionValue(ppacket: Long, upacketlen: Int, uinstance: Int, boption: Byte, pboptionlen: Long, ppoptionvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_pxeDhcpGetVendorOptionValue(ppacket: Long, upacketlen: Int, boption: Byte, uinstance: Int, pboptionlen: Long, ppoptionvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_pxeDhcpInitialize(precvpacket: Long, urecvpacketlen: Int, preplypacket: Long, umaxreplypacketlen: Int, pureplypacketlen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_pxeDhcpIsValid(ppacket: Long, upacketlen: Int, brequestpacket: Int, pbpxeoptionpresent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_pxeDhcpv6AppendOption(preply: Long, cbreply: Int, pcbreplyused: Long, woptiontype: Short, cboption: Short, poption: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_pxeDhcpv6AppendOptionRaw(preply: Long, cbreply: Int, pcbreplyused: Long, cbbuffer: Short, pbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_pxeDhcpv6CreateRelayRepl(prelaymessages: Long, nrelaymessages: Int, pinnerpacket: Long, cbinnerpacket: Int, preplybuffer: Long, cbreplybuffer: Int, pcbreplybuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_pxeDhcpv6GetOptionValue(ppacket: Long, upacketlen: Int, uinstance: Int, woption: Short, pwoptionlen: Long, ppoptionvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_pxeDhcpv6GetVendorOptionValue(ppacket: Long, upacketlen: Int, dwenterprisenumber: Int, woption: Short, uinstance: Int, pwoptionlen: Long, ppoptionvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_pxeDhcpv6Initialize(prequest: Long, cbrequest: Int, preply: Long, cbreply: Int, pcbreplyused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_pxeDhcpv6IsValid(ppacket: Long, upacketlen: Int, brequestpacket: Int, pbpxeoptionpresent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_pxeDhcpv6ParseRelayForw(prelayforwpacket: Long, urelayforwpacketlen: Int, prelaymessages: Long, nrelaymessages: Int, pnrelaymessages: Long, ppinnerpacket: Long, pcbinnerpacket: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_pxeGetServerInfo(uinfotype: Int, pbuffer: Long, ubufferlen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_pxeGetServerInfoEx(uinfotype: Int, pbuffer: Long, ubufferlen: Int, pubufferused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_pxePacketAllocate(hprovider: Long, hclientrequest: Long, usize: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_pxePacketFree(hprovider: Long, hclientrequest: Long, ppacket: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_pxeProviderEnumClose(henum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_pxeProviderEnumFirst(phenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_pxeProviderEnumNext(henum: Long, ppprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_pxeProviderFreeInfo(pprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_pxeProviderQueryIndex(pszprovidername: Long, puindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_pxeProviderRegister(pszprovidername: Long, pszmodulepath: Long, index: Int, biscritical: Int, phproviderkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_pxeProviderSetAttribute(hprovider: Long, attribute: Int, pparameterbuffer: Long, uparamlen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_pxeProviderUnRegister(pszprovidername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_pxeRegisterCallback(hprovider: Long, callbacktype: Int, pcallbackfunction: Long, pcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_pxeSendReply(hclientrequest: Long, ppacket: Long, upacketlen: Int, paddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_pxeTrace(hprovider: Long, severity: Int, pszformat: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_pxeTraceV(hprovider: Long, severity: Int, pszformat: Long, params: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsBpAddOption(hhandle: Long, uoption: Int, uvaluelen: Int, pvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsBpCloseHandle(hhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsBpGetOptionBuffer(hhandle: Long, ubufferlen: Int, pbuffer: Long, pubytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsBpInitialize(bpackettype: Byte, phhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsBpParseInitialize(ppacket: Long, upacketlen: Int, pbpackettype: Long, phhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsBpParseInitializev6(ppacket: Long, upacketlen: Int, pbpackettype: Long, phhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsBpQueryOption(hhandle: Long, uoption: Int, uvaluelen: Int, pvalue: Long, pubytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsCliAuthorizeSession(hsession: Long, pcred: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsCliCancelTransfer(htransfer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsCliClose(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsCliCreateSession(pwszserver: Long, pcred: Long, phsession: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsCliFindFirstImage(hsession: Long, phfindhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsCliFindNextImage(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsCliFreeStringArray(ppwszarray: Long, ulcount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsCliGetDriverQueryXml(pwszwindirpath: Long, ppwszdriverquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsCliGetEnumerationFlags(handle: Long, pdwflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsCliGetImageArchitecture(hifh: Long, pdwvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsCliGetImageDescription(hifh: Long, ppwszvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsCliGetImageFiles(hifh: Long, pppwszfiles: Long, pdwcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsCliGetImageGroup(hifh: Long, ppwszvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsCliGetImageHalName(hifh: Long, ppwszvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsCliGetImageHandleFromFindHandle(findhandle: Long, phimagehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsCliGetImageHandleFromTransferHandle(htransfer: Long, phimagehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsCliGetImageIndex(hifh: Long, pdwvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsCliGetImageLanguage(hifh: Long, ppwszvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsCliGetImageLanguages(hifh: Long, pppszvalues: Long, pdwnumvalues: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsCliGetImageLastModifiedTime(hifh: Long, ppsystimevalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsCliGetImageName(hifh: Long, ppwszvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsCliGetImageNamespace(hifh: Long, ppwszvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsCliGetImageParameter(hifh: Long, paramtype: Int, presponse: Long, uresponselen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsCliGetImagePath(hifh: Long, ppwszvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsCliGetImageSize(hifh: Long, pullvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsCliGetImageType(hifh: Long, pimagetype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsCliGetImageVersion(hifh: Long, ppwszvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsCliGetTransferSize(hifh: Long, pullvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsCliInitializeLog(hsession: Long, ulclientarchitecture: Int, pwszclientid: Long, pwszclientaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsCliLog(hsession: Long, ulloglevel: Int, ulmessagecode: Int, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsCliObtainDriverPackages(himage: Long, ppwszservername: Long, pppwszdriverpackages: Long, pulcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsCliObtainDriverPackagesEx(hsession: Long, pwszmachineinfo: Long, ppwszservername: Long, pppwszdriverpackages: Long, pulcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsCliRegisterTrace(pfn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsCliSetTransferBufferSize(ulsizeinbytes: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsCliTransferFile(pwszserver: Long, pwsznamespace: Long, pwszremotefilepath: Long, pwszlocalfilepath: Long, dwflags: Int, dwreserved: Int, pfnwdsclicallback: Long, pvuserdata: Long, phtransfer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsCliTransferImage(himage: Long, pwszlocalpath: Long, dwflags: Int, dwreserved: Int, pfnwdsclicallback: Long, pvuserdata: Long, phtransfer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsCliWaitForTransfer(htransfer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsTransportClientAddRefBuffer(pvbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsTransportClientCancelSession(hsessionkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsTransportClientCancelSessionEx(hsessionkey: Long, dwerrorcode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsTransportClientCloseSession(hsessionkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsTransportClientCompleteReceive(hsessionkey: Long, ulsize: Int, pulloffset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsTransportClientInitialize(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsTransportClientInitializeSession(psessionrequest: Long, pcallerdata: Long, hsessionkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsTransportClientQueryStatus(hsessionkey: Long, pustatus: Long, puerrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsTransportClientRegisterCallback(hsessionkey: Long, callbackid: Int, pfncallback: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsTransportClientReleaseBuffer(pvbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsTransportClientShutdown(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsTransportClientStartSession(hsessionkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsTransportClientWaitForCompletion(hsessionkey: Long, utimeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsTransportServerAllocateBuffer(hprovider: Long, ulbuffersize: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsTransportServerCompleteRead(hprovider: Long, ulbytesread: Int, pvuserdata: Long, hreadresult: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsTransportServerFreeBuffer(hprovider: Long, pvbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsTransportServerRegisterCallback(hprovider: Long, callbackid: Int, pfncallback: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsTransportServerTrace(hprovider: Long, severity: Int, pwszformat: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_deploymentservices_wdsTransportServerTraceV(hprovider: Long, severity: Int, pwszformat: Long, params: Long): Int
}

public actual fun pxeAsyncRecvDone(hclientrequest: Handle, action: UInt): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_pxeAsyncRecvDone((hclientrequest?.value ?: 0L), action.toInt()).toUInt()

public actual fun pxeDhcpAppendOption(preplypacket: COpaquePointer?, umaxreplypacketlen: UInt, pureplypacketlen: COpaquePointer?, boption: UByte, boptionlen: UByte, pvalue: COpaquePointer?): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_pxeDhcpAppendOption((preplypacket?.value ?: 0L), umaxreplypacketlen.toInt(), (pureplypacketlen?.value ?: 0L), boption.toByte(), boptionlen.toByte(), (pvalue?.value ?: 0L)).toUInt()

public actual fun pxeDhcpAppendOptionRaw(preplypacket: COpaquePointer?, umaxreplypacketlen: UInt, pureplypacketlen: COpaquePointer?, ubufferlen: UShort, pbuffer: COpaquePointer?): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_pxeDhcpAppendOptionRaw((preplypacket?.value ?: 0L), umaxreplypacketlen.toInt(), (pureplypacketlen?.value ?: 0L), ubufferlen.toShort(), (pbuffer?.value ?: 0L)).toUInt()

public actual fun pxeDhcpGetOptionValue(ppacket: COpaquePointer?, upacketlen: UInt, uinstance: UInt, boption: UByte, pboptionlen: COpaquePointer?, ppoptionvalue: COpaquePointer?): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_pxeDhcpGetOptionValue((ppacket?.value ?: 0L), upacketlen.toInt(), uinstance.toInt(), boption.toByte(), (pboptionlen?.value ?: 0L), (ppoptionvalue?.value ?: 0L)).toUInt()

public actual fun pxeDhcpGetVendorOptionValue(ppacket: COpaquePointer?, upacketlen: UInt, boption: UByte, uinstance: UInt, pboptionlen: COpaquePointer?, ppoptionvalue: COpaquePointer?): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_pxeDhcpGetVendorOptionValue((ppacket?.value ?: 0L), upacketlen.toInt(), boption.toByte(), uinstance.toInt(), (pboptionlen?.value ?: 0L), (ppoptionvalue?.value ?: 0L)).toUInt()

public actual fun pxeDhcpInitialize(precvpacket: COpaquePointer?, urecvpacketlen: UInt, preplypacket: COpaquePointer?, umaxreplypacketlen: UInt, pureplypacketlen: COpaquePointer?): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_pxeDhcpInitialize((precvpacket?.value ?: 0L), urecvpacketlen.toInt(), (preplypacket?.value ?: 0L), umaxreplypacketlen.toInt(), (pureplypacketlen?.value ?: 0L)).toUInt()

public actual fun pxeDhcpIsValid(ppacket: COpaquePointer?, upacketlen: UInt, brequestpacket: Bool, pbpxeoptionpresent: COpaquePointer?): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_pxeDhcpIsValid((ppacket?.value ?: 0L), upacketlen.toInt(), brequestpacket, (pbpxeoptionpresent?.value ?: 0L)).toUInt()

public actual fun pxeDhcpv6AppendOption(preply: COpaquePointer?, cbreply: UInt, pcbreplyused: COpaquePointer?, woptiontype: UShort, cboption: UShort, poption: COpaquePointer?): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_pxeDhcpv6AppendOption((preply?.value ?: 0L), cbreply.toInt(), (pcbreplyused?.value ?: 0L), woptiontype.toShort(), cboption.toShort(), (poption?.value ?: 0L)).toUInt()

public actual fun pxeDhcpv6AppendOptionRaw(preply: COpaquePointer?, cbreply: UInt, pcbreplyused: COpaquePointer?, cbbuffer: UShort, pbuffer: COpaquePointer?): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_pxeDhcpv6AppendOptionRaw((preply?.value ?: 0L), cbreply.toInt(), (pcbreplyused?.value ?: 0L), cbbuffer.toShort(), (pbuffer?.value ?: 0L)).toUInt()

public actual fun pxeDhcpv6CreateRelayRepl(prelaymessages: COpaquePointer?, nrelaymessages: UInt, pinnerpacket: COpaquePointer?, cbinnerpacket: UInt, preplybuffer: COpaquePointer?, cbreplybuffer: UInt, pcbreplybuffer: COpaquePointer?): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_pxeDhcpv6CreateRelayRepl((prelaymessages?.value ?: 0L), nrelaymessages.toInt(), (pinnerpacket?.value ?: 0L), cbinnerpacket.toInt(), (preplybuffer?.value ?: 0L), cbreplybuffer.toInt(), (pcbreplybuffer?.value ?: 0L)).toUInt()

public actual fun pxeDhcpv6GetOptionValue(ppacket: COpaquePointer?, upacketlen: UInt, uinstance: UInt, woption: UShort, pwoptionlen: COpaquePointer?, ppoptionvalue: COpaquePointer?): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_pxeDhcpv6GetOptionValue((ppacket?.value ?: 0L), upacketlen.toInt(), uinstance.toInt(), woption.toShort(), (pwoptionlen?.value ?: 0L), (ppoptionvalue?.value ?: 0L)).toUInt()

public actual fun pxeDhcpv6GetVendorOptionValue(ppacket: COpaquePointer?, upacketlen: UInt, dwenterprisenumber: UInt, woption: UShort, uinstance: UInt, pwoptionlen: COpaquePointer?, ppoptionvalue: COpaquePointer?): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_pxeDhcpv6GetVendorOptionValue((ppacket?.value ?: 0L), upacketlen.toInt(), dwenterprisenumber.toInt(), woption.toShort(), uinstance.toInt(), (pwoptionlen?.value ?: 0L), (ppoptionvalue?.value ?: 0L)).toUInt()

public actual fun pxeDhcpv6Initialize(prequest: COpaquePointer?, cbrequest: UInt, preply: COpaquePointer?, cbreply: UInt, pcbreplyused: COpaquePointer?): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_pxeDhcpv6Initialize((prequest?.value ?: 0L), cbrequest.toInt(), (preply?.value ?: 0L), cbreply.toInt(), (pcbreplyused?.value ?: 0L)).toUInt()

public actual fun pxeDhcpv6IsValid(ppacket: COpaquePointer?, upacketlen: UInt, brequestpacket: Bool, pbpxeoptionpresent: COpaquePointer?): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_pxeDhcpv6IsValid((ppacket?.value ?: 0L), upacketlen.toInt(), brequestpacket, (pbpxeoptionpresent?.value ?: 0L)).toUInt()

public actual fun pxeDhcpv6ParseRelayForw(prelayforwpacket: COpaquePointer?, urelayforwpacketlen: UInt, prelaymessages: COpaquePointer?, nrelaymessages: UInt, pnrelaymessages: COpaquePointer?, ppinnerpacket: COpaquePointer?, pcbinnerpacket: COpaquePointer?): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_pxeDhcpv6ParseRelayForw((prelayforwpacket?.value ?: 0L), urelayforwpacketlen.toInt(), (prelaymessages?.value ?: 0L), nrelaymessages.toInt(), (pnrelaymessages?.value ?: 0L), (ppinnerpacket?.value ?: 0L), (pcbinnerpacket?.value ?: 0L)).toUInt()

public actual fun pxeGetServerInfo(uinfotype: UInt, pbuffer: COpaquePointer?, ubufferlen: UInt): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_pxeGetServerInfo(uinfotype.toInt(), (pbuffer?.value ?: 0L), ubufferlen.toInt()).toUInt()

public actual fun pxeGetServerInfoEx(uinfotype: UInt, pbuffer: COpaquePointer?, ubufferlen: UInt, pubufferused: COpaquePointer?): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_pxeGetServerInfoEx(uinfotype.toInt(), (pbuffer?.value ?: 0L), ubufferlen.toInt(), (pubufferused?.value ?: 0L)).toUInt()

public actual fun pxePacketAllocate(hprovider: Handle, hclientrequest: Handle, usize: UInt): COpaquePointer? =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_pxePacketAllocate((hprovider?.value ?: 0L), (hclientrequest?.value ?: 0L), usize.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pxePacketFree(hprovider: Handle, hclientrequest: Handle, ppacket: COpaquePointer?): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_pxePacketFree((hprovider?.value ?: 0L), (hclientrequest?.value ?: 0L), (ppacket?.value ?: 0L)).toUInt()

public actual fun pxeProviderEnumClose(henum: Handle): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_pxeProviderEnumClose((henum?.value ?: 0L)).toUInt()

public actual fun pxeProviderEnumFirst(phenum: COpaquePointer?): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_pxeProviderEnumFirst((phenum?.value ?: 0L)).toUInt()

public actual fun pxeProviderEnumNext(henum: Handle, ppprovider: COpaquePointer?): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_pxeProviderEnumNext((henum?.value ?: 0L), (ppprovider?.value ?: 0L)).toUInt()

public actual fun pxeProviderFreeInfo(pprovider: COpaquePointer?): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_pxeProviderFreeInfo((pprovider?.value ?: 0L)).toUInt()

public actual fun pxeProviderQueryIndex(pszprovidername: Pcwstr, puindex: COpaquePointer?): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_pxeProviderQueryIndex((pszprovidername?.value ?: 0L), (puindex?.value ?: 0L)).toUInt()

public actual fun pxeProviderRegister(pszprovidername: Pcwstr, pszmodulepath: Pcwstr, index: UInt, biscritical: Bool, phproviderkey: COpaquePointer?): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_pxeProviderRegister((pszprovidername?.value ?: 0L), (pszmodulepath?.value ?: 0L), index.toInt(), biscritical, (phproviderkey?.value ?: 0L)).toUInt()

public actual fun pxeProviderSetAttribute(hprovider: Handle, attribute: UInt, pparameterbuffer: COpaquePointer?, uparamlen: UInt): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_pxeProviderSetAttribute((hprovider?.value ?: 0L), attribute.toInt(), (pparameterbuffer?.value ?: 0L), uparamlen.toInt()).toUInt()

public actual fun pxeProviderUnRegister(pszprovidername: Pcwstr): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_pxeProviderUnRegister((pszprovidername?.value ?: 0L)).toUInt()

public actual fun pxeRegisterCallback(hprovider: Handle, callbacktype: UInt, pcallbackfunction: COpaquePointer?, pcontext: COpaquePointer?): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_pxeRegisterCallback((hprovider?.value ?: 0L), callbacktype.toInt(), (pcallbackfunction?.value ?: 0L), (pcontext?.value ?: 0L)).toUInt()

public actual fun pxeSendReply(hclientrequest: Handle, ppacket: COpaquePointer?, upacketlen: UInt, paddress: COpaquePointer?): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_pxeSendReply((hclientrequest?.value ?: 0L), (ppacket?.value ?: 0L), upacketlen.toInt(), (paddress?.value ?: 0L)).toUInt()

public actual fun pxeTrace(hprovider: Handle, severity: UInt, pszformat: Pcwstr, vararg variadicArgs: Long): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_pxeTrace((hprovider?.value ?: 0L), severity.toInt(), (pszformat?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).toUInt()

public actual fun pxeTraceV(hprovider: Handle, severity: UInt, pszformat: Pcwstr, params: COpaquePointer?): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_pxeTraceV((hprovider?.value ?: 0L), severity.toInt(), (pszformat?.value ?: 0L), (params?.value ?: 0L)).toUInt()

public actual fun wdsBpAddOption(hhandle: Handle, uoption: UInt, uvaluelen: UInt, pvalue: COpaquePointer?): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsBpAddOption((hhandle?.value ?: 0L), uoption.toInt(), uvaluelen.toInt(), (pvalue?.value ?: 0L)).toUInt()

public actual fun wdsBpCloseHandle(hhandle: Handle): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsBpCloseHandle((hhandle?.value ?: 0L)).toUInt()

public actual fun wdsBpGetOptionBuffer(hhandle: Handle, ubufferlen: UInt, pbuffer: COpaquePointer?, pubytes: COpaquePointer?): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsBpGetOptionBuffer((hhandle?.value ?: 0L), ubufferlen.toInt(), (pbuffer?.value ?: 0L), (pubytes?.value ?: 0L)).toUInt()

public actual fun wdsBpInitialize(bpackettype: UByte, phhandle: COpaquePointer?): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsBpInitialize(bpackettype.toByte(), (phhandle?.value ?: 0L)).toUInt()

public actual fun wdsBpParseInitialize(ppacket: COpaquePointer?, upacketlen: UInt, pbpackettype: COpaquePointer?, phhandle: COpaquePointer?): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsBpParseInitialize((ppacket?.value ?: 0L), upacketlen.toInt(), (pbpackettype?.value ?: 0L), (phhandle?.value ?: 0L)).toUInt()

public actual fun wdsBpParseInitializev6(ppacket: COpaquePointer?, upacketlen: UInt, pbpackettype: COpaquePointer?, phhandle: COpaquePointer?): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsBpParseInitializev6((ppacket?.value ?: 0L), upacketlen.toInt(), (pbpackettype?.value ?: 0L), (phhandle?.value ?: 0L)).toUInt()

public actual fun wdsBpQueryOption(hhandle: Handle, uoption: UInt, uvaluelen: UInt, pvalue: COpaquePointer?, pubytes: COpaquePointer?): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsBpQueryOption((hhandle?.value ?: 0L), uoption.toInt(), uvaluelen.toInt(), (pvalue?.value ?: 0L), (pubytes?.value ?: 0L)).toUInt()

public actual fun wdsCliAuthorizeSession(hsession: Handle, pcred: COpaquePointer?): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsCliAuthorizeSession((hsession?.value ?: 0L), (pcred?.value ?: 0L))

public actual fun wdsCliCancelTransfer(htransfer: Handle): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsCliCancelTransfer((htransfer?.value ?: 0L))

public actual fun wdsCliClose(handle: Handle): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsCliClose((handle?.value ?: 0L))

public actual fun wdsCliCreateSession(pwszserver: Pcwstr, pcred: COpaquePointer?, phsession: COpaquePointer?): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsCliCreateSession((pwszserver?.value ?: 0L), (pcred?.value ?: 0L), (phsession?.value ?: 0L))

public actual fun wdsCliFindFirstImage(hsession: Handle, phfindhandle: COpaquePointer?): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsCliFindFirstImage((hsession?.value ?: 0L), (phfindhandle?.value ?: 0L))

public actual fun wdsCliFindNextImage(handle: Handle): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsCliFindNextImage((handle?.value ?: 0L))

public actual fun wdsCliFreeStringArray(ppwszarray: COpaquePointer?, ulcount: UInt): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsCliFreeStringArray((ppwszarray?.value ?: 0L), ulcount.toInt())

public actual fun wdsCliGetDriverQueryXml(pwszwindirpath: Pcwstr, ppwszdriverquery: COpaquePointer?): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsCliGetDriverQueryXml((pwszwindirpath?.value ?: 0L), (ppwszdriverquery?.value ?: 0L))

public actual fun wdsCliGetEnumerationFlags(handle: Handle, pdwflags: COpaquePointer?): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsCliGetEnumerationFlags((handle?.value ?: 0L), (pdwflags?.value ?: 0L))

public actual fun wdsCliGetImageArchitecture(hifh: Handle, pdwvalue: COpaquePointer?): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageArchitecture((hifh?.value ?: 0L), (pdwvalue?.value ?: 0L))

public actual fun wdsCliGetImageDescription(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageDescription((hifh?.value ?: 0L), (ppwszvalue?.value ?: 0L))

public actual fun wdsCliGetImageFiles(hifh: Handle, pppwszfiles: COpaquePointer?, pdwcount: COpaquePointer?): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageFiles((hifh?.value ?: 0L), (pppwszfiles?.value ?: 0L), (pdwcount?.value ?: 0L))

public actual fun wdsCliGetImageGroup(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageGroup((hifh?.value ?: 0L), (ppwszvalue?.value ?: 0L))

public actual fun wdsCliGetImageHalName(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageHalName((hifh?.value ?: 0L), (ppwszvalue?.value ?: 0L))

public actual fun wdsCliGetImageHandleFromFindHandle(findhandle: Handle, phimagehandle: COpaquePointer?): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageHandleFromFindHandle((findhandle?.value ?: 0L), (phimagehandle?.value ?: 0L))

public actual fun wdsCliGetImageHandleFromTransferHandle(htransfer: Handle, phimagehandle: COpaquePointer?): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageHandleFromTransferHandle((htransfer?.value ?: 0L), (phimagehandle?.value ?: 0L))

public actual fun wdsCliGetImageIndex(hifh: Handle, pdwvalue: COpaquePointer?): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageIndex((hifh?.value ?: 0L), (pdwvalue?.value ?: 0L))

public actual fun wdsCliGetImageLanguage(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageLanguage((hifh?.value ?: 0L), (ppwszvalue?.value ?: 0L))

public actual fun wdsCliGetImageLanguages(hifh: Handle, pppszvalues: COpaquePointer?, pdwnumvalues: COpaquePointer?): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageLanguages((hifh?.value ?: 0L), (pppszvalues?.value ?: 0L), (pdwnumvalues?.value ?: 0L))

public actual fun wdsCliGetImageLastModifiedTime(hifh: Handle, ppsystimevalue: COpaquePointer?): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageLastModifiedTime((hifh?.value ?: 0L), (ppsystimevalue?.value ?: 0L))

public actual fun wdsCliGetImageName(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageName((hifh?.value ?: 0L), (ppwszvalue?.value ?: 0L))

public actual fun wdsCliGetImageNamespace(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageNamespace((hifh?.value ?: 0L), (ppwszvalue?.value ?: 0L))

public actual fun wdsCliGetImageParameter(hifh: Handle, paramtype: WdsCliImageParamType, presponse: COpaquePointer?, uresponselen: UInt): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageParameter((hifh?.value ?: 0L), paramtype, (presponse?.value ?: 0L), uresponselen.toInt())

public actual fun wdsCliGetImagePath(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsCliGetImagePath((hifh?.value ?: 0L), (ppwszvalue?.value ?: 0L))

public actual fun wdsCliGetImageSize(hifh: Handle, pullvalue: COpaquePointer?): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageSize((hifh?.value ?: 0L), (pullvalue?.value ?: 0L))

public actual fun wdsCliGetImageType(hifh: Handle, pimagetype: COpaquePointer?): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageType((hifh?.value ?: 0L), (pimagetype?.value ?: 0L))

public actual fun wdsCliGetImageVersion(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageVersion((hifh?.value ?: 0L), (ppwszvalue?.value ?: 0L))

public actual fun wdsCliGetTransferSize(hifh: Handle, pullvalue: COpaquePointer?): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsCliGetTransferSize((hifh?.value ?: 0L), (pullvalue?.value ?: 0L))

public actual fun wdsCliInitializeLog(hsession: Handle, ulclientarchitecture: CpuArchitecture, pwszclientid: Pcwstr, pwszclientaddress: Pcwstr): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsCliInitializeLog((hsession?.value ?: 0L), ulclientarchitecture.toInt(), (pwszclientid?.value ?: 0L), (pwszclientaddress?.value ?: 0L))

public actual fun wdsCliLog(hsession: Handle, ulloglevel: UInt, ulmessagecode: UInt, vararg variadicArgs: Long): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsCliLog((hsession?.value ?: 0L), ulloglevel.toInt(), ulmessagecode.toInt(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun wdsCliObtainDriverPackages(himage: Handle, ppwszservername: COpaquePointer?, pppwszdriverpackages: COpaquePointer?, pulcount: COpaquePointer?): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsCliObtainDriverPackages((himage?.value ?: 0L), (ppwszservername?.value ?: 0L), (pppwszdriverpackages?.value ?: 0L), (pulcount?.value ?: 0L))

public actual fun wdsCliObtainDriverPackagesEx(hsession: Handle, pwszmachineinfo: Pcwstr, ppwszservername: COpaquePointer?, pppwszdriverpackages: COpaquePointer?, pulcount: COpaquePointer?): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsCliObtainDriverPackagesEx((hsession?.value ?: 0L), (pwszmachineinfo?.value ?: 0L), (ppwszservername?.value ?: 0L), (pppwszdriverpackages?.value ?: 0L), (pulcount?.value ?: 0L))

public actual fun wdsCliRegisterTrace(pfn: PfnWdsCliTraceFunction): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsCliRegisterTrace(0L)

public actual fun wdsCliSetTransferBufferSize(ulsizeinbytes: UInt) {
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsCliSetTransferBufferSize(ulsizeinbytes.toInt())
}

public actual fun wdsCliTransferFile(pwszserver: Pcwstr, pwsznamespace: Pcwstr, pwszremotefilepath: Pcwstr, pwszlocalfilepath: Pcwstr, dwflags: UInt, dwreserved: UInt, pfnwdsclicallback: PfnWdsCliCallback, pvuserdata: COpaquePointer?, phtransfer: COpaquePointer?): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsCliTransferFile((pwszserver?.value ?: 0L), (pwsznamespace?.value ?: 0L), (pwszremotefilepath?.value ?: 0L), (pwszlocalfilepath?.value ?: 0L), dwflags.toInt(), dwreserved.toInt(), 0L, (pvuserdata?.value ?: 0L), (phtransfer?.value ?: 0L))

public actual fun wdsCliTransferImage(himage: Handle, pwszlocalpath: Pcwstr, dwflags: UInt, dwreserved: UInt, pfnwdsclicallback: PfnWdsCliCallback, pvuserdata: COpaquePointer?, phtransfer: COpaquePointer?): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsCliTransferImage((himage?.value ?: 0L), (pwszlocalpath?.value ?: 0L), dwflags.toInt(), dwreserved.toInt(), 0L, (pvuserdata?.value ?: 0L), (phtransfer?.value ?: 0L))

public actual fun wdsCliWaitForTransfer(htransfer: Handle): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsCliWaitForTransfer((htransfer?.value ?: 0L))

public actual fun wdsTransportClientAddRefBuffer(pvbuffer: COpaquePointer?): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsTransportClientAddRefBuffer((pvbuffer?.value ?: 0L)).toUInt()

public actual fun wdsTransportClientCancelSession(hsessionkey: Handle): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsTransportClientCancelSession((hsessionkey?.value ?: 0L)).toUInt()

public actual fun wdsTransportClientCancelSessionEx(hsessionkey: Handle, dwerrorcode: UInt): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsTransportClientCancelSessionEx((hsessionkey?.value ?: 0L), dwerrorcode.toInt()).toUInt()

public actual fun wdsTransportClientCloseSession(hsessionkey: Handle): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsTransportClientCloseSession((hsessionkey?.value ?: 0L)).toUInt()

public actual fun wdsTransportClientCompleteReceive(hsessionkey: Handle, ulsize: UInt, pulloffset: COpaquePointer?): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsTransportClientCompleteReceive((hsessionkey?.value ?: 0L), ulsize.toInt(), (pulloffset?.value ?: 0L)).toUInt()

public actual fun wdsTransportClientInitialize(): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsTransportClientInitialize().toUInt()

public actual fun wdsTransportClientInitializeSession(psessionrequest: COpaquePointer?, pcallerdata: COpaquePointer?, hsessionkey: COpaquePointer?): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsTransportClientInitializeSession((psessionrequest?.value ?: 0L), (pcallerdata?.value ?: 0L), (hsessionkey?.value ?: 0L)).toUInt()

public actual fun wdsTransportClientQueryStatus(hsessionkey: Handle, pustatus: COpaquePointer?, puerrorcode: COpaquePointer?): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsTransportClientQueryStatus((hsessionkey?.value ?: 0L), (pustatus?.value ?: 0L), (puerrorcode?.value ?: 0L)).toUInt()

public actual fun wdsTransportClientRegisterCallback(hsessionkey: Handle, callbackid: TransportclientCallbackId, pfncallback: COpaquePointer?): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsTransportClientRegisterCallback((hsessionkey?.value ?: 0L), callbackid, (pfncallback?.value ?: 0L)).toUInt()

public actual fun wdsTransportClientReleaseBuffer(pvbuffer: COpaquePointer?): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsTransportClientReleaseBuffer((pvbuffer?.value ?: 0L)).toUInt()

public actual fun wdsTransportClientShutdown(): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsTransportClientShutdown().toUInt()

public actual fun wdsTransportClientStartSession(hsessionkey: Handle): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsTransportClientStartSession((hsessionkey?.value ?: 0L)).toUInt()

public actual fun wdsTransportClientWaitForCompletion(hsessionkey: Handle, utimeout: UInt): UInt =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsTransportClientWaitForCompletion((hsessionkey?.value ?: 0L), utimeout.toInt()).toUInt()

public actual fun wdsTransportServerAllocateBuffer(hprovider: Handle, ulbuffersize: UInt): COpaquePointer? =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsTransportServerAllocateBuffer((hprovider?.value ?: 0L), ulbuffersize.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wdsTransportServerCompleteRead(hprovider: Handle, ulbytesread: UInt, pvuserdata: COpaquePointer?, hreadresult: Hresult): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsTransportServerCompleteRead((hprovider?.value ?: 0L), ulbytesread.toInt(), (pvuserdata?.value ?: 0L), hreadresult)

public actual fun wdsTransportServerFreeBuffer(hprovider: Handle, pvbuffer: COpaquePointer?): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsTransportServerFreeBuffer((hprovider?.value ?: 0L), (pvbuffer?.value ?: 0L))

public actual fun wdsTransportServerRegisterCallback(hprovider: Handle, callbackid: TransportproviderCallbackId, pfncallback: COpaquePointer?): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsTransportServerRegisterCallback((hprovider?.value ?: 0L), callbackid, (pfncallback?.value ?: 0L))

public actual fun wdsTransportServerTrace(hprovider: Handle, severity: UInt, pwszformat: Pcwstr, vararg variadicArgs: Long): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsTransportServerTrace((hprovider?.value ?: 0L), severity.toInt(), (pwszformat?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun wdsTransportServerTraceV(hprovider: Handle, severity: UInt, pwszformat: Pcwstr, params: COpaquePointer?): Hresult =
    WindowsWin32SystemDeploymentservicesJniBridge.windowssys_windows_win32_system_deploymentservices_wdsTransportServerTraceV((hprovider?.value ?: 0L), severity.toInt(), (pwszformat?.value ?: 0L), (params?.value ?: 0L))
