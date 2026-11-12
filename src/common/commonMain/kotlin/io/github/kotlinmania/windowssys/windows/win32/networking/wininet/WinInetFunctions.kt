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

public expect fun appCacheCheckManifest(pwszmasterurl: Pcwstr, pwszmanifesturl: Pcwstr, pbmanifestdata: ConstPtr, dwmanifestdatasize: UInt, pbmanifestresponseheaders: ConstPtr, dwmanifestresponseheaderssize: UInt, pestate: MutPtr, phnewappcache: MutPtr): UInt

public expect fun appCacheCloseHandle(happcache: ConstPtr)

public expect fun appCacheCreateAndCommitFile(happcache: ConstPtr, pwszsourcefilepath: Pcwstr, pwszurl: Pcwstr, pbresponseheaders: ConstPtr, dwresponseheaderssize: UInt): UInt

public expect fun appCacheDeleteGroup(pwszmanifesturl: Pcwstr): UInt

public expect fun appCacheDeleteIEGroup(pwszmanifesturl: Pcwstr): UInt

public expect fun appCacheDuplicateHandle(happcache: ConstPtr, phduplicatedappcache: MutPtr): UInt

public expect fun appCacheFinalize(happcache: ConstPtr, pbmanifestdata: ConstPtr, dwmanifestdatasize: UInt, pestate: MutPtr): UInt

public expect fun appCacheFreeDownloadList(pdownloadlist: MutPtr)

public expect fun appCacheFreeGroupList(pappcachegrouplist: MutPtr)

public expect fun appCacheFreeIESpace(ftcutoff: Filetime): UInt

public expect fun appCacheFreeSpace(ftcutoff: Filetime): UInt

public expect fun appCacheGetDownloadList(happcache: ConstPtr, pdownloadlist: MutPtr): UInt

public expect fun appCacheGetFallbackUrl(happcache: ConstPtr, pwszurl: Pcwstr, ppwszfallbackurl: MutPtr): UInt

public expect fun appCacheGetGroupList(pappcachegrouplist: MutPtr): UInt

public expect fun appCacheGetIEGroupList(pappcachegrouplist: MutPtr): UInt

public expect fun appCacheGetInfo(happcache: ConstPtr, pappcacheinfo: MutPtr): UInt

public expect fun appCacheGetManifestUrl(happcache: ConstPtr, ppwszmanifesturl: MutPtr): UInt

public expect fun appCacheLookup(pwszurl: Pcwstr, dwflags: UInt, phappcache: MutPtr): UInt

public expect fun commitUrlCacheEntryA(lpszurlname: Pcstr, lpszlocalfilename: Pcstr, expiretime: Filetime, lastmodifiedtime: Filetime, cacheentrytype: UInt, lpheaderinfo: ConstPtr, cchheaderinfo: UInt, lpszfileextension: Pcstr, lpszoriginalurl: Pcstr): Bool

public expect fun commitUrlCacheEntryBinaryBlob(pwszurlname: Pcwstr, dwtype: UInt, ftexpiretime: Filetime, ftmodifiedtime: Filetime, pbblob: ConstPtr, cbblob: UInt): UInt

public expect fun commitUrlCacheEntryW(lpszurlname: Pcwstr, lpszlocalfilename: Pcwstr, expiretime: Filetime, lastmodifiedtime: Filetime, cacheentrytype: UInt, lpszheaderinfo: Pcwstr, cchheaderinfo: UInt, lpszfileextension: Pcwstr, lpszoriginalurl: Pcwstr): Bool

public expect fun createMD5SSOHash(pszchallengeinfo: Pcwstr, pwszrealm: Pcwstr, pwsztarget: Pcwstr, pbhexhash: MutPtr): Bool

public expect fun createUrlCacheContainerA(name: Pcstr, lpcacheprefix: Pcstr, lpszcachepath: Pcstr, kbcachelimit: UInt, dwcontainertype: UInt, dwoptions: UInt, pvbuffer: ConstPtr, cbbuffer: ConstPtr): Bool

public expect fun createUrlCacheContainerW(name: Pcwstr, lpcacheprefix: Pcwstr, lpszcachepath: Pcwstr, kbcachelimit: UInt, dwcontainertype: UInt, dwoptions: UInt, pvbuffer: ConstPtr, cbbuffer: ConstPtr): Bool

public expect fun createUrlCacheEntryA(lpszurlname: Pcstr, dwexpectedfilesize: UInt, lpszfileextension: Pcstr, lpszfilename: Pstr, dwreserved: UInt): Bool

public expect fun createUrlCacheEntryExW(lpszurlname: Pcwstr, dwexpectedfilesize: UInt, lpszfileextension: Pcwstr, lpszfilename: Pwstr, dwreserved: UInt, fpreserveincomingfilename: Bool): Bool

public expect fun createUrlCacheEntryW(lpszurlname: Pcwstr, dwexpectedfilesize: UInt, lpszfileextension: Pcwstr, lpszfilename: Pwstr, dwreserved: UInt): Bool

public expect fun createUrlCacheGroup(dwflags: UInt, lpreserved: ConstPtr): Long

public expect fun deleteIE3Cache(hwnd: Hwnd, hinst: Hinstance, lpszcmd: Pcstr, ncmdshow: Int): UInt

public expect fun deleteUrlCacheContainerA(name: Pcstr, dwoptions: UInt): Bool

public expect fun deleteUrlCacheContainerW(name: Pcwstr, dwoptions: UInt): Bool

public expect fun deleteUrlCacheEntry(lpszurlname: Pcstr): Bool

public expect fun deleteUrlCacheEntryA(lpszurlname: Pcstr): Bool

public expect fun deleteUrlCacheEntryW(lpszurlname: Pcwstr): Bool

public expect fun deleteUrlCacheGroup(groupid: Long, dwflags: UInt, lpreserved: ConstPtr): Bool

public expect fun deleteWpadCacheForNetworks(param0: WpadCacheDelete): Bool

