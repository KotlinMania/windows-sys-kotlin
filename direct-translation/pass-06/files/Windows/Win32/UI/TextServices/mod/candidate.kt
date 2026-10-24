// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msctfmonitor.dll, ABI=system, export=DoMsCtfMonitor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DoMsCtfMonitor`(`dwflags` : UInt, `heventforservicestop` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msctfmonitor.dll, ABI=system, export=InitLocalMsCtfMonitor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InitLocalMsCtfMonitor`(`dwflags` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msctfmonitor.dll, ABI=system, export=UninitLocalMsCtfMonitor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UninitLocalMsCtfMonitor`() : `windows_sys`.`core`.`HRESULT`
public typealias `ANCHOR_CHANGE_HISTORY_FLAGS` = UInt;
// UNSUPPORTED Rust 5:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const AccClientDocMgr: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfc48cc30_4f3e_4fa1_803b_ad0e196a83b1);

// UNSUPPORTED Rust 6:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const AccDictionary: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6572ee16_5fe5_4331_bb6d_76a49c56e423);

// UNSUPPORTED Rust 7:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const AccServerDocMgr: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6089a37e_eb8a_482d_bd6f_f9f46904d16d);

// UNSUPPORTED Rust 8:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const AccStore: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5440837f_4bff_4ae5_a1b1_7722ecc6332a);

public const val `CAND_CANCELED`: `TfCandidateResult` = 2;
public const val `CAND_FINALIZED`: `TfCandidateResult` = 0;
public const val `CAND_SELECTED`: `TfCandidateResult` = 1;
// UNSUPPORTED Rust 12:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_TF_CategoryMgr: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa4b544a1_438d_4b41_9325_869523e2d6c7);

// UNSUPPORTED Rust 13:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_TF_ClassicLangBar: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3318360c_1afc_4d09_a86b_9f9cb6dceb9c);

// UNSUPPORTED Rust 14:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_TF_DisplayAttributeMgr: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3ce74de4_53d3_4d74_8b83_431b3828ba53);

// UNSUPPORTED Rust 15:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_TF_InputProcessorProfiles: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x33c53a50_f456_4884_b049_85fd643ecfed);

// UNSUPPORTED Rust 16:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_TF_LangBarItemMgr: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb9931692_a2b3_4fab_bf33_9ec6f9fb96ac);

// UNSUPPORTED Rust 17:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_TF_LangBarMgr: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xebb08c45_6c4a_4fdc_ae53_4eb8c4c7db8e);

// UNSUPPORTED Rust 18:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_TF_ThreadMgr: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x529a9e6b_6587_4f23_ab9e_9c7d683e3c50);

// UNSUPPORTED Rust 19:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_TF_TransitoryExtensionUIEntry: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xae6be008_07fb_400d_8beb_337a64f7051f);

// UNSUPPORTED Rust 20:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_TsfServices: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x39aedc00_6b60_46db_8d31_3642be0e4373);

public const val `DCM_FLAGS_CTFMON`: UInt = 2u;
public const val `DCM_FLAGS_LOCALTHREADTSF`: UInt = 4u;
public const val `DCM_FLAGS_TASKENG`: UInt = 1u;
// UNSUPPORTED Rust 24:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const DocWrap: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbf426f7e_7a5e_44d6_830c_a390ea9462a3);

public const val `GETIF_DICTGRAM`: `TfSapiObject` = 4;
public const val `GETIF_RECOCONTEXT`: `TfSapiObject` = 1;
public const val `GETIF_RECOGNIZER`: `TfSapiObject` = 2;
public const val `GETIF_RECOGNIZERNOINIT`: `TfSapiObject` = 5;
public const val `GETIF_RESMGR`: `TfSapiObject` = 0;
public const val `GETIF_VOICE`: `TfSapiObject` = 3;
public typealias `GET_TEXT_AND_PROPERTY_UPDATES_FLAGS` = UInt;
// UNSUPPORTED Rust 32:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_APP_FUNCTIONPROVIDER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4caef01e_12af_4b0e_9db1_a6ec5b881208);

// UNSUPPORTED Rust 33:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_COMPARTMENT_CONVERSIONMODEBIAS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5497f516_ee91_436e_b946_aa2c05f1ac5b);

// UNSUPPORTED Rust 34:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_COMPARTMENT_EMPTYCONTEXT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd7487dbf_804e_41c5_894d_ad96fd4eea13);

// UNSUPPORTED Rust 35:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_COMPARTMENT_ENABLED_PROFILES_UPDATED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x92c1fd48_a9ae_4a7c_be08_4329e4723817);

// UNSUPPORTED Rust 36:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_COMPARTMENT_HANDWRITING_OPENCLOSE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf9ae2c6b_1866_4361_af72_7aa30948890e);

// UNSUPPORTED Rust 37:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_COMPARTMENT_KEYBOARD_DISABLED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x71a5b253_1951_466b_9fbc_9c8808fa84f2);

// UNSUPPORTED Rust 38:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_COMPARTMENT_KEYBOARD_INPUTMODE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb6592511_bcee_4122_a7c4_09f4b3fa4396);

// UNSUPPORTED Rust 39:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_COMPARTMENT_KEYBOARD_INPUTMODE_CONVERSION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xccf05dd8_4a87_11d7_a6e2_00065b84435c);

// UNSUPPORTED Rust 40:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_COMPARTMENT_KEYBOARD_INPUTMODE_SENTENCE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xccf05dd9_4a87_11d7_a6e2_00065b84435c);

// UNSUPPORTED Rust 41:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_COMPARTMENT_KEYBOARD_OPENCLOSE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x58273aad_01bb_4164_95c6_755ba0b5162d);

// UNSUPPORTED Rust 42:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_COMPARTMENT_SAPI_AUDIO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x51af2086_cc6b_457d_b5aa_8b19dc290ab4);

// UNSUPPORTED Rust 43:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_COMPARTMENT_SPEECH_CFGMENU: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfb6c5c2d_4e83_4bb6_91a2_e019bff6762d);

// UNSUPPORTED Rust 44:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_COMPARTMENT_SPEECH_DISABLED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x56c5c607_0703_4e59_8e52_cbc84e8bbe35);

// UNSUPPORTED Rust 45:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_COMPARTMENT_SPEECH_GLOBALSTATE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2a54fe8e_0d08_460c_a75d_87035ff436c5);

// UNSUPPORTED Rust 46:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_COMPARTMENT_SPEECH_OPENCLOSE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x544d6a63_e2e8_4752_bbd1_000960bca083);

// UNSUPPORTED Rust 47:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_COMPARTMENT_SPEECH_UI_STATUS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd92016f0_9367_4fe7_9abf_bc59dacbe0e3);

// UNSUPPORTED Rust 48:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_COMPARTMENT_TIPUISTATUS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x148ca3ec_0366_401c_8d75_ed978d85fbc9);

// UNSUPPORTED Rust 49:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_COMPARTMENT_TRANSITORYEXTENSION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8be347f5_c7a0_11d7_b408_00065b84435c);

// UNSUPPORTED Rust 50:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_COMPARTMENT_TRANSITORYEXTENSION_DOCUMENTMANAGER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8be347f7_c7a0_11d7_b408_00065b84435c);

// UNSUPPORTED Rust 51:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_COMPARTMENT_TRANSITORYEXTENSION_PARENT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8be347f8_c7a0_11d7_b408_00065b84435c);

// UNSUPPORTED Rust 52:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_INTEGRATIONSTYLE_SEARCHBOX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe6d1bd11_82f7_4903_ae21_1a6397cde2eb);

// UNSUPPORTED Rust 53:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_LBI_INPUTMODE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2c77a81e_41cc_4178_a3a7_5f8a987568e6);

// UNSUPPORTED Rust 54:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_LBI_SAPILAYR_CFGMENUBUTTON: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd02f24a1_942d_422e_8d99_b4f2addee999);

// UNSUPPORTED Rust 55:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_MODEBIAS_CHINESE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7add26de_4328_489b_83ae_6493750cad5c);

// UNSUPPORTED Rust 56:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_MODEBIAS_CONVERSATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0f4ec104_1790_443b_95f1_e10f939d6546);

// UNSUPPORTED Rust 57:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_MODEBIAS_DATETIME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2bdb372_7f61_4039_92ef_1c35599f0222);

// UNSUPPORTED Rust 58:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_MODEBIAS_FILENAME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd7f707fe_44c6_4fca_8e76_86ab50c7931b);

// UNSUPPORTED Rust 59:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_MODEBIAS_FULLWIDTHALPHANUMERIC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x81489fb8_b36a_473d_8146_e4a2258b24ae);

// UNSUPPORTED Rust 60:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_MODEBIAS_FULLWIDTHHANGUL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc01ae6c9_45b5_4fd0_9cb1_9f4cebc39fea);

