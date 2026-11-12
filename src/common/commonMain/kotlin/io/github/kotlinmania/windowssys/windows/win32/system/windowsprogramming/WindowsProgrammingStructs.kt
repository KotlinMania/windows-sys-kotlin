@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ListEntry

public class ActctxSectionKeyedData2600 internal constructor(
    public var cbSize: UInt,
    public var ulDataFormatVersion: UInt,
    lpDataCtorArg: MutPtr<CVoid>,
    public var ulLength: UInt,
    lpSectionGlobalDataCtorArg: MutPtr<CVoid>,
    public var ulSectionGlobalDataLength: UInt,
    lpSectionBaseCtorArg: MutPtr<CVoid>,
    public var ulSectionTotalLength: UInt,
    hActCtxCtorArg: Handle,
    public var ulAssemblyRosterIndex: UInt,
) {
    public var lpData: MutPtr<CVoid> = lpDataCtorArg
        internal set

    public var lpSectionGlobalData: MutPtr<CVoid> = lpSectionGlobalDataCtorArg
        internal set

    public var lpSectionBase: MutPtr<CVoid> = lpSectionBaseCtorArg
        internal set

    public var hActCtx: Handle = hActCtxCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        ulDataFormatVersion = 0u,
        lpDataCtorArg = MutPtr(0L),
        ulLength = 0u,
        lpSectionGlobalDataCtorArg = MutPtr(0L),
        ulSectionGlobalDataLength = 0u,
        lpSectionBaseCtorArg = MutPtr(0L),
        ulSectionTotalLength = 0u,
        hActCtxCtorArg = MutPtr(0L),
        ulAssemblyRosterIndex = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.ulDataFormatVersion

    public operator fun component3(): MutPtr<CVoid> = this.lpData

    public operator fun component4(): UInt = this.ulLength

    public operator fun component5(): MutPtr<CVoid> = this.lpSectionGlobalData

    public operator fun component6(): UInt = this.ulSectionGlobalDataLength

    public operator fun component7(): MutPtr<CVoid> = this.lpSectionBase

    public operator fun component8(): UInt = this.ulSectionTotalLength

    public operator fun component9(): Handle = this.hActCtx

    public operator fun component10(): UInt = this.ulAssemblyRosterIndex

    public fun copy(cbSize: UInt = this.cbSize, ulDataFormatVersion: UInt = this.ulDataFormatVersion, lpData: MutPtr<CVoid> = this.lpData, ulLength: UInt = this.ulLength, lpSectionGlobalData: MutPtr<CVoid> = this.lpSectionGlobalData, ulSectionGlobalDataLength: UInt = this.ulSectionGlobalDataLength, lpSectionBase: MutPtr<CVoid> = this.lpSectionBase, ulSectionTotalLength: UInt = this.ulSectionTotalLength, hActCtx: Handle = this.hActCtx, ulAssemblyRosterIndex: UInt = this.ulAssemblyRosterIndex): ActctxSectionKeyedData2600 = ActctxSectionKeyedData2600(cbSize = cbSize, ulDataFormatVersion = ulDataFormatVersion, lpDataCtorArg = lpData, ulLength = ulLength, lpSectionGlobalDataCtorArg = lpSectionGlobalData, ulSectionGlobalDataLength = ulSectionGlobalDataLength, lpSectionBaseCtorArg = lpSectionBase, ulSectionTotalLength = ulSectionTotalLength, hActCtxCtorArg = hActCtx, ulAssemblyRosterIndex = ulAssemblyRosterIndex)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ActctxSectionKeyedData2600) return false
        if (this.cbSize != other.cbSize) return false
        if (this.ulDataFormatVersion != other.ulDataFormatVersion) return false
        if (this.lpData != other.lpData) return false
        if (this.ulLength != other.ulLength) return false
        if (this.lpSectionGlobalData != other.lpSectionGlobalData) return false
        if (this.ulSectionGlobalDataLength != other.ulSectionGlobalDataLength) return false
        if (this.lpSectionBase != other.lpSectionBase) return false
        if (this.ulSectionTotalLength != other.ulSectionTotalLength) return false
        if (this.hActCtx != other.hActCtx) return false
        if (this.ulAssemblyRosterIndex != other.ulAssemblyRosterIndex) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.ulDataFormatVersion.hashCode()
        result = 31 * result + this.lpData.hashCode()
        result = 31 * result + this.ulLength.hashCode()
        result = 31 * result + this.lpSectionGlobalData.hashCode()
        result = 31 * result + this.ulSectionGlobalDataLength.hashCode()
        result = 31 * result + this.lpSectionBase.hashCode()
        result = 31 * result + this.ulSectionTotalLength.hashCode()
        result = 31 * result + this.hActCtx.hashCode()
        result = 31 * result + this.ulAssemblyRosterIndex.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            ulDataFormatVersion: UInt = 0u,
            lpData: MutPtr<CVoid> = MutPtr(0L),
            ulLength: UInt = 0u,
            lpSectionGlobalData: MutPtr<CVoid> = MutPtr(0L),
            ulSectionGlobalDataLength: UInt = 0u,
            lpSectionBase: MutPtr<CVoid> = MutPtr(0L),
            ulSectionTotalLength: UInt = 0u,
            hActCtx: Handle = MutPtr(0L),
            ulAssemblyRosterIndex: UInt = 0u,
        ): ActctxSectionKeyedData2600 =
            ActctxSectionKeyedData2600(
                cbSize = cbSize,
                ulDataFormatVersion = ulDataFormatVersion,
                lpDataCtorArg = lpData,
                ulLength = ulLength,
                lpSectionGlobalDataCtorArg = lpSectionGlobalData,
                ulSectionGlobalDataLength = ulSectionGlobalDataLength,
                lpSectionBaseCtorArg = lpSectionBase,
                ulSectionTotalLength = ulSectionTotalLength,
                hActCtxCtorArg = hActCtx,
                ulAssemblyRosterIndex = ulAssemblyRosterIndex,
            )
    }
}

public class ActctxSectionKeyedDataAssemblyMetadata internal constructor(
    lpInformationCtorArg: MutPtr<CVoid>,
    lpSectionBaseCtorArg: MutPtr<CVoid>,
    public var ulSectionLength: UInt,
    lpSectionGlobalDataBaseCtorArg: MutPtr<CVoid>,
    public var ulSectionGlobalDataLength: UInt,
) {
    public var lpInformation: MutPtr<CVoid> = lpInformationCtorArg
        internal set

    public var lpSectionBase: MutPtr<CVoid> = lpSectionBaseCtorArg
        internal set

    public var lpSectionGlobalDataBase: MutPtr<CVoid> = lpSectionGlobalDataBaseCtorArg
        internal set

    public constructor() : this(
        lpInformationCtorArg = MutPtr(0L),
        lpSectionBaseCtorArg = MutPtr(0L),
        ulSectionLength = 0u,
        lpSectionGlobalDataBaseCtorArg = MutPtr(0L),
        ulSectionGlobalDataLength = 0u,
    )

    public operator fun component1(): MutPtr<CVoid> = this.lpInformation

    public operator fun component2(): MutPtr<CVoid> = this.lpSectionBase

    public operator fun component3(): UInt = this.ulSectionLength

    public operator fun component4(): MutPtr<CVoid> = this.lpSectionGlobalDataBase

    public operator fun component5(): UInt = this.ulSectionGlobalDataLength

    public fun copy(lpInformation: MutPtr<CVoid> = this.lpInformation, lpSectionBase: MutPtr<CVoid> = this.lpSectionBase, ulSectionLength: UInt = this.ulSectionLength, lpSectionGlobalDataBase: MutPtr<CVoid> = this.lpSectionGlobalDataBase, ulSectionGlobalDataLength: UInt = this.ulSectionGlobalDataLength): ActctxSectionKeyedDataAssemblyMetadata = ActctxSectionKeyedDataAssemblyMetadata(lpInformationCtorArg = lpInformation, lpSectionBaseCtorArg = lpSectionBase, ulSectionLength = ulSectionLength, lpSectionGlobalDataBaseCtorArg = lpSectionGlobalDataBase, ulSectionGlobalDataLength = ulSectionGlobalDataLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ActctxSectionKeyedDataAssemblyMetadata) return false
        if (this.lpInformation != other.lpInformation) return false
        if (this.lpSectionBase != other.lpSectionBase) return false
        if (this.ulSectionLength != other.ulSectionLength) return false
        if (this.lpSectionGlobalDataBase != other.lpSectionGlobalDataBase) return false
        if (this.ulSectionGlobalDataLength != other.ulSectionGlobalDataLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpInformation.hashCode()
        result = 31 * result + this.lpSectionBase.hashCode()
        result = 31 * result + this.ulSectionLength.hashCode()
        result = 31 * result + this.lpSectionGlobalDataBase.hashCode()
        result = 31 * result + this.ulSectionGlobalDataLength.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ActctxSectionKeyedDataAssemblyMetadata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ActctxSectionKeyedDataAssemblyMetadata> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): ActctxSectionKeyedDataAssemblyMetadata =
                    ActctxSectionKeyedDataAssemblyMetadata(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: ActctxSectionKeyedDataAssemblyMetadata) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.lpInformation)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.lpSectionBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.ulSectionLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.lpSectionGlobalDataBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.ulSectionGlobalDataLength)
                }
            }

        public operator fun invoke(
            lpInformation: MutPtr<CVoid> = MutPtr(0L),
            lpSectionBase: MutPtr<CVoid> = MutPtr(0L),
            ulSectionLength: UInt = 0u,
            lpSectionGlobalDataBase: MutPtr<CVoid> = MutPtr(0L),
            ulSectionGlobalDataLength: UInt = 0u,
        ): ActctxSectionKeyedDataAssemblyMetadata =
            ActctxSectionKeyedDataAssemblyMetadata(
                lpInformationCtorArg = lpInformation,
                lpSectionBaseCtorArg = lpSectionBase,
                ulSectionLength = ulSectionLength,
                lpSectionGlobalDataBaseCtorArg = lpSectionGlobalDataBase,
                ulSectionGlobalDataLength = ulSectionGlobalDataLength,
            )
    }
}

public class ActivationContextBasicInformation internal constructor(
    hActCtxCtorArg: Handle,
    public var dwFlags: UInt,
) {
    public var hActCtx: Handle = hActCtxCtorArg
        internal set

    public constructor() : this(
        hActCtxCtorArg = MutPtr(0L),
        dwFlags = 0u,
    )

    public operator fun component1(): Handle = this.hActCtx

    public operator fun component2(): UInt = this.dwFlags

    public fun copy(hActCtx: Handle = this.hActCtx, dwFlags: UInt = this.dwFlags): ActivationContextBasicInformation = ActivationContextBasicInformation(hActCtxCtorArg = hActCtx, dwFlags = dwFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ActivationContextBasicInformation) return false
        if (this.hActCtx != other.hActCtx) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hActCtx.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hActCtx: Handle = MutPtr(0L),
            dwFlags: UInt = 0u,
        ): ActivationContextBasicInformation =
            ActivationContextBasicInformation(
                hActCtxCtorArg = hActCtx,
                dwFlags = dwFlags,
            )
    }
}

public class Cabinfoa internal constructor(
    pszCabCtorArg: Pstr,
    pszInfCtorArg: Pstr,
    pszSectionCtorArg: Pstr,
    public var szSrcPath: ByteArray,
    public var dwFlags: UInt,
) {
    public var pszCab: Pstr = pszCabCtorArg
        internal set

    public var pszInf: Pstr = pszInfCtorArg
        internal set

    public var pszSection: Pstr = pszSectionCtorArg
        internal set

    public constructor() : this(
        pszCabCtorArg = MutPtr(0L),
        pszInfCtorArg = MutPtr(0L),
        pszSectionCtorArg = MutPtr(0L),
        szSrcPath = ByteArray(260),
        dwFlags = 0u,
    )

    public operator fun component1(): Pstr = this.pszCab

    public operator fun component2(): Pstr = this.pszInf

    public operator fun component3(): Pstr = this.pszSection

    public operator fun component4(): ByteArray = this.szSrcPath

    public operator fun component5(): UInt = this.dwFlags

    public fun copy(pszCab: Pstr = this.pszCab, pszInf: Pstr = this.pszInf, pszSection: Pstr = this.pszSection, szSrcPath: ByteArray = this.szSrcPath, dwFlags: UInt = this.dwFlags): Cabinfoa = Cabinfoa(pszCabCtorArg = pszCab, pszInfCtorArg = pszInf, pszSectionCtorArg = pszSection, szSrcPath = szSrcPath, dwFlags = dwFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cabinfoa) return false
        if (this.pszCab != other.pszCab) return false
        if (this.pszInf != other.pszInf) return false
        if (this.pszSection != other.pszSection) return false
        if (!this.szSrcPath.contentEquals(other.szSrcPath)) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszCab.hashCode()
        result = 31 * result + this.pszInf.hashCode()
        result = 31 * result + this.pszSection.hashCode()
        result = 31 * result + this.szSrcPath.contentHashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszCab: Pstr = MutPtr(0L),
            pszInf: Pstr = MutPtr(0L),
            pszSection: Pstr = MutPtr(0L),
            szSrcPath: ByteArray = ByteArray(260),
            dwFlags: UInt = 0u,
        ): Cabinfoa =
            Cabinfoa(
                pszCabCtorArg = pszCab,
                pszInfCtorArg = pszInf,
                pszSectionCtorArg = pszSection,
                szSrcPath = szSrcPath,
                dwFlags = dwFlags,
            )
    }
}

