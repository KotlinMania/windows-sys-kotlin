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

public expect fun AppCacheCheckManifest(pwszmasterurl: PCWSTR, pwszmanifesturl: PCWSTR, pbmanifestdata: Long, dwmanifestdatasize: UInt, pbmanifestresponseheaders: Long, dwmanifestresponseheaderssize: UInt, pestate: Long, phnewappcache: Long): UInt

public expect fun AppCacheCloseHandle(happcache: Long)

public expect fun AppCacheCreateAndCommitFile(happcache: Long, pwszsourcefilepath: PCWSTR, pwszurl: PCWSTR, pbresponseheaders: Long, dwresponseheaderssize: UInt): UInt

public expect fun AppCacheDeleteGroup(pwszmanifesturl: PCWSTR): UInt

public expect fun AppCacheDeleteIEGroup(pwszmanifesturl: PCWSTR): UInt

public expect fun AppCacheDuplicateHandle(happcache: Long, phduplicatedappcache: Long): UInt

public expect fun AppCacheFinalize(happcache: Long, pbmanifestdata: Long, dwmanifestdatasize: UInt, pestate: Long): UInt

public expect fun AppCacheFreeDownloadList(pdownloadlist: Long)

public expect fun AppCacheFreeGroupList(pappcachegrouplist: Long)

public expect fun AppCacheFreeIESpace(ftcutoff: FILETIME): UInt

public expect fun AppCacheFreeSpace(ftcutoff: FILETIME): UInt

public expect fun AppCacheGetDownloadList(happcache: Long, pdownloadlist: Long): UInt

public expect fun AppCacheGetFallbackUrl(happcache: Long, pwszurl: PCWSTR, ppwszfallbackurl: Long): UInt

public expect fun AppCacheGetGroupList(pappcachegrouplist: Long): UInt

public expect fun AppCacheGetIEGroupList(pappcachegrouplist: Long): UInt

public expect fun AppCacheGetInfo(happcache: Long, pappcacheinfo: Long): UInt

public expect fun AppCacheGetManifestUrl(happcache: Long, ppwszmanifesturl: Long): UInt

public expect fun AppCacheLookup(pwszurl: PCWSTR, dwflags: UInt, phappcache: Long): UInt

public expect fun CommitUrlCacheEntryA(lpszurlname: PCSTR, lpszlocalfilename: PCSTR, expiretime: FILETIME, lastmodifiedtime: FILETIME, cacheentrytype: UInt, lpheaderinfo: Long, cchheaderinfo: UInt, lpszfileextension: PCSTR, lpszoriginalurl: PCSTR): BOOL

public expect fun CommitUrlCacheEntryBinaryBlob(pwszurlname: PCWSTR, dwtype: UInt, ftexpiretime: FILETIME, ftmodifiedtime: FILETIME, pbblob: Long, cbblob: UInt): UInt

public expect fun CommitUrlCacheEntryW(lpszurlname: PCWSTR, lpszlocalfilename: PCWSTR, expiretime: FILETIME, lastmodifiedtime: FILETIME, cacheentrytype: UInt, lpszheaderinfo: PCWSTR, cchheaderinfo: UInt, lpszfileextension: PCWSTR, lpszoriginalurl: PCWSTR): BOOL

public expect fun CreateMD5SSOHash(pszchallengeinfo: PCWSTR, pwszrealm: PCWSTR, pwsztarget: PCWSTR, pbhexhash: Long): BOOL

public expect fun CreateUrlCacheContainerA(name: PCSTR, lpcacheprefix: PCSTR, lpszcachepath: PCSTR, kbcachelimit: UInt, dwcontainertype: UInt, dwoptions: UInt, pvbuffer: Long, cbbuffer: Long): BOOL

public expect fun CreateUrlCacheContainerW(name: PCWSTR, lpcacheprefix: PCWSTR, lpszcachepath: PCWSTR, kbcachelimit: UInt, dwcontainertype: UInt, dwoptions: UInt, pvbuffer: Long, cbbuffer: Long): BOOL

public expect fun CreateUrlCacheEntryA(lpszurlname: PCSTR, dwexpectedfilesize: UInt, lpszfileextension: PCSTR, lpszfilename: PSTR, dwreserved: UInt): BOOL

public expect fun CreateUrlCacheEntryExW(lpszurlname: PCWSTR, dwexpectedfilesize: UInt, lpszfileextension: PCWSTR, lpszfilename: PWSTR, dwreserved: UInt, fpreserveincomingfilename: BOOL): BOOL

public expect fun CreateUrlCacheEntryW(lpszurlname: PCWSTR, dwexpectedfilesize: UInt, lpszfileextension: PCWSTR, lpszfilename: PWSTR, dwreserved: UInt): BOOL

public expect fun CreateUrlCacheGroup(dwflags: UInt, lpreserved: Long): Long

public expect fun DeleteIE3Cache(hwnd: HWND, hinst: HINSTANCE, lpszcmd: PCSTR, ncmdshow: Int): UInt

public expect fun DeleteUrlCacheContainerA(name: PCSTR, dwoptions: UInt): BOOL

public expect fun DeleteUrlCacheContainerW(name: PCWSTR, dwoptions: UInt): BOOL

public expect fun DeleteUrlCacheEntry(lpszurlname: PCSTR): BOOL

public expect fun DeleteUrlCacheEntryA(lpszurlname: PCSTR): BOOL

public expect fun DeleteUrlCacheEntryW(lpszurlname: PCWSTR): BOOL

public expect fun DeleteUrlCacheGroup(groupid: Long, dwflags: UInt, lpreserved: Long): BOOL

public expect fun DeleteWpadCacheForNetworks(param0: WPAD_CACHE_DELETE): BOOL

public expect fun DetectAutoProxyUrl(pszautoproxyurl: PSTR, cchautoproxyurl: UInt, dwdetectflags: PROXY_AUTO_DETECT_TYPE): BOOL

