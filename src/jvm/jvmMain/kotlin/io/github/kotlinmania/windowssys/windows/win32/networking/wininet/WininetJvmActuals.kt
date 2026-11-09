@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.wininet

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.WIN_HTTP_CREATE_URL_FLAGS
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ALG_ID

private object WindowsWin32NetworkingWininetJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_AppCacheCheckManifest(pwszmasterurl: Long, pwszmanifesturl: Long, pbmanifestdata: Long, dwmanifestdatasize: Int, pbmanifestresponseheaders: Long, dwmanifestresponseheaderssize: Int, pestate: Long, phnewappcache: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_AppCacheCloseHandle(happcache: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_AppCacheCreateAndCommitFile(happcache: Long, pwszsourcefilepath: Long, pwszurl: Long, pbresponseheaders: Long, dwresponseheaderssize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_AppCacheDeleteGroup(pwszmanifesturl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_AppCacheDeleteIEGroup(pwszmanifesturl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_AppCacheDuplicateHandle(happcache: Long, phduplicatedappcache: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_AppCacheFinalize(happcache: Long, pbmanifestdata: Long, dwmanifestdatasize: Int, pestate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_AppCacheFreeDownloadList(pdownloadlist: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_AppCacheFreeGroupList(pappcachegrouplist: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_AppCacheGetDownloadList(happcache: Long, pdownloadlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_AppCacheGetFallbackUrl(happcache: Long, pwszurl: Long, ppwszfallbackurl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_AppCacheGetGroupList(pappcachegrouplist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_AppCacheGetIEGroupList(pappcachegrouplist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_AppCacheGetInfo(happcache: Long, pappcacheinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_AppCacheGetManifestUrl(happcache: Long, ppwszmanifesturl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_AppCacheLookup(pwszurl: Long, dwflags: Int, phappcache: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_CreateMD5SSOHash(pszchallengeinfo: Long, pwszrealm: Long, pwsztarget: Long, pbhexhash: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_CreateUrlCacheContainerA(name: Long, lpcacheprefix: Long, lpszcachepath: Long, kbcachelimit: Int, dwcontainertype: Int, dwoptions: Int, pvbuffer: Long, cbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_CreateUrlCacheContainerW(name: Long, lpcacheprefix: Long, lpszcachepath: Long, kbcachelimit: Int, dwcontainertype: Int, dwoptions: Int, pvbuffer: Long, cbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_CreateUrlCacheEntryA(lpszurlname: Long, dwexpectedfilesize: Int, lpszfileextension: Long, lpszfilename: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_CreateUrlCacheEntryExW(lpszurlname: Long, dwexpectedfilesize: Int, lpszfileextension: Long, lpszfilename: Long, dwreserved: Int, fpreserveincomingfilename: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_CreateUrlCacheEntryW(lpszurlname: Long, dwexpectedfilesize: Int, lpszfileextension: Long, lpszfilename: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_CreateUrlCacheGroup(dwflags: Int, lpreserved: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_DeleteIE3Cache(hwnd: Long, hinst: Long, lpszcmd: Long, ncmdshow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_DeleteUrlCacheContainerA(name: Long, dwoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_DeleteUrlCacheContainerW(name: Long, dwoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_DeleteUrlCacheEntry(lpszurlname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_DeleteUrlCacheEntryA(lpszurlname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_DeleteUrlCacheEntryW(lpszurlname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_DeleteUrlCacheGroup(groupid: Long, dwflags: Int, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_DeleteWpadCacheForNetworks(param0: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_DetectAutoProxyUrl(pszautoproxyurl: Long, cchautoproxyurl: Int, dwdetectflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_DoConnectoidsExist(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_ExportCookieFileA(szfilename: Long, fappend: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_ExportCookieFileW(szfilename: Long, fappend: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FindCloseUrlCache(henumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FindFirstUrlCacheContainerA(pdwmodified: Long, lpcontainerinfo: Long, lpcbcontainerinfo: Long, dwoptions: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FindFirstUrlCacheContainerW(pdwmodified: Long, lpcontainerinfo: Long, lpcbcontainerinfo: Long, dwoptions: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FindFirstUrlCacheEntryA(lpszurlsearchpattern: Long, lpfirstcacheentryinfo: Long, lpcbcacheentryinfo: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FindFirstUrlCacheEntryExA(lpszurlsearchpattern: Long, dwflags: Int, dwfilter: Int, groupid: Long, lpfirstcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpgroupattributes: Long, lpcbgroupattributes: Long, lpreserved: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FindFirstUrlCacheEntryExW(lpszurlsearchpattern: Long, dwflags: Int, dwfilter: Int, groupid: Long, lpfirstcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpgroupattributes: Long, lpcbgroupattributes: Long, lpreserved: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FindFirstUrlCacheEntryW(lpszurlsearchpattern: Long, lpfirstcacheentryinfo: Long, lpcbcacheentryinfo: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FindFirstUrlCacheGroup(dwflags: Int, dwfilter: Int, lpsearchcondition: Long, dwsearchcondition: Int, lpgroupid: Long, lpreserved: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FindNextUrlCacheContainerA(henumhandle: Long, lpcontainerinfo: Long, lpcbcontainerinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FindNextUrlCacheContainerW(henumhandle: Long, lpcontainerinfo: Long, lpcbcontainerinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FindNextUrlCacheEntryA(henumhandle: Long, lpnextcacheentryinfo: Long, lpcbcacheentryinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FindNextUrlCacheEntryExA(henumhandle: Long, lpnextcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpgroupattributes: Long, lpcbgroupattributes: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FindNextUrlCacheEntryExW(henumhandle: Long, lpnextcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpgroupattributes: Long, lpcbgroupattributes: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FindNextUrlCacheEntryW(henumhandle: Long, lpnextcacheentryinfo: Long, lpcbcacheentryinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FindNextUrlCacheGroup(hfind: Long, lpgroupid: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FindP3PPolicySymbol(pszsymbol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FreeUrlCacheSpaceA(lpszcachepath: Long, dwsize: Int, dwfilter: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FreeUrlCacheSpaceW(lpszcachepath: Long, dwsize: Int, dwfilter: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FtpCommandA(hconnect: Long, fexpectresponse: Int, dwflags: Int, lpszcommand: Long, dwcontext: Long, phftpcommand: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FtpCommandW(hconnect: Long, fexpectresponse: Int, dwflags: Int, lpszcommand: Long, dwcontext: Long, phftpcommand: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FtpCreateDirectoryA(hconnect: Long, lpszdirectory: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FtpCreateDirectoryW(hconnect: Long, lpszdirectory: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FtpDeleteFileA(hconnect: Long, lpszfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FtpDeleteFileW(hconnect: Long, lpszfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FtpFindFirstFileA(hconnect: Long, lpszsearchfile: Long, lpfindfiledata: Long, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FtpFindFirstFileW(hconnect: Long, lpszsearchfile: Long, lpfindfiledata: Long, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FtpGetCurrentDirectoryA(hconnect: Long, lpszcurrentdirectory: Long, lpdwcurrentdirectory: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FtpGetCurrentDirectoryW(hconnect: Long, lpszcurrentdirectory: Long, lpdwcurrentdirectory: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FtpGetFileA(hconnect: Long, lpszremotefile: Long, lpsznewfile: Long, ffailifexists: Int, dwflagsandattributes: Int, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FtpGetFileEx(hftpsession: Long, lpszremotefile: Long, lpsznewfile: Long, ffailifexists: Int, dwflagsandattributes: Int, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FtpGetFileSize(hfile: Long, lpdwfilesizehigh: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FtpGetFileW(hconnect: Long, lpszremotefile: Long, lpsznewfile: Long, ffailifexists: Int, dwflagsandattributes: Int, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FtpOpenFileA(hconnect: Long, lpszfilename: Long, dwaccess: Int, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FtpOpenFileW(hconnect: Long, lpszfilename: Long, dwaccess: Int, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FtpPutFileA(hconnect: Long, lpszlocalfile: Long, lpsznewremotefile: Long, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FtpPutFileEx(hftpsession: Long, lpszlocalfile: Long, lpsznewremotefile: Long, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FtpPutFileW(hconnect: Long, lpszlocalfile: Long, lpsznewremotefile: Long, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FtpRemoveDirectoryA(hconnect: Long, lpszdirectory: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FtpRemoveDirectoryW(hconnect: Long, lpszdirectory: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FtpRenameFileA(hconnect: Long, lpszexisting: Long, lpsznew: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FtpRenameFileW(hconnect: Long, lpszexisting: Long, lpsznew: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FtpSetCurrentDirectoryA(hconnect: Long, lpszdirectory: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_FtpSetCurrentDirectoryW(hconnect: Long, lpszdirectory: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_GetDiskInfoA(pszpath: Long, pdwclustersize: Long, pdlavail: Long, pdltotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_GetUrlCacheConfigInfoA(lpcacheconfiginfo: Long, lpcbcacheconfiginfo: Long, dwfieldcontrol: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_GetUrlCacheConfigInfoW(lpcacheconfiginfo: Long, lpcbcacheconfiginfo: Long, dwfieldcontrol: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_GetUrlCacheEntryBinaryBlob(pwszurlname: Long, dwtype: Long, pftexpiretime: Long, pftaccesstime: Long, pftmodifiedtime: Long, ppbblob: Long, pcbblob: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_GetUrlCacheEntryInfoA(lpszurlname: Long, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_GetUrlCacheEntryInfoExA(lpszurl: Long, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpszredirecturl: Long, lpcbredirecturl: Long, lpreserved: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_GetUrlCacheEntryInfoExW(lpszurl: Long, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpszredirecturl: Long, lpcbredirecturl: Long, lpreserved: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_GetUrlCacheEntryInfoW(lpszurlname: Long, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_GetUrlCacheGroupAttributeA(gid: Long, dwflags: Int, dwattributes: Int, lpgroupinfo: Long, lpcbgroupinfo: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_GetUrlCacheGroupAttributeW(gid: Long, dwflags: Int, dwattributes: Int, lpgroupinfo: Long, lpcbgroupinfo: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_GetUrlCacheHeaderData(nidx: Int, lpdwdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_GopherCreateLocatorA(lpszhost: Long, nserverport: Short, lpszdisplaystring: Long, lpszselectorstring: Long, dwgophertype: Int, lpszlocator: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_GopherCreateLocatorW(lpszhost: Long, nserverport: Short, lpszdisplaystring: Long, lpszselectorstring: Long, dwgophertype: Int, lpszlocator: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_GopherFindFirstFileA(hconnect: Long, lpszlocator: Long, lpszsearchstring: Long, lpfinddata: Long, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_GopherFindFirstFileW(hconnect: Long, lpszlocator: Long, lpszsearchstring: Long, lpfinddata: Long, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_GopherGetAttributeA(hconnect: Long, lpszlocator: Long, lpszattributename: Long, lpbuffer: Long, dwbufferlength: Int, lpdwcharactersreturned: Long, lpfnenumerator: Long, dwcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_GopherGetAttributeW(hconnect: Long, lpszlocator: Long, lpszattributename: Long, lpbuffer: Long, dwbufferlength: Int, lpdwcharactersreturned: Long, lpfnenumerator: Long, dwcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_GopherGetLocatorTypeA(lpszlocator: Long, lpdwgophertype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_GopherGetLocatorTypeW(lpszlocator: Long, lpdwgophertype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_GopherOpenFileA(hconnect: Long, lpszlocator: Long, lpszview: Long, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_GopherOpenFileW(hconnect: Long, lpszlocator: Long, lpszview: Long, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_HttpAddRequestHeadersA(hrequest: Long, lpszheaders: Long, dwheaderslength: Int, dwmodifiers: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_HttpAddRequestHeadersW(hrequest: Long, lpszheaders: Long, dwheaderslength: Int, dwmodifiers: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_HttpCheckDavComplianceA(lpszurl: Long, lpszcompliancetoken: Long, lpffound: Long, hwnd: Long, lpvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_HttpCheckDavComplianceW(lpszurl: Long, lpszcompliancetoken: Long, lpffound: Long, hwnd: Long, lpvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_HttpCloseDependencyHandle(hdependencyhandle: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_HttpDuplicateDependencyHandle(hdependencyhandle: Long, phduplicateddependencyhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_HttpEndRequestA(hrequest: Long, lpbuffersout: Long, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_HttpEndRequestW(hrequest: Long, lpbuffersout: Long, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_HttpGetServerCredentials(pwszurl: Long, ppwszusername: Long, ppwszpassword: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_HttpIndicatePageLoadComplete(hdependencyhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_HttpIsHostHstsEnabled(pcwszurl: Long, pfishsts: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_HttpOpenDependencyHandle(hrequesthandle: Long, fbackground: Int, phdependencyhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_HttpOpenRequestA(hconnect: Long, lpszverb: Long, lpszobjectname: Long, lpszversion: Long, lpszreferrer: Long, lplpszaccepttypes: Long, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_HttpOpenRequestW(hconnect: Long, lpszverb: Long, lpszobjectname: Long, lpszversion: Long, lpszreferrer: Long, lplpszaccepttypes: Long, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_HttpPushClose(hwait: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_HttpPushEnable(hrequest: Long, ptransportsetting: Long, phwait: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_HttpPushWait(hwait: Long, etype: Int, pnotificationstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_HttpQueryInfoA(hrequest: Long, dwinfolevel: Int, lpbuffer: Long, lpdwbufferlength: Long, lpdwindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_HttpQueryInfoW(hrequest: Long, dwinfolevel: Int, lpbuffer: Long, lpdwbufferlength: Long, lpdwindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_HttpSendRequestA(hrequest: Long, lpszheaders: Long, dwheaderslength: Int, lpoptional: Long, dwoptionallength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_HttpSendRequestExA(hrequest: Long, lpbuffersin: Long, lpbuffersout: Long, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_HttpSendRequestExW(hrequest: Long, lpbuffersin: Long, lpbuffersout: Long, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_HttpSendRequestW(hrequest: Long, lpszheaders: Long, dwheaderslength: Int, lpoptional: Long, dwoptionallength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_HttpWebSocketClose(hwebsocket: Long, usstatus: Short, pvreason: Long, dwreasonlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_HttpWebSocketCompleteUpgrade(hrequest: Long, dwcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_HttpWebSocketQueryCloseStatus(hwebsocket: Long, pusstatus: Long, pvreason: Long, dwreasonlength: Int, pdwreasonlengthconsumed: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_HttpWebSocketReceive(hwebsocket: Long, pvbuffer: Long, dwbufferlength: Int, pdwbytesread: Long, pbuffertype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_HttpWebSocketSend(hwebsocket: Long, buffertype: Int, pvbuffer: Long, dwbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_HttpWebSocketShutdown(hwebsocket: Long, usstatus: Short, pvreason: Long, dwreasonlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_ImportCookieFileA(szfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_ImportCookieFileW(szfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_IncrementUrlCacheHeaderData(nidx: Int, lpdwdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternalInternetGetCookie(lpszurl: Long, lpszcookiedata: Long, lpdwdatasize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetAlgIdToStringA(ai: Int, lpstr: Long, lpdwstrlength: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetAlgIdToStringW(ai: Int, lpstr: Long, lpdwstrlength: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetAttemptConnect(dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetAutodial(dwflags: Int, hwndparent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetAutodialHangup(dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetCanonicalizeUrlA(lpszurl: Long, lpszbuffer: Long, lpdwbufferlength: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetCanonicalizeUrlW(lpszurl: Long, lpszbuffer: Long, lpdwbufferlength: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetCheckConnectionA(lpszurl: Long, dwflags: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetCheckConnectionW(lpszurl: Long, dwflags: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetClearAllPerSiteCookieDecisions(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetCloseHandle(hinternet: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetCombineUrlA(lpszbaseurl: Long, lpszrelativeurl: Long, lpszbuffer: Long, lpdwbufferlength: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetCombineUrlW(lpszbaseurl: Long, lpszrelativeurl: Long, lpszbuffer: Long, lpdwbufferlength: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetConfirmZoneCrossing(hwnd: Long, szurlprev: Long, szurlnew: Long, bpost: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetConfirmZoneCrossingA(hwnd: Long, szurlprev: Long, szurlnew: Long, bpost: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetConfirmZoneCrossingW(hwnd: Long, szurlprev: Long, szurlnew: Long, bpost: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetConnectA(hinternet: Long, lpszservername: Long, nserverport: Short, lpszusername: Long, lpszpassword: Long, dwservice: Int, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetConnectW(hinternet: Long, lpszservername: Long, nserverport: Short, lpszusername: Long, lpszpassword: Long, dwservice: Int, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetConvertUrlFromWireToWideChar(pcszurl: Long, cchurl: Int, pcwszbaseurl: Long, dwcodepagehost: Int, dwcodepagepath: Int, fencodepathextra: Int, dwcodepageextra: Int, ppwszconvertedurl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetCrackUrlA(lpszurl: Long, dwurllength: Int, dwflags: Int, lpurlcomponents: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetCrackUrlW(lpszurl: Long, dwurllength: Int, dwflags: Int, lpurlcomponents: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetCreateUrlA(lpurlcomponents: Long, dwflags: Int, lpszurl: Long, lpdwurllength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetCreateUrlW(lpurlcomponents: Long, dwflags: Int, lpszurl: Long, lpdwurllength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetDial(hwndparent: Long, lpszconnectoid: Long, dwflags: Int, lpdwconnection: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetDialA(hwndparent: Long, lpszconnectoid: Long, dwflags: Int, lpdwconnection: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetDialW(hwndparent: Long, lpszconnectoid: Long, dwflags: Int, lpdwconnection: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetEnumPerSiteCookieDecisionA(pszsitename: Long, pcsitenamesize: Long, pdwdecision: Long, dwindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetEnumPerSiteCookieDecisionW(pszsitename: Long, pcsitenamesize: Long, pdwdecision: Long, dwindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetErrorDlg(hwnd: Long, hrequest: Long, dwerror: Int, dwflags: Int, lppvdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetFindNextFileA(hfind: Long, lpvfinddata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetFindNextFileW(hfind: Long, lpvfinddata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetFortezzaCommand(dwcommand: Int, hwnd: Long, dwreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetFreeCookies(pcookies: Long, dwcookiecount: Int)

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetFreeProxyInfoList(pproxyinfolist: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetGetConnectedState(lpdwflags: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetGetConnectedStateEx(lpdwflags: Long, lpszconnectionname: Long, dwnamelen: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetGetConnectedStateExA(lpdwflags: Long, lpszconnectionname: Long, cchnamelen: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetGetConnectedStateExW(lpdwflags: Long, lpszconnectionname: Long, cchnamelen: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetGetCookieA(lpszurl: Long, lpszcookiename: Long, lpszcookiedata: Long, lpdwsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetGetCookieEx2(pcwszurl: Long, pcwszcookiename: Long, dwflags: Int, ppcookies: Long, pdwcookiecount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetGetCookieExA(lpszurl: Long, lpszcookiename: Long, lpszcookiedata: Long, lpdwsize: Long, dwflags: Int, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetGetCookieExW(lpszurl: Long, lpszcookiename: Long, lpszcookiedata: Long, lpdwsize: Long, dwflags: Int, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetGetCookieW(lpszurl: Long, lpszcookiename: Long, lpszcookiedata: Long, lpdwsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetGetLastResponseInfoA(lpdwerror: Long, lpszbuffer: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetGetLastResponseInfoW(lpdwerror: Long, lpszbuffer: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetGetPerSiteCookieDecisionA(pchhostname: Long, presult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetGetPerSiteCookieDecisionW(pchhostname: Long, presult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetGetProxyForUrl(hinternet: Long, pcwszurl: Long, pproxyinfolist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetGetSecurityInfoByURL(lpszurl: Long, ppcertchain: Long, pdwsecureflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetGetSecurityInfoByURLA(lpszurl: Long, ppcertchain: Long, pdwsecureflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetGetSecurityInfoByURLW(lpszurl: Long, ppcertchain: Long, pdwsecureflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetGoOnline(lpszurl: Long, hwndparent: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetGoOnlineA(lpszurl: Long, hwndparent: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetGoOnlineW(lpszurl: Long, hwndparent: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetHangUp(dwconnection: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetInitializeAutoProxyDll(dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetLockRequestFile(hinternet: Long, lphlockrequestinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetOpenA(lpszagent: Long, dwaccesstype: Int, lpszproxy: Long, lpszproxybypass: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetOpenUrlA(hinternet: Long, lpszurl: Long, lpszheaders: Long, dwheaderslength: Int, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetOpenUrlW(hinternet: Long, lpszurl: Long, lpszheaders: Long, dwheaderslength: Int, dwflags: Int, dwcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetOpenW(lpszagent: Long, dwaccesstype: Int, lpszproxy: Long, lpszproxybypass: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetQueryDataAvailable(hfile: Long, lpdwnumberofbytesavailable: Long, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetQueryFortezzaStatus(pdwstatus: Long, dwreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetQueryOptionA(hinternet: Long, dwoption: Int, lpbuffer: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetQueryOptionW(hinternet: Long, dwoption: Int, lpbuffer: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetReadFile(hfile: Long, lpbuffer: Long, dwnumberofbytestoread: Int, lpdwnumberofbytesread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetReadFileExA(hfile: Long, lpbuffersout: Long, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetReadFileExW(hfile: Long, lpbuffersout: Long, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetSecurityProtocolToStringA(dwprotocol: Int, lpstr: Long, lpdwstrlength: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetSecurityProtocolToStringW(dwprotocol: Int, lpstr: Long, lpdwstrlength: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetSetCookieA(lpszurl: Long, lpszcookiename: Long, lpszcookiedata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetSetCookieEx2(pcwszurl: Long, pcookie: Long, pcwszp3ppolicy: Long, dwflags: Int, pdwcookiestate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetSetCookieExA(lpszurl: Long, lpszcookiename: Long, lpszcookiedata: Long, dwflags: Int, dwreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetSetCookieExW(lpszurl: Long, lpszcookiename: Long, lpszcookiedata: Long, dwflags: Int, dwreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetSetCookieW(lpszurl: Long, lpszcookiename: Long, lpszcookiedata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetSetDialState(lpszconnectoid: Long, dwstate: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetSetDialStateA(lpszconnectoid: Long, dwstate: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetSetDialStateW(lpszconnectoid: Long, dwstate: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetSetFilePointer(hfile: Long, ldistancetomove: Int, lpdistancetomovehigh: Long, dwmovemethod: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetSetOptionA(hinternet: Long, dwoption: Int, lpbuffer: Long, dwbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetSetOptionExA(hinternet: Long, dwoption: Int, lpbuffer: Long, dwbufferlength: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetSetOptionExW(hinternet: Long, dwoption: Int, lpbuffer: Long, dwbufferlength: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetSetOptionW(hinternet: Long, dwoption: Int, lpbuffer: Long, dwbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetSetPerSiteCookieDecisionA(pchhostname: Long, dwdecision: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetSetPerSiteCookieDecisionW(pchhostname: Long, dwdecision: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetSetStatusCallback(hinternet: Long, lpfninternetcallback: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetSetStatusCallbackA(hinternet: Long, lpfninternetcallback: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetSetStatusCallbackW(hinternet: Long, lpfninternetcallback: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetShowSecurityInfoByURL(lpszurl: Long, hwndparent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetShowSecurityInfoByURLA(lpszurl: Long, hwndparent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetShowSecurityInfoByURLW(lpszurl: Long, hwndparent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetTimeFromSystemTime(pst: Long, dwrfc: Int, lpsztime: Long, cbtime: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetTimeFromSystemTimeA(pst: Long, dwrfc: Int, lpsztime: Long, cbtime: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetTimeFromSystemTimeW(pst: Long, dwrfc: Int, lpsztime: Long, cbtime: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetTimeToSystemTime(lpsztime: Long, pst: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetTimeToSystemTimeA(lpsztime: Long, pst: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetTimeToSystemTimeW(lpsztime: Long, pst: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetUnlockRequestFile(hlockrequestinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetWriteFile(hfile: Long, lpbuffer: Long, dwnumberofbytestowrite: Int, lpdwnumberofbyteswritten: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetWriteFileExA(hfile: Long, lpbuffersin: Long, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_InternetWriteFileExW(hfile: Long, lpbuffersin: Long, dwflags: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_IsDomainLegalCookieDomainA(pchdomain: Long, pchfulldomain: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_IsDomainLegalCookieDomainW(pchdomain: Long, pchfulldomain: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_IsHostInProxyBypassList(tscheme: Int, lpszhost: Long, cchhost: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_IsProfilesEnabled(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_IsUrlCacheEntryExpiredA(lpszurlname: Long, dwflags: Int, pftlastmodified: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_IsUrlCacheEntryExpiredW(lpszurlname: Long, dwflags: Int, pftlastmodified: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_LoadUrlCacheContent(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_ParseX509EncodedCertificateForListBoxEntry(lpcert: Long, cbcert: Int, lpszlistboxentry: Long, lpdwlistboxentry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_PerformOperationOverUrlCacheA(pszurlsearchpattern: Long, dwflags: Int, dwfilter: Int, groupid: Long, preserved1: Long, pdwreserved2: Long, preserved3: Long, op: Long, poperatordata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_PrivacyGetZonePreferenceW(dwzone: Int, dwtype: Int, pdwtemplate: Long, pszbuffer: Long, pdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_PrivacySetZonePreferenceW(dwzone: Int, dwtype: Int, dwtemplate: Int, pszpreference: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_ReadGuidsForConnectedNetworks(pcnetworks: Long, pppwsznetworkguids: Long, pppbstrnetworknames: Long, pppwszgwmacs: Long, pcgatewaymacs: Long, pdwflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_ReadUrlCacheEntryStream(hurlcachestream: Long, dwlocation: Int, lpbuffer: Long, lpdwlen: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_ReadUrlCacheEntryStreamEx(hurlcachestream: Long, qwlocation: Long, lpbuffer: Long, lpdwlen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_RegisterUrlCacheNotification(hwnd: Long, umsg: Int, gid: Long, dwopsfilter: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_ResumeSuspendedDownload(hrequest: Long, dwresultcode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_RetrieveUrlCacheEntryFileA(lpszurlname: Long, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_RetrieveUrlCacheEntryFileW(lpszurlname: Long, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_RetrieveUrlCacheEntryStreamA(lpszurlname: Long, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, frandomread: Int, dwreserved: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_RetrieveUrlCacheEntryStreamW(lpszurlname: Long, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, frandomread: Int, dwreserved: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_RunOnceUrlCache(hwnd: Long, hinst: Long, lpszcmd: Long, ncmdshow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_SetUrlCacheConfigInfoA(lpcacheconfiginfo: Long, dwfieldcontrol: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_SetUrlCacheConfigInfoW(lpcacheconfiginfo: Long, dwfieldcontrol: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_SetUrlCacheEntryGroup(lpszurlname: Long, dwflags: Int, groupid: Long, pbgroupattributes: Long, cbgroupattributes: Int, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_SetUrlCacheEntryGroupA(lpszurlname: Long, dwflags: Int, groupid: Long, pbgroupattributes: Long, cbgroupattributes: Int, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_SetUrlCacheEntryGroupW(lpszurlname: Long, dwflags: Int, groupid: Long, pbgroupattributes: Long, cbgroupattributes: Int, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_SetUrlCacheEntryInfoA(lpszurlname: Long, lpcacheentryinfo: Long, dwfieldcontrol: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_SetUrlCacheEntryInfoW(lpszurlname: Long, lpcacheentryinfo: Long, dwfieldcontrol: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_SetUrlCacheGroupAttributeA(gid: Long, dwflags: Int, dwattributes: Int, lpgroupinfo: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_SetUrlCacheGroupAttributeW(gid: Long, dwflags: Int, dwattributes: Int, lpgroupinfo: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_SetUrlCacheHeaderData(nidx: Int, dwdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_ShowClientAuthCerts(hwndparent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_ShowSecurityInfo(hwndparent: Long, psecurityinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_ShowX509EncodedCertificate(hwndparent: Long, lpcert: Long, cbcert: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_UnlockUrlCacheEntryFile(lpszurlname: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_UnlockUrlCacheEntryFileA(lpszurlname: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_UnlockUrlCacheEntryFileW(lpszurlname: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_UnlockUrlCacheEntryStream(hurlcachestream: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_UpdateUrlCacheContentPath(sznewpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_UrlCacheCheckEntriesExist(rgpwszurls: Long, centries: Int, rgfexist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_UrlCacheCloseEntryHandle(hentryfile: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_UrlCacheContainerSetEntryMaximumAge(pwszprefix: Long, dwentrymaxage: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_UrlCacheCreateContainer(pwszname: Long, pwszprefix: Long, pwszdirectory: Long, ulllimit: Long, dwoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_UrlCacheFindFirstEntry(pwszprefix: Long, dwflags: Int, dwfilter: Int, groupid: Long, pcacheentryinfo: Long, phfind: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_UrlCacheFindNextEntry(hfind: Long, pcacheentryinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_UrlCacheFreeEntryInfo(pcacheentryinfo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_UrlCacheFreeGlobalSpace(ulltargetsize: Long, dwfilter: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_UrlCacheGetContentPaths(pppwszdirectories: Long, pcdirectories: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_UrlCacheGetEntryInfo(happcache: Long, pcwszurl: Long, pcacheentryinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_UrlCacheGetGlobalCacheSize(dwfilter: Int, pullsize: Long, pulllimit: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_UrlCacheGetGlobalLimit(limittype: Int, pulllimit: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_UrlCacheReadEntryStream(hurlcachestream: Long, ulllocation: Long, pbuffer: Long, dwbufferlen: Int, pdwbufferlen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_UrlCacheReloadSettings(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_UrlCacheRetrieveEntryFile(happcache: Long, pcwszurl: Long, pcacheentryinfo: Long, phentryfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_UrlCacheRetrieveEntryStream(happcache: Long, pcwszurl: Long, frandomread: Int, pcacheentryinfo: Long, phentrystream: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_UrlCacheServer(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_UrlCacheSetGlobalLimit(limittype: Int, ulllimit: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_wininet_UrlCacheUpdateEntryExtraData(happcache: Long, pcwszurl: Long, pbextradata: Long, cbextradata: Int): Int
}

public actual fun AppCacheCheckManifest(pwszmasterurl: PCWSTR, pwszmanifesturl: PCWSTR, pbmanifestdata: Long, dwmanifestdatasize: UInt, pbmanifestresponseheaders: Long, dwmanifestresponseheaderssize: UInt, pestate: Long, phnewappcache: Long): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_AppCacheCheckManifest(pwszmasterurl, pwszmanifesturl, pbmanifestdata, dwmanifestdatasize.toInt(), pbmanifestresponseheaders, dwmanifestresponseheaderssize.toInt(), pestate, phnewappcache).toUInt()

public actual fun AppCacheCloseHandle(happcache: Long) {
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_AppCacheCloseHandle(happcache)
}

public actual fun AppCacheCreateAndCommitFile(happcache: Long, pwszsourcefilepath: PCWSTR, pwszurl: PCWSTR, pbresponseheaders: Long, dwresponseheaderssize: UInt): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_AppCacheCreateAndCommitFile(happcache, pwszsourcefilepath, pwszurl, pbresponseheaders, dwresponseheaderssize.toInt()).toUInt()

public actual fun AppCacheDeleteGroup(pwszmanifesturl: PCWSTR): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_AppCacheDeleteGroup(pwszmanifesturl).toUInt()

public actual fun AppCacheDeleteIEGroup(pwszmanifesturl: PCWSTR): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_AppCacheDeleteIEGroup(pwszmanifesturl).toUInt()

public actual fun AppCacheDuplicateHandle(happcache: Long, phduplicatedappcache: Long): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_AppCacheDuplicateHandle(happcache, phduplicatedappcache).toUInt()

public actual fun AppCacheFinalize(happcache: Long, pbmanifestdata: Long, dwmanifestdatasize: UInt, pestate: Long): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_AppCacheFinalize(happcache, pbmanifestdata, dwmanifestdatasize.toInt(), pestate).toUInt()

public actual fun AppCacheFreeDownloadList(pdownloadlist: Long) {
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_AppCacheFreeDownloadList(pdownloadlist)
}

public actual fun AppCacheFreeGroupList(pappcachegrouplist: Long) {
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_AppCacheFreeGroupList(pappcachegrouplist)
}

public actual fun AppCacheFreeIESpace(ftcutoff: FILETIME): UInt =
    0u

public actual fun AppCacheFreeSpace(ftcutoff: FILETIME): UInt =
    0u

public actual fun AppCacheGetDownloadList(happcache: Long, pdownloadlist: Long): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_AppCacheGetDownloadList(happcache, pdownloadlist).toUInt()

public actual fun AppCacheGetFallbackUrl(happcache: Long, pwszurl: PCWSTR, ppwszfallbackurl: Long): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_AppCacheGetFallbackUrl(happcache, pwszurl, ppwszfallbackurl).toUInt()

public actual fun AppCacheGetGroupList(pappcachegrouplist: Long): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_AppCacheGetGroupList(pappcachegrouplist).toUInt()

public actual fun AppCacheGetIEGroupList(pappcachegrouplist: Long): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_AppCacheGetIEGroupList(pappcachegrouplist).toUInt()

public actual fun AppCacheGetInfo(happcache: Long, pappcacheinfo: Long): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_AppCacheGetInfo(happcache, pappcacheinfo).toUInt()

public actual fun AppCacheGetManifestUrl(happcache: Long, ppwszmanifesturl: Long): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_AppCacheGetManifestUrl(happcache, ppwszmanifesturl).toUInt()

public actual fun AppCacheLookup(pwszurl: PCWSTR, dwflags: UInt, phappcache: Long): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_AppCacheLookup(pwszurl, dwflags.toInt(), phappcache).toUInt()

public actual fun CommitUrlCacheEntryA(lpszurlname: PCSTR, lpszlocalfilename: PCSTR, expiretime: FILETIME, lastmodifiedtime: FILETIME, cacheentrytype: UInt, lpheaderinfo: Long, cchheaderinfo: UInt, lpszfileextension: PCSTR, lpszoriginalurl: PCSTR): BOOL =
    0

public actual fun CommitUrlCacheEntryBinaryBlob(pwszurlname: PCWSTR, dwtype: UInt, ftexpiretime: FILETIME, ftmodifiedtime: FILETIME, pbblob: Long, cbblob: UInt): UInt =
    0u

public actual fun CommitUrlCacheEntryW(lpszurlname: PCWSTR, lpszlocalfilename: PCWSTR, expiretime: FILETIME, lastmodifiedtime: FILETIME, cacheentrytype: UInt, lpszheaderinfo: PCWSTR, cchheaderinfo: UInt, lpszfileextension: PCWSTR, lpszoriginalurl: PCWSTR): BOOL =
    0

public actual fun CreateMD5SSOHash(pszchallengeinfo: PCWSTR, pwszrealm: PCWSTR, pwsztarget: PCWSTR, pbhexhash: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_CreateMD5SSOHash(pszchallengeinfo, pwszrealm, pwsztarget, pbhexhash)

public actual fun CreateUrlCacheContainerA(name: PCSTR, lpcacheprefix: PCSTR, lpszcachepath: PCSTR, kbcachelimit: UInt, dwcontainertype: UInt, dwoptions: UInt, pvbuffer: Long, cbbuffer: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_CreateUrlCacheContainerA(name, lpcacheprefix, lpszcachepath, kbcachelimit.toInt(), dwcontainertype.toInt(), dwoptions.toInt(), pvbuffer, cbbuffer)

public actual fun CreateUrlCacheContainerW(name: PCWSTR, lpcacheprefix: PCWSTR, lpszcachepath: PCWSTR, kbcachelimit: UInt, dwcontainertype: UInt, dwoptions: UInt, pvbuffer: Long, cbbuffer: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_CreateUrlCacheContainerW(name, lpcacheprefix, lpszcachepath, kbcachelimit.toInt(), dwcontainertype.toInt(), dwoptions.toInt(), pvbuffer, cbbuffer)

public actual fun CreateUrlCacheEntryA(lpszurlname: PCSTR, dwexpectedfilesize: UInt, lpszfileextension: PCSTR, lpszfilename: PSTR, dwreserved: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_CreateUrlCacheEntryA(lpszurlname, dwexpectedfilesize.toInt(), lpszfileextension, lpszfilename, dwreserved.toInt())

public actual fun CreateUrlCacheEntryExW(lpszurlname: PCWSTR, dwexpectedfilesize: UInt, lpszfileextension: PCWSTR, lpszfilename: PWSTR, dwreserved: UInt, fpreserveincomingfilename: BOOL): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_CreateUrlCacheEntryExW(lpszurlname, dwexpectedfilesize.toInt(), lpszfileextension, lpszfilename, dwreserved.toInt(), fpreserveincomingfilename)

public actual fun CreateUrlCacheEntryW(lpszurlname: PCWSTR, dwexpectedfilesize: UInt, lpszfileextension: PCWSTR, lpszfilename: PWSTR, dwreserved: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_CreateUrlCacheEntryW(lpszurlname, dwexpectedfilesize.toInt(), lpszfileextension, lpszfilename, dwreserved.toInt())

public actual fun CreateUrlCacheGroup(dwflags: UInt, lpreserved: Long): Long =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_CreateUrlCacheGroup(dwflags.toInt(), lpreserved)

public actual fun DeleteIE3Cache(hwnd: HWND, hinst: HINSTANCE, lpszcmd: PCSTR, ncmdshow: Int): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_DeleteIE3Cache(hwnd, hinst, lpszcmd, ncmdshow).toUInt()

public actual fun DeleteUrlCacheContainerA(name: PCSTR, dwoptions: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_DeleteUrlCacheContainerA(name, dwoptions.toInt())

public actual fun DeleteUrlCacheContainerW(name: PCWSTR, dwoptions: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_DeleteUrlCacheContainerW(name, dwoptions.toInt())

public actual fun DeleteUrlCacheEntry(lpszurlname: PCSTR): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_DeleteUrlCacheEntry(lpszurlname)

public actual fun DeleteUrlCacheEntryA(lpszurlname: PCSTR): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_DeleteUrlCacheEntryA(lpszurlname)

public actual fun DeleteUrlCacheEntryW(lpszurlname: PCWSTR): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_DeleteUrlCacheEntryW(lpszurlname)

public actual fun DeleteUrlCacheGroup(groupid: Long, dwflags: UInt, lpreserved: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_DeleteUrlCacheGroup(groupid, dwflags.toInt(), lpreserved)

public actual fun DeleteWpadCacheForNetworks(param0: WPAD_CACHE_DELETE): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_DeleteWpadCacheForNetworks(param0)

public actual fun DetectAutoProxyUrl(pszautoproxyurl: PSTR, cchautoproxyurl: UInt, dwdetectflags: PROXY_AUTO_DETECT_TYPE): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_DetectAutoProxyUrl(pszautoproxyurl, cchautoproxyurl.toInt(), dwdetectflags.toInt())

public actual fun DoConnectoidsExist(): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_DoConnectoidsExist()

public actual fun ExportCookieFileA(szfilename: PCSTR, fappend: BOOL): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_ExportCookieFileA(szfilename, fappend)

public actual fun ExportCookieFileW(szfilename: PCWSTR, fappend: BOOL): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_ExportCookieFileW(szfilename, fappend)

public actual fun FindCloseUrlCache(henumhandle: HANDLE): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FindCloseUrlCache(henumhandle)

public actual fun FindFirstUrlCacheContainerA(pdwmodified: Long, lpcontainerinfo: Long, lpcbcontainerinfo: Long, dwoptions: UInt): HANDLE =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FindFirstUrlCacheContainerA(pdwmodified, lpcontainerinfo, lpcbcontainerinfo, dwoptions.toInt())

public actual fun FindFirstUrlCacheContainerW(pdwmodified: Long, lpcontainerinfo: Long, lpcbcontainerinfo: Long, dwoptions: UInt): HANDLE =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FindFirstUrlCacheContainerW(pdwmodified, lpcontainerinfo, lpcbcontainerinfo, dwoptions.toInt())

public actual fun FindFirstUrlCacheEntryA(lpszurlsearchpattern: PCSTR, lpfirstcacheentryinfo: Long, lpcbcacheentryinfo: Long): HANDLE =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FindFirstUrlCacheEntryA(lpszurlsearchpattern, lpfirstcacheentryinfo, lpcbcacheentryinfo)

public actual fun FindFirstUrlCacheEntryExA(lpszurlsearchpattern: PCSTR, dwflags: UInt, dwfilter: UInt, groupid: Long, lpfirstcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpgroupattributes: Long, lpcbgroupattributes: Long, lpreserved: Long): HANDLE =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FindFirstUrlCacheEntryExA(lpszurlsearchpattern, dwflags.toInt(), dwfilter.toInt(), groupid, lpfirstcacheentryinfo, lpcbcacheentryinfo, lpgroupattributes, lpcbgroupattributes, lpreserved)

public actual fun FindFirstUrlCacheEntryExW(lpszurlsearchpattern: PCWSTR, dwflags: UInt, dwfilter: UInt, groupid: Long, lpfirstcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpgroupattributes: Long, lpcbgroupattributes: Long, lpreserved: Long): HANDLE =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FindFirstUrlCacheEntryExW(lpszurlsearchpattern, dwflags.toInt(), dwfilter.toInt(), groupid, lpfirstcacheentryinfo, lpcbcacheentryinfo, lpgroupattributes, lpcbgroupattributes, lpreserved)

public actual fun FindFirstUrlCacheEntryW(lpszurlsearchpattern: PCWSTR, lpfirstcacheentryinfo: Long, lpcbcacheentryinfo: Long): HANDLE =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FindFirstUrlCacheEntryW(lpszurlsearchpattern, lpfirstcacheentryinfo, lpcbcacheentryinfo)

public actual fun FindFirstUrlCacheGroup(dwflags: UInt, dwfilter: UInt, lpsearchcondition: Long, dwsearchcondition: UInt, lpgroupid: Long, lpreserved: Long): HANDLE =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FindFirstUrlCacheGroup(dwflags.toInt(), dwfilter.toInt(), lpsearchcondition, dwsearchcondition.toInt(), lpgroupid, lpreserved)

public actual fun FindNextUrlCacheContainerA(henumhandle: HANDLE, lpcontainerinfo: Long, lpcbcontainerinfo: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FindNextUrlCacheContainerA(henumhandle, lpcontainerinfo, lpcbcontainerinfo)

public actual fun FindNextUrlCacheContainerW(henumhandle: HANDLE, lpcontainerinfo: Long, lpcbcontainerinfo: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FindNextUrlCacheContainerW(henumhandle, lpcontainerinfo, lpcbcontainerinfo)

public actual fun FindNextUrlCacheEntryA(henumhandle: HANDLE, lpnextcacheentryinfo: Long, lpcbcacheentryinfo: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FindNextUrlCacheEntryA(henumhandle, lpnextcacheentryinfo, lpcbcacheentryinfo)

public actual fun FindNextUrlCacheEntryExA(henumhandle: HANDLE, lpnextcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpgroupattributes: Long, lpcbgroupattributes: Long, lpreserved: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FindNextUrlCacheEntryExA(henumhandle, lpnextcacheentryinfo, lpcbcacheentryinfo, lpgroupattributes, lpcbgroupattributes, lpreserved)

public actual fun FindNextUrlCacheEntryExW(henumhandle: HANDLE, lpnextcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpgroupattributes: Long, lpcbgroupattributes: Long, lpreserved: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FindNextUrlCacheEntryExW(henumhandle, lpnextcacheentryinfo, lpcbcacheentryinfo, lpgroupattributes, lpcbgroupattributes, lpreserved)

public actual fun FindNextUrlCacheEntryW(henumhandle: HANDLE, lpnextcacheentryinfo: Long, lpcbcacheentryinfo: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FindNextUrlCacheEntryW(henumhandle, lpnextcacheentryinfo, lpcbcacheentryinfo)

public actual fun FindNextUrlCacheGroup(hfind: HANDLE, lpgroupid: Long, lpreserved: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FindNextUrlCacheGroup(hfind, lpgroupid, lpreserved)

public actual fun FindP3PPolicySymbol(pszsymbol: PCSTR): Int =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FindP3PPolicySymbol(pszsymbol)

public actual fun FreeUrlCacheSpaceA(lpszcachepath: PCSTR, dwsize: UInt, dwfilter: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FreeUrlCacheSpaceA(lpszcachepath, dwsize.toInt(), dwfilter.toInt())

public actual fun FreeUrlCacheSpaceW(lpszcachepath: PCWSTR, dwsize: UInt, dwfilter: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FreeUrlCacheSpaceW(lpszcachepath, dwsize.toInt(), dwfilter.toInt())

public actual fun FtpCommandA(hconnect: Long, fexpectresponse: BOOL, dwflags: FTP_FLAGS, lpszcommand: PCSTR, dwcontext: ULong, phftpcommand: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FtpCommandA(hconnect, fexpectresponse, dwflags.toInt(), lpszcommand, dwcontext.toLong(), phftpcommand)

public actual fun FtpCommandW(hconnect: Long, fexpectresponse: BOOL, dwflags: FTP_FLAGS, lpszcommand: PCWSTR, dwcontext: ULong, phftpcommand: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FtpCommandW(hconnect, fexpectresponse, dwflags.toInt(), lpszcommand, dwcontext.toLong(), phftpcommand)

public actual fun FtpCreateDirectoryA(hconnect: Long, lpszdirectory: PCSTR): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FtpCreateDirectoryA(hconnect, lpszdirectory)

public actual fun FtpCreateDirectoryW(hconnect: Long, lpszdirectory: PCWSTR): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FtpCreateDirectoryW(hconnect, lpszdirectory)

public actual fun FtpDeleteFileA(hconnect: Long, lpszfilename: PCSTR): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FtpDeleteFileA(hconnect, lpszfilename)

public actual fun FtpDeleteFileW(hconnect: Long, lpszfilename: PCWSTR): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FtpDeleteFileW(hconnect, lpszfilename)

public actual fun FtpFindFirstFileA(hconnect: Long, lpszsearchfile: PCSTR, lpfindfiledata: Long, dwflags: UInt, dwcontext: ULong): Long =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FtpFindFirstFileA(hconnect, lpszsearchfile, lpfindfiledata, dwflags.toInt(), dwcontext.toLong())

public actual fun FtpFindFirstFileW(hconnect: Long, lpszsearchfile: PCWSTR, lpfindfiledata: Long, dwflags: UInt, dwcontext: ULong): Long =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FtpFindFirstFileW(hconnect, lpszsearchfile, lpfindfiledata, dwflags.toInt(), dwcontext.toLong())

public actual fun FtpGetCurrentDirectoryA(hconnect: Long, lpszcurrentdirectory: PSTR, lpdwcurrentdirectory: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FtpGetCurrentDirectoryA(hconnect, lpszcurrentdirectory, lpdwcurrentdirectory)

public actual fun FtpGetCurrentDirectoryW(hconnect: Long, lpszcurrentdirectory: PWSTR, lpdwcurrentdirectory: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FtpGetCurrentDirectoryW(hconnect, lpszcurrentdirectory, lpdwcurrentdirectory)

public actual fun FtpGetFileA(hconnect: Long, lpszremotefile: PCSTR, lpsznewfile: PCSTR, ffailifexists: BOOL, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FtpGetFileA(hconnect, lpszremotefile, lpsznewfile, ffailifexists, dwflagsandattributes.toInt(), dwflags.toInt(), dwcontext.toLong())

public actual fun FtpGetFileEx(hftpsession: Long, lpszremotefile: PCSTR, lpsznewfile: PCWSTR, ffailifexists: BOOL, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FtpGetFileEx(hftpsession, lpszremotefile, lpsznewfile, ffailifexists, dwflagsandattributes.toInt(), dwflags.toInt(), dwcontext.toLong())

public actual fun FtpGetFileSize(hfile: Long, lpdwfilesizehigh: Long): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FtpGetFileSize(hfile, lpdwfilesizehigh).toUInt()

public actual fun FtpGetFileW(hconnect: Long, lpszremotefile: PCWSTR, lpsznewfile: PCWSTR, ffailifexists: BOOL, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FtpGetFileW(hconnect, lpszremotefile, lpsznewfile, ffailifexists, dwflagsandattributes.toInt(), dwflags.toInt(), dwcontext.toLong())

public actual fun FtpOpenFileA(hconnect: Long, lpszfilename: PCSTR, dwaccess: UInt, dwflags: FTP_FLAGS, dwcontext: ULong): Long =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FtpOpenFileA(hconnect, lpszfilename, dwaccess.toInt(), dwflags.toInt(), dwcontext.toLong())

public actual fun FtpOpenFileW(hconnect: Long, lpszfilename: PCWSTR, dwaccess: UInt, dwflags: FTP_FLAGS, dwcontext: ULong): Long =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FtpOpenFileW(hconnect, lpszfilename, dwaccess.toInt(), dwflags.toInt(), dwcontext.toLong())

public actual fun FtpPutFileA(hconnect: Long, lpszlocalfile: PCSTR, lpsznewremotefile: PCSTR, dwflags: FTP_FLAGS, dwcontext: ULong): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FtpPutFileA(hconnect, lpszlocalfile, lpsznewremotefile, dwflags.toInt(), dwcontext.toLong())

public actual fun FtpPutFileEx(hftpsession: Long, lpszlocalfile: PCWSTR, lpsznewremotefile: PCSTR, dwflags: UInt, dwcontext: ULong): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FtpPutFileEx(hftpsession, lpszlocalfile, lpsznewremotefile, dwflags.toInt(), dwcontext.toLong())

public actual fun FtpPutFileW(hconnect: Long, lpszlocalfile: PCWSTR, lpsznewremotefile: PCWSTR, dwflags: FTP_FLAGS, dwcontext: ULong): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FtpPutFileW(hconnect, lpszlocalfile, lpsznewremotefile, dwflags.toInt(), dwcontext.toLong())

public actual fun FtpRemoveDirectoryA(hconnect: Long, lpszdirectory: PCSTR): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FtpRemoveDirectoryA(hconnect, lpszdirectory)

public actual fun FtpRemoveDirectoryW(hconnect: Long, lpszdirectory: PCWSTR): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FtpRemoveDirectoryW(hconnect, lpszdirectory)

public actual fun FtpRenameFileA(hconnect: Long, lpszexisting: PCSTR, lpsznew: PCSTR): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FtpRenameFileA(hconnect, lpszexisting, lpsznew)

public actual fun FtpRenameFileW(hconnect: Long, lpszexisting: PCWSTR, lpsznew: PCWSTR): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FtpRenameFileW(hconnect, lpszexisting, lpsznew)

public actual fun FtpSetCurrentDirectoryA(hconnect: Long, lpszdirectory: PCSTR): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FtpSetCurrentDirectoryA(hconnect, lpszdirectory)

public actual fun FtpSetCurrentDirectoryW(hconnect: Long, lpszdirectory: PCWSTR): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_FtpSetCurrentDirectoryW(hconnect, lpszdirectory)

public actual fun GetDiskInfoA(pszpath: PCSTR, pdwclustersize: Long, pdlavail: Long, pdltotal: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_GetDiskInfoA(pszpath, pdwclustersize, pdlavail, pdltotal)

public actual fun GetUrlCacheConfigInfoA(lpcacheconfiginfo: Long, lpcbcacheconfiginfo: Long, dwfieldcontrol: CACHE_CONFIG): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_GetUrlCacheConfigInfoA(lpcacheconfiginfo, lpcbcacheconfiginfo, dwfieldcontrol.toInt())

public actual fun GetUrlCacheConfigInfoW(lpcacheconfiginfo: Long, lpcbcacheconfiginfo: Long, dwfieldcontrol: CACHE_CONFIG): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_GetUrlCacheConfigInfoW(lpcacheconfiginfo, lpcbcacheconfiginfo, dwfieldcontrol.toInt())

public actual fun GetUrlCacheEntryBinaryBlob(pwszurlname: PCWSTR, dwtype: Long, pftexpiretime: Long, pftaccesstime: Long, pftmodifiedtime: Long, ppbblob: Long, pcbblob: Long): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_GetUrlCacheEntryBinaryBlob(pwszurlname, dwtype, pftexpiretime, pftaccesstime, pftmodifiedtime, ppbblob, pcbblob).toUInt()

public actual fun GetUrlCacheEntryInfoA(lpszurlname: PCSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_GetUrlCacheEntryInfoA(lpszurlname, lpcacheentryinfo, lpcbcacheentryinfo)

public actual fun GetUrlCacheEntryInfoExA(lpszurl: PCSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpszredirecturl: PCSTR, lpcbredirecturl: Long, lpreserved: Long, dwflags: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_GetUrlCacheEntryInfoExA(lpszurl, lpcacheentryinfo, lpcbcacheentryinfo, lpszredirecturl, lpcbredirecturl, lpreserved, dwflags.toInt())

public actual fun GetUrlCacheEntryInfoExW(lpszurl: PCWSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpszredirecturl: PCWSTR, lpcbredirecturl: Long, lpreserved: Long, dwflags: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_GetUrlCacheEntryInfoExW(lpszurl, lpcacheentryinfo, lpcbcacheentryinfo, lpszredirecturl, lpcbredirecturl, lpreserved, dwflags.toInt())

public actual fun GetUrlCacheEntryInfoW(lpszurlname: PCWSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_GetUrlCacheEntryInfoW(lpszurlname, lpcacheentryinfo, lpcbcacheentryinfo)

public actual fun GetUrlCacheGroupAttributeA(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: Long, lpcbgroupinfo: Long, lpreserved: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_GetUrlCacheGroupAttributeA(gid, dwflags.toInt(), dwattributes.toInt(), lpgroupinfo, lpcbgroupinfo, lpreserved)

public actual fun GetUrlCacheGroupAttributeW(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: Long, lpcbgroupinfo: Long, lpreserved: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_GetUrlCacheGroupAttributeW(gid, dwflags.toInt(), dwattributes.toInt(), lpgroupinfo, lpcbgroupinfo, lpreserved)

public actual fun GetUrlCacheHeaderData(nidx: UInt, lpdwdata: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_GetUrlCacheHeaderData(nidx.toInt(), lpdwdata)

public actual fun GopherCreateLocatorA(lpszhost: PCSTR, nserverport: UShort, lpszdisplaystring: PCSTR, lpszselectorstring: PCSTR, dwgophertype: UInt, lpszlocator: PSTR, lpdwbufferlength: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_GopherCreateLocatorA(lpszhost, nserverport.toShort(), lpszdisplaystring, lpszselectorstring, dwgophertype.toInt(), lpszlocator, lpdwbufferlength)

public actual fun GopherCreateLocatorW(lpszhost: PCWSTR, nserverport: UShort, lpszdisplaystring: PCWSTR, lpszselectorstring: PCWSTR, dwgophertype: UInt, lpszlocator: PWSTR, lpdwbufferlength: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_GopherCreateLocatorW(lpszhost, nserverport.toShort(), lpszdisplaystring, lpszselectorstring, dwgophertype.toInt(), lpszlocator, lpdwbufferlength)

public actual fun GopherFindFirstFileA(hconnect: Long, lpszlocator: PCSTR, lpszsearchstring: PCSTR, lpfinddata: Long, dwflags: UInt, dwcontext: ULong): Long =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_GopherFindFirstFileA(hconnect, lpszlocator, lpszsearchstring, lpfinddata, dwflags.toInt(), dwcontext.toLong())

public actual fun GopherFindFirstFileW(hconnect: Long, lpszlocator: PCWSTR, lpszsearchstring: PCWSTR, lpfinddata: Long, dwflags: UInt, dwcontext: ULong): Long =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_GopherFindFirstFileW(hconnect, lpszlocator, lpszsearchstring, lpfinddata, dwflags.toInt(), dwcontext.toLong())

public actual fun GopherGetAttributeA(hconnect: Long, lpszlocator: PCSTR, lpszattributename: PCSTR, lpbuffer: Long, dwbufferlength: UInt, lpdwcharactersreturned: Long, lpfnenumerator: GOPHER_ATTRIBUTE_ENUMERATOR, dwcontext: ULong): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_GopherGetAttributeA(hconnect, lpszlocator, lpszattributename, lpbuffer, dwbufferlength.toInt(), lpdwcharactersreturned, lpfnenumerator.toLong(), dwcontext.toLong())

public actual fun GopherGetAttributeW(hconnect: Long, lpszlocator: PCWSTR, lpszattributename: PCWSTR, lpbuffer: Long, dwbufferlength: UInt, lpdwcharactersreturned: Long, lpfnenumerator: GOPHER_ATTRIBUTE_ENUMERATOR, dwcontext: ULong): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_GopherGetAttributeW(hconnect, lpszlocator, lpszattributename, lpbuffer, dwbufferlength.toInt(), lpdwcharactersreturned, lpfnenumerator.toLong(), dwcontext.toLong())

public actual fun GopherGetLocatorTypeA(lpszlocator: PCSTR, lpdwgophertype: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_GopherGetLocatorTypeA(lpszlocator, lpdwgophertype)

public actual fun GopherGetLocatorTypeW(lpszlocator: PCWSTR, lpdwgophertype: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_GopherGetLocatorTypeW(lpszlocator, lpdwgophertype)

public actual fun GopherOpenFileA(hconnect: Long, lpszlocator: PCSTR, lpszview: PCSTR, dwflags: UInt, dwcontext: ULong): Long =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_GopherOpenFileA(hconnect, lpszlocator, lpszview, dwflags.toInt(), dwcontext.toLong())

public actual fun GopherOpenFileW(hconnect: Long, lpszlocator: PCWSTR, lpszview: PCWSTR, dwflags: UInt, dwcontext: ULong): Long =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_GopherOpenFileW(hconnect, lpszlocator, lpszview, dwflags.toInt(), dwcontext.toLong())

public actual fun HttpAddRequestHeadersA(hrequest: Long, lpszheaders: PCSTR, dwheaderslength: UInt, dwmodifiers: HTTP_ADDREQ_FLAG): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_HttpAddRequestHeadersA(hrequest, lpszheaders, dwheaderslength.toInt(), dwmodifiers.toInt())

public actual fun HttpAddRequestHeadersW(hrequest: Long, lpszheaders: PCWSTR, dwheaderslength: UInt, dwmodifiers: HTTP_ADDREQ_FLAG): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_HttpAddRequestHeadersW(hrequest, lpszheaders, dwheaderslength.toInt(), dwmodifiers.toInt())

public actual fun HttpCheckDavComplianceA(lpszurl: PCSTR, lpszcompliancetoken: PCSTR, lpffound: Long, hwnd: HWND, lpvreserved: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_HttpCheckDavComplianceA(lpszurl, lpszcompliancetoken, lpffound, hwnd, lpvreserved)

public actual fun HttpCheckDavComplianceW(lpszurl: PCWSTR, lpszcompliancetoken: PCWSTR, lpffound: Long, hwnd: HWND, lpvreserved: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_HttpCheckDavComplianceW(lpszurl, lpszcompliancetoken, lpffound, hwnd, lpvreserved)

public actual fun HttpCloseDependencyHandle(hdependencyhandle: Long) {
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_HttpCloseDependencyHandle(hdependencyhandle)
}

public actual fun HttpDuplicateDependencyHandle(hdependencyhandle: Long, phduplicateddependencyhandle: Long): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_HttpDuplicateDependencyHandle(hdependencyhandle, phduplicateddependencyhandle).toUInt()

public actual fun HttpEndRequestA(hrequest: Long, lpbuffersout: Long, dwflags: UInt, dwcontext: ULong): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_HttpEndRequestA(hrequest, lpbuffersout, dwflags.toInt(), dwcontext.toLong())

public actual fun HttpEndRequestW(hrequest: Long, lpbuffersout: Long, dwflags: UInt, dwcontext: ULong): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_HttpEndRequestW(hrequest, lpbuffersout, dwflags.toInt(), dwcontext.toLong())

public actual fun HttpGetServerCredentials(pwszurl: PCWSTR, ppwszusername: Long, ppwszpassword: Long): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_HttpGetServerCredentials(pwszurl, ppwszusername, ppwszpassword).toUInt()

public actual fun HttpIndicatePageLoadComplete(hdependencyhandle: Long): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_HttpIndicatePageLoadComplete(hdependencyhandle).toUInt()

public actual fun HttpIsHostHstsEnabled(pcwszurl: PCWSTR, pfishsts: Long): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_HttpIsHostHstsEnabled(pcwszurl, pfishsts).toUInt()

public actual fun HttpOpenDependencyHandle(hrequesthandle: Long, fbackground: BOOL, phdependencyhandle: Long): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_HttpOpenDependencyHandle(hrequesthandle, fbackground, phdependencyhandle).toUInt()

public actual fun HttpOpenRequestA(hconnect: Long, lpszverb: PCSTR, lpszobjectname: PCSTR, lpszversion: PCSTR, lpszreferrer: PCSTR, lplpszaccepttypes: Long, dwflags: UInt, dwcontext: ULong): Long =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_HttpOpenRequestA(hconnect, lpszverb, lpszobjectname, lpszversion, lpszreferrer, lplpszaccepttypes, dwflags.toInt(), dwcontext.toLong())

public actual fun HttpOpenRequestW(hconnect: Long, lpszverb: PCWSTR, lpszobjectname: PCWSTR, lpszversion: PCWSTR, lpszreferrer: PCWSTR, lplpszaccepttypes: Long, dwflags: UInt, dwcontext: ULong): Long =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_HttpOpenRequestW(hconnect, lpszverb, lpszobjectname, lpszversion, lpszreferrer, lplpszaccepttypes, dwflags.toInt(), dwcontext.toLong())

public actual fun HttpPushClose(hwait: HTTP_PUSH_WAIT_HANDLE) {
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_HttpPushClose(hwait)
}

public actual fun HttpPushEnable(hrequest: Long, ptransportsetting: Long, phwait: Long): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_HttpPushEnable(hrequest, ptransportsetting, phwait).toUInt()

public actual fun HttpPushWait(hwait: HTTP_PUSH_WAIT_HANDLE, etype: HTTP_PUSH_WAIT_TYPE, pnotificationstatus: Long): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_HttpPushWait(hwait, etype, pnotificationstatus).toUInt()

public actual fun HttpQueryInfoA(hrequest: Long, dwinfolevel: UInt, lpbuffer: Long, lpdwbufferlength: Long, lpdwindex: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_HttpQueryInfoA(hrequest, dwinfolevel.toInt(), lpbuffer, lpdwbufferlength, lpdwindex)

public actual fun HttpQueryInfoW(hrequest: Long, dwinfolevel: UInt, lpbuffer: Long, lpdwbufferlength: Long, lpdwindex: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_HttpQueryInfoW(hrequest, dwinfolevel.toInt(), lpbuffer, lpdwbufferlength, lpdwindex)

public actual fun HttpSendRequestA(hrequest: Long, lpszheaders: PCSTR, dwheaderslength: UInt, lpoptional: Long, dwoptionallength: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_HttpSendRequestA(hrequest, lpszheaders, dwheaderslength.toInt(), lpoptional, dwoptionallength.toInt())

public actual fun HttpSendRequestExA(hrequest: Long, lpbuffersin: Long, lpbuffersout: Long, dwflags: UInt, dwcontext: ULong): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_HttpSendRequestExA(hrequest, lpbuffersin, lpbuffersout, dwflags.toInt(), dwcontext.toLong())

public actual fun HttpSendRequestExW(hrequest: Long, lpbuffersin: Long, lpbuffersout: Long, dwflags: UInt, dwcontext: ULong): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_HttpSendRequestExW(hrequest, lpbuffersin, lpbuffersout, dwflags.toInt(), dwcontext.toLong())

public actual fun HttpSendRequestW(hrequest: Long, lpszheaders: PCWSTR, dwheaderslength: UInt, lpoptional: Long, dwoptionallength: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_HttpSendRequestW(hrequest, lpszheaders, dwheaderslength.toInt(), lpoptional, dwoptionallength.toInt())

public actual fun HttpWebSocketClose(hwebsocket: Long, usstatus: UShort, pvreason: Long, dwreasonlength: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_HttpWebSocketClose(hwebsocket, usstatus.toShort(), pvreason, dwreasonlength.toInt())

public actual fun HttpWebSocketCompleteUpgrade(hrequest: Long, dwcontext: ULong): Long =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_HttpWebSocketCompleteUpgrade(hrequest, dwcontext.toLong())

public actual fun HttpWebSocketQueryCloseStatus(hwebsocket: Long, pusstatus: Long, pvreason: Long, dwreasonlength: UInt, pdwreasonlengthconsumed: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_HttpWebSocketQueryCloseStatus(hwebsocket, pusstatus, pvreason, dwreasonlength.toInt(), pdwreasonlengthconsumed)

public actual fun HttpWebSocketReceive(hwebsocket: Long, pvbuffer: Long, dwbufferlength: UInt, pdwbytesread: Long, pbuffertype: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_HttpWebSocketReceive(hwebsocket, pvbuffer, dwbufferlength.toInt(), pdwbytesread, pbuffertype)

public actual fun HttpWebSocketSend(hwebsocket: Long, buffertype: HTTP_WEB_SOCKET_BUFFER_TYPE, pvbuffer: Long, dwbufferlength: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_HttpWebSocketSend(hwebsocket, buffertype, pvbuffer, dwbufferlength.toInt())

public actual fun HttpWebSocketShutdown(hwebsocket: Long, usstatus: UShort, pvreason: Long, dwreasonlength: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_HttpWebSocketShutdown(hwebsocket, usstatus.toShort(), pvreason, dwreasonlength.toInt())

public actual fun ImportCookieFileA(szfilename: PCSTR): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_ImportCookieFileA(szfilename)

public actual fun ImportCookieFileW(szfilename: PCWSTR): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_ImportCookieFileW(szfilename)

public actual fun IncrementUrlCacheHeaderData(nidx: UInt, lpdwdata: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_IncrementUrlCacheHeaderData(nidx.toInt(), lpdwdata)

public actual fun InternalInternetGetCookie(lpszurl: PCSTR, lpszcookiedata: PSTR, lpdwdatasize: Long): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternalInternetGetCookie(lpszurl, lpszcookiedata, lpdwdatasize).toUInt()

public actual fun InternetAlgIdToStringA(ai: ALG_ID, lpstr: PSTR, lpdwstrlength: Long, dwreserved: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetAlgIdToStringA(ai.toInt(), lpstr, lpdwstrlength, dwreserved.toInt())

public actual fun InternetAlgIdToStringW(ai: ALG_ID, lpstr: PWSTR, lpdwstrlength: Long, dwreserved: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetAlgIdToStringW(ai.toInt(), lpstr, lpdwstrlength, dwreserved.toInt())

public actual fun InternetAttemptConnect(dwreserved: UInt): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetAttemptConnect(dwreserved.toInt()).toUInt()

public actual fun InternetAutodial(dwflags: INTERNET_AUTODIAL, hwndparent: HWND): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetAutodial(dwflags.toInt(), hwndparent)

public actual fun InternetAutodialHangup(dwreserved: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetAutodialHangup(dwreserved.toInt())

public actual fun InternetCanonicalizeUrlA(lpszurl: PCSTR, lpszbuffer: PSTR, lpdwbufferlength: Long, dwflags: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetCanonicalizeUrlA(lpszurl, lpszbuffer, lpdwbufferlength, dwflags.toInt())

public actual fun InternetCanonicalizeUrlW(lpszurl: PCWSTR, lpszbuffer: PWSTR, lpdwbufferlength: Long, dwflags: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetCanonicalizeUrlW(lpszurl, lpszbuffer, lpdwbufferlength, dwflags.toInt())

public actual fun InternetCheckConnectionA(lpszurl: PCSTR, dwflags: UInt, dwreserved: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetCheckConnectionA(lpszurl, dwflags.toInt(), dwreserved.toInt())

public actual fun InternetCheckConnectionW(lpszurl: PCWSTR, dwflags: UInt, dwreserved: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetCheckConnectionW(lpszurl, dwflags.toInt(), dwreserved.toInt())

public actual fun InternetClearAllPerSiteCookieDecisions(): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetClearAllPerSiteCookieDecisions()

public actual fun InternetCloseHandle(hinternet: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetCloseHandle(hinternet)

public actual fun InternetCombineUrlA(lpszbaseurl: PCSTR, lpszrelativeurl: PCSTR, lpszbuffer: PSTR, lpdwbufferlength: Long, dwflags: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetCombineUrlA(lpszbaseurl, lpszrelativeurl, lpszbuffer, lpdwbufferlength, dwflags.toInt())

public actual fun InternetCombineUrlW(lpszbaseurl: PCWSTR, lpszrelativeurl: PCWSTR, lpszbuffer: PWSTR, lpdwbufferlength: Long, dwflags: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetCombineUrlW(lpszbaseurl, lpszrelativeurl, lpszbuffer, lpdwbufferlength, dwflags.toInt())

public actual fun InternetConfirmZoneCrossing(hwnd: HWND, szurlprev: PCSTR, szurlnew: PCSTR, bpost: BOOL): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetConfirmZoneCrossing(hwnd, szurlprev, szurlnew, bpost).toUInt()

public actual fun InternetConfirmZoneCrossingA(hwnd: HWND, szurlprev: PCSTR, szurlnew: PCSTR, bpost: BOOL): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetConfirmZoneCrossingA(hwnd, szurlprev, szurlnew, bpost).toUInt()

public actual fun InternetConfirmZoneCrossingW(hwnd: HWND, szurlprev: PCWSTR, szurlnew: PCWSTR, bpost: BOOL): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetConfirmZoneCrossingW(hwnd, szurlprev, szurlnew, bpost).toUInt()

public actual fun InternetConnectA(hinternet: Long, lpszservername: PCSTR, nserverport: UShort, lpszusername: PCSTR, lpszpassword: PCSTR, dwservice: UInt, dwflags: UInt, dwcontext: ULong): Long =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetConnectA(hinternet, lpszservername, nserverport.toShort(), lpszusername, lpszpassword, dwservice.toInt(), dwflags.toInt(), dwcontext.toLong())

public actual fun InternetConnectW(hinternet: Long, lpszservername: PCWSTR, nserverport: UShort, lpszusername: PCWSTR, lpszpassword: PCWSTR, dwservice: UInt, dwflags: UInt, dwcontext: ULong): Long =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetConnectW(hinternet, lpszservername, nserverport.toShort(), lpszusername, lpszpassword, dwservice.toInt(), dwflags.toInt(), dwcontext.toLong())

public actual fun InternetConvertUrlFromWireToWideChar(pcszurl: PCSTR, cchurl: UInt, pcwszbaseurl: PCWSTR, dwcodepagehost: UInt, dwcodepagepath: UInt, fencodepathextra: BOOL, dwcodepageextra: UInt, ppwszconvertedurl: Long): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetConvertUrlFromWireToWideChar(pcszurl, cchurl.toInt(), pcwszbaseurl, dwcodepagehost.toInt(), dwcodepagepath.toInt(), fencodepathextra, dwcodepageextra.toInt(), ppwszconvertedurl).toUInt()

public actual fun InternetCrackUrlA(lpszurl: PCSTR, dwurllength: UInt, dwflags: WIN_HTTP_CREATE_URL_FLAGS, lpurlcomponents: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetCrackUrlA(lpszurl, dwurllength.toInt(), dwflags.toInt(), lpurlcomponents)

public actual fun InternetCrackUrlW(lpszurl: PCWSTR, dwurllength: UInt, dwflags: WIN_HTTP_CREATE_URL_FLAGS, lpurlcomponents: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetCrackUrlW(lpszurl, dwurllength.toInt(), dwflags.toInt(), lpurlcomponents)

public actual fun InternetCreateUrlA(lpurlcomponents: Long, dwflags: UInt, lpszurl: PSTR, lpdwurllength: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetCreateUrlA(lpurlcomponents, dwflags.toInt(), lpszurl, lpdwurllength)

public actual fun InternetCreateUrlW(lpurlcomponents: Long, dwflags: UInt, lpszurl: PWSTR, lpdwurllength: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetCreateUrlW(lpurlcomponents, dwflags.toInt(), lpszurl, lpdwurllength)

public actual fun InternetDial(hwndparent: HWND, lpszconnectoid: PCSTR, dwflags: UInt, lpdwconnection: Long, dwreserved: UInt): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetDial(hwndparent, lpszconnectoid, dwflags.toInt(), lpdwconnection, dwreserved.toInt()).toUInt()

public actual fun InternetDialA(hwndparent: HWND, lpszconnectoid: PCSTR, dwflags: UInt, lpdwconnection: Long, dwreserved: UInt): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetDialA(hwndparent, lpszconnectoid, dwflags.toInt(), lpdwconnection, dwreserved.toInt()).toUInt()

public actual fun InternetDialW(hwndparent: HWND, lpszconnectoid: PCWSTR, dwflags: UInt, lpdwconnection: Long, dwreserved: UInt): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetDialW(hwndparent, lpszconnectoid, dwflags.toInt(), lpdwconnection, dwreserved.toInt()).toUInt()

public actual fun InternetEnumPerSiteCookieDecisionA(pszsitename: PSTR, pcsitenamesize: Long, pdwdecision: Long, dwindex: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetEnumPerSiteCookieDecisionA(pszsitename, pcsitenamesize, pdwdecision, dwindex.toInt())

public actual fun InternetEnumPerSiteCookieDecisionW(pszsitename: PWSTR, pcsitenamesize: Long, pdwdecision: Long, dwindex: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetEnumPerSiteCookieDecisionW(pszsitename, pcsitenamesize, pdwdecision, dwindex.toInt())

public actual fun InternetErrorDlg(hwnd: HWND, hrequest: Long, dwerror: UInt, dwflags: UInt, lppvdata: Long): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetErrorDlg(hwnd, hrequest, dwerror.toInt(), dwflags.toInt(), lppvdata).toUInt()

public actual fun InternetFindNextFileA(hfind: Long, lpvfinddata: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetFindNextFileA(hfind, lpvfinddata)

public actual fun InternetFindNextFileW(hfind: Long, lpvfinddata: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetFindNextFileW(hfind, lpvfinddata)

public actual fun InternetFortezzaCommand(dwcommand: UInt, hwnd: HWND, dwreserved: ULong): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetFortezzaCommand(dwcommand.toInt(), hwnd, dwreserved.toLong())

public actual fun InternetFreeCookies(pcookies: Long, dwcookiecount: UInt) {
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetFreeCookies(pcookies, dwcookiecount.toInt())
}

public actual fun InternetFreeProxyInfoList(pproxyinfolist: Long) {
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetFreeProxyInfoList(pproxyinfolist)
}

public actual fun InternetGetConnectedState(lpdwflags: Long, dwreserved: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetGetConnectedState(lpdwflags, dwreserved.toInt())

public actual fun InternetGetConnectedStateEx(lpdwflags: Long, lpszconnectionname: PSTR, dwnamelen: UInt, dwreserved: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetGetConnectedStateEx(lpdwflags, lpszconnectionname, dwnamelen.toInt(), dwreserved.toInt())

public actual fun InternetGetConnectedStateExA(lpdwflags: Long, lpszconnectionname: PSTR, cchnamelen: UInt, dwreserved: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetGetConnectedStateExA(lpdwflags, lpszconnectionname, cchnamelen.toInt(), dwreserved.toInt())

public actual fun InternetGetConnectedStateExW(lpdwflags: Long, lpszconnectionname: PWSTR, cchnamelen: UInt, dwreserved: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetGetConnectedStateExW(lpdwflags, lpszconnectionname, cchnamelen.toInt(), dwreserved.toInt())

public actual fun InternetGetCookieA(lpszurl: PCSTR, lpszcookiename: PCSTR, lpszcookiedata: PSTR, lpdwsize: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetGetCookieA(lpszurl, lpszcookiename, lpszcookiedata, lpdwsize)

public actual fun InternetGetCookieEx2(pcwszurl: PCWSTR, pcwszcookiename: PCWSTR, dwflags: UInt, ppcookies: Long, pdwcookiecount: Long): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetGetCookieEx2(pcwszurl, pcwszcookiename, dwflags.toInt(), ppcookies, pdwcookiecount).toUInt()

public actual fun InternetGetCookieExA(lpszurl: PCSTR, lpszcookiename: PCSTR, lpszcookiedata: PCSTR, lpdwsize: Long, dwflags: INTERNET_COOKIE_FLAGS, lpreserved: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetGetCookieExA(lpszurl, lpszcookiename, lpszcookiedata, lpdwsize, dwflags.toInt(), lpreserved)

public actual fun InternetGetCookieExW(lpszurl: PCWSTR, lpszcookiename: PCWSTR, lpszcookiedata: PCWSTR, lpdwsize: Long, dwflags: INTERNET_COOKIE_FLAGS, lpreserved: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetGetCookieExW(lpszurl, lpszcookiename, lpszcookiedata, lpdwsize, dwflags.toInt(), lpreserved)

public actual fun InternetGetCookieW(lpszurl: PCWSTR, lpszcookiename: PCWSTR, lpszcookiedata: PWSTR, lpdwsize: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetGetCookieW(lpszurl, lpszcookiename, lpszcookiedata, lpdwsize)

public actual fun InternetGetLastResponseInfoA(lpdwerror: Long, lpszbuffer: PSTR, lpdwbufferlength: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetGetLastResponseInfoA(lpdwerror, lpszbuffer, lpdwbufferlength)

public actual fun InternetGetLastResponseInfoW(lpdwerror: Long, lpszbuffer: PWSTR, lpdwbufferlength: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetGetLastResponseInfoW(lpdwerror, lpszbuffer, lpdwbufferlength)

public actual fun InternetGetPerSiteCookieDecisionA(pchhostname: PCSTR, presult: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetGetPerSiteCookieDecisionA(pchhostname, presult)

public actual fun InternetGetPerSiteCookieDecisionW(pchhostname: PCWSTR, presult: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetGetPerSiteCookieDecisionW(pchhostname, presult)

public actual fun InternetGetProxyForUrl(hinternet: Long, pcwszurl: PCWSTR, pproxyinfolist: Long): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetGetProxyForUrl(hinternet, pcwszurl, pproxyinfolist).toUInt()

public actual fun InternetGetSecurityInfoByURL(lpszurl: PCSTR, ppcertchain: Long, pdwsecureflags: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetGetSecurityInfoByURL(lpszurl, ppcertchain, pdwsecureflags)

public actual fun InternetGetSecurityInfoByURLA(lpszurl: PCSTR, ppcertchain: Long, pdwsecureflags: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetGetSecurityInfoByURLA(lpszurl, ppcertchain, pdwsecureflags)

public actual fun InternetGetSecurityInfoByURLW(lpszurl: PCWSTR, ppcertchain: Long, pdwsecureflags: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetGetSecurityInfoByURLW(lpszurl, ppcertchain, pdwsecureflags)

public actual fun InternetGoOnline(lpszurl: PCSTR, hwndparent: HWND, dwflags: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetGoOnline(lpszurl, hwndparent, dwflags.toInt())

public actual fun InternetGoOnlineA(lpszurl: PCSTR, hwndparent: HWND, dwflags: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetGoOnlineA(lpszurl, hwndparent, dwflags.toInt())

public actual fun InternetGoOnlineW(lpszurl: PCWSTR, hwndparent: HWND, dwflags: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetGoOnlineW(lpszurl, hwndparent, dwflags.toInt())

public actual fun InternetHangUp(dwconnection: ULong, dwreserved: UInt): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetHangUp(dwconnection.toLong(), dwreserved.toInt()).toUInt()

public actual fun InternetInitializeAutoProxyDll(dwreserved: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetInitializeAutoProxyDll(dwreserved.toInt())

public actual fun InternetLockRequestFile(hinternet: Long, lphlockrequestinfo: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetLockRequestFile(hinternet, lphlockrequestinfo)

public actual fun InternetOpenA(lpszagent: PCSTR, dwaccesstype: UInt, lpszproxy: PCSTR, lpszproxybypass: PCSTR, dwflags: UInt): Long =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetOpenA(lpszagent, dwaccesstype.toInt(), lpszproxy, lpszproxybypass, dwflags.toInt())

public actual fun InternetOpenUrlA(hinternet: Long, lpszurl: PCSTR, lpszheaders: PCSTR, dwheaderslength: UInt, dwflags: UInt, dwcontext: ULong): Long =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetOpenUrlA(hinternet, lpszurl, lpszheaders, dwheaderslength.toInt(), dwflags.toInt(), dwcontext.toLong())

public actual fun InternetOpenUrlW(hinternet: Long, lpszurl: PCWSTR, lpszheaders: PCWSTR, dwheaderslength: UInt, dwflags: UInt, dwcontext: ULong): Long =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetOpenUrlW(hinternet, lpszurl, lpszheaders, dwheaderslength.toInt(), dwflags.toInt(), dwcontext.toLong())

public actual fun InternetOpenW(lpszagent: PCWSTR, dwaccesstype: UInt, lpszproxy: PCWSTR, lpszproxybypass: PCWSTR, dwflags: UInt): Long =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetOpenW(lpszagent, dwaccesstype.toInt(), lpszproxy, lpszproxybypass, dwflags.toInt())

public actual fun InternetQueryDataAvailable(hfile: Long, lpdwnumberofbytesavailable: Long, dwflags: UInt, dwcontext: ULong): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetQueryDataAvailable(hfile, lpdwnumberofbytesavailable, dwflags.toInt(), dwcontext.toLong())

public actual fun InternetQueryFortezzaStatus(pdwstatus: Long, dwreserved: ULong): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetQueryFortezzaStatus(pdwstatus, dwreserved.toLong())

public actual fun InternetQueryOptionA(hinternet: Long, dwoption: UInt, lpbuffer: Long, lpdwbufferlength: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetQueryOptionA(hinternet, dwoption.toInt(), lpbuffer, lpdwbufferlength)

public actual fun InternetQueryOptionW(hinternet: Long, dwoption: UInt, lpbuffer: Long, lpdwbufferlength: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetQueryOptionW(hinternet, dwoption.toInt(), lpbuffer, lpdwbufferlength)

public actual fun InternetReadFile(hfile: Long, lpbuffer: Long, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetReadFile(hfile, lpbuffer, dwnumberofbytestoread.toInt(), lpdwnumberofbytesread)

public actual fun InternetReadFileExA(hfile: Long, lpbuffersout: Long, dwflags: UInt, dwcontext: ULong): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetReadFileExA(hfile, lpbuffersout, dwflags.toInt(), dwcontext.toLong())

public actual fun InternetReadFileExW(hfile: Long, lpbuffersout: Long, dwflags: UInt, dwcontext: ULong): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetReadFileExW(hfile, lpbuffersout, dwflags.toInt(), dwcontext.toLong())

public actual fun InternetSecurityProtocolToStringA(dwprotocol: UInt, lpstr: PSTR, lpdwstrlength: Long, dwreserved: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetSecurityProtocolToStringA(dwprotocol.toInt(), lpstr, lpdwstrlength, dwreserved.toInt())

public actual fun InternetSecurityProtocolToStringW(dwprotocol: UInt, lpstr: PWSTR, lpdwstrlength: Long, dwreserved: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetSecurityProtocolToStringW(dwprotocol.toInt(), lpstr, lpdwstrlength, dwreserved.toInt())

public actual fun InternetSetCookieA(lpszurl: PCSTR, lpszcookiename: PCSTR, lpszcookiedata: PCSTR): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetSetCookieA(lpszurl, lpszcookiename, lpszcookiedata)

public actual fun InternetSetCookieEx2(pcwszurl: PCWSTR, pcookie: Long, pcwszp3ppolicy: PCWSTR, dwflags: UInt, pdwcookiestate: Long): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetSetCookieEx2(pcwszurl, pcookie, pcwszp3ppolicy, dwflags.toInt(), pdwcookiestate).toUInt()

public actual fun InternetSetCookieExA(lpszurl: PCSTR, lpszcookiename: PCSTR, lpszcookiedata: PCSTR, dwflags: UInt, dwreserved: ULong): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetSetCookieExA(lpszurl, lpszcookiename, lpszcookiedata, dwflags.toInt(), dwreserved.toLong()).toUInt()

public actual fun InternetSetCookieExW(lpszurl: PCWSTR, lpszcookiename: PCWSTR, lpszcookiedata: PCWSTR, dwflags: UInt, dwreserved: ULong): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetSetCookieExW(lpszurl, lpszcookiename, lpszcookiedata, dwflags.toInt(), dwreserved.toLong()).toUInt()

public actual fun InternetSetCookieW(lpszurl: PCWSTR, lpszcookiename: PCWSTR, lpszcookiedata: PCWSTR): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetSetCookieW(lpszurl, lpszcookiename, lpszcookiedata)

public actual fun InternetSetDialState(lpszconnectoid: PCSTR, dwstate: UInt, dwreserved: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetSetDialState(lpszconnectoid, dwstate.toInt(), dwreserved.toInt())

public actual fun InternetSetDialStateA(lpszconnectoid: PCSTR, dwstate: UInt, dwreserved: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetSetDialStateA(lpszconnectoid, dwstate.toInt(), dwreserved.toInt())

public actual fun InternetSetDialStateW(lpszconnectoid: PCWSTR, dwstate: UInt, dwreserved: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetSetDialStateW(lpszconnectoid, dwstate.toInt(), dwreserved.toInt())

public actual fun InternetSetFilePointer(hfile: Long, ldistancetomove: Int, lpdistancetomovehigh: Long, dwmovemethod: UInt, dwcontext: ULong): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetSetFilePointer(hfile, ldistancetomove, lpdistancetomovehigh, dwmovemethod.toInt(), dwcontext.toLong()).toUInt()

public actual fun InternetSetOptionA(hinternet: Long, dwoption: UInt, lpbuffer: Long, dwbufferlength: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetSetOptionA(hinternet, dwoption.toInt(), lpbuffer, dwbufferlength.toInt())

public actual fun InternetSetOptionExA(hinternet: Long, dwoption: UInt, lpbuffer: Long, dwbufferlength: UInt, dwflags: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetSetOptionExA(hinternet, dwoption.toInt(), lpbuffer, dwbufferlength.toInt(), dwflags.toInt())

public actual fun InternetSetOptionExW(hinternet: Long, dwoption: UInt, lpbuffer: Long, dwbufferlength: UInt, dwflags: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetSetOptionExW(hinternet, dwoption.toInt(), lpbuffer, dwbufferlength.toInt(), dwflags.toInt())

public actual fun InternetSetOptionW(hinternet: Long, dwoption: UInt, lpbuffer: Long, dwbufferlength: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetSetOptionW(hinternet, dwoption.toInt(), lpbuffer, dwbufferlength.toInt())

public actual fun InternetSetPerSiteCookieDecisionA(pchhostname: PCSTR, dwdecision: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetSetPerSiteCookieDecisionA(pchhostname, dwdecision.toInt())

public actual fun InternetSetPerSiteCookieDecisionW(pchhostname: PCWSTR, dwdecision: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetSetPerSiteCookieDecisionW(pchhostname, dwdecision.toInt())

public actual fun InternetSetStatusCallback(hinternet: Long, lpfninternetcallback: LPINTERNET_STATUS_CALLBACK): LPINTERNET_STATUS_CALLBACK =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetSetStatusCallback(hinternet, lpfninternetcallback.toLong())

public actual fun InternetSetStatusCallbackA(hinternet: Long, lpfninternetcallback: LPINTERNET_STATUS_CALLBACK): LPINTERNET_STATUS_CALLBACK =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetSetStatusCallbackA(hinternet, lpfninternetcallback.toLong())

public actual fun InternetSetStatusCallbackW(hinternet: Long, lpfninternetcallback: LPINTERNET_STATUS_CALLBACK): LPINTERNET_STATUS_CALLBACK =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetSetStatusCallbackW(hinternet, lpfninternetcallback.toLong())

public actual fun InternetShowSecurityInfoByURL(lpszurl: PCSTR, hwndparent: HWND): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetShowSecurityInfoByURL(lpszurl, hwndparent)

public actual fun InternetShowSecurityInfoByURLA(lpszurl: PCSTR, hwndparent: HWND): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetShowSecurityInfoByURLA(lpszurl, hwndparent)

public actual fun InternetShowSecurityInfoByURLW(lpszurl: PCWSTR, hwndparent: HWND): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetShowSecurityInfoByURLW(lpszurl, hwndparent)

public actual fun InternetTimeFromSystemTime(pst: Long, dwrfc: UInt, lpsztime: PSTR, cbtime: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetTimeFromSystemTime(pst, dwrfc.toInt(), lpsztime, cbtime.toInt())

public actual fun InternetTimeFromSystemTimeA(pst: Long, dwrfc: UInt, lpsztime: PSTR, cbtime: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetTimeFromSystemTimeA(pst, dwrfc.toInt(), lpsztime, cbtime.toInt())

public actual fun InternetTimeFromSystemTimeW(pst: Long, dwrfc: UInt, lpsztime: PWSTR, cbtime: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetTimeFromSystemTimeW(pst, dwrfc.toInt(), lpsztime, cbtime.toInt())

public actual fun InternetTimeToSystemTime(lpsztime: PCSTR, pst: Long, dwreserved: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetTimeToSystemTime(lpsztime, pst, dwreserved.toInt())

public actual fun InternetTimeToSystemTimeA(lpsztime: PCSTR, pst: Long, dwreserved: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetTimeToSystemTimeA(lpsztime, pst, dwreserved.toInt())

public actual fun InternetTimeToSystemTimeW(lpsztime: PCWSTR, pst: Long, dwreserved: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetTimeToSystemTimeW(lpsztime, pst, dwreserved.toInt())

public actual fun InternetUnlockRequestFile(hlockrequestinfo: HANDLE): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetUnlockRequestFile(hlockrequestinfo)

public actual fun InternetWriteFile(hfile: Long, lpbuffer: Long, dwnumberofbytestowrite: UInt, lpdwnumberofbyteswritten: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetWriteFile(hfile, lpbuffer, dwnumberofbytestowrite.toInt(), lpdwnumberofbyteswritten)

public actual fun InternetWriteFileExA(hfile: Long, lpbuffersin: Long, dwflags: UInt, dwcontext: ULong): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetWriteFileExA(hfile, lpbuffersin, dwflags.toInt(), dwcontext.toLong())

public actual fun InternetWriteFileExW(hfile: Long, lpbuffersin: Long, dwflags: UInt, dwcontext: ULong): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_InternetWriteFileExW(hfile, lpbuffersin, dwflags.toInt(), dwcontext.toLong())

public actual fun IsDomainLegalCookieDomainA(pchdomain: PCSTR, pchfulldomain: PCSTR): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_IsDomainLegalCookieDomainA(pchdomain, pchfulldomain)

public actual fun IsDomainLegalCookieDomainW(pchdomain: PCWSTR, pchfulldomain: PCWSTR): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_IsDomainLegalCookieDomainW(pchdomain, pchfulldomain)

public actual fun IsHostInProxyBypassList(tscheme: INTERNET_SCHEME, lpszhost: PCSTR, cchhost: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_IsHostInProxyBypassList(tscheme, lpszhost, cchhost.toInt())

public actual fun IsProfilesEnabled(): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_IsProfilesEnabled()

public actual fun IsUrlCacheEntryExpiredA(lpszurlname: PCSTR, dwflags: UInt, pftlastmodified: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_IsUrlCacheEntryExpiredA(lpszurlname, dwflags.toInt(), pftlastmodified)

public actual fun IsUrlCacheEntryExpiredW(lpszurlname: PCWSTR, dwflags: UInt, pftlastmodified: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_IsUrlCacheEntryExpiredW(lpszurlname, dwflags.toInt(), pftlastmodified)

public actual fun LoadUrlCacheContent(): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_LoadUrlCacheContent()

public actual fun ParseX509EncodedCertificateForListBoxEntry(lpcert: Long, cbcert: UInt, lpszlistboxentry: PSTR, lpdwlistboxentry: Long): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_ParseX509EncodedCertificateForListBoxEntry(lpcert, cbcert.toInt(), lpszlistboxentry, lpdwlistboxentry).toUInt()

public actual fun PerformOperationOverUrlCacheA(pszurlsearchpattern: PCSTR, dwflags: UInt, dwfilter: UInt, groupid: Long, preserved1: Long, pdwreserved2: Long, preserved3: Long, op: CACHE_OPERATOR, poperatordata: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_PerformOperationOverUrlCacheA(pszurlsearchpattern, dwflags.toInt(), dwfilter.toInt(), groupid, preserved1, pdwreserved2, preserved3, op.toLong(), poperatordata)

public actual fun PrivacyGetZonePreferenceW(dwzone: UInt, dwtype: UInt, pdwtemplate: Long, pszbuffer: PWSTR, pdwbufferlength: Long): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_PrivacyGetZonePreferenceW(dwzone.toInt(), dwtype.toInt(), pdwtemplate, pszbuffer, pdwbufferlength).toUInt()

public actual fun PrivacySetZonePreferenceW(dwzone: UInt, dwtype: UInt, dwtemplate: UInt, pszpreference: PCWSTR): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_PrivacySetZonePreferenceW(dwzone.toInt(), dwtype.toInt(), dwtemplate.toInt(), pszpreference).toUInt()

public actual fun ReadGuidsForConnectedNetworks(pcnetworks: Long, pppwsznetworkguids: Long, pppbstrnetworknames: Long, pppwszgwmacs: Long, pcgatewaymacs: Long, pdwflags: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_ReadGuidsForConnectedNetworks(pcnetworks, pppwsznetworkguids, pppbstrnetworknames, pppwszgwmacs, pcgatewaymacs, pdwflags)

public actual fun ReadUrlCacheEntryStream(hurlcachestream: HANDLE, dwlocation: UInt, lpbuffer: Long, lpdwlen: Long, reserved: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_ReadUrlCacheEntryStream(hurlcachestream, dwlocation.toInt(), lpbuffer, lpdwlen, reserved.toInt())

public actual fun ReadUrlCacheEntryStreamEx(hurlcachestream: HANDLE, qwlocation: ULong, lpbuffer: Long, lpdwlen: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_ReadUrlCacheEntryStreamEx(hurlcachestream, qwlocation.toLong(), lpbuffer, lpdwlen)

public actual fun RegisterUrlCacheNotification(hwnd: HWND, umsg: UInt, gid: Long, dwopsfilter: UInt, dwreserved: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_RegisterUrlCacheNotification(hwnd, umsg.toInt(), gid, dwopsfilter.toInt(), dwreserved.toInt())

public actual fun ResumeSuspendedDownload(hrequest: Long, dwresultcode: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_ResumeSuspendedDownload(hrequest, dwresultcode.toInt())

public actual fun RetrieveUrlCacheEntryFileA(lpszurlname: PCSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, dwreserved: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_RetrieveUrlCacheEntryFileA(lpszurlname, lpcacheentryinfo, lpcbcacheentryinfo, dwreserved.toInt())

public actual fun RetrieveUrlCacheEntryFileW(lpszurlname: PCWSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, dwreserved: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_RetrieveUrlCacheEntryFileW(lpszurlname, lpcacheentryinfo, lpcbcacheentryinfo, dwreserved.toInt())

public actual fun RetrieveUrlCacheEntryStreamA(lpszurlname: PCSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, frandomread: BOOL, dwreserved: UInt): HANDLE =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_RetrieveUrlCacheEntryStreamA(lpszurlname, lpcacheentryinfo, lpcbcacheentryinfo, frandomread, dwreserved.toInt())

public actual fun RetrieveUrlCacheEntryStreamW(lpszurlname: PCWSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, frandomread: BOOL, dwreserved: UInt): HANDLE =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_RetrieveUrlCacheEntryStreamW(lpszurlname, lpcacheentryinfo, lpcbcacheentryinfo, frandomread, dwreserved.toInt())

public actual fun RunOnceUrlCache(hwnd: HWND, hinst: HINSTANCE, lpszcmd: PCSTR, ncmdshow: Int): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_RunOnceUrlCache(hwnd, hinst, lpszcmd, ncmdshow).toUInt()

public actual fun SetUrlCacheConfigInfoA(lpcacheconfiginfo: Long, dwfieldcontrol: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_SetUrlCacheConfigInfoA(lpcacheconfiginfo, dwfieldcontrol.toInt())

public actual fun SetUrlCacheConfigInfoW(lpcacheconfiginfo: Long, dwfieldcontrol: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_SetUrlCacheConfigInfoW(lpcacheconfiginfo, dwfieldcontrol.toInt())

public actual fun SetUrlCacheEntryGroup(lpszurlname: PCSTR, dwflags: UInt, groupid: Long, pbgroupattributes: Long, cbgroupattributes: UInt, lpreserved: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_SetUrlCacheEntryGroup(lpszurlname, dwflags.toInt(), groupid, pbgroupattributes, cbgroupattributes.toInt(), lpreserved)

public actual fun SetUrlCacheEntryGroupA(lpszurlname: PCSTR, dwflags: UInt, groupid: Long, pbgroupattributes: Long, cbgroupattributes: UInt, lpreserved: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_SetUrlCacheEntryGroupA(lpszurlname, dwflags.toInt(), groupid, pbgroupattributes, cbgroupattributes.toInt(), lpreserved)

public actual fun SetUrlCacheEntryGroupW(lpszurlname: PCWSTR, dwflags: UInt, groupid: Long, pbgroupattributes: Long, cbgroupattributes: UInt, lpreserved: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_SetUrlCacheEntryGroupW(lpszurlname, dwflags.toInt(), groupid, pbgroupattributes, cbgroupattributes.toInt(), lpreserved)

public actual fun SetUrlCacheEntryInfoA(lpszurlname: PCSTR, lpcacheentryinfo: Long, dwfieldcontrol: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_SetUrlCacheEntryInfoA(lpszurlname, lpcacheentryinfo, dwfieldcontrol.toInt())

public actual fun SetUrlCacheEntryInfoW(lpszurlname: PCWSTR, lpcacheentryinfo: Long, dwfieldcontrol: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_SetUrlCacheEntryInfoW(lpszurlname, lpcacheentryinfo, dwfieldcontrol.toInt())

public actual fun SetUrlCacheGroupAttributeA(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: Long, lpreserved: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_SetUrlCacheGroupAttributeA(gid, dwflags.toInt(), dwattributes.toInt(), lpgroupinfo, lpreserved)

public actual fun SetUrlCacheGroupAttributeW(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: Long, lpreserved: Long): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_SetUrlCacheGroupAttributeW(gid, dwflags.toInt(), dwattributes.toInt(), lpgroupinfo, lpreserved)

public actual fun SetUrlCacheHeaderData(nidx: UInt, dwdata: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_SetUrlCacheHeaderData(nidx.toInt(), dwdata.toInt())

public actual fun ShowClientAuthCerts(hwndparent: HWND): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_ShowClientAuthCerts(hwndparent).toUInt()

public actual fun ShowSecurityInfo(hwndparent: HWND, psecurityinfo: Long): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_ShowSecurityInfo(hwndparent, psecurityinfo).toUInt()

public actual fun ShowX509EncodedCertificate(hwndparent: HWND, lpcert: Long, cbcert: UInt): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_ShowX509EncodedCertificate(hwndparent, lpcert, cbcert.toInt()).toUInt()

public actual fun UnlockUrlCacheEntryFile(lpszurlname: PCSTR, dwreserved: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_UnlockUrlCacheEntryFile(lpszurlname, dwreserved.toInt())

public actual fun UnlockUrlCacheEntryFileA(lpszurlname: PCSTR, dwreserved: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_UnlockUrlCacheEntryFileA(lpszurlname, dwreserved.toInt())

public actual fun UnlockUrlCacheEntryFileW(lpszurlname: PCWSTR, dwreserved: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_UnlockUrlCacheEntryFileW(lpszurlname, dwreserved.toInt())

public actual fun UnlockUrlCacheEntryStream(hurlcachestream: HANDLE, reserved: UInt): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_UnlockUrlCacheEntryStream(hurlcachestream, reserved.toInt())

public actual fun UpdateUrlCacheContentPath(sznewpath: PCSTR): BOOL =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_UpdateUrlCacheContentPath(sznewpath)

public actual fun UrlCacheCheckEntriesExist(rgpwszurls: Long, centries: UInt, rgfexist: Long): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_UrlCacheCheckEntriesExist(rgpwszurls, centries.toInt(), rgfexist).toUInt()

public actual fun UrlCacheCloseEntryHandle(hentryfile: Long) {
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_UrlCacheCloseEntryHandle(hentryfile)
}

public actual fun UrlCacheContainerSetEntryMaximumAge(pwszprefix: PCWSTR, dwentrymaxage: UInt): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_UrlCacheContainerSetEntryMaximumAge(pwszprefix, dwentrymaxage.toInt()).toUInt()

public actual fun UrlCacheCreateContainer(pwszname: PCWSTR, pwszprefix: PCWSTR, pwszdirectory: PCWSTR, ulllimit: ULong, dwoptions: UInt): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_UrlCacheCreateContainer(pwszname, pwszprefix, pwszdirectory, ulllimit.toLong(), dwoptions.toInt()).toUInt()

public actual fun UrlCacheFindFirstEntry(pwszprefix: PCWSTR, dwflags: UInt, dwfilter: UInt, groupid: Long, pcacheentryinfo: Long, phfind: Long): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_UrlCacheFindFirstEntry(pwszprefix, dwflags.toInt(), dwfilter.toInt(), groupid, pcacheentryinfo, phfind).toUInt()

public actual fun UrlCacheFindNextEntry(hfind: HANDLE, pcacheentryinfo: Long): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_UrlCacheFindNextEntry(hfind, pcacheentryinfo).toUInt()

public actual fun UrlCacheFreeEntryInfo(pcacheentryinfo: Long) {
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_UrlCacheFreeEntryInfo(pcacheentryinfo)
}

public actual fun UrlCacheFreeGlobalSpace(ulltargetsize: ULong, dwfilter: UInt): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_UrlCacheFreeGlobalSpace(ulltargetsize.toLong(), dwfilter.toInt()).toUInt()

public actual fun UrlCacheGetContentPaths(pppwszdirectories: Long, pcdirectories: Long): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_UrlCacheGetContentPaths(pppwszdirectories, pcdirectories).toUInt()

public actual fun UrlCacheGetEntryInfo(happcache: Long, pcwszurl: PCWSTR, pcacheentryinfo: Long): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_UrlCacheGetEntryInfo(happcache, pcwszurl, pcacheentryinfo).toUInt()

public actual fun UrlCacheGetGlobalCacheSize(dwfilter: UInt, pullsize: Long, pulllimit: Long): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_UrlCacheGetGlobalCacheSize(dwfilter.toInt(), pullsize, pulllimit).toUInt()

public actual fun UrlCacheGetGlobalLimit(limittype: URL_CACHE_LIMIT_TYPE, pulllimit: Long): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_UrlCacheGetGlobalLimit(limittype, pulllimit).toUInt()

public actual fun UrlCacheReadEntryStream(hurlcachestream: Long, ulllocation: ULong, pbuffer: Long, dwbufferlen: UInt, pdwbufferlen: Long): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_UrlCacheReadEntryStream(hurlcachestream, ulllocation.toLong(), pbuffer, dwbufferlen.toInt(), pdwbufferlen).toUInt()

public actual fun UrlCacheReloadSettings(): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_UrlCacheReloadSettings().toUInt()

public actual fun UrlCacheRetrieveEntryFile(happcache: Long, pcwszurl: PCWSTR, pcacheentryinfo: Long, phentryfile: Long): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_UrlCacheRetrieveEntryFile(happcache, pcwszurl, pcacheentryinfo, phentryfile).toUInt()

public actual fun UrlCacheRetrieveEntryStream(happcache: Long, pcwszurl: PCWSTR, frandomread: BOOL, pcacheentryinfo: Long, phentrystream: Long): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_UrlCacheRetrieveEntryStream(happcache, pcwszurl, frandomread, pcacheentryinfo, phentrystream).toUInt()

public actual fun UrlCacheServer(): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_UrlCacheServer().toUInt()

public actual fun UrlCacheSetGlobalLimit(limittype: URL_CACHE_LIMIT_TYPE, ulllimit: ULong): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_UrlCacheSetGlobalLimit(limittype, ulllimit.toLong()).toUInt()

public actual fun UrlCacheUpdateEntryExtraData(happcache: Long, pcwszurl: PCWSTR, pbextradata: Long, cbextradata: UInt): UInt =
    WindowsWin32NetworkingWininetJniBridge.windowssys_windows_win32_networking_wininet_UrlCacheUpdateEntryExtraData(happcache, pcwszurl, pbextradata, cbextradata.toInt()).toUInt()
