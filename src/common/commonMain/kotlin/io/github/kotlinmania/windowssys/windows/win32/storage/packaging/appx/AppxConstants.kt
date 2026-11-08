package io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.GUID

public val APPLICATION_USER_MODEL_ID_MAX_LENGTH: UInt = 130u

public val APPLICATION_USER_MODEL_ID_MIN_LENGTH: UInt = 20u

public val APPX_BUNDLE_FOOTPRINT_FILE_TYPE_BLOCKMAP: APPX_BUNDLE_FOOTPRINT_FILE_TYPE = 1

public val APPX_BUNDLE_FOOTPRINT_FILE_TYPE_FIRST: APPX_BUNDLE_FOOTPRINT_FILE_TYPE = 0

public val APPX_BUNDLE_FOOTPRINT_FILE_TYPE_LAST: APPX_BUNDLE_FOOTPRINT_FILE_TYPE = 2

public val APPX_BUNDLE_FOOTPRINT_FILE_TYPE_MANIFEST: APPX_BUNDLE_FOOTPRINT_FILE_TYPE = 0

public val APPX_BUNDLE_FOOTPRINT_FILE_TYPE_SIGNATURE: APPX_BUNDLE_FOOTPRINT_FILE_TYPE = 2

public val APPX_BUNDLE_PAYLOAD_PACKAGE_TYPE_APPLICATION: APPX_BUNDLE_PAYLOAD_PACKAGE_TYPE = 0

public val APPX_BUNDLE_PAYLOAD_PACKAGE_TYPE_RESOURCE: APPX_BUNDLE_PAYLOAD_PACKAGE_TYPE = 1

public val APPX_CAPABILITY_APPOINTMENTS: APPX_CAPABILITIES = 1024

public val APPX_CAPABILITY_CLASS_ALL: APPX_CAPABILITY_CLASS_TYPE = 7

public val APPX_CAPABILITY_CLASS_CUSTOM: APPX_CAPABILITY_CLASS_TYPE = 8

public val APPX_CAPABILITY_CLASS_DEFAULT: APPX_CAPABILITY_CLASS_TYPE = 0

public val APPX_CAPABILITY_CLASS_GENERAL: APPX_CAPABILITY_CLASS_TYPE = 1

public val APPX_CAPABILITY_CLASS_RESTRICTED: APPX_CAPABILITY_CLASS_TYPE = 2

public val APPX_CAPABILITY_CLASS_WINDOWS: APPX_CAPABILITY_CLASS_TYPE = 4

public val APPX_CAPABILITY_CONTACTS: APPX_CAPABILITIES = 2048

public val APPX_CAPABILITY_DOCUMENTS_LIBRARY: APPX_CAPABILITIES = 8

public val APPX_CAPABILITY_ENTERPRISE_AUTHENTICATION: APPX_CAPABILITIES = 128

public val APPX_CAPABILITY_INTERNET_CLIENT: APPX_CAPABILITIES = 1

public val APPX_CAPABILITY_INTERNET_CLIENT_SERVER: APPX_CAPABILITIES = 2

public val APPX_CAPABILITY_MUSIC_LIBRARY: APPX_CAPABILITIES = 64

public val APPX_CAPABILITY_PICTURES_LIBRARY: APPX_CAPABILITIES = 16

public val APPX_CAPABILITY_PRIVATE_NETWORK_CLIENT_SERVER: APPX_CAPABILITIES = 4

public val APPX_CAPABILITY_REMOVABLE_STORAGE: APPX_CAPABILITIES = 512

public val APPX_CAPABILITY_SHARED_USER_CERTIFICATES: APPX_CAPABILITIES = 256

public val APPX_CAPABILITY_VIDEOS_LIBRARY: APPX_CAPABILITIES = 32

public val APPX_COMPRESSION_OPTION_FAST: APPX_COMPRESSION_OPTION = 3

public val APPX_COMPRESSION_OPTION_MAXIMUM: APPX_COMPRESSION_OPTION = 2

public val APPX_COMPRESSION_OPTION_NONE: APPX_COMPRESSION_OPTION = 0

public val APPX_COMPRESSION_OPTION_NORMAL: APPX_COMPRESSION_OPTION = 1

public val APPX_COMPRESSION_OPTION_SUPERFAST: APPX_COMPRESSION_OPTION = 4

public val APPX_ENCRYPTED_PACKAGE_OPTION_DIFFUSION: APPX_ENCRYPTED_PACKAGE_OPTIONS = 1

public val APPX_ENCRYPTED_PACKAGE_OPTION_NONE: APPX_ENCRYPTED_PACKAGE_OPTIONS = 0