public expect fun DoConnectoidsExist(): BOOL

public expect fun ExportCookieFileA(szfilename: PCSTR, fappend: BOOL): BOOL

public expect fun ExportCookieFileW(szfilename: PCWSTR, fappend: BOOL): BOOL

public expect fun FindCloseUrlCache(henumhandle: HANDLE): BOOL

public expect fun FindFirstUrlCacheContainerA(pdwmodified: Long, lpcontainerinfo: Long, lpcbcontainerinfo: Long, dwoptions: UInt): HANDLE

public expect fun FindFirstUrlCacheContainerW(pdwmodified: Long, lpcontainerinfo: Long, lpcbcontainerinfo: Long, dwoptions: UInt): HANDLE

public expect fun FindFirstUrlCacheEntryA(lpszurlsearchpattern: PCSTR, lpfirstcacheentryinfo: Long, lpcbcacheentryinfo: Long): HANDLE

public expect fun FindFirstUrlCacheEntryExA(lpszurlsearchpattern: PCSTR, dwflags: UInt, dwfilter: UInt, groupid: Long, lpfirstcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpgroupattributes: Long, lpcbgroupattributes: Long, lpreserved: Long): HANDLE

public expect fun FindFirstUrlCacheEntryExW(lpszurlsearchpattern: PCWSTR, dwflags: UInt, dwfilter: UInt, groupid: Long, lpfirstcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpgroupattributes: Long, lpcbgroupattributes: Long, lpreserved: Long): HANDLE

public expect fun FindFirstUrlCacheEntryW(lpszurlsearchpattern: PCWSTR, lpfirstcacheentryinfo: Long, lpcbcacheentryinfo: Long): HANDLE

public expect fun FindFirstUrlCacheGroup(dwflags: UInt, dwfilter: UInt, lpsearchcondition: Long, dwsearchcondition: UInt, lpgroupid: Long, lpreserved: Long): HANDLE

public expect fun FindNextUrlCacheContainerA(henumhandle: HANDLE, lpcontainerinfo: Long, lpcbcontainerinfo: Long): BOOL

public expect fun FindNextUrlCacheContainerW(henumhandle: HANDLE, lpcontainerinfo: Long, lpcbcontainerinfo: Long): BOOL

public expect fun FindNextUrlCacheEntryA(henumhandle: HANDLE, lpnextcacheentryinfo: Long, lpcbcacheentryinfo: Long): BOOL

public expect fun FindNextUrlCacheEntryExA(henumhandle: HANDLE, lpnextcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpgroupattributes: Long, lpcbgroupattributes: Long, lpreserved: Long): BOOL

public expect fun FindNextUrlCacheEntryExW(henumhandle: HANDLE, lpnextcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpgroupattributes: Long, lpcbgroupattributes: Long, lpreserved: Long): BOOL

public expect fun FindNextUrlCacheEntryW(henumhandle: HANDLE, lpnextcacheentryinfo: Long, lpcbcacheentryinfo: Long): BOOL

public expect fun FindNextUrlCacheGroup(hfind: HANDLE, lpgroupid: Long, lpreserved: Long): BOOL

public expect fun FindP3PPolicySymbol(pszsymbol: PCSTR): Int

public expect fun FreeUrlCacheSpaceA(lpszcachepath: PCSTR, dwsize: UInt, dwfilter: UInt): BOOL

public expect fun FreeUrlCacheSpaceW(lpszcachepath: PCWSTR, dwsize: UInt, dwfilter: UInt): BOOL

public expect fun FtpCommandA(hconnect: Long, fexpectresponse: BOOL, dwflags: FTP_FLAGS, lpszcommand: PCSTR, dwcontext: ULong, phftpcommand: Long): BOOL

public expect fun FtpCommandW(hconnect: Long, fexpectresponse: BOOL, dwflags: FTP_FLAGS, lpszcommand: PCWSTR, dwcontext: ULong, phftpcommand: Long): BOOL

public expect fun FtpCreateDirectoryA(hconnect: Long, lpszdirectory: PCSTR): BOOL

public expect fun FtpCreateDirectoryW(hconnect: Long, lpszdirectory: PCWSTR): BOOL

public expect fun FtpDeleteFileA(hconnect: Long, lpszfilename: PCSTR): BOOL

public expect fun FtpDeleteFileW(hconnect: Long, lpszfilename: PCWSTR): BOOL

public expect fun FtpFindFirstFileA(hconnect: Long, lpszsearchfile: PCSTR, lpfindfiledata: Long, dwflags: UInt, dwcontext: ULong): Long

public expect fun FtpFindFirstFileW(hconnect: Long, lpszsearchfile: PCWSTR, lpfindfiledata: Long, dwflags: UInt, dwcontext: ULong): Long

public expect fun FtpGetCurrentDirectoryA(hconnect: Long, lpszcurrentdirectory: PSTR, lpdwcurrentdirectory: Long): BOOL

public expect fun FtpGetCurrentDirectoryW(hconnect: Long, lpszcurrentdirectory: PWSTR, lpdwcurrentdirectory: Long): BOOL

public expect fun FtpGetFileA(hconnect: Long, lpszremotefile: PCSTR, lpsznewfile: PCSTR, ffailifexists: BOOL, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): BOOL

public expect fun FtpGetFileEx(hftpsession: Long, lpszremotefile: PCSTR, lpsznewfile: PCWSTR, ffailifexists: BOOL, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): BOOL

public expect fun FtpGetFileSize(hfile: Long, lpdwfilesizehigh: Long): UInt

public expect fun FtpGetFileW(hconnect: Long, lpszremotefile: PCWSTR, lpsznewfile: PCWSTR, ffailifexists: BOOL, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): BOOL

public expect fun FtpOpenFileA(hconnect: Long, lpszfilename: PCSTR, dwaccess: UInt, dwflags: FTP_FLAGS, dwcontext: ULong): Long

