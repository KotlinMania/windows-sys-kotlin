package io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid

public val APPLICATION_USER_MODEL_ID_MAX_LENGTH: UInt = 130u

public val APPLICATION_USER_MODEL_ID_MIN_LENGTH: UInt = 20u

public val APPX_BUNDLE_FOOTPRINT_FILE_TYPE_BLOCKMAP: AppxBundleFootprintFileType = 1

public val APPX_BUNDLE_FOOTPRINT_FILE_TYPE_FIRST: AppxBundleFootprintFileType = 0

public val APPX_BUNDLE_FOOTPRINT_FILE_TYPE_LAST: AppxBundleFootprintFileType = 2

public val APPX_BUNDLE_FOOTPRINT_FILE_TYPE_MANIFEST: AppxBundleFootprintFileType = 0

public val APPX_BUNDLE_FOOTPRINT_FILE_TYPE_SIGNATURE: AppxBundleFootprintFileType = 2

public val APPX_BUNDLE_PAYLOAD_PACKAGE_TYPE_APPLICATION: AppxBundlePayloadPackageType = 0

public val APPX_BUNDLE_PAYLOAD_PACKAGE_TYPE_RESOURCE: AppxBundlePayloadPackageType = 1

public val APPX_CAPABILITY_APPOINTMENTS: AppxCapabilities = 1024

public val APPX_CAPABILITY_CLASS_ALL: AppxCapabilityClassType = 7

public val APPX_CAPABILITY_CLASS_CUSTOM: AppxCapabilityClassType = 8

public val APPX_CAPABILITY_CLASS_DEFAULT: AppxCapabilityClassType = 0

public val APPX_CAPABILITY_CLASS_GENERAL: AppxCapabilityClassType = 1

public val APPX_CAPABILITY_CLASS_RESTRICTED: AppxCapabilityClassType = 2

public val APPX_CAPABILITY_CLASS_WINDOWS: AppxCapabilityClassType = 4

public val APPX_CAPABILITY_CONTACTS: AppxCapabilities = 2048

public val APPX_CAPABILITY_DOCUMENTS_LIBRARY: AppxCapabilities = 8

public val APPX_CAPABILITY_ENTERPRISE_AUTHENTICATION: AppxCapabilities = 128

public val APPX_CAPABILITY_INTERNET_CLIENT: AppxCapabilities = 1

public val APPX_CAPABILITY_INTERNET_CLIENT_SERVER: AppxCapabilities = 2

public val APPX_CAPABILITY_MUSIC_LIBRARY: AppxCapabilities = 64

public val APPX_CAPABILITY_PICTURES_LIBRARY: AppxCapabilities = 16

public val APPX_CAPABILITY_PRIVATE_NETWORK_CLIENT_SERVER: AppxCapabilities = 4

public val APPX_CAPABILITY_REMOVABLE_STORAGE: AppxCapabilities = 512

public val APPX_CAPABILITY_SHARED_USER_CERTIFICATES: AppxCapabilities = 256

public val APPX_CAPABILITY_VIDEOS_LIBRARY: AppxCapabilities = 32

public val APPX_COMPRESSION_OPTION_FAST: AppxCompressionOption = 3

public val APPX_COMPRESSION_OPTION_MAXIMUM: AppxCompressionOption = 2

public val APPX_COMPRESSION_OPTION_NONE: AppxCompressionOption = 0

public val APPX_COMPRESSION_OPTION_NORMAL: AppxCompressionOption = 1

public val APPX_COMPRESSION_OPTION_SUPERFAST: AppxCompressionOption = 4

public val APPX_ENCRYPTED_PACKAGE_OPTION_DIFFUSION: AppxEncryptedPackageOptions = 1

public val APPX_ENCRYPTED_PACKAGE_OPTION_NONE: AppxEncryptedPackageOptions = 0

public val APPX_ENCRYPTED_PACKAGE_OPTION_PAGE_HASHING: AppxEncryptedPackageOptions = 2

public val APPX_FOOTPRINT_FILE_TYPE_BLOCKMAP: AppxFootprintFileType = 1

public val APPX_FOOTPRINT_FILE_TYPE_CODEINTEGRITY: AppxFootprintFileType = 3

public val APPX_FOOTPRINT_FILE_TYPE_CONTENTGROUPMAP: AppxFootprintFileType = 4

public val APPX_FOOTPRINT_FILE_TYPE_MANIFEST: AppxFootprintFileType = 0

public val APPX_FOOTPRINT_FILE_TYPE_SIGNATURE: AppxFootprintFileType = 2

public val APPX_PACKAGE_ARCHITECTURE2_ARM: AppxPackageArchitecture2 = 5

public val APPX_PACKAGE_ARCHITECTURE2_ARM64: AppxPackageArchitecture2 = 12

public val APPX_PACKAGE_ARCHITECTURE2_NEUTRAL: AppxPackageArchitecture2 = 11