public class Cabinfow internal constructor(
    pszCabCtorArg: Pwstr,
    pszInfCtorArg: Pwstr,
    pszSectionCtorArg: Pwstr,
    public var szSrcPath: UShortArray,
    public var dwFlags: UInt,
) {
    public var pszCab: Pwstr = pszCabCtorArg
        internal set

    public var pszInf: Pwstr = pszInfCtorArg
        internal set

    public var pszSection: Pwstr = pszSectionCtorArg
        internal set

    public constructor() : this(
        pszCabCtorArg = MutPtr(0L),
        pszInfCtorArg = MutPtr(0L),
        pszSectionCtorArg = MutPtr(0L),
        szSrcPath = UShortArray(260),
        dwFlags = 0u,
    )

    public operator fun component1(): Pwstr = this.pszCab

    public operator fun component2(): Pwstr = this.pszInf

    public operator fun component3(): Pwstr = this.pszSection

    public operator fun component4(): UShortArray = this.szSrcPath

    public operator fun component5(): UInt = this.dwFlags

    public fun copy(pszCab: Pwstr = this.pszCab, pszInf: Pwstr = this.pszInf, pszSection: Pwstr = this.pszSection, szSrcPath: UShortArray = this.szSrcPath, dwFlags: UInt = this.dwFlags): Cabinfow = Cabinfow(pszCabCtorArg = pszCab, pszInfCtorArg = pszInf, pszSectionCtorArg = pszSection, szSrcPath = szSrcPath, dwFlags = dwFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cabinfow) return false
        if (this.pszCab != other.pszCab) return false
        if (this.pszInf != other.pszInf) return false
        if (this.pszSection != other.pszSection) return false
        if (!this.szSrcPath.contentEquals(other.szSrcPath)) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszCab.hashCode()
        result = 31 * result + this.pszInf.hashCode()
        result = 31 * result + this.pszSection.hashCode()
        result = 31 * result + this.szSrcPath.contentHashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszCab: Pwstr = MutPtr(0L),
            pszInf: Pwstr = MutPtr(0L),
            pszSection: Pwstr = MutPtr(0L),
            szSrcPath: UShortArray = UShortArray(260),
            dwFlags: UInt = 0u,
        ): Cabinfow =
            Cabinfow(
                pszCabCtorArg = pszCab,
                pszInfCtorArg = pszInf,
                pszSectionCtorArg = pszSection,
                szSrcPath = szSrcPath,
                dwFlags = dwFlags,
            )
    }
}

public class ClientId internal constructor(
    uniqueProcessCtorArg: Handle,
    uniqueThreadCtorArg: Handle,
) {
    public var uniqueProcess: Handle = uniqueProcessCtorArg
        internal set

    public var uniqueThread: Handle = uniqueThreadCtorArg
        internal set

    public constructor() : this(
        uniqueProcessCtorArg = MutPtr(0L),
        uniqueThreadCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Handle = this.uniqueProcess

    public operator fun component2(): Handle = this.uniqueThread

    public fun copy(uniqueProcess: Handle = this.uniqueProcess, uniqueThread: Handle = this.uniqueThread): ClientId = ClientId(uniqueProcessCtorArg = uniqueProcess, uniqueThreadCtorArg = uniqueThread)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClientId) return false
        if (this.uniqueProcess != other.uniqueProcess) return false
        if (this.uniqueThread != other.uniqueThread) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uniqueProcess.hashCode()
        result = 31 * result + this.uniqueThread.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            uniqueProcess: Handle = MutPtr(0L),
            uniqueThread: Handle = MutPtr(0L),
        ): ClientId =
            ClientId(
                uniqueProcessCtorArg = uniqueProcess,
                uniqueThreadCtorArg = uniqueThread,
            )
    }
}

public class CustomSystemEventTriggerConfig internal constructor(
    public var size: UInt,
    triggerIdCtorArg: Pcwstr,
) {
    public var triggerId: Pcwstr = triggerIdCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        triggerIdCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.size

    public operator fun component2(): Pcwstr = this.triggerId

    public fun copy(size: UInt = this.size, triggerId: Pcwstr = this.triggerId): CustomSystemEventTriggerConfig = CustomSystemEventTriggerConfig(size = size, triggerIdCtorArg = triggerId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CustomSystemEventTriggerConfig) return false
        if (this.size != other.size) return false
        if (this.triggerId != other.triggerId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.triggerId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UInt = 0u,
            triggerId: Pcwstr = ConstPtr(0L),
        ): CustomSystemEventTriggerConfig =
            CustomSystemEventTriggerConfig(
                size = size,
                triggerIdCtorArg = triggerId,
            )
    }
}

public data class CameraUIControlCaptureMode(
    public var value: Int = 0,
) {
    public var field0: Int
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CameraUIControlCaptureMode> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CameraUIControlCaptureMode> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): CameraUIControlCaptureMode =
                    CameraUIControlCaptureMode(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: CameraUIControlCaptureMode) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.value)
                }
            }

        public val PHOTO_OR_VIDEO: CameraUIControlCaptureMode = CameraUIControlCaptureMode(0)

        public val PHOTO: CameraUIControlCaptureMode = CameraUIControlCaptureMode(1)

        public val VIDEO: CameraUIControlCaptureMode = CameraUIControlCaptureMode(2)
    }
}

public data class CameraUIControlLinearSelectionMode(
    public var value: Int = 0,
) {
    public var field0: Int
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CameraUIControlLinearSelectionMode> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CameraUIControlLinearSelectionMode> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): CameraUIControlLinearSelectionMode =
                    CameraUIControlLinearSelectionMode(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: CameraUIControlLinearSelectionMode) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.value)
                }
            }

        public val SINGLE: CameraUIControlLinearSelectionMode = CameraUIControlLinearSelectionMode(0)

        public val MULTIPLE: CameraUIControlLinearSelectionMode = CameraUIControlLinearSelectionMode(1)
    }
}

public data class CameraUIControlMode(
    public var value: Int = 0,
) {
    public var field0: Int
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CameraUIControlMode> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CameraUIControlMode> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): CameraUIControlMode =
                    CameraUIControlMode(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: CameraUIControlMode) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.value)
                }
            }

        public val BROWSE: CameraUIControlMode = CameraUIControlMode(0)

        public val LINEAR: CameraUIControlMode = CameraUIControlMode(1)
    }
}

public data class CameraUIControlPhotoFormat(
    public var value: Int = 0,
) {
    public var field0: Int
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CameraUIControlPhotoFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CameraUIControlPhotoFormat> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): CameraUIControlPhotoFormat =
                    CameraUIControlPhotoFormat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: CameraUIControlPhotoFormat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.value)
                }
            }

        public val JPEG: CameraUIControlPhotoFormat = CameraUIControlPhotoFormat(0)

        public val PNG: CameraUIControlPhotoFormat = CameraUIControlPhotoFormat(1)

        public val JPEG_XR: CameraUIControlPhotoFormat = CameraUIControlPhotoFormat(2)
    }
}

public data class CameraUIControlVideoFormat(
    public var value: Int = 0,
) {
    public var field0: Int
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CameraUIControlVideoFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CameraUIControlVideoFormat> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): CameraUIControlVideoFormat =
                    CameraUIControlVideoFormat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: CameraUIControlVideoFormat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.value)
                }
            }

        public val MP4: CameraUIControlVideoFormat = CameraUIControlVideoFormat(0)

        public val WMV: CameraUIControlVideoFormat = CameraUIControlVideoFormat(1)
    }
}

public data class CameraUIControlViewType(
    public var value: Int = 0,
) {
    public var field0: Int
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CameraUIControlViewType> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CameraUIControlViewType> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): CameraUIControlViewType =
                    CameraUIControlViewType(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: CameraUIControlViewType) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.value)
                }
            }

        public val SINGLE_ITEM: CameraUIControlViewType = CameraUIControlViewType(0)

        public val ITEM_LIST: CameraUIControlViewType = CameraUIControlViewType(1)
    }
}

public data class Datetime(
    public var year: UShort = 0u,
    public var month: UShort = 0u,
    public var day: UShort = 0u,
    public var hour: UShort = 0u,
    public var min: UShort = 0u,
    public var sec: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Datetime> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Datetime> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Datetime =
                    Datetime(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: Datetime) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.year)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.month)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.day)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.hour)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.min)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.sec)
                }
            }
    }
}

public data class Dcicmd(
    public var dwCommand: UInt = 0u,
    public var dwParam1: UInt = 0u,
    public var dwParam2: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var dwReserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dcicmd> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dcicmd> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): Dcicmd =
                    Dcicmd(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Dcicmd) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwCommand)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwParam1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwParam2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwReserved)
                }
            }
    }
}

public class Dcicreateinput internal constructor(
    public var cmd: Dcicmd,
    public var dwCompression: UInt,
    public var dwMask: UIntArray,
    public var dwWidth: UInt,
    public var dwHeight: UInt,
    public var dwDCICaps: UInt,
    public var dwBitCount: UInt,
    lpSurfaceCtorArg: MutPtr<CVoid>,
) {
    public var lpSurface: MutPtr<CVoid> = lpSurfaceCtorArg
        internal set

    public constructor() : this(
        cmd = Dcicmd(),
        dwCompression = 0u,
        dwMask = UIntArray(3),
        dwWidth = 0u,
        dwHeight = 0u,
        dwDCICaps = 0u,
        dwBitCount = 0u,
        lpSurfaceCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Dcicmd = this.cmd

    public operator fun component2(): UInt = this.dwCompression

    public operator fun component3(): UIntArray = this.dwMask

    public operator fun component4(): UInt = this.dwWidth

    public operator fun component5(): UInt = this.dwHeight

    public operator fun component6(): UInt = this.dwDCICaps

    public operator fun component7(): UInt = this.dwBitCount

    public operator fun component8(): MutPtr<CVoid> = this.lpSurface

    public fun copy(cmd: Dcicmd = this.cmd, dwCompression: UInt = this.dwCompression, dwMask: UIntArray = this.dwMask, dwWidth: UInt = this.dwWidth, dwHeight: UInt = this.dwHeight, dwDCICaps: UInt = this.dwDCICaps, dwBitCount: UInt = this.dwBitCount, lpSurface: MutPtr<CVoid> = this.lpSurface): Dcicreateinput = Dcicreateinput(cmd = cmd, dwCompression = dwCompression, dwMask = dwMask, dwWidth = dwWidth, dwHeight = dwHeight, dwDCICaps = dwDCICaps, dwBitCount = dwBitCount, lpSurfaceCtorArg = lpSurface)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dcicreateinput) return false
        if (this.cmd != other.cmd) return false
        if (this.dwCompression != other.dwCompression) return false
        if (!this.dwMask.contentEquals(other.dwMask)) return false
        if (this.dwWidth != other.dwWidth) return false
        if (this.dwHeight != other.dwHeight) return false
        if (this.dwDCICaps != other.dwDCICaps) return false
        if (this.dwBitCount != other.dwBitCount) return false
        if (this.lpSurface != other.lpSurface) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cmd.hashCode()
        result = 31 * result + this.dwCompression.hashCode()
        result = 31 * result + this.dwMask.contentHashCode()
        result = 31 * result + this.dwWidth.hashCode()
        result = 31 * result + this.dwHeight.hashCode()
        result = 31 * result + this.dwDCICaps.hashCode()
        result = 31 * result + this.dwBitCount.hashCode()
        result = 31 * result + this.lpSurface.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dcicreateinput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dcicreateinput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): Dcicreateinput =
                    Dcicreateinput(
                        (Dcicmd.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                        ).readNative(addr + 24L).toUIntArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: Dcicreateinput) {
                    (Dcicmd.typeLayout()).writeNative(addr, value.cmd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwCompression)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                    ).writeNative(addr + 24L, value.dwMask.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.dwDCICaps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.dwBitCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 56L, value.lpSurface)
                }
            }

        public operator fun invoke(
            cmd: Dcicmd = Dcicmd(),
            dwCompression: UInt = 0u,
            dwMask: UIntArray = UIntArray(3),
            dwWidth: UInt = 0u,
            dwHeight: UInt = 0u,
            dwDCICaps: UInt = 0u,
            dwBitCount: UInt = 0u,
            lpSurface: MutPtr<CVoid> = MutPtr(0L),
        ): Dcicreateinput =
            Dcicreateinput(
                cmd = cmd,
                dwCompression = dwCompression,
                dwMask = dwMask,
                dwWidth = dwWidth,
                dwHeight = dwHeight,
                dwDCICaps = dwDCICaps,
                dwBitCount = dwBitCount,
                lpSurfaceCtorArg = lpSurface,
            )
    }
}

