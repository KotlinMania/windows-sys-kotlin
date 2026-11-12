package io.github.kotlinmania.windowssys.windows.win32.networking.wininet

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.WinHttpCreateUrlFlags
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.AlgId
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertChainContext
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.Win32FindDataa
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.Win32FindDataw

public expect fun appCacheCheckManifest(pwszmasterurl: Pcwstr, pwszmanifesturl: Pcwstr, pbmanifestdata: ConstPtr<UByte>, dwmanifestdatasize: UInt, pbmanifestresponseheaders: ConstPtr<UByte>, dwmanifestresponseheaderssize: UInt, pestate: MutPtr<AppCacheState>, phnewappcache: MutPtr<MutPtr<CVoid>>): UInt

public expect fun appCacheCloseHandle(happcache: ConstPtr<CVoid>)

public expect fun appCacheCreateAndCommitFile(happcache: ConstPtr<CVoid>, pwszsourcefilepath: Pcwstr, pwszurl: Pcwstr, pbresponseheaders: ConstPtr<UByte>, dwresponseheaderssize: UInt): UInt

public expect fun appCacheDeleteGroup(pwszmanifesturl: Pcwstr): UInt

public expect fun appCacheDeleteIEGroup(pwszmanifesturl: Pcwstr): UInt

public expect fun appCacheDuplicateHandle(happcache: ConstPtr<CVoid>, phduplicatedappcache: MutPtr<MutPtr<CVoid>>): UInt

public expect fun appCacheFinalize(happcache: ConstPtr<CVoid>, pbmanifestdata: ConstPtr<UByte>, dwmanifestdatasize: UInt, pestate: MutPtr<AppCacheFinalizeState>): UInt

public expect fun appCacheFreeDownloadList(pdownloadlist: MutPtr<AppCacheDownloadList>)

public expect fun appCacheFreeGroupList(pappcachegrouplist: MutPtr<AppCacheGroupList>)

public expect fun appCacheFreeIESpace(ftcutoff: Filetime): UInt

public expect fun appCacheFreeSpace(ftcutoff: Filetime): UInt

public expect fun appCacheGetDownloadList(happcache: ConstPtr<CVoid>, pdownloadlist: MutPtr<AppCacheDownloadList>): UInt

public expect fun appCacheGetFallbackUrl(happcache: ConstPtr<CVoid>, pwszurl: Pcwstr, ppwszfallbackurl: MutPtr<Pwstr>): UInt

public expect fun appCacheGetGroupList(pappcachegrouplist: MutPtr<AppCacheGroupList>): UInt

public expect fun appCacheGetIEGroupList(pappcachegrouplist: MutPtr<AppCacheGroupList>): UInt

public expect fun appCacheGetInfo(happcache: ConstPtr<CVoid>, pappcacheinfo: MutPtr<AppCacheGroupInfo>): UInt

public expect fun appCacheGetManifestUrl(happcache: ConstPtr<CVoid>, ppwszmanifesturl: MutPtr<Pwstr>): UInt

public expect fun appCacheLookup(pwszurl: Pcwstr, dwflags: UInt, phappcache: MutPtr<MutPtr<CVoid>>): UInt

public expect fun commitUrlCacheEntryA(lpszurlname: Pcstr, lpszlocalfilename: Pcstr, expiretime: Filetime, lastmodifiedtime: Filetime, cacheentrytype: UInt, lpheaderinfo: ConstPtr<UByte>, cchheaderinfo: UInt, lpszfileextension: Pcstr, lpszoriginalurl: Pcstr): Bool

public expect fun commitUrlCacheEntryBinaryBlob(pwszurlname: Pcwstr, dwtype: UInt, ftexpiretime: Filetime, ftmodifiedtime: Filetime, pbblob: ConstPtr<UByte>, cbblob: UInt): UInt

public expect fun commitUrlCacheEntryW(lpszurlname: Pcwstr, lpszlocalfilename: Pcwstr, expiretime: Filetime, lastmodifiedtime: Filetime, cacheentrytype: UInt, lpszheaderinfo: Pcwstr, cchheaderinfo: UInt, lpszfileextension: Pcwstr, lpszoriginalurl: Pcwstr): Bool

public expect fun createMD5SSOHash(pszchallengeinfo: Pcwstr, pwszrealm: Pcwstr, pwsztarget: Pcwstr, pbhexhash: MutPtr<UByte>): Bool

public expect fun createUrlCacheContainerA(name: Pcstr, lpcacheprefix: Pcstr, lpszcachepath: Pcstr, kbcachelimit: UInt, dwcontainertype: UInt, dwoptions: UInt, pvbuffer: ConstPtr<CVoid>, cbbuffer: ConstPtr<UInt>): Bool

public expect fun createUrlCacheContainerW(name: Pcwstr, lpcacheprefix: Pcwstr, lpszcachepath: Pcwstr, kbcachelimit: UInt, dwcontainertype: UInt, dwoptions: UInt, pvbuffer: ConstPtr<CVoid>, cbbuffer: ConstPtr<UInt>): Bool

public expect fun createUrlCacheEntryA(lpszurlname: Pcstr, dwexpectedfilesize: UInt, lpszfileextension: Pcstr, lpszfilename: Pstr, dwreserved: UInt): Bool

public expect fun createUrlCacheEntryExW(lpszurlname: Pcwstr, dwexpectedfilesize: UInt, lpszfileextension: Pcwstr, lpszfilename: Pwstr, dwreserved: UInt, fpreserveincomingfilename: Bool): Bool

public expect fun createUrlCacheEntryW(lpszurlname: Pcwstr, dwexpectedfilesize: UInt, lpszfileextension: Pcwstr, lpszfilename: Pwstr, dwreserved: UInt): Bool

public expect fun createUrlCacheGroup(dwflags: UInt, lpreserved: ConstPtr<CVoid>): Long

public expect fun deleteIE3Cache(hwnd: Hwnd, hinst: Hinstance, lpszcmd: Pcstr, ncmdshow: Int): UInt

public expect fun deleteUrlCacheContainerA(name: Pcstr, dwoptions: UInt): Bool

public expect fun deleteUrlCacheContainerW(name: Pcwstr, dwoptions: UInt): Bool

public expect fun deleteUrlCacheEntry(lpszurlname: Pcstr): Bool

public expect fun deleteUrlCacheEntryA(lpszurlname: Pcstr): Bool

public expect fun deleteUrlCacheEntryW(lpszurlname: Pcwstr): Bool

public expect fun deleteUrlCacheGroup(groupid: Long, dwflags: UInt, lpreserved: ConstPtr<CVoid>): Bool

public expect fun deleteWpadCacheForNetworks(param0: WpadCacheDelete): Bool

public expect fun detectAutoProxyUrl(pszautoproxyurl: Pstr, cchautoproxyurl: UInt, dwdetectflags: ProxyAutoDetectType): Bool

public expect fun doConnectoidsExist(): Bool

public expect fun exportCookieFileA(szfilename: Pcstr, fappend: Bool): Bool

