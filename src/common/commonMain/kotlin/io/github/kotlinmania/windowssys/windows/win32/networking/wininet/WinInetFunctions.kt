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

public expect fun appCacheCheckManifest(pwszmasterurl: Pcwstr, pwszmanifesturl: Pcwstr, pbmanifestdata: COpaquePointer?, dwmanifestdatasize: UInt, pbmanifestresponseheaders: COpaquePointer?, dwmanifestresponseheaderssize: UInt, pestate: COpaquePointer?, phnewappcache: COpaquePointer?): UInt

public expect fun appCacheCloseHandle(happcache: COpaquePointer?)

public expect fun appCacheCreateAndCommitFile(happcache: COpaquePointer?, pwszsourcefilepath: Pcwstr, pwszurl: Pcwstr, pbresponseheaders: COpaquePointer?, dwresponseheaderssize: UInt): UInt

public expect fun appCacheDeleteGroup(pwszmanifesturl: Pcwstr): UInt

public expect fun appCacheDeleteIEGroup(pwszmanifesturl: Pcwstr): UInt

public expect fun appCacheDuplicateHandle(happcache: COpaquePointer?, phduplicatedappcache: COpaquePointer?): UInt

public expect fun appCacheFinalize(happcache: COpaquePointer?, pbmanifestdata: COpaquePointer?, dwmanifestdatasize: UInt, pestate: COpaquePointer?): UInt

public expect fun appCacheFreeDownloadList(pdownloadlist: COpaquePointer?)

public expect fun appCacheFreeGroupList(pappcachegrouplist: COpaquePointer?)

public expect fun appCacheFreeIESpace(ftcutoff: Filetime): UInt

public expect fun appCacheFreeSpace(ftcutoff: Filetime): UInt

public expect fun appCacheGetDownloadList(happcache: COpaquePointer?, pdownloadlist: COpaquePointer?): UInt

public expect fun appCacheGetFallbackUrl(happcache: COpaquePointer?, pwszurl: Pcwstr, ppwszfallbackurl: COpaquePointer?): UInt

public expect fun appCacheGetGroupList(pappcachegrouplist: COpaquePointer?): UInt

public expect fun appCacheGetIEGroupList(pappcachegrouplist: COpaquePointer?): UInt

public expect fun appCacheGetInfo(happcache: COpaquePointer?, pappcacheinfo: COpaquePointer?): UInt

public expect fun appCacheGetManifestUrl(happcache: COpaquePointer?, ppwszmanifesturl: COpaquePointer?): UInt

public expect fun appCacheLookup(pwszurl: Pcwstr, dwflags: UInt, phappcache: COpaquePointer?): UInt

public expect fun commitUrlCacheEntryA(lpszurlname: Pcstr, lpszlocalfilename: Pcstr, expiretime: Filetime, lastmodifiedtime: Filetime, cacheentrytype: UInt, lpheaderinfo: COpaquePointer?, cchheaderinfo: UInt, lpszfileextension: Pcstr, lpszoriginalurl: Pcstr): Bool

public expect fun commitUrlCacheEntryBinaryBlob(pwszurlname: Pcwstr, dwtype: UInt, ftexpiretime: Filetime, ftmodifiedtime: Filetime, pbblob: COpaquePointer?, cbblob: UInt): UInt

public expect fun commitUrlCacheEntryW(lpszurlname: Pcwstr, lpszlocalfilename: Pcwstr, expiretime: Filetime, lastmodifiedtime: Filetime, cacheentrytype: UInt, lpszheaderinfo: Pcwstr, cchheaderinfo: UInt, lpszfileextension: Pcwstr, lpszoriginalurl: Pcwstr): Bool

public expect fun createMD5SSOHash(pszchallengeinfo: Pcwstr, pwszrealm: Pcwstr, pwsztarget: Pcwstr, pbhexhash: COpaquePointer?): Bool

public expect fun createUrlCacheContainerA(name: Pcstr, lpcacheprefix: Pcstr, lpszcachepath: Pcstr, kbcachelimit: UInt, dwcontainertype: UInt, dwoptions: UInt, pvbuffer: COpaquePointer?, cbbuffer: COpaquePointer?): Bool

public expect fun createUrlCacheContainerW(name: Pcwstr, lpcacheprefix: Pcwstr, lpszcachepath: Pcwstr, kbcachelimit: UInt, dwcontainertype: UInt, dwoptions: UInt, pvbuffer: COpaquePointer?, cbbuffer: COpaquePointer?): Bool

public expect fun createUrlCacheEntryA(lpszurlname: Pcstr, dwexpectedfilesize: UInt, lpszfileextension: Pcstr, lpszfilename: Pstr, dwreserved: UInt): Bool

public expect fun createUrlCacheEntryExW(lpszurlname: Pcwstr, dwexpectedfilesize: UInt, lpszfileextension: Pcwstr, lpszfilename: Pwstr, dwreserved: UInt, fpreserveincomingfilename: Bool): Bool

public expect fun createUrlCacheEntryW(lpszurlname: Pcwstr, dwexpectedfilesize: UInt, lpszfileextension: Pcwstr, lpszfilename: Pwstr, dwreserved: UInt): Bool

public expect fun createUrlCacheGroup(dwflags: UInt, lpreserved: COpaquePointer?): Long

public expect fun deleteIE3Cache(hwnd: Hwnd, hinst: Hinstance, lpszcmd: Pcstr, ncmdshow: Int): UInt

public expect fun deleteUrlCacheContainerA(name: Pcstr, dwoptions: UInt): Bool

public expect fun deleteUrlCacheContainerW(name: Pcwstr, dwoptions: UInt): Bool

public expect fun deleteUrlCacheEntry(lpszurlname: Pcstr): Bool

public expect fun deleteUrlCacheEntryA(lpszurlname: Pcstr): Bool

public expect fun deleteUrlCacheEntryW(lpszurlname: Pcwstr): Bool

public expect fun deleteUrlCacheGroup(groupid: Long, dwflags: UInt, lpreserved: COpaquePointer?): Bool

public expect fun deleteWpadCacheForNetworks(param0: WpadCacheDelete): Bool

public expect fun detectAutoProxyUrl(pszautoproxyurl: Pstr, cchautoproxyurl: UInt, dwdetectflags: ProxyAutoDetectType): Bool