public class Dcienuminput internal constructor(
    public var cmd: Dcicmd,
    public var rSrc: Rect,
    public var rDst: Rect,
    public var enumCallback: Int,
    lpContextCtorArg: MutPtr<CVoid>,
) {
    public var lpContext: MutPtr<CVoid> = lpContextCtorArg
        internal set

    public constructor() : this(
        cmd = Dcicmd(),
        rSrc = Rect(),
        rDst = Rect(),
        enumCallback = 0,
        lpContextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Dcicmd = this.cmd

    public operator fun component2(): Rect = this.rSrc

    public operator fun component3(): Rect = this.rDst

    public operator fun component4(): Int = this.enumCallback

    public operator fun component5(): MutPtr<CVoid> = this.lpContext

    public fun copy(cmd: Dcicmd = this.cmd, rSrc: Rect = this.rSrc, rDst: Rect = this.rDst, enumCallback: Int = this.enumCallback, lpContext: MutPtr<CVoid> = this.lpContext): Dcienuminput = Dcienuminput(cmd = cmd, rSrc = rSrc, rDst = rDst, enumCallback = enumCallback, lpContextCtorArg = lpContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dcienuminput) return false
        if (this.cmd != other.cmd) return false
        if (this.rSrc != other.rSrc) return false
        if (this.rDst != other.rDst) return false
        if (this.enumCallback != other.enumCallback) return false
        if (this.lpContext != other.lpContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cmd.hashCode()
        result = 31 * result + this.rSrc.hashCode()
        result = 31 * result + this.rDst.hashCode()
        result = 31 * result + this.enumCallback.hashCode()
        result = 31 * result + this.lpContext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cmd: Dcicmd = Dcicmd(),
            rSrc: Rect = Rect(),
            rDst: Rect = Rect(),
            enumCallback: Int = 0,
            lpContext: MutPtr<CVoid> = MutPtr(0L),
        ): Dcienuminput =
            Dcienuminput(
                cmd = cmd,
                rSrc = rSrc,
                rDst = rDst,
                enumCallback = enumCallback,
                lpContextCtorArg = lpContext,
            )
    }
}

public data class Dcioffscreen(
    public var dciInfo: Dcisurfaceinfo = Dcisurfaceinfo(),
    public var draw: Int = 0,
    public var setClipList: Int = 0,
    public var setDestination: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dcioffscreen> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dcioffscreen> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 112L
                override fun readNative(addr: Long): Dcioffscreen =
                    Dcioffscreen(
                        (Dcisurfaceinfo.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 104L),
                    )
                override fun writeNative(addr: Long, value: Dcioffscreen) {
                    (Dcisurfaceinfo.typeLayout()).writeNative(addr, value.dciInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 88L, value.draw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 96L, value.setClipList)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 104L, value.setDestination)
                }
            }
    }
}

public data class Dcioverlay(
    public var dciInfo: Dcisurfaceinfo = Dcisurfaceinfo(),
    public var dwChromakeyValue: UInt = 0u,
    public var dwChromakeyMask: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dcioverlay> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dcioverlay> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 96L
                override fun readNative(addr: Long): Dcioverlay =
                    Dcioverlay(
                        (Dcisurfaceinfo.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 92L),
                    )
                override fun writeNative(addr: Long, value: Dcioverlay) {
                    (Dcisurfaceinfo.typeLayout()).writeNative(addr, value.dciInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.dwChromakeyValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.dwChromakeyMask)
                }
            }
    }
}

public class Dcisurfaceinfo(
    public var dwSize: UInt = 0u,
    public var dwDCICaps: UInt = 0u,
    public var dwCompression: UInt = 0u,
    public var dwMask: UIntArray = UIntArray(3),
    public var dwWidth: UInt = 0u,
    public var dwHeight: UInt = 0u,
    public var lStride: Int = 0,
    public var dwBitCount: UInt = 0u,
    public var dwOffSurface: Int = 0,
    public var wSelSurface: UShort = 0u,
    public var wReserved: UShort = 0u,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
    public var dwReserved3: UInt = 0u,
    public var beginAccess: Int = 0,
    public var endAccess: Int = 0,
    public var destroySurface: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dcisurfaceinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dcisurfaceinfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 88L
                override fun readNative(addr: Long): Dcisurfaceinfo =
                    Dcisurfaceinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                        ).readNative(addr + 12L).toUIntArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 50L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 80L),
                    )
                override fun writeNative(addr: Long, value: Dcisurfaceinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwDCICaps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwCompression)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                    ).writeNative(addr + 12L, value.dwMask.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.lStride)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwBitCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 40L, value.dwOffSurface)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 48L, value.wSelSurface)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 50L, value.wReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.dwReserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.dwReserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.dwReserved3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 64L, value.beginAccess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 72L, value.endAccess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 80L, value.destroySurface)
                }
            }
    }
}

public class DelayloadInfo internal constructor(
    public var size: UInt,
    delayloadDescriptorCtorArg: MutPtr<ImageDelayloadDescriptor>,
    thunkAddressCtorArg: MutPtr<ImageThunkData64>,
    targetDllNameCtorArg: Pcstr,
    public var targetApiDescriptor: DelayloadProcDescriptor,
    targetModuleBaseCtorArg: MutPtr<CVoid>,
    unusedCtorArg: MutPtr<CVoid>,
    public var lastError: UInt,
) {
    public var delayloadDescriptor: MutPtr<ImageDelayloadDescriptor> = delayloadDescriptorCtorArg
        internal set

    public var thunkAddress: MutPtr<ImageThunkData64> = thunkAddressCtorArg
        internal set

    public var targetDllName: Pcstr = targetDllNameCtorArg
        internal set

    public var targetModuleBase: MutPtr<CVoid> = targetModuleBaseCtorArg
        internal set

    public var unused: MutPtr<CVoid> = unusedCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        delayloadDescriptorCtorArg = MutPtr(0L),
        thunkAddressCtorArg = MutPtr(0L),
        targetDllNameCtorArg = ConstPtr(0L),
        targetApiDescriptor = DelayloadProcDescriptor(),
        targetModuleBaseCtorArg = MutPtr(0L),
        unusedCtorArg = MutPtr(0L),
        lastError = 0u,
    )

    public operator fun component1(): UInt = this.size

    public operator fun component2(): MutPtr<ImageDelayloadDescriptor> = this.delayloadDescriptor

    public operator fun component3(): MutPtr<ImageThunkData64> = this.thunkAddress

    public operator fun component4(): Pcstr = this.targetDllName

    public operator fun component5(): DelayloadProcDescriptor = this.targetApiDescriptor

    public operator fun component6(): MutPtr<CVoid> = this.targetModuleBase

    public operator fun component7(): MutPtr<CVoid> = this.unused

    public operator fun component8(): UInt = this.lastError

    public fun copy(size: UInt = this.size, delayloadDescriptor: MutPtr<ImageDelayloadDescriptor> = this.delayloadDescriptor, thunkAddress: MutPtr<ImageThunkData64> = this.thunkAddress, targetDllName: Pcstr = this.targetDllName, targetApiDescriptor: DelayloadProcDescriptor = this.targetApiDescriptor, targetModuleBase: MutPtr<CVoid> = this.targetModuleBase, unused: MutPtr<CVoid> = this.unused, lastError: UInt = this.lastError): DelayloadInfo = DelayloadInfo(size = size, delayloadDescriptorCtorArg = delayloadDescriptor, thunkAddressCtorArg = thunkAddress, targetDllNameCtorArg = targetDllName, targetApiDescriptor = targetApiDescriptor, targetModuleBaseCtorArg = targetModuleBase, unusedCtorArg = unused, lastError = lastError)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DelayloadInfo) return false
        if (this.size != other.size) return false
        if (this.delayloadDescriptor != other.delayloadDescriptor) return false
        if (this.thunkAddress != other.thunkAddress) return false
        if (this.targetDllName != other.targetDllName) return false
        if (this.targetApiDescriptor != other.targetApiDescriptor) return false
        if (this.targetModuleBase != other.targetModuleBase) return false
        if (this.unused != other.unused) return false
        if (this.lastError != other.lastError) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.delayloadDescriptor.hashCode()
        result = 31 * result + this.thunkAddress.hashCode()
        result = 31 * result + this.targetDllName.hashCode()
        result = 31 * result + this.targetApiDescriptor.hashCode()
        result = 31 * result + this.targetModuleBase.hashCode()
        result = 31 * result + this.unused.hashCode()
        result = 31 * result + this.lastError.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UInt = 0u,
            delayloadDescriptor: MutPtr<ImageDelayloadDescriptor> = MutPtr(0L),
            thunkAddress: MutPtr<ImageThunkData64> = MutPtr(0L),
            targetDllName: Pcstr = ConstPtr(0L),
            targetApiDescriptor: DelayloadProcDescriptor = DelayloadProcDescriptor(),
            targetModuleBase: MutPtr<CVoid> = MutPtr(0L),
            unused: MutPtr<CVoid> = MutPtr(0L),
            lastError: UInt = 0u,
        ): DelayloadInfo =
            DelayloadInfo(
                size = size,
                delayloadDescriptorCtorArg = delayloadDescriptor,
                thunkAddressCtorArg = thunkAddress,
                targetDllNameCtorArg = targetDllName,
                targetApiDescriptor = targetApiDescriptor,
                targetModuleBaseCtorArg = targetModuleBase,
                unusedCtorArg = unused,
                lastError = lastError,
            )
    }
}

public data class DelayloadProcDescriptor(
    public var importDescribedByName: UInt = 0u,
    public var description: DelayloadProcDescriptor0 = DelayloadProcDescriptor0(),
)

public class DelayloadProcDescriptor0 internal constructor(
    nameCtorArg: Pcstr,
    public var ordinal: UInt,
) {
    public var name: Pcstr = nameCtorArg
        internal set

    public constructor() : this(
        nameCtorArg = ConstPtr(0L),
        ordinal = 0u,
    )

    public operator fun component1(): Pcstr = this.name

    public operator fun component2(): UInt = this.ordinal

    public fun copy(name: Pcstr = this.name, ordinal: UInt = this.ordinal): DelayloadProcDescriptor0 = DelayloadProcDescriptor0(nameCtorArg = name, ordinal = ordinal)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DelayloadProcDescriptor0) return false
        if (this.name != other.name) return false
        if (this.ordinal != other.ordinal) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.hashCode()
        result = 31 * result + this.ordinal.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            name: Pcstr = ConstPtr(0L),
            ordinal: UInt = 0u,
        ): DelayloadProcDescriptor0 =
            DelayloadProcDescriptor0(
                nameCtorArg = name,
                ordinal = ordinal,
            )
    }
}

public class FeatureError internal constructor(
    public var hr: Hresult,
    public var lineNumber: UShort,
    fileCtorArg: Pcstr,
    processCtorArg: Pcstr,
    moduleCtorArg: Pcstr,
    public var callerReturnAddressOffset: UInt,
    callerModuleCtorArg: Pcstr,
    messageCtorArg: Pcstr,
    public var originLineNumber: UShort,
    originFileCtorArg: Pcstr,
    originModuleCtorArg: Pcstr,
    public var originCallerReturnAddressOffset: UInt,
    originCallerModuleCtorArg: Pcstr,
    originNameCtorArg: Pcstr,
) {
    public var file: Pcstr = fileCtorArg
        internal set

    public var process: Pcstr = processCtorArg
        internal set

    public var module: Pcstr = moduleCtorArg
        internal set

    public var callerModule: Pcstr = callerModuleCtorArg
        internal set

    public var message: Pcstr = messageCtorArg
        internal set

    public var originFile: Pcstr = originFileCtorArg
        internal set

    public var originModule: Pcstr = originModuleCtorArg
        internal set

    public var originCallerModule: Pcstr = originCallerModuleCtorArg
        internal set

    public var originName: Pcstr = originNameCtorArg
        internal set

    public constructor() : this(
        hr = 0,
        lineNumber = 0u,
        fileCtorArg = ConstPtr(0L),
        processCtorArg = ConstPtr(0L),
        moduleCtorArg = ConstPtr(0L),
        callerReturnAddressOffset = 0u,
        callerModuleCtorArg = ConstPtr(0L),
        messageCtorArg = ConstPtr(0L),
        originLineNumber = 0u,
        originFileCtorArg = ConstPtr(0L),
        originModuleCtorArg = ConstPtr(0L),
        originCallerReturnAddressOffset = 0u,
        originCallerModuleCtorArg = ConstPtr(0L),
        originNameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Hresult = this.hr

    public operator fun component2(): UShort = this.lineNumber

    public operator fun component3(): Pcstr = this.file

    public operator fun component4(): Pcstr = this.process

    public operator fun component5(): Pcstr = this.module

    public operator fun component6(): UInt = this.callerReturnAddressOffset

    public operator fun component7(): Pcstr = this.callerModule

    public operator fun component8(): Pcstr = this.message

    public operator fun component9(): UShort = this.originLineNumber

    public operator fun component10(): Pcstr = this.originFile

    public operator fun component11(): Pcstr = this.originModule

    public operator fun component12(): UInt = this.originCallerReturnAddressOffset

    public operator fun component13(): Pcstr = this.originCallerModule

    public operator fun component14(): Pcstr = this.originName

    public fun copy(hr: Hresult = this.hr, lineNumber: UShort = this.lineNumber, file: Pcstr = this.file, process: Pcstr = this.process, module: Pcstr = this.module, callerReturnAddressOffset: UInt = this.callerReturnAddressOffset, callerModule: Pcstr = this.callerModule, message: Pcstr = this.message, originLineNumber: UShort = this.originLineNumber, originFile: Pcstr = this.originFile, originModule: Pcstr = this.originModule, originCallerReturnAddressOffset: UInt = this.originCallerReturnAddressOffset, originCallerModule: Pcstr = this.originCallerModule, originName: Pcstr = this.originName): FeatureError = FeatureError(hr = hr, lineNumber = lineNumber, fileCtorArg = file, processCtorArg = process, moduleCtorArg = module, callerReturnAddressOffset = callerReturnAddressOffset, callerModuleCtorArg = callerModule, messageCtorArg = message, originLineNumber = originLineNumber, originFileCtorArg = originFile, originModuleCtorArg = originModule, originCallerReturnAddressOffset = originCallerReturnAddressOffset, originCallerModuleCtorArg = originCallerModule, originNameCtorArg = originName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FeatureError) return false
        if (this.hr != other.hr) return false
        if (this.lineNumber != other.lineNumber) return false
        if (this.file != other.file) return false
        if (this.process != other.process) return false
        if (this.module != other.module) return false
        if (this.callerReturnAddressOffset != other.callerReturnAddressOffset) return false
        if (this.callerModule != other.callerModule) return false
        if (this.message != other.message) return false
        if (this.originLineNumber != other.originLineNumber) return false
        if (this.originFile != other.originFile) return false
        if (this.originModule != other.originModule) return false
        if (this.originCallerReturnAddressOffset != other.originCallerReturnAddressOffset) return false
        if (this.originCallerModule != other.originCallerModule) return false
        if (this.originName != other.originName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hr.hashCode()
        result = 31 * result + this.lineNumber.hashCode()
        result = 31 * result + this.file.hashCode()
        result = 31 * result + this.process.hashCode()
        result = 31 * result + this.module.hashCode()
        result = 31 * result + this.callerReturnAddressOffset.hashCode()
        result = 31 * result + this.callerModule.hashCode()
        result = 31 * result + this.message.hashCode()
        result = 31 * result + this.originLineNumber.hashCode()
        result = 31 * result + this.originFile.hashCode()
        result = 31 * result + this.originModule.hashCode()
        result = 31 * result + this.originCallerReturnAddressOffset.hashCode()
        result = 31 * result + this.originCallerModule.hashCode()
        result = 31 * result + this.originName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hr: Hresult = 0,
            lineNumber: UShort = 0u,
            file: Pcstr = ConstPtr(0L),
            process: Pcstr = ConstPtr(0L),
            module: Pcstr = ConstPtr(0L),
            callerReturnAddressOffset: UInt = 0u,
            callerModule: Pcstr = ConstPtr(0L),
            message: Pcstr = ConstPtr(0L),
            originLineNumber: UShort = 0u,
            originFile: Pcstr = ConstPtr(0L),
            originModule: Pcstr = ConstPtr(0L),
            originCallerReturnAddressOffset: UInt = 0u,
            originCallerModule: Pcstr = ConstPtr(0L),
            originName: Pcstr = ConstPtr(0L),
        ): FeatureError =
            FeatureError(
                hr = hr,
                lineNumber = lineNumber,
                fileCtorArg = file,
                processCtorArg = process,
                moduleCtorArg = module,
                callerReturnAddressOffset = callerReturnAddressOffset,
                callerModuleCtorArg = callerModule,
                messageCtorArg = message,
                originLineNumber = originLineNumber,
                originFileCtorArg = originFile,
                originModuleCtorArg = originModule,
                originCallerReturnAddressOffset = originCallerReturnAddressOffset,
                originCallerModuleCtorArg = originCallerModule,
                originNameCtorArg = originName,
            )
    }
}