public expect fun FtpOpenFileW(hconnect: Long, lpszfilename: PCWSTR, dwaccess: UInt, dwflags: FTP_FLAGS, dwcontext: ULong): Long

public expect fun FtpPutFileA(hconnect: Long, lpszlocalfile: PCSTR, lpsznewremotefile: PCSTR, dwflags: FTP_FLAGS, dwcontext: ULong): BOOL

public expect fun FtpPutFileEx(hftpsession: Long, lpszlocalfile: PCWSTR, lpsznewremotefile: PCSTR, dwflags: UInt, dwcontext: ULong): BOOL

public expect fun FtpPutFileW(hconnect: Long, lpszlocalfile: PCWSTR, lpsznewremotefile: PCWSTR, dwflags: FTP_FLAGS, dwcontext: ULong): BOOL

public expect fun FtpRemoveDirectoryA(hconnect: Long, lpszdirectory: PCSTR): BOOL

public expect fun FtpRemoveDirectoryW(hconnect: Long, lpszdirectory: PCWSTR): BOOL

public expect fun FtpRenameFileA(hconnect: Long, lpszexisting: PCSTR, lpsznew: PCSTR): BOOL

public expect fun FtpRenameFileW(hconnect: Long, lpszexisting: PCWSTR, lpsznew: PCWSTR): BOOL

public expect fun FtpSetCurrentDirectoryA(hconnect: Long, lpszdirectory: PCSTR): BOOL

public expect fun FtpSetCurrentDirectoryW(hconnect: Long, lpszdirectory: PCWSTR): BOOL

public expect fun GetDiskInfoA(pszpath: PCSTR, pdwclustersize: Long, pdlavail: Long, pdltotal: Long): BOOL

public expect fun GetUrlCacheConfigInfoA(lpcacheconfiginfo: Long, lpcbcacheconfiginfo: Long, dwfieldcontrol: CACHE_CONFIG): BOOL

public expect fun GetUrlCacheConfigInfoW(lpcacheconfiginfo: Long, lpcbcacheconfiginfo: Long, dwfieldcontrol: CACHE_CONFIG): BOOL

public expect fun GetUrlCacheEntryBinaryBlob(pwszurlname: PCWSTR, dwtype: Long, pftexpiretime: Long, pftaccesstime: Long, pftmodifiedtime: Long, ppbblob: Long, pcbblob: Long): UInt

public expect fun GetUrlCacheEntryInfoA(lpszurlname: PCSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long): BOOL

public expect fun GetUrlCacheEntryInfoExA(lpszurl: PCSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpszredirecturl: PCSTR, lpcbredirecturl: Long, lpreserved: Long, dwflags: UInt): BOOL

public expect fun GetUrlCacheEntryInfoExW(lpszurl: PCWSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpszredirecturl: PCWSTR, lpcbredirecturl: Long, lpreserved: Long, dwflags: UInt): BOOL

public expect fun GetUrlCacheEntryInfoW(lpszurlname: PCWSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long): BOOL

public expect fun GetUrlCacheGroupAttributeA(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: Long, lpcbgroupinfo: Long, lpreserved: Long): BOOL

public expect fun GetUrlCacheGroupAttributeW(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: Long, lpcbgroupinfo: Long, lpreserved: Long): BOOL

public expect fun GetUrlCacheHeaderData(nidx: UInt, lpdwdata: Long): BOOL

public expect fun GopherCreateLocatorA(lpszhost: PCSTR, nserverport: UShort, lpszdisplaystring: PCSTR, lpszselectorstring: PCSTR, dwgophertype: UInt, lpszlocator: PSTR, lpdwbufferlength: Long): BOOL

public expect fun GopherCreateLocatorW(lpszhost: PCWSTR, nserverport: UShort, lpszdisplaystring: PCWSTR, lpszselectorstring: PCWSTR, dwgophertype: UInt, lpszlocator: PWSTR, lpdwbufferlength: Long): BOOL

public expect fun GopherFindFirstFileA(hconnect: Long, lpszlocator: PCSTR, lpszsearchstring: PCSTR, lpfinddata: Long, dwflags: UInt, dwcontext: ULong): Long

public expect fun GopherFindFirstFileW(hconnect: Long, lpszlocator: PCWSTR, lpszsearchstring: PCWSTR, lpfinddata: Long, dwflags: UInt, dwcontext: ULong): Long

public expect fun GopherGetAttributeA(hconnect: Long, lpszlocator: PCSTR, lpszattributename: PCSTR, lpbuffer: Long, dwbufferlength: UInt, lpdwcharactersreturned: Long, lpfnenumerator: GOPHER_ATTRIBUTE_ENUMERATOR, dwcontext: ULong): BOOL

public expect fun GopherGetAttributeW(hconnect: Long, lpszlocator: PCWSTR, lpszattributename: PCWSTR, lpbuffer: Long, dwbufferlength: UInt, lpdwcharactersreturned: Long, lpfnenumerator: GOPHER_ATTRIBUTE_ENUMERATOR, dwcontext: ULong): BOOL

public expect fun GopherGetLocatorTypeA(lpszlocator: PCSTR, lpdwgophertype: Long): BOOL

public expect fun GopherGetLocatorTypeW(lpszlocator: PCWSTR, lpdwgophertype: Long): BOOL

public expect fun GopherOpenFileA(hconnect: Long, lpszlocator: PCSTR, lpszview: PCSTR, dwflags: UInt, dwcontext: ULong): Long

public expect fun GopherOpenFileW(hconnect: Long, lpszlocator: PCWSTR, lpszview: PCWSTR, dwflags: UInt, dwcontext: ULong): Long

public expect fun HttpAddRequestHeadersA(hrequest: Long, lpszheaders: PCSTR, dwheaderslength: UInt, dwmodifiers: HTTP_ADDREQ_FLAG): BOOL