public expect fun doConnectoidsExist(): Bool

public expect fun exportCookieFileA(szfilename: Pcstr, fappend: Bool): Bool

public expect fun exportCookieFileW(szfilename: Pcwstr, fappend: Bool): Bool

public expect fun findCloseUrlCache(henumhandle: Handle): Bool

public expect fun findFirstUrlCacheContainerA(pdwmodified: COpaquePointer?, lpcontainerinfo: COpaquePointer?, lpcbcontainerinfo: COpaquePointer?, dwoptions: UInt): Handle

public expect fun findFirstUrlCacheContainerW(pdwmodified: COpaquePointer?, lpcontainerinfo: COpaquePointer?, lpcbcontainerinfo: COpaquePointer?, dwoptions: UInt): Handle

public expect fun findFirstUrlCacheEntryA(lpszurlsearchpattern: Pcstr, lpfirstcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?): Handle

public expect fun findFirstUrlCacheEntryExA(lpszurlsearchpattern: Pcstr, dwflags: UInt, dwfilter: UInt, groupid: Long, lpfirstcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, lpgroupattributes: COpaquePointer?, lpcbgroupattributes: COpaquePointer?, lpreserved: COpaquePointer?): Handle

public expect fun findFirstUrlCacheEntryExW(lpszurlsearchpattern: Pcwstr, dwflags: UInt, dwfilter: UInt, groupid: Long, lpfirstcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, lpgroupattributes: COpaquePointer?, lpcbgroupattributes: COpaquePointer?, lpreserved: COpaquePointer?): Handle

public expect fun findFirstUrlCacheEntryW(lpszurlsearchpattern: Pcwstr, lpfirstcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?): Handle

public expect fun findFirstUrlCacheGroup(dwflags: UInt, dwfilter: UInt, lpsearchcondition: COpaquePointer?, dwsearchcondition: UInt, lpgroupid: COpaquePointer?, lpreserved: COpaquePointer?): Handle

public expect fun findNextUrlCacheContainerA(henumhandle: Handle, lpcontainerinfo: COpaquePointer?, lpcbcontainerinfo: COpaquePointer?): Bool

public expect fun findNextUrlCacheContainerW(henumhandle: Handle, lpcontainerinfo: COpaquePointer?, lpcbcontainerinfo: COpaquePointer?): Bool

public expect fun findNextUrlCacheEntryA(henumhandle: Handle, lpnextcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?): Bool

public expect fun findNextUrlCacheEntryExA(henumhandle: Handle, lpnextcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, lpgroupattributes: COpaquePointer?, lpcbgroupattributes: COpaquePointer?, lpreserved: COpaquePointer?): Bool

public expect fun findNextUrlCacheEntryExW(henumhandle: Handle, lpnextcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, lpgroupattributes: COpaquePointer?, lpcbgroupattributes: COpaquePointer?, lpreserved: COpaquePointer?): Bool

public expect fun findNextUrlCacheEntryW(henumhandle: Handle, lpnextcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?): Bool

public expect fun findNextUrlCacheGroup(hfind: Handle, lpgroupid: COpaquePointer?, lpreserved: COpaquePointer?): Bool

public expect fun findP3PPolicySymbol(pszsymbol: Pcstr): Int

public expect fun freeUrlCacheSpaceA(lpszcachepath: Pcstr, dwsize: UInt, dwfilter: UInt): Bool

public expect fun freeUrlCacheSpaceW(lpszcachepath: Pcwstr, dwsize: UInt, dwfilter: UInt): Bool

public expect fun ftpCommandA(hconnect: COpaquePointer?, fexpectresponse: Bool, dwflags: FtpFlags, lpszcommand: Pcstr, dwcontext: ULong, phftpcommand: COpaquePointer?): Bool

public expect fun ftpCommandW(hconnect: COpaquePointer?, fexpectresponse: Bool, dwflags: FtpFlags, lpszcommand: Pcwstr, dwcontext: ULong, phftpcommand: COpaquePointer?): Bool

public expect fun ftpCreateDirectoryA(hconnect: COpaquePointer?, lpszdirectory: Pcstr): Bool

public expect fun ftpCreateDirectoryW(hconnect: COpaquePointer?, lpszdirectory: Pcwstr): Bool

public expect fun ftpDeleteFileA(hconnect: COpaquePointer?, lpszfilename: Pcstr): Bool

public expect fun ftpDeleteFileW(hconnect: COpaquePointer?, lpszfilename: Pcwstr): Bool

public expect fun ftpFindFirstFileA(hconnect: COpaquePointer?, lpszsearchfile: Pcstr, lpfindfiledata: COpaquePointer?, dwflags: UInt, dwcontext: ULong): COpaquePointer?

public expect fun ftpFindFirstFileW(hconnect: COpaquePointer?, lpszsearchfile: Pcwstr, lpfindfiledata: COpaquePointer?, dwflags: UInt, dwcontext: ULong): COpaquePointer?

public expect fun ftpGetCurrentDirectoryA(hconnect: COpaquePointer?, lpszcurrentdirectory: Pstr, lpdwcurrentdirectory: COpaquePointer?): Bool

public expect fun ftpGetCurrentDirectoryW(hconnect: COpaquePointer?, lpszcurrentdirectory: Pwstr, lpdwcurrentdirectory: COpaquePointer?): Bool

public expect fun ftpGetFileA(hconnect: COpaquePointer?, lpszremotefile: Pcstr, lpsznewfile: Pcstr, ffailifexists: Bool, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): Bool

public expect fun ftpGetFileEx(hftpsession: COpaquePointer?, lpszremotefile: Pcstr, lpsznewfile: Pcwstr, ffailifexists: Bool, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): Bool

public expect fun ftpGetFileSize(hfile: COpaquePointer?, lpdwfilesizehigh: COpaquePointer?): UInt

public expect fun ftpGetFileW(hconnect: COpaquePointer?, lpszremotefile: Pcwstr, lpsznewfile: Pcwstr, ffailifexists: Bool, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): Bool

public expect fun ftpOpenFileA(hconnect: COpaquePointer?, lpszfilename: Pcstr, dwaccess: UInt, dwflags: FtpFlags, dwcontext: ULong): COpaquePointer?