public data class HwProfileInfoa(
    public var dwDockInfo: UInt = 0u,
    public var szHwProfileGuid: ByteArray = ByteArray(39),
    public var szHwProfileName: ByteArray = ByteArray(80),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HwProfileInfoa) return false
        if (this.dwDockInfo != other.dwDockInfo) return false
        if (!this.szHwProfileGuid.contentEquals(other.szHwProfileGuid)) return false
        if (!this.szHwProfileName.contentEquals(other.szHwProfileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwDockInfo.hashCode()
        result = 31 * result + this.szHwProfileGuid.contentHashCode()
        result = 31 * result + this.szHwProfileName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HwProfileInfoa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HwProfileInfoa> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 124L
                override fun readNative(addr: Long): HwProfileInfoa =
                    HwProfileInfoa(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (39).toInt())
                        ).readNative(addr + 4L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (80).toInt())
                        ).readNative(addr + 43L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: HwProfileInfoa) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwDockInfo)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (39).toInt())
                    ).writeNative(addr + 4L, value.szHwProfileGuid.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (80).toInt())
                    ).writeNative(addr + 43L, value.szHwProfileName.toList())
                }
            }
    }
}

public data class HwProfileInfow(
    public var dwDockInfo: UInt = 0u,
    public var szHwProfileGuid: UShortArray = UShortArray(39),
    public var szHwProfileName: UShortArray = UShortArray(80),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HwProfileInfow) return false
        if (this.dwDockInfo != other.dwDockInfo) return false
        if (!this.szHwProfileGuid.contentEquals(other.szHwProfileGuid)) return false
        if (!this.szHwProfileName.contentEquals(other.szHwProfileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwDockInfo.hashCode()
        result = 31 * result + this.szHwProfileGuid.contentHashCode()
        result = 31 * result + this.szHwProfileName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HwProfileInfow> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HwProfileInfow> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 244L
                override fun readNative(addr: Long): HwProfileInfow =
                    HwProfileInfow(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (39).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (80).toInt())
                        ).readNative(addr + 82L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: HwProfileInfow) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwDockInfo)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (39).toInt())
                    ).writeNative(addr + 4L, value.szHwProfileGuid.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (80).toInt())
                    ).writeNative(addr + 82L, value.szHwProfileName.toList())
                }
            }
    }
}

public data class ImageDelayloadDescriptor(
    public var attributes: ImageDelayloadDescriptor0 = ImageDelayloadDescriptor0(),
    public var dllNameRVA: UInt = 0u,
    public var moduleHandleRVA: UInt = 0u,
    public var importAddressTableRVA: UInt = 0u,
    public var importNameTableRVA: UInt = 0u,
    public var boundImportAddressTableRVA: UInt = 0u,
    public var unloadInformationTableRVA: UInt = 0u,
    public var timeDateStamp: UInt = 0u,
)

public data class ImageDelayloadDescriptor0(
    public var allAttributes: UInt = 0u,
    public var anonymous: ImageDelayloadDescriptor00 = ImageDelayloadDescriptor00(),
)

public data class ImageDelayloadDescriptor00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageDelayloadDescriptor00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageDelayloadDescriptor00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ImageDelayloadDescriptor00 =
                    ImageDelayloadDescriptor00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ImageDelayloadDescriptor00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ImageThunkData32(
    public var u1: ImageThunkData320 = ImageThunkData320(),
)

public data class ImageThunkData320(
    public var forwarderString: UInt = 0u,
    public var function: UInt = 0u,
    public var ordinal: UInt = 0u,
    public var addressOfData: UInt = 0u,
)

public data class ImageThunkData64(
    public var u1: ImageThunkData640 = ImageThunkData640(),
)

public data class ImageThunkData640(
    public var forwarderString: ULong = 0uL,
    public var function: ULong = 0uL,
    public var ordinal: ULong = 0uL,
    public var addressOfData: ULong = 0uL,
)

public class Imeproa internal constructor(
    hWndCtorArg: Hwnd,
    public var instDate: Datetime,
    public var wVersion: UInt,
    public var szDescription: UByteArray,
    public var szName: UByteArray,
    public var szOptions: UByteArray,
) {
    public var hWnd: Hwnd = hWndCtorArg
        internal set

    public constructor() : this(
        hWndCtorArg = MutPtr(0L),
        instDate = Datetime(),
        wVersion = 0u,
        szDescription = UByteArray(50),
        szName = UByteArray(80),
        szOptions = UByteArray(30),
    )

    public operator fun component1(): Hwnd = this.hWnd

    public operator fun component2(): Datetime = this.instDate

    public operator fun component3(): UInt = this.wVersion

    public operator fun component4(): UByteArray = this.szDescription

    public operator fun component5(): UByteArray = this.szName

    public operator fun component6(): UByteArray = this.szOptions

    public fun copy(hWnd: Hwnd = this.hWnd, instDate: Datetime = this.instDate, wVersion: UInt = this.wVersion, szDescription: UByteArray = this.szDescription, szName: UByteArray = this.szName, szOptions: UByteArray = this.szOptions): Imeproa = Imeproa(hWndCtorArg = hWnd, instDate = instDate, wVersion = wVersion, szDescription = szDescription, szName = szName, szOptions = szOptions)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Imeproa) return false
        if (this.hWnd != other.hWnd) return false
        if (this.instDate != other.instDate) return false
        if (this.wVersion != other.wVersion) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        if (!this.szName.contentEquals(other.szName)) return false
        if (!this.szOptions.contentEquals(other.szOptions)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hWnd.hashCode()
        result = 31 * result + this.instDate.hashCode()
        result = 31 * result + this.wVersion.hashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        result = 31 * result + this.szName.contentHashCode()
        result = 31 * result + this.szOptions.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hWnd: Hwnd = MutPtr(0L),
            instDate: Datetime = Datetime(),
            wVersion: UInt = 0u,
            szDescription: UByteArray = UByteArray(50),
            szName: UByteArray = UByteArray(80),
            szOptions: UByteArray = UByteArray(30),
        ): Imeproa =
            Imeproa(
                hWndCtorArg = hWnd,
                instDate = instDate,
                wVersion = wVersion,
                szDescription = szDescription,
                szName = szName,
                szOptions = szOptions,
            )
    }
}

public class Imeprow internal constructor(
    hWndCtorArg: Hwnd,
    public var instDate: Datetime,
    public var wVersion: UInt,
    public var szDescription: UShortArray,
    public var szName: UShortArray,
    public var szOptions: UShortArray,
) {
    public var hWnd: Hwnd = hWndCtorArg
        internal set

    public constructor() : this(
        hWndCtorArg = MutPtr(0L),
        instDate = Datetime(),
        wVersion = 0u,
        szDescription = UShortArray(50),
        szName = UShortArray(80),
        szOptions = UShortArray(30),
    )

    public operator fun component1(): Hwnd = this.hWnd

    public operator fun component2(): Datetime = this.instDate

    public operator fun component3(): UInt = this.wVersion

    public operator fun component4(): UShortArray = this.szDescription

    public operator fun component5(): UShortArray = this.szName

    public operator fun component6(): UShortArray = this.szOptions

    public fun copy(hWnd: Hwnd = this.hWnd, instDate: Datetime = this.instDate, wVersion: UInt = this.wVersion, szDescription: UShortArray = this.szDescription, szName: UShortArray = this.szName, szOptions: UShortArray = this.szOptions): Imeprow = Imeprow(hWndCtorArg = hWnd, instDate = instDate, wVersion = wVersion, szDescription = szDescription, szName = szName, szOptions = szOptions)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Imeprow) return false
        if (this.hWnd != other.hWnd) return false
        if (this.instDate != other.instDate) return false
        if (this.wVersion != other.wVersion) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        if (!this.szName.contentEquals(other.szName)) return false
        if (!this.szOptions.contentEquals(other.szOptions)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hWnd.hashCode()
        result = 31 * result + this.instDate.hashCode()
        result = 31 * result + this.wVersion.hashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        result = 31 * result + this.szName.contentHashCode()
        result = 31 * result + this.szOptions.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hWnd: Hwnd = MutPtr(0L),
            instDate: Datetime = Datetime(),
            wVersion: UInt = 0u,
            szDescription: UShortArray = UShortArray(50),
            szName: UShortArray = UShortArray(80),
            szOptions: UShortArray = UShortArray(30),
        ): Imeprow =
            Imeprow(
                hWndCtorArg = hWnd,
                instDate = instDate,
                wVersion = wVersion,
                szDescription = szDescription,
                szName = szName,
                szOptions = szOptions,
            )
    }
}

public data class Imestruct(
    public var fnc: UInt = 0u,
    public var wParam: Wparam = 0uL,
    public var wCount: UInt = 0u,
    public var dchSource: UInt = 0u,
    public var dchDest: UInt = 0u,
    public var lParam1: Lparam = 0L,
    public var lParam2: Lparam = 0L,
    public var lParam3: Lparam = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Imestruct> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Imestruct> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): Imestruct =
                    Imestruct(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: Imestruct) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.fnc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.wParam)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.wCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dchSource)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dchDest)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.lParam1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.lParam2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.lParam3)
                }
            }
    }
}