public expect fun detectAutoProxyUrl(pszautoproxyurl: Pstr, cchautoproxyurl: UInt, dwdetectflags: ProxyAutoDetectType): Bool

public expect fun doConnectoidsExist(): Bool

public expect fun exportCookieFileA(szfilename: Pcstr, fappend: Bool): Bool

public expect fun exportCookieFileW(szfilename: Pcwstr, fappend: Bool): Bool

public expect fun findCloseUrlCache(henumhandle: Handle): Bool

public expect fun findFirstUrlCacheContainerA(pdwmodified: MutPtr, lpcontainerinfo: MutPtr, lpcbcontainerinfo: MutPtr, dwoptions: UInt): Handle

public expect fun findFirstUrlCacheContainerW(pdwmodified: MutPtr, lpcontainerinfo: MutPtr, lpcbcontainerinfo: MutPtr, dwoptions: UInt): Handle

public expect fun findFirstUrlCacheEntryA(lpszurlsearchpattern: Pcstr, lpfirstcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr): Handle

public expect fun findFirstUrlCacheEntryExA(lpszurlsearchpattern: Pcstr, dwflags: UInt, dwfilter: UInt, groupid: Long, lpfirstcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, lpgroupattributes: ConstPtr, lpcbgroupattributes: ConstPtr, lpreserved: ConstPtr): Handle

public expect fun findFirstUrlCacheEntryExW(lpszurlsearchpattern: Pcwstr, dwflags: UInt, dwfilter: UInt, groupid: Long, lpfirstcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, lpgroupattributes: ConstPtr, lpcbgroupattributes: ConstPtr, lpreserved: ConstPtr): Handle

public expect fun findFirstUrlCacheEntryW(lpszurlsearchpattern: Pcwstr, lpfirstcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr): Handle

public expect fun findFirstUrlCacheGroup(dwflags: UInt, dwfilter: UInt, lpsearchcondition: ConstPtr, dwsearchcondition: UInt, lpgroupid: MutPtr, lpreserved: ConstPtr): Handle

public expect fun findNextUrlCacheContainerA(henumhandle: Handle, lpcontainerinfo: MutPtr, lpcbcontainerinfo: MutPtr): Bool

public expect fun findNextUrlCacheContainerW(henumhandle: Handle, lpcontainerinfo: MutPtr, lpcbcontainerinfo: MutPtr): Bool

public expect fun findNextUrlCacheEntryA(henumhandle: Handle, lpnextcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr): Bool

public expect fun findNextUrlCacheEntryExA(henumhandle: Handle, lpnextcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, lpgroupattributes: ConstPtr, lpcbgroupattributes: ConstPtr, lpreserved: ConstPtr): Bool

public expect fun findNextUrlCacheEntryExW(henumhandle: Handle, lpnextcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, lpgroupattributes: ConstPtr, lpcbgroupattributes: ConstPtr, lpreserved: ConstPtr): Bool

public expect fun findNextUrlCacheEntryW(henumhandle: Handle, lpnextcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr): Bool

public expect fun findNextUrlCacheGroup(hfind: Handle, lpgroupid: MutPtr, lpreserved: ConstPtr): Bool

public expect fun findP3PPolicySymbol(pszsymbol: Pcstr): Int

public expect fun freeUrlCacheSpaceA(lpszcachepath: Pcstr, dwsize: UInt, dwfilter: UInt): Bool

public expect fun freeUrlCacheSpaceW(lpszcachepath: Pcwstr, dwsize: UInt, dwfilter: UInt): Bool

public expect fun ftpCommandA(hconnect: ConstPtr, fexpectresponse: Bool, dwflags: FtpFlags, lpszcommand: Pcstr, dwcontext: ULong, phftpcommand: MutPtr): Bool

public expect fun ftpCommandW(hconnect: ConstPtr, fexpectresponse: Bool, dwflags: FtpFlags, lpszcommand: Pcwstr, dwcontext: ULong, phftpcommand: MutPtr): Bool

public expect fun ftpCreateDirectoryA(hconnect: ConstPtr, lpszdirectory: Pcstr): Bool

public expect fun ftpCreateDirectoryW(hconnect: ConstPtr, lpszdirectory: Pcwstr): Bool

public expect fun ftpDeleteFileA(hconnect: ConstPtr, lpszfilename: Pcstr): Bool

public expect fun ftpDeleteFileW(hconnect: ConstPtr, lpszfilename: Pcwstr): Bool

public expect fun ftpFindFirstFileA(hconnect: ConstPtr, lpszsearchfile: Pcstr, lpfindfiledata: MutPtr, dwflags: UInt, dwcontext: ULong): MutPtr

public expect fun ftpFindFirstFileW(hconnect: ConstPtr, lpszsearchfile: Pcwstr, lpfindfiledata: MutPtr, dwflags: UInt, dwcontext: ULong): MutPtr

public expect fun ftpGetCurrentDirectoryA(hconnect: ConstPtr, lpszcurrentdirectory: Pstr, lpdwcurrentdirectory: MutPtr): Bool

public expect fun ftpGetCurrentDirectoryW(hconnect: ConstPtr, lpszcurrentdirectory: Pwstr, lpdwcurrentdirectory: MutPtr): Bool

public expect fun ftpGetFileA(hconnect: ConstPtr, lpszremotefile: Pcstr, lpsznewfile: Pcstr, ffailifexists: Bool, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): Bool

public expect fun ftpGetFileEx(hftpsession: ConstPtr, lpszremotefile: Pcstr, lpsznewfile: Pcwstr, ffailifexists: Bool, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): Bool

public expect fun ftpGetFileSize(hfile: ConstPtr, lpdwfilesizehigh: MutPtr): UInt

public expect fun ftpGetFileW(hconnect: ConstPtr, lpszremotefile: Pcwstr, lpsznewfile: Pcwstr, ffailifexists: Bool, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): Bool

public expect fun ftpOpenFileA(hconnect: ConstPtr, lpszfilename: Pcstr, dwaccess: UInt, dwflags: FtpFlags, dwcontext: ULong): MutPtr