public expect fun exportCookieFileW(szfilename: Pcwstr, fappend: Bool): Bool

public expect fun findCloseUrlCache(henumhandle: Handle): Bool

public expect fun findFirstUrlCacheContainerA(pdwmodified: MutPtr<UInt>, lpcontainerinfo: MutPtr<InternetCacheContainerInfoa>, lpcbcontainerinfo: MutPtr<UInt>, dwoptions: UInt): Handle

public expect fun findFirstUrlCacheContainerW(pdwmodified: MutPtr<UInt>, lpcontainerinfo: MutPtr<InternetCacheContainerInfow>, lpcbcontainerinfo: MutPtr<UInt>, dwoptions: UInt): Handle

public expect fun findFirstUrlCacheEntryA(lpszurlsearchpattern: Pcstr, lpfirstcacheentryinfo: MutPtr<InternetCacheEntryInfoa>, lpcbcacheentryinfo: MutPtr<UInt>): Handle

public expect fun findFirstUrlCacheEntryExA(lpszurlsearchpattern: Pcstr, dwflags: UInt, dwfilter: UInt, groupid: Long, lpfirstcacheentryinfo: MutPtr<InternetCacheEntryInfoa>, lpcbcacheentryinfo: MutPtr<UInt>, lpgroupattributes: ConstPtr<CVoid>, lpcbgroupattributes: ConstPtr<UInt>, lpreserved: ConstPtr<CVoid>): Handle

public expect fun findFirstUrlCacheEntryExW(lpszurlsearchpattern: Pcwstr, dwflags: UInt, dwfilter: UInt, groupid: Long, lpfirstcacheentryinfo: MutPtr<InternetCacheEntryInfow>, lpcbcacheentryinfo: MutPtr<UInt>, lpgroupattributes: ConstPtr<CVoid>, lpcbgroupattributes: ConstPtr<UInt>, lpreserved: ConstPtr<CVoid>): Handle

public expect fun findFirstUrlCacheEntryW(lpszurlsearchpattern: Pcwstr, lpfirstcacheentryinfo: MutPtr<InternetCacheEntryInfow>, lpcbcacheentryinfo: MutPtr<UInt>): Handle

public expect fun findFirstUrlCacheGroup(dwflags: UInt, dwfilter: UInt, lpsearchcondition: ConstPtr<CVoid>, dwsearchcondition: UInt, lpgroupid: MutPtr<Long>, lpreserved: ConstPtr<CVoid>): Handle

public expect fun findNextUrlCacheContainerA(henumhandle: Handle, lpcontainerinfo: MutPtr<InternetCacheContainerInfoa>, lpcbcontainerinfo: MutPtr<UInt>): Bool

public expect fun findNextUrlCacheContainerW(henumhandle: Handle, lpcontainerinfo: MutPtr<InternetCacheContainerInfow>, lpcbcontainerinfo: MutPtr<UInt>): Bool

public expect fun findNextUrlCacheEntryA(henumhandle: Handle, lpnextcacheentryinfo: MutPtr<InternetCacheEntryInfoa>, lpcbcacheentryinfo: MutPtr<UInt>): Bool

public expect fun findNextUrlCacheEntryExA(henumhandle: Handle, lpnextcacheentryinfo: MutPtr<InternetCacheEntryInfoa>, lpcbcacheentryinfo: MutPtr<UInt>, lpgroupattributes: ConstPtr<CVoid>, lpcbgroupattributes: ConstPtr<UInt>, lpreserved: ConstPtr<CVoid>): Bool

public expect fun findNextUrlCacheEntryExW(henumhandle: Handle, lpnextcacheentryinfo: MutPtr<InternetCacheEntryInfow>, lpcbcacheentryinfo: MutPtr<UInt>, lpgroupattributes: ConstPtr<CVoid>, lpcbgroupattributes: ConstPtr<UInt>, lpreserved: ConstPtr<CVoid>): Bool

public expect fun findNextUrlCacheEntryW(henumhandle: Handle, lpnextcacheentryinfo: MutPtr<InternetCacheEntryInfow>, lpcbcacheentryinfo: MutPtr<UInt>): Bool

public expect fun findNextUrlCacheGroup(hfind: Handle, lpgroupid: MutPtr<Long>, lpreserved: ConstPtr<CVoid>): Bool

public expect fun findP3PPolicySymbol(pszsymbol: Pcstr): Int

public expect fun freeUrlCacheSpaceA(lpszcachepath: Pcstr, dwsize: UInt, dwfilter: UInt): Bool

public expect fun freeUrlCacheSpaceW(lpszcachepath: Pcwstr, dwsize: UInt, dwfilter: UInt): Bool

public expect fun ftpCommandA(hconnect: ConstPtr<CVoid>, fexpectresponse: Bool, dwflags: FtpFlags, lpszcommand: Pcstr, dwcontext: ULong, phftpcommand: MutPtr<MutPtr<CVoid>>): Bool

public expect fun ftpCommandW(hconnect: ConstPtr<CVoid>, fexpectresponse: Bool, dwflags: FtpFlags, lpszcommand: Pcwstr, dwcontext: ULong, phftpcommand: MutPtr<MutPtr<CVoid>>): Bool

public expect fun ftpCreateDirectoryA(hconnect: ConstPtr<CVoid>, lpszdirectory: Pcstr): Bool

public expect fun ftpCreateDirectoryW(hconnect: ConstPtr<CVoid>, lpszdirectory: Pcwstr): Bool

public expect fun ftpDeleteFileA(hconnect: ConstPtr<CVoid>, lpszfilename: Pcstr): Bool

public expect fun ftpDeleteFileW(hconnect: ConstPtr<CVoid>, lpszfilename: Pcwstr): Bool

public expect fun ftpFindFirstFileA(hconnect: ConstPtr<CVoid>, lpszsearchfile: Pcstr, lpfindfiledata: MutPtr<Win32FindDataa>, dwflags: UInt, dwcontext: ULong): MutPtr<CVoid>

public expect fun ftpFindFirstFileW(hconnect: ConstPtr<CVoid>, lpszsearchfile: Pcwstr, lpfindfiledata: MutPtr<Win32FindDataw>, dwflags: UInt, dwcontext: ULong): MutPtr<CVoid>

public expect fun ftpGetCurrentDirectoryA(hconnect: ConstPtr<CVoid>, lpszcurrentdirectory: Pstr, lpdwcurrentdirectory: MutPtr<UInt>): Bool

public expect fun ftpGetCurrentDirectoryW(hconnect: ConstPtr<CVoid>, lpszcurrentdirectory: Pwstr, lpdwcurrentdirectory: MutPtr<UInt>): Bool

public expect fun ftpGetFileA(hconnect: ConstPtr<CVoid>, lpszremotefile: Pcstr, lpsznewfile: Pcstr, ffailifexists: Bool, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): Bool

public expect fun ftpGetFileEx(hftpsession: ConstPtr<CVoid>, lpszremotefile: Pcstr, lpsznewfile: Pcwstr, ffailifexists: Bool, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): Bool