public class JavaTrust internal constructor(
    public var cbSize: UInt,
    public var flag: UInt,
    public var fAllActiveXPermissions: Bool,
    public var fAllPermissions: Bool,
    public var dwEncodingType: UInt,
    pbJavaPermissionsCtorArg: MutPtr<UByte>,
    public var cbJavaPermissions: UInt,
    pbSignerCtorArg: MutPtr<UByte>,
    public var cbSigner: UInt,
    pwszZoneCtorArg: Pcwstr,
    public var guidZone: Guid,
    public var hVerify: Hresult,
) {
    public var pbJavaPermissions: MutPtr<UByte> = pbJavaPermissionsCtorArg
        internal set

    public var pbSigner: MutPtr<UByte> = pbSignerCtorArg
        internal set

    public var pwszZone: Pcwstr = pwszZoneCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        flag = 0u,
        fAllActiveXPermissions = 0,
        fAllPermissions = 0,
        dwEncodingType = 0u,
        pbJavaPermissionsCtorArg = MutPtr(0L),
        cbJavaPermissions = 0u,
        pbSignerCtorArg = MutPtr(0L),
        cbSigner = 0u,
        pwszZoneCtorArg = ConstPtr(0L),
        guidZone = Guid(),
        hVerify = 0,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.flag

    public operator fun component3(): Bool = this.fAllActiveXPermissions

    public operator fun component4(): Bool = this.fAllPermissions

    public operator fun component5(): UInt = this.dwEncodingType

    public operator fun component6(): MutPtr<UByte> = this.pbJavaPermissions

    public operator fun component7(): UInt = this.cbJavaPermissions

    public operator fun component8(): MutPtr<UByte> = this.pbSigner

    public operator fun component9(): UInt = this.cbSigner

    public operator fun component10(): Pcwstr = this.pwszZone

    public operator fun component11(): Guid = this.guidZone

    public operator fun component12(): Hresult = this.hVerify

    public fun copy(cbSize: UInt = this.cbSize, flag: UInt = this.flag, fAllActiveXPermissions: Bool = this.fAllActiveXPermissions, fAllPermissions: Bool = this.fAllPermissions, dwEncodingType: UInt = this.dwEncodingType, pbJavaPermissions: MutPtr<UByte> = this.pbJavaPermissions, cbJavaPermissions: UInt = this.cbJavaPermissions, pbSigner: MutPtr<UByte> = this.pbSigner, cbSigner: UInt = this.cbSigner, pwszZone: Pcwstr = this.pwszZone, guidZone: Guid = this.guidZone, hVerify: Hresult = this.hVerify): JavaTrust = JavaTrust(cbSize = cbSize, flag = flag, fAllActiveXPermissions = fAllActiveXPermissions, fAllPermissions = fAllPermissions, dwEncodingType = dwEncodingType, pbJavaPermissionsCtorArg = pbJavaPermissions, cbJavaPermissions = cbJavaPermissions, pbSignerCtorArg = pbSigner, cbSigner = cbSigner, pwszZoneCtorArg = pwszZone, guidZone = guidZone, hVerify = hVerify)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JavaTrust) return false
        if (this.cbSize != other.cbSize) return false
        if (this.flag != other.flag) return false
        if (this.fAllActiveXPermissions != other.fAllActiveXPermissions) return false
        if (this.fAllPermissions != other.fAllPermissions) return false
        if (this.dwEncodingType != other.dwEncodingType) return false
        if (this.pbJavaPermissions != other.pbJavaPermissions) return false
        if (this.cbJavaPermissions != other.cbJavaPermissions) return false
        if (this.pbSigner != other.pbSigner) return false
        if (this.cbSigner != other.cbSigner) return false
        if (this.pwszZone != other.pwszZone) return false
        if (this.guidZone != other.guidZone) return false
        if (this.hVerify != other.hVerify) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.flag.hashCode()
        result = 31 * result + this.fAllActiveXPermissions.hashCode()
        result = 31 * result + this.fAllPermissions.hashCode()
        result = 31 * result + this.dwEncodingType.hashCode()
        result = 31 * result + this.pbJavaPermissions.hashCode()
        result = 31 * result + this.cbJavaPermissions.hashCode()
        result = 31 * result + this.pbSigner.hashCode()
        result = 31 * result + this.cbSigner.hashCode()
        result = 31 * result + this.pwszZone.hashCode()
        result = 31 * result + this.guidZone.hashCode()
        result = 31 * result + this.hVerify.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            flag: UInt = 0u,
            fAllActiveXPermissions: Bool = 0,
            fAllPermissions: Bool = 0,
            dwEncodingType: UInt = 0u,
            pbJavaPermissions: MutPtr<UByte> = MutPtr(0L),
            cbJavaPermissions: UInt = 0u,
            pbSigner: MutPtr<UByte> = MutPtr(0L),
            cbSigner: UInt = 0u,
            pwszZone: Pcwstr = ConstPtr(0L),
            guidZone: Guid = Guid(),
            hVerify: Hresult = 0,
        ): JavaTrust =
            JavaTrust(
                cbSize = cbSize,
                flag = flag,
                fAllActiveXPermissions = fAllActiveXPermissions,
                fAllPermissions = fAllPermissions,
                dwEncodingType = dwEncodingType,
                pbJavaPermissionsCtorArg = pbJavaPermissions,
                cbJavaPermissions = cbJavaPermissions,
                pbSignerCtorArg = pbSigner,
                cbSigner = cbSigner,
                pwszZoneCtorArg = pwszZone,
                guidZone = guidZone,
                hVerify = hVerify,
            )
    }
}

public data class JitDebugInfo(
    public var dwSize: UInt = 0u,
    public var dwProcessorArchitecture: UInt = 0u,
    public var dwThreadID: UInt = 0u,
    public var dwReserved0: UInt = 0u,
    public var lpExceptionAddress: ULong = 0uL,
    public var lpExceptionRecord: ULong = 0uL,
    public var lpContextRecord: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JitDebugInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JitDebugInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): JitDebugInfo =
                    JitDebugInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: JitDebugInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwProcessorArchitecture)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwThreadID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwReserved0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.lpExceptionAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.lpExceptionRecord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.lpContextRecord)
                }
            }
    }
}

public class LdrDataTableEntry internal constructor(
    reserved1CtorArg: List<MutPtr<CVoid>>,
    public var inMemoryOrderLinks: ListEntry,
    reserved2CtorArg: List<MutPtr<CVoid>>,
    dllBaseCtorArg: MutPtr<CVoid>,
    reserved3CtorArg: List<MutPtr<CVoid>>,
    public var fullDllName: UnicodeString,
    public var reserved4: UByteArray,
    reserved5CtorArg: List<MutPtr<CVoid>>,
    public var anonymous: LdrDataTableEntry0,
    public var timeDateStamp: UInt,
) {
    public var reserved1: List<MutPtr<CVoid>> = reserved1CtorArg
        internal set

    public var reserved2: List<MutPtr<CVoid>> = reserved2CtorArg
        internal set

    public var dllBase: MutPtr<CVoid> = dllBaseCtorArg
        internal set

    public var reserved3: List<MutPtr<CVoid>> = reserved3CtorArg
        internal set

    public var reserved5: List<MutPtr<CVoid>> = reserved5CtorArg
        internal set

    public constructor() : this(
        reserved1CtorArg = List(2) { MutPtr(0L) },
        inMemoryOrderLinks = ListEntry(),
        reserved2CtorArg = List(2) { MutPtr(0L) },
        dllBaseCtorArg = MutPtr(0L),
        reserved3CtorArg = List(2) { MutPtr(0L) },
        fullDllName = UnicodeString(),
        reserved4 = UByteArray(8),
        reserved5CtorArg = List(3) { MutPtr(0L) },
        anonymous = LdrDataTableEntry0(),
        timeDateStamp = 0u,
    )

    public operator fun component1(): List<MutPtr<CVoid>> = this.reserved1

    public operator fun component2(): ListEntry = this.inMemoryOrderLinks

    public operator fun component3(): List<MutPtr<CVoid>> = this.reserved2

    public operator fun component4(): MutPtr<CVoid> = this.dllBase

    public operator fun component5(): List<MutPtr<CVoid>> = this.reserved3

    public operator fun component6(): UnicodeString = this.fullDllName

    public operator fun component7(): UByteArray = this.reserved4

    public operator fun component8(): List<MutPtr<CVoid>> = this.reserved5

    public operator fun component9(): LdrDataTableEntry0 = this.anonymous

    public operator fun component10(): UInt = this.timeDateStamp

    public fun copy(reserved1: List<MutPtr<CVoid>> = this.reserved1, inMemoryOrderLinks: ListEntry = this.inMemoryOrderLinks, reserved2: List<MutPtr<CVoid>> = this.reserved2, dllBase: MutPtr<CVoid> = this.dllBase, reserved3: List<MutPtr<CVoid>> = this.reserved3, fullDllName: UnicodeString = this.fullDllName, reserved4: UByteArray = this.reserved4, reserved5: List<MutPtr<CVoid>> = this.reserved5, anonymous: LdrDataTableEntry0 = this.anonymous, timeDateStamp: UInt = this.timeDateStamp): LdrDataTableEntry = LdrDataTableEntry(reserved1CtorArg = reserved1, inMemoryOrderLinks = inMemoryOrderLinks, reserved2CtorArg = reserved2, dllBaseCtorArg = dllBase, reserved3CtorArg = reserved3, fullDllName = fullDllName, reserved4 = reserved4, reserved5CtorArg = reserved5, anonymous = anonymous, timeDateStamp = timeDateStamp)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LdrDataTableEntry) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.inMemoryOrderLinks != other.inMemoryOrderLinks) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.dllBase != other.dllBase) return false
        if (this.reserved3 != other.reserved3) return false
        if (this.fullDllName != other.fullDllName) return false
        if (!this.reserved4.contentEquals(other.reserved4)) return false
        if (this.reserved5 != other.reserved5) return false
        if (this.anonymous != other.anonymous) return false
        if (this.timeDateStamp != other.timeDateStamp) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved1.hashCode()
        result = 31 * result + this.inMemoryOrderLinks.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.dllBase.hashCode()
        result = 31 * result + this.reserved3.hashCode()
        result = 31 * result + this.fullDllName.hashCode()
        result = 31 * result + this.reserved4.contentHashCode()
        result = 31 * result + this.reserved5.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.timeDateStamp.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            reserved1: List<MutPtr<CVoid>> = List(2) { MutPtr(0L) },
            inMemoryOrderLinks: ListEntry = ListEntry(),
            reserved2: List<MutPtr<CVoid>> = List(2) { MutPtr(0L) },
            dllBase: MutPtr<CVoid> = MutPtr(0L),
            reserved3: List<MutPtr<CVoid>> = List(2) { MutPtr(0L) },
            fullDllName: UnicodeString = UnicodeString(),
            reserved4: UByteArray = UByteArray(8),
            reserved5: List<MutPtr<CVoid>> = List(3) { MutPtr(0L) },
            anonymous: LdrDataTableEntry0 = LdrDataTableEntry0(),
            timeDateStamp: UInt = 0u,
        ): LdrDataTableEntry =
            LdrDataTableEntry(
                reserved1CtorArg = reserved1,
                inMemoryOrderLinks = inMemoryOrderLinks,
                reserved2CtorArg = reserved2,
                dllBaseCtorArg = dllBase,
                reserved3CtorArg = reserved3,
                fullDllName = fullDllName,
                reserved4 = reserved4,
                reserved5CtorArg = reserved5,
                anonymous = anonymous,
                timeDateStamp = timeDateStamp,
            )
    }
}

public class LdrDataTableEntry0 internal constructor(
    public var checkSum: UInt,
    reserved6CtorArg: MutPtr<CVoid>,
) {
    public var reserved6: MutPtr<CVoid> = reserved6CtorArg
        internal set

    public constructor() : this(
        checkSum = 0u,
        reserved6CtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.checkSum

    public operator fun component2(): MutPtr<CVoid> = this.reserved6

    public fun copy(checkSum: UInt = this.checkSum, reserved6: MutPtr<CVoid> = this.reserved6): LdrDataTableEntry0 = LdrDataTableEntry0(checkSum = checkSum, reserved6CtorArg = reserved6)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LdrDataTableEntry0) return false
        if (this.checkSum != other.checkSum) return false
        if (this.reserved6 != other.reserved6) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.checkSum.hashCode()
        result = 31 * result + this.reserved6.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            checkSum: UInt = 0u,
            reserved6: MutPtr<CVoid> = MutPtr(0L),
        ): LdrDataTableEntry0 =
            LdrDataTableEntry0(
                checkSum = checkSum,
                reserved6CtorArg = reserved6,
            )
    }
}

public data class Perusersectiona(
    public var szGUID: ByteArray = ByteArray(59),
    public var szDispName: ByteArray = ByteArray(128),
    public var szLocale: ByteArray = ByteArray(10),
    public var szStub: ByteArray = ByteArray(1040),
    public var szVersion: ByteArray = ByteArray(32),
    public var szCompID: ByteArray = ByteArray(128),
    public var dwIsInstalled: UInt = 0u,
    public var bRollback: Bool = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Perusersectiona) return false
        if (!this.szGUID.contentEquals(other.szGUID)) return false
        if (!this.szDispName.contentEquals(other.szDispName)) return false
        if (!this.szLocale.contentEquals(other.szLocale)) return false
        if (!this.szStub.contentEquals(other.szStub)) return false
        if (!this.szVersion.contentEquals(other.szVersion)) return false
        if (!this.szCompID.contentEquals(other.szCompID)) return false
        if (this.dwIsInstalled != other.dwIsInstalled) return false
        if (this.bRollback != other.bRollback) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szGUID.contentHashCode()
        result = 31 * result + this.szDispName.contentHashCode()
        result = 31 * result + this.szLocale.contentHashCode()
        result = 31 * result + this.szStub.contentHashCode()
        result = 31 * result + this.szVersion.contentHashCode()
        result = 31 * result + this.szCompID.contentHashCode()
        result = 31 * result + this.dwIsInstalled.hashCode()
        result = 31 * result + this.bRollback.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Perusersectiona> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Perusersectiona> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 1408L
                override fun readNative(addr: Long): Perusersectiona =
                    Perusersectiona(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (59).toInt())
                        ).readNative(addr).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (128).toInt())
                        ).readNative(addr + 59L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (10).toInt())
                        ).readNative(addr + 187L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1040).toInt())
                        ).readNative(addr + 197L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                        ).readNative(addr + 1237L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (128).toInt())
                        ).readNative(addr + 1269L).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 1400L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 1404L),
                    )
                override fun writeNative(addr: Long, value: Perusersectiona) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (59).toInt())
                    ).writeNative(addr, value.szGUID.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (128).toInt())
                    ).writeNative(addr + 59L, value.szDispName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (10).toInt())
                    ).writeNative(addr + 187L, value.szLocale.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1040).toInt())
                    ).writeNative(addr + 197L, value.szStub.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                    ).writeNative(addr + 1237L, value.szVersion.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (128).toInt())
                    ).writeNative(addr + 1269L, value.szCompID.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 1400L, value.dwIsInstalled)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 1404L, value.bRollback)
                }
            }
    }
}

