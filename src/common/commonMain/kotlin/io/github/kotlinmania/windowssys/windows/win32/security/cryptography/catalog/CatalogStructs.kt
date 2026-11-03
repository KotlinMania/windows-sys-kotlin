@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CRYPT_INTEGER_BLOB

public data class CATALOG_INFO(public var cbStruct: UInt = 0u, public var wszCatalogFile: UShortArray = UShortArray(260)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CATALOG_INFO) return false
        if (this.cbStruct != other.cbStruct) return false
        if (!this.wszCatalogFile.contentEquals(other.wszCatalogFile)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.wszCatalogFile.contentHashCode()
        return result
    }
}

public data class CRYPTCATATTRIBUTE(
    public var cbStruct: UInt = 0u,
    public var pwszReferenceTag: PWSTR = 0L,
    public var dwAttrTypeAndAction: CRYPTCATATTRIBUTE_FLAGS = 0u,
    public var cbValue: UInt = 0u,
    public var pbValue: Long = 0L,
    public var dwReserved: UInt = 0u,
)

public data class CRYPTCATCDF(
    public var cbStruct: UInt = 0u,
    public var hFile: Foundation.HANDLE = Foundation.HANDLE(),
    public var dwCurFilePos: UInt = 0u,
    public var dwLastMemberOffset: UInt = 0u,
    public var fEOF: BOOL = 0,
    public var pwszResultDir: PWSTR = 0L,
    public var hCATStore: Foundation.HANDLE = Foundation.HANDLE(),
)

public data class CRYPTCATMEMBER(
    public var cbStruct: UInt = 0u,
    public var pwszReferenceTag: PWSTR = 0L,
    public var pwszFileName: PWSTR = 0L,
    public var gSubjectType: GUID = GUID(),
    public var fdwMemberFlags: UInt = 0u,
    public var pIndirectData: Long = 0L,
    public var dwCertVersion: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var hReserved: Foundation.HANDLE = Foundation.HANDLE(),
    public var sEncodedIndirectData: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var sEncodedMemberInfo: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
)

public data class CRYPTCATSTORE(
    public var cbStruct: UInt = 0u,
    public var dwPublicVersion: UInt = 0u,
    public var pwszP7File: PWSTR = 0L,
    public var hProv: ULong = 0uL,
    public var dwEncodingType: UInt = 0u,
    public var fdwStoreFlags: CRYPTCAT_OPEN_FLAGS = 0u,
    public var hReserved: Foundation.HANDLE = Foundation.HANDLE(),
    public var hAttrs: Foundation.HANDLE = Foundation.HANDLE(),
    public var hCryptMsg: Long = 0L,
    public var hSorted: Foundation.HANDLE = Foundation.HANDLE(),
)

public data class MS_ADDINFO_CATALOGMEMBER(
    public var cbStruct: UInt = 0u,
    public var pStore: Long = 0L,
    public var pMember: Long = 0L,
)
