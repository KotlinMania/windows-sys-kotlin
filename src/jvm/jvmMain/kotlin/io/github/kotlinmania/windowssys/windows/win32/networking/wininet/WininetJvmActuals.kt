@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.wininet

import io.github.kotlinmania.windowssys.COpaquePointer
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
    external fun windowssys_windows_win32_networking_wininet_appCacheCheckManifest(pwszmasterurl: Long, pwszmanifesturl: Long, pbmanifestdata: Long, dwmanifestdatasize: Int, pbmanifestresponseheaders: Long, dwmanifestresponseheaderssize: Int, pestate: Long, phnewappcache: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_appCacheCloseHandle(happcache: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_appCacheCreateAndCommitFile(happcache: Long, pwszsourcefilepath: Long, pwszurl: Long, pbresponseheaders: Long, dwresponseheaderssize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_appCacheDeleteGroup(pwszmanifesturl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_appCacheDeleteIEGroup(pwszmanifesturl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_appCacheDuplicateHandle(happcache: Long, phduplicatedappcache: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_appCacheFinalize(happcache: Long, pbmanifestdata: Long, dwmanifestdatasize: Int, pestate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_appCacheFreeDownloadList(pdownloadlist: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_appCacheFreeGroupList(pappcachegrouplist: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_appCacheGetDownloadList(happcache: Long, pdownloadlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_appCacheGetFallbackUrl(happcache: Long, pwszurl: Long, ppwszfallbackurl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_appCacheGetGroupList(pappcachegrouplist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_appCacheGetIEGroupList(pappcachegrouplist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_appCacheGetInfo(happcache: Long, pappcacheinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_appCacheGetManifestUrl(happcache: Long, ppwszmanifesturl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_appCacheLookup(pwszurl: Long, dwflags: Int, phappcache: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_createMD5SSOHash(pszchallengeinfo: Long, pwszrealm: Long, pwsztarget: Long, pbhexhash: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_createUrlCacheContainerA(name: Long, lpcacheprefix: Long, lpszcachepath: Long, kbcachelimit: Int, dwcontainertype: Int, dwoptions: Int, pvbuffer: Long, cbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_createUrlCacheContainerW(name: Long, lpcacheprefix: Long, lpszcachepath: Long, kbcachelimit: Int, dwcontainertype: Int, dwoptions: Int, pvbuffer: Long, cbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_createUrlCacheEntryA(lpszurlname: Long, dwexpectedfilesize: Int, lpszfileextension: Long, lpszfilename: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_createUrlCacheEntryExW(lpszurlname: Long, dwexpectedfilesize: Int, lpszfileextension: Long, lpszfilename: Long, dwreserved: Int, fpreserveincomingfilename: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_createUrlCacheEntryW(lpszurlname: Long, dwexpectedfilesize: Int, lpszfileextension: Long, lpszfilename: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_createUrlCacheGroup(dwflags: Int, lpreserved: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_deleteIE3Cache(hwnd: Long, hinst: Long, lpszcmd: Long, ncmdshow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_deleteUrlCacheContainerA(name: Long, dwoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_deleteUrlCacheContainerW(name: Long, dwoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_deleteUrlCacheEntry(lpszurlname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_deleteUrlCacheEntryA(lpszurlname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_deleteUrlCacheEntryW(lpszurlname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_deleteUrlCacheGroup(groupid: Long, dwflags: Int, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_deleteWpadCacheForNetworks(param0: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_detectAutoProxyUrl(pszautoproxyurl: Long, cchautoproxyurl: Int, dwdetectflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_doConnectoidsExist(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_exportCookieFileA(szfilename: Long, fappend: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_exportCookieFileW(szfilename: Long, fappend: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_findCloseUrlCache(henumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_findFirstUrlCacheContainerA(pdwmodified: Long, lpcontainerinfo: Long, lpcbcontainerinfo: Long, dwoptions: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_findFirstUrlCacheContainerW(pdwmodified: Long, lpcontainerinfo: Long, lpcbcontainerinfo: Long, dwoptions: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_findFirstUrlCacheEntryA(lpszurlsearchpattern: Long, lpfirstcacheentryinfo: Long, lpcbcacheentryinfo: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_findFirstUrlCacheEntryExA(lpszurlsearchpattern: Long, dwflags: Int, dwfilter: Int, groupid: Long, lpfirstcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpgroupattributes: Long, lpcbgroupattributes: Long, lpreserved: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_findFirstUrlCacheEntryExW(lpszurlsearchpattern: Long, dwflags: Int, dwfilter: Int, groupid: Long, lpfirstcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpgroupattributes: Long, lpcbgroupattributes: Long, lpreserved: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_findFirstUrlCacheEntryW(lpszurlsearchpattern: Long, lpfirstcacheentryinfo: Long, lpcbcacheentryinfo: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_findFirstUrlCacheGroup(dwflags: Int, dwfilter: Int, lpsearchcondition: Long, dwsearchcondition: Int, lpgroupid: Long, lpreserved: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_findNextUrlCacheContainerA(henumhandle: Long, lpcontainerinfo: Long, lpcbcontainerinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_findNextUrlCacheContainerW(henumhandle: Long, lpcontainerinfo: Long, lpcbcontainerinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_findNextUrlCacheEntryA(henumhandle: Long, lpnextcacheentryinfo: Long, lpcbcacheentryinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_findNextUrlCacheEntryExA(henumhandle: Long, lpnextcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpgroupattributes: Long, lpcbgroupattributes: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_findNextUrlCacheEntryExW(henumhandle: Long, lpnextcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpgroupattributes: Long, lpcbgroupattributes: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_findNextUrlCacheEntryW(henumhandle: Long, lpnextcacheentryinfo: Long, lpcbcacheentryinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_findNextUrlCacheGroup(hfind: Long, lpgroupid: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_findP3PPolicySymbol(pszsymbol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_freeUrlCacheSpaceA(lpszcachepath: Long, dwsize: Int, dwfilter: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_freeUrlCacheSpaceW(lpszcachepath: Long, dwsize: Int, dwfilter: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_ftpCommandA(hconnect: Long, fexpectresponse: Int, dwflags: Int, lpszcommand: Long, dwcontext: Long, phftpcommand: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_ftpCommandW(hconnect: Long, fexpectresponse: Int, dwflags: Int, lpszcommand: Long, dwcontext: Long, phftpcommand: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_ftpCreateDirectoryA(hconnect: Long, lpszdirectory: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_ftpCreateDirectoryW(hconnect: Long, lpszdirectory: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_ftpDeleteFileA(hconnect: Long, lpszfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_ftpDeleteFileW(hconnect: Long, lpszfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_ftpFindFirstFileA(hconnect: Long, lpszsearchfile: Long, lpfindfiledata: Long, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_ftpFindFirstFileW(hconnect: Long, lpszsearchfile: Long, lpfindfiledata: Long, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_ftpGetCurrentDirectoryA(hconnect: Long, lpszcurrentdirectory: Long, lpdwcurrentdirectory: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_ftpGetCurrentDirectoryW(hconnect: Long, lpszcurrentdirectory: Long, lpdwcurrentdirectory: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_ftpGetFileA(hconnect: Long, lpszremotefile: Long, lpsznewfile: Long, ffailifexists: Int, dwflagsandattributes: Int, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_ftpGetFileEx(hftpsession: Long, lpszremotefile: Long, lpsznewfile: Long, ffailifexists: Int, dwflagsandattributes: Int, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_ftpGetFileSize(hfile: Long, lpdwfilesizehigh: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_ftpGetFileW(hconnect: Long, lpszremotefile: Long, lpsznewfile: Long, ffailifexists: Int, dwflagsandattributes: Int, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_ftpOpenFileA(hconnect: Long, lpszfilename: Long, dwaccess: Int, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_ftpOpenFileW(hconnect: Long, lpszfilename: Long, dwaccess: Int, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_ftpPutFileA(hconnect: Long, lpszlocalfile: Long, lpsznewremotefile: Long, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_ftpPutFileEx(hftpsession: Long, lpszlocalfile: Long, lpsznewremotefile: Long, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_ftpPutFileW(hconnect: Long, lpszlocalfile: Long, lpsznewremotefile: Long, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_ftpRemoveDirectoryA(hconnect: Long, lpszdirectory: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_ftpRemoveDirectoryW(hconnect: Long, lpszdirectory: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_ftpRenameFileA(hconnect: Long, lpszexisting: Long, lpsznew: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_ftpRenameFileW(hconnect: Long, lpszexisting: Long, lpsznew: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_ftpSetCurrentDirectoryA(hconnect: Long, lpszdirectory: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_ftpSetCurrentDirectoryW(hconnect: Long, lpszdirectory: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_getDiskInfoA(pszpath: Long, pdwclustersize: Long, pdlavail: Long, pdltotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_getUrlCacheConfigInfoA(lpcacheconfiginfo: Long, lpcbcacheconfiginfo: Long, dwfieldcontrol: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_getUrlCacheConfigInfoW(lpcacheconfiginfo: Long, lpcbcacheconfiginfo: Long, dwfieldcontrol: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_getUrlCacheEntryBinaryBlob(pwszurlname: Long, dwtype: Long, pftexpiretime: Long, pftaccesstime: Long, pftmodifiedtime: Long, ppbblob: Long, pcbblob: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_getUrlCacheEntryInfoA(lpszurlname: Long, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_getUrlCacheEntryInfoExA(lpszurl: Long, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpszredirecturl: Long, lpcbredirecturl: Long, lpreserved: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_getUrlCacheEntryInfoExW(lpszurl: Long, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpszredirecturl: Long, lpcbredirecturl: Long, lpreserved: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_getUrlCacheEntryInfoW(lpszurlname: Long, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_getUrlCacheGroupAttributeA(gid: Long, dwflags: Int, dwattributes: Int, lpgroupinfo: Long, lpcbgroupinfo: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_getUrlCacheGroupAttributeW(gid: Long, dwflags: Int, dwattributes: Int, lpgroupinfo: Long, lpcbgroupinfo: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_getUrlCacheHeaderData(nidx: Int, lpdwdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_gopherCreateLocatorA(lpszhost: Long, nserverport: Short, lpszdisplaystring: Long, lpszselectorstring: Long, dwgophertype: Int, lpszlocator: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_gopherCreateLocatorW(lpszhost: Long, nserverport: Short, lpszdisplaystring: Long, lpszselectorstring: Long, dwgophertype: Int, lpszlocator: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_gopherFindFirstFileA(hconnect: Long, lpszlocator: Long, lpszsearchstring: Long, lpfinddata: Long, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_gopherFindFirstFileW(hconnect: Long, lpszlocator: Long, lpszsearchstring: Long, lpfinddata: Long, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_gopherGetAttributeA(hconnect: Long, lpszlocator: Long, lpszattributename: Long, lpbuffer: Long, dwbufferlength: Int, lpdwcharactersreturned: Long, lpfnenumerator: Long, dwcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_gopherGetAttributeW(hconnect: Long, lpszlocator: Long, lpszattributename: Long, lpbuffer: Long, dwbufferlength: Int, lpdwcharactersreturned: Long, lpfnenumerator: Long, dwcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_gopherGetLocatorTypeA(lpszlocator: Long, lpdwgophertype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_gopherGetLocatorTypeW(lpszlocator: Long, lpdwgophertype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_gopherOpenFileA(hconnect: Long, lpszlocator: Long, lpszview: Long, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_gopherOpenFileW(hconnect: Long, lpszlocator: Long, lpszview: Long, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_httpAddRequestHeadersA(hrequest: Long, lpszheaders: Long, dwheaderslength: Int, dwmodifiers: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_httpAddRequestHeadersW(hrequest: Long, lpszheaders: Long, dwheaderslength: Int, dwmodifiers: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_httpCheckDavComplianceA(lpszurl: Long, lpszcompliancetoken: Long, lpffound: Long, hwnd: Long, lpvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_httpCheckDavComplianceW(lpszurl: Long, lpszcompliancetoken: Long, lpffound: Long, hwnd: Long, lpvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_httpCloseDependencyHandle(hdependencyhandle: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_httpDuplicateDependencyHandle(hdependencyhandle: Long, phduplicateddependencyhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_httpEndRequestA(hrequest: Long, lpbuffersout: Long, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_httpEndRequestW(hrequest: Long, lpbuffersout: Long, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_httpGetServerCredentials(pwszurl: Long, ppwszusername: Long, ppwszpassword: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_httpIndicatePageLoadComplete(hdependencyhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_httpIsHostHstsEnabled(pcwszurl: Long, pfishsts: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_httpOpenDependencyHandle(hrequesthandle: Long, fbackground: Int, phdependencyhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_httpOpenRequestA(hconnect: Long, lpszverb: Long, lpszobjectname: Long, lpszversion: Long, lpszreferrer: Long, lplpszaccepttypes: Long, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_httpOpenRequestW(hconnect: Long, lpszverb: Long, lpszobjectname: Long, lpszversion: Long, lpszreferrer: Long, lplpszaccepttypes: Long, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_httpPushClose(hwait: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_httpPushEnable(hrequest: Long, ptransportsetting: Long, phwait: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_httpPushWait(hwait: Long, etype: Int, pnotificationstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_httpQueryInfoA(hrequest: Long, dwinfolevel: Int, lpbuffer: Long, lpdwbufferlength: Long, lpdwindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_httpQueryInfoW(hrequest: Long, dwinfolevel: Int, lpbuffer: Long, lpdwbufferlength: Long, lpdwindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_httpSendRequestA(hrequest: Long, lpszheaders: Long, dwheaderslength: Int, lpoptional: Long, dwoptionallength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_httpSendRequestExA(hrequest: Long, lpbuffersin: Long, lpbuffersout: Long, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_httpSendRequestExW(hrequest: Long, lpbuffersin: Long, lpbuffersout: Long, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_httpSendRequestW(hrequest: Long, lpszheaders: Long, dwheaderslength: Int, lpoptional: Long, dwoptionallength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_httpWebSocketClose(hwebsocket: Long, usstatus: Short, pvreason: Long, dwreasonlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_httpWebSocketCompleteUpgrade(hrequest: Long, dwcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_httpWebSocketQueryCloseStatus(hwebsocket: Long, pusstatus: Long, pvreason: Long, dwreasonlength: Int, pdwreasonlengthconsumed: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_httpWebSocketReceive(hwebsocket: Long, pvbuffer: Long, dwbufferlength: Int, pdwbytesread: Long, pbuffertype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_httpWebSocketSend(hwebsocket: Long, buffertype: Int, pvbuffer: Long, dwbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_httpWebSocketShutdown(hwebsocket: Long, usstatus: Short, pvreason: Long, dwreasonlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_importCookieFileA(szfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_importCookieFileW(szfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_incrementUrlCacheHeaderData(nidx: Int, lpdwdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internalInternetGetCookie(lpszurl: Long, lpszcookiedata: Long, lpdwdatasize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetAlgIdToStringA(ai: Int, lpstr: Long, lpdwstrlength: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetAlgIdToStringW(ai: Int, lpstr: Long, lpdwstrlength: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetAttemptConnect(dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetAutodial(dwflags: Int, hwndparent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetAutodialHangup(dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetCanonicalizeUrlA(lpszurl: Long, lpszbuffer: Long, lpdwbufferlength: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetCanonicalizeUrlW(lpszurl: Long, lpszbuffer: Long, lpdwbufferlength: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetCheckConnectionA(lpszurl: Long, dwflags: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetCheckConnectionW(lpszurl: Long, dwflags: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetClearAllPerSiteCookieDecisions(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetCloseHandle(hinternet: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetCombineUrlA(lpszbaseurl: Long, lpszrelativeurl: Long, lpszbuffer: Long, lpdwbufferlength: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetCombineUrlW(lpszbaseurl: Long, lpszrelativeurl: Long, lpszbuffer: Long, lpdwbufferlength: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetConfirmZoneCrossing(hwnd: Long, szurlprev: Long, szurlnew: Long, bpost: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetConfirmZoneCrossingA(hwnd: Long, szurlprev: Long, szurlnew: Long, bpost: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetConfirmZoneCrossingW(hwnd: Long, szurlprev: Long, szurlnew: Long, bpost: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetConnectA(hinternet: Long, lpszservername: Long, nserverport: Short, lpszusername: Long, lpszpassword: Long, dwservice: Int, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetConnectW(hinternet: Long, lpszservername: Long, nserverport: Short, lpszusername: Long, lpszpassword: Long, dwservice: Int, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetConvertUrlFromWireToWideChar(pcszurl: Long, cchurl: Int, pcwszbaseurl: Long, dwcodepagehost: Int, dwcodepagepath: Int, fencodepathextra: Int, dwcodepageextra: Int, ppwszconvertedurl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetCrackUrlA(lpszurl: Long, dwurllength: Int, dwflags: Int, lpurlcomponents: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetCrackUrlW(lpszurl: Long, dwurllength: Int, dwflags: Int, lpurlcomponents: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetCreateUrlA(lpurlcomponents: Long, dwflags: Int, lpszurl: Long, lpdwurllength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetCreateUrlW(lpurlcomponents: Long, dwflags: Int, lpszurl: Long, lpdwurllength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetDial(hwndparent: Long, lpszconnectoid: Long, dwflags: Int, lpdwconnection: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetDialA(hwndparent: Long, lpszconnectoid: Long, dwflags: Int, lpdwconnection: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetDialW(hwndparent: Long, lpszconnectoid: Long, dwflags: Int, lpdwconnection: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetEnumPerSiteCookieDecisionA(pszsitename: Long, pcsitenamesize: Long, pdwdecision: Long, dwindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetEnumPerSiteCookieDecisionW(pszsitename: Long, pcsitenamesize: Long, pdwdecision: Long, dwindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetErrorDlg(hwnd: Long, hrequest: Long, dwerror: Int, dwflags: Int, lppvdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetFindNextFileA(hfind: Long, lpvfinddata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetFindNextFileW(hfind: Long, lpvfinddata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetFortezzaCommand(dwcommand: Int, hwnd: Long, dwreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetFreeCookies(pcookies: Long, dwcookiecount: Int)

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetFreeProxyInfoList(pproxyinfolist: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetGetConnectedState(lpdwflags: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetGetConnectedStateEx(lpdwflags: Long, lpszconnectionname: Long, dwnamelen: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetGetConnectedStateExA(lpdwflags: Long, lpszconnectionname: Long, cchnamelen: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetGetConnectedStateExW(lpdwflags: Long, lpszconnectionname: Long, cchnamelen: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetGetCookieA(lpszurl: Long, lpszcookiename: Long, lpszcookiedata: Long, lpdwsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetGetCookieEx2(pcwszurl: Long, pcwszcookiename: Long, dwflags: Int, ppcookies: Long, pdwcookiecount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetGetCookieExA(lpszurl: Long, lpszcookiename: Long, lpszcookiedata: Long, lpdwsize: Long, dwflags: Int, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetGetCookieExW(lpszurl: Long, lpszcookiename: Long, lpszcookiedata: Long, lpdwsize: Long, dwflags: Int, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetGetCookieW(lpszurl: Long, lpszcookiename: Long, lpszcookiedata: Long, lpdwsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetGetLastResponseInfoA(lpdwerror: Long, lpszbuffer: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetGetLastResponseInfoW(lpdwerror: Long, lpszbuffer: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetGetPerSiteCookieDecisionA(pchhostname: Long, presult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetGetPerSiteCookieDecisionW(pchhostname: Long, presult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetGetProxyForUrl(hinternet: Long, pcwszurl: Long, pproxyinfolist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetGetSecurityInfoByURL(lpszurl: Long, ppcertchain: Long, pdwsecureflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetGetSecurityInfoByURLA(lpszurl: Long, ppcertchain: Long, pdwsecureflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetGetSecurityInfoByURLW(lpszurl: Long, ppcertchain: Long, pdwsecureflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetGoOnline(lpszurl: Long, hwndparent: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetGoOnlineA(lpszurl: Long, hwndparent: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetGoOnlineW(lpszurl: Long, hwndparent: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetHangUp(dwconnection: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetInitializeAutoProxyDll(dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetLockRequestFile(hinternet: Long, lphlockrequestinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetOpenA(lpszagent: Long, dwaccesstype: Int, lpszproxy: Long, lpszproxybypass: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetOpenUrlA(hinternet: Long, lpszurl: Long, lpszheaders: Long, dwheaderslength: Int, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetOpenUrlW(hinternet: Long, lpszurl: Long, lpszheaders: Long, dwheaderslength: Int, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetOpenW(lpszagent: Long, dwaccesstype: Int, lpszproxy: Long, lpszproxybypass: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetQueryDataAvailable(hfile: Long, lpdwnumberofbytesavailable: Long, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetQueryFortezzaStatus(pdwstatus: Long, dwreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetQueryOptionA(hinternet: Long, dwoption: Int, lpbuffer: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetQueryOptionW(hinternet: Long, dwoption: Int, lpbuffer: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetReadFile(hfile: Long, lpbuffer: Long, dwnumberofbytestoread: Int, lpdwnumberofbytesread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetReadFileExA(hfile: Long, lpbuffersout: Long, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetReadFileExW(hfile: Long, lpbuffersout: Long, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetSecurityProtocolToStringA(dwprotocol: Int, lpstr: Long, lpdwstrlength: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetSecurityProtocolToStringW(dwprotocol: Int, lpstr: Long, lpdwstrlength: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetSetCookieA(lpszurl: Long, lpszcookiename: Long, lpszcookiedata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetSetCookieEx2(pcwszurl: Long, pcookie: Long, pcwszp3ppolicy: Long, dwflags: Int, pdwcookiestate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetSetCookieExA(lpszurl: Long, lpszcookiename: Long, lpszcookiedata: Long, dwflags: Int, dwreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetSetCookieExW(lpszurl: Long, lpszcookiename: Long, lpszcookiedata: Long, dwflags: Int, dwreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetSetCookieW(lpszurl: Long, lpszcookiename: Long, lpszcookiedata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetSetDialState(lpszconnectoid: Long, dwstate: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetSetDialStateA(lpszconnectoid: Long, dwstate: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetSetDialStateW(lpszconnectoid: Long, dwstate: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetSetFilePointer(hfile: Long, ldistancetomove: Int, lpdistancetomovehigh: Long, dwmovemethod: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetSetOptionA(hinternet: Long, dwoption: Int, lpbuffer: Long, dwbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetSetOptionExA(hinternet: Long, dwoption: Int, lpbuffer: Long, dwbufferlength: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetSetOptionExW(hinternet: Long, dwoption: Int, lpbuffer: Long, dwbufferlength: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetSetOptionW(hinternet: Long, dwoption: Int, lpbuffer: Long, dwbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetSetPerSiteCookieDecisionA(pchhostname: Long, dwdecision: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetSetPerSiteCookieDecisionW(pchhostname: Long, dwdecision: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetSetStatusCallback(hinternet: Long, lpfninternetcallback: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetSetStatusCallbackA(hinternet: Long, lpfninternetcallback: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetSetStatusCallbackW(hinternet: Long, lpfninternetcallback: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetShowSecurityInfoByURL(lpszurl: Long, hwndparent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetShowSecurityInfoByURLA(lpszurl: Long, hwndparent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetShowSecurityInfoByURLW(lpszurl: Long, hwndparent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetTimeFromSystemTime(pst: Long, dwrfc: Int, lpsztime: Long, cbtime: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetTimeFromSystemTimeA(pst: Long, dwrfc: Int, lpsztime: Long, cbtime: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetTimeFromSystemTimeW(pst: Long, dwrfc: Int, lpsztime: Long, cbtime: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetTimeToSystemTime(lpsztime: Long, pst: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetTimeToSystemTimeA(lpsztime: Long, pst: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetTimeToSystemTimeW(lpsztime: Long, pst: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetUnlockRequestFile(hlockrequestinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetWriteFile(hfile: Long, lpbuffer: Long, dwnumberofbytestowrite: Int, lpdwnumberofbyteswritten: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetWriteFileExA(hfile: Long, lpbuffersin: Long, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_internetWriteFileExW(hfile: Long, lpbuffersin: Long, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_isDomainLegalCookieDomainA(pchdomain: Long, pchfulldomain: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_isDomainLegalCookieDomainW(pchdomain: Long, pchfulldomain: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_isHostInProxyBypassList(tscheme: Int, lpszhost: Long, cchhost: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_isProfilesEnabled(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_isUrlCacheEntryExpiredA(lpszurlname: Long, dwflags: Int, pftlastmodified: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_isUrlCacheEntryExpiredW(lpszurlname: Long, dwflags: Int, pftlastmodified: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_loadUrlCacheContent(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_parseX509EncodedCertificateForListBoxEntry(lpcert: Long, cbcert: Int, lpszlistboxentry: Long, lpdwlistboxentry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_performOperationOverUrlCacheA(pszurlsearchpattern: Long, dwflags: Int, dwfilter: Int, groupid: Long, preserved1: Long, pdwreserved2: Long, preserved3: Long, op: Long, poperatordata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_privacyGetZonePreferenceW(dwzone: Int, dwtype: Int, pdwtemplate: Long, pszbuffer: Long, pdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_privacySetZonePreferenceW(dwzone: Int, dwtype: Int, dwtemplate: Int, pszpreference: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_readGuidsForConnectedNetworks(pcnetworks: Long, pppwsznetworkguids: Long, pppbstrnetworknames: Long, pppwszgwmacs: Long, pcgatewaymacs: Long, pdwflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_readUrlCacheEntryStream(hurlcachestream: Long, dwlocation: Int, lpbuffer: Long, lpdwlen: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_readUrlCacheEntryStreamEx(hurlcachestream: Long, qwlocation: Long, lpbuffer: Long, lpdwlen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_registerUrlCacheNotification(hwnd: Long, umsg: Int, gid: Long, dwopsfilter: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_resumeSuspendedDownload(hrequest: Long, dwresultcode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_retrieveUrlCacheEntryFileA(lpszurlname: Long, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_retrieveUrlCacheEntryFileW(lpszurlname: Long, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_retrieveUrlCacheEntryStreamA(lpszurlname: Long, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, frandomread: Int, dwreserved: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_retrieveUrlCacheEntryStreamW(lpszurlname: Long, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, frandomread: Int, dwreserved: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_runOnceUrlCache(hwnd: Long, hinst: Long, lpszcmd: Long, ncmdshow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_setUrlCacheConfigInfoA(lpcacheconfiginfo: Long, dwfieldcontrol: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_setUrlCacheConfigInfoW(lpcacheconfiginfo: Long, dwfieldcontrol: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_setUrlCacheEntryGroup(lpszurlname: Long, dwflags: Int, groupid: Long, pbgroupattributes: Long, cbgroupattributes: Int, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_setUrlCacheEntryGroupA(lpszurlname: Long, dwflags: Int, groupid: Long, pbgroupattributes: Long, cbgroupattributes: Int, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_setUrlCacheEntryGroupW(lpszurlname: Long, dwflags: Int, groupid: Long, pbgroupattributes: Long, cbgroupattributes: Int, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_setUrlCacheEntryInfoA(lpszurlname: Long, lpcacheentryinfo: Long, dwfieldcontrol: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_setUrlCacheEntryInfoW(lpszurlname: Long, lpcacheentryinfo: Long, dwfieldcontrol: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_setUrlCacheGroupAttributeA(gid: Long, dwflags: Int, dwattributes: Int, lpgroupinfo: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_setUrlCacheGroupAttributeW(gid: Long, dwflags: Int, dwattributes: Int, lpgroupinfo: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_setUrlCacheHeaderData(nidx: Int, dwdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_showClientAuthCerts(hwndparent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_showSecurityInfo(hwndparent: Long, psecurityinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_showX509EncodedCertificate(hwndparent: Long, lpcert: Long, cbcert: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_unlockUrlCacheEntryFile(lpszurlname: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_unlockUrlCacheEntryFileA(lpszurlname: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_unlockUrlCacheEntryFileW(lpszurlname: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_unlockUrlCacheEntryStream(hurlcachestream: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_updateUrlCacheContentPath(sznewpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_urlCacheCheckEntriesExist(rgpwszurls: Long, centries: Int, rgfexist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_urlCacheCloseEntryHandle(hentryfile: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_urlCacheContainerSetEntryMaximumAge(pwszprefix: Long, dwentrymaxage: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_urlCacheCreateContainer(pwszname: Long, pwszprefix: Long, pwszdirectory: Long, ulllimit: Long, dwoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_urlCacheFindFirstEntry(pwszprefix: Long, dwflags: Int, dwfilter: Int, groupid: Long, pcacheentryinfo: Long, phfind: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_urlCacheFindNextEntry(hfind: Long, pcacheentryinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_urlCacheFreeEntryInfo(pcacheentryinfo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_urlCacheFreeGlobalSpace(ulltargetsize: Long, dwfilter: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_urlCacheGetContentPaths(pppwszdirectories: Long, pcdirectories: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_urlCacheGetEntryInfo(happcache: Long, pcwszurl: Long, pcacheentryinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_urlCacheGetGlobalCacheSize(dwfilter: Int, pullsize: Long, pulllimit: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_urlCacheGetGlobalLimit(limittype: Int, pulllimit: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_urlCacheReadEntryStream(hurlcachestream: Long, ulllocation: Long, pbuffer: Long, dwbufferlen: Int, pdwbufferlen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_urlCacheReloadSettings(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_urlCacheRetrieveEntryFile(happcache: Long, pcwszurl: Long, pcacheentryinfo: Long, phentryfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_urlCacheRetrieveEntryStream(happcache: Long, pcwszurl: Long, frandomread: Int, pcacheentryinfo: Long, phentrystream: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_urlCacheServer(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_urlCacheSetGlobalLimit(limittype: Int, ulllimit: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_urlCacheUpdateEntryExtraData(happcache: Long, pcwszurl: Long, pbextradata: Long, cbextradata: Int): Int
}

public actual fun appCacheCheckManifest(pwszmasterurl: Pcwstr, pwszmanifesturl: Pcwstr, pbmanifestdata: COpaquePointer?, dwmanifestdatasize: UInt, pbmanifestresponseheaders: COpaquePointer?, dwmanifestresponseheaderssize: UInt, pestate: COpaquePointer?, phnewappcache: COpaquePointer?): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_appCacheCheckManifest((pwszmasterurl?.value ?: 0L), (pwszmanifesturl?.value ?: 0L), (pbmanifestdata?.value ?: 0L), dwmanifestdatasize.toInt(), (pbmanifestresponseheaders?.value ?: 0L), dwmanifestresponseheaderssize.toInt(), (pestate?.value ?: 0L), (phnewappcache?.value ?: 0L)).toUInt()

public actual fun appCacheCloseHandle(happcache: COpaquePointer?) {
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_appCacheCloseHandle((happcache?.value ?: 0L))
}

public actual fun appCacheCreateAndCommitFile(happcache: COpaquePointer?, pwszsourcefilepath: Pcwstr, pwszurl: Pcwstr, pbresponseheaders: COpaquePointer?, dwresponseheaderssize: UInt): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_appCacheCreateAndCommitFile((happcache?.value ?: 0L), (pwszsourcefilepath?.value ?: 0L), (pwszurl?.value ?: 0L), (pbresponseheaders?.value ?: 0L), dwresponseheaderssize.toInt()).toUInt()

public actual fun appCacheDeleteGroup(pwszmanifesturl: Pcwstr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_appCacheDeleteGroup((pwszmanifesturl?.value ?: 0L)).toUInt()

public actual fun appCacheDeleteIEGroup(pwszmanifesturl: Pcwstr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_appCacheDeleteIEGroup((pwszmanifesturl?.value ?: 0L)).toUInt()

public actual fun appCacheDuplicateHandle(happcache: COpaquePointer?, phduplicatedappcache: COpaquePointer?): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_appCacheDuplicateHandle((happcache?.value ?: 0L), (phduplicatedappcache?.value ?: 0L)).toUInt()

public actual fun appCacheFinalize(happcache: COpaquePointer?, pbmanifestdata: COpaquePointer?, dwmanifestdatasize: UInt, pestate: COpaquePointer?): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_appCacheFinalize((happcache?.value ?: 0L), (pbmanifestdata?.value ?: 0L), dwmanifestdatasize.toInt(), (pestate?.value ?: 0L)).toUInt()

public actual fun appCacheFreeDownloadList(pdownloadlist: COpaquePointer?) {
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_appCacheFreeDownloadList((pdownloadlist?.value ?: 0L))
}

public actual fun appCacheFreeGroupList(pappcachegrouplist: COpaquePointer?) {
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_appCacheFreeGroupList((pappcachegrouplist?.value ?: 0L))
}

public actual fun appCacheFreeIESpace(ftcutoff: Filetime): UInt =
    0u

public actual fun appCacheFreeSpace(ftcutoff: Filetime): UInt =
    0u

public actual fun appCacheGetDownloadList(happcache: COpaquePointer?, pdownloadlist: COpaquePointer?): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_appCacheGetDownloadList((happcache?.value ?: 0L), (pdownloadlist?.value ?: 0L)).toUInt()

public actual fun appCacheGetFallbackUrl(happcache: COpaquePointer?, pwszurl: Pcwstr, ppwszfallbackurl: COpaquePointer?): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_appCacheGetFallbackUrl((happcache?.value ?: 0L), (pwszurl?.value ?: 0L), (ppwszfallbackurl?.value ?: 0L)).toUInt()

public actual fun appCacheGetGroupList(pappcachegrouplist: COpaquePointer?): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_appCacheGetGroupList((pappcachegrouplist?.value ?: 0L)).toUInt()

public actual fun appCacheGetIEGroupList(pappcachegrouplist: COpaquePointer?): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_appCacheGetIEGroupList((pappcachegrouplist?.value ?: 0L)).toUInt()

public actual fun appCacheGetInfo(happcache: COpaquePointer?, pappcacheinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_appCacheGetInfo((happcache?.value ?: 0L), (pappcacheinfo?.value ?: 0L)).toUInt()

public actual fun appCacheGetManifestUrl(happcache: COpaquePointer?, ppwszmanifesturl: COpaquePointer?): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_appCacheGetManifestUrl((happcache?.value ?: 0L), (ppwszmanifesturl?.value ?: 0L)).toUInt()

public actual fun appCacheLookup(pwszurl: Pcwstr, dwflags: UInt, phappcache: COpaquePointer?): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_appCacheLookup((pwszurl?.value ?: 0L), dwflags.toInt(), (phappcache?.value ?: 0L)).toUInt()

public actual fun commitUrlCacheEntryA(lpszurlname: Pcstr, lpszlocalfilename: Pcstr, expiretime: Filetime, lastmodifiedtime: Filetime, cacheentrytype: UInt, lpheaderinfo: COpaquePointer?, cchheaderinfo: UInt, lpszfileextension: Pcstr, lpszoriginalurl: Pcstr): Bool =
    0

public actual fun commitUrlCacheEntryBinaryBlob(pwszurlname: Pcwstr, dwtype: UInt, ftexpiretime: Filetime, ftmodifiedtime: Filetime, pbblob: COpaquePointer?, cbblob: UInt): UInt =
    0u

public actual fun commitUrlCacheEntryW(lpszurlname: Pcwstr, lpszlocalfilename: Pcwstr, expiretime: Filetime, lastmodifiedtime: Filetime, cacheentrytype: UInt, lpszheaderinfo: Pcwstr, cchheaderinfo: UInt, lpszfileextension: Pcwstr, lpszoriginalurl: Pcwstr): Bool =
    0

public actual fun createMD5SSOHash(pszchallengeinfo: Pcwstr, pwszrealm: Pcwstr, pwsztarget: Pcwstr, pbhexhash: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_createMD5SSOHash((pszchallengeinfo?.value ?: 0L), (pwszrealm?.value ?: 0L), (pwsztarget?.value ?: 0L), (pbhexhash?.value ?: 0L))

public actual fun createUrlCacheContainerA(name: Pcstr, lpcacheprefix: Pcstr, lpszcachepath: Pcstr, kbcachelimit: UInt, dwcontainertype: UInt, dwoptions: UInt, pvbuffer: COpaquePointer?, cbbuffer: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_createUrlCacheContainerA((name?.value ?: 0L), (lpcacheprefix?.value ?: 0L), (lpszcachepath?.value ?: 0L), kbcachelimit.toInt(), dwcontainertype.toInt(), dwoptions.toInt(), (pvbuffer?.value ?: 0L), (cbbuffer?.value ?: 0L))

public actual fun createUrlCacheContainerW(name: Pcwstr, lpcacheprefix: Pcwstr, lpszcachepath: Pcwstr, kbcachelimit: UInt, dwcontainertype: UInt, dwoptions: UInt, pvbuffer: COpaquePointer?, cbbuffer: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_createUrlCacheContainerW((name?.value ?: 0L), (lpcacheprefix?.value ?: 0L), (lpszcachepath?.value ?: 0L), kbcachelimit.toInt(), dwcontainertype.toInt(), dwoptions.toInt(), (pvbuffer?.value ?: 0L), (cbbuffer?.value ?: 0L))

public actual fun createUrlCacheEntryA(lpszurlname: Pcstr, dwexpectedfilesize: UInt, lpszfileextension: Pcstr, lpszfilename: Pstr, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_createUrlCacheEntryA((lpszurlname?.value ?: 0L), dwexpectedfilesize.toInt(), (lpszfileextension?.value ?: 0L), (lpszfilename?.value ?: 0L), dwreserved.toInt())

public actual fun createUrlCacheEntryExW(lpszurlname: Pcwstr, dwexpectedfilesize: UInt, lpszfileextension: Pcwstr, lpszfilename: Pwstr, dwreserved: UInt, fpreserveincomingfilename: Bool): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_createUrlCacheEntryExW((lpszurlname?.value ?: 0L), dwexpectedfilesize.toInt(), (lpszfileextension?.value ?: 0L), (lpszfilename?.value ?: 0L), dwreserved.toInt(), fpreserveincomingfilename)

public actual fun createUrlCacheEntryW(lpszurlname: Pcwstr, dwexpectedfilesize: UInt, lpszfileextension: Pcwstr, lpszfilename: Pwstr, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_createUrlCacheEntryW((lpszurlname?.value ?: 0L), dwexpectedfilesize.toInt(), (lpszfileextension?.value ?: 0L), (lpszfilename?.value ?: 0L), dwreserved.toInt())

public actual fun createUrlCacheGroup(dwflags: UInt, lpreserved: COpaquePointer?): Long =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_createUrlCacheGroup(dwflags.toInt(), (lpreserved?.value ?: 0L))

public actual fun deleteIE3Cache(hwnd: Hwnd, hinst: Hinstance, lpszcmd: Pcstr, ncmdshow: Int): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_deleteIE3Cache((hwnd?.value ?: 0L), (hinst?.value ?: 0L), (lpszcmd?.value ?: 0L), ncmdshow).toUInt()

public actual fun deleteUrlCacheContainerA(name: Pcstr, dwoptions: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_deleteUrlCacheContainerA((name?.value ?: 0L), dwoptions.toInt())

public actual fun deleteUrlCacheContainerW(name: Pcwstr, dwoptions: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_deleteUrlCacheContainerW((name?.value ?: 0L), dwoptions.toInt())

public actual fun deleteUrlCacheEntry(lpszurlname: Pcstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_deleteUrlCacheEntry((lpszurlname?.value ?: 0L))

public actual fun deleteUrlCacheEntryA(lpszurlname: Pcstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_deleteUrlCacheEntryA((lpszurlname?.value ?: 0L))

public actual fun deleteUrlCacheEntryW(lpszurlname: Pcwstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_deleteUrlCacheEntryW((lpszurlname?.value ?: 0L))

public actual fun deleteUrlCacheGroup(groupid: Long, dwflags: UInt, lpreserved: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_deleteUrlCacheGroup(groupid, dwflags.toInt(), (lpreserved?.value ?: 0L))

public actual fun deleteWpadCacheForNetworks(param0: WpadCacheDelete): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_deleteWpadCacheForNetworks(param0)

public actual fun detectAutoProxyUrl(pszautoproxyurl: Pstr, cchautoproxyurl: UInt, dwdetectflags: ProxyAutoDetectType): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_detectAutoProxyUrl((pszautoproxyurl?.value ?: 0L), cchautoproxyurl.toInt(), dwdetectflags.toInt())

public actual fun doConnectoidsExist(): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_doConnectoidsExist()

public actual fun exportCookieFileA(szfilename: Pcstr, fappend: Bool): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_exportCookieFileA((szfilename?.value ?: 0L), fappend)

public actual fun exportCookieFileW(szfilename: Pcwstr, fappend: Bool): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_exportCookieFileW((szfilename?.value ?: 0L), fappend)

public actual fun findCloseUrlCache(henumhandle: Handle): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_findCloseUrlCache((henumhandle?.value ?: 0L))

public actual fun findFirstUrlCacheContainerA(pdwmodified: COpaquePointer?, lpcontainerinfo: COpaquePointer?, lpcbcontainerinfo: COpaquePointer?, dwoptions: UInt): Handle =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_findFirstUrlCacheContainerA((pdwmodified?.value ?: 0L), (lpcontainerinfo?.value ?: 0L), (lpcbcontainerinfo?.value ?: 0L), dwoptions.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun findFirstUrlCacheContainerW(pdwmodified: COpaquePointer?, lpcontainerinfo: COpaquePointer?, lpcbcontainerinfo: COpaquePointer?, dwoptions: UInt): Handle =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_findFirstUrlCacheContainerW((pdwmodified?.value ?: 0L), (lpcontainerinfo?.value ?: 0L), (lpcbcontainerinfo?.value ?: 0L), dwoptions.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun findFirstUrlCacheEntryA(lpszurlsearchpattern: Pcstr, lpfirstcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?): Handle =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_findFirstUrlCacheEntryA((lpszurlsearchpattern?.value ?: 0L), (lpfirstcacheentryinfo?.value ?: 0L), (lpcbcacheentryinfo?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun findFirstUrlCacheEntryExA(lpszurlsearchpattern: Pcstr, dwflags: UInt, dwfilter: UInt, groupid: Long, lpfirstcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, lpgroupattributes: COpaquePointer?, lpcbgroupattributes: COpaquePointer?, lpreserved: COpaquePointer?): Handle =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_findFirstUrlCacheEntryExA((lpszurlsearchpattern?.value ?: 0L), dwflags.toInt(), dwfilter.toInt(), groupid, (lpfirstcacheentryinfo?.value ?: 0L), (lpcbcacheentryinfo?.value ?: 0L), (lpgroupattributes?.value ?: 0L), (lpcbgroupattributes?.value ?: 0L), (lpreserved?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun findFirstUrlCacheEntryExW(lpszurlsearchpattern: Pcwstr, dwflags: UInt, dwfilter: UInt, groupid: Long, lpfirstcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, lpgroupattributes: COpaquePointer?, lpcbgroupattributes: COpaquePointer?, lpreserved: COpaquePointer?): Handle =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_findFirstUrlCacheEntryExW((lpszurlsearchpattern?.value ?: 0L), dwflags.toInt(), dwfilter.toInt(), groupid, (lpfirstcacheentryinfo?.value ?: 0L), (lpcbcacheentryinfo?.value ?: 0L), (lpgroupattributes?.value ?: 0L), (lpcbgroupattributes?.value ?: 0L), (lpreserved?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun findFirstUrlCacheEntryW(lpszurlsearchpattern: Pcwstr, lpfirstcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?): Handle =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_findFirstUrlCacheEntryW((lpszurlsearchpattern?.value ?: 0L), (lpfirstcacheentryinfo?.value ?: 0L), (lpcbcacheentryinfo?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun findFirstUrlCacheGroup(dwflags: UInt, dwfilter: UInt, lpsearchcondition: COpaquePointer?, dwsearchcondition: UInt, lpgroupid: COpaquePointer?, lpreserved: COpaquePointer?): Handle =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_findFirstUrlCacheGroup(dwflags.toInt(), dwfilter.toInt(), (lpsearchcondition?.value ?: 0L), dwsearchcondition.toInt(), (lpgroupid?.value ?: 0L), (lpreserved?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun findNextUrlCacheContainerA(henumhandle: Handle, lpcontainerinfo: COpaquePointer?, lpcbcontainerinfo: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_findNextUrlCacheContainerA((henumhandle?.value ?: 0L), (lpcontainerinfo?.value ?: 0L), (lpcbcontainerinfo?.value ?: 0L))

public actual fun findNextUrlCacheContainerW(henumhandle: Handle, lpcontainerinfo: COpaquePointer?, lpcbcontainerinfo: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_findNextUrlCacheContainerW((henumhandle?.value ?: 0L), (lpcontainerinfo?.value ?: 0L), (lpcbcontainerinfo?.value ?: 0L))

public actual fun findNextUrlCacheEntryA(henumhandle: Handle, lpnextcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_findNextUrlCacheEntryA((henumhandle?.value ?: 0L), (lpnextcacheentryinfo?.value ?: 0L), (lpcbcacheentryinfo?.value ?: 0L))

public actual fun findNextUrlCacheEntryExA(henumhandle: Handle, lpnextcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, lpgroupattributes: COpaquePointer?, lpcbgroupattributes: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_findNextUrlCacheEntryExA((henumhandle?.value ?: 0L), (lpnextcacheentryinfo?.value ?: 0L), (lpcbcacheentryinfo?.value ?: 0L), (lpgroupattributes?.value ?: 0L), (lpcbgroupattributes?.value ?: 0L), (lpreserved?.value ?: 0L))

public actual fun findNextUrlCacheEntryExW(henumhandle: Handle, lpnextcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, lpgroupattributes: COpaquePointer?, lpcbgroupattributes: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_findNextUrlCacheEntryExW((henumhandle?.value ?: 0L), (lpnextcacheentryinfo?.value ?: 0L), (lpcbcacheentryinfo?.value ?: 0L), (lpgroupattributes?.value ?: 0L), (lpcbgroupattributes?.value ?: 0L), (lpreserved?.value ?: 0L))

public actual fun findNextUrlCacheEntryW(henumhandle: Handle, lpnextcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_findNextUrlCacheEntryW((henumhandle?.value ?: 0L), (lpnextcacheentryinfo?.value ?: 0L), (lpcbcacheentryinfo?.value ?: 0L))

public actual fun findNextUrlCacheGroup(hfind: Handle, lpgroupid: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_findNextUrlCacheGroup((hfind?.value ?: 0L), (lpgroupid?.value ?: 0L), (lpreserved?.value ?: 0L))

public actual fun findP3PPolicySymbol(pszsymbol: Pcstr): Int =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_findP3PPolicySymbol((pszsymbol?.value ?: 0L))

public actual fun freeUrlCacheSpaceA(lpszcachepath: Pcstr, dwsize: UInt, dwfilter: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_freeUrlCacheSpaceA((lpszcachepath?.value ?: 0L), dwsize.toInt(), dwfilter.toInt())

public actual fun freeUrlCacheSpaceW(lpszcachepath: Pcwstr, dwsize: UInt, dwfilter: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_freeUrlCacheSpaceW((lpszcachepath?.value ?: 0L), dwsize.toInt(), dwfilter.toInt())

public actual fun ftpCommandA(hconnect: COpaquePointer?, fexpectresponse: Bool, dwflags: FtpFlags, lpszcommand: Pcstr, dwcontext: ULong, phftpcommand: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_ftpCommandA((hconnect?.value ?: 0L), fexpectresponse, dwflags.toInt(), (lpszcommand?.value ?: 0L), dwcontext.toLong(), (phftpcommand?.value ?: 0L))

public actual fun ftpCommandW(hconnect: COpaquePointer?, fexpectresponse: Bool, dwflags: FtpFlags, lpszcommand: Pcwstr, dwcontext: ULong, phftpcommand: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_ftpCommandW((hconnect?.value ?: 0L), fexpectresponse, dwflags.toInt(), (lpszcommand?.value ?: 0L), dwcontext.toLong(), (phftpcommand?.value ?: 0L))

public actual fun ftpCreateDirectoryA(hconnect: COpaquePointer?, lpszdirectory: Pcstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_ftpCreateDirectoryA((hconnect?.value ?: 0L), (lpszdirectory?.value ?: 0L))

public actual fun ftpCreateDirectoryW(hconnect: COpaquePointer?, lpszdirectory: Pcwstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_ftpCreateDirectoryW((hconnect?.value ?: 0L), (lpszdirectory?.value ?: 0L))

public actual fun ftpDeleteFileA(hconnect: COpaquePointer?, lpszfilename: Pcstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_ftpDeleteFileA((hconnect?.value ?: 0L), (lpszfilename?.value ?: 0L))

public actual fun ftpDeleteFileW(hconnect: COpaquePointer?, lpszfilename: Pcwstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_ftpDeleteFileW((hconnect?.value ?: 0L), (lpszfilename?.value ?: 0L))

public actual fun ftpFindFirstFileA(hconnect: COpaquePointer?, lpszsearchfile: Pcstr, lpfindfiledata: COpaquePointer?, dwflags: UInt, dwcontext: ULong): COpaquePointer? =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_ftpFindFirstFileA((hconnect?.value ?: 0L), (lpszsearchfile?.value ?: 0L), (lpfindfiledata?.value ?: 0L), dwflags.toInt(), dwcontext.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ftpFindFirstFileW(hconnect: COpaquePointer?, lpszsearchfile: Pcwstr, lpfindfiledata: COpaquePointer?, dwflags: UInt, dwcontext: ULong): COpaquePointer? =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_ftpFindFirstFileW((hconnect?.value ?: 0L), (lpszsearchfile?.value ?: 0L), (lpfindfiledata?.value ?: 0L), dwflags.toInt(), dwcontext.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ftpGetCurrentDirectoryA(hconnect: COpaquePointer?, lpszcurrentdirectory: Pstr, lpdwcurrentdirectory: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_ftpGetCurrentDirectoryA((hconnect?.value ?: 0L), (lpszcurrentdirectory?.value ?: 0L), (lpdwcurrentdirectory?.value ?: 0L))

public actual fun ftpGetCurrentDirectoryW(hconnect: COpaquePointer?, lpszcurrentdirectory: Pwstr, lpdwcurrentdirectory: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_ftpGetCurrentDirectoryW((hconnect?.value ?: 0L), (lpszcurrentdirectory?.value ?: 0L), (lpdwcurrentdirectory?.value ?: 0L))

public actual fun ftpGetFileA(hconnect: COpaquePointer?, lpszremotefile: Pcstr, lpsznewfile: Pcstr, ffailifexists: Bool, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_ftpGetFileA((hconnect?.value ?: 0L), (lpszremotefile?.value ?: 0L), (lpsznewfile?.value ?: 0L), ffailifexists, dwflagsandattributes.toInt(), dwflags.toInt(), dwcontext.toLong())

public actual fun ftpGetFileEx(hftpsession: COpaquePointer?, lpszremotefile: Pcstr, lpsznewfile: Pcwstr, ffailifexists: Bool, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_ftpGetFileEx((hftpsession?.value ?: 0L), (lpszremotefile?.value ?: 0L), (lpsznewfile?.value ?: 0L), ffailifexists, dwflagsandattributes.toInt(), dwflags.toInt(), dwcontext.toLong())

public actual fun ftpGetFileSize(hfile: COpaquePointer?, lpdwfilesizehigh: COpaquePointer?): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_ftpGetFileSize((hfile?.value ?: 0L), (lpdwfilesizehigh?.value ?: 0L)).toUInt()

public actual fun ftpGetFileW(hconnect: COpaquePointer?, lpszremotefile: Pcwstr, lpsznewfile: Pcwstr, ffailifexists: Bool, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_ftpGetFileW((hconnect?.value ?: 0L), (lpszremotefile?.value ?: 0L), (lpsznewfile?.value ?: 0L), ffailifexists, dwflagsandattributes.toInt(), dwflags.toInt(), dwcontext.toLong())

public actual fun ftpOpenFileA(hconnect: COpaquePointer?, lpszfilename: Pcstr, dwaccess: UInt, dwflags: FtpFlags, dwcontext: ULong): COpaquePointer? =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_ftpOpenFileA((hconnect?.value ?: 0L), (lpszfilename?.value ?: 0L), dwaccess.toInt(), dwflags.toInt(), dwcontext.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ftpOpenFileW(hconnect: COpaquePointer?, lpszfilename: Pcwstr, dwaccess: UInt, dwflags: FtpFlags, dwcontext: ULong): COpaquePointer? =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_ftpOpenFileW((hconnect?.value ?: 0L), (lpszfilename?.value ?: 0L), dwaccess.toInt(), dwflags.toInt(), dwcontext.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ftpPutFileA(hconnect: COpaquePointer?, lpszlocalfile: Pcstr, lpsznewremotefile: Pcstr, dwflags: FtpFlags, dwcontext: ULong): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_ftpPutFileA((hconnect?.value ?: 0L), (lpszlocalfile?.value ?: 0L), (lpsznewremotefile?.value ?: 0L), dwflags.toInt(), dwcontext.toLong())

public actual fun ftpPutFileEx(hftpsession: COpaquePointer?, lpszlocalfile: Pcwstr, lpsznewremotefile: Pcstr, dwflags: UInt, dwcontext: ULong): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_ftpPutFileEx((hftpsession?.value ?: 0L), (lpszlocalfile?.value ?: 0L), (lpsznewremotefile?.value ?: 0L), dwflags.toInt(), dwcontext.toLong())

public actual fun ftpPutFileW(hconnect: COpaquePointer?, lpszlocalfile: Pcwstr, lpsznewremotefile: Pcwstr, dwflags: FtpFlags, dwcontext: ULong): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_ftpPutFileW((hconnect?.value ?: 0L), (lpszlocalfile?.value ?: 0L), (lpsznewremotefile?.value ?: 0L), dwflags.toInt(), dwcontext.toLong())

public actual fun ftpRemoveDirectoryA(hconnect: COpaquePointer?, lpszdirectory: Pcstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_ftpRemoveDirectoryA((hconnect?.value ?: 0L), (lpszdirectory?.value ?: 0L))

public actual fun ftpRemoveDirectoryW(hconnect: COpaquePointer?, lpszdirectory: Pcwstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_ftpRemoveDirectoryW((hconnect?.value ?: 0L), (lpszdirectory?.value ?: 0L))

public actual fun ftpRenameFileA(hconnect: COpaquePointer?, lpszexisting: Pcstr, lpsznew: Pcstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_ftpRenameFileA((hconnect?.value ?: 0L), (lpszexisting?.value ?: 0L), (lpsznew?.value ?: 0L))

public actual fun ftpRenameFileW(hconnect: COpaquePointer?, lpszexisting: Pcwstr, lpsznew: Pcwstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_ftpRenameFileW((hconnect?.value ?: 0L), (lpszexisting?.value ?: 0L), (lpsznew?.value ?: 0L))

public actual fun ftpSetCurrentDirectoryA(hconnect: COpaquePointer?, lpszdirectory: Pcstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_ftpSetCurrentDirectoryA((hconnect?.value ?: 0L), (lpszdirectory?.value ?: 0L))

public actual fun ftpSetCurrentDirectoryW(hconnect: COpaquePointer?, lpszdirectory: Pcwstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_ftpSetCurrentDirectoryW((hconnect?.value ?: 0L), (lpszdirectory?.value ?: 0L))

public actual fun getDiskInfoA(pszpath: Pcstr, pdwclustersize: COpaquePointer?, pdlavail: COpaquePointer?, pdltotal: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_getDiskInfoA((pszpath?.value ?: 0L), (pdwclustersize?.value ?: 0L), (pdlavail?.value ?: 0L), (pdltotal?.value ?: 0L))

public actual fun getUrlCacheConfigInfoA(lpcacheconfiginfo: COpaquePointer?, lpcbcacheconfiginfo: COpaquePointer?, dwfieldcontrol: CacheConfig): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_getUrlCacheConfigInfoA((lpcacheconfiginfo?.value ?: 0L), (lpcbcacheconfiginfo?.value ?: 0L), dwfieldcontrol.toInt())

public actual fun getUrlCacheConfigInfoW(lpcacheconfiginfo: COpaquePointer?, lpcbcacheconfiginfo: COpaquePointer?, dwfieldcontrol: CacheConfig): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_getUrlCacheConfigInfoW((lpcacheconfiginfo?.value ?: 0L), (lpcbcacheconfiginfo?.value ?: 0L), dwfieldcontrol.toInt())

public actual fun getUrlCacheEntryBinaryBlob(pwszurlname: Pcwstr, dwtype: COpaquePointer?, pftexpiretime: COpaquePointer?, pftaccesstime: COpaquePointer?, pftmodifiedtime: COpaquePointer?, ppbblob: COpaquePointer?, pcbblob: COpaquePointer?): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_getUrlCacheEntryBinaryBlob((pwszurlname?.value ?: 0L), (dwtype?.value ?: 0L), (pftexpiretime?.value ?: 0L), (pftaccesstime?.value ?: 0L), (pftmodifiedtime?.value ?: 0L), (ppbblob?.value ?: 0L), (pcbblob?.value ?: 0L)).toUInt()

public actual fun getUrlCacheEntryInfoA(lpszurlname: Pcstr, lpcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_getUrlCacheEntryInfoA((lpszurlname?.value ?: 0L), (lpcacheentryinfo?.value ?: 0L), (lpcbcacheentryinfo?.value ?: 0L))

public actual fun getUrlCacheEntryInfoExA(lpszurl: Pcstr, lpcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, lpszredirecturl: Pcstr, lpcbredirecturl: COpaquePointer?, lpreserved: COpaquePointer?, dwflags: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_getUrlCacheEntryInfoExA((lpszurl?.value ?: 0L), (lpcacheentryinfo?.value ?: 0L), (lpcbcacheentryinfo?.value ?: 0L), (lpszredirecturl?.value ?: 0L), (lpcbredirecturl?.value ?: 0L), (lpreserved?.value ?: 0L), dwflags.toInt())

public actual fun getUrlCacheEntryInfoExW(lpszurl: Pcwstr, lpcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, lpszredirecturl: Pcwstr, lpcbredirecturl: COpaquePointer?, lpreserved: COpaquePointer?, dwflags: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_getUrlCacheEntryInfoExW((lpszurl?.value ?: 0L), (lpcacheentryinfo?.value ?: 0L), (lpcbcacheentryinfo?.value ?: 0L), (lpszredirecturl?.value ?: 0L), (lpcbredirecturl?.value ?: 0L), (lpreserved?.value ?: 0L), dwflags.toInt())

public actual fun getUrlCacheEntryInfoW(lpszurlname: Pcwstr, lpcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_getUrlCacheEntryInfoW((lpszurlname?.value ?: 0L), (lpcacheentryinfo?.value ?: 0L), (lpcbcacheentryinfo?.value ?: 0L))

public actual fun getUrlCacheGroupAttributeA(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: COpaquePointer?, lpcbgroupinfo: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_getUrlCacheGroupAttributeA(gid, dwflags.toInt(), dwattributes.toInt(), (lpgroupinfo?.value ?: 0L), (lpcbgroupinfo?.value ?: 0L), (lpreserved?.value ?: 0L))

public actual fun getUrlCacheGroupAttributeW(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: COpaquePointer?, lpcbgroupinfo: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_getUrlCacheGroupAttributeW(gid, dwflags.toInt(), dwattributes.toInt(), (lpgroupinfo?.value ?: 0L), (lpcbgroupinfo?.value ?: 0L), (lpreserved?.value ?: 0L))

public actual fun getUrlCacheHeaderData(nidx: UInt, lpdwdata: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_getUrlCacheHeaderData(nidx.toInt(), (lpdwdata?.value ?: 0L))

public actual fun gopherCreateLocatorA(lpszhost: Pcstr, nserverport: UShort, lpszdisplaystring: Pcstr, lpszselectorstring: Pcstr, dwgophertype: UInt, lpszlocator: Pstr, lpdwbufferlength: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_gopherCreateLocatorA((lpszhost?.value ?: 0L), nserverport.toShort(), (lpszdisplaystring?.value ?: 0L), (lpszselectorstring?.value ?: 0L), dwgophertype.toInt(), (lpszlocator?.value ?: 0L), (lpdwbufferlength?.value ?: 0L))

public actual fun gopherCreateLocatorW(lpszhost: Pcwstr, nserverport: UShort, lpszdisplaystring: Pcwstr, lpszselectorstring: Pcwstr, dwgophertype: UInt, lpszlocator: Pwstr, lpdwbufferlength: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_gopherCreateLocatorW((lpszhost?.value ?: 0L), nserverport.toShort(), (lpszdisplaystring?.value ?: 0L), (lpszselectorstring?.value ?: 0L), dwgophertype.toInt(), (lpszlocator?.value ?: 0L), (lpdwbufferlength?.value ?: 0L))

public actual fun gopherFindFirstFileA(hconnect: COpaquePointer?, lpszlocator: Pcstr, lpszsearchstring: Pcstr, lpfinddata: COpaquePointer?, dwflags: UInt, dwcontext: ULong): COpaquePointer? =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_gopherFindFirstFileA((hconnect?.value ?: 0L), (lpszlocator?.value ?: 0L), (lpszsearchstring?.value ?: 0L), (lpfinddata?.value ?: 0L), dwflags.toInt(), dwcontext.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun gopherFindFirstFileW(hconnect: COpaquePointer?, lpszlocator: Pcwstr, lpszsearchstring: Pcwstr, lpfinddata: COpaquePointer?, dwflags: UInt, dwcontext: ULong): COpaquePointer? =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_gopherFindFirstFileW((hconnect?.value ?: 0L), (lpszlocator?.value ?: 0L), (lpszsearchstring?.value ?: 0L), (lpfinddata?.value ?: 0L), dwflags.toInt(), dwcontext.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun gopherGetAttributeA(hconnect: COpaquePointer?, lpszlocator: Pcstr, lpszattributename: Pcstr, lpbuffer: COpaquePointer?, dwbufferlength: UInt, lpdwcharactersreturned: COpaquePointer?, lpfnenumerator: GopherAttributeEnumerator, dwcontext: ULong): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_gopherGetAttributeA((hconnect?.value ?: 0L), (lpszlocator?.value ?: 0L), (lpszattributename?.value ?: 0L), (lpbuffer?.value ?: 0L), dwbufferlength.toInt(), (lpdwcharactersreturned?.value ?: 0L), 0L, dwcontext.toLong())

public actual fun gopherGetAttributeW(hconnect: COpaquePointer?, lpszlocator: Pcwstr, lpszattributename: Pcwstr, lpbuffer: COpaquePointer?, dwbufferlength: UInt, lpdwcharactersreturned: COpaquePointer?, lpfnenumerator: GopherAttributeEnumerator, dwcontext: ULong): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_gopherGetAttributeW((hconnect?.value ?: 0L), (lpszlocator?.value ?: 0L), (lpszattributename?.value ?: 0L), (lpbuffer?.value ?: 0L), dwbufferlength.toInt(), (lpdwcharactersreturned?.value ?: 0L), 0L, dwcontext.toLong())

public actual fun gopherGetLocatorTypeA(lpszlocator: Pcstr, lpdwgophertype: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_gopherGetLocatorTypeA((lpszlocator?.value ?: 0L), (lpdwgophertype?.value ?: 0L))

public actual fun gopherGetLocatorTypeW(lpszlocator: Pcwstr, lpdwgophertype: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_gopherGetLocatorTypeW((lpszlocator?.value ?: 0L), (lpdwgophertype?.value ?: 0L))

public actual fun gopherOpenFileA(hconnect: COpaquePointer?, lpszlocator: Pcstr, lpszview: Pcstr, dwflags: UInt, dwcontext: ULong): COpaquePointer? =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_gopherOpenFileA((hconnect?.value ?: 0L), (lpszlocator?.value ?: 0L), (lpszview?.value ?: 0L), dwflags.toInt(), dwcontext.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun gopherOpenFileW(hconnect: COpaquePointer?, lpszlocator: Pcwstr, lpszview: Pcwstr, dwflags: UInt, dwcontext: ULong): COpaquePointer? =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_gopherOpenFileW((hconnect?.value ?: 0L), (lpszlocator?.value ?: 0L), (lpszview?.value ?: 0L), dwflags.toInt(), dwcontext.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun httpAddRequestHeadersA(hrequest: COpaquePointer?, lpszheaders: Pcstr, dwheaderslength: UInt, dwmodifiers: HttpAddreqFlag): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_httpAddRequestHeadersA((hrequest?.value ?: 0L), (lpszheaders?.value ?: 0L), dwheaderslength.toInt(), dwmodifiers.toInt())

public actual fun httpAddRequestHeadersW(hrequest: COpaquePointer?, lpszheaders: Pcwstr, dwheaderslength: UInt, dwmodifiers: HttpAddreqFlag): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_httpAddRequestHeadersW((hrequest?.value ?: 0L), (lpszheaders?.value ?: 0L), dwheaderslength.toInt(), dwmodifiers.toInt())

public actual fun httpCheckDavComplianceA(lpszurl: Pcstr, lpszcompliancetoken: Pcstr, lpffound: COpaquePointer?, hwnd: Hwnd, lpvreserved: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_httpCheckDavComplianceA((lpszurl?.value ?: 0L), (lpszcompliancetoken?.value ?: 0L), (lpffound?.value ?: 0L), (hwnd?.value ?: 0L), (lpvreserved?.value ?: 0L))

public actual fun httpCheckDavComplianceW(lpszurl: Pcwstr, lpszcompliancetoken: Pcwstr, lpffound: COpaquePointer?, hwnd: Hwnd, lpvreserved: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_httpCheckDavComplianceW((lpszurl?.value ?: 0L), (lpszcompliancetoken?.value ?: 0L), (lpffound?.value ?: 0L), (hwnd?.value ?: 0L), (lpvreserved?.value ?: 0L))

public actual fun httpCloseDependencyHandle(hdependencyhandle: COpaquePointer?) {
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_httpCloseDependencyHandle((hdependencyhandle?.value ?: 0L))
}

public actual fun httpDuplicateDependencyHandle(hdependencyhandle: COpaquePointer?, phduplicateddependencyhandle: COpaquePointer?): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_httpDuplicateDependencyHandle((hdependencyhandle?.value ?: 0L), (phduplicateddependencyhandle?.value ?: 0L)).toUInt()

public actual fun httpEndRequestA(hrequest: COpaquePointer?, lpbuffersout: COpaquePointer?, dwflags: UInt, dwcontext: ULong): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_httpEndRequestA((hrequest?.value ?: 0L), (lpbuffersout?.value ?: 0L), dwflags.toInt(), dwcontext.toLong())

public actual fun httpEndRequestW(hrequest: COpaquePointer?, lpbuffersout: COpaquePointer?, dwflags: UInt, dwcontext: ULong): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_httpEndRequestW((hrequest?.value ?: 0L), (lpbuffersout?.value ?: 0L), dwflags.toInt(), dwcontext.toLong())

public actual fun httpGetServerCredentials(pwszurl: Pcwstr, ppwszusername: COpaquePointer?, ppwszpassword: COpaquePointer?): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_httpGetServerCredentials((pwszurl?.value ?: 0L), (ppwszusername?.value ?: 0L), (ppwszpassword?.value ?: 0L)).toUInt()

public actual fun httpIndicatePageLoadComplete(hdependencyhandle: COpaquePointer?): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_httpIndicatePageLoadComplete((hdependencyhandle?.value ?: 0L)).toUInt()

public actual fun httpIsHostHstsEnabled(pcwszurl: Pcwstr, pfishsts: COpaquePointer?): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_httpIsHostHstsEnabled((pcwszurl?.value ?: 0L), (pfishsts?.value ?: 0L)).toUInt()

public actual fun httpOpenDependencyHandle(hrequesthandle: COpaquePointer?, fbackground: Bool, phdependencyhandle: COpaquePointer?): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_httpOpenDependencyHandle((hrequesthandle?.value ?: 0L), fbackground, (phdependencyhandle?.value ?: 0L)).toUInt()

public actual fun httpOpenRequestA(hconnect: COpaquePointer?, lpszverb: Pcstr, lpszobjectname: Pcstr, lpszversion: Pcstr, lpszreferrer: Pcstr, lplpszaccepttypes: COpaquePointer?, dwflags: UInt, dwcontext: ULong): COpaquePointer? =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_httpOpenRequestA((hconnect?.value ?: 0L), (lpszverb?.value ?: 0L), (lpszobjectname?.value ?: 0L), (lpszversion?.value ?: 0L), (lpszreferrer?.value ?: 0L), (lplpszaccepttypes?.value ?: 0L), dwflags.toInt(), dwcontext.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun httpOpenRequestW(hconnect: COpaquePointer?, lpszverb: Pcwstr, lpszobjectname: Pcwstr, lpszversion: Pcwstr, lpszreferrer: Pcwstr, lplpszaccepttypes: COpaquePointer?, dwflags: UInt, dwcontext: ULong): COpaquePointer? =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_httpOpenRequestW((hconnect?.value ?: 0L), (lpszverb?.value ?: 0L), (lpszobjectname?.value ?: 0L), (lpszversion?.value ?: 0L), (lpszreferrer?.value ?: 0L), (lplpszaccepttypes?.value ?: 0L), dwflags.toInt(), dwcontext.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun httpPushClose(hwait: HttpPushWaitHandle) {
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_httpPushClose((hwait?.value ?: 0L))
}

public actual fun httpPushEnable(hrequest: COpaquePointer?, ptransportsetting: COpaquePointer?, phwait: COpaquePointer?): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_httpPushEnable((hrequest?.value ?: 0L), (ptransportsetting?.value ?: 0L), (phwait?.value ?: 0L)).toUInt()

public actual fun httpPushWait(hwait: HttpPushWaitHandle, etype: HttpPushWaitType, pnotificationstatus: COpaquePointer?): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_httpPushWait((hwait?.value ?: 0L), etype, (pnotificationstatus?.value ?: 0L)).toUInt()

public actual fun httpQueryInfoA(hrequest: COpaquePointer?, dwinfolevel: UInt, lpbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?, lpdwindex: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_httpQueryInfoA((hrequest?.value ?: 0L), dwinfolevel.toInt(), (lpbuffer?.value ?: 0L), (lpdwbufferlength?.value ?: 0L), (lpdwindex?.value ?: 0L))

public actual fun httpQueryInfoW(hrequest: COpaquePointer?, dwinfolevel: UInt, lpbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?, lpdwindex: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_httpQueryInfoW((hrequest?.value ?: 0L), dwinfolevel.toInt(), (lpbuffer?.value ?: 0L), (lpdwbufferlength?.value ?: 0L), (lpdwindex?.value ?: 0L))

public actual fun httpSendRequestA(hrequest: COpaquePointer?, lpszheaders: Pcstr, dwheaderslength: UInt, lpoptional: COpaquePointer?, dwoptionallength: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_httpSendRequestA((hrequest?.value ?: 0L), (lpszheaders?.value ?: 0L), dwheaderslength.toInt(), (lpoptional?.value ?: 0L), dwoptionallength.toInt())

public actual fun httpSendRequestExA(hrequest: COpaquePointer?, lpbuffersin: COpaquePointer?, lpbuffersout: COpaquePointer?, dwflags: UInt, dwcontext: ULong): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_httpSendRequestExA((hrequest?.value ?: 0L), (lpbuffersin?.value ?: 0L), (lpbuffersout?.value ?: 0L), dwflags.toInt(), dwcontext.toLong())

public actual fun httpSendRequestExW(hrequest: COpaquePointer?, lpbuffersin: COpaquePointer?, lpbuffersout: COpaquePointer?, dwflags: UInt, dwcontext: ULong): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_httpSendRequestExW((hrequest?.value ?: 0L), (lpbuffersin?.value ?: 0L), (lpbuffersout?.value ?: 0L), dwflags.toInt(), dwcontext.toLong())

public actual fun httpSendRequestW(hrequest: COpaquePointer?, lpszheaders: Pcwstr, dwheaderslength: UInt, lpoptional: COpaquePointer?, dwoptionallength: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_httpSendRequestW((hrequest?.value ?: 0L), (lpszheaders?.value ?: 0L), dwheaderslength.toInt(), (lpoptional?.value ?: 0L), dwoptionallength.toInt())

public actual fun httpWebSocketClose(hwebsocket: COpaquePointer?, usstatus: UShort, pvreason: COpaquePointer?, dwreasonlength: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_httpWebSocketClose((hwebsocket?.value ?: 0L), usstatus.toShort(), (pvreason?.value ?: 0L), dwreasonlength.toInt())

public actual fun httpWebSocketCompleteUpgrade(hrequest: COpaquePointer?, dwcontext: ULong): COpaquePointer? =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_httpWebSocketCompleteUpgrade((hrequest?.value ?: 0L), dwcontext.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun httpWebSocketQueryCloseStatus(hwebsocket: COpaquePointer?, pusstatus: COpaquePointer?, pvreason: COpaquePointer?, dwreasonlength: UInt, pdwreasonlengthconsumed: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_httpWebSocketQueryCloseStatus((hwebsocket?.value ?: 0L), (pusstatus?.value ?: 0L), (pvreason?.value ?: 0L), dwreasonlength.toInt(), (pdwreasonlengthconsumed?.value ?: 0L))

public actual fun httpWebSocketReceive(hwebsocket: COpaquePointer?, pvbuffer: COpaquePointer?, dwbufferlength: UInt, pdwbytesread: COpaquePointer?, pbuffertype: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_httpWebSocketReceive((hwebsocket?.value ?: 0L), (pvbuffer?.value ?: 0L), dwbufferlength.toInt(), (pdwbytesread?.value ?: 0L), (pbuffertype?.value ?: 0L))

public actual fun httpWebSocketSend(hwebsocket: COpaquePointer?, buffertype: HttpWebSocketBufferType, pvbuffer: COpaquePointer?, dwbufferlength: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_httpWebSocketSend((hwebsocket?.value ?: 0L), buffertype, (pvbuffer?.value ?: 0L), dwbufferlength.toInt())

public actual fun httpWebSocketShutdown(hwebsocket: COpaquePointer?, usstatus: UShort, pvreason: COpaquePointer?, dwreasonlength: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_httpWebSocketShutdown((hwebsocket?.value ?: 0L), usstatus.toShort(), (pvreason?.value ?: 0L), dwreasonlength.toInt())

public actual fun importCookieFileA(szfilename: Pcstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_importCookieFileA((szfilename?.value ?: 0L))

public actual fun importCookieFileW(szfilename: Pcwstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_importCookieFileW((szfilename?.value ?: 0L))

public actual fun incrementUrlCacheHeaderData(nidx: UInt, lpdwdata: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_incrementUrlCacheHeaderData(nidx.toInt(), (lpdwdata?.value ?: 0L))

public actual fun internalInternetGetCookie(lpszurl: Pcstr, lpszcookiedata: Pstr, lpdwdatasize: COpaquePointer?): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internalInternetGetCookie((lpszurl?.value ?: 0L), (lpszcookiedata?.value ?: 0L), (lpdwdatasize?.value ?: 0L)).toUInt()

public actual fun internetAlgIdToStringA(ai: AlgId, lpstr: Pstr, lpdwstrlength: COpaquePointer?, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetAlgIdToStringA(ai.toInt(), (lpstr?.value ?: 0L), (lpdwstrlength?.value ?: 0L), dwreserved.toInt())

public actual fun internetAlgIdToStringW(ai: AlgId, lpstr: Pwstr, lpdwstrlength: COpaquePointer?, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetAlgIdToStringW(ai.toInt(), (lpstr?.value ?: 0L), (lpdwstrlength?.value ?: 0L), dwreserved.toInt())

public actual fun internetAttemptConnect(dwreserved: UInt): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetAttemptConnect(dwreserved.toInt()).toUInt()

public actual fun internetAutodial(dwflags: InternetAutodial, hwndparent: Hwnd): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetAutodial(dwflags.toInt(), (hwndparent?.value ?: 0L))

public actual fun internetAutodialHangup(dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetAutodialHangup(dwreserved.toInt())

public actual fun internetCanonicalizeUrlA(lpszurl: Pcstr, lpszbuffer: Pstr, lpdwbufferlength: COpaquePointer?, dwflags: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetCanonicalizeUrlA((lpszurl?.value ?: 0L), (lpszbuffer?.value ?: 0L), (lpdwbufferlength?.value ?: 0L), dwflags.toInt())

public actual fun internetCanonicalizeUrlW(lpszurl: Pcwstr, lpszbuffer: Pwstr, lpdwbufferlength: COpaquePointer?, dwflags: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetCanonicalizeUrlW((lpszurl?.value ?: 0L), (lpszbuffer?.value ?: 0L), (lpdwbufferlength?.value ?: 0L), dwflags.toInt())

public actual fun internetCheckConnectionA(lpszurl: Pcstr, dwflags: UInt, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetCheckConnectionA((lpszurl?.value ?: 0L), dwflags.toInt(), dwreserved.toInt())

public actual fun internetCheckConnectionW(lpszurl: Pcwstr, dwflags: UInt, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetCheckConnectionW((lpszurl?.value ?: 0L), dwflags.toInt(), dwreserved.toInt())

public actual fun internetClearAllPerSiteCookieDecisions(): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetClearAllPerSiteCookieDecisions()

public actual fun internetCloseHandle(hinternet: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetCloseHandle((hinternet?.value ?: 0L))

public actual fun internetCombineUrlA(lpszbaseurl: Pcstr, lpszrelativeurl: Pcstr, lpszbuffer: Pstr, lpdwbufferlength: COpaquePointer?, dwflags: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetCombineUrlA((lpszbaseurl?.value ?: 0L), (lpszrelativeurl?.value ?: 0L), (lpszbuffer?.value ?: 0L), (lpdwbufferlength?.value ?: 0L), dwflags.toInt())

public actual fun internetCombineUrlW(lpszbaseurl: Pcwstr, lpszrelativeurl: Pcwstr, lpszbuffer: Pwstr, lpdwbufferlength: COpaquePointer?, dwflags: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetCombineUrlW((lpszbaseurl?.value ?: 0L), (lpszrelativeurl?.value ?: 0L), (lpszbuffer?.value ?: 0L), (lpdwbufferlength?.value ?: 0L), dwflags.toInt())

public actual fun internetConfirmZoneCrossing(hwnd: Hwnd, szurlprev: Pcstr, szurlnew: Pcstr, bpost: Bool): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetConfirmZoneCrossing((hwnd?.value ?: 0L), (szurlprev?.value ?: 0L), (szurlnew?.value ?: 0L), bpost).toUInt()

public actual fun internetConfirmZoneCrossingA(hwnd: Hwnd, szurlprev: Pcstr, szurlnew: Pcstr, bpost: Bool): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetConfirmZoneCrossingA((hwnd?.value ?: 0L), (szurlprev?.value ?: 0L), (szurlnew?.value ?: 0L), bpost).toUInt()

public actual fun internetConfirmZoneCrossingW(hwnd: Hwnd, szurlprev: Pcwstr, szurlnew: Pcwstr, bpost: Bool): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetConfirmZoneCrossingW((hwnd?.value ?: 0L), (szurlprev?.value ?: 0L), (szurlnew?.value ?: 0L), bpost).toUInt()

public actual fun internetConnectA(hinternet: COpaquePointer?, lpszservername: Pcstr, nserverport: UShort, lpszusername: Pcstr, lpszpassword: Pcstr, dwservice: UInt, dwflags: UInt, dwcontext: ULong): COpaquePointer? =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetConnectA((hinternet?.value ?: 0L), (lpszservername?.value ?: 0L), nserverport.toShort(), (lpszusername?.value ?: 0L), (lpszpassword?.value ?: 0L), dwservice.toInt(), dwflags.toInt(), dwcontext.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun internetConnectW(hinternet: COpaquePointer?, lpszservername: Pcwstr, nserverport: UShort, lpszusername: Pcwstr, lpszpassword: Pcwstr, dwservice: UInt, dwflags: UInt, dwcontext: ULong): COpaquePointer? =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetConnectW((hinternet?.value ?: 0L), (lpszservername?.value ?: 0L), nserverport.toShort(), (lpszusername?.value ?: 0L), (lpszpassword?.value ?: 0L), dwservice.toInt(), dwflags.toInt(), dwcontext.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun internetConvertUrlFromWireToWideChar(pcszurl: Pcstr, cchurl: UInt, pcwszbaseurl: Pcwstr, dwcodepagehost: UInt, dwcodepagepath: UInt, fencodepathextra: Bool, dwcodepageextra: UInt, ppwszconvertedurl: COpaquePointer?): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetConvertUrlFromWireToWideChar((pcszurl?.value ?: 0L), cchurl.toInt(), (pcwszbaseurl?.value ?: 0L), dwcodepagehost.toInt(), dwcodepagepath.toInt(), fencodepathextra, dwcodepageextra.toInt(), (ppwszconvertedurl?.value ?: 0L)).toUInt()

public actual fun internetCrackUrlA(lpszurl: Pcstr, dwurllength: UInt, dwflags: WinHttpCreateUrlFlags, lpurlcomponents: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetCrackUrlA((lpszurl?.value ?: 0L), dwurllength.toInt(), dwflags.toInt(), (lpurlcomponents?.value ?: 0L))

public actual fun internetCrackUrlW(lpszurl: Pcwstr, dwurllength: UInt, dwflags: WinHttpCreateUrlFlags, lpurlcomponents: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetCrackUrlW((lpszurl?.value ?: 0L), dwurllength.toInt(), dwflags.toInt(), (lpurlcomponents?.value ?: 0L))

public actual fun internetCreateUrlA(lpurlcomponents: COpaquePointer?, dwflags: UInt, lpszurl: Pstr, lpdwurllength: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetCreateUrlA((lpurlcomponents?.value ?: 0L), dwflags.toInt(), (lpszurl?.value ?: 0L), (lpdwurllength?.value ?: 0L))

public actual fun internetCreateUrlW(lpurlcomponents: COpaquePointer?, dwflags: UInt, lpszurl: Pwstr, lpdwurllength: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetCreateUrlW((lpurlcomponents?.value ?: 0L), dwflags.toInt(), (lpszurl?.value ?: 0L), (lpdwurllength?.value ?: 0L))

public actual fun internetDial(hwndparent: Hwnd, lpszconnectoid: Pcstr, dwflags: UInt, lpdwconnection: COpaquePointer?, dwreserved: UInt): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetDial((hwndparent?.value ?: 0L), (lpszconnectoid?.value ?: 0L), dwflags.toInt(), (lpdwconnection?.value ?: 0L), dwreserved.toInt()).toUInt()

public actual fun internetDialA(hwndparent: Hwnd, lpszconnectoid: Pcstr, dwflags: UInt, lpdwconnection: COpaquePointer?, dwreserved: UInt): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetDialA((hwndparent?.value ?: 0L), (lpszconnectoid?.value ?: 0L), dwflags.toInt(), (lpdwconnection?.value ?: 0L), dwreserved.toInt()).toUInt()

public actual fun internetDialW(hwndparent: Hwnd, lpszconnectoid: Pcwstr, dwflags: UInt, lpdwconnection: COpaquePointer?, dwreserved: UInt): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetDialW((hwndparent?.value ?: 0L), (lpszconnectoid?.value ?: 0L), dwflags.toInt(), (lpdwconnection?.value ?: 0L), dwreserved.toInt()).toUInt()

public actual fun internetEnumPerSiteCookieDecisionA(pszsitename: Pstr, pcsitenamesize: COpaquePointer?, pdwdecision: COpaquePointer?, dwindex: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetEnumPerSiteCookieDecisionA((pszsitename?.value ?: 0L), (pcsitenamesize?.value ?: 0L), (pdwdecision?.value ?: 0L), dwindex.toInt())

public actual fun internetEnumPerSiteCookieDecisionW(pszsitename: Pwstr, pcsitenamesize: COpaquePointer?, pdwdecision: COpaquePointer?, dwindex: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetEnumPerSiteCookieDecisionW((pszsitename?.value ?: 0L), (pcsitenamesize?.value ?: 0L), (pdwdecision?.value ?: 0L), dwindex.toInt())

public actual fun internetErrorDlg(hwnd: Hwnd, hrequest: COpaquePointer?, dwerror: UInt, dwflags: UInt, lppvdata: COpaquePointer?): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetErrorDlg((hwnd?.value ?: 0L), (hrequest?.value ?: 0L), dwerror.toInt(), dwflags.toInt(), (lppvdata?.value ?: 0L)).toUInt()

public actual fun internetFindNextFileA(hfind: COpaquePointer?, lpvfinddata: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetFindNextFileA((hfind?.value ?: 0L), (lpvfinddata?.value ?: 0L))

public actual fun internetFindNextFileW(hfind: COpaquePointer?, lpvfinddata: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetFindNextFileW((hfind?.value ?: 0L), (lpvfinddata?.value ?: 0L))

public actual fun internetFortezzaCommand(dwcommand: UInt, hwnd: Hwnd, dwreserved: ULong): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetFortezzaCommand(dwcommand.toInt(), (hwnd?.value ?: 0L), dwreserved.toLong())

public actual fun internetFreeCookies(pcookies: COpaquePointer?, dwcookiecount: UInt) {
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetFreeCookies((pcookies?.value ?: 0L), dwcookiecount.toInt())
}

public actual fun internetFreeProxyInfoList(pproxyinfolist: COpaquePointer?) {
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetFreeProxyInfoList((pproxyinfolist?.value ?: 0L))
}

public actual fun internetGetConnectedState(lpdwflags: COpaquePointer?, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetGetConnectedState((lpdwflags?.value ?: 0L), dwreserved.toInt())

public actual fun internetGetConnectedStateEx(lpdwflags: COpaquePointer?, lpszconnectionname: Pstr, dwnamelen: UInt, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetGetConnectedStateEx((lpdwflags?.value ?: 0L), (lpszconnectionname?.value ?: 0L), dwnamelen.toInt(), dwreserved.toInt())

public actual fun internetGetConnectedStateExA(lpdwflags: COpaquePointer?, lpszconnectionname: Pstr, cchnamelen: UInt, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetGetConnectedStateExA((lpdwflags?.value ?: 0L), (lpszconnectionname?.value ?: 0L), cchnamelen.toInt(), dwreserved.toInt())

public actual fun internetGetConnectedStateExW(lpdwflags: COpaquePointer?, lpszconnectionname: Pwstr, cchnamelen: UInt, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetGetConnectedStateExW((lpdwflags?.value ?: 0L), (lpszconnectionname?.value ?: 0L), cchnamelen.toInt(), dwreserved.toInt())

public actual fun internetGetCookieA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pstr, lpdwsize: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetGetCookieA((lpszurl?.value ?: 0L), (lpszcookiename?.value ?: 0L), (lpszcookiedata?.value ?: 0L), (lpdwsize?.value ?: 0L))

public actual fun internetGetCookieEx2(pcwszurl: Pcwstr, pcwszcookiename: Pcwstr, dwflags: UInt, ppcookies: COpaquePointer?, pdwcookiecount: COpaquePointer?): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetGetCookieEx2((pcwszurl?.value ?: 0L), (pcwszcookiename?.value ?: 0L), dwflags.toInt(), (ppcookies?.value ?: 0L), (pdwcookiecount?.value ?: 0L)).toUInt()

public actual fun internetGetCookieExA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pcstr, lpdwsize: COpaquePointer?, dwflags: InternetCookieFlags, lpreserved: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetGetCookieExA((lpszurl?.value ?: 0L), (lpszcookiename?.value ?: 0L), (lpszcookiedata?.value ?: 0L), (lpdwsize?.value ?: 0L), dwflags.toInt(), (lpreserved?.value ?: 0L))

public actual fun internetGetCookieExW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr, lpdwsize: COpaquePointer?, dwflags: InternetCookieFlags, lpreserved: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetGetCookieExW((lpszurl?.value ?: 0L), (lpszcookiename?.value ?: 0L), (lpszcookiedata?.value ?: 0L), (lpdwsize?.value ?: 0L), dwflags.toInt(), (lpreserved?.value ?: 0L))

public actual fun internetGetCookieW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pwstr, lpdwsize: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetGetCookieW((lpszurl?.value ?: 0L), (lpszcookiename?.value ?: 0L), (lpszcookiedata?.value ?: 0L), (lpdwsize?.value ?: 0L))

public actual fun internetGetLastResponseInfoA(lpdwerror: COpaquePointer?, lpszbuffer: Pstr, lpdwbufferlength: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetGetLastResponseInfoA((lpdwerror?.value ?: 0L), (lpszbuffer?.value ?: 0L), (lpdwbufferlength?.value ?: 0L))

public actual fun internetGetLastResponseInfoW(lpdwerror: COpaquePointer?, lpszbuffer: Pwstr, lpdwbufferlength: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetGetLastResponseInfoW((lpdwerror?.value ?: 0L), (lpszbuffer?.value ?: 0L), (lpdwbufferlength?.value ?: 0L))

public actual fun internetGetPerSiteCookieDecisionA(pchhostname: Pcstr, presult: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetGetPerSiteCookieDecisionA((pchhostname?.value ?: 0L), (presult?.value ?: 0L))

public actual fun internetGetPerSiteCookieDecisionW(pchhostname: Pcwstr, presult: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetGetPerSiteCookieDecisionW((pchhostname?.value ?: 0L), (presult?.value ?: 0L))

public actual fun internetGetProxyForUrl(hinternet: COpaquePointer?, pcwszurl: Pcwstr, pproxyinfolist: COpaquePointer?): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetGetProxyForUrl((hinternet?.value ?: 0L), (pcwszurl?.value ?: 0L), (pproxyinfolist?.value ?: 0L)).toUInt()

public actual fun internetGetSecurityInfoByURL(lpszurl: Pcstr, ppcertchain: COpaquePointer?, pdwsecureflags: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetGetSecurityInfoByURL((lpszurl?.value ?: 0L), (ppcertchain?.value ?: 0L), (pdwsecureflags?.value ?: 0L))

public actual fun internetGetSecurityInfoByURLA(lpszurl: Pcstr, ppcertchain: COpaquePointer?, pdwsecureflags: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetGetSecurityInfoByURLA((lpszurl?.value ?: 0L), (ppcertchain?.value ?: 0L), (pdwsecureflags?.value ?: 0L))

public actual fun internetGetSecurityInfoByURLW(lpszurl: Pcwstr, ppcertchain: COpaquePointer?, pdwsecureflags: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetGetSecurityInfoByURLW((lpszurl?.value ?: 0L), (ppcertchain?.value ?: 0L), (pdwsecureflags?.value ?: 0L))

public actual fun internetGoOnline(lpszurl: Pcstr, hwndparent: Hwnd, dwflags: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetGoOnline((lpszurl?.value ?: 0L), (hwndparent?.value ?: 0L), dwflags.toInt())

public actual fun internetGoOnlineA(lpszurl: Pcstr, hwndparent: Hwnd, dwflags: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetGoOnlineA((lpszurl?.value ?: 0L), (hwndparent?.value ?: 0L), dwflags.toInt())

public actual fun internetGoOnlineW(lpszurl: Pcwstr, hwndparent: Hwnd, dwflags: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetGoOnlineW((lpszurl?.value ?: 0L), (hwndparent?.value ?: 0L), dwflags.toInt())

public actual fun internetHangUp(dwconnection: ULong, dwreserved: UInt): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetHangUp(dwconnection.toLong(), dwreserved.toInt()).toUInt()

public actual fun internetInitializeAutoProxyDll(dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetInitializeAutoProxyDll(dwreserved.toInt())

public actual fun internetLockRequestFile(hinternet: COpaquePointer?, lphlockrequestinfo: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetLockRequestFile((hinternet?.value ?: 0L), (lphlockrequestinfo?.value ?: 0L))

public actual fun internetOpenA(lpszagent: Pcstr, dwaccesstype: UInt, lpszproxy: Pcstr, lpszproxybypass: Pcstr, dwflags: UInt): COpaquePointer? =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetOpenA((lpszagent?.value ?: 0L), dwaccesstype.toInt(), (lpszproxy?.value ?: 0L), (lpszproxybypass?.value ?: 0L), dwflags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun internetOpenUrlA(hinternet: COpaquePointer?, lpszurl: Pcstr, lpszheaders: Pcstr, dwheaderslength: UInt, dwflags: UInt, dwcontext: ULong): COpaquePointer? =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetOpenUrlA((hinternet?.value ?: 0L), (lpszurl?.value ?: 0L), (lpszheaders?.value ?: 0L), dwheaderslength.toInt(), dwflags.toInt(), dwcontext.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun internetOpenUrlW(hinternet: COpaquePointer?, lpszurl: Pcwstr, lpszheaders: Pcwstr, dwheaderslength: UInt, dwflags: UInt, dwcontext: ULong): COpaquePointer? =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetOpenUrlW((hinternet?.value ?: 0L), (lpszurl?.value ?: 0L), (lpszheaders?.value ?: 0L), dwheaderslength.toInt(), dwflags.toInt(), dwcontext.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun internetOpenW(lpszagent: Pcwstr, dwaccesstype: UInt, lpszproxy: Pcwstr, lpszproxybypass: Pcwstr, dwflags: UInt): COpaquePointer? =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetOpenW((lpszagent?.value ?: 0L), dwaccesstype.toInt(), (lpszproxy?.value ?: 0L), (lpszproxybypass?.value ?: 0L), dwflags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun internetQueryDataAvailable(hfile: COpaquePointer?, lpdwnumberofbytesavailable: COpaquePointer?, dwflags: UInt, dwcontext: ULong): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetQueryDataAvailable((hfile?.value ?: 0L), (lpdwnumberofbytesavailable?.value ?: 0L), dwflags.toInt(), dwcontext.toLong())

public actual fun internetQueryFortezzaStatus(pdwstatus: COpaquePointer?, dwreserved: ULong): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetQueryFortezzaStatus((pdwstatus?.value ?: 0L), dwreserved.toLong())

public actual fun internetQueryOptionA(hinternet: COpaquePointer?, dwoption: UInt, lpbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetQueryOptionA((hinternet?.value ?: 0L), dwoption.toInt(), (lpbuffer?.value ?: 0L), (lpdwbufferlength?.value ?: 0L))

public actual fun internetQueryOptionW(hinternet: COpaquePointer?, dwoption: UInt, lpbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetQueryOptionW((hinternet?.value ?: 0L), dwoption.toInt(), (lpbuffer?.value ?: 0L), (lpdwbufferlength?.value ?: 0L))

public actual fun internetReadFile(hfile: COpaquePointer?, lpbuffer: COpaquePointer?, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetReadFile((hfile?.value ?: 0L), (lpbuffer?.value ?: 0L), dwnumberofbytestoread.toInt(), (lpdwnumberofbytesread?.value ?: 0L))

public actual fun internetReadFileExA(hfile: COpaquePointer?, lpbuffersout: COpaquePointer?, dwflags: UInt, dwcontext: ULong): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetReadFileExA((hfile?.value ?: 0L), (lpbuffersout?.value ?: 0L), dwflags.toInt(), dwcontext.toLong())

public actual fun internetReadFileExW(hfile: COpaquePointer?, lpbuffersout: COpaquePointer?, dwflags: UInt, dwcontext: ULong): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetReadFileExW((hfile?.value ?: 0L), (lpbuffersout?.value ?: 0L), dwflags.toInt(), dwcontext.toLong())

public actual fun internetSecurityProtocolToStringA(dwprotocol: UInt, lpstr: Pstr, lpdwstrlength: COpaquePointer?, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetSecurityProtocolToStringA(dwprotocol.toInt(), (lpstr?.value ?: 0L), (lpdwstrlength?.value ?: 0L), dwreserved.toInt())

public actual fun internetSecurityProtocolToStringW(dwprotocol: UInt, lpstr: Pwstr, lpdwstrlength: COpaquePointer?, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetSecurityProtocolToStringW(dwprotocol.toInt(), (lpstr?.value ?: 0L), (lpdwstrlength?.value ?: 0L), dwreserved.toInt())

public actual fun internetSetCookieA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pcstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetSetCookieA((lpszurl?.value ?: 0L), (lpszcookiename?.value ?: 0L), (lpszcookiedata?.value ?: 0L))

public actual fun internetSetCookieEx2(pcwszurl: Pcwstr, pcookie: COpaquePointer?, pcwszp3ppolicy: Pcwstr, dwflags: UInt, pdwcookiestate: COpaquePointer?): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetSetCookieEx2((pcwszurl?.value ?: 0L), (pcookie?.value ?: 0L), (pcwszp3ppolicy?.value ?: 0L), dwflags.toInt(), (pdwcookiestate?.value ?: 0L)).toUInt()

public actual fun internetSetCookieExA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pcstr, dwflags: UInt, dwreserved: ULong): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetSetCookieExA((lpszurl?.value ?: 0L), (lpszcookiename?.value ?: 0L), (lpszcookiedata?.value ?: 0L), dwflags.toInt(), dwreserved.toLong()).toUInt()

public actual fun internetSetCookieExW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr, dwflags: UInt, dwreserved: ULong): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetSetCookieExW((lpszurl?.value ?: 0L), (lpszcookiename?.value ?: 0L), (lpszcookiedata?.value ?: 0L), dwflags.toInt(), dwreserved.toLong()).toUInt()

public actual fun internetSetCookieW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetSetCookieW((lpszurl?.value ?: 0L), (lpszcookiename?.value ?: 0L), (lpszcookiedata?.value ?: 0L))

public actual fun internetSetDialState(lpszconnectoid: Pcstr, dwstate: UInt, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetSetDialState((lpszconnectoid?.value ?: 0L), dwstate.toInt(), dwreserved.toInt())

public actual fun internetSetDialStateA(lpszconnectoid: Pcstr, dwstate: UInt, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetSetDialStateA((lpszconnectoid?.value ?: 0L), dwstate.toInt(), dwreserved.toInt())

public actual fun internetSetDialStateW(lpszconnectoid: Pcwstr, dwstate: UInt, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetSetDialStateW((lpszconnectoid?.value ?: 0L), dwstate.toInt(), dwreserved.toInt())

public actual fun internetSetFilePointer(hfile: COpaquePointer?, ldistancetomove: Int, lpdistancetomovehigh: COpaquePointer?, dwmovemethod: UInt, dwcontext: ULong): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetSetFilePointer((hfile?.value ?: 0L), ldistancetomove, (lpdistancetomovehigh?.value ?: 0L), dwmovemethod.toInt(), dwcontext.toLong()).toUInt()

public actual fun internetSetOptionA(hinternet: COpaquePointer?, dwoption: UInt, lpbuffer: COpaquePointer?, dwbufferlength: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetSetOptionA((hinternet?.value ?: 0L), dwoption.toInt(), (lpbuffer?.value ?: 0L), dwbufferlength.toInt())

public actual fun internetSetOptionExA(hinternet: COpaquePointer?, dwoption: UInt, lpbuffer: COpaquePointer?, dwbufferlength: UInt, dwflags: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetSetOptionExA((hinternet?.value ?: 0L), dwoption.toInt(), (lpbuffer?.value ?: 0L), dwbufferlength.toInt(), dwflags.toInt())

public actual fun internetSetOptionExW(hinternet: COpaquePointer?, dwoption: UInt, lpbuffer: COpaquePointer?, dwbufferlength: UInt, dwflags: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetSetOptionExW((hinternet?.value ?: 0L), dwoption.toInt(), (lpbuffer?.value ?: 0L), dwbufferlength.toInt(), dwflags.toInt())

public actual fun internetSetOptionW(hinternet: COpaquePointer?, dwoption: UInt, lpbuffer: COpaquePointer?, dwbufferlength: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetSetOptionW((hinternet?.value ?: 0L), dwoption.toInt(), (lpbuffer?.value ?: 0L), dwbufferlength.toInt())

public actual fun internetSetPerSiteCookieDecisionA(pchhostname: Pcstr, dwdecision: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetSetPerSiteCookieDecisionA((pchhostname?.value ?: 0L), dwdecision.toInt())

public actual fun internetSetPerSiteCookieDecisionW(pchhostname: Pcwstr, dwdecision: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetSetPerSiteCookieDecisionW((pchhostname?.value ?: 0L), dwdecision.toInt())

public actual fun internetSetStatusCallback(hinternet: COpaquePointer?, lpfninternetcallback: LpinternetStatusCallback): LpinternetStatusCallback =
    null

public actual fun internetSetStatusCallbackA(hinternet: COpaquePointer?, lpfninternetcallback: LpinternetStatusCallback): LpinternetStatusCallback =
    null

public actual fun internetSetStatusCallbackW(hinternet: COpaquePointer?, lpfninternetcallback: LpinternetStatusCallback): LpinternetStatusCallback =
    null

public actual fun internetShowSecurityInfoByURL(lpszurl: Pcstr, hwndparent: Hwnd): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetShowSecurityInfoByURL((lpszurl?.value ?: 0L), (hwndparent?.value ?: 0L))

public actual fun internetShowSecurityInfoByURLA(lpszurl: Pcstr, hwndparent: Hwnd): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetShowSecurityInfoByURLA((lpszurl?.value ?: 0L), (hwndparent?.value ?: 0L))

public actual fun internetShowSecurityInfoByURLW(lpszurl: Pcwstr, hwndparent: Hwnd): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetShowSecurityInfoByURLW((lpszurl?.value ?: 0L), (hwndparent?.value ?: 0L))

public actual fun internetTimeFromSystemTime(pst: COpaquePointer?, dwrfc: UInt, lpsztime: Pstr, cbtime: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetTimeFromSystemTime((pst?.value ?: 0L), dwrfc.toInt(), (lpsztime?.value ?: 0L), cbtime.toInt())

public actual fun internetTimeFromSystemTimeA(pst: COpaquePointer?, dwrfc: UInt, lpsztime: Pstr, cbtime: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetTimeFromSystemTimeA((pst?.value ?: 0L), dwrfc.toInt(), (lpsztime?.value ?: 0L), cbtime.toInt())

public actual fun internetTimeFromSystemTimeW(pst: COpaquePointer?, dwrfc: UInt, lpsztime: Pwstr, cbtime: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetTimeFromSystemTimeW((pst?.value ?: 0L), dwrfc.toInt(), (lpsztime?.value ?: 0L), cbtime.toInt())

public actual fun internetTimeToSystemTime(lpsztime: Pcstr, pst: COpaquePointer?, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetTimeToSystemTime((lpsztime?.value ?: 0L), (pst?.value ?: 0L), dwreserved.toInt())

public actual fun internetTimeToSystemTimeA(lpsztime: Pcstr, pst: COpaquePointer?, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetTimeToSystemTimeA((lpsztime?.value ?: 0L), (pst?.value ?: 0L), dwreserved.toInt())

public actual fun internetTimeToSystemTimeW(lpsztime: Pcwstr, pst: COpaquePointer?, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetTimeToSystemTimeW((lpsztime?.value ?: 0L), (pst?.value ?: 0L), dwreserved.toInt())

public actual fun internetUnlockRequestFile(hlockrequestinfo: Handle): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetUnlockRequestFile((hlockrequestinfo?.value ?: 0L))

public actual fun internetWriteFile(hfile: COpaquePointer?, lpbuffer: COpaquePointer?, dwnumberofbytestowrite: UInt, lpdwnumberofbyteswritten: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetWriteFile((hfile?.value ?: 0L), (lpbuffer?.value ?: 0L), dwnumberofbytestowrite.toInt(), (lpdwnumberofbyteswritten?.value ?: 0L))

public actual fun internetWriteFileExA(hfile: COpaquePointer?, lpbuffersin: COpaquePointer?, dwflags: UInt, dwcontext: ULong): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetWriteFileExA((hfile?.value ?: 0L), (lpbuffersin?.value ?: 0L), dwflags.toInt(), dwcontext.toLong())

public actual fun internetWriteFileExW(hfile: COpaquePointer?, lpbuffersin: COpaquePointer?, dwflags: UInt, dwcontext: ULong): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_internetWriteFileExW((hfile?.value ?: 0L), (lpbuffersin?.value ?: 0L), dwflags.toInt(), dwcontext.toLong())

public actual fun isDomainLegalCookieDomainA(pchdomain: Pcstr, pchfulldomain: Pcstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_isDomainLegalCookieDomainA((pchdomain?.value ?: 0L), (pchfulldomain?.value ?: 0L))

public actual fun isDomainLegalCookieDomainW(pchdomain: Pcwstr, pchfulldomain: Pcwstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_isDomainLegalCookieDomainW((pchdomain?.value ?: 0L), (pchfulldomain?.value ?: 0L))

public actual fun isHostInProxyBypassList(tscheme: InternetScheme, lpszhost: Pcstr, cchhost: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_isHostInProxyBypassList(tscheme, (lpszhost?.value ?: 0L), cchhost.toInt())

public actual fun isProfilesEnabled(): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_isProfilesEnabled()

public actual fun isUrlCacheEntryExpiredA(lpszurlname: Pcstr, dwflags: UInt, pftlastmodified: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_isUrlCacheEntryExpiredA((lpszurlname?.value ?: 0L), dwflags.toInt(), (pftlastmodified?.value ?: 0L))

public actual fun isUrlCacheEntryExpiredW(lpszurlname: Pcwstr, dwflags: UInt, pftlastmodified: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_isUrlCacheEntryExpiredW((lpszurlname?.value ?: 0L), dwflags.toInt(), (pftlastmodified?.value ?: 0L))

public actual fun loadUrlCacheContent(): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_loadUrlCacheContent()

public actual fun parseX509EncodedCertificateForListBoxEntry(lpcert: COpaquePointer?, cbcert: UInt, lpszlistboxentry: Pstr, lpdwlistboxentry: COpaquePointer?): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_parseX509EncodedCertificateForListBoxEntry((lpcert?.value ?: 0L), cbcert.toInt(), (lpszlistboxentry?.value ?: 0L), (lpdwlistboxentry?.value ?: 0L)).toUInt()

public actual fun performOperationOverUrlCacheA(pszurlsearchpattern: Pcstr, dwflags: UInt, dwfilter: UInt, groupid: Long, preserved1: COpaquePointer?, pdwreserved2: COpaquePointer?, preserved3: COpaquePointer?, op: CacheOperator, poperatordata: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_performOperationOverUrlCacheA((pszurlsearchpattern?.value ?: 0L), dwflags.toInt(), dwfilter.toInt(), groupid, (preserved1?.value ?: 0L), (pdwreserved2?.value ?: 0L), (preserved3?.value ?: 0L), 0L, (poperatordata?.value ?: 0L))

public actual fun privacyGetZonePreferenceW(dwzone: UInt, dwtype: UInt, pdwtemplate: COpaquePointer?, pszbuffer: Pwstr, pdwbufferlength: COpaquePointer?): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_privacyGetZonePreferenceW(dwzone.toInt(), dwtype.toInt(), (pdwtemplate?.value ?: 0L), (pszbuffer?.value ?: 0L), (pdwbufferlength?.value ?: 0L)).toUInt()

public actual fun privacySetZonePreferenceW(dwzone: UInt, dwtype: UInt, dwtemplate: UInt, pszpreference: Pcwstr): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_privacySetZonePreferenceW(dwzone.toInt(), dwtype.toInt(), dwtemplate.toInt(), (pszpreference?.value ?: 0L)).toUInt()

public actual fun readGuidsForConnectedNetworks(pcnetworks: COpaquePointer?, pppwsznetworkguids: COpaquePointer?, pppbstrnetworknames: COpaquePointer?, pppwszgwmacs: COpaquePointer?, pcgatewaymacs: COpaquePointer?, pdwflags: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_readGuidsForConnectedNetworks((pcnetworks?.value ?: 0L), (pppwsznetworkguids?.value ?: 0L), (pppbstrnetworknames?.value ?: 0L), (pppwszgwmacs?.value ?: 0L), (pcgatewaymacs?.value ?: 0L), (pdwflags?.value ?: 0L))

public actual fun readUrlCacheEntryStream(hurlcachestream: Handle, dwlocation: UInt, lpbuffer: COpaquePointer?, lpdwlen: COpaquePointer?, reserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_readUrlCacheEntryStream((hurlcachestream?.value ?: 0L), dwlocation.toInt(), (lpbuffer?.value ?: 0L), (lpdwlen?.value ?: 0L), reserved.toInt())

public actual fun readUrlCacheEntryStreamEx(hurlcachestream: Handle, qwlocation: ULong, lpbuffer: COpaquePointer?, lpdwlen: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_readUrlCacheEntryStreamEx((hurlcachestream?.value ?: 0L), qwlocation.toLong(), (lpbuffer?.value ?: 0L), (lpdwlen?.value ?: 0L))

public actual fun registerUrlCacheNotification(hwnd: Hwnd, umsg: UInt, gid: Long, dwopsfilter: UInt, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_registerUrlCacheNotification((hwnd?.value ?: 0L), umsg.toInt(), gid, dwopsfilter.toInt(), dwreserved.toInt())

public actual fun resumeSuspendedDownload(hrequest: COpaquePointer?, dwresultcode: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_resumeSuspendedDownload((hrequest?.value ?: 0L), dwresultcode.toInt())

public actual fun retrieveUrlCacheEntryFileA(lpszurlname: Pcstr, lpcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_retrieveUrlCacheEntryFileA((lpszurlname?.value ?: 0L), (lpcacheentryinfo?.value ?: 0L), (lpcbcacheentryinfo?.value ?: 0L), dwreserved.toInt())

public actual fun retrieveUrlCacheEntryFileW(lpszurlname: Pcwstr, lpcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_retrieveUrlCacheEntryFileW((lpszurlname?.value ?: 0L), (lpcacheentryinfo?.value ?: 0L), (lpcbcacheentryinfo?.value ?: 0L), dwreserved.toInt())

public actual fun retrieveUrlCacheEntryStreamA(lpszurlname: Pcstr, lpcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, frandomread: Bool, dwreserved: UInt): Handle =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_retrieveUrlCacheEntryStreamA((lpszurlname?.value ?: 0L), (lpcacheentryinfo?.value ?: 0L), (lpcbcacheentryinfo?.value ?: 0L), frandomread, dwreserved.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun retrieveUrlCacheEntryStreamW(lpszurlname: Pcwstr, lpcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, frandomread: Bool, dwreserved: UInt): Handle =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_retrieveUrlCacheEntryStreamW((lpszurlname?.value ?: 0L), (lpcacheentryinfo?.value ?: 0L), (lpcbcacheentryinfo?.value ?: 0L), frandomread, dwreserved.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun runOnceUrlCache(hwnd: Hwnd, hinst: Hinstance, lpszcmd: Pcstr, ncmdshow: Int): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_runOnceUrlCache((hwnd?.value ?: 0L), (hinst?.value ?: 0L), (lpszcmd?.value ?: 0L), ncmdshow).toUInt()

public actual fun setUrlCacheConfigInfoA(lpcacheconfiginfo: COpaquePointer?, dwfieldcontrol: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_setUrlCacheConfigInfoA((lpcacheconfiginfo?.value ?: 0L), dwfieldcontrol.toInt())

public actual fun setUrlCacheConfigInfoW(lpcacheconfiginfo: COpaquePointer?, dwfieldcontrol: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_setUrlCacheConfigInfoW((lpcacheconfiginfo?.value ?: 0L), dwfieldcontrol.toInt())

public actual fun setUrlCacheEntryGroup(lpszurlname: Pcstr, dwflags: UInt, groupid: Long, pbgroupattributes: COpaquePointer?, cbgroupattributes: UInt, lpreserved: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_setUrlCacheEntryGroup((lpszurlname?.value ?: 0L), dwflags.toInt(), groupid, (pbgroupattributes?.value ?: 0L), cbgroupattributes.toInt(), (lpreserved?.value ?: 0L))

public actual fun setUrlCacheEntryGroupA(lpszurlname: Pcstr, dwflags: UInt, groupid: Long, pbgroupattributes: COpaquePointer?, cbgroupattributes: UInt, lpreserved: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_setUrlCacheEntryGroupA((lpszurlname?.value ?: 0L), dwflags.toInt(), groupid, (pbgroupattributes?.value ?: 0L), cbgroupattributes.toInt(), (lpreserved?.value ?: 0L))

public actual fun setUrlCacheEntryGroupW(lpszurlname: Pcwstr, dwflags: UInt, groupid: Long, pbgroupattributes: COpaquePointer?, cbgroupattributes: UInt, lpreserved: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_setUrlCacheEntryGroupW((lpszurlname?.value ?: 0L), dwflags.toInt(), groupid, (pbgroupattributes?.value ?: 0L), cbgroupattributes.toInt(), (lpreserved?.value ?: 0L))

public actual fun setUrlCacheEntryInfoA(lpszurlname: Pcstr, lpcacheentryinfo: COpaquePointer?, dwfieldcontrol: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_setUrlCacheEntryInfoA((lpszurlname?.value ?: 0L), (lpcacheentryinfo?.value ?: 0L), dwfieldcontrol.toInt())

public actual fun setUrlCacheEntryInfoW(lpszurlname: Pcwstr, lpcacheentryinfo: COpaquePointer?, dwfieldcontrol: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_setUrlCacheEntryInfoW((lpszurlname?.value ?: 0L), (lpcacheentryinfo?.value ?: 0L), dwfieldcontrol.toInt())

public actual fun setUrlCacheGroupAttributeA(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_setUrlCacheGroupAttributeA(gid, dwflags.toInt(), dwattributes.toInt(), (lpgroupinfo?.value ?: 0L), (lpreserved?.value ?: 0L))

public actual fun setUrlCacheGroupAttributeW(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_setUrlCacheGroupAttributeW(gid, dwflags.toInt(), dwattributes.toInt(), (lpgroupinfo?.value ?: 0L), (lpreserved?.value ?: 0L))

public actual fun setUrlCacheHeaderData(nidx: UInt, dwdata: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_setUrlCacheHeaderData(nidx.toInt(), dwdata.toInt())

public actual fun showClientAuthCerts(hwndparent: Hwnd): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_showClientAuthCerts((hwndparent?.value ?: 0L)).toUInt()

public actual fun showSecurityInfo(hwndparent: Hwnd, psecurityinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_showSecurityInfo((hwndparent?.value ?: 0L), (psecurityinfo?.value ?: 0L)).toUInt()

public actual fun showX509EncodedCertificate(hwndparent: Hwnd, lpcert: COpaquePointer?, cbcert: UInt): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_showX509EncodedCertificate((hwndparent?.value ?: 0L), (lpcert?.value ?: 0L), cbcert.toInt()).toUInt()

public actual fun unlockUrlCacheEntryFile(lpszurlname: Pcstr, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_unlockUrlCacheEntryFile((lpszurlname?.value ?: 0L), dwreserved.toInt())

public actual fun unlockUrlCacheEntryFileA(lpszurlname: Pcstr, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_unlockUrlCacheEntryFileA((lpszurlname?.value ?: 0L), dwreserved.toInt())

public actual fun unlockUrlCacheEntryFileW(lpszurlname: Pcwstr, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_unlockUrlCacheEntryFileW((lpszurlname?.value ?: 0L), dwreserved.toInt())

public actual fun unlockUrlCacheEntryStream(hurlcachestream: Handle, reserved: UInt): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_unlockUrlCacheEntryStream((hurlcachestream?.value ?: 0L), reserved.toInt())

public actual fun updateUrlCacheContentPath(sznewpath: Pcstr): Bool =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_updateUrlCacheContentPath((sznewpath?.value ?: 0L))

public actual fun urlCacheCheckEntriesExist(rgpwszurls: COpaquePointer?, centries: UInt, rgfexist: COpaquePointer?): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_urlCacheCheckEntriesExist((rgpwszurls?.value ?: 0L), centries.toInt(), (rgfexist?.value ?: 0L)).toUInt()

public actual fun urlCacheCloseEntryHandle(hentryfile: COpaquePointer?) {
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_urlCacheCloseEntryHandle((hentryfile?.value ?: 0L))
}

public actual fun urlCacheContainerSetEntryMaximumAge(pwszprefix: Pcwstr, dwentrymaxage: UInt): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_urlCacheContainerSetEntryMaximumAge((pwszprefix?.value ?: 0L), dwentrymaxage.toInt()).toUInt()

public actual fun urlCacheCreateContainer(pwszname: Pcwstr, pwszprefix: Pcwstr, pwszdirectory: Pcwstr, ulllimit: ULong, dwoptions: UInt): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_urlCacheCreateContainer((pwszname?.value ?: 0L), (pwszprefix?.value ?: 0L), (pwszdirectory?.value ?: 0L), ulllimit.toLong(), dwoptions.toInt()).toUInt()

public actual fun urlCacheFindFirstEntry(pwszprefix: Pcwstr, dwflags: UInt, dwfilter: UInt, groupid: Long, pcacheentryinfo: COpaquePointer?, phfind: COpaquePointer?): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_urlCacheFindFirstEntry((pwszprefix?.value ?: 0L), dwflags.toInt(), dwfilter.toInt(), groupid, (pcacheentryinfo?.value ?: 0L), (phfind?.value ?: 0L)).toUInt()

public actual fun urlCacheFindNextEntry(hfind: Handle, pcacheentryinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_urlCacheFindNextEntry((hfind?.value ?: 0L), (pcacheentryinfo?.value ?: 0L)).toUInt()

public actual fun urlCacheFreeEntryInfo(pcacheentryinfo: COpaquePointer?) {
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_urlCacheFreeEntryInfo((pcacheentryinfo?.value ?: 0L))
}

public actual fun urlCacheFreeGlobalSpace(ulltargetsize: ULong, dwfilter: UInt): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_urlCacheFreeGlobalSpace(ulltargetsize.toLong(), dwfilter.toInt()).toUInt()

public actual fun urlCacheGetContentPaths(pppwszdirectories: COpaquePointer?, pcdirectories: COpaquePointer?): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_urlCacheGetContentPaths((pppwszdirectories?.value ?: 0L), (pcdirectories?.value ?: 0L)).toUInt()

public actual fun urlCacheGetEntryInfo(happcache: COpaquePointer?, pcwszurl: Pcwstr, pcacheentryinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_urlCacheGetEntryInfo((happcache?.value ?: 0L), (pcwszurl?.value ?: 0L), (pcacheentryinfo?.value ?: 0L)).toUInt()

public actual fun urlCacheGetGlobalCacheSize(dwfilter: UInt, pullsize: COpaquePointer?, pulllimit: COpaquePointer?): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_urlCacheGetGlobalCacheSize(dwfilter.toInt(), (pullsize?.value ?: 0L), (pulllimit?.value ?: 0L)).toUInt()

public actual fun urlCacheGetGlobalLimit(limittype: UrlCacheLimitType, pulllimit: COpaquePointer?): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_urlCacheGetGlobalLimit(limittype, (pulllimit?.value ?: 0L)).toUInt()

public actual fun urlCacheReadEntryStream(hurlcachestream: COpaquePointer?, ulllocation: ULong, pbuffer: COpaquePointer?, dwbufferlen: UInt, pdwbufferlen: COpaquePointer?): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_urlCacheReadEntryStream((hurlcachestream?.value ?: 0L), ulllocation.toLong(), (pbuffer?.value ?: 0L), dwbufferlen.toInt(), (pdwbufferlen?.value ?: 0L)).toUInt()

public actual fun urlCacheReloadSettings(): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_urlCacheReloadSettings().toUInt()

public actual fun urlCacheRetrieveEntryFile(happcache: COpaquePointer?, pcwszurl: Pcwstr, pcacheentryinfo: COpaquePointer?, phentryfile: COpaquePointer?): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_urlCacheRetrieveEntryFile((happcache?.value ?: 0L), (pcwszurl?.value ?: 0L), (pcacheentryinfo?.value ?: 0L), (phentryfile?.value ?: 0L)).toUInt()

public actual fun urlCacheRetrieveEntryStream(happcache: COpaquePointer?, pcwszurl: Pcwstr, frandomread: Bool, pcacheentryinfo: COpaquePointer?, phentrystream: COpaquePointer?): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_urlCacheRetrieveEntryStream((happcache?.value ?: 0L), (pcwszurl?.value ?: 0L), frandomread, (pcacheentryinfo?.value ?: 0L), (phentrystream?.value ?: 0L)).toUInt()

public actual fun urlCacheServer(): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_urlCacheServer().toUInt()

public actual fun urlCacheSetGlobalLimit(limittype: UrlCacheLimitType, ulllimit: ULong): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_urlCacheSetGlobalLimit(limittype, ulllimit.toLong()).toUInt()

public actual fun urlCacheUpdateEntryExtraData(happcache: COpaquePointer?, pcwszurl: Pcwstr, pbextradata: COpaquePointer?, cbextradata: UInt): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_urlCacheUpdateEntryExtraData((happcache?.value ?: 0L), (pcwszurl?.value ?: 0L), (pbextradata?.value ?: 0L), cbextradata.toInt()).toUInt()
