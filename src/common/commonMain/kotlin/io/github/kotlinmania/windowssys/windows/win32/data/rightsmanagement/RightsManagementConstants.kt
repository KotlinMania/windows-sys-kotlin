package io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement

import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.w

public val DRMACTSERVINFOVERSION: UInt = 0u

public val DRMATTESTTYPE_FULLENVIRONMENT: Drmattesttype = 0

public val DRMATTESTTYPE_HASHONLY: Drmattesttype = 1

public val DRMBINDINGFLAGS_IGNORE_VALIDITY_INTERVALS: UInt = 1u

public val DRMBOUNDLICENSEPARAMSVERSION: UInt = 1u

public val DRMCALLBACKVERSION: UInt = 1u

public val DRMCLIENTSTRUCTVERSION: UInt = 1u

public val DRMENCODINGTYPE_BASE64: Drmencodingtype = 0

public val DRMENCODINGTYPE_LONG: Drmencodingtype = 2

public val DRMENCODINGTYPE_RAW: Drmencodingtype = 5

public val DRMENCODINGTYPE_STRING: Drmencodingtype = 1

public val DRMENCODINGTYPE_TIME: Drmencodingtype = 3

public val DRMENCODINGTYPE_UINT: Drmencodingtype = 4

public val DRMENVHANDLE_INVALID: UInt = 0u

public val DRMGLOBALOPTIONS_USE_SERVERSECURITYPROCESSOR: Drmglobaloptions = 1

public val DRMGLOBALOPTIONS_USE_WINHTTP: Drmglobaloptions = 0

public val DRMHANDLE_INVALID: UInt = 0u

public val DRMHSESSION_INVALID: UInt = 0u

public val DRMIDVERSION: UInt = 0u

public val DRMLICENSEACQDATAVERSION: UInt = 0u

public val DRMPUBHANDLE_INVALID: UInt = 0u

public val DRMQUERYHANDLE_INVALID: UInt = 0u

public val DRMSECURITYPROVIDERTYPE_SOFTWARESECREP: Drmsecurityprovidertype = 0

public val DRMSPECTYPE_FILENAME: Drmspectype = 1

public val DRMSPECTYPE_UNKNOWN: Drmspectype = 0

public val DRMTIMETYPE_SYSTEMLOCAL: Drmtimetype = 1

public val DRMTIMETYPE_SYSTEMUTC: Drmtimetype = 0

public val DRM_ACTIVATE_CANCEL: UInt = 8u

public val DRM_ACTIVATE_DELAYED: UInt = 64u

public val DRM_ACTIVATE_GROUPIDENTITY: UInt = 2u

public val DRM_ACTIVATE_MACHINE: UInt = 1u

public val DRM_ACTIVATE_SHARED_GROUPIDENTITY: UInt = 32u

public val DRM_ACTIVATE_SILENT: UInt = 16u

public val DRM_ACTIVATE_TEMPORARY: UInt = 4u

public val DRM_ADD_LICENSE_NOPERSIST: UInt = 0u

public val DRM_ADD_LICENSE_PERSIST: UInt = 1u

public val DRM_AILT_CANCEL: UInt = 4u

public val DRM_AILT_NONSILENT: UInt = 1u

public val DRM_AILT_OBTAIN_ALL: UInt = 2u

public val DRM_AL_CANCEL: UInt = 4u

public val DRM_AL_FETCHNOADVISORY: UInt = 8u

public val DRM_AL_NONSILENT: UInt = 1u

public val DRM_AL_NOPERSIST: UInt = 2u

public val DRM_AL_NOUI: UInt = 16u

public val DRM_AUTO_GENERATE_KEY: UInt = 16u

public val DRM_DEFAULTGROUPIDTYPE_PASSPORT: Pcwstr = w("PassportAuthProvider")

public val DRM_DEFAULTGROUPIDTYPE_WINDOWSAUTH: Pcwstr = w("WindowsAuthProvider")

public val DRM_DISTRIBUTION_POINT_LICENSE_ACQUISITION: DrmDistributionPointInfo = 0

