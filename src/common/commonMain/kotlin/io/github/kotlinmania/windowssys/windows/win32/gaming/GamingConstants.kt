package io.github.kotlinmania.windowssys.windows.win32.gaming

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.w

public val GAMESTATS_OPEN_CREATED: GamestatsOpenResult = 0

public val GAMESTATS_OPEN_OPENED: GamestatsOpenResult = 1

public val GAMESTATS_OPEN_OPENONLY: GamestatsOpenType = 1

public val GAMESTATS_OPEN_OPENORCREATE: GamestatsOpenType = 0

public val GAMING_DEVICE_DEVICE_ID_NONE: GamingDeviceDeviceId = 0

public val GAMING_DEVICE_DEVICE_ID_XBOX_ONE: GamingDeviceDeviceId = 1988865574

public val GAMING_DEVICE_DEVICE_ID_XBOX_ONE_S: GamingDeviceDeviceId = 712204761

public val GAMING_DEVICE_DEVICE_ID_XBOX_ONE_X: GamingDeviceDeviceId = 1523980231

public val GAMING_DEVICE_DEVICE_ID_XBOX_ONE_X_DEVKIT: GamingDeviceDeviceId = 284675555

public val GAMING_DEVICE_DEVICE_ID_XBOX_SERIES_S: GamingDeviceDeviceId = 489159355

public val GAMING_DEVICE_DEVICE_ID_XBOX_SERIES_X: GamingDeviceDeviceId = 796540415

public val GAMING_DEVICE_DEVICE_ID_XBOX_SERIES_X_DEVKIT: GamingDeviceDeviceId = -561359263

public val GAMING_DEVICE_VENDOR_ID_MICROSOFT: GamingDeviceVendorId = -1024700366

public val GAMING_DEVICE_VENDOR_ID_NONE: GamingDeviceVendorId = 0

public val GIS_ALL_USERS: GameInstallScope = 3

public val GIS_CURRENT_USER: GameInstallScope = 2

public val GIS_NOT_INSTALLED: GameInstallScope = 1

public val GAME_EXPLORER: Guid = Guid.fromU128(U128(0x9a5ea99030344d6fuL, 0x912801f3c61022bcuL))

public val GAME_STATISTICS: Guid = Guid.fromU128(U128(0xdbc85a2cc0dc4961uL, 0xb6e2d28b62c11ad4uL))

public val ID_GDF_THUMBNAIL_STR: Pcwstr = w("__GDF_THUMBNAIL")

public val ID_GDF_XML_STR: Pcwstr = w("__GDF_XML")

public val XBL_IDP_AUTH_TOKEN_STATUS_LOAD_MSA_ACCOUNT_FAILED: XblIdpAuthTokenStatus = 3

public val XBL_IDP_AUTH_TOKEN_STATUS_MSA_INTERRUPT: XblIdpAuthTokenStatus = 5

public val XBL_IDP_AUTH_TOKEN_STATUS_NO_ACCOUNT_SET: XblIdpAuthTokenStatus = 2

public val XBL_IDP_AUTH_TOKEN_STATUS_OFFLINE_NO_CONSENT: XblIdpAuthTokenStatus = 6

public val XBL_IDP_AUTH_TOKEN_STATUS_OFFLINE_SUCCESS: XblIdpAuthTokenStatus = 1

public val XBL_IDP_AUTH_TOKEN_STATUS_SUCCESS: XblIdpAuthTokenStatus = 0

public val XBL_IDP_AUTH_TOKEN_STATUS_UNKNOWN: XblIdpAuthTokenStatus = -1

public val XBL_IDP_AUTH_TOKEN_STATUS_VIEW_NOT_SET: XblIdpAuthTokenStatus = 7

public val XBL_IDP_AUTH_TOKEN_STATUS_XBOX_VETO: XblIdpAuthTokenStatus = 4

public val XPRIVILEGE_ADD_FRIEND: KnownGamingPrivileges = 255

public val XPRIVILEGE_BROADCAST: KnownGamingPrivileges = 190

public val XPRIVILEGE_CLOUD_GAMING_JOIN_SESSION: KnownGamingPrivileges = 208

public val XPRIVILEGE_CLOUD_GAMING_MANAGE_SESSION: KnownGamingPrivileges = 207

public val XPRIVILEGE_CLOUD_SAVED_GAMES: KnownGamingPrivileges = 209

public val XPRIVILEGE_COMMUNICATIONS: KnownGamingPrivileges = 252

public val XPRIVILEGE_COMMUNICATION_VOICE_INGAME: KnownGamingPrivileges = 205

public val XPRIVILEGE_COMMUNICATION_VOICE_SKYPE: KnownGamingPrivileges = 206

public val XPRIVILEGE_GAME_DVR: KnownGamingPrivileges = 198

public val XPRIVILEGE_MULTIPLAYER_PARTIES: KnownGamingPrivileges = 203

public val XPRIVILEGE_MULTIPLAYER_SESSIONS: KnownGamingPrivileges = 254

public val XPRIVILEGE_PREMIUM_CONTENT: KnownGamingPrivileges = 214

public val XPRIVILEGE_PREMIUM_VIDEO: KnownGamingPrivileges = 224

public val XPRIVILEGE_PROFILE_VIEWING: KnownGamingPrivileges = 249

public val XPRIVILEGE_PURCHASE_CONTENT: KnownGamingPrivileges = 245

public val XPRIVILEGE_SHARE_CONTENT: KnownGamingPrivileges = 211

public val XPRIVILEGE_SHARE_KINECT_CONTENT: KnownGamingPrivileges = 199

public val XPRIVILEGE_SOCIAL_NETWORK_SHARING: KnownGamingPrivileges = 220

public val XPRIVILEGE_SUBSCRIPTION_CONTENT: KnownGamingPrivileges = 219

public val XPRIVILEGE_USER_CREATED_CONTENT: KnownGamingPrivileges = 247

public val XPRIVILEGE_VIDEO_COMMUNICATIONS: KnownGamingPrivileges = 235

public val XPRIVILEGE_VIEW_FRIENDS_LIST: KnownGamingPrivileges = 197

public val XBL_IDP_AUTH_MANAGER: Guid = Guid.fromU128(U128(0xce23534b56d84978uL, 0x86a27ee570640468uL))

public val XBL_IDP_AUTH_TOKEN_RESULT: Guid = Guid.fromU128(U128(0x9f493441744a410cuL, 0xae2b9a22f7c7731fuL))