public expect fun ftpGetFileSize(hfile: ConstPtr<CVoid>, lpdwfilesizehigh: MutPtr<UInt>): UInt

public expect fun ftpGetFileW(hconnect: ConstPtr<CVoid>, lpszremotefile: Pcwstr, lpsznewfile: Pcwstr, ffailifexists: Bool, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): Bool

public expect fun ftpOpenFileA(hconnect: ConstPtr<CVoid>, lpszfilename: Pcstr, dwaccess: UInt, dwflags: FtpFlags, dwcontext: ULong): MutPtr<CVoid>

public expect fun ftpOpenFileW(hconnect: ConstPtr<CVoid>, lpszfilename: Pcwstr, dwaccess: UInt, dwflags: FtpFlags, dwcontext: ULong): MutPtr<CVoid>

public expect fun ftpPutFileA(hconnect: ConstPtr<CVoid>, lpszlocalfile: Pcstr, lpsznewremotefile: Pcstr, dwflags: FtpFlags, dwcontext: ULong): Bool

public expect fun ftpPutFileEx(hftpsession: ConstPtr<CVoid>, lpszlocalfile: Pcwstr, lpsznewremotefile: Pcstr, dwflags: UInt, dwcontext: ULong): Bool

public expect fun ftpPutFileW(hconnect: ConstPtr<CVoid>, lpszlocalfile: Pcwstr, lpsznewremotefile: Pcwstr, dwflags: FtpFlags, dwcontext: ULong): Bool

public expect fun ftpRemoveDirectoryA(hconnect: ConstPtr<CVoid>, lpszdirectory: Pcstr): Bool

public expect fun ftpRemoveDirectoryW(hconnect: ConstPtr<CVoid>, lpszdirectory: Pcwstr): Bool

public expect fun ftpRenameFileA(hconnect: ConstPtr<CVoid>, lpszexisting: Pcstr, lpsznew: Pcstr): Bool

public expect fun ftpRenameFileW(hconnect: ConstPtr<CVoid>, lpszexisting: Pcwstr, lpsznew: Pcwstr): Bool

public expect fun ftpSetCurrentDirectoryA(hconnect: ConstPtr<CVoid>, lpszdirectory: Pcstr): Bool

public expect fun ftpSetCurrentDirectoryW(hconnect: ConstPtr<CVoid>, lpszdirectory: Pcwstr): Bool

public expect fun getDiskInfoA(pszpath: Pcstr, pdwclustersize: MutPtr<UInt>, pdlavail: MutPtr<ULong>, pdltotal: MutPtr<ULong>): Bool

public expect fun getUrlCacheConfigInfoA(lpcacheconfiginfo: MutPtr<InternetCacheConfigInfoa>, lpcbcacheconfiginfo: ConstPtr<UInt>, dwfieldcontrol: CacheConfig): Bool

public expect fun getUrlCacheConfigInfoW(lpcacheconfiginfo: MutPtr<InternetCacheConfigInfow>, lpcbcacheconfiginfo: ConstPtr<UInt>, dwfieldcontrol: CacheConfig): Bool

public expect fun getUrlCacheEntryBinaryBlob(pwszurlname: Pcwstr, dwtype: MutPtr<UInt>, pftexpiretime: MutPtr<Filetime>, pftaccesstime: MutPtr<Filetime>, pftmodifiedtime: MutPtr<Filetime>, ppbblob: MutPtr<MutPtr<UByte>>, pcbblob: MutPtr<UInt>): UInt

public expect fun getUrlCacheEntryInfoA(lpszurlname: Pcstr, lpcacheentryinfo: MutPtr<InternetCacheEntryInfoa>, lpcbcacheentryinfo: MutPtr<UInt>): Bool

public expect fun getUrlCacheEntryInfoExA(lpszurl: Pcstr, lpcacheentryinfo: MutPtr<InternetCacheEntryInfoa>, lpcbcacheentryinfo: MutPtr<UInt>, lpszredirecturl: Pcstr, lpcbredirecturl: ConstPtr<UInt>, lpreserved: ConstPtr<CVoid>, dwflags: UInt): Bool

public expect fun getUrlCacheEntryInfoExW(lpszurl: Pcwstr, lpcacheentryinfo: MutPtr<InternetCacheEntryInfow>, lpcbcacheentryinfo: MutPtr<UInt>, lpszredirecturl: Pcwstr, lpcbredirecturl: ConstPtr<UInt>, lpreserved: ConstPtr<CVoid>, dwflags: UInt): Bool

public expect fun getUrlCacheEntryInfoW(lpszurlname: Pcwstr, lpcacheentryinfo: MutPtr<InternetCacheEntryInfow>, lpcbcacheentryinfo: MutPtr<UInt>): Bool

public expect fun getUrlCacheGroupAttributeA(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: MutPtr<InternetCacheGroupInfoa>, lpcbgroupinfo: MutPtr<UInt>, lpreserved: ConstPtr<CVoid>): Bool

public expect fun getUrlCacheGroupAttributeW(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: MutPtr<InternetCacheGroupInfow>, lpcbgroupinfo: MutPtr<UInt>, lpreserved: ConstPtr<CVoid>): Bool

public expect fun getUrlCacheHeaderData(nidx: UInt, lpdwdata: MutPtr<UInt>): Bool

public expect fun gopherCreateLocatorA(lpszhost: Pcstr, nserverport: UShort, lpszdisplaystring: Pcstr, lpszselectorstring: Pcstr, dwgophertype: UInt, lpszlocator: Pstr, lpdwbufferlength: MutPtr<UInt>): Bool

public expect fun gopherCreateLocatorW(lpszhost: Pcwstr, nserverport: UShort, lpszdisplaystring: Pcwstr, lpszselectorstring: Pcwstr, dwgophertype: UInt, lpszlocator: Pwstr, lpdwbufferlength: MutPtr<UInt>): Bool

public expect fun gopherFindFirstFileA(hconnect: ConstPtr<CVoid>, lpszlocator: Pcstr, lpszsearchstring: Pcstr, lpfinddata: MutPtr<GopherFindDataa>, dwflags: UInt, dwcontext: ULong): MutPtr<CVoid>

public expect fun gopherFindFirstFileW(hconnect: ConstPtr<CVoid>, lpszlocator: Pcwstr, lpszsearchstring: Pcwstr, lpfinddata: MutPtr<GopherFindDataw>, dwflags: UInt, dwcontext: ULong): MutPtr<CVoid>

public expect fun gopherGetAttributeA(hconnect: ConstPtr<CVoid>, lpszlocator: Pcstr, lpszattributename: Pcstr, lpbuffer: MutPtr<UByte>, dwbufferlength: UInt, lpdwcharactersreturned: MutPtr<UInt>, lpfnenumerator: GopherAttributeEnumerator, dwcontext: ULong): Bool

public expect fun gopherGetAttributeW(hconnect: ConstPtr<CVoid>, lpszlocator: Pcwstr, lpszattributename: Pcwstr, lpbuffer: MutPtr<UByte>, dwbufferlength: UInt, lpdwcharactersreturned: MutPtr<UInt>, lpfnenumerator: GopherAttributeEnumerator, dwcontext: ULong): Bool