public expect fun HttpAddRequestHeadersW(hrequest: Long, lpszheaders: PCWSTR, dwheaderslength: UInt, dwmodifiers: HTTP_ADDREQ_FLAG): BOOL

public expect fun HttpCheckDavComplianceA(lpszurl: PCSTR, lpszcompliancetoken: PCSTR, lpffound: Long, hwnd: HWND, lpvreserved: Long): BOOL

public expect fun HttpCheckDavComplianceW(lpszurl: PCWSTR, lpszcompliancetoken: PCWSTR, lpffound: Long, hwnd: HWND, lpvreserved: Long): BOOL

public expect fun HttpCloseDependencyHandle(hdependencyhandle: Long)

public expect fun HttpDuplicateDependencyHandle(hdependencyhandle: Long, phduplicateddependencyhandle: Long): UInt

public expect fun HttpEndRequestA(hrequest: Long, lpbuffersout: Long, dwflags: UInt, dwcontext: ULong): BOOL

public expect fun HttpEndRequestW(hrequest: Long, lpbuffersout: Long, dwflags: UInt, dwcontext: ULong): BOOL

public expect fun HttpGetServerCredentials(pwszurl: PCWSTR, ppwszusername: Long, ppwszpassword: Long): UInt

public expect fun HttpIndicatePageLoadComplete(hdependencyhandle: Long): UInt

public expect fun HttpIsHostHstsEnabled(pcwszurl: PCWSTR, pfishsts: Long): UInt

public expect fun HttpOpenDependencyHandle(hrequesthandle: Long, fbackground: BOOL, phdependencyhandle: Long): UInt

public expect fun HttpOpenRequestA(hconnect: Long, lpszverb: PCSTR, lpszobjectname: PCSTR, lpszversion: PCSTR, lpszreferrer: PCSTR, lplpszaccepttypes: Long, dwflags: UInt, dwcontext: ULong): Long

public expect fun HttpOpenRequestW(hconnect: Long, lpszverb: PCWSTR, lpszobjectname: PCWSTR, lpszversion: PCWSTR, lpszreferrer: PCWSTR, lplpszaccepttypes: Long, dwflags: UInt, dwcontext: ULong): Long

public expect fun HttpPushClose(hwait: HTTP_PUSH_WAIT_HANDLE)

public expect fun HttpPushEnable(hrequest: Long, ptransportsetting: Long, phwait: Long): UInt

public expect fun HttpPushWait(hwait: HTTP_PUSH_WAIT_HANDLE, etype: HTTP_PUSH_WAIT_TYPE, pnotificationstatus: Long): UInt

public expect fun HttpQueryInfoA(hrequest: Long, dwinfolevel: UInt, lpbuffer: Long, lpdwbufferlength: Long, lpdwindex: Long): BOOL

public expect fun HttpQueryInfoW(hrequest: Long, dwinfolevel: UInt, lpbuffer: Long, lpdwbufferlength: Long, lpdwindex: Long): BOOL

public expect fun HttpSendRequestA(hrequest: Long, lpszheaders: PCSTR, dwheaderslength: UInt, lpoptional: Long, dwoptionallength: UInt): BOOL

public expect fun HttpSendRequestExA(hrequest: Long, lpbuffersin: Long, lpbuffersout: Long, dwflags: UInt, dwcontext: ULong): BOOL

public expect fun HttpSendRequestExW(hrequest: Long, lpbuffersin: Long, lpbuffersout: Long, dwflags: UInt, dwcontext: ULong): BOOL

public expect fun HttpSendRequestW(hrequest: Long, lpszheaders: PCWSTR, dwheaderslength: UInt, lpoptional: Long, dwoptionallength: UInt): BOOL

public expect fun HttpWebSocketClose(hwebsocket: Long, usstatus: UShort, pvreason: Long, dwreasonlength: UInt): BOOL

public expect fun HttpWebSocketCompleteUpgrade(hrequest: Long, dwcontext: ULong): Long

public expect fun HttpWebSocketQueryCloseStatus(hwebsocket: Long, pusstatus: Long, pvreason: Long, dwreasonlength: UInt, pdwreasonlengthconsumed: Long): BOOL

public expect fun HttpWebSocketReceive(hwebsocket: Long, pvbuffer: Long, dwbufferlength: UInt, pdwbytesread: Long, pbuffertype: Long): BOOL

public expect fun HttpWebSocketSend(hwebsocket: Long, buffertype: HTTP_WEB_SOCKET_BUFFER_TYPE, pvbuffer: Long, dwbufferlength: UInt): BOOL

public expect fun HttpWebSocketShutdown(hwebsocket: Long, usstatus: UShort, pvreason: Long, dwreasonlength: UInt): BOOL

public expect fun ImportCookieFileA(szfilename: PCSTR): BOOL

public expect fun ImportCookieFileW(szfilename: PCWSTR): BOOL

public expect fun IncrementUrlCacheHeaderData(nidx: UInt, lpdwdata: Long): BOOL

public expect fun InternalInternetGetCookie(lpszurl: PCSTR, lpszcookiedata: PSTR, lpdwdatasize: Long): UInt

public expect fun InternetAlgIdToStringA(ai: ALG_ID, lpstr: PSTR, lpdwstrlength: Long, dwreserved: UInt): BOOL

public expect fun InternetAlgIdToStringW(ai: ALG_ID, lpstr: PWSTR, lpdwstrlength: Long, dwreserved: UInt): BOOL

public expect fun InternetAttemptConnect(dwreserved: UInt): UInt

public expect fun InternetAutodial(dwflags: INTERNET_AUTODIAL, hwndparent: HWND): BOOL

public expect fun InternetAutodialHangup(dwreserved: UInt): BOOL

public expect fun InternetCanonicalizeUrlA(lpszurl: PCSTR, lpszbuffer: PSTR, lpdwbufferlength: Long, dwflags: UInt): BOOL