public expect fun ftpOpenFileW(hconnect: ConstPtr, lpszfilename: Pcwstr, dwaccess: UInt, dwflags: FtpFlags, dwcontext: ULong): MutPtr

public expect fun ftpPutFileA(hconnect: ConstPtr, lpszlocalfile: Pcstr, lpsznewremotefile: Pcstr, dwflags: FtpFlags, dwcontext: ULong): Bool

public expect fun ftpPutFileEx(hftpsession: ConstPtr, lpszlocalfile: Pcwstr, lpsznewremotefile: Pcstr, dwflags: UInt, dwcontext: ULong): Bool

public expect fun ftpPutFileW(hconnect: ConstPtr, lpszlocalfile: Pcwstr, lpsznewremotefile: Pcwstr, dwflags: FtpFlags, dwcontext: ULong): Bool

public expect fun ftpRemoveDirectoryA(hconnect: ConstPtr, lpszdirectory: Pcstr): Bool

public expect fun ftpRemoveDirectoryW(hconnect: ConstPtr, lpszdirectory: Pcwstr): Bool

public expect fun ftpRenameFileA(hconnect: ConstPtr, lpszexisting: Pcstr, lpsznew: Pcstr): Bool

public expect fun ftpRenameFileW(hconnect: ConstPtr, lpszexisting: Pcwstr, lpsznew: Pcwstr): Bool

public expect fun ftpSetCurrentDirectoryA(hconnect: ConstPtr, lpszdirectory: Pcstr): Bool

public expect fun ftpSetCurrentDirectoryW(hconnect: ConstPtr, lpszdirectory: Pcwstr): Bool

public expect fun getDiskInfoA(pszpath: Pcstr, pdwclustersize: MutPtr, pdlavail: MutPtr, pdltotal: MutPtr): Bool

public expect fun getUrlCacheConfigInfoA(lpcacheconfiginfo: MutPtr, lpcbcacheconfiginfo: ConstPtr, dwfieldcontrol: CacheConfig): Bool

public expect fun getUrlCacheConfigInfoW(lpcacheconfiginfo: MutPtr, lpcbcacheconfiginfo: ConstPtr, dwfieldcontrol: CacheConfig): Bool

public expect fun getUrlCacheEntryBinaryBlob(pwszurlname: Pcwstr, dwtype: MutPtr, pftexpiretime: MutPtr, pftaccesstime: MutPtr, pftmodifiedtime: MutPtr, ppbblob: MutPtr, pcbblob: MutPtr): UInt

public expect fun getUrlCacheEntryInfoA(lpszurlname: Pcstr, lpcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr): Bool

public expect fun getUrlCacheEntryInfoExA(lpszurl: Pcstr, lpcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, lpszredirecturl: Pcstr, lpcbredirecturl: ConstPtr, lpreserved: ConstPtr, dwflags: UInt): Bool

public expect fun getUrlCacheEntryInfoExW(lpszurl: Pcwstr, lpcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, lpszredirecturl: Pcwstr, lpcbredirecturl: ConstPtr, lpreserved: ConstPtr, dwflags: UInt): Bool

public expect fun getUrlCacheEntryInfoW(lpszurlname: Pcwstr, lpcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr): Bool

public expect fun getUrlCacheGroupAttributeA(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: MutPtr, lpcbgroupinfo: MutPtr, lpreserved: ConstPtr): Bool

public expect fun getUrlCacheGroupAttributeW(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: MutPtr, lpcbgroupinfo: MutPtr, lpreserved: ConstPtr): Bool

public expect fun getUrlCacheHeaderData(nidx: UInt, lpdwdata: MutPtr): Bool

public expect fun gopherCreateLocatorA(lpszhost: Pcstr, nserverport: UShort, lpszdisplaystring: Pcstr, lpszselectorstring: Pcstr, dwgophertype: UInt, lpszlocator: Pstr, lpdwbufferlength: MutPtr): Bool

public expect fun gopherCreateLocatorW(lpszhost: Pcwstr, nserverport: UShort, lpszdisplaystring: Pcwstr, lpszselectorstring: Pcwstr, dwgophertype: UInt, lpszlocator: Pwstr, lpdwbufferlength: MutPtr): Bool

public expect fun gopherFindFirstFileA(hconnect: ConstPtr, lpszlocator: Pcstr, lpszsearchstring: Pcstr, lpfinddata: MutPtr, dwflags: UInt, dwcontext: ULong): MutPtr

public expect fun gopherFindFirstFileW(hconnect: ConstPtr, lpszlocator: Pcwstr, lpszsearchstring: Pcwstr, lpfinddata: MutPtr, dwflags: UInt, dwcontext: ULong): MutPtr

public expect fun gopherGetAttributeA(hconnect: ConstPtr, lpszlocator: Pcstr, lpszattributename: Pcstr, lpbuffer: MutPtr, dwbufferlength: UInt, lpdwcharactersreturned: MutPtr, lpfnenumerator: GopherAttributeEnumerator, dwcontext: ULong): Bool

public expect fun gopherGetAttributeW(hconnect: ConstPtr, lpszlocator: Pcwstr, lpszattributename: Pcwstr, lpbuffer: MutPtr, dwbufferlength: UInt, lpdwcharactersreturned: MutPtr, lpfnenumerator: GopherAttributeEnumerator, dwcontext: ULong): Bool

public expect fun gopherGetLocatorTypeA(lpszlocator: Pcstr, lpdwgophertype: MutPtr): Bool

public expect fun gopherGetLocatorTypeW(lpszlocator: Pcwstr, lpdwgophertype: MutPtr): Bool

public expect fun gopherOpenFileA(hconnect: ConstPtr, lpszlocator: Pcstr, lpszview: Pcstr, dwflags: UInt, dwcontext: ULong): MutPtr

public expect fun gopherOpenFileW(hconnect: ConstPtr, lpszlocator: Pcwstr, lpszview: Pcwstr, dwflags: UInt, dwcontext: ULong): MutPtr