public expect fun gopherGetLocatorTypeA(lpszlocator: Pcstr, lpdwgophertype: MutPtr<UInt>): Bool

public expect fun gopherGetLocatorTypeW(lpszlocator: Pcwstr, lpdwgophertype: MutPtr<UInt>): Bool

public expect fun gopherOpenFileA(hconnect: ConstPtr<CVoid>, lpszlocator: Pcstr, lpszview: Pcstr, dwflags: UInt, dwcontext: ULong): MutPtr<CVoid>

public expect fun gopherOpenFileW(hconnect: ConstPtr<CVoid>, lpszlocator: Pcwstr, lpszview: Pcwstr, dwflags: UInt, dwcontext: ULong): MutPtr<CVoid>

public expect fun httpAddRequestHeadersA(hrequest: ConstPtr<CVoid>, lpszheaders: Pcstr, dwheaderslength: UInt, dwmodifiers: HttpAddreqFlag): Bool

public expect fun httpAddRequestHeadersW(hrequest: ConstPtr<CVoid>, lpszheaders: Pcwstr, dwheaderslength: UInt, dwmodifiers: HttpAddreqFlag): Bool

public expect fun httpCheckDavComplianceA(lpszurl: Pcstr, lpszcompliancetoken: Pcstr, lpffound: MutPtr<Bool>, hwnd: Hwnd, lpvreserved: ConstPtr<CVoid>): Bool

public expect fun httpCheckDavComplianceW(lpszurl: Pcwstr, lpszcompliancetoken: Pcwstr, lpffound: MutPtr<Bool>, hwnd: Hwnd, lpvreserved: ConstPtr<CVoid>): Bool

public expect fun httpCloseDependencyHandle(hdependencyhandle: ConstPtr<CVoid>)

public expect fun httpDuplicateDependencyHandle(hdependencyhandle: ConstPtr<CVoid>, phduplicateddependencyhandle: MutPtr<MutPtr<CVoid>>): UInt

public expect fun httpEndRequestA(hrequest: ConstPtr<CVoid>, lpbuffersout: MutPtr<InternetBuffersa>, dwflags: UInt, dwcontext: ULong): Bool

public expect fun httpEndRequestW(hrequest: ConstPtr<CVoid>, lpbuffersout: MutPtr<InternetBuffersw>, dwflags: UInt, dwcontext: ULong): Bool

public expect fun httpGetServerCredentials(pwszurl: Pcwstr, ppwszusername: MutPtr<Pwstr>, ppwszpassword: MutPtr<Pwstr>): UInt

public expect fun httpIndicatePageLoadComplete(hdependencyhandle: ConstPtr<CVoid>): UInt

public expect fun httpIsHostHstsEnabled(pcwszurl: Pcwstr, pfishsts: MutPtr<Bool>): UInt

public expect fun httpOpenDependencyHandle(hrequesthandle: ConstPtr<CVoid>, fbackground: Bool, phdependencyhandle: MutPtr<MutPtr<CVoid>>): UInt

public expect fun httpOpenRequestA(hconnect: ConstPtr<CVoid>, lpszverb: Pcstr, lpszobjectname: Pcstr, lpszversion: Pcstr, lpszreferrer: Pcstr, lplpszaccepttypes: ConstPtr<Pcstr>, dwflags: UInt, dwcontext: ULong): MutPtr<CVoid>

public expect fun httpOpenRequestW(hconnect: ConstPtr<CVoid>, lpszverb: Pcwstr, lpszobjectname: Pcwstr, lpszversion: Pcwstr, lpszreferrer: Pcwstr, lplpszaccepttypes: ConstPtr<Pcwstr>, dwflags: UInt, dwcontext: ULong): MutPtr<CVoid>

public expect fun httpPushClose(hwait: HttpPushWaitHandle)

public expect fun httpPushEnable(hrequest: ConstPtr<CVoid>, ptransportsetting: ConstPtr<HttpPushTransportSetting>, phwait: MutPtr<HttpPushWaitHandle>): UInt

public expect fun httpPushWait(hwait: HttpPushWaitHandle, etype: HttpPushWaitType, pnotificationstatus: MutPtr<HttpPushNotificationStatus>): UInt

public expect fun httpQueryInfoA(hrequest: ConstPtr<CVoid>, dwinfolevel: UInt, lpbuffer: MutPtr<CVoid>, lpdwbufferlength: MutPtr<UInt>, lpdwindex: MutPtr<UInt>): Bool

public expect fun httpQueryInfoW(hrequest: ConstPtr<CVoid>, dwinfolevel: UInt, lpbuffer: MutPtr<CVoid>, lpdwbufferlength: MutPtr<UInt>, lpdwindex: MutPtr<UInt>): Bool

public expect fun httpSendRequestA(hrequest: ConstPtr<CVoid>, lpszheaders: Pcstr, dwheaderslength: UInt, lpoptional: ConstPtr<CVoid>, dwoptionallength: UInt): Bool

public expect fun httpSendRequestExA(hrequest: ConstPtr<CVoid>, lpbuffersin: ConstPtr<InternetBuffersa>, lpbuffersout: MutPtr<InternetBuffersa>, dwflags: UInt, dwcontext: ULong): Bool

public expect fun httpSendRequestExW(hrequest: ConstPtr<CVoid>, lpbuffersin: ConstPtr<InternetBuffersw>, lpbuffersout: MutPtr<InternetBuffersw>, dwflags: UInt, dwcontext: ULong): Bool

public expect fun httpSendRequestW(hrequest: ConstPtr<CVoid>, lpszheaders: Pcwstr, dwheaderslength: UInt, lpoptional: ConstPtr<CVoid>, dwoptionallength: UInt): Bool

public expect fun httpWebSocketClose(hwebsocket: ConstPtr<CVoid>, usstatus: UShort, pvreason: ConstPtr<CVoid>, dwreasonlength: UInt): Bool

public expect fun httpWebSocketCompleteUpgrade(hrequest: ConstPtr<CVoid>, dwcontext: ULong): MutPtr<CVoid>

public expect fun httpWebSocketQueryCloseStatus(hwebsocket: ConstPtr<CVoid>, pusstatus: MutPtr<UShort>, pvreason: MutPtr<CVoid>, dwreasonlength: UInt, pdwreasonlengthconsumed: MutPtr<UInt>): Bool

public expect fun httpWebSocketReceive(hwebsocket: ConstPtr<CVoid>, pvbuffer: MutPtr<CVoid>, dwbufferlength: UInt, pdwbytesread: MutPtr<UInt>, pbuffertype: MutPtr<HttpWebSocketBufferType>): Bool

public expect fun httpWebSocketSend(hwebsocket: ConstPtr<CVoid>, buffertype: HttpWebSocketBufferType, pvbuffer: ConstPtr<CVoid>, dwbufferlength: UInt): Bool

public expect fun httpWebSocketShutdown(hwebsocket: ConstPtr<CVoid>, usstatus: UShort, pvreason: ConstPtr<CVoid>, dwreasonlength: UInt): Bool