public data class Perusersectionw(
    public var szGUID: UShortArray = UShortArray(59),
    public var szDispName: UShortArray = UShortArray(128),
    public var szLocale: UShortArray = UShortArray(10),
    public var szStub: UShortArray = UShortArray(1040),
    public var szVersion: UShortArray = UShortArray(32),
    public var szCompID: UShortArray = UShortArray(128),
    public var dwIsInstalled: UInt = 0u,
    public var bRollback: Bool = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Perusersectionw) return false
        if (!this.szGUID.contentEquals(other.szGUID)) return false
        if (!this.szDispName.contentEquals(other.szDispName)) return false
        if (!this.szLocale.contentEquals(other.szLocale)) return false
        if (!this.szStub.contentEquals(other.szStub)) return false
        if (!this.szVersion.contentEquals(other.szVersion)) return false
        if (!this.szCompID.contentEquals(other.szCompID)) return false
        if (this.dwIsInstalled != other.dwIsInstalled) return false
        if (this.bRollback != other.bRollback) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szGUID.contentHashCode()
        result = 31 * result + this.szDispName.contentHashCode()
        result = 31 * result + this.szLocale.contentHashCode()
        result = 31 * result + this.szStub.contentHashCode()
        result = 31 * result + this.szVersion.contentHashCode()
        result = 31 * result + this.szCompID.contentHashCode()
        result = 31 * result + this.dwIsInstalled.hashCode()
        result = 31 * result + this.bRollback.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Perusersectionw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Perusersectionw> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 2804L
                override fun readNative(addr: Long): Perusersectionw =
                    Perusersectionw(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (59).toInt())
                        ).readNative(addr).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                        ).readNative(addr + 118L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (10).toInt())
                        ).readNative(addr + 374L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1040).toInt())
                        ).readNative(addr + 394L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr + 2474L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                        ).readNative(addr + 2538L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 2796L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 2800L),
                    )
                override fun writeNative(addr: Long, value: Perusersectionw) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (59).toInt())
                    ).writeNative(addr, value.szGUID.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                    ).writeNative(addr + 118L, value.szDispName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (10).toInt())
                    ).writeNative(addr + 374L, value.szLocale.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1040).toInt())
                    ).writeNative(addr + 394L, value.szStub.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr + 2474L, value.szVersion.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                    ).writeNative(addr + 2538L, value.szCompID.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 2796L, value.dwIsInstalled)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 2800L, value.bRollback)
                }
            }
    }
}

public data class PublicObjectBasicInformation(
    public var attributes: UInt = 0u,
    public var grantedAccess: UInt = 0u,
    public var handleCount: UInt = 0u,
    public var pointerCount: UInt = 0u,
    public var reserved: UIntArray = UIntArray(10),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PublicObjectBasicInformation) return false
        if (this.attributes != other.attributes) return false
        if (this.grantedAccess != other.grantedAccess) return false
        if (this.handleCount != other.handleCount) return false
        if (this.pointerCount != other.pointerCount) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.attributes.hashCode()
        result = 31 * result + this.grantedAccess.hashCode()
        result = 31 * result + this.handleCount.hashCode()
        result = 31 * result + this.pointerCount.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PublicObjectBasicInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PublicObjectBasicInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): PublicObjectBasicInformation =
                    PublicObjectBasicInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (10).toInt())
                        ).readNative(addr + 16L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: PublicObjectBasicInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.attributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.grantedAccess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.handleCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.pointerCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (10).toInt())
                    ).writeNative(addr + 16L, value.reserved.toList())
                }
            }
    }
}

public data class PublicObjectTypeInformation(
    public var typeName: UnicodeString = UnicodeString(),
    public var reserved: UIntArray = UIntArray(22),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PublicObjectTypeInformation) return false
        if (this.typeName != other.typeName) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.typeName.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public class Strentrya internal constructor(
    pszNameCtorArg: Pstr,
    pszValueCtorArg: Pstr,
) {
    public var pszName: Pstr = pszNameCtorArg
        internal set

    public var pszValue: Pstr = pszValueCtorArg
        internal set

    public constructor() : this(
        pszNameCtorArg = MutPtr(0L),
        pszValueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.pszName

    public operator fun component2(): Pstr = this.pszValue

    public fun copy(pszName: Pstr = this.pszName, pszValue: Pstr = this.pszValue): Strentrya = Strentrya(pszNameCtorArg = pszName, pszValueCtorArg = pszValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Strentrya) return false
        if (this.pszName != other.pszName) return false
        if (this.pszValue != other.pszValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszName.hashCode()
        result = 31 * result + this.pszValue.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszName: Pstr = MutPtr(0L),
            pszValue: Pstr = MutPtr(0L),
        ): Strentrya =
            Strentrya(
                pszNameCtorArg = pszName,
                pszValueCtorArg = pszValue,
            )
    }
}

public class Strentryw internal constructor(
    pszNameCtorArg: Pwstr,
    pszValueCtorArg: Pwstr,
) {
    public var pszName: Pwstr = pszNameCtorArg
        internal set

    public var pszValue: Pwstr = pszValueCtorArg
        internal set

    public constructor() : this(
        pszNameCtorArg = MutPtr(0L),
        pszValueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pszName

    public operator fun component2(): Pwstr = this.pszValue

    public fun copy(pszName: Pwstr = this.pszName, pszValue: Pwstr = this.pszValue): Strentryw = Strentryw(pszNameCtorArg = pszName, pszValueCtorArg = pszValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Strentryw) return false
        if (this.pszName != other.pszName) return false
        if (this.pszValue != other.pszValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszName.hashCode()
        result = 31 * result + this.pszValue.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszName: Pwstr = MutPtr(0L),
            pszValue: Pwstr = MutPtr(0L),
        ): Strentryw =
            Strentryw(
                pszNameCtorArg = pszName,
                pszValueCtorArg = pszValue,
            )
    }
}

public data class Stringexstruct(
    public var dwSize: UInt = 0u,
    public var uDeterminePos: UInt = 0u,
    public var uDetermineDelimPos: UInt = 0u,
    public var uYomiPos: UInt = 0u,
    public var uYomiDelimPos: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stringexstruct> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stringexstruct> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): Stringexstruct =
                    Stringexstruct(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Stringexstruct) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uDeterminePos)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.uDetermineDelimPos)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.uYomiPos)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.uYomiDelimPos)
                }
            }
    }
}

public class Strtablea internal constructor(
    public var cEntries: UInt,
    pseCtorArg: MutPtr<Strentrya>,
) {
    public var pse: MutPtr<Strentrya> = pseCtorArg
        internal set

    public constructor() : this(
        cEntries = 0u,
        pseCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cEntries

    public operator fun component2(): MutPtr<Strentrya> = this.pse

    public fun copy(cEntries: UInt = this.cEntries, pse: MutPtr<Strentrya> = this.pse): Strtablea = Strtablea(cEntries = cEntries, pseCtorArg = pse)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Strtablea) return false
        if (this.cEntries != other.cEntries) return false
        if (this.pse != other.pse) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cEntries.hashCode()
        result = 31 * result + this.pse.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Strtablea> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Strtablea> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Strtablea =
                    Strtablea(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Strentrya>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Strtablea) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Strentrya>(64)
                    ).writeNative(addr + 8L, value.pse)
                }
            }

        public operator fun invoke(
            cEntries: UInt = 0u,
            pse: MutPtr<Strentrya> = MutPtr(0L),
        ): Strtablea =
            Strtablea(
                cEntries = cEntries,
                pseCtorArg = pse,
            )
    }
}

public class Strtablew internal constructor(
    public var cEntries: UInt,
    pseCtorArg: MutPtr<Strentryw>,
) {
    public var pse: MutPtr<Strentryw> = pseCtorArg
        internal set

    public constructor() : this(
        cEntries = 0u,
        pseCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cEntries

    public operator fun component2(): MutPtr<Strentryw> = this.pse

    public fun copy(cEntries: UInt = this.cEntries, pse: MutPtr<Strentryw> = this.pse): Strtablew = Strtablew(cEntries = cEntries, pseCtorArg = pse)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Strtablew) return false
        if (this.cEntries != other.cEntries) return false
        if (this.pse != other.pse) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cEntries.hashCode()
        result = 31 * result + this.pse.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Strtablew> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Strtablew> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Strtablew =
                    Strtablew(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Strentryw>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Strtablew) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Strentryw>(64)
                    ).writeNative(addr + 8L, value.pse)
                }
            }

        public operator fun invoke(
            cEntries: UInt = 0u,
            pse: MutPtr<Strentryw> = MutPtr(0L),
        ): Strtablew =
            Strtablew(
                cEntries = cEntries,
                pseCtorArg = pse,
            )
    }
}

public class SystemBasicInformation internal constructor(
    public var reserved1: UByteArray,
    reserved2CtorArg: List<MutPtr<CVoid>>,
    public var numberOfProcessors: Byte,
) {
    public var reserved2: List<MutPtr<CVoid>> = reserved2CtorArg
        internal set

    public constructor() : this(
        reserved1 = UByteArray(24),
        reserved2CtorArg = List(4) { MutPtr(0L) },
        numberOfProcessors = 0,
    )

    public operator fun component1(): UByteArray = this.reserved1

    public operator fun component2(): List<MutPtr<CVoid>> = this.reserved2

    public operator fun component3(): Byte = this.numberOfProcessors

    public fun copy(reserved1: UByteArray = this.reserved1, reserved2: List<MutPtr<CVoid>> = this.reserved2, numberOfProcessors: Byte = this.numberOfProcessors): SystemBasicInformation = SystemBasicInformation(reserved1 = reserved1, reserved2CtorArg = reserved2, numberOfProcessors = numberOfProcessors)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SystemBasicInformation) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.numberOfProcessors != other.numberOfProcessors) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved1.contentHashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.numberOfProcessors.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemBasicInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemBasicInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): SystemBasicInformation =
                    SystemBasicInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (24).toInt())
                        ).readNative(addr).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                        .mutPtrLayout<CVoid>(64),
                                    (4).toInt(),
                                )
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: SystemBasicInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (24).toInt())
                    ).writeNative(addr, value.reserved1.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                    .mutPtrLayout<CVoid>(64),
                                (4).toInt(),
                            )
                    ).writeNative(addr + 24L, value.reserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 56L, value.numberOfProcessors)
                }
            }

        public operator fun invoke(
            reserved1: UByteArray = UByteArray(24),
            reserved2: List<MutPtr<CVoid>> = List(4) { MutPtr(0L) },
            numberOfProcessors: Byte = 0,
        ): SystemBasicInformation =
            SystemBasicInformation(
                reserved1 = reserved1,
                reserved2CtorArg = reserved2,
                numberOfProcessors = numberOfProcessors,
            )
    }
}

public data class SystemCodeintegrityInformation(
    public var length: UInt = 0u,
    public var codeIntegrityOptions: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemCodeintegrityInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemCodeintegrityInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SystemCodeintegrityInformation =
                    SystemCodeintegrityInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SystemCodeintegrityInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.codeIntegrityOptions)
                }
            }
    }
}

public data class SystemExceptionInformation(
    public var reserved1: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SystemExceptionInformation) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        return true
    }

    override fun hashCode(): Int = this.reserved1.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemExceptionInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemExceptionInformation> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SystemExceptionInformation =
                    SystemExceptionInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: SystemExceptionInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.reserved1.toList())
                }
            }
    }
}

public data class SystemInterruptInformation(
    public var reserved1: UByteArray = UByteArray(24),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SystemInterruptInformation) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        return true
    }

    override fun hashCode(): Int = this.reserved1.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemInterruptInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemInterruptInformation> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): SystemInterruptInformation =
                    SystemInterruptInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (24).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: SystemInterruptInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (24).toInt())
                    ).writeNative(addr, value.reserved1.toList())
                }
            }
    }
}

public data class SystemLookasideInformation(
    public var reserved1: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SystemLookasideInformation) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        return true
    }

    override fun hashCode(): Int = this.reserved1.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemLookasideInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemLookasideInformation> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): SystemLookasideInformation =
                    SystemLookasideInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: SystemLookasideInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr, value.reserved1.toList())
                }
            }
    }
}

public data class SystemPerformanceInformation(
    public var reserved1: UByteArray = UByteArray(312),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SystemPerformanceInformation) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        return true
    }

    override fun hashCode(): Int = this.reserved1.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemPerformanceInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemPerformanceInformation> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 312L
                override fun readNative(addr: Long): SystemPerformanceInformation =
                    SystemPerformanceInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (312).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: SystemPerformanceInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (312).toInt())
                    ).writeNative(addr, value.reserved1.toList())
                }
            }
    }
}