public expect fun InternetCanonicalizeUrlW(lpszurl: PCWSTR, lpszbuffer: PWSTR, lpdwbufferlength: Long, dwflags: UInt): BOOL

public expect fun InternetCheckConnectionA(lpszurl: PCSTR, dwflags: UInt, dwreserved: UInt): BOOL

public expect fun InternetCheckConnectionW(lpszurl: PCWSTR, dwflags: UInt, dwreserved: UInt): BOOL

public expect fun InternetClearAllPerSiteCookieDecisions(): BOOL

public expect fun InternetCloseHandle(hinternet: Long): BOOL

public expect fun InternetCombineUrlA(lpszbaseurl: PCSTR, lpszrelativeurl: PCSTR, lpszbuffer: PSTR, lpdwbufferlength: Long, dwflags: UInt): BOOL

public expect fun InternetCombineUrlW(lpszbaseurl: PCWSTR, lpszrelativeurl: PCWSTR, lpszbuffer: PWSTR, lpdwbufferlength: Long, dwflags: UInt): BOOL

public expect fun InternetConfirmZoneCrossing(hwnd: HWND, szurlprev: PCSTR, szurlnew: PCSTR, bpost: BOOL): UInt

public expect fun InternetConfirmZoneCrossingA(hwnd: HWND, szurlprev: PCSTR, szurlnew: PCSTR, bpost: BOOL): UInt

public expect fun InternetConfirmZoneCrossingW(hwnd: HWND, szurlprev: PCWSTR, szurlnew: PCWSTR, bpost: BOOL): UInt

public expect fun InternetConnectA(hinternet: Long, lpszservername: PCSTR, nserverport: UShort, lpszusername: PCSTR, lpszpassword: PCSTR, dwservice: UInt, dwflags: UInt, dwcontext: ULong): Long

public expect fun InternetConnectW(hinternet: Long, lpszservername: PCWSTR, nserverport: UShort, lpszusername: PCWSTR, lpszpassword: PCWSTR, dwservice: UInt, dwflags: UInt, dwcontext: ULong): Long

public expect fun InternetConvertUrlFromWireToWideChar(pcszurl: PCSTR, cchurl: UInt, pcwszbaseurl: PCWSTR, dwcodepagehost: UInt, dwcodepagepath: UInt, fencodepathextra: BOOL, dwcodepageextra: UInt, ppwszconvertedurl: Long): UInt

public expect fun InternetCrackUrlA(lpszurl: PCSTR, dwurllength: UInt, dwflags: WIN_HTTP_CREATE_URL_FLAGS, lpurlcomponents: Long): BOOL

public expect fun InternetCrackUrlW(lpszurl: PCWSTR, dwurllength: UInt, dwflags: WIN_HTTP_CREATE_URL_FLAGS, lpurlcomponents: Long): BOOL

public expect fun InternetCreateUrlA(lpurlcomponents: Long, dwflags: UInt, lpszurl: PSTR, lpdwurllength: Long): BOOL

public expect fun InternetCreateUrlW(lpurlcomponents: Long, dwflags: UInt, lpszurl: PWSTR, lpdwurllength: Long): BOOL

public expect fun InternetDial(hwndparent: HWND, lpszconnectoid: PCSTR, dwflags: UInt, lpdwconnection: Long, dwreserved: UInt): UInt

public expect fun InternetDialA(hwndparent: HWND, lpszconnectoid: PCSTR, dwflags: UInt, lpdwconnection: Long, dwreserved: UInt): UInt

public expect fun InternetDialW(hwndparent: HWND, lpszconnectoid: PCWSTR, dwflags: UInt, lpdwconnection: Long, dwreserved: UInt): UInt

public expect fun InternetEnumPerSiteCookieDecisionA(pszsitename: PSTR, pcsitenamesize: Long, pdwdecision: Long, dwindex: UInt): BOOL

public expect fun InternetEnumPerSiteCookieDecisionW(pszsitename: PWSTR, pcsitenamesize: Long, pdwdecision: Long, dwindex: UInt): BOOL

public expect fun InternetErrorDlg(hwnd: HWND, hrequest: Long, dwerror: UInt, dwflags: UInt, lppvdata: Long): UInt

public expect fun InternetFindNextFileA(hfind: Long, lpvfinddata: Long): BOOL

public expect fun InternetFindNextFileW(hfind: Long, lpvfinddata: Long): BOOL

public expect fun InternetFortezzaCommand(dwcommand: UInt, hwnd: HWND, dwreserved: ULong): BOOL

public expect fun InternetFreeCookies(pcookies: Long, dwcookiecount: UInt)

public expect fun InternetFreeProxyInfoList(pproxyinfolist: Long)

public expect fun InternetGetConnectedState(lpdwflags: Long, dwreserved: UInt): BOOL

public expect fun InternetGetConnectedStateEx(lpdwflags: Long, lpszconnectionname: PSTR, dwnamelen: UInt, dwreserved: UInt): BOOL

public expect fun InternetGetConnectedStateExA(lpdwflags: Long, lpszconnectionname: PSTR, cchnamelen: UInt, dwreserved: UInt): BOOL

public expect fun InternetGetConnectedStateExW(lpdwflags: Long, lpszconnectionname: PWSTR, cchnamelen: UInt, dwreserved: UInt): BOOL

public expect fun InternetGetCookieA(lpszurl: PCSTR, lpszcookiename: PCSTR, lpszcookiedata: PSTR, lpdwsize: Long): BOOL

public expect fun InternetGetCookieEx2(pcwszurl: PCWSTR, pcwszcookiename: PCWSTR, dwflags: UInt, ppcookies: Long, pdwcookiecount: Long): UInt

public expect fun InternetGetCookieExA(lpszurl: PCSTR, lpszcookiename: PCSTR, lpszcookiedata: PCSTR, lpdwsize: Long, dwflags: INTERNET_COOKIE_FLAGS, lpreserved: Long): BOOL