public expect fun importCookieFileA(szfilename: Pcstr): Bool

public expect fun importCookieFileW(szfilename: Pcwstr): Bool

public expect fun incrementUrlCacheHeaderData(nidx: UInt, lpdwdata: MutPtr<UInt>): Bool

public expect fun internalInternetGetCookie(lpszurl: Pcstr, lpszcookiedata: Pstr, lpdwdatasize: MutPtr<UInt>): UInt

public expect fun internetAlgIdToStringA(ai: AlgId, lpstr: Pstr, lpdwstrlength: MutPtr<UInt>, dwreserved: UInt): Bool

public expect fun internetAlgIdToStringW(ai: AlgId, lpstr: Pwstr, lpdwstrlength: MutPtr<UInt>, dwreserved: UInt): Bool

public expect fun internetAttemptConnect(dwreserved: UInt): UInt

public expect fun internetAutodial(dwflags: InternetAutodial, hwndparent: Hwnd): Bool

public expect fun internetAutodialHangup(dwreserved: UInt): Bool

public expect fun internetCanonicalizeUrlA(lpszurl: Pcstr, lpszbuffer: Pstr, lpdwbufferlength: MutPtr<UInt>, dwflags: UInt): Bool

public expect fun internetCanonicalizeUrlW(lpszurl: Pcwstr, lpszbuffer: Pwstr, lpdwbufferlength: MutPtr<UInt>, dwflags: UInt): Bool

public expect fun internetCheckConnectionA(lpszurl: Pcstr, dwflags: UInt, dwreserved: UInt): Bool

public expect fun internetCheckConnectionW(lpszurl: Pcwstr, dwflags: UInt, dwreserved: UInt): Bool

public expect fun internetClearAllPerSiteCookieDecisions(): Bool

public expect fun internetCloseHandle(hinternet: ConstPtr<CVoid>): Bool

public expect fun internetCombineUrlA(lpszbaseurl: Pcstr, lpszrelativeurl: Pcstr, lpszbuffer: Pstr, lpdwbufferlength: MutPtr<UInt>, dwflags: UInt): Bool

public expect fun internetCombineUrlW(lpszbaseurl: Pcwstr, lpszrelativeurl: Pcwstr, lpszbuffer: Pwstr, lpdwbufferlength: MutPtr<UInt>, dwflags: UInt): Bool

public expect fun internetConfirmZoneCrossing(hwnd: Hwnd, szurlprev: Pcstr, szurlnew: Pcstr, bpost: Bool): UInt

public expect fun internetConfirmZoneCrossingA(hwnd: Hwnd, szurlprev: Pcstr, szurlnew: Pcstr, bpost: Bool): UInt

public expect fun internetConfirmZoneCrossingW(hwnd: Hwnd, szurlprev: Pcwstr, szurlnew: Pcwstr, bpost: Bool): UInt

public expect fun internetConnectA(hinternet: ConstPtr<CVoid>, lpszservername: Pcstr, nserverport: UShort, lpszusername: Pcstr, lpszpassword: Pcstr, dwservice: UInt, dwflags: UInt, dwcontext: ULong): MutPtr<CVoid>

public expect fun internetConnectW(hinternet: ConstPtr<CVoid>, lpszservername: Pcwstr, nserverport: UShort, lpszusername: Pcwstr, lpszpassword: Pcwstr, dwservice: UInt, dwflags: UInt, dwcontext: ULong): MutPtr<CVoid>

public expect fun internetConvertUrlFromWireToWideChar(pcszurl: Pcstr, cchurl: UInt, pcwszbaseurl: Pcwstr, dwcodepagehost: UInt, dwcodepagepath: UInt, fencodepathextra: Bool, dwcodepageextra: UInt, ppwszconvertedurl: MutPtr<Pwstr>): UInt

public expect fun internetCrackUrlA(lpszurl: Pcstr, dwurllength: UInt, dwflags: WinHttpCreateUrlFlags, lpurlcomponents: MutPtr<UrlComponentsa>): Bool

public expect fun internetCrackUrlW(lpszurl: Pcwstr, dwurllength: UInt, dwflags: WinHttpCreateUrlFlags, lpurlcomponents: MutPtr<UrlComponentsw>): Bool

public expect fun internetCreateUrlA(lpurlcomponents: ConstPtr<UrlComponentsa>, dwflags: UInt, lpszurl: Pstr, lpdwurllength: MutPtr<UInt>): Bool

public expect fun internetCreateUrlW(lpurlcomponents: ConstPtr<UrlComponentsw>, dwflags: UInt, lpszurl: Pwstr, lpdwurllength: MutPtr<UInt>): Bool

public expect fun internetDial(hwndparent: Hwnd, lpszconnectoid: Pcstr, dwflags: UInt, lpdwconnection: MutPtr<UInt>, dwreserved: UInt): UInt

public expect fun internetDialA(hwndparent: Hwnd, lpszconnectoid: Pcstr, dwflags: UInt, lpdwconnection: MutPtr<ULong>, dwreserved: UInt): UInt

public expect fun internetDialW(hwndparent: Hwnd, lpszconnectoid: Pcwstr, dwflags: UInt, lpdwconnection: MutPtr<ULong>, dwreserved: UInt): UInt

public expect fun internetEnumPerSiteCookieDecisionA(pszsitename: Pstr, pcsitenamesize: MutPtr<UInt>, pdwdecision: MutPtr<UInt>, dwindex: UInt): Bool

public expect fun internetEnumPerSiteCookieDecisionW(pszsitename: Pwstr, pcsitenamesize: MutPtr<UInt>, pdwdecision: MutPtr<UInt>, dwindex: UInt): Bool

public expect fun internetErrorDlg(hwnd: Hwnd, hrequest: MutPtr<CVoid>, dwerror: UInt, dwflags: UInt, lppvdata: MutPtr<MutPtr<CVoid>>): UInt

public expect fun internetFindNextFileA(hfind: ConstPtr<CVoid>, lpvfinddata: MutPtr<CVoid>): Bool

public expect fun internetFindNextFileW(hfind: ConstPtr<CVoid>, lpvfinddata: MutPtr<CVoid>): Bool

public expect fun internetFortezzaCommand(dwcommand: UInt, hwnd: Hwnd, dwreserved: ULong): Bool

public expect fun internetFreeCookies(pcookies: MutPtr<InternetCookie2>, dwcookiecount: UInt)

public expect fun internetFreeProxyInfoList(pproxyinfolist: MutPtr<WininetProxyInfoList>)

public expect fun internetGetConnectedState(lpdwflags: MutPtr<InternetConnection>, dwreserved: UInt): Bool

public expect fun internetGetConnectedStateEx(lpdwflags: MutPtr<InternetConnection>, lpszconnectionname: Pstr, dwnamelen: UInt, dwreserved: UInt): Bool

public expect fun internetGetConnectedStateExA(lpdwflags: MutPtr<InternetConnection>, lpszconnectionname: Pstr, cchnamelen: UInt, dwreserved: UInt): Bool