public expect fun httpAddRequestHeadersA(hrequest: ConstPtr, lpszheaders: Pcstr, dwheaderslength: UInt, dwmodifiers: HttpAddreqFlag): Bool

public expect fun httpAddRequestHeadersW(hrequest: ConstPtr, lpszheaders: Pcwstr, dwheaderslength: UInt, dwmodifiers: HttpAddreqFlag): Bool

public expect fun httpCheckDavComplianceA(lpszurl: Pcstr, lpszcompliancetoken: Pcstr, lpffound: MutPtr, hwnd: Hwnd, lpvreserved: ConstPtr): Bool

public expect fun httpCheckDavComplianceW(lpszurl: Pcwstr, lpszcompliancetoken: Pcwstr, lpffound: MutPtr, hwnd: Hwnd, lpvreserved: ConstPtr): Bool

public expect fun httpCloseDependencyHandle(hdependencyhandle: ConstPtr)

public expect fun httpDuplicateDependencyHandle(hdependencyhandle: ConstPtr, phduplicateddependencyhandle: MutPtr): UInt

public expect fun httpEndRequestA(hrequest: ConstPtr, lpbuffersout: MutPtr, dwflags: UInt, dwcontext: ULong): Bool

public expect fun httpEndRequestW(hrequest: ConstPtr, lpbuffersout: MutPtr, dwflags: UInt, dwcontext: ULong): Bool

public expect fun httpGetServerCredentials(pwszurl: Pcwstr, ppwszusername: MutPtr, ppwszpassword: MutPtr): UInt

public expect fun httpIndicatePageLoadComplete(hdependencyhandle: ConstPtr): UInt

public expect fun httpIsHostHstsEnabled(pcwszurl: Pcwstr, pfishsts: MutPtr): UInt

public expect fun httpOpenDependencyHandle(hrequesthandle: ConstPtr, fbackground: Bool, phdependencyhandle: MutPtr): UInt

public expect fun httpOpenRequestA(hconnect: ConstPtr, lpszverb: Pcstr, lpszobjectname: Pcstr, lpszversion: Pcstr, lpszreferrer: Pcstr, lplpszaccepttypes: ConstPtr, dwflags: UInt, dwcontext: ULong): MutPtr

public expect fun httpOpenRequestW(hconnect: ConstPtr, lpszverb: Pcwstr, lpszobjectname: Pcwstr, lpszversion: Pcwstr, lpszreferrer: Pcwstr, lplpszaccepttypes: ConstPtr, dwflags: UInt, dwcontext: ULong): MutPtr

public expect fun httpPushClose(hwait: HttpPushWaitHandle)

public expect fun httpPushEnable(hrequest: ConstPtr, ptransportsetting: ConstPtr, phwait: MutPtr): UInt

public expect fun httpPushWait(hwait: HttpPushWaitHandle, etype: HttpPushWaitType, pnotificationstatus: MutPtr): UInt

public expect fun httpQueryInfoA(hrequest: ConstPtr, dwinfolevel: UInt, lpbuffer: MutPtr, lpdwbufferlength: MutPtr, lpdwindex: MutPtr): Bool

public expect fun httpQueryInfoW(hrequest: ConstPtr, dwinfolevel: UInt, lpbuffer: MutPtr, lpdwbufferlength: MutPtr, lpdwindex: MutPtr): Bool

public expect fun httpSendRequestA(hrequest: ConstPtr, lpszheaders: Pcstr, dwheaderslength: UInt, lpoptional: ConstPtr, dwoptionallength: UInt): Bool

public expect fun httpSendRequestExA(hrequest: ConstPtr, lpbuffersin: ConstPtr, lpbuffersout: MutPtr, dwflags: UInt, dwcontext: ULong): Bool

public expect fun httpSendRequestExW(hrequest: ConstPtr, lpbuffersin: ConstPtr, lpbuffersout: MutPtr, dwflags: UInt, dwcontext: ULong): Bool

public expect fun httpSendRequestW(hrequest: ConstPtr, lpszheaders: Pcwstr, dwheaderslength: UInt, lpoptional: ConstPtr, dwoptionallength: UInt): Bool

public expect fun httpWebSocketClose(hwebsocket: ConstPtr, usstatus: UShort, pvreason: ConstPtr, dwreasonlength: UInt): Bool

public expect fun httpWebSocketCompleteUpgrade(hrequest: ConstPtr, dwcontext: ULong): MutPtr

public expect fun httpWebSocketQueryCloseStatus(hwebsocket: ConstPtr, pusstatus: MutPtr, pvreason: MutPtr, dwreasonlength: UInt, pdwreasonlengthconsumed: MutPtr): Bool

public expect fun httpWebSocketReceive(hwebsocket: ConstPtr, pvbuffer: MutPtr, dwbufferlength: UInt, pdwbytesread: MutPtr, pbuffertype: MutPtr): Bool

public expect fun httpWebSocketSend(hwebsocket: ConstPtr, buffertype: HttpWebSocketBufferType, pvbuffer: ConstPtr, dwbufferlength: UInt): Bool

public expect fun httpWebSocketShutdown(hwebsocket: ConstPtr, usstatus: UShort, pvreason: ConstPtr, dwreasonlength: UInt): Bool

public expect fun importCookieFileA(szfilename: Pcstr): Bool

public expect fun importCookieFileW(szfilename: Pcwstr): Bool

public expect fun incrementUrlCacheHeaderData(nidx: UInt, lpdwdata: MutPtr): Bool

public expect fun internalInternetGetCookie(lpszurl: Pcstr, lpszcookiedata: Pstr, lpdwdatasize: MutPtr): UInt

public expect fun internetAlgIdToStringA(ai: AlgId, lpstr: Pstr, lpdwstrlength: MutPtr, dwreserved: UInt): Bool

public expect fun internetAlgIdToStringW(ai: AlgId, lpstr: Pwstr, lpdwstrlength: MutPtr, dwreserved: UInt): Bool