// UNSUPPORTED Rust 61:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_MODEBIAS_HALFWIDTHKATAKANA: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x005f6b63_78d4_41cc_8859_485ca821a795);

// UNSUPPORTED Rust 62:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_MODEBIAS_HANGUL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x76ef0541_23b3_4d77_a074_691801ccea17);

// UNSUPPORTED Rust 63:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_MODEBIAS_HIRAGANA: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd73d316e_9b91_46f1_a280_31597f52c694);

// UNSUPPORTED Rust 64:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_MODEBIAS_KATAKANA: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2e0eeddd_3a1a_499e_8543_3c7ee7949811);

// UNSUPPORTED Rust 65:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_MODEBIAS_NAME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfddc10f0_d239_49bf_b8fc_5410caaa427e);

// UNSUPPORTED Rust 66:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_MODEBIAS_NONE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_0000_0000_0000_000000000000);

// UNSUPPORTED Rust 67:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_MODEBIAS_NUMERIC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4021766c_e872_48fd_9cee_4ec5c75e16c3);

// UNSUPPORTED Rust 68:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_MODEBIAS_READING: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe31643a3_6466_4cbf_8d8b_0bd4d8545461);

// UNSUPPORTED Rust 69:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_MODEBIAS_URLHISTORY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8b0e54d9_63f2_4c68_84d4_79aee7a59f09);

// UNSUPPORTED Rust 70:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_PROP_ATTRIBUTE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x34b45670_7526_11d2_a147_00105a2799b5);

// UNSUPPORTED Rust 71:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_PROP_COMPOSING: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe12ac060_af15_11d2_afc5_00105a2799b5);

// UNSUPPORTED Rust 72:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_PROP_INPUTSCOPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1713dd5a_68e7_4a5b_9af6_592a595c778d);

// UNSUPPORTED Rust 73:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_PROP_LANGID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3280ce20_8032_11d2_b603_00105a2799b5);

// UNSUPPORTED Rust 74:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_PROP_MODEBIAS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x372e0716_974f_40ac_a088_08cdc92ebfbc);

// UNSUPPORTED Rust 75:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_PROP_READING: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5463f7c0_8e31_11d2_bf46_00105a2799b5);

// UNSUPPORTED Rust 76:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_PROP_TEXTOWNER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf1e2d520_0969_11d3_8df0_00105a2799b5);

// UNSUPPORTED Rust 77:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_PROP_TKB_ALTERNATES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x70b2a803_968d_462e_b93b_2164c91517f7);

// UNSUPPORTED Rust 78:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_SYSTEM_FUNCTIONPROVIDER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9a698bb0_0f21_11d3_8df1_00105a2799b5);

// UNSUPPORTED Rust 79:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_TFCAT_CATEGORY_OF_TIP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x534c48c1_0607_4098_a521_4fc899c73e90);

// UNSUPPORTED Rust 80:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_TFCAT_DISPLAYATTRIBUTEPROPERTY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb95f181b_ea4c_4af1_8056_7c321abbb091);

// UNSUPPORTED Rust 81:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_TFCAT_DISPLAYATTRIBUTEPROVIDER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x046b8c80_1647_40f7_9b21_b93b81aabc1b);

// UNSUPPORTED Rust 82:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_TFCAT_PROPSTYLE_STATIC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x565fb8d8_6bd4_4ca1_b223_0f2ccb8f4f96);

// UNSUPPORTED Rust 83:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_TFCAT_PROP_AUDIODATA: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9b7be3a9_e8ab_4d47_a8fe_254fa423436d);

// UNSUPPORTED Rust 84:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_TFCAT_PROP_INKDATA: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7c6a82ae_b0d7_4f14_a745_14f28b009d61);

// UNSUPPORTED Rust 85:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_TFCAT_TIPCAP_COMLESS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x364215d9_75bc_11d7_a6ef_00065b84435c);

// UNSUPPORTED Rust 86:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_TFCAT_TIPCAP_DUALMODE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3af314a2_d79f_4b1b_9992_15086d339b05);

// UNSUPPORTED Rust 87:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_TFCAT_TIPCAP_IMMERSIVEONLY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3a4259ac_640d_4ad4_89f7_1eb67e7c4ee8);

// UNSUPPORTED Rust 88:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_TFCAT_TIPCAP_IMMERSIVESUPPORT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x13a016df_560b_46cd_947a_4c3af1e0e35d);

// UNSUPPORTED Rust 89:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_TFCAT_TIPCAP_INPUTMODECOMPARTMENT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xccf05dd7_4a87_11d7_a6e2_00065b84435c);

// UNSUPPORTED Rust 90:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_TFCAT_TIPCAP_LOCALSERVER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x74769ee9_4a66_4f9d_90d6_bf8b7c3eb461);

// UNSUPPORTED Rust 91:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_TFCAT_TIPCAP_SECUREMODE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x49d2f9ce_1f5e_11d7_a6d3_00065b84435c);

// UNSUPPORTED Rust 92:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_TFCAT_TIPCAP_SYSTRAYSUPPORT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x25504fb4_7bab_4bc1_9c69_cf81890f0ef5);

// UNSUPPORTED Rust 93:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_TFCAT_TIPCAP_TSF3: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x07dcb4af_98de_4548_bef7_25bd45979a1f);

// UNSUPPORTED Rust 94:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_TFCAT_TIPCAP_UIELEMENTENABLED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x49d2f9cf_1f5e_11d7_a6d3_00065b84435c);

// UNSUPPORTED Rust 95:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_TFCAT_TIPCAP_WOW16: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x364215da_75bc_11d7_a6ef_00065b84435c);

// UNSUPPORTED Rust 96:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_TFCAT_TIP_HANDWRITING: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x246ecb87_c2f2_4abe_905b_c8b38add2c43);

// UNSUPPORTED Rust 97:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_TFCAT_TIP_KEYBOARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x34745c63_b2f0_4784_8b67_5e12c8701a31);

// UNSUPPORTED Rust 98:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_TFCAT_TIP_SPEECH: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb5a73cd1_8355_426b_a161_259808f26b14);

// UNSUPPORTED Rust 99:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_TFCAT_TRANSITORYEXTENSIONUI: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6302de22_a5cf_4b02_bfe8_4d72b2bed3c6);

// UNSUPPORTED Rust 100:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_TS_SERVICE_ACCESSIBLE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf9786200_a5bf_4a0f_8c24_fb16f5d1aabb);

// UNSUPPORTED Rust 101:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_TS_SERVICE_ACTIVEX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xea937a50_c9a6_4b7d_894a_49d99b784834);

// UNSUPPORTED Rust 102:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_TS_SERVICE_DATAOBJECT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6086fbb5_e225_46ce_a770_c1bbd3e05d7b);

