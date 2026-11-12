@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.wininet

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.WinHttpCreateUrlFlags
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.AlgId

private object WindowsWin32NetworkingWininetJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetAppCacheCheckManifest(pwszmasterurl: Long, pwszmanifesturl: Long, pbmanifestdata: Long, dwmanifestdatasize: Int, pbmanifestresponseheaders: Long, dwmanifestresponseheaderssize: Int, pestate: Long, phnewappcache: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetAppCacheCloseHandle(happcache: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetAppCacheCreateAndCommitFile(happcache: Long, pwszsourcefilepath: Long, pwszurl: Long, pbresponseheaders: Long, dwresponseheaderssize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetAppCacheDeleteGroup(pwszmanifesturl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetAppCacheDeleteIEGroup(pwszmanifesturl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetAppCacheDuplicateHandle(happcache: Long, phduplicatedappcache: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetAppCacheFinalize(happcache: Long, pbmanifestdata: Long, dwmanifestdatasize: Int, pestate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetAppCacheFreeDownloadList(pdownloadlist: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetAppCacheFreeGroupList(pappcachegrouplist: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetAppCacheGetDownloadList(happcache: Long, pdownloadlist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetAppCacheGetFallbackUrl(happcache: Long, pwszurl: Long, ppwszfallbackurl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetAppCacheGetGroupList(pappcachegrouplist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetAppCacheGetIEGroupList(pappcachegrouplist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetAppCacheGetInfo(happcache: Long, pappcacheinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetAppCacheGetManifestUrl(happcache: Long, ppwszmanifesturl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetAppCacheLookup(pwszurl: Long, dwflags: Int, phappcache: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetCreateMD5SSOHash(pszchallengeinfo: Long, pwszrealm: Long, pwsztarget: Long, pbhexhash: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetCreateUrlCacheContainerA(name: Long, lpcacheprefix: Long, lpszcachepath: Long, kbcachelimit: Int, dwcontainertype: Int, dwoptions: Int, pvbuffer: Long, cbbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetCreateUrlCacheContainerW(name: Long, lpcacheprefix: Long, lpszcachepath: Long, kbcachelimit: Int, dwcontainertype: Int, dwoptions: Int, pvbuffer: Long, cbbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetCreateUrlCacheEntryA(lpszurlname: Long, dwexpectedfilesize: Int, lpszfileextension: Long, lpszfilename: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetCreateUrlCacheEntryExW(lpszurlname: Long, dwexpectedfilesize: Int, lpszfileextension: Long, lpszfilename: Long, dwreserved: Int, fpreserveincomingfilename: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetCreateUrlCacheEntryW(lpszurlname: Long, dwexpectedfilesize: Int, lpszfileextension: Long, lpszfilename: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetCreateUrlCacheGroup(dwflags: Int, lpreserved: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetDeleteIE3Cache(hwnd: Long, hinst: Long, lpszcmd: Long, ncmdshow: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetDeleteUrlCacheContainerA(name: Long, dwoptions: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetDeleteUrlCacheContainerW(name: Long, dwoptions: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetDeleteUrlCacheEntry(lpszurlname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetDeleteUrlCacheEntryA(lpszurlname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetDeleteUrlCacheEntryW(lpszurlname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetDeleteUrlCacheGroup(groupid: Long, dwflags: Int, lpreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetDeleteWpadCacheForNetworks(param0: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetDetectAutoProxyUrl(pszautoproxyurl: Long, cchautoproxyurl: Int, dwdetectflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetDoConnectoidsExist(): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetExportCookieFileA(szfilename: Long, fappend: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetExportCookieFileW(szfilename: Long, fappend: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFindCloseUrlCache(henumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheContainerA(pdwmodified: Long, lpcontainerinfo: Long, lpcbcontainerinfo: Long, dwoptions: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheContainerW(pdwmodified: Long, lpcontainerinfo: Long, lpcbcontainerinfo: Long, dwoptions: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheEntryA(lpszurlsearchpattern: Long, lpfirstcacheentryinfo: Long, lpcbcacheentryinfo: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheEntryExA(lpszurlsearchpattern: Long, dwflags: Int, dwfilter: Int, groupid: Long, lpfirstcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpgroupattributes: Long, lpcbgroupattributes: Long, lpreserved: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheEntryExW(lpszurlsearchpattern: Long, dwflags: Int, dwfilter: Int, groupid: Long, lpfirstcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpgroupattributes: Long, lpcbgroupattributes: Long, lpreserved: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheEntryW(lpszurlsearchpattern: Long, lpfirstcacheentryinfo: Long, lpcbcacheentryinfo: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheGroup(dwflags: Int, dwfilter: Int, lpsearchcondition: Long, dwsearchcondition: Int, lpgroupid: Long, lpreserved: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFindNextUrlCacheContainerA(henumhandle: Long, lpcontainerinfo: Long, lpcbcontainerinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFindNextUrlCacheContainerW(henumhandle: Long, lpcontainerinfo: Long, lpcbcontainerinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFindNextUrlCacheEntryA(henumhandle: Long, lpnextcacheentryinfo: Long, lpcbcacheentryinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFindNextUrlCacheEntryExA(henumhandle: Long, lpnextcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpgroupattributes: Long, lpcbgroupattributes: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFindNextUrlCacheEntryExW(henumhandle: Long, lpnextcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpgroupattributes: Long, lpcbgroupattributes: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFindNextUrlCacheEntryW(henumhandle: Long, lpnextcacheentryinfo: Long, lpcbcacheentryinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFindNextUrlCacheGroup(hfind: Long, lpgroupid: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFindP3PPolicySymbol(pszsymbol: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFreeUrlCacheSpaceA(lpszcachepath: Long, dwsize: Int, dwfilter: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFreeUrlCacheSpaceW(lpszcachepath: Long, dwsize: Int, dwfilter: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFtpCommandA(hconnect: Long, fexpectresponse: Int, dwflags: Int, lpszcommand: Long, dwcontext: Long, phftpcommand: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFtpCommandW(hconnect: Long, fexpectresponse: Int, dwflags: Int, lpszcommand: Long, dwcontext: Long, phftpcommand: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFtpCreateDirectoryA(hconnect: Long, lpszdirectory: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFtpCreateDirectoryW(hconnect: Long, lpszdirectory: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFtpDeleteFileA(hconnect: Long, lpszfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFtpDeleteFileW(hconnect: Long, lpszfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFtpFindFirstFileA(hconnect: Long, lpszsearchfile: Long, lpfindfiledata: Long, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFtpFindFirstFileW(hconnect: Long, lpszsearchfile: Long, lpfindfiledata: Long, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFtpGetCurrentDirectoryA(hconnect: Long, lpszcurrentdirectory: Long, lpdwcurrentdirectory: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFtpGetCurrentDirectoryW(hconnect: Long, lpszcurrentdirectory: Long, lpdwcurrentdirectory: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFtpGetFileA(hconnect: Long, lpszremotefile: Long, lpsznewfile: Long, ffailifexists: Int, dwflagsandattributes: Int, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFtpGetFileEx(hftpsession: Long, lpszremotefile: Long, lpsznewfile: Long, ffailifexists: Int, dwflagsandattributes: Int, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFtpGetFileSize(hfile: Long, lpdwfilesizehigh: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFtpGetFileW(hconnect: Long, lpszremotefile: Long, lpsznewfile: Long, ffailifexists: Int, dwflagsandattributes: Int, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFtpOpenFileA(hconnect: Long, lpszfilename: Long, dwaccess: Int, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFtpOpenFileW(hconnect: Long, lpszfilename: Long, dwaccess: Int, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFtpPutFileA(hconnect: Long, lpszlocalfile: Long, lpsznewremotefile: Long, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFtpPutFileEx(hftpsession: Long, lpszlocalfile: Long, lpsznewremotefile: Long, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFtpPutFileW(hconnect: Long, lpszlocalfile: Long, lpsznewremotefile: Long, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFtpRemoveDirectoryA(hconnect: Long, lpszdirectory: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFtpRemoveDirectoryW(hconnect: Long, lpszdirectory: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFtpRenameFileA(hconnect: Long, lpszexisting: Long, lpsznew: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFtpRenameFileW(hconnect: Long, lpszexisting: Long, lpsznew: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFtpSetCurrentDirectoryA(hconnect: Long, lpszdirectory: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetFtpSetCurrentDirectoryW(hconnect: Long, lpszdirectory: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetGetDiskInfoA(pszpath: Long, pdwclustersize: Long, pdlavail: Long, pdltotal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetGetUrlCacheConfigInfoA(lpcacheconfiginfo: Long, lpcbcacheconfiginfo: Long, dwfieldcontrol: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetGetUrlCacheConfigInfoW(lpcacheconfiginfo: Long, lpcbcacheconfiginfo: Long, dwfieldcontrol: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetGetUrlCacheEntryBinaryBlob(pwszurlname: Long, dwtype: Long, pftexpiretime: Long, pftaccesstime: Long, pftmodifiedtime: Long, ppbblob: Long, pcbblob: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetGetUrlCacheEntryInfoA(lpszurlname: Long, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetGetUrlCacheEntryInfoExA(lpszurl: Long, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpszredirecturl: Long, lpcbredirecturl: Long, lpreserved: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetGetUrlCacheEntryInfoExW(lpszurl: Long, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpszredirecturl: Long, lpcbredirecturl: Long, lpreserved: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetGetUrlCacheEntryInfoW(lpszurlname: Long, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetGetUrlCacheGroupAttributeA(gid: Long, dwflags: Int, dwattributes: Int, lpgroupinfo: Long, lpcbgroupinfo: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetGetUrlCacheGroupAttributeW(gid: Long, dwflags: Int, dwattributes: Int, lpgroupinfo: Long, lpcbgroupinfo: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetGetUrlCacheHeaderData(nidx: Int, lpdwdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetGopherCreateLocatorA(lpszhost: Long, nserverport: Short, lpszdisplaystring: Long, lpszselectorstring: Long, dwgophertype: Int, lpszlocator: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetGopherCreateLocatorW(lpszhost: Long, nserverport: Short, lpszdisplaystring: Long, lpszselectorstring: Long, dwgophertype: Int, lpszlocator: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetGopherFindFirstFileA(hconnect: Long, lpszlocator: Long, lpszsearchstring: Long, lpfinddata: Long, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetGopherFindFirstFileW(hconnect: Long, lpszlocator: Long, lpszsearchstring: Long, lpfinddata: Long, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetGopherGetAttributeA(hconnect: Long, lpszlocator: Long, lpszattributename: Long, lpbuffer: Long, dwbufferlength: Int, lpdwcharactersreturned: Long, lpfnenumerator: Long, dwcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetGopherGetAttributeW(hconnect: Long, lpszlocator: Long, lpszattributename: Long, lpbuffer: Long, dwbufferlength: Int, lpdwcharactersreturned: Long, lpfnenumerator: Long, dwcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetGopherGetLocatorTypeA(lpszlocator: Long, lpdwgophertype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetGopherGetLocatorTypeW(lpszlocator: Long, lpdwgophertype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetGopherOpenFileA(hconnect: Long, lpszlocator: Long, lpszview: Long, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetGopherOpenFileW(hconnect: Long, lpszlocator: Long, lpszview: Long, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetHttpAddRequestHeadersA(hrequest: Long, lpszheaders: Long, dwheaderslength: Int, dwmodifiers: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetHttpAddRequestHeadersW(hrequest: Long, lpszheaders: Long, dwheaderslength: Int, dwmodifiers: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetHttpCheckDavComplianceA(lpszurl: Long, lpszcompliancetoken: Long, lpffound: Long, hwnd: Long, lpvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetHttpCheckDavComplianceW(lpszurl: Long, lpszcompliancetoken: Long, lpffound: Long, hwnd: Long, lpvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetHttpCloseDependencyHandle(hdependencyhandle: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetHttpDuplicateDependencyHandle(hdependencyhandle: Long, phduplicateddependencyhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetHttpEndRequestA(hrequest: Long, lpbuffersout: Long, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetHttpEndRequestW(hrequest: Long, lpbuffersout: Long, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetHttpGetServerCredentials(pwszurl: Long, ppwszusername: Long, ppwszpassword: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetHttpIndicatePageLoadComplete(hdependencyhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetHttpIsHostHstsEnabled(pcwszurl: Long, pfishsts: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetHttpOpenDependencyHandle(hrequesthandle: Long, fbackground: Int, phdependencyhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetHttpOpenRequestA(hconnect: Long, lpszverb: Long, lpszobjectname: Long, lpszversion: Long, lpszreferrer: Long, lplpszaccepttypes: Long, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetHttpOpenRequestW(hconnect: Long, lpszverb: Long, lpszobjectname: Long, lpszversion: Long, lpszreferrer: Long, lplpszaccepttypes: Long, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetHttpPushClose(hwait: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetHttpPushEnable(hrequest: Long, ptransportsetting: Long, phwait: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetHttpPushWait(hwait: Long, etype: Int, pnotificationstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetHttpQueryInfoA(hrequest: Long, dwinfolevel: Int, lpbuffer: Long, lpdwbufferlength: Long, lpdwindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetHttpQueryInfoW(hrequest: Long, dwinfolevel: Int, lpbuffer: Long, lpdwbufferlength: Long, lpdwindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetHttpSendRequestA(hrequest: Long, lpszheaders: Long, dwheaderslength: Int, lpoptional: Long, dwoptionallength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetHttpSendRequestExA(hrequest: Long, lpbuffersin: Long, lpbuffersout: Long, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetHttpSendRequestExW(hrequest: Long, lpbuffersin: Long, lpbuffersout: Long, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetHttpSendRequestW(hrequest: Long, lpszheaders: Long, dwheaderslength: Int, lpoptional: Long, dwoptionallength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetHttpWebSocketClose(hwebsocket: Long, usstatus: Short, pvreason: Long, dwreasonlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetHttpWebSocketCompleteUpgrade(hrequest: Long, dwcontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetHttpWebSocketQueryCloseStatus(hwebsocket: Long, pusstatus: Long, pvreason: Long, dwreasonlength: Int, pdwreasonlengthconsumed: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetHttpWebSocketReceive(hwebsocket: Long, pvbuffer: Long, dwbufferlength: Int, pdwbytesread: Long, pbuffertype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetHttpWebSocketSend(hwebsocket: Long, buffertype: Int, pvbuffer: Long, dwbufferlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetHttpWebSocketShutdown(hwebsocket: Long, usstatus: Short, pvreason: Long, dwreasonlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetImportCookieFileA(szfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetImportCookieFileW(szfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetIncrementUrlCacheHeaderData(nidx: Int, lpdwdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternalInternetGetCookie(lpszurl: Long, lpszcookiedata: Long, lpdwdatasize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetAlgIdToStringA(ai: Int, lpstr: Long, lpdwstrlength: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetAlgIdToStringW(ai: Int, lpstr: Long, lpdwstrlength: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetAttemptConnect(dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetAutodial(dwflags: Int, hwndparent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetAutodialHangup(dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetCanonicalizeUrlA(lpszurl: Long, lpszbuffer: Long, lpdwbufferlength: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetCanonicalizeUrlW(lpszurl: Long, lpszbuffer: Long, lpdwbufferlength: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetCheckConnectionA(lpszurl: Long, dwflags: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetCheckConnectionW(lpszurl: Long, dwflags: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetClearAllPerSiteCookieDecisions(): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetCloseHandle(hinternet: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetCombineUrlA(lpszbaseurl: Long, lpszrelativeurl: Long, lpszbuffer: Long, lpdwbufferlength: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetCombineUrlW(lpszbaseurl: Long, lpszrelativeurl: Long, lpszbuffer: Long, lpdwbufferlength: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetConfirmZoneCrossing(hwnd: Long, szurlprev: Long, szurlnew: Long, bpost: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetConfirmZoneCrossingA(hwnd: Long, szurlprev: Long, szurlnew: Long, bpost: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetConfirmZoneCrossingW(hwnd: Long, szurlprev: Long, szurlnew: Long, bpost: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetConnectA(hinternet: Long, lpszservername: Long, nserverport: Short, lpszusername: Long, lpszpassword: Long, dwservice: Int, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetConnectW(hinternet: Long, lpszservername: Long, nserverport: Short, lpszusername: Long, lpszpassword: Long, dwservice: Int, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetConvertUrlFromWireToWideChar(pcszurl: Long, cchurl: Int, pcwszbaseurl: Long, dwcodepagehost: Int, dwcodepagepath: Int, fencodepathextra: Int, dwcodepageextra: Int, ppwszconvertedurl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetCrackUrlA(lpszurl: Long, dwurllength: Int, dwflags: Int, lpurlcomponents: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetCrackUrlW(lpszurl: Long, dwurllength: Int, dwflags: Int, lpurlcomponents: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetCreateUrlA(lpurlcomponents: Long, dwflags: Int, lpszurl: Long, lpdwurllength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetCreateUrlW(lpurlcomponents: Long, dwflags: Int, lpszurl: Long, lpdwurllength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetDial(hwndparent: Long, lpszconnectoid: Long, dwflags: Int, lpdwconnection: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetDialA(hwndparent: Long, lpszconnectoid: Long, dwflags: Int, lpdwconnection: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetDialW(hwndparent: Long, lpszconnectoid: Long, dwflags: Int, lpdwconnection: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetEnumPerSiteCookieDecisionA(pszsitename: Long, pcsitenamesize: Long, pdwdecision: Long, dwindex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetEnumPerSiteCookieDecisionW(pszsitename: Long, pcsitenamesize: Long, pdwdecision: Long, dwindex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetErrorDlg(hwnd: Long, hrequest: Long, dwerror: Int, dwflags: Int, lppvdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetFindNextFileA(hfind: Long, lpvfinddata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetFindNextFileW(hfind: Long, lpvfinddata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetFortezzaCommand(dwcommand: Int, hwnd: Long, dwreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetFreeCookies(pcookies: Long, dwcookiecount: Int)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetFreeProxyInfoList(pproxyinfolist: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetGetConnectedState(lpdwflags: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetGetConnectedStateEx(lpdwflags: Long, lpszconnectionname: Long, dwnamelen: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetGetConnectedStateExA(lpdwflags: Long, lpszconnectionname: Long, cchnamelen: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetGetConnectedStateExW(lpdwflags: Long, lpszconnectionname: Long, cchnamelen: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetGetCookieA(lpszurl: Long, lpszcookiename: Long, lpszcookiedata: Long, lpdwsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetGetCookieEx2(pcwszurl: Long, pcwszcookiename: Long, dwflags: Int, ppcookies: Long, pdwcookiecount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetGetCookieExA(lpszurl: Long, lpszcookiename: Long, lpszcookiedata: Long, lpdwsize: Long, dwflags: Int, lpreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetGetCookieExW(lpszurl: Long, lpszcookiename: Long, lpszcookiedata: Long, lpdwsize: Long, dwflags: Int, lpreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetGetCookieW(lpszurl: Long, lpszcookiename: Long, lpszcookiedata: Long, lpdwsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetGetLastResponseInfoA(lpdwerror: Long, lpszbuffer: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetGetLastResponseInfoW(lpdwerror: Long, lpszbuffer: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetGetPerSiteCookieDecisionA(pchhostname: Long, presult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetGetPerSiteCookieDecisionW(pchhostname: Long, presult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetGetProxyForUrl(hinternet: Long, pcwszurl: Long, pproxyinfolist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetGetSecurityInfoByURL(lpszurl: Long, ppcertchain: Long, pdwsecureflags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetGetSecurityInfoByURLA(lpszurl: Long, ppcertchain: Long, pdwsecureflags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetGetSecurityInfoByURLW(lpszurl: Long, ppcertchain: Long, pdwsecureflags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetGoOnline(lpszurl: Long, hwndparent: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetGoOnlineA(lpszurl: Long, hwndparent: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetGoOnlineW(lpszurl: Long, hwndparent: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetHangUp(dwconnection: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetInitializeAutoProxyDll(dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetLockRequestFile(hinternet: Long, lphlockrequestinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetOpenA(lpszagent: Long, dwaccesstype: Int, lpszproxy: Long, lpszproxybypass: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetOpenUrlA(hinternet: Long, lpszurl: Long, lpszheaders: Long, dwheaderslength: Int, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetOpenUrlW(hinternet: Long, lpszurl: Long, lpszheaders: Long, dwheaderslength: Int, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetOpenW(lpszagent: Long, dwaccesstype: Int, lpszproxy: Long, lpszproxybypass: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetQueryDataAvailable(hfile: Long, lpdwnumberofbytesavailable: Long, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetQueryFortezzaStatus(pdwstatus: Long, dwreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetQueryOptionA(hinternet: Long, dwoption: Int, lpbuffer: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetQueryOptionW(hinternet: Long, dwoption: Int, lpbuffer: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetReadFile(hfile: Long, lpbuffer: Long, dwnumberofbytestoread: Int, lpdwnumberofbytesread: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetReadFileExA(hfile: Long, lpbuffersout: Long, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetReadFileExW(hfile: Long, lpbuffersout: Long, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetSecurityProtocolToStringA(dwprotocol: Int, lpstr: Long, lpdwstrlength: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetSecurityProtocolToStringW(dwprotocol: Int, lpstr: Long, lpdwstrlength: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetSetCookieA(lpszurl: Long, lpszcookiename: Long, lpszcookiedata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetSetCookieEx2(pcwszurl: Long, pcookie: Long, pcwszp3ppolicy: Long, dwflags: Int, pdwcookiestate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetSetCookieExA(lpszurl: Long, lpszcookiename: Long, lpszcookiedata: Long, dwflags: Int, dwreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetSetCookieExW(lpszurl: Long, lpszcookiename: Long, lpszcookiedata: Long, dwflags: Int, dwreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetSetCookieW(lpszurl: Long, lpszcookiename: Long, lpszcookiedata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetSetDialState(lpszconnectoid: Long, dwstate: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetSetDialStateA(lpszconnectoid: Long, dwstate: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetSetDialStateW(lpszconnectoid: Long, dwstate: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetSetFilePointer(hfile: Long, ldistancetomove: Int, lpdistancetomovehigh: Long, dwmovemethod: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetSetOptionA(hinternet: Long, dwoption: Int, lpbuffer: Long, dwbufferlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetSetOptionExA(hinternet: Long, dwoption: Int, lpbuffer: Long, dwbufferlength: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetSetOptionExW(hinternet: Long, dwoption: Int, lpbuffer: Long, dwbufferlength: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetSetOptionW(hinternet: Long, dwoption: Int, lpbuffer: Long, dwbufferlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetSetPerSiteCookieDecisionA(pchhostname: Long, dwdecision: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetSetPerSiteCookieDecisionW(pchhostname: Long, dwdecision: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetSetStatusCallback(hinternet: Long, lpfninternetcallback: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetSetStatusCallbackA(hinternet: Long, lpfninternetcallback: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetSetStatusCallbackW(hinternet: Long, lpfninternetcallback: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetShowSecurityInfoByURL(lpszurl: Long, hwndparent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetShowSecurityInfoByURLA(lpszurl: Long, hwndparent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetShowSecurityInfoByURLW(lpszurl: Long, hwndparent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetTimeFromSystemTime(pst: Long, dwrfc: Int, lpsztime: Long, cbtime: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetTimeFromSystemTimeA(pst: Long, dwrfc: Int, lpsztime: Long, cbtime: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetTimeFromSystemTimeW(pst: Long, dwrfc: Int, lpsztime: Long, cbtime: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetTimeToSystemTime(lpsztime: Long, pst: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetTimeToSystemTimeA(lpsztime: Long, pst: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetTimeToSystemTimeW(lpsztime: Long, pst: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetUnlockRequestFile(hlockrequestinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetWriteFile(hfile: Long, lpbuffer: Long, dwnumberofbytestowrite: Int, lpdwnumberofbyteswritten: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetWriteFileExA(hfile: Long, lpbuffersin: Long, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetInternetWriteFileExW(hfile: Long, lpbuffersin: Long, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetIsDomainLegalCookieDomainA(pchdomain: Long, pchfulldomain: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetIsDomainLegalCookieDomainW(pchdomain: Long, pchfulldomain: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetIsHostInProxyBypassList(tscheme: Int, lpszhost: Long, cchhost: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetIsProfilesEnabled(): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetIsUrlCacheEntryExpiredA(lpszurlname: Long, dwflags: Int, pftlastmodified: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetIsUrlCacheEntryExpiredW(lpszurlname: Long, dwflags: Int, pftlastmodified: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetLoadUrlCacheContent(): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetParseX509EncodedCertificateForListBoxEntry(lpcert: Long, cbcert: Int, lpszlistboxentry: Long, lpdwlistboxentry: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetPerformOperationOverUrlCacheA(pszurlsearchpattern: Long, dwflags: Int, dwfilter: Int, groupid: Long, preserved1: Long, pdwreserved2: Long, preserved3: Long, op: Long, poperatordata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetPrivacyGetZonePreferenceW(dwzone: Int, dwtype: Int, pdwtemplate: Long, pszbuffer: Long, pdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetPrivacySetZonePreferenceW(dwzone: Int, dwtype: Int, dwtemplate: Int, pszpreference: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetReadGuidsForConnectedNetworks(pcnetworks: Long, pppwsznetworkguids: Long, pppbstrnetworknames: Long, pppwszgwmacs: Long, pcgatewaymacs: Long, pdwflags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetReadUrlCacheEntryStream(hurlcachestream: Long, dwlocation: Int, lpbuffer: Long, lpdwlen: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetReadUrlCacheEntryStreamEx(hurlcachestream: Long, qwlocation: Long, lpbuffer: Long, lpdwlen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetRegisterUrlCacheNotification(hwnd: Long, umsg: Int, gid: Long, dwopsfilter: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetResumeSuspendedDownload(hrequest: Long, dwresultcode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetRetrieveUrlCacheEntryFileA(lpszurlname: Long, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetRetrieveUrlCacheEntryFileW(lpszurlname: Long, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetRetrieveUrlCacheEntryStreamA(lpszurlname: Long, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, frandomread: Int, dwreserved: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetRetrieveUrlCacheEntryStreamW(lpszurlname: Long, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, frandomread: Int, dwreserved: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetRunOnceUrlCache(hwnd: Long, hinst: Long, lpszcmd: Long, ncmdshow: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetSetUrlCacheConfigInfoA(lpcacheconfiginfo: Long, dwfieldcontrol: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetSetUrlCacheConfigInfoW(lpcacheconfiginfo: Long, dwfieldcontrol: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetSetUrlCacheEntryGroup(lpszurlname: Long, dwflags: Int, groupid: Long, pbgroupattributes: Long, cbgroupattributes: Int, lpreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetSetUrlCacheEntryGroupA(lpszurlname: Long, dwflags: Int, groupid: Long, pbgroupattributes: Long, cbgroupattributes: Int, lpreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetSetUrlCacheEntryGroupW(lpszurlname: Long, dwflags: Int, groupid: Long, pbgroupattributes: Long, cbgroupattributes: Int, lpreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetSetUrlCacheEntryInfoA(lpszurlname: Long, lpcacheentryinfo: Long, dwfieldcontrol: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetSetUrlCacheEntryInfoW(lpszurlname: Long, lpcacheentryinfo: Long, dwfieldcontrol: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetSetUrlCacheGroupAttributeA(gid: Long, dwflags: Int, dwattributes: Int, lpgroupinfo: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetSetUrlCacheGroupAttributeW(gid: Long, dwflags: Int, dwattributes: Int, lpgroupinfo: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetSetUrlCacheHeaderData(nidx: Int, dwdata: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetShowClientAuthCerts(hwndparent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetShowSecurityInfo(hwndparent: Long, psecurityinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetShowX509EncodedCertificate(hwndparent: Long, lpcert: Long, cbcert: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetUnlockUrlCacheEntryFile(lpszurlname: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetUnlockUrlCacheEntryFileA(lpszurlname: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetUnlockUrlCacheEntryFileW(lpszurlname: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetUnlockUrlCacheEntryStream(hurlcachestream: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetUpdateUrlCacheContentPath(sznewpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetUrlCacheCheckEntriesExist(rgpwszurls: Long, centries: Int, rgfexist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetUrlCacheCloseEntryHandle(hentryfile: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetUrlCacheContainerSetEntryMaximumAge(pwszprefix: Long, dwentrymaxage: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetUrlCacheCreateContainer(pwszname: Long, pwszprefix: Long, pwszdirectory: Long, ulllimit: Long, dwoptions: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetUrlCacheFindFirstEntry(pwszprefix: Long, dwflags: Int, dwfilter: Int, groupid: Long, pcacheentryinfo: Long, phfind: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetUrlCacheFindNextEntry(hfind: Long, pcacheentryinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetUrlCacheFreeEntryInfo(pcacheentryinfo: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetUrlCacheFreeGlobalSpace(ulltargetsize: Long, dwfilter: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetUrlCacheGetContentPaths(pppwszdirectories: Long, pcdirectories: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetUrlCacheGetEntryInfo(happcache: Long, pcwszurl: Long, pcacheentryinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetUrlCacheGetGlobalCacheSize(dwfilter: Int, pullsize: Long, pulllimit: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetUrlCacheGetGlobalLimit(limittype: Int, pulllimit: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetUrlCacheReadEntryStream(hurlcachestream: Long, ulllocation: Long, pbuffer: Long, dwbufferlen: Int, pdwbufferlen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetUrlCacheReloadSettings(): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetUrlCacheRetrieveEntryFile(happcache: Long, pcwszurl: Long, pcacheentryinfo: Long, phentryfile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetUrlCacheRetrieveEntryStream(happcache: Long, pcwszurl: Long, frandomread: Int, pcacheentryinfo: Long, phentrystream: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetUrlCacheServer(): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetUrlCacheSetGlobalLimit(limittype: Int, ulllimit: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWininetUrlCacheUpdateEntryExtraData(happcache: Long, pcwszurl: Long, pbextradata: Long, cbextradata: Int): Int
}

public actual fun appCacheCheckManifest(pwszmasterurl: Pcwstr, pwszmanifesturl: Pcwstr, pbmanifestdata: ConstPtr, dwmanifestdatasize: UInt, pbmanifestresponseheaders: ConstPtr, dwmanifestresponseheaderssize: UInt, pestate: MutPtr, phnewappcache: MutPtr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetAppCacheCheckManifest(pwszmasterurl.rawAddress, pwszmanifesturl.rawAddress, pbmanifestdata.rawAddress, dwmanifestdatasize.toInt(), pbmanifestresponseheaders.rawAddress, dwmanifestresponseheaderssize.toInt(), pestate.rawAddress, phnewappcache.rawAddress).toUInt()

public actual fun appCacheCloseHandle(happcache: ConstPtr) {
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetAppCacheCloseHandle(happcache.rawAddress)
}

public actual fun appCacheCreateAndCommitFile(happcache: ConstPtr, pwszsourcefilepath: Pcwstr, pwszurl: Pcwstr, pbresponseheaders: ConstPtr, dwresponseheaderssize: UInt): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetAppCacheCreateAndCommitFile(happcache.rawAddress, pwszsourcefilepath.rawAddress, pwszurl.rawAddress, pbresponseheaders.rawAddress, dwresponseheaderssize.toInt()).toUInt()

public actual fun appCacheDeleteGroup(pwszmanifesturl: Pcwstr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetAppCacheDeleteGroup(pwszmanifesturl.rawAddress).toUInt()

public actual fun appCacheDeleteIEGroup(pwszmanifesturl: Pcwstr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetAppCacheDeleteIEGroup(pwszmanifesturl.rawAddress).toUInt()

public actual fun appCacheDuplicateHandle(happcache: ConstPtr, phduplicatedappcache: MutPtr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetAppCacheDuplicateHandle(happcache.rawAddress, phduplicatedappcache.rawAddress).toUInt()

public actual fun appCacheFinalize(happcache: ConstPtr, pbmanifestdata: ConstPtr, dwmanifestdatasize: UInt, pestate: MutPtr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetAppCacheFinalize(happcache.rawAddress, pbmanifestdata.rawAddress, dwmanifestdatasize.toInt(), pestate.rawAddress).toUInt()

public actual fun appCacheFreeDownloadList(pdownloadlist: MutPtr) {
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetAppCacheFreeDownloadList(pdownloadlist.rawAddress)
}

public actual fun appCacheFreeGroupList(pappcachegrouplist: MutPtr) {
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetAppCacheFreeGroupList(pappcachegrouplist.rawAddress)
}

public actual fun appCacheFreeIESpace(ftcutoff: Filetime): UInt =
    0u

public actual fun appCacheFreeSpace(ftcutoff: Filetime): UInt =
    0u

public actual fun appCacheGetDownloadList(happcache: ConstPtr, pdownloadlist: MutPtr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetAppCacheGetDownloadList(happcache.rawAddress, pdownloadlist.rawAddress).toUInt()

public actual fun appCacheGetFallbackUrl(happcache: ConstPtr, pwszurl: Pcwstr, ppwszfallbackurl: MutPtr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetAppCacheGetFallbackUrl(happcache.rawAddress, pwszurl.rawAddress, ppwszfallbackurl.rawAddress).toUInt()

public actual fun appCacheGetGroupList(pappcachegrouplist: MutPtr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetAppCacheGetGroupList(pappcachegrouplist.rawAddress).toUInt()

public actual fun appCacheGetIEGroupList(pappcachegrouplist: MutPtr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetAppCacheGetIEGroupList(pappcachegrouplist.rawAddress).toUInt()

public actual fun appCacheGetInfo(happcache: ConstPtr, pappcacheinfo: MutPtr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetAppCacheGetInfo(happcache.rawAddress, pappcacheinfo.rawAddress).toUInt()

public actual fun appCacheGetManifestUrl(happcache: ConstPtr, ppwszmanifesturl: MutPtr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetAppCacheGetManifestUrl(happcache.rawAddress, ppwszmanifesturl.rawAddress).toUInt()

public actual fun appCacheLookup(pwszurl: Pcwstr, dwflags: UInt, phappcache: MutPtr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetAppCacheLookup(pwszurl.rawAddress, dwflags.toInt(), phappcache.rawAddress).toUInt()

public actual fun commitUrlCacheEntryA(lpszurlname: Pcstr, lpszlocalfilename: Pcstr, expiretime: Filetime, lastmodifiedtime: Filetime, cacheentrytype: UInt, lpheaderinfo: ConstPtr, cchheaderinfo: UInt, lpszfileextension: Pcstr, lpszoriginalurl: Pcstr): Bool =
    0

public actual fun commitUrlCacheEntryBinaryBlob(pwszurlname: Pcwstr, dwtype: UInt, ftexpiretime: Filetime, ftmodifiedtime: Filetime, pbblob: ConstPtr, cbblob: UInt): UInt =
    0u

public actual fun commitUrlCacheEntryW(lpszurlname: Pcwstr, lpszlocalfilename: Pcwstr, expiretime: Filetime, lastmodifiedtime: Filetime, cacheentrytype: UInt, lpszheaderinfo: Pcwstr, cchheaderinfo: UInt, lpszfileextension: Pcwstr, lpszoriginalurl: Pcwstr): Bool =
    0

public actual fun createMD5SSOHash(pszchallengeinfo: Pcwstr, pwszrealm: Pcwstr, pwsztarget: Pcwstr, pbhexhash: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetCreateMD5SSOHash(pszchallengeinfo.rawAddress, pwszrealm.rawAddress, pwsztarget.rawAddress, pbhexhash.rawAddress)

public actual fun createUrlCacheContainerA(name: Pcstr, lpcacheprefix: Pcstr, lpszcachepath: Pcstr, kbcachelimit: UInt, dwcontainertype: UInt, dwoptions: UInt, pvbuffer: ConstPtr, cbbuffer: ConstPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetCreateUrlCacheContainerA(name.rawAddress, lpcacheprefix.rawAddress, lpszcachepath.rawAddress, kbcachelimit.toInt(), dwcontainertype.toInt(), dwoptions.toInt(), pvbuffer.rawAddress, cbbuffer.rawAddress)

public actual fun createUrlCacheContainerW(name: Pcwstr, lpcacheprefix: Pcwstr, lpszcachepath: Pcwstr, kbcachelimit: UInt, dwcontainertype: UInt, dwoptions: UInt, pvbuffer: ConstPtr, cbbuffer: ConstPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetCreateUrlCacheContainerW(name.rawAddress, lpcacheprefix.rawAddress, lpszcachepath.rawAddress, kbcachelimit.toInt(), dwcontainertype.toInt(), dwoptions.toInt(), pvbuffer.rawAddress, cbbuffer.rawAddress)

public actual fun createUrlCacheEntryA(lpszurlname: Pcstr, dwexpectedfilesize: UInt, lpszfileextension: Pcstr, lpszfilename: Pstr, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetCreateUrlCacheEntryA(lpszurlname.rawAddress, dwexpectedfilesize.toInt(), lpszfileextension.rawAddress, lpszfilename.rawAddress, dwreserved.toInt())

public actual fun createUrlCacheEntryExW(lpszurlname: Pcwstr, dwexpectedfilesize: UInt, lpszfileextension: Pcwstr, lpszfilename: Pwstr, dwreserved: UInt, fpreserveincomingfilename: Bool): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetCreateUrlCacheEntryExW(lpszurlname.rawAddress, dwexpectedfilesize.toInt(), lpszfileextension.rawAddress, lpszfilename.rawAddress, dwreserved.toInt(), fpreserveincomingfilename)

public actual fun createUrlCacheEntryW(lpszurlname: Pcwstr, dwexpectedfilesize: UInt, lpszfileextension: Pcwstr, lpszfilename: Pwstr, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetCreateUrlCacheEntryW(lpszurlname.rawAddress, dwexpectedfilesize.toInt(), lpszfileextension.rawAddress, lpszfilename.rawAddress, dwreserved.toInt())

public actual fun createUrlCacheGroup(dwflags: UInt, lpreserved: ConstPtr): Long =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetCreateUrlCacheGroup(dwflags.toInt(), lpreserved.rawAddress)

public actual fun deleteIE3Cache(hwnd: Hwnd, hinst: Hinstance, lpszcmd: Pcstr, ncmdshow: Int): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetDeleteIE3Cache(hwnd.rawAddress, hinst.rawAddress, lpszcmd.rawAddress, ncmdshow).toUInt()

public actual fun deleteUrlCacheContainerA(name: Pcstr, dwoptions: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetDeleteUrlCacheContainerA(name.rawAddress, dwoptions.toInt())

public actual fun deleteUrlCacheContainerW(name: Pcwstr, dwoptions: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetDeleteUrlCacheContainerW(name.rawAddress, dwoptions.toInt())

public actual fun deleteUrlCacheEntry(lpszurlname: Pcstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetDeleteUrlCacheEntry(lpszurlname.rawAddress)

public actual fun deleteUrlCacheEntryA(lpszurlname: Pcstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetDeleteUrlCacheEntryA(lpszurlname.rawAddress)

public actual fun deleteUrlCacheEntryW(lpszurlname: Pcwstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetDeleteUrlCacheEntryW(lpszurlname.rawAddress)

public actual fun deleteUrlCacheGroup(groupid: Long, dwflags: UInt, lpreserved: ConstPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetDeleteUrlCacheGroup(groupid, dwflags.toInt(), lpreserved.rawAddress)

public actual fun deleteWpadCacheForNetworks(param0: WpadCacheDelete): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetDeleteWpadCacheForNetworks(param0)

public actual fun detectAutoProxyUrl(pszautoproxyurl: Pstr, cchautoproxyurl: UInt, dwdetectflags: ProxyAutoDetectType): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetDetectAutoProxyUrl(pszautoproxyurl.rawAddress, cchautoproxyurl.toInt(), dwdetectflags.toInt())

public actual fun doConnectoidsExist(): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetDoConnectoidsExist()

public actual fun exportCookieFileA(szfilename: Pcstr, fappend: Bool): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetExportCookieFileA(szfilename.rawAddress, fappend)

public actual fun exportCookieFileW(szfilename: Pcwstr, fappend: Bool): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetExportCookieFileW(szfilename.rawAddress, fappend)

public actual fun findCloseUrlCache(henumhandle: Handle): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFindCloseUrlCache(henumhandle.rawAddress)

public actual fun findFirstUrlCacheContainerA(pdwmodified: MutPtr, lpcontainerinfo: MutPtr, lpcbcontainerinfo: MutPtr, dwoptions: UInt): Handle =
    MutPtr(WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheContainerA(pdwmodified.rawAddress, lpcontainerinfo.rawAddress, lpcbcontainerinfo.rawAddress, dwoptions.toInt()))

public actual fun findFirstUrlCacheContainerW(pdwmodified: MutPtr, lpcontainerinfo: MutPtr, lpcbcontainerinfo: MutPtr, dwoptions: UInt): Handle =
    MutPtr(WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheContainerW(pdwmodified.rawAddress, lpcontainerinfo.rawAddress, lpcbcontainerinfo.rawAddress, dwoptions.toInt()))

public actual fun findFirstUrlCacheEntryA(lpszurlsearchpattern: Pcstr, lpfirstcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr): Handle =
    MutPtr(WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheEntryA(lpszurlsearchpattern.rawAddress, lpfirstcacheentryinfo.rawAddress, lpcbcacheentryinfo.rawAddress))

public actual fun findFirstUrlCacheEntryExA(lpszurlsearchpattern: Pcstr, dwflags: UInt, dwfilter: UInt, groupid: Long, lpfirstcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, lpgroupattributes: ConstPtr, lpcbgroupattributes: ConstPtr, lpreserved: ConstPtr): Handle =
    MutPtr(WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheEntryExA(lpszurlsearchpattern.rawAddress, dwflags.toInt(), dwfilter.toInt(), groupid, lpfirstcacheentryinfo.rawAddress, lpcbcacheentryinfo.rawAddress, lpgroupattributes.rawAddress, lpcbgroupattributes.rawAddress, lpreserved.rawAddress))

public actual fun findFirstUrlCacheEntryExW(lpszurlsearchpattern: Pcwstr, dwflags: UInt, dwfilter: UInt, groupid: Long, lpfirstcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, lpgroupattributes: ConstPtr, lpcbgroupattributes: ConstPtr, lpreserved: ConstPtr): Handle =
    MutPtr(WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheEntryExW(lpszurlsearchpattern.rawAddress, dwflags.toInt(), dwfilter.toInt(), groupid, lpfirstcacheentryinfo.rawAddress, lpcbcacheentryinfo.rawAddress, lpgroupattributes.rawAddress, lpcbgroupattributes.rawAddress, lpreserved.rawAddress))

public actual fun findFirstUrlCacheEntryW(lpszurlsearchpattern: Pcwstr, lpfirstcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr): Handle =
    MutPtr(WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheEntryW(lpszurlsearchpattern.rawAddress, lpfirstcacheentryinfo.rawAddress, lpcbcacheentryinfo.rawAddress))

public actual fun findFirstUrlCacheGroup(dwflags: UInt, dwfilter: UInt, lpsearchcondition: ConstPtr, dwsearchcondition: UInt, lpgroupid: MutPtr, lpreserved: ConstPtr): Handle =
    MutPtr(WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheGroup(dwflags.toInt(), dwfilter.toInt(), lpsearchcondition.rawAddress, dwsearchcondition.toInt(), lpgroupid.rawAddress, lpreserved.rawAddress))

public actual fun findNextUrlCacheContainerA(henumhandle: Handle, lpcontainerinfo: MutPtr, lpcbcontainerinfo: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFindNextUrlCacheContainerA(henumhandle.rawAddress, lpcontainerinfo.rawAddress, lpcbcontainerinfo.rawAddress)

public actual fun findNextUrlCacheContainerW(henumhandle: Handle, lpcontainerinfo: MutPtr, lpcbcontainerinfo: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFindNextUrlCacheContainerW(henumhandle.rawAddress, lpcontainerinfo.rawAddress, lpcbcontainerinfo.rawAddress)

public actual fun findNextUrlCacheEntryA(henumhandle: Handle, lpnextcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFindNextUrlCacheEntryA(henumhandle.rawAddress, lpnextcacheentryinfo.rawAddress, lpcbcacheentryinfo.rawAddress)

public actual fun findNextUrlCacheEntryExA(henumhandle: Handle, lpnextcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, lpgroupattributes: ConstPtr, lpcbgroupattributes: ConstPtr, lpreserved: ConstPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFindNextUrlCacheEntryExA(henumhandle.rawAddress, lpnextcacheentryinfo.rawAddress, lpcbcacheentryinfo.rawAddress, lpgroupattributes.rawAddress, lpcbgroupattributes.rawAddress, lpreserved.rawAddress)

public actual fun findNextUrlCacheEntryExW(henumhandle: Handle, lpnextcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, lpgroupattributes: ConstPtr, lpcbgroupattributes: ConstPtr, lpreserved: ConstPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFindNextUrlCacheEntryExW(henumhandle.rawAddress, lpnextcacheentryinfo.rawAddress, lpcbcacheentryinfo.rawAddress, lpgroupattributes.rawAddress, lpcbgroupattributes.rawAddress, lpreserved.rawAddress)

public actual fun findNextUrlCacheEntryW(henumhandle: Handle, lpnextcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFindNextUrlCacheEntryW(henumhandle.rawAddress, lpnextcacheentryinfo.rawAddress, lpcbcacheentryinfo.rawAddress)

public actual fun findNextUrlCacheGroup(hfind: Handle, lpgroupid: MutPtr, lpreserved: ConstPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFindNextUrlCacheGroup(hfind.rawAddress, lpgroupid.rawAddress, lpreserved.rawAddress)

public actual fun findP3PPolicySymbol(pszsymbol: Pcstr): Int =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFindP3PPolicySymbol(pszsymbol.rawAddress)

public actual fun freeUrlCacheSpaceA(lpszcachepath: Pcstr, dwsize: UInt, dwfilter: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFreeUrlCacheSpaceA(lpszcachepath.rawAddress, dwsize.toInt(), dwfilter.toInt())

public actual fun freeUrlCacheSpaceW(lpszcachepath: Pcwstr, dwsize: UInt, dwfilter: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFreeUrlCacheSpaceW(lpszcachepath.rawAddress, dwsize.toInt(), dwfilter.toInt())

public actual fun ftpCommandA(hconnect: ConstPtr, fexpectresponse: Bool, dwflags: FtpFlags, lpszcommand: Pcstr, dwcontext: ULong, phftpcommand: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFtpCommandA(hconnect.rawAddress, fexpectresponse, dwflags.toInt(), lpszcommand.rawAddress, dwcontext.toLong(), phftpcommand.rawAddress)

public actual fun ftpCommandW(hconnect: ConstPtr, fexpectresponse: Bool, dwflags: FtpFlags, lpszcommand: Pcwstr, dwcontext: ULong, phftpcommand: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFtpCommandW(hconnect.rawAddress, fexpectresponse, dwflags.toInt(), lpszcommand.rawAddress, dwcontext.toLong(), phftpcommand.rawAddress)

public actual fun ftpCreateDirectoryA(hconnect: ConstPtr, lpszdirectory: Pcstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFtpCreateDirectoryA(hconnect.rawAddress, lpszdirectory.rawAddress)

public actual fun ftpCreateDirectoryW(hconnect: ConstPtr, lpszdirectory: Pcwstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFtpCreateDirectoryW(hconnect.rawAddress, lpszdirectory.rawAddress)

public actual fun ftpDeleteFileA(hconnect: ConstPtr, lpszfilename: Pcstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFtpDeleteFileA(hconnect.rawAddress, lpszfilename.rawAddress)

public actual fun ftpDeleteFileW(hconnect: ConstPtr, lpszfilename: Pcwstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFtpDeleteFileW(hconnect.rawAddress, lpszfilename.rawAddress)

public actual fun ftpFindFirstFileA(hconnect: ConstPtr, lpszsearchfile: Pcstr, lpfindfiledata: MutPtr, dwflags: UInt, dwcontext: ULong): MutPtr =
    MutPtr(WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFtpFindFirstFileA(hconnect.rawAddress, lpszsearchfile.rawAddress, lpfindfiledata.rawAddress, dwflags.toInt(), dwcontext.toLong()))

public actual fun ftpFindFirstFileW(hconnect: ConstPtr, lpszsearchfile: Pcwstr, lpfindfiledata: MutPtr, dwflags: UInt, dwcontext: ULong): MutPtr =
    MutPtr(WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFtpFindFirstFileW(hconnect.rawAddress, lpszsearchfile.rawAddress, lpfindfiledata.rawAddress, dwflags.toInt(), dwcontext.toLong()))

public actual fun ftpGetCurrentDirectoryA(hconnect: ConstPtr, lpszcurrentdirectory: Pstr, lpdwcurrentdirectory: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFtpGetCurrentDirectoryA(hconnect.rawAddress, lpszcurrentdirectory.rawAddress, lpdwcurrentdirectory.rawAddress)

public actual fun ftpGetCurrentDirectoryW(hconnect: ConstPtr, lpszcurrentdirectory: Pwstr, lpdwcurrentdirectory: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFtpGetCurrentDirectoryW(hconnect.rawAddress, lpszcurrentdirectory.rawAddress, lpdwcurrentdirectory.rawAddress)

public actual fun ftpGetFileA(hconnect: ConstPtr, lpszremotefile: Pcstr, lpsznewfile: Pcstr, ffailifexists: Bool, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFtpGetFileA(hconnect.rawAddress, lpszremotefile.rawAddress, lpsznewfile.rawAddress, ffailifexists, dwflagsandattributes.toInt(), dwflags.toInt(), dwcontext.toLong())

public actual fun ftpGetFileEx(hftpsession: ConstPtr, lpszremotefile: Pcstr, lpsznewfile: Pcwstr, ffailifexists: Bool, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFtpGetFileEx(hftpsession.rawAddress, lpszremotefile.rawAddress, lpsznewfile.rawAddress, ffailifexists, dwflagsandattributes.toInt(), dwflags.toInt(), dwcontext.toLong())

public actual fun ftpGetFileSize(hfile: ConstPtr, lpdwfilesizehigh: MutPtr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFtpGetFileSize(hfile.rawAddress, lpdwfilesizehigh.rawAddress).toUInt()

public actual fun ftpGetFileW(hconnect: ConstPtr, lpszremotefile: Pcwstr, lpsznewfile: Pcwstr, ffailifexists: Bool, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFtpGetFileW(hconnect.rawAddress, lpszremotefile.rawAddress, lpsznewfile.rawAddress, ffailifexists, dwflagsandattributes.toInt(), dwflags.toInt(), dwcontext.toLong())

public actual fun ftpOpenFileA(hconnect: ConstPtr, lpszfilename: Pcstr, dwaccess: UInt, dwflags: FtpFlags, dwcontext: ULong): MutPtr =
    MutPtr(WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFtpOpenFileA(hconnect.rawAddress, lpszfilename.rawAddress, dwaccess.toInt(), dwflags.toInt(), dwcontext.toLong()))

public actual fun ftpOpenFileW(hconnect: ConstPtr, lpszfilename: Pcwstr, dwaccess: UInt, dwflags: FtpFlags, dwcontext: ULong): MutPtr =
    MutPtr(WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFtpOpenFileW(hconnect.rawAddress, lpszfilename.rawAddress, dwaccess.toInt(), dwflags.toInt(), dwcontext.toLong()))

public actual fun ftpPutFileA(hconnect: ConstPtr, lpszlocalfile: Pcstr, lpsznewremotefile: Pcstr, dwflags: FtpFlags, dwcontext: ULong): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFtpPutFileA(hconnect.rawAddress, lpszlocalfile.rawAddress, lpsznewremotefile.rawAddress, dwflags.toInt(), dwcontext.toLong())

public actual fun ftpPutFileEx(hftpsession: ConstPtr, lpszlocalfile: Pcwstr, lpsznewremotefile: Pcstr, dwflags: UInt, dwcontext: ULong): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFtpPutFileEx(hftpsession.rawAddress, lpszlocalfile.rawAddress, lpsznewremotefile.rawAddress, dwflags.toInt(), dwcontext.toLong())

public actual fun ftpPutFileW(hconnect: ConstPtr, lpszlocalfile: Pcwstr, lpsznewremotefile: Pcwstr, dwflags: FtpFlags, dwcontext: ULong): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFtpPutFileW(hconnect.rawAddress, lpszlocalfile.rawAddress, lpsznewremotefile.rawAddress, dwflags.toInt(), dwcontext.toLong())

public actual fun ftpRemoveDirectoryA(hconnect: ConstPtr, lpszdirectory: Pcstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFtpRemoveDirectoryA(hconnect.rawAddress, lpszdirectory.rawAddress)

public actual fun ftpRemoveDirectoryW(hconnect: ConstPtr, lpszdirectory: Pcwstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFtpRemoveDirectoryW(hconnect.rawAddress, lpszdirectory.rawAddress)

public actual fun ftpRenameFileA(hconnect: ConstPtr, lpszexisting: Pcstr, lpsznew: Pcstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFtpRenameFileA(hconnect.rawAddress, lpszexisting.rawAddress, lpsznew.rawAddress)

public actual fun ftpRenameFileW(hconnect: ConstPtr, lpszexisting: Pcwstr, lpsznew: Pcwstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFtpRenameFileW(hconnect.rawAddress, lpszexisting.rawAddress, lpsznew.rawAddress)

public actual fun ftpSetCurrentDirectoryA(hconnect: ConstPtr, lpszdirectory: Pcstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFtpSetCurrentDirectoryA(hconnect.rawAddress, lpszdirectory.rawAddress)

public actual fun ftpSetCurrentDirectoryW(hconnect: ConstPtr, lpszdirectory: Pcwstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetFtpSetCurrentDirectoryW(hconnect.rawAddress, lpszdirectory.rawAddress)

public actual fun getDiskInfoA(pszpath: Pcstr, pdwclustersize: MutPtr, pdlavail: MutPtr, pdltotal: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetGetDiskInfoA(pszpath.rawAddress, pdwclustersize.rawAddress, pdlavail.rawAddress, pdltotal.rawAddress)

public actual fun getUrlCacheConfigInfoA(lpcacheconfiginfo: MutPtr, lpcbcacheconfiginfo: ConstPtr, dwfieldcontrol: CacheConfig): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetGetUrlCacheConfigInfoA(lpcacheconfiginfo.rawAddress, lpcbcacheconfiginfo.rawAddress, dwfieldcontrol.toInt())

public actual fun getUrlCacheConfigInfoW(lpcacheconfiginfo: MutPtr, lpcbcacheconfiginfo: ConstPtr, dwfieldcontrol: CacheConfig): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetGetUrlCacheConfigInfoW(lpcacheconfiginfo.rawAddress, lpcbcacheconfiginfo.rawAddress, dwfieldcontrol.toInt())

public actual fun getUrlCacheEntryBinaryBlob(pwszurlname: Pcwstr, dwtype: MutPtr, pftexpiretime: MutPtr, pftaccesstime: MutPtr, pftmodifiedtime: MutPtr, ppbblob: MutPtr, pcbblob: MutPtr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetGetUrlCacheEntryBinaryBlob(pwszurlname.rawAddress, dwtype.rawAddress, pftexpiretime.rawAddress, pftaccesstime.rawAddress, pftmodifiedtime.rawAddress, ppbblob.rawAddress, pcbblob.rawAddress).toUInt()

public actual fun getUrlCacheEntryInfoA(lpszurlname: Pcstr, lpcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetGetUrlCacheEntryInfoA(lpszurlname.rawAddress, lpcacheentryinfo.rawAddress, lpcbcacheentryinfo.rawAddress)

public actual fun getUrlCacheEntryInfoExA(lpszurl: Pcstr, lpcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, lpszredirecturl: Pcstr, lpcbredirecturl: ConstPtr, lpreserved: ConstPtr, dwflags: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetGetUrlCacheEntryInfoExA(lpszurl.rawAddress, lpcacheentryinfo.rawAddress, lpcbcacheentryinfo.rawAddress, lpszredirecturl.rawAddress, lpcbredirecturl.rawAddress, lpreserved.rawAddress, dwflags.toInt())

public actual fun getUrlCacheEntryInfoExW(lpszurl: Pcwstr, lpcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, lpszredirecturl: Pcwstr, lpcbredirecturl: ConstPtr, lpreserved: ConstPtr, dwflags: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetGetUrlCacheEntryInfoExW(lpszurl.rawAddress, lpcacheentryinfo.rawAddress, lpcbcacheentryinfo.rawAddress, lpszredirecturl.rawAddress, lpcbredirecturl.rawAddress, lpreserved.rawAddress, dwflags.toInt())

public actual fun getUrlCacheEntryInfoW(lpszurlname: Pcwstr, lpcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetGetUrlCacheEntryInfoW(lpszurlname.rawAddress, lpcacheentryinfo.rawAddress, lpcbcacheentryinfo.rawAddress)

public actual fun getUrlCacheGroupAttributeA(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: MutPtr, lpcbgroupinfo: MutPtr, lpreserved: ConstPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetGetUrlCacheGroupAttributeA(gid, dwflags.toInt(), dwattributes.toInt(), lpgroupinfo.rawAddress, lpcbgroupinfo.rawAddress, lpreserved.rawAddress)

public actual fun getUrlCacheGroupAttributeW(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: MutPtr, lpcbgroupinfo: MutPtr, lpreserved: ConstPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetGetUrlCacheGroupAttributeW(gid, dwflags.toInt(), dwattributes.toInt(), lpgroupinfo.rawAddress, lpcbgroupinfo.rawAddress, lpreserved.rawAddress)

public actual fun getUrlCacheHeaderData(nidx: UInt, lpdwdata: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetGetUrlCacheHeaderData(nidx.toInt(), lpdwdata.rawAddress)

public actual fun gopherCreateLocatorA(lpszhost: Pcstr, nserverport: UShort, lpszdisplaystring: Pcstr, lpszselectorstring: Pcstr, dwgophertype: UInt, lpszlocator: Pstr, lpdwbufferlength: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetGopherCreateLocatorA(lpszhost.rawAddress, nserverport.toShort(), lpszdisplaystring.rawAddress, lpszselectorstring.rawAddress, dwgophertype.toInt(), lpszlocator.rawAddress, lpdwbufferlength.rawAddress)

public actual fun gopherCreateLocatorW(lpszhost: Pcwstr, nserverport: UShort, lpszdisplaystring: Pcwstr, lpszselectorstring: Pcwstr, dwgophertype: UInt, lpszlocator: Pwstr, lpdwbufferlength: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetGopherCreateLocatorW(lpszhost.rawAddress, nserverport.toShort(), lpszdisplaystring.rawAddress, lpszselectorstring.rawAddress, dwgophertype.toInt(), lpszlocator.rawAddress, lpdwbufferlength.rawAddress)

public actual fun gopherFindFirstFileA(hconnect: ConstPtr, lpszlocator: Pcstr, lpszsearchstring: Pcstr, lpfinddata: MutPtr, dwflags: UInt, dwcontext: ULong): MutPtr =
    MutPtr(WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetGopherFindFirstFileA(hconnect.rawAddress, lpszlocator.rawAddress, lpszsearchstring.rawAddress, lpfinddata.rawAddress, dwflags.toInt(), dwcontext.toLong()))

public actual fun gopherFindFirstFileW(hconnect: ConstPtr, lpszlocator: Pcwstr, lpszsearchstring: Pcwstr, lpfinddata: MutPtr, dwflags: UInt, dwcontext: ULong): MutPtr =
    MutPtr(WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetGopherFindFirstFileW(hconnect.rawAddress, lpszlocator.rawAddress, lpszsearchstring.rawAddress, lpfinddata.rawAddress, dwflags.toInt(), dwcontext.toLong()))

public actual fun gopherGetAttributeA(hconnect: ConstPtr, lpszlocator: Pcstr, lpszattributename: Pcstr, lpbuffer: MutPtr, dwbufferlength: UInt, lpdwcharactersreturned: MutPtr, lpfnenumerator: GopherAttributeEnumerator, dwcontext: ULong): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetGopherGetAttributeA(hconnect.rawAddress, lpszlocator.rawAddress, lpszattributename.rawAddress, lpbuffer.rawAddress, dwbufferlength.toInt(), lpdwcharactersreturned.rawAddress, 0L, dwcontext.toLong())

public actual fun gopherGetAttributeW(hconnect: ConstPtr, lpszlocator: Pcwstr, lpszattributename: Pcwstr, lpbuffer: MutPtr, dwbufferlength: UInt, lpdwcharactersreturned: MutPtr, lpfnenumerator: GopherAttributeEnumerator, dwcontext: ULong): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetGopherGetAttributeW(hconnect.rawAddress, lpszlocator.rawAddress, lpszattributename.rawAddress, lpbuffer.rawAddress, dwbufferlength.toInt(), lpdwcharactersreturned.rawAddress, 0L, dwcontext.toLong())

public actual fun gopherGetLocatorTypeA(lpszlocator: Pcstr, lpdwgophertype: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetGopherGetLocatorTypeA(lpszlocator.rawAddress, lpdwgophertype.rawAddress)

public actual fun gopherGetLocatorTypeW(lpszlocator: Pcwstr, lpdwgophertype: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetGopherGetLocatorTypeW(lpszlocator.rawAddress, lpdwgophertype.rawAddress)

public actual fun gopherOpenFileA(hconnect: ConstPtr, lpszlocator: Pcstr, lpszview: Pcstr, dwflags: UInt, dwcontext: ULong): MutPtr =
    MutPtr(WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetGopherOpenFileA(hconnect.rawAddress, lpszlocator.rawAddress, lpszview.rawAddress, dwflags.toInt(), dwcontext.toLong()))

public actual fun gopherOpenFileW(hconnect: ConstPtr, lpszlocator: Pcwstr, lpszview: Pcwstr, dwflags: UInt, dwcontext: ULong): MutPtr =
    MutPtr(WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetGopherOpenFileW(hconnect.rawAddress, lpszlocator.rawAddress, lpszview.rawAddress, dwflags.toInt(), dwcontext.toLong()))

public actual fun httpAddRequestHeadersA(hrequest: ConstPtr, lpszheaders: Pcstr, dwheaderslength: UInt, dwmodifiers: HttpAddreqFlag): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetHttpAddRequestHeadersA(hrequest.rawAddress, lpszheaders.rawAddress, dwheaderslength.toInt(), dwmodifiers.toInt())

public actual fun httpAddRequestHeadersW(hrequest: ConstPtr, lpszheaders: Pcwstr, dwheaderslength: UInt, dwmodifiers: HttpAddreqFlag): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetHttpAddRequestHeadersW(hrequest.rawAddress, lpszheaders.rawAddress, dwheaderslength.toInt(), dwmodifiers.toInt())

public actual fun httpCheckDavComplianceA(lpszurl: Pcstr, lpszcompliancetoken: Pcstr, lpffound: MutPtr, hwnd: Hwnd, lpvreserved: ConstPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetHttpCheckDavComplianceA(lpszurl.rawAddress, lpszcompliancetoken.rawAddress, lpffound.rawAddress, hwnd.rawAddress, lpvreserved.rawAddress)

public actual fun httpCheckDavComplianceW(lpszurl: Pcwstr, lpszcompliancetoken: Pcwstr, lpffound: MutPtr, hwnd: Hwnd, lpvreserved: ConstPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetHttpCheckDavComplianceW(lpszurl.rawAddress, lpszcompliancetoken.rawAddress, lpffound.rawAddress, hwnd.rawAddress, lpvreserved.rawAddress)

public actual fun httpCloseDependencyHandle(hdependencyhandle: ConstPtr) {
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetHttpCloseDependencyHandle(hdependencyhandle.rawAddress)
}

public actual fun httpDuplicateDependencyHandle(hdependencyhandle: ConstPtr, phduplicateddependencyhandle: MutPtr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetHttpDuplicateDependencyHandle(hdependencyhandle.rawAddress, phduplicateddependencyhandle.rawAddress).toUInt()

public actual fun httpEndRequestA(hrequest: ConstPtr, lpbuffersout: MutPtr, dwflags: UInt, dwcontext: ULong): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetHttpEndRequestA(hrequest.rawAddress, lpbuffersout.rawAddress, dwflags.toInt(), dwcontext.toLong())

public actual fun httpEndRequestW(hrequest: ConstPtr, lpbuffersout: MutPtr, dwflags: UInt, dwcontext: ULong): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetHttpEndRequestW(hrequest.rawAddress, lpbuffersout.rawAddress, dwflags.toInt(), dwcontext.toLong())

public actual fun httpGetServerCredentials(pwszurl: Pcwstr, ppwszusername: MutPtr, ppwszpassword: MutPtr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetHttpGetServerCredentials(pwszurl.rawAddress, ppwszusername.rawAddress, ppwszpassword.rawAddress).toUInt()

public actual fun httpIndicatePageLoadComplete(hdependencyhandle: ConstPtr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetHttpIndicatePageLoadComplete(hdependencyhandle.rawAddress).toUInt()

public actual fun httpIsHostHstsEnabled(pcwszurl: Pcwstr, pfishsts: MutPtr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetHttpIsHostHstsEnabled(pcwszurl.rawAddress, pfishsts.rawAddress).toUInt()

public actual fun httpOpenDependencyHandle(hrequesthandle: ConstPtr, fbackground: Bool, phdependencyhandle: MutPtr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetHttpOpenDependencyHandle(hrequesthandle.rawAddress, fbackground, phdependencyhandle.rawAddress).toUInt()

public actual fun httpOpenRequestA(hconnect: ConstPtr, lpszverb: Pcstr, lpszobjectname: Pcstr, lpszversion: Pcstr, lpszreferrer: Pcstr, lplpszaccepttypes: ConstPtr, dwflags: UInt, dwcontext: ULong): MutPtr =
    MutPtr(WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetHttpOpenRequestA(hconnect.rawAddress, lpszverb.rawAddress, lpszobjectname.rawAddress, lpszversion.rawAddress, lpszreferrer.rawAddress, lplpszaccepttypes.rawAddress, dwflags.toInt(), dwcontext.toLong()))

public actual fun httpOpenRequestW(hconnect: ConstPtr, lpszverb: Pcwstr, lpszobjectname: Pcwstr, lpszversion: Pcwstr, lpszreferrer: Pcwstr, lplpszaccepttypes: ConstPtr, dwflags: UInt, dwcontext: ULong): MutPtr =
    MutPtr(WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetHttpOpenRequestW(hconnect.rawAddress, lpszverb.rawAddress, lpszobjectname.rawAddress, lpszversion.rawAddress, lpszreferrer.rawAddress, lplpszaccepttypes.rawAddress, dwflags.toInt(), dwcontext.toLong()))

public actual fun httpPushClose(hwait: HttpPushWaitHandle) {
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetHttpPushClose(hwait.rawAddress)
}

public actual fun httpPushEnable(hrequest: ConstPtr, ptransportsetting: ConstPtr, phwait: MutPtr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetHttpPushEnable(hrequest.rawAddress, ptransportsetting.rawAddress, phwait.rawAddress).toUInt()

public actual fun httpPushWait(hwait: HttpPushWaitHandle, etype: HttpPushWaitType, pnotificationstatus: MutPtr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetHttpPushWait(hwait.rawAddress, etype, pnotificationstatus.rawAddress).toUInt()

public actual fun httpQueryInfoA(hrequest: ConstPtr, dwinfolevel: UInt, lpbuffer: MutPtr, lpdwbufferlength: MutPtr, lpdwindex: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetHttpQueryInfoA(hrequest.rawAddress, dwinfolevel.toInt(), lpbuffer.rawAddress, lpdwbufferlength.rawAddress, lpdwindex.rawAddress)

public actual fun httpQueryInfoW(hrequest: ConstPtr, dwinfolevel: UInt, lpbuffer: MutPtr, lpdwbufferlength: MutPtr, lpdwindex: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetHttpQueryInfoW(hrequest.rawAddress, dwinfolevel.toInt(), lpbuffer.rawAddress, lpdwbufferlength.rawAddress, lpdwindex.rawAddress)

public actual fun httpSendRequestA(hrequest: ConstPtr, lpszheaders: Pcstr, dwheaderslength: UInt, lpoptional: ConstPtr, dwoptionallength: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetHttpSendRequestA(hrequest.rawAddress, lpszheaders.rawAddress, dwheaderslength.toInt(), lpoptional.rawAddress, dwoptionallength.toInt())

public actual fun httpSendRequestExA(hrequest: ConstPtr, lpbuffersin: ConstPtr, lpbuffersout: MutPtr, dwflags: UInt, dwcontext: ULong): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetHttpSendRequestExA(hrequest.rawAddress, lpbuffersin.rawAddress, lpbuffersout.rawAddress, dwflags.toInt(), dwcontext.toLong())

public actual fun httpSendRequestExW(hrequest: ConstPtr, lpbuffersin: ConstPtr, lpbuffersout: MutPtr, dwflags: UInt, dwcontext: ULong): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetHttpSendRequestExW(hrequest.rawAddress, lpbuffersin.rawAddress, lpbuffersout.rawAddress, dwflags.toInt(), dwcontext.toLong())

public actual fun httpSendRequestW(hrequest: ConstPtr, lpszheaders: Pcwstr, dwheaderslength: UInt, lpoptional: ConstPtr, dwoptionallength: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetHttpSendRequestW(hrequest.rawAddress, lpszheaders.rawAddress, dwheaderslength.toInt(), lpoptional.rawAddress, dwoptionallength.toInt())

public actual fun httpWebSocketClose(hwebsocket: ConstPtr, usstatus: UShort, pvreason: ConstPtr, dwreasonlength: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetHttpWebSocketClose(hwebsocket.rawAddress, usstatus.toShort(), pvreason.rawAddress, dwreasonlength.toInt())

public actual fun httpWebSocketCompleteUpgrade(hrequest: ConstPtr, dwcontext: ULong): MutPtr =
    MutPtr(WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetHttpWebSocketCompleteUpgrade(hrequest.rawAddress, dwcontext.toLong()))

public actual fun httpWebSocketQueryCloseStatus(hwebsocket: ConstPtr, pusstatus: MutPtr, pvreason: MutPtr, dwreasonlength: UInt, pdwreasonlengthconsumed: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetHttpWebSocketQueryCloseStatus(hwebsocket.rawAddress, pusstatus.rawAddress, pvreason.rawAddress, dwreasonlength.toInt(), pdwreasonlengthconsumed.rawAddress)

public actual fun httpWebSocketReceive(hwebsocket: ConstPtr, pvbuffer: MutPtr, dwbufferlength: UInt, pdwbytesread: MutPtr, pbuffertype: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetHttpWebSocketReceive(hwebsocket.rawAddress, pvbuffer.rawAddress, dwbufferlength.toInt(), pdwbytesread.rawAddress, pbuffertype.rawAddress)

public actual fun httpWebSocketSend(hwebsocket: ConstPtr, buffertype: HttpWebSocketBufferType, pvbuffer: ConstPtr, dwbufferlength: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetHttpWebSocketSend(hwebsocket.rawAddress, buffertype, pvbuffer.rawAddress, dwbufferlength.toInt())

public actual fun httpWebSocketShutdown(hwebsocket: ConstPtr, usstatus: UShort, pvreason: ConstPtr, dwreasonlength: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetHttpWebSocketShutdown(hwebsocket.rawAddress, usstatus.toShort(), pvreason.rawAddress, dwreasonlength.toInt())

public actual fun importCookieFileA(szfilename: Pcstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetImportCookieFileA(szfilename.rawAddress)

public actual fun importCookieFileW(szfilename: Pcwstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetImportCookieFileW(szfilename.rawAddress)

public actual fun incrementUrlCacheHeaderData(nidx: UInt, lpdwdata: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetIncrementUrlCacheHeaderData(nidx.toInt(), lpdwdata.rawAddress)

public actual fun internalInternetGetCookie(lpszurl: Pcstr, lpszcookiedata: Pstr, lpdwdatasize: MutPtr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternalInternetGetCookie(lpszurl.rawAddress, lpszcookiedata.rawAddress, lpdwdatasize.rawAddress).toUInt()

public actual fun internetAlgIdToStringA(ai: AlgId, lpstr: Pstr, lpdwstrlength: MutPtr, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetAlgIdToStringA(ai.toInt(), lpstr.rawAddress, lpdwstrlength.rawAddress, dwreserved.toInt())

public actual fun internetAlgIdToStringW(ai: AlgId, lpstr: Pwstr, lpdwstrlength: MutPtr, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetAlgIdToStringW(ai.toInt(), lpstr.rawAddress, lpdwstrlength.rawAddress, dwreserved.toInt())

public actual fun internetAttemptConnect(dwreserved: UInt): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetAttemptConnect(dwreserved.toInt()).toUInt()

public actual fun internetAutodial(dwflags: InternetAutodial, hwndparent: Hwnd): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetAutodial(dwflags.toInt(), hwndparent.rawAddress)

public actual fun internetAutodialHangup(dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetAutodialHangup(dwreserved.toInt())

public actual fun internetCanonicalizeUrlA(lpszurl: Pcstr, lpszbuffer: Pstr, lpdwbufferlength: MutPtr, dwflags: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetCanonicalizeUrlA(lpszurl.rawAddress, lpszbuffer.rawAddress, lpdwbufferlength.rawAddress, dwflags.toInt())

public actual fun internetCanonicalizeUrlW(lpszurl: Pcwstr, lpszbuffer: Pwstr, lpdwbufferlength: MutPtr, dwflags: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetCanonicalizeUrlW(lpszurl.rawAddress, lpszbuffer.rawAddress, lpdwbufferlength.rawAddress, dwflags.toInt())

public actual fun internetCheckConnectionA(lpszurl: Pcstr, dwflags: UInt, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetCheckConnectionA(lpszurl.rawAddress, dwflags.toInt(), dwreserved.toInt())

public actual fun internetCheckConnectionW(lpszurl: Pcwstr, dwflags: UInt, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetCheckConnectionW(lpszurl.rawAddress, dwflags.toInt(), dwreserved.toInt())

public actual fun internetClearAllPerSiteCookieDecisions(): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetClearAllPerSiteCookieDecisions()

public actual fun internetCloseHandle(hinternet: ConstPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetCloseHandle(hinternet.rawAddress)

public actual fun internetCombineUrlA(lpszbaseurl: Pcstr, lpszrelativeurl: Pcstr, lpszbuffer: Pstr, lpdwbufferlength: MutPtr, dwflags: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetCombineUrlA(lpszbaseurl.rawAddress, lpszrelativeurl.rawAddress, lpszbuffer.rawAddress, lpdwbufferlength.rawAddress, dwflags.toInt())

public actual fun internetCombineUrlW(lpszbaseurl: Pcwstr, lpszrelativeurl: Pcwstr, lpszbuffer: Pwstr, lpdwbufferlength: MutPtr, dwflags: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetCombineUrlW(lpszbaseurl.rawAddress, lpszrelativeurl.rawAddress, lpszbuffer.rawAddress, lpdwbufferlength.rawAddress, dwflags.toInt())

public actual fun internetConfirmZoneCrossing(hwnd: Hwnd, szurlprev: Pcstr, szurlnew: Pcstr, bpost: Bool): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetConfirmZoneCrossing(hwnd.rawAddress, szurlprev.rawAddress, szurlnew.rawAddress, bpost).toUInt()

public actual fun internetConfirmZoneCrossingA(hwnd: Hwnd, szurlprev: Pcstr, szurlnew: Pcstr, bpost: Bool): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetConfirmZoneCrossingA(hwnd.rawAddress, szurlprev.rawAddress, szurlnew.rawAddress, bpost).toUInt()

public actual fun internetConfirmZoneCrossingW(hwnd: Hwnd, szurlprev: Pcwstr, szurlnew: Pcwstr, bpost: Bool): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetConfirmZoneCrossingW(hwnd.rawAddress, szurlprev.rawAddress, szurlnew.rawAddress, bpost).toUInt()

public actual fun internetConnectA(hinternet: ConstPtr, lpszservername: Pcstr, nserverport: UShort, lpszusername: Pcstr, lpszpassword: Pcstr, dwservice: UInt, dwflags: UInt, dwcontext: ULong): MutPtr =
    MutPtr(WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetConnectA(hinternet.rawAddress, lpszservername.rawAddress, nserverport.toShort(), lpszusername.rawAddress, lpszpassword.rawAddress, dwservice.toInt(), dwflags.toInt(), dwcontext.toLong()))

public actual fun internetConnectW(hinternet: ConstPtr, lpszservername: Pcwstr, nserverport: UShort, lpszusername: Pcwstr, lpszpassword: Pcwstr, dwservice: UInt, dwflags: UInt, dwcontext: ULong): MutPtr =
    MutPtr(WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetConnectW(hinternet.rawAddress, lpszservername.rawAddress, nserverport.toShort(), lpszusername.rawAddress, lpszpassword.rawAddress, dwservice.toInt(), dwflags.toInt(), dwcontext.toLong()))

public actual fun internetConvertUrlFromWireToWideChar(pcszurl: Pcstr, cchurl: UInt, pcwszbaseurl: Pcwstr, dwcodepagehost: UInt, dwcodepagepath: UInt, fencodepathextra: Bool, dwcodepageextra: UInt, ppwszconvertedurl: MutPtr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetConvertUrlFromWireToWideChar(pcszurl.rawAddress, cchurl.toInt(), pcwszbaseurl.rawAddress, dwcodepagehost.toInt(), dwcodepagepath.toInt(), fencodepathextra, dwcodepageextra.toInt(), ppwszconvertedurl.rawAddress).toUInt()

public actual fun internetCrackUrlA(lpszurl: Pcstr, dwurllength: UInt, dwflags: WinHttpCreateUrlFlags, lpurlcomponents: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetCrackUrlA(lpszurl.rawAddress, dwurllength.toInt(), dwflags.toInt(), lpurlcomponents.rawAddress)

public actual fun internetCrackUrlW(lpszurl: Pcwstr, dwurllength: UInt, dwflags: WinHttpCreateUrlFlags, lpurlcomponents: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetCrackUrlW(lpszurl.rawAddress, dwurllength.toInt(), dwflags.toInt(), lpurlcomponents.rawAddress)

public actual fun internetCreateUrlA(lpurlcomponents: ConstPtr, dwflags: UInt, lpszurl: Pstr, lpdwurllength: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetCreateUrlA(lpurlcomponents.rawAddress, dwflags.toInt(), lpszurl.rawAddress, lpdwurllength.rawAddress)

public actual fun internetCreateUrlW(lpurlcomponents: ConstPtr, dwflags: UInt, lpszurl: Pwstr, lpdwurllength: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetCreateUrlW(lpurlcomponents.rawAddress, dwflags.toInt(), lpszurl.rawAddress, lpdwurllength.rawAddress)

public actual fun internetDial(hwndparent: Hwnd, lpszconnectoid: Pcstr, dwflags: UInt, lpdwconnection: MutPtr, dwreserved: UInt): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetDial(hwndparent.rawAddress, lpszconnectoid.rawAddress, dwflags.toInt(), lpdwconnection.rawAddress, dwreserved.toInt()).toUInt()

public actual fun internetDialA(hwndparent: Hwnd, lpszconnectoid: Pcstr, dwflags: UInt, lpdwconnection: MutPtr, dwreserved: UInt): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetDialA(hwndparent.rawAddress, lpszconnectoid.rawAddress, dwflags.toInt(), lpdwconnection.rawAddress, dwreserved.toInt()).toUInt()

public actual fun internetDialW(hwndparent: Hwnd, lpszconnectoid: Pcwstr, dwflags: UInt, lpdwconnection: MutPtr, dwreserved: UInt): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetDialW(hwndparent.rawAddress, lpszconnectoid.rawAddress, dwflags.toInt(), lpdwconnection.rawAddress, dwreserved.toInt()).toUInt()

public actual fun internetEnumPerSiteCookieDecisionA(pszsitename: Pstr, pcsitenamesize: MutPtr, pdwdecision: MutPtr, dwindex: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetEnumPerSiteCookieDecisionA(pszsitename.rawAddress, pcsitenamesize.rawAddress, pdwdecision.rawAddress, dwindex.toInt())

public actual fun internetEnumPerSiteCookieDecisionW(pszsitename: Pwstr, pcsitenamesize: MutPtr, pdwdecision: MutPtr, dwindex: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetEnumPerSiteCookieDecisionW(pszsitename.rawAddress, pcsitenamesize.rawAddress, pdwdecision.rawAddress, dwindex.toInt())

public actual fun internetErrorDlg(hwnd: Hwnd, hrequest: MutPtr, dwerror: UInt, dwflags: UInt, lppvdata: MutPtr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetErrorDlg(hwnd.rawAddress, hrequest.rawAddress, dwerror.toInt(), dwflags.toInt(), lppvdata.rawAddress).toUInt()

public actual fun internetFindNextFileA(hfind: ConstPtr, lpvfinddata: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetFindNextFileA(hfind.rawAddress, lpvfinddata.rawAddress)

public actual fun internetFindNextFileW(hfind: ConstPtr, lpvfinddata: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetFindNextFileW(hfind.rawAddress, lpvfinddata.rawAddress)

public actual fun internetFortezzaCommand(dwcommand: UInt, hwnd: Hwnd, dwreserved: ULong): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetFortezzaCommand(dwcommand.toInt(), hwnd.rawAddress, dwreserved.toLong())

public actual fun internetFreeCookies(pcookies: MutPtr, dwcookiecount: UInt) {
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetFreeCookies(pcookies.rawAddress, dwcookiecount.toInt())
}

public actual fun internetFreeProxyInfoList(pproxyinfolist: MutPtr) {
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetFreeProxyInfoList(pproxyinfolist.rawAddress)
}

public actual fun internetGetConnectedState(lpdwflags: MutPtr, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetGetConnectedState(lpdwflags.rawAddress, dwreserved.toInt())

public actual fun internetGetConnectedStateEx(lpdwflags: MutPtr, lpszconnectionname: Pstr, dwnamelen: UInt, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetGetConnectedStateEx(lpdwflags.rawAddress, lpszconnectionname.rawAddress, dwnamelen.toInt(), dwreserved.toInt())

public actual fun internetGetConnectedStateExA(lpdwflags: MutPtr, lpszconnectionname: Pstr, cchnamelen: UInt, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetGetConnectedStateExA(lpdwflags.rawAddress, lpszconnectionname.rawAddress, cchnamelen.toInt(), dwreserved.toInt())

public actual fun internetGetConnectedStateExW(lpdwflags: MutPtr, lpszconnectionname: Pwstr, cchnamelen: UInt, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetGetConnectedStateExW(lpdwflags.rawAddress, lpszconnectionname.rawAddress, cchnamelen.toInt(), dwreserved.toInt())

public actual fun internetGetCookieA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pstr, lpdwsize: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetGetCookieA(lpszurl.rawAddress, lpszcookiename.rawAddress, lpszcookiedata.rawAddress, lpdwsize.rawAddress)

public actual fun internetGetCookieEx2(pcwszurl: Pcwstr, pcwszcookiename: Pcwstr, dwflags: UInt, ppcookies: MutPtr, pdwcookiecount: MutPtr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetGetCookieEx2(pcwszurl.rawAddress, pcwszcookiename.rawAddress, dwflags.toInt(), ppcookies.rawAddress, pdwcookiecount.rawAddress).toUInt()

public actual fun internetGetCookieExA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pcstr, lpdwsize: MutPtr, dwflags: InternetCookieFlags, lpreserved: ConstPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetGetCookieExA(lpszurl.rawAddress, lpszcookiename.rawAddress, lpszcookiedata.rawAddress, lpdwsize.rawAddress, dwflags.toInt(), lpreserved.rawAddress)

public actual fun internetGetCookieExW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr, lpdwsize: MutPtr, dwflags: InternetCookieFlags, lpreserved: ConstPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetGetCookieExW(lpszurl.rawAddress, lpszcookiename.rawAddress, lpszcookiedata.rawAddress, lpdwsize.rawAddress, dwflags.toInt(), lpreserved.rawAddress)

public actual fun internetGetCookieW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pwstr, lpdwsize: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetGetCookieW(lpszurl.rawAddress, lpszcookiename.rawAddress, lpszcookiedata.rawAddress, lpdwsize.rawAddress)

public actual fun internetGetLastResponseInfoA(lpdwerror: MutPtr, lpszbuffer: Pstr, lpdwbufferlength: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetGetLastResponseInfoA(lpdwerror.rawAddress, lpszbuffer.rawAddress, lpdwbufferlength.rawAddress)

public actual fun internetGetLastResponseInfoW(lpdwerror: MutPtr, lpszbuffer: Pwstr, lpdwbufferlength: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetGetLastResponseInfoW(lpdwerror.rawAddress, lpszbuffer.rawAddress, lpdwbufferlength.rawAddress)

public actual fun internetGetPerSiteCookieDecisionA(pchhostname: Pcstr, presult: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetGetPerSiteCookieDecisionA(pchhostname.rawAddress, presult.rawAddress)

public actual fun internetGetPerSiteCookieDecisionW(pchhostname: Pcwstr, presult: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetGetPerSiteCookieDecisionW(pchhostname.rawAddress, presult.rawAddress)

public actual fun internetGetProxyForUrl(hinternet: ConstPtr, pcwszurl: Pcwstr, pproxyinfolist: MutPtr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetGetProxyForUrl(hinternet.rawAddress, pcwszurl.rawAddress, pproxyinfolist.rawAddress).toUInt()

public actual fun internetGetSecurityInfoByURL(lpszurl: Pcstr, ppcertchain: MutPtr, pdwsecureflags: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetGetSecurityInfoByURL(lpszurl.rawAddress, ppcertchain.rawAddress, pdwsecureflags.rawAddress)

public actual fun internetGetSecurityInfoByURLA(lpszurl: Pcstr, ppcertchain: MutPtr, pdwsecureflags: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetGetSecurityInfoByURLA(lpszurl.rawAddress, ppcertchain.rawAddress, pdwsecureflags.rawAddress)

public actual fun internetGetSecurityInfoByURLW(lpszurl: Pcwstr, ppcertchain: MutPtr, pdwsecureflags: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetGetSecurityInfoByURLW(lpszurl.rawAddress, ppcertchain.rawAddress, pdwsecureflags.rawAddress)

public actual fun internetGoOnline(lpszurl: Pcstr, hwndparent: Hwnd, dwflags: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetGoOnline(lpszurl.rawAddress, hwndparent.rawAddress, dwflags.toInt())

public actual fun internetGoOnlineA(lpszurl: Pcstr, hwndparent: Hwnd, dwflags: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetGoOnlineA(lpszurl.rawAddress, hwndparent.rawAddress, dwflags.toInt())

public actual fun internetGoOnlineW(lpszurl: Pcwstr, hwndparent: Hwnd, dwflags: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetGoOnlineW(lpszurl.rawAddress, hwndparent.rawAddress, dwflags.toInt())

public actual fun internetHangUp(dwconnection: ULong, dwreserved: UInt): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetHangUp(dwconnection.toLong(), dwreserved.toInt()).toUInt()

public actual fun internetInitializeAutoProxyDll(dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetInitializeAutoProxyDll(dwreserved.toInt())

public actual fun internetLockRequestFile(hinternet: ConstPtr, lphlockrequestinfo: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetLockRequestFile(hinternet.rawAddress, lphlockrequestinfo.rawAddress)

public actual fun internetOpenA(lpszagent: Pcstr, dwaccesstype: UInt, lpszproxy: Pcstr, lpszproxybypass: Pcstr, dwflags: UInt): MutPtr =
    MutPtr(WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetOpenA(lpszagent.rawAddress, dwaccesstype.toInt(), lpszproxy.rawAddress, lpszproxybypass.rawAddress, dwflags.toInt()))

public actual fun internetOpenUrlA(hinternet: ConstPtr, lpszurl: Pcstr, lpszheaders: Pcstr, dwheaderslength: UInt, dwflags: UInt, dwcontext: ULong): MutPtr =
    MutPtr(WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetOpenUrlA(hinternet.rawAddress, lpszurl.rawAddress, lpszheaders.rawAddress, dwheaderslength.toInt(), dwflags.toInt(), dwcontext.toLong()))

public actual fun internetOpenUrlW(hinternet: ConstPtr, lpszurl: Pcwstr, lpszheaders: Pcwstr, dwheaderslength: UInt, dwflags: UInt, dwcontext: ULong): MutPtr =
    MutPtr(WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetOpenUrlW(hinternet.rawAddress, lpszurl.rawAddress, lpszheaders.rawAddress, dwheaderslength.toInt(), dwflags.toInt(), dwcontext.toLong()))

public actual fun internetOpenW(lpszagent: Pcwstr, dwaccesstype: UInt, lpszproxy: Pcwstr, lpszproxybypass: Pcwstr, dwflags: UInt): MutPtr =
    MutPtr(WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetOpenW(lpszagent.rawAddress, dwaccesstype.toInt(), lpszproxy.rawAddress, lpszproxybypass.rawAddress, dwflags.toInt()))

public actual fun internetQueryDataAvailable(hfile: ConstPtr, lpdwnumberofbytesavailable: MutPtr, dwflags: UInt, dwcontext: ULong): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetQueryDataAvailable(hfile.rawAddress, lpdwnumberofbytesavailable.rawAddress, dwflags.toInt(), dwcontext.toLong())

public actual fun internetQueryFortezzaStatus(pdwstatus: MutPtr, dwreserved: ULong): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetQueryFortezzaStatus(pdwstatus.rawAddress, dwreserved.toLong())

public actual fun internetQueryOptionA(hinternet: ConstPtr, dwoption: UInt, lpbuffer: MutPtr, lpdwbufferlength: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetQueryOptionA(hinternet.rawAddress, dwoption.toInt(), lpbuffer.rawAddress, lpdwbufferlength.rawAddress)

public actual fun internetQueryOptionW(hinternet: ConstPtr, dwoption: UInt, lpbuffer: MutPtr, lpdwbufferlength: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetQueryOptionW(hinternet.rawAddress, dwoption.toInt(), lpbuffer.rawAddress, lpdwbufferlength.rawAddress)

public actual fun internetReadFile(hfile: ConstPtr, lpbuffer: MutPtr, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetReadFile(hfile.rawAddress, lpbuffer.rawAddress, dwnumberofbytestoread.toInt(), lpdwnumberofbytesread.rawAddress)

public actual fun internetReadFileExA(hfile: ConstPtr, lpbuffersout: MutPtr, dwflags: UInt, dwcontext: ULong): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetReadFileExA(hfile.rawAddress, lpbuffersout.rawAddress, dwflags.toInt(), dwcontext.toLong())

public actual fun internetReadFileExW(hfile: ConstPtr, lpbuffersout: MutPtr, dwflags: UInt, dwcontext: ULong): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetReadFileExW(hfile.rawAddress, lpbuffersout.rawAddress, dwflags.toInt(), dwcontext.toLong())

public actual fun internetSecurityProtocolToStringA(dwprotocol: UInt, lpstr: Pstr, lpdwstrlength: MutPtr, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetSecurityProtocolToStringA(dwprotocol.toInt(), lpstr.rawAddress, lpdwstrlength.rawAddress, dwreserved.toInt())

public actual fun internetSecurityProtocolToStringW(dwprotocol: UInt, lpstr: Pwstr, lpdwstrlength: MutPtr, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetSecurityProtocolToStringW(dwprotocol.toInt(), lpstr.rawAddress, lpdwstrlength.rawAddress, dwreserved.toInt())

public actual fun internetSetCookieA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pcstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetSetCookieA(lpszurl.rawAddress, lpszcookiename.rawAddress, lpszcookiedata.rawAddress)

public actual fun internetSetCookieEx2(pcwszurl: Pcwstr, pcookie: ConstPtr, pcwszp3ppolicy: Pcwstr, dwflags: UInt, pdwcookiestate: MutPtr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetSetCookieEx2(pcwszurl.rawAddress, pcookie.rawAddress, pcwszp3ppolicy.rawAddress, dwflags.toInt(), pdwcookiestate.rawAddress).toUInt()

public actual fun internetSetCookieExA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pcstr, dwflags: UInt, dwreserved: ULong): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetSetCookieExA(lpszurl.rawAddress, lpszcookiename.rawAddress, lpszcookiedata.rawAddress, dwflags.toInt(), dwreserved.toLong()).toUInt()

public actual fun internetSetCookieExW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr, dwflags: UInt, dwreserved: ULong): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetSetCookieExW(lpszurl.rawAddress, lpszcookiename.rawAddress, lpszcookiedata.rawAddress, dwflags.toInt(), dwreserved.toLong()).toUInt()

public actual fun internetSetCookieW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetSetCookieW(lpszurl.rawAddress, lpszcookiename.rawAddress, lpszcookiedata.rawAddress)

public actual fun internetSetDialState(lpszconnectoid: Pcstr, dwstate: UInt, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetSetDialState(lpszconnectoid.rawAddress, dwstate.toInt(), dwreserved.toInt())

public actual fun internetSetDialStateA(lpszconnectoid: Pcstr, dwstate: UInt, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetSetDialStateA(lpszconnectoid.rawAddress, dwstate.toInt(), dwreserved.toInt())

public actual fun internetSetDialStateW(lpszconnectoid: Pcwstr, dwstate: UInt, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetSetDialStateW(lpszconnectoid.rawAddress, dwstate.toInt(), dwreserved.toInt())

public actual fun internetSetFilePointer(hfile: ConstPtr, ldistancetomove: Int, lpdistancetomovehigh: MutPtr, dwmovemethod: UInt, dwcontext: ULong): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetSetFilePointer(hfile.rawAddress, ldistancetomove, lpdistancetomovehigh.rawAddress, dwmovemethod.toInt(), dwcontext.toLong()).toUInt()

public actual fun internetSetOptionA(hinternet: ConstPtr, dwoption: UInt, lpbuffer: ConstPtr, dwbufferlength: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetSetOptionA(hinternet.rawAddress, dwoption.toInt(), lpbuffer.rawAddress, dwbufferlength.toInt())

public actual fun internetSetOptionExA(hinternet: ConstPtr, dwoption: UInt, lpbuffer: ConstPtr, dwbufferlength: UInt, dwflags: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetSetOptionExA(hinternet.rawAddress, dwoption.toInt(), lpbuffer.rawAddress, dwbufferlength.toInt(), dwflags.toInt())

public actual fun internetSetOptionExW(hinternet: ConstPtr, dwoption: UInt, lpbuffer: ConstPtr, dwbufferlength: UInt, dwflags: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetSetOptionExW(hinternet.rawAddress, dwoption.toInt(), lpbuffer.rawAddress, dwbufferlength.toInt(), dwflags.toInt())

public actual fun internetSetOptionW(hinternet: ConstPtr, dwoption: UInt, lpbuffer: ConstPtr, dwbufferlength: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetSetOptionW(hinternet.rawAddress, dwoption.toInt(), lpbuffer.rawAddress, dwbufferlength.toInt())

public actual fun internetSetPerSiteCookieDecisionA(pchhostname: Pcstr, dwdecision: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetSetPerSiteCookieDecisionA(pchhostname.rawAddress, dwdecision.toInt())

public actual fun internetSetPerSiteCookieDecisionW(pchhostname: Pcwstr, dwdecision: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetSetPerSiteCookieDecisionW(pchhostname.rawAddress, dwdecision.toInt())

public actual fun internetSetStatusCallback(hinternet: ConstPtr, lpfninternetcallback: LpinternetStatusCallback): LpinternetStatusCallback =
    null

public actual fun internetSetStatusCallbackA(hinternet: ConstPtr, lpfninternetcallback: LpinternetStatusCallback): LpinternetStatusCallback =
    null

public actual fun internetSetStatusCallbackW(hinternet: ConstPtr, lpfninternetcallback: LpinternetStatusCallback): LpinternetStatusCallback =
    null

public actual fun internetShowSecurityInfoByURL(lpszurl: Pcstr, hwndparent: Hwnd): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetShowSecurityInfoByURL(lpszurl.rawAddress, hwndparent.rawAddress)

public actual fun internetShowSecurityInfoByURLA(lpszurl: Pcstr, hwndparent: Hwnd): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetShowSecurityInfoByURLA(lpszurl.rawAddress, hwndparent.rawAddress)

public actual fun internetShowSecurityInfoByURLW(lpszurl: Pcwstr, hwndparent: Hwnd): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetShowSecurityInfoByURLW(lpszurl.rawAddress, hwndparent.rawAddress)

public actual fun internetTimeFromSystemTime(pst: ConstPtr, dwrfc: UInt, lpsztime: Pstr, cbtime: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetTimeFromSystemTime(pst.rawAddress, dwrfc.toInt(), lpsztime.rawAddress, cbtime.toInt())

public actual fun internetTimeFromSystemTimeA(pst: ConstPtr, dwrfc: UInt, lpsztime: Pstr, cbtime: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetTimeFromSystemTimeA(pst.rawAddress, dwrfc.toInt(), lpsztime.rawAddress, cbtime.toInt())

public actual fun internetTimeFromSystemTimeW(pst: ConstPtr, dwrfc: UInt, lpsztime: Pwstr, cbtime: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetTimeFromSystemTimeW(pst.rawAddress, dwrfc.toInt(), lpsztime.rawAddress, cbtime.toInt())

public actual fun internetTimeToSystemTime(lpsztime: Pcstr, pst: MutPtr, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetTimeToSystemTime(lpsztime.rawAddress, pst.rawAddress, dwreserved.toInt())

public actual fun internetTimeToSystemTimeA(lpsztime: Pcstr, pst: MutPtr, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetTimeToSystemTimeA(lpsztime.rawAddress, pst.rawAddress, dwreserved.toInt())

public actual fun internetTimeToSystemTimeW(lpsztime: Pcwstr, pst: MutPtr, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetTimeToSystemTimeW(lpsztime.rawAddress, pst.rawAddress, dwreserved.toInt())

public actual fun internetUnlockRequestFile(hlockrequestinfo: Handle): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetUnlockRequestFile(hlockrequestinfo.rawAddress)

public actual fun internetWriteFile(hfile: ConstPtr, lpbuffer: ConstPtr, dwnumberofbytestowrite: UInt, lpdwnumberofbyteswritten: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetWriteFile(hfile.rawAddress, lpbuffer.rawAddress, dwnumberofbytestowrite.toInt(), lpdwnumberofbyteswritten.rawAddress)

public actual fun internetWriteFileExA(hfile: ConstPtr, lpbuffersin: ConstPtr, dwflags: UInt, dwcontext: ULong): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetWriteFileExA(hfile.rawAddress, lpbuffersin.rawAddress, dwflags.toInt(), dwcontext.toLong())

public actual fun internetWriteFileExW(hfile: ConstPtr, lpbuffersin: ConstPtr, dwflags: UInt, dwcontext: ULong): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetInternetWriteFileExW(hfile.rawAddress, lpbuffersin.rawAddress, dwflags.toInt(), dwcontext.toLong())

public actual fun isDomainLegalCookieDomainA(pchdomain: Pcstr, pchfulldomain: Pcstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetIsDomainLegalCookieDomainA(pchdomain.rawAddress, pchfulldomain.rawAddress)

public actual fun isDomainLegalCookieDomainW(pchdomain: Pcwstr, pchfulldomain: Pcwstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetIsDomainLegalCookieDomainW(pchdomain.rawAddress, pchfulldomain.rawAddress)

public actual fun isHostInProxyBypassList(tscheme: InternetScheme, lpszhost: Pcstr, cchhost: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetIsHostInProxyBypassList(tscheme, lpszhost.rawAddress, cchhost.toInt())

public actual fun isProfilesEnabled(): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetIsProfilesEnabled()

public actual fun isUrlCacheEntryExpiredA(lpszurlname: Pcstr, dwflags: UInt, pftlastmodified: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetIsUrlCacheEntryExpiredA(lpszurlname.rawAddress, dwflags.toInt(), pftlastmodified.rawAddress)

public actual fun isUrlCacheEntryExpiredW(lpszurlname: Pcwstr, dwflags: UInt, pftlastmodified: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetIsUrlCacheEntryExpiredW(lpszurlname.rawAddress, dwflags.toInt(), pftlastmodified.rawAddress)

public actual fun loadUrlCacheContent(): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetLoadUrlCacheContent()

public actual fun parseX509EncodedCertificateForListBoxEntry(lpcert: ConstPtr, cbcert: UInt, lpszlistboxentry: Pstr, lpdwlistboxentry: MutPtr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetParseX509EncodedCertificateForListBoxEntry(lpcert.rawAddress, cbcert.toInt(), lpszlistboxentry.rawAddress, lpdwlistboxentry.rawAddress).toUInt()

public actual fun performOperationOverUrlCacheA(pszurlsearchpattern: Pcstr, dwflags: UInt, dwfilter: UInt, groupid: Long, preserved1: ConstPtr, pdwreserved2: ConstPtr, preserved3: ConstPtr, op: CacheOperator, poperatordata: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetPerformOperationOverUrlCacheA(pszurlsearchpattern.rawAddress, dwflags.toInt(), dwfilter.toInt(), groupid, preserved1.rawAddress, pdwreserved2.rawAddress, preserved3.rawAddress, 0L, poperatordata.rawAddress)

public actual fun privacyGetZonePreferenceW(dwzone: UInt, dwtype: UInt, pdwtemplate: MutPtr, pszbuffer: Pwstr, pdwbufferlength: MutPtr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetPrivacyGetZonePreferenceW(dwzone.toInt(), dwtype.toInt(), pdwtemplate.rawAddress, pszbuffer.rawAddress, pdwbufferlength.rawAddress).toUInt()

public actual fun privacySetZonePreferenceW(dwzone: UInt, dwtype: UInt, dwtemplate: UInt, pszpreference: Pcwstr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetPrivacySetZonePreferenceW(dwzone.toInt(), dwtype.toInt(), dwtemplate.toInt(), pszpreference.rawAddress).toUInt()

public actual fun readGuidsForConnectedNetworks(pcnetworks: MutPtr, pppwsznetworkguids: MutPtr, pppbstrnetworknames: MutPtr, pppwszgwmacs: MutPtr, pcgatewaymacs: MutPtr, pdwflags: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetReadGuidsForConnectedNetworks(pcnetworks.rawAddress, pppwsznetworkguids.rawAddress, pppbstrnetworknames.rawAddress, pppwszgwmacs.rawAddress, pcgatewaymacs.rawAddress, pdwflags.rawAddress)

public actual fun readUrlCacheEntryStream(hurlcachestream: Handle, dwlocation: UInt, lpbuffer: MutPtr, lpdwlen: MutPtr, reserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetReadUrlCacheEntryStream(hurlcachestream.rawAddress, dwlocation.toInt(), lpbuffer.rawAddress, lpdwlen.rawAddress, reserved.toInt())

public actual fun readUrlCacheEntryStreamEx(hurlcachestream: Handle, qwlocation: ULong, lpbuffer: MutPtr, lpdwlen: MutPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetReadUrlCacheEntryStreamEx(hurlcachestream.rawAddress, qwlocation.toLong(), lpbuffer.rawAddress, lpdwlen.rawAddress)

public actual fun registerUrlCacheNotification(hwnd: Hwnd, umsg: UInt, gid: Long, dwopsfilter: UInt, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetRegisterUrlCacheNotification(hwnd.rawAddress, umsg.toInt(), gid, dwopsfilter.toInt(), dwreserved.toInt())

public actual fun resumeSuspendedDownload(hrequest: ConstPtr, dwresultcode: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetResumeSuspendedDownload(hrequest.rawAddress, dwresultcode.toInt())

public actual fun retrieveUrlCacheEntryFileA(lpszurlname: Pcstr, lpcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetRetrieveUrlCacheEntryFileA(lpszurlname.rawAddress, lpcacheentryinfo.rawAddress, lpcbcacheentryinfo.rawAddress, dwreserved.toInt())

public actual fun retrieveUrlCacheEntryFileW(lpszurlname: Pcwstr, lpcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetRetrieveUrlCacheEntryFileW(lpszurlname.rawAddress, lpcacheentryinfo.rawAddress, lpcbcacheentryinfo.rawAddress, dwreserved.toInt())

public actual fun retrieveUrlCacheEntryStreamA(lpszurlname: Pcstr, lpcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, frandomread: Bool, dwreserved: UInt): Handle =
    MutPtr(WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetRetrieveUrlCacheEntryStreamA(lpszurlname.rawAddress, lpcacheentryinfo.rawAddress, lpcbcacheentryinfo.rawAddress, frandomread, dwreserved.toInt()))

public actual fun retrieveUrlCacheEntryStreamW(lpszurlname: Pcwstr, lpcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, frandomread: Bool, dwreserved: UInt): Handle =
    MutPtr(WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetRetrieveUrlCacheEntryStreamW(lpszurlname.rawAddress, lpcacheentryinfo.rawAddress, lpcbcacheentryinfo.rawAddress, frandomread, dwreserved.toInt()))

public actual fun runOnceUrlCache(hwnd: Hwnd, hinst: Hinstance, lpszcmd: Pcstr, ncmdshow: Int): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetRunOnceUrlCache(hwnd.rawAddress, hinst.rawAddress, lpszcmd.rawAddress, ncmdshow).toUInt()

public actual fun setUrlCacheConfigInfoA(lpcacheconfiginfo: ConstPtr, dwfieldcontrol: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetSetUrlCacheConfigInfoA(lpcacheconfiginfo.rawAddress, dwfieldcontrol.toInt())

public actual fun setUrlCacheConfigInfoW(lpcacheconfiginfo: ConstPtr, dwfieldcontrol: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetSetUrlCacheConfigInfoW(lpcacheconfiginfo.rawAddress, dwfieldcontrol.toInt())

public actual fun setUrlCacheEntryGroup(lpszurlname: Pcstr, dwflags: UInt, groupid: Long, pbgroupattributes: ConstPtr, cbgroupattributes: UInt, lpreserved: ConstPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetSetUrlCacheEntryGroup(lpszurlname.rawAddress, dwflags.toInt(), groupid, pbgroupattributes.rawAddress, cbgroupattributes.toInt(), lpreserved.rawAddress)

public actual fun setUrlCacheEntryGroupA(lpszurlname: Pcstr, dwflags: UInt, groupid: Long, pbgroupattributes: ConstPtr, cbgroupattributes: UInt, lpreserved: ConstPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetSetUrlCacheEntryGroupA(lpszurlname.rawAddress, dwflags.toInt(), groupid, pbgroupattributes.rawAddress, cbgroupattributes.toInt(), lpreserved.rawAddress)

public actual fun setUrlCacheEntryGroupW(lpszurlname: Pcwstr, dwflags: UInt, groupid: Long, pbgroupattributes: ConstPtr, cbgroupattributes: UInt, lpreserved: ConstPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetSetUrlCacheEntryGroupW(lpszurlname.rawAddress, dwflags.toInt(), groupid, pbgroupattributes.rawAddress, cbgroupattributes.toInt(), lpreserved.rawAddress)

public actual fun setUrlCacheEntryInfoA(lpszurlname: Pcstr, lpcacheentryinfo: ConstPtr, dwfieldcontrol: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetSetUrlCacheEntryInfoA(lpszurlname.rawAddress, lpcacheentryinfo.rawAddress, dwfieldcontrol.toInt())

public actual fun setUrlCacheEntryInfoW(lpszurlname: Pcwstr, lpcacheentryinfo: ConstPtr, dwfieldcontrol: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetSetUrlCacheEntryInfoW(lpszurlname.rawAddress, lpcacheentryinfo.rawAddress, dwfieldcontrol.toInt())

public actual fun setUrlCacheGroupAttributeA(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: ConstPtr, lpreserved: ConstPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetSetUrlCacheGroupAttributeA(gid, dwflags.toInt(), dwattributes.toInt(), lpgroupinfo.rawAddress, lpreserved.rawAddress)

public actual fun setUrlCacheGroupAttributeW(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: ConstPtr, lpreserved: ConstPtr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetSetUrlCacheGroupAttributeW(gid, dwflags.toInt(), dwattributes.toInt(), lpgroupinfo.rawAddress, lpreserved.rawAddress)

public actual fun setUrlCacheHeaderData(nidx: UInt, dwdata: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetSetUrlCacheHeaderData(nidx.toInt(), dwdata.toInt())

public actual fun showClientAuthCerts(hwndparent: Hwnd): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetShowClientAuthCerts(hwndparent.rawAddress).toUInt()

public actual fun showSecurityInfo(hwndparent: Hwnd, psecurityinfo: ConstPtr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetShowSecurityInfo(hwndparent.rawAddress, psecurityinfo.rawAddress).toUInt()

public actual fun showX509EncodedCertificate(hwndparent: Hwnd, lpcert: ConstPtr, cbcert: UInt): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetShowX509EncodedCertificate(hwndparent.rawAddress, lpcert.rawAddress, cbcert.toInt()).toUInt()

public actual fun unlockUrlCacheEntryFile(lpszurlname: Pcstr, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetUnlockUrlCacheEntryFile(lpszurlname.rawAddress, dwreserved.toInt())

public actual fun unlockUrlCacheEntryFileA(lpszurlname: Pcstr, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetUnlockUrlCacheEntryFileA(lpszurlname.rawAddress, dwreserved.toInt())

public actual fun unlockUrlCacheEntryFileW(lpszurlname: Pcwstr, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetUnlockUrlCacheEntryFileW(lpszurlname.rawAddress, dwreserved.toInt())

public actual fun unlockUrlCacheEntryStream(hurlcachestream: Handle, reserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetUnlockUrlCacheEntryStream(hurlcachestream.rawAddress, reserved.toInt())

public actual fun updateUrlCacheContentPath(sznewpath: Pcstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetUpdateUrlCacheContentPath(sznewpath.rawAddress)

public actual fun urlCacheCheckEntriesExist(rgpwszurls: ConstPtr, centries: UInt, rgfexist: MutPtr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetUrlCacheCheckEntriesExist(rgpwszurls.rawAddress, centries.toInt(), rgfexist.rawAddress).toUInt()

public actual fun urlCacheCloseEntryHandle(hentryfile: ConstPtr) {
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetUrlCacheCloseEntryHandle(hentryfile.rawAddress)
}

public actual fun urlCacheContainerSetEntryMaximumAge(pwszprefix: Pcwstr, dwentrymaxage: UInt): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetUrlCacheContainerSetEntryMaximumAge(pwszprefix.rawAddress, dwentrymaxage.toInt()).toUInt()

public actual fun urlCacheCreateContainer(pwszname: Pcwstr, pwszprefix: Pcwstr, pwszdirectory: Pcwstr, ulllimit: ULong, dwoptions: UInt): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetUrlCacheCreateContainer(pwszname.rawAddress, pwszprefix.rawAddress, pwszdirectory.rawAddress, ulllimit.toLong(), dwoptions.toInt()).toUInt()

public actual fun urlCacheFindFirstEntry(pwszprefix: Pcwstr, dwflags: UInt, dwfilter: UInt, groupid: Long, pcacheentryinfo: MutPtr, phfind: MutPtr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetUrlCacheFindFirstEntry(pwszprefix.rawAddress, dwflags.toInt(), dwfilter.toInt(), groupid, pcacheentryinfo.rawAddress, phfind.rawAddress).toUInt()

public actual fun urlCacheFindNextEntry(hfind: Handle, pcacheentryinfo: MutPtr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetUrlCacheFindNextEntry(hfind.rawAddress, pcacheentryinfo.rawAddress).toUInt()

public actual fun urlCacheFreeEntryInfo(pcacheentryinfo: MutPtr) {
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetUrlCacheFreeEntryInfo(pcacheentryinfo.rawAddress)
}

public actual fun urlCacheFreeGlobalSpace(ulltargetsize: ULong, dwfilter: UInt): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetUrlCacheFreeGlobalSpace(ulltargetsize.toLong(), dwfilter.toInt()).toUInt()

public actual fun urlCacheGetContentPaths(pppwszdirectories: MutPtr, pcdirectories: MutPtr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetUrlCacheGetContentPaths(pppwszdirectories.rawAddress, pcdirectories.rawAddress).toUInt()

public actual fun urlCacheGetEntryInfo(happcache: ConstPtr, pcwszurl: Pcwstr, pcacheentryinfo: MutPtr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetUrlCacheGetEntryInfo(happcache.rawAddress, pcwszurl.rawAddress, pcacheentryinfo.rawAddress).toUInt()

public actual fun urlCacheGetGlobalCacheSize(dwfilter: UInt, pullsize: MutPtr, pulllimit: MutPtr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetUrlCacheGetGlobalCacheSize(dwfilter.toInt(), pullsize.rawAddress, pulllimit.rawAddress).toUInt()

public actual fun urlCacheGetGlobalLimit(limittype: UrlCacheLimitType, pulllimit: MutPtr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetUrlCacheGetGlobalLimit(limittype, pulllimit.rawAddress).toUInt()

public actual fun urlCacheReadEntryStream(hurlcachestream: ConstPtr, ulllocation: ULong, pbuffer: MutPtr, dwbufferlen: UInt, pdwbufferlen: MutPtr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetUrlCacheReadEntryStream(hurlcachestream.rawAddress, ulllocation.toLong(), pbuffer.rawAddress, dwbufferlen.toInt(), pdwbufferlen.rawAddress).toUInt()

public actual fun urlCacheReloadSettings(): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetUrlCacheReloadSettings().toUInt()

public actual fun urlCacheRetrieveEntryFile(happcache: ConstPtr, pcwszurl: Pcwstr, pcacheentryinfo: MutPtr, phentryfile: MutPtr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetUrlCacheRetrieveEntryFile(happcache.rawAddress, pcwszurl.rawAddress, pcacheentryinfo.rawAddress, phentryfile.rawAddress).toUInt()

public actual fun urlCacheRetrieveEntryStream(happcache: ConstPtr, pcwszurl: Pcwstr, frandomread: Bool, pcacheentryinfo: MutPtr, phentrystream: MutPtr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetUrlCacheRetrieveEntryStream(happcache.rawAddress, pcwszurl.rawAddress, frandomread, pcacheentryinfo.rawAddress, phentrystream.rawAddress).toUInt()

public actual fun urlCacheServer(): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetUrlCacheServer().toUInt()

public actual fun urlCacheSetGlobalLimit(limittype: UrlCacheLimitType, ulllimit: ULong): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetUrlCacheSetGlobalLimit(limittype, ulllimit.toLong()).toUInt()

public actual fun urlCacheUpdateEntryExtraData(happcache: ConstPtr, pcwszurl: Pcwstr, pbextradata: ConstPtr, cbextradata: UInt): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssysWindowsWin32NetworkingWininetUrlCacheUpdateEntryExtraData(happcache.rawAddress, pcwszurl.rawAddress, pbextradata.rawAddress, cbextradata.toInt()).toUInt()