public expect fun ftpOpenFileW(hconnect: COpaquePointer?, lpszfilename: Pcwstr, dwaccess: UInt, dwflags: FtpFlags, dwcontext: ULong): COpaquePointer?

public expect fun ftpPutFileA(hconnect: COpaquePointer?, lpszlocalfile: Pcstr, lpsznewremotefile: Pcstr, dwflags: FtpFlags, dwcontext: ULong): Bool

public expect fun ftpPutFileEx(hftpsession: COpaquePointer?, lpszlocalfile: Pcwstr, lpsznewremotefile: Pcstr, dwflags: UInt, dwcontext: ULong): Bool

public expect fun ftpPutFileW(hconnect: COpaquePointer?, lpszlocalfile: Pcwstr, lpsznewremotefile: Pcwstr, dwflags: FtpFlags, dwcontext: ULong): Bool

public expect fun ftpRemoveDirectoryA(hconnect: COpaquePointer?, lpszdirectory: Pcstr): Bool

public expect fun ftpRemoveDirectoryW(hconnect: COpaquePointer?, lpszdirectory: Pcwstr): Bool

public expect fun ftpRenameFileA(hconnect: COpaquePointer?, lpszexisting: Pcstr, lpsznew: Pcstr): Bool

public expect fun ftpRenameFileW(hconnect: COpaquePointer?, lpszexisting: Pcwstr, lpsznew: Pcwstr): Bool

public expect fun ftpSetCurrentDirectoryA(hconnect: COpaquePointer?, lpszdirectory: Pcstr): Bool

public expect fun ftpSetCurrentDirectoryW(hconnect: COpaquePointer?, lpszdirectory: Pcwstr): Bool

public expect fun getDiskInfoA(pszpath: Pcstr, pdwclustersize: COpaquePointer?, pdlavail: COpaquePointer?, pdltotal: COpaquePointer?): Bool

public expect fun getUrlCacheConfigInfoA(lpcacheconfiginfo: COpaquePointer?, lpcbcacheconfiginfo: COpaquePointer?, dwfieldcontrol: CacheConfig): Bool

public expect fun getUrlCacheConfigInfoW(lpcacheconfiginfo: COpaquePointer?, lpcbcacheconfiginfo: COpaquePointer?, dwfieldcontrol: CacheConfig): Bool

public expect fun getUrlCacheEntryBinaryBlob(pwszurlname: Pcwstr, dwtype: COpaquePointer?, pftexpiretime: COpaquePointer?, pftaccesstime: COpaquePointer?, pftmodifiedtime: COpaquePointer?, ppbblob: COpaquePointer?, pcbblob: COpaquePointer?): UInt

public expect fun getUrlCacheEntryInfoA(lpszurlname: Pcstr, lpcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?): Bool

public expect fun getUrlCacheEntryInfoExA(lpszurl: Pcstr, lpcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, lpszredirecturl: Pcstr, lpcbredirecturl: COpaquePointer?, lpreserved: COpaquePointer?, dwflags: UInt): Bool

public expect fun getUrlCacheEntryInfoExW(lpszurl: Pcwstr, lpcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, lpszredirecturl: Pcwstr, lpcbredirecturl: COpaquePointer?, lpreserved: COpaquePointer?, dwflags: UInt): Bool

public expect fun getUrlCacheEntryInfoW(lpszurlname: Pcwstr, lpcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?): Bool

public expect fun getUrlCacheGroupAttributeA(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: COpaquePointer?, lpcbgroupinfo: COpaquePointer?, lpreserved: COpaquePointer?): Bool

public expect fun getUrlCacheGroupAttributeW(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: COpaquePointer?, lpcbgroupinfo: COpaquePointer?, lpreserved: COpaquePointer?): Bool

public expect fun getUrlCacheHeaderData(nidx: UInt, lpdwdata: COpaquePointer?): Bool

public expect fun gopherCreateLocatorA(lpszhost: Pcstr, nserverport: UShort, lpszdisplaystring: Pcstr, lpszselectorstring: Pcstr, dwgophertype: UInt, lpszlocator: Pstr, lpdwbufferlength: COpaquePointer?): Bool

public expect fun gopherCreateLocatorW(lpszhost: Pcwstr, nserverport: UShort, lpszdisplaystring: Pcwstr, lpszselectorstring: Pcwstr, dwgophertype: UInt, lpszlocator: Pwstr, lpdwbufferlength: COpaquePointer?): Bool

public expect fun gopherFindFirstFileA(hconnect: COpaquePointer?, lpszlocator: Pcstr, lpszsearchstring: Pcstr, lpfinddata: COpaquePointer?, dwflags: UInt, dwcontext: ULong): COpaquePointer?

public expect fun gopherFindFirstFileW(hconnect: COpaquePointer?, lpszlocator: Pcwstr, lpszsearchstring: Pcwstr, lpfinddata: COpaquePointer?, dwflags: UInt, dwcontext: ULong): COpaquePointer?

public expect fun gopherGetAttributeA(hconnect: COpaquePointer?, lpszlocator: Pcstr, lpszattributename: Pcstr, lpbuffer: COpaquePointer?, dwbufferlength: UInt, lpdwcharactersreturned: COpaquePointer?, lpfnenumerator: GopherAttributeEnumerator, dwcontext: ULong): Bool

public expect fun gopherGetAttributeW(hconnect: COpaquePointer?, lpszlocator: Pcwstr, lpszattributename: Pcwstr, lpbuffer: COpaquePointer?, dwbufferlength: UInt, lpdwcharactersreturned: COpaquePointer?, lpfnenumerator: GopherAttributeEnumerator, dwcontext: ULong): Bool

public expect fun gopherGetLocatorTypeA(lpszlocator: Pcstr, lpdwgophertype: COpaquePointer?): Bool

public expect fun gopherGetLocatorTypeW(lpszlocator: Pcwstr, lpdwgophertype: COpaquePointer?): Bool

public expect fun gopherOpenFileA(hconnect: COpaquePointer?, lpszlocator: Pcstr, lpszview: Pcstr, dwflags: UInt, dwcontext: ULong): COpaquePointer?