public expect fun InternetGetCookieExW(lpszurl: PCWSTR, lpszcookiename: PCWSTR, lpszcookiedata: PCWSTR, lpdwsize: Long, dwflags: INTERNET_COOKIE_FLAGS, lpreserved: Long): BOOL

public expect fun InternetGetCookieW(lpszurl: PCWSTR, lpszcookiename: PCWSTR, lpszcookiedata: PWSTR, lpdwsize: Long): BOOL

public expect fun InternetGetLastResponseInfoA(lpdwerror: Long, lpszbuffer: PSTR, lpdwbufferlength: Long): BOOL

public expect fun InternetGetLastResponseInfoW(lpdwerror: Long, lpszbuffer: PWSTR, lpdwbufferlength: Long): BOOL

public expect fun InternetGetPerSiteCookieDecisionA(pchhostname: PCSTR, presult: Long): BOOL

public expect fun InternetGetPerSiteCookieDecisionW(pchhostname: PCWSTR, presult: Long): BOOL

public expect fun InternetGetProxyForUrl(hinternet: Long, pcwszurl: PCWSTR, pproxyinfolist: Long): UInt

public expect fun InternetGetSecurityInfoByURL(lpszurl: PCSTR, ppcertchain: Long, pdwsecureflags: Long): BOOL

public expect fun InternetGetSecurityInfoByURLA(lpszurl: PCSTR, ppcertchain: Long, pdwsecureflags: Long): BOOL

public expect fun InternetGetSecurityInfoByURLW(lpszurl: PCWSTR, ppcertchain: Long, pdwsecureflags: Long): BOOL

public expect fun InternetGoOnline(lpszurl: PCSTR, hwndparent: HWND, dwflags: UInt): BOOL

public expect fun InternetGoOnlineA(lpszurl: PCSTR, hwndparent: HWND, dwflags: UInt): BOOL

public expect fun InternetGoOnlineW(lpszurl: PCWSTR, hwndparent: HWND, dwflags: UInt): BOOL

public expect fun InternetHangUp(dwconnection: ULong, dwreserved: UInt): UInt

public expect fun InternetInitializeAutoProxyDll(dwreserved: UInt): BOOL

public expect fun InternetLockRequestFile(hinternet: Long, lphlockrequestinfo: Long): BOOL

public expect fun InternetOpenA(lpszagent: PCSTR, dwaccesstype: UInt, lpszproxy: PCSTR, lpszproxybypass: PCSTR, dwflags: UInt): Long

public expect fun InternetOpenUrlA(hinternet: Long, lpszurl: PCSTR, lpszheaders: PCSTR, dwheaderslength: UInt, dwflags: UInt, dwcontext: ULong): Long

public expect fun InternetOpenUrlW(hinternet: Long, lpszurl: PCWSTR, lpszheaders: PCWSTR, dwheaderslength: UInt, dwflags: UInt, dwcontext: ULong): Long

public expect fun InternetOpenW(lpszagent: PCWSTR, dwaccesstype: UInt, lpszproxy: PCWSTR, lpszproxybypass: PCWSTR, dwflags: UInt): Long

public expect fun InternetQueryDataAvailable(hfile: Long, lpdwnumberofbytesavailable: Long, dwflags: UInt, dwcontext: ULong): BOOL

public expect fun InternetQueryFortezzaStatus(pdwstatus: Long, dwreserved: ULong): BOOL

public expect fun InternetQueryOptionA(hinternet: Long, dwoption: UInt, lpbuffer: Long, lpdwbufferlength: Long): BOOL

public expect fun InternetQueryOptionW(hinternet: Long, dwoption: UInt, lpbuffer: Long, lpdwbufferlength: Long): BOOL

public expect fun InternetReadFile(hfile: Long, lpbuffer: Long, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: Long): BOOL

public expect fun InternetReadFileExA(hfile: Long, lpbuffersout: Long, dwflags: UInt, dwcontext: ULong): BOOL

public expect fun InternetReadFileExW(hfile: Long, lpbuffersout: Long, dwflags: UInt, dwcontext: ULong): BOOL

public expect fun InternetSecurityProtocolToStringA(dwprotocol: UInt, lpstr: PSTR, lpdwstrlength: Long, dwreserved: UInt): BOOL

public expect fun InternetSecurityProtocolToStringW(dwprotocol: UInt, lpstr: PWSTR, lpdwstrlength: Long, dwreserved: UInt): BOOL

public expect fun InternetSetCookieA(lpszurl: PCSTR, lpszcookiename: PCSTR, lpszcookiedata: PCSTR): BOOL

public expect fun InternetSetCookieEx2(pcwszurl: PCWSTR, pcookie: Long, pcwszp3ppolicy: PCWSTR, dwflags: UInt, pdwcookiestate: Long): UInt

public expect fun InternetSetCookieExA(lpszurl: PCSTR, lpszcookiename: PCSTR, lpszcookiedata: PCSTR, dwflags: UInt, dwreserved: ULong): UInt

public expect fun InternetSetCookieExW(lpszurl: PCWSTR, lpszcookiename: PCWSTR, lpszcookiedata: PCWSTR, dwflags: UInt, dwreserved: ULong): UInt

public expect fun InternetSetCookieW(lpszurl: PCWSTR, lpszcookiename: PCWSTR, lpszcookiedata: PCWSTR): BOOL

public expect fun InternetSetDialState(lpszconnectoid: PCSTR, dwstate: UInt, dwreserved: UInt): BOOL

public expect fun InternetSetDialStateA(lpszconnectoid: PCSTR, dwstate: UInt, dwreserved: UInt): BOOL

public expect fun InternetSetDialStateW(lpszconnectoid: PCWSTR, dwstate: UInt, dwreserved: UInt): BOOL

public expect fun InternetSetFilePointer(hfile: Long, ldistancetomove: Int, lpdistancetomovehigh: Long, dwmovemethod: UInt, dwcontext: ULong): UInt