public val APPX_PACKAGE_ARCHITECTURE2_UNKNOWN: AppxPackageArchitecture2 = 65535

public val APPX_PACKAGE_ARCHITECTURE2_X64: AppxPackageArchitecture2 = 9

public val APPX_PACKAGE_ARCHITECTURE2_X86: AppxPackageArchitecture2 = 0

public val APPX_PACKAGE_ARCHITECTURE2_X86_ON_ARM64: AppxPackageArchitecture2 = 14

public val APPX_PACKAGE_ARCHITECTURE_ARM: AppxPackageArchitecture = 5

public val APPX_PACKAGE_ARCHITECTURE_ARM64: AppxPackageArchitecture = 12

public val APPX_PACKAGE_ARCHITECTURE_NEUTRAL: AppxPackageArchitecture = 11

public val APPX_PACKAGE_ARCHITECTURE_X64: AppxPackageArchitecture = 9

public val APPX_PACKAGE_ARCHITECTURE_X86: AppxPackageArchitecture = 0

public val APPX_PACKAGE_EDITOR_UPDATE_PACKAGE_MANIFEST_OPTION_LOCALIZED: AppxPackageEditorUpdatePackageManifestOptions = 2

public val APPX_PACKAGE_EDITOR_UPDATE_PACKAGE_MANIFEST_OPTION_NONE: AppxPackageEditorUpdatePackageManifestOptions = 0

public val APPX_PACKAGE_EDITOR_UPDATE_PACKAGE_MANIFEST_OPTION_SKIP_VALIDATION: AppxPackageEditorUpdatePackageManifestOptions = 1

public val APPX_PACKAGE_EDITOR_UPDATE_PACKAGE_OPTION_APPEND_DELTA: AppxPackageEditorUpdatePackageOption = 0

public val APPX_PACKAGING_CONTEXT_CHANGE_TYPE_CHANGE: AppxPackagingContextChangeType = 1

public val APPX_PACKAGING_CONTEXT_CHANGE_TYPE_DETAILS: AppxPackagingContextChangeType = 2

public val APPX_PACKAGING_CONTEXT_CHANGE_TYPE_END: AppxPackagingContextChangeType = 3

public val APPX_PACKAGING_CONTEXT_CHANGE_TYPE_START: AppxPackagingContextChangeType = 0

public val ADD_PACKAGE_DEPENDENCY_OPTIONS_NONE: AddPackageDependencyOptions = 0

public val ADD_PACKAGE_DEPENDENCY_OPTIONS_PREPEND_IF_RANK_COLLISION: AddPackageDependencyOptions = 1

public val APP_POLICY_CLR_COMPAT_CLASSIC_DESKTOP: AppPolicyClrCompat = 1

public val APP_POLICY_CLR_COMPAT_OTHER: AppPolicyClrCompat = 0

public val APP_POLICY_CLR_COMPAT_PACKAGED_DESKTOP: AppPolicyClrCompat = 3

public val APP_POLICY_CLR_COMPAT_UNIVERSAL: AppPolicyClrCompat = 2

public val APP_POLICY_CREATE_FILE_ACCESS_FULL: AppPolicyCreateFileAccess = 0

public val APP_POLICY_CREATE_FILE_ACCESS_LIMITED: AppPolicyCreateFileAccess = 1

public val APP_POLICY_LIFECYCLE_MANAGEMENT_MANAGED: AppPolicyLifecycleManagement = 1

public val APP_POLICY_LIFECYCLE_MANAGEMENT_UNMANAGED: AppPolicyLifecycleManagement = 0

public val APP_POLICY_MEDIA_FOUNDATION_CODEC_LOADING_ALL: AppPolicyMediaFoundationCodecLoading = 0

public val APP_POLICY_MEDIA_FOUNDATION_CODEC_LOADING_INBOX_ONLY: AppPolicyMediaFoundationCodecLoading = 1

public val APP_POLICY_PROCESS_TERMINATION_METHOD_EXIT_PROCESS: AppPolicyProcessTerminationMethod = 0

public val APP_POLICY_PROCESS_TERMINATION_METHOD_TERMINATE_PROCESS: AppPolicyProcessTerminationMethod = 1

public val APP_POLICY_SHOW_DEVELOPER_DIAGNOSTIC_NONE: AppPolicyShowDeveloperDiagnostic = 0

public val APP_POLICY_SHOW_DEVELOPER_DIAGNOSTIC_SHOW_UI: AppPolicyShowDeveloperDiagnostic = 1

public val APP_POLICY_THREAD_INITIALIZATION_TYPE_INITIALIZE_WIN_RT: AppPolicyThreadInitializationType = 1

public val APP_POLICY_THREAD_INITIALIZATION_TYPE_NONE: AppPolicyThreadInitializationType = 0

public val APP_POLICY_WINDOWING_MODEL_CLASSIC_DESKTOP: AppPolicyWindowingModel = 2