public expect fun gopherOpenFileW(hconnect: COpaquePointer?, lpszlocator: Pcwstr, lpszview: Pcwstr, dwflags: UInt, dwcontext: ULong): COpaquePointer?

public expect fun httpAddRequestHeadersA(hrequest: COpaquePointer?, lpszheaders: Pcstr, dwheaderslength: UInt, dwmodifiers: HttpAddreqFlag): Bool

public expect fun httpAddRequestHeadersW(hrequest: COpaquePointer?, lpszheaders: Pcwstr, dwheaderslength: UInt, dwmodifiers: HttpAddreqFlag): Bool

public expect fun httpCheckDavComplianceA(lpszurl: Pcstr, lpszcompliancetoken: Pcstr, lpffound: COpaquePointer?, hwnd: Hwnd, lpvreserved: COpaquePointer?): Bool

public expect fun httpCheckDavComplianceW(lpszurl: Pcwstr, lpszcompliancetoken: Pcwstr, lpffound: COpaquePointer?, hwnd: Hwnd, lpvreserved: COpaquePointer?): Bool

public expect fun httpCloseDependencyHandle(hdependencyhandle: COpaquePointer?)

public expect fun httpDuplicateDependencyHandle(hdependencyhandle: COpaquePointer?, phduplicateddependencyhandle: COpaquePointer?): UInt

public expect fun httpEndRequestA(hrequest: COpaquePointer?, lpbuffersout: COpaquePointer?, dwflags: UInt, dwcontext: ULong): Bool

public expect fun httpEndRequestW(hrequest: COpaquePointer?, lpbuffersout: COpaquePointer?, dwflags: UInt, dwcontext: ULong): Bool

public expect fun httpGetServerCredentials(pwszurl: Pcwstr, ppwszusername: COpaquePointer?, ppwszpassword: COpaquePointer?): UInt

public expect fun httpIndicatePageLoadComplete(hdependencyhandle: COpaquePointer?): UInt

public expect fun httpIsHostHstsEnabled(pcwszurl: Pcwstr, pfishsts: COpaquePointer?): UInt

public expect fun httpOpenDependencyHandle(hrequesthandle: COpaquePointer?, fbackground: Bool, phdependencyhandle: COpaquePointer?): UInt

public expect fun httpOpenRequestA(hconnect: COpaquePointer?, lpszverb: Pcstr, lpszobjectname: Pcstr, lpszversion: Pcstr, lpszreferrer: Pcstr, lplpszaccepttypes: COpaquePointer?, dwflags: UInt, dwcontext: ULong): COpaquePointer?

public expect fun httpOpenRequestW(hconnect: COpaquePointer?, lpszverb: Pcwstr, lpszobjectname: Pcwstr, lpszversion: Pcwstr, lpszreferrer: Pcwstr, lplpszaccepttypes: COpaquePointer?, dwflags: UInt, dwcontext: ULong): COpaquePointer?

public expect fun httpPushClose(hwait: HttpPushWaitHandle)

public expect fun httpPushEnable(hrequest: COpaquePointer?, ptransportsetting: COpaquePointer?, phwait: COpaquePointer?): UInt

public expect fun httpPushWait(hwait: HttpPushWaitHandle, etype: HttpPushWaitType, pnotificationstatus: COpaquePointer?): UInt

public expect fun httpQueryInfoA(hrequest: COpaquePointer?, dwinfolevel: UInt, lpbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?, lpdwindex: COpaquePointer?): Bool

public expect fun httpQueryInfoW(hrequest: COpaquePointer?, dwinfolevel: UInt, lpbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?, lpdwindex: COpaquePointer?): Bool

public expect fun httpSendRequestA(hrequest: COpaquePointer?, lpszheaders: Pcstr, dwheaderslength: UInt, lpoptional: COpaquePointer?, dwoptionallength: UInt): Bool

public expect fun httpSendRequestExA(hrequest: COpaquePointer?, lpbuffersin: COpaquePointer?, lpbuffersout: COpaquePointer?, dwflags: UInt, dwcontext: ULong): Bool

public expect fun httpSendRequestExW(hrequest: COpaquePointer?, lpbuffersin: COpaquePointer?, lpbuffersout: COpaquePointer?, dwflags: UInt, dwcontext: ULong): Bool

public expect fun httpSendRequestW(hrequest: COpaquePointer?, lpszheaders: Pcwstr, dwheaderslength: UInt, lpoptional: COpaquePointer?, dwoptionallength: UInt): Bool

public expect fun httpWebSocketClose(hwebsocket: COpaquePointer?, usstatus: UShort, pvreason: COpaquePointer?, dwreasonlength: UInt): Bool

public expect fun httpWebSocketCompleteUpgrade(hrequest: COpaquePointer?, dwcontext: ULong): COpaquePointer?

public expect fun httpWebSocketQueryCloseStatus(hwebsocket: COpaquePointer?, pusstatus: COpaquePointer?, pvreason: COpaquePointer?, dwreasonlength: UInt, pdwreasonlengthconsumed: COpaquePointer?): Bool

public expect fun httpWebSocketReceive(hwebsocket: COpaquePointer?, pvbuffer: COpaquePointer?, dwbufferlength: UInt, pdwbytesread: COpaquePointer?, pbuffertype: COpaquePointer?): Bool

public expect fun httpWebSocketSend(hwebsocket: COpaquePointer?, buffertype: HttpWebSocketBufferType, pvbuffer: COpaquePointer?, dwbufferlength: UInt): Bool

public expect fun httpWebSocketShutdown(hwebsocket: COpaquePointer?, usstatus: UShort, pvreason: COpaquePointer?, dwreasonlength: UInt): Bool

public expect fun importCookieFileA(szfilename: Pcstr): Bool

public expect fun importCookieFileW(szfilename: Pcwstr): Bool

public expect fun incrementUrlCacheHeaderData(nidx: UInt, lpdwdata: COpaquePointer?): Bool

public expect fun internalInternetGetCookie(lpszurl: Pcstr, lpszcookiedata: Pstr, lpdwdatasize: COpaquePointer?): UInt

public expect fun internetAlgIdToStringA(ai: AlgId, lpstr: Pstr, lpdwstrlength: COpaquePointer?, dwreserved: UInt): Bool