public expect fun internetAttemptConnect(dwreserved: UInt): UInt

public expect fun internetAutodial(dwflags: InternetAutodial, hwndparent: Hwnd): Bool

public expect fun internetAutodialHangup(dwreserved: UInt): Bool

public expect fun internetCanonicalizeUrlA(lpszurl: Pcstr, lpszbuffer: Pstr, lpdwbufferlength: MutPtr, dwflags: UInt): Bool

public expect fun internetCanonicalizeUrlW(lpszurl: Pcwstr, lpszbuffer: Pwstr, lpdwbufferlength: MutPtr, dwflags: UInt): Bool

public expect fun internetCheckConnectionA(lpszurl: Pcstr, dwflags: UInt, dwreserved: UInt): Bool

public expect fun internetCheckConnectionW(lpszurl: Pcwstr, dwflags: UInt, dwreserved: UInt): Bool

public expect fun internetClearAllPerSiteCookieDecisions(): Bool

public expect fun internetCloseHandle(hinternet: ConstPtr): Bool

public expect fun internetCombineUrlA(lpszbaseurl: Pcstr, lpszrelativeurl: Pcstr, lpszbuffer: Pstr, lpdwbufferlength: MutPtr, dwflags: UInt): Bool

public expect fun internetCombineUrlW(lpszbaseurl: Pcwstr, lpszrelativeurl: Pcwstr, lpszbuffer: Pwstr, lpdwbufferlength: MutPtr, dwflags: UInt): Bool

public expect fun internetConfirmZoneCrossing(hwnd: Hwnd, szurlprev: Pcstr, szurlnew: Pcstr, bpost: Bool): UInt

public expect fun internetConfirmZoneCrossingA(hwnd: Hwnd, szurlprev: Pcstr, szurlnew: Pcstr, bpost: Bool): UInt

public expect fun internetConfirmZoneCrossingW(hwnd: Hwnd, szurlprev: Pcwstr, szurlnew: Pcwstr, bpost: Bool): UInt

public expect fun internetConnectA(hinternet: ConstPtr, lpszservername: Pcstr, nserverport: UShort, lpszusername: Pcstr, lpszpassword: Pcstr, dwservice: UInt, dwflags: UInt, dwcontext: ULong): MutPtr

public expect fun internetConnectW(hinternet: ConstPtr, lpszservername: Pcwstr, nserverport: UShort, lpszusername: Pcwstr, lpszpassword: Pcwstr, dwservice: UInt, dwflags: UInt, dwcontext: ULong): MutPtr

public expect fun internetConvertUrlFromWireToWideChar(pcszurl: Pcstr, cchurl: UInt, pcwszbaseurl: Pcwstr, dwcodepagehost: UInt, dwcodepagepath: UInt, fencodepathextra: Bool, dwcodepageextra: UInt, ppwszconvertedurl: MutPtr): UInt

public expect fun internetCrackUrlA(lpszurl: Pcstr, dwurllength: UInt, dwflags: WinHttpCreateUrlFlags, lpurlcomponents: MutPtr): Bool

public expect fun internetCrackUrlW(lpszurl: Pcwstr, dwurllength: UInt, dwflags: WinHttpCreateUrlFlags, lpurlcomponents: MutPtr): Bool

public expect fun internetCreateUrlA(lpurlcomponents: ConstPtr, dwflags: UInt, lpszurl: Pstr, lpdwurllength: MutPtr): Bool

public expect fun internetCreateUrlW(lpurlcomponents: ConstPtr, dwflags: UInt, lpszurl: Pwstr, lpdwurllength: MutPtr): Bool

public expect fun internetDial(hwndparent: Hwnd, lpszconnectoid: Pcstr, dwflags: UInt, lpdwconnection: MutPtr, dwreserved: UInt): UInt

public expect fun internetDialA(hwndparent: Hwnd, lpszconnectoid: Pcstr, dwflags: UInt, lpdwconnection: MutPtr, dwreserved: UInt): UInt

public expect fun internetDialW(hwndparent: Hwnd, lpszconnectoid: Pcwstr, dwflags: UInt, lpdwconnection: MutPtr, dwreserved: UInt): UInt

public expect fun internetEnumPerSiteCookieDecisionA(pszsitename: Pstr, pcsitenamesize: MutPtr, pdwdecision: MutPtr, dwindex: UInt): Bool

public expect fun internetEnumPerSiteCookieDecisionW(pszsitename: Pwstr, pcsitenamesize: MutPtr, pdwdecision: MutPtr, dwindex: UInt): Bool

public expect fun internetErrorDlg(hwnd: Hwnd, hrequest: MutPtr, dwerror: UInt, dwflags: UInt, lppvdata: MutPtr): UInt

public expect fun internetFindNextFileA(hfind: ConstPtr, lpvfinddata: MutPtr): Bool

public expect fun internetFindNextFileW(hfind: ConstPtr, lpvfinddata: MutPtr): Bool

public expect fun internetFortezzaCommand(dwcommand: UInt, hwnd: Hwnd, dwreserved: ULong): Bool

public expect fun internetFreeCookies(pcookies: MutPtr, dwcookiecount: UInt)

public expect fun internetFreeProxyInfoList(pproxyinfolist: MutPtr)

public expect fun internetGetConnectedState(lpdwflags: MutPtr, dwreserved: UInt): Bool

public expect fun internetGetConnectedStateEx(lpdwflags: MutPtr, lpszconnectionname: Pstr, dwnamelen: UInt, dwreserved: UInt): Bool

public expect fun internetGetConnectedStateExA(lpdwflags: MutPtr, lpszconnectionname: Pstr, cchnamelen: UInt, dwreserved: UInt): Bool

public expect fun internetGetConnectedStateExW(lpdwflags: MutPtr, lpszconnectionname: Pwstr, cchnamelen: UInt, dwreserved: UInt): Bool

public expect fun internetGetCookieA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pstr, lpdwsize: MutPtr): Bool