public class SystemPolicyInformation internal constructor(
    reserved1CtorArg: List<MutPtr<CVoid>>,
    public var reserved2: UIntArray,
) {
    public var reserved1: List<MutPtr<CVoid>> = reserved1CtorArg
        internal set

    public constructor() : this(
        reserved1CtorArg = List(2) { MutPtr(0L) },
        reserved2 = UIntArray(3),
    )

    public operator fun component1(): List<MutPtr<CVoid>> = this.reserved1

    public operator fun component2(): UIntArray = this.reserved2

    public fun copy(reserved1: List<MutPtr<CVoid>> = this.reserved1, reserved2: UIntArray = this.reserved2): SystemPolicyInformation = SystemPolicyInformation(reserved1CtorArg = reserved1, reserved2 = reserved2)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SystemPolicyInformation) return false
        if (this.reserved1 != other.reserved1) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved1.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemPolicyInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemPolicyInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): SystemPolicyInformation =
                    SystemPolicyInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                        .mutPtrLayout<CVoid>(64),
                                    (2).toInt(),
                                )
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                        ).readNative(addr + 16L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: SystemPolicyInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                    .mutPtrLayout<CVoid>(64),
                                (2).toInt(),
                            )
                    ).writeNative(addr, value.reserved1)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                    ).writeNative(addr + 16L, value.reserved2.toList())
                }
            }

        public operator fun invoke(
            reserved1: List<MutPtr<CVoid>> = List(2) { MutPtr(0L) },
            reserved2: UIntArray = UIntArray(3),
        ): SystemPolicyInformation =
            SystemPolicyInformation(
                reserved1CtorArg = reserved1,
                reserved2 = reserved2,
            )
    }
}

public data class SystemProcessorPerformanceInformation(
    public var idleTime: Long = 0L,
    public var kernelTime: Long = 0L,
    public var userTime: Long = 0L,
    public var reserved1: LongArray = LongArray(2),
    public var reserved2: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SystemProcessorPerformanceInformation) return false
        if (this.idleTime != other.idleTime) return false
        if (this.kernelTime != other.kernelTime) return false
        if (this.userTime != other.userTime) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.reserved2 != other.reserved2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.idleTime.hashCode()
        result = 31 * result + this.kernelTime.hashCode()
        result = 31 * result + this.userTime.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.reserved2.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemProcessorPerformanceInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemProcessorPerformanceInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): SystemProcessorPerformanceInformation =
                    SystemProcessorPerformanceInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (2).toInt())
                        ).readNative(addr + 24L).toLongArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: SystemProcessorPerformanceInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.idleTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.kernelTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.userTime)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (2).toInt())
                    ).writeNative(addr + 24L, value.reserved1.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.reserved2)
                }
            }
    }
}

public class SystemProcessInformation internal constructor(
    public var nextEntryOffset: UInt,
    public var numberOfThreads: UInt,
    public var reserved1: UByteArray,
    public var imageName: UnicodeString,
    public var basePriority: Int,
    uniqueProcessIdCtorArg: Handle,
    reserved2CtorArg: MutPtr<CVoid>,
    public var handleCount: UInt,
    public var sessionId: UInt,
    reserved3CtorArg: MutPtr<CVoid>,
    public var peakVirtualSize: Int,
    public var virtualSize: Int,
    public var reserved4: UInt,
    public var peakWorkingSetSize: Int,
    public var workingSetSize: Int,
    reserved5CtorArg: MutPtr<CVoid>,
    public var quotaPagedPoolUsage: Int,
    reserved6CtorArg: MutPtr<CVoid>,
    public var quotaNonPagedPoolUsage: Int,
    public var pagefileUsage: Int,
    public var peakPagefileUsage: Int,
    public var privatePageCount: Int,
    public var reserved7: LongArray,
) {
    public var uniqueProcessId: Handle = uniqueProcessIdCtorArg
        internal set

    public var reserved2: MutPtr<CVoid> = reserved2CtorArg
        internal set

    public var reserved3: MutPtr<CVoid> = reserved3CtorArg
        internal set

    public var reserved5: MutPtr<CVoid> = reserved5CtorArg
        internal set

    public var reserved6: MutPtr<CVoid> = reserved6CtorArg
        internal set

    public constructor() : this(
        nextEntryOffset = 0u,
        numberOfThreads = 0u,
        reserved1 = UByteArray(48),
        imageName = UnicodeString(),
        basePriority = 0,
        uniqueProcessIdCtorArg = MutPtr(0L),
        reserved2CtorArg = MutPtr(0L),
        handleCount = 0u,
        sessionId = 0u,
        reserved3CtorArg = MutPtr(0L),
        peakVirtualSize = 0,
        virtualSize = 0,
        reserved4 = 0u,
        peakWorkingSetSize = 0,
        workingSetSize = 0,
        reserved5CtorArg = MutPtr(0L),
        quotaPagedPoolUsage = 0,
        reserved6CtorArg = MutPtr(0L),
        quotaNonPagedPoolUsage = 0,
        pagefileUsage = 0,
        peakPagefileUsage = 0,
        privatePageCount = 0,
        reserved7 = LongArray(6),
    )

    public companion object {
        public operator fun invoke(
            nextEntryOffset: UInt = 0u,
            numberOfThreads: UInt = 0u,
            reserved1: UByteArray = UByteArray(48),
            imageName: UnicodeString = UnicodeString(),
            basePriority: Int = 0,
            uniqueProcessId: Handle = MutPtr(0L),
            reserved2: MutPtr<CVoid> = MutPtr(0L),
            handleCount: UInt = 0u,
            sessionId: UInt = 0u,
            reserved3: MutPtr<CVoid> = MutPtr(0L),
            peakVirtualSize: Int = 0,
            virtualSize: Int = 0,
            reserved4: UInt = 0u,
            peakWorkingSetSize: Int = 0,
            workingSetSize: Int = 0,
            reserved5: MutPtr<CVoid> = MutPtr(0L),
            quotaPagedPoolUsage: Int = 0,
            reserved6: MutPtr<CVoid> = MutPtr(0L),
            quotaNonPagedPoolUsage: Int = 0,
            pagefileUsage: Int = 0,
            peakPagefileUsage: Int = 0,
            privatePageCount: Int = 0,
            reserved7: LongArray = LongArray(6),
        ): SystemProcessInformation =
            SystemProcessInformation(
                nextEntryOffset = nextEntryOffset,
                numberOfThreads = numberOfThreads,
                reserved1 = reserved1,
                imageName = imageName,
                basePriority = basePriority,
                uniqueProcessIdCtorArg = uniqueProcessId,
                reserved2CtorArg = reserved2,
                handleCount = handleCount,
                sessionId = sessionId,
                reserved3CtorArg = reserved3,
                peakVirtualSize = peakVirtualSize,
                virtualSize = virtualSize,
                reserved4 = reserved4,
                peakWorkingSetSize = peakWorkingSetSize,
                workingSetSize = workingSetSize,
                reserved5CtorArg = reserved5,
                quotaPagedPoolUsage = quotaPagedPoolUsage,
                reserved6CtorArg = reserved6,
                quotaNonPagedPoolUsage = quotaNonPagedPoolUsage,
                pagefileUsage = pagefileUsage,
                peakPagefileUsage = peakPagefileUsage,
                privatePageCount = privatePageCount,
                reserved7 = reserved7,
            )
    }
}

public class SystemRegistryQuotaInformation internal constructor(
    public var registryQuotaAllowed: UInt,
    public var registryQuotaUsed: UInt,
    reserved1CtorArg: MutPtr<CVoid>,
) {
    public var reserved1: MutPtr<CVoid> = reserved1CtorArg
        internal set

    public constructor() : this(
        registryQuotaAllowed = 0u,
        registryQuotaUsed = 0u,
        reserved1CtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.registryQuotaAllowed

    public operator fun component2(): UInt = this.registryQuotaUsed

    public operator fun component3(): MutPtr<CVoid> = this.reserved1

    public fun copy(registryQuotaAllowed: UInt = this.registryQuotaAllowed, registryQuotaUsed: UInt = this.registryQuotaUsed, reserved1: MutPtr<CVoid> = this.reserved1): SystemRegistryQuotaInformation = SystemRegistryQuotaInformation(registryQuotaAllowed = registryQuotaAllowed, registryQuotaUsed = registryQuotaUsed, reserved1CtorArg = reserved1)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SystemRegistryQuotaInformation) return false
        if (this.registryQuotaAllowed != other.registryQuotaAllowed) return false
        if (this.registryQuotaUsed != other.registryQuotaUsed) return false
        if (this.reserved1 != other.reserved1) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.registryQuotaAllowed.hashCode()
        result = 31 * result + this.registryQuotaUsed.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemRegistryQuotaInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemRegistryQuotaInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SystemRegistryQuotaInformation =
                    SystemRegistryQuotaInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SystemRegistryQuotaInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.registryQuotaAllowed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.registryQuotaUsed)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.reserved1)
                }
            }

        public operator fun invoke(
            registryQuotaAllowed: UInt = 0u,
            registryQuotaUsed: UInt = 0u,
            reserved1: MutPtr<CVoid> = MutPtr(0L),
        ): SystemRegistryQuotaInformation =
            SystemRegistryQuotaInformation(
                registryQuotaAllowed = registryQuotaAllowed,
                registryQuotaUsed = registryQuotaUsed,
                reserved1CtorArg = reserved1,
            )
    }
}

public class SystemThreadInformation internal constructor(
    public var reserved1: LongArray,
    public var reserved2: UInt,
    startAddressCtorArg: MutPtr<CVoid>,
    public var clientId: ClientId,
    public var priority: Int,
    public var basePriority: Int,
    public var reserved3: UInt,
    public var threadState: UInt,
    public var waitReason: UInt,
) {
    public var startAddress: MutPtr<CVoid> = startAddressCtorArg
        internal set

    public constructor() : this(
        reserved1 = LongArray(3),
        reserved2 = 0u,
        startAddressCtorArg = MutPtr(0L),
        clientId = ClientId(),
        priority = 0,
        basePriority = 0,
        reserved3 = 0u,
        threadState = 0u,
        waitReason = 0u,
    )

    public operator fun component1(): LongArray = this.reserved1

    public operator fun component2(): UInt = this.reserved2

    public operator fun component3(): MutPtr<CVoid> = this.startAddress

    public operator fun component4(): ClientId = this.clientId

    public operator fun component5(): Int = this.priority

    public operator fun component6(): Int = this.basePriority

    public operator fun component7(): UInt = this.reserved3

    public operator fun component8(): UInt = this.threadState

    public operator fun component9(): UInt = this.waitReason

    public fun copy(reserved1: LongArray = this.reserved1, reserved2: UInt = this.reserved2, startAddress: MutPtr<CVoid> = this.startAddress, clientId: ClientId = this.clientId, priority: Int = this.priority, basePriority: Int = this.basePriority, reserved3: UInt = this.reserved3, threadState: UInt = this.threadState, waitReason: UInt = this.waitReason): SystemThreadInformation = SystemThreadInformation(reserved1 = reserved1, reserved2 = reserved2, startAddressCtorArg = startAddress, clientId = clientId, priority = priority, basePriority = basePriority, reserved3 = reserved3, threadState = threadState, waitReason = waitReason)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SystemThreadInformation) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.startAddress != other.startAddress) return false
        if (this.clientId != other.clientId) return false
        if (this.priority != other.priority) return false
        if (this.basePriority != other.basePriority) return false
        if (this.reserved3 != other.reserved3) return false
        if (this.threadState != other.threadState) return false
        if (this.waitReason != other.waitReason) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved1.contentHashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.startAddress.hashCode()
        result = 31 * result + this.clientId.hashCode()
        result = 31 * result + this.priority.hashCode()
        result = 31 * result + this.basePriority.hashCode()
        result = 31 * result + this.reserved3.hashCode()
        result = 31 * result + this.threadState.hashCode()
        result = 31 * result + this.waitReason.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            reserved1: LongArray = LongArray(3),
            reserved2: UInt = 0u,
            startAddress: MutPtr<CVoid> = MutPtr(0L),
            clientId: ClientId = ClientId(),
            priority: Int = 0,
            basePriority: Int = 0,
            reserved3: UInt = 0u,
            threadState: UInt = 0u,
            waitReason: UInt = 0u,
        ): SystemThreadInformation =
            SystemThreadInformation(
                reserved1 = reserved1,
                reserved2 = reserved2,
                startAddressCtorArg = startAddress,
                clientId = clientId,
                priority = priority,
                basePriority = basePriority,
                reserved3 = reserved3,
                threadState = threadState,
                waitReason = waitReason,
            )
    }
}

public data class SystemTimeofdayInformation(
    public var reserved1: UByteArray = UByteArray(48),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SystemTimeofdayInformation) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        return true
    }

    override fun hashCode(): Int = this.reserved1.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemTimeofdayInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemTimeofdayInformation> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): SystemTimeofdayInformation =
                    SystemTimeofdayInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (48).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: SystemTimeofdayInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (48).toInt())
                    ).writeNative(addr, value.reserved1.toList())
                }
            }
    }
}