public val APP_POLICY_WINDOWING_MODEL_CLASSIC_PHONE: AppPolicyWindowingModel = 3

public val APP_POLICY_WINDOWING_MODEL_NONE: AppPolicyWindowingModel = 0

public val APP_POLICY_WINDOWING_MODEL_UNIVERSAL: AppPolicyWindowingModel = 1

public val CREATE_PACKAGE_DEPENDENCY_OPTIONS_DO_NOT_VERIFY_DEPENDENCY_RESOLUTION: CreatePackageDependencyOptions = 1

public val CREATE_PACKAGE_DEPENDENCY_OPTIONS_NONE: CreatePackageDependencyOptions = 0

public val CREATE_PACKAGE_DEPENDENCY_OPTIONS_SCOPE_IS_SYSTEM: CreatePackageDependencyOptions = 2

public val DX_FEATURE_LEVEL_10: DxFeatureLevel = 2

public val DX_FEATURE_LEVEL_11: DxFeatureLevel = 3

public val DX_FEATURE_LEVEL_9: DxFeatureLevel = 1

public val DX_FEATURE_LEVEL_UNSPECIFIED: DxFeatureLevel = 0

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

public val PACKAGE_DEPENDENCY_LIFETIME_KIND_FILE_PATH: PackageDependencyLifetimeKind = 1

public val PACKAGE_DEPENDENCY_LIFETIME_KIND_PROCESS: PackageDependencyLifetimeKind = 0

public val PACKAGE_DEPENDENCY_LIFETIME_KIND_REGISTRY_KEY: PackageDependencyLifetimeKind = 2

public val PACKAGE_DEPENDENCY_PROCESSOR_ARCHITECTURES_ARM: PackageDependencyProcessorArchitectures = 8

public val PACKAGE_DEPENDENCY_PROCESSOR_ARCHITECTURES_ARM64: PackageDependencyProcessorArchitectures = 16

public val PACKAGE_DEPENDENCY_PROCESSOR_ARCHITECTURES_NEUTRAL: PackageDependencyProcessorArchitectures = 1

public val PACKAGE_DEPENDENCY_PROCESSOR_ARCHITECTURES_NONE: PackageDependencyProcessorArchitectures = 0

public val PACKAGE_DEPENDENCY_PROCESSOR_ARCHITECTURES_X64: PackageDependencyProcessorArchitectures = 4

public val PACKAGE_DEPENDENCY_PROCESSOR_ARCHITECTURES_X86: PackageDependencyProcessorArchitectures = 2

public val PACKAGE_DEPENDENCY_PROCESSOR_ARCHITECTURES_X86A64: PackageDependencyProcessorArchitectures = 32

public val PACKAGE_INFO3TYPE_PACKAGE_INFO_GENERATION: PackageInfo3Type = 16

public val PACKAGE_ORIGIN_DEVELOPER_SIGNED: PackageOrigin = 5

public val PACKAGE_ORIGIN_DEVELOPER_UNSIGNED: PackageOrigin = 4

public val PACKAGE_ORIGIN_INBOX: PackageOrigin = 2

public val PACKAGE_ORIGIN_LINE_OF_BUSINESS: PackageOrigin = 6

public val PACKAGE_ORIGIN_STORE: PackageOrigin = 3

public val PACKAGE_ORIGIN_UNKNOWN: PackageOrigin = 0

public val PACKAGE_ORIGIN_UNSIGNED: PackageOrigin = 1

public val PACKAGE_PATH_TYPE_EFFECTIVE: PackagePathType = 2

public val PACKAGE_PATH_TYPE_EFFECTIVE_EXTERNAL: PackagePathType = 5

public val PACKAGE_PATH_TYPE_INSTALL: PackagePathType = 0

public val PACKAGE_PATH_TYPE_MACHINE_EXTERNAL: PackagePathType = 3

public val PACKAGE_PATH_TYPE_MUTABLE: PackagePathType = 1

public val PACKAGE_PATH_TYPE_USER_EXTERNAL: PackagePathType = 4

public val APPX_BUNDLE_FACTORY: Guid = Guid.fromU128(U128(0x378e0446538443b7uL, 0x8877e7dbdd883446uL))

public val APPX_ENCRYPTION_FACTORY: Guid = Guid.fromU128(U128(0xdc664fddd86846eeuL, 0x87808d196cb739f7uL))

public val APPX_FACTORY: Guid = Guid.fromU128(U128(0x5842a140ff9f4166uL, 0x8f5c62f5b7b0c781uL))

public val APPX_PACKAGE_EDITOR: Guid = Guid.fromU128(U128(0xf004f2caaebc4b0duL, 0xbf58e516d5bcc0abuL))

public val APPX_PACKAGING_DIAGNOSTIC_EVENT_SINK_MANAGER: Guid = Guid.fromU128(U128(0x50ca0a4615884161uL, 0x8ed2ef9e469ced5duL))