public expect fun InternetSetOptionA(hinternet: Long, dwoption: UInt, lpbuffer: Long, dwbufferlength: UInt): BOOL

public expect fun InternetSetOptionExA(hinternet: Long, dwoption: UInt, lpbuffer: Long, dwbufferlength: UInt, dwflags: UInt): BOOL

public expect fun InternetSetOptionExW(hinternet: Long, dwoption: UInt, lpbuffer: Long, dwbufferlength: UInt, dwflags: UInt): BOOL

public expect fun InternetSetOptionW(hinternet: Long, dwoption: UInt, lpbuffer: Long, dwbufferlength: UInt): BOOL

public expect fun InternetSetPerSiteCookieDecisionA(pchhostname: PCSTR, dwdecision: UInt): BOOL

public expect fun InternetSetPerSiteCookieDecisionW(pchhostname: PCWSTR, dwdecision: UInt): BOOL

public expect fun InternetSetStatusCallback(hinternet: Long, lpfninternetcallback: LPINTERNET_STATUS_CALLBACK): LPINTERNET_STATUS_CALLBACK

public expect fun InternetSetStatusCallbackA(hinternet: Long, lpfninternetcallback: LPINTERNET_STATUS_CALLBACK): LPINTERNET_STATUS_CALLBACK

public expect fun InternetSetStatusCallbackW(hinternet: Long, lpfninternetcallback: LPINTERNET_STATUS_CALLBACK): LPINTERNET_STATUS_CALLBACK

public expect fun InternetShowSecurityInfoByURL(lpszurl: PCSTR, hwndparent: HWND): BOOL

public expect fun InternetShowSecurityInfoByURLA(lpszurl: PCSTR, hwndparent: HWND): BOOL

public expect fun InternetShowSecurityInfoByURLW(lpszurl: PCWSTR, hwndparent: HWND): BOOL

public expect fun InternetTimeFromSystemTime(pst: Long, dwrfc: UInt, lpsztime: PSTR, cbtime: UInt): BOOL

public expect fun InternetTimeFromSystemTimeA(pst: Long, dwrfc: UInt, lpsztime: PSTR, cbtime: UInt): BOOL

public expect fun InternetTimeFromSystemTimeW(pst: Long, dwrfc: UInt, lpsztime: PWSTR, cbtime: UInt): BOOL

public expect fun InternetTimeToSystemTime(lpsztime: PCSTR, pst: Long, dwreserved: UInt): BOOL

public expect fun InternetTimeToSystemTimeA(lpsztime: PCSTR, pst: Long, dwreserved: UInt): BOOL

public expect fun InternetTimeToSystemTimeW(lpsztime: PCWSTR, pst: Long, dwreserved: UInt): BOOL

public expect fun InternetUnlockRequestFile(hlockrequestinfo: HANDLE): BOOL

public expect fun InternetWriteFile(hfile: Long, lpbuffer: Long, dwnumberofbytestowrite: UInt, lpdwnumberofbyteswritten: Long): BOOL

public expect fun InternetWriteFileExA(hfile: Long, lpbuffersin: Long, dwflags: UInt, dwcontext: ULong): BOOL

public expect fun InternetWriteFileExW(hfile: Long, lpbuffersin: Long, dwflags: UInt, dwcontext: ULong): BOOL

public expect fun IsDomainLegalCookieDomainA(pchdomain: PCSTR, pchfulldomain: PCSTR): BOOL

public expect fun IsDomainLegalCookieDomainW(pchdomain: PCWSTR, pchfulldomain: PCWSTR): BOOL

public expect fun IsHostInProxyBypassList(tscheme: INTERNET_SCHEME, lpszhost: PCSTR, cchhost: UInt): BOOL

public expect fun IsProfilesEnabled(): BOOL

public expect fun IsUrlCacheEntryExpiredA(lpszurlname: PCSTR, dwflags: UInt, pftlastmodified: Long): BOOL

public expect fun IsUrlCacheEntryExpiredW(lpszurlname: PCWSTR, dwflags: UInt, pftlastmodified: Long): BOOL

public expect fun LoadUrlCacheContent(): BOOL

public expect fun ParseX509EncodedCertificateForListBoxEntry(lpcert: Long, cbcert: UInt, lpszlistboxentry: PSTR, lpdwlistboxentry: Long): UInt

public expect fun PerformOperationOverUrlCacheA(pszurlsearchpattern: PCSTR, dwflags: UInt, dwfilter: UInt, groupid: Long, preserved1: Long, pdwreserved2: Long, preserved3: Long, op: CACHE_OPERATOR, poperatordata: Long): BOOL

public expect fun PrivacyGetZonePreferenceW(dwzone: UInt, dwtype: UInt, pdwtemplate: Long, pszbuffer: PWSTR, pdwbufferlength: Long): UInt

public expect fun PrivacySetZonePreferenceW(dwzone: UInt, dwtype: UInt, dwtemplate: UInt, pszpreference: PCWSTR): UInt

public expect fun ReadGuidsForConnectedNetworks(pcnetworks: Long, pppwsznetworkguids: Long, pppbstrnetworknames: Long, pppwszgwmacs: Long, pcgatewaymacs: Long, pdwflags: Long): BOOL

public expect fun ReadUrlCacheEntryStream(hurlcachestream: HANDLE, dwlocation: UInt, lpbuffer: Long, lpdwlen: Long, reserved: UInt): BOOL

public expect fun ReadUrlCacheEntryStreamEx(hurlcachestream: HANDLE, qwlocation: ULong, lpbuffer: Long, lpdwlen: Long): BOOL

public expect fun RegisterUrlCacheNotification(hwnd: HWND, umsg: UInt, gid: Long, dwopsfilter: UInt, dwreserved: UInt): BOOL