public expect fun internetAlgIdToStringW(ai: AlgId, lpstr: Pwstr, lpdwstrlength: COpaquePointer?, dwreserved: UInt): Bool

public expect fun internetAttemptConnect(dwreserved: UInt): UInt

public expect fun internetAutodial(dwflags: InternetAutodial, hwndparent: Hwnd): Bool

public expect fun internetAutodialHangup(dwreserved: UInt): Bool

public expect fun internetCanonicalizeUrlA(lpszurl: Pcstr, lpszbuffer: Pstr, lpdwbufferlength: COpaquePointer?, dwflags: UInt): Bool

public expect fun internetCanonicalizeUrlW(lpszurl: Pcwstr, lpszbuffer: Pwstr, lpdwbufferlength: COpaquePointer?, dwflags: UInt): Bool

public expect fun internetCheckConnectionA(lpszurl: Pcstr, dwflags: UInt, dwreserved: UInt): Bool

public expect fun internetCheckConnectionW(lpszurl: Pcwstr, dwflags: UInt, dwreserved: UInt): Bool

public expect fun internetClearAllPerSiteCookieDecisions(): Bool

public expect fun internetCloseHandle(hinternet: COpaquePointer?): Bool

public expect fun internetCombineUrlA(lpszbaseurl: Pcstr, lpszrelativeurl: Pcstr, lpszbuffer: Pstr, lpdwbufferlength: COpaquePointer?, dwflags: UInt): Bool

public expect fun internetCombineUrlW(lpszbaseurl: Pcwstr, lpszrelativeurl: Pcwstr, lpszbuffer: Pwstr, lpdwbufferlength: COpaquePointer?, dwflags: UInt): Bool

public expect fun internetConfirmZoneCrossing(hwnd: Hwnd, szurlprev: Pcstr, szurlnew: Pcstr, bpost: Bool): UInt

public expect fun internetConfirmZoneCrossingA(hwnd: Hwnd, szurlprev: Pcstr, szurlnew: Pcstr, bpost: Bool): UInt

public expect fun internetConfirmZoneCrossingW(hwnd: Hwnd, szurlprev: Pcwstr, szurlnew: Pcwstr, bpost: Bool): UInt

public expect fun internetConnectA(hinternet: COpaquePointer?, lpszservername: Pcstr, nserverport: UShort, lpszusername: Pcstr, lpszpassword: Pcstr, dwservice: UInt, dwflags: UInt, dwcontext: ULong): COpaquePointer?

public expect fun internetConnectW(hinternet: COpaquePointer?, lpszservername: Pcwstr, nserverport: UShort, lpszusername: Pcwstr, lpszpassword: Pcwstr, dwservice: UInt, dwflags: UInt, dwcontext: ULong): COpaquePointer?

public expect fun internetConvertUrlFromWireToWideChar(pcszurl: Pcstr, cchurl: UInt, pcwszbaseurl: Pcwstr, dwcodepagehost: UInt, dwcodepagepath: UInt, fencodepathextra: Bool, dwcodepageextra: UInt, ppwszconvertedurl: COpaquePointer?): UInt

public expect fun internetCrackUrlA(lpszurl: Pcstr, dwurllength: UInt, dwflags: WinHttpCreateUrlFlags, lpurlcomponents: COpaquePointer?): Bool

public expect fun internetCrackUrlW(lpszurl: Pcwstr, dwurllength: UInt, dwflags: WinHttpCreateUrlFlags, lpurlcomponents: COpaquePointer?): Bool

public expect fun internetCreateUrlA(lpurlcomponents: COpaquePointer?, dwflags: UInt, lpszurl: Pstr, lpdwurllength: COpaquePointer?): Bool

public expect fun internetCreateUrlW(lpurlcomponents: COpaquePointer?, dwflags: UInt, lpszurl: Pwstr, lpdwurllength: COpaquePointer?): Bool

public expect fun internetDial(hwndparent: Hwnd, lpszconnectoid: Pcstr, dwflags: UInt, lpdwconnection: COpaquePointer?, dwreserved: UInt): UInt

public expect fun internetDialA(hwndparent: Hwnd, lpszconnectoid: Pcstr, dwflags: UInt, lpdwconnection: COpaquePointer?, dwreserved: UInt): UInt

public expect fun internetDialW(hwndparent: Hwnd, lpszconnectoid: Pcwstr, dwflags: UInt, lpdwconnection: COpaquePointer?, dwreserved: UInt): UInt

public expect fun internetEnumPerSiteCookieDecisionA(pszsitename: Pstr, pcsitenamesize: COpaquePointer?, pdwdecision: COpaquePointer?, dwindex: UInt): Bool

public expect fun internetEnumPerSiteCookieDecisionW(pszsitename: Pwstr, pcsitenamesize: COpaquePointer?, pdwdecision: COpaquePointer?, dwindex: UInt): Bool

public expect fun internetErrorDlg(hwnd: Hwnd, hrequest: COpaquePointer?, dwerror: UInt, dwflags: UInt, lppvdata: COpaquePointer?): UInt

public expect fun internetFindNextFileA(hfind: COpaquePointer?, lpvfinddata: COpaquePointer?): Bool

public expect fun internetFindNextFileW(hfind: COpaquePointer?, lpvfinddata: COpaquePointer?): Bool

public expect fun internetFortezzaCommand(dwcommand: UInt, hwnd: Hwnd, dwreserved: ULong): Bool

public expect fun internetFreeCookies(pcookies: COpaquePointer?, dwcookiecount: UInt)

public expect fun internetFreeProxyInfoList(pproxyinfolist: COpaquePointer?)

public expect fun internetGetConnectedState(lpdwflags: COpaquePointer?, dwreserved: UInt): Bool

public expect fun internetGetConnectedStateEx(lpdwflags: COpaquePointer?, lpszconnectionname: Pstr, dwnamelen: UInt, dwreserved: UInt): Bool

public expect fun internetGetConnectedStateExA(lpdwflags: COpaquePointer?, lpszconnectionname: Pstr, cchnamelen: UInt, dwreserved: UInt): Bool

public expect fun internetGetConnectedStateExW(lpdwflags: COpaquePointer?, lpszconnectionname: Pwstr, cchnamelen: UInt, dwreserved: UInt): Bool

