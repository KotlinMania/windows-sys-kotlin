// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=AppCacheCheckManifest; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AppCacheCheckManifest`(`pwszmasterurl` : `windows_sys`.`core`.`PCWSTR`, `pwszmanifesturl` : `windows_sys`.`core`.`PCWSTR`, `pbmanifestdata` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwmanifestdatasize` : UInt, `pbmanifestresponseheaders` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwmanifestresponseheaderssize` : UInt, `pestate` : /* Rust *mut */ kotlinx.cinterop.CPointer<`APP_CACHE_STATE`>?, `phnewappcache` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=AppCacheCloseHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AppCacheCloseHandle`(`happcache` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=AppCacheCreateAndCommitFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AppCacheCreateAndCommitFile`(`happcache` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pwszsourcefilepath` : `windows_sys`.`core`.`PCWSTR`, `pwszurl` : `windows_sys`.`core`.`PCWSTR`, `pbresponseheaders` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwresponseheaderssize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=AppCacheDeleteGroup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AppCacheDeleteGroup`(`pwszmanifesturl` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=AppCacheDeleteIEGroup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AppCacheDeleteIEGroup`(`pwszmanifesturl` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=AppCacheDuplicateHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AppCacheDuplicateHandle`(`happcache` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `phduplicatedappcache` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=AppCacheFinalize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AppCacheFinalize`(`happcache` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pbmanifestdata` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwmanifestdatasize` : UInt, `pestate` : /* Rust *mut */ kotlinx.cinterop.CPointer<`APP_CACHE_FINALIZE_STATE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=AppCacheFreeDownloadList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AppCacheFreeDownloadList`(`pdownloadlist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`APP_CACHE_DOWNLOAD_LIST`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=AppCacheFreeGroupList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AppCacheFreeGroupList`(`pappcachegrouplist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`APP_CACHE_GROUP_LIST`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=AppCacheFreeIESpace; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AppCacheFreeIESpace`(`ftcutoff` : `super`.`super`.`Foundation`.`FILETIME`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=AppCacheFreeSpace; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AppCacheFreeSpace`(`ftcutoff` : `super`.`super`.`Foundation`.`FILETIME`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=AppCacheGetDownloadList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AppCacheGetDownloadList`(`happcache` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pdownloadlist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`APP_CACHE_DOWNLOAD_LIST`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=AppCacheGetFallbackUrl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AppCacheGetFallbackUrl`(`happcache` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pwszurl` : `windows_sys`.`core`.`PCWSTR`, `ppwszfallbackurl` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=AppCacheGetGroupList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AppCacheGetGroupList`(`pappcachegrouplist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`APP_CACHE_GROUP_LIST`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=AppCacheGetIEGroupList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AppCacheGetIEGroupList`(`pappcachegrouplist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`APP_CACHE_GROUP_LIST`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=AppCacheGetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AppCacheGetInfo`(`happcache` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pappcacheinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`APP_CACHE_GROUP_INFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=AppCacheGetManifestUrl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AppCacheGetManifestUrl`(`happcache` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppwszmanifesturl` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=AppCacheLookup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AppCacheLookup`(`pwszurl` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt, `phappcache` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=CommitUrlCacheEntryA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CommitUrlCacheEntryA`(`lpszurlname` : `windows_sys`.`core`.`PCSTR`, `lpszlocalfilename` : `windows_sys`.`core`.`PCSTR`, `expiretime` : `super`.`super`.`Foundation`.`FILETIME`, `lastmodifiedtime` : `super`.`super`.`Foundation`.`FILETIME`, `cacheentrytype` : UInt, `lpheaderinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cchheaderinfo` : UInt, `lpszfileextension` : `windows_sys`.`core`.`PCSTR`, `lpszoriginalurl` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=CommitUrlCacheEntryBinaryBlob; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CommitUrlCacheEntryBinaryBlob`(`pwszurlname` : `windows_sys`.`core`.`PCWSTR`, `dwtype` : UInt, `ftexpiretime` : `super`.`super`.`Foundation`.`FILETIME`, `ftmodifiedtime` : `super`.`super`.`Foundation`.`FILETIME`, `pbblob` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbblob` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=CommitUrlCacheEntryW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CommitUrlCacheEntryW`(`lpszurlname` : `windows_sys`.`core`.`PCWSTR`, `lpszlocalfilename` : `windows_sys`.`core`.`PCWSTR`, `expiretime` : `super`.`super`.`Foundation`.`FILETIME`, `lastmodifiedtime` : `super`.`super`.`Foundation`.`FILETIME`, `cacheentrytype` : UInt, `lpszheaderinfo` : `windows_sys`.`core`.`PCWSTR`, `cchheaderinfo` : UInt, `lpszfileextension` : `windows_sys`.`core`.`PCWSTR`, `lpszoriginalurl` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=CreateMD5SSOHash; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateMD5SSOHash`(`pszchallengeinfo` : `windows_sys`.`core`.`PCWSTR`, `pwszrealm` : `windows_sys`.`core`.`PCWSTR`, `pwsztarget` : `windows_sys`.`core`.`PCWSTR`, `pbhexhash` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=CreateUrlCacheContainerA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateUrlCacheContainerA`(`name` : `windows_sys`.`core`.`PCSTR`, `lpcacheprefix` : `windows_sys`.`core`.`PCSTR`, `lpszcachepath` : `windows_sys`.`core`.`PCSTR`, `kbcachelimit` : UInt, `dwcontainertype` : UInt, `dwoptions` : UInt, `pvbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=CreateUrlCacheContainerW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateUrlCacheContainerW`(`name` : `windows_sys`.`core`.`PCWSTR`, `lpcacheprefix` : `windows_sys`.`core`.`PCWSTR`, `lpszcachepath` : `windows_sys`.`core`.`PCWSTR`, `kbcachelimit` : UInt, `dwcontainertype` : UInt, `dwoptions` : UInt, `pvbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=CreateUrlCacheEntryA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateUrlCacheEntryA`(`lpszurlname` : `windows_sys`.`core`.`PCSTR`, `dwexpectedfilesize` : UInt, `lpszfileextension` : `windows_sys`.`core`.`PCSTR`, `lpszfilename` : `windows_sys`.`core`.`PSTR`, `dwreserved` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=CreateUrlCacheEntryExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateUrlCacheEntryExW`(`lpszurlname` : `windows_sys`.`core`.`PCWSTR`, `dwexpectedfilesize` : UInt, `lpszfileextension` : `windows_sys`.`core`.`PCWSTR`, `lpszfilename` : `windows_sys`.`core`.`PWSTR`, `dwreserved` : UInt, `fpreserveincomingfilename` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=CreateUrlCacheEntryW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateUrlCacheEntryW`(`lpszurlname` : `windows_sys`.`core`.`PCWSTR`, `dwexpectedfilesize` : UInt, `lpszfileextension` : `windows_sys`.`core`.`PCWSTR`, `lpszfilename` : `windows_sys`.`core`.`PWSTR`, `dwreserved` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=CreateUrlCacheGroup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateUrlCacheGroup`(`dwflags` : UInt, `lpreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Long
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=DeleteIE3Cache; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteIE3Cache`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hinst` : `super`.`super`.`Foundation`.`HINSTANCE`, `lpszcmd` : `windows_sys`.`core`.`PCSTR`, `ncmdshow` : Int) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=DeleteUrlCacheContainerA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteUrlCacheContainerA`(`name` : `windows_sys`.`core`.`PCSTR`, `dwoptions` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=DeleteUrlCacheContainerW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteUrlCacheContainerW`(`name` : `windows_sys`.`core`.`PCWSTR`, `dwoptions` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=DeleteUrlCacheEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteUrlCacheEntry`(`lpszurlname` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=DeleteUrlCacheEntryA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteUrlCacheEntryA`(`lpszurlname` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=DeleteUrlCacheEntryW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteUrlCacheEntryW`(`lpszurlname` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=DeleteUrlCacheGroup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteUrlCacheGroup`(`groupid` : Long, `dwflags` : UInt, `lpreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=DeleteWpadCacheForNetworks; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteWpadCacheForNetworks`(`param0` : `WPAD_CACHE_DELETE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=DetectAutoProxyUrl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DetectAutoProxyUrl`(`pszautoproxyurl` : `windows_sys`.`core`.`PSTR`, `cchautoproxyurl` : UInt, `dwdetectflags` : `PROXY_AUTO_DETECT_TYPE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=DoConnectoidsExist; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DoConnectoidsExist`() : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=ExportCookieFileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ExportCookieFileA`(`szfilename` : `windows_sys`.`core`.`PCSTR`, `fappend` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=ExportCookieFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ExportCookieFileW`(`szfilename` : `windows_sys`.`core`.`PCWSTR`, `fappend` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FindCloseUrlCache; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindCloseUrlCache`(`henumhandle` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FindFirstUrlCacheContainerA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindFirstUrlCacheContainerA`(`pdwmodified` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpcontainerinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_CACHE_CONTAINER_INFOA`>?, `lpcbcontainerinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwoptions` : UInt) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FindFirstUrlCacheContainerW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindFirstUrlCacheContainerW`(`pdwmodified` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpcontainerinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_CACHE_CONTAINER_INFOW`>?, `lpcbcontainerinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwoptions` : UInt) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FindFirstUrlCacheEntryA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindFirstUrlCacheEntryA`(`lpszurlsearchpattern` : `windows_sys`.`core`.`PCSTR`, `lpfirstcacheentryinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_CACHE_ENTRY_INFOA`>?, `lpcbcacheentryinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FindFirstUrlCacheEntryExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindFirstUrlCacheEntryExA`(`lpszurlsearchpattern` : `windows_sys`.`core`.`PCSTR`, `dwflags` : UInt, `dwfilter` : UInt, `groupid` : Long, `lpfirstcacheentryinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_CACHE_ENTRY_INFOA`>?, `lpcbcacheentryinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpgroupattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpcbgroupattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FindFirstUrlCacheEntryExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindFirstUrlCacheEntryExW`(`lpszurlsearchpattern` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt, `dwfilter` : UInt, `groupid` : Long, `lpfirstcacheentryinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_CACHE_ENTRY_INFOW`>?, `lpcbcacheentryinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpgroupattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpcbgroupattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FindFirstUrlCacheEntryW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindFirstUrlCacheEntryW`(`lpszurlsearchpattern` : `windows_sys`.`core`.`PCWSTR`, `lpfirstcacheentryinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_CACHE_ENTRY_INFOW`>?, `lpcbcacheentryinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FindFirstUrlCacheGroup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindFirstUrlCacheGroup`(`dwflags` : UInt, `dwfilter` : UInt, `lpsearchcondition` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwsearchcondition` : UInt, `lpgroupid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `lpreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FindNextUrlCacheContainerA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindNextUrlCacheContainerA`(`henumhandle` : `super`.`super`.`Foundation`.`HANDLE`, `lpcontainerinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_CACHE_CONTAINER_INFOA`>?, `lpcbcontainerinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FindNextUrlCacheContainerW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindNextUrlCacheContainerW`(`henumhandle` : `super`.`super`.`Foundation`.`HANDLE`, `lpcontainerinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_CACHE_CONTAINER_INFOW`>?, `lpcbcontainerinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FindNextUrlCacheEntryA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindNextUrlCacheEntryA`(`henumhandle` : `super`.`super`.`Foundation`.`HANDLE`, `lpnextcacheentryinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_CACHE_ENTRY_INFOA`>?, `lpcbcacheentryinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FindNextUrlCacheEntryExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindNextUrlCacheEntryExA`(`henumhandle` : `super`.`super`.`Foundation`.`HANDLE`, `lpnextcacheentryinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_CACHE_ENTRY_INFOA`>?, `lpcbcacheentryinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpgroupattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpcbgroupattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FindNextUrlCacheEntryExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindNextUrlCacheEntryExW`(`henumhandle` : `super`.`super`.`Foundation`.`HANDLE`, `lpnextcacheentryinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_CACHE_ENTRY_INFOW`>?, `lpcbcacheentryinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpgroupattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpcbgroupattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FindNextUrlCacheEntryW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindNextUrlCacheEntryW`(`henumhandle` : `super`.`super`.`Foundation`.`HANDLE`, `lpnextcacheentryinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_CACHE_ENTRY_INFOW`>?, `lpcbcacheentryinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FindNextUrlCacheGroup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindNextUrlCacheGroup`(`hfind` : `super`.`super`.`Foundation`.`HANDLE`, `lpgroupid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `lpreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FindP3PPolicySymbol; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindP3PPolicySymbol`(`pszsymbol` : `windows_sys`.`core`.`PCSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FreeUrlCacheSpaceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FreeUrlCacheSpaceA`(`lpszcachepath` : `windows_sys`.`core`.`PCSTR`, `dwsize` : UInt, `dwfilter` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FreeUrlCacheSpaceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FreeUrlCacheSpaceW`(`lpszcachepath` : `windows_sys`.`core`.`PCWSTR`, `dwsize` : UInt, `dwfilter` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FtpCommandA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FtpCommandA`(`hconnect` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fexpectresponse` : `windows_sys`.`core`.`BOOL`, `dwflags` : `FTP_FLAGS`, `lpszcommand` : `windows_sys`.`core`.`PCSTR`, `dwcontext` : ULong, `phftpcommand` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FtpCommandW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FtpCommandW`(`hconnect` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fexpectresponse` : `windows_sys`.`core`.`BOOL`, `dwflags` : `FTP_FLAGS`, `lpszcommand` : `windows_sys`.`core`.`PCWSTR`, `dwcontext` : ULong, `phftpcommand` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FtpCreateDirectoryA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FtpCreateDirectoryA`(`hconnect` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszdirectory` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FtpCreateDirectoryW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FtpCreateDirectoryW`(`hconnect` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszdirectory` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FtpDeleteFileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FtpDeleteFileA`(`hconnect` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszfilename` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FtpDeleteFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FtpDeleteFileW`(`hconnect` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszfilename` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FtpFindFirstFileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_FileSystem")]
public external fun `FtpFindFirstFileA`(`hconnect` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszsearchfile` : `windows_sys`.`core`.`PCSTR`, `lpfindfiledata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Storage`.`FileSystem`.`WIN32_FIND_DATAA`>?, `dwflags` : UInt, `dwcontext` : ULong) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FtpFindFirstFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_FileSystem")]
public external fun `FtpFindFirstFileW`(`hconnect` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszsearchfile` : `windows_sys`.`core`.`PCWSTR`, `lpfindfiledata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Storage`.`FileSystem`.`WIN32_FIND_DATAW`>?, `dwflags` : UInt, `dwcontext` : ULong) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FtpGetCurrentDirectoryA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FtpGetCurrentDirectoryA`(`hconnect` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszcurrentdirectory` : `windows_sys`.`core`.`PSTR`, `lpdwcurrentdirectory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FtpGetCurrentDirectoryW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FtpGetCurrentDirectoryW`(`hconnect` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszcurrentdirectory` : `windows_sys`.`core`.`PWSTR`, `lpdwcurrentdirectory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FtpGetFileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FtpGetFileA`(`hconnect` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszremotefile` : `windows_sys`.`core`.`PCSTR`, `lpsznewfile` : `windows_sys`.`core`.`PCSTR`, `ffailifexists` : `windows_sys`.`core`.`BOOL`, `dwflagsandattributes` : UInt, `dwflags` : UInt, `dwcontext` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FtpGetFileEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FtpGetFileEx`(`hftpsession` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszremotefile` : `windows_sys`.`core`.`PCSTR`, `lpsznewfile` : `windows_sys`.`core`.`PCWSTR`, `ffailifexists` : `windows_sys`.`core`.`BOOL`, `dwflagsandattributes` : UInt, `dwflags` : UInt, `dwcontext` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FtpGetFileSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FtpGetFileSize`(`hfile` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpdwfilesizehigh` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FtpGetFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FtpGetFileW`(`hconnect` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszremotefile` : `windows_sys`.`core`.`PCWSTR`, `lpsznewfile` : `windows_sys`.`core`.`PCWSTR`, `ffailifexists` : `windows_sys`.`core`.`BOOL`, `dwflagsandattributes` : UInt, `dwflags` : UInt, `dwcontext` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FtpOpenFileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FtpOpenFileA`(`hconnect` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszfilename` : `windows_sys`.`core`.`PCSTR`, `dwaccess` : UInt, `dwflags` : `FTP_FLAGS`, `dwcontext` : ULong) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FtpOpenFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FtpOpenFileW`(`hconnect` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszfilename` : `windows_sys`.`core`.`PCWSTR`, `dwaccess` : UInt, `dwflags` : `FTP_FLAGS`, `dwcontext` : ULong) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FtpPutFileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FtpPutFileA`(`hconnect` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszlocalfile` : `windows_sys`.`core`.`PCSTR`, `lpsznewremotefile` : `windows_sys`.`core`.`PCSTR`, `dwflags` : `FTP_FLAGS`, `dwcontext` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FtpPutFileEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FtpPutFileEx`(`hftpsession` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszlocalfile` : `windows_sys`.`core`.`PCWSTR`, `lpsznewremotefile` : `windows_sys`.`core`.`PCSTR`, `dwflags` : UInt, `dwcontext` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FtpPutFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FtpPutFileW`(`hconnect` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszlocalfile` : `windows_sys`.`core`.`PCWSTR`, `lpsznewremotefile` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : `FTP_FLAGS`, `dwcontext` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FtpRemoveDirectoryA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FtpRemoveDirectoryA`(`hconnect` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszdirectory` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FtpRemoveDirectoryW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FtpRemoveDirectoryW`(`hconnect` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszdirectory` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FtpRenameFileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FtpRenameFileA`(`hconnect` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszexisting` : `windows_sys`.`core`.`PCSTR`, `lpsznew` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FtpRenameFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FtpRenameFileW`(`hconnect` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszexisting` : `windows_sys`.`core`.`PCWSTR`, `lpsznew` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FtpSetCurrentDirectoryA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FtpSetCurrentDirectoryA`(`hconnect` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszdirectory` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=FtpSetCurrentDirectoryW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FtpSetCurrentDirectoryW`(`hconnect` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszdirectory` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=GetDiskInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDiskInfoA`(`pszpath` : `windows_sys`.`core`.`PCSTR`, `pdwclustersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdlavail` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `pdltotal` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=GetUrlCacheConfigInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetUrlCacheConfigInfoA`(`lpcacheconfiginfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_CACHE_CONFIG_INFOA`>?, `lpcbcacheconfiginfo` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwfieldcontrol` : `CACHE_CONFIG`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=GetUrlCacheConfigInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetUrlCacheConfigInfoW`(`lpcacheconfiginfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_CACHE_CONFIG_INFOW`>?, `lpcbcacheconfiginfo` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwfieldcontrol` : `CACHE_CONFIG`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=GetUrlCacheEntryBinaryBlob; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetUrlCacheEntryBinaryBlob`(`pwszurlname` : `windows_sys`.`core`.`PCWSTR`, `dwtype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pftexpiretime` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?, `pftaccesstime` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?, `pftmodifiedtime` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?, `ppbblob` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `pcbblob` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=GetUrlCacheEntryInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetUrlCacheEntryInfoA`(`lpszurlname` : `windows_sys`.`core`.`PCSTR`, `lpcacheentryinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_CACHE_ENTRY_INFOA`>?, `lpcbcacheentryinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=GetUrlCacheEntryInfoExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetUrlCacheEntryInfoExA`(`lpszurl` : `windows_sys`.`core`.`PCSTR`, `lpcacheentryinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_CACHE_ENTRY_INFOA`>?, `lpcbcacheentryinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpszredirecturl` : `windows_sys`.`core`.`PCSTR`, `lpcbredirecturl` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwflags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=GetUrlCacheEntryInfoExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetUrlCacheEntryInfoExW`(`lpszurl` : `windows_sys`.`core`.`PCWSTR`, `lpcacheentryinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_CACHE_ENTRY_INFOW`>?, `lpcbcacheentryinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpszredirecturl` : `windows_sys`.`core`.`PCWSTR`, `lpcbredirecturl` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwflags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=GetUrlCacheEntryInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetUrlCacheEntryInfoW`(`lpszurlname` : `windows_sys`.`core`.`PCWSTR`, `lpcacheentryinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_CACHE_ENTRY_INFOW`>?, `lpcbcacheentryinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=GetUrlCacheGroupAttributeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetUrlCacheGroupAttributeA`(`gid` : Long, `dwflags` : UInt, `dwattributes` : UInt, `lpgroupinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_CACHE_GROUP_INFOA`>?, `lpcbgroupinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=GetUrlCacheGroupAttributeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetUrlCacheGroupAttributeW`(`gid` : Long, `dwflags` : UInt, `dwattributes` : UInt, `lpgroupinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_CACHE_GROUP_INFOW`>?, `lpcbgroupinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=GetUrlCacheHeaderData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetUrlCacheHeaderData`(`nidx` : UInt, `lpdwdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=GopherCreateLocatorA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GopherCreateLocatorA`(`lpszhost` : `windows_sys`.`core`.`PCSTR`, `nserverport` : UShort, `lpszdisplaystring` : `windows_sys`.`core`.`PCSTR`, `lpszselectorstring` : `windows_sys`.`core`.`PCSTR`, `dwgophertype` : UInt, `lpszlocator` : `windows_sys`.`core`.`PSTR`, `lpdwbufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=GopherCreateLocatorW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GopherCreateLocatorW`(`lpszhost` : `windows_sys`.`core`.`PCWSTR`, `nserverport` : UShort, `lpszdisplaystring` : `windows_sys`.`core`.`PCWSTR`, `lpszselectorstring` : `windows_sys`.`core`.`PCWSTR`, `dwgophertype` : UInt, `lpszlocator` : `windows_sys`.`core`.`PWSTR`, `lpdwbufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=GopherFindFirstFileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GopherFindFirstFileA`(`hconnect` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszlocator` : `windows_sys`.`core`.`PCSTR`, `lpszsearchstring` : `windows_sys`.`core`.`PCSTR`, `lpfinddata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GOPHER_FIND_DATAA`>?, `dwflags` : UInt, `dwcontext` : ULong) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=GopherFindFirstFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GopherFindFirstFileW`(`hconnect` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszlocator` : `windows_sys`.`core`.`PCWSTR`, `lpszsearchstring` : `windows_sys`.`core`.`PCWSTR`, `lpfinddata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GOPHER_FIND_DATAW`>?, `dwflags` : UInt, `dwcontext` : ULong) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=GopherGetAttributeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GopherGetAttributeA`(`hconnect` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszlocator` : `windows_sys`.`core`.`PCSTR`, `lpszattributename` : `windows_sys`.`core`.`PCSTR`, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwbufferlength` : UInt, `lpdwcharactersreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpfnenumerator` : `GOPHER_ATTRIBUTE_ENUMERATOR`, `dwcontext` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=GopherGetAttributeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GopherGetAttributeW`(`hconnect` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszlocator` : `windows_sys`.`core`.`PCWSTR`, `lpszattributename` : `windows_sys`.`core`.`PCWSTR`, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwbufferlength` : UInt, `lpdwcharactersreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpfnenumerator` : `GOPHER_ATTRIBUTE_ENUMERATOR`, `dwcontext` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=GopherGetLocatorTypeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GopherGetLocatorTypeA`(`lpszlocator` : `windows_sys`.`core`.`PCSTR`, `lpdwgophertype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=GopherGetLocatorTypeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GopherGetLocatorTypeW`(`lpszlocator` : `windows_sys`.`core`.`PCWSTR`, `lpdwgophertype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=GopherOpenFileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GopherOpenFileA`(`hconnect` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszlocator` : `windows_sys`.`core`.`PCSTR`, `lpszview` : `windows_sys`.`core`.`PCSTR`, `dwflags` : UInt, `dwcontext` : ULong) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=GopherOpenFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GopherOpenFileW`(`hconnect` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszlocator` : `windows_sys`.`core`.`PCWSTR`, `lpszview` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt, `dwcontext` : ULong) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=HttpAddRequestHeadersA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpAddRequestHeadersA`(`hrequest` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszheaders` : `windows_sys`.`core`.`PCSTR`, `dwheaderslength` : UInt, `dwmodifiers` : `HTTP_ADDREQ_FLAG`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=HttpAddRequestHeadersW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpAddRequestHeadersW`(`hrequest` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszheaders` : `windows_sys`.`core`.`PCWSTR`, `dwheaderslength` : UInt, `dwmodifiers` : `HTTP_ADDREQ_FLAG`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=HttpCheckDavComplianceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpCheckDavComplianceA`(`lpszurl` : `windows_sys`.`core`.`PCSTR`, `lpszcompliancetoken` : `windows_sys`.`core`.`PCSTR`, `lpffound` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `hwnd` : `super`.`super`.`Foundation`.`HWND`, `lpvreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=HttpCheckDavComplianceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpCheckDavComplianceW`(`lpszurl` : `windows_sys`.`core`.`PCWSTR`, `lpszcompliancetoken` : `windows_sys`.`core`.`PCWSTR`, `lpffound` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `hwnd` : `super`.`super`.`Foundation`.`HWND`, `lpvreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=HttpCloseDependencyHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpCloseDependencyHandle`(`hdependencyhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=HttpDuplicateDependencyHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpDuplicateDependencyHandle`(`hdependencyhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `phduplicateddependencyhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=HttpEndRequestA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpEndRequestA`(`hrequest` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpbuffersout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_BUFFERSA`>?, `dwflags` : UInt, `dwcontext` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=HttpEndRequestW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpEndRequestW`(`hrequest` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpbuffersout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_BUFFERSW`>?, `dwflags` : UInt, `dwcontext` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=HttpGetServerCredentials; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpGetServerCredentials`(`pwszurl` : `windows_sys`.`core`.`PCWSTR`, `ppwszusername` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `ppwszpassword` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=HttpIndicatePageLoadComplete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpIndicatePageLoadComplete`(`hdependencyhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=HttpIsHostHstsEnabled; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpIsHostHstsEnabled`(`pcwszurl` : `windows_sys`.`core`.`PCWSTR`, `pfishsts` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=HttpOpenDependencyHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpOpenDependencyHandle`(`hrequesthandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fbackground` : `windows_sys`.`core`.`BOOL`, `phdependencyhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=HttpOpenRequestA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpOpenRequestA`(`hconnect` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszverb` : `windows_sys`.`core`.`PCSTR`, `lpszobjectname` : `windows_sys`.`core`.`PCSTR`, `lpszversion` : `windows_sys`.`core`.`PCSTR`, `lpszreferrer` : `windows_sys`.`core`.`PCSTR`, `lplpszaccepttypes` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCSTR`>?, `dwflags` : UInt, `dwcontext` : ULong) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=HttpOpenRequestW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpOpenRequestW`(`hconnect` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszverb` : `windows_sys`.`core`.`PCWSTR`, `lpszobjectname` : `windows_sys`.`core`.`PCWSTR`, `lpszversion` : `windows_sys`.`core`.`PCWSTR`, `lpszreferrer` : `windows_sys`.`core`.`PCWSTR`, `lplpszaccepttypes` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?, `dwflags` : UInt, `dwcontext` : ULong) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=HttpPushClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpPushClose`(`hwait` : `HTTP_PUSH_WAIT_HANDLE`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=HttpPushEnable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpPushEnable`(`hrequest` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ptransportsetting` : /* Rust *const */ kotlinx.cinterop.CPointer<`HTTP_PUSH_TRANSPORT_SETTING`>?, `phwait` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HTTP_PUSH_WAIT_HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=HttpPushWait; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpPushWait`(`hwait` : `HTTP_PUSH_WAIT_HANDLE`, `etype` : `HTTP_PUSH_WAIT_TYPE`, `pnotificationstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HTTP_PUSH_NOTIFICATION_STATUS`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=HttpQueryInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpQueryInfoA`(`hrequest` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwinfolevel` : UInt, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpdwbufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdwindex` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=HttpQueryInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpQueryInfoW`(`hrequest` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwinfolevel` : UInt, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpdwbufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdwindex` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=HttpSendRequestA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpSendRequestA`(`hrequest` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszheaders` : `windows_sys`.`core`.`PCSTR`, `dwheaderslength` : UInt, `lpoptional` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwoptionallength` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=HttpSendRequestExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpSendRequestExA`(`hrequest` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpbuffersin` : /* Rust *const */ kotlinx.cinterop.CPointer<`INTERNET_BUFFERSA`>?, `lpbuffersout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_BUFFERSA`>?, `dwflags` : UInt, `dwcontext` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=HttpSendRequestExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpSendRequestExW`(`hrequest` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpbuffersin` : /* Rust *const */ kotlinx.cinterop.CPointer<`INTERNET_BUFFERSW`>?, `lpbuffersout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_BUFFERSW`>?, `dwflags` : UInt, `dwcontext` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=HttpSendRequestW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpSendRequestW`(`hrequest` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszheaders` : `windows_sys`.`core`.`PCWSTR`, `dwheaderslength` : UInt, `lpoptional` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwoptionallength` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=HttpWebSocketClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpWebSocketClose`(`hwebsocket` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `usstatus` : UShort, `pvreason` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwreasonlength` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=HttpWebSocketCompleteUpgrade; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpWebSocketCompleteUpgrade`(`hrequest` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwcontext` : ULong) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=HttpWebSocketQueryCloseStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpWebSocketQueryCloseStatus`(`hwebsocket` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pusstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `pvreason` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwreasonlength` : UInt, `pdwreasonlengthconsumed` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=HttpWebSocketReceive; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpWebSocketReceive`(`hwebsocket` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pvbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwbufferlength` : UInt, `pdwbytesread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pbuffertype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HTTP_WEB_SOCKET_BUFFER_TYPE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=HttpWebSocketSend; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpWebSocketSend`(`hwebsocket` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `buffertype` : `HTTP_WEB_SOCKET_BUFFER_TYPE`, `pvbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwbufferlength` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=HttpWebSocketShutdown; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpWebSocketShutdown`(`hwebsocket` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `usstatus` : UShort, `pvreason` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwreasonlength` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=ImportCookieFileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImportCookieFileA`(`szfilename` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=ImportCookieFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImportCookieFileW`(`szfilename` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=IncrementUrlCacheHeaderData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IncrementUrlCacheHeaderData`(`nidx` : UInt, `lpdwdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternalInternetGetCookie; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternalInternetGetCookie`(`lpszurl` : `windows_sys`.`core`.`PCSTR`, `lpszcookiedata` : `windows_sys`.`core`.`PSTR`, `lpdwdatasize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetAlgIdToStringA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
public external fun `InternetAlgIdToStringA`(`ai` : `super`.`super`.`Security`.`Cryptography`.`ALG_ID`, `lpstr` : `windows_sys`.`core`.`PSTR`, `lpdwstrlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwreserved` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetAlgIdToStringW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
public external fun `InternetAlgIdToStringW`(`ai` : `super`.`super`.`Security`.`Cryptography`.`ALG_ID`, `lpstr` : `windows_sys`.`core`.`PWSTR`, `lpdwstrlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwreserved` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetAttemptConnect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetAttemptConnect`(`dwreserved` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetAutodial; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetAutodial`(`dwflags` : `INTERNET_AUTODIAL`, `hwndparent` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetAutodialHangup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetAutodialHangup`(`dwreserved` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetCanonicalizeUrlA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetCanonicalizeUrlA`(`lpszurl` : `windows_sys`.`core`.`PCSTR`, `lpszbuffer` : `windows_sys`.`core`.`PSTR`, `lpdwbufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwflags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetCanonicalizeUrlW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetCanonicalizeUrlW`(`lpszurl` : `windows_sys`.`core`.`PCWSTR`, `lpszbuffer` : `windows_sys`.`core`.`PWSTR`, `lpdwbufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwflags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetCheckConnectionA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetCheckConnectionA`(`lpszurl` : `windows_sys`.`core`.`PCSTR`, `dwflags` : UInt, `dwreserved` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetCheckConnectionW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetCheckConnectionW`(`lpszurl` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt, `dwreserved` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetClearAllPerSiteCookieDecisions; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetClearAllPerSiteCookieDecisions`() : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetCloseHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetCloseHandle`(`hinternet` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetCombineUrlA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetCombineUrlA`(`lpszbaseurl` : `windows_sys`.`core`.`PCSTR`, `lpszrelativeurl` : `windows_sys`.`core`.`PCSTR`, `lpszbuffer` : `windows_sys`.`core`.`PSTR`, `lpdwbufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwflags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetCombineUrlW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetCombineUrlW`(`lpszbaseurl` : `windows_sys`.`core`.`PCWSTR`, `lpszrelativeurl` : `windows_sys`.`core`.`PCWSTR`, `lpszbuffer` : `windows_sys`.`core`.`PWSTR`, `lpdwbufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwflags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetConfirmZoneCrossing; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetConfirmZoneCrossing`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `szurlprev` : `windows_sys`.`core`.`PCSTR`, `szurlnew` : `windows_sys`.`core`.`PCSTR`, `bpost` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetConfirmZoneCrossingA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetConfirmZoneCrossingA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `szurlprev` : `windows_sys`.`core`.`PCSTR`, `szurlnew` : `windows_sys`.`core`.`PCSTR`, `bpost` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetConfirmZoneCrossingW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetConfirmZoneCrossingW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `szurlprev` : `windows_sys`.`core`.`PCWSTR`, `szurlnew` : `windows_sys`.`core`.`PCWSTR`, `bpost` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetConnectA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetConnectA`(`hinternet` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszservername` : `windows_sys`.`core`.`PCSTR`, `nserverport` : UShort, `lpszusername` : `windows_sys`.`core`.`PCSTR`, `lpszpassword` : `windows_sys`.`core`.`PCSTR`, `dwservice` : UInt, `dwflags` : UInt, `dwcontext` : ULong) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetConnectW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetConnectW`(`hinternet` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszservername` : `windows_sys`.`core`.`PCWSTR`, `nserverport` : UShort, `lpszusername` : `windows_sys`.`core`.`PCWSTR`, `lpszpassword` : `windows_sys`.`core`.`PCWSTR`, `dwservice` : UInt, `dwflags` : UInt, `dwcontext` : ULong) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetConvertUrlFromWireToWideChar; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetConvertUrlFromWireToWideChar`(`pcszurl` : `windows_sys`.`core`.`PCSTR`, `cchurl` : UInt, `pcwszbaseurl` : `windows_sys`.`core`.`PCWSTR`, `dwcodepagehost` : UInt, `dwcodepagepath` : UInt, `fencodepathextra` : `windows_sys`.`core`.`BOOL`, `dwcodepageextra` : UInt, `ppwszconvertedurl` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetCrackUrlA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinHttp")]
public external fun `InternetCrackUrlA`(`lpszurl` : `windows_sys`.`core`.`PCSTR`, `dwurllength` : UInt, `dwflags` : `super`.`WinHttp`.`WIN_HTTP_CREATE_URL_FLAGS`, `lpurlcomponents` : /* Rust *mut */ kotlinx.cinterop.CPointer<`URL_COMPONENTSA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetCrackUrlW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinHttp")]
public external fun `InternetCrackUrlW`(`lpszurl` : `windows_sys`.`core`.`PCWSTR`, `dwurllength` : UInt, `dwflags` : `super`.`WinHttp`.`WIN_HTTP_CREATE_URL_FLAGS`, `lpurlcomponents` : /* Rust *mut */ kotlinx.cinterop.CPointer<`URL_COMPONENTSW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetCreateUrlA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetCreateUrlA`(`lpurlcomponents` : /* Rust *const */ kotlinx.cinterop.CPointer<`URL_COMPONENTSA`>?, `dwflags` : UInt, `lpszurl` : `windows_sys`.`core`.`PSTR`, `lpdwurllength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetCreateUrlW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetCreateUrlW`(`lpurlcomponents` : /* Rust *const */ kotlinx.cinterop.CPointer<`URL_COMPONENTSW`>?, `dwflags` : UInt, `lpszurl` : `windows_sys`.`core`.`PWSTR`, `lpdwurllength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetDial; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetDial`(`hwndparent` : `super`.`super`.`Foundation`.`HWND`, `lpszconnectoid` : `windows_sys`.`core`.`PCSTR`, `dwflags` : UInt, `lpdwconnection` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwreserved` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetDialA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetDialA`(`hwndparent` : `super`.`super`.`Foundation`.`HWND`, `lpszconnectoid` : `windows_sys`.`core`.`PCSTR`, `dwflags` : UInt, `lpdwconnection` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `dwreserved` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetDialW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetDialW`(`hwndparent` : `super`.`super`.`Foundation`.`HWND`, `lpszconnectoid` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt, `lpdwconnection` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `dwreserved` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetEnumPerSiteCookieDecisionA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetEnumPerSiteCookieDecisionA`(`pszsitename` : `windows_sys`.`core`.`PSTR`, `pcsitenamesize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdwdecision` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwindex` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetEnumPerSiteCookieDecisionW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetEnumPerSiteCookieDecisionW`(`pszsitename` : `windows_sys`.`core`.`PWSTR`, `pcsitenamesize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdwdecision` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwindex` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetErrorDlg; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetErrorDlg`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hrequest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwerror` : UInt, `dwflags` : UInt, `lppvdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetFindNextFileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetFindNextFileA`(`hfind` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpvfinddata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetFindNextFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetFindNextFileW`(`hfind` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpvfinddata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetFortezzaCommand; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetFortezzaCommand`(`dwcommand` : UInt, `hwnd` : `super`.`super`.`Foundation`.`HWND`, `dwreserved` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetFreeCookies; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetFreeCookies`(`pcookies` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_COOKIE2`>?, `dwcookiecount` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetFreeProxyInfoList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetFreeProxyInfoList`(`pproxyinfolist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WININET_PROXY_INFO_LIST`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetGetConnectedState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetGetConnectedState`(`lpdwflags` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_CONNECTION`>?, `dwreserved` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetGetConnectedStateEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetGetConnectedStateEx`(`lpdwflags` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_CONNECTION`>?, `lpszconnectionname` : `windows_sys`.`core`.`PSTR`, `dwnamelen` : UInt, `dwreserved` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetGetConnectedStateExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetGetConnectedStateExA`(`lpdwflags` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_CONNECTION`>?, `lpszconnectionname` : `windows_sys`.`core`.`PSTR`, `cchnamelen` : UInt, `dwreserved` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetGetConnectedStateExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetGetConnectedStateExW`(`lpdwflags` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_CONNECTION`>?, `lpszconnectionname` : `windows_sys`.`core`.`PWSTR`, `cchnamelen` : UInt, `dwreserved` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetGetCookieA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetGetCookieA`(`lpszurl` : `windows_sys`.`core`.`PCSTR`, `lpszcookiename` : `windows_sys`.`core`.`PCSTR`, `lpszcookiedata` : `windows_sys`.`core`.`PSTR`, `lpdwsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetGetCookieEx2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetGetCookieEx2`(`pcwszurl` : `windows_sys`.`core`.`PCWSTR`, `pcwszcookiename` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt, `ppcookies` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`INTERNET_COOKIE2`>>?, `pdwcookiecount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetGetCookieExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetGetCookieExA`(`lpszurl` : `windows_sys`.`core`.`PCSTR`, `lpszcookiename` : `windows_sys`.`core`.`PCSTR`, `lpszcookiedata` : `windows_sys`.`core`.`PCSTR`, `lpdwsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwflags` : `INTERNET_COOKIE_FLAGS`, `lpreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetGetCookieExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetGetCookieExW`(`lpszurl` : `windows_sys`.`core`.`PCWSTR`, `lpszcookiename` : `windows_sys`.`core`.`PCWSTR`, `lpszcookiedata` : `windows_sys`.`core`.`PCWSTR`, `lpdwsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwflags` : `INTERNET_COOKIE_FLAGS`, `lpreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetGetCookieW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetGetCookieW`(`lpszurl` : `windows_sys`.`core`.`PCWSTR`, `lpszcookiename` : `windows_sys`.`core`.`PCWSTR`, `lpszcookiedata` : `windows_sys`.`core`.`PWSTR`, `lpdwsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetGetLastResponseInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetGetLastResponseInfoA`(`lpdwerror` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpszbuffer` : `windows_sys`.`core`.`PSTR`, `lpdwbufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetGetLastResponseInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetGetLastResponseInfoW`(`lpdwerror` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpszbuffer` : `windows_sys`.`core`.`PWSTR`, `lpdwbufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetGetPerSiteCookieDecisionA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetGetPerSiteCookieDecisionA`(`pchhostname` : `windows_sys`.`core`.`PCSTR`, `presult` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetGetPerSiteCookieDecisionW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetGetPerSiteCookieDecisionW`(`pchhostname` : `windows_sys`.`core`.`PCWSTR`, `presult` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetGetProxyForUrl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetGetProxyForUrl`(`hinternet` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pcwszurl` : `windows_sys`.`core`.`PCWSTR`, `pproxyinfolist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WININET_PROXY_INFO_LIST`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetGetSecurityInfoByURL; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
public external fun `InternetGetSecurityInfoByURL`(`lpszurl` : `windows_sys`.`core`.`PCSTR`, `ppcertchain` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`Cryptography`.`CERT_CHAIN_CONTEXT`>>?, `pdwsecureflags` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetGetSecurityInfoByURLA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
public external fun `InternetGetSecurityInfoByURLA`(`lpszurl` : `windows_sys`.`core`.`PCSTR`, `ppcertchain` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`Cryptography`.`CERT_CHAIN_CONTEXT`>>?, `pdwsecureflags` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetGetSecurityInfoByURLW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
public external fun `InternetGetSecurityInfoByURLW`(`lpszurl` : `windows_sys`.`core`.`PCWSTR`, `ppcertchain` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`Cryptography`.`CERT_CHAIN_CONTEXT`>>?, `pdwsecureflags` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetGoOnline; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetGoOnline`(`lpszurl` : `windows_sys`.`core`.`PCSTR`, `hwndparent` : `super`.`super`.`Foundation`.`HWND`, `dwflags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetGoOnlineA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetGoOnlineA`(`lpszurl` : `windows_sys`.`core`.`PCSTR`, `hwndparent` : `super`.`super`.`Foundation`.`HWND`, `dwflags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetGoOnlineW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetGoOnlineW`(`lpszurl` : `windows_sys`.`core`.`PCWSTR`, `hwndparent` : `super`.`super`.`Foundation`.`HWND`, `dwflags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetHangUp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetHangUp`(`dwconnection` : ULong, `dwreserved` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetInitializeAutoProxyDll; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetInitializeAutoProxyDll`(`dwreserved` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetLockRequestFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetLockRequestFile`(`hinternet` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lphlockrequestinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetOpenA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetOpenA`(`lpszagent` : `windows_sys`.`core`.`PCSTR`, `dwaccesstype` : UInt, `lpszproxy` : `windows_sys`.`core`.`PCSTR`, `lpszproxybypass` : `windows_sys`.`core`.`PCSTR`, `dwflags` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetOpenUrlA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetOpenUrlA`(`hinternet` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszurl` : `windows_sys`.`core`.`PCSTR`, `lpszheaders` : `windows_sys`.`core`.`PCSTR`, `dwheaderslength` : UInt, `dwflags` : UInt, `dwcontext` : ULong) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetOpenUrlW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetOpenUrlW`(`hinternet` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszurl` : `windows_sys`.`core`.`PCWSTR`, `lpszheaders` : `windows_sys`.`core`.`PCWSTR`, `dwheaderslength` : UInt, `dwflags` : UInt, `dwcontext` : ULong) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetOpenW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetOpenW`(`lpszagent` : `windows_sys`.`core`.`PCWSTR`, `dwaccesstype` : UInt, `lpszproxy` : `windows_sys`.`core`.`PCWSTR`, `lpszproxybypass` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetQueryDataAvailable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetQueryDataAvailable`(`hfile` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpdwnumberofbytesavailable` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwflags` : UInt, `dwcontext` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetQueryFortezzaStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetQueryFortezzaStatus`(`pdwstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwreserved` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetQueryOptionA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetQueryOptionA`(`hinternet` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwoption` : UInt, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpdwbufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetQueryOptionW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetQueryOptionW`(`hinternet` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwoption` : UInt, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpdwbufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetReadFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetReadFile`(`hfile` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwnumberofbytestoread` : UInt, `lpdwnumberofbytesread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetReadFileExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetReadFileExA`(`hfile` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpbuffersout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_BUFFERSA`>?, `dwflags` : UInt, `dwcontext` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetReadFileExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetReadFileExW`(`hfile` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpbuffersout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_BUFFERSW`>?, `dwflags` : UInt, `dwcontext` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetSecurityProtocolToStringA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetSecurityProtocolToStringA`(`dwprotocol` : UInt, `lpstr` : `windows_sys`.`core`.`PSTR`, `lpdwstrlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwreserved` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetSecurityProtocolToStringW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetSecurityProtocolToStringW`(`dwprotocol` : UInt, `lpstr` : `windows_sys`.`core`.`PWSTR`, `lpdwstrlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwreserved` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetSetCookieA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetSetCookieA`(`lpszurl` : `windows_sys`.`core`.`PCSTR`, `lpszcookiename` : `windows_sys`.`core`.`PCSTR`, `lpszcookiedata` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetSetCookieEx2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetSetCookieEx2`(`pcwszurl` : `windows_sys`.`core`.`PCWSTR`, `pcookie` : /* Rust *const */ kotlinx.cinterop.CPointer<`INTERNET_COOKIE2`>?, `pcwszp3ppolicy` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt, `pdwcookiestate` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetSetCookieExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetSetCookieExA`(`lpszurl` : `windows_sys`.`core`.`PCSTR`, `lpszcookiename` : `windows_sys`.`core`.`PCSTR`, `lpszcookiedata` : `windows_sys`.`core`.`PCSTR`, `dwflags` : UInt, `dwreserved` : ULong) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetSetCookieExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetSetCookieExW`(`lpszurl` : `windows_sys`.`core`.`PCWSTR`, `lpszcookiename` : `windows_sys`.`core`.`PCWSTR`, `lpszcookiedata` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt, `dwreserved` : ULong) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetSetCookieW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetSetCookieW`(`lpszurl` : `windows_sys`.`core`.`PCWSTR`, `lpszcookiename` : `windows_sys`.`core`.`PCWSTR`, `lpszcookiedata` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetSetDialState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetSetDialState`(`lpszconnectoid` : `windows_sys`.`core`.`PCSTR`, `dwstate` : UInt, `dwreserved` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetSetDialStateA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetSetDialStateA`(`lpszconnectoid` : `windows_sys`.`core`.`PCSTR`, `dwstate` : UInt, `dwreserved` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetSetDialStateW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetSetDialStateW`(`lpszconnectoid` : `windows_sys`.`core`.`PCWSTR`, `dwstate` : UInt, `dwreserved` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetSetFilePointer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetSetFilePointer`(`hfile` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ldistancetomove` : Int, `lpdistancetomovehigh` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `dwmovemethod` : UInt, `dwcontext` : ULong) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetSetOptionA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetSetOptionA`(`hinternet` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwoption` : UInt, `lpbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwbufferlength` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetSetOptionExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetSetOptionExA`(`hinternet` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwoption` : UInt, `lpbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwbufferlength` : UInt, `dwflags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetSetOptionExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetSetOptionExW`(`hinternet` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwoption` : UInt, `lpbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwbufferlength` : UInt, `dwflags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetSetOptionW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetSetOptionW`(`hinternet` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwoption` : UInt, `lpbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwbufferlength` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetSetPerSiteCookieDecisionA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetSetPerSiteCookieDecisionA`(`pchhostname` : `windows_sys`.`core`.`PCSTR`, `dwdecision` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetSetPerSiteCookieDecisionW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetSetPerSiteCookieDecisionW`(`pchhostname` : `windows_sys`.`core`.`PCWSTR`, `dwdecision` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetSetStatusCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetSetStatusCallback`(`hinternet` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpfninternetcallback` : `LPINTERNET_STATUS_CALLBACK`) : `LPINTERNET_STATUS_CALLBACK`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetSetStatusCallbackA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetSetStatusCallbackA`(`hinternet` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpfninternetcallback` : `LPINTERNET_STATUS_CALLBACK`) : `LPINTERNET_STATUS_CALLBACK`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetSetStatusCallbackW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetSetStatusCallbackW`(`hinternet` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpfninternetcallback` : `LPINTERNET_STATUS_CALLBACK`) : `LPINTERNET_STATUS_CALLBACK`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetShowSecurityInfoByURL; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetShowSecurityInfoByURL`(`lpszurl` : `windows_sys`.`core`.`PCSTR`, `hwndparent` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetShowSecurityInfoByURLA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetShowSecurityInfoByURLA`(`lpszurl` : `windows_sys`.`core`.`PCSTR`, `hwndparent` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetShowSecurityInfoByURLW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetShowSecurityInfoByURLW`(`lpszurl` : `windows_sys`.`core`.`PCWSTR`, `hwndparent` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetTimeFromSystemTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetTimeFromSystemTime`(`pst` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SYSTEMTIME`>?, `dwrfc` : UInt, `lpsztime` : `windows_sys`.`core`.`PSTR`, `cbtime` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetTimeFromSystemTimeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetTimeFromSystemTimeA`(`pst` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SYSTEMTIME`>?, `dwrfc` : UInt, `lpsztime` : `windows_sys`.`core`.`PSTR`, `cbtime` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetTimeFromSystemTimeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetTimeFromSystemTimeW`(`pst` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SYSTEMTIME`>?, `dwrfc` : UInt, `lpsztime` : `windows_sys`.`core`.`PWSTR`, `cbtime` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetTimeToSystemTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetTimeToSystemTime`(`lpsztime` : `windows_sys`.`core`.`PCSTR`, `pst` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SYSTEMTIME`>?, `dwreserved` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetTimeToSystemTimeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetTimeToSystemTimeA`(`lpsztime` : `windows_sys`.`core`.`PCSTR`, `pst` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SYSTEMTIME`>?, `dwreserved` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetTimeToSystemTimeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetTimeToSystemTimeW`(`lpsztime` : `windows_sys`.`core`.`PCWSTR`, `pst` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SYSTEMTIME`>?, `dwreserved` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetUnlockRequestFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetUnlockRequestFile`(`hlockrequestinfo` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetWriteFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetWriteFile`(`hfile` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwnumberofbytestowrite` : UInt, `lpdwnumberofbyteswritten` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetWriteFileExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetWriteFileExA`(`hfile` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpbuffersin` : /* Rust *const */ kotlinx.cinterop.CPointer<`INTERNET_BUFFERSA`>?, `dwflags` : UInt, `dwcontext` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=InternetWriteFileExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternetWriteFileExW`(`hfile` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpbuffersin` : /* Rust *const */ kotlinx.cinterop.CPointer<`INTERNET_BUFFERSW`>?, `dwflags` : UInt, `dwcontext` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=IsDomainLegalCookieDomainA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsDomainLegalCookieDomainA`(`pchdomain` : `windows_sys`.`core`.`PCSTR`, `pchfulldomain` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=IsDomainLegalCookieDomainW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsDomainLegalCookieDomainW`(`pchdomain` : `windows_sys`.`core`.`PCWSTR`, `pchfulldomain` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=IsHostInProxyBypassList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsHostInProxyBypassList`(`tscheme` : `INTERNET_SCHEME`, `lpszhost` : `windows_sys`.`core`.`PCSTR`, `cchhost` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=IsProfilesEnabled; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsProfilesEnabled`() : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=IsUrlCacheEntryExpiredA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsUrlCacheEntryExpiredA`(`lpszurlname` : `windows_sys`.`core`.`PCSTR`, `dwflags` : UInt, `pftlastmodified` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=IsUrlCacheEntryExpiredW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsUrlCacheEntryExpiredW`(`lpszurlname` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt, `pftlastmodified` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=LoadUrlCacheContent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LoadUrlCacheContent`() : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=ParseX509EncodedCertificateForListBoxEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ParseX509EncodedCertificateForListBoxEntry`(`lpcert` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbcert` : UInt, `lpszlistboxentry` : `windows_sys`.`core`.`PSTR`, `lpdwlistboxentry` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=PerformOperationOverUrlCacheA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PerformOperationOverUrlCacheA`(`pszurlsearchpattern` : `windows_sys`.`core`.`PCSTR`, `dwflags` : UInt, `dwfilter` : UInt, `groupid` : Long, `preserved1` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pdwreserved2` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `preserved3` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `op` : `CACHE_OPERATOR`, `poperatordata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=PrivacyGetZonePreferenceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PrivacyGetZonePreferenceW`(`dwzone` : UInt, `dwtype` : UInt, `pdwtemplate` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pszbuffer` : `windows_sys`.`core`.`PWSTR`, `pdwbufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=PrivacySetZonePreferenceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PrivacySetZonePreferenceW`(`dwzone` : UInt, `dwtype` : UInt, `dwtemplate` : UInt, `pszpreference` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=ReadGuidsForConnectedNetworks; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReadGuidsForConnectedNetworks`(`pcnetworks` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pppwsznetworkguids` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`PWSTR`>>?, `pppbstrnetworknames` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`BSTR`>>?, `pppwszgwmacs` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`PWSTR`>>?, `pcgatewaymacs` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdwflags` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=ReadUrlCacheEntryStream; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReadUrlCacheEntryStream`(`hurlcachestream` : `super`.`super`.`Foundation`.`HANDLE`, `dwlocation` : UInt, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpdwlen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `reserved` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=ReadUrlCacheEntryStreamEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReadUrlCacheEntryStreamEx`(`hurlcachestream` : `super`.`super`.`Foundation`.`HANDLE`, `qwlocation` : ULong, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpdwlen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=RegisterUrlCacheNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterUrlCacheNotification`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `umsg` : UInt, `gid` : Long, `dwopsfilter` : UInt, `dwreserved` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=ResumeSuspendedDownload; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ResumeSuspendedDownload`(`hrequest` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwresultcode` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=RetrieveUrlCacheEntryFileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RetrieveUrlCacheEntryFileA`(`lpszurlname` : `windows_sys`.`core`.`PCSTR`, `lpcacheentryinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_CACHE_ENTRY_INFOA`>?, `lpcbcacheentryinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwreserved` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=RetrieveUrlCacheEntryFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RetrieveUrlCacheEntryFileW`(`lpszurlname` : `windows_sys`.`core`.`PCWSTR`, `lpcacheentryinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_CACHE_ENTRY_INFOW`>?, `lpcbcacheentryinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwreserved` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=RetrieveUrlCacheEntryStreamA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RetrieveUrlCacheEntryStreamA`(`lpszurlname` : `windows_sys`.`core`.`PCSTR`, `lpcacheentryinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_CACHE_ENTRY_INFOA`>?, `lpcbcacheentryinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `frandomread` : `windows_sys`.`core`.`BOOL`, `dwreserved` : UInt) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=RetrieveUrlCacheEntryStreamW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RetrieveUrlCacheEntryStreamW`(`lpszurlname` : `windows_sys`.`core`.`PCWSTR`, `lpcacheentryinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_CACHE_ENTRY_INFOW`>?, `lpcbcacheentryinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `frandomread` : `windows_sys`.`core`.`BOOL`, `dwreserved` : UInt) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=RunOnceUrlCache; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RunOnceUrlCache`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hinst` : `super`.`super`.`Foundation`.`HINSTANCE`, `lpszcmd` : `windows_sys`.`core`.`PCSTR`, `ncmdshow` : Int) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=SetUrlCacheConfigInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetUrlCacheConfigInfoA`(`lpcacheconfiginfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`INTERNET_CACHE_CONFIG_INFOA`>?, `dwfieldcontrol` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=SetUrlCacheConfigInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetUrlCacheConfigInfoW`(`lpcacheconfiginfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`INTERNET_CACHE_CONFIG_INFOW`>?, `dwfieldcontrol` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=SetUrlCacheEntryGroup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetUrlCacheEntryGroup`(`lpszurlname` : `windows_sys`.`core`.`PCSTR`, `dwflags` : UInt, `groupid` : Long, `pbgroupattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbgroupattributes` : UInt, `lpreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=SetUrlCacheEntryGroupA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetUrlCacheEntryGroupA`(`lpszurlname` : `windows_sys`.`core`.`PCSTR`, `dwflags` : UInt, `groupid` : Long, `pbgroupattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbgroupattributes` : UInt, `lpreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=SetUrlCacheEntryGroupW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetUrlCacheEntryGroupW`(`lpszurlname` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt, `groupid` : Long, `pbgroupattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbgroupattributes` : UInt, `lpreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=SetUrlCacheEntryInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetUrlCacheEntryInfoA`(`lpszurlname` : `windows_sys`.`core`.`PCSTR`, `lpcacheentryinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`INTERNET_CACHE_ENTRY_INFOA`>?, `dwfieldcontrol` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=SetUrlCacheEntryInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetUrlCacheEntryInfoW`(`lpszurlname` : `windows_sys`.`core`.`PCWSTR`, `lpcacheentryinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`INTERNET_CACHE_ENTRY_INFOW`>?, `dwfieldcontrol` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=SetUrlCacheGroupAttributeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetUrlCacheGroupAttributeA`(`gid` : Long, `dwflags` : UInt, `dwattributes` : UInt, `lpgroupinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`INTERNET_CACHE_GROUP_INFOA`>?, `lpreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=SetUrlCacheGroupAttributeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetUrlCacheGroupAttributeW`(`gid` : Long, `dwflags` : UInt, `dwattributes` : UInt, `lpgroupinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`INTERNET_CACHE_GROUP_INFOW`>?, `lpreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=SetUrlCacheHeaderData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetUrlCacheHeaderData`(`nidx` : UInt, `dwdata` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=ShowClientAuthCerts; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ShowClientAuthCerts`(`hwndparent` : `super`.`super`.`Foundation`.`HWND`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=ShowSecurityInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security_Authentication_Identity", feature = "Win32_Security_Cryptography"))]
public external fun `ShowSecurityInfo`(`hwndparent` : `super`.`super`.`Foundation`.`HWND`, `psecurityinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`INTERNET_SECURITY_INFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=ShowX509EncodedCertificate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ShowX509EncodedCertificate`(`hwndparent` : `super`.`super`.`Foundation`.`HWND`, `lpcert` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbcert` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=UnlockUrlCacheEntryFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UnlockUrlCacheEntryFile`(`lpszurlname` : `windows_sys`.`core`.`PCSTR`, `dwreserved` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=UnlockUrlCacheEntryFileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UnlockUrlCacheEntryFileA`(`lpszurlname` : `windows_sys`.`core`.`PCSTR`, `dwreserved` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=UnlockUrlCacheEntryFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UnlockUrlCacheEntryFileW`(`lpszurlname` : `windows_sys`.`core`.`PCWSTR`, `dwreserved` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=UnlockUrlCacheEntryStream; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UnlockUrlCacheEntryStream`(`hurlcachestream` : `super`.`super`.`Foundation`.`HANDLE`, `reserved` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=UpdateUrlCacheContentPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UpdateUrlCacheContentPath`(`sznewpath` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=UrlCacheCheckEntriesExist; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UrlCacheCheckEntriesExist`(`rgpwszurls` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?, `centries` : UInt, `rgfexist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=UrlCacheCloseEntryHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UrlCacheCloseEntryHandle`(`hentryfile` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=UrlCacheContainerSetEntryMaximumAge; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UrlCacheContainerSetEntryMaximumAge`(`pwszprefix` : `windows_sys`.`core`.`PCWSTR`, `dwentrymaxage` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=UrlCacheCreateContainer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UrlCacheCreateContainer`(`pwszname` : `windows_sys`.`core`.`PCWSTR`, `pwszprefix` : `windows_sys`.`core`.`PCWSTR`, `pwszdirectory` : `windows_sys`.`core`.`PCWSTR`, `ulllimit` : ULong, `dwoptions` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=UrlCacheFindFirstEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UrlCacheFindFirstEntry`(`pwszprefix` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt, `dwfilter` : UInt, `groupid` : Long, `pcacheentryinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`URLCACHE_ENTRY_INFO`>?, `phfind` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=UrlCacheFindNextEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UrlCacheFindNextEntry`(`hfind` : `super`.`super`.`Foundation`.`HANDLE`, `pcacheentryinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`URLCACHE_ENTRY_INFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=UrlCacheFreeEntryInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UrlCacheFreeEntryInfo`(`pcacheentryinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`URLCACHE_ENTRY_INFO`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=UrlCacheFreeGlobalSpace; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UrlCacheFreeGlobalSpace`(`ulltargetsize` : ULong, `dwfilter` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=UrlCacheGetContentPaths; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UrlCacheGetContentPaths`(`pppwszdirectories` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`PWSTR`>>?, `pcdirectories` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=UrlCacheGetEntryInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UrlCacheGetEntryInfo`(`happcache` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pcwszurl` : `windows_sys`.`core`.`PCWSTR`, `pcacheentryinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`URLCACHE_ENTRY_INFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=UrlCacheGetGlobalCacheSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UrlCacheGetGlobalCacheSize`(`dwfilter` : UInt, `pullsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `pulllimit` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=UrlCacheGetGlobalLimit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UrlCacheGetGlobalLimit`(`limittype` : `URL_CACHE_LIMIT_TYPE`, `pulllimit` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=UrlCacheReadEntryStream; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UrlCacheReadEntryStream`(`hurlcachestream` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ulllocation` : ULong, `pbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwbufferlen` : UInt, `pdwbufferlen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=UrlCacheReloadSettings; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UrlCacheReloadSettings`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=UrlCacheRetrieveEntryFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UrlCacheRetrieveEntryFile`(`happcache` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pcwszurl` : `windows_sys`.`core`.`PCWSTR`, `pcacheentryinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`URLCACHE_ENTRY_INFO`>?, `phentryfile` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=UrlCacheRetrieveEntryStream; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UrlCacheRetrieveEntryStream`(`happcache` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pcwszurl` : `windows_sys`.`core`.`PCWSTR`, `frandomread` : `windows_sys`.`core`.`BOOL`, `pcacheentryinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`URLCACHE_ENTRY_INFO`>?, `phentrystream` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=UrlCacheServer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UrlCacheServer`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=UrlCacheSetGlobalLimit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UrlCacheSetGlobalLimit`(`limittype` : `URL_CACHE_LIMIT_TYPE`, `ulllimit` : ULong) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wininet.dll, ABI=system, export=UrlCacheUpdateEntryExtraData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UrlCacheUpdateEntryExtraData`(`happcache` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pcwszurl` : `windows_sys`.`core`.`PCWSTR`, `pbextradata` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbextradata` : UInt) : UInt
public const val `ANY_CACHE_ENTRY`: UInt = 4294967295u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `APP_CACHE_DOWNLOAD_ENTRY` (
    public var `pwszUrl`: `windows_sys`.`core`.`PWSTR`,
    public var `dwEntryType`: UInt,
)
// UNSUPPORTED Rust 314:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for APP_CACHE_DOWNLOAD_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `APP_CACHE_DOWNLOAD_LIST` (
    public var `dwEntryCount`: UInt,
    public var `pEntries`: /* Rust *mut */ kotlinx.cinterop.CPointer<`APP_CACHE_DOWNLOAD_ENTRY`>?,
)
// UNSUPPORTED Rust 325:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for APP_CACHE_DOWNLOAD_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `APP_CACHE_ENTRY_TYPE_EXPLICIT`: UInt = 2u;
public const val `APP_CACHE_ENTRY_TYPE_FALLBACK`: UInt = 4u;
public const val `APP_CACHE_ENTRY_TYPE_FOREIGN`: UInt = 8u;
public const val `APP_CACHE_ENTRY_TYPE_MANIFEST`: UInt = 16u;
public const val `APP_CACHE_ENTRY_TYPE_MASTER`: UInt = 1u;
public typealias `APP_CACHE_FINALIZE_STATE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `APP_CACHE_GROUP_INFO` (
    public var `pwszManifestUrl`: `windows_sys`.`core`.`PWSTR`,
    public var `ftLastAccessTime`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `ullSize`: ULong,
)
// UNSUPPORTED Rust 343:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for APP_CACHE_GROUP_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `APP_CACHE_GROUP_LIST` (
    public var `dwAppCacheGroupCount`: UInt,
    public var `pAppCacheGroups`: /* Rust *mut */ kotlinx.cinterop.CPointer<`APP_CACHE_GROUP_INFO`>?,
)
// UNSUPPORTED Rust 354:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for APP_CACHE_GROUP_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `APP_CACHE_LOOKUP_NO_MASTER_ONLY`: UInt = 1u;
public typealias `APP_CACHE_STATE` = Int;
public const val `AUTH_FLAG_DISABLE_BASIC_CLEARCHANNEL`: UInt = 4u;
public const val `AUTH_FLAG_DISABLE_NEGOTIATE`: UInt = 1u;
public const val `AUTH_FLAG_DISABLE_SERVER_AUTH`: UInt = 8u;
public const val `AUTH_FLAG_ENABLE_NEGOTIATE`: UInt = 2u;
public const val `AUTH_FLAG_RESET`: UInt = 0u;
public const val `AUTODIAL_MODE_ALWAYS`: UInt = 2u;
public const val `AUTODIAL_MODE_NEVER`: UInt = 1u;
public const val `AUTODIAL_MODE_NO_NETWORK_PRESENT`: UInt = 4u;
public const val `AUTO_PROXY_FLAG_ALWAYS_DETECT`: UInt = 2u;
public const val `AUTO_PROXY_FLAG_CACHE_INIT_RUN`: UInt = 32u;
public const val `AUTO_PROXY_FLAG_DETECTION_RUN`: UInt = 4u;
public const val `AUTO_PROXY_FLAG_DETECTION_SUSPECT`: UInt = 64u;
public const val `AUTO_PROXY_FLAG_DONT_CACHE_PROXY_RESULT`: UInt = 16u;
public const val `AUTO_PROXY_FLAG_MIGRATED`: UInt = 8u;
public const val `AUTO_PROXY_FLAG_USER_SET`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AUTO_PROXY_SCRIPT_BUFFER` (
    public var `dwStructSize`: UInt,
    public var `lpszScriptBuffer`: `windows_sys`.`core`.`PSTR`,
    public var `dwScriptBufferSize`: UInt,
)
// UNSUPPORTED Rust 383:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for AUTO_PROXY_SCRIPT_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `AppCacheFinalizeStateComplete`: `APP_CACHE_FINALIZE_STATE` = 2;
public const val `AppCacheFinalizeStateIncomplete`: `APP_CACHE_FINALIZE_STATE` = 0;
public const val `AppCacheFinalizeStateManifestChange`: `APP_CACHE_FINALIZE_STATE` = 1;
public const val `AppCacheStateNoUpdateNeeded`: `APP_CACHE_STATE` = 0;
public const val `AppCacheStateUpdateNeeded`: `APP_CACHE_STATE` = 1;
public const val `AppCacheStateUpdateNeededMasterOnly`: `APP_CACHE_STATE` = 3;
public const val `AppCacheStateUpdateNeededNew`: `APP_CACHE_STATE` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AutoProxyHelperFunctions` (
    public var `lpVtbl`: /* Rust *const */ kotlinx.cinterop.CPointer<`AutoProxyHelperVtbl`>?,
)
// UNSUPPORTED Rust 400:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for AutoProxyHelperFunctions {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `AutoProxyHelperVtbl` (
    public var `IsResolvable`: Long,
    public var `GetIPAddress`: Long,
    public var `ResolveHostName`: Long,
    public var `IsInNet`: Long,
    public var `IsResolvableEx`: Long,
    public var `GetIPAddressEx`: Long,
    public var `ResolveHostNameEx`: Long,
    public var `IsInNetEx`: Long,
    public var `SortIpList`: Long,
)
public const val `CACHEGROUP_ATTRIBUTE_BASIC`: UInt = 1u;
public const val `CACHEGROUP_ATTRIBUTE_FLAG`: UInt = 2u;
public const val `CACHEGROUP_ATTRIBUTE_GET_ALL`: UInt = 4294967295u;
public const val `CACHEGROUP_ATTRIBUTE_GROUPNAME`: UInt = 16u;
public const val `CACHEGROUP_ATTRIBUTE_QUOTA`: UInt = 8u;
public const val `CACHEGROUP_ATTRIBUTE_STORAGE`: UInt = 32u;
public const val `CACHEGROUP_ATTRIBUTE_TYPE`: UInt = 4u;
public const val `CACHEGROUP_FLAG_FLUSHURL_ONDELETE`: UInt = 2u;
public const val `CACHEGROUP_FLAG_GIDONLY`: UInt = 4u;
public const val `CACHEGROUP_FLAG_NONPURGEABLE`: UInt = 1u;
public const val `CACHEGROUP_FLAG_VALID`: UInt = 7u;
public const val `CACHEGROUP_ID_BUILTIN_STICKY`: ULong = 1152921504606846983uL;
public const val `CACHEGROUP_SEARCH_ALL`: UInt = 0u;
public const val `CACHEGROUP_SEARCH_BYURL`: UInt = 1u;
public const val `CACHEGROUP_TYPE_INVALID`: UInt = 1u;
public typealias `CACHE_CONFIG` = UInt;
public const val `CACHE_CONFIG_APPCONTAINER_CONTENT_QUOTA_FC`: UInt = 131072u;
public const val `CACHE_CONFIG_APPCONTAINER_TOTAL_CONTENT_QUOTA_FC`: UInt = 262144u;
public const val `CACHE_CONFIG_CONTENT_PATHS_FC`: `CACHE_CONFIG` = 256u;
public const val `CACHE_CONFIG_CONTENT_QUOTA_FC`: UInt = 32768u;
public const val `CACHE_CONFIG_CONTENT_USAGE_FC`: `CACHE_CONFIG` = 8192u;
public const val `CACHE_CONFIG_COOKIES_PATHS_FC`: `CACHE_CONFIG` = 512u;
public const val `CACHE_CONFIG_DISK_CACHE_PATHS_FC`: `CACHE_CONFIG` = 64u;
public const val `CACHE_CONFIG_FORCE_CLEANUP_FC`: `CACHE_CONFIG` = 32u;
public const val `CACHE_CONFIG_HISTORY_PATHS_FC`: `CACHE_CONFIG` = 1024u;
public const val `CACHE_CONFIG_QUOTA_FC`: `CACHE_CONFIG` = 2048u;
public const val `CACHE_CONFIG_STICKY_CONTENT_USAGE_FC`: `CACHE_CONFIG` = 16384u;
public const val `CACHE_CONFIG_SYNC_MODE_FC`: `CACHE_CONFIG` = 128u;
public const val `CACHE_CONFIG_TOTAL_CONTENT_QUOTA_FC`: UInt = 65536u;
public const val `CACHE_CONFIG_USER_MODE_FC`: `CACHE_CONFIG` = 4096u;
public const val `CACHE_ENTRY_ACCTIME_FC`: UInt = 256u;
public const val `CACHE_ENTRY_ATTRIBUTE_FC`: UInt = 4u;
public const val `CACHE_ENTRY_EXEMPT_DELTA_FC`: UInt = 2048u;
public const val `CACHE_ENTRY_EXPTIME_FC`: UInt = 128u;
public const val `CACHE_ENTRY_HEADERINFO_FC`: UInt = 1024u;
public const val `CACHE_ENTRY_HITRATE_FC`: UInt = 16u;
public const val `CACHE_ENTRY_MODIFY_DATA_FC`: UInt = 2147483648u;
public const val `CACHE_ENTRY_MODTIME_FC`: UInt = 64u;
public const val `CACHE_ENTRY_SYNCTIME_FC`: UInt = 512u;
public const val `CACHE_ENTRY_TYPE_FC`: UInt = 4096u;
public const val `CACHE_FIND_CONTAINER_RETURN_NOCHANGE`: UInt = 1u;
public const val `CACHE_HEADER_DATA_CACHE_READ_COUNT_SINCE_LAST_SCAVENGE`: UInt = 9u;
public const val `CACHE_HEADER_DATA_CACHE_RESERVED_12`: UInt = 12u;
public const val `CACHE_HEADER_DATA_CACHE_RESERVED_13`: UInt = 13u;
public const val `CACHE_HEADER_DATA_CACHE_RESERVED_15`: UInt = 15u;
public const val `CACHE_HEADER_DATA_CACHE_RESERVED_16`: UInt = 16u;
public const val `CACHE_HEADER_DATA_CACHE_RESERVED_17`: UInt = 17u;
public const val `CACHE_HEADER_DATA_CACHE_RESERVED_18`: UInt = 18u;
public const val `CACHE_HEADER_DATA_CACHE_RESERVED_19`: UInt = 19u;
public const val `CACHE_HEADER_DATA_CACHE_RESERVED_20`: UInt = 20u;
public const val `CACHE_HEADER_DATA_CACHE_RESERVED_23`: UInt = 23u;
public const val `CACHE_HEADER_DATA_CACHE_RESERVED_24`: UInt = 24u;
public const val `CACHE_HEADER_DATA_CACHE_RESERVED_25`: UInt = 25u;
public const val `CACHE_HEADER_DATA_CACHE_RESERVED_26`: UInt = 26u;
public const val `CACHE_HEADER_DATA_CACHE_RESERVED_28`: UInt = 28u;
public const val `CACHE_HEADER_DATA_CACHE_RESERVED_29`: UInt = 29u;
public const val `CACHE_HEADER_DATA_CACHE_RESERVED_30`: UInt = 30u;
public const val `CACHE_HEADER_DATA_CACHE_RESERVED_31`: UInt = 31u;
public const val `CACHE_HEADER_DATA_CACHE_WRITE_COUNT_SINCE_LAST_SCAVENGE`: UInt = 10u;
public const val `CACHE_HEADER_DATA_CONLIST_CHANGE_COUNT`: UInt = 1u;
public const val `CACHE_HEADER_DATA_COOKIE_CHANGE_COUNT`: UInt = 2u;
public const val `CACHE_HEADER_DATA_CURRENT_SETTINGS_VERSION`: UInt = 0u;
public const val `CACHE_HEADER_DATA_DOWNLOAD_PARTIAL`: UInt = 14u;
public const val `CACHE_HEADER_DATA_GID_HIGH`: UInt = 7u;
public const val `CACHE_HEADER_DATA_GID_LOW`: UInt = 6u;
public const val `CACHE_HEADER_DATA_HSTS_CHANGE_COUNT`: UInt = 11u;
public const val `CACHE_HEADER_DATA_LAST`: UInt = 31u;
public const val `CACHE_HEADER_DATA_LAST_SCAVENGE_TIMESTAMP`: UInt = 8u;
public const val `CACHE_HEADER_DATA_NOTIFICATION_FILTER`: UInt = 21u;
public const val `CACHE_HEADER_DATA_NOTIFICATION_HWND`: UInt = 3u;
public const val `CACHE_HEADER_DATA_NOTIFICATION_MESG`: UInt = 4u;
public const val `CACHE_HEADER_DATA_ROOTGROUP_OFFSET`: UInt = 5u;
public const val `CACHE_HEADER_DATA_ROOT_GROUPLIST_OFFSET`: UInt = 27u;
public const val `CACHE_HEADER_DATA_ROOT_LEAK_OFFSET`: UInt = 22u;
public const val `CACHE_HEADER_DATA_SSL_STATE_COUNT`: UInt = 14u;
public const val `CACHE_NOTIFY_ADD_URL`: UInt = 1u;
public const val `CACHE_NOTIFY_DELETE_ALL`: UInt = 8u;
public const val `CACHE_NOTIFY_DELETE_URL`: UInt = 2u;
public const val `CACHE_NOTIFY_FILTER_CHANGED`: UInt = 268435456u;
public const val `CACHE_NOTIFY_SET_OFFLINE`: UInt = 512u;
public const val `CACHE_NOTIFY_SET_ONLINE`: UInt = 256u;
public const val `CACHE_NOTIFY_UPDATE_URL`: UInt = 4u;
public const val `CACHE_NOTIFY_URL_SET_STICKY`: UInt = 16u;
public const val `CACHE_NOTIFY_URL_UNSET_STICKY`: UInt = 32u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CACHE_OPERATOR` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_CACHE_ENTRY_INFOA`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
public const val `COOKIE_ACCEPTED_CACHE_ENTRY`: UInt = 4096u;
public const val `COOKIE_ALLOW`: UInt = 2u;
public const val `COOKIE_ALLOW_ALL`: UInt = 4u;
public const val `COOKIE_CACHE_ENTRY`: UInt = 1048576u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `COOKIE_DLG_INFO` (
    public var `pszServer`: `windows_sys`.`core`.`PWSTR`,
    public var `pic`: /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_COOKIE`>?,
    public var `dwStopWarning`: UInt,
    public var `cx`: Int,
    public var `cy`: Int,
    public var `pszHeader`: `windows_sys`.`core`.`PWSTR`,
    public var `dwOperation`: UInt,
)
// UNSUPPORTED Rust 518:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for COOKIE_DLG_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `COOKIE_DONT_ALLOW`: UInt = 1u;
public const val `COOKIE_DONT_ALLOW_ALL`: UInt = 8u;
public const val `COOKIE_DOWNGRADED_CACHE_ENTRY`: UInt = 16384u;
public const val `COOKIE_LEASHED_CACHE_ENTRY`: UInt = 8192u;
public const val `COOKIE_OP_3RD_PARTY`: UInt = 32u;
public const val `COOKIE_OP_GET`: UInt = 4u;
public const val `COOKIE_OP_MODIFY`: UInt = 2u;
public const val `COOKIE_OP_PERSISTENT`: UInt = 16u;
public const val `COOKIE_OP_SESSION`: UInt = 8u;
public const val `COOKIE_OP_SET`: UInt = 1u;
public const val `COOKIE_REJECTED_CACHE_ENTRY`: UInt = 32768u;
public const val `COOKIE_STATE_ACCEPT`: `InternetCookieState` = 1;
public const val `COOKIE_STATE_DOWNGRADE`: `InternetCookieState` = 4;
public const val `COOKIE_STATE_LB`: UInt = 0u;
public const val `COOKIE_STATE_LEASH`: `InternetCookieState` = 3;
public const val `COOKIE_STATE_MAX`: `InternetCookieState` = 5;
public const val `COOKIE_STATE_PROMPT`: `InternetCookieState` = 2;
public const val `COOKIE_STATE_REJECT`: `InternetCookieState` = 5;
public const val `COOKIE_STATE_UB`: UInt = 5u;
public const val `COOKIE_STATE_UNKNOWN`: `InternetCookieState` = 0;
public const val `ConnectionEstablishmentEnd`: `REQUEST_TIMES` = 3;
public const val `ConnectionEstablishmentStart`: `REQUEST_TIMES` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CookieDecision` (
    public var `dwCookieState`: UInt,
    public var `fAllowSession`: `windows_sys`.`core`.`BOOL`,
)
public const val `DIALENG_OperationComplete`: UInt = 65536u;
public const val `DIALENG_RedialAttempt`: UInt = 65537u;
public const val `DIALENG_RedialWait`: UInt = 65538u;
// UNSUPPORTED Rust 554:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DIALPROP_DOMAIN: windows_sys::core::PCWSTR = windows_sys::core::w!("Domain");

// UNSUPPORTED Rust 555:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DIALPROP_LASTERROR: windows_sys::core::PCWSTR = windows_sys::core::w!("LastError");

// UNSUPPORTED Rust 556:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DIALPROP_PASSWORD: windows_sys::core::PCWSTR = windows_sys::core::w!("Password");

// UNSUPPORTED Rust 557:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DIALPROP_PHONENUMBER: windows_sys::core::PCWSTR = windows_sys::core::w!("PhoneNumber");

// UNSUPPORTED Rust 558:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DIALPROP_REDIALCOUNT: windows_sys::core::PCWSTR = windows_sys::core::w!("RedialCount");

// UNSUPPORTED Rust 559:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DIALPROP_REDIALINTERVAL: windows_sys::core::PCWSTR = windows_sys::core::w!("RedialInterval");

// UNSUPPORTED Rust 560:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DIALPROP_RESOLVEDPHONE: windows_sys::core::PCWSTR = windows_sys::core::w!("ResolvedPhone");

// UNSUPPORTED Rust 561:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DIALPROP_SAVEPASSWORD: windows_sys::core::PCWSTR = windows_sys::core::w!("SavePassword");

// UNSUPPORTED Rust 562:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DIALPROP_USERNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("UserName");

public const val `DLG_FLAGS_INSECURE_FALLBACK`: UInt = 4194304u;
public const val `DLG_FLAGS_INVALID_CA`: UInt = 16777216u;
public const val `DLG_FLAGS_SEC_CERT_CN_INVALID`: UInt = 33554432u;
public const val `DLG_FLAGS_SEC_CERT_DATE_INVALID`: UInt = 67108864u;
public const val `DLG_FLAGS_SEC_CERT_REV_FAILED`: UInt = 8388608u;
public const val `DLG_FLAGS_WEAK_SIGNATURE`: UInt = 2097152u;
public const val `DOWNLOAD_CACHE_ENTRY`: UInt = 1024u;
public const val `DUO_PROTOCOL_FLAG_SPDY3`: UInt = 1u;
public const val `DUO_PROTOCOL_MASK`: UInt = 1u;
public const val `EDITED_CACHE_ENTRY`: UInt = 8u;
public const val `ERROR_FTP_DROPPED`: UInt = 12111u;
public const val `ERROR_FTP_NO_PASSIVE_MODE`: UInt = 12112u;
public const val `ERROR_FTP_TRANSFER_IN_PROGRESS`: UInt = 12110u;
public const val `ERROR_GOPHER_ATTRIBUTE_NOT_FOUND`: UInt = 12137u;
public const val `ERROR_GOPHER_DATA_ERROR`: UInt = 12132u;
public const val `ERROR_GOPHER_END_OF_DATA`: UInt = 12133u;
public const val `ERROR_GOPHER_INCORRECT_LOCATOR_TYPE`: UInt = 12135u;
public const val `ERROR_GOPHER_INVALID_LOCATOR`: UInt = 12134u;
public const val `ERROR_GOPHER_NOT_FILE`: UInt = 12131u;
public const val `ERROR_GOPHER_NOT_GOPHER_PLUS`: UInt = 12136u;
public const val `ERROR_GOPHER_PROTOCOL_ERROR`: UInt = 12130u;
public const val `ERROR_GOPHER_UNKNOWN_LOCATOR`: UInt = 12138u;
public const val `ERROR_HTTP_COOKIE_DECLINED`: UInt = 12162u;
public const val `ERROR_HTTP_COOKIE_NEEDS_CONFIRMATION`: UInt = 12161u;
public const val `ERROR_HTTP_COOKIE_NEEDS_CONFIRMATION_EX`: UInt = 12907u;
public const val `ERROR_HTTP_DOWNLEVEL_SERVER`: UInt = 12151u;
public const val `ERROR_HTTP_HEADER_ALREADY_EXISTS`: UInt = 12155u;
public const val `ERROR_HTTP_HEADER_NOT_FOUND`: UInt = 12150u;
public const val `ERROR_HTTP_HSTS_REDIRECT_REQUIRED`: UInt = 12060u;
public const val `ERROR_HTTP_INVALID_HEADER`: UInt = 12153u;
public const val `ERROR_HTTP_INVALID_QUERY_REQUEST`: UInt = 12154u;
public const val `ERROR_HTTP_INVALID_SERVER_RESPONSE`: UInt = 12152u;
public const val `ERROR_HTTP_NOT_REDIRECTED`: UInt = 12160u;
public const val `ERROR_HTTP_PUSH_ENABLE_FAILED`: UInt = 12149u;
public const val `ERROR_HTTP_PUSH_RETRY_NOT_SUPPORTED`: UInt = 12148u;
public const val `ERROR_HTTP_PUSH_STATUS_CODE_NOT_SUPPORTED`: UInt = 12147u;
public const val `ERROR_HTTP_REDIRECT_FAILED`: UInt = 12156u;
public const val `ERROR_HTTP_REDIRECT_NEEDS_CONFIRMATION`: UInt = 12168u;
public const val `ERROR_INTERNET_ASYNC_THREAD_FAILED`: UInt = 12047u;
public const val `ERROR_INTERNET_BAD_AUTO_PROXY_SCRIPT`: UInt = 12166u;
public const val `ERROR_INTERNET_BAD_OPTION_LENGTH`: UInt = 12010u;
public const val `ERROR_INTERNET_BAD_REGISTRY_PARAMETER`: UInt = 12022u;
public const val `ERROR_INTERNET_CACHE_SUCCESS`: UInt = 12906u;
public const val `ERROR_INTERNET_CANNOT_CONNECT`: UInt = 12029u;
public const val `ERROR_INTERNET_CHG_POST_IS_NON_SECURE`: UInt = 12042u;
public const val `ERROR_INTERNET_CLIENT_AUTH_CERT_NEEDED`: UInt = 12044u;
public const val `ERROR_INTERNET_CLIENT_AUTH_CERT_NEEDED_PROXY`: UInt = 12187u;
public const val `ERROR_INTERNET_CLIENT_AUTH_NOT_SETUP`: UInt = 12046u;
public const val `ERROR_INTERNET_CONNECTION_ABORTED`: UInt = 12030u;
public const val `ERROR_INTERNET_CONNECTION_AVAILABLE`: UInt = 12902u;
public const val `ERROR_INTERNET_CONNECTION_RESET`: UInt = 12031u;
public const val `ERROR_INTERNET_DECODING_FAILED`: UInt = 12175u;
public const val `ERROR_INTERNET_DIALOG_PENDING`: UInt = 12049u;
public const val `ERROR_INTERNET_DISALLOW_INPRIVATE`: UInt = 12189u;
public const val `ERROR_INTERNET_DISCONNECTED`: UInt = 12163u;
public const val `ERROR_INTERNET_EXTENDED_ERROR`: UInt = 12003u;
public const val `ERROR_INTERNET_FAILED_DUETOSECURITYCHECK`: UInt = 12171u;
public const val `ERROR_INTERNET_FEATURE_DISABLED`: UInt = 12192u;
public const val `ERROR_INTERNET_FORCE_RETRY`: UInt = 12032u;
public const val `ERROR_INTERNET_FORTEZZA_LOGIN_NEEDED`: UInt = 12054u;
public const val `ERROR_INTERNET_GLOBAL_CALLBACK_FAILED`: UInt = 12191u;
public const val `ERROR_INTERNET_HANDLE_EXISTS`: UInt = 12036u;
public const val `ERROR_INTERNET_HTTPS_HTTP_SUBMIT_REDIR`: UInt = 12052u;
public const val `ERROR_INTERNET_HTTPS_TO_HTTP_ON_REDIR`: UInt = 12040u;
public const val `ERROR_INTERNET_HTTP_PROTOCOL_MISMATCH`: UInt = 12190u;
public const val `ERROR_INTERNET_HTTP_TO_HTTPS_ON_REDIR`: UInt = 12039u;
public const val `ERROR_INTERNET_INCORRECT_FORMAT`: UInt = 12027u;
public const val `ERROR_INTERNET_INCORRECT_HANDLE_STATE`: UInt = 12019u;
public const val `ERROR_INTERNET_INCORRECT_HANDLE_TYPE`: UInt = 12018u;
public const val `ERROR_INTERNET_INCORRECT_PASSWORD`: UInt = 12014u;
public const val `ERROR_INTERNET_INCORRECT_USER_NAME`: UInt = 12013u;
public const val `ERROR_INTERNET_INSECURE_FALLBACK_REQUIRED`: UInt = 12059u;
public const val `ERROR_INTERNET_INSERT_CDROM`: UInt = 12053u;
public const val `ERROR_INTERNET_INTERNAL_ERROR`: UInt = 12004u;
public const val `ERROR_INTERNET_INTERNAL_SOCKET_ERROR`: UInt = 12901u;
public const val `ERROR_INTERNET_INVALID_CA`: UInt = 12045u;
public const val `ERROR_INTERNET_INVALID_OPERATION`: UInt = 12016u;
public const val `ERROR_INTERNET_INVALID_OPTION`: UInt = 12009u;
public const val `ERROR_INTERNET_INVALID_PROXY_REQUEST`: UInt = 12033u;
public const val `ERROR_INTERNET_INVALID_URL`: UInt = 12005u;
public const val `ERROR_INTERNET_ITEM_NOT_FOUND`: UInt = 12028u;
public const val `ERROR_INTERNET_LOGIN_FAILURE`: UInt = 12015u;
public const val `ERROR_INTERNET_LOGIN_FAILURE_DISPLAY_ENTITY_BODY`: UInt = 12174u;
public const val `ERROR_INTERNET_MIXED_SECURITY`: UInt = 12041u;
public const val `ERROR_INTERNET_NAME_NOT_RESOLVED`: UInt = 12007u;
public const val `ERROR_INTERNET_NEED_MSN_SSPI_PKG`: UInt = 12173u;
public const val `ERROR_INTERNET_NEED_UI`: UInt = 12034u;
public const val `ERROR_INTERNET_NOT_INITIALIZED`: UInt = 12172u;
public const val `ERROR_INTERNET_NOT_PROXY_REQUEST`: UInt = 12020u;
public const val `ERROR_INTERNET_NO_CALLBACK`: UInt = 12025u;
public const val `ERROR_INTERNET_NO_CM_CONNECTION`: UInt = 12080u;
public const val `ERROR_INTERNET_NO_CONTEXT`: UInt = 12024u;
public const val `ERROR_INTERNET_NO_DIRECT_ACCESS`: UInt = 12023u;
public const val `ERROR_INTERNET_NO_KNOWN_SERVERS`: UInt = 12903u;
public const val `ERROR_INTERNET_NO_NEW_CONTAINERS`: UInt = 12051u;
public const val `ERROR_INTERNET_NO_PING_SUPPORT`: UInt = 12905u;
public const val `ERROR_INTERNET_OFFLINE`: UInt = 12163u;
public const val `ERROR_INTERNET_OPERATION_CANCELLED`: UInt = 12017u;
public const val `ERROR_INTERNET_OPTION_NOT_SETTABLE`: UInt = 12011u;
public const val `ERROR_INTERNET_OUT_OF_HANDLES`: UInt = 12001u;
public const val `ERROR_INTERNET_PING_FAILED`: UInt = 12904u;
public const val `ERROR_INTERNET_POST_IS_NON_SECURE`: UInt = 12043u;
public const val `ERROR_INTERNET_PROTOCOL_NOT_FOUND`: UInt = 12008u;
public const val `ERROR_INTERNET_PROXY_ALERT`: UInt = 12061u;
public const val `ERROR_INTERNET_PROXY_SERVER_UNREACHABLE`: UInt = 12165u;
public const val `ERROR_INTERNET_REDIRECT_SCHEME_CHANGE`: UInt = 12048u;
public const val `ERROR_INTERNET_REGISTRY_VALUE_NOT_FOUND`: UInt = 12021u;
public const val `ERROR_INTERNET_REQUEST_PENDING`: UInt = 12026u;
public const val `ERROR_INTERNET_RETRY_DIALOG`: UInt = 12050u;
public const val `ERROR_INTERNET_SECURE_FAILURE_PROXY`: UInt = 12188u;
public const val `ERROR_INTERNET_SECURITY_CHANNEL_ERROR`: UInt = 12157u;
public const val `ERROR_INTERNET_SEC_CERT_CN_INVALID`: UInt = 12038u;
public const val `ERROR_INTERNET_SEC_CERT_DATE_INVALID`: UInt = 12037u;
public const val `ERROR_INTERNET_SEC_CERT_ERRORS`: UInt = 12055u;
public const val `ERROR_INTERNET_SEC_CERT_NO_REV`: UInt = 12056u;
public const val `ERROR_INTERNET_SEC_CERT_REVOKED`: UInt = 12170u;
public const val `ERROR_INTERNET_SEC_CERT_REV_FAILED`: UInt = 12057u;
public const val `ERROR_INTERNET_SEC_CERT_WEAK_SIGNATURE`: UInt = 12062u;
public const val `ERROR_INTERNET_SEC_INVALID_CERT`: UInt = 12169u;
public const val `ERROR_INTERNET_SERVER_UNREACHABLE`: UInt = 12164u;
public const val `ERROR_INTERNET_SHUTDOWN`: UInt = 12012u;
public const val `ERROR_INTERNET_SOURCE_PORT_IN_USE`: UInt = 12058u;
public const val `ERROR_INTERNET_TCPIP_NOT_INSTALLED`: UInt = 12159u;
public const val `ERROR_INTERNET_TIMEOUT`: UInt = 12002u;
public const val `ERROR_INTERNET_UNABLE_TO_CACHE_FILE`: UInt = 12158u;
public const val `ERROR_INTERNET_UNABLE_TO_DOWNLOAD_SCRIPT`: UInt = 12167u;
public const val `ERROR_INTERNET_UNRECOGNIZED_SCHEME`: UInt = 12006u;
public const val `FLAGS_ERROR_UI_FILTER_FOR_ERRORS`: UInt = 1u;
public const val `FLAGS_ERROR_UI_FLAGS_CHANGE_OPTIONS`: UInt = 2u;
public const val `FLAGS_ERROR_UI_FLAGS_GENERATE_DATA`: UInt = 4u;
public const val `FLAGS_ERROR_UI_FLAGS_NO_UI`: UInt = 8u;
public const val `FLAGS_ERROR_UI_SERIALIZE_DIALOGS`: UInt = 16u;
public const val `FLAGS_ERROR_UI_SHOW_IDN_HOSTNAME`: UInt = 32u;
public const val `FLAG_ICC_FORCE_CONNECTION`: UInt = 1u;
public typealias `FORTCMD` = Int;
public const val `FORTCMD_CHG_PERSONALITY`: `FORTCMD` = 3;
public const val `FORTCMD_LOGOFF`: `FORTCMD` = 2;
public const val `FORTCMD_LOGON`: `FORTCMD` = 1;
public typealias `FORTSTAT` = Int;
public const val `FORTSTAT_INSTALLED`: `FORTSTAT` = 1;
public const val `FORTSTAT_LOGGEDON`: `FORTSTAT` = 2;
public typealias `FTP_FLAGS` = UInt;
public const val `FTP_TRANSFER_TYPE_ASCII`: `FTP_FLAGS` = 1u;
public const val `FTP_TRANSFER_TYPE_BINARY`: `FTP_FLAGS` = 2u;
public const val `FTP_TRANSFER_TYPE_UNKNOWN`: `FTP_FLAGS` = 0u;
// UNSUPPORTED Rust 708:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GOPHER_ABSTRACT_ATTRIBUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("Abstract");

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GOPHER_ABSTRACT_ATTRIBUTE_TYPE` (
    public var `ShortAbstract`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `AbstractFile`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
)
// UNSUPPORTED Rust 715:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for GOPHER_ABSTRACT_ATTRIBUTE_TYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 720:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GOPHER_ABSTRACT_CATEGORY: windows_sys::core::PCWSTR = windows_sys::core::w!("+ABSTRACT");

// UNSUPPORTED Rust 721:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GOPHER_ADMIN_ATTRIBUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("Admin");

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GOPHER_ADMIN_ATTRIBUTE_TYPE` (
    public var `Comment`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `EmailAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
)
// UNSUPPORTED Rust 728:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for GOPHER_ADMIN_ATTRIBUTE_TYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 733:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GOPHER_ADMIN_CATEGORY: windows_sys::core::PCWSTR = windows_sys::core::w!("+ADMIN");

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GOPHER_ASK_ATTRIBUTE_TYPE` (
    public var `QuestionType`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `QuestionText`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
)
// UNSUPPORTED Rust 740:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for GOPHER_ASK_ATTRIBUTE_TYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `GOPHER_ATTRIBUTE_ENUMERATOR` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`GOPHER_ATTRIBUTE_TYPE`>?, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
public const val `GOPHER_ATTRIBUTE_ID_ABSTRACT`: UInt = 2882325526u;
public const val `GOPHER_ATTRIBUTE_ID_ADMIN`: UInt = 2882325514u;
public const val `GOPHER_ATTRIBUTE_ID_ALL`: UInt = 2882325513u;
public const val `GOPHER_ATTRIBUTE_ID_BASE`: UInt = 2882325504u;
public const val `GOPHER_ATTRIBUTE_ID_GEOG`: UInt = 2882325522u;
public const val `GOPHER_ATTRIBUTE_ID_LOCATION`: UInt = 2882325521u;
public const val `GOPHER_ATTRIBUTE_ID_MOD_DATE`: UInt = 2882325515u;
public const val `GOPHER_ATTRIBUTE_ID_ORG`: UInt = 2882325520u;
public const val `GOPHER_ATTRIBUTE_ID_PROVIDER`: UInt = 2882325524u;
public const val `GOPHER_ATTRIBUTE_ID_RANGE`: UInt = 2882325518u;
public const val `GOPHER_ATTRIBUTE_ID_SCORE`: UInt = 2882325517u;
public const val `GOPHER_ATTRIBUTE_ID_SITE`: UInt = 2882325519u;
public const val `GOPHER_ATTRIBUTE_ID_TIMEZONE`: UInt = 2882325523u;
public const val `GOPHER_ATTRIBUTE_ID_TREEWALK`: UInt = 2882325528u;
public const val `GOPHER_ATTRIBUTE_ID_TTL`: UInt = 2882325516u;
public const val `GOPHER_ATTRIBUTE_ID_UNKNOWN`: UInt = 2882325529u;
public const val `GOPHER_ATTRIBUTE_ID_VERSION`: UInt = 2882325525u;
public const val `GOPHER_ATTRIBUTE_ID_VIEW`: UInt = 2882325527u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GOPHER_ATTRIBUTE_TYPE` (
    public var `CategoryId`: UInt,
    public var `AttributeId`: UInt,
    public var `AttributeType`: `GOPHER_ATTRIBUTE_TYPE_0`,
)
// UNSUPPORTED Rust 771:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for GOPHER_ATTRIBUTE_TYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 776:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union GOPHER_ATTRIBUTE_TYPE_0 {
//     pub Admin: GOPHER_ADMIN_ATTRIBUTE_TYPE,
//     pub ModDate: GOPHER_MOD_DATE_ATTRIBUTE_TYPE,
//     pub Ttl: GOPHER_TTL_ATTRIBUTE_TYPE,
//     pub Score: GOPHER_SCORE_ATTRIBUTE_TYPE,
//     pub ScoreRange: GOPHER_SCORE_RANGE_ATTRIBUTE_TYPE,
//     pub Site: GOPHER_SITE_ATTRIBUTE_TYPE,
//     pub Organization: GOPHER_ORGANIZATION_ATTRIBUTE_TYPE,
//     pub Location: GOPHER_LOCATION_ATTRIBUTE_TYPE,
//     pub GeographicalLocation: GOPHER_GEOGRAPHICAL_LOCATION_ATTRIBUTE_TYPE,
//     pub TimeZone: GOPHER_TIMEZONE_ATTRIBUTE_TYPE,
//     pub Provider: GOPHER_PROVIDER_ATTRIBUTE_TYPE,
//     pub Version: GOPHER_VERSION_ATTRIBUTE_TYPE,
//     pub Abstract: GOPHER_ABSTRACT_ATTRIBUTE_TYPE,
//     pub View: GOPHER_VIEW_ATTRIBUTE_TYPE,
//     pub Veronica: GOPHER_VERONICA_ATTRIBUTE_TYPE,
//     pub Ask: GOPHER_ASK_ATTRIBUTE_TYPE,
//     pub Unknown: GOPHER_UNKNOWN_ATTRIBUTE_TYPE,
// }

// UNSUPPORTED Rust 797:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for GOPHER_ATTRIBUTE_TYPE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `GOPHER_CATEGORY_ID_ABSTRACT`: UInt = 2882325509u;
public const val `GOPHER_CATEGORY_ID_ADMIN`: UInt = 2882325507u;
public const val `GOPHER_CATEGORY_ID_ALL`: UInt = 2882325505u;
public const val `GOPHER_CATEGORY_ID_ASK`: UInt = 2882325511u;
public const val `GOPHER_CATEGORY_ID_INFO`: UInt = 2882325506u;
public const val `GOPHER_CATEGORY_ID_UNKNOWN`: UInt = 2882325512u;
public const val `GOPHER_CATEGORY_ID_VERONICA`: UInt = 2882325510u;
public const val `GOPHER_CATEGORY_ID_VIEWS`: UInt = 2882325508u;
// UNSUPPORTED Rust 810:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GOPHER_FIND_DATAA {
//     pub DisplayString: [i8; 129],
//     pub GopherType: GOPHER_TYPE,
//     pub SizeLow: u32,
//     pub SizeHigh: u32,
//     pub LastModificationTime: super::super::Foundation::FILETIME,
//     pub Locator: [i8; 654],
// }

// UNSUPPORTED Rust 820:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for GOPHER_FIND_DATAA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 825:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GOPHER_FIND_DATAW {
//     pub DisplayString: [u16; 129],
//     pub GopherType: GOPHER_TYPE,
//     pub SizeLow: u32,
//     pub SizeHigh: u32,
//     pub LastModificationTime: super::super::Foundation::FILETIME,
//     pub Locator: [u16; 654],
// }

// UNSUPPORTED Rust 835:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for GOPHER_FIND_DATAW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GOPHER_GEOGRAPHICAL_LOCATION_ATTRIBUTE_TYPE` (
    public var `DegreesNorth`: Int,
    public var `MinutesNorth`: Int,
    public var `SecondsNorth`: Int,
    public var `DegreesEast`: Int,
    public var `MinutesEast`: Int,
    public var `SecondsEast`: Int,
)
// UNSUPPORTED Rust 850:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GOPHER_GEOG_ATTRIBUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("Geog");

// UNSUPPORTED Rust 851:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GOPHER_INFO_CATEGORY: windows_sys::core::PCWSTR = windows_sys::core::w!("+INFO");

// UNSUPPORTED Rust 852:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GOPHER_LOCATION_ATTRIBUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("Loc");

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GOPHER_LOCATION_ATTRIBUTE_TYPE` (
    public var `Location`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
)
// UNSUPPORTED Rust 858:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for GOPHER_LOCATION_ATTRIBUTE_TYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 863:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GOPHER_MOD_DATE_ATTRIBUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("Mod-Date");

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GOPHER_MOD_DATE_ATTRIBUTE_TYPE` (
    public var `DateAndTime`: `super`.`super`.`Foundation`.`FILETIME`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GOPHER_ORGANIZATION_ATTRIBUTE_TYPE` (
    public var `Organization`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
)
// UNSUPPORTED Rust 874:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for GOPHER_ORGANIZATION_ATTRIBUTE_TYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 879:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GOPHER_ORG_ATTRIBUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("Org");

// UNSUPPORTED Rust 880:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GOPHER_PROVIDER_ATTRIBUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("Provider");

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GOPHER_PROVIDER_ATTRIBUTE_TYPE` (
    public var `Provider`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
)
// UNSUPPORTED Rust 886:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for GOPHER_PROVIDER_ATTRIBUTE_TYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 891:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GOPHER_RANGE_ATTRIBUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("Score-range");

// UNSUPPORTED Rust 892:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GOPHER_SCORE_ATTRIBUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("Score");

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GOPHER_SCORE_ATTRIBUTE_TYPE` (
    public var `Score`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GOPHER_SCORE_RANGE_ATTRIBUTE_TYPE` (
    public var `LowerBound`: Int,
    public var `UpperBound`: Int,
)
// UNSUPPORTED Rust 904:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GOPHER_SITE_ATTRIBUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("Site");

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GOPHER_SITE_ATTRIBUTE_TYPE` (
    public var `Site`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
)
// UNSUPPORTED Rust 910:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for GOPHER_SITE_ATTRIBUTE_TYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 915:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GOPHER_TIMEZONE_ATTRIBUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("TZ");

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GOPHER_TIMEZONE_ATTRIBUTE_TYPE` (
    public var `Zone`: Int,
)
// UNSUPPORTED Rust 921:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GOPHER_TREEWALK_ATTRIBUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("treewalk");

// UNSUPPORTED Rust 922:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GOPHER_TTL_ATTRIBUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("TTL");

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GOPHER_TTL_ATTRIBUTE_TYPE` (
    public var `Ttl`: UInt,
)
public typealias `GOPHER_TYPE` = UInt;
public const val `GOPHER_TYPE_ASK`: `GOPHER_TYPE` = 1073741824u;
public const val `GOPHER_TYPE_BINARY`: `GOPHER_TYPE` = 512u;
public const val `GOPHER_TYPE_BITMAP`: `GOPHER_TYPE` = 16384u;
public const val `GOPHER_TYPE_CALENDAR`: `GOPHER_TYPE` = 524288u;
public const val `GOPHER_TYPE_CSO`: `GOPHER_TYPE` = 4u;
public const val `GOPHER_TYPE_DIRECTORY`: `GOPHER_TYPE` = 2u;
public const val `GOPHER_TYPE_DOS_ARCHIVE`: `GOPHER_TYPE` = 32u;
public const val `GOPHER_TYPE_ERROR`: `GOPHER_TYPE` = 8u;
public const val `GOPHER_TYPE_GIF`: `GOPHER_TYPE` = 4096u;
public const val `GOPHER_TYPE_GOPHER_PLUS`: `GOPHER_TYPE` = 2147483648u;
public const val `GOPHER_TYPE_HTML`: `GOPHER_TYPE` = 131072u;
public const val `GOPHER_TYPE_IMAGE`: `GOPHER_TYPE` = 8192u;
public const val `GOPHER_TYPE_INDEX_SERVER`: `GOPHER_TYPE` = 128u;
public const val `GOPHER_TYPE_INLINE`: `GOPHER_TYPE` = 1048576u;
public const val `GOPHER_TYPE_MAC_BINHEX`: `GOPHER_TYPE` = 16u;
public const val `GOPHER_TYPE_MOVIE`: `GOPHER_TYPE` = 32768u;
public const val `GOPHER_TYPE_PDF`: `GOPHER_TYPE` = 262144u;
public const val `GOPHER_TYPE_REDUNDANT`: `GOPHER_TYPE` = 1024u;
public const val `GOPHER_TYPE_SOUND`: `GOPHER_TYPE` = 65536u;
public const val `GOPHER_TYPE_TELNET`: `GOPHER_TYPE` = 256u;
public const val `GOPHER_TYPE_TEXT_FILE`: `GOPHER_TYPE` = 1u;
public const val `GOPHER_TYPE_TN3270`: `GOPHER_TYPE` = 2048u;
public const val `GOPHER_TYPE_UNIX_UUENCODED`: `GOPHER_TYPE` = 64u;
public const val `GOPHER_TYPE_UNKNOWN`: `GOPHER_TYPE` = 536870912u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GOPHER_UNKNOWN_ATTRIBUTE_TYPE` (
    public var `Text`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
)
// UNSUPPORTED Rust 958:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for GOPHER_UNKNOWN_ATTRIBUTE_TYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GOPHER_VERONICA_ATTRIBUTE_TYPE` (
    public var `TreeWalk`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 968:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GOPHER_VERONICA_CATEGORY: windows_sys::core::PCWSTR = windows_sys::core::w!("+VERONICA");

// UNSUPPORTED Rust 969:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GOPHER_VERSION_ATTRIBUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("Version");

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GOPHER_VERSION_ATTRIBUTE_TYPE` (
    public var `Version`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
)
// UNSUPPORTED Rust 975:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for GOPHER_VERSION_ATTRIBUTE_TYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 980:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GOPHER_VIEWS_CATEGORY: windows_sys::core::PCWSTR = windows_sys::core::w!("+VIEWS");

// UNSUPPORTED Rust 981:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GOPHER_VIEW_ATTRIBUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("View");

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GOPHER_VIEW_ATTRIBUTE_TYPE` (
    public var `ContentType`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `Language`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `Size`: UInt,
)
// UNSUPPORTED Rust 989:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for GOPHER_VIEW_ATTRIBUTE_TYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `GROUPNAME_MAX_LENGTH`: UInt = 120u;
public const val `GROUP_OWNER_STORAGE_SIZE`: UInt = 4u;
public const val `HSR_ASYNC`: UInt = 1u;
public const val `HSR_CHUNKED`: UInt = 32u;
public const val `HSR_DOWNLOAD`: UInt = 16u;
public const val `HSR_INITIATE`: UInt = 8u;
public const val `HSR_SYNC`: UInt = 4u;
public const val `HSR_USE_CONTEXT`: UInt = 8u;
public const val `HTTP_1_1_CACHE_ENTRY`: UInt = 64u;
public typealias `HTTP_ADDREQ_FLAG` = UInt;
public const val `HTTP_ADDREQ_FLAGS_MASK`: UInt = 4294901760u;
public const val `HTTP_ADDREQ_FLAG_ADD`: `HTTP_ADDREQ_FLAG` = 536870912u;
public const val `HTTP_ADDREQ_FLAG_ADD_IF_NEW`: `HTTP_ADDREQ_FLAG` = 268435456u;
public const val `HTTP_ADDREQ_FLAG_ALLOW_EMPTY_VALUES`: UInt = 67108864u;
public const val `HTTP_ADDREQ_FLAG_COALESCE`: `HTTP_ADDREQ_FLAG` = 1073741824u;
public const val `HTTP_ADDREQ_FLAG_COALESCE_WITH_COMMA`: `HTTP_ADDREQ_FLAG` = 1073741824u;
public const val `HTTP_ADDREQ_FLAG_COALESCE_WITH_SEMICOLON`: `HTTP_ADDREQ_FLAG` = 16777216u;
public const val `HTTP_ADDREQ_FLAG_REPLACE`: `HTTP_ADDREQ_FLAG` = 2147483648u;
public const val `HTTP_ADDREQ_FLAG_RESPONSE_HEADERS`: UInt = 33554432u;
public const val `HTTP_ADDREQ_INDEX_MASK`: UInt = 65535u;
public const val `HTTP_COOKIES_SAME_SITE_LEVEL_CROSS_SITE`: UInt = 3u;
public const val `HTTP_COOKIES_SAME_SITE_LEVEL_CROSS_SITE_LAX`: UInt = 2u;
public const val `HTTP_COOKIES_SAME_SITE_LEVEL_MAX`: UInt = 3u;
public const val `HTTP_COOKIES_SAME_SITE_LEVEL_SAME_SITE`: UInt = 1u;
public const val `HTTP_COOKIES_SAME_SITE_LEVEL_UNKNOWN`: UInt = 0u;
public const val `HTTP_MAJOR_VERSION`: UInt = 1u;
public const val `HTTP_MINOR_VERSION`: UInt = 0u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HTTP_POLICY_EXTENSION_INIT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`HTTP_POLICY_EXTENSION_VERSION`, `HTTP_POLICY_EXTENSION_TYPE`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HTTP_POLICY_EXTENSION_SHUTDOWN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`HTTP_POLICY_EXTENSION_TYPE`) -> UInt>>>;
public typealias `HTTP_POLICY_EXTENSION_TYPE` = Int;
public typealias `HTTP_POLICY_EXTENSION_VERSION` = Int;
public const val `HTTP_PROTOCOL_FLAG_HTTP2`: UInt = 2u;
public const val `HTTP_PROTOCOL_MASK`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_PUSH_NOTIFICATION_STATUS` (
    public var `ChannelStatusValid`: `windows_sys`.`core`.`BOOL`,
    public var `ChannelStatus`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_PUSH_TRANSPORT_SETTING` (
    public var `TransportSettingId`: `windows_sys`.`core`.`GUID`,
    public var `BrokerEventId`: `windows_sys`.`core`.`GUID`,
)
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HTTP_PUSH_WAIT_HANDLE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
public typealias `HTTP_PUSH_WAIT_TYPE` = Int;
public const val `HTTP_QUERY_ACCEPT`: UInt = 24u;
public const val `HTTP_QUERY_ACCEPT_CHARSET`: UInt = 25u;
public const val `HTTP_QUERY_ACCEPT_ENCODING`: UInt = 26u;
public const val `HTTP_QUERY_ACCEPT_LANGUAGE`: UInt = 27u;
public const val `HTTP_QUERY_ACCEPT_RANGES`: UInt = 42u;
public const val `HTTP_QUERY_AGE`: UInt = 48u;
public const val `HTTP_QUERY_ALLOW`: UInt = 7u;
public const val `HTTP_QUERY_AUTHENTICATION_INFO`: UInt = 76u;
public const val `HTTP_QUERY_AUTHORIZATION`: UInt = 28u;
public const val `HTTP_QUERY_CACHE_CONTROL`: UInt = 49u;
public const val `HTTP_QUERY_CONNECTION`: UInt = 23u;
public const val `HTTP_QUERY_CONTENT_BASE`: UInt = 50u;
public const val `HTTP_QUERY_CONTENT_DESCRIPTION`: UInt = 4u;
public const val `HTTP_QUERY_CONTENT_DISPOSITION`: UInt = 47u;
public const val `HTTP_QUERY_CONTENT_ENCODING`: UInt = 29u;
public const val `HTTP_QUERY_CONTENT_ID`: UInt = 3u;
public const val `HTTP_QUERY_CONTENT_LANGUAGE`: UInt = 6u;
public const val `HTTP_QUERY_CONTENT_LENGTH`: UInt = 5u;
public const val `HTTP_QUERY_CONTENT_LOCATION`: UInt = 51u;
public const val `HTTP_QUERY_CONTENT_MD5`: UInt = 52u;
public const val `HTTP_QUERY_CONTENT_RANGE`: UInt = 53u;
public const val `HTTP_QUERY_CONTENT_TRANSFER_ENCODING`: UInt = 2u;
public const val `HTTP_QUERY_CONTENT_TYPE`: UInt = 1u;
public const val `HTTP_QUERY_COOKIE`: UInt = 44u;
public const val `HTTP_QUERY_COST`: UInt = 15u;
public const val `HTTP_QUERY_CUSTOM`: UInt = 65535u;
public const val `HTTP_QUERY_DATE`: UInt = 9u;
public const val `HTTP_QUERY_DEFAULT_STYLE`: UInt = 84u;
public const val `HTTP_QUERY_DERIVED_FROM`: UInt = 14u;
public const val `HTTP_QUERY_DO_NOT_TRACK`: UInt = 88u;
public const val `HTTP_QUERY_ECHO_HEADERS`: UInt = 73u;
public const val `HTTP_QUERY_ECHO_HEADERS_CRLF`: UInt = 74u;
public const val `HTTP_QUERY_ECHO_REPLY`: UInt = 72u;
public const val `HTTP_QUERY_ECHO_REQUEST`: UInt = 71u;
public const val `HTTP_QUERY_ETAG`: UInt = 54u;
public const val `HTTP_QUERY_EXPECT`: UInt = 68u;
public const val `HTTP_QUERY_EXPIRES`: UInt = 10u;
public const val `HTTP_QUERY_FLAG_COALESCE`: UInt = 268435456u;
public const val `HTTP_QUERY_FLAG_COALESCE_WITH_COMMA`: UInt = 67108864u;
public const val `HTTP_QUERY_FLAG_NUMBER`: UInt = 536870912u;
public const val `HTTP_QUERY_FLAG_NUMBER64`: UInt = 134217728u;
public const val `HTTP_QUERY_FLAG_REQUEST_HEADERS`: UInt = 2147483648u;
public const val `HTTP_QUERY_FLAG_SYSTEMTIME`: UInt = 1073741824u;
public const val `HTTP_QUERY_FORWARDED`: UInt = 30u;
public const val `HTTP_QUERY_FROM`: UInt = 31u;
public const val `HTTP_QUERY_HOST`: UInt = 55u;
public const val `HTTP_QUERY_HTTP2_SETTINGS`: UInt = 90u;
public const val `HTTP_QUERY_IF_MATCH`: UInt = 56u;
public const val `HTTP_QUERY_IF_MODIFIED_SINCE`: UInt = 32u;
public const val `HTTP_QUERY_IF_NONE_MATCH`: UInt = 57u;
public const val `HTTP_QUERY_IF_RANGE`: UInt = 58u;
public const val `HTTP_QUERY_IF_UNMODIFIED_SINCE`: UInt = 59u;
public const val `HTTP_QUERY_INCLUDE_REFERER_TOKEN_BINDING_ID`: UInt = 93u;
public const val `HTTP_QUERY_INCLUDE_REFERRED_TOKEN_BINDING_ID`: UInt = 93u;
public const val `HTTP_QUERY_KEEP_ALIVE`: UInt = 89u;
public const val `HTTP_QUERY_LAST_MODIFIED`: UInt = 11u;
public const val `HTTP_QUERY_LINK`: UInt = 16u;
public const val `HTTP_QUERY_LOCATION`: UInt = 33u;
public const val `HTTP_QUERY_MAX`: UInt = 95u;
public const val `HTTP_QUERY_MAX_FORWARDS`: UInt = 60u;
public const val `HTTP_QUERY_MESSAGE_ID`: UInt = 12u;
public const val `HTTP_QUERY_MIME_VERSION`: UInt = 0u;
public const val `HTTP_QUERY_ORIG_URI`: UInt = 34u;
public const val `HTTP_QUERY_P3P`: UInt = 80u;
public const val `HTTP_QUERY_PASSPORT_CONFIG`: UInt = 78u;
public const val `HTTP_QUERY_PASSPORT_URLS`: UInt = 77u;
public const val `HTTP_QUERY_PRAGMA`: UInt = 17u;
public const val `HTTP_QUERY_PROXY_AUTHENTICATE`: UInt = 41u;
public const val `HTTP_QUERY_PROXY_AUTHORIZATION`: UInt = 61u;
public const val `HTTP_QUERY_PROXY_CONNECTION`: UInt = 69u;
public const val `HTTP_QUERY_PROXY_SUPPORT`: UInt = 75u;
public const val `HTTP_QUERY_PUBLIC`: UInt = 8u;
public const val `HTTP_QUERY_PUBLIC_KEY_PINS`: UInt = 94u;
public const val `HTTP_QUERY_PUBLIC_KEY_PINS_REPORT_ONLY`: UInt = 95u;
public const val `HTTP_QUERY_RANGE`: UInt = 62u;
public const val `HTTP_QUERY_RAW_HEADERS`: UInt = 21u;
public const val `HTTP_QUERY_RAW_HEADERS_CRLF`: UInt = 22u;
public const val `HTTP_QUERY_REFERER`: UInt = 35u;
public const val `HTTP_QUERY_REFRESH`: UInt = 46u;
public const val `HTTP_QUERY_REQUEST_METHOD`: UInt = 45u;
public const val `HTTP_QUERY_RETRY_AFTER`: UInt = 36u;
public const val `HTTP_QUERY_SERVER`: UInt = 37u;
public const val `HTTP_QUERY_SET_COOKIE`: UInt = 43u;
public const val `HTTP_QUERY_SET_COOKIE2`: UInt = 87u;
public const val `HTTP_QUERY_STATUS_CODE`: UInt = 19u;
public const val `HTTP_QUERY_STATUS_TEXT`: UInt = 20u;
public const val `HTTP_QUERY_STRICT_TRANSPORT_SECURITY`: UInt = 91u;
public const val `HTTP_QUERY_TITLE`: UInt = 38u;
public const val `HTTP_QUERY_TOKEN_BINDING`: UInt = 92u;
public const val `HTTP_QUERY_TRANSFER_ENCODING`: UInt = 63u;
public const val `HTTP_QUERY_TRANSLATE`: UInt = 82u;
public const val `HTTP_QUERY_UNLESS_MODIFIED_SINCE`: UInt = 70u;
public const val `HTTP_QUERY_UPGRADE`: UInt = 64u;
public const val `HTTP_QUERY_URI`: UInt = 13u;
public const val `HTTP_QUERY_USER_AGENT`: UInt = 39u;
public const val `HTTP_QUERY_VARY`: UInt = 65u;
public const val `HTTP_QUERY_VERSION`: UInt = 18u;
public const val `HTTP_QUERY_VIA`: UInt = 66u;
public const val `HTTP_QUERY_WARNING`: UInt = 67u;
public const val `HTTP_QUERY_WWW_AUTHENTICATE`: UInt = 40u;
public const val `HTTP_QUERY_X_CONTENT_TYPE_OPTIONS`: UInt = 79u;
public const val `HTTP_QUERY_X_FRAME_OPTIONS`: UInt = 85u;
public const val `HTTP_QUERY_X_P2P_PEERDIST`: UInt = 81u;
public const val `HTTP_QUERY_X_UA_COMPATIBLE`: UInt = 83u;
public const val `HTTP_QUERY_X_XSS_PROTECTION`: UInt = 86u;
// UNSUPPORTED Rust 1146:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_REQUEST_TIMES {
//     pub cTimes: u32,
//     pub rgTimes: [u64; 32],
// }

// UNSUPPORTED Rust 1152:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_REQUEST_TIMES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HTTP_STATUS_MISDIRECTED_REQUEST`: UInt = 421u;
// UNSUPPORTED Rust 1158:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const HTTP_VERSIONA: windows_sys::core::PCSTR = windows_sys::core::s!("HTTP/1.0");

// UNSUPPORTED Rust 1159:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const HTTP_VERSIONW: windows_sys::core::PCWSTR = windows_sys::core::w!("HTTP/1.0");

public const val `HTTP_WEB_SOCKET_ABORTED_CLOSE_STATUS`: `HTTP_WEB_SOCKET_CLOSE_STATUS` = 1006;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_WEB_SOCKET_ASYNC_RESULT` (
    public var `AsyncResult`: `INTERNET_ASYNC_RESULT`,
    public var `Operation`: `HTTP_WEB_SOCKET_OPERATION`,
    public var `BufferType`: `HTTP_WEB_SOCKET_BUFFER_TYPE`,
    public var `dwBytesTransferred`: UInt,
)
public const val `HTTP_WEB_SOCKET_BINARY_FRAGMENT_TYPE`: `HTTP_WEB_SOCKET_BUFFER_TYPE` = 1;
public const val `HTTP_WEB_SOCKET_BINARY_MESSAGE_TYPE`: `HTTP_WEB_SOCKET_BUFFER_TYPE` = 0;
public typealias `HTTP_WEB_SOCKET_BUFFER_TYPE` = Int;
public const val `HTTP_WEB_SOCKET_CLOSE_OPERATION`: `HTTP_WEB_SOCKET_OPERATION` = 2;
public typealias `HTTP_WEB_SOCKET_CLOSE_STATUS` = Int;
public const val `HTTP_WEB_SOCKET_CLOSE_TYPE`: `HTTP_WEB_SOCKET_BUFFER_TYPE` = 4;
public const val `HTTP_WEB_SOCKET_EMPTY_CLOSE_STATUS`: `HTTP_WEB_SOCKET_CLOSE_STATUS` = 1005;
public const val `HTTP_WEB_SOCKET_ENDPOINT_TERMINATED_CLOSE_STATUS`: `HTTP_WEB_SOCKET_CLOSE_STATUS` = 1001;
public const val `HTTP_WEB_SOCKET_INVALID_DATA_TYPE_CLOSE_STATUS`: `HTTP_WEB_SOCKET_CLOSE_STATUS` = 1003;
public const val `HTTP_WEB_SOCKET_INVALID_PAYLOAD_CLOSE_STATUS`: `HTTP_WEB_SOCKET_CLOSE_STATUS` = 1007;
public const val `HTTP_WEB_SOCKET_MAX_CLOSE_REASON_LENGTH`: UInt = 123u;
public const val `HTTP_WEB_SOCKET_MESSAGE_TOO_BIG_CLOSE_STATUS`: `HTTP_WEB_SOCKET_CLOSE_STATUS` = 1009;
public const val `HTTP_WEB_SOCKET_MIN_KEEPALIVE_VALUE`: UInt = 10000u;
public typealias `HTTP_WEB_SOCKET_OPERATION` = Int;
public const val `HTTP_WEB_SOCKET_PING_TYPE`: `HTTP_WEB_SOCKET_BUFFER_TYPE` = 5;
public const val `HTTP_WEB_SOCKET_POLICY_VIOLATION_CLOSE_STATUS`: `HTTP_WEB_SOCKET_CLOSE_STATUS` = 1008;
public const val `HTTP_WEB_SOCKET_PROTOCOL_ERROR_CLOSE_STATUS`: `HTTP_WEB_SOCKET_CLOSE_STATUS` = 1002;
public const val `HTTP_WEB_SOCKET_RECEIVE_OPERATION`: `HTTP_WEB_SOCKET_OPERATION` = 1;
public const val `HTTP_WEB_SOCKET_SECURE_HANDSHAKE_ERROR_CLOSE_STATUS`: `HTTP_WEB_SOCKET_CLOSE_STATUS` = 1015;
public const val `HTTP_WEB_SOCKET_SEND_OPERATION`: `HTTP_WEB_SOCKET_OPERATION` = 0;
public const val `HTTP_WEB_SOCKET_SERVER_ERROR_CLOSE_STATUS`: `HTTP_WEB_SOCKET_CLOSE_STATUS` = 1011;
public const val `HTTP_WEB_SOCKET_SHUTDOWN_OPERATION`: `HTTP_WEB_SOCKET_OPERATION` = 3;
public const val `HTTP_WEB_SOCKET_SUCCESS_CLOSE_STATUS`: `HTTP_WEB_SOCKET_CLOSE_STATUS` = 1000;
public const val `HTTP_WEB_SOCKET_UNSUPPORTED_EXTENSIONS_CLOSE_STATUS`: `HTTP_WEB_SOCKET_CLOSE_STATUS` = 1010;
public const val `HTTP_WEB_SOCKET_UTF8_FRAGMENT_TYPE`: `HTTP_WEB_SOCKET_BUFFER_TYPE` = 3;
public const val `HTTP_WEB_SOCKET_UTF8_MESSAGE_TYPE`: `HTTP_WEB_SOCKET_BUFFER_TYPE` = 2;
public const val `HttpPushWaitEnableComplete`: `HTTP_PUSH_WAIT_TYPE` = 0;
public const val `HttpPushWaitReceiveComplete`: `HTTP_PUSH_WAIT_TYPE` = 1;
public const val `HttpPushWaitSendComplete`: `HTTP_PUSH_WAIT_TYPE` = 2;
public const val `HttpRequestTimeMax`: `REQUEST_TIMES` = 32;
public const val `ICU_USERNAME`: UInt = 1073741824u;
public const val `IDENTITY_CACHE_ENTRY`: UInt = 2147483648u;
public const val `IDSI_FLAG_KEEP_ALIVE`: UInt = 1u;
public const val `IDSI_FLAG_PROXY`: UInt = 4u;
public const val `IDSI_FLAG_SECURE`: UInt = 2u;
public const val `IDSI_FLAG_TUNNEL`: UInt = 8u;
public const val `IMMUTABLE_CACHE_ENTRY`: UInt = 524288u;
public const val `INSTALLED_CACHE_ENTRY`: UInt = 268435456u;
public const val `INTERENT_GOONLINE_MASK`: UInt = 3u;
public const val `INTERENT_GOONLINE_NOPROMPT`: UInt = 2u;
public const val `INTERENT_GOONLINE_REFRESH`: UInt = 1u;
public typealias `INTERNET_ACCESS_TYPE` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `INTERNET_ASYNC_RESULT` (
    public var `dwResult`: ULong,
    public var `dwError`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `INTERNET_AUTH_NOTIFY_DATA` (
    public var `cbStruct`: UInt,
    public var `dwOptions`: UInt,
    public var `pfnNotify`: `PFN_AUTH_NOTIFY`,
    public var `dwContext`: ULong,
)
public const val `INTERNET_AUTH_SCHEME_BASIC`: UInt = 0u;
public const val `INTERNET_AUTH_SCHEME_DIGEST`: UInt = 1u;
public const val `INTERNET_AUTH_SCHEME_KERBEROS`: UInt = 3u;
public const val `INTERNET_AUTH_SCHEME_NEGOTIATE`: UInt = 4u;
public const val `INTERNET_AUTH_SCHEME_NTLM`: UInt = 2u;
public const val `INTERNET_AUTH_SCHEME_PASSPORT`: UInt = 5u;
public const val `INTERNET_AUTH_SCHEME_UNKNOWN`: UInt = 6u;
public typealias `INTERNET_AUTODIAL` = UInt;
public const val `INTERNET_AUTODIAL_FAILIFSECURITYCHECK`: `INTERNET_AUTODIAL` = 4u;
public const val `INTERNET_AUTODIAL_FORCE_ONLINE`: `INTERNET_AUTODIAL` = 1u;
public const val `INTERNET_AUTODIAL_FORCE_UNATTENDED`: `INTERNET_AUTODIAL` = 2u;
public const val `INTERNET_AUTODIAL_OVERRIDE_NET_PRESENT`: `INTERNET_AUTODIAL` = 8u;
public const val `INTERNET_AUTOPROXY_INIT_DEFAULT`: UInt = 1u;
public const val `INTERNET_AUTOPROXY_INIT_DOWNLOADSYNC`: UInt = 2u;
public const val `INTERNET_AUTOPROXY_INIT_ONLYQUERY`: UInt = 8u;
public const val `INTERNET_AUTOPROXY_INIT_QUERYSTATE`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `INTERNET_BUFFERSA` (
    public var `dwStructSize`: UInt,
    public var `Next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_BUFFERSA`>?,
    public var `lpcszHeader`: `windows_sys`.`core`.`PCSTR`,
    public var `dwHeadersLength`: UInt,
    public var `dwHeadersTotal`: UInt,
    public var `lpvBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwBufferLength`: UInt,
    public var `dwBufferTotal`: UInt,
    public var `dwOffsetLow`: UInt,
    public var `dwOffsetHigh`: UInt,
)
// UNSUPPORTED Rust 1255:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INTERNET_BUFFERSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `INTERNET_BUFFERSW` (
    public var `dwStructSize`: UInt,
    public var `Next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_BUFFERSW`>?,
    public var `lpcszHeader`: `windows_sys`.`core`.`PCWSTR`,
    public var `dwHeadersLength`: UInt,
    public var `dwHeadersTotal`: UInt,
    public var `lpvBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwBufferLength`: UInt,
    public var `dwBufferTotal`: UInt,
    public var `dwOffsetLow`: UInt,
    public var `dwOffsetHigh`: UInt,
)
// UNSUPPORTED Rust 1274:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INTERNET_BUFFERSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `INTERNET_CACHE_CONFIG_INFOA` (
    public var `dwStructSize`: UInt,
    public var `dwContainer`: UInt,
    public var `dwQuota`: UInt,
    public var `dwReserved4`: UInt,
    public var `fPerUser`: `windows_sys`.`core`.`BOOL`,
    public var `dwSyncMode`: UInt,
    public var `dwNumCachePaths`: UInt,
    public var `Anonymous`: `INTERNET_CACHE_CONFIG_INFOA_0`,
    public var `dwNormalUsage`: UInt,
    public var `dwExemptUsage`: UInt,
)
// UNSUPPORTED Rust 1293:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INTERNET_CACHE_CONFIG_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1298:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union INTERNET_CACHE_CONFIG_INFOA_0 {
//     pub Anonymous: INTERNET_CACHE_CONFIG_INFOA_0_0,
//     pub CachePaths: [INTERNET_CACHE_CONFIG_PATH_ENTRYA; 1],
// }

// UNSUPPORTED Rust 1304:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INTERNET_CACHE_CONFIG_INFOA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1309:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INTERNET_CACHE_CONFIG_INFOA_0_0 {
//     pub CachePath: [i8; 260],
//     pub dwCacheSize: u32,
// }

// UNSUPPORTED Rust 1315:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INTERNET_CACHE_CONFIG_INFOA_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `INTERNET_CACHE_CONFIG_INFOW` (
    public var `dwStructSize`: UInt,
    public var `dwContainer`: UInt,
    public var `dwQuota`: UInt,
    public var `dwReserved4`: UInt,
    public var `fPerUser`: `windows_sys`.`core`.`BOOL`,
    public var `dwSyncMode`: UInt,
    public var `dwNumCachePaths`: UInt,
    public var `Anonymous`: `INTERNET_CACHE_CONFIG_INFOW_0`,
    public var `dwNormalUsage`: UInt,
    public var `dwExemptUsage`: UInt,
)
// UNSUPPORTED Rust 1334:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INTERNET_CACHE_CONFIG_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1339:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union INTERNET_CACHE_CONFIG_INFOW_0 {
//     pub Anonymous: INTERNET_CACHE_CONFIG_INFOW_0_0,
//     pub CachePaths: [INTERNET_CACHE_CONFIG_PATH_ENTRYW; 1],
// }

// UNSUPPORTED Rust 1345:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INTERNET_CACHE_CONFIG_INFOW_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1350:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INTERNET_CACHE_CONFIG_INFOW_0_0 {
//     pub CachePath: [u16; 260],
//     pub dwCacheSize: u32,
// }

// UNSUPPORTED Rust 1356:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INTERNET_CACHE_CONFIG_INFOW_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1361:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INTERNET_CACHE_CONFIG_PATH_ENTRYA {
//     pub CachePath: [i8; 260],
//     pub dwCacheSize: u32,
// }

// UNSUPPORTED Rust 1367:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INTERNET_CACHE_CONFIG_PATH_ENTRYA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1372:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INTERNET_CACHE_CONFIG_PATH_ENTRYW {
//     pub CachePath: [u16; 260],
//     pub dwCacheSize: u32,
// }

// UNSUPPORTED Rust 1378:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INTERNET_CACHE_CONFIG_PATH_ENTRYW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `INTERNET_CACHE_CONTAINER_AUTODELETE`: UInt = 2u;
public const val `INTERNET_CACHE_CONTAINER_BLOOM_FILTER`: UInt = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `INTERNET_CACHE_CONTAINER_INFOA` (
    public var `dwCacheVersion`: UInt,
    public var `lpszName`: `windows_sys`.`core`.`PSTR`,
    public var `lpszCachePrefix`: `windows_sys`.`core`.`PSTR`,
    public var `lpszVolumeLabel`: `windows_sys`.`core`.`PSTR`,
    public var `lpszVolumeTitle`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 1394:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INTERNET_CACHE_CONTAINER_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `INTERNET_CACHE_CONTAINER_INFOW` (
    public var `dwCacheVersion`: UInt,
    public var `lpszName`: `windows_sys`.`core`.`PWSTR`,
    public var `lpszCachePrefix`: `windows_sys`.`core`.`PWSTR`,
    public var `lpszVolumeLabel`: `windows_sys`.`core`.`PWSTR`,
    public var `lpszVolumeTitle`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 1408:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INTERNET_CACHE_CONTAINER_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `INTERNET_CACHE_CONTAINER_MAP_ENABLED`: UInt = 16u;
public const val `INTERNET_CACHE_CONTAINER_NODESKTOPINIT`: UInt = 8u;
public const val `INTERNET_CACHE_CONTAINER_NOSUBDIRS`: UInt = 1u;
public const val `INTERNET_CACHE_CONTAINER_RESERVED1`: UInt = 4u;
public const val `INTERNET_CACHE_CONTAINER_SHARE_READ`: UInt = 256u;
public const val `INTERNET_CACHE_CONTAINER_SHARE_READ_WRITE`: UInt = 768u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `INTERNET_CACHE_ENTRY_INFOA` (
    public var `dwStructSize`: UInt,
    public var `lpszSourceUrlName`: `windows_sys`.`core`.`PSTR`,
    public var `lpszLocalFileName`: `windows_sys`.`core`.`PSTR`,
    public var `CacheEntryType`: UInt,
    public var `dwUseCount`: UInt,
    public var `dwHitRate`: UInt,
    public var `dwSizeLow`: UInt,
    public var `dwSizeHigh`: UInt,
    public var `LastModifiedTime`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `ExpireTime`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `LastAccessTime`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `LastSyncTime`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `lpHeaderInfo`: `windows_sys`.`core`.`PSTR`,
    public var `dwHeaderInfoSize`: UInt,
    public var `lpszFileExtension`: `windows_sys`.`core`.`PSTR`,
    public var `Anonymous`: `INTERNET_CACHE_ENTRY_INFOA_0`,
)
// UNSUPPORTED Rust 1439:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INTERNET_CACHE_ENTRY_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1444:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union INTERNET_CACHE_ENTRY_INFOA_0 {
//     pub dwReserved: u32,
//     pub dwExemptDelta: u32,
// }

// UNSUPPORTED Rust 1450:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INTERNET_CACHE_ENTRY_INFOA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `INTERNET_CACHE_ENTRY_INFOW` (
    public var `dwStructSize`: UInt,
    public var `lpszSourceUrlName`: `windows_sys`.`core`.`PWSTR`,
    public var `lpszLocalFileName`: `windows_sys`.`core`.`PWSTR`,
    public var `CacheEntryType`: UInt,
    public var `dwUseCount`: UInt,
    public var `dwHitRate`: UInt,
    public var `dwSizeLow`: UInt,
    public var `dwSizeHigh`: UInt,
    public var `LastModifiedTime`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `ExpireTime`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `LastAccessTime`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `LastSyncTime`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `lpHeaderInfo`: `windows_sys`.`core`.`PWSTR`,
    public var `dwHeaderInfoSize`: UInt,
    public var `lpszFileExtension`: `windows_sys`.`core`.`PWSTR`,
    public var `Anonymous`: `INTERNET_CACHE_ENTRY_INFOW_0`,
)
// UNSUPPORTED Rust 1475:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INTERNET_CACHE_ENTRY_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1480:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union INTERNET_CACHE_ENTRY_INFOW_0 {
//     pub dwReserved: u32,
//     pub dwExemptDelta: u32,
// }

// UNSUPPORTED Rust 1486:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INTERNET_CACHE_ENTRY_INFOW_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `INTERNET_CACHE_FLAG_ADD_FILENAME_ONLY`: UInt = 2048u;
public const val `INTERNET_CACHE_FLAG_ALLOW_COLLISIONS`: UInt = 256u;
public const val `INTERNET_CACHE_FLAG_ENTRY_OR_MAPPING`: UInt = 1024u;
public const val `INTERNET_CACHE_FLAG_GET_STRUCT_ONLY`: UInt = 4096u;
public const val `INTERNET_CACHE_FLAG_INSTALLED_ENTRY`: UInt = 512u;
public const val `INTERNET_CACHE_GROUP_ADD`: UInt = 0u;
// UNSUPPORTED Rust 1497:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INTERNET_CACHE_GROUP_INFOA {
//     pub dwGroupSize: u32,
//     pub dwGroupFlags: u32,
//     pub dwGroupType: u32,
//     pub dwDiskUsage: u32,
//     pub dwDiskQuota: u32,
//     pub dwOwnerStorage: [u32; 4],
//     pub szGroupName: [i8; 120],
// }

// UNSUPPORTED Rust 1508:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INTERNET_CACHE_GROUP_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1513:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INTERNET_CACHE_GROUP_INFOW {
//     pub dwGroupSize: u32,
//     pub dwGroupFlags: u32,
//     pub dwGroupType: u32,
//     pub dwDiskUsage: u32,
//     pub dwDiskQuota: u32,
//     pub dwOwnerStorage: [u32; 4],
//     pub szGroupName: [u16; 120],
// }

// UNSUPPORTED Rust 1524:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INTERNET_CACHE_GROUP_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `INTERNET_CACHE_GROUP_REMOVE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `INTERNET_CACHE_TIMESTAMPS` (
    public var `ftExpires`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `ftLastModified`: `super`.`super`.`Foundation`.`FILETIME`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `INTERNET_CALLBACK_COOKIE` (
    public var `pcwszName`: `windows_sys`.`core`.`PCWSTR`,
    public var `pcwszValue`: `windows_sys`.`core`.`PCWSTR`,
    public var `pcwszDomain`: `windows_sys`.`core`.`PCWSTR`,
    public var `pcwszPath`: `windows_sys`.`core`.`PCWSTR`,
    public var `ftExpires`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `dwFlags`: UInt,
)
// UNSUPPORTED Rust 1546:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INTERNET_CALLBACK_COOKIE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `INTERNET_CERTIFICATE_INFO` (
    public var `ftExpiry`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `ftStart`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `lpszSubjectInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `lpszIssuerInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `lpszProtocolName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `lpszSignatureAlgName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `lpszEncryptionAlgName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `dwKeySize`: UInt,
)
// UNSUPPORTED Rust 1563:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INTERNET_CERTIFICATE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `INTERNET_CONNECTED_INFO` (
    public var `dwConnectedState`: `INTERNET_STATE`,
    public var `dwFlags`: UInt,
)
public typealias `INTERNET_CONNECTION` = UInt;
public const val `INTERNET_CONNECTION_CONFIGURED`: `INTERNET_CONNECTION` = 64u;
public const val `INTERNET_CONNECTION_LAN`: `INTERNET_CONNECTION` = 2u;
public const val `INTERNET_CONNECTION_MODEM`: `INTERNET_CONNECTION` = 1u;
public const val `INTERNET_CONNECTION_MODEM_BUSY`: `INTERNET_CONNECTION` = 8u;
public const val `INTERNET_CONNECTION_OFFLINE`: `INTERNET_CONNECTION` = 32u;
public const val `INTERNET_CONNECTION_PROXY`: `INTERNET_CONNECTION` = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `INTERNET_COOKIE` (
    public var `cbSize`: UInt,
    public var `pszName`: `windows_sys`.`core`.`PSTR`,
    public var `pszData`: `windows_sys`.`core`.`PSTR`,
    public var `pszDomain`: `windows_sys`.`core`.`PSTR`,
    public var `pszPath`: `windows_sys`.`core`.`PSTR`,
    public var `pftExpires`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?,
    public var `dwFlags`: UInt,
    public var `pszUrl`: `windows_sys`.`core`.`PSTR`,
    public var `pszP3PPolicy`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 1594:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INTERNET_COOKIE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `INTERNET_COOKIE2` (
    public var `pwszName`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszValue`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszDomain`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszPath`: `windows_sys`.`core`.`PWSTR`,
    public var `dwFlags`: UInt,
    public var `ftExpires`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `fExpiresSet`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 1610:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INTERNET_COOKIE2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `INTERNET_COOKIE_ALL_COOKIES`: UInt = 536870912u;
public const val `INTERNET_COOKIE_APPLY_HOST_ONLY`: UInt = 32768u;
public const val `INTERNET_COOKIE_APPLY_P3P`: UInt = 128u;
public const val `INTERNET_COOKIE_ECTX_3RDPARTY`: UInt = 2147483648u;
public const val `INTERNET_COOKIE_EDGE_COOKIES`: UInt = 262144u;
public const val `INTERNET_COOKIE_EVALUATE_P3P`: UInt = 64u;
public typealias `INTERNET_COOKIE_FLAGS` = UInt;
public const val `INTERNET_COOKIE_HOST_ONLY`: UInt = 16384u;
public const val `INTERNET_COOKIE_HOST_ONLY_APPLIED`: UInt = 524288u;
public const val `INTERNET_COOKIE_HTTPONLY`: `INTERNET_COOKIE_FLAGS` = 8192u;
public const val `INTERNET_COOKIE_IE6`: UInt = 1024u;
public const val `INTERNET_COOKIE_IS_LEGACY`: UInt = 2048u;
public const val `INTERNET_COOKIE_IS_RESTRICTED`: UInt = 512u;
public const val `INTERNET_COOKIE_IS_SECURE`: UInt = 1u;
public const val `INTERNET_COOKIE_IS_SESSION`: UInt = 2u;
public const val `INTERNET_COOKIE_NON_SCRIPT`: UInt = 4096u;
public const val `INTERNET_COOKIE_NO_CALLBACK`: UInt = 1073741824u;
public const val `INTERNET_COOKIE_P3P_ENABLED`: UInt = 256u;
public const val `INTERNET_COOKIE_PERSISTENT_HOST_ONLY`: UInt = 65536u;
public const val `INTERNET_COOKIE_PROMPT_REQUIRED`: UInt = 32u;
public const val `INTERNET_COOKIE_RESTRICTED_ZONE`: UInt = 131072u;
public const val `INTERNET_COOKIE_SAME_SITE_LAX`: UInt = 2097152u;
public const val `INTERNET_COOKIE_SAME_SITE_LEVEL_CROSS_SITE`: UInt = 4194304u;
public const val `INTERNET_COOKIE_SAME_SITE_STRICT`: UInt = 1048576u;
public const val `INTERNET_COOKIE_THIRD_PARTY`: `INTERNET_COOKIE_FLAGS` = 16u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `INTERNET_CREDENTIALS` (
    public var `lpcwszHostName`: `windows_sys`.`core`.`PCWSTR`,
    public var `dwPort`: UInt,
    public var `dwScheme`: UInt,
    public var `lpcwszUrl`: `windows_sys`.`core`.`PCWSTR`,
    public var `lpcwszRealm`: `windows_sys`.`core`.`PCWSTR`,
    public var `fAuthIdentity`: `windows_sys`.`core`.`BOOL`,
    public var `Anonymous`: `INTERNET_CREDENTIALS_0`,
)
// UNSUPPORTED Rust 1651:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INTERNET_CREDENTIALS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1656:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union INTERNET_CREDENTIALS_0 {
//     pub Anonymous: INTERNET_CREDENTIALS_0_0,
//     pub pAuthIdentityOpaque: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1662:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INTERNET_CREDENTIALS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `INTERNET_CREDENTIALS_0_0` (
    public var `lpcwszUserName`: `windows_sys`.`core`.`PCWSTR`,
    public var `lpcwszPassword`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 1673:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INTERNET_CREDENTIALS_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `INTERNET_CUSTOMDIAL_CAN_HANGUP`: UInt = 4u;
public const val `INTERNET_CUSTOMDIAL_CONNECT`: UInt = 0u;
public const val `INTERNET_CUSTOMDIAL_DISCONNECT`: UInt = 2u;
public const val `INTERNET_CUSTOMDIAL_SAFE_FOR_UNATTENDED`: UInt = 1u;
public const val `INTERNET_CUSTOMDIAL_SHOWOFFLINE`: UInt = 4u;
public const val `INTERNET_CUSTOMDIAL_UNATTENDED`: UInt = 1u;
public const val `INTERNET_CUSTOMDIAL_WILL_SUPPLY_STATE`: UInt = 2u;
public const val `INTERNET_DEFAULT_FTP_PORT`: UShort = 21u;
public const val `INTERNET_DEFAULT_GOPHER_PORT`: UShort = 70u;
public const val `INTERNET_DEFAULT_SOCKS_PORT`: UShort = 1080u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `INTERNET_DIAGNOSTIC_SOCKET_INFO` (
    public var `Socket`: ULong,
    public var `SourcePort`: UInt,
    public var `DestPort`: UInt,
    public var `Flags`: UInt,
)
public const val `INTERNET_DIALSTATE_DISCONNECTED`: UInt = 1u;
public const val `INTERNET_DIAL_FORCE_PROMPT`: UInt = 8192u;
public const val `INTERNET_DIAL_SHOW_OFFLINE`: UInt = 16384u;
public const val `INTERNET_DIAL_UNATTENDED`: UInt = 32768u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `INTERNET_DOWNLOAD_MODE_HANDLE` (
    public var `pcwszFileName`: `windows_sys`.`core`.`PCWSTR`,
    public var `phFile`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?,
)
// UNSUPPORTED Rust 1706:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INTERNET_DOWNLOAD_MODE_HANDLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `INTERNET_END_BROWSER_SESSION_DATA` (
    public var `lpBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwBufferLength`: UInt,
)
// UNSUPPORTED Rust 1717:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INTERNET_END_BROWSER_SESSION_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `INTERNET_ERROR_BASE`: UInt = 12000u;
public const val `INTERNET_ERROR_LAST`: UInt = 12192u;
public const val `INTERNET_ERROR_MASK_COMBINED_SEC_CERT`: UInt = 2u;
public const val `INTERNET_ERROR_MASK_INSERT_CDROM`: UInt = 1u;
public const val `INTERNET_ERROR_MASK_LOGIN_FAILURE_DISPLAY_ENTITY_BODY`: UInt = 8u;
public const val `INTERNET_ERROR_MASK_NEED_MSN_SSPI_PKG`: UInt = 4u;
public const val `INTERNET_FIRST_OPTION`: UInt = 1u;
public const val `INTERNET_FLAG_ASYNC`: UInt = 268435456u;
public const val `INTERNET_FLAG_BGUPDATE`: UInt = 8u;
public const val `INTERNET_FLAG_CACHE_ASYNC`: UInt = 128u;
public const val `INTERNET_FLAG_CACHE_IF_NET_FAIL`: UInt = 65536u;
public const val `INTERNET_FLAG_DONT_CACHE`: UInt = 67108864u;
public const val `INTERNET_FLAG_EXISTING_CONNECT`: UInt = 536870912u;
public const val `INTERNET_FLAG_FORMS_SUBMIT`: UInt = 64u;
public const val `INTERNET_FLAG_FROM_CACHE`: UInt = 16777216u;
public const val `INTERNET_FLAG_FTP_FOLDER_VIEW`: UInt = 4u;
public const val `INTERNET_FLAG_FWD_BACK`: UInt = 32u;
public const val `INTERNET_FLAG_HYPERLINK`: UInt = 1024u;
public const val `INTERNET_FLAG_IDN_DIRECT`: UInt = 1u;
public const val `INTERNET_FLAG_IDN_PROXY`: UInt = 2u;
public const val `INTERNET_FLAG_IGNORE_CERT_CN_INVALID`: UInt = 4096u;
public const val `INTERNET_FLAG_IGNORE_CERT_DATE_INVALID`: UInt = 8192u;
public const val `INTERNET_FLAG_IGNORE_REDIRECT_TO_HTTP`: UInt = 32768u;
public const val `INTERNET_FLAG_IGNORE_REDIRECT_TO_HTTPS`: UInt = 16384u;
public const val `INTERNET_FLAG_KEEP_CONNECTION`: UInt = 4194304u;
public const val `INTERNET_FLAG_MAKE_PERSISTENT`: UInt = 33554432u;
public const val `INTERNET_FLAG_MUST_CACHE_REQUEST`: UInt = 16u;
public const val `INTERNET_FLAG_NEED_FILE`: UInt = 16u;
public const val `INTERNET_FLAG_NO_AUTH`: UInt = 262144u;
public const val `INTERNET_FLAG_NO_AUTO_REDIRECT`: UInt = 2097152u;
public const val `INTERNET_FLAG_NO_CACHE_WRITE`: UInt = 67108864u;
public const val `INTERNET_FLAG_NO_COOKIES`: UInt = 524288u;
public const val `INTERNET_FLAG_NO_UI`: UInt = 512u;
public const val `INTERNET_FLAG_OFFLINE`: UInt = 16777216u;
public const val `INTERNET_FLAG_PASSIVE`: UInt = 134217728u;
public const val `INTERNET_FLAG_PRAGMA_NOCACHE`: UInt = 256u;
public const val `INTERNET_FLAG_RAW_DATA`: UInt = 1073741824u;
public const val `INTERNET_FLAG_READ_PREFETCH`: UInt = 1048576u;
public const val `INTERNET_FLAG_RELOAD`: UInt = 2147483648u;
public const val `INTERNET_FLAG_RESTRICTED_ZONE`: `INTERNET_COOKIE_FLAGS` = 131072u;
public const val `INTERNET_FLAG_RESYNCHRONIZE`: UInt = 2048u;
public const val `INTERNET_FLAG_SECURE`: UInt = 8388608u;
public const val `INTERNET_FLAG_TRANSFER_ASCII`: `FTP_FLAGS` = 1u;
public const val `INTERNET_FLAG_TRANSFER_BINARY`: `FTP_FLAGS` = 2u;
public const val `INTERNET_GLOBAL_CALLBACK_DETECTING_PROXY`: UInt = 2u;
public const val `INTERNET_GLOBAL_CALLBACK_SENDING_HTTP_HEADERS`: UInt = 1u;
public const val `INTERNET_HANDLE_TYPE_CONNECT_FTP`: UInt = 2u;
public const val `INTERNET_HANDLE_TYPE_CONNECT_GOPHER`: UInt = 3u;
public const val `INTERNET_HANDLE_TYPE_CONNECT_HTTP`: UInt = 4u;
public const val `INTERNET_HANDLE_TYPE_FILE_REQUEST`: UInt = 14u;
public const val `INTERNET_HANDLE_TYPE_FTP_FILE`: UInt = 7u;
public const val `INTERNET_HANDLE_TYPE_FTP_FILE_HTML`: UInt = 8u;
public const val `INTERNET_HANDLE_TYPE_FTP_FIND`: UInt = 5u;
public const val `INTERNET_HANDLE_TYPE_FTP_FIND_HTML`: UInt = 6u;
public const val `INTERNET_HANDLE_TYPE_GOPHER_FILE`: UInt = 11u;
public const val `INTERNET_HANDLE_TYPE_GOPHER_FILE_HTML`: UInt = 12u;
public const val `INTERNET_HANDLE_TYPE_GOPHER_FIND`: UInt = 9u;
public const val `INTERNET_HANDLE_TYPE_GOPHER_FIND_HTML`: UInt = 10u;
public const val `INTERNET_HANDLE_TYPE_HTTP_REQUEST`: UInt = 13u;
public const val `INTERNET_HANDLE_TYPE_INTERNET`: UInt = 1u;
public const val `INTERNET_IDENTITY_FLAG_CLEAR_CONTENT`: UInt = 32u;
public const val `INTERNET_IDENTITY_FLAG_CLEAR_COOKIES`: UInt = 8u;
public const val `INTERNET_IDENTITY_FLAG_CLEAR_DATA`: UInt = 4u;
public const val `INTERNET_IDENTITY_FLAG_CLEAR_HISTORY`: UInt = 16u;
public const val `INTERNET_IDENTITY_FLAG_PRIVATE_CACHE`: UInt = 1u;
public const val `INTERNET_IDENTITY_FLAG_SHARED_CACHE`: UInt = 2u;
public const val `INTERNET_INTERNAL_ERROR_BASE`: UInt = 12900u;
public const val `INTERNET_INVALID_PORT_NUMBER`: UInt = 0u;
public const val `INTERNET_KEEP_ALIVE_DISABLED`: UInt = 0u;
public const val `INTERNET_KEEP_ALIVE_ENABLED`: UInt = 1u;
public const val `INTERNET_KEEP_ALIVE_UNKNOWN`: UInt = 4294967295u;
public const val `INTERNET_LAST_OPTION`: UInt = 193u;
public const val `INTERNET_LAST_OPTION_INTERNAL`: UInt = 193u;
public const val `INTERNET_MAX_HOST_NAME_LENGTH`: UInt = 256u;
public const val `INTERNET_MAX_PASSWORD_LENGTH`: UInt = 128u;
public const val `INTERNET_MAX_PORT_NUMBER_LENGTH`: UInt = 5u;
public const val `INTERNET_MAX_PORT_NUMBER_VALUE`: UInt = 65535u;
public const val `INTERNET_MAX_USER_NAME_LENGTH`: UInt = 128u;
public const val `INTERNET_NO_CALLBACK`: UInt = 0u;
public const val `INTERNET_OPEN_TYPE_DIRECT`: `INTERNET_ACCESS_TYPE` = 1u;
public const val `INTERNET_OPEN_TYPE_PRECONFIG`: `INTERNET_ACCESS_TYPE` = 0u;
public const val `INTERNET_OPEN_TYPE_PRECONFIG_WITH_NO_AUTOPROXY`: UInt = 4u;
public const val `INTERNET_OPEN_TYPE_PROXY`: `INTERNET_ACCESS_TYPE` = 3u;
public const val `INTERNET_OPTION_ACTIVATE_WORKER_THREADS`: UInt = 92u;
public const val `INTERNET_OPTION_ACTIVITY_ID`: UInt = 185u;
public const val `INTERNET_OPTION_ALLOW_FAILED_CONNECT_CONTENT`: UInt = 110u;
public const val `INTERNET_OPTION_ALLOW_INSECURE_FALLBACK`: UInt = 161u;
public const val `INTERNET_OPTION_ALTER_IDENTITY`: UInt = 80u;
public const val `INTERNET_OPTION_APP_CACHE`: UInt = 130u;
public const val `INTERNET_OPTION_ASYNC`: UInt = 30u;
public const val `INTERNET_OPTION_ASYNC_ID`: UInt = 15u;
public const val `INTERNET_OPTION_ASYNC_PRIORITY`: UInt = 16u;
public const val `INTERNET_OPTION_AUTH_FLAGS`: UInt = 85u;
public const val `INTERNET_OPTION_AUTH_SCHEME_SELECTED`: UInt = 183u;
public const val `INTERNET_OPTION_AUTODIAL_CONNECTION`: UInt = 83u;
public const val `INTERNET_OPTION_AUTODIAL_HWND`: UInt = 112u;
public const val `INTERNET_OPTION_AUTODIAL_MODE`: UInt = 82u;
public const val `INTERNET_OPTION_BACKGROUND_CONNECTIONS`: UInt = 121u;
public const val `INTERNET_OPTION_BYPASS_EDITED_ENTRY`: UInt = 64u;
public const val `INTERNET_OPTION_CACHE_ENTRY_EXTRA_DATA`: UInt = 139u;
public const val `INTERNET_OPTION_CACHE_PARTITION`: UInt = 111u;
public const val `INTERNET_OPTION_CACHE_STREAM_HANDLE`: UInt = 27u;
public const val `INTERNET_OPTION_CACHE_TIMESTAMPS`: UInt = 69u;
public const val `INTERNET_OPTION_CALLBACK`: UInt = 1u;
public const val `INTERNET_OPTION_CALLBACK_FILTER`: UInt = 54u;
public const val `INTERNET_OPTION_CALLER_MODULE`: UInt = 192u;
public const val `INTERNET_OPTION_CANCEL_CACHE_WRITE`: UInt = 182u;
public const val `INTERNET_OPTION_CERT_ERROR_FLAGS`: UInt = 98u;
public const val `INTERNET_OPTION_CHUNK_ENCODE_REQUEST`: UInt = 150u;
public const val `INTERNET_OPTION_CLIENT_CERT_CONTEXT`: UInt = 84u;
public const val `INTERNET_OPTION_CLIENT_CERT_ISSUER_LIST`: UInt = 153u;
public const val `INTERNET_OPTION_CM_HANDLE_COPY_REF`: UInt = 118u;
public const val `INTERNET_OPTION_CODEPAGE`: UInt = 68u;
public const val `INTERNET_OPTION_CODEPAGE_EXTRA`: UInt = 101u;
public const val `INTERNET_OPTION_CODEPAGE_PATH`: UInt = 100u;
public const val `INTERNET_OPTION_COMPRESSED_CONTENT_LENGTH`: UInt = 147u;
public const val `INTERNET_OPTION_CONNECTED_STATE`: UInt = 50u;
public const val `INTERNET_OPTION_CONNECTION_FILTER`: UInt = 162u;
public const val `INTERNET_OPTION_CONNECTION_INFO`: UInt = 120u;
public const val `INTERNET_OPTION_CONNECT_BACKOFF`: UInt = 4u;
public const val `INTERNET_OPTION_CONNECT_LIMIT`: UInt = 46u;
public const val `INTERNET_OPTION_CONNECT_RETRIES`: UInt = 3u;
public const val `INTERNET_OPTION_CONNECT_TIME`: UInt = 55u;
public const val `INTERNET_OPTION_CONNECT_TIMEOUT`: UInt = 2u;
public const val `INTERNET_OPTION_CONTEXT_VALUE`: UInt = 45u;
public const val `INTERNET_OPTION_CONTEXT_VALUE_OLD`: UInt = 10u;
public const val `INTERNET_OPTION_CONTROL_RECEIVE_TIMEOUT`: UInt = 6u;
public const val `INTERNET_OPTION_CONTROL_SEND_TIMEOUT`: UInt = 5u;
public const val `INTERNET_OPTION_COOKIES_3RD_PARTY`: UInt = 86u;
public const val `INTERNET_OPTION_COOKIES_APPLY_HOST_ONLY`: UInt = 179u;
public const val `INTERNET_OPTION_COOKIES_SAME_SITE_LEVEL`: UInt = 187u;
public const val `INTERNET_OPTION_DATAFILE_EXT`: UInt = 96u;
public const val `INTERNET_OPTION_DATAFILE_NAME`: UInt = 33u;
public const val `INTERNET_OPTION_DATA_RECEIVE_TIMEOUT`: UInt = 8u;
public const val `INTERNET_OPTION_DATA_SEND_TIMEOUT`: UInt = 7u;
public const val `INTERNET_OPTION_DEPENDENCY_HANDLE`: UInt = 131u;
public const val `INTERNET_OPTION_DETECT_POST_SEND`: UInt = 71u;
public const val `INTERNET_OPTION_DIAGNOSTIC_SOCKET_INFO`: UInt = 67u;
public const val `INTERNET_OPTION_DIGEST_AUTH_UNLOAD`: UInt = 76u;
public const val `INTERNET_OPTION_DISABLE_AUTODIAL`: UInt = 70u;
public const val `INTERNET_OPTION_DISABLE_INSECURE_FALLBACK`: UInt = 160u;
public const val `INTERNET_OPTION_DISABLE_NTLM_PREAUTH`: UInt = 72u;
public const val `INTERNET_OPTION_DISABLE_PASSPORT_AUTH`: UInt = 87u;
public const val `INTERNET_OPTION_DISABLE_PROXY_LINK_LOCAL_NAME_RESOLUTION`: UInt = 190u;
public const val `INTERNET_OPTION_DISALLOW_PREMATURE_EOF`: UInt = 137u;
public const val `INTERNET_OPTION_DISCONNECTED_TIMEOUT`: UInt = 49u;
public const val `INTERNET_OPTION_DOWNLOAD_MODE`: UInt = 116u;
public const val `INTERNET_OPTION_DOWNLOAD_MODE_HANDLE`: UInt = 165u;
public const val `INTERNET_OPTION_DO_NOT_TRACK`: UInt = 123u;
public const val `INTERNET_OPTION_DUO_USED`: UInt = 149u;
public const val `INTERNET_OPTION_EDGE_COOKIES`: UInt = 166u;
public const val `INTERNET_OPTION_EDGE_COOKIES_TEMP`: UInt = 175u;
public const val `INTERNET_OPTION_EDGE_MODE`: UInt = 180u;
public const val `INTERNET_OPTION_ENABLE_DUO`: UInt = 148u;
public const val `INTERNET_OPTION_ENABLE_HEADER_CALLBACKS`: UInt = 168u;
public const val `INTERNET_OPTION_ENABLE_HTTP_PROTOCOL`: UInt = 148u;
public const val `INTERNET_OPTION_ENABLE_PASSPORT_AUTH`: UInt = 90u;
public const val `INTERNET_OPTION_ENABLE_REDIRECT_CACHE_READ`: UInt = 122u;
public const val `INTERNET_OPTION_ENABLE_TEST_SIGNING`: UInt = 189u;
public const val `INTERNET_OPTION_ENABLE_WBOEXT`: UInt = 158u;
public const val `INTERNET_OPTION_ENABLE_ZLIB_DEFLATE`: UInt = 173u;
public const val `INTERNET_OPTION_ENCODE_EXTRA`: UInt = 155u;
public const val `INTERNET_OPTION_ENCODE_FALLBACK_FOR_REDIRECT_URI`: UInt = 174u;
public const val `INTERNET_OPTION_END_BROWSER_SESSION`: UInt = 42u;
public const val `INTERNET_OPTION_ENTERPRISE_CONTEXT`: UInt = 159u;
public const val `INTERNET_OPTION_ERROR_MASK`: UInt = 62u;
public const val `INTERNET_OPTION_EXEMPT_CONNECTION_LIMIT`: UInt = 89u;
public const val `INTERNET_OPTION_EXTENDED_CALLBACKS`: UInt = 108u;
public const val `INTERNET_OPTION_EXTENDED_ERROR`: UInt = 24u;
public const val `INTERNET_OPTION_FAIL_ON_CACHE_WRITE_ERROR`: UInt = 115u;
public const val `INTERNET_OPTION_FALSE_START`: UInt = 141u;
public const val `INTERNET_OPTION_FLUSH_STATE`: UInt = 135u;
public const val `INTERNET_OPTION_FORCE_DECODE`: UInt = 178u;
public const val `INTERNET_OPTION_FROM_CACHE_TIMEOUT`: UInt = 63u;
public const val `INTERNET_OPTION_GLOBAL_CALLBACK`: UInt = 188u;
public const val `INTERNET_OPTION_HANDLE_TYPE`: UInt = 9u;
public const val `INTERNET_OPTION_HIBERNATE_INACTIVE_WORKER_THREADS`: UInt = 91u;
public const val `INTERNET_OPTION_HSTS`: UInt = 157u;
public const val `INTERNET_OPTION_HTTP_09`: UInt = 191u;
public const val `INTERNET_OPTION_HTTP_DECODING`: UInt = 65u;
public const val `INTERNET_OPTION_HTTP_PROTOCOL_USED`: UInt = 149u;
public const val `INTERNET_OPTION_HTTP_VERSION`: UInt = 59u;
public const val `INTERNET_OPTION_IDENTITY`: UInt = 78u;
public const val `INTERNET_OPTION_IDLE_STATE`: UInt = 51u;
public const val `INTERNET_OPTION_IDN`: UInt = 102u;
public const val `INTERNET_OPTION_IGNORE_CERT_ERROR_FLAGS`: UInt = 99u;
public const val `INTERNET_OPTION_IGNORE_OFFLINE`: UInt = 77u;
public const val `INTERNET_OPTION_KEEP_CONNECTION`: UInt = 22u;
public const val `INTERNET_OPTION_LINE_STATE`: UInt = 50u;
public const val `INTERNET_OPTION_LISTEN_TIMEOUT`: UInt = 11u;
public const val `INTERNET_OPTION_MAX_CONNS_PER_1_0_SERVER`: UInt = 74u;
public const val `INTERNET_OPTION_MAX_CONNS_PER_PROXY`: UInt = 103u;
public const val `INTERNET_OPTION_MAX_CONNS_PER_SERVER`: UInt = 73u;
public const val `INTERNET_OPTION_MAX_QUERY_BUFFER_SIZE`: UInt = 140u;
public const val `INTERNET_OPTION_NET_SPEED`: UInt = 61u;
public const val `INTERNET_OPTION_NOCACHE_WRITE_IN_PRIVATE`: UInt = 184u;
public const val `INTERNET_OPTION_NOTIFY_SENDING_COOKIE`: UInt = 152u;
public const val `INTERNET_OPTION_NO_HTTP_SERVER_AUTH`: UInt = 167u;
public const val `INTERNET_OPTION_OFFLINE_MODE`: UInt = 26u;
public const val `INTERNET_OPTION_OFFLINE_SEMANTICS`: UInt = 52u;
public const val `INTERNET_OPTION_OFFLINE_TIMEOUT`: UInt = 49u;
public const val `INTERNET_OPTION_OPT_IN_WEAK_SIGNATURE`: UInt = 176u;
public const val `INTERNET_OPTION_ORIGINAL_CONNECT_FLAGS`: UInt = 97u;
public const val `INTERNET_OPTION_PARENT_HANDLE`: UInt = 21u;
public const val `INTERNET_OPTION_PARSE_LINE_FOLDING`: UInt = 177u;
public const val `INTERNET_OPTION_PASSWORD`: UInt = 29u;
public const val `INTERNET_OPTION_PER_CONNECTION_OPTION`: UInt = 75u;
public const val `INTERNET_OPTION_POLICY`: UInt = 48u;
public const val `INTERNET_OPTION_PRESERVE_REFERER_ON_HTTPS_TO_HTTP_REDIRECT`: UInt = 170u;
public const val `INTERNET_OPTION_PRESERVE_REQUEST_SERVER_CREDENTIALS_ON_REDIRECT`: UInt = 169u;
public const val `INTERNET_OPTION_PROXY`: UInt = 38u;
public const val `INTERNET_OPTION_PROXY_AUTH_SCHEME`: UInt = 144u;
public const val `INTERNET_OPTION_PROXY_CREDENTIALS`: UInt = 107u;
public const val `INTERNET_OPTION_PROXY_FROM_REQUEST`: UInt = 109u;
public const val `INTERNET_OPTION_PROXY_PASSWORD`: UInt = 44u;
public const val `INTERNET_OPTION_PROXY_SETTINGS_CHANGED`: UInt = 95u;
public const val `INTERNET_OPTION_PROXY_USERNAME`: UInt = 43u;
public const val `INTERNET_OPTION_READ_BUFFER_SIZE`: UInt = 12u;
public const val `INTERNET_OPTION_RECEIVE_THROUGHPUT`: UInt = 57u;
public const val `INTERNET_OPTION_RECEIVE_TIMEOUT`: UInt = 6u;
public const val `INTERNET_OPTION_REFERER_TOKEN_BINDING_HOSTNAME`: UInt = 163u;
public const val `INTERNET_OPTION_REFRESH`: UInt = 37u;
public const val `INTERNET_OPTION_REMOVE_IDENTITY`: UInt = 79u;
public const val `INTERNET_OPTION_REQUEST_ANNOTATION`: UInt = 193u;
public const val `INTERNET_OPTION_REQUEST_ANNOTATION_MAX_LENGTH`: UInt = 64000u;
public const val `INTERNET_OPTION_REQUEST_FLAGS`: UInt = 23u;
public const val `INTERNET_OPTION_REQUEST_PRIORITY`: UInt = 58u;
public const val `INTERNET_OPTION_REQUEST_TIMES`: UInt = 186u;
public const val `INTERNET_OPTION_RESET`: UInt = 154u;
public const val `INTERNET_OPTION_RESET_URLCACHE_SESSION`: UInt = 60u;
public const val `INTERNET_OPTION_RESPONSE_RESUMABLE`: UInt = 117u;
public const val `INTERNET_OPTION_RESTORE_WORKER_THREAD_DEFAULTS`: UInt = 93u;
public const val `INTERNET_OPTION_SECONDARY_CACHE_KEY`: UInt = 53u;
public const val `INTERNET_OPTION_SECURE_FAILURE`: UInt = 151u;
public const val `INTERNET_OPTION_SECURITY_CERTIFICATE`: UInt = 35u;
public const val `INTERNET_OPTION_SECURITY_CERTIFICATE_STRUCT`: UInt = 32u;
public const val `INTERNET_OPTION_SECURITY_CONNECTION_INFO`: UInt = 66u;
public const val `INTERNET_OPTION_SECURITY_FLAGS`: UInt = 31u;
public const val `INTERNET_OPTION_SECURITY_KEY_BITNESS`: UInt = 36u;
public const val `INTERNET_OPTION_SECURITY_SELECT_CLIENT_CERT`: UInt = 47u;
public const val `INTERNET_OPTION_SEND_THROUGHPUT`: UInt = 56u;
public const val `INTERNET_OPTION_SEND_TIMEOUT`: UInt = 5u;
public const val `INTERNET_OPTION_SEND_UTF8_SERVERNAME_TO_PROXY`: UInt = 88u;
public const val `INTERNET_OPTION_SERVER_ADDRESS_INFO`: UInt = 156u;
public const val `INTERNET_OPTION_SERVER_AUTH_SCHEME`: UInt = 143u;
public const val `INTERNET_OPTION_SERVER_CERT_CHAIN_CONTEXT`: UInt = 105u;
public const val `INTERNET_OPTION_SERVER_CREDENTIALS`: UInt = 113u;
public const val `INTERNET_OPTION_SESSION_START_TIME`: UInt = 106u;
public const val `INTERNET_OPTION_SETTINGS_CHANGED`: UInt = 39u;
public const val `INTERNET_OPTION_SET_IN_PRIVATE`: UInt = 164u;
public const val `INTERNET_OPTION_SOCKET_NODELAY`: UInt = 129u;
public const val `INTERNET_OPTION_SOCKET_NOTIFICATION_IOCTL`: UInt = 138u;
public const val `INTERNET_OPTION_SOCKET_SEND_BUFFER_LENGTH`: UInt = 94u;
public const val `INTERNET_OPTION_SOURCE_PORT`: UInt = 146u;
public const val `INTERNET_OPTION_SUPPRESS_BEHAVIOR`: UInt = 81u;
public const val `INTERNET_OPTION_SUPPRESS_SERVER_AUTH`: UInt = 104u;
public const val `INTERNET_OPTION_SYNC_MODE_AUTOMATIC_SESSION_DISABLED`: UInt = 172u;
public const val `INTERNET_OPTION_TCP_FAST_OPEN`: UInt = 171u;
public const val `INTERNET_OPTION_TIMED_CONNECTION_LIMIT_BYPASS`: UInt = 133u;
public const val `INTERNET_OPTION_TOKEN_BINDING_PUBLIC_KEY`: UInt = 181u;
public const val `INTERNET_OPTION_TUNNEL_ONLY`: UInt = 145u;
public const val `INTERNET_OPTION_UNLOAD_NOTIFY_EVENT`: UInt = 128u;
public const val `INTERNET_OPTION_UPGRADE_TO_WEB_SOCKET`: UInt = 126u;
public const val `INTERNET_OPTION_URL`: UInt = 34u;
public const val `INTERNET_OPTION_USERNAME`: UInt = 28u;
public const val `INTERNET_OPTION_USER_AGENT`: UInt = 41u;
public const val `INTERNET_OPTION_USER_PASS_SERVER_ONLY`: UInt = 142u;
public const val `INTERNET_OPTION_USE_FIRST_AVAILABLE_CONNECTION`: UInt = 132u;
public const val `INTERNET_OPTION_USE_MODIFIED_HEADER_FILTER`: UInt = 124u;
public const val `INTERNET_OPTION_VERSION`: UInt = 40u;
public const val `INTERNET_OPTION_WEB_SOCKET_CLOSE_TIMEOUT`: UInt = 134u;
public const val `INTERNET_OPTION_WEB_SOCKET_KEEPALIVE_INTERVAL`: UInt = 127u;
public const val `INTERNET_OPTION_WPAD_SLEEP`: UInt = 114u;
public const val `INTERNET_OPTION_WRITE_BUFFER_SIZE`: UInt = 13u;
public const val `INTERNET_OPTION_WWA_MODE`: UInt = 125u;
public typealias `INTERNET_PER_CONN` = UInt;
public const val `INTERNET_PER_CONN_AUTOCONFIG_LAST_DETECT_TIME`: `INTERNET_PER_CONN` = 8u;
public const val `INTERNET_PER_CONN_AUTOCONFIG_LAST_DETECT_URL`: `INTERNET_PER_CONN` = 9u;
public const val `INTERNET_PER_CONN_AUTOCONFIG_RELOAD_DELAY_MINS`: `INTERNET_PER_CONN` = 7u;
public const val `INTERNET_PER_CONN_AUTOCONFIG_SECONDARY_URL`: `INTERNET_PER_CONN` = 6u;
public const val `INTERNET_PER_CONN_AUTOCONFIG_URL`: `INTERNET_PER_CONN` = 4u;
public const val `INTERNET_PER_CONN_AUTODISCOVERY_FLAGS`: `INTERNET_PER_CONN` = 5u;
public const val `INTERNET_PER_CONN_FLAGS`: `INTERNET_PER_CONN` = 1u;
public const val `INTERNET_PER_CONN_FLAGS_UI`: UInt = 10u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `INTERNET_PER_CONN_OPTIONA` (
    public var `dwOption`: `INTERNET_PER_CONN`,
    public var `Value`: `INTERNET_PER_CONN_OPTIONA_0`,
)
// UNSUPPORTED Rust 2012:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INTERNET_PER_CONN_OPTIONA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2017:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union INTERNET_PER_CONN_OPTIONA_0 {
//     pub dwValue: u32,
//     pub pszValue: windows_sys::core::PSTR,
//     pub ftValue: super::super::Foundation::FILETIME,
// }

// UNSUPPORTED Rust 2024:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INTERNET_PER_CONN_OPTIONA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `INTERNET_PER_CONN_OPTIONW` (
    public var `dwOption`: `INTERNET_PER_CONN`,
    public var `Value`: `INTERNET_PER_CONN_OPTIONW_0`,
)
// UNSUPPORTED Rust 2035:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INTERNET_PER_CONN_OPTIONW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2040:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union INTERNET_PER_CONN_OPTIONW_0 {
//     pub dwValue: u32,
//     pub pszValue: windows_sys::core::PWSTR,
//     pub ftValue: super::super::Foundation::FILETIME,
// }

// UNSUPPORTED Rust 2047:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INTERNET_PER_CONN_OPTIONW_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `INTERNET_PER_CONN_OPTION_LISTA` (
    public var `dwSize`: UInt,
    public var `pszConnection`: `windows_sys`.`core`.`PSTR`,
    public var `dwOptionCount`: UInt,
    public var `dwOptionError`: UInt,
    public var `pOptions`: /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_PER_CONN_OPTIONA`>?,
)
// UNSUPPORTED Rust 2061:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INTERNET_PER_CONN_OPTION_LISTA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `INTERNET_PER_CONN_OPTION_LISTW` (
    public var `dwSize`: UInt,
    public var `pszConnection`: `windows_sys`.`core`.`PWSTR`,
    public var `dwOptionCount`: UInt,
    public var `dwOptionError`: UInt,
    public var `pOptions`: /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERNET_PER_CONN_OPTIONW`>?,
)
// UNSUPPORTED Rust 2075:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INTERNET_PER_CONN_OPTION_LISTW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `INTERNET_PER_CONN_PROXY_BYPASS`: `INTERNET_PER_CONN` = 3u;
public const val `INTERNET_PER_CONN_PROXY_SERVER`: `INTERNET_PER_CONN` = 2u;
public const val `INTERNET_PREFETCH_ABORTED`: UInt = 2u;
public const val `INTERNET_PREFETCH_COMPLETE`: UInt = 1u;
public const val `INTERNET_PREFETCH_PROGRESS`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `INTERNET_PREFETCH_STATUS` (
    public var `dwStatus`: UInt,
    public var `dwSize`: UInt,
)
public const val `INTERNET_PRIORITY_FOREGROUND`: UInt = 1000u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `INTERNET_PROXY_INFO` (
    public var `dwAccessType`: `INTERNET_ACCESS_TYPE`,
    public var `lpszProxy`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `lpszProxyBypass`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
)
// UNSUPPORTED Rust 2099:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INTERNET_PROXY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `INTERNET_RAS_INSTALLED`: `INTERNET_CONNECTION` = 16u;
public const val `INTERNET_REQFLAG_ASYNC`: UInt = 2u;
public const val `INTERNET_REQFLAG_CACHE_WRITE_DISABLED`: UInt = 64u;
public const val `INTERNET_REQFLAG_FROM_APP_CACHE`: UInt = 256u;
public const val `INTERNET_REQFLAG_FROM_CACHE`: UInt = 1u;
public const val `INTERNET_REQFLAG_NET_TIMEOUT`: UInt = 128u;
public const val `INTERNET_REQFLAG_NO_HEADERS`: UInt = 8u;
public const val `INTERNET_REQFLAG_PASSIVE`: UInt = 16u;
public const val `INTERNET_REQFLAG_VIA_PROXY`: UInt = 4u;
public const val `INTERNET_RFC1123_BUFSIZE`: UInt = 30u;
public const val `INTERNET_RFC1123_FORMAT`: UInt = 0u;
public typealias `INTERNET_SCHEME` = Int;
public const val `INTERNET_SCHEME_DEFAULT`: `INTERNET_SCHEME` = 0;
public const val `INTERNET_SCHEME_FILE`: `INTERNET_SCHEME` = 5;
public const val `INTERNET_SCHEME_FIRST`: `INTERNET_SCHEME` = 1;
public const val `INTERNET_SCHEME_FTP`: `INTERNET_SCHEME` = 1;
public const val `INTERNET_SCHEME_GOPHER`: `INTERNET_SCHEME` = 2;
public const val `INTERNET_SCHEME_HTTP`: `INTERNET_SCHEME` = 3;
public const val `INTERNET_SCHEME_HTTPS`: `INTERNET_SCHEME` = 4;
public const val `INTERNET_SCHEME_JAVASCRIPT`: `INTERNET_SCHEME` = 9;
public const val `INTERNET_SCHEME_LAST`: `INTERNET_SCHEME` = 11;
public const val `INTERNET_SCHEME_MAILTO`: `INTERNET_SCHEME` = 7;
public const val `INTERNET_SCHEME_NEWS`: `INTERNET_SCHEME` = 6;
public const val `INTERNET_SCHEME_PARTIAL`: `INTERNET_SCHEME` = -2;
public const val `INTERNET_SCHEME_RES`: `INTERNET_SCHEME` = 11;
public const val `INTERNET_SCHEME_SOCKS`: `INTERNET_SCHEME` = 8;
public const val `INTERNET_SCHEME_UNKNOWN`: `INTERNET_SCHEME` = -1;
public const val `INTERNET_SCHEME_VBSCRIPT`: `INTERNET_SCHEME` = 10;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security_Authentication_Identity", feature = "Win32_Security_Cryptography"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `INTERNET_SECURITY_CONNECTION_INFO` (
    public var `dwSize`: UInt,
    public var `fSecure`: `windows_sys`.`core`.`BOOL`,
    public var `connectionInfo`: `super`.`super`.`Security`.`Authentication`.`Identity`.`SecPkgContext_ConnectionInfo`,
    public var `cipherInfo`: `super`.`super`.`Security`.`Authentication`.`Identity`.`SecPkgContext_CipherInfo`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security_Authentication_Identity", feature = "Win32_Security_Cryptography"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `INTERNET_SECURITY_INFO` (
    public var `dwSize`: UInt,
    public var `pCertificate`: /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`Cryptography`.`CERT_CONTEXT`>?,
    public var `pcCertChain`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`Cryptography`.`CERT_CHAIN_CONTEXT`>?,
    public var `connectionInfo`: `super`.`super`.`Security`.`Authentication`.`Identity`.`SecPkgContext_ConnectionInfo`,
    public var `cipherInfo`: `super`.`super`.`Security`.`Authentication`.`Identity`.`SecPkgContext_CipherInfo`,
    public var `pcUnverifiedCertChain`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`Cryptography`.`CERT_CHAIN_CONTEXT`>?,
    public var `channelBindingToken`: `super`.`super`.`Security`.`Authentication`.`Identity`.`SecPkgContext_Bindings`,
)
// UNSUPPORTED Rust 2153:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Security_Authentication_Identity", feature = "Win32_Security_Cryptography"))]
// impl Default for INTERNET_SECURITY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `INTERNET_SERVER_CONNECTION_STATE` (
    public var `lpcwszHostName`: `windows_sys`.`core`.`PCWSTR`,
    public var `fProxy`: `windows_sys`.`core`.`BOOL`,
    public var `dwCounter`: UInt,
    public var `dwConnectionLimit`: UInt,
    public var `dwAvailableCreates`: UInt,
    public var `dwAvailableKeepAlives`: UInt,
    public var `dwActiveConnections`: UInt,
    public var `dwWaiters`: UInt,
)
// UNSUPPORTED Rust 2171:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INTERNET_SERVER_CONNECTION_STATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `INTERNET_SERVICE_FTP`: UInt = 1u;
public const val `INTERNET_SERVICE_GOPHER`: UInt = 2u;
public const val `INTERNET_SERVICE_HTTP`: UInt = 3u;
public const val `INTERNET_SERVICE_URL`: UInt = 0u;
public typealias `INTERNET_STATE` = UInt;
public const val `INTERNET_STATE_BUSY`: `INTERNET_STATE` = 512u;
public const val `INTERNET_STATE_CONNECTED`: `INTERNET_STATE` = 1u;
public const val `INTERNET_STATE_DISCONNECTED`: `INTERNET_STATE` = 2u;
public const val `INTERNET_STATE_DISCONNECTED_BY_USER`: `INTERNET_STATE` = 16u;
public const val `INTERNET_STATE_IDLE`: `INTERNET_STATE` = 256u;
public const val `INTERNET_STATUS_CLOSING_CONNECTION`: UInt = 50u;
public const val `INTERNET_STATUS_CONNECTED_TO_SERVER`: UInt = 21u;
public const val `INTERNET_STATUS_CONNECTING_TO_SERVER`: UInt = 20u;
public const val `INTERNET_STATUS_CONNECTION_CLOSED`: UInt = 51u;
public const val `INTERNET_STATUS_COOKIE`: UInt = 430u;
public const val `INTERNET_STATUS_COOKIE_HISTORY`: UInt = 327u;
public const val `INTERNET_STATUS_COOKIE_RECEIVED`: UInt = 321u;
public const val `INTERNET_STATUS_COOKIE_SENT`: UInt = 320u;
public const val `INTERNET_STATUS_CTL_RESPONSE_RECEIVED`: UInt = 42u;
public const val `INTERNET_STATUS_DETECTING_PROXY`: UInt = 80u;
public const val `INTERNET_STATUS_END_BROWSER_SESSION`: UInt = 420u;
public const val `INTERNET_STATUS_FILTER_CLOSED`: UInt = 512u;
public const val `INTERNET_STATUS_FILTER_CLOSING`: UInt = 256u;
public const val `INTERNET_STATUS_FILTER_CONNECTED`: UInt = 8u;
public const val `INTERNET_STATUS_FILTER_CONNECTING`: UInt = 4u;
public const val `INTERNET_STATUS_FILTER_HANDLE_CLOSING`: UInt = 2048u;
public const val `INTERNET_STATUS_FILTER_HANDLE_CREATED`: UInt = 1024u;
public const val `INTERNET_STATUS_FILTER_PREFETCH`: UInt = 4096u;
public const val `INTERNET_STATUS_FILTER_RECEIVED`: UInt = 128u;
public const val `INTERNET_STATUS_FILTER_RECEIVING`: UInt = 64u;
public const val `INTERNET_STATUS_FILTER_REDIRECT`: UInt = 8192u;
public const val `INTERNET_STATUS_FILTER_RESOLVED`: UInt = 2u;
public const val `INTERNET_STATUS_FILTER_RESOLVING`: UInt = 1u;
public const val `INTERNET_STATUS_FILTER_SENDING`: UInt = 16u;
public const val `INTERNET_STATUS_FILTER_SENT`: UInt = 32u;
public const val `INTERNET_STATUS_FILTER_STATE_CHANGE`: UInt = 16384u;
public const val `INTERNET_STATUS_HANDLE_CLOSING`: UInt = 70u;
public const val `INTERNET_STATUS_HANDLE_CREATED`: UInt = 60u;
public const val `INTERNET_STATUS_INTERMEDIATE_RESPONSE`: UInt = 120u;
public const val `INTERNET_STATUS_NAME_RESOLVED`: UInt = 11u;
public const val `INTERNET_STATUS_P3P_HEADER`: UInt = 325u;
public const val `INTERNET_STATUS_P3P_POLICYREF`: UInt = 326u;
public const val `INTERNET_STATUS_PREFETCH`: UInt = 43u;
public const val `INTERNET_STATUS_PRIVACY_IMPACTED`: UInt = 324u;
public const val `INTERNET_STATUS_PROXY_CREDENTIALS`: UInt = 400u;
public const val `INTERNET_STATUS_RECEIVING_RESPONSE`: UInt = 40u;
public const val `INTERNET_STATUS_REDIRECT`: UInt = 110u;
public const val `INTERNET_STATUS_REQUEST_COMPLETE`: UInt = 100u;
public const val `INTERNET_STATUS_REQUEST_HEADERS_SET`: UInt = 329u;
public const val `INTERNET_STATUS_REQUEST_SENT`: UInt = 31u;
public const val `INTERNET_STATUS_RESOLVING_NAME`: UInt = 10u;
public const val `INTERNET_STATUS_RESPONSE_HEADERS_SET`: UInt = 330u;
public const val `INTERNET_STATUS_RESPONSE_RECEIVED`: UInt = 41u;
public const val `INTERNET_STATUS_SENDING_COOKIE`: UInt = 328u;
public const val `INTERNET_STATUS_SENDING_REQUEST`: UInt = 30u;
public const val `INTERNET_STATUS_SERVER_CONNECTION_STATE`: UInt = 410u;
public const val `INTERNET_STATUS_SERVER_CREDENTIALS`: UInt = 401u;
public const val `INTERNET_STATUS_STATE_CHANGE`: UInt = 200u;
public const val `INTERNET_STATUS_USER_INPUT_REQUIRED`: UInt = 140u;
public const val `INTERNET_SUPPRESS_COOKIE_PERSIST`: UInt = 3u;
public const val `INTERNET_SUPPRESS_COOKIE_PERSIST_RESET`: UInt = 4u;
public const val `INTERNET_SUPPRESS_COOKIE_POLICY`: UInt = 1u;
public const val `INTERNET_SUPPRESS_COOKIE_POLICY_RESET`: UInt = 2u;
public const val `INTERNET_SUPPRESS_RESET_ALL`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `INTERNET_VERSION_INFO` (
    public var `dwMajorVersion`: UInt,
    public var `dwMinorVersion`: UInt,
)
public const val `IRF_ASYNC`: UInt = 1u;
public const val `IRF_NO_WAIT`: UInt = 8u;
public const val `IRF_SYNC`: UInt = 4u;
public const val `IRF_USE_CONTEXT`: UInt = 8u;
public const val `ISO_FORCE_DISCONNECTED`: UInt = 1u;
public const val `ISO_FORCE_OFFLINE`: UInt = 1u;
public const val `ISO_GLOBAL`: UInt = 1u;
public const val `ISO_REGISTRY`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IncomingCookieState` (
    public var `cSession`: Int,
    public var `cPersistent`: Int,
    public var `cAccepted`: Int,
    public var `cLeashed`: Int,
    public var `cDowngraded`: Int,
    public var `cBlocked`: Int,
    public var `pszLocation`: `windows_sys`.`core`.`PCSTR`,
)
// UNSUPPORTED Rust 2265:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IncomingCookieState {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `InternetCookieHistory` (
    public var `fAccepted`: `windows_sys`.`core`.`BOOL`,
    public var `fLeashed`: `windows_sys`.`core`.`BOOL`,
    public var `fDowngraded`: `windows_sys`.`core`.`BOOL`,
    public var `fRejected`: `windows_sys`.`core`.`BOOL`,
)
public typealias `InternetCookieState` = Int;
// UNSUPPORTED Rust 2279:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const LOCAL_NAMESPACE_PREFIX: windows_sys::core::PCSTR = windows_sys::core::s!("Local\\");

// UNSUPPORTED Rust 2280:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const LOCAL_NAMESPACE_PREFIX_W: windows_sys::core::PCWSTR = windows_sys::core::w!("Local\\");

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPINTERNET_STATUS_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, ULong, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt) -> Unit>>>;
public const val `MAX_CACHE_ENTRY_INFO_SIZE`: UInt = 4096u;
public const val `MAX_GOPHER_ATTRIBUTE_NAME`: UInt = 128u;
public const val `MAX_GOPHER_CATEGORY_NAME`: UInt = 128u;
public const val `MAX_GOPHER_DISPLAY_TEXT`: UInt = 128u;
public const val `MAX_GOPHER_HOST_NAME`: UInt = 256u;
public const val `MAX_GOPHER_SELECTOR_TEXT`: UInt = 256u;
public const val `MIN_GOPHER_ATTRIBUTE_LENGTH`: UInt = 256u;
public const val `MUST_REVALIDATE_CACHE_ENTRY`: UInt = 256u;
public const val `MaxPrivacySettings`: UInt = 16384u;
public const val `NORMAL_CACHE_ENTRY`: UInt = 1u;
public const val `NameResolutionEnd`: `REQUEST_TIMES` = 1;
public const val `NameResolutionStart`: `REQUEST_TIMES` = 0;
public const val `OTHER_USER_CACHE_ENTRY`: UInt = 8388608u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OutgoingCookieState` (
    public var `cSent`: Int,
    public var `cSuppressed`: Int,
    public var `pszLocation`: `windows_sys`.`core`.`PCSTR`,
)
// UNSUPPORTED Rust 2302:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for OutgoingCookieState {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PENDING_DELETE_CACHE_ENTRY`: UInt = 4194304u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_AUTH_NOTIFY` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DIAL_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HWND`, `windows_sys`.`core`.`PCSTR`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> UInt>>>;
public const val `POLICY_EXTENSION_TYPE_NONE`: `HTTP_POLICY_EXTENSION_TYPE` = 0;
public const val `POLICY_EXTENSION_TYPE_WINHTTP`: `HTTP_POLICY_EXTENSION_TYPE` = 1;
public const val `POLICY_EXTENSION_TYPE_WININET`: `HTTP_POLICY_EXTENSION_TYPE` = 2;
public const val `POLICY_EXTENSION_VERSION1`: `HTTP_POLICY_EXTENSION_VERSION` = 1;
public const val `POST_CHECK_CACHE_ENTRY`: UInt = 536870912u;
public const val `POST_RESPONSE_CACHE_ENTRY`: UInt = 67108864u;
public const val `PRIVACY_IMPACTED_CACHE_ENTRY`: UInt = 33554432u;
public const val `PRIVACY_MODE_CACHE_ENTRY`: UInt = 131072u;
public const val `PRIVACY_TEMPLATE_ADVANCED`: UInt = 101u;
public const val `PRIVACY_TEMPLATE_CUSTOM`: UInt = 100u;
public const val `PRIVACY_TEMPLATE_HIGH`: UInt = 1u;
public const val `PRIVACY_TEMPLATE_LOW`: UInt = 5u;
public const val `PRIVACY_TEMPLATE_MAX`: UInt = 5u;
public const val `PRIVACY_TEMPLATE_MEDIUM`: UInt = 3u;
public const val `PRIVACY_TEMPLATE_MEDIUM_HIGH`: UInt = 2u;
public const val `PRIVACY_TEMPLATE_MEDIUM_LOW`: UInt = 4u;
public const val `PRIVACY_TEMPLATE_NO_COOKIES`: UInt = 0u;
public const val `PRIVACY_TYPE_FIRST_PARTY`: UInt = 0u;
public const val `PRIVACY_TYPE_THIRD_PARTY`: UInt = 1u;
public typealias `PROXY_AUTO_DETECT_TYPE` = UInt;
public const val `PROXY_AUTO_DETECT_TYPE_DHCP`: `PROXY_AUTO_DETECT_TYPE` = 1u;
public const val `PROXY_AUTO_DETECT_TYPE_DNS_A`: `PROXY_AUTO_DETECT_TYPE` = 2u;
public const val `PROXY_TYPE_AUTO_DETECT`: UInt = 8u;
public const val `PROXY_TYPE_AUTO_PROXY_URL`: UInt = 4u;
public const val `PROXY_TYPE_DIRECT`: UInt = 1u;
public const val `PROXY_TYPE_PROXY`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ProofOfPossessionCookieInfo` (
    public var `name`: `windows_sys`.`core`.`PWSTR`,
    public var `data`: `windows_sys`.`core`.`PWSTR`,
    public var `flags`: UInt,
    public var `p3pHeader`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 2344:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ProofOfPossessionCookieInfo {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2349:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ProofOfPossessionCookieInfoManager: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa9927f85_a304_4390_8b23_a75f1c668600);

public const val `REDIRECT_CACHE_ENTRY`: UInt = 2048u;
// UNSUPPORTED Rust 2351:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_DIAL_AUTOCONNECT: windows_sys::core::PCSTR = windows_sys::core::s!("AutoConnect");

// UNSUPPORTED Rust 2352:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_LEASH_LEGACY_COOKIES: windows_sys::core::PCSTR = windows_sys::core::s!("LeashLegacyCookies");

public typealias `REQUEST_TIMES` = Int;
public const val `SECURITY_FLAG_128BIT`: UInt = 536870912u;
public const val `SECURITY_FLAG_40BIT`: UInt = 268435456u;
public const val `SECURITY_FLAG_56BIT`: UInt = 1073741824u;
public const val `SECURITY_FLAG_FORTEZZA`: UInt = 134217728u;
public const val `SECURITY_FLAG_IETFSSL4`: UInt = 32u;
public const val `SECURITY_FLAG_IGNORE_REDIRECT_TO_HTTP`: UInt = 32768u;
public const val `SECURITY_FLAG_IGNORE_REDIRECT_TO_HTTPS`: UInt = 16384u;
public const val `SECURITY_FLAG_IGNORE_REVOCATION`: UInt = 128u;
public const val `SECURITY_FLAG_IGNORE_WEAK_SIGNATURE`: UInt = 65536u;
public const val `SECURITY_FLAG_IGNORE_WRONG_USAGE`: UInt = 512u;
public const val `SECURITY_FLAG_NORMALBITNESS`: UInt = 268435456u;
public const val `SECURITY_FLAG_OPT_IN_WEAK_SIGNATURE`: UInt = 131072u;
public const val `SECURITY_FLAG_PCT`: UInt = 8u;
public const val `SECURITY_FLAG_PCT4`: UInt = 16u;
public const val `SECURITY_FLAG_SSL`: UInt = 2u;
public const val `SECURITY_FLAG_SSL3`: UInt = 4u;
public const val `SECURITY_FLAG_UNKNOWNBIT`: UInt = 2147483648u;
public const val `SHORTPATH_CACHE_ENTRY`: UInt = 512u;
public const val `SPARSE_CACHE_ENTRY`: UInt = 65536u;
public const val `STATIC_CACHE_ENTRY`: UInt = 128u;
public const val `STICKY_CACHE_ENTRY`: UInt = 4u;
public const val `TLSHandshakeEnd`: `REQUEST_TIMES` = 5;
public const val `TLSHandshakeStart`: `REQUEST_TIMES` = 4;
public const val `TRACK_OFFLINE_CACHE_ENTRY`: UInt = 16u;
public const val `TRACK_ONLINE_CACHE_ENTRY`: UInt = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `URLCACHE_ENTRY_INFO` (
    public var `pwszSourceUrlName`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszLocalFileName`: `windows_sys`.`core`.`PWSTR`,
    public var `dwCacheEntryType`: UInt,
    public var `dwUseCount`: UInt,
    public var `dwHitRate`: UInt,
    public var `dwSizeLow`: UInt,
    public var `dwSizeHigh`: UInt,
    public var `ftLastModifiedTime`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `ftExpireTime`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `ftLastAccessTime`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `ftLastSyncTime`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `pbHeaderInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cbHeaderInfoSize`: UInt,
    public var `pbExtraData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cbExtraDataSize`: UInt,
)
// UNSUPPORTED Rust 2398:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for URLCACHE_ENTRY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `URLHISTORY_CACHE_ENTRY`: UInt = 2097152u;
public typealias `URL_CACHE_LIMIT_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `URL_COMPONENTSA` (
    public var `dwStructSize`: UInt,
    public var `lpszScheme`: `windows_sys`.`core`.`PSTR`,
    public var `dwSchemeLength`: UInt,
    public var `nScheme`: `INTERNET_SCHEME`,
    public var `lpszHostName`: `windows_sys`.`core`.`PSTR`,
    public var `dwHostNameLength`: UInt,
    public var `nPort`: UShort,
    public var `lpszUserName`: `windows_sys`.`core`.`PSTR`,
    public var `dwUserNameLength`: UInt,
    public var `lpszPassword`: `windows_sys`.`core`.`PSTR`,
    public var `dwPasswordLength`: UInt,
    public var `lpszUrlPath`: `windows_sys`.`core`.`PSTR`,
    public var `dwUrlPathLength`: UInt,
    public var `lpszExtraInfo`: `windows_sys`.`core`.`PSTR`,
    public var `dwExtraInfoLength`: UInt,
)
// UNSUPPORTED Rust 2424:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for URL_COMPONENTSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `URL_COMPONENTSW` (
    public var `dwStructSize`: UInt,
    public var `lpszScheme`: `windows_sys`.`core`.`PWSTR`,
    public var `dwSchemeLength`: UInt,
    public var `nScheme`: `INTERNET_SCHEME`,
    public var `lpszHostName`: `windows_sys`.`core`.`PWSTR`,
    public var `dwHostNameLength`: UInt,
    public var `nPort`: UShort,
    public var `lpszUserName`: `windows_sys`.`core`.`PWSTR`,
    public var `dwUserNameLength`: UInt,
    public var `lpszPassword`: `windows_sys`.`core`.`PWSTR`,
    public var `dwPasswordLength`: UInt,
    public var `lpszUrlPath`: `windows_sys`.`core`.`PWSTR`,
    public var `dwUrlPathLength`: UInt,
    public var `lpszExtraInfo`: `windows_sys`.`core`.`PWSTR`,
    public var `dwExtraInfoLength`: UInt,
)
// UNSUPPORTED Rust 2448:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for URL_COMPONENTSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `UrlCacheLimitTypeAppContainer`: `URL_CACHE_LIMIT_TYPE` = 2;
public const val `UrlCacheLimitTypeAppContainerTotal`: `URL_CACHE_LIMIT_TYPE` = 3;
public const val `UrlCacheLimitTypeIE`: `URL_CACHE_LIMIT_TYPE` = 0;
public const val `UrlCacheLimitTypeIETotal`: `URL_CACHE_LIMIT_TYPE` = 1;
public const val `UrlCacheLimitTypeNum`: `URL_CACHE_LIMIT_TYPE` = 4;
public const val `WININET_API_FLAG_ASYNC`: UInt = 1u;
public const val `WININET_API_FLAG_SYNC`: UInt = 4u;
public const val `WININET_API_FLAG_USE_CONTEXT`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WININET_PROXY_INFO` (
    public var `fProxy`: `windows_sys`.`core`.`BOOL`,
    public var `fBypass`: `windows_sys`.`core`.`BOOL`,
    public var `ProxyScheme`: `INTERNET_SCHEME`,
    public var `pwszProxy`: `windows_sys`.`core`.`PWSTR`,
    public var `ProxyPort`: UShort,
)
// UNSUPPORTED Rust 2470:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WININET_PROXY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WININET_PROXY_INFO_LIST` (
    public var `dwProxyInfoCount`: UInt,
    public var `pProxyInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WININET_PROXY_INFO`>?,
)
// UNSUPPORTED Rust 2481:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WININET_PROXY_INFO_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WININET_SYNC_MODE` = Int;
public const val `WININET_SYNC_MODE_ALWAYS`: `WININET_SYNC_MODE` = 3;
public const val `WININET_SYNC_MODE_AUTOMATIC`: `WININET_SYNC_MODE` = 4;
public const val `WININET_SYNC_MODE_DEFAULT`: `WININET_SYNC_MODE` = 4;
public const val `WININET_SYNC_MODE_NEVER`: `WININET_SYNC_MODE` = 0;
public const val `WININET_SYNC_MODE_ONCE_PER_SESSION`: `WININET_SYNC_MODE` = 2;
public const val `WININET_SYNC_MODE_ON_EXPIRY`: `WININET_SYNC_MODE` = 1;
public typealias `WPAD_CACHE_DELETE` = Int;
public const val `WPAD_CACHE_DELETE_ALL`: `WPAD_CACHE_DELETE` = 1;
public const val `WPAD_CACHE_DELETE_CURRENT`: `WPAD_CACHE_DELETE` = 0;
public const val `XDR_CACHE_ENTRY`: UInt = 262144u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `pfnInternetDeInitializeAutoProxyDll` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `pfnInternetGetProxyInfo` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, UInt, `windows_sys`.`core`.`PCSTR`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `pfnInternetInitializeAutoProxyDll` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, `windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`AutoProxyHelperFunctions`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`AUTO_PROXY_SCRIPT_BUFFER`>?) -> `windows_sys`.`core`.`BOOL`>>>;
