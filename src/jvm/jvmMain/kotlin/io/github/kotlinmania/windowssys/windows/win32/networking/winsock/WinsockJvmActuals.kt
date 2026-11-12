@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.winsock

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.windows.win32.foundation.Farproc
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.WaitEvent
import io.github.kotlinmania.windowssys.windows.win32.system.com.Blob
import io.github.kotlinmania.windowssys.windows.win32.system.io.Overlapped
import io.github.kotlinmania.windowssys.windows.win32.system.io.OverlappedEntry

private object WindowsWin32NetworkingWinsockJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32NetworkingWinsockJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockAcceptEx(slistensocket: Long, sacceptsocket: Long, lpoutputbuffer: Long, dwreceivedatalength: Int, dwlocaladdresslength: Int, dwremoteaddresslength: Int, lpdwbytesreceived: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockEnumProtocolsA(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockEnumProtocolsW(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockFreeAddrInfoEx(paddrinfoex: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockFreeAddrInfoExW(paddrinfoex: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockFreeAddrInfoW(paddrinfo: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockGetAcceptExSockaddrs(lpoutputbuffer: Long, dwreceivedatalength: Int, dwlocaladdresslength: Int, dwremoteaddresslength: Int, localsockaddr: Long, localsockaddrlength: Long, remotesockaddr: Long, remotesockaddrlength: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockGetAddrInfoExA(pname: Long, pservicename: Long, dwnamespace: Int, lpnspid: Long, hints: Long, ppresult: Long, timeout: Long, lpoverlapped: Long, lpcompletionroutine: Long, lpnamehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockGetAddrInfoExCancel(lphandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockGetAddrInfoExOverlappedResult(lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockGetAddrInfoExW(pname: Long, pservicename: Long, dwnamespace: Int, lpnspid: Long, hints: Long, ppresult: Long, timeout: Long, lpoverlapped: Long, lpcompletionroutine: Long, lphandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockGetAddrInfoW(pnodename: Long, pservicename: Long, phints: Long, ppresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockGetAddressByNameA(dwnamespace: Int, lpservicetype: Long, lpservicename: Long, lpiprotocols: Long, dwresolution: Int, lpserviceasyncinfo: Long, lpcsaddrbuffer: Long, lpdwbufferlength: Long, lpaliasbuffer: Long, lpdwaliasbufferlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockGetAddressByNameW(dwnamespace: Int, lpservicetype: Long, lpservicename: Long, lpiprotocols: Long, dwresolution: Int, lpserviceasyncinfo: Long, lpcsaddrbuffer: Long, lpdwbufferlength: Long, lpaliasbuffer: Long, lpdwaliasbufferlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockGetHostNameW(name: Long, namelen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockGetNameByTypeA(lpservicetype: Long, lpservicename: Long, dwnamelength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockGetNameByTypeW(lpservicetype: Long, lpservicename: Long, dwnamelength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockGetNameInfoW(psockaddr: Long, sockaddrlength: Int, pnodebuffer: Long, nodebuffersize: Int, pservicebuffer: Long, servicebuffersize: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockGetServiceA(dwnamespace: Int, lpguid: Long, lpservicename: Long, dwproperties: Int, lpbuffer: Long, lpdwbuffersize: Long, lpserviceasyncinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockGetServiceW(dwnamespace: Int, lpguid: Long, lpservicename: Long, dwproperties: Int, lpbuffer: Long, lpdwbuffersize: Long, lpserviceasyncinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockGetTypeByNameA(lpservicename: Long, lpservicetype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockGetTypeByNameW(lpservicename: Long, lpservicetype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockInetNtopW(family: Int, paddr: Long, pstringbuf: Long, stringbufsize: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockInetPtonW(family: Int, pszaddrstring: Long, paddrbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockProcessSocketNotifications(completionport: Long, registrationcount: Int, registrationinfos: Long, timeoutms: Int, completioncount: Int, completionportentries: Long, receivedentrycount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockRtlEthernetAddressToStringA(addr: Long, s: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockRtlEthernetAddressToStringW(addr: Long, s: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockRtlEthernetStringToAddressA(s: Long, terminator: Long, addr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockRtlEthernetStringToAddressW(s: Long, terminator: Long, addr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringA(addr: Long, s: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringExA(address: Long, port: Short, addressstring: Long, addressstringlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringExW(address: Long, port: Short, addressstring: Long, addressstringlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringW(addr: Long, s: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressA(s: Long, strict: Boolean, terminator: Long, addr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressExA(addressstring: Long, strict: Boolean, address: Long, port: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressExW(addressstring: Long, strict: Boolean, address: Long, port: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressW(s: Long, strict: Boolean, terminator: Long, addr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringA(addr: Long, s: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringExA(address: Long, scopeid: Int, port: Short, addressstring: Long, addressstringlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringExW(address: Long, scopeid: Int, port: Short, addressstring: Long, addressstringlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringW(addr: Long, s: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressA(s: Long, terminator: Long, addr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressExA(addressstring: Long, address: Long, scopeid: Long, port: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressExW(addressstring: Long, address: Long, scopeid: Long, port: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressW(s: Long, terminator: Long, addr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockSetAddrInfoExA(pname: Long, pservicename: Long, paddresses: Long, dwaddresscount: Int, lpblob: Long, dwflags: Int, dwnamespace: Int, lpnspid: Long, timeout: Long, lpoverlapped: Long, lpcompletionroutine: Long, lpnamehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockSetAddrInfoExW(pname: Long, pservicename: Long, paddresses: Long, dwaddresscount: Int, lpblob: Long, dwflags: Int, dwnamespace: Int, lpnspid: Long, timeout: Long, lpoverlapped: Long, lpcompletionroutine: Long, lpnamehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockSetServiceA(dwnamespace: Int, dwoperation: Int, dwflags: Int, lpserviceinfo: Long, lpserviceasyncinfo: Long, lpdwstatusflags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockSetServiceW(dwnamespace: Int, dwoperation: Int, dwflags: Int, lpserviceinfo: Long, lpserviceasyncinfo: Long, lpdwstatusflags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockSetSocketMediaStreamingMode(value: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockTransmitFile(hsocket: Long, hfile: Long, nnumberofbytestowrite: Int, nnumberofbytespersend: Int, lpoverlapped: Long, lptransmitbuffers: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWPUCompleteOverlappedRequest(s: Long, lpoverlapped: Long, dwerror: Int, cbtransferred: Int, lperrno: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAAccept(s: Long, addr: Long, addrlen: Long, lpfncondition: Long, dwcallbackdata: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAAddressToStringA(lpsaaddress: Long, dwaddresslength: Int, lpprotocolinfo: Long, lpszaddressstring: Long, lpdwaddressstringlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAAddressToStringW(lpsaaddress: Long, dwaddresslength: Int, lpprotocolinfo: Long, lpszaddressstring: Long, lpdwaddressstringlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAAdvertiseProvider(puuidproviderid: Long, pnspv2routine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAAsyncGetHostByAddr(hwnd: Long, wmsg: Int, addr: Long, len: Int, type: Int, buf: Long, buflen: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAAsyncGetHostByName(hwnd: Long, wmsg: Int, name: Long, buf: Long, buflen: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAAsyncGetProtoByName(hwnd: Long, wmsg: Int, name: Long, buf: Long, buflen: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAAsyncGetProtoByNumber(hwnd: Long, wmsg: Int, number: Int, buf: Long, buflen: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAAsyncGetServByName(hwnd: Long, wmsg: Int, name: Long, proto: Long, buf: Long, buflen: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAAsyncGetServByPort(hwnd: Long, wmsg: Int, port: Int, proto: Long, buf: Long, buflen: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAAsyncSelect(s: Long, hwnd: Long, wmsg: Int, levent: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSACancelAsyncRequest(hasynctaskhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSACancelBlockingCall(): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSACleanup(): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSACloseEvent(hevent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAConnect(s: Long, name: Long, namelen: Int, lpcallerdata: Long, lpcalleedata: Long, lpsqos: Long, lpgqos: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAConnectByList(s: Long, socketaddress: Long, localaddresslength: Long, localaddress: Long, remoteaddresslength: Long, remoteaddress: Long, timeout: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAConnectByNameA(s: Long, nodename: Long, servicename: Long, localaddresslength: Long, localaddress: Long, remoteaddresslength: Long, remoteaddress: Long, timeout: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAConnectByNameW(s: Long, nodename: Long, servicename: Long, localaddresslength: Long, localaddress: Long, remoteaddresslength: Long, remoteaddress: Long, timeout: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSACreateEvent(): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSADeleteSocketPeerTargetName(socket: Long, peeraddr: Long, peeraddrlen: Int, overlapped: Long, completionroutine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSADuplicateSocketA(s: Long, dwprocessid: Int, lpprotocolinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSADuplicateSocketW(s: Long, dwprocessid: Int, lpprotocolinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersA(lpdwbufferlength: Long, lpnspbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersExA(lpdwbufferlength: Long, lpnspbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersExW(lpdwbufferlength: Long, lpnspbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersW(lpdwbufferlength: Long, lpnspbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAEnumNetworkEvents(s: Long, heventobject: Long, lpnetworkevents: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAEnumProtocolsA(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAEnumProtocolsW(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAEventSelect(s: Long, heventobject: Long, lnetworkevents: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAGetLastError(): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAGetOverlappedResult(s: Long, lpoverlapped: Long, lpcbtransfer: Long, fwait: Int, lpdwflags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAGetQOSByName(s: Long, lpqosname: Long, lpqos: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAGetServiceClassInfoA(lpproviderid: Long, lpserviceclassid: Long, lpdwbufsize: Long, lpserviceclassinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAGetServiceClassInfoW(lpproviderid: Long, lpserviceclassid: Long, lpdwbufsize: Long, lpserviceclassinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAGetServiceClassNameByClassIdA(lpserviceclassid: Long, lpszserviceclassname: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAGetServiceClassNameByClassIdW(lpserviceclassid: Long, lpszserviceclassname: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAHtonl(s: Long, hostlong: Int, lpnetlong: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAHtons(s: Long, hostshort: Short, lpnetshort: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAImpersonateSocketPeer(socket: Long, peeraddr: Long, peeraddrlen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAInstallServiceClassA(lpserviceclassinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAInstallServiceClassW(lpserviceclassinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAIoctl(s: Long, dwiocontrolcode: Int, lpvinbuffer: Long, cbinbuffer: Int, lpvoutbuffer: Long, cboutbuffer: Int, lpcbbytesreturned: Long, lpoverlapped: Long, lpcompletionroutine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAIsBlocking(): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAJoinLeaf(s: Long, name: Long, namelen: Int, lpcallerdata: Long, lpcalleedata: Long, lpsqos: Long, lpgqos: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSALookupServiceBeginA(lpqsrestrictions: Long, dwcontrolflags: Int, lphlookup: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSALookupServiceBeginW(lpqsrestrictions: Long, dwcontrolflags: Int, lphlookup: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSALookupServiceEnd(hlookup: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSALookupServiceNextA(hlookup: Long, dwcontrolflags: Int, lpdwbufferlength: Long, lpqsresults: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSALookupServiceNextW(hlookup: Long, dwcontrolflags: Int, lpdwbufferlength: Long, lpqsresults: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSANSPIoctl(hlookup: Long, dwcontrolcode: Int, lpvinbuffer: Long, cbinbuffer: Int, lpvoutbuffer: Long, cboutbuffer: Int, lpcbbytesreturned: Long, lpcompletion: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSANtohl(s: Long, netlong: Int, lphostlong: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSANtohs(s: Long, netshort: Short, lphostshort: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAPoll(fdarray: Long, fds: Int, timeout: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAProviderCompleteAsyncCall(hasynccall: Long, iretcode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAProviderConfigChange(lpnotificationhandle: Long, lpoverlapped: Long, lpcompletionroutine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAQuerySocketSecurity(socket: Long, securityquerytemplate: Long, securityquerytemplatelen: Int, securityqueryinfo: Long, securityqueryinfolen: Long, overlapped: Long, completionroutine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSARecv(s: Long, lpbuffers: Long, dwbuffercount: Int, lpnumberofbytesrecvd: Long, lpflags: Long, lpoverlapped: Long, lpcompletionroutine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSARecvDisconnect(s: Long, lpinbounddisconnectdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSARecvEx(s: Long, buf: Long, len: Int, flags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSARecvFrom(s: Long, lpbuffers: Long, dwbuffercount: Int, lpnumberofbytesrecvd: Long, lpflags: Long, lpfrom: Long, lpfromlen: Long, lpoverlapped: Long, lpcompletionroutine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSARemoveServiceClass(lpserviceclassid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAResetEvent(hevent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSARevertImpersonation(): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSASend(s: Long, lpbuffers: Long, dwbuffercount: Int, lpnumberofbytessent: Long, dwflags: Int, lpoverlapped: Long, lpcompletionroutine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSASendDisconnect(s: Long, lpoutbounddisconnectdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSASendMsg(handle: Long, lpmsg: Long, dwflags: Int, lpnumberofbytessent: Long, lpoverlapped: Long, lpcompletionroutine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSASendTo(s: Long, lpbuffers: Long, dwbuffercount: Int, lpnumberofbytessent: Long, dwflags: Int, lpto: Long, itolen: Int, lpoverlapped: Long, lpcompletionroutine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSASetEvent(hevent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSASetLastError(ierror: Int)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSASetServiceA(lpqsreginfo: Long, essoperation: Int, dwcontrolflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSASetServiceW(lpqsreginfo: Long, essoperation: Int, dwcontrolflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSASetSocketPeerTargetName(socket: Long, peertargetname: Long, peertargetnamelen: Int, overlapped: Long, completionroutine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSASetSocketSecurity(socket: Long, securitysettings: Long, securitysettingslen: Int, overlapped: Long, completionroutine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSASocketA(af: Int, type: Int, protocol: Int, lpprotocolinfo: Long, g: Int, dwflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSASocketW(af: Int, type: Int, protocol: Int, lpprotocolinfo: Long, g: Int, dwflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAStartup(wversionrequested: Short, lpwsadata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAStringToAddressA(addressstring: Long, addressfamily: Int, lpprotocolinfo: Long, lpaddress: Long, lpaddresslength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAStringToAddressW(addressstring: Long, addressfamily: Int, lpprotocolinfo: Long, lpaddress: Long, lpaddresslength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAUnadvertiseProvider(puuidproviderid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAUnhookBlockingHook(): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSAWaitForMultipleEvents(cevents: Int, lphevents: Long, fwaitall: Int, dwtimeout: Int, falertable: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSCDeinstallProvider(lpproviderid: Long, lperrno: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSCDeinstallProvider32(lpproviderid: Long, lperrno: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSCEnableNSProvider(lpproviderid: Long, fenable: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSCEnableNSProvider32(lpproviderid: Long, fenable: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSCEnumNameSpaceProviders32(lpdwbufferlength: Long, lpnspbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSCEnumNameSpaceProvidersEx32(lpdwbufferlength: Long, lpnspbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSCEnumProtocols(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long, lperrno: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSCEnumProtocols32(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long, lperrno: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSCGetApplicationCategory(path: Long, pathlength: Int, extra: Long, extralength: Int, ppermittedlspcategories: Long, lperrno: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSCGetProviderInfo(lpproviderid: Long, infotype: Int, info: Long, infosize: Long, flags: Int, lperrno: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSCGetProviderInfo32(lpproviderid: Long, infotype: Int, info: Long, infosize: Long, flags: Int, lperrno: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSCGetProviderPath(lpproviderid: Long, lpszproviderdllpath: Long, lpproviderdllpathlen: Long, lperrno: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSCGetProviderPath32(lpproviderid: Long, lpszproviderdllpath: Long, lpproviderdllpathlen: Long, lperrno: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSCInstallNameSpace(lpszidentifier: Long, lpszpathname: Long, dwnamespace: Int, dwversion: Int, lpproviderid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSCInstallNameSpace32(lpszidentifier: Long, lpszpathname: Long, dwnamespace: Int, dwversion: Int, lpproviderid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSCInstallNameSpaceEx(lpszidentifier: Long, lpszpathname: Long, dwnamespace: Int, dwversion: Int, lpproviderid: Long, lpproviderspecific: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSCInstallNameSpaceEx32(lpszidentifier: Long, lpszpathname: Long, dwnamespace: Int, dwversion: Int, lpproviderid: Long, lpproviderspecific: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSCInstallProvider(lpproviderid: Long, lpszproviderdllpath: Long, lpprotocolinfolist: Long, dwnumberofentries: Int, lperrno: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWscinstallProvider6432(lpproviderid: Long, lpszproviderdllpath: Long, lpprotocolinfolist: Long, dwnumberofentries: Int, lperrno: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWscinstallProviderAndChains6432(lpproviderid: Long, lpszproviderdllpath: Long, lpszproviderdllpath32: Long, lpszlspname: Long, dwserviceflags: Int, lpprotocolinfolist: Long, dwnumberofentries: Int, lpdwcatalogentryid: Long, lperrno: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSCSetApplicationCategory(path: Long, pathlength: Int, extra: Long, extralength: Int, permittedlspcategories: Int, pprevpermlspcat: Long, lperrno: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSCSetProviderInfo(lpproviderid: Long, infotype: Int, info: Long, infosize: Long, flags: Int, lperrno: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSCSetProviderInfo32(lpproviderid: Long, infotype: Int, info: Long, infosize: Long, flags: Int, lperrno: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSCUnInstallNameSpace(lpproviderid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSCUnInstallNameSpace32(lpproviderid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSCUpdateProvider(lpproviderid: Long, lpszproviderdllpath: Long, lpprotocolinfolist: Long, dwnumberofentries: Int, lperrno: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSCUpdateProvider32(lpproviderid: Long, lpszproviderdllpath: Long, lpprotocolinfolist: Long, dwnumberofentries: Int, lperrno: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSCWriteNameSpaceOrder(lpproviderid: Long, dwnumberofentries: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSCWriteNameSpaceOrder32(lpproviderid: Long, dwnumberofentries: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSCWriteProviderOrder(lpwdcatalogentryid: Long, dwnumberofentries: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWSCWriteProviderOrder32(lpwdcatalogentryid: Long, dwnumberofentries: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockWsafdisSet(fd: Long, param1: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockAccept(s: Long, addr: Long, addrlen: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockBind(s: Long, name: Long, namelen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockClosesocket(s: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockConnect(s: Long, name: Long, namelen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockFreeaddrinfo(paddrinfo: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockGetaddrinfo(pnodename: Long, pservicename: Long, phints: Long, ppresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockGethostbyaddr(addr: Long, len: Int, type: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockGethostbyname(name: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockGethostname(name: Long, namelen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockGetnameinfo(psockaddr: Long, sockaddrlength: Int, pnodebuffer: Long, nodebuffersize: Int, pservicebuffer: Long, servicebuffersize: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockGetpeername(s: Long, name: Long, namelen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockGetprotobyname(name: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockGetprotobynumber(number: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockGetservbyname(name: Long, proto: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockGetservbyport(port: Int, proto: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockGetsockname(s: Long, name: Long, namelen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockGetsockopt(s: Long, level: Int, optname: Int, optval: Long, optlen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockHtonl(hostlong: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockHtons(hostshort: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockInetAddr(cp: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockInetNtop(family: Int, paddr: Long, pstringbuf: Long, stringbufsize: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockInetPton(family: Int, pszaddrstring: Long, paddrbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockIoctlsocket(s: Long, cmd: Int, argp: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockListen(s: Long, backlog: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockNtohl(netlong: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockNtohs(netshort: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockRecv(s: Long, buf: Long, len: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockRecvfrom(s: Long, buf: Long, len: Int, flags: Int, from: Long, fromlen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockSelect(nfds: Int, readfds: Long, writefds: Long, exceptfds: Long, timeout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockSend(s: Long, buf: Long, len: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockSendto(s: Long, buf: Long, len: Int, flags: Int, to: Long, tolen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockSetsockopt(s: Long, level: Int, optname: Int, optval: Long, optlen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockShutdown(s: Long, how: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinsockSocket(af: Int, type: Int, protocol: Int): Long
}

public actual fun acceptEx(slistensocket: Socket, sacceptsocket: Socket, lpoutputbuffer: MutPtr<CVoid>, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, lpdwbytesreceived: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>): Bool =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockAcceptEx(slistensocket.toLong(), sacceptsocket.toLong(), lpoutputbuffer.rawAddress, dwreceivedatalength.toInt(), dwlocaladdresslength.toInt(), dwremoteaddresslength.toInt(), lpdwbytesreceived.rawAddress, lpoverlapped.rawAddress)

public actual fun enumProtocolsA(lpiprotocols: ConstPtr<Int>, lpprotocolbuffer: MutPtr<CVoid>, lpdwbufferlength: MutPtr<UInt>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockEnumProtocolsA(lpiprotocols.rawAddress, lpprotocolbuffer.rawAddress, lpdwbufferlength.rawAddress)

public actual fun enumProtocolsW(lpiprotocols: ConstPtr<Int>, lpprotocolbuffer: MutPtr<CVoid>, lpdwbufferlength: MutPtr<UInt>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockEnumProtocolsW(lpiprotocols.rawAddress, lpprotocolbuffer.rawAddress, lpdwbufferlength.rawAddress)

public actual fun freeAddrInfoEx(paddrinfoex: ConstPtr<Addrinfoexa>) {
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockFreeAddrInfoEx(paddrinfoex.rawAddress)
}

public actual fun freeAddrInfoExW(paddrinfoex: ConstPtr<Addrinfoexw>) {
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockFreeAddrInfoExW(paddrinfoex.rawAddress)
}

public actual fun freeAddrInfoW(paddrinfo: ConstPtr<Addrinfow>) {
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockFreeAddrInfoW(paddrinfo.rawAddress)
}

public actual fun getAcceptExSockaddrs(lpoutputbuffer: ConstPtr<CVoid>, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, localsockaddr: MutPtr<MutPtr<Sockaddr>>, localsockaddrlength: MutPtr<Int>, remotesockaddr: MutPtr<MutPtr<Sockaddr>>, remotesockaddrlength: MutPtr<Int>) {
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockGetAcceptExSockaddrs(lpoutputbuffer.rawAddress, dwreceivedatalength.toInt(), dwlocaladdresslength.toInt(), dwremoteaddresslength.toInt(), localsockaddr.rawAddress, localsockaddrlength.rawAddress, remotesockaddr.rawAddress, remotesockaddrlength.rawAddress)
}

public actual fun getAddrInfoExA(pname: Pcstr, pservicename: Pcstr, dwnamespace: UInt, lpnspid: ConstPtr<Guid>, hints: ConstPtr<Addrinfoexa>, ppresult: MutPtr<MutPtr<Addrinfoexa>>, timeout: ConstPtr<Timeval>, lpoverlapped: ConstPtr<Overlapped>, lpcompletionroutine: LplookupserviceCompletionRoutine, lpnamehandle: MutPtr<Handle>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockGetAddrInfoExA(pname.rawAddress, pservicename.rawAddress, dwnamespace.toInt(), lpnspid.rawAddress, hints.rawAddress, ppresult.rawAddress, timeout.rawAddress, lpoverlapped.rawAddress, 0L, lpnamehandle.rawAddress)

public actual fun getAddrInfoExCancel(lphandle: ConstPtr<Handle>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockGetAddrInfoExCancel(lphandle.rawAddress)

public actual fun getAddrInfoExOverlappedResult(lpoverlapped: ConstPtr<Overlapped>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockGetAddrInfoExOverlappedResult(lpoverlapped.rawAddress)

public actual fun getAddrInfoExW(pname: Pcwstr, pservicename: Pcwstr, dwnamespace: UInt, lpnspid: ConstPtr<Guid>, hints: ConstPtr<Addrinfoexw>, ppresult: MutPtr<MutPtr<Addrinfoexw>>, timeout: ConstPtr<Timeval>, lpoverlapped: ConstPtr<Overlapped>, lpcompletionroutine: LplookupserviceCompletionRoutine, lphandle: MutPtr<Handle>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockGetAddrInfoExW(pname.rawAddress, pservicename.rawAddress, dwnamespace.toInt(), lpnspid.rawAddress, hints.rawAddress, ppresult.rawAddress, timeout.rawAddress, lpoverlapped.rawAddress, 0L, lphandle.rawAddress)

public actual fun getAddrInfoW(pnodename: Pcwstr, pservicename: Pcwstr, phints: ConstPtr<Addrinfow>, ppresult: MutPtr<MutPtr<Addrinfow>>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockGetAddrInfoW(pnodename.rawAddress, pservicename.rawAddress, phints.rawAddress, ppresult.rawAddress)

public actual fun getAddressByNameA(dwnamespace: UInt, lpservicetype: ConstPtr<Guid>, lpservicename: Pcstr, lpiprotocols: ConstPtr<Int>, dwresolution: UInt, lpserviceasyncinfo: ConstPtr<ServiceAsyncInfo>, lpcsaddrbuffer: MutPtr<CVoid>, lpdwbufferlength: MutPtr<UInt>, lpaliasbuffer: Pstr, lpdwaliasbufferlength: MutPtr<UInt>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockGetAddressByNameA(dwnamespace.toInt(), lpservicetype.rawAddress, lpservicename.rawAddress, lpiprotocols.rawAddress, dwresolution.toInt(), lpserviceasyncinfo.rawAddress, lpcsaddrbuffer.rawAddress, lpdwbufferlength.rawAddress, lpaliasbuffer.rawAddress, lpdwaliasbufferlength.rawAddress)

public actual fun getAddressByNameW(dwnamespace: UInt, lpservicetype: ConstPtr<Guid>, lpservicename: Pcwstr, lpiprotocols: ConstPtr<Int>, dwresolution: UInt, lpserviceasyncinfo: ConstPtr<ServiceAsyncInfo>, lpcsaddrbuffer: MutPtr<CVoid>, lpdwbufferlength: MutPtr<UInt>, lpaliasbuffer: Pwstr, lpdwaliasbufferlength: MutPtr<UInt>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockGetAddressByNameW(dwnamespace.toInt(), lpservicetype.rawAddress, lpservicename.rawAddress, lpiprotocols.rawAddress, dwresolution.toInt(), lpserviceasyncinfo.rawAddress, lpcsaddrbuffer.rawAddress, lpdwbufferlength.rawAddress, lpaliasbuffer.rawAddress, lpdwaliasbufferlength.rawAddress)

public actual fun getHostNameW(name: Pwstr, namelen: Int): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockGetHostNameW(name.rawAddress, namelen)

public actual fun getNameByTypeA(lpservicetype: ConstPtr<Guid>, lpservicename: Pstr, dwnamelength: UInt): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockGetNameByTypeA(lpservicetype.rawAddress, lpservicename.rawAddress, dwnamelength.toInt())

public actual fun getNameByTypeW(lpservicetype: ConstPtr<Guid>, lpservicename: Pwstr, dwnamelength: UInt): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockGetNameByTypeW(lpservicetype.rawAddress, lpservicename.rawAddress, dwnamelength.toInt())

public actual fun getNameInfoW(psockaddr: ConstPtr<Sockaddr>, sockaddrlength: SocklenT, pnodebuffer: Pwstr, nodebuffersize: UInt, pservicebuffer: Pwstr, servicebuffersize: UInt, flags: Int): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockGetNameInfoW(psockaddr.rawAddress, sockaddrlength, pnodebuffer.rawAddress, nodebuffersize.toInt(), pservicebuffer.rawAddress, servicebuffersize.toInt(), flags)

public actual fun getServiceA(dwnamespace: UInt, lpguid: ConstPtr<Guid>, lpservicename: Pcstr, dwproperties: UInt, lpbuffer: MutPtr<CVoid>, lpdwbuffersize: MutPtr<UInt>, lpserviceasyncinfo: ConstPtr<ServiceAsyncInfo>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockGetServiceA(dwnamespace.toInt(), lpguid.rawAddress, lpservicename.rawAddress, dwproperties.toInt(), lpbuffer.rawAddress, lpdwbuffersize.rawAddress, lpserviceasyncinfo.rawAddress)

public actual fun getServiceW(dwnamespace: UInt, lpguid: ConstPtr<Guid>, lpservicename: Pcwstr, dwproperties: UInt, lpbuffer: MutPtr<CVoid>, lpdwbuffersize: MutPtr<UInt>, lpserviceasyncinfo: ConstPtr<ServiceAsyncInfo>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockGetServiceW(dwnamespace.toInt(), lpguid.rawAddress, lpservicename.rawAddress, dwproperties.toInt(), lpbuffer.rawAddress, lpdwbuffersize.rawAddress, lpserviceasyncinfo.rawAddress)

public actual fun getTypeByNameA(lpservicename: Pcstr, lpservicetype: MutPtr<Guid>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockGetTypeByNameA(lpservicename.rawAddress, lpservicetype.rawAddress)

public actual fun getTypeByNameW(lpservicename: Pcwstr, lpservicetype: MutPtr<Guid>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockGetTypeByNameW(lpservicename.rawAddress, lpservicetype.rawAddress)

public actual fun inetNtopW(family: Int, paddr: ConstPtr<CVoid>, pstringbuf: Pwstr, stringbufsize: ULong): Pcwstr =
    ConstPtr(WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockInetNtopW(family, paddr.rawAddress, pstringbuf.rawAddress, stringbufsize.toLong()))

public actual fun inetPtonW(family: Int, pszaddrstring: Pcwstr, paddrbuf: MutPtr<CVoid>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockInetPtonW(family, pszaddrstring.rawAddress, paddrbuf.rawAddress)

public actual fun processSocketNotifications(completionport: Handle, registrationcount: UInt, registrationinfos: MutPtr<SockNotifyRegistration>, timeoutms: UInt, completioncount: UInt, completionportentries: MutPtr<OverlappedEntry>, receivedentrycount: MutPtr<UInt>): UInt =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockProcessSocketNotifications(completionport.rawAddress, registrationcount.toInt(), registrationinfos.rawAddress, timeoutms.toInt(), completioncount.toInt(), completionportentries.rawAddress, receivedentrycount.rawAddress).toUInt()

public actual fun rtlEthernetAddressToStringA(addr: ConstPtr<DlEui48>, s: Pstr): Pstr =
    MutPtr(WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockRtlEthernetAddressToStringA(addr.rawAddress, s.rawAddress))

public actual fun rtlEthernetAddressToStringW(addr: ConstPtr<DlEui48>, s: Pwstr): Pwstr =
    MutPtr(WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockRtlEthernetAddressToStringW(addr.rawAddress, s.rawAddress))

public actual fun rtlEthernetStringToAddressA(s: Pcstr, terminator: MutPtr<Pcstr>, addr: MutPtr<DlEui48>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockRtlEthernetStringToAddressA(s.rawAddress, terminator.rawAddress, addr.rawAddress)

public actual fun rtlEthernetStringToAddressW(s: Pcwstr, terminator: MutPtr<Pcwstr>, addr: MutPtr<DlEui48>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockRtlEthernetStringToAddressW(s.rawAddress, terminator.rawAddress, addr.rawAddress)

public actual fun rtlIpv4AddressToStringA(addr: ConstPtr<InAddr>, s: Pstr): Pstr =
    MutPtr(WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringA(addr.rawAddress, s.rawAddress))

public actual fun rtlIpv4AddressToStringExA(address: ConstPtr<InAddr>, port: UShort, addressstring: Pstr, addressstringlength: MutPtr<UInt>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringExA(address.rawAddress, port.toShort(), addressstring.rawAddress, addressstringlength.rawAddress)

public actual fun rtlIpv4AddressToStringExW(address: ConstPtr<InAddr>, port: UShort, addressstring: Pwstr, addressstringlength: MutPtr<UInt>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringExW(address.rawAddress, port.toShort(), addressstring.rawAddress, addressstringlength.rawAddress)

public actual fun rtlIpv4AddressToStringW(addr: ConstPtr<InAddr>, s: Pwstr): Pwstr =
    MutPtr(WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringW(addr.rawAddress, s.rawAddress))

public actual fun rtlIpv4StringToAddressA(s: Pcstr, strict: Boolean, terminator: MutPtr<Pcstr>, addr: MutPtr<InAddr>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressA(s.rawAddress, strict, terminator.rawAddress, addr.rawAddress)

public actual fun rtlIpv4StringToAddressExA(addressstring: Pcstr, strict: Boolean, address: MutPtr<InAddr>, port: MutPtr<UShort>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressExA(addressstring.rawAddress, strict, address.rawAddress, port.rawAddress)

public actual fun rtlIpv4StringToAddressExW(addressstring: Pcwstr, strict: Boolean, address: MutPtr<InAddr>, port: MutPtr<UShort>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressExW(addressstring.rawAddress, strict, address.rawAddress, port.rawAddress)

public actual fun rtlIpv4StringToAddressW(s: Pcwstr, strict: Boolean, terminator: MutPtr<Pcwstr>, addr: MutPtr<InAddr>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressW(s.rawAddress, strict, terminator.rawAddress, addr.rawAddress)

public actual fun rtlIpv6AddressToStringA(addr: ConstPtr<In6Addr>, s: Pstr): Pstr =
    MutPtr(WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringA(addr.rawAddress, s.rawAddress))

public actual fun rtlIpv6AddressToStringExA(address: ConstPtr<In6Addr>, scopeid: UInt, port: UShort, addressstring: Pstr, addressstringlength: MutPtr<UInt>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringExA(address.rawAddress, scopeid.toInt(), port.toShort(), addressstring.rawAddress, addressstringlength.rawAddress)

public actual fun rtlIpv6AddressToStringExW(address: ConstPtr<In6Addr>, scopeid: UInt, port: UShort, addressstring: Pwstr, addressstringlength: MutPtr<UInt>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringExW(address.rawAddress, scopeid.toInt(), port.toShort(), addressstring.rawAddress, addressstringlength.rawAddress)

public actual fun rtlIpv6AddressToStringW(addr: ConstPtr<In6Addr>, s: Pwstr): Pwstr =
    MutPtr(WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringW(addr.rawAddress, s.rawAddress))

public actual fun rtlIpv6StringToAddressA(s: Pcstr, terminator: MutPtr<Pcstr>, addr: MutPtr<In6Addr>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressA(s.rawAddress, terminator.rawAddress, addr.rawAddress)

public actual fun rtlIpv6StringToAddressExA(addressstring: Pcstr, address: MutPtr<In6Addr>, scopeid: MutPtr<UInt>, port: MutPtr<UShort>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressExA(addressstring.rawAddress, address.rawAddress, scopeid.rawAddress, port.rawAddress)

public actual fun rtlIpv6StringToAddressExW(addressstring: Pcwstr, address: MutPtr<In6Addr>, scopeid: MutPtr<UInt>, port: MutPtr<UShort>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressExW(addressstring.rawAddress, address.rawAddress, scopeid.rawAddress, port.rawAddress)

public actual fun rtlIpv6StringToAddressW(s: Pcwstr, terminator: MutPtr<Pcwstr>, addr: MutPtr<In6Addr>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressW(s.rawAddress, terminator.rawAddress, addr.rawAddress)

public actual fun setAddrInfoExA(pname: Pcstr, pservicename: Pcstr, paddresses: ConstPtr<SocketAddress>, dwaddresscount: UInt, lpblob: ConstPtr<Blob>, dwflags: UInt, dwnamespace: UInt, lpnspid: ConstPtr<Guid>, timeout: ConstPtr<Timeval>, lpoverlapped: ConstPtr<Overlapped>, lpcompletionroutine: LplookupserviceCompletionRoutine, lpnamehandle: MutPtr<Handle>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockSetAddrInfoExA(pname.rawAddress, pservicename.rawAddress, paddresses.rawAddress, dwaddresscount.toInt(), lpblob.rawAddress, dwflags.toInt(), dwnamespace.toInt(), lpnspid.rawAddress, timeout.rawAddress, lpoverlapped.rawAddress, 0L, lpnamehandle.rawAddress)

public actual fun setAddrInfoExW(pname: Pcwstr, pservicename: Pcwstr, paddresses: ConstPtr<SocketAddress>, dwaddresscount: UInt, lpblob: ConstPtr<Blob>, dwflags: UInt, dwnamespace: UInt, lpnspid: ConstPtr<Guid>, timeout: ConstPtr<Timeval>, lpoverlapped: ConstPtr<Overlapped>, lpcompletionroutine: LplookupserviceCompletionRoutine, lpnamehandle: MutPtr<Handle>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockSetAddrInfoExW(pname.rawAddress, pservicename.rawAddress, paddresses.rawAddress, dwaddresscount.toInt(), lpblob.rawAddress, dwflags.toInt(), dwnamespace.toInt(), lpnspid.rawAddress, timeout.rawAddress, lpoverlapped.rawAddress, 0L, lpnamehandle.rawAddress)

public actual fun setServiceA(dwnamespace: UInt, dwoperation: SetServiceOperation, dwflags: UInt, lpserviceinfo: ConstPtr<ServiceInfoa>, lpserviceasyncinfo: ConstPtr<ServiceAsyncInfo>, lpdwstatusflags: MutPtr<UInt>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockSetServiceA(dwnamespace.toInt(), dwoperation.toInt(), dwflags.toInt(), lpserviceinfo.rawAddress, lpserviceasyncinfo.rawAddress, lpdwstatusflags.rawAddress)

public actual fun setServiceW(dwnamespace: UInt, dwoperation: SetServiceOperation, dwflags: UInt, lpserviceinfo: ConstPtr<ServiceInfow>, lpserviceasyncinfo: ConstPtr<ServiceAsyncInfo>, lpdwstatusflags: MutPtr<UInt>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockSetServiceW(dwnamespace.toInt(), dwoperation.toInt(), dwflags.toInt(), lpserviceinfo.rawAddress, lpserviceasyncinfo.rawAddress, lpdwstatusflags.rawAddress)

public actual fun setSocketMediaStreamingMode(value: Bool): Hresult =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockSetSocketMediaStreamingMode(value)

public actual fun transmitFile(hsocket: Socket, hfile: Handle, nnumberofbytestowrite: UInt, nnumberofbytespersend: UInt, lpoverlapped: MutPtr<Overlapped>, lptransmitbuffers: ConstPtr<TransmitFileBuffers>, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockTransmitFile(hsocket.toLong(), hfile.rawAddress, nnumberofbytestowrite.toInt(), nnumberofbytespersend.toInt(), lpoverlapped.rawAddress, lptransmitbuffers.rawAddress, dwreserved.toInt())

public actual fun wPUCompleteOverlappedRequest(s: Socket, lpoverlapped: MutPtr<Overlapped>, dwerror: UInt, cbtransferred: UInt, lperrno: MutPtr<Int>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWPUCompleteOverlappedRequest(s.toLong(), lpoverlapped.rawAddress, dwerror.toInt(), cbtransferred.toInt(), lperrno.rawAddress)

public actual fun wSAAccept(s: Socket, addr: MutPtr<Sockaddr>, addrlen: MutPtr<Int>, lpfncondition: Lpconditionproc, dwcallbackdata: ULong): Socket =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAAccept(s.toLong(), addr.rawAddress, addrlen.rawAddress, 0L, dwcallbackdata.toLong()).toULong()

public actual fun wSAAddressToStringA(lpsaaddress: ConstPtr<Sockaddr>, dwaddresslength: UInt, lpprotocolinfo: ConstPtr<WsaprotocolInfoa>, lpszaddressstring: Pstr, lpdwaddressstringlength: MutPtr<UInt>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAAddressToStringA(lpsaaddress.rawAddress, dwaddresslength.toInt(), lpprotocolinfo.rawAddress, lpszaddressstring.rawAddress, lpdwaddressstringlength.rawAddress)

public actual fun wSAAddressToStringW(lpsaaddress: ConstPtr<Sockaddr>, dwaddresslength: UInt, lpprotocolinfo: ConstPtr<WsaprotocolInfow>, lpszaddressstring: Pwstr, lpdwaddressstringlength: MutPtr<UInt>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAAddressToStringW(lpsaaddress.rawAddress, dwaddresslength.toInt(), lpprotocolinfo.rawAddress, lpszaddressstring.rawAddress, lpdwaddressstringlength.rawAddress)

public actual fun wSAAdvertiseProvider(puuidproviderid: ConstPtr<Guid>, pnspv2routine: ConstPtr<Nspv2Routine>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAAdvertiseProvider(puuidproviderid.rawAddress, pnspv2routine.rawAddress)

public actual fun wSAAsyncGetHostByAddr(hwnd: Hwnd, wmsg: UInt, addr: Pcstr, len: Int, type: Int, buf: Pstr, buflen: Int): Handle =
    MutPtr(WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAAsyncGetHostByAddr(hwnd.rawAddress, wmsg.toInt(), addr.rawAddress, len, type, buf.rawAddress, buflen))

public actual fun wSAAsyncGetHostByName(hwnd: Hwnd, wmsg: UInt, name: Pcstr, buf: Pstr, buflen: Int): Handle =
    MutPtr(WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAAsyncGetHostByName(hwnd.rawAddress, wmsg.toInt(), name.rawAddress, buf.rawAddress, buflen))

public actual fun wSAAsyncGetProtoByName(hwnd: Hwnd, wmsg: UInt, name: Pcstr, buf: Pstr, buflen: Int): Handle =
    MutPtr(WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAAsyncGetProtoByName(hwnd.rawAddress, wmsg.toInt(), name.rawAddress, buf.rawAddress, buflen))

public actual fun wSAAsyncGetProtoByNumber(hwnd: Hwnd, wmsg: UInt, number: Int, buf: Pstr, buflen: Int): Handle =
    MutPtr(WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAAsyncGetProtoByNumber(hwnd.rawAddress, wmsg.toInt(), number, buf.rawAddress, buflen))

public actual fun wSAAsyncGetServByName(hwnd: Hwnd, wmsg: UInt, name: Pcstr, proto: Pcstr, buf: Pstr, buflen: Int): Handle =
    MutPtr(WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAAsyncGetServByName(hwnd.rawAddress, wmsg.toInt(), name.rawAddress, proto.rawAddress, buf.rawAddress, buflen))

public actual fun wSAAsyncGetServByPort(hwnd: Hwnd, wmsg: UInt, port: Int, proto: Pcstr, buf: Pstr, buflen: Int): Handle =
    MutPtr(WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAAsyncGetServByPort(hwnd.rawAddress, wmsg.toInt(), port, proto.rawAddress, buf.rawAddress, buflen))

public actual fun wSAAsyncSelect(s: Socket, hwnd: Hwnd, wmsg: UInt, levent: Int): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAAsyncSelect(s.toLong(), hwnd.rawAddress, wmsg.toInt(), levent)

public actual fun wSACancelAsyncRequest(hasynctaskhandle: Handle): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSACancelAsyncRequest(hasynctaskhandle.rawAddress)

public actual fun wSACancelBlockingCall(): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSACancelBlockingCall()

public actual fun wSACleanup(): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSACleanup()

public actual fun wSACloseEvent(hevent: Wsaevent): Bool =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSACloseEvent(hevent)

public actual fun wSAConnect(s: Socket, name: ConstPtr<Sockaddr>, namelen: Int, lpcallerdata: ConstPtr<Wsabuf>, lpcalleedata: MutPtr<Wsabuf>, lpsqos: ConstPtr<Qos>, lpgqos: ConstPtr<Qos>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAConnect(s.toLong(), name.rawAddress, namelen, lpcallerdata.rawAddress, lpcalleedata.rawAddress, lpsqos.rawAddress, lpgqos.rawAddress)

public actual fun wSAConnectByList(s: Socket, socketaddress: ConstPtr<SocketAddressList>, localaddresslength: MutPtr<UInt>, localaddress: MutPtr<Sockaddr>, remoteaddresslength: MutPtr<UInt>, remoteaddress: MutPtr<Sockaddr>, timeout: ConstPtr<Timeval>, reserved: ConstPtr<Overlapped>): Bool =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAConnectByList(s.toLong(), socketaddress.rawAddress, localaddresslength.rawAddress, localaddress.rawAddress, remoteaddresslength.rawAddress, remoteaddress.rawAddress, timeout.rawAddress, reserved.rawAddress)

public actual fun wSAConnectByNameA(s: Socket, nodename: Pcstr, servicename: Pcstr, localaddresslength: MutPtr<UInt>, localaddress: MutPtr<Sockaddr>, remoteaddresslength: MutPtr<UInt>, remoteaddress: MutPtr<Sockaddr>, timeout: ConstPtr<Timeval>, reserved: ConstPtr<Overlapped>): Bool =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAConnectByNameA(s.toLong(), nodename.rawAddress, servicename.rawAddress, localaddresslength.rawAddress, localaddress.rawAddress, remoteaddresslength.rawAddress, remoteaddress.rawAddress, timeout.rawAddress, reserved.rawAddress)

public actual fun wSAConnectByNameW(s: Socket, nodename: Pcwstr, servicename: Pcwstr, localaddresslength: MutPtr<UInt>, localaddress: MutPtr<Sockaddr>, remoteaddresslength: MutPtr<UInt>, remoteaddress: MutPtr<Sockaddr>, timeout: ConstPtr<Timeval>, reserved: ConstPtr<Overlapped>): Bool =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAConnectByNameW(s.toLong(), nodename.rawAddress, servicename.rawAddress, localaddresslength.rawAddress, localaddress.rawAddress, remoteaddresslength.rawAddress, remoteaddress.rawAddress, timeout.rawAddress, reserved.rawAddress)

public actual fun wSACreateEvent(): Wsaevent =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSACreateEvent()

public actual fun wSADeleteSocketPeerTargetName(socket: Socket, peeraddr: ConstPtr<Sockaddr>, peeraddrlen: UInt, overlapped: ConstPtr<Overlapped>, completionroutine: LpwsaoverlappedCompletionRoutine): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSADeleteSocketPeerTargetName(socket.toLong(), peeraddr.rawAddress, peeraddrlen.toInt(), overlapped.rawAddress, 0L)

public actual fun wSADuplicateSocketA(s: Socket, dwprocessid: UInt, lpprotocolinfo: MutPtr<WsaprotocolInfoa>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSADuplicateSocketA(s.toLong(), dwprocessid.toInt(), lpprotocolinfo.rawAddress)

public actual fun wSADuplicateSocketW(s: Socket, dwprocessid: UInt, lpprotocolinfo: MutPtr<WsaprotocolInfow>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSADuplicateSocketW(s.toLong(), dwprocessid.toInt(), lpprotocolinfo.rawAddress)

public actual fun wSAEnumNameSpaceProvidersA(lpdwbufferlength: MutPtr<UInt>, lpnspbuffer: MutPtr<WsanamespaceInfoa>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersA(lpdwbufferlength.rawAddress, lpnspbuffer.rawAddress)

public actual fun wSAEnumNameSpaceProvidersExA(lpdwbufferlength: MutPtr<UInt>, lpnspbuffer: MutPtr<WsanamespaceInfoexa>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersExA(lpdwbufferlength.rawAddress, lpnspbuffer.rawAddress)

public actual fun wSAEnumNameSpaceProvidersExW(lpdwbufferlength: MutPtr<UInt>, lpnspbuffer: MutPtr<WsanamespaceInfoexw>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersExW(lpdwbufferlength.rawAddress, lpnspbuffer.rawAddress)

public actual fun wSAEnumNameSpaceProvidersW(lpdwbufferlength: MutPtr<UInt>, lpnspbuffer: MutPtr<WsanamespaceInfow>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersW(lpdwbufferlength.rawAddress, lpnspbuffer.rawAddress)

public actual fun wSAEnumNetworkEvents(s: Socket, heventobject: Wsaevent, lpnetworkevents: MutPtr<Wsanetworkevents>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAEnumNetworkEvents(s.toLong(), heventobject, lpnetworkevents.rawAddress)

public actual fun wSAEnumProtocolsA(lpiprotocols: ConstPtr<Int>, lpprotocolbuffer: MutPtr<WsaprotocolInfoa>, lpdwbufferlength: MutPtr<UInt>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAEnumProtocolsA(lpiprotocols.rawAddress, lpprotocolbuffer.rawAddress, lpdwbufferlength.rawAddress)

public actual fun wSAEnumProtocolsW(lpiprotocols: ConstPtr<Int>, lpprotocolbuffer: MutPtr<WsaprotocolInfow>, lpdwbufferlength: MutPtr<UInt>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAEnumProtocolsW(lpiprotocols.rawAddress, lpprotocolbuffer.rawAddress, lpdwbufferlength.rawAddress)

public actual fun wSAEventSelect(s: Socket, heventobject: Wsaevent, lnetworkevents: Int): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAEventSelect(s.toLong(), heventobject, lnetworkevents)

public actual fun wSAGetLastError(): WsaError =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAGetLastError()

public actual fun wSAGetOverlappedResult(s: Socket, lpoverlapped: ConstPtr<Overlapped>, lpcbtransfer: MutPtr<UInt>, fwait: Bool, lpdwflags: MutPtr<UInt>): Bool =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAGetOverlappedResult(s.toLong(), lpoverlapped.rawAddress, lpcbtransfer.rawAddress, fwait, lpdwflags.rawAddress)

public actual fun wSAGetQOSByName(s: Socket, lpqosname: ConstPtr<Wsabuf>, lpqos: MutPtr<Qos>): Bool =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAGetQOSByName(s.toLong(), lpqosname.rawAddress, lpqos.rawAddress)

public actual fun wSAGetServiceClassInfoA(lpproviderid: ConstPtr<Guid>, lpserviceclassid: ConstPtr<Guid>, lpdwbufsize: MutPtr<UInt>, lpserviceclassinfo: MutPtr<Wsaserviceclassinfoa>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAGetServiceClassInfoA(lpproviderid.rawAddress, lpserviceclassid.rawAddress, lpdwbufsize.rawAddress, lpserviceclassinfo.rawAddress)

public actual fun wSAGetServiceClassInfoW(lpproviderid: ConstPtr<Guid>, lpserviceclassid: ConstPtr<Guid>, lpdwbufsize: MutPtr<UInt>, lpserviceclassinfo: MutPtr<Wsaserviceclassinfow>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAGetServiceClassInfoW(lpproviderid.rawAddress, lpserviceclassid.rawAddress, lpdwbufsize.rawAddress, lpserviceclassinfo.rawAddress)

public actual fun wSAGetServiceClassNameByClassIdA(lpserviceclassid: ConstPtr<Guid>, lpszserviceclassname: Pstr, lpdwbufferlength: MutPtr<UInt>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAGetServiceClassNameByClassIdA(lpserviceclassid.rawAddress, lpszserviceclassname.rawAddress, lpdwbufferlength.rawAddress)

public actual fun wSAGetServiceClassNameByClassIdW(lpserviceclassid: ConstPtr<Guid>, lpszserviceclassname: Pwstr, lpdwbufferlength: MutPtr<UInt>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAGetServiceClassNameByClassIdW(lpserviceclassid.rawAddress, lpszserviceclassname.rawAddress, lpdwbufferlength.rawAddress)

public actual fun wSAHtonl(s: Socket, hostlong: UInt, lpnetlong: MutPtr<UInt>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAHtonl(s.toLong(), hostlong.toInt(), lpnetlong.rawAddress)

public actual fun wSAHtons(s: Socket, hostshort: UShort, lpnetshort: MutPtr<UShort>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAHtons(s.toLong(), hostshort.toShort(), lpnetshort.rawAddress)

public actual fun wSAImpersonateSocketPeer(socket: Socket, peeraddr: ConstPtr<Sockaddr>, peeraddrlen: UInt): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAImpersonateSocketPeer(socket.toLong(), peeraddr.rawAddress, peeraddrlen.toInt())

public actual fun wSAInstallServiceClassA(lpserviceclassinfo: ConstPtr<Wsaserviceclassinfoa>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAInstallServiceClassA(lpserviceclassinfo.rawAddress)

public actual fun wSAInstallServiceClassW(lpserviceclassinfo: ConstPtr<Wsaserviceclassinfow>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAInstallServiceClassW(lpserviceclassinfo.rawAddress)

public actual fun wSAIoctl(s: Socket, dwiocontrolcode: UInt, lpvinbuffer: ConstPtr<CVoid>, cbinbuffer: UInt, lpvoutbuffer: MutPtr<CVoid>, cboutbuffer: UInt, lpcbbytesreturned: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAIoctl(s.toLong(), dwiocontrolcode.toInt(), lpvinbuffer.rawAddress, cbinbuffer.toInt(), lpvoutbuffer.rawAddress, cboutbuffer.toInt(), lpcbbytesreturned.rawAddress, lpoverlapped.rawAddress, 0L)

public actual fun wSAIsBlocking(): Bool =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAIsBlocking()

public actual fun wSAJoinLeaf(s: Socket, name: ConstPtr<Sockaddr>, namelen: Int, lpcallerdata: ConstPtr<Wsabuf>, lpcalleedata: MutPtr<Wsabuf>, lpsqos: ConstPtr<Qos>, lpgqos: ConstPtr<Qos>, dwflags: UInt): Socket =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAJoinLeaf(s.toLong(), name.rawAddress, namelen, lpcallerdata.rawAddress, lpcalleedata.rawAddress, lpsqos.rawAddress, lpgqos.rawAddress, dwflags.toInt()).toULong()

public actual fun wSALookupServiceBeginA(lpqsrestrictions: ConstPtr<Wsaqueryseta>, dwcontrolflags: UInt, lphlookup: MutPtr<Handle>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSALookupServiceBeginA(lpqsrestrictions.rawAddress, dwcontrolflags.toInt(), lphlookup.rawAddress)

public actual fun wSALookupServiceBeginW(lpqsrestrictions: ConstPtr<Wsaquerysetw>, dwcontrolflags: UInt, lphlookup: MutPtr<Handle>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSALookupServiceBeginW(lpqsrestrictions.rawAddress, dwcontrolflags.toInt(), lphlookup.rawAddress)

public actual fun wSALookupServiceEnd(hlookup: Handle): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSALookupServiceEnd(hlookup.rawAddress)

public actual fun wSALookupServiceNextA(hlookup: Handle, dwcontrolflags: UInt, lpdwbufferlength: MutPtr<UInt>, lpqsresults: MutPtr<Wsaqueryseta>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSALookupServiceNextA(hlookup.rawAddress, dwcontrolflags.toInt(), lpdwbufferlength.rawAddress, lpqsresults.rawAddress)

public actual fun wSALookupServiceNextW(hlookup: Handle, dwcontrolflags: UInt, lpdwbufferlength: MutPtr<UInt>, lpqsresults: MutPtr<Wsaquerysetw>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSALookupServiceNextW(hlookup.rawAddress, dwcontrolflags.toInt(), lpdwbufferlength.rawAddress, lpqsresults.rawAddress)

public actual fun wSANSPIoctl(hlookup: Handle, dwcontrolcode: UInt, lpvinbuffer: ConstPtr<CVoid>, cbinbuffer: UInt, lpvoutbuffer: MutPtr<CVoid>, cboutbuffer: UInt, lpcbbytesreturned: MutPtr<UInt>, lpcompletion: ConstPtr<Wsacompletion>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSANSPIoctl(hlookup.rawAddress, dwcontrolcode.toInt(), lpvinbuffer.rawAddress, cbinbuffer.toInt(), lpvoutbuffer.rawAddress, cboutbuffer.toInt(), lpcbbytesreturned.rawAddress, lpcompletion.rawAddress)

public actual fun wSANtohl(s: Socket, netlong: UInt, lphostlong: MutPtr<UInt>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSANtohl(s.toLong(), netlong.toInt(), lphostlong.rawAddress)

public actual fun wSANtohs(s: Socket, netshort: UShort, lphostshort: MutPtr<UShort>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSANtohs(s.toLong(), netshort.toShort(), lphostshort.rawAddress)

public actual fun wSAPoll(fdarray: MutPtr<Wsapollfd>, fds: UInt, timeout: Int): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAPoll(fdarray.rawAddress, fds.toInt(), timeout)

public actual fun wSAProviderCompleteAsyncCall(hasynccall: Handle, iretcode: Int): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAProviderCompleteAsyncCall(hasynccall.rawAddress, iretcode)

public actual fun wSAProviderConfigChange(lpnotificationhandle: MutPtr<Handle>, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAProviderConfigChange(lpnotificationhandle.rawAddress, lpoverlapped.rawAddress, 0L)

public actual fun wSAQuerySocketSecurity(socket: Socket, securityquerytemplate: ConstPtr<SocketSecurityQueryTemplate>, securityquerytemplatelen: UInt, securityqueryinfo: MutPtr<SocketSecurityQueryInfo>, securityqueryinfolen: MutPtr<UInt>, overlapped: ConstPtr<Overlapped>, completionroutine: LpwsaoverlappedCompletionRoutine): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAQuerySocketSecurity(socket.toLong(), securityquerytemplate.rawAddress, securityquerytemplatelen.toInt(), securityqueryinfo.rawAddress, securityqueryinfolen.rawAddress, overlapped.rawAddress, 0L)

public actual fun wSARecv(s: Socket, lpbuffers: ConstPtr<Wsabuf>, dwbuffercount: UInt, lpnumberofbytesrecvd: MutPtr<UInt>, lpflags: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSARecv(s.toLong(), lpbuffers.rawAddress, dwbuffercount.toInt(), lpnumberofbytesrecvd.rawAddress, lpflags.rawAddress, lpoverlapped.rawAddress, 0L)

public actual fun wSARecvDisconnect(s: Socket, lpinbounddisconnectdata: ConstPtr<Wsabuf>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSARecvDisconnect(s.toLong(), lpinbounddisconnectdata.rawAddress)

public actual fun wSARecvEx(s: Socket, buf: Pstr, len: Int, flags: MutPtr<Int>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSARecvEx(s.toLong(), buf.rawAddress, len, flags.rawAddress)

public actual fun wSARecvFrom(s: Socket, lpbuffers: ConstPtr<Wsabuf>, dwbuffercount: UInt, lpnumberofbytesrecvd: MutPtr<UInt>, lpflags: MutPtr<UInt>, lpfrom: MutPtr<Sockaddr>, lpfromlen: MutPtr<Int>, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSARecvFrom(s.toLong(), lpbuffers.rawAddress, dwbuffercount.toInt(), lpnumberofbytesrecvd.rawAddress, lpflags.rawAddress, lpfrom.rawAddress, lpfromlen.rawAddress, lpoverlapped.rawAddress, 0L)

public actual fun wSARemoveServiceClass(lpserviceclassid: ConstPtr<Guid>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSARemoveServiceClass(lpserviceclassid.rawAddress)

public actual fun wSAResetEvent(hevent: Wsaevent): Bool =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAResetEvent(hevent)

public actual fun wSARevertImpersonation(): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSARevertImpersonation()

public actual fun wSASend(s: Socket, lpbuffers: ConstPtr<Wsabuf>, dwbuffercount: UInt, lpnumberofbytessent: MutPtr<UInt>, dwflags: UInt, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSASend(s.toLong(), lpbuffers.rawAddress, dwbuffercount.toInt(), lpnumberofbytessent.rawAddress, dwflags.toInt(), lpoverlapped.rawAddress, 0L)

public actual fun wSASendDisconnect(s: Socket, lpoutbounddisconnectdata: ConstPtr<Wsabuf>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSASendDisconnect(s.toLong(), lpoutbounddisconnectdata.rawAddress)

public actual fun wSASendMsg(handle: Socket, lpmsg: ConstPtr<Wsamsg>, dwflags: UInt, lpnumberofbytessent: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSASendMsg(handle.toLong(), lpmsg.rawAddress, dwflags.toInt(), lpnumberofbytessent.rawAddress, lpoverlapped.rawAddress, 0L)

public actual fun wSASendTo(s: Socket, lpbuffers: ConstPtr<Wsabuf>, dwbuffercount: UInt, lpnumberofbytessent: MutPtr<UInt>, dwflags: UInt, lpto: ConstPtr<Sockaddr>, itolen: Int, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSASendTo(s.toLong(), lpbuffers.rawAddress, dwbuffercount.toInt(), lpnumberofbytessent.rawAddress, dwflags.toInt(), lpto.rawAddress, itolen, lpoverlapped.rawAddress, 0L)

public actual fun wSASetBlockingHook(lpblockfunc: Farproc): Farproc =
    null

public actual fun wSASetEvent(hevent: Wsaevent): Bool =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSASetEvent(hevent)

public actual fun wSASetLastError(ierror: Int) {
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSASetLastError(ierror)
}

public actual fun wSASetServiceA(lpqsreginfo: ConstPtr<Wsaqueryseta>, essoperation: Wsaesetserviceop, dwcontrolflags: UInt): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSASetServiceA(lpqsreginfo.rawAddress, essoperation, dwcontrolflags.toInt())

public actual fun wSASetServiceW(lpqsreginfo: ConstPtr<Wsaquerysetw>, essoperation: Wsaesetserviceop, dwcontrolflags: UInt): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSASetServiceW(lpqsreginfo.rawAddress, essoperation, dwcontrolflags.toInt())

public actual fun wSASetSocketPeerTargetName(socket: Socket, peertargetname: ConstPtr<SocketPeerTargetName>, peertargetnamelen: UInt, overlapped: ConstPtr<Overlapped>, completionroutine: LpwsaoverlappedCompletionRoutine): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSASetSocketPeerTargetName(socket.toLong(), peertargetname.rawAddress, peertargetnamelen.toInt(), overlapped.rawAddress, 0L)

public actual fun wSASetSocketSecurity(socket: Socket, securitysettings: ConstPtr<SocketSecuritySettings>, securitysettingslen: UInt, overlapped: ConstPtr<Overlapped>, completionroutine: LpwsaoverlappedCompletionRoutine): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSASetSocketSecurity(socket.toLong(), securitysettings.rawAddress, securitysettingslen.toInt(), overlapped.rawAddress, 0L)

public actual fun wSASocketA(af: Int, type: Int, protocol: Int, lpprotocolinfo: ConstPtr<WsaprotocolInfoa>, g: UInt, dwflags: UInt): Socket =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSASocketA(af, type, protocol, lpprotocolinfo.rawAddress, g.toInt(), dwflags.toInt()).toULong()

public actual fun wSASocketW(af: Int, type: Int, protocol: Int, lpprotocolinfo: ConstPtr<WsaprotocolInfow>, g: UInt, dwflags: UInt): Socket =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSASocketW(af, type, protocol, lpprotocolinfo.rawAddress, g.toInt(), dwflags.toInt()).toULong()

public actual fun wSAStartup(wversionrequested: UShort, lpwsadata: MutPtr<Wsadata>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAStartup(wversionrequested.toShort(), lpwsadata.rawAddress)

public actual fun wSAStringToAddressA(addressstring: Pcstr, addressfamily: Int, lpprotocolinfo: ConstPtr<WsaprotocolInfoa>, lpaddress: MutPtr<Sockaddr>, lpaddresslength: MutPtr<Int>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAStringToAddressA(addressstring.rawAddress, addressfamily, lpprotocolinfo.rawAddress, lpaddress.rawAddress, lpaddresslength.rawAddress)

public actual fun wSAStringToAddressW(addressstring: Pcwstr, addressfamily: Int, lpprotocolinfo: ConstPtr<WsaprotocolInfow>, lpaddress: MutPtr<Sockaddr>, lpaddresslength: MutPtr<Int>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAStringToAddressW(addressstring.rawAddress, addressfamily, lpprotocolinfo.rawAddress, lpaddress.rawAddress, lpaddresslength.rawAddress)

public actual fun wSAUnadvertiseProvider(puuidproviderid: ConstPtr<Guid>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAUnadvertiseProvider(puuidproviderid.rawAddress)

public actual fun wSAUnhookBlockingHook(): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAUnhookBlockingHook()

public actual fun wSAWaitForMultipleEvents(cevents: UInt, lphevents: ConstPtr<Handle>, fwaitall: Bool, dwtimeout: UInt, falertable: Bool): WaitEvent =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSAWaitForMultipleEvents(cevents.toInt(), lphevents.rawAddress, fwaitall, dwtimeout.toInt(), falertable).toUInt()

public actual fun wSCDeinstallProvider(lpproviderid: ConstPtr<Guid>, lperrno: MutPtr<Int>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSCDeinstallProvider(lpproviderid.rawAddress, lperrno.rawAddress)

public actual fun wSCDeinstallProvider32(lpproviderid: ConstPtr<Guid>, lperrno: MutPtr<Int>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSCDeinstallProvider32(lpproviderid.rawAddress, lperrno.rawAddress)

public actual fun wSCEnableNSProvider(lpproviderid: ConstPtr<Guid>, fenable: Bool): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSCEnableNSProvider(lpproviderid.rawAddress, fenable)

public actual fun wSCEnableNSProvider32(lpproviderid: ConstPtr<Guid>, fenable: Bool): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSCEnableNSProvider32(lpproviderid.rawAddress, fenable)

public actual fun wSCEnumNameSpaceProviders32(lpdwbufferlength: MutPtr<UInt>, lpnspbuffer: MutPtr<WsanamespaceInfow>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSCEnumNameSpaceProviders32(lpdwbufferlength.rawAddress, lpnspbuffer.rawAddress)

public actual fun wSCEnumNameSpaceProvidersEx32(lpdwbufferlength: MutPtr<UInt>, lpnspbuffer: MutPtr<WsanamespaceInfoexw>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSCEnumNameSpaceProvidersEx32(lpdwbufferlength.rawAddress, lpnspbuffer.rawAddress)

public actual fun wSCEnumProtocols(lpiprotocols: ConstPtr<Int>, lpprotocolbuffer: MutPtr<WsaprotocolInfow>, lpdwbufferlength: MutPtr<UInt>, lperrno: MutPtr<Int>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSCEnumProtocols(lpiprotocols.rawAddress, lpprotocolbuffer.rawAddress, lpdwbufferlength.rawAddress, lperrno.rawAddress)

public actual fun wSCEnumProtocols32(lpiprotocols: ConstPtr<Int>, lpprotocolbuffer: MutPtr<WsaprotocolInfow>, lpdwbufferlength: MutPtr<UInt>, lperrno: MutPtr<Int>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSCEnumProtocols32(lpiprotocols.rawAddress, lpprotocolbuffer.rawAddress, lpdwbufferlength.rawAddress, lperrno.rawAddress)

public actual fun wSCGetApplicationCategory(path: Pcwstr, pathlength: UInt, extra: Pcwstr, extralength: UInt, ppermittedlspcategories: MutPtr<UInt>, lperrno: MutPtr<Int>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSCGetApplicationCategory(path.rawAddress, pathlength.toInt(), extra.rawAddress, extralength.toInt(), ppermittedlspcategories.rawAddress, lperrno.rawAddress)

public actual fun wSCGetProviderInfo(lpproviderid: ConstPtr<Guid>, infotype: WscProviderInfoType, info: MutPtr<UByte>, infosize: MutPtr<ULong>, flags: UInt, lperrno: MutPtr<Int>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSCGetProviderInfo(lpproviderid.rawAddress, infotype, info.rawAddress, infosize.rawAddress, flags.toInt(), lperrno.rawAddress)

public actual fun wSCGetProviderInfo32(lpproviderid: ConstPtr<Guid>, infotype: WscProviderInfoType, info: MutPtr<UByte>, infosize: MutPtr<ULong>, flags: UInt, lperrno: MutPtr<Int>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSCGetProviderInfo32(lpproviderid.rawAddress, infotype, info.rawAddress, infosize.rawAddress, flags.toInt(), lperrno.rawAddress)

public actual fun wSCGetProviderPath(lpproviderid: ConstPtr<Guid>, lpszproviderdllpath: Pwstr, lpproviderdllpathlen: MutPtr<Int>, lperrno: MutPtr<Int>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSCGetProviderPath(lpproviderid.rawAddress, lpszproviderdllpath.rawAddress, lpproviderdllpathlen.rawAddress, lperrno.rawAddress)

public actual fun wSCGetProviderPath32(lpproviderid: ConstPtr<Guid>, lpszproviderdllpath: Pwstr, lpproviderdllpathlen: MutPtr<Int>, lperrno: MutPtr<Int>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSCGetProviderPath32(lpproviderid.rawAddress, lpszproviderdllpath.rawAddress, lpproviderdllpathlen.rawAddress, lperrno.rawAddress)

public actual fun wSCInstallNameSpace(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: ConstPtr<Guid>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSCInstallNameSpace(lpszidentifier.rawAddress, lpszpathname.rawAddress, dwnamespace.toInt(), dwversion.toInt(), lpproviderid.rawAddress)

public actual fun wSCInstallNameSpace32(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: ConstPtr<Guid>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSCInstallNameSpace32(lpszidentifier.rawAddress, lpszpathname.rawAddress, dwnamespace.toInt(), dwversion.toInt(), lpproviderid.rawAddress)

public actual fun wSCInstallNameSpaceEx(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: ConstPtr<Guid>, lpproviderspecific: ConstPtr<Blob>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSCInstallNameSpaceEx(lpszidentifier.rawAddress, lpszpathname.rawAddress, dwnamespace.toInt(), dwversion.toInt(), lpproviderid.rawAddress, lpproviderspecific.rawAddress)

public actual fun wSCInstallNameSpaceEx32(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: ConstPtr<Guid>, lpproviderspecific: ConstPtr<Blob>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSCInstallNameSpaceEx32(lpszidentifier.rawAddress, lpszpathname.rawAddress, dwnamespace.toInt(), dwversion.toInt(), lpproviderid.rawAddress, lpproviderspecific.rawAddress)

public actual fun wSCInstallProvider(lpproviderid: ConstPtr<Guid>, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: ConstPtr<WsaprotocolInfow>, dwnumberofentries: UInt, lperrno: MutPtr<Int>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSCInstallProvider(lpproviderid.rawAddress, lpszproviderdllpath.rawAddress, lpprotocolinfolist.rawAddress, dwnumberofentries.toInt(), lperrno.rawAddress)

public actual fun wscinstallProvider6432(lpproviderid: ConstPtr<Guid>, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: ConstPtr<WsaprotocolInfow>, dwnumberofentries: UInt, lperrno: MutPtr<Int>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWscinstallProvider6432(lpproviderid.rawAddress, lpszproviderdllpath.rawAddress, lpprotocolinfolist.rawAddress, dwnumberofentries.toInt(), lperrno.rawAddress)

public actual fun wscinstallProviderAndChains6432(lpproviderid: ConstPtr<Guid>, lpszproviderdllpath: Pcwstr, lpszproviderdllpath32: Pcwstr, lpszlspname: Pcwstr, dwserviceflags: UInt, lpprotocolinfolist: MutPtr<WsaprotocolInfow>, dwnumberofentries: UInt, lpdwcatalogentryid: MutPtr<UInt>, lperrno: MutPtr<Int>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWscinstallProviderAndChains6432(lpproviderid.rawAddress, lpszproviderdllpath.rawAddress, lpszproviderdllpath32.rawAddress, lpszlspname.rawAddress, dwserviceflags.toInt(), lpprotocolinfolist.rawAddress, dwnumberofentries.toInt(), lpdwcatalogentryid.rawAddress, lperrno.rawAddress)

public actual fun wSCSetApplicationCategory(path: Pcwstr, pathlength: UInt, extra: Pcwstr, extralength: UInt, permittedlspcategories: UInt, pprevpermlspcat: MutPtr<UInt>, lperrno: MutPtr<Int>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSCSetApplicationCategory(path.rawAddress, pathlength.toInt(), extra.rawAddress, extralength.toInt(), permittedlspcategories.toInt(), pprevpermlspcat.rawAddress, lperrno.rawAddress)

public actual fun wSCSetProviderInfo(lpproviderid: ConstPtr<Guid>, infotype: WscProviderInfoType, info: ConstPtr<UByte>, infosize: ULong, flags: UInt, lperrno: MutPtr<Int>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSCSetProviderInfo(lpproviderid.rawAddress, infotype, info.rawAddress, infosize.toLong(), flags.toInt(), lperrno.rawAddress)

public actual fun wSCSetProviderInfo32(lpproviderid: ConstPtr<Guid>, infotype: WscProviderInfoType, info: ConstPtr<UByte>, infosize: ULong, flags: UInt, lperrno: MutPtr<Int>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSCSetProviderInfo32(lpproviderid.rawAddress, infotype, info.rawAddress, infosize.toLong(), flags.toInt(), lperrno.rawAddress)

public actual fun wSCUnInstallNameSpace(lpproviderid: ConstPtr<Guid>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSCUnInstallNameSpace(lpproviderid.rawAddress)

public actual fun wSCUnInstallNameSpace32(lpproviderid: ConstPtr<Guid>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSCUnInstallNameSpace32(lpproviderid.rawAddress)

public actual fun wSCUpdateProvider(lpproviderid: ConstPtr<Guid>, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: ConstPtr<WsaprotocolInfow>, dwnumberofentries: UInt, lperrno: MutPtr<Int>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSCUpdateProvider(lpproviderid.rawAddress, lpszproviderdllpath.rawAddress, lpprotocolinfolist.rawAddress, dwnumberofentries.toInt(), lperrno.rawAddress)

public actual fun wSCUpdateProvider32(lpproviderid: ConstPtr<Guid>, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: ConstPtr<WsaprotocolInfow>, dwnumberofentries: UInt, lperrno: MutPtr<Int>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSCUpdateProvider32(lpproviderid.rawAddress, lpszproviderdllpath.rawAddress, lpprotocolinfolist.rawAddress, dwnumberofentries.toInt(), lperrno.rawAddress)

public actual fun wSCWriteNameSpaceOrder(lpproviderid: MutPtr<Guid>, dwnumberofentries: UInt): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSCWriteNameSpaceOrder(lpproviderid.rawAddress, dwnumberofentries.toInt())

public actual fun wSCWriteNameSpaceOrder32(lpproviderid: MutPtr<Guid>, dwnumberofentries: UInt): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSCWriteNameSpaceOrder32(lpproviderid.rawAddress, dwnumberofentries.toInt())

public actual fun wSCWriteProviderOrder(lpwdcatalogentryid: MutPtr<UInt>, dwnumberofentries: UInt): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSCWriteProviderOrder(lpwdcatalogentryid.rawAddress, dwnumberofentries.toInt())

public actual fun wSCWriteProviderOrder32(lpwdcatalogentryid: MutPtr<UInt>, dwnumberofentries: UInt): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWSCWriteProviderOrder32(lpwdcatalogentryid.rawAddress, dwnumberofentries.toInt())

public actual fun wsafdisSet(fd: Socket, param1: MutPtr<FdSet>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockWsafdisSet(fd.toLong(), param1.rawAddress)

public actual fun accept(s: Socket, addr: MutPtr<Sockaddr>, addrlen: MutPtr<Int>): Socket =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockAccept(s.toLong(), addr.rawAddress, addrlen.rawAddress).toULong()

public actual fun bind(s: Socket, name: ConstPtr<Sockaddr>, namelen: Int): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockBind(s.toLong(), name.rawAddress, namelen)

public actual fun closesocket(s: Socket): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockClosesocket(s.toLong())

public actual fun connect(s: Socket, name: ConstPtr<Sockaddr>, namelen: Int): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockConnect(s.toLong(), name.rawAddress, namelen)

public actual fun freeaddrinfo(paddrinfo: ConstPtr<Addrinfoa>) {
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockFreeaddrinfo(paddrinfo.rawAddress)
}

public actual fun getaddrinfo(pnodename: Pcstr, pservicename: Pcstr, phints: ConstPtr<Addrinfoa>, ppresult: MutPtr<MutPtr<Addrinfoa>>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockGetaddrinfo(pnodename.rawAddress, pservicename.rawAddress, phints.rawAddress, ppresult.rawAddress)

public actual fun gethostbyaddr(addr: Pcstr, len: Int, type: Int): MutPtr<Hostent> =
    MutPtr(WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockGethostbyaddr(addr.rawAddress, len, type))

public actual fun gethostbyname(name: Pcstr): MutPtr<Hostent> =
    MutPtr(WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockGethostbyname(name.rawAddress))

public actual fun gethostname(name: Pstr, namelen: Int): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockGethostname(name.rawAddress, namelen)

public actual fun getnameinfo(psockaddr: ConstPtr<Sockaddr>, sockaddrlength: SocklenT, pnodebuffer: Pstr, nodebuffersize: UInt, pservicebuffer: Pstr, servicebuffersize: UInt, flags: Int): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockGetnameinfo(psockaddr.rawAddress, sockaddrlength, pnodebuffer.rawAddress, nodebuffersize.toInt(), pservicebuffer.rawAddress, servicebuffersize.toInt(), flags)

public actual fun getpeername(s: Socket, name: MutPtr<Sockaddr>, namelen: MutPtr<Int>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockGetpeername(s.toLong(), name.rawAddress, namelen.rawAddress)

public actual fun getprotobyname(name: Pcstr): MutPtr<Protoent> =
    MutPtr(WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockGetprotobyname(name.rawAddress))

public actual fun getprotobynumber(number: Int): MutPtr<Protoent> =
    MutPtr(WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockGetprotobynumber(number))

public actual fun getservbyname(name: Pcstr, proto: Pcstr): MutPtr<Servent> =
    MutPtr(WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockGetservbyname(name.rawAddress, proto.rawAddress))

public actual fun getservbyport(port: Int, proto: Pcstr): MutPtr<Servent> =
    MutPtr(WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockGetservbyport(port, proto.rawAddress))

public actual fun getsockname(s: Socket, name: MutPtr<Sockaddr>, namelen: MutPtr<Int>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockGetsockname(s.toLong(), name.rawAddress, namelen.rawAddress)

public actual fun getsockopt(s: Socket, level: Int, optname: Int, optval: Pstr, optlen: MutPtr<Int>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockGetsockopt(s.toLong(), level, optname, optval.rawAddress, optlen.rawAddress)

public actual fun htonl(hostlong: UInt): UInt =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockHtonl(hostlong.toInt()).toUInt()

public actual fun htons(hostshort: UShort): UShort =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockHtons(hostshort.toShort()).toUShort()

public actual fun inetAddr(cp: Pcstr): UInt =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockInetAddr(cp.rawAddress).toUInt()

public actual fun inetNtoa(input: InAddr): Pstr =
    MutPtr(0L)

public actual fun inetNtop(family: Int, paddr: ConstPtr<CVoid>, pstringbuf: Pstr, stringbufsize: ULong): Pcstr =
    ConstPtr(WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockInetNtop(family, paddr.rawAddress, pstringbuf.rawAddress, stringbufsize.toLong()))

public actual fun inetPton(family: Int, pszaddrstring: Pcstr, paddrbuf: MutPtr<CVoid>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockInetPton(family, pszaddrstring.rawAddress, paddrbuf.rawAddress)

public actual fun ioctlsocket(s: Socket, cmd: Int, argp: MutPtr<UInt>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockIoctlsocket(s.toLong(), cmd, argp.rawAddress)

public actual fun listen(s: Socket, backlog: Int): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockListen(s.toLong(), backlog)

public actual fun ntohl(netlong: UInt): UInt =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockNtohl(netlong.toInt()).toUInt()

public actual fun ntohs(netshort: UShort): UShort =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockNtohs(netshort.toShort()).toUShort()

public actual fun recv(s: Socket, buf: Pstr, len: Int, flags: SendRecvFlags): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockRecv(s.toLong(), buf.rawAddress, len, flags)

public actual fun recvfrom(s: Socket, buf: Pstr, len: Int, flags: Int, from: MutPtr<Sockaddr>, fromlen: MutPtr<Int>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockRecvfrom(s.toLong(), buf.rawAddress, len, flags, from.rawAddress, fromlen.rawAddress)

public actual fun select(nfds: Int, readfds: MutPtr<FdSet>, writefds: MutPtr<FdSet>, exceptfds: MutPtr<FdSet>, timeout: ConstPtr<Timeval>): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockSelect(nfds, readfds.rawAddress, writefds.rawAddress, exceptfds.rawAddress, timeout.rawAddress)

public actual fun send(s: Socket, buf: Pcstr, len: Int, flags: SendRecvFlags): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockSend(s.toLong(), buf.rawAddress, len, flags)

public actual fun sendto(s: Socket, buf: Pcstr, len: Int, flags: Int, to: ConstPtr<Sockaddr>, tolen: Int): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockSendto(s.toLong(), buf.rawAddress, len, flags, to.rawAddress, tolen)

public actual fun setsockopt(s: Socket, level: Int, optname: Int, optval: Pcstr, optlen: Int): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockSetsockopt(s.toLong(), level, optname, optval.rawAddress, optlen)

public actual fun shutdown(s: Socket, how: WinsockShutdownHow): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockShutdown(s.toLong(), how)

public actual fun socket(af: Int, type: WinsockSocketType, protocol: Int): Socket =
    WindowsWin32NetworkingWinsockJniBridge.windowssysWindowsWin32NetworkingWinsockSocket(af, type, protocol).toULong()