public const val `GXFPF_NEAREST`: UInt = 2u;
public const val `GXFPF_ROUND_NEAREST`: UInt = 1u;
public const val `ILMCM_CHECKLAYOUTANDTIPENABLED`: UInt = 1u;
public const val `ILMCM_LANGUAGEBAROFF`: UInt = 2u;
public typealias `INSERT_TEXT_AT_SELECTION_FLAGS` = UInt;
public const val `IS_ADDRESS_CITY`: `InputScope` = 17;
public const val `IS_ADDRESS_COUNTRYNAME`: `InputScope` = 18;
public const val `IS_ADDRESS_COUNTRYSHORTNAME`: `InputScope` = 19;
public const val `IS_ADDRESS_FULLPOSTALADDRESS`: `InputScope` = 13;
public const val `IS_ADDRESS_POSTALCODE`: `InputScope` = 14;
public const val `IS_ADDRESS_STATEORPROVINCE`: `InputScope` = 16;
public const val `IS_ADDRESS_STREET`: `InputScope` = 15;
public const val `IS_ALPHANUMERIC_FULLWIDTH`: `InputScope` = 41;
public const val `IS_ALPHANUMERIC_HALFWIDTH`: `InputScope` = 40;
public const val `IS_ALPHANUMERIC_PIN`: `InputScope` = 65;
public const val `IS_ALPHANUMERIC_PIN_SET`: `InputScope` = 66;
public const val `IS_BOPOMOFO`: `InputScope` = 43;
public const val `IS_CHAT`: `InputScope` = 58;
public const val `IS_CHAT_WITHOUT_EMOJI`: `InputScope` = 68;
public const val `IS_CHINESE_FULLWIDTH`: `InputScope` = 54;
public const val `IS_CHINESE_HALFWIDTH`: `InputScope` = 53;
public const val `IS_CURRENCY_AMOUNT`: `InputScope` = 21;
public const val `IS_CURRENCY_AMOUNTANDSYMBOL`: `InputScope` = 20;
public const val `IS_CURRENCY_CHINESE`: `InputScope` = 42;
public const val `IS_DATE_DAY`: `InputScope` = 24;
public const val `IS_DATE_DAYNAME`: `InputScope` = 27;
public const val `IS_DATE_FULLDATE`: `InputScope` = 22;
public const val `IS_DATE_MONTH`: `InputScope` = 23;
public const val `IS_DATE_MONTHNAME`: `InputScope` = 26;
public const val `IS_DATE_YEAR`: `InputScope` = 25;
public const val `IS_DEFAULT`: `InputScope` = 0;
public const val `IS_DIGITS`: `InputScope` = 28;
public const val `IS_EMAILNAME_OR_ADDRESS`: `InputScope` = 60;
public const val `IS_EMAIL_SMTPEMAILADDRESS`: `InputScope` = 5;
public const val `IS_EMAIL_USERNAME`: `InputScope` = 4;
public const val `IS_ENUMSTRING`: `InputScope` = -5;
public const val `IS_FILE_FILENAME`: `InputScope` = 3;
public const val `IS_FILE_FULLFILEPATH`: `InputScope` = 2;
public const val `IS_FORMULA`: `InputScope` = 51;
public const val `IS_FORMULA_NUMBER`: `InputScope` = 67;
public const val `IS_HANGUL_FULLWIDTH`: `InputScope` = 49;
public const val `IS_HANGUL_HALFWIDTH`: `InputScope` = 48;
public const val `IS_HANJA`: `InputScope` = 47;
public const val `IS_HIRAGANA`: `InputScope` = 44;
public const val `IS_KATAKANA_FULLWIDTH`: `InputScope` = 46;
public const val `IS_KATAKANA_HALFWIDTH`: `InputScope` = 45;
public const val `IS_LOGINNAME`: `InputScope` = 6;
public const val `IS_MAPS`: `InputScope` = 62;
public const val `IS_NAME_OR_PHONENUMBER`: `InputScope` = 59;
public const val `IS_NATIVE_SCRIPT`: `InputScope` = 55;
public const val `IS_NUMBER`: `InputScope` = 29;
public const val `IS_NUMBER_FULLWIDTH`: `InputScope` = 39;
public const val `IS_NUMERIC_PASSWORD`: `InputScope` = 63;
public const val `IS_NUMERIC_PIN`: `InputScope` = 64;
public const val `IS_ONECHAR`: `InputScope` = 30;
public const val `IS_PASSWORD`: `InputScope` = 31;
public const val `IS_PERSONALNAME_FULLNAME`: `InputScope` = 7;
public const val `IS_PERSONALNAME_GIVENNAME`: `InputScope` = 9;
public const val `IS_PERSONALNAME_MIDDLENAME`: `InputScope` = 10;
public const val `IS_PERSONALNAME_PREFIX`: `InputScope` = 8;
public const val `IS_PERSONALNAME_SUFFIX`: `InputScope` = 12;
public const val `IS_PERSONALNAME_SURNAME`: `InputScope` = 11;
public const val `IS_PHRASELIST`: `InputScope` = -1;
public const val `IS_PRIVATE`: `InputScope` = 61;
public const val `IS_REGULAREXPRESSION`: `InputScope` = -2;
public const val `IS_SEARCH`: `InputScope` = 50;
public const val `IS_SEARCH_INCREMENTAL`: `InputScope` = 52;
public const val `IS_SRGS`: `InputScope` = -3;
public const val `IS_TELEPHONE_AREACODE`: `InputScope` = 34;
public const val `IS_TELEPHONE_COUNTRYCODE`: `InputScope` = 33;
public const val `IS_TELEPHONE_FULLTELEPHONENUMBER`: `InputScope` = 32;
public const val `IS_TELEPHONE_LOCALNUMBER`: `InputScope` = 35;
public const val `IS_TEXT`: `InputScope` = 57;
public const val `IS_TIME_FULLTIME`: `InputScope` = 36;
public const val `IS_TIME_HOUR`: `InputScope` = 37;
public const val `IS_TIME_MINORSEC`: `InputScope` = 38;
public const val `IS_URL`: `InputScope` = 1;
public const val `IS_XML`: `InputScope` = -4;
public const val `IS_YOMI`: `InputScope` = 56;
public typealias `InputScope` = Int;
public typealias `LANG_BAR_ITEM_ICON_MODE_FLAGS` = UInt;
// UNSUPPORTED Rust 184:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const LIBID_MSAATEXTLib: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x150e2d7a_dac1_4582_947d_2a8fd78b82cd);

// UNSUPPORTED Rust 185:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const MSAAControl: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x08cd963f_7a3e_4f5c_9bd8_d692bb043c5b);