public expect fun internetGetCookieEx2(pcwszurl: Pcwstr, pcwszcookiename: Pcwstr, dwflags: UInt, ppcookies: MutPtr, pdwcookiecount: MutPtr): UInt

public expect fun internetGetCookieExA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pcstr, lpdwsize: MutPtr, dwflags: InternetCookieFlags, lpreserved: ConstPtr): Bool

public expect fun internetGetCookieExW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr, lpdwsize: MutPtr, dwflags: InternetCookieFlags, lpreserved: ConstPtr): Bool

public expect fun internetGetCookieW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pwstr, lpdwsize: MutPtr): Bool

public expect fun internetGetLastResponseInfoA(lpdwerror: MutPtr, lpszbuffer: Pstr, lpdwbufferlength: MutPtr): Bool

public expect fun internetGetLastResponseInfoW(lpdwerror: MutPtr, lpszbuffer: Pwstr, lpdwbufferlength: MutPtr): Bool

public expect fun internetGetPerSiteCookieDecisionA(pchhostname: Pcstr, presult: MutPtr): Bool

public expect fun internetGetPerSiteCookieDecisionW(pchhostname: Pcwstr, presult: MutPtr): Bool

public expect fun internetGetProxyForUrl(hinternet: ConstPtr, pcwszurl: Pcwstr, pproxyinfolist: MutPtr): UInt

public expect fun internetGetSecurityInfoByURL(lpszurl: Pcstr, ppcertchain: MutPtr, pdwsecureflags: MutPtr): Bool

public expect fun internetGetSecurityInfoByURLA(lpszurl: Pcstr, ppcertchain: MutPtr, pdwsecureflags: MutPtr): Bool

public expect fun internetGetSecurityInfoByURLW(lpszurl: Pcwstr, ppcertchain: MutPtr, pdwsecureflags: MutPtr): Bool

public expect fun internetGoOnline(lpszurl: Pcstr, hwndparent: Hwnd, dwflags: UInt): Bool

public expect fun internetGoOnlineA(lpszurl: Pcstr, hwndparent: Hwnd, dwflags: UInt): Bool

public expect fun internetGoOnlineW(lpszurl: Pcwstr, hwndparent: Hwnd, dwflags: UInt): Bool

public expect fun internetHangUp(dwconnection: ULong, dwreserved: UInt): UInt

public expect fun internetInitializeAutoProxyDll(dwreserved: UInt): Bool

public expect fun internetLockRequestFile(hinternet: ConstPtr, lphlockrequestinfo: MutPtr): Bool

public expect fun internetOpenA(lpszagent: Pcstr, dwaccesstype: UInt, lpszproxy: Pcstr, lpszproxybypass: Pcstr, dwflags: UInt): MutPtr

public expect fun internetOpenUrlA(hinternet: ConstPtr, lpszurl: Pcstr, lpszheaders: Pcstr, dwheaderslength: UInt, dwflags: UInt, dwcontext: ULong): MutPtr

public expect fun internetOpenUrlW(hinternet: ConstPtr, lpszurl: Pcwstr, lpszheaders: Pcwstr, dwheaderslength: UInt, dwflags: UInt, dwcontext: ULong): MutPtr

public expect fun internetOpenW(lpszagent: Pcwstr, dwaccesstype: UInt, lpszproxy: Pcwstr, lpszproxybypass: Pcwstr, dwflags: UInt): MutPtr

public expect fun internetQueryDataAvailable(hfile: ConstPtr, lpdwnumberofbytesavailable: MutPtr, dwflags: UInt, dwcontext: ULong): Bool

public expect fun internetQueryFortezzaStatus(pdwstatus: MutPtr, dwreserved: ULong): Bool

public expect fun internetQueryOptionA(hinternet: ConstPtr, dwoption: UInt, lpbuffer: MutPtr, lpdwbufferlength: MutPtr): Bool

public expect fun internetQueryOptionW(hinternet: ConstPtr, dwoption: UInt, lpbuffer: MutPtr, lpdwbufferlength: MutPtr): Bool

public expect fun internetReadFile(hfile: ConstPtr, lpbuffer: MutPtr, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: MutPtr): Bool

public expect fun internetReadFileExA(hfile: ConstPtr, lpbuffersout: MutPtr, dwflags: UInt, dwcontext: ULong): Bool

public expect fun internetReadFileExW(hfile: ConstPtr, lpbuffersout: MutPtr, dwflags: UInt, dwcontext: ULong): Bool

public expect fun internetSecurityProtocolToStringA(dwprotocol: UInt, lpstr: Pstr, lpdwstrlength: MutPtr, dwreserved: UInt): Bool

public expect fun internetSecurityProtocolToStringW(dwprotocol: UInt, lpstr: Pwstr, lpdwstrlength: MutPtr, dwreserved: UInt): Bool

public expect fun internetSetCookieA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pcstr): Bool

public expect fun internetSetCookieEx2(pcwszurl: Pcwstr, pcookie: ConstPtr, pcwszp3ppolicy: Pcwstr, dwflags: UInt, pdwcookiestate: MutPtr): UInt

public expect fun internetSetCookieExA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pcstr, dwflags: UInt, dwreserved: ULong): UInt

public expect fun internetSetCookieExW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr, dwflags: UInt, dwreserved: ULong): UInt

public expect fun internetSetCookieW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr): Bool

public expect fun internetSetDialState(lpszconnectoid: Pcstr, dwstate: UInt, dwreserved: UInt): Bool

public expect fun internetSetDialStateA(lpszconnectoid: Pcstr, dwstate: UInt, dwreserved: UInt): Bool

public expect fun internetSetDialStateW(lpszconnectoid: Pcwstr, dwstate: UInt, dwreserved: UInt): Bool

public expect fun internetSetFilePointer(hfile: ConstPtr, ldistancetomove: Int, lpdistancetomovehigh: MutPtr, dwmovemethod: UInt, dwcontext: ULong): UInt

