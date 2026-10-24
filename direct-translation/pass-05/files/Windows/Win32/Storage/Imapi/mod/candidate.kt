// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=CloseIMsgSession; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CloseIMsgSession`(`lpmsgsess` : `LPMSGSESS`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=GetAttribIMsgOnIStg; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_AddressBook")]
public external fun `GetAttribIMsgOnIStg`(`lpobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpproptagarray` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`AddressBook`.`SPropTagArray`>?, `lpppropattrarray` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`SPropAttrArray`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=MapStorageSCode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MapStorageSCode`(`stgscode` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=OpenIMsgOnIStg; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_AddressBook", feature = "Win32_System_Com_StructuredStorage"))]
public external fun `OpenIMsgOnIStg`(`lpmsgsess` : `LPMSGSESS`, `lpallocatebuffer` : `super`.`super`.`System`.`AddressBook`.`LPALLOCATEBUFFER`, `lpallocatemore` : `super`.`super`.`System`.`AddressBook`.`LPALLOCATEMORE`, `lpfreebuffer` : `super`.`super`.`System`.`AddressBook`.`LPFREEBUFFER`, `lpmalloc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpmapisup` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpstg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpfmsgcallrelease` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MSGCALLRELEASE`>?, `ulcallerdata` : UInt, `ulflags` : UInt, `lppmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=OpenIMsgSession; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `OpenIMsgSession`(`lpmalloc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ulflags` : UInt, `lppmsgsess` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LPMSGSESS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=SetAttribIMsgOnIStg; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_AddressBook")]
public external fun `SetAttribIMsgOnIStg`(`lpobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpproptags` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`AddressBook`.`SPropTagArray`>?, `lppropattrs` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SPropAttrArray`>?, `lpppropproblems` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`System`.`AddressBook`.`SPropProblemArray`>>?) : `windows_sys`.`core`.`HRESULT`
// UNSUPPORTED Rust 11:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const BlockRange: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb507ca27_2204_11dd_966a_001aa01bbc58);

// UNSUPPORTED Rust 12:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const BlockRangeList: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb507ca28_2204_11dd_966a_001aa01bbc58);

// UNSUPPORTED Rust 13:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const BootOptions: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2c941fce_975b_59be_a960_9a2a262853a5);

// UNSUPPORTED Rust 14:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CATID_SMTP_DNSRESOLVERRECORDSINK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbd0b4366_8e03_11d2_94f6_00c04f79f1d6);

// UNSUPPORTED Rust 15:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CATID_SMTP_DSN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x22b55731_f5f8_4d23_bd8f_87b52371a73a);

// UNSUPPORTED Rust 16:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CATID_SMTP_GET_AUX_DOMAIN_INFO_FLAGS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x84ff368a_fab3_43d7_bcdf_692c5b46e6b1);

// UNSUPPORTED Rust 17:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CATID_SMTP_LOG: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x93d0a538_2c1e_4b68_a7c9_d73a8aa6ee97);

// UNSUPPORTED Rust 18:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CATID_SMTP_MAXMSGSIZE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xebf159de_a67e_11d2_94f7_00c04f79f1d6);

// UNSUPPORTED Rust 19:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CATID_SMTP_MSGTRACKLOG: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc6df52aa_7db0_11d2_94f4_00c04f79f1d6);

// UNSUPPORTED Rust 20:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CATID_SMTP_ON_BEFORE_DATA: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf6628c92_0d5e_11d2_aa68_00c04fa35b82);

// UNSUPPORTED Rust 21:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CATID_SMTP_ON_INBOUND_COMMAND: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf6628c8d_0d5e_11d2_aa68_00c04fa35b82);

// UNSUPPORTED Rust 22:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CATID_SMTP_ON_MESSAGE_START: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf6628c90_0d5e_11d2_aa68_00c04fa35b82);

// UNSUPPORTED Rust 23:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CATID_SMTP_ON_PER_RECIPIENT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf6628c91_0d5e_11d2_aa68_00c04fa35b82);

// UNSUPPORTED Rust 24:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CATID_SMTP_ON_SERVER_RESPONSE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf6628c8e_0d5e_11d2_aa68_00c04fa35b82);

// UNSUPPORTED Rust 25:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CATID_SMTP_ON_SESSION_END: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf6628c93_0d5e_11d2_aa68_00c04fa35b82);

// UNSUPPORTED Rust 26:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CATID_SMTP_ON_SESSION_START: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf6628c8f_0d5e_11d2_aa68_00c04fa35b82);

// UNSUPPORTED Rust 27:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CATID_SMTP_STORE_DRIVER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x59175850_e533_11d1_aa67_00c04fa345f6);

// UNSUPPORTED Rust 28:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CATID_SMTP_TRANSPORT_CATEGORIZE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x960252a3_0a3a_11d2_9e00_00c04fa322ba);

// UNSUPPORTED Rust 29:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CATID_SMTP_TRANSPORT_POSTCATEGORIZE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x76719654_05a6_11d2_9dfd_00c04fa322ba);

// UNSUPPORTED Rust 30:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CATID_SMTP_TRANSPORT_PRECATEGORIZE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa3acfb0d_83ff_11d2_9e14_00c04fa322ba);

// UNSUPPORTED Rust 31:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CATID_SMTP_TRANSPORT_ROUTER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x283430c9_1850_11d2_9e03_00c04fa322ba);

// UNSUPPORTED Rust 32:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CATID_SMTP_TRANSPORT_SUBMISSION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xff3caa23_00b9_11d2_9dfb_00c04fa322ba);

// UNSUPPORTED Rust 33:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_SmtpCat: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb23c35b7_9219_11d2_9e17_00c04fa322ba);

public typealias `DISC_RECORDER_STATE_FLAGS` = UInt;
public const val `DISPID_DDISCFORMAT2DATAEVENTS_UPDATE`: UInt = 512u;
public const val `DISPID_DDISCFORMAT2RAWCDEVENTS_UPDATE`: UInt = 512u;
public const val `DISPID_DDISCFORMAT2TAOEVENTS_UPDATE`: UInt = 512u;
public const val `DISPID_DDISCMASTER2EVENTS_DEVICEADDED`: UInt = 256u;
public const val `DISPID_DDISCMASTER2EVENTS_DEVICEREMOVED`: UInt = 257u;
public const val `DISPID_DFILESYSTEMIMAGEEVENTS_UPDATE`: UInt = 256u;
public const val `DISPID_DFILESYSTEMIMAGEIMPORTEVENTS_UPDATEIMPORT`: UInt = 257u;
public const val `DISPID_DWRITEENGINE2EVENTS_UPDATE`: UInt = 256u;
public const val `DISPID_IBLOCKRANGELIST_BLOCKRANGES`: UInt = 256u;
public const val `DISPID_IBLOCKRANGE_ENDLBA`: UInt = 257u;
public const val `DISPID_IBLOCKRANGE_STARTLBA`: UInt = 256u;
public const val `DISPID_IDISCFORMAT2DATAEVENTARGS_CURRENTACTION`: UInt = 771u;
public const val `DISPID_IDISCFORMAT2DATAEVENTARGS_ELAPSEDTIME`: UInt = 768u;
public const val `DISPID_IDISCFORMAT2DATAEVENTARGS_ESTIMATEDREMAININGTIME`: UInt = 769u;
public const val `DISPID_IDISCFORMAT2DATAEVENTARGS_ESTIMATEDTOTALTIME`: UInt = 770u;
public const val `DISPID_IDISCFORMAT2DATA_BUFFERUNDERRUNFREEDISABLED`: UInt = 257u;
public const val `DISPID_IDISCFORMAT2DATA_CANCELWRITE`: UInt = 513u;
public const val `DISPID_IDISCFORMAT2DATA_CLIENTNAME`: UInt = 272u;
public const val `DISPID_IDISCFORMAT2DATA_CURRENTMEDIASTATUS`: UInt = 262u;
public const val `DISPID_IDISCFORMAT2DATA_CURRENTMEDIATYPE`: UInt = 271u;
public const val `DISPID_IDISCFORMAT2DATA_CURRENTROTATIONTYPEISPURECAV`: UInt = 276u;
public const val `DISPID_IDISCFORMAT2DATA_CURRENTWRITESPEED`: UInt = 275u;
public const val `DISPID_IDISCFORMAT2DATA_DISABLEDVDCOMPATIBILITYMODE`: UInt = 270u;
public const val `DISPID_IDISCFORMAT2DATA_FORCEMEDIATOBECLOSED`: UInt = 269u;
public const val `DISPID_IDISCFORMAT2DATA_FORCEOVERWRITE`: UInt = 279u;
public const val `DISPID_IDISCFORMAT2DATA_FREESECTORS`: UInt = 265u;
public const val `DISPID_IDISCFORMAT2DATA_LASTSECTOROFPREVIOUSSESSION`: UInt = 268u;
public const val `DISPID_IDISCFORMAT2DATA_MUTLISESSIONINTERFACES`: UInt = 280u;
public const val `DISPID_IDISCFORMAT2DATA_NEXTWRITABLEADDRESS`: UInt = 266u;
public const val `DISPID_IDISCFORMAT2DATA_POSTGAPALREADYINIMAGE`: UInt = 260u;
public const val `DISPID_IDISCFORMAT2DATA_RECORDER`: UInt = 256u;
public const val `DISPID_IDISCFORMAT2DATA_REQUESTEDROTATIONTYPEISPURECAV`: UInt = 274u;
public const val `DISPID_IDISCFORMAT2DATA_REQUESTEDWRITESPEED`: UInt = 273u;
public const val `DISPID_IDISCFORMAT2DATA_SETWRITESPEED`: UInt = 514u;
public const val `DISPID_IDISCFORMAT2DATA_STARTSECTOROFPREVIOUSSESSION`: UInt = 267u;
public const val `DISPID_IDISCFORMAT2DATA_SUPPORTEDWRITESPEEDDESCRIPTORS`: UInt = 278u;
public const val `DISPID_IDISCFORMAT2DATA_SUPPORTEDWRITESPEEDS`: UInt = 277u;
public const val `DISPID_IDISCFORMAT2DATA_TOTALSECTORS`: UInt = 264u;
public const val `DISPID_IDISCFORMAT2DATA_WRITE`: UInt = 512u;
public const val `DISPID_IDISCFORMAT2DATA_WRITEPROTECTSTATUS`: UInt = 263u;
public const val `DISPID_IDISCFORMAT2ERASEEVENTS_UPDATE`: UInt = 512u;
public const val `DISPID_IDISCFORMAT2ERASE_CLIENTNAME`: UInt = 259u;
public const val `DISPID_IDISCFORMAT2ERASE_ERASEMEDIA`: UInt = 513u;
public const val `DISPID_IDISCFORMAT2ERASE_FULLERASE`: UInt = 257u;
public const val `DISPID_IDISCFORMAT2ERASE_MEDIATYPE`: UInt = 258u;
public const val `DISPID_IDISCFORMAT2ERASE_RECORDER`: UInt = 256u;
public const val `DISPID_IDISCFORMAT2RAWCDEVENTARGS_CURRENTACTION`: UInt = 769u;
public const val `DISPID_IDISCFORMAT2RAWCDEVENTARGS_CURRENTTRACKNUMBER`: UInt = 768u;
public const val `DISPID_IDISCFORMAT2RAWCDEVENTARGS_ELAPSEDTIME`: UInt = 768u;
public const val `DISPID_IDISCFORMAT2RAWCDEVENTARGS_ESTIMATEDREMAININGTIME`: UInt = 769u;
public const val `DISPID_IDISCFORMAT2RAWCDEVENTARGS_ESTIMATEDTOTALTIME`: UInt = 770u;
public const val `DISPID_IDISCFORMAT2RAWCD_BUFFERUNDERRUNFREEDISABLED`: UInt = 258u;
public const val `DISPID_IDISCFORMAT2RAWCD_CANCELWRITE`: UInt = 515u;
public const val `DISPID_IDISCFORMAT2RAWCD_CLIENTNAME`: UInt = 266u;
public const val `DISPID_IDISCFORMAT2RAWCD_CURRENTMEDIATYPE`: UInt = 261u;
public const val `DISPID_IDISCFORMAT2RAWCD_CURRENTROTATIONTYPEISPURECAV`: UInt = 270u;
public const val `DISPID_IDISCFORMAT2RAWCD_CURRENTWRITESPEED`: UInt = 269u;
public const val `DISPID_IDISCFORMAT2RAWCD_LASTPOSSIBLESTARTOFLEADOUT`: UInt = 260u;
public const val `DISPID_IDISCFORMAT2RAWCD_PREPAREMEDIA`: UInt = 512u;
public const val `DISPID_IDISCFORMAT2RAWCD_RECORDER`: UInt = 256u;
public const val `DISPID_IDISCFORMAT2RAWCD_RELEASEMEDIA`: UInt = 516u;
public const val `DISPID_IDISCFORMAT2RAWCD_REQUESTEDDATASECTORTYPE`: UInt = 265u;
public const val `DISPID_IDISCFORMAT2RAWCD_REQUESTEDROTATIONTYPEISPURECAV`: UInt = 268u;
public const val `DISPID_IDISCFORMAT2RAWCD_REQUESTEDWRITESPEED`: UInt = 267u;
public const val `DISPID_IDISCFORMAT2RAWCD_SETWRITESPEED`: UInt = 517u;
public const val `DISPID_IDISCFORMAT2RAWCD_STARTOFNEXTSESSION`: UInt = 259u;
public const val `DISPID_IDISCFORMAT2RAWCD_SUPPORTEDDATASECTORTYPES`: UInt = 264u;
public const val `DISPID_IDISCFORMAT2RAWCD_SUPPORTEDWRITESPEEDDESCRIPTORS`: UInt = 272u;
public const val `DISPID_IDISCFORMAT2RAWCD_SUPPORTEDWRITESPEEDS`: UInt = 271u;
public const val `DISPID_IDISCFORMAT2RAWCD_WRITEMEDIA`: UInt = 513u;
public const val `DISPID_IDISCFORMAT2RAWCD_WRITEMEDIAWITHVALIDATION`: UInt = 514u;
public const val `DISPID_IDISCFORMAT2TAOEVENTARGS_CURRENTACTION`: UInt = 769u;
public const val `DISPID_IDISCFORMAT2TAOEVENTARGS_CURRENTTRACKNUMBER`: UInt = 768u;
public const val `DISPID_IDISCFORMAT2TAOEVENTARGS_ELAPSEDTIME`: UInt = 770u;
public const val `DISPID_IDISCFORMAT2TAOEVENTARGS_ESTIMATEDREMAININGTIME`: UInt = 771u;
public const val `DISPID_IDISCFORMAT2TAOEVENTARGS_ESTIMATEDTOTALTIME`: UInt = 772u;
public const val `DISPID_IDISCFORMAT2TAO_ADDAUDIOTRACK`: UInt = 513u;
public const val `DISPID_IDISCFORMAT2TAO_BUFFERUNDERRUNFREEDISABLED`: UInt = 258u;
public const val `DISPID_IDISCFORMAT2TAO_CANCELADDTRACK`: UInt = 514u;
public const val `DISPID_IDISCFORMAT2TAO_CLIENTNAME`: UInt = 270u;
public const val `DISPID_IDISCFORMAT2TAO_CURRENTMEDIATYPE`: UInt = 267u;
public const val `DISPID_IDISCFORMAT2TAO_CURRENTROTATIONTYPEISPURECAV`: UInt = 274u;
public const val `DISPID_IDISCFORMAT2TAO_CURRENTWRITESPEED`: UInt = 273u;
public const val `DISPID_IDISCFORMAT2TAO_DONOTFINALIZEMEDIA`: UInt = 263u;
public const val `DISPID_IDISCFORMAT2TAO_EXPECTEDTABLEOFCONTENTS`: UInt = 266u;
public const val `DISPID_IDISCFORMAT2TAO_FINISHMEDIA`: UInt = 515u;
public const val `DISPID_IDISCFORMAT2TAO_FREESECTORSONMEDIA`: UInt = 261u;
public const val `DISPID_IDISCFORMAT2TAO_NUMBEROFEXISTINGTRACKS`: UInt = 259u;
public const val `DISPID_IDISCFORMAT2TAO_PREPAREMEDIA`: UInt = 512u;
public const val `DISPID_IDISCFORMAT2TAO_RECORDER`: UInt = 256u;
public const val `DISPID_IDISCFORMAT2TAO_REQUESTEDROTATIONTYPEISPURECAV`: UInt = 272u;
public const val `DISPID_IDISCFORMAT2TAO_REQUESTEDWRITESPEED`: UInt = 271u;
public const val `DISPID_IDISCFORMAT2TAO_SETWRITESPEED`: UInt = 516u;
public const val `DISPID_IDISCFORMAT2TAO_SUPPORTEDWRITESPEEDDESCRIPTORS`: UInt = 276u;
public const val `DISPID_IDISCFORMAT2TAO_SUPPORTEDWRITESPEEDS`: UInt = 275u;
public const val `DISPID_IDISCFORMAT2TAO_TOTALSECTORSONMEDIA`: UInt = 260u;
public const val `DISPID_IDISCFORMAT2TAO_USEDSECTORSONMEDIA`: UInt = 262u;
public const val `DISPID_IDISCFORMAT2_MEDIAHEURISTICALLYBLANK`: UInt = 1793u;
public const val `DISPID_IDISCFORMAT2_MEDIAPHYSICALLYBLANK`: UInt = 1792u;
public const val `DISPID_IDISCFORMAT2_MEDIASUPPORTED`: UInt = 2049u;
public const val `DISPID_IDISCFORMAT2_RECORDERSUPPORTED`: UInt = 2048u;
public const val `DISPID_IDISCFORMAT2_SUPPORTEDMEDIATYPES`: UInt = 1794u;
public const val `DISPID_IDISCRECORDER2_ACQUIREEXCLUSIVEACCESS`: UInt = 258u;
public const val `DISPID_IDISCRECORDER2_ACTIVEDISCRECORDER`: UInt = 0u;
public const val `DISPID_IDISCRECORDER2_CLOSETRAY`: UInt = 257u;
public const val `DISPID_IDISCRECORDER2_CURRENTFEATUREPAGES`: UInt = 521u;
public const val `DISPID_IDISCRECORDER2_CURRENTPROFILES`: UInt = 523u;
public const val `DISPID_IDISCRECORDER2_DEVICECANLOADMEDIA`: UInt = 518u;
public const val `DISPID_IDISCRECORDER2_DISABLEMCN`: UInt = 260u;
public const val `DISPID_IDISCRECORDER2_EJECTMEDIA`: UInt = 256u;
public const val `DISPID_IDISCRECORDER2_ENABLEMCN`: UInt = 261u;
public const val `DISPID_IDISCRECORDER2_EXCLUSIVEACCESSOWNER`: UInt = 525u;
public const val `DISPID_IDISCRECORDER2_INITIALIZEDISCRECORDER`: UInt = 262u;
public const val `DISPID_IDISCRECORDER2_LEGACYDEVICENUMBER`: UInt = 519u;
public const val `DISPID_IDISCRECORDER2_PRODUCTID`: UInt = 514u;
public const val `DISPID_IDISCRECORDER2_PRODUCTREVISION`: UInt = 515u;
public const val `DISPID_IDISCRECORDER2_RELEASEEXCLUSIVEACCESS`: UInt = 259u;
public const val `DISPID_IDISCRECORDER2_SUPPORTEDFEATUREPAGES`: UInt = 520u;
public const val `DISPID_IDISCRECORDER2_SUPPORTEDMODEPAGES`: UInt = 524u;
public const val `DISPID_IDISCRECORDER2_SUPPORTEDPROFILES`: UInt = 522u;
public const val `DISPID_IDISCRECORDER2_VENDORID`: UInt = 513u;
public const val `DISPID_IDISCRECORDER2_VOLUMENAME`: UInt = 516u;
public const val `DISPID_IDISCRECORDER2_VOLUMEPATHNAMES`: UInt = 517u;
public const val `DISPID_IMULTISESSION_FIRSTDATASESSION`: UInt = 512u;
public const val `DISPID_IMULTISESSION_FREESECTORS`: UInt = 516u;
public const val `DISPID_IMULTISESSION_IMPORTRECORDER`: UInt = 258u;
public const val `DISPID_IMULTISESSION_INUSE`: UInt = 257u;
public const val `DISPID_IMULTISESSION_LASTSECTOROFPREVIOUSSESSION`: UInt = 514u;
public const val `DISPID_IMULTISESSION_LASTWRITTENADDRESS`: UInt = 518u;
public const val `DISPID_IMULTISESSION_NEXTWRITABLEADDRESS`: UInt = 515u;
public const val `DISPID_IMULTISESSION_SECTORSONMEDIA`: UInt = 519u;
public const val `DISPID_IMULTISESSION_STARTSECTOROFPREVIOUSSESSION`: UInt = 513u;
public const val `DISPID_IMULTISESSION_SUPPORTEDONCURRENTMEDIA`: UInt = 256u;
public const val `DISPID_IMULTISESSION_WRITEUNITSIZE`: UInt = 517u;
public const val `DISPID_IRAWCDIMAGECREATOR_ADDSPECIALPREGAP`: UInt = 514u;
public const val `DISPID_IRAWCDIMAGECREATOR_ADDSUBCODERWGENERATOR`: UInt = 515u;
public const val `DISPID_IRAWCDIMAGECREATOR_ADDTRACK`: UInt = 513u;
public const val `DISPID_IRAWCDIMAGECREATOR_CREATERESULTIMAGE`: UInt = 512u;
public const val `DISPID_IRAWCDIMAGECREATOR_DISABLEGAPLESSAUDIO`: UInt = 259u;
public const val `DISPID_IRAWCDIMAGECREATOR_EXPECTEDTABLEOFCONTENTS`: UInt = 265u;
public const val `DISPID_IRAWCDIMAGECREATOR_MEDIACATALOGNUMBER`: UInt = 260u;
public const val `DISPID_IRAWCDIMAGECREATOR_NUMBEROFEXISTINGTRACKS`: UInt = 263u;
public const val `DISPID_IRAWCDIMAGECREATOR_RESULTINGIMAGETYPE`: UInt = 256u;
public const val `DISPID_IRAWCDIMAGECREATOR_STARTINGTRACKNUMBER`: UInt = 261u;
public const val `DISPID_IRAWCDIMAGECREATOR_STARTOFLEADOUT`: UInt = 257u;
public const val `DISPID_IRAWCDIMAGECREATOR_STARTOFLEADOUTLIMIT`: UInt = 258u;
public const val `DISPID_IRAWCDIMAGECREATOR_TRACKINFO`: UInt = 262u;
public const val `DISPID_IRAWCDIMAGECREATOR_USEDSECTORSONDISC`: UInt = 264u;
public const val `DISPID_IRAWCDTRACKINFO_AUDIOHASPREEMPHASIS`: UInt = 262u;
public const val `DISPID_IRAWCDTRACKINFO_DIGITALAUDIOCOPYSETTING`: UInt = 261u;
public const val `DISPID_IRAWCDTRACKINFO_ISRC`: UInt = 260u;
public const val `DISPID_IRAWCDTRACKINFO_SECTORCOUNT`: UInt = 257u;
public const val `DISPID_IRAWCDTRACKINFO_SECTORTYPE`: UInt = 259u;
public const val `DISPID_IRAWCDTRACKINFO_STARTINGLBA`: UInt = 256u;
public const val `DISPID_IRAWCDTRACKINFO_TRACKNUMBER`: UInt = 258u;
public const val `DISPID_IWRITEENGINE2EVENTARGS_FREESYSTEMBUFFER`: UInt = 264u;
public const val `DISPID_IWRITEENGINE2EVENTARGS_LASTREADLBA`: UInt = 258u;
public const val `DISPID_IWRITEENGINE2EVENTARGS_LASTWRITTENLBA`: UInt = 259u;
public const val `DISPID_IWRITEENGINE2EVENTARGS_SECTORCOUNT`: UInt = 257u;
public const val `DISPID_IWRITEENGINE2EVENTARGS_STARTLBA`: UInt = 256u;
public const val `DISPID_IWRITEENGINE2EVENTARGS_TOTALDEVICEBUFFER`: UInt = 260u;
public const val `DISPID_IWRITEENGINE2EVENTARGS_TOTALSYSTEMBUFFER`: UInt = 262u;
public const val `DISPID_IWRITEENGINE2EVENTARGS_USEDDEVICEBUFFER`: UInt = 261u;
public const val `DISPID_IWRITEENGINE2EVENTARGS_USEDSYSTEMBUFFER`: UInt = 263u;
public const val `DISPID_IWRITEENGINE2_BYTESPERSECTOR`: UInt = 260u;
public const val `DISPID_IWRITEENGINE2_CANCELWRITE`: UInt = 513u;
public const val `DISPID_IWRITEENGINE2_DISCRECORDER`: UInt = 256u;
public const val `DISPID_IWRITEENGINE2_ENDINGSECTORSPERSECOND`: UInt = 259u;
public const val `DISPID_IWRITEENGINE2_STARTINGSECTORSPERSECOND`: UInt = 258u;
public const val `DISPID_IWRITEENGINE2_USESTREAMINGWRITE12`: UInt = 257u;
public const val `DISPID_IWRITEENGINE2_WRITEINPROGRESS`: UInt = 261u;
public const val `DISPID_IWRITEENGINE2_WRITESECTION`: UInt = 512u;
public const val `Emulation12MFloppy`: `EmulationType` = 1;
public const val `Emulation144MFloppy`: `EmulationType` = 2;
public const val `Emulation288MFloppy`: `EmulationType` = 3;
public const val `EmulationHardDisk`: `EmulationType` = 4;
public const val `EmulationNone`: `EmulationType` = 0;
public typealias `EmulationType` = Int;
// UNSUPPORTED Rust 213:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const EnumFsiItems: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2c941fc6_975b_59be_a960_9a2a262853a5);

// UNSUPPORTED Rust 214:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const EnumProgressItems: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2c941fca_975b_59be_a960_9a2a262853a5);

// UNSUPPORTED Rust 215:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FileSystemImageResult: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2c941fcc_975b_59be_a960_9a2a262853a5);

// UNSUPPORTED Rust 216:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FsiDirectoryItem: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2c941fc8_975b_59be_a960_9a2a262853a5);

// UNSUPPORTED Rust 217:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FsiFileItem: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2c941fc7_975b_59be_a960_9a2a262853a5);

public const val `FsiFileSystemISO9660`: `FsiFileSystems` = 1;
public const val `FsiFileSystemJoliet`: `FsiFileSystems` = 2;
public const val `FsiFileSystemNone`: `FsiFileSystems` = 0;
public const val `FsiFileSystemUDF`: `FsiFileSystems` = 4;
public const val `FsiFileSystemUnknown`: `FsiFileSystems` = 1073741824;
public typealias `FsiFileSystems` = Int;
public const val `FsiItemDirectory`: `FsiItemType` = 1;
public const val `FsiItemFile`: `FsiItemType` = 2;
public const val `FsiItemNotFound`: `FsiItemType` = 0;
public typealias `FsiItemType` = Int;
// UNSUPPORTED Rust 228:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FsiNamedStreams: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc6b6f8ed_6d19_44b4_b539_b159b793a32d);

// UNSUPPORTED Rust 229:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FsiStream: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2c941fcd_975b_59be_a960_9a2a262853a5);

// UNSUPPORTED Rust 230:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_SMTPSVC_SOURCE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1b3c0666_e470_11d1_aa67_00c04fa345f6);

// UNSUPPORTED Rust 231:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_SMTP_SOURCE_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfb65c4dc_e468_11d1_aa67_00c04fa345f6);

public const val `IMAPI2FS_BOOT_ENTRY_COUNT_MAX`: UInt = 32u;
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `IMAPI2FS_FullVersion_STR`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.0");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `IMAPI2FS_FullVersion_WSTR`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.0");
public const val `IMAPI2FS_MajorVersion`: UInt = 1u;
public const val `IMAPI2FS_MinorVersion`: UInt = 0u;
public const val `IMAPI2_DEFAULT_COMMAND_TIMEOUT`: UInt = 10u;
public const val `IMAPILib2_MajorVersion`: UInt = 1u;
public const val `IMAPILib2_MinorVersion`: UInt = 0u;
public const val `IMAPI_BURN_VERIFICATION_FULL`: `IMAPI_BURN_VERIFICATION_LEVEL` = 2;
public typealias `IMAPI_BURN_VERIFICATION_LEVEL` = Int;
public const val `IMAPI_BURN_VERIFICATION_NONE`: `IMAPI_BURN_VERIFICATION_LEVEL` = 0;
public const val `IMAPI_BURN_VERIFICATION_QUICK`: `IMAPI_BURN_VERIFICATION_LEVEL` = 1;
public const val `IMAPI_CD_SECTOR_AUDIO`: `IMAPI_CD_SECTOR_TYPE` = 0;
public const val `IMAPI_CD_SECTOR_MODE1`: `IMAPI_CD_SECTOR_TYPE` = 2;
public const val `IMAPI_CD_SECTOR_MODE1RAW`: `IMAPI_CD_SECTOR_TYPE` = 6;
public const val `IMAPI_CD_SECTOR_MODE2FORM0`: `IMAPI_CD_SECTOR_TYPE` = 3;
public const val `IMAPI_CD_SECTOR_MODE2FORM0RAW`: `IMAPI_CD_SECTOR_TYPE` = 7;
public const val `IMAPI_CD_SECTOR_MODE2FORM1`: `IMAPI_CD_SECTOR_TYPE` = 4;
public const val `IMAPI_CD_SECTOR_MODE2FORM1RAW`: `IMAPI_CD_SECTOR_TYPE` = 8;
public const val `IMAPI_CD_SECTOR_MODE2FORM2`: `IMAPI_CD_SECTOR_TYPE` = 5;
public const val `IMAPI_CD_SECTOR_MODE2FORM2RAW`: `IMAPI_CD_SECTOR_TYPE` = 9;
public const val `IMAPI_CD_SECTOR_MODE_ZERO`: `IMAPI_CD_SECTOR_TYPE` = 1;
public typealias `IMAPI_CD_SECTOR_TYPE` = Int;
public const val `IMAPI_CD_TRACK_DIGITAL_COPY_PERMITTED`: `IMAPI_CD_TRACK_DIGITAL_COPY_SETTING` = 0;
public const val `IMAPI_CD_TRACK_DIGITAL_COPY_PROHIBITED`: `IMAPI_CD_TRACK_DIGITAL_COPY_SETTING` = 1;
public const val `IMAPI_CD_TRACK_DIGITAL_COPY_SCMS`: `IMAPI_CD_TRACK_DIGITAL_COPY_SETTING` = 2;
public typealias `IMAPI_CD_TRACK_DIGITAL_COPY_SETTING` = Int;
public const val `IMAPI_E_ALREADYOPEN`: Int = -2147220958;
public const val `IMAPI_E_BADJOLIETNAME`: Int = -2147220963;
public const val `IMAPI_E_BOOTIMAGE_AND_NONBLANK_DISC`: Int = -2147220946;
public const val `IMAPI_E_CANNOT_WRITE_TO_MEDIA`: Int = -2147220948;
public const val `IMAPI_E_COMPRESSEDSTASH`: Int = -2147220952;
public const val `IMAPI_E_DEVICE_INVALIDTYPE`: Int = -2147220972;
public const val `IMAPI_E_DEVICE_NOPROPERTIES`: Int = -2147220975;
public const val `IMAPI_E_DEVICE_NOTACCESSIBLE`: Int = -2147220974;
public const val `IMAPI_E_DEVICE_NOTPRESENT`: Int = -2147220973;
public const val `IMAPI_E_DEVICE_STILL_IN_USE`: Int = -2147220954;
public const val `IMAPI_E_DISCFULL`: Int = -2147220964;
public const val `IMAPI_E_DISCINFO`: Int = -2147220967;
public const val `IMAPI_E_ENCRYPTEDSTASH`: Int = -2147220951;
public const val `IMAPI_E_FILEACCESS`: Int = -2147220968;
public const val `IMAPI_E_FILEEXISTS`: Int = -2147220956;
public const val `IMAPI_E_FILESYSTEM`: Int = -2147220969;
public const val `IMAPI_E_GENERIC`: Int = -2147220978;
public const val `IMAPI_E_INITIALIZE_ENDWRITE`: Int = -2147220970;
public const val `IMAPI_E_INITIALIZE_WRITE`: Int = -2147220971;
public const val `IMAPI_E_INVALIDIMAGE`: Int = -2147220962;
public const val `IMAPI_E_LOSS_OF_STREAMING`: Int = -2147220953;
public const val `IMAPI_E_MEDIUM_INVALIDTYPE`: Int = -2147220976;
public const val `IMAPI_E_MEDIUM_NOTPRESENT`: Int = -2147220977;
public const val `IMAPI_E_NOACTIVEFORMAT`: Int = -2147220961;
public const val `IMAPI_E_NOACTIVERECORDER`: Int = -2147220960;
public const val `IMAPI_E_NOTENOUGHDISKFORSTASH`: Int = -2147220950;
public const val `IMAPI_E_NOTINITIALIZED`: Int = -2147220980;
public const val `IMAPI_E_NOTOPENED`: Int = -2147220981;
public const val `IMAPI_E_REMOVABLESTASH`: Int = -2147220949;
public const val `IMAPI_E_STASHINUSE`: Int = -2147220955;
public const val `IMAPI_E_TRACKNOTOPEN`: Int = -2147220966;
public const val `IMAPI_E_TRACKOPEN`: Int = -2147220965;
public const val `IMAPI_E_TRACK_NOT_BIG_ENOUGH`: Int = -2147220947;
public const val `IMAPI_E_USERABORT`: Int = -2147220979;
public const val `IMAPI_E_WRONGDISC`: Int = -2147220957;
public const val `IMAPI_E_WRONGFORMAT`: Int = -2147220959;
public typealias `IMAPI_FEATURE_PAGE_TYPE` = Int;
public const val `IMAPI_FEATURE_PAGE_TYPE_AACS`: `IMAPI_FEATURE_PAGE_TYPE` = 269;
public const val `IMAPI_FEATURE_PAGE_TYPE_BD_PSEUDO_OVERWRITE`: `IMAPI_FEATURE_PAGE_TYPE` = 56;
public const val `IMAPI_FEATURE_PAGE_TYPE_BD_READ`: `IMAPI_FEATURE_PAGE_TYPE` = 64;
public const val `IMAPI_FEATURE_PAGE_TYPE_BD_WRITE`: `IMAPI_FEATURE_PAGE_TYPE` = 65;
public const val `IMAPI_FEATURE_PAGE_TYPE_CDRW_CAV_WRITE`: `IMAPI_FEATURE_PAGE_TYPE` = 39;
public const val `IMAPI_FEATURE_PAGE_TYPE_CD_ANALOG_PLAY`: `IMAPI_FEATURE_PAGE_TYPE` = 259;
public const val `IMAPI_FEATURE_PAGE_TYPE_CD_MASTERING`: `IMAPI_FEATURE_PAGE_TYPE` = 46;
public const val `IMAPI_FEATURE_PAGE_TYPE_CD_MULTIREAD`: `IMAPI_FEATURE_PAGE_TYPE` = 29;
public const val `IMAPI_FEATURE_PAGE_TYPE_CD_READ`: `IMAPI_FEATURE_PAGE_TYPE` = 30;
public const val `IMAPI_FEATURE_PAGE_TYPE_CD_RW_MEDIA_WRITE_SUPPORT`: `IMAPI_FEATURE_PAGE_TYPE` = 55;
public const val `IMAPI_FEATURE_PAGE_TYPE_CD_TRACK_AT_ONCE`: `IMAPI_FEATURE_PAGE_TYPE` = 45;
public const val `IMAPI_FEATURE_PAGE_TYPE_CORE`: `IMAPI_FEATURE_PAGE_TYPE` = 1;
public const val `IMAPI_FEATURE_PAGE_TYPE_DISC_CONTROL_BLOCKS`: `IMAPI_FEATURE_PAGE_TYPE` = 266;
public const val `IMAPI_FEATURE_PAGE_TYPE_DOUBLE_DENSITY_CD_READ`: `IMAPI_FEATURE_PAGE_TYPE` = 48;
public const val `IMAPI_FEATURE_PAGE_TYPE_DOUBLE_DENSITY_CD_RW_WRITE`: `IMAPI_FEATURE_PAGE_TYPE` = 50;
public const val `IMAPI_FEATURE_PAGE_TYPE_DOUBLE_DENSITY_CD_R_WRITE`: `IMAPI_FEATURE_PAGE_TYPE` = 49;
public const val `IMAPI_FEATURE_PAGE_TYPE_DVD_CPRM`: `IMAPI_FEATURE_PAGE_TYPE` = 267;
public const val `IMAPI_FEATURE_PAGE_TYPE_DVD_CSS`: `IMAPI_FEATURE_PAGE_TYPE` = 262;
public const val `IMAPI_FEATURE_PAGE_TYPE_DVD_DASH_WRITE`: `IMAPI_FEATURE_PAGE_TYPE` = 47;
public const val `IMAPI_FEATURE_PAGE_TYPE_DVD_PLUS_R`: `IMAPI_FEATURE_PAGE_TYPE` = 43;
public const val `IMAPI_FEATURE_PAGE_TYPE_DVD_PLUS_RW`: `IMAPI_FEATURE_PAGE_TYPE` = 42;
public const val `IMAPI_FEATURE_PAGE_TYPE_DVD_PLUS_R_DUAL_LAYER`: `IMAPI_FEATURE_PAGE_TYPE` = 59;
public const val `IMAPI_FEATURE_PAGE_TYPE_DVD_READ`: `IMAPI_FEATURE_PAGE_TYPE` = 31;
public const val `IMAPI_FEATURE_PAGE_TYPE_EMBEDDED_CHANGER`: `IMAPI_FEATURE_PAGE_TYPE` = 258;
public const val `IMAPI_FEATURE_PAGE_TYPE_ENHANCED_DEFECT_REPORTING`: `IMAPI_FEATURE_PAGE_TYPE` = 41;
public const val `IMAPI_FEATURE_PAGE_TYPE_FIRMWARE_INFORMATION`: `IMAPI_FEATURE_PAGE_TYPE` = 268;
public const val `IMAPI_FEATURE_PAGE_TYPE_FORMATTABLE`: `IMAPI_FEATURE_PAGE_TYPE` = 35;
public const val `IMAPI_FEATURE_PAGE_TYPE_HARDWARE_DEFECT_MANAGEMENT`: `IMAPI_FEATURE_PAGE_TYPE` = 36;
public const val `IMAPI_FEATURE_PAGE_TYPE_HD_DVD_READ`: `IMAPI_FEATURE_PAGE_TYPE` = 80;
public const val `IMAPI_FEATURE_PAGE_TYPE_HD_DVD_WRITE`: `IMAPI_FEATURE_PAGE_TYPE` = 81;
public const val `IMAPI_FEATURE_PAGE_TYPE_INCREMENTAL_STREAMING_WRITABLE`: `IMAPI_FEATURE_PAGE_TYPE` = 33;
public const val `IMAPI_FEATURE_PAGE_TYPE_LAYER_JUMP_RECORDING`: `IMAPI_FEATURE_PAGE_TYPE` = 51;
public const val `IMAPI_FEATURE_PAGE_TYPE_LOGICAL_UNIT_SERIAL_NUMBER`: `IMAPI_FEATURE_PAGE_TYPE` = 264;
public const val `IMAPI_FEATURE_PAGE_TYPE_MEDIA_SERIAL_NUMBER`: `IMAPI_FEATURE_PAGE_TYPE` = 265;
public const val `IMAPI_FEATURE_PAGE_TYPE_MICROCODE_UPDATE`: `IMAPI_FEATURE_PAGE_TYPE` = 260;
public const val `IMAPI_FEATURE_PAGE_TYPE_MORPHING`: `IMAPI_FEATURE_PAGE_TYPE` = 2;
public const val `IMAPI_FEATURE_PAGE_TYPE_MRW`: `IMAPI_FEATURE_PAGE_TYPE` = 40;
public const val `IMAPI_FEATURE_PAGE_TYPE_POWER_MANAGEMENT`: `IMAPI_FEATURE_PAGE_TYPE` = 256;
public const val `IMAPI_FEATURE_PAGE_TYPE_PROFILE_LIST`: `IMAPI_FEATURE_PAGE_TYPE` = 0;
public const val `IMAPI_FEATURE_PAGE_TYPE_RANDOMLY_READABLE`: `IMAPI_FEATURE_PAGE_TYPE` = 16;
public const val `IMAPI_FEATURE_PAGE_TYPE_RANDOMLY_WRITABLE`: `IMAPI_FEATURE_PAGE_TYPE` = 32;
public const val `IMAPI_FEATURE_PAGE_TYPE_REAL_TIME_STREAMING`: `IMAPI_FEATURE_PAGE_TYPE` = 263;
public const val `IMAPI_FEATURE_PAGE_TYPE_REMOVABLE_MEDIUM`: `IMAPI_FEATURE_PAGE_TYPE` = 3;
public const val `IMAPI_FEATURE_PAGE_TYPE_RESTRICTED_OVERWRITE`: `IMAPI_FEATURE_PAGE_TYPE` = 38;
public const val `IMAPI_FEATURE_PAGE_TYPE_RIGID_RESTRICTED_OVERWRITE`: `IMAPI_FEATURE_PAGE_TYPE` = 44;
public const val `IMAPI_FEATURE_PAGE_TYPE_SECTOR_ERASABLE`: `IMAPI_FEATURE_PAGE_TYPE` = 34;
public const val `IMAPI_FEATURE_PAGE_TYPE_SMART`: `IMAPI_FEATURE_PAGE_TYPE` = 257;
public const val `IMAPI_FEATURE_PAGE_TYPE_TIMEOUT`: `IMAPI_FEATURE_PAGE_TYPE` = 261;
public const val `IMAPI_FEATURE_PAGE_TYPE_VCPS`: `IMAPI_FEATURE_PAGE_TYPE` = 272;
public const val `IMAPI_FEATURE_PAGE_TYPE_WRITE_ONCE`: `IMAPI_FEATURE_PAGE_TYPE` = 37;
public const val `IMAPI_FEATURE_PAGE_TYPE_WRITE_PROTECT`: `IMAPI_FEATURE_PAGE_TYPE` = 4;
public typealias `IMAPI_FORMAT2_DATA_MEDIA_STATE` = Int;
public const val `IMAPI_FORMAT2_DATA_MEDIA_STATE_APPENDABLE`: `IMAPI_FORMAT2_DATA_MEDIA_STATE` = 4;
public const val `IMAPI_FORMAT2_DATA_MEDIA_STATE_BLANK`: `IMAPI_FORMAT2_DATA_MEDIA_STATE` = 2;
public const val `IMAPI_FORMAT2_DATA_MEDIA_STATE_DAMAGED`: `IMAPI_FORMAT2_DATA_MEDIA_STATE` = 1024;
public const val `IMAPI_FORMAT2_DATA_MEDIA_STATE_ERASE_REQUIRED`: `IMAPI_FORMAT2_DATA_MEDIA_STATE` = 2048;
public const val `IMAPI_FORMAT2_DATA_MEDIA_STATE_FINALIZED`: `IMAPI_FORMAT2_DATA_MEDIA_STATE` = 16384;
public const val `IMAPI_FORMAT2_DATA_MEDIA_STATE_FINAL_SESSION`: `IMAPI_FORMAT2_DATA_MEDIA_STATE` = 8;
public const val `IMAPI_FORMAT2_DATA_MEDIA_STATE_INFORMATIONAL_MASK`: `IMAPI_FORMAT2_DATA_MEDIA_STATE` = 15;
public const val `IMAPI_FORMAT2_DATA_MEDIA_STATE_NON_EMPTY_SESSION`: `IMAPI_FORMAT2_DATA_MEDIA_STATE` = 4096;
public const val `IMAPI_FORMAT2_DATA_MEDIA_STATE_OVERWRITE_ONLY`: `IMAPI_FORMAT2_DATA_MEDIA_STATE` = 1;
public const val `IMAPI_FORMAT2_DATA_MEDIA_STATE_RANDOMLY_WRITABLE`: `IMAPI_FORMAT2_DATA_MEDIA_STATE` = 1;
public const val `IMAPI_FORMAT2_DATA_MEDIA_STATE_UNKNOWN`: `IMAPI_FORMAT2_DATA_MEDIA_STATE` = 0;
public const val `IMAPI_FORMAT2_DATA_MEDIA_STATE_UNSUPPORTED_MASK`: `IMAPI_FORMAT2_DATA_MEDIA_STATE` = 64512;
public const val `IMAPI_FORMAT2_DATA_MEDIA_STATE_UNSUPPORTED_MEDIA`: `IMAPI_FORMAT2_DATA_MEDIA_STATE` = 32768;
public const val `IMAPI_FORMAT2_DATA_MEDIA_STATE_WRITE_PROTECTED`: `IMAPI_FORMAT2_DATA_MEDIA_STATE` = 8192;
public typealias `IMAPI_FORMAT2_DATA_WRITE_ACTION` = Int;
public const val `IMAPI_FORMAT2_DATA_WRITE_ACTION_CALIBRATING_POWER`: `IMAPI_FORMAT2_DATA_WRITE_ACTION` = 3;
public const val `IMAPI_FORMAT2_DATA_WRITE_ACTION_COMPLETED`: `IMAPI_FORMAT2_DATA_WRITE_ACTION` = 6;
public const val `IMAPI_FORMAT2_DATA_WRITE_ACTION_FINALIZATION`: `IMAPI_FORMAT2_DATA_WRITE_ACTION` = 5;
public const val `IMAPI_FORMAT2_DATA_WRITE_ACTION_FORMATTING_MEDIA`: `IMAPI_FORMAT2_DATA_WRITE_ACTION` = 1;
public const val `IMAPI_FORMAT2_DATA_WRITE_ACTION_INITIALIZING_HARDWARE`: `IMAPI_FORMAT2_DATA_WRITE_ACTION` = 2;
public const val `IMAPI_FORMAT2_DATA_WRITE_ACTION_VALIDATING_MEDIA`: `IMAPI_FORMAT2_DATA_WRITE_ACTION` = 0;
public const val `IMAPI_FORMAT2_DATA_WRITE_ACTION_VERIFYING`: `IMAPI_FORMAT2_DATA_WRITE_ACTION` = 7;
public const val `IMAPI_FORMAT2_DATA_WRITE_ACTION_WRITING_DATA`: `IMAPI_FORMAT2_DATA_WRITE_ACTION` = 4;
public typealias `IMAPI_FORMAT2_RAW_CD_DATA_SECTOR_TYPE` = Int;
public const val `IMAPI_FORMAT2_RAW_CD_SUBCODE_IS_COOKED`: `IMAPI_FORMAT2_RAW_CD_DATA_SECTOR_TYPE` = 2;
public const val `IMAPI_FORMAT2_RAW_CD_SUBCODE_IS_RAW`: `IMAPI_FORMAT2_RAW_CD_DATA_SECTOR_TYPE` = 3;
public const val `IMAPI_FORMAT2_RAW_CD_SUBCODE_PQ_ONLY`: `IMAPI_FORMAT2_RAW_CD_DATA_SECTOR_TYPE` = 1;
public typealias `IMAPI_FORMAT2_RAW_CD_WRITE_ACTION` = Int;
public const val `IMAPI_FORMAT2_RAW_CD_WRITE_ACTION_FINISHING`: `IMAPI_FORMAT2_RAW_CD_WRITE_ACTION` = 3;
public const val `IMAPI_FORMAT2_RAW_CD_WRITE_ACTION_PREPARING`: `IMAPI_FORMAT2_RAW_CD_WRITE_ACTION` = 1;
public const val `IMAPI_FORMAT2_RAW_CD_WRITE_ACTION_UNKNOWN`: `IMAPI_FORMAT2_RAW_CD_WRITE_ACTION` = 0;
public const val `IMAPI_FORMAT2_RAW_CD_WRITE_ACTION_WRITING`: `IMAPI_FORMAT2_RAW_CD_WRITE_ACTION` = 2;
public typealias `IMAPI_FORMAT2_TAO_WRITE_ACTION` = Int;
public const val `IMAPI_FORMAT2_TAO_WRITE_ACTION_FINISHING`: `IMAPI_FORMAT2_TAO_WRITE_ACTION` = 3;
public const val `IMAPI_FORMAT2_TAO_WRITE_ACTION_PREPARING`: `IMAPI_FORMAT2_TAO_WRITE_ACTION` = 1;
public const val `IMAPI_FORMAT2_TAO_WRITE_ACTION_UNKNOWN`: `IMAPI_FORMAT2_TAO_WRITE_ACTION` = 0;
public const val `IMAPI_FORMAT2_TAO_WRITE_ACTION_VERIFYING`: `IMAPI_FORMAT2_TAO_WRITE_ACTION` = 4;
public const val `IMAPI_FORMAT2_TAO_WRITE_ACTION_WRITING`: `IMAPI_FORMAT2_TAO_WRITE_ACTION` = 2;
public typealias `IMAPI_MEDIA_PHYSICAL_TYPE` = Int;
public const val `IMAPI_MEDIA_TYPE_BDR`: `IMAPI_MEDIA_PHYSICAL_TYPE` = 18;
public const val `IMAPI_MEDIA_TYPE_BDRE`: `IMAPI_MEDIA_PHYSICAL_TYPE` = 19;
public const val `IMAPI_MEDIA_TYPE_BDROM`: `IMAPI_MEDIA_PHYSICAL_TYPE` = 17;
public const val `IMAPI_MEDIA_TYPE_CDR`: `IMAPI_MEDIA_PHYSICAL_TYPE` = 2;
public const val `IMAPI_MEDIA_TYPE_CDROM`: `IMAPI_MEDIA_PHYSICAL_TYPE` = 1;
public const val `IMAPI_MEDIA_TYPE_CDRW`: `IMAPI_MEDIA_PHYSICAL_TYPE` = 3;
public const val `IMAPI_MEDIA_TYPE_DISK`: `IMAPI_MEDIA_PHYSICAL_TYPE` = 12;
public const val `IMAPI_MEDIA_TYPE_DVDDASHR`: `IMAPI_MEDIA_PHYSICAL_TYPE` = 9;
public const val `IMAPI_MEDIA_TYPE_DVDDASHRW`: `IMAPI_MEDIA_PHYSICAL_TYPE` = 10;
public const val `IMAPI_MEDIA_TYPE_DVDDASHR_DUALLAYER`: `IMAPI_MEDIA_PHYSICAL_TYPE` = 11;
public const val `IMAPI_MEDIA_TYPE_DVDPLUSR`: `IMAPI_MEDIA_PHYSICAL_TYPE` = 6;
public const val `IMAPI_MEDIA_TYPE_DVDPLUSRW`: `IMAPI_MEDIA_PHYSICAL_TYPE` = 7;
public const val `IMAPI_MEDIA_TYPE_DVDPLUSRW_DUALLAYER`: `IMAPI_MEDIA_PHYSICAL_TYPE` = 13;
public const val `IMAPI_MEDIA_TYPE_DVDPLUSR_DUALLAYER`: `IMAPI_MEDIA_PHYSICAL_TYPE` = 8;
public const val `IMAPI_MEDIA_TYPE_DVDRAM`: `IMAPI_MEDIA_PHYSICAL_TYPE` = 5;
public const val `IMAPI_MEDIA_TYPE_DVDROM`: `IMAPI_MEDIA_PHYSICAL_TYPE` = 4;
public const val `IMAPI_MEDIA_TYPE_HDDVDR`: `IMAPI_MEDIA_PHYSICAL_TYPE` = 15;
public const val `IMAPI_MEDIA_TYPE_HDDVDRAM`: `IMAPI_MEDIA_PHYSICAL_TYPE` = 16;
public const val `IMAPI_MEDIA_TYPE_HDDVDROM`: `IMAPI_MEDIA_PHYSICAL_TYPE` = 14;
public const val `IMAPI_MEDIA_TYPE_MAX`: `IMAPI_MEDIA_PHYSICAL_TYPE` = 19;
public const val `IMAPI_MEDIA_TYPE_UNKNOWN`: `IMAPI_MEDIA_PHYSICAL_TYPE` = 0;
public typealias `IMAPI_MEDIA_WRITE_PROTECT_STATE` = Int;
public typealias `IMAPI_MODE_PAGE_REQUEST_TYPE` = Int;
public const val `IMAPI_MODE_PAGE_REQUEST_TYPE_CHANGEABLE_VALUES`: `IMAPI_MODE_PAGE_REQUEST_TYPE` = 1;
public const val `IMAPI_MODE_PAGE_REQUEST_TYPE_CURRENT_VALUES`: `IMAPI_MODE_PAGE_REQUEST_TYPE` = 0;
public const val `IMAPI_MODE_PAGE_REQUEST_TYPE_DEFAULT_VALUES`: `IMAPI_MODE_PAGE_REQUEST_TYPE` = 2;
public const val `IMAPI_MODE_PAGE_REQUEST_TYPE_SAVED_VALUES`: `IMAPI_MODE_PAGE_REQUEST_TYPE` = 3;
public typealias `IMAPI_MODE_PAGE_TYPE` = Int;
public const val `IMAPI_MODE_PAGE_TYPE_CACHING`: `IMAPI_MODE_PAGE_TYPE` = 8;
public const val `IMAPI_MODE_PAGE_TYPE_INFORMATIONAL_EXCEPTIONS`: `IMAPI_MODE_PAGE_TYPE` = 28;
public const val `IMAPI_MODE_PAGE_TYPE_LEGACY_CAPABILITIES`: `IMAPI_MODE_PAGE_TYPE` = 42;
public const val `IMAPI_MODE_PAGE_TYPE_MRW`: `IMAPI_MODE_PAGE_TYPE` = 3;
public const val `IMAPI_MODE_PAGE_TYPE_POWER_CONDITION`: `IMAPI_MODE_PAGE_TYPE` = 26;
public const val `IMAPI_MODE_PAGE_TYPE_READ_WRITE_ERROR_RECOVERY`: `IMAPI_MODE_PAGE_TYPE` = 1;
public const val `IMAPI_MODE_PAGE_TYPE_TIMEOUT_AND_PROTECT`: `IMAPI_MODE_PAGE_TYPE` = 29;
public const val `IMAPI_MODE_PAGE_TYPE_WRITE_PARAMETERS`: `IMAPI_MODE_PAGE_TYPE` = 5;
public typealias `IMAPI_PROFILE_TYPE` = Int;
public const val `IMAPI_PROFILE_TYPE_AS_MO`: `IMAPI_PROFILE_TYPE` = 5;
public const val `IMAPI_PROFILE_TYPE_BD_REWRITABLE`: `IMAPI_PROFILE_TYPE` = 67;
public const val `IMAPI_PROFILE_TYPE_BD_ROM`: `IMAPI_PROFILE_TYPE` = 64;
public const val `IMAPI_PROFILE_TYPE_BD_R_RANDOM_RECORDING`: `IMAPI_PROFILE_TYPE` = 66;
public const val `IMAPI_PROFILE_TYPE_BD_R_SEQUENTIAL`: `IMAPI_PROFILE_TYPE` = 65;
public const val `IMAPI_PROFILE_TYPE_CDROM`: `IMAPI_PROFILE_TYPE` = 8;
public const val `IMAPI_PROFILE_TYPE_CD_RECORDABLE`: `IMAPI_PROFILE_TYPE` = 9;
public const val `IMAPI_PROFILE_TYPE_CD_REWRITABLE`: `IMAPI_PROFILE_TYPE` = 10;
public const val `IMAPI_PROFILE_TYPE_DDCDROM`: `IMAPI_PROFILE_TYPE` = 32;
public const val `IMAPI_PROFILE_TYPE_DDCD_RECORDABLE`: `IMAPI_PROFILE_TYPE` = 33;
public const val `IMAPI_PROFILE_TYPE_DDCD_REWRITABLE`: `IMAPI_PROFILE_TYPE` = 34;
public const val `IMAPI_PROFILE_TYPE_DVDROM`: `IMAPI_PROFILE_TYPE` = 16;
public const val `IMAPI_PROFILE_TYPE_DVD_DASH_RECORDABLE`: `IMAPI_PROFILE_TYPE` = 17;
public const val `IMAPI_PROFILE_TYPE_DVD_DASH_REWRITABLE`: `IMAPI_PROFILE_TYPE` = 19;
public const val `IMAPI_PROFILE_TYPE_DVD_DASH_RW_SEQUENTIAL`: `IMAPI_PROFILE_TYPE` = 20;
public const val `IMAPI_PROFILE_TYPE_DVD_DASH_R_DUAL_LAYER_JUMP`: `IMAPI_PROFILE_TYPE` = 22;
public const val `IMAPI_PROFILE_TYPE_DVD_DASH_R_DUAL_SEQUENTIAL`: `IMAPI_PROFILE_TYPE` = 21;
public const val `IMAPI_PROFILE_TYPE_DVD_PLUS_R`: `IMAPI_PROFILE_TYPE` = 27;
public const val `IMAPI_PROFILE_TYPE_DVD_PLUS_RW`: `IMAPI_PROFILE_TYPE` = 26;
public const val `IMAPI_PROFILE_TYPE_DVD_PLUS_RW_DUAL`: `IMAPI_PROFILE_TYPE` = 42;
public const val `IMAPI_PROFILE_TYPE_DVD_PLUS_R_DUAL`: `IMAPI_PROFILE_TYPE` = 43;
public const val `IMAPI_PROFILE_TYPE_DVD_RAM`: `IMAPI_PROFILE_TYPE` = 18;
public const val `IMAPI_PROFILE_TYPE_HD_DVD_RAM`: `IMAPI_PROFILE_TYPE` = 82;
public const val `IMAPI_PROFILE_TYPE_HD_DVD_RECORDABLE`: `IMAPI_PROFILE_TYPE` = 81;
public const val `IMAPI_PROFILE_TYPE_HD_DVD_ROM`: `IMAPI_PROFILE_TYPE` = 80;
public const val `IMAPI_PROFILE_TYPE_INVALID`: `IMAPI_PROFILE_TYPE` = 0;
public const val `IMAPI_PROFILE_TYPE_MO_ERASABLE`: `IMAPI_PROFILE_TYPE` = 3;
public const val `IMAPI_PROFILE_TYPE_MO_WRITE_ONCE`: `IMAPI_PROFILE_TYPE` = 4;
public const val `IMAPI_PROFILE_TYPE_NON_REMOVABLE_DISK`: `IMAPI_PROFILE_TYPE` = 1;
public const val `IMAPI_PROFILE_TYPE_NON_STANDARD`: `IMAPI_PROFILE_TYPE` = 65535;
public const val `IMAPI_PROFILE_TYPE_REMOVABLE_DISK`: `IMAPI_PROFILE_TYPE` = 2;
public typealias `IMAPI_READ_TRACK_ADDRESS_TYPE` = Int;
public const val `IMAPI_READ_TRACK_ADDRESS_TYPE_LBA`: `IMAPI_READ_TRACK_ADDRESS_TYPE` = 0;
public const val `IMAPI_READ_TRACK_ADDRESS_TYPE_SESSION`: `IMAPI_READ_TRACK_ADDRESS_TYPE` = 2;
public const val `IMAPI_READ_TRACK_ADDRESS_TYPE_TRACK`: `IMAPI_READ_TRACK_ADDRESS_TYPE` = 1;
public const val `IMAPI_SECTORS_PER_SECOND_AT_1X_BD`: UInt = 2195u;
public const val `IMAPI_SECTORS_PER_SECOND_AT_1X_CD`: UInt = 75u;
public const val `IMAPI_SECTORS_PER_SECOND_AT_1X_DVD`: UInt = 680u;
public const val `IMAPI_SECTORS_PER_SECOND_AT_1X_HD_DVD`: UInt = 4568u;
public const val `IMAPI_SECTOR_SIZE`: UInt = 2048u;
public const val `IMAPI_S_BUFFER_TO_SMALL`: Int = 262657;
public const val `IMAPI_S_PROPERTIESIGNORED`: Int = 262656;
public const val `IMAPI_WRITEPROTECTED_BY_CARTRIDGE`: `IMAPI_MEDIA_WRITE_PROTECT_STATE` = 2;
public const val `IMAPI_WRITEPROTECTED_BY_DISC_CONTROL_BLOCK`: `IMAPI_MEDIA_WRITE_PROTECT_STATE` = 16;
public const val `IMAPI_WRITEPROTECTED_BY_MEDIA_SPECIFIC_REASON`: `IMAPI_MEDIA_WRITE_PROTECT_STATE` = 4;
public const val `IMAPI_WRITEPROTECTED_BY_SOFTWARE_WRITE_PROTECT`: `IMAPI_MEDIA_WRITE_PROTECT_STATE` = 8;
public const val `IMAPI_WRITEPROTECTED_READ_ONLY_MEDIA`: `IMAPI_MEDIA_WRITE_PROTECT_STATE` = 16384;
public const val `IMAPI_WRITEPROTECTED_UNTIL_POWERDOWN`: `IMAPI_MEDIA_WRITE_PROTECT_STATE` = 1;
public const val `IMMPID_CPV_AFTER__`: `IMMPID_CPV_ENUM` = 32769;
public const val `IMMPID_CPV_BEFORE__`: `IMMPID_CPV_ENUM` = 32767;
public typealias `IMMPID_CPV_ENUM` = Int;
public const val `IMMPID_CP_START`: `IMMPID_CPV_ENUM` = 32768;
public const val `IMMPID_MPV_AFTER__`: `IMMPID_MPV_ENUM` = 12294;
public const val `IMMPID_MPV_BEFORE__`: `IMMPID_MPV_ENUM` = 12287;
public typealias `IMMPID_MPV_ENUM` = Int;
public const val `IMMPID_MPV_MESSAGE_CREATION_FLAGS`: `IMMPID_MPV_ENUM` = 12289;
public const val `IMMPID_MPV_MESSAGE_OPEN_HANDLES`: `IMMPID_MPV_ENUM` = 12290;
public const val `IMMPID_MPV_STORE_DRIVER_HANDLE`: `IMMPID_MPV_ENUM` = 12288;
public const val `IMMPID_MPV_TOTAL_OPEN_CONTENT_HANDLES`: `IMMPID_MPV_ENUM` = 12293;
public const val `IMMPID_MPV_TOTAL_OPEN_HANDLES`: `IMMPID_MPV_ENUM` = 12291;
public const val `IMMPID_MPV_TOTAL_OPEN_PROPERTY_STREAM_HANDLES`: `IMMPID_MPV_ENUM` = 12292;
public const val `IMMPID_MP_AFTER__`: `IMMPID_MP_ENUM` = 4153;
public const val `IMMPID_MP_ARRIVAL_FILETIME`: `IMMPID_MP_ENUM` = 4121;
public const val `IMMPID_MP_ARRIVAL_TIME`: `IMMPID_MP_ENUM` = 4115;
public const val `IMMPID_MP_AUTHENTICATED_USER_NAME`: `IMMPID_MP_ENUM` = 4104;
public const val `IMMPID_MP_BEFORE__`: `IMMPID_MP_ENUM` = 4095;
public const val `IMMPID_MP_BINARYMIME_OPTION`: `IMMPID_MP_ENUM` = 4109;
public const val `IMMPID_MP_CHUNKING_OPTION`: `IMMPID_MP_ENUM` = 4108;
public const val `IMMPID_MP_CLIENT_AUTH_TYPE`: `IMMPID_MP_ENUM` = 4149;
public const val `IMMPID_MP_CLIENT_AUTH_USER`: `IMMPID_MP_ENUM` = 4148;
public const val `IMMPID_MP_CONNECTION_IP_ADDRESS`: `IMMPID_MP_ENUM` = 4105;
public const val `IMMPID_MP_CONNECTION_SERVER_IP_ADDRESS`: `IMMPID_MP_ENUM` = 4134;
public const val `IMMPID_MP_CONNECTION_SERVER_PORT`: `IMMPID_MP_ENUM` = 4147;
public const val `IMMPID_MP_CONTENT_FILE_NAME`: `IMMPID_MP_ENUM` = 4097;
public const val `IMMPID_MP_CONTENT_TYPE`: `IMMPID_MP_ENUM` = 4145;
public const val `IMMPID_MP_CRC_GLOBAL`: `IMMPID_MP_ENUM` = 4150;
public const val `IMMPID_MP_CRC_RECIPS`: `IMMPID_MP_ENUM` = 4151;
public const val `IMMPID_MP_DEFERRED_DELIVERY_FILETIME`: `IMMPID_MP_ENUM` = 4141;
public const val `IMMPID_MP_DOMAIN_LIST`: `IMMPID_MP_ENUM` = 4102;
public const val `IMMPID_MP_DSN_ENVID_VALUE`: `IMMPID_MP_ENUM` = 4112;
public const val `IMMPID_MP_DSN_RET_VALUE`: `IMMPID_MP_ENUM` = 4113;
public const val `IMMPID_MP_EIGHTBIT_MIME_OPTION`: `IMMPID_MP_ENUM` = 4107;
public const val `IMMPID_MP_ENCRYPTION_TYPE`: `IMMPID_MP_ENUM` = 4146;
public typealias `IMMPID_MP_ENUM` = Int;
public const val `IMMPID_MP_ERROR_CODE`: `IMMPID_MP_ENUM` = 4111;
public const val `IMMPID_MP_EXPIRE_DELAY`: `IMMPID_MP_ENUM` = 4117;
public const val `IMMPID_MP_EXPIRE_NDR`: `IMMPID_MP_ENUM` = 4118;
public const val `IMMPID_MP_FOUND_EMBEDDED_CRLF_DOT_CRLF`: `IMMPID_MP_ENUM` = 4126;
public const val `IMMPID_MP_FROM_ADDRESS`: `IMMPID_MP_ENUM` = 4139;
public const val `IMMPID_MP_HELO_DOMAIN`: `IMMPID_MP_ENUM` = 4106;
public const val `IMMPID_MP_HR_CAT_STATUS`: `IMMPID_MP_ENUM` = 4122;
public const val `IMMPID_MP_INBOUND_MAIL_FROM_AUTH`: `IMMPID_MP_ENUM` = 4152;
public const val `IMMPID_MP_LOCAL_EXPIRE_DELAY`: `IMMPID_MP_ENUM` = 4119;
public const val `IMMPID_MP_LOCAL_EXPIRE_NDR`: `IMMPID_MP_ENUM` = 4120;
public const val `IMMPID_MP_MESSAGE_STATUS`: `IMMPID_MP_ENUM` = 4116;
public const val `IMMPID_MP_MSGCLASS`: `IMMPID_MP_ENUM` = 4144;
public const val `IMMPID_MP_MSG_GUID`: `IMMPID_MP_ENUM` = 4123;
public const val `IMMPID_MP_MSG_SIZE_HINT`: `IMMPID_MP_ENUM` = 4127;
public const val `IMMPID_MP_NUM_RECIPIENTS`: `IMMPID_MP_ENUM` = 4137;
public const val `IMMPID_MP_ORIGINAL_ARRIVAL_TIME`: `IMMPID_MP_ENUM` = 4143;
public const val `IMMPID_MP_PICKUP_FILE_NAME`: `IMMPID_MP_ENUM` = 4103;
public const val `IMMPID_MP_RECIPIENT_LIST`: `IMMPID_MP_ENUM` = 4096;
public const val `IMMPID_MP_REMOTE_AUTHENTICATION_TYPE`: `IMMPID_MP_ENUM` = 4110;
public const val `IMMPID_MP_REMOTE_SERVER_DSN_CAPABLE`: `IMMPID_MP_ENUM` = 4114;
public const val `IMMPID_MP_RFC822_BCC_ADDRESS`: `IMMPID_MP_ENUM` = 4133;
public const val `IMMPID_MP_RFC822_CC_ADDRESS`: `IMMPID_MP_ENUM` = 4132;
public const val `IMMPID_MP_RFC822_FROM_ADDRESS`: `IMMPID_MP_ENUM` = 4130;
public const val `IMMPID_MP_RFC822_MSG_ID`: `IMMPID_MP_ENUM` = 4128;
public const val `IMMPID_MP_RFC822_MSG_SUBJECT`: `IMMPID_MP_ENUM` = 4129;
public const val `IMMPID_MP_RFC822_TO_ADDRESS`: `IMMPID_MP_ENUM` = 4131;
public const val `IMMPID_MP_SCANNED_FOR_CRLF_DOT_CRLF`: `IMMPID_MP_ENUM` = 4125;
public const val `IMMPID_MP_SENDER_ADDRESS`: `IMMPID_MP_ENUM` = 4140;
public const val `IMMPID_MP_SENDER_ADDRESS_LEGACY_EX_DN`: `IMMPID_MP_ENUM` = 4101;
public const val `IMMPID_MP_SENDER_ADDRESS_OTHER`: `IMMPID_MP_ENUM` = 4142;
public const val `IMMPID_MP_SENDER_ADDRESS_SMTP`: `IMMPID_MP_ENUM` = 4098;
public const val `IMMPID_MP_SENDER_ADDRESS_X400`: `IMMPID_MP_ENUM` = 4100;
public const val `IMMPID_MP_SENDER_ADDRESS_X500`: `IMMPID_MP_ENUM` = 4099;
public const val `IMMPID_MP_SERVER_NAME`: `IMMPID_MP_ENUM` = 4135;
public const val `IMMPID_MP_SERVER_VERSION`: `IMMPID_MP_ENUM` = 4136;
public const val `IMMPID_MP_SUPERSEDES_MSG_GUID`: `IMMPID_MP_ENUM` = 4124;
public const val `IMMPID_MP_X_PRIORITY`: `IMMPID_MP_ENUM` = 4138;
public const val `IMMPID_NMP_AFTER__`: `IMMPID_NMP_ENUM` = 24585;
public const val `IMMPID_NMP_BEFORE__`: `IMMPID_NMP_ENUM` = 24575;
public typealias `IMMPID_NMP_ENUM` = Int;
public const val `IMMPID_NMP_HEADERS`: `IMMPID_NMP_ENUM` = 24582;
public const val `IMMPID_NMP_NEWSGROUP_LIST`: `IMMPID_NMP_ENUM` = 24581;
public const val `IMMPID_NMP_NNTP_APPROVED_HEADER`: `IMMPID_NMP_ENUM` = 24584;
public const val `IMMPID_NMP_NNTP_PROCESSING`: `IMMPID_NMP_ENUM` = 24583;
public const val `IMMPID_NMP_POST_TOKEN`: `IMMPID_NMP_ENUM` = 24580;
public const val `IMMPID_NMP_PRIMARY_ARTID`: `IMMPID_NMP_ENUM` = 24579;
public const val `IMMPID_NMP_PRIMARY_GROUP`: `IMMPID_NMP_ENUM` = 24578;
public const val `IMMPID_NMP_SECONDARY_ARTNUM`: `IMMPID_NMP_ENUM` = 24577;
public const val `IMMPID_NMP_SECONDARY_GROUPS`: `IMMPID_NMP_ENUM` = 24576;
public const val `IMMPID_RPV_AFTER__`: `IMMPID_RPV_ENUM` = 16386;
public const val `IMMPID_RPV_BEFORE__`: `IMMPID_RPV_ENUM` = 16383;
public const val `IMMPID_RPV_DONT_DELIVER`: `IMMPID_RPV_ENUM` = 16384;
public typealias `IMMPID_RPV_ENUM` = Int;
public const val `IMMPID_RPV_NO_NAME_COLLISIONS`: `IMMPID_RPV_ENUM` = 16385;
public const val `IMMPID_RP_ADDRESS`: `IMMPID_RP_ENUM` = 8195;
public const val `IMMPID_RP_ADDRESS_OTHER`: `IMMPID_RP_ENUM` = 8211;
public const val `IMMPID_RP_ADDRESS_SMTP`: `IMMPID_RP_ENUM` = 8201;
public const val `IMMPID_RP_ADDRESS_TYPE`: `IMMPID_RP_ENUM` = 8194;
public const val `IMMPID_RP_ADDRESS_TYPE_SMTP`: `IMMPID_RP_ENUM` = 8196;
public const val `IMMPID_RP_ADDRESS_X400`: `IMMPID_RP_ENUM` = 8202;
public const val `IMMPID_RP_ADDRESS_X500`: `IMMPID_RP_ENUM` = 8203;
public const val `IMMPID_RP_AFTER__`: `IMMPID_RP_ENUM` = 8213;
public const val `IMMPID_RP_BEFORE__`: `IMMPID_RP_ENUM` = 8191;
public const val `IMMPID_RP_DISPLAY_NAME`: `IMMPID_RP_ENUM` = 8212;
public const val `IMMPID_RP_DOMAIN`: `IMMPID_RP_ENUM` = 8210;
public const val `IMMPID_RP_DSN_NOTIFY_INVALID`: `IMMPID_RP_ENUM` = 8193;
public const val `IMMPID_RP_DSN_NOTIFY_SUCCESS`: `IMMPID_RP_ENUM` = 8192;
public const val `IMMPID_RP_DSN_NOTIFY_VALUE`: `IMMPID_RP_ENUM` = 8199;
public const val `IMMPID_RP_DSN_ORCPT_VALUE`: `IMMPID_RP_ENUM` = 8200;
public const val `IMMPID_RP_DSN_PRE_CAT_ADDRESS`: `IMMPID_RP_ENUM` = 8207;
public typealias `IMMPID_RP_ENUM` = Int;
public const val `IMMPID_RP_ERROR_CODE`: `IMMPID_RP_ENUM` = 8197;
public const val `IMMPID_RP_ERROR_STRING`: `IMMPID_RP_ENUM` = 8198;
public const val `IMMPID_RP_LEGACY_EX_DN`: `IMMPID_RP_ENUM` = 8204;
public const val `IMMPID_RP_MDB_GUID`: `IMMPID_RP_ENUM` = 8208;
public const val `IMMPID_RP_RECIPIENT_FLAGS`: `IMMPID_RP_ENUM` = 8205;
public const val `IMMPID_RP_SMTP_STATUS_STRING`: `IMMPID_RP_ENUM` = 8206;
public const val `IMMPID_RP_USER_GUID`: `IMMPID_RP_ENUM` = 8209;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMMP_MPV_STORE_DRIVER_HANDLE` (
    public var `guidSignature`: `windows_sys`.`core`.`GUID`,
)
public typealias `LPMSGSESS` = Long;
public const val `MEDIA_BLANK`: `MEDIA_FLAGS` = 1;
public const val `MEDIA_CDDA_CDROM`: `MEDIA_TYPES` = 1;
public const val `MEDIA_CD_EXTRA`: `MEDIA_TYPES` = 4;
public const val `MEDIA_CD_I`: `MEDIA_TYPES` = 3;
public const val `MEDIA_CD_OTHER`: `MEDIA_TYPES` = 5;
public const val `MEDIA_CD_ROM_XA`: `MEDIA_TYPES` = 2;
public typealias `MEDIA_FLAGS` = Int;
public const val `MEDIA_FORMAT_UNUSABLE_BY_IMAPI`: `MEDIA_FLAGS` = 8;
public const val `MEDIA_RW`: `MEDIA_FLAGS` = 2;
public const val `MEDIA_SPECIAL`: `MEDIA_TYPES` = 6;
public typealias `MEDIA_TYPES` = Int;
public const val `MEDIA_WRITABLE`: `MEDIA_FLAGS` = 4;
public const val `MPV_INBOUND_CUTOFF_EXCEEDED`: UInt = 1u;
public const val `MPV_WRITE_CONTENT`: UInt = 2u;
public const val `MP_MSGCLASS_DELIVERY_REPORT`: UInt = 3u;
public const val `MP_MSGCLASS_NONDELIVERY_REPORT`: UInt = 4u;
public const val `MP_MSGCLASS_REPLICATION`: UInt = 2u;
public const val `MP_MSGCLASS_SYSTEM`: UInt = 1u;
public const val `MP_STATUS_ABANDON_DELIVERY`: UInt = 6u;
public const val `MP_STATUS_ABORT_DELIVERY`: UInt = 2u;
public const val `MP_STATUS_BAD_MAIL`: UInt = 3u;
public const val `MP_STATUS_CATEGORIZED`: UInt = 5u;
public const val `MP_STATUS_RETRY`: UInt = 1u;
public const val `MP_STATUS_SUBMITTED`: UInt = 4u;
public const val `MP_STATUS_SUCCESS`: UInt = 0u;
// UNSUPPORTED Rust 617:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const MSDiscMasterObj: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x520cca63_51a5_11d3_9144_00104ba11c5e);

// UNSUPPORTED Rust 618:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const MSDiscRecorderObj: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x520cca61_51a5_11d3_9144_00104ba11c5e);

// UNSUPPORTED Rust 619:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const MSEnumDiscRecordersObj: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8a03567a_63cb_4ba8_baf6_52119816d1ef);

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_AddressBook")]
public typealias `MSGCALLRELEASE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// UNSUPPORTED Rust 622:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const MsftDiscFormat2Data: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2735412a_7f64_5b0f_8f00_5d77afbe261e);

// UNSUPPORTED Rust 623:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const MsftDiscFormat2Erase: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2735412b_7f64_5b0f_8f00_5d77afbe261e);

// UNSUPPORTED Rust 624:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const MsftDiscFormat2RawCD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x27354128_7f64_5b0f_8f00_5d77afbe261e);

// UNSUPPORTED Rust 625:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const MsftDiscFormat2TrackAtOnce: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x27354129_7f64_5b0f_8f00_5d77afbe261e);

// UNSUPPORTED Rust 626:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const MsftDiscMaster2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2735412e_7f64_5b0f_8f00_5d77afbe261e);

// UNSUPPORTED Rust 627:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const MsftDiscRecorder2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2735412d_7f64_5b0f_8f00_5d77afbe261e);

// UNSUPPORTED Rust 628:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const MsftFileSystemImage: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2c941fc5_975b_59be_a960_9a2a262853a5);

// UNSUPPORTED Rust 629:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const MsftIsoImageManager: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xceee3b62_8f56_4056_869b_ef16917e3efc);

// UNSUPPORTED Rust 630:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const MsftMultisessionRandomWrite: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb507ca24_2204_11dd_966a_001aa01bbc58);

// UNSUPPORTED Rust 631:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const MsftMultisessionSequential: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x27354122_7f64_5b0f_8f00_5d77afbe261e);

// UNSUPPORTED Rust 632:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const MsftRawCDImageCreator: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x25983561_9d65_49ce_b335_40630d901227);

// UNSUPPORTED Rust 633:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const MsftStreamConcatenate: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x27354125_7f64_5b0f_8f00_5d77afbe261e);

// UNSUPPORTED Rust 634:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const MsftStreamInterleave: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x27354124_7f64_5b0f_8f00_5d77afbe261e);

// UNSUPPORTED Rust 635:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const MsftStreamPrng001: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x27354126_7f64_5b0f_8f00_5d77afbe261e);

// UNSUPPORTED Rust 636:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const MsftStreamZero: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x27354127_7f64_5b0f_8f00_5d77afbe261e);

// UNSUPPORTED Rust 637:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const MsftWriteEngine2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2735412c_7f64_5b0f_8f00_5d77afbe261e);

// UNSUPPORTED Rust 638:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const MsftWriteSpeedDescriptor: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x27354123_7f64_5b0f_8f00_5d77afbe261e);

public const val `NMP_PROCESS_CONTROL`: UInt = 2u;
public const val `NMP_PROCESS_MODERATOR`: UInt = 4u;
public const val `NMP_PROCESS_POST`: UInt = 1u;
public const val `PlatformEFI`: `PlatformId` = 239;
public typealias `PlatformId` = Int;
public const val `PlatformMac`: `PlatformId` = 2;
public const val `PlatformPowerPC`: `PlatformId` = 1;
public const val `PlatformX86`: `PlatformId` = 0;
// UNSUPPORTED Rust 647:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const ProgressItem: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2c941fcb_975b_59be_a960_9a2a262853a5);

// UNSUPPORTED Rust 648:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const ProgressItems: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2c941fc9_975b_59be_a960_9a2a262853a5);

public const val `RECORDER_BURNING`: `DISC_RECORDER_STATE_FLAGS` = 2u;
public const val `RECORDER_CDR`: `RECORDER_TYPES` = 1;
public const val `RECORDER_CDRW`: `RECORDER_TYPES` = 2;
public const val `RECORDER_DOING_NOTHING`: `DISC_RECORDER_STATE_FLAGS` = 0u;
public const val `RECORDER_OPENED`: `DISC_RECORDER_STATE_FLAGS` = 1u;
public typealias `RECORDER_TYPES` = Int;
public const val `RP_DELIVERED`: UInt = 272u;
public const val `RP_DSN_HANDLED`: UInt = 64u;
public const val `RP_DSN_NOTIFY_DELAY`: UInt = 67108864u;
public const val `RP_DSN_NOTIFY_FAILURE`: UInt = 33554432u;
public const val `RP_DSN_NOTIFY_INVALID`: UInt = 0u;
public const val `RP_DSN_NOTIFY_MASK`: UInt = 251658240u;
public const val `RP_DSN_NOTIFY_NEVER`: UInt = 134217728u;
public const val `RP_DSN_NOTIFY_SUCCESS`: UInt = 16777216u;
public const val `RP_DSN_SENT_DELAYED`: UInt = 16384u;
public const val `RP_DSN_SENT_DELIVERED`: UInt = 131136u;
public const val `RP_DSN_SENT_EXPANDED`: UInt = 32832u;
public const val `RP_DSN_SENT_NDR`: UInt = 1104u;
public const val `RP_DSN_SENT_RELAYED`: UInt = 65600u;
public const val `RP_ENPANDED`: UInt = 8208u;
public const val `RP_ERROR_CONTEXT_CAT`: UInt = 2097152u;
public const val `RP_ERROR_CONTEXT_MTA`: UInt = 4194304u;
public const val `RP_ERROR_CONTEXT_STORE`: UInt = 1048576u;
public const val `RP_EXPANDED`: UInt = 8208u;
public const val `RP_FAILED`: UInt = 2096u;
public const val `RP_GENERAL_FAILURE`: UInt = 32u;
public const val `RP_HANDLED`: UInt = 16u;
public const val `RP_RECIP_FLAGS_RESERVED`: UInt = 15u;
public const val `RP_REMOTE_MTA_NO_DSN`: UInt = 524288u;
public const val `RP_UNRESOLVED`: UInt = 4144u;
public const val `RP_VOLATILE_FLAGS_MASK`: UInt = 4026531840u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SPropAttrArray` (
    public var `cValues`: UInt,
    public var `aPropAttr`: UIntArray,
)
// UNSUPPORTED Rust 686:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SPropAttrArray {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SZ_PROGID_SMTPCAT`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("Smtp.Cat");
// UNSUPPORTED Rust 692:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const tagIMMPID_CPV_STRUCT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa2a76b2a_e52d_11d1_aa64_00c04fa35b82);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `tagIMMPID_GUIDLIST_ITEM` (
    public var `pguid`: /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `dwStart`: UInt,
    public var `dwLast`: UInt,
)
// UNSUPPORTED Rust 700:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for tagIMMPID_GUIDLIST_ITEM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 705:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const tagIMMPID_MPV_STRUCT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcbe69706_c9bd_11d1_9ff2_00c04fa37348);

// UNSUPPORTED Rust 706:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const tagIMMPID_MP_STRUCT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x13384cf0_b3c4_11d1_aa92_00aa006bc80b);

// UNSUPPORTED Rust 707:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const tagIMMPID_NMP_STRUCT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7433a9aa_20e2_11d2_94d6_00c04fa379f1);

// UNSUPPORTED Rust 708:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const tagIMMPID_RPV_STRUCT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x79e82049_d320_11d1_9ff4_00c04fa37348);

// UNSUPPORTED Rust 709:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const tagIMMPID_RP_STRUCT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x79e82048_d320_11d1_9ff4_00c04fa37348);