public const val `STYLE_ACTIVE_SELECTION`: `TfIntegratableCandidateListSelectionStyle` = 0;
public const val `STYLE_IMPLIED_SELECTION`: `TfIntegratableCandidateListSelectionStyle` = 1;
public typealias `TEXT_STORE_CHANGE_FLAGS` = UInt;
public typealias `TEXT_STORE_LOCK_FLAGS` = UInt;
public typealias `TEXT_STORE_TEXT_CHANGE_FLAGS` = UInt;
public const val `TF_AE_END`: `TfActiveSelEnd` = 2;
public const val `TF_AE_NONE`: `TfActiveSelEnd` = 0;
public const val `TF_AE_START`: `TfActiveSelEnd` = 1;
public const val `TF_ANCHOR_END`: `TfAnchor` = 1;
public const val `TF_ANCHOR_START`: `TfAnchor` = 0;
public const val `TF_ATTR_CONVERTED`: `TF_DA_ATTR_INFO` = 2;
public const val `TF_ATTR_FIXEDCONVERTED`: `TF_DA_ATTR_INFO` = 5;
public const val `TF_ATTR_INPUT`: `TF_DA_ATTR_INFO` = 0;
public const val `TF_ATTR_INPUT_ERROR`: `TF_DA_ATTR_INFO` = 4;
public const val `TF_ATTR_OTHER`: `TF_DA_ATTR_INFO` = -1;
public const val `TF_ATTR_TARGET_CONVERTED`: `TF_DA_ATTR_INFO` = 1;
public const val `TF_ATTR_TARGET_NOTCONVERTED`: `TF_DA_ATTR_INFO` = 3;
public const val `TF_CHAR_EMBEDDED`: UInt = 65532u;
public const val `TF_CLUIE_COUNT`: UInt = 2u;
public const val `TF_CLUIE_CURRENTPAGE`: UInt = 32u;
public const val `TF_CLUIE_DOCUMENTMGR`: UInt = 1u;
public const val `TF_CLUIE_PAGEINDEX`: UInt = 16u;
public const val `TF_CLUIE_SELECTION`: UInt = 4u;
public const val `TF_CLUIE_STRING`: UInt = 8u;
public const val `TF_COMMANDING_ENABLED`: UInt = 4u;
public const val `TF_COMMANDING_ON`: UInt = 8u;
public typealias `TF_CONTEXT_EDIT_CONTEXT_FLAGS` = UInt;
public const val `TF_CONVERSIONMODE_ALPHANUMERIC`: UInt = 0u;
public const val `TF_CONVERSIONMODE_CHARCODE`: UInt = 32u;
public const val `TF_CONVERSIONMODE_EUDC`: UInt = 512u;
public const val `TF_CONVERSIONMODE_FIXED`: UInt = 2048u;
public const val `TF_CONVERSIONMODE_FULLSHAPE`: UInt = 8u;
public const val `TF_CONVERSIONMODE_KATAKANA`: UInt = 2u;
public const val `TF_CONVERSIONMODE_NATIVE`: UInt = 1u;
public const val `TF_CONVERSIONMODE_NOCONVERSION`: UInt = 256u;
public const val `TF_CONVERSIONMODE_ROMAN`: UInt = 16u;
public const val `TF_CONVERSIONMODE_SOFTKEYBOARD`: UInt = 128u;
public const val `TF_CONVERSIONMODE_SYMBOL`: UInt = 1024u;
public const val `TF_CT_COLORREF`: `TF_DA_COLORTYPE` = 2;
public const val `TF_CT_NONE`: `TF_DA_COLORTYPE` = 0;
public const val `TF_CT_SYSCOLOR`: `TF_DA_COLORTYPE` = 1;
public typealias `TF_DA_ATTR_INFO` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TF_DA_COLOR` (
    public var `type`: `TF_DA_COLORTYPE`,
    public var `Anonymous`: `TF_DA_COLOR_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `TF_DA_COLOR`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `TF_DA_COLOR`.Companion.`default`() : `TF_DA_COLOR` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 239:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union TF_DA_COLOR_0 {
//     pub nIndex: i32,
//     pub cr: super::super::Foundation::COLORREF,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `TF_DA_COLOR_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `TF_DA_COLOR_0`.Companion.`default`() : `TF_DA_COLOR_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `TF_DA_COLORTYPE` = Int;
public typealias `TF_DA_LINESTYLE` = Int;
public const val `TF_DEFAULT_SELECTION`: UInt = 4294967295u;
public const val `TF_DICTATION_ENABLED`: UInt = 2u;
public const val `TF_DICTATION_ON`: UInt = 1u;
public const val `TF_DISABLE_BALLOON`: UInt = 2u;
public const val `TF_DISABLE_COMMANDING`: UInt = 4u;
public const val `TF_DISABLE_DICTATION`: UInt = 2u;
public const val `TF_DISABLE_SPEECH`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TF_DISPLAYATTRIBUTE` (
    public var `crText`: `TF_DA_COLOR`,
    public var `crBk`: `TF_DA_COLOR`,
    public var `lsStyle`: `TF_DA_LINESTYLE`,
    public var `fBoldLine`: `windows_sys`.`core`.`BOOL`,
    public var `crLine`: `TF_DA_COLOR`,
    public var `bAttr`: `TF_DA_ATTR_INFO`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `TF_DISPLAYATTRIBUTE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `TF_DISPLAYATTRIBUTE`.Companion.`default`() : `TF_DISPLAYATTRIBUTE` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `TF_DTLBI_NONE`: `LANG_BAR_ITEM_ICON_MODE_FLAGS` = 0u;
public const val `TF_DTLBI_USEPROFILEICON`: `LANG_BAR_ITEM_ICON_MODE_FLAGS` = 1u;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `TF_ENABLE_PROCESS_ATOM`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("_CTF_ENABLE_PROCESS_ATOM_");
public const val `TF_ES_ASYNC`: `TF_CONTEXT_EDIT_CONTEXT_FLAGS` = 8u;
public const val `TF_ES_ASYNCDONTCARE`: `TF_CONTEXT_EDIT_CONTEXT_FLAGS` = 0u;
public const val `TF_ES_READ`: `TF_CONTEXT_EDIT_CONTEXT_FLAGS` = 2u;
public const val `TF_ES_READWRITE`: `TF_CONTEXT_EDIT_CONTEXT_FLAGS` = 6u;
public const val `TF_ES_SYNC`: `TF_CONTEXT_EDIT_CONTEXT_FLAGS` = 1u;
public const val `TF_E_ALREADY_EXISTS`: Int = -2147220218;
public const val `TF_E_COMPOSITION_REJECTED`: Int = -2147220216;
public const val `TF_E_DISCONNECTED`: Int = -2147220220;
public const val `TF_E_EMPTYCONTEXT`: Int = -2147220215;
public const val `TF_E_FORMAT`: Int = -2147220982;
public const val `TF_E_INVALIDPOINT`: Int = -2147220985;
public const val `TF_E_INVALIDPOS`: Int = -2147220992;
public const val `TF_E_INVALIDVIEW`: Int = -2147220219;
public const val `TF_E_LOCKED`: Int = -2147220224;
public const val `TF_E_NOCONVERSION`: Int = -2147219968;
public const val `TF_E_NOINTERFACE`: Int = -2147220988;
public const val `TF_E_NOLAYOUT`: Int = -2147220986;
public const val `TF_E_NOLOCK`: Int = -2147220991;
public const val `TF_E_NOOBJECT`: Int = -2147220990;
public const val `TF_E_NOPROVIDER`: Int = -2147220221;
public const val `TF_E_NOSELECTION`: Int = -2147220987;
public const val `TF_E_NOSERVICE`: Int = -2147220989;
public const val `TF_E_NOTOWNEDRANGE`: Int = -2147220222;
public const val `TF_E_RANGE_NOT_COVERED`: Int = -2147220217;
public const val `TF_E_READONLY`: Int = -2147220983;
public const val `TF_E_STACKFULL`: Int = -2147220223;
public const val `TF_E_SYNCHRONOUS`: Int = -2147220984;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `TF_FLOATINGLANGBAR_WNDTITLE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TF_FloatingLangBar_WndTitle");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `TF_FLOATINGLANGBAR_WNDTITLEA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("TF_FloatingLangBar_WndTitle");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `TF_FLOATINGLANGBAR_WNDTITLEW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TF_FloatingLangBar_WndTitle");
public const val `TF_GRAVITY_BACKWARD`: `TfGravity` = 0;
public const val `TF_GRAVITY_FORWARD`: `TfGravity` = 1;
public const val `TF_GTP_INCL_TEXT`: `GET_TEXT_AND_PROPERTY_UPDATES_FLAGS` = 1u;
public const val `TF_GTP_NONE`: `GET_TEXT_AND_PROPERTY_UPDATES_FLAGS` = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TF_HALTCOND` (
    public var `pHaltRange`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `aHaltPos`: `TfAnchor`,
    public var `dwFlags`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `TF_HALTCOND`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `TF_HALTCOND`.Companion.`default`() : `TF_HALTCOND` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `TF_HF_OBJECT`: UInt = 1u;
public const val `TF_IAS_NOQUERY`: `INSERT_TEXT_AT_SELECTION_FLAGS` = 1u;
public const val `TF_IAS_NO_DEFAULT_COMPOSITION`: `INSERT_TEXT_AT_SELECTION_FLAGS` = 2147483648u;
public const val `TF_IAS_QUERYONLY`: `INSERT_TEXT_AT_SELECTION_FLAGS` = 2u;
public const val `TF_IE_CORRECTION`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Input_KeyboardAndMouse")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TF_INPUTPROCESSORPROFILE` (
    public var `dwProfileType`: UInt,
    public var `langid`: UShort,
    public var `clsid`: `windows_sys`.`core`.`GUID`,
    public var `guidProfile`: `windows_sys`.`core`.`GUID`,
    public var `catid`: `windows_sys`.`core`.`GUID`,
    public var `hklSubstitute`: `super`.`Input`.`KeyboardAndMouse`.`HKL`,
    public var `dwCaps`: UInt,
    public var `hkl`: `super`.`Input`.`KeyboardAndMouse`.`HKL`,
    public var `dwFlags`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `TF_INPUTPROCESSORPROFILE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Input_KeyboardAndMouse")]

    public fun `TF_INPUTPROCESSORPROFILE`.Companion.`default`() : `TF_INPUTPROCESSORPROFILE` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `TF_INVALID_COOKIE`: UInt = 4294967295u;
public const val `TF_INVALID_EDIT_COOKIE`: UInt = 0u;
public const val `TF_IPPMF_DISABLEPROFILE`: UInt = 2u;
public const val `TF_IPPMF_DONTCARECURRENTINPUTLANGUAGE`: UInt = 4u;
public const val `TF_IPPMF_ENABLEPROFILE`: UInt = 1u;
public const val `TF_IPPMF_FORPROCESS`: UInt = 268435456u;
public const val `TF_IPPMF_FORSESSION`: UInt = 536870912u;
public const val `TF_IPPMF_FORSYSTEMALL`: UInt = 1073741824u;
public const val `TF_IPP_CAPS_COMLESSSUPPORT`: UInt = 8u;
public const val `TF_IPP_CAPS_DISABLEONTRANSITORY`: UInt = 1u;
public const val `TF_IPP_CAPS_IMMERSIVESUPPORT`: UInt = 65536u;
public const val `TF_IPP_CAPS_SECUREMODESUPPORT`: UInt = 2u;
public const val `TF_IPP_CAPS_SYSTRAYSUPPORT`: UInt = 131072u;
public const val `TF_IPP_CAPS_UIELEMENTENABLED`: UInt = 4u;
public const val `TF_IPP_CAPS_WOW16SUPPORT`: UInt = 16u;
public const val `TF_IPP_FLAG_ACTIVE`: UInt = 1u;
public const val `TF_IPP_FLAG_ENABLED`: UInt = 2u;
public const val `TF_IPP_FLAG_SUBSTITUTEDBYINPUTPROCESSOR`: UInt = 4u;
public const val `TF_IPSINK_FLAG_ACTIVE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TF_LANGBARITEMINFO` (
    public var `clsidService`: `windows_sys`.`core`.`GUID`,
    public var `guidItem`: `windows_sys`.`core`.`GUID`,
    public var `dwStyle`: UInt,
    public var `ulSort`: UInt,
    public var `szDescription`: UShortArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `TF_LANGBARITEMINFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `TF_LANGBARITEMINFO`.Companion.`default`() : `TF_LANGBARITEMINFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TF_LANGUAGEPROFILE` (
    public var `clsid`: `windows_sys`.`core`.`GUID`,
    public var `langid`: UShort,
    public var `catid`: `windows_sys`.`core`.`GUID`,
    public var `fActive`: `windows_sys`.`core`.`BOOL`,
    public var `guidProfile`: `windows_sys`.`core`.`GUID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TF_LBBALLOONINFO` (
    public var `style`: `TfLBBalloonStyle`,
    public var `bstrText`: `windows_sys`.`core`.`BSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `TF_LBBALLOONINFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `TF_LBBALLOONINFO`.Companion.`default`() : `TF_LBBALLOONINFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `TF_LBI_BALLOON`: UInt = 16u;
public const val `TF_LBI_BITMAP`: UInt = 8u;
public const val `TF_LBI_BMPF_VERTICAL`: UInt = 1u;
public const val `TF_LBI_CLK_LEFT`: `TfLBIClick` = 2;
public const val `TF_LBI_CLK_RIGHT`: `TfLBIClick` = 1;
public const val `TF_LBI_CUSTOMUI`: UInt = 32u;
public const val `TF_LBI_DESC_MAXLEN`: UInt = 32u;
public const val `TF_LBI_ICON`: UInt = 1u;
public const val `TF_LBI_STATUS`: UInt = 65536u;
public const val `TF_LBI_STATUS_BTN_TOGGLED`: UInt = 65536u;
public const val `TF_LBI_STATUS_DISABLED`: UInt = 2u;
public const val `TF_LBI_STATUS_HIDDEN`: UInt = 1u;
public const val `TF_LBI_STYLE_BTN_BUTTON`: UInt = 65536u;
public const val `TF_LBI_STYLE_BTN_MENU`: UInt = 131072u;
public const val `TF_LBI_STYLE_BTN_TOGGLE`: UInt = 262144u;
public const val `TF_LBI_STYLE_HIDDENBYDEFAULT`: UInt = 16u;
public const val `TF_LBI_STYLE_HIDDENSTATUSCONTROL`: UInt = 1u;
public const val `TF_LBI_STYLE_HIDEONNOOTHERITEMS`: UInt = 4u;
public const val `TF_LBI_STYLE_SHOWNINTRAY`: UInt = 2u;
public const val `TF_LBI_STYLE_SHOWNINTRAYONLY`: UInt = 8u;
public const val `TF_LBI_STYLE_TEXTCOLORICON`: UInt = 32u;
public const val `TF_LBI_TEXT`: UInt = 2u;
public const val `TF_LBI_TOOLTIP`: UInt = 4u;
public const val `TF_LBMENUF_CHECKED`: UInt = 1u;
public const val `TF_LBMENUF_GRAYED`: UInt = 16u;
public const val `TF_LBMENUF_RADIOCHECKED`: UInt = 8u;
public const val `TF_LBMENUF_SEPARATOR`: UInt = 4u;
public const val `TF_LBMENUF_SUBMENU`: UInt = 2u;
public const val `TF_LB_BALLOON_MISS`: `TfLBBalloonStyle` = 2;
public const val `TF_LB_BALLOON_RECO`: `TfLBBalloonStyle` = 0;
public const val `TF_LB_BALLOON_SHOW`: `TfLBBalloonStyle` = 1;
public const val `TF_LC_CHANGE`: `TfLayoutCode` = 1;
public const val `TF_LC_CREATE`: `TfLayoutCode` = 0;
public const val `TF_LC_DESTROY`: `TfLayoutCode` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TF_LMLATTELEMENT` (
    public var `dwFrameStart`: UInt,
    public var `dwFrameLen`: UInt,
    public var `dwFlags`: UInt,
    public var `Anonymous`: `TF_LMLATTELEMENT_0`,
    public var `bstrText`: `windows_sys`.`core`.`BSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `TF_LMLATTELEMENT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `TF_LMLATTELEMENT`.Companion.`default`() : `TF_LMLATTELEMENT` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 449:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union TF_LMLATTELEMENT_0 {
//     pub iCost: i32,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `TF_LMLATTELEMENT_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `TF_LMLATTELEMENT_0`.Companion.`default`() : `TF_LMLATTELEMENT_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `TF_LS_DASH`: `TF_DA_LINESTYLE` = 3;
public const val `TF_LS_DOT`: `TF_DA_LINESTYLE` = 2;
public const val `TF_LS_NONE`: `TF_DA_LINESTYLE` = 0;
public const val `TF_LS_SOLID`: `TF_DA_LINESTYLE` = 1;
public const val `TF_LS_SQUIGGLE`: `TF_DA_LINESTYLE` = 4;
public const val `TF_MENUREADY`: UInt = 1u;
public const val `TF_MOD_ALT`: UInt = 1u;
public const val `TF_MOD_CONTROL`: UInt = 2u;
public const val `TF_MOD_IGNORE_ALL_MODIFIER`: UInt = 1024u;
public const val `TF_MOD_LALT`: UInt = 64u;
public const val `TF_MOD_LCONTROL`: UInt = 128u;
public const val `TF_MOD_LSHIFT`: UInt = 256u;
public const val `TF_MOD_ON_KEYUP`: UInt = 512u;
public const val `TF_MOD_RALT`: UInt = 8u;
public const val `TF_MOD_RCONTROL`: UInt = 16u;
public const val `TF_MOD_RSHIFT`: UInt = 32u;
public const val `TF_MOD_SHIFT`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TF_PERSISTENT_PROPERTY_HEADER_ACP` (
    public var `guidType`: `windows_sys`.`core`.`GUID`,
    public var `ichStart`: Int,
    public var `cch`: Int,
    public var `cb`: UInt,
    public var `dwPrivate`: UInt,
    public var `clsidTIP`: `windows_sys`.`core`.`GUID`,
)
public const val `TF_POPF_ALL`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TF_PRESERVEDKEY` (
    public var `uVKey`: UInt,
    public var `uModifiers`: UInt,
)
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `TF_PROCESS_ATOM`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("_CTF_PROCESS_ATOM_");
public const val `TF_PROFILETYPE_INPUTPROCESSOR`: UInt = 1u;
public const val `TF_PROFILETYPE_KEYBOARDLAYOUT`: UInt = 2u;
// UNSUPPORTED Rust 496:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TF_PROFILE_ARRAY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd38eff65_aa46_4fd5_91a7_67845fb02f5b);

// UNSUPPORTED Rust 497:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TF_PROFILE_CANTONESE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0aec109c_7e96_11d4_b2ef_0080c882687e);

// UNSUPPORTED Rust 498:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TF_PROFILE_CHANGJIE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4bdf9f03_c7d3_11d4_b2ab_0080c882687e);

// UNSUPPORTED Rust 499:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TF_PROFILE_DAYI: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x037b2c25_480c_4d7f_b027_d6ca6b69788a);

// UNSUPPORTED Rust 500:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TF_PROFILE_NEWCHANGJIE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf3ba907a_6c7e_11d4_97fa_0080c882687e);

// UNSUPPORTED Rust 501:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TF_PROFILE_NEWPHONETIC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb2f9c502_1742_11d4_9790_0080c882687e);

// UNSUPPORTED Rust 502:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TF_PROFILE_NEWQUICK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0b883ba0_c1c7_11d4_87f9_0080c882687e);

// UNSUPPORTED Rust 503:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TF_PROFILE_PHONETIC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x761309de_317a_11d4_9b5d_0080c882687e);

// UNSUPPORTED Rust 504:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TF_PROFILE_PINYIN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf3ba9077_6c7e_11d4_97fa_0080c882687e);

// UNSUPPORTED Rust 505:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TF_PROFILE_QUICK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6024b45f_5c54_11d4_b921_0080c882687e);

// UNSUPPORTED Rust 506:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TF_PROFILE_SIMPLEFAST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfa550b04_5ad7_411f_a5ac_ca038ec515d7);

// UNSUPPORTED Rust 507:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TF_PROFILE_TIGRINYA: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3cab88b7_cc3e_46a6_9765_b772ad7761ff);

// UNSUPPORTED Rust 508:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TF_PROFILE_WUBI: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x82590c13_f4dd_44f4_ba1d_8667246fdf8e);

// UNSUPPORTED Rust 509:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TF_PROFILE_YI: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x409c8376_007b_4357_ae8e_26316ee3fb0d);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TF_PROPERTYVAL` (
    public var `guidId`: `windows_sys`.`core`.`GUID`,
    public var `varValue`: `super`.`super`.`System`.`Variant`.`VARIANT`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `TF_PROPERTYVAL`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]

    public fun `TF_PROPERTYVAL`.Companion.`default`() : `TF_PROPERTYVAL` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `TF_PROPUI_STATUS_SAVETOFILE`: UInt = 1u;
public const val `TF_RCM_COMLESS`: UInt = 1u;
public const val `TF_RCM_HINT_COLLISION`: UInt = 8u;
public const val `TF_RCM_HINT_READING_LENGTH`: UInt = 4u;
public const val `TF_RCM_VKEY`: UInt = 2u;
public const val `TF_RIP_FLAG_FREEUNUSEDLIBRARIES`: UInt = 1u;
public const val `TF_RIUIE_CONTEXT`: UInt = 1u;
public const val `TF_RIUIE_ERRORINDEX`: UInt = 8u;
public const val `TF_RIUIE_MAXREADINGSTRINGLENGTH`: UInt = 4u;
public const val `TF_RIUIE_STRING`: UInt = 2u;
public const val `TF_RIUIE_VERTICALORDER`: UInt = 16u;
public const val `TF_RP_HIDDENINSETTINGUI`: UInt = 2u;
public const val `TF_RP_LOCALPROCESS`: UInt = 4u;
public const val `TF_RP_LOCALTHREAD`: UInt = 8u;
public const val `TF_RP_SUBITEMINSETTINGUI`: UInt = 16u;
public const val `TF_SD_BACKWARD`: `TfShiftDir` = 0;
public const val `TF_SD_FORWARD`: `TfShiftDir` = 1;
public const val `TF_SD_LOADING`: UInt = 2u;
public const val `TF_SD_READONLY`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TF_SELECTION` (
    public var `range`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `style`: `TF_SELECTIONSTYLE`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `TF_SELECTION`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `TF_SELECTION`.Companion.`default`() : `TF_SELECTION` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TF_SELECTIONSTYLE` (
    public var `ase`: `TfActiveSelEnd`,
    public var `fInterimChar`: `windows_sys`.`core`.`BOOL`,
)
public const val `TF_SENTENCEMODE_AUTOMATIC`: UInt = 4u;
public const val `TF_SENTENCEMODE_CONVERSATION`: UInt = 16u;
public const val `TF_SENTENCEMODE_NONE`: UInt = 0u;
public const val `TF_SENTENCEMODE_PHRASEPREDICT`: UInt = 8u;
public const val `TF_SENTENCEMODE_PLAURALCLAUSE`: UInt = 1u;
public const val `TF_SENTENCEMODE_SINGLECONVERT`: UInt = 2u;
public const val `TF_SFT_DESKBAND`: UInt = 2048u;
public const val `TF_SFT_DOCK`: UInt = 2u;
public const val `TF_SFT_EXTRAICONSONMINIMIZED`: UInt = 512u;
public const val `TF_SFT_HIDDEN`: UInt = 8u;
public const val `TF_SFT_HIGHTRANSPARENCY`: UInt = 64u;
public const val `TF_SFT_LABELS`: UInt = 128u;
public const val `TF_SFT_LOWTRANSPARENCY`: UInt = 32u;
public const val `TF_SFT_MINIMIZED`: UInt = 4u;
public const val `TF_SFT_NOEXTRAICONSONMINIMIZED`: UInt = 1024u;
public const val `TF_SFT_NOLABELS`: UInt = 256u;
public const val `TF_SFT_NOTRANSPARENCY`: UInt = 16u;
public const val `TF_SFT_SHOWNORMAL`: UInt = 1u;
public const val `TF_SHOW_BALLOON`: UInt = 1u;
public const val `TF_SPEECHUI_SHOWN`: UInt = 16u;
public const val `TF_SS_DISJOINTSEL`: UInt = 1u;
public const val `TF_SS_REGIONS`: UInt = 2u;
public const val `TF_SS_TKBAUTOCORRECTENABLE`: UInt = 16u;
public const val `TF_SS_TKBPREDICTIONENABLE`: UInt = 32u;
public const val `TF_SS_TRANSITORY`: UInt = 4u;
public const val `TF_ST_CORRECTION`: UInt = 1u;
public const val `TF_S_ASYNC`: Int = 262912;
public const val `TF_TF_IGNOREEND`: UInt = 2u;
public const val `TF_TF_MOVESTART`: UInt = 1u;
public const val `TF_TMAE_COMLESS`: UInt = 8u;
public const val `TF_TMAE_CONSOLE`: UInt = 64u;
public const val `TF_TMAE_NOACTIVATEKEYBOARDLAYOUT`: UInt = 32u;
public const val `TF_TMAE_NOACTIVATETIP`: UInt = 1u;
public const val `TF_TMAE_SECUREMODE`: UInt = 2u;
public const val `TF_TMAE_UIELEMENTENABLEDONLY`: UInt = 4u;
public const val `TF_TMAE_WOW16`: UInt = 16u;
public const val `TF_TMF_ACTIVATED`: UInt = 2147483648u;
public const val `TF_TMF_COMLESS`: UInt = 8u;
public const val `TF_TMF_CONSOLE`: UInt = 64u;
public const val `TF_TMF_IMMERSIVEMODE`: UInt = 1073741824u;
public const val `TF_TMF_NOACTIVATETIP`: UInt = 1u;
public const val `TF_TMF_SECUREMODE`: UInt = 2u;
public const val `TF_TMF_UIELEMENTENABLEDONLY`: UInt = 4u;
public const val `TF_TMF_WOW16`: UInt = 16u;
public const val `TF_TRANSITORYEXTENSION_ATSELECTION`: UInt = 2u;
public const val `TF_TRANSITORYEXTENSION_FLOATING`: UInt = 1u;
public const val `TF_TRANSITORYEXTENSION_NONE`: UInt = 0u;
public const val `TF_TU_CORRECTION`: UInt = 1u;
public const val `TF_URP_ALLPROFILES`: UInt = 2u;
public const val `TF_URP_LOCALPROCESS`: UInt = 4u;
public const val `TF_URP_LOCALTHREAD`: UInt = 8u;
public const val `TF_US_HIDETIPUI`: UInt = 1u;
public const val `TKBLT_CLASSIC`: `TKBLayoutType` = 1;
public const val `TKBLT_OPTIMIZED`: `TKBLayoutType` = 2;
public const val `TKBLT_UNDEFINED`: `TKBLayoutType` = 0;
public const val `TKBL_CLASSIC_TRADITIONAL_CHINESE_CHANGJIE`: UInt = 61506u;
public const val `TKBL_CLASSIC_TRADITIONAL_CHINESE_DAYI`: UInt = 61507u;
public const val `TKBL_CLASSIC_TRADITIONAL_CHINESE_PHONETIC`: UInt = 1028u;
public const val `TKBL_OPT_JAPANESE_ABC`: UInt = 1041u;
public const val `TKBL_OPT_KOREAN_HANGUL_2_BULSIK`: UInt = 1042u;
public const val `TKBL_OPT_SIMPLIFIED_CHINESE_PINYIN`: UInt = 2052u;
public const val `TKBL_OPT_TRADITIONAL_CHINESE_PHONETIC`: UInt = 1028u;
public const val `TKBL_UNDEFINED`: UInt = 0u;
public typealias `TKBLayoutType` = Int;
public const val `TKB_ALTERNATES_AUTOCORRECTION_APPLIED`: UInt = 4u;
public const val `TKB_ALTERNATES_FOR_AUTOCORRECTION`: UInt = 2u;
public const val `TKB_ALTERNATES_FOR_PREDICTION`: UInt = 3u;
public const val `TKB_ALTERNATES_STANDARD`: UInt = 1u;
// UNSUPPORTED Rust 627:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_App: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa80f77df_4237_40e5_849c_b5fa51c13ac7);

// UNSUPPORTED Rust 628:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_App_IncorrectGrammar: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbd54e398_ad03_4b74_b6b3_5edb19996388);

// UNSUPPORTED Rust 629:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_App_IncorrectSpelling: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf42de43c_ef12_430d_944c_9a08970a25d2);

// UNSUPPORTED Rust 630:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x573ea825_749b_4f8a_9cfd_21c3605ca828);

// UNSUPPORTED Rust 631:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_FaceName: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb536aeb6_053b_4eb8_b65a_50da1e81e72e);

// UNSUPPORTED Rust 632:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_SizePts: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc8493302_a5e9_456d_af04_8005e4130f03);

// UNSUPPORTED Rust 633:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x68b2a77f_6b0e_4f28_8177_571c2f3a42b1);

// UNSUPPORTED Rust 634:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_Animation: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdcf73d22_e029_47b7_bb36_f263a3d004cc);

// UNSUPPORTED Rust 635:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_Animation_BlinkingBackground: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x86e5b104_0104_4b10_b585_00f2527522b5);

// UNSUPPORTED Rust 636:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_Animation_LasVegasLights: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf40423d5_0f87_4f8f_bada_e6d60c25e152);

// UNSUPPORTED Rust 637:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_Animation_MarchingBlackAnts: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7644e067_f186_4902_bfc6_ec815aa20e9d);

// UNSUPPORTED Rust 638:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_Animation_MarchingRedAnts: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x78368dad_50fb_4c6f_840b_d486bb6cf781);

// UNSUPPORTED Rust 639:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_Animation_Shimmer: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2ce31b58_5293_4c36_8809_bf8bb51a27b3);

// UNSUPPORTED Rust 640:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_Animation_SparkleText: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x533aad20_962c_4e9f_8c09_b42ea4749711);

// UNSUPPORTED Rust 641:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_Animation_WipeDown: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5872e874_367b_4803_b160_c90ff62569d0);

// UNSUPPORTED Rust 642:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_Animation_WipeRight: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb855cbe3_3d2c_4600_b1e9_e1c9ce02f842);

// UNSUPPORTED Rust 643:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_BackgroundColor: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb50eaa4e_3091_4468_81db_d79ea190c7c7);

// UNSUPPORTED Rust 644:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_Blink: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbfb2c036_7acf_4532_b720_b416dd7765a8);

// UNSUPPORTED Rust 645:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_Bold: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x48813a43_8a20_4940_8e58_97823f7b268a);

// UNSUPPORTED Rust 646:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_Capitalize: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7d85a3ba_b4fd_43b3_befc_6b985c843141);

// UNSUPPORTED Rust 647:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_Color: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x857a7a37_b8af_4e9a_81b4_acf700c8411b);

// UNSUPPORTED Rust 648:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_Emboss: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbd8ed742_349e_4e37_82fb_437979cb53a7);

// UNSUPPORTED Rust 649:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_Engrave: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9c3371de_8332_4897_be5d_89233223179a);

// UNSUPPORTED Rust 650:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_Height: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7e937477_12e6_458b_926a_1fa44ee8f391);

// UNSUPPORTED Rust 651:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_Hidden: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb1e28770_881c_475f_863f_887a647b1090);

// UNSUPPORTED Rust 652:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_Italic: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8740682a_a765_48e1_acfc_d22222b2f810);

// UNSUPPORTED Rust 653:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_Kerning: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcc26e1b4_2f9a_47c8_8bff_bf1eb7cce0dd);

// UNSUPPORTED Rust 654:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_Lowercase: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x76d8ccb5_ca7b_4498_8ee9_d5c4f6f74c60);

// UNSUPPORTED Rust 655:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_Outlined: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x10e6db31_db0d_4ac6_a7f5_9c9cff6f2ab4);

// UNSUPPORTED Rust 656:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_Overline: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe3989f4a_992b_4301_8ce1_a5b7c6d1f3c8);

// UNSUPPORTED Rust 657:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_Overline_Double: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdc46063a_e115_46e3_bcd8_ca6772aa95b4);

// UNSUPPORTED Rust 658:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_Overline_Single: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8440d94c_51ce_47b2_8d4c_15751e5f721b);

// UNSUPPORTED Rust 659:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_Position: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x15cd26ab_f2fb_4062_b5a6_9a49e1a5cc0b);

// UNSUPPORTED Rust 660:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_Protected: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1c557cb2_14cf_4554_a574_ecb2f7e7efd4);

// UNSUPPORTED Rust 661:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_Shadow: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5f686d2f_c6cd_4c56_8a1a_994a4b9766be);

// UNSUPPORTED Rust 662:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_SmallCaps: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfacb6bc6_9100_4cc6_b969_11eea45a86b4);

// UNSUPPORTED Rust 663:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_Spacing: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x98c1200d_8f06_409a_8e49_6a554bf7c153);

// UNSUPPORTED Rust 664:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_Strikethrough: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0c562193_2d08_4668_9601_ced41309d7af);

// UNSUPPORTED Rust 665:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_Strikethrough_Double: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x62489b31_a3e7_4f94_ac43_ebaf8fcc7a9f);

// UNSUPPORTED Rust 666:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_Strikethrough_Single: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x75d736b6_3c8f_4b97_ab78_1877cb990d31);

// UNSUPPORTED Rust 667:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_Subscript: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5774fb84_389b_43bc_a74b_1568347cf0f4);

// UNSUPPORTED Rust 668:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_Superscript: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2ea4993c_563c_49aa_9372_0bef09a9255b);

// UNSUPPORTED Rust 669:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_Underline: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc3c9c9f3_7902_444b_9a7b_48e70f4b50f7);

// UNSUPPORTED Rust 670:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_Underline_Double: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x74d24aa6_1db3_4c69_a176_31120e7586d5);

// UNSUPPORTED Rust 671:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_Underline_Single: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1b6720e5_0f73_4951_a6b3_6f19e43c9461);

// UNSUPPORTED Rust 672:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_Uppercase: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x33a300e8_e340_4937_b697_8f234045cd9a);

// UNSUPPORTED Rust 673:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Font_Style_Weight: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x12f3189c_8bb0_461b_b1fa_eaf907047fe0);

// UNSUPPORTED Rust 674:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_List: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x436d673b_26f1_4aee_9e65_8f83a4ed4884);

// UNSUPPORTED Rust 675:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_List_LevelIndel: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7f7cc899_311f_487b_ad5d_e2a459e12d42);

// UNSUPPORTED Rust 676:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_List_Type: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xae3e665e_4bce_49e3_a0fe_2db47d3a17ae);

// UNSUPPORTED Rust 677:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_List_Type_Arabic: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1338c5d6_98a3_4fa3_9bd1_7a60eef8e9e0);

// UNSUPPORTED Rust 678:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_List_Type_Bullet: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbccd77c5_4c4d_4ce2_b102_559f3b2bfcea);

// UNSUPPORTED Rust 679:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_List_Type_LowerLetter: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x96372285_f3cf_491e_a925_3832347fd237);

// UNSUPPORTED Rust 680:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_List_Type_LowerRoman: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x90466262_3980_4b8e_9368_918bd1218a41);

// UNSUPPORTED Rust 681:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_List_Type_UpperLetter: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7987b7cd_ce52_428b_9b95_a357f6f10c45);

// UNSUPPORTED Rust 682:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_List_Type_UpperRoman: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0f6ab552_4a80_467f_b2f1_127e2aa3ba9e);

// UNSUPPORTED Rust 683:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_OTHERS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb3c32af9_57d0_46a9_bca8_dac238a13057);

// UNSUPPORTED Rust 684:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Text: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7edb8e68_81f9_449d_a15a_87a8388faac0);

// UNSUPPORTED Rust 685:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Text_Alignment: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x139941e6_1767_456d_938e_35ba568b5cd4);

// UNSUPPORTED Rust 686:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Text_Alignment_Center: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa4a95c16_53bf_4d55_8b87_4bdd8d4275fc);

// UNSUPPORTED Rust 687:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Text_Alignment_Justify: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xed350740_a0f7_42d3_8ea8_f81b6488faf0);

// UNSUPPORTED Rust 688:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Text_Alignment_Left: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x16ae95d3_6361_43a2_8495_d00f397f1693);

// UNSUPPORTED Rust 689:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Text_Alignment_Right: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb36f0f98_1b9e_4360_8616_03fb08a78456);

// UNSUPPORTED Rust 690:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Text_EmbeddedObject: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7edb8e68_81f9_449d_a15a_87a8388faac0);

// UNSUPPORTED Rust 691:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Text_Hyphenation: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdadf4525_618e_49eb_b1a8_3b68bd7648e3);

// UNSUPPORTED Rust 692:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Text_Language: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd8c04ef1_5753_4c25_8887_85443fe5f819);

// UNSUPPORTED Rust 693:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Text_Link: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x47cd9051_3722_4cd8_b7c8_4e17ca1759f5);

// UNSUPPORTED Rust 694:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Text_Orientation: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6bab707f_8785_4c39_8b52_96f878303ffb);

// UNSUPPORTED Rust 695:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Text_Para: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5edc5822_99dc_4dd6_aec3_b62baa5b2e7c);

// UNSUPPORTED Rust 696:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Text_Para_FirstLineIndent: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x07c97a13_7472_4dd8_90a9_91e3d7e4f29c);

// UNSUPPORTED Rust 697:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Text_Para_LeftIndent: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfb2848e9_7471_41c9_b6b3_8a1450e01897);

// UNSUPPORTED Rust 698:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Text_Para_LineSpacing: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x699b380d_7f8c_46d6_a73b_dfe3d1538df3);

// UNSUPPORTED Rust 699:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Text_Para_LineSpacing_AtLeast: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xadfedf31_2d44_4434_a5ff_7f4c4990a905);

// UNSUPPORTED Rust 700:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Text_Para_LineSpacing_Double: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x82fb1805_a6c4_4231_ac12_6260af2aba28);

// UNSUPPORTED Rust 701:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Text_Para_LineSpacing_Exactly: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3d45ad40_23de_48d7_a6b3_765420c620cc);

// UNSUPPORTED Rust 702:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Text_Para_LineSpacing_Multiple: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x910f1e3c_d6d0_4f65_8a3c_42b4b31868c5);

// UNSUPPORTED Rust 703:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Text_Para_LineSpacing_OnePtFive: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0428a021_0397_4b57_9a17_0795994cd3c5);

// UNSUPPORTED Rust 704:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Text_Para_LineSpacing_Single: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xed350740_a0f7_42d3_8ea8_f81b6488faf0);

// UNSUPPORTED Rust 705:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Text_Para_RightIndent: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2c7f26f9_a5e2_48da_b98a_520cb16513bf);

// UNSUPPORTED Rust 706:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Text_Para_SpaceAfter: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7b0a3f55_22dc_425f_a411_93da1d8f9baa);

// UNSUPPORTED Rust 707:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Text_Para_SpaceBefore: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8df98589_194a_4601_b251_9865a3e906dd);

// UNSUPPORTED Rust 708:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Text_ReadOnly: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x85836617_de32_4afd_a50f_a2db110e6e4d);

// UNSUPPORTED Rust 709:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Text_RightToLeft: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xca666e71_1b08_453d_bfdd_28e08c8aaf7a);

// UNSUPPORTED Rust 710:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TSATTRID_Text_VerticalWriting: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6bba8195_046f_4ea9_b311_97fd66c4274b);

public const val `TS_AE_END`: `TsActiveSelEnd` = 2;
public const val `TS_AE_NONE`: `TsActiveSelEnd` = 0;
public const val `TS_AE_START`: `TsActiveSelEnd` = 1;
public const val `TS_AS_ATTR_CHANGE`: UInt = 8u;
public const val `TS_AS_LAYOUT_CHANGE`: UInt = 4u;
public const val `TS_AS_SEL_CHANGE`: UInt = 2u;
public const val `TS_AS_STATUS_CHANGE`: UInt = 16u;
public const val `TS_AS_TEXT_CHANGE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TS_ATTRVAL` (
    public var `idAttr`: `windows_sys`.`core`.`GUID`,
    public var `dwOverlapId`: UInt,
    public var `varValue`: `super`.`super`.`System`.`Variant`.`VARIANT`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `TS_ATTRVAL`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]

    public fun `TS_ATTRVAL`.Companion.`default`() : `TS_ATTRVAL` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `TS_ATTR_FIND_BACKWARDS`: UInt = 1u;
public const val `TS_ATTR_FIND_HIDDEN`: UInt = 32u;
public const val `TS_ATTR_FIND_UPDATESTART`: UInt = 4u;
public const val `TS_ATTR_FIND_WANT_END`: UInt = 16u;
public const val `TS_ATTR_FIND_WANT_OFFSET`: UInt = 2u;
public const val `TS_ATTR_FIND_WANT_VALUE`: UInt = 8u;
public const val `TS_CHAR_EMBEDDED`: UInt = 65532u;
public const val `TS_CHAR_REGION`: UInt = 0u;
public const val `TS_CHAR_REPLACEMENT`: UInt = 65533u;
public const val `TS_CH_FOLLOWING_DEL`: `ANCHOR_CHANGE_HISTORY_FLAGS` = 2u;
public const val `TS_CH_PRECEDING_DEL`: `ANCHOR_CHANGE_HISTORY_FLAGS` = 1u;
public const val `TS_DEFAULT_SELECTION`: UInt = 4294967295u;
public const val `TS_E_FORMAT`: Int = -2147220982;
public const val `TS_E_INVALIDPOINT`: Int = -2147220985;
public const val `TS_E_INVALIDPOS`: Int = -2147220992;
public const val `TS_E_NOINTERFACE`: Int = -2147220988;
public const val `TS_E_NOLAYOUT`: Int = -2147220986;
public const val `TS_E_NOLOCK`: Int = -2147220991;
public const val `TS_E_NOOBJECT`: Int = -2147220990;
public const val `TS_E_NOSELECTION`: Int = -2147220987;
public const val `TS_E_NOSERVICE`: Int = -2147220989;
public const val `TS_E_READONLY`: Int = -2147220983;
public const val `TS_E_SYNCHRONOUS`: Int = -2147220984;
public const val `TS_GEA_HIDDEN`: UInt = 1u;
public const val `TS_GR_BACKWARD`: `TsGravity` = 0;
public const val `TS_GR_FORWARD`: `TsGravity` = 1;
public const val `TS_GTA_HIDDEN`: UInt = 1u;
public const val `TS_IAS_NOQUERY`: UInt = 1u;
public const val `TS_IAS_QUERYONLY`: UInt = 2u;
public const val `TS_IE_COMPOSITION`: UInt = 2u;
public const val `TS_IE_CORRECTION`: UInt = 1u;
public const val `TS_LC_CHANGE`: `TsLayoutCode` = 1;
public const val `TS_LC_CREATE`: `TsLayoutCode` = 0;
public const val `TS_LC_DESTROY`: `TsLayoutCode` = 2;
public const val `TS_LF_READ`: `TEXT_STORE_LOCK_FLAGS` = 2u;
public const val `TS_LF_READWRITE`: `TEXT_STORE_LOCK_FLAGS` = 6u;
public const val `TS_LF_SYNC`: UInt = 1u;
public const val `TS_RT_HIDDEN`: `TsRunType` = 1;
public const val `TS_RT_OPAQUE`: `TsRunType` = 2;
public const val `TS_RT_PLAIN`: `TsRunType` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TS_RUNINFO` (
    public var `uCount`: UInt,
    public var `type`: `TsRunType`,
)
public const val `TS_SD_BACKWARD`: `TsShiftDir` = 0;
public const val `TS_SD_EMBEDDEDHANDWRITINGVIEW_ENABLED`: UInt = 128u;
public const val `TS_SD_EMBEDDEDHANDWRITINGVIEW_VISIBLE`: UInt = 256u;
public const val `TS_SD_FORWARD`: `TsShiftDir` = 1;
public const val `TS_SD_INPUTPANEMANUALDISPLAYENABLE`: UInt = 64u;
public const val `TS_SD_LOADING`: UInt = 2u;
public const val `TS_SD_READONLY`: UInt = 1u;
public const val `TS_SD_RESERVED`: UInt = 4u;
public const val `TS_SD_TKBAUTOCORRECTENABLE`: UInt = 8u;
public const val `TS_SD_TKBPREDICTIONENABLE`: UInt = 16u;
public const val `TS_SD_UIINTEGRATIONENABLE`: UInt = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TS_SELECTIONSTYLE` (
    public var `ase`: `TsActiveSelEnd`,
    public var `fInterimChar`: `windows_sys`.`core`.`BOOL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TS_SELECTION_ACP` (
    public var `acpStart`: Int,
    public var `acpEnd`: Int,
    public var `style`: `TS_SELECTIONSTYLE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TS_SELECTION_ANCHOR` (
    public var `paStart`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `paEnd`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `style`: `TS_SELECTIONSTYLE`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `TS_SELECTION_ANCHOR`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `TS_SELECTION_ANCHOR`.Companion.`default`() : `TS_SELECTION_ANCHOR` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `TS_SHIFT_COUNT_HIDDEN`: UInt = 1u;
public const val `TS_SHIFT_COUNT_ONLY`: UInt = 8u;
public const val `TS_SHIFT_HALT_HIDDEN`: UInt = 2u;
public const val `TS_SHIFT_HALT_VISIBLE`: UInt = 4u;
public const val `TS_SS_DISJOINTSEL`: UInt = 1u;
public const val `TS_SS_NOHIDDENTEXT`: UInt = 8u;
public const val `TS_SS_REGIONS`: UInt = 2u;
public const val `TS_SS_TKBAUTOCORRECTENABLE`: UInt = 16u;
public const val `TS_SS_TKBPREDICTIONENABLE`: UInt = 32u;
public const val `TS_SS_TRANSITORY`: UInt = 4u;
public const val `TS_SS_UWPCONTROL`: UInt = 64u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TS_STATUS` (
    public var `dwDynamicFlags`: UInt,
    public var `dwStaticFlags`: UInt,
)
public const val `TS_STRF_END`: UInt = 2u;
public const val `TS_STRF_MID`: UInt = 1u;
public const val `TS_STRF_START`: UInt = 0u;
public const val `TS_ST_CORRECTION`: `TEXT_STORE_TEXT_CHANGE_FLAGS` = 1u;
public const val `TS_ST_NONE`: `TEXT_STORE_TEXT_CHANGE_FLAGS` = 0u;
public const val `TS_S_ASYNC`: Int = 262912;
public const val `TS_TC_CORRECTION`: `TEXT_STORE_CHANGE_FLAGS` = 1u;
public const val `TS_TC_NONE`: `TEXT_STORE_CHANGE_FLAGS` = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TS_TEXTCHANGE` (
    public var `acpStart`: Int,
    public var `acpOldEnd`: Int,
    public var `acpNewEnd`: Int,
)
public const val `TS_VCOOKIE_NUL`: UInt = 4294967295u;
public typealias `TfActiveSelEnd` = Int;
public typealias `TfAnchor` = Int;
public typealias `TfCandidateResult` = Int;
public typealias `TfGravity` = Int;
public typealias `TfIntegratableCandidateListSelectionStyle` = Int;
public typealias `TfLBBalloonStyle` = Int;
public typealias `TfLBIClick` = Int;
public typealias `TfLayoutCode` = Int;
public typealias `TfSapiObject` = Int;
public typealias `TfShiftDir` = Int;
public typealias `TsActiveSelEnd` = Int;
public typealias `TsGravity` = Int;
public typealias `TsLayoutCode` = Int;
public typealias `TsRunType` = Int;
public typealias `TsShiftDir` = Int;