public expect fun ResumeSuspendedDownload(hrequest: Long, dwresultcode: UInt): BOOL

public expect fun RetrieveUrlCacheEntryFileA(lpszurlname: PCSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, dwreserved: UInt): BOOL

public expect fun RetrieveUrlCacheEntryFileW(lpszurlname: PCWSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, dwreserved: UInt): BOOL

public expect fun RetrieveUrlCacheEntryStreamA(lpszurlname: PCSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, frandomread: BOOL, dwreserved: UInt): HANDLE

public expect fun RetrieveUrlCacheEntryStreamW(lpszurlname: PCWSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, frandomread: BOOL, dwreserved: UInt): HANDLE

public expect fun RunOnceUrlCache(hwnd: HWND, hinst: HINSTANCE, lpszcmd: PCSTR, ncmdshow: Int): UInt

public expect fun SetUrlCacheConfigInfoA(lpcacheconfiginfo: Long, dwfieldcontrol: UInt): BOOL

public expect fun SetUrlCacheConfigInfoW(lpcacheconfiginfo: Long, dwfieldcontrol: UInt): BOOL

public expect fun SetUrlCacheEntryGroup(lpszurlname: PCSTR, dwflags: UInt, groupid: Long, pbgroupattributes: Long, cbgroupattributes: UInt, lpreserved: Long): BOOL

public expect fun SetUrlCacheEntryGroupA(lpszurlname: PCSTR, dwflags: UInt, groupid: Long, pbgroupattributes: Long, cbgroupattributes: UInt, lpreserved: Long): BOOL

public expect fun SetUrlCacheEntryGroupW(lpszurlname: PCWSTR, dwflags: UInt, groupid: Long, pbgroupattributes: Long, cbgroupattributes: UInt, lpreserved: Long): BOOL

public expect fun SetUrlCacheEntryInfoA(lpszurlname: PCSTR, lpcacheentryinfo: Long, dwfieldcontrol: UInt): BOOL

public expect fun SetUrlCacheEntryInfoW(lpszurlname: PCWSTR, lpcacheentryinfo: Long, dwfieldcontrol: UInt): BOOL

public expect fun SetUrlCacheGroupAttributeA(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: Long, lpreserved: Long): BOOL

public expect fun SetUrlCacheGroupAttributeW(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: Long, lpreserved: Long): BOOL

public expect fun SetUrlCacheHeaderData(nidx: UInt, dwdata: UInt): BOOL

public expect fun ShowClientAuthCerts(hwndparent: HWND): UInt

public expect fun ShowSecurityInfo(hwndparent: HWND, psecurityinfo: Long): UInt

public expect fun ShowX509EncodedCertificate(hwndparent: HWND, lpcert: Long, cbcert: UInt): UInt

public expect fun UnlockUrlCacheEntryFile(lpszurlname: PCSTR, dwreserved: UInt): BOOL

public expect fun UnlockUrlCacheEntryFileA(lpszurlname: PCSTR, dwreserved: UInt): BOOL

public expect fun UnlockUrlCacheEntryFileW(lpszurlname: PCWSTR, dwreserved: UInt): BOOL

public expect fun UnlockUrlCacheEntryStream(hurlcachestream: HANDLE, reserved: UInt): BOOL

public expect fun UpdateUrlCacheContentPath(sznewpath: PCSTR): BOOL

public expect fun UrlCacheCheckEntriesExist(rgpwszurls: Long, centries: UInt, rgfexist: Long): UInt

public expect fun UrlCacheCloseEntryHandle(hentryfile: Long)

public expect fun UrlCacheContainerSetEntryMaximumAge(pwszprefix: PCWSTR, dwentrymaxage: UInt): UInt

public expect fun UrlCacheCreateContainer(pwszname: PCWSTR, pwszprefix: PCWSTR, pwszdirectory: PCWSTR, ulllimit: ULong, dwoptions: UInt): UInt

public expect fun UrlCacheFindFirstEntry(pwszprefix: PCWSTR, dwflags: UInt, dwfilter: UInt, groupid: Long, pcacheentryinfo: Long, phfind: Long): UInt

public expect fun UrlCacheFindNextEntry(hfind: HANDLE, pcacheentryinfo: Long): UInt

public expect fun UrlCacheFreeEntryInfo(pcacheentryinfo: Long)

public expect fun UrlCacheFreeGlobalSpace(ulltargetsize: ULong, dwfilter: UInt): UInt

public expect fun UrlCacheGetContentPaths(pppwszdirectories: Long, pcdirectories: Long): UInt

public expect fun UrlCacheGetEntryInfo(happcache: Long, pcwszurl: PCWSTR, pcacheentryinfo: Long): UInt

public expect fun UrlCacheGetGlobalCacheSize(dwfilter: UInt, pullsize: Long, pulllimit: Long): UInt

public expect fun UrlCacheGetGlobalLimit(limittype: URL_CACHE_LIMIT_TYPE, pulllimit: Long): UInt

public expect fun UrlCacheReadEntryStream(hurlcachestream: Long, ulllocation: ULong, pbuffer: Long, dwbufferlen: UInt, pdwbufferlen: Long): UInt

public expect fun UrlCacheReloadSettings(): UInt

public expect fun UrlCacheRetrieveEntryFile(happcache: Long, pcwszurl: PCWSTR, pcacheentryinfo: Long, phentryfile: Long): UInt

public expect fun UrlCacheRetrieveEntryStream(happcache: Long, pcwszurl: PCWSTR, frandomread: BOOL, pcacheentryinfo: Long, phentrystream: Long): UInt

public expect fun UrlCacheServer(): UInt

public expect fun UrlCacheSetGlobalLimit(limittype: URL_CACHE_LIMIT_TYPE, ulllimit: ULong): UInt

public expect fun UrlCacheUpdateEntryExtraData(happcache: Long, pcwszurl: PCWSTR, pbextradata: Long, cbextradata: UInt): UInt
