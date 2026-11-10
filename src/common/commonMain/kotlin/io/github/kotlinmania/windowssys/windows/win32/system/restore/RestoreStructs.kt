@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.restore

import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

public data class Restorepointinfoa(
    public var dwEventType: RestorepointinfoEventType = 0u,
    public var dwRestorePtType: RestorepointinfoType = 0u,
    public var llSequenceNumber: Long = 0L,
    public var szDescription: ByteArray = ByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Restorepointinfoa) return false
        if (this.dwEventType != other.dwEventType) return false
        if (this.dwRestorePtType != other.dwRestorePtType) return false
        if (this.llSequenceNumber != other.llSequenceNumber) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwEventType.hashCode()
        result = 31 * result + this.dwRestorePtType.hashCode()
        result = 31 * result + this.llSequenceNumber.hashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        return result
    }
}

public data class Restorepointinfoex(
    public var ftCreation: Filetime = Filetime(),
    public var dwEventType: UInt = 0u,
    public var dwRestorePtType: UInt = 0u,
    public var dwRPNum: UInt = 0u,
    public var szDescription: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Restorepointinfoex) return false
        if (this.ftCreation != other.ftCreation) return false
        if (this.dwEventType != other.dwEventType) return false
        if (this.dwRestorePtType != other.dwRestorePtType) return false
        if (this.dwRPNum != other.dwRPNum) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ftCreation.hashCode()
        result = 31 * result + this.dwEventType.hashCode()
        result = 31 * result + this.dwRestorePtType.hashCode()
        result = 31 * result + this.dwRPNum.hashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        return result
    }
}

public data class Restorepointinfow(
    public var dwEventType: RestorepointinfoEventType = 0u,
    public var dwRestorePtType: RestorepointinfoType = 0u,
    public var llSequenceNumber: Long = 0L,
    public var szDescription: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Restorepointinfow) return false
        if (this.dwEventType != other.dwEventType) return false
        if (this.dwRestorePtType != other.dwRestorePtType) return false
        if (this.llSequenceNumber != other.llSequenceNumber) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwEventType.hashCode()
        result = 31 * result + this.dwRestorePtType.hashCode()
        result = 31 * result + this.llSequenceNumber.hashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        return result
    }
}

public data class Statemgrstatus(
    public var nStatus: Win32Error = 0u,
    public var llSequenceNumber: Long = 0L,
)
