package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog

import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val CRYPTCAT_ADDCATALOG_HARDLINK: UInt = 1u

public val CRYPTCAT_ADDCATALOG_NONE: UInt = 0u

public val CRYPTCAT_ATTR_AUTHENTICATED: CryptcatattributeFlags = 268435456u

public val CRYPTCAT_ATTR_DATAASCII: CryptcatattributeFlags = 65536u

public val CRYPTCAT_ATTR_DATABASE64: CryptcatattributeFlags = 131072u

public val CRYPTCAT_ATTR_DATAREPLACE: CryptcatattributeFlags = 262144u

public val CRYPTCAT_ATTR_NAMEASCII: CryptcatattributeFlags = 1u

public val CRYPTCAT_ATTR_NAMEOBJID: CryptcatattributeFlags = 2u

public val CRYPTCAT_ATTR_NO_AUTO_COMPAT_ENTRY: CryptcatattributeFlags = 16777216u

public val CRYPTCAT_ATTR_UNAUTHENTICATED: CryptcatattributeFlags = 536870912u

public val CRYPTCAT_E_AREA_ATTRIBUTE: UInt = 131072u

public val CRYPTCAT_E_AREA_HEADER: UInt = 0u

public val CRYPTCAT_E_AREA_MEMBER: UInt = 65536u

public val CRYPTCAT_E_CDF_ATTR_TOOFEWVALUES: UInt = 131074u

public val CRYPTCAT_E_CDF_ATTR_TYPECOMBO: UInt = 131076u

public val CRYPTCAT_E_CDF_BAD_GUID_CONV: UInt = 131073u

public val CRYPTCAT_E_CDF_DUPLICATE: UInt = 2u

public val CRYPTCAT_E_CDF_MEMBER_FILENOTFOUND: UInt = 65540u

public val CRYPTCAT_E_CDF_MEMBER_FILE_PATH: UInt = 65537u

public val CRYPTCAT_E_CDF_MEMBER_INDIRECTDATA: UInt = 65538u

public val CRYPTCAT_E_CDF_TAGNOTFOUND: UInt = 4u

public val CRYPTCAT_E_CDF_UNSUPPORTED: UInt = 1u

public val CRYPTCAT_FILEEXT: Pcwstr = w("CAT")

public val CRYPTCAT_MAX_MEMBERTAG: UInt = 64u

public val CRYPTCAT_MEMBER_SORTED: UInt = 1073741824u

public val CRYPTCAT_OPEN_ALWAYS: CryptcatOpenFlags = 2u

public val CRYPTCAT_OPEN_CREATENEW: CryptcatOpenFlags = 1u

public val CRYPTCAT_OPEN_EXCLUDE_PAGE_HASHES: CryptcatOpenFlags = 65536u

public val CRYPTCAT_OPEN_EXISTING: CryptcatOpenFlags = 4u

public val CRYPTCAT_OPEN_FLAGS_MASK: CryptcatOpenFlags = 4294901760u

public val CRYPTCAT_OPEN_INCLUDE_PAGE_HASHES: CryptcatOpenFlags = 131072u

public val CRYPTCAT_OPEN_NO_CONTENT_HCRYPTMSG: CryptcatOpenFlags = 536870912u

public val CRYPTCAT_OPEN_SORTED: CryptcatOpenFlags = 1073741824u

public val CRYPTCAT_OPEN_VERIFYSIGHASH: CryptcatOpenFlags = 268435456u

public val CRYPTCAT_VERSION_1: CryptcatVersion = 256u

public val CRYPTCAT_VERSION_2: CryptcatVersion = 512u

public val SZ_OID_CATALOG_LIST: Pcstr = s("1.3.6.1.4.1.311.12.1.1")

public val SZ_OID_CATALOG_LIST_MEMBER: Pcstr = s("1.3.6.1.4.1.311.12.1.2")

public val SZ_OID_CATALOG_LIST_MEMBER2: Pcstr = s("1.3.6.1.4.1.311.12.1.3")