public expect fun internetGetCookieA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pstr, lpdwsize: COpaquePointer?): Bool

public expect fun internetGetCookieEx2(pcwszurl: Pcwstr, pcwszcookiename: Pcwstr, dwflags: UInt, ppcookies: COpaquePointer?, pdwcookiecount: COpaquePointer?): UInt

public expect fun internetGetCookieExA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pcstr, lpdwsize: COpaquePointer?, dwflags: InternetCookieFlags, lpreserved: COpaquePointer?): Bool

public expect fun internetGetCookieExW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr, lpdwsize: COpaquePointer?, dwflags: InternetCookieFlags, lpreserved: COpaquePointer?): Bool

public expect fun internetGetCookieW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pwstr, lpdwsize: COpaquePointer?): Bool

public expect fun internetGetLastResponseInfoA(lpdwerror: COpaquePointer?, lpszbuffer: Pstr, lpdwbufferlength: COpaquePointer?): Bool

public expect fun internetGetLastResponseInfoW(lpdwerror: COpaquePointer?, lpszbuffer: Pwstr, lpdwbufferlength: COpaquePointer?): Bool

public expect fun internetGetPerSiteCookieDecisionA(pchhostname: Pcstr, presult: COpaquePointer?): Bool

public expect fun internetGetPerSiteCookieDecisionW(pchhostname: Pcwstr, presult: COpaquePointer?): Bool

public expect fun internetGetProxyForUrl(hinternet: COpaquePointer?, pcwszurl: Pcwstr, pproxyinfolist: COpaquePointer?): UInt

public expect fun internetGetSecurityInfoByURL(lpszurl: Pcstr, ppcertchain: COpaquePointer?, pdwsecureflags: COpaquePointer?): Bool

public expect fun internetGetSecurityInfoByURLA(lpszurl: Pcstr, ppcertchain: COpaquePointer?, pdwsecureflags: COpaquePointer?): Bool

public expect fun internetGetSecurityInfoByURLW(lpszurl: Pcwstr, ppcertchain: COpaquePointer?, pdwsecureflags: COpaquePointer?): Bool

public expect fun internetGoOnline(lpszurl: Pcstr, hwndparent: Hwnd, dwflags: UInt): Bool

public expect fun internetGoOnlineA(lpszurl: Pcstr, hwndparent: Hwnd, dwflags: UInt): Bool

public expect fun internetGoOnlineW(lpszurl: Pcwstr, hwndparent: Hwnd, dwflags: UInt): Bool

public expect fun internetHangUp(dwconnection: ULong, dwreserved: UInt): UInt

public expect fun internetInitializeAutoProxyDll(dwreserved: UInt): Bool

public expect fun internetLockRequestFile(hinternet: COpaquePointer?, lphlockrequestinfo: COpaquePointer?): Bool

public expect fun internetOpenA(lpszagent: Pcstr, dwaccesstype: UInt, lpszproxy: Pcstr, lpszproxybypass: Pcstr, dwflags: UInt): COpaquePointer?

public expect fun internetOpenUrlA(hinternet: COpaquePointer?, lpszurl: Pcstr, lpszheaders: Pcstr, dwheaderslength: UInt, dwflags: UInt, dwcontext: ULong): COpaquePointer?

public expect fun internetOpenUrlW(hinternet: COpaquePointer?, lpszurl: Pcwstr, lpszheaders: Pcwstr, dwheaderslength: UInt, dwflags: UInt, dwcontext: ULong): COpaquePointer?

public expect fun internetOpenW(lpszagent: Pcwstr, dwaccesstype: UInt, lpszproxy: Pcwstr, lpszproxybypass: Pcwstr, dwflags: UInt): COpaquePointer?

public expect fun internetQueryDataAvailable(hfile: COpaquePointer?, lpdwnumberofbytesavailable: COpaquePointer?, dwflags: UInt, dwcontext: ULong): Bool

public expect fun internetQueryFortezzaStatus(pdwstatus: COpaquePointer?, dwreserved: ULong): Bool

public expect fun internetQueryOptionA(hinternet: COpaquePointer?, dwoption: UInt, lpbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?): Bool

public expect fun internetQueryOptionW(hinternet: COpaquePointer?, dwoption: UInt, lpbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?): Bool

public expect fun internetReadFile(hfile: COpaquePointer?, lpbuffer: COpaquePointer?, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: COpaquePointer?): Bool

public expect fun internetReadFileExA(hfile: COpaquePointer?, lpbuffersout: COpaquePointer?, dwflags: UInt, dwcontext: ULong): Bool

public expect fun internetReadFileExW(hfile: COpaquePointer?, lpbuffersout: COpaquePointer?, dwflags: UInt, dwcontext: ULong): Bool

public expect fun internetSecurityProtocolToStringA(dwprotocol: UInt, lpstr: Pstr, lpdwstrlength: COpaquePointer?, dwreserved: UInt): Bool

public expect fun internetSecurityProtocolToStringW(dwprotocol: UInt, lpstr: Pwstr, lpdwstrlength: COpaquePointer?, dwreserved: UInt): Bool

public expect fun internetSetCookieA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pcstr): Bool

public expect fun internetSetCookieEx2(pcwszurl: Pcwstr, pcookie: COpaquePointer?, pcwszp3ppolicy: Pcwstr, dwflags: UInt, pdwcookiestate: COpaquePointer?): UInt

public expect fun internetSetCookieExA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pcstr, dwflags: UInt, dwreserved: ULong): UInt

public expect fun internetSetCookieExW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr, dwflags: UInt, dwreserved: ULong): UInt

public expect fun internetSetCookieW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr): Bool

public expect fun internetSetDialState(lpszconnectoid: Pcstr, dwstate: UInt, dwreserved: UInt): Bool

public expect fun internetSetDialStateA(lpszconnectoid: Pcstr, dwstate: UInt, dwreserved: UInt): Bool

public expect fun internetSetDialStateW(lpszconnectoid: Pcwstr, dwstate: UInt, dwreserved: UInt): Bool

public expect fun internetSetFilePointer(hfile: COpaquePointer?, ldistancetomove: Int, lpdistancetomovehigh: COpaquePointer?, dwmovemethod: UInt, dwcontext: ULong): UInt