public val DRM_DISTRIBUTION_POINT_PUBLISHING: DrmDistributionPointInfo = 1

public val DRM_DISTRIBUTION_POINT_REFERRAL_INFO: DrmDistributionPointInfo = 2

public val DRM_EL_CLIENTLICENSOR: UInt = 128u

public val DRM_EL_CLIENTLICENSOR_LID: UInt = 256u

public val DRM_EL_EUL: UInt = 32u

public val DRM_EL_EUL_LID: UInt = 64u

public val DRM_EL_EXPIRED: UInt = 4096u

public val DRM_EL_GROUPIDENTITY: UInt = 2u

public val DRM_EL_GROUPIDENTITY_LID: UInt = 8u

public val DRM_EL_GROUPIDENTITY_NAME: UInt = 4u

public val DRM_EL_ISSUANCELICENSE_TEMPLATE: UInt = 16384u

public val DRM_EL_ISSUANCELICENSE_TEMPLATE_LID: UInt = 32768u

public val DRM_EL_ISSUERNAME: UInt = 8192u

public val DRM_EL_MACHINE: UInt = 1u

public val DRM_EL_REVOCATIONLIST: UInt = 1024u

public val DRM_EL_REVOCATIONLIST_LID: UInt = 2048u

public val DRM_EL_SPECIFIED_CLIENTLICENSOR: UInt = 512u

public val DRM_EL_SPECIFIED_GROUPIDENTITY: UInt = 16u

public val DRM_LOCKBOXTYPE_BLACKBOX: UInt = 2u

public val DRM_LOCKBOXTYPE_DEFAULT: UInt = 2u

public val DRM_LOCKBOXTYPE_NONE: UInt = 0u

public val DRM_LOCKBOXTYPE_WHITEBOX: UInt = 1u

public val DRM_MSG_ACQUIRE_ADVISORY: DrmStatusMsg = 3

public val DRM_MSG_ACQUIRE_CLIENTLICENSOR: DrmStatusMsg = 5

public val DRM_MSG_ACQUIRE_ISSUANCE_LICENSE_TEMPLATE: DrmStatusMsg = 6

public val DRM_MSG_ACQUIRE_LICENSE: DrmStatusMsg = 2

public val DRM_MSG_ACTIVATE_GROUPIDENTITY: DrmStatusMsg = 1

public val DRM_MSG_ACTIVATE_MACHINE: DrmStatusMsg = 0

public val DRM_MSG_SIGN_ISSUANCE_LICENSE: DrmStatusMsg = 4

public val DRM_OWNER_LICENSE_NOPERSIST: UInt = 32u

public val DRM_REUSE_KEY: UInt = 64u

public val DRM_SERVER_ISSUANCELICENSE: UInt = 8u

public val DRM_SERVICE_LOCATION_ENTERPRISE: UInt = 2u

public val DRM_SERVICE_LOCATION_INTERNET: UInt = 1u

public val DRM_SERVICE_TYPE_ACTIVATION: UInt = 1u

public val DRM_SERVICE_TYPE_CERTIFICATION: UInt = 2u

public val DRM_SERVICE_TYPE_CLIENTLICENSOR: UInt = 8u

public val DRM_SERVICE_TYPE_PUBLISHING: UInt = 4u

public val DRM_SERVICE_TYPE_SILENT: UInt = 16u

public val DRM_SIGN_CANCEL: UInt = 4u

public val DRM_SIGN_OFFLINE: UInt = 2u

public val DRM_SIGN_ONLINE: UInt = 1u

public val DRM_USAGEPOLICY_TYPE_BYDIGEST: DrmUsagepolicyType = 2

public val DRM_USAGEPOLICY_TYPE_BYNAME: DrmUsagepolicyType = 0

public val DRM_USAGEPOLICY_TYPE_BYPUBLICKEY: DrmUsagepolicyType = 1

public val DRM_USAGEPOLICY_TYPE_OSEXCLUSION: DrmUsagepolicyType = 3

public val MSDRM_CLIENT_ZONE: UInt = 52992u

public val MSDRM_POLICY_ZONE: UInt = 37632u