public val APPX_ENCRYPTED_PACKAGE_OPTION_PAGE_HASHING: APPX_ENCRYPTED_PACKAGE_OPTIONS = 2

public val APPX_FOOTPRINT_FILE_TYPE_BLOCKMAP: APPX_FOOTPRINT_FILE_TYPE = 1

public val APPX_FOOTPRINT_FILE_TYPE_CODEINTEGRITY: APPX_FOOTPRINT_FILE_TYPE = 3

public val APPX_FOOTPRINT_FILE_TYPE_CONTENTGROUPMAP: APPX_FOOTPRINT_FILE_TYPE = 4

public val APPX_FOOTPRINT_FILE_TYPE_MANIFEST: APPX_FOOTPRINT_FILE_TYPE = 0

public val APPX_FOOTPRINT_FILE_TYPE_SIGNATURE: APPX_FOOTPRINT_FILE_TYPE = 2

public val APPX_PACKAGE_ARCHITECTURE2_ARM: APPX_PACKAGE_ARCHITECTURE2 = 5

public val APPX_PACKAGE_ARCHITECTURE2_ARM64: APPX_PACKAGE_ARCHITECTURE2 = 12

public val APPX_PACKAGE_ARCHITECTURE2_NEUTRAL: APPX_PACKAGE_ARCHITECTURE2 = 11

public val APPX_PACKAGE_ARCHITECTURE2_UNKNOWN: APPX_PACKAGE_ARCHITECTURE2 = 65535

public val APPX_PACKAGE_ARCHITECTURE2_X64: APPX_PACKAGE_ARCHITECTURE2 = 9

public val APPX_PACKAGE_ARCHITECTURE2_X86: APPX_PACKAGE_ARCHITECTURE2 = 0

public val APPX_PACKAGE_ARCHITECTURE2_X86_ON_ARM64: APPX_PACKAGE_ARCHITECTURE2 = 14

public val APPX_PACKAGE_ARCHITECTURE_ARM: APPX_PACKAGE_ARCHITECTURE = 5

public val APPX_PACKAGE_ARCHITECTURE_ARM64: APPX_PACKAGE_ARCHITECTURE = 12

public val APPX_PACKAGE_ARCHITECTURE_NEUTRAL: APPX_PACKAGE_ARCHITECTURE = 11

public val APPX_PACKAGE_ARCHITECTURE_X64: APPX_PACKAGE_ARCHITECTURE = 9

public val APPX_PACKAGE_ARCHITECTURE_X86: APPX_PACKAGE_ARCHITECTURE = 0

public val APPX_PACKAGE_EDITOR_UPDATE_PACKAGE_MANIFEST_OPTION_LOCALIZED: APPX_PACKAGE_EDITOR_UPDATE_PACKAGE_MANIFEST_OPTIONS = 2

public val APPX_PACKAGE_EDITOR_UPDATE_PACKAGE_MANIFEST_OPTION_NONE: APPX_PACKAGE_EDITOR_UPDATE_PACKAGE_MANIFEST_OPTIONS = 0

public val APPX_PACKAGE_EDITOR_UPDATE_PACKAGE_MANIFEST_OPTION_SKIP_VALIDATION: APPX_PACKAGE_EDITOR_UPDATE_PACKAGE_MANIFEST_OPTIONS = 1

public val APPX_PACKAGE_EDITOR_UPDATE_PACKAGE_OPTION_APPEND_DELTA: APPX_PACKAGE_EDITOR_UPDATE_PACKAGE_OPTION = 0

public val APPX_PACKAGING_CONTEXT_CHANGE_TYPE_CHANGE: APPX_PACKAGING_CONTEXT_CHANGE_TYPE = 1

public val APPX_PACKAGING_CONTEXT_CHANGE_TYPE_DETAILS: APPX_PACKAGING_CONTEXT_CHANGE_TYPE = 2

public val APPX_PACKAGING_CONTEXT_CHANGE_TYPE_END: APPX_PACKAGING_CONTEXT_CHANGE_TYPE = 3

public val APPX_PACKAGING_CONTEXT_CHANGE_TYPE_START: APPX_PACKAGING_CONTEXT_CHANGE_TYPE = 0

public val AddPackageDependencyOptions_None: AddPackageDependencyOptions = 0

public val AddPackageDependencyOptions_PrependIfRankCollision: AddPackageDependencyOptions = 1

public val AppPolicyClrCompat_ClassicDesktop: AppPolicyClrCompat = 1

public val AppPolicyClrCompat_Other: AppPolicyClrCompat = 0

public val AppPolicyClrCompat_PackagedDesktop: AppPolicyClrCompat = 3

public val AppPolicyClrCompat_Universal: AppPolicyClrCompat = 2