public expect fun internetSetOptionA(hinternet: ConstPtr, dwoption: UInt, lpbuffer: ConstPtr, dwbufferlength: UInt): Bool

public expect fun internetSetOptionExA(hinternet: ConstPtr, dwoption: UInt, lpbuffer: ConstPtr, dwbufferlength: UInt, dwflags: UInt): Bool

public expect fun internetSetOptionExW(hinternet: ConstPtr, dwoption: UInt, lpbuffer: ConstPtr, dwbufferlength: UInt, dwflags: UInt): Bool

public expect fun internetSetOptionW(hinternet: ConstPtr, dwoption: UInt, lpbuffer: ConstPtr, dwbufferlength: UInt): Bool

public expect fun internetSetPerSiteCookieDecisionA(pchhostname: Pcstr, dwdecision: UInt): Bool

public expect fun internetSetPerSiteCookieDecisionW(pchhostname: Pcwstr, dwdecision: UInt): Bool

public expect fun internetSetStatusCallback(hinternet: ConstPtr, lpfninternetcallback: LpinternetStatusCallback): LpinternetStatusCallback

public expect fun internetSetStatusCallbackA(hinternet: ConstPtr, lpfninternetcallback: LpinternetStatusCallback): LpinternetStatusCallback

public expect fun internetSetStatusCallbackW(hinternet: ConstPtr, lpfninternetcallback: LpinternetStatusCallback): LpinternetStatusCallback

public expect fun internetShowSecurityInfoByURL(lpszurl: Pcstr, hwndparent: Hwnd): Bool

public expect fun internetShowSecurityInfoByURLA(lpszurl: Pcstr, hwndparent: Hwnd): Bool

public expect fun internetShowSecurityInfoByURLW(lpszurl: Pcwstr, hwndparent: Hwnd): Bool

public expect fun internetTimeFromSystemTime(pst: ConstPtr, dwrfc: UInt, lpsztime: Pstr, cbtime: UInt): Bool

public expect fun internetTimeFromSystemTimeA(pst: ConstPtr, dwrfc: UInt, lpsztime: Pstr, cbtime: UInt): Bool

public expect fun internetTimeFromSystemTimeW(pst: ConstPtr, dwrfc: UInt, lpsztime: Pwstr, cbtime: UInt): Bool

public expect fun internetTimeToSystemTime(lpsztime: Pcstr, pst: MutPtr, dwreserved: UInt): Bool

public expect fun internetTimeToSystemTimeA(lpsztime: Pcstr, pst: MutPtr, dwreserved: UInt): Bool

public expect fun internetTimeToSystemTimeW(lpsztime: Pcwstr, pst: MutPtr, dwreserved: UInt): Bool

public expect fun internetUnlockRequestFile(hlockrequestinfo: Handle): Bool

public expect fun internetWriteFile(hfile: ConstPtr, lpbuffer: ConstPtr, dwnumberofbytestowrite: UInt, lpdwnumberofbyteswritten: MutPtr): Bool

public expect fun internetWriteFileExA(hfile: ConstPtr, lpbuffersin: ConstPtr, dwflags: UInt, dwcontext: ULong): Bool

public expect fun internetWriteFileExW(hfile: ConstPtr, lpbuffersin: ConstPtr, dwflags: UInt, dwcontext: ULong): Bool

public expect fun isDomainLegalCookieDomainA(pchdomain: Pcstr, pchfulldomain: Pcstr): Bool

public expect fun isDomainLegalCookieDomainW(pchdomain: Pcwstr, pchfulldomain: Pcwstr): Bool

public expect fun isHostInProxyBypassList(tscheme: InternetScheme, lpszhost: Pcstr, cchhost: UInt): Bool

public expect fun isProfilesEnabled(): Bool

public expect fun isUrlCacheEntryExpiredA(lpszurlname: Pcstr, dwflags: UInt, pftlastmodified: MutPtr): Bool

public expect fun isUrlCacheEntryExpiredW(lpszurlname: Pcwstr, dwflags: UInt, pftlastmodified: MutPtr): Bool

public expect fun loadUrlCacheContent(): Bool

public expect fun parseX509EncodedCertificateForListBoxEntry(lpcert: ConstPtr, cbcert: UInt, lpszlistboxentry: Pstr, lpdwlistboxentry: MutPtr): UInt

public expect fun performOperationOverUrlCacheA(pszurlsearchpattern: Pcstr, dwflags: UInt, dwfilter: UInt, groupid: Long, preserved1: ConstPtr, pdwreserved2: ConstPtr, preserved3: ConstPtr, op: CacheOperator, poperatordata: MutPtr): Bool

public expect fun privacyGetZonePreferenceW(dwzone: UInt, dwtype: UInt, pdwtemplate: MutPtr, pszbuffer: Pwstr, pdwbufferlength: MutPtr): UInt

public expect fun privacySetZonePreferenceW(dwzone: UInt, dwtype: UInt, dwtemplate: UInt, pszpreference: Pcwstr): UInt

public expect fun readGuidsForConnectedNetworks(pcnetworks: MutPtr, pppwsznetworkguids: MutPtr, pppbstrnetworknames: MutPtr, pppwszgwmacs: MutPtr, pcgatewaymacs: MutPtr, pdwflags: MutPtr): Bool

public expect fun readUrlCacheEntryStream(hurlcachestream: Handle, dwlocation: UInt, lpbuffer: MutPtr, lpdwlen: MutPtr, reserved: UInt): Bool

public expect fun readUrlCacheEntryStreamEx(hurlcachestream: Handle, qwlocation: ULong, lpbuffer: MutPtr, lpdwlen: MutPtr): Bool

public expect fun registerUrlCacheNotification(hwnd: Hwnd, umsg: UInt, gid: Long, dwopsfilter: UInt, dwreserved: UInt): Bool

public expect fun resumeSuspendedDownload(hrequest: ConstPtr, dwresultcode: UInt): Bool