public expect fun internetSetOptionA(hinternet: COpaquePointer?, dwoption: UInt, lpbuffer: COpaquePointer?, dwbufferlength: UInt): Bool

public expect fun internetSetOptionExA(hinternet: COpaquePointer?, dwoption: UInt, lpbuffer: COpaquePointer?, dwbufferlength: UInt, dwflags: UInt): Bool

public expect fun internetSetOptionExW(hinternet: COpaquePointer?, dwoption: UInt, lpbuffer: COpaquePointer?, dwbufferlength: UInt, dwflags: UInt): Bool

public expect fun internetSetOptionW(hinternet: COpaquePointer?, dwoption: UInt, lpbuffer: COpaquePointer?, dwbufferlength: UInt): Bool

public expect fun internetSetPerSiteCookieDecisionA(pchhostname: Pcstr, dwdecision: UInt): Bool

public expect fun internetSetPerSiteCookieDecisionW(pchhostname: Pcwstr, dwdecision: UInt): Bool

public expect fun internetSetStatusCallback(hinternet: COpaquePointer?, lpfninternetcallback: LpinternetStatusCallback): LpinternetStatusCallback

public expect fun internetSetStatusCallbackA(hinternet: COpaquePointer?, lpfninternetcallback: LpinternetStatusCallback): LpinternetStatusCallback

public expect fun internetSetStatusCallbackW(hinternet: COpaquePointer?, lpfninternetcallback: LpinternetStatusCallback): LpinternetStatusCallback

public expect fun internetShowSecurityInfoByURL(lpszurl: Pcstr, hwndparent: Hwnd): Bool

public expect fun internetShowSecurityInfoByURLA(lpszurl: Pcstr, hwndparent: Hwnd): Bool

public expect fun internetShowSecurityInfoByURLW(lpszurl: Pcwstr, hwndparent: Hwnd): Bool

public expect fun internetTimeFromSystemTime(pst: COpaquePointer?, dwrfc: UInt, lpsztime: Pstr, cbtime: UInt): Bool

public expect fun internetTimeFromSystemTimeA(pst: COpaquePointer?, dwrfc: UInt, lpsztime: Pstr, cbtime: UInt): Bool

public expect fun internetTimeFromSystemTimeW(pst: COpaquePointer?, dwrfc: UInt, lpsztime: Pwstr, cbtime: UInt): Bool

public expect fun internetTimeToSystemTime(lpsztime: Pcstr, pst: COpaquePointer?, dwreserved: UInt): Bool

public expect fun internetTimeToSystemTimeA(lpsztime: Pcstr, pst: COpaquePointer?, dwreserved: UInt): Bool

public expect fun internetTimeToSystemTimeW(lpsztime: Pcwstr, pst: COpaquePointer?, dwreserved: UInt): Bool

public expect fun internetUnlockRequestFile(hlockrequestinfo: Handle): Bool

public expect fun internetWriteFile(hfile: COpaquePointer?, lpbuffer: COpaquePointer?, dwnumberofbytestowrite: UInt, lpdwnumberofbyteswritten: COpaquePointer?): Bool

public expect fun internetWriteFileExA(hfile: COpaquePointer?, lpbuffersin: COpaquePointer?, dwflags: UInt, dwcontext: ULong): Bool

public expect fun internetWriteFileExW(hfile: COpaquePointer?, lpbuffersin: COpaquePointer?, dwflags: UInt, dwcontext: ULong): Bool

public expect fun isDomainLegalCookieDomainA(pchdomain: Pcstr, pchfulldomain: Pcstr): Bool

public expect fun isDomainLegalCookieDomainW(pchdomain: Pcwstr, pchfulldomain: Pcwstr): Bool

public expect fun isHostInProxyBypassList(tscheme: InternetScheme, lpszhost: Pcstr, cchhost: UInt): Bool

public expect fun isProfilesEnabled(): Bool

public expect fun isUrlCacheEntryExpiredA(lpszurlname: Pcstr, dwflags: UInt, pftlastmodified: COpaquePointer?): Bool

public expect fun isUrlCacheEntryExpiredW(lpszurlname: Pcwstr, dwflags: UInt, pftlastmodified: COpaquePointer?): Bool

public expect fun loadUrlCacheContent(): Bool

public expect fun parseX509EncodedCertificateForListBoxEntry(lpcert: COpaquePointer?, cbcert: UInt, lpszlistboxentry: Pstr, lpdwlistboxentry: COpaquePointer?): UInt

public expect fun performOperationOverUrlCacheA(pszurlsearchpattern: Pcstr, dwflags: UInt, dwfilter: UInt, groupid: Long, preserved1: COpaquePointer?, pdwreserved2: COpaquePointer?, preserved3: COpaquePointer?, op: CacheOperator, poperatordata: COpaquePointer?): Bool

public expect fun privacyGetZonePreferenceW(dwzone: UInt, dwtype: UInt, pdwtemplate: COpaquePointer?, pszbuffer: Pwstr, pdwbufferlength: COpaquePointer?): UInt

public expect fun privacySetZonePreferenceW(dwzone: UInt, dwtype: UInt, dwtemplate: UInt, pszpreference: Pcwstr): UInt

public expect fun readGuidsForConnectedNetworks(pcnetworks: COpaquePointer?, pppwsznetworkguids: COpaquePointer?, pppbstrnetworknames: COpaquePointer?, pppwszgwmacs: COpaquePointer?, pcgatewaymacs: COpaquePointer?, pdwflags: COpaquePointer?): Bool

public expect fun readUrlCacheEntryStream(hurlcachestream: Handle, dwlocation: UInt, lpbuffer: COpaquePointer?, lpdwlen: COpaquePointer?, reserved: UInt): Bool

public expect fun readUrlCacheEntryStreamEx(hurlcachestream: Handle, qwlocation: ULong, lpbuffer: COpaquePointer?, lpdwlen: COpaquePointer?): Bool

public expect fun registerUrlCacheNotification(hwnd: Hwnd, umsg: UInt, gid: Long, dwopsfilter: UInt, dwreserved: UInt): Bool

public expect fun resumeSuspendedDownload(hrequest: COpaquePointer?, dwresultcode: UInt): Bool