public val AppPolicyCreateFileAccess_Full: AppPolicyCreateFileAccess = 0

public val AppPolicyCreateFileAccess_Limited: AppPolicyCreateFileAccess = 1

public val AppPolicyLifecycleManagement_Managed: AppPolicyLifecycleManagement = 1

public val AppPolicyLifecycleManagement_Unmanaged: AppPolicyLifecycleManagement = 0

public val AppPolicyMediaFoundationCodecLoading_All: AppPolicyMediaFoundationCodecLoading = 0

public val AppPolicyMediaFoundationCodecLoading_InboxOnly: AppPolicyMediaFoundationCodecLoading = 1

public val AppPolicyProcessTerminationMethod_ExitProcess: AppPolicyProcessTerminationMethod = 0

public val AppPolicyProcessTerminationMethod_TerminateProcess: AppPolicyProcessTerminationMethod = 1

public val AppPolicyShowDeveloperDiagnostic_None: AppPolicyShowDeveloperDiagnostic = 0

public val AppPolicyShowDeveloperDiagnostic_ShowUI: AppPolicyShowDeveloperDiagnostic = 1

public val AppPolicyThreadInitializationType_InitializeWinRT: AppPolicyThreadInitializationType = 1

public val AppPolicyThreadInitializationType_None: AppPolicyThreadInitializationType = 0

public val AppPolicyWindowingModel_ClassicDesktop: AppPolicyWindowingModel = 2

public val AppPolicyWindowingModel_ClassicPhone: AppPolicyWindowingModel = 3

public val AppPolicyWindowingModel_None: AppPolicyWindowingModel = 0

public val AppPolicyWindowingModel_Universal: AppPolicyWindowingModel = 1

public val AppxBundleFactory: GUID = GUID.from_u128(U128(0x378e0446538443b7uL, 0x8877e7dbdd883446uL))

public val AppxEncryptionFactory: GUID = GUID.from_u128(U128(0xdc664fddd86846eeuL, 0x87808d196cb739f7uL))

public val AppxFactory: GUID = GUID.from_u128(U128(0x5842a140ff9f4166uL, 0x8f5c62f5b7b0c781uL))

public val AppxPackageEditor: GUID = GUID.from_u128(U128(0xf004f2caaebc4b0duL, 0xbf58e516d5bcc0abuL))

public val AppxPackagingDiagnosticEventSinkManager: GUID = GUID.from_u128(U128(0x50ca0a4615884161uL, 0x8ed2ef9e469ced5duL))

public val CreatePackageDependencyOptions_DoNotVerifyDependencyResolution: CreatePackageDependencyOptions = 1

public val CreatePackageDependencyOptions_None: CreatePackageDependencyOptions = 0

public val CreatePackageDependencyOptions_ScopeIsSystem: CreatePackageDependencyOptions = 2

public val DX_FEATURE_LEVEL_10: DX_FEATURE_LEVEL = 2

public val DX_FEATURE_LEVEL_11: DX_FEATURE_LEVEL = 3

public val DX_FEATURE_LEVEL_9: DX_FEATURE_LEVEL = 1

public val DX_FEATURE_LEVEL_UNSPECIFIED: DX_FEATURE_LEVEL = 0

public val PACKAGE_APPLICATIONS_MAX_COUNT: UInt = 100u

public val PACKAGE_APPLICATIONS_MIN_COUNT: UInt = 0u

public val PACKAGE_ARCHITECTURE_MAX_LENGTH: UInt = 7u

public val PACKAGE_ARCHITECTURE_MIN_LENGTH: UInt = 3u

public val PACKAGE_DEPENDENCY_RANK_DEFAULT: UInt = 0u

public val PACKAGE_FAMILY_MAX_RESOURCE_PACKAGES: UInt = 512u

public val PACKAGE_FAMILY_MIN_RESOURCE_PACKAGES: UInt = 0u

public val PACKAGE_FAMILY_NAME_MAX_LENGTH: UInt = 64u

public val PACKAGE_FAMILY_NAME_MIN_LENGTH: UInt = 17u

public val PACKAGE_FILTER_ALL_LOADED: UInt = 0u

public val PACKAGE_FILTER_BUNDLE: UInt = 128u

public val PACKAGE_FILTER_DIRECT: UInt = 32u

public val PACKAGE_FILTER_DYNAMIC: UInt = 1048576u

public val PACKAGE_FILTER_HEAD: UInt = 16u

public val PACKAGE_FILTER_HOSTRUNTIME: UInt = 2097152u

public val PACKAGE_FILTER_IS_IN_RELATED_SET: UInt = 262144u

public val PACKAGE_FILTER_OPTIONAL: UInt = 131072u