public expect fun internetGetConnectedStateExW(lpdwflags: MutPtr<InternetConnection>, lpszconnectionname: Pwstr, cchnamelen: UInt, dwreserved: UInt): Bool

public expect fun internetGetCookieA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pstr, lpdwsize: MutPtr<UInt>): Bool

public expect fun internetGetCookieEx2(pcwszurl: Pcwstr, pcwszcookiename: Pcwstr, dwflags: UInt, ppcookies: MutPtr<MutPtr<InternetCookie2>>, pdwcookiecount: MutPtr<UInt>): UInt

public expect fun internetGetCookieExA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pcstr, lpdwsize: MutPtr<UInt>, dwflags: InternetCookieFlags, lpreserved: ConstPtr<CVoid>): Bool

public expect fun internetGetCookieExW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr, lpdwsize: MutPtr<UInt>, dwflags: InternetCookieFlags, lpreserved: ConstPtr<CVoid>): Bool

public expect fun internetGetCookieW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pwstr, lpdwsize: MutPtr<UInt>): Bool

public expect fun internetGetLastResponseInfoA(lpdwerror: MutPtr<UInt>, lpszbuffer: Pstr, lpdwbufferlength: MutPtr<UInt>): Bool

public expect fun internetGetLastResponseInfoW(lpdwerror: MutPtr<UInt>, lpszbuffer: Pwstr, lpdwbufferlength: MutPtr<UInt>): Bool

public expect fun internetGetPerSiteCookieDecisionA(pchhostname: Pcstr, presult: MutPtr<UInt>): Bool

public expect fun internetGetPerSiteCookieDecisionW(pchhostname: Pcwstr, presult: MutPtr<UInt>): Bool

public expect fun internetGetProxyForUrl(hinternet: ConstPtr<CVoid>, pcwszurl: Pcwstr, pproxyinfolist: MutPtr<WininetProxyInfoList>): UInt

public expect fun internetGetSecurityInfoByURL(lpszurl: Pcstr, ppcertchain: MutPtr<MutPtr<CertChainContext>>, pdwsecureflags: MutPtr<UInt>): Bool

public expect fun internetGetSecurityInfoByURLA(lpszurl: Pcstr, ppcertchain: MutPtr<MutPtr<CertChainContext>>, pdwsecureflags: MutPtr<UInt>): Bool

public expect fun internetGetSecurityInfoByURLW(lpszurl: Pcwstr, ppcertchain: MutPtr<MutPtr<CertChainContext>>, pdwsecureflags: MutPtr<UInt>): Bool

public expect fun internetGoOnline(lpszurl: Pcstr, hwndparent: Hwnd, dwflags: UInt): Bool

public expect fun internetGoOnlineA(lpszurl: Pcstr, hwndparent: Hwnd, dwflags: UInt): Bool

public expect fun internetGoOnlineW(lpszurl: Pcwstr, hwndparent: Hwnd, dwflags: UInt): Bool

public expect fun internetHangUp(dwconnection: ULong, dwreserved: UInt): UInt

public expect fun internetInitializeAutoProxyDll(dwreserved: UInt): Bool

public expect fun internetLockRequestFile(hinternet: ConstPtr<CVoid>, lphlockrequestinfo: MutPtr<Handle>): Bool

public expect fun internetOpenA(lpszagent: Pcstr, dwaccesstype: UInt, lpszproxy: Pcstr, lpszproxybypass: Pcstr, dwflags: UInt): MutPtr<CVoid>

public expect fun internetOpenUrlA(hinternet: ConstPtr<CVoid>, lpszurl: Pcstr, lpszheaders: Pcstr, dwheaderslength: UInt, dwflags: UInt, dwcontext: ULong): MutPtr<CVoid>

public expect fun internetOpenUrlW(hinternet: ConstPtr<CVoid>, lpszurl: Pcwstr, lpszheaders: Pcwstr, dwheaderslength: UInt, dwflags: UInt, dwcontext: ULong): MutPtr<CVoid>

public expect fun internetOpenW(lpszagent: Pcwstr, dwaccesstype: UInt, lpszproxy: Pcwstr, lpszproxybypass: Pcwstr, dwflags: UInt): MutPtr<CVoid>

public expect fun internetQueryDataAvailable(hfile: ConstPtr<CVoid>, lpdwnumberofbytesavailable: MutPtr<UInt>, dwflags: UInt, dwcontext: ULong): Bool

public expect fun internetQueryFortezzaStatus(pdwstatus: MutPtr<UInt>, dwreserved: ULong): Bool

public expect fun internetQueryOptionA(hinternet: ConstPtr<CVoid>, dwoption: UInt, lpbuffer: MutPtr<CVoid>, lpdwbufferlength: MutPtr<UInt>): Bool

public expect fun internetQueryOptionW(hinternet: ConstPtr<CVoid>, dwoption: UInt, lpbuffer: MutPtr<CVoid>, lpdwbufferlength: MutPtr<UInt>): Bool

public expect fun internetReadFile(hfile: ConstPtr<CVoid>, lpbuffer: MutPtr<CVoid>, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: MutPtr<UInt>): Bool

public expect fun internetReadFileExA(hfile: ConstPtr<CVoid>, lpbuffersout: MutPtr<InternetBuffersa>, dwflags: UInt, dwcontext: ULong): Bool

public expect fun internetReadFileExW(hfile: ConstPtr<CVoid>, lpbuffersout: MutPtr<InternetBuffersw>, dwflags: UInt, dwcontext: ULong): Bool

public expect fun internetSecurityProtocolToStringA(dwprotocol: UInt, lpstr: Pstr, lpdwstrlength: MutPtr<UInt>, dwreserved: UInt): Bool

public expect fun internetSecurityProtocolToStringW(dwprotocol: UInt, lpstr: Pwstr, lpdwstrlength: MutPtr<UInt>, dwreserved: UInt): Bool

public expect fun internetSetCookieA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pcstr): Bool

public expect fun internetSetCookieEx2(pcwszurl: Pcwstr, pcookie: ConstPtr<InternetCookie2>, pcwszp3ppolicy: Pcwstr, dwflags: UInt, pdwcookiestate: MutPtr<UInt>): UInt

public expect fun internetSetCookieExA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pcstr, dwflags: UInt, dwreserved: ULong): UInt

public expect fun internetSetCookieExW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr, dwflags: UInt, dwreserved: ULong): UInt

public expect fun internetSetCookieW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr): Bool

public expect fun internetSetDialState(lpszconnectoid: Pcstr, dwstate: UInt, dwreserved: UInt): Bool

public expect fun internetSetDialStateA(lpszconnectoid: Pcstr, dwstate: UInt, dwreserved: UInt): Bool

public expect fun internetSetDialStateW(lpszconnectoid: Pcwstr, dwstate: UInt, dwreserved: UInt): Bool

public expect fun internetSetFilePointer(hfile: ConstPtr<CVoid>, ldistancetomove: Int, lpdistancetomovehigh: MutPtr<Int>, dwmovemethod: UInt, dwcontext: ULong): UInt

