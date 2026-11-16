package io.github.kotlinmania.windowssys.windows.win32.system.securitycenter

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid

public val SECURITY_PRODUCT_TYPE_ANTISPYWARE: SecurityProductType = 2

public val SECURITY_PRODUCT_TYPE_ANTIVIRUS: SecurityProductType = 0

public val SECURITY_PRODUCT_TYPE_FIREWALL: SecurityProductType = 1

public val WSC_SECURITY_PRODUCT_OUT_OF_DATE: WscSecuritySignatureStatus = 0

public val WSC_SECURITY_PRODUCT_STATE_EXPIRED: WscSecurityProductState = 3

public val WSC_SECURITY_PRODUCT_STATE_OFF: WscSecurityProductState = 1

public val WSC_SECURITY_PRODUCT_STATE_ON: WscSecurityProductState = 0

public val WSC_SECURITY_PRODUCT_STATE_SNOOZED: WscSecurityProductState = 2

public val WSC_SECURITY_PRODUCT_SUBSTATUS_ACTION_NEEDED: WscSecurityProductSubstatus = 3

public val WSC_SECURITY_PRODUCT_SUBSTATUS_ACTION_RECOMMENDED: WscSecurityProductSubstatus = 2

public val WSC_SECURITY_PRODUCT_SUBSTATUS_NOT_SET: WscSecurityProductSubstatus = 0

public val WSC_SECURITY_PRODUCT_SUBSTATUS_NO_ACTION: WscSecurityProductSubstatus = 1

public val WSC_SECURITY_PRODUCT_UP_TO_DATE: WscSecuritySignatureStatus = 1

public val WSC_SECURITY_PROVIDER_ALL: WscSecurityProvider = 127

public val WSC_SECURITY_PROVIDER_ANTISPYWARE: WscSecurityProvider = 8

public val WSC_SECURITY_PROVIDER_ANTIVIRUS: WscSecurityProvider = 4

public val WSC_SECURITY_PROVIDER_AUTOUPDATE_SETTINGS: WscSecurityProvider = 2

public val WSC_SECURITY_PROVIDER_FIREWALL: WscSecurityProvider = 1

public val WSC_SECURITY_PROVIDER_HEALTH_GOOD: WscSecurityProviderHealth = 0

public val WSC_SECURITY_PROVIDER_HEALTH_NOTMONITORED: WscSecurityProviderHealth = 1

public val WSC_SECURITY_PROVIDER_HEALTH_POOR: WscSecurityProviderHealth = 2

public val WSC_SECURITY_PROVIDER_HEALTH_SNOOZE: WscSecurityProviderHealth = 3

public val WSC_SECURITY_PROVIDER_INTERNET_SETTINGS: WscSecurityProvider = 16

public val WSC_SECURITY_PROVIDER_NONE: WscSecurityProvider = 0

public val WSC_SECURITY_PROVIDER_SERVICE: WscSecurityProvider = 64

public val WSC_SECURITY_PROVIDER_USER_ACCOUNT_CONTROL: WscSecurityProvider = 32

public val WSC_DEFAULT_PRODUCT: Guid = Guid.fromU128(U128(0x2981a36ef22d11e5uL, 0x9ce95e5517507c66uL))

public val WSC_PRODUCT_LIST: Guid = Guid.fromU128(U128(0x17072f7b9abe4a74uL, 0xa2611eb76b55107auL))