public val PACKAGE_FILTER_RESOURCE: UInt = 64u

public val PACKAGE_FILTER_STATIC: UInt = 524288u

public val PACKAGE_FULL_NAME_MAX_LENGTH: UInt = 127u

public val PACKAGE_FULL_NAME_MIN_LENGTH: UInt = 30u

public val PACKAGE_GRAPH_MAX_SIZE: UInt = 641u

public val PACKAGE_GRAPH_MIN_SIZE: UInt = 1u

public val PACKAGE_INFORMATION_BASIC: UInt = 0u

public val PACKAGE_INFORMATION_FULL: UInt = 256u

public val PACKAGE_MAX_DEPENDENCIES: UInt = 128u

public val PACKAGE_MIN_DEPENDENCIES: UInt = 0u

public val PACKAGE_NAME_MAX_LENGTH: UInt = 50u

public val PACKAGE_NAME_MIN_LENGTH: UInt = 3u

public val PACKAGE_PROPERTY_BUNDLE: UInt = 4u

public val PACKAGE_PROPERTY_DEVELOPMENT_MODE: UInt = 65536u

public val PACKAGE_PROPERTY_DYNAMIC: UInt = 1048576u

public val PACKAGE_PROPERTY_FRAMEWORK: UInt = 1u

public val PACKAGE_PROPERTY_HOSTRUNTIME: UInt = 2097152u

public val PACKAGE_PROPERTY_IS_IN_RELATED_SET: UInt = 262144u

public val PACKAGE_PROPERTY_OPTIONAL: UInt = 8u

public val PACKAGE_PROPERTY_RESOURCE: UInt = 2u

public val PACKAGE_PROPERTY_STATIC: UInt = 524288u

public val PACKAGE_PUBLISHERID_MAX_LENGTH: UInt = 13u

public val PACKAGE_PUBLISHERID_MIN_LENGTH: UInt = 13u

public val PACKAGE_PUBLISHER_MAX_LENGTH: UInt = 8192u

public val PACKAGE_PUBLISHER_MIN_LENGTH: UInt = 3u

public val PACKAGE_RELATIVE_APPLICATION_ID_MAX_LENGTH: UInt = 65u

public val PACKAGE_RELATIVE_APPLICATION_ID_MIN_LENGTH: UInt = 2u

public val PACKAGE_RESOURCEID_MAX_LENGTH: UInt = 30u

public val PACKAGE_RESOURCEID_MIN_LENGTH: UInt = 0u

public val PACKAGE_VERSION_MAX_LENGTH: UInt = 23u

public val PACKAGE_VERSION_MIN_LENGTH: UInt = 7u

public val PackageDependencyLifetimeKind_FilePath: PackageDependencyLifetimeKind = 1

public val PackageDependencyLifetimeKind_Process: PackageDependencyLifetimeKind = 0

public val PackageDependencyLifetimeKind_RegistryKey: PackageDependencyLifetimeKind = 2

public val PackageDependencyProcessorArchitectures_Arm: PackageDependencyProcessorArchitectures = 8

public val PackageDependencyProcessorArchitectures_Arm64: PackageDependencyProcessorArchitectures = 16

public val PackageDependencyProcessorArchitectures_Neutral: PackageDependencyProcessorArchitectures = 1

public val PackageDependencyProcessorArchitectures_None: PackageDependencyProcessorArchitectures = 0

public val PackageDependencyProcessorArchitectures_X64: PackageDependencyProcessorArchitectures = 4

public val PackageDependencyProcessorArchitectures_X86: PackageDependencyProcessorArchitectures = 2

public val PackageDependencyProcessorArchitectures_X86A64: PackageDependencyProcessorArchitectures = 32

public val PackageInfo3Type_PackageInfoGeneration: PackageInfo3Type = 16

public val PackageOrigin_DeveloperSigned: PackageOrigin = 5

public val PackageOrigin_DeveloperUnsigned: PackageOrigin = 4

public val PackageOrigin_Inbox: PackageOrigin = 2

public val PackageOrigin_LineOfBusiness: PackageOrigin = 6

public val PackageOrigin_Store: PackageOrigin = 3

public val PackageOrigin_Unknown: PackageOrigin = 0

public val PackageOrigin_Unsigned: PackageOrigin = 1

public val PackagePathType_Effective: PackagePathType = 2

public val PackagePathType_EffectiveExternal: PackagePathType = 5

public val PackagePathType_Install: PackagePathType = 0

public val PackagePathType_MachineExternal: PackagePathType = 3

public val PackagePathType_Mutable: PackagePathType = 1

public val PackagePathType_UserExternal: PackagePathType = 4