public expect fun internetSetOptionA(hinternet: ConstPtr<CVoid>, dwoption: UInt, lpbuffer: ConstPtr<CVoid>, dwbufferlength: UInt): Bool

public expect fun internetSetOptionExA(hinternet: ConstPtr<CVoid>, dwoption: UInt, lpbuffer: ConstPtr<CVoid>, dwbufferlength: UInt, dwflags: UInt): Bool

public expect fun internetSetOptionExW(hinternet: ConstPtr<CVoid>, dwoption: UInt, lpbuffer: ConstPtr<CVoid>, dwbufferlength: UInt, dwflags: UInt): Bool

public expect fun internetSetOptionW(hinternet: ConstPtr<CVoid>, dwoption: UInt, lpbuffer: ConstPtr<CVoid>, dwbufferlength: UInt): Bool

public expect fun internetSetPerSiteCookieDecisionA(pchhostname: Pcstr, dwdecision: UInt): Bool

public expect fun internetSetPerSiteCookieDecisionW(pchhostname: Pcwstr, dwdecision: UInt): Bool

public expect fun internetSetStatusCallback(hinternet: ConstPtr<CVoid>, lpfninternetcallback: LpinternetStatusCallback): LpinternetStatusCallback

public expect fun internetSetStatusCallbackA(hinternet: ConstPtr<CVoid>, lpfninternetcallback: LpinternetStatusCallback): LpinternetStatusCallback

public expect fun internetSetStatusCallbackW(hinternet: ConstPtr<CVoid>, lpfninternetcallback: LpinternetStatusCallback): LpinternetStatusCallback

public expect fun internetShowSecurityInfoByURL(lpszurl: Pcstr, hwndparent: Hwnd): Bool

public expect fun internetShowSecurityInfoByURLA(lpszurl: Pcstr, hwndparent: Hwnd): Bool

public expect fun internetShowSecurityInfoByURLW(lpszurl: Pcwstr, hwndparent: Hwnd): Bool

public expect fun internetTimeFromSystemTime(pst: ConstPtr<Systemtime>, dwrfc: UInt, lpsztime: Pstr, cbtime: UInt): Bool

public expect fun internetTimeFromSystemTimeA(pst: ConstPtr<Systemtime>, dwrfc: UInt, lpsztime: Pstr, cbtime: UInt): Bool

public expect fun internetTimeFromSystemTimeW(pst: ConstPtr<Systemtime>, dwrfc: UInt, lpsztime: Pwstr, cbtime: UInt): Bool

public expect fun internetTimeToSystemTime(lpsztime: Pcstr, pst: MutPtr<Systemtime>, dwreserved: UInt): Bool

public expect fun internetTimeToSystemTimeA(lpsztime: Pcstr, pst: MutPtr<Systemtime>, dwreserved: UInt): Bool

public expect fun internetTimeToSystemTimeW(lpsztime: Pcwstr, pst: MutPtr<Systemtime>, dwreserved: UInt): Bool

public expect fun internetUnlockRequestFile(hlockrequestinfo: Handle): Bool

public expect fun internetWriteFile(hfile: ConstPtr<CVoid>, lpbuffer: ConstPtr<CVoid>, dwnumberofbytestowrite: UInt, lpdwnumberofbyteswritten: MutPtr<UInt>): Bool

public expect fun internetWriteFileExA(hfile: ConstPtr<CVoid>, lpbuffersin: ConstPtr<InternetBuffersa>, dwflags: UInt, dwcontext: ULong): Bool

public expect fun internetWriteFileExW(hfile: ConstPtr<CVoid>, lpbuffersin: ConstPtr<InternetBuffersw>, dwflags: UInt, dwcontext: ULong): Bool

public expect fun isDomainLegalCookieDomainA(pchdomain: Pcstr, pchfulldomain: Pcstr): Bool

public expect fun isDomainLegalCookieDomainW(pchdomain: Pcwstr, pchfulldomain: Pcwstr): Bool

public expect fun isHostInProxyBypassList(tscheme: InternetScheme, lpszhost: Pcstr, cchhost: UInt): Bool

public expect fun isProfilesEnabled(): Bool

public expect fun isUrlCacheEntryExpiredA(lpszurlname: Pcstr, dwflags: UInt, pftlastmodified: MutPtr<Filetime>): Bool

public expect fun isUrlCacheEntryExpiredW(lpszurlname: Pcwstr, dwflags: UInt, pftlastmodified: MutPtr<Filetime>): Bool

public expect fun loadUrlCacheContent(): Bool

public expect fun parseX509EncodedCertificateForListBoxEntry(lpcert: ConstPtr<UByte>, cbcert: UInt, lpszlistboxentry: Pstr, lpdwlistboxentry: MutPtr<UInt>): UInt

public expect fun performOperationOverUrlCacheA(pszurlsearchpattern: Pcstr, dwflags: UInt, dwfilter: UInt, groupid: Long, preserved1: ConstPtr<CVoid>, pdwreserved2: ConstPtr<UInt>, preserved3: ConstPtr<CVoid>, op: CacheOperator, poperatordata: MutPtr<CVoid>): Bool

public expect fun privacyGetZonePreferenceW(dwzone: UInt, dwtype: UInt, pdwtemplate: MutPtr<UInt>, pszbuffer: Pwstr, pdwbufferlength: MutPtr<UInt>): UInt

public expect fun privacySetZonePreferenceW(dwzone: UInt, dwtype: UInt, dwtemplate: UInt, pszpreference: Pcwstr): UInt

public expect fun readGuidsForConnectedNetworks(pcnetworks: MutPtr<UInt>, pppwsznetworkguids: MutPtr<MutPtr<Pwstr>>, pppbstrnetworknames: MutPtr<MutPtr<Bstr>>, pppwszgwmacs: MutPtr<MutPtr<Pwstr>>, pcgatewaymacs: MutPtr<UInt>, pdwflags: MutPtr<UInt>): Bool

public expect fun readUrlCacheEntryStream(hurlcachestream: Handle, dwlocation: UInt, lpbuffer: MutPtr<CVoid>, lpdwlen: MutPtr<UInt>, reserved: UInt): Bool

public expect fun readUrlCacheEntryStreamEx(hurlcachestream: Handle, qwlocation: ULong, lpbuffer: MutPtr<CVoid>, lpdwlen: MutPtr<UInt>): Bool

public expect fun registerUrlCacheNotification(hwnd: Hwnd, umsg: UInt, gid: Long, dwopsfilter: UInt, dwreserved: UInt): Bool

public expect fun resumeSuspendedDownload(hrequest: ConstPtr<CVoid>, dwresultcode: UInt): Bool

public expect fun retrieveUrlCacheEntryFileA(lpszurlname: Pcstr, lpcacheentryinfo: MutPtr<InternetCacheEntryInfoa>, lpcbcacheentryinfo: MutPtr<UInt>, dwreserved: UInt): Bool