public expect fun retrieveUrlCacheEntryFileA(lpszurlname: Pcstr, lpcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, dwreserved: UInt): Bool

public expect fun retrieveUrlCacheEntryFileW(lpszurlname: Pcwstr, lpcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, dwreserved: UInt): Bool

public expect fun retrieveUrlCacheEntryStreamA(lpszurlname: Pcstr, lpcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, frandomread: Bool, dwreserved: UInt): Handle

public expect fun retrieveUrlCacheEntryStreamW(lpszurlname: Pcwstr, lpcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, frandomread: Bool, dwreserved: UInt): Handle

public expect fun runOnceUrlCache(hwnd: Hwnd, hinst: Hinstance, lpszcmd: Pcstr, ncmdshow: Int): UInt

public expect fun setUrlCacheConfigInfoA(lpcacheconfiginfo: ConstPtr, dwfieldcontrol: UInt): Bool

public expect fun setUrlCacheConfigInfoW(lpcacheconfiginfo: ConstPtr, dwfieldcontrol: UInt): Bool

public expect fun setUrlCacheEntryGroup(lpszurlname: Pcstr, dwflags: UInt, groupid: Long, pbgroupattributes: ConstPtr, cbgroupattributes: UInt, lpreserved: ConstPtr): Bool

public expect fun setUrlCacheEntryGroupA(lpszurlname: Pcstr, dwflags: UInt, groupid: Long, pbgroupattributes: ConstPtr, cbgroupattributes: UInt, lpreserved: ConstPtr): Bool

public expect fun setUrlCacheEntryGroupW(lpszurlname: Pcwstr, dwflags: UInt, groupid: Long, pbgroupattributes: ConstPtr, cbgroupattributes: UInt, lpreserved: ConstPtr): Bool

public expect fun setUrlCacheEntryInfoA(lpszurlname: Pcstr, lpcacheentryinfo: ConstPtr, dwfieldcontrol: UInt): Bool

public expect fun setUrlCacheEntryInfoW(lpszurlname: Pcwstr, lpcacheentryinfo: ConstPtr, dwfieldcontrol: UInt): Bool

public expect fun setUrlCacheGroupAttributeA(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: ConstPtr, lpreserved: ConstPtr): Bool

public expect fun setUrlCacheGroupAttributeW(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: ConstPtr, lpreserved: ConstPtr): Bool

public expect fun setUrlCacheHeaderData(nidx: UInt, dwdata: UInt): Bool

public expect fun showClientAuthCerts(hwndparent: Hwnd): UInt

public expect fun showSecurityInfo(hwndparent: Hwnd, psecurityinfo: ConstPtr): UInt

public expect fun showX509EncodedCertificate(hwndparent: Hwnd, lpcert: ConstPtr, cbcert: UInt): UInt

public expect fun unlockUrlCacheEntryFile(lpszurlname: Pcstr, dwreserved: UInt): Bool

public expect fun unlockUrlCacheEntryFileA(lpszurlname: Pcstr, dwreserved: UInt): Bool

public expect fun unlockUrlCacheEntryFileW(lpszurlname: Pcwstr, dwreserved: UInt): Bool

public expect fun unlockUrlCacheEntryStream(hurlcachestream: Handle, reserved: UInt): Bool

public expect fun updateUrlCacheContentPath(sznewpath: Pcstr): Bool

public expect fun urlCacheCheckEntriesExist(rgpwszurls: ConstPtr, centries: UInt, rgfexist: MutPtr): UInt

public expect fun urlCacheCloseEntryHandle(hentryfile: ConstPtr)

public expect fun urlCacheContainerSetEntryMaximumAge(pwszprefix: Pcwstr, dwentrymaxage: UInt): UInt

public expect fun urlCacheCreateContainer(pwszname: Pcwstr, pwszprefix: Pcwstr, pwszdirectory: Pcwstr, ulllimit: ULong, dwoptions: UInt): UInt

public expect fun urlCacheFindFirstEntry(pwszprefix: Pcwstr, dwflags: UInt, dwfilter: UInt, groupid: Long, pcacheentryinfo: MutPtr, phfind: MutPtr): UInt

public expect fun urlCacheFindNextEntry(hfind: Handle, pcacheentryinfo: MutPtr): UInt

public expect fun urlCacheFreeEntryInfo(pcacheentryinfo: MutPtr)

public expect fun urlCacheFreeGlobalSpace(ulltargetsize: ULong, dwfilter: UInt): UInt

public expect fun urlCacheGetContentPaths(pppwszdirectories: MutPtr, pcdirectories: MutPtr): UInt

public expect fun urlCacheGetEntryInfo(happcache: ConstPtr, pcwszurl: Pcwstr, pcacheentryinfo: MutPtr): UInt

public expect fun urlCacheGetGlobalCacheSize(dwfilter: UInt, pullsize: MutPtr, pulllimit: MutPtr): UInt

public expect fun urlCacheGetGlobalLimit(limittype: UrlCacheLimitType, pulllimit: MutPtr): UInt

public expect fun urlCacheReadEntryStream(hurlcachestream: ConstPtr, ulllocation: ULong, pbuffer: MutPtr, dwbufferlen: UInt, pdwbufferlen: MutPtr): UInt

public expect fun urlCacheReloadSettings(): UInt

public expect fun urlCacheRetrieveEntryFile(happcache: ConstPtr, pcwszurl: Pcwstr, pcacheentryinfo: MutPtr, phentryfile: MutPtr): UInt

public expect fun urlCacheRetrieveEntryStream(happcache: ConstPtr, pcwszurl: Pcwstr, frandomread: Bool, pcacheentryinfo: MutPtr, phentrystream: MutPtr): UInt

public expect fun urlCacheServer(): UInt

public expect fun urlCacheSetGlobalLimit(limittype: UrlCacheLimitType, ulllimit: ULong): UInt

public expect fun urlCacheUpdateEntryExtraData(happcache: ConstPtr, pcwszurl: Pcwstr, pbextradata: ConstPtr, cbextradata: UInt): UInt