public expect fun retrieveUrlCacheEntryFileA(lpszurlname: Pcstr, lpcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, dwreserved: UInt): Bool

public expect fun retrieveUrlCacheEntryFileW(lpszurlname: Pcwstr, lpcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, dwreserved: UInt): Bool

public expect fun retrieveUrlCacheEntryStreamA(lpszurlname: Pcstr, lpcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, frandomread: Bool, dwreserved: UInt): Handle

public expect fun retrieveUrlCacheEntryStreamW(lpszurlname: Pcwstr, lpcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, frandomread: Bool, dwreserved: UInt): Handle

public expect fun runOnceUrlCache(hwnd: Hwnd, hinst: Hinstance, lpszcmd: Pcstr, ncmdshow: Int): UInt

public expect fun setUrlCacheConfigInfoA(lpcacheconfiginfo: COpaquePointer?, dwfieldcontrol: UInt): Bool

public expect fun setUrlCacheConfigInfoW(lpcacheconfiginfo: COpaquePointer?, dwfieldcontrol: UInt): Bool

public expect fun setUrlCacheEntryGroup(lpszurlname: Pcstr, dwflags: UInt, groupid: Long, pbgroupattributes: COpaquePointer?, cbgroupattributes: UInt, lpreserved: COpaquePointer?): Bool

public expect fun setUrlCacheEntryGroupA(lpszurlname: Pcstr, dwflags: UInt, groupid: Long, pbgroupattributes: COpaquePointer?, cbgroupattributes: UInt, lpreserved: COpaquePointer?): Bool

public expect fun setUrlCacheEntryGroupW(lpszurlname: Pcwstr, dwflags: UInt, groupid: Long, pbgroupattributes: COpaquePointer?, cbgroupattributes: UInt, lpreserved: COpaquePointer?): Bool

public expect fun setUrlCacheEntryInfoA(lpszurlname: Pcstr, lpcacheentryinfo: COpaquePointer?, dwfieldcontrol: UInt): Bool

public expect fun setUrlCacheEntryInfoW(lpszurlname: Pcwstr, lpcacheentryinfo: COpaquePointer?, dwfieldcontrol: UInt): Bool

public expect fun setUrlCacheGroupAttributeA(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: COpaquePointer?, lpreserved: COpaquePointer?): Bool

public expect fun setUrlCacheGroupAttributeW(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: COpaquePointer?, lpreserved: COpaquePointer?): Bool

public expect fun setUrlCacheHeaderData(nidx: UInt, dwdata: UInt): Bool

public expect fun showClientAuthCerts(hwndparent: Hwnd): UInt

public expect fun showSecurityInfo(hwndparent: Hwnd, psecurityinfo: COpaquePointer?): UInt

public expect fun showX509EncodedCertificate(hwndparent: Hwnd, lpcert: COpaquePointer?, cbcert: UInt): UInt

public expect fun unlockUrlCacheEntryFile(lpszurlname: Pcstr, dwreserved: UInt): Bool

public expect fun unlockUrlCacheEntryFileA(lpszurlname: Pcstr, dwreserved: UInt): Bool

public expect fun unlockUrlCacheEntryFileW(lpszurlname: Pcwstr, dwreserved: UInt): Bool

public expect fun unlockUrlCacheEntryStream(hurlcachestream: Handle, reserved: UInt): Bool

public expect fun updateUrlCacheContentPath(sznewpath: Pcstr): Bool

public expect fun urlCacheCheckEntriesExist(rgpwszurls: COpaquePointer?, centries: UInt, rgfexist: COpaquePointer?): UInt

public expect fun urlCacheCloseEntryHandle(hentryfile: COpaquePointer?)

public expect fun urlCacheContainerSetEntryMaximumAge(pwszprefix: Pcwstr, dwentrymaxage: UInt): UInt

public expect fun urlCacheCreateContainer(pwszname: Pcwstr, pwszprefix: Pcwstr, pwszdirectory: Pcwstr, ulllimit: ULong, dwoptions: UInt): UInt

public expect fun urlCacheFindFirstEntry(pwszprefix: Pcwstr, dwflags: UInt, dwfilter: UInt, groupid: Long, pcacheentryinfo: COpaquePointer?, phfind: COpaquePointer?): UInt

public expect fun urlCacheFindNextEntry(hfind: Handle, pcacheentryinfo: COpaquePointer?): UInt

public expect fun urlCacheFreeEntryInfo(pcacheentryinfo: COpaquePointer?)

public expect fun urlCacheFreeGlobalSpace(ulltargetsize: ULong, dwfilter: UInt): UInt

public expect fun urlCacheGetContentPaths(pppwszdirectories: COpaquePointer?, pcdirectories: COpaquePointer?): UInt

public expect fun urlCacheGetEntryInfo(happcache: COpaquePointer?, pcwszurl: Pcwstr, pcacheentryinfo: COpaquePointer?): UInt

public expect fun urlCacheGetGlobalCacheSize(dwfilter: UInt, pullsize: COpaquePointer?, pulllimit: COpaquePointer?): UInt

public expect fun urlCacheGetGlobalLimit(limittype: UrlCacheLimitType, pulllimit: COpaquePointer?): UInt

public expect fun urlCacheReadEntryStream(hurlcachestream: COpaquePointer?, ulllocation: ULong, pbuffer: COpaquePointer?, dwbufferlen: UInt, pdwbufferlen: COpaquePointer?): UInt

public expect fun urlCacheReloadSettings(): UInt

public expect fun urlCacheRetrieveEntryFile(happcache: COpaquePointer?, pcwszurl: Pcwstr, pcacheentryinfo: COpaquePointer?, phentryfile: COpaquePointer?): UInt

public expect fun urlCacheRetrieveEntryStream(happcache: COpaquePointer?, pcwszurl: Pcwstr, frandomread: Bool, pcacheentryinfo: COpaquePointer?, phentrystream: COpaquePointer?): UInt

public expect fun urlCacheServer(): UInt

public expect fun urlCacheSetGlobalLimit(limittype: UrlCacheLimitType, ulllimit: ULong): UInt

public expect fun urlCacheUpdateEntryExtraData(happcache: COpaquePointer?, pcwszurl: Pcwstr, pbextradata: COpaquePointer?, cbextradata: UInt): UInt