public expect fun retrieveUrlCacheEntryFileW(lpszurlname: Pcwstr, lpcacheentryinfo: MutPtr<InternetCacheEntryInfow>, lpcbcacheentryinfo: MutPtr<UInt>, dwreserved: UInt): Bool

public expect fun retrieveUrlCacheEntryStreamA(lpszurlname: Pcstr, lpcacheentryinfo: MutPtr<InternetCacheEntryInfoa>, lpcbcacheentryinfo: MutPtr<UInt>, frandomread: Bool, dwreserved: UInt): Handle

public expect fun retrieveUrlCacheEntryStreamW(lpszurlname: Pcwstr, lpcacheentryinfo: MutPtr<InternetCacheEntryInfow>, lpcbcacheentryinfo: MutPtr<UInt>, frandomread: Bool, dwreserved: UInt): Handle

public expect fun runOnceUrlCache(hwnd: Hwnd, hinst: Hinstance, lpszcmd: Pcstr, ncmdshow: Int): UInt

public expect fun setUrlCacheConfigInfoA(lpcacheconfiginfo: ConstPtr<InternetCacheConfigInfoa>, dwfieldcontrol: UInt): Bool

public expect fun setUrlCacheConfigInfoW(lpcacheconfiginfo: ConstPtr<InternetCacheConfigInfow>, dwfieldcontrol: UInt): Bool

public expect fun setUrlCacheEntryGroup(lpszurlname: Pcstr, dwflags: UInt, groupid: Long, pbgroupattributes: ConstPtr<UByte>, cbgroupattributes: UInt, lpreserved: ConstPtr<CVoid>): Bool

public expect fun setUrlCacheEntryGroupA(lpszurlname: Pcstr, dwflags: UInt, groupid: Long, pbgroupattributes: ConstPtr<UByte>, cbgroupattributes: UInt, lpreserved: ConstPtr<CVoid>): Bool

public expect fun setUrlCacheEntryGroupW(lpszurlname: Pcwstr, dwflags: UInt, groupid: Long, pbgroupattributes: ConstPtr<UByte>, cbgroupattributes: UInt, lpreserved: ConstPtr<CVoid>): Bool

public expect fun setUrlCacheEntryInfoA(lpszurlname: Pcstr, lpcacheentryinfo: ConstPtr<InternetCacheEntryInfoa>, dwfieldcontrol: UInt): Bool

public expect fun setUrlCacheEntryInfoW(lpszurlname: Pcwstr, lpcacheentryinfo: ConstPtr<InternetCacheEntryInfow>, dwfieldcontrol: UInt): Bool

public expect fun setUrlCacheGroupAttributeA(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: ConstPtr<InternetCacheGroupInfoa>, lpreserved: ConstPtr<CVoid>): Bool

public expect fun setUrlCacheGroupAttributeW(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: ConstPtr<InternetCacheGroupInfow>, lpreserved: ConstPtr<CVoid>): Bool

public expect fun setUrlCacheHeaderData(nidx: UInt, dwdata: UInt): Bool

public expect fun showClientAuthCerts(hwndparent: Hwnd): UInt

public expect fun showSecurityInfo(hwndparent: Hwnd, psecurityinfo: ConstPtr<InternetSecurityInfo>): UInt

public expect fun showX509EncodedCertificate(hwndparent: Hwnd, lpcert: ConstPtr<UByte>, cbcert: UInt): UInt

public expect fun unlockUrlCacheEntryFile(lpszurlname: Pcstr, dwreserved: UInt): Bool

public expect fun unlockUrlCacheEntryFileA(lpszurlname: Pcstr, dwreserved: UInt): Bool

public expect fun unlockUrlCacheEntryFileW(lpszurlname: Pcwstr, dwreserved: UInt): Bool

public expect fun unlockUrlCacheEntryStream(hurlcachestream: Handle, reserved: UInt): Bool

public expect fun updateUrlCacheContentPath(sznewpath: Pcstr): Bool

public expect fun urlCacheCheckEntriesExist(rgpwszurls: ConstPtr<Pcwstr>, centries: UInt, rgfexist: MutPtr<Bool>): UInt

public expect fun urlCacheCloseEntryHandle(hentryfile: ConstPtr<CVoid>)

public expect fun urlCacheContainerSetEntryMaximumAge(pwszprefix: Pcwstr, dwentrymaxage: UInt): UInt

public expect fun urlCacheCreateContainer(pwszname: Pcwstr, pwszprefix: Pcwstr, pwszdirectory: Pcwstr, ulllimit: ULong, dwoptions: UInt): UInt

public expect fun urlCacheFindFirstEntry(pwszprefix: Pcwstr, dwflags: UInt, dwfilter: UInt, groupid: Long, pcacheentryinfo: MutPtr<UrlcacheEntryInfo>, phfind: MutPtr<Handle>): UInt

public expect fun urlCacheFindNextEntry(hfind: Handle, pcacheentryinfo: MutPtr<UrlcacheEntryInfo>): UInt

public expect fun urlCacheFreeEntryInfo(pcacheentryinfo: MutPtr<UrlcacheEntryInfo>)

public expect fun urlCacheFreeGlobalSpace(ulltargetsize: ULong, dwfilter: UInt): UInt

public expect fun urlCacheGetContentPaths(pppwszdirectories: MutPtr<MutPtr<Pwstr>>, pcdirectories: MutPtr<UInt>): UInt

public expect fun urlCacheGetEntryInfo(happcache: ConstPtr<CVoid>, pcwszurl: Pcwstr, pcacheentryinfo: MutPtr<UrlcacheEntryInfo>): UInt

public expect fun urlCacheGetGlobalCacheSize(dwfilter: UInt, pullsize: MutPtr<ULong>, pulllimit: MutPtr<ULong>): UInt

public expect fun urlCacheGetGlobalLimit(limittype: UrlCacheLimitType, pulllimit: MutPtr<ULong>): UInt

public expect fun urlCacheReadEntryStream(hurlcachestream: ConstPtr<CVoid>, ulllocation: ULong, pbuffer: MutPtr<CVoid>, dwbufferlen: UInt, pdwbufferlen: MutPtr<UInt>): UInt

public expect fun urlCacheReloadSettings(): UInt

public expect fun urlCacheRetrieveEntryFile(happcache: ConstPtr<CVoid>, pcwszurl: Pcwstr, pcacheentryinfo: MutPtr<UrlcacheEntryInfo>, phentryfile: MutPtr<MutPtr<CVoid>>): UInt

public expect fun urlCacheRetrieveEntryStream(happcache: ConstPtr<CVoid>, pcwszurl: Pcwstr, frandomread: Bool, pcacheentryinfo: MutPtr<UrlcacheEntryInfo>, phentrystream: MutPtr<MutPtr<CVoid>>): UInt

public expect fun urlCacheServer(): UInt

public expect fun urlCacheSetGlobalLimit(limittype: UrlCacheLimitType, ulllimit: ULong): UInt

public expect fun urlCacheUpdateEntryExtraData(happcache: ConstPtr<CVoid>, pcwszurl: Pcwstr, pbextradata: ConstPtr<UByte>, cbextradata: UInt): UInt