public data class TcpRequestQueryInformationEx32Xp(
    public var id: TDIObjectID = TDIObjectID(),
    public var context: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TcpRequestQueryInformationEx32Xp) return false
        if (this.id != other.id) return false
        if (!this.context.contentEquals(other.context)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.context.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpRequestQueryInformationEx32Xp> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpRequestQueryInformationEx32Xp> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): TcpRequestQueryInformationEx32Xp =
                    TcpRequestQueryInformationEx32Xp(
                        (TDIObjectID.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr + 20L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: TcpRequestQueryInformationEx32Xp) {
                    (TDIObjectID.typeLayout()).writeNative(addr, value.id)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr + 20L, value.context.toList())
                }
            }
    }
}

public data class TcpRequestQueryInformationExW2k(
    public var id: TDIObjectID = TDIObjectID(),
    public var context: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TcpRequestQueryInformationExW2k) return false
        if (this.id != other.id) return false
        if (!this.context.contentEquals(other.context)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.context.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpRequestQueryInformationExW2k> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpRequestQueryInformationExW2k> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): TcpRequestQueryInformationExW2k =
                    TcpRequestQueryInformationExW2k(
                        (TDIObjectID.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 20L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: TcpRequestQueryInformationExW2k) {
                    (TDIObjectID.typeLayout()).writeNative(addr, value.id)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 20L, value.context.toList())
                }
            }
    }
}

public data class TcpRequestQueryInformationExXp(
    public var id: TDIObjectID = TDIObjectID(),
    public var context: IntArray = IntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TcpRequestQueryInformationExXp) return false
        if (this.id != other.id) return false
        if (!this.context.contentEquals(other.context)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.context.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpRequestQueryInformationExXp> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpRequestQueryInformationExXp> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): TcpRequestQueryInformationExXp =
                    TcpRequestQueryInformationExXp(
                        (TDIObjectID.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (4).toInt())
                        ).readNative(addr + 24L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: TcpRequestQueryInformationExXp) {
                    (TDIObjectID.typeLayout()).writeNative(addr, value.id)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (4).toInt())
                    ).writeNative(addr + 24L, value.context.toList())
                }
            }
    }
}

public data class TcpRequestSetInformationEx(
    public var id: TDIObjectID = TDIObjectID(),
    public var bufferSize: UInt = 0u,
    public var buffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TcpRequestSetInformationEx) return false
        if (this.id != other.id) return false
        if (this.bufferSize != other.bufferSize) return false
        if (!this.buffer.contentEquals(other.buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.bufferSize.hashCode()
        result = 31 * result + this.buffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpRequestSetInformationEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpRequestSetInformationEx> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): TcpRequestSetInformationEx =
                    TcpRequestSetInformationEx(
                        (TDIObjectID.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 24L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: TcpRequestSetInformationEx) {
                    (TDIObjectID.typeLayout()).writeNative(addr, value.id)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.bufferSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 24L, value.buffer.toList())
                }
            }
    }
}

public data class TDIEntityID(
    public var teiEntity: TdientityEntityType = 0u,
    public var teiInstance: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TDIEntityID> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TDIEntityID> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): TDIEntityID =
                    TDIEntityID(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: TDIEntityID) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.teiEntity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.teiInstance)
                }
            }
    }
}

public data class TDIObjectID(
    public var toiEntity: TDIEntityID = TDIEntityID(),
    public var toiClass: UInt = 0u,
    public var toiType: UInt = 0u,
    public var toiId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TDIObjectID> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TDIObjectID> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): TDIObjectID =
                    TDIObjectID(
                        (TDIEntityID.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: TDIObjectID) {
                    (TDIEntityID.typeLayout()).writeNative(addr, value.toiEntity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.toiClass)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.toiType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.toiId)
                }
            }
    }
}

public class TdiTlIoControlEndpoint internal constructor(
    public var type: TdiTlIoControlType,
    public var level: UInt,
    public var anonymous: TdiTlIoControlEndpoint0,
    inputBufferCtorArg: MutPtr<CVoid>,
    public var inputBufferLength: UInt,
    outputBufferCtorArg: MutPtr<CVoid>,
    public var outputBufferLength: UInt,
) {
    public var inputBuffer: MutPtr<CVoid> = inputBufferCtorArg
        internal set

    public var outputBuffer: MutPtr<CVoid> = outputBufferCtorArg
        internal set

    public constructor() : this(
        type = 0,
        level = 0u,
        anonymous = TdiTlIoControlEndpoint0(),
        inputBufferCtorArg = MutPtr(0L),
        inputBufferLength = 0u,
        outputBufferCtorArg = MutPtr(0L),
        outputBufferLength = 0u,
    )

    public operator fun component1(): TdiTlIoControlType = this.type

    public operator fun component2(): UInt = this.level

    public operator fun component3(): TdiTlIoControlEndpoint0 = this.anonymous

    public operator fun component4(): MutPtr<CVoid> = this.inputBuffer

    public operator fun component5(): UInt = this.inputBufferLength

    public operator fun component6(): MutPtr<CVoid> = this.outputBuffer

    public operator fun component7(): UInt = this.outputBufferLength

    public fun copy(type: TdiTlIoControlType = this.type, level: UInt = this.level, anonymous: TdiTlIoControlEndpoint0 = this.anonymous, inputBuffer: MutPtr<CVoid> = this.inputBuffer, inputBufferLength: UInt = this.inputBufferLength, outputBuffer: MutPtr<CVoid> = this.outputBuffer, outputBufferLength: UInt = this.outputBufferLength): TdiTlIoControlEndpoint = TdiTlIoControlEndpoint(type = type, level = level, anonymous = anonymous, inputBufferCtorArg = inputBuffer, inputBufferLength = inputBufferLength, outputBufferCtorArg = outputBuffer, outputBufferLength = outputBufferLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TdiTlIoControlEndpoint) return false
        if (this.type != other.type) return false
        if (this.level != other.level) return false
        if (this.anonymous != other.anonymous) return false
        if (this.inputBuffer != other.inputBuffer) return false
        if (this.inputBufferLength != other.inputBufferLength) return false
        if (this.outputBuffer != other.outputBuffer) return false
        if (this.outputBufferLength != other.outputBufferLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.level.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.inputBuffer.hashCode()
        result = 31 * result + this.inputBufferLength.hashCode()
        result = 31 * result + this.outputBuffer.hashCode()
        result = 31 * result + this.outputBufferLength.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            type: TdiTlIoControlType = 0,
            level: UInt = 0u,
            anonymous: TdiTlIoControlEndpoint0 = TdiTlIoControlEndpoint0(),
            inputBuffer: MutPtr<CVoid> = MutPtr(0L),
            inputBufferLength: UInt = 0u,
            outputBuffer: MutPtr<CVoid> = MutPtr(0L),
            outputBufferLength: UInt = 0u,
        ): TdiTlIoControlEndpoint =
            TdiTlIoControlEndpoint(
                type = type,
                level = level,
                anonymous = anonymous,
                inputBufferCtorArg = inputBuffer,
                inputBufferLength = inputBufferLength,
                outputBufferCtorArg = outputBuffer,
                outputBufferLength = outputBufferLength,
            )
    }
}

public data class TdiTlIoControlEndpoint0(
    public var ioControlCode: UInt = 0u,
    public var optionName: UInt = 0u,
)

public data class ThreadNameInformation(
    public var threadName: UnicodeString = UnicodeString(),
)

public data class Undeterminestruct(
    public var dwSize: UInt = 0u,
    public var uDefIMESize: UInt = 0u,
    public var uDefIMEPos: UInt = 0u,
    public var uUndetTextLen: UInt = 0u,
    public var uUndetTextPos: UInt = 0u,
    public var uUndetAttrPos: UInt = 0u,
    public var uCursorPos: UInt = 0u,
    public var uDeltaStart: UInt = 0u,
    public var uDetermineTextLen: UInt = 0u,
    public var uDetermineTextPos: UInt = 0u,
    public var uDetermineDelimPos: UInt = 0u,
    public var uYomiTextLen: UInt = 0u,
    public var uYomiTextPos: UInt = 0u,
    public var uYomiDelimPos: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Undeterminestruct> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Undeterminestruct> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): Undeterminestruct =
                    Undeterminestruct(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                    )
                override fun writeNative(addr: Long, value: Undeterminestruct) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uDefIMESize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.uDefIMEPos)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.uUndetTextLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.uUndetTextPos)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.uUndetAttrPos)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.uCursorPos)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.uDeltaStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.uDetermineTextLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.uDetermineTextPos)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.uDetermineDelimPos)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.uYomiTextLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.uYomiTextPos)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.uYomiDelimPos)
                }
            }
    }
}

public data class Winstationinformationw(
    public var reserved2: UByteArray = UByteArray(70),
    public var logonId: UInt = 0u,
    public var reserved3: UByteArray = UByteArray(1140),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Winstationinformationw) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        if (this.logonId != other.logonId) return false
        if (!this.reserved3.contentEquals(other.reserved3)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved2.contentHashCode()
        result = 31 * result + this.logonId.hashCode()
        result = 31 * result + this.reserved3.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Winstationinformationw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Winstationinformationw> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 1216L
                override fun readNative(addr: Long): Winstationinformationw =
                    Winstationinformationw(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (70).toInt())
                        ).readNative(addr).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1140).toInt())
                        ).readNative(addr + 76L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Winstationinformationw) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (70).toInt())
                    ).writeNative(addr, value.reserved2.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.logonId)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1140).toInt())
                    ).writeNative(addr + 76L, value.reserved3.toList())
                }
            }
    }
}

public class WldpDeviceSecurityInformation internal constructor(
    public var unlockIdSize: UInt,
    unlockIdCtorArg: MutPtr<UByte>,
    public var manufacturerIDLength: UInt,
    manufacturerIDCtorArg: Pwstr,
) {
    public var unlockId: MutPtr<UByte> = unlockIdCtorArg
        internal set

    public var manufacturerID: Pwstr = manufacturerIDCtorArg
        internal set

    public constructor() : this(
        unlockIdSize = 0u,
        unlockIdCtorArg = MutPtr(0L),
        manufacturerIDLength = 0u,
        manufacturerIDCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.unlockIdSize

    public operator fun component2(): MutPtr<UByte> = this.unlockId

    public operator fun component3(): UInt = this.manufacturerIDLength

    public operator fun component4(): Pwstr = this.manufacturerID

    public fun copy(unlockIdSize: UInt = this.unlockIdSize, unlockId: MutPtr<UByte> = this.unlockId, manufacturerIDLength: UInt = this.manufacturerIDLength, manufacturerID: Pwstr = this.manufacturerID): WldpDeviceSecurityInformation = WldpDeviceSecurityInformation(unlockIdSize = unlockIdSize, unlockIdCtorArg = unlockId, manufacturerIDLength = manufacturerIDLength, manufacturerIDCtorArg = manufacturerID)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WldpDeviceSecurityInformation) return false
        if (this.unlockIdSize != other.unlockIdSize) return false
        if (this.unlockId != other.unlockId) return false
        if (this.manufacturerIDLength != other.manufacturerIDLength) return false
        if (this.manufacturerID != other.manufacturerID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.unlockIdSize.hashCode()
        result = 31 * result + this.unlockId.hashCode()
        result = 31 * result + this.manufacturerIDLength.hashCode()
        result = 31 * result + this.manufacturerID.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            unlockIdSize: UInt = 0u,
            unlockId: MutPtr<UByte> = MutPtr(0L),
            manufacturerIDLength: UInt = 0u,
            manufacturerID: Pwstr = MutPtr(0L),
        ): WldpDeviceSecurityInformation =
            WldpDeviceSecurityInformation(
                unlockIdSize = unlockIdSize,
                unlockIdCtorArg = unlockId,
                manufacturerIDLength = manufacturerIDLength,
                manufacturerIDCtorArg = manufacturerID,
            )
    }
}

public class WldpHostInformation internal constructor(
    public var dwRevision: UInt,
    public var dwHostId: WldpHostId,
    szSourceCtorArg: Pcwstr,
    hSourceCtorArg: Handle,
) {
    public var szSource: Pcwstr = szSourceCtorArg
        internal set

    public var hSource: Handle = hSourceCtorArg
        internal set

    public constructor() : this(
        dwRevision = 0u,
        dwHostId = 0,
        szSourceCtorArg = ConstPtr(0L),
        hSourceCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwRevision

    public operator fun component2(): WldpHostId = this.dwHostId

    public operator fun component3(): Pcwstr = this.szSource

    public operator fun component4(): Handle = this.hSource

    public fun copy(dwRevision: UInt = this.dwRevision, dwHostId: WldpHostId = this.dwHostId, szSource: Pcwstr = this.szSource, hSource: Handle = this.hSource): WldpHostInformation = WldpHostInformation(dwRevision = dwRevision, dwHostId = dwHostId, szSourceCtorArg = szSource, hSourceCtorArg = hSource)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WldpHostInformation) return false
        if (this.dwRevision != other.dwRevision) return false
        if (this.dwHostId != other.dwHostId) return false
        if (this.szSource != other.szSource) return false
        if (this.hSource != other.hSource) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwRevision.hashCode()
        result = 31 * result + this.dwHostId.hashCode()
        result = 31 * result + this.szSource.hashCode()
        result = 31 * result + this.hSource.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwRevision: UInt = 0u,
            dwHostId: WldpHostId = 0,
            szSource: Pcwstr = ConstPtr(0L),
            hSource: Handle = MutPtr(0L),
        ): WldpHostInformation =
            WldpHostInformation(
                dwRevision = dwRevision,
                dwHostId = dwHostId,
                szSourceCtorArg = szSource,
                hSourceCtorArg = hSource,
            )
    }
}
