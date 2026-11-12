@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.httpserver

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.Sockaddr
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SockaddrStorage
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

public data class Http2SettingsLimitsParam(
    public var http2MaxSettingsPerFrame: UInt = 0u,
    public var http2MaxSettingsPerMinute: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Http2SettingsLimitsParam> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Http2SettingsLimitsParam> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Http2SettingsLimitsParam =
                    Http2SettingsLimitsParam(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Http2SettingsLimitsParam) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.http2MaxSettingsPerFrame)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.http2MaxSettingsPerMinute)
                }
            }
    }
}

public data class Http2WindowSizeParam(
    public var http2ReceiveWindowSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Http2WindowSizeParam> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Http2WindowSizeParam> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): Http2WindowSizeParam =
                    Http2WindowSizeParam(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Http2WindowSizeParam) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.http2ReceiveWindowSize)
                }
            }
    }
}

public data class HttpapiVersion(
    public var httpApiMajorVersion: UShort = 0u,
    public var httpApiMinorVersion: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpapiVersion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpapiVersion> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): HttpapiVersion =
                    HttpapiVersion(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: HttpapiVersion) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.httpApiMajorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.httpApiMinorVersion)
                }
            }
    }
}

public data class HttpBandwidthLimitInfo(
    public var flags: HttpPropertyFlags = HttpPropertyFlags(),
    public var maxBandwidth: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpBandwidthLimitInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpBandwidthLimitInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): HttpBandwidthLimitInfo =
                    HttpBandwidthLimitInfo(
                        (HttpPropertyFlags.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: HttpBandwidthLimitInfo) {
                    (HttpPropertyFlags.typeLayout()).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxBandwidth)
                }
            }
    }
}

public class HttpBindingInfo internal constructor(
    public var flags: HttpPropertyFlags,
    requestQueueHandleCtorArg: Handle,
) {
    public var requestQueueHandle: Handle = requestQueueHandleCtorArg
        internal set

    public constructor() : this(
        flags = HttpPropertyFlags(),
        requestQueueHandleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): HttpPropertyFlags = this.flags

    public operator fun component2(): Handle = this.requestQueueHandle

    public fun copy(flags: HttpPropertyFlags = this.flags, requestQueueHandle: Handle = this.requestQueueHandle): HttpBindingInfo = HttpBindingInfo(flags = flags, requestQueueHandleCtorArg = requestQueueHandle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpBindingInfo) return false
        if (this.flags != other.flags) return false
        if (this.requestQueueHandle != other.requestQueueHandle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.requestQueueHandle.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: HttpPropertyFlags = HttpPropertyFlags(),
            requestQueueHandle: Handle = MutPtr(0L),
        ): HttpBindingInfo =
            HttpBindingInfo(
                flags = flags,
                requestQueueHandleCtorArg = requestQueueHandle,
            )
    }
}

public data class HttpByteRange(
    public var startingOffset: ULong = 0uL,
    public var length: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpByteRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpByteRange> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): HttpByteRange =
                    HttpByteRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: HttpByteRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.startingOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.length)
                }
            }
    }
}

public data class HttpCachePolicy(
    public var policy: HttpCachePolicyType = 0,
    public var secondsToLive: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpCachePolicy> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpCachePolicy> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): HttpCachePolicy =
                    HttpCachePolicy(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: HttpCachePolicy) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.policy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.secondsToLive)
                }
            }
    }
}

public class HttpChannelBindInfo internal constructor(
    public var hardening: HttpAuthenticationHardeningLevels,
    public var flags: UInt,
    serviceNamesCtorArg: MutPtr<MutPtr<HttpServiceBindingBase>>,
    public var numberOfServiceNames: UInt,
) {
    public var serviceNames: MutPtr<MutPtr<HttpServiceBindingBase>> = serviceNamesCtorArg
        internal set

    public constructor() : this(
        hardening = 0,
        flags = 0u,
        serviceNamesCtorArg = MutPtr(0L),
        numberOfServiceNames = 0u,
    )

    public operator fun component1(): HttpAuthenticationHardeningLevels = this.hardening

    public operator fun component2(): UInt = this.flags

    public operator fun component3(): MutPtr<MutPtr<HttpServiceBindingBase>> = this.serviceNames

    public operator fun component4(): UInt = this.numberOfServiceNames

    public fun copy(hardening: HttpAuthenticationHardeningLevels = this.hardening, flags: UInt = this.flags, serviceNames: MutPtr<MutPtr<HttpServiceBindingBase>> = this.serviceNames, numberOfServiceNames: UInt = this.numberOfServiceNames): HttpChannelBindInfo = HttpChannelBindInfo(hardening = hardening, flags = flags, serviceNamesCtorArg = serviceNames, numberOfServiceNames = numberOfServiceNames)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpChannelBindInfo) return false
        if (this.hardening != other.hardening) return false
        if (this.flags != other.flags) return false
        if (this.serviceNames != other.serviceNames) return false
        if (this.numberOfServiceNames != other.numberOfServiceNames) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hardening.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.serviceNames.hashCode()
        result = 31 * result + this.numberOfServiceNames.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpChannelBindInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpChannelBindInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): HttpChannelBindInfo =
                    HttpChannelBindInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<HttpServiceBindingBase>>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: HttpChannelBindInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.hardening)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<HttpServiceBindingBase>>(64)
                    ).writeNative(addr + 8L, value.serviceNames)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.numberOfServiceNames)
                }
            }

        public operator fun invoke(
            hardening: HttpAuthenticationHardeningLevels = 0,
            flags: UInt = 0u,
            serviceNames: MutPtr<MutPtr<HttpServiceBindingBase>> = MutPtr(0L),
            numberOfServiceNames: UInt = 0u,
        ): HttpChannelBindInfo =
            HttpChannelBindInfo(
                hardening = hardening,
                flags = flags,
                serviceNamesCtorArg = serviceNames,
                numberOfServiceNames = numberOfServiceNames,
            )
    }
}

public data class HttpConnectionLimitInfo(
    public var flags: HttpPropertyFlags = HttpPropertyFlags(),
    public var maxConnections: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpConnectionLimitInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpConnectionLimitInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): HttpConnectionLimitInfo =
                    HttpConnectionLimitInfo(
                        (HttpPropertyFlags.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: HttpConnectionLimitInfo) {
                    (HttpPropertyFlags.typeLayout()).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxConnections)
                }
            }
    }
}

public class HttpCookedUrl internal constructor(
    public var fullUrlLength: UShort,
    public var hostLength: UShort,
    public var absPathLength: UShort,
    public var queryStringLength: UShort,
    pFullUrlCtorArg: Pcwstr,
    pHostCtorArg: Pcwstr,
    pAbsPathCtorArg: Pcwstr,
    pQueryStringCtorArg: Pcwstr,
) {
    public var pFullUrl: Pcwstr = pFullUrlCtorArg
        internal set

    public var pHost: Pcwstr = pHostCtorArg
        internal set

    public var pAbsPath: Pcwstr = pAbsPathCtorArg
        internal set

    public var pQueryString: Pcwstr = pQueryStringCtorArg
        internal set

    public constructor() : this(
        fullUrlLength = 0u,
        hostLength = 0u,
        absPathLength = 0u,
        queryStringLength = 0u,
        pFullUrlCtorArg = ConstPtr(0L),
        pHostCtorArg = ConstPtr(0L),
        pAbsPathCtorArg = ConstPtr(0L),
        pQueryStringCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UShort = this.fullUrlLength

    public operator fun component2(): UShort = this.hostLength

    public operator fun component3(): UShort = this.absPathLength

    public operator fun component4(): UShort = this.queryStringLength

    public operator fun component5(): Pcwstr = this.pFullUrl

    public operator fun component6(): Pcwstr = this.pHost

    public operator fun component7(): Pcwstr = this.pAbsPath

    public operator fun component8(): Pcwstr = this.pQueryString

    public fun copy(fullUrlLength: UShort = this.fullUrlLength, hostLength: UShort = this.hostLength, absPathLength: UShort = this.absPathLength, queryStringLength: UShort = this.queryStringLength, pFullUrl: Pcwstr = this.pFullUrl, pHost: Pcwstr = this.pHost, pAbsPath: Pcwstr = this.pAbsPath, pQueryString: Pcwstr = this.pQueryString): HttpCookedUrl = HttpCookedUrl(fullUrlLength = fullUrlLength, hostLength = hostLength, absPathLength = absPathLength, queryStringLength = queryStringLength, pFullUrlCtorArg = pFullUrl, pHostCtorArg = pHost, pAbsPathCtorArg = pAbsPath, pQueryStringCtorArg = pQueryString)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpCookedUrl) return false
        if (this.fullUrlLength != other.fullUrlLength) return false
        if (this.hostLength != other.hostLength) return false
        if (this.absPathLength != other.absPathLength) return false
        if (this.queryStringLength != other.queryStringLength) return false
        if (this.pFullUrl != other.pFullUrl) return false
        if (this.pHost != other.pHost) return false
        if (this.pAbsPath != other.pAbsPath) return false
        if (this.pQueryString != other.pQueryString) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fullUrlLength.hashCode()
        result = 31 * result + this.hostLength.hashCode()
        result = 31 * result + this.absPathLength.hashCode()
        result = 31 * result + this.queryStringLength.hashCode()
        result = 31 * result + this.pFullUrl.hashCode()
        result = 31 * result + this.pHost.hashCode()
        result = 31 * result + this.pAbsPath.hashCode()
        result = 31 * result + this.pQueryString.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            fullUrlLength: UShort = 0u,
            hostLength: UShort = 0u,
            absPathLength: UShort = 0u,
            queryStringLength: UShort = 0u,
            pFullUrl: Pcwstr = ConstPtr(0L),
            pHost: Pcwstr = ConstPtr(0L),
            pAbsPath: Pcwstr = ConstPtr(0L),
            pQueryString: Pcwstr = ConstPtr(0L),
        ): HttpCookedUrl =
            HttpCookedUrl(
                fullUrlLength = fullUrlLength,
                hostLength = hostLength,
                absPathLength = absPathLength,
                queryStringLength = queryStringLength,
                pFullUrlCtorArg = pFullUrl,
                pHostCtorArg = pHost,
                pAbsPathCtorArg = pAbsPath,
                pQueryStringCtorArg = pQueryString,
            )
    }
}

public class HttpCreateRequestQueuePropertyInfo internal constructor(
    public var propertyId: HttpCreateRequestQueuePropertyId,
    public var propertyInfoLength: UInt,
    propertyInfoCtorArg: MutPtr<CVoid>,
) {
    public var propertyInfo: MutPtr<CVoid> = propertyInfoCtorArg
        internal set

    public constructor() : this(
        propertyId = 0,
        propertyInfoLength = 0u,
        propertyInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): HttpCreateRequestQueuePropertyId = this.propertyId

    public operator fun component2(): UInt = this.propertyInfoLength

    public operator fun component3(): MutPtr<CVoid> = this.propertyInfo

    public fun copy(propertyId: HttpCreateRequestQueuePropertyId = this.propertyId, propertyInfoLength: UInt = this.propertyInfoLength, propertyInfo: MutPtr<CVoid> = this.propertyInfo): HttpCreateRequestQueuePropertyInfo = HttpCreateRequestQueuePropertyInfo(propertyId = propertyId, propertyInfoLength = propertyInfoLength, propertyInfoCtorArg = propertyInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpCreateRequestQueuePropertyInfo) return false
        if (this.propertyId != other.propertyId) return false
        if (this.propertyInfoLength != other.propertyInfoLength) return false
        if (this.propertyInfo != other.propertyInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.propertyId.hashCode()
        result = 31 * result + this.propertyInfoLength.hashCode()
        result = 31 * result + this.propertyInfo.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpCreateRequestQueuePropertyInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpCreateRequestQueuePropertyInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): HttpCreateRequestQueuePropertyInfo =
                    HttpCreateRequestQueuePropertyInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: HttpCreateRequestQueuePropertyInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.propertyId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.propertyInfoLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.propertyInfo)
                }
            }

        public operator fun invoke(
            propertyId: HttpCreateRequestQueuePropertyId = 0,
            propertyInfoLength: UInt = 0u,
            propertyInfo: MutPtr<CVoid> = MutPtr(0L),
        ): HttpCreateRequestQueuePropertyInfo =
            HttpCreateRequestQueuePropertyInfo(
                propertyId = propertyId,
                propertyInfoLength = propertyInfoLength,
                propertyInfoCtorArg = propertyInfo,
            )
    }
}

public data class HttpDataChunk(
    public var dataChunkType: HttpDataChunkType = 0,
    public var anonymous: HttpDataChunk0 = HttpDataChunk0(),
)

public data class HttpDataChunk0(
    public var fromMemory: HttpDataChunk00 = HttpDataChunk00(),
    public var fromFileHandle: HttpDataChunk01 = HttpDataChunk01(),
    public var fromFragmentCache: HttpDataChunk02 = HttpDataChunk02(),
    public var fromFragmentCacheEx: HttpDataChunk03 = HttpDataChunk03(),
    public var trailers: HttpDataChunk04 = HttpDataChunk04(),
)

public class HttpDataChunk01 internal constructor(
    public var byteRange: HttpByteRange,
    fileHandleCtorArg: Handle,
) {
    public var fileHandle: Handle = fileHandleCtorArg
        internal set

    public constructor() : this(
        byteRange = HttpByteRange(),
        fileHandleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): HttpByteRange = this.byteRange

    public operator fun component2(): Handle = this.fileHandle

    public fun copy(byteRange: HttpByteRange = this.byteRange, fileHandle: Handle = this.fileHandle): HttpDataChunk01 = HttpDataChunk01(byteRange = byteRange, fileHandleCtorArg = fileHandle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpDataChunk01) return false
        if (this.byteRange != other.byteRange) return false
        if (this.fileHandle != other.fileHandle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.byteRange.hashCode()
        result = 31 * result + this.fileHandle.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            byteRange: HttpByteRange = HttpByteRange(),
            fileHandle: Handle = MutPtr(0L),
        ): HttpDataChunk01 =
            HttpDataChunk01(
                byteRange = byteRange,
                fileHandleCtorArg = fileHandle,
            )
    }
}

public class HttpDataChunk03 internal constructor(
    public var byteRange: HttpByteRange,
    pFragmentNameCtorArg: Pcwstr,
) {
    public var pFragmentName: Pcwstr = pFragmentNameCtorArg
        internal set

    public constructor() : this(
        byteRange = HttpByteRange(),
        pFragmentNameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): HttpByteRange = this.byteRange

    public operator fun component2(): Pcwstr = this.pFragmentName

    public fun copy(byteRange: HttpByteRange = this.byteRange, pFragmentName: Pcwstr = this.pFragmentName): HttpDataChunk03 = HttpDataChunk03(byteRange = byteRange, pFragmentNameCtorArg = pFragmentName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpDataChunk03) return false
        if (this.byteRange != other.byteRange) return false
        if (this.pFragmentName != other.pFragmentName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.byteRange.hashCode()
        result = 31 * result + this.pFragmentName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            byteRange: HttpByteRange = HttpByteRange(),
            pFragmentName: Pcwstr = ConstPtr(0L),
        ): HttpDataChunk03 =
            HttpDataChunk03(
                byteRange = byteRange,
                pFragmentNameCtorArg = pFragmentName,
            )
    }
}

public class HttpDataChunk02 internal constructor(
    public var fragmentNameLength: UShort,
    pFragmentNameCtorArg: Pcwstr,
) {
    public var pFragmentName: Pcwstr = pFragmentNameCtorArg
        internal set

    public constructor() : this(
        fragmentNameLength = 0u,
        pFragmentNameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UShort = this.fragmentNameLength

    public operator fun component2(): Pcwstr = this.pFragmentName

    public fun copy(fragmentNameLength: UShort = this.fragmentNameLength, pFragmentName: Pcwstr = this.pFragmentName): HttpDataChunk02 = HttpDataChunk02(fragmentNameLength = fragmentNameLength, pFragmentNameCtorArg = pFragmentName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpDataChunk02) return false
        if (this.fragmentNameLength != other.fragmentNameLength) return false
        if (this.pFragmentName != other.pFragmentName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fragmentNameLength.hashCode()
        result = 31 * result + this.pFragmentName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            fragmentNameLength: UShort = 0u,
            pFragmentName: Pcwstr = ConstPtr(0L),
        ): HttpDataChunk02 =
            HttpDataChunk02(
                fragmentNameLength = fragmentNameLength,
                pFragmentNameCtorArg = pFragmentName,
            )
    }
}

public class HttpDataChunk00 internal constructor(
    pBufferCtorArg: MutPtr<CVoid>,
    public var bufferLength: UInt,
) {
    public var pBuffer: MutPtr<CVoid> = pBufferCtorArg
        internal set

    public constructor() : this(
        pBufferCtorArg = MutPtr(0L),
        bufferLength = 0u,
    )

    public operator fun component1(): MutPtr<CVoid> = this.pBuffer

    public operator fun component2(): UInt = this.bufferLength

    public fun copy(pBuffer: MutPtr<CVoid> = this.pBuffer, bufferLength: UInt = this.bufferLength): HttpDataChunk00 = HttpDataChunk00(pBufferCtorArg = pBuffer, bufferLength = bufferLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpDataChunk00) return false
        if (this.pBuffer != other.pBuffer) return false
        if (this.bufferLength != other.bufferLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pBuffer.hashCode()
        result = 31 * result + this.bufferLength.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpDataChunk00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpDataChunk00> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): HttpDataChunk00 =
                    HttpDataChunk00(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: HttpDataChunk00) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.pBuffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.bufferLength)
                }
            }

        public operator fun invoke(
            pBuffer: MutPtr<CVoid> = MutPtr(0L),
            bufferLength: UInt = 0u,
        ): HttpDataChunk00 =
            HttpDataChunk00(
                pBufferCtorArg = pBuffer,
                bufferLength = bufferLength,
            )
    }
}

public class HttpDataChunk04 internal constructor(
    public var trailerCount: UShort,
    pTrailersCtorArg: MutPtr<HttpUnknownHeader>,
) {
    public var pTrailers: MutPtr<HttpUnknownHeader> = pTrailersCtorArg
        internal set

    public constructor() : this(
        trailerCount = 0u,
        pTrailersCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.trailerCount

    public operator fun component2(): MutPtr<HttpUnknownHeader> = this.pTrailers

    public fun copy(trailerCount: UShort = this.trailerCount, pTrailers: MutPtr<HttpUnknownHeader> = this.pTrailers): HttpDataChunk04 = HttpDataChunk04(trailerCount = trailerCount, pTrailersCtorArg = pTrailers)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpDataChunk04) return false
        if (this.trailerCount != other.trailerCount) return false
        if (this.pTrailers != other.pTrailers) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.trailerCount.hashCode()
        result = 31 * result + this.pTrailers.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpDataChunk04> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpDataChunk04> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): HttpDataChunk04 =
                    HttpDataChunk04(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<HttpUnknownHeader>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: HttpDataChunk04) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.trailerCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<HttpUnknownHeader>(64)
                    ).writeNative(addr + 8L, value.pTrailers)
                }
            }

        public operator fun invoke(
            trailerCount: UShort = 0u,
            pTrailers: MutPtr<HttpUnknownHeader> = MutPtr(0L),
        ): HttpDataChunk04 =
            HttpDataChunk04(
                trailerCount = trailerCount,
                pTrailersCtorArg = pTrailers,
            )
    }
}

public class HttpDelegateRequestPropertyInfo internal constructor(
    public var propertyId: HttpDelegateRequestPropertyId,
    public var propertyInfoLength: UInt,
    propertyInfoCtorArg: MutPtr<CVoid>,
) {
    public var propertyInfo: MutPtr<CVoid> = propertyInfoCtorArg
        internal set

    public constructor() : this(
        propertyId = 0,
        propertyInfoLength = 0u,
        propertyInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): HttpDelegateRequestPropertyId = this.propertyId

    public operator fun component2(): UInt = this.propertyInfoLength

    public operator fun component3(): MutPtr<CVoid> = this.propertyInfo

    public fun copy(propertyId: HttpDelegateRequestPropertyId = this.propertyId, propertyInfoLength: UInt = this.propertyInfoLength, propertyInfo: MutPtr<CVoid> = this.propertyInfo): HttpDelegateRequestPropertyInfo = HttpDelegateRequestPropertyInfo(propertyId = propertyId, propertyInfoLength = propertyInfoLength, propertyInfoCtorArg = propertyInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpDelegateRequestPropertyInfo) return false
        if (this.propertyId != other.propertyId) return false
        if (this.propertyInfoLength != other.propertyInfoLength) return false
        if (this.propertyInfo != other.propertyInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.propertyId.hashCode()
        result = 31 * result + this.propertyInfoLength.hashCode()
        result = 31 * result + this.propertyInfo.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpDelegateRequestPropertyInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpDelegateRequestPropertyInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): HttpDelegateRequestPropertyInfo =
                    HttpDelegateRequestPropertyInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: HttpDelegateRequestPropertyInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.propertyId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.propertyInfoLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.propertyInfo)
                }
            }

        public operator fun invoke(
            propertyId: HttpDelegateRequestPropertyId = 0,
            propertyInfoLength: UInt = 0u,
            propertyInfo: MutPtr<CVoid> = MutPtr(0L),
        ): HttpDelegateRequestPropertyInfo =
            HttpDelegateRequestPropertyInfo(
                propertyId = propertyId,
                propertyInfoLength = propertyInfoLength,
                propertyInfoCtorArg = propertyInfo,
            )
    }
}

public class HttpErrorHeadersParam internal constructor(
    public var statusCode: UShort,
    public var headerCount: UShort,
    headersCtorArg: MutPtr<HttpUnknownHeader>,
) {
    public var headers: MutPtr<HttpUnknownHeader> = headersCtorArg
        internal set

    public constructor() : this(
        statusCode = 0u,
        headerCount = 0u,
        headersCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.statusCode

    public operator fun component2(): UShort = this.headerCount

    public operator fun component3(): MutPtr<HttpUnknownHeader> = this.headers

    public fun copy(statusCode: UShort = this.statusCode, headerCount: UShort = this.headerCount, headers: MutPtr<HttpUnknownHeader> = this.headers): HttpErrorHeadersParam = HttpErrorHeadersParam(statusCode = statusCode, headerCount = headerCount, headersCtorArg = headers)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpErrorHeadersParam) return false
        if (this.statusCode != other.statusCode) return false
        if (this.headerCount != other.headerCount) return false
        if (this.headers != other.headers) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.statusCode.hashCode()
        result = 31 * result + this.headerCount.hashCode()
        result = 31 * result + this.headers.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpErrorHeadersParam> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpErrorHeadersParam> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): HttpErrorHeadersParam =
                    HttpErrorHeadersParam(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<HttpUnknownHeader>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: HttpErrorHeadersParam) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.statusCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.headerCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<HttpUnknownHeader>(64)
                    ).writeNative(addr + 8L, value.headers)
                }
            }

        public operator fun invoke(
            statusCode: UShort = 0u,
            headerCount: UShort = 0u,
            headers: MutPtr<HttpUnknownHeader> = MutPtr(0L),
        ): HttpErrorHeadersParam =
            HttpErrorHeadersParam(
                statusCode = statusCode,
                headerCount = headerCount,
                headersCtorArg = headers,
            )
    }
}

public data class HttpFlowrateInfo(
    public var flags: HttpPropertyFlags = HttpPropertyFlags(),
    public var maxBandwidth: UInt = 0u,
    public var maxPeakBandwidth: UInt = 0u,
    public var burstSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpFlowrateInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpFlowrateInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): HttpFlowrateInfo =
                    HttpFlowrateInfo(
                        (HttpPropertyFlags.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: HttpFlowrateInfo) {
                    (HttpPropertyFlags.typeLayout()).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxBandwidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.maxPeakBandwidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.burstSize)
                }
            }
    }
}

public class HttpKnownHeader internal constructor(
    public var rawValueLength: UShort,
    pRawValueCtorArg: Pcstr,
) {
    public var pRawValue: Pcstr = pRawValueCtorArg
        internal set

    public constructor() : this(
        rawValueLength = 0u,
        pRawValueCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UShort = this.rawValueLength

    public operator fun component2(): Pcstr = this.pRawValue

    public fun copy(rawValueLength: UShort = this.rawValueLength, pRawValue: Pcstr = this.pRawValue): HttpKnownHeader = HttpKnownHeader(rawValueLength = rawValueLength, pRawValueCtorArg = pRawValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpKnownHeader) return false
        if (this.rawValueLength != other.rawValueLength) return false
        if (this.pRawValue != other.pRawValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rawValueLength.hashCode()
        result = 31 * result + this.pRawValue.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            rawValueLength: UShort = 0u,
            pRawValue: Pcstr = ConstPtr(0L),
        ): HttpKnownHeader =
            HttpKnownHeader(
                rawValueLength = rawValueLength,
                pRawValueCtorArg = pRawValue,
            )
    }
}

public data class HttpListenEndpointInfo(
    public var flags: HttpPropertyFlags = HttpPropertyFlags(),
    public var enableSharing: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpListenEndpointInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpListenEndpointInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): HttpListenEndpointInfo =
                    HttpListenEndpointInfo(
                        (HttpPropertyFlags.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: HttpListenEndpointInfo) {
                    (HttpPropertyFlags.typeLayout()).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 4L, value.enableSharing)
                }
            }
    }
}

public class HttpLoggingInfo internal constructor(
    public var flags: HttpPropertyFlags,
    public var loggingFlags: UInt,
    softwareNameCtorArg: Pcwstr,
    public var softwareNameLength: UShort,
    public var directoryNameLength: UShort,
    directoryNameCtorArg: Pcwstr,
    public var format: HttpLoggingType,
    public var fields: UInt,
    pExtFieldsCtorArg: MutPtr<CVoid>,
    public var numOfExtFields: UShort,
    public var maxRecordSize: UShort,
    public var rolloverType: HttpLoggingRolloverType,
    public var rolloverSize: UInt,
    pSecurityDescriptorCtorArg: PsecurityDescriptor,
) {
    public var softwareName: Pcwstr = softwareNameCtorArg
        internal set

    public var directoryName: Pcwstr = directoryNameCtorArg
        internal set

    public var pExtFields: MutPtr<CVoid> = pExtFieldsCtorArg
        internal set

    public var pSecurityDescriptor: PsecurityDescriptor = pSecurityDescriptorCtorArg
        internal set

    public constructor() : this(
        flags = HttpPropertyFlags(),
        loggingFlags = 0u,
        softwareNameCtorArg = ConstPtr(0L),
        softwareNameLength = 0u,
        directoryNameLength = 0u,
        directoryNameCtorArg = ConstPtr(0L),
        format = 0,
        fields = 0u,
        pExtFieldsCtorArg = MutPtr(0L),
        numOfExtFields = 0u,
        maxRecordSize = 0u,
        rolloverType = 0,
        rolloverSize = 0u,
        pSecurityDescriptorCtorArg = MutPtr(0L),
    )

    public operator fun component1(): HttpPropertyFlags = this.flags

    public operator fun component2(): UInt = this.loggingFlags

    public operator fun component3(): Pcwstr = this.softwareName

    public operator fun component4(): UShort = this.softwareNameLength

    public operator fun component5(): UShort = this.directoryNameLength

    public operator fun component6(): Pcwstr = this.directoryName

    public operator fun component7(): HttpLoggingType = this.format

    public operator fun component8(): UInt = this.fields

    public operator fun component9(): MutPtr<CVoid> = this.pExtFields

    public operator fun component10(): UShort = this.numOfExtFields

    public operator fun component11(): UShort = this.maxRecordSize

    public operator fun component12(): HttpLoggingRolloverType = this.rolloverType

    public operator fun component13(): UInt = this.rolloverSize

    public operator fun component14(): PsecurityDescriptor = this.pSecurityDescriptor

    public fun copy(flags: HttpPropertyFlags = this.flags, loggingFlags: UInt = this.loggingFlags, softwareName: Pcwstr = this.softwareName, softwareNameLength: UShort = this.softwareNameLength, directoryNameLength: UShort = this.directoryNameLength, directoryName: Pcwstr = this.directoryName, format: HttpLoggingType = this.format, fields: UInt = this.fields, pExtFields: MutPtr<CVoid> = this.pExtFields, numOfExtFields: UShort = this.numOfExtFields, maxRecordSize: UShort = this.maxRecordSize, rolloverType: HttpLoggingRolloverType = this.rolloverType, rolloverSize: UInt = this.rolloverSize, pSecurityDescriptor: PsecurityDescriptor = this.pSecurityDescriptor): HttpLoggingInfo = HttpLoggingInfo(flags = flags, loggingFlags = loggingFlags, softwareNameCtorArg = softwareName, softwareNameLength = softwareNameLength, directoryNameLength = directoryNameLength, directoryNameCtorArg = directoryName, format = format, fields = fields, pExtFieldsCtorArg = pExtFields, numOfExtFields = numOfExtFields, maxRecordSize = maxRecordSize, rolloverType = rolloverType, rolloverSize = rolloverSize, pSecurityDescriptorCtorArg = pSecurityDescriptor)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpLoggingInfo) return false
        if (this.flags != other.flags) return false
        if (this.loggingFlags != other.loggingFlags) return false
        if (this.softwareName != other.softwareName) return false
        if (this.softwareNameLength != other.softwareNameLength) return false
        if (this.directoryNameLength != other.directoryNameLength) return false
        if (this.directoryName != other.directoryName) return false
        if (this.format != other.format) return false
        if (this.fields != other.fields) return false
        if (this.pExtFields != other.pExtFields) return false
        if (this.numOfExtFields != other.numOfExtFields) return false
        if (this.maxRecordSize != other.maxRecordSize) return false
        if (this.rolloverType != other.rolloverType) return false
        if (this.rolloverSize != other.rolloverSize) return false
        if (this.pSecurityDescriptor != other.pSecurityDescriptor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.loggingFlags.hashCode()
        result = 31 * result + this.softwareName.hashCode()
        result = 31 * result + this.softwareNameLength.hashCode()
        result = 31 * result + this.directoryNameLength.hashCode()
        result = 31 * result + this.directoryName.hashCode()
        result = 31 * result + this.format.hashCode()
        result = 31 * result + this.fields.hashCode()
        result = 31 * result + this.pExtFields.hashCode()
        result = 31 * result + this.numOfExtFields.hashCode()
        result = 31 * result + this.maxRecordSize.hashCode()
        result = 31 * result + this.rolloverType.hashCode()
        result = 31 * result + this.rolloverSize.hashCode()
        result = 31 * result + this.pSecurityDescriptor.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: HttpPropertyFlags = HttpPropertyFlags(),
            loggingFlags: UInt = 0u,
            softwareName: Pcwstr = ConstPtr(0L),
            softwareNameLength: UShort = 0u,
            directoryNameLength: UShort = 0u,
            directoryName: Pcwstr = ConstPtr(0L),
            format: HttpLoggingType = 0,
            fields: UInt = 0u,
            pExtFields: MutPtr<CVoid> = MutPtr(0L),
            numOfExtFields: UShort = 0u,
            maxRecordSize: UShort = 0u,
            rolloverType: HttpLoggingRolloverType = 0,
            rolloverSize: UInt = 0u,
            pSecurityDescriptor: PsecurityDescriptor = MutPtr(0L),
        ): HttpLoggingInfo =
            HttpLoggingInfo(
                flags = flags,
                loggingFlags = loggingFlags,
                softwareNameCtorArg = softwareName,
                softwareNameLength = softwareNameLength,
                directoryNameLength = directoryNameLength,
                directoryNameCtorArg = directoryName,
                format = format,
                fields = fields,
                pExtFieldsCtorArg = pExtFields,
                numOfExtFields = numOfExtFields,
                maxRecordSize = maxRecordSize,
                rolloverType = rolloverType,
                rolloverSize = rolloverSize,
                pSecurityDescriptorCtorArg = pSecurityDescriptor,
            )
    }
}

public data class HttpLogData(
    public var type: HttpLogDataType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpLogData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpLogData> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): HttpLogData =
                    HttpLogData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: HttpLogData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.type)
                }
            }
    }
}

public class HttpLogFieldsData internal constructor(
    public var base: HttpLogData,
    public var userNameLength: UShort,
    public var uriStemLength: UShort,
    public var clientIpLength: UShort,
    public var serverNameLength: UShort,
    public var serviceNameLength: UShort,
    public var serverIpLength: UShort,
    public var methodLength: UShort,
    public var uriQueryLength: UShort,
    public var hostLength: UShort,
    public var userAgentLength: UShort,
    public var cookieLength: UShort,
    public var referrerLength: UShort,
    userNameCtorArg: Pwstr,
    uriStemCtorArg: Pwstr,
    clientIpCtorArg: Pstr,
    serverNameCtorArg: Pstr,
    serviceNameCtorArg: Pstr,
    serverIpCtorArg: Pstr,
    methodCtorArg: Pstr,
    uriQueryCtorArg: Pstr,
    hostCtorArg: Pstr,
    userAgentCtorArg: Pstr,
    cookieCtorArg: Pstr,
    referrerCtorArg: Pstr,
    public var serverPort: UShort,
    public var protocolStatus: UShort,
    public var win32Status: UInt,
    public var methodNum: HttpVerb,
    public var subStatus: UShort,
) {
    public var userName: Pwstr = userNameCtorArg
        internal set

    public var uriStem: Pwstr = uriStemCtorArg
        internal set

    public var clientIp: Pstr = clientIpCtorArg
        internal set

    public var serverName: Pstr = serverNameCtorArg
        internal set

    public var serviceName: Pstr = serviceNameCtorArg
        internal set

    public var serverIp: Pstr = serverIpCtorArg
        internal set

    public var method: Pstr = methodCtorArg
        internal set

    public var uriQuery: Pstr = uriQueryCtorArg
        internal set

    public var host: Pstr = hostCtorArg
        internal set

    public var userAgent: Pstr = userAgentCtorArg
        internal set

    public var cookie: Pstr = cookieCtorArg
        internal set

    public var referrer: Pstr = referrerCtorArg
        internal set

    public constructor() : this(
        base = HttpLogData(),
        userNameLength = 0u,
        uriStemLength = 0u,
        clientIpLength = 0u,
        serverNameLength = 0u,
        serviceNameLength = 0u,
        serverIpLength = 0u,
        methodLength = 0u,
        uriQueryLength = 0u,
        hostLength = 0u,
        userAgentLength = 0u,
        cookieLength = 0u,
        referrerLength = 0u,
        userNameCtorArg = MutPtr(0L),
        uriStemCtorArg = MutPtr(0L),
        clientIpCtorArg = MutPtr(0L),
        serverNameCtorArg = MutPtr(0L),
        serviceNameCtorArg = MutPtr(0L),
        serverIpCtorArg = MutPtr(0L),
        methodCtorArg = MutPtr(0L),
        uriQueryCtorArg = MutPtr(0L),
        hostCtorArg = MutPtr(0L),
        userAgentCtorArg = MutPtr(0L),
        cookieCtorArg = MutPtr(0L),
        referrerCtorArg = MutPtr(0L),
        serverPort = 0u,
        protocolStatus = 0u,
        win32Status = 0u,
        methodNum = 0,
        subStatus = 0u,
    )

    public companion object {
        public operator fun invoke(
            base: HttpLogData = HttpLogData(),
            userNameLength: UShort = 0u,
            uriStemLength: UShort = 0u,
            clientIpLength: UShort = 0u,
            serverNameLength: UShort = 0u,
            serviceNameLength: UShort = 0u,
            serverIpLength: UShort = 0u,
            methodLength: UShort = 0u,
            uriQueryLength: UShort = 0u,
            hostLength: UShort = 0u,
            userAgentLength: UShort = 0u,
            cookieLength: UShort = 0u,
            referrerLength: UShort = 0u,
            userName: Pwstr = MutPtr(0L),
            uriStem: Pwstr = MutPtr(0L),
            clientIp: Pstr = MutPtr(0L),
            serverName: Pstr = MutPtr(0L),
            serviceName: Pstr = MutPtr(0L),
            serverIp: Pstr = MutPtr(0L),
            method: Pstr = MutPtr(0L),
            uriQuery: Pstr = MutPtr(0L),
            host: Pstr = MutPtr(0L),
            userAgent: Pstr = MutPtr(0L),
            cookie: Pstr = MutPtr(0L),
            referrer: Pstr = MutPtr(0L),
            serverPort: UShort = 0u,
            protocolStatus: UShort = 0u,
            win32Status: UInt = 0u,
            methodNum: HttpVerb = 0,
            subStatus: UShort = 0u,
        ): HttpLogFieldsData =
            HttpLogFieldsData(
                base = base,
                userNameLength = userNameLength,
                uriStemLength = uriStemLength,
                clientIpLength = clientIpLength,
                serverNameLength = serverNameLength,
                serviceNameLength = serviceNameLength,
                serverIpLength = serverIpLength,
                methodLength = methodLength,
                uriQueryLength = uriQueryLength,
                hostLength = hostLength,
                userAgentLength = userAgentLength,
                cookieLength = cookieLength,
                referrerLength = referrerLength,
                userNameCtorArg = userName,
                uriStemCtorArg = uriStem,
                clientIpCtorArg = clientIp,
                serverNameCtorArg = serverName,
                serviceNameCtorArg = serviceName,
                serverIpCtorArg = serverIp,
                methodCtorArg = method,
                uriQueryCtorArg = uriQuery,
                hostCtorArg = host,
                userAgentCtorArg = userAgent,
                cookieCtorArg = cookie,
                referrerCtorArg = referrer,
                serverPort = serverPort,
                protocolStatus = protocolStatus,
                win32Status = win32Status,
                methodNum = methodNum,
                subStatus = subStatus,
            )
    }
}

public class HttpMultipleKnownHeaders internal constructor(
    public var headerId: HttpHeaderId,
    public var flags: UInt,
    public var knownHeaderCount: UShort,
    knownHeadersCtorArg: MutPtr<HttpKnownHeader>,
) {
    public var knownHeaders: MutPtr<HttpKnownHeader> = knownHeadersCtorArg
        internal set

    public constructor() : this(
        headerId = 0,
        flags = 0u,
        knownHeaderCount = 0u,
        knownHeadersCtorArg = MutPtr(0L),
    )

    public operator fun component1(): HttpHeaderId = this.headerId

    public operator fun component2(): UInt = this.flags

    public operator fun component3(): UShort = this.knownHeaderCount

    public operator fun component4(): MutPtr<HttpKnownHeader> = this.knownHeaders

    public fun copy(headerId: HttpHeaderId = this.headerId, flags: UInt = this.flags, knownHeaderCount: UShort = this.knownHeaderCount, knownHeaders: MutPtr<HttpKnownHeader> = this.knownHeaders): HttpMultipleKnownHeaders = HttpMultipleKnownHeaders(headerId = headerId, flags = flags, knownHeaderCount = knownHeaderCount, knownHeadersCtorArg = knownHeaders)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpMultipleKnownHeaders) return false
        if (this.headerId != other.headerId) return false
        if (this.flags != other.flags) return false
        if (this.knownHeaderCount != other.knownHeaderCount) return false
        if (this.knownHeaders != other.knownHeaders) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.headerId.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.knownHeaderCount.hashCode()
        result = 31 * result + this.knownHeaders.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpMultipleKnownHeaders> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpMultipleKnownHeaders> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): HttpMultipleKnownHeaders =
                    HttpMultipleKnownHeaders(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<HttpKnownHeader>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: HttpMultipleKnownHeaders) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.headerId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.knownHeaderCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<HttpKnownHeader>(64)
                    ).writeNative(addr + 16L, value.knownHeaders)
                }
            }

        public operator fun invoke(
            headerId: HttpHeaderId = 0,
            flags: UInt = 0u,
            knownHeaderCount: UShort = 0u,
            knownHeaders: MutPtr<HttpKnownHeader> = MutPtr(0L),
        ): HttpMultipleKnownHeaders =
            HttpMultipleKnownHeaders(
                headerId = headerId,
                flags = flags,
                knownHeaderCount = knownHeaderCount,
                knownHeadersCtorArg = knownHeaders,
            )
    }
}

public class HttpPerformanceParam internal constructor(
    public var type: HttpPerformanceParamType,
    public var bufferSize: UInt,
    bufferCtorArg: MutPtr<CVoid>,
) {
    public var buffer: MutPtr<CVoid> = bufferCtorArg
        internal set

    public constructor() : this(
        type = 0,
        bufferSize = 0u,
        bufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): HttpPerformanceParamType = this.type

    public operator fun component2(): UInt = this.bufferSize

    public operator fun component3(): MutPtr<CVoid> = this.buffer

    public fun copy(type: HttpPerformanceParamType = this.type, bufferSize: UInt = this.bufferSize, buffer: MutPtr<CVoid> = this.buffer): HttpPerformanceParam = HttpPerformanceParam(type = type, bufferSize = bufferSize, bufferCtorArg = buffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpPerformanceParam) return false
        if (this.type != other.type) return false
        if (this.bufferSize != other.bufferSize) return false
        if (this.buffer != other.buffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.bufferSize.hashCode()
        result = 31 * result + this.buffer.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpPerformanceParam> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpPerformanceParam> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): HttpPerformanceParam =
                    HttpPerformanceParam(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: HttpPerformanceParam) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bufferSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.buffer)
                }
            }

        public operator fun invoke(
            type: HttpPerformanceParamType = 0,
            bufferSize: UInt = 0u,
            buffer: MutPtr<CVoid> = MutPtr(0L),
        ): HttpPerformanceParam =
            HttpPerformanceParam(
                type = type,
                bufferSize = bufferSize,
                bufferCtorArg = buffer,
            )
    }
}

public data class HttpPropertyFlags(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpPropertyFlags> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpPropertyFlags> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): HttpPropertyFlags =
                    HttpPropertyFlags(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: HttpPropertyFlags) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class HttpProtectionLevelInfo(
    public var flags: HttpPropertyFlags = HttpPropertyFlags(),
    public var level: HttpProtectionLevelType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpProtectionLevelInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpProtectionLevelInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): HttpProtectionLevelInfo =
                    HttpProtectionLevelInfo(
                        (HttpPropertyFlags.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: HttpProtectionLevelInfo) {
                    (HttpPropertyFlags.typeLayout()).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.level)
                }
            }
    }
}

public class HttpQosSettingInfo internal constructor(
    public var qosType: HttpQosSettingType,
    qosSettingCtorArg: MutPtr<CVoid>,
) {
    public var qosSetting: MutPtr<CVoid> = qosSettingCtorArg
        internal set

    public constructor() : this(
        qosType = 0,
        qosSettingCtorArg = MutPtr(0L),
    )

    public operator fun component1(): HttpQosSettingType = this.qosType

    public operator fun component2(): MutPtr<CVoid> = this.qosSetting

    public fun copy(qosType: HttpQosSettingType = this.qosType, qosSetting: MutPtr<CVoid> = this.qosSetting): HttpQosSettingInfo = HttpQosSettingInfo(qosType = qosType, qosSettingCtorArg = qosSetting)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpQosSettingInfo) return false
        if (this.qosType != other.qosType) return false
        if (this.qosSetting != other.qosSetting) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.qosType.hashCode()
        result = 31 * result + this.qosSetting.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpQosSettingInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpQosSettingInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): HttpQosSettingInfo =
                    HttpQosSettingInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: HttpQosSettingInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.qosType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.qosSetting)
                }
            }

        public operator fun invoke(
            qosType: HttpQosSettingType = 0,
            qosSetting: MutPtr<CVoid> = MutPtr(0L),
        ): HttpQosSettingInfo =
            HttpQosSettingInfo(
                qosType = qosType,
                qosSettingCtorArg = qosSetting,
            )
    }
}

public data class HttpQueryRequestQualifierQuic(
    public var freshness: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpQueryRequestQualifierQuic> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpQueryRequestQualifierQuic> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): HttpQueryRequestQualifierQuic =
                    HttpQueryRequestQualifierQuic(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: HttpQueryRequestQualifierQuic) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.freshness)
                }
            }
    }
}

public data class HttpQueryRequestQualifierTcp(
    public var freshness: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpQueryRequestQualifierTcp> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpQueryRequestQualifierTcp> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): HttpQueryRequestQualifierTcp =
                    HttpQueryRequestQualifierTcp(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: HttpQueryRequestQualifierTcp) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.freshness)
                }
            }
    }
}

public data class HttpQuicApiTimings(
    public var connectionTimings: HttpQuicConnectionApiTimings = HttpQuicConnectionApiTimings(),
    public var streamTimings: HttpQuicStreamApiTimings = HttpQuicStreamApiTimings(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpQuicApiTimings> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpQuicApiTimings> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 384L
                override fun readNative(addr: Long): HttpQuicApiTimings =
                    HttpQuicApiTimings(
                        (HttpQuicConnectionApiTimings.typeLayout()).readNative(addr),
                        (HttpQuicStreamApiTimings.typeLayout()).readNative(addr + 240L),
                    )
                override fun writeNative(addr: Long, value: HttpQuicApiTimings) {
                    (HttpQuicConnectionApiTimings.typeLayout()).writeNative(addr, value.connectionTimings)
                    (HttpQuicStreamApiTimings.typeLayout()).writeNative(addr + 240L, value.streamTimings)
                }
            }
    }
}

public data class HttpQuicConnectionApiTimings(
    public var openTime: ULong = 0uL,
    public var closeTime: ULong = 0uL,
    public var startTime: ULong = 0uL,
    public var shutdownTime: ULong = 0uL,
    public var secConfigCreateTime: ULong = 0uL,
    public var secConfigDeleteTime: ULong = 0uL,
    public var getParamCount: ULong = 0uL,
    public var getParamSum: ULong = 0uL,
    public var setParamCount: ULong = 0uL,
    public var setParamSum: ULong = 0uL,
    public var setCallbackHandlerCount: ULong = 0uL,
    public var setCallbackHandlerSum: ULong = 0uL,
    public var controlStreamTimings: HttpQuicStreamApiTimings = HttpQuicStreamApiTimings(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpQuicConnectionApiTimings> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpQuicConnectionApiTimings> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 240L
                override fun readNative(addr: Long): HttpQuicConnectionApiTimings =
                    HttpQuicConnectionApiTimings(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (HttpQuicStreamApiTimings.typeLayout()).readNative(addr + 96L),
                    )
                override fun writeNative(addr: Long, value: HttpQuicConnectionApiTimings) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.openTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.closeTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.startTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.shutdownTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.secConfigCreateTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.secConfigDeleteTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.getParamCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.getParamSum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.setParamCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.setParamSum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.setCallbackHandlerCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.setCallbackHandlerSum)
                    (HttpQuicStreamApiTimings.typeLayout()).writeNative(addr + 96L, value.controlStreamTimings)
                }
            }
    }
}

public class HttpQuicStreamApiTimings(
    public var openCount: ULong = 0uL,
    public var openSum: ULong = 0uL,
    public var closeCount: ULong = 0uL,
    public var closeSum: ULong = 0uL,
    public var startCount: ULong = 0uL,
    public var startSum: ULong = 0uL,
    public var shutdownCount: ULong = 0uL,
    public var shutdownSum: ULong = 0uL,
    public var sendCount: ULong = 0uL,
    public var sendSum: ULong = 0uL,
    public var receiveSetEnabledCount: ULong = 0uL,
    public var receiveSetEnabledSum: ULong = 0uL,
    public var getParamCount: ULong = 0uL,
    public var getParamSum: ULong = 0uL,
    public var setParamCount: ULong = 0uL,
    public var setParamSum: ULong = 0uL,
    public var setCallbackHandlerCount: ULong = 0uL,
    public var setCallbackHandlerSum: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpQuicStreamApiTimings> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpQuicStreamApiTimings> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 144L
                override fun readNative(addr: Long): HttpQuicStreamApiTimings =
                    HttpQuicStreamApiTimings(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 136L),
                    )
                override fun writeNative(addr: Long, value: HttpQuicStreamApiTimings) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.openCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.openSum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.closeCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.closeSum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.startCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.startSum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.shutdownCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.shutdownSum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.sendCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.sendSum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.receiveSetEnabledCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.receiveSetEnabledSum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.getParamCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.getParamSum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 112L, value.setParamCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 120L, value.setParamSum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 128L, value.setCallbackHandlerCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 136L, value.setCallbackHandlerSum)
                }
            }
    }
}

public data class HttpQuicStreamRequestStats(
    public var streamWaitStart: ULong = 0uL,
    public var streamWaitEnd: ULong = 0uL,
    public var requestHeadersCompressionStart: ULong = 0uL,
    public var requestHeadersCompressionEnd: ULong = 0uL,
    public var responseHeadersDecompressionStart: ULong = 0uL,
    public var responseHeadersDecompressionEnd: ULong = 0uL,
    public var requestHeadersCompressedSize: ULong = 0uL,
    public var responseHeadersCompressedSize: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpQuicStreamRequestStats> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpQuicStreamRequestStats> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): HttpQuicStreamRequestStats =
                    HttpQuicStreamRequestStats(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: HttpQuicStreamRequestStats) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.streamWaitStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.streamWaitEnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.requestHeadersCompressionStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.requestHeadersCompressionEnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.responseHeadersDecompressionStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.responseHeadersDecompressionEnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.requestHeadersCompressedSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.responseHeadersCompressedSize)
                }
            }
    }
}

public class HttpRequestAuthInfo internal constructor(
    public var authStatus: HttpAuthStatus,
    public var secStatus: Hresult,
    public var flags: UInt,
    public var authType: HttpRequestAuthType,
    accessTokenCtorArg: Handle,
    public var contextAttributes: UInt,
    public var packedContextLength: UInt,
    public var packedContextType: UInt,
    packedContextCtorArg: MutPtr<CVoid>,
    public var mutualAuthDataLength: UInt,
    pMutualAuthDataCtorArg: Pstr,
    public var packageNameLength: UShort,
    pPackageNameCtorArg: Pwstr,
) {
    public var accessToken: Handle = accessTokenCtorArg
        internal set

    public var packedContext: MutPtr<CVoid> = packedContextCtorArg
        internal set

    public var pMutualAuthData: Pstr = pMutualAuthDataCtorArg
        internal set

    public var pPackageName: Pwstr = pPackageNameCtorArg
        internal set

    public constructor() : this(
        authStatus = 0,
        secStatus = 0,
        flags = 0u,
        authType = 0,
        accessTokenCtorArg = MutPtr(0L),
        contextAttributes = 0u,
        packedContextLength = 0u,
        packedContextType = 0u,
        packedContextCtorArg = MutPtr(0L),
        mutualAuthDataLength = 0u,
        pMutualAuthDataCtorArg = MutPtr(0L),
        packageNameLength = 0u,
        pPackageNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): HttpAuthStatus = this.authStatus

    public operator fun component2(): Hresult = this.secStatus

    public operator fun component3(): UInt = this.flags

    public operator fun component4(): HttpRequestAuthType = this.authType

    public operator fun component5(): Handle = this.accessToken

    public operator fun component6(): UInt = this.contextAttributes

    public operator fun component7(): UInt = this.packedContextLength

    public operator fun component8(): UInt = this.packedContextType

    public operator fun component9(): MutPtr<CVoid> = this.packedContext

    public operator fun component10(): UInt = this.mutualAuthDataLength

    public operator fun component11(): Pstr = this.pMutualAuthData

    public operator fun component12(): UShort = this.packageNameLength

    public operator fun component13(): Pwstr = this.pPackageName

    public fun copy(authStatus: HttpAuthStatus = this.authStatus, secStatus: Hresult = this.secStatus, flags: UInt = this.flags, authType: HttpRequestAuthType = this.authType, accessToken: Handle = this.accessToken, contextAttributes: UInt = this.contextAttributes, packedContextLength: UInt = this.packedContextLength, packedContextType: UInt = this.packedContextType, packedContext: MutPtr<CVoid> = this.packedContext, mutualAuthDataLength: UInt = this.mutualAuthDataLength, pMutualAuthData: Pstr = this.pMutualAuthData, packageNameLength: UShort = this.packageNameLength, pPackageName: Pwstr = this.pPackageName): HttpRequestAuthInfo = HttpRequestAuthInfo(authStatus = authStatus, secStatus = secStatus, flags = flags, authType = authType, accessTokenCtorArg = accessToken, contextAttributes = contextAttributes, packedContextLength = packedContextLength, packedContextType = packedContextType, packedContextCtorArg = packedContext, mutualAuthDataLength = mutualAuthDataLength, pMutualAuthDataCtorArg = pMutualAuthData, packageNameLength = packageNameLength, pPackageNameCtorArg = pPackageName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpRequestAuthInfo) return false
        if (this.authStatus != other.authStatus) return false
        if (this.secStatus != other.secStatus) return false
        if (this.flags != other.flags) return false
        if (this.authType != other.authType) return false
        if (this.accessToken != other.accessToken) return false
        if (this.contextAttributes != other.contextAttributes) return false
        if (this.packedContextLength != other.packedContextLength) return false
        if (this.packedContextType != other.packedContextType) return false
        if (this.packedContext != other.packedContext) return false
        if (this.mutualAuthDataLength != other.mutualAuthDataLength) return false
        if (this.pMutualAuthData != other.pMutualAuthData) return false
        if (this.packageNameLength != other.packageNameLength) return false
        if (this.pPackageName != other.pPackageName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.authStatus.hashCode()
        result = 31 * result + this.secStatus.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.authType.hashCode()
        result = 31 * result + this.accessToken.hashCode()
        result = 31 * result + this.contextAttributes.hashCode()
        result = 31 * result + this.packedContextLength.hashCode()
        result = 31 * result + this.packedContextType.hashCode()
        result = 31 * result + this.packedContext.hashCode()
        result = 31 * result + this.mutualAuthDataLength.hashCode()
        result = 31 * result + this.pMutualAuthData.hashCode()
        result = 31 * result + this.packageNameLength.hashCode()
        result = 31 * result + this.pPackageName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            authStatus: HttpAuthStatus = 0,
            secStatus: Hresult = 0,
            flags: UInt = 0u,
            authType: HttpRequestAuthType = 0,
            accessToken: Handle = MutPtr(0L),
            contextAttributes: UInt = 0u,
            packedContextLength: UInt = 0u,
            packedContextType: UInt = 0u,
            packedContext: MutPtr<CVoid> = MutPtr(0L),
            mutualAuthDataLength: UInt = 0u,
            pMutualAuthData: Pstr = MutPtr(0L),
            packageNameLength: UShort = 0u,
            pPackageName: Pwstr = MutPtr(0L),
        ): HttpRequestAuthInfo =
            HttpRequestAuthInfo(
                authStatus = authStatus,
                secStatus = secStatus,
                flags = flags,
                authType = authType,
                accessTokenCtorArg = accessToken,
                contextAttributes = contextAttributes,
                packedContextLength = packedContextLength,
                packedContextType = packedContextType,
                packedContextCtorArg = packedContext,
                mutualAuthDataLength = mutualAuthDataLength,
                pMutualAuthDataCtorArg = pMutualAuthData,
                packageNameLength = packageNameLength,
                pPackageNameCtorArg = pPackageName,
            )
    }
}

public class HttpRequestChannelBindStatus internal constructor(
    serviceNameCtorArg: MutPtr<HttpServiceBindingBase>,
    channelTokenCtorArg: MutPtr<UByte>,
    public var channelTokenSize: UInt,
    public var flags: UInt,
) {
    public var serviceName: MutPtr<HttpServiceBindingBase> = serviceNameCtorArg
        internal set

    public var channelToken: MutPtr<UByte> = channelTokenCtorArg
        internal set

    public constructor() : this(
        serviceNameCtorArg = MutPtr(0L),
        channelTokenCtorArg = MutPtr(0L),
        channelTokenSize = 0u,
        flags = 0u,
    )

    public operator fun component1(): MutPtr<HttpServiceBindingBase> = this.serviceName

    public operator fun component2(): MutPtr<UByte> = this.channelToken

    public operator fun component3(): UInt = this.channelTokenSize

    public operator fun component4(): UInt = this.flags

    public fun copy(serviceName: MutPtr<HttpServiceBindingBase> = this.serviceName, channelToken: MutPtr<UByte> = this.channelToken, channelTokenSize: UInt = this.channelTokenSize, flags: UInt = this.flags): HttpRequestChannelBindStatus = HttpRequestChannelBindStatus(serviceNameCtorArg = serviceName, channelTokenCtorArg = channelToken, channelTokenSize = channelTokenSize, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpRequestChannelBindStatus) return false
        if (this.serviceName != other.serviceName) return false
        if (this.channelToken != other.channelToken) return false
        if (this.channelTokenSize != other.channelTokenSize) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.serviceName.hashCode()
        result = 31 * result + this.channelToken.hashCode()
        result = 31 * result + this.channelTokenSize.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpRequestChannelBindStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpRequestChannelBindStatus> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): HttpRequestChannelBindStatus =
                    HttpRequestChannelBindStatus(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<HttpServiceBindingBase>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: HttpRequestChannelBindStatus) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<HttpServiceBindingBase>(64)
                    ).writeNative(addr, value.serviceName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.channelToken)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.channelTokenSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.flags)
                }
            }

        public operator fun invoke(
            serviceName: MutPtr<HttpServiceBindingBase> = MutPtr(0L),
            channelToken: MutPtr<UByte> = MutPtr(0L),
            channelTokenSize: UInt = 0u,
            flags: UInt = 0u,
        ): HttpRequestChannelBindStatus =
            HttpRequestChannelBindStatus(
                serviceNameCtorArg = serviceName,
                channelTokenCtorArg = channelToken,
                channelTokenSize = channelTokenSize,
                flags = flags,
            )
    }
}

public class HttpRequestHeaders internal constructor(
    public var unknownHeaderCount: UShort,
    pUnknownHeadersCtorArg: MutPtr<HttpUnknownHeader>,
    public var trailerCount: UShort,
    pTrailersCtorArg: MutPtr<HttpUnknownHeader>,
    public var knownHeaders: List<HttpKnownHeader>,
) {
    public var pUnknownHeaders: MutPtr<HttpUnknownHeader> = pUnknownHeadersCtorArg
        internal set

    public var pTrailers: MutPtr<HttpUnknownHeader> = pTrailersCtorArg
        internal set

    public constructor() : this(
        unknownHeaderCount = 0u,
        pUnknownHeadersCtorArg = MutPtr(0L),
        trailerCount = 0u,
        pTrailersCtorArg = MutPtr(0L),
        knownHeaders = List(41) { HttpKnownHeader() },
    )

    public operator fun component1(): UShort = this.unknownHeaderCount

    public operator fun component2(): MutPtr<HttpUnknownHeader> = this.pUnknownHeaders

    public operator fun component3(): UShort = this.trailerCount

    public operator fun component4(): MutPtr<HttpUnknownHeader> = this.pTrailers

    public operator fun component5(): List<HttpKnownHeader> = this.knownHeaders

    public fun copy(unknownHeaderCount: UShort = this.unknownHeaderCount, pUnknownHeaders: MutPtr<HttpUnknownHeader> = this.pUnknownHeaders, trailerCount: UShort = this.trailerCount, pTrailers: MutPtr<HttpUnknownHeader> = this.pTrailers, knownHeaders: List<HttpKnownHeader> = this.knownHeaders): HttpRequestHeaders = HttpRequestHeaders(unknownHeaderCount = unknownHeaderCount, pUnknownHeadersCtorArg = pUnknownHeaders, trailerCount = trailerCount, pTrailersCtorArg = pTrailers, knownHeaders = knownHeaders)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpRequestHeaders) return false
        if (this.unknownHeaderCount != other.unknownHeaderCount) return false
        if (this.pUnknownHeaders != other.pUnknownHeaders) return false
        if (this.trailerCount != other.trailerCount) return false
        if (this.pTrailers != other.pTrailers) return false
        if (this.knownHeaders != other.knownHeaders) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.unknownHeaderCount.hashCode()
        result = 31 * result + this.pUnknownHeaders.hashCode()
        result = 31 * result + this.trailerCount.hashCode()
        result = 31 * result + this.pTrailers.hashCode()
        result = 31 * result + this.knownHeaders.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            unknownHeaderCount: UShort = 0u,
            pUnknownHeaders: MutPtr<HttpUnknownHeader> = MutPtr(0L),
            trailerCount: UShort = 0u,
            pTrailers: MutPtr<HttpUnknownHeader> = MutPtr(0L),
            knownHeaders: List<HttpKnownHeader> = List(41) { HttpKnownHeader() },
        ): HttpRequestHeaders =
            HttpRequestHeaders(
                unknownHeaderCount = unknownHeaderCount,
                pUnknownHeadersCtorArg = pUnknownHeaders,
                trailerCount = trailerCount,
                pTrailersCtorArg = pTrailers,
                knownHeaders = knownHeaders,
            )
    }
}

public class HttpRequestInfo internal constructor(
    public var infoType: HttpRequestInfoType,
    public var infoLength: UInt,
    pInfoCtorArg: MutPtr<CVoid>,
) {
    public var pInfo: MutPtr<CVoid> = pInfoCtorArg
        internal set

    public constructor() : this(
        infoType = 0,
        infoLength = 0u,
        pInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): HttpRequestInfoType = this.infoType

    public operator fun component2(): UInt = this.infoLength

    public operator fun component3(): MutPtr<CVoid> = this.pInfo

    public fun copy(infoType: HttpRequestInfoType = this.infoType, infoLength: UInt = this.infoLength, pInfo: MutPtr<CVoid> = this.pInfo): HttpRequestInfo = HttpRequestInfo(infoType = infoType, infoLength = infoLength, pInfoCtorArg = pInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpRequestInfo) return false
        if (this.infoType != other.infoType) return false
        if (this.infoLength != other.infoLength) return false
        if (this.pInfo != other.pInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.infoType.hashCode()
        result = 31 * result + this.infoLength.hashCode()
        result = 31 * result + this.pInfo.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpRequestInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpRequestInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): HttpRequestInfo =
                    HttpRequestInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: HttpRequestInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.infoType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.infoLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.pInfo)
                }
            }

        public operator fun invoke(
            infoType: HttpRequestInfoType = 0,
            infoLength: UInt = 0u,
            pInfo: MutPtr<CVoid> = MutPtr(0L),
        ): HttpRequestInfo =
            HttpRequestInfo(
                infoType = infoType,
                infoLength = infoLength,
                pInfoCtorArg = pInfo,
            )
    }
}

public data class HttpRequestPropertySni(
    public var hostname: UShortArray = UShortArray(256),
    public var flags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpRequestPropertySni) return false
        if (!this.hostname.contentEquals(other.hostname)) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hostname.contentHashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpRequestPropertySni> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpRequestPropertySni> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 516L
                override fun readNative(addr: Long): HttpRequestPropertySni =
                    HttpRequestPropertySni(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 512L),
                    )
                override fun writeNative(addr: Long, value: HttpRequestPropertySni) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr, value.hostname.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 512L, value.flags)
                }
            }
    }
}

public data class HttpRequestPropertyStreamError(
    public var errorCode: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpRequestPropertyStreamError> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpRequestPropertyStreamError> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): HttpRequestPropertyStreamError =
                    HttpRequestPropertyStreamError(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: HttpRequestPropertyStreamError) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.errorCode)
                }
            }
    }
}

public data class HttpRequestSizingInfo(
    public var flags: ULong = 0uL,
    public var requestIndex: UInt = 0u,
    public var requestSizingCount: UInt = 0u,
    public var requestSizing: ULongArray = ULongArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpRequestSizingInfo) return false
        if (this.flags != other.flags) return false
        if (this.requestIndex != other.requestIndex) return false
        if (this.requestSizingCount != other.requestSizingCount) return false
        if (!this.requestSizing.contentEquals(other.requestSizing)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.requestIndex.hashCode()
        result = 31 * result + this.requestSizingCount.hashCode()
        result = 31 * result + this.requestSizing.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpRequestSizingInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpRequestSizingInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): HttpRequestSizingInfo =
                    HttpRequestSizingInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (5).toInt())
                        ).readNative(addr + 16L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: HttpRequestSizingInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.requestIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.requestSizingCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (5).toInt())
                    ).writeNative(addr + 16L, value.requestSizing.toList())
                }
            }
    }
}

public data class HttpRequestTimingInfo(
    public var requestTimingCount: UInt = 0u,
    public var requestTiming: ULongArray = ULongArray(30),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpRequestTimingInfo) return false
        if (this.requestTimingCount != other.requestTimingCount) return false
        if (!this.requestTiming.contentEquals(other.requestTiming)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.requestTimingCount.hashCode()
        result = 31 * result + this.requestTiming.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpRequestTimingInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpRequestTimingInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 248L
                override fun readNative(addr: Long): HttpRequestTimingInfo =
                    HttpRequestTimingInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (30).toInt())
                        ).readNative(addr + 8L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: HttpRequestTimingInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.requestTimingCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (30).toInt())
                    ).writeNative(addr + 8L, value.requestTiming.toList())
                }
            }
    }
}

public class HttpRequestTokenBindingInfo internal constructor(
    tokenBindingCtorArg: MutPtr<UByte>,
    public var tokenBindingSize: UInt,
    ekmCtorArg: MutPtr<UByte>,
    public var eKMSize: UInt,
    public var keyType: UByte,
) {
    public var tokenBinding: MutPtr<UByte> = tokenBindingCtorArg
        internal set

    public var ekm: MutPtr<UByte> = ekmCtorArg
        internal set

    public constructor() : this(
        tokenBindingCtorArg = MutPtr(0L),
        tokenBindingSize = 0u,
        ekmCtorArg = MutPtr(0L),
        eKMSize = 0u,
        keyType = 0u,
    )

    public operator fun component1(): MutPtr<UByte> = this.tokenBinding

    public operator fun component2(): UInt = this.tokenBindingSize

    public operator fun component3(): MutPtr<UByte> = this.ekm

    public operator fun component4(): UInt = this.eKMSize

    public operator fun component5(): UByte = this.keyType

    public fun copy(tokenBinding: MutPtr<UByte> = this.tokenBinding, tokenBindingSize: UInt = this.tokenBindingSize, ekm: MutPtr<UByte> = this.ekm, eKMSize: UInt = this.eKMSize, keyType: UByte = this.keyType): HttpRequestTokenBindingInfo = HttpRequestTokenBindingInfo(tokenBindingCtorArg = tokenBinding, tokenBindingSize = tokenBindingSize, ekmCtorArg = ekm, eKMSize = eKMSize, keyType = keyType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpRequestTokenBindingInfo) return false
        if (this.tokenBinding != other.tokenBinding) return false
        if (this.tokenBindingSize != other.tokenBindingSize) return false
        if (this.ekm != other.ekm) return false
        if (this.eKMSize != other.eKMSize) return false
        if (this.keyType != other.keyType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.tokenBinding.hashCode()
        result = 31 * result + this.tokenBindingSize.hashCode()
        result = 31 * result + this.ekm.hashCode()
        result = 31 * result + this.eKMSize.hashCode()
        result = 31 * result + this.keyType.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpRequestTokenBindingInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpRequestTokenBindingInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): HttpRequestTokenBindingInfo =
                    HttpRequestTokenBindingInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: HttpRequestTokenBindingInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr, value.tokenBinding)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.tokenBindingSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 16L, value.ekm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.eKMSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 28L, value.keyType)
                }
            }

        public operator fun invoke(
            tokenBinding: MutPtr<UByte> = MutPtr(0L),
            tokenBindingSize: UInt = 0u,
            ekm: MutPtr<UByte> = MutPtr(0L),
            eKMSize: UInt = 0u,
            keyType: UByte = 0u,
        ): HttpRequestTokenBindingInfo =
            HttpRequestTokenBindingInfo(
                tokenBindingCtorArg = tokenBinding,
                tokenBindingSize = tokenBindingSize,
                ekmCtorArg = ekm,
                eKMSize = eKMSize,
                keyType = keyType,
            )
    }
}

public class HttpRequestV1 internal constructor(
    public var flags: UInt,
    public var connectionId: ULong,
    public var requestId: ULong,
    public var urlContext: ULong,
    public var version: HttpVersion,
    public var verb: HttpVerb,
    public var unknownVerbLength: UShort,
    public var rawUrlLength: UShort,
    pUnknownVerbCtorArg: Pcstr,
    pRawUrlCtorArg: Pcstr,
    public var cookedUrl: HttpCookedUrl,
    public var address: HttpTransportAddress,
    public var headers: HttpRequestHeaders,
    public var bytesReceived: ULong,
    public var entityChunkCount: UShort,
    pEntityChunksCtorArg: MutPtr<HttpDataChunk>,
    public var rawConnectionId: ULong,
    pSslInfoCtorArg: MutPtr<HttpSslInfo>,
) {
    public var pUnknownVerb: Pcstr = pUnknownVerbCtorArg
        internal set

    public var pRawUrl: Pcstr = pRawUrlCtorArg
        internal set

    public var pEntityChunks: MutPtr<HttpDataChunk> = pEntityChunksCtorArg
        internal set

    public var pSslInfo: MutPtr<HttpSslInfo> = pSslInfoCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        connectionId = 0uL,
        requestId = 0uL,
        urlContext = 0uL,
        version = HttpVersion(),
        verb = 0,
        unknownVerbLength = 0u,
        rawUrlLength = 0u,
        pUnknownVerbCtorArg = ConstPtr(0L),
        pRawUrlCtorArg = ConstPtr(0L),
        cookedUrl = HttpCookedUrl(),
        address = HttpTransportAddress(),
        headers = HttpRequestHeaders(),
        bytesReceived = 0uL,
        entityChunkCount = 0u,
        pEntityChunksCtorArg = MutPtr(0L),
        rawConnectionId = 0uL,
        pSslInfoCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            flags: UInt = 0u,
            connectionId: ULong = 0uL,
            requestId: ULong = 0uL,
            urlContext: ULong = 0uL,
            version: HttpVersion = HttpVersion(),
            verb: HttpVerb = 0,
            unknownVerbLength: UShort = 0u,
            rawUrlLength: UShort = 0u,
            pUnknownVerb: Pcstr = ConstPtr(0L),
            pRawUrl: Pcstr = ConstPtr(0L),
            cookedUrl: HttpCookedUrl = HttpCookedUrl(),
            address: HttpTransportAddress = HttpTransportAddress(),
            headers: HttpRequestHeaders = HttpRequestHeaders(),
            bytesReceived: ULong = 0uL,
            entityChunkCount: UShort = 0u,
            pEntityChunks: MutPtr<HttpDataChunk> = MutPtr(0L),
            rawConnectionId: ULong = 0uL,
            pSslInfo: MutPtr<HttpSslInfo> = MutPtr(0L),
        ): HttpRequestV1 =
            HttpRequestV1(
                flags = flags,
                connectionId = connectionId,
                requestId = requestId,
                urlContext = urlContext,
                version = version,
                verb = verb,
                unknownVerbLength = unknownVerbLength,
                rawUrlLength = rawUrlLength,
                pUnknownVerbCtorArg = pUnknownVerb,
                pRawUrlCtorArg = pRawUrl,
                cookedUrl = cookedUrl,
                address = address,
                headers = headers,
                bytesReceived = bytesReceived,
                entityChunkCount = entityChunkCount,
                pEntityChunksCtorArg = pEntityChunks,
                rawConnectionId = rawConnectionId,
                pSslInfoCtorArg = pSslInfo,
            )
    }
}

public class HttpRequestV2 internal constructor(
    public var base: HttpRequestV1,
    public var requestInfoCount: UShort,
    pRequestInfoCtorArg: MutPtr<HttpRequestInfo>,
) {
    public var pRequestInfo: MutPtr<HttpRequestInfo> = pRequestInfoCtorArg
        internal set

    public constructor() : this(
        base = HttpRequestV1(),
        requestInfoCount = 0u,
        pRequestInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): HttpRequestV1 = this.base

    public operator fun component2(): UShort = this.requestInfoCount

    public operator fun component3(): MutPtr<HttpRequestInfo> = this.pRequestInfo

    public fun copy(base: HttpRequestV1 = this.base, requestInfoCount: UShort = this.requestInfoCount, pRequestInfo: MutPtr<HttpRequestInfo> = this.pRequestInfo): HttpRequestV2 = HttpRequestV2(base = base, requestInfoCount = requestInfoCount, pRequestInfoCtorArg = pRequestInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpRequestV2) return false
        if (this.base != other.base) return false
        if (this.requestInfoCount != other.requestInfoCount) return false
        if (this.pRequestInfo != other.pRequestInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.base.hashCode()
        result = 31 * result + this.requestInfoCount.hashCode()
        result = 31 * result + this.pRequestInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            base: HttpRequestV1 = HttpRequestV1(),
            requestInfoCount: UShort = 0u,
            pRequestInfo: MutPtr<HttpRequestInfo> = MutPtr(0L),
        ): HttpRequestV2 =
            HttpRequestV2(
                base = base,
                requestInfoCount = requestInfoCount,
                pRequestInfoCtorArg = pRequestInfo,
            )
    }
}

public class HttpResponseHeaders internal constructor(
    public var unknownHeaderCount: UShort,
    pUnknownHeadersCtorArg: MutPtr<HttpUnknownHeader>,
    public var trailerCount: UShort,
    pTrailersCtorArg: MutPtr<HttpUnknownHeader>,
    public var knownHeaders: List<HttpKnownHeader>,
) {
    public var pUnknownHeaders: MutPtr<HttpUnknownHeader> = pUnknownHeadersCtorArg
        internal set

    public var pTrailers: MutPtr<HttpUnknownHeader> = pTrailersCtorArg
        internal set

    public constructor() : this(
        unknownHeaderCount = 0u,
        pUnknownHeadersCtorArg = MutPtr(0L),
        trailerCount = 0u,
        pTrailersCtorArg = MutPtr(0L),
        knownHeaders = List(30) { HttpKnownHeader() },
    )

    public operator fun component1(): UShort = this.unknownHeaderCount

    public operator fun component2(): MutPtr<HttpUnknownHeader> = this.pUnknownHeaders

    public operator fun component3(): UShort = this.trailerCount

    public operator fun component4(): MutPtr<HttpUnknownHeader> = this.pTrailers

    public operator fun component5(): List<HttpKnownHeader> = this.knownHeaders

    public fun copy(unknownHeaderCount: UShort = this.unknownHeaderCount, pUnknownHeaders: MutPtr<HttpUnknownHeader> = this.pUnknownHeaders, trailerCount: UShort = this.trailerCount, pTrailers: MutPtr<HttpUnknownHeader> = this.pTrailers, knownHeaders: List<HttpKnownHeader> = this.knownHeaders): HttpResponseHeaders = HttpResponseHeaders(unknownHeaderCount = unknownHeaderCount, pUnknownHeadersCtorArg = pUnknownHeaders, trailerCount = trailerCount, pTrailersCtorArg = pTrailers, knownHeaders = knownHeaders)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpResponseHeaders) return false
        if (this.unknownHeaderCount != other.unknownHeaderCount) return false
        if (this.pUnknownHeaders != other.pUnknownHeaders) return false
        if (this.trailerCount != other.trailerCount) return false
        if (this.pTrailers != other.pTrailers) return false
        if (this.knownHeaders != other.knownHeaders) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.unknownHeaderCount.hashCode()
        result = 31 * result + this.pUnknownHeaders.hashCode()
        result = 31 * result + this.trailerCount.hashCode()
        result = 31 * result + this.pTrailers.hashCode()
        result = 31 * result + this.knownHeaders.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            unknownHeaderCount: UShort = 0u,
            pUnknownHeaders: MutPtr<HttpUnknownHeader> = MutPtr(0L),
            trailerCount: UShort = 0u,
            pTrailers: MutPtr<HttpUnknownHeader> = MutPtr(0L),
            knownHeaders: List<HttpKnownHeader> = List(30) { HttpKnownHeader() },
        ): HttpResponseHeaders =
            HttpResponseHeaders(
                unknownHeaderCount = unknownHeaderCount,
                pUnknownHeadersCtorArg = pUnknownHeaders,
                trailerCount = trailerCount,
                pTrailersCtorArg = pTrailers,
                knownHeaders = knownHeaders,
            )
    }
}

public class HttpResponseInfo internal constructor(
    public var type: HttpResponseInfoType,
    public var length: UInt,
    pInfoCtorArg: MutPtr<CVoid>,
) {
    public var pInfo: MutPtr<CVoid> = pInfoCtorArg
        internal set

    public constructor() : this(
        type = 0,
        length = 0u,
        pInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): HttpResponseInfoType = this.type

    public operator fun component2(): UInt = this.length

    public operator fun component3(): MutPtr<CVoid> = this.pInfo

    public fun copy(type: HttpResponseInfoType = this.type, length: UInt = this.length, pInfo: MutPtr<CVoid> = this.pInfo): HttpResponseInfo = HttpResponseInfo(type = type, length = length, pInfoCtorArg = pInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpResponseInfo) return false
        if (this.type != other.type) return false
        if (this.length != other.length) return false
        if (this.pInfo != other.pInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.pInfo.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpResponseInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpResponseInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): HttpResponseInfo =
                    HttpResponseInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: HttpResponseInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.pInfo)
                }
            }

        public operator fun invoke(
            type: HttpResponseInfoType = 0,
            length: UInt = 0u,
            pInfo: MutPtr<CVoid> = MutPtr(0L),
        ): HttpResponseInfo =
            HttpResponseInfo(
                type = type,
                length = length,
                pInfoCtorArg = pInfo,
            )
    }
}

public class HttpResponseV1 internal constructor(
    public var flags: UInt,
    public var version: HttpVersion,
    public var statusCode: UShort,
    public var reasonLength: UShort,
    pReasonCtorArg: Pcstr,
    public var headers: HttpResponseHeaders,
    public var entityChunkCount: UShort,
    pEntityChunksCtorArg: MutPtr<HttpDataChunk>,
) {
    public var pReason: Pcstr = pReasonCtorArg
        internal set

    public var pEntityChunks: MutPtr<HttpDataChunk> = pEntityChunksCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        version = HttpVersion(),
        statusCode = 0u,
        reasonLength = 0u,
        pReasonCtorArg = ConstPtr(0L),
        headers = HttpResponseHeaders(),
        entityChunkCount = 0u,
        pEntityChunksCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.flags

    public operator fun component2(): HttpVersion = this.version

    public operator fun component3(): UShort = this.statusCode

    public operator fun component4(): UShort = this.reasonLength

    public operator fun component5(): Pcstr = this.pReason

    public operator fun component6(): HttpResponseHeaders = this.headers

    public operator fun component7(): UShort = this.entityChunkCount

    public operator fun component8(): MutPtr<HttpDataChunk> = this.pEntityChunks

    public fun copy(flags: UInt = this.flags, version: HttpVersion = this.version, statusCode: UShort = this.statusCode, reasonLength: UShort = this.reasonLength, pReason: Pcstr = this.pReason, headers: HttpResponseHeaders = this.headers, entityChunkCount: UShort = this.entityChunkCount, pEntityChunks: MutPtr<HttpDataChunk> = this.pEntityChunks): HttpResponseV1 = HttpResponseV1(flags = flags, version = version, statusCode = statusCode, reasonLength = reasonLength, pReasonCtorArg = pReason, headers = headers, entityChunkCount = entityChunkCount, pEntityChunksCtorArg = pEntityChunks)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpResponseV1) return false
        if (this.flags != other.flags) return false
        if (this.version != other.version) return false
        if (this.statusCode != other.statusCode) return false
        if (this.reasonLength != other.reasonLength) return false
        if (this.pReason != other.pReason) return false
        if (this.headers != other.headers) return false
        if (this.entityChunkCount != other.entityChunkCount) return false
        if (this.pEntityChunks != other.pEntityChunks) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.statusCode.hashCode()
        result = 31 * result + this.reasonLength.hashCode()
        result = 31 * result + this.pReason.hashCode()
        result = 31 * result + this.headers.hashCode()
        result = 31 * result + this.entityChunkCount.hashCode()
        result = 31 * result + this.pEntityChunks.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: UInt = 0u,
            version: HttpVersion = HttpVersion(),
            statusCode: UShort = 0u,
            reasonLength: UShort = 0u,
            pReason: Pcstr = ConstPtr(0L),
            headers: HttpResponseHeaders = HttpResponseHeaders(),
            entityChunkCount: UShort = 0u,
            pEntityChunks: MutPtr<HttpDataChunk> = MutPtr(0L),
        ): HttpResponseV1 =
            HttpResponseV1(
                flags = flags,
                version = version,
                statusCode = statusCode,
                reasonLength = reasonLength,
                pReasonCtorArg = pReason,
                headers = headers,
                entityChunkCount = entityChunkCount,
                pEntityChunksCtorArg = pEntityChunks,
            )
    }
}

public class HttpResponseV2 internal constructor(
    public var base: HttpResponseV1,
    public var responseInfoCount: UShort,
    pResponseInfoCtorArg: MutPtr<HttpResponseInfo>,
) {
    public var pResponseInfo: MutPtr<HttpResponseInfo> = pResponseInfoCtorArg
        internal set

    public constructor() : this(
        base = HttpResponseV1(),
        responseInfoCount = 0u,
        pResponseInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): HttpResponseV1 = this.base

    public operator fun component2(): UShort = this.responseInfoCount

    public operator fun component3(): MutPtr<HttpResponseInfo> = this.pResponseInfo

    public fun copy(base: HttpResponseV1 = this.base, responseInfoCount: UShort = this.responseInfoCount, pResponseInfo: MutPtr<HttpResponseInfo> = this.pResponseInfo): HttpResponseV2 = HttpResponseV2(base = base, responseInfoCount = responseInfoCount, pResponseInfoCtorArg = pResponseInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpResponseV2) return false
        if (this.base != other.base) return false
        if (this.responseInfoCount != other.responseInfoCount) return false
        if (this.pResponseInfo != other.pResponseInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.base.hashCode()
        result = 31 * result + this.responseInfoCount.hashCode()
        result = 31 * result + this.pResponseInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            base: HttpResponseV1 = HttpResponseV1(),
            responseInfoCount: UShort = 0u,
            pResponseInfo: MutPtr<HttpResponseInfo> = MutPtr(0L),
        ): HttpResponseV2 =
            HttpResponseV2(
                base = base,
                responseInfoCount = responseInfoCount,
                pResponseInfoCtorArg = pResponseInfo,
            )
    }
}

public class HttpServerAuthenticationBasicParams internal constructor(
    public var realmLength: UShort,
    realmCtorArg: Pwstr,
) {
    public var realm: Pwstr = realmCtorArg
        internal set

    public constructor() : this(
        realmLength = 0u,
        realmCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.realmLength

    public operator fun component2(): Pwstr = this.realm

    public fun copy(realmLength: UShort = this.realmLength, realm: Pwstr = this.realm): HttpServerAuthenticationBasicParams = HttpServerAuthenticationBasicParams(realmLength = realmLength, realmCtorArg = realm)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpServerAuthenticationBasicParams) return false
        if (this.realmLength != other.realmLength) return false
        if (this.realm != other.realm) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.realmLength.hashCode()
        result = 31 * result + this.realm.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            realmLength: UShort = 0u,
            realm: Pwstr = MutPtr(0L),
        ): HttpServerAuthenticationBasicParams =
            HttpServerAuthenticationBasicParams(
                realmLength = realmLength,
                realmCtorArg = realm,
            )
    }
}

public class HttpServerAuthenticationDigestParams internal constructor(
    public var domainNameLength: UShort,
    domainNameCtorArg: Pwstr,
    public var realmLength: UShort,
    realmCtorArg: Pwstr,
) {
    public var domainName: Pwstr = domainNameCtorArg
        internal set

    public var realm: Pwstr = realmCtorArg
        internal set

    public constructor() : this(
        domainNameLength = 0u,
        domainNameCtorArg = MutPtr(0L),
        realmLength = 0u,
        realmCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.domainNameLength

    public operator fun component2(): Pwstr = this.domainName

    public operator fun component3(): UShort = this.realmLength

    public operator fun component4(): Pwstr = this.realm

    public fun copy(domainNameLength: UShort = this.domainNameLength, domainName: Pwstr = this.domainName, realmLength: UShort = this.realmLength, realm: Pwstr = this.realm): HttpServerAuthenticationDigestParams = HttpServerAuthenticationDigestParams(domainNameLength = domainNameLength, domainNameCtorArg = domainName, realmLength = realmLength, realmCtorArg = realm)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpServerAuthenticationDigestParams) return false
        if (this.domainNameLength != other.domainNameLength) return false
        if (this.domainName != other.domainName) return false
        if (this.realmLength != other.realmLength) return false
        if (this.realm != other.realm) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.domainNameLength.hashCode()
        result = 31 * result + this.domainName.hashCode()
        result = 31 * result + this.realmLength.hashCode()
        result = 31 * result + this.realm.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            domainNameLength: UShort = 0u,
            domainName: Pwstr = MutPtr(0L),
            realmLength: UShort = 0u,
            realm: Pwstr = MutPtr(0L),
        ): HttpServerAuthenticationDigestParams =
            HttpServerAuthenticationDigestParams(
                domainNameLength = domainNameLength,
                domainNameCtorArg = domainName,
                realmLength = realmLength,
                realmCtorArg = realm,
            )
    }
}

public data class HttpServerAuthenticationInfo(
    public var flags: HttpPropertyFlags = HttpPropertyFlags(),
    public var authSchemes: UInt = 0u,
    public var receiveMutualAuth: Boolean = false,
    public var receiveContextHandle: Boolean = false,
    public var disableNTLMCredentialCaching: Boolean = false,
    public var exFlags: UByte = 0u,
    public var digestParams: HttpServerAuthenticationDigestParams = HttpServerAuthenticationDigestParams(),
    public var basicParams: HttpServerAuthenticationBasicParams = HttpServerAuthenticationBasicParams(),
)

public class HttpServiceBindingA internal constructor(
    public var base: HttpServiceBindingBase,
    bufferCtorArg: Pstr,
    public var bufferSize: UInt,
) {
    public var buffer: Pstr = bufferCtorArg
        internal set

    public constructor() : this(
        base = HttpServiceBindingBase(),
        bufferCtorArg = MutPtr(0L),
        bufferSize = 0u,
    )

    public operator fun component1(): HttpServiceBindingBase = this.base

    public operator fun component2(): Pstr = this.buffer

    public operator fun component3(): UInt = this.bufferSize

    public fun copy(base: HttpServiceBindingBase = this.base, buffer: Pstr = this.buffer, bufferSize: UInt = this.bufferSize): HttpServiceBindingA = HttpServiceBindingA(base = base, bufferCtorArg = buffer, bufferSize = bufferSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpServiceBindingA) return false
        if (this.base != other.base) return false
        if (this.buffer != other.buffer) return false
        if (this.bufferSize != other.bufferSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.base.hashCode()
        result = 31 * result + this.buffer.hashCode()
        result = 31 * result + this.bufferSize.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            base: HttpServiceBindingBase = HttpServiceBindingBase(),
            buffer: Pstr = MutPtr(0L),
            bufferSize: UInt = 0u,
        ): HttpServiceBindingA =
            HttpServiceBindingA(
                base = base,
                bufferCtorArg = buffer,
                bufferSize = bufferSize,
            )
    }
}

public data class HttpServiceBindingBase(
    public var type: HttpServiceBindingType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpServiceBindingBase> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpServiceBindingBase> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): HttpServiceBindingBase =
                    HttpServiceBindingBase(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: HttpServiceBindingBase) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.type)
                }
            }
    }
}

public class HttpServiceBindingW internal constructor(
    public var base: HttpServiceBindingBase,
    bufferCtorArg: Pwstr,
    public var bufferSize: UInt,
) {
    public var buffer: Pwstr = bufferCtorArg
        internal set

    public constructor() : this(
        base = HttpServiceBindingBase(),
        bufferCtorArg = MutPtr(0L),
        bufferSize = 0u,
    )

    public operator fun component1(): HttpServiceBindingBase = this.base

    public operator fun component2(): Pwstr = this.buffer

    public operator fun component3(): UInt = this.bufferSize

    public fun copy(base: HttpServiceBindingBase = this.base, buffer: Pwstr = this.buffer, bufferSize: UInt = this.bufferSize): HttpServiceBindingW = HttpServiceBindingW(base = base, bufferCtorArg = buffer, bufferSize = bufferSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpServiceBindingW) return false
        if (this.base != other.base) return false
        if (this.buffer != other.buffer) return false
        if (this.bufferSize != other.bufferSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.base.hashCode()
        result = 31 * result + this.buffer.hashCode()
        result = 31 * result + this.bufferSize.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            base: HttpServiceBindingBase = HttpServiceBindingBase(),
            buffer: Pwstr = MutPtr(0L),
            bufferSize: UInt = 0u,
        ): HttpServiceBindingW =
            HttpServiceBindingW(
                base = base,
                bufferCtorArg = buffer,
                bufferSize = bufferSize,
            )
    }
}

public data class HttpServiceConfigCacheSet(
    public var keyDesc: HttpServiceConfigCacheKey = 0,
    public var paramDesc: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpServiceConfigCacheSet> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpServiceConfigCacheSet> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): HttpServiceConfigCacheSet =
                    HttpServiceConfigCacheSet(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: HttpServiceConfigCacheSet) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.keyDesc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.paramDesc)
                }
            }
    }
}

public class HttpServiceConfigIpListenParam internal constructor(
    public var addrLength: UShort,
    pAddressCtorArg: MutPtr<Sockaddr>,
) {
    public var pAddress: MutPtr<Sockaddr> = pAddressCtorArg
        internal set

    public constructor() : this(
        addrLength = 0u,
        pAddressCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.addrLength

    public operator fun component2(): MutPtr<Sockaddr> = this.pAddress

    public fun copy(addrLength: UShort = this.addrLength, pAddress: MutPtr<Sockaddr> = this.pAddress): HttpServiceConfigIpListenParam = HttpServiceConfigIpListenParam(addrLength = addrLength, pAddressCtorArg = pAddress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpServiceConfigIpListenParam) return false
        if (this.addrLength != other.addrLength) return false
        if (this.pAddress != other.pAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.addrLength.hashCode()
        result = 31 * result + this.pAddress.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpServiceConfigIpListenParam> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpServiceConfigIpListenParam> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): HttpServiceConfigIpListenParam =
                    HttpServiceConfigIpListenParam(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Sockaddr>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: HttpServiceConfigIpListenParam) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.addrLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Sockaddr>(64)
                    ).writeNative(addr + 8L, value.pAddress)
                }
            }

        public operator fun invoke(
            addrLength: UShort = 0u,
            pAddress: MutPtr<Sockaddr> = MutPtr(0L),
        ): HttpServiceConfigIpListenParam =
            HttpServiceConfigIpListenParam(
                addrLength = addrLength,
                pAddressCtorArg = pAddress,
            )
    }
}

public data class HttpServiceConfigIpListenQuery(
    public var addrCount: UInt = 0u,
    public var addrList: List<SockaddrStorage> = List(1) { SockaddrStorage() },
)

public data class HttpServiceConfigSettingSet(
    public var keyDesc: HttpServiceConfigSettingKey = 0,
    public var paramDesc: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpServiceConfigSettingSet> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpServiceConfigSettingSet> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): HttpServiceConfigSettingSet =
                    HttpServiceConfigSettingSet(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: HttpServiceConfigSettingSet) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.keyDesc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.paramDesc)
                }
            }
    }
}

public data class HttpServiceConfigSslCcsKey(
    public var localAddress: SockaddrStorage = SockaddrStorage(),
)

public data class HttpServiceConfigSslCcsQuery(
    public var queryDesc: HttpServiceConfigQueryType = 0,
    public var keyDesc: HttpServiceConfigSslCcsKey = HttpServiceConfigSslCcsKey(),
    public var dwToken: UInt = 0u,
)

public data class HttpServiceConfigSslCcsQueryEx(
    public var queryDesc: HttpServiceConfigQueryType = 0,
    public var keyDesc: HttpServiceConfigSslCcsKey = HttpServiceConfigSslCcsKey(),
    public var dwToken: UInt = 0u,
    public var paramType: HttpSslServiceConfigExParamType = 0,
)

public data class HttpServiceConfigSslCcsSet(
    public var keyDesc: HttpServiceConfigSslCcsKey = HttpServiceConfigSslCcsKey(),
    public var paramDesc: HttpServiceConfigSslParam = HttpServiceConfigSslParam(),
)

public data class HttpServiceConfigSslCcsSetEx(
    public var keyDesc: HttpServiceConfigSslCcsKey = HttpServiceConfigSslCcsKey(),
    public var paramDesc: HttpServiceConfigSslParamEx = HttpServiceConfigSslParamEx(),
)

public class HttpServiceConfigSslKey internal constructor(
    pIpPortCtorArg: MutPtr<Sockaddr>,
) {
    public var pIpPort: MutPtr<Sockaddr> = pIpPortCtorArg
        internal set

    public constructor() : this(
        pIpPortCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Sockaddr> = this.pIpPort

    public fun copy(pIpPort: MutPtr<Sockaddr> = this.pIpPort): HttpServiceConfigSslKey = HttpServiceConfigSslKey(pIpPortCtorArg = pIpPort)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpServiceConfigSslKey) return false
        if (this.pIpPort != other.pIpPort) return false
        return true
    }

    override fun hashCode(): Int = this.pIpPort.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpServiceConfigSslKey> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpServiceConfigSslKey> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): HttpServiceConfigSslKey =
                    HttpServiceConfigSslKey(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Sockaddr>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: HttpServiceConfigSslKey) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Sockaddr>(64)
                    ).writeNative(addr, value.pIpPort)
                }
            }

        public operator fun invoke(
            pIpPort: MutPtr<Sockaddr> = MutPtr(0L),
        ): HttpServiceConfigSslKey =
            HttpServiceConfigSslKey(
                pIpPortCtorArg = pIpPort,
            )
    }
}

public data class HttpServiceConfigSslKeyEx(
    public var ipPort: SockaddrStorage = SockaddrStorage(),
)

public class HttpServiceConfigSslParam internal constructor(
    public var sslHashLength: UInt,
    pSslHashCtorArg: MutPtr<CVoid>,
    public var appId: Guid,
    pSslCertStoreNameCtorArg: Pwstr,
    public var defaultCertCheckMode: UInt,
    public var defaultRevocationFreshnessTime: UInt,
    public var defaultRevocationUrlRetrievalTimeout: UInt,
    pDefaultSslCtlIdentifierCtorArg: Pwstr,
    pDefaultSslCtlStoreNameCtorArg: Pwstr,
    public var defaultFlags: UInt,
) {
    public var pSslHash: MutPtr<CVoid> = pSslHashCtorArg
        internal set

    public var pSslCertStoreName: Pwstr = pSslCertStoreNameCtorArg
        internal set

    public var pDefaultSslCtlIdentifier: Pwstr = pDefaultSslCtlIdentifierCtorArg
        internal set

    public var pDefaultSslCtlStoreName: Pwstr = pDefaultSslCtlStoreNameCtorArg
        internal set

    public constructor() : this(
        sslHashLength = 0u,
        pSslHashCtorArg = MutPtr(0L),
        appId = Guid(),
        pSslCertStoreNameCtorArg = MutPtr(0L),
        defaultCertCheckMode = 0u,
        defaultRevocationFreshnessTime = 0u,
        defaultRevocationUrlRetrievalTimeout = 0u,
        pDefaultSslCtlIdentifierCtorArg = MutPtr(0L),
        pDefaultSslCtlStoreNameCtorArg = MutPtr(0L),
        defaultFlags = 0u,
    )

    public operator fun component1(): UInt = this.sslHashLength

    public operator fun component2(): MutPtr<CVoid> = this.pSslHash

    public operator fun component3(): Guid = this.appId

    public operator fun component4(): Pwstr = this.pSslCertStoreName

    public operator fun component5(): UInt = this.defaultCertCheckMode

    public operator fun component6(): UInt = this.defaultRevocationFreshnessTime

    public operator fun component7(): UInt = this.defaultRevocationUrlRetrievalTimeout

    public operator fun component8(): Pwstr = this.pDefaultSslCtlIdentifier

    public operator fun component9(): Pwstr = this.pDefaultSslCtlStoreName

    public operator fun component10(): UInt = this.defaultFlags

    public fun copy(sslHashLength: UInt = this.sslHashLength, pSslHash: MutPtr<CVoid> = this.pSslHash, appId: Guid = this.appId, pSslCertStoreName: Pwstr = this.pSslCertStoreName, defaultCertCheckMode: UInt = this.defaultCertCheckMode, defaultRevocationFreshnessTime: UInt = this.defaultRevocationFreshnessTime, defaultRevocationUrlRetrievalTimeout: UInt = this.defaultRevocationUrlRetrievalTimeout, pDefaultSslCtlIdentifier: Pwstr = this.pDefaultSslCtlIdentifier, pDefaultSslCtlStoreName: Pwstr = this.pDefaultSslCtlStoreName, defaultFlags: UInt = this.defaultFlags): HttpServiceConfigSslParam = HttpServiceConfigSslParam(sslHashLength = sslHashLength, pSslHashCtorArg = pSslHash, appId = appId, pSslCertStoreNameCtorArg = pSslCertStoreName, defaultCertCheckMode = defaultCertCheckMode, defaultRevocationFreshnessTime = defaultRevocationFreshnessTime, defaultRevocationUrlRetrievalTimeout = defaultRevocationUrlRetrievalTimeout, pDefaultSslCtlIdentifierCtorArg = pDefaultSslCtlIdentifier, pDefaultSslCtlStoreNameCtorArg = pDefaultSslCtlStoreName, defaultFlags = defaultFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpServiceConfigSslParam) return false
        if (this.sslHashLength != other.sslHashLength) return false
        if (this.pSslHash != other.pSslHash) return false
        if (this.appId != other.appId) return false
        if (this.pSslCertStoreName != other.pSslCertStoreName) return false
        if (this.defaultCertCheckMode != other.defaultCertCheckMode) return false
        if (this.defaultRevocationFreshnessTime != other.defaultRevocationFreshnessTime) return false
        if (this.defaultRevocationUrlRetrievalTimeout != other.defaultRevocationUrlRetrievalTimeout) return false
        if (this.pDefaultSslCtlIdentifier != other.pDefaultSslCtlIdentifier) return false
        if (this.pDefaultSslCtlStoreName != other.pDefaultSslCtlStoreName) return false
        if (this.defaultFlags != other.defaultFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sslHashLength.hashCode()
        result = 31 * result + this.pSslHash.hashCode()
        result = 31 * result + this.appId.hashCode()
        result = 31 * result + this.pSslCertStoreName.hashCode()
        result = 31 * result + this.defaultCertCheckMode.hashCode()
        result = 31 * result + this.defaultRevocationFreshnessTime.hashCode()
        result = 31 * result + this.defaultRevocationUrlRetrievalTimeout.hashCode()
        result = 31 * result + this.pDefaultSslCtlIdentifier.hashCode()
        result = 31 * result + this.pDefaultSslCtlStoreName.hashCode()
        result = 31 * result + this.defaultFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sslHashLength: UInt = 0u,
            pSslHash: MutPtr<CVoid> = MutPtr(0L),
            appId: Guid = Guid(),
            pSslCertStoreName: Pwstr = MutPtr(0L),
            defaultCertCheckMode: UInt = 0u,
            defaultRevocationFreshnessTime: UInt = 0u,
            defaultRevocationUrlRetrievalTimeout: UInt = 0u,
            pDefaultSslCtlIdentifier: Pwstr = MutPtr(0L),
            pDefaultSslCtlStoreName: Pwstr = MutPtr(0L),
            defaultFlags: UInt = 0u,
        ): HttpServiceConfigSslParam =
            HttpServiceConfigSslParam(
                sslHashLength = sslHashLength,
                pSslHashCtorArg = pSslHash,
                appId = appId,
                pSslCertStoreNameCtorArg = pSslCertStoreName,
                defaultCertCheckMode = defaultCertCheckMode,
                defaultRevocationFreshnessTime = defaultRevocationFreshnessTime,
                defaultRevocationUrlRetrievalTimeout = defaultRevocationUrlRetrievalTimeout,
                pDefaultSslCtlIdentifierCtorArg = pDefaultSslCtlIdentifier,
                pDefaultSslCtlStoreNameCtorArg = pDefaultSslCtlStoreName,
                defaultFlags = defaultFlags,
            )
    }
}

public data class HttpServiceConfigSslParamEx(
    public var paramType: HttpSslServiceConfigExParamType = 0,
    public var flags: ULong = 0uL,
    public var anonymous: HttpServiceConfigSslParamEx0 = HttpServiceConfigSslParamEx0(),
)

public data class HttpServiceConfigSslParamEx0(
    public var http2WindowSizeParam: Http2WindowSizeParam = Http2WindowSizeParam(),
    public var http2SettingsLimitsParam: Http2SettingsLimitsParam = Http2SettingsLimitsParam(),
    public var httpPerformanceParam: HttpPerformanceParam = HttpPerformanceParam(),
    public var httpTlsRestrictionsParam: HttpTlsRestrictionsParam = HttpTlsRestrictionsParam(),
    public var httpErrorHeadersParam: HttpErrorHeadersParam = HttpErrorHeadersParam(),
    public var httpTlsSessionTicketKeysParam: HttpTlsSessionTicketKeysParam = HttpTlsSessionTicketKeysParam(),
)

public data class HttpServiceConfigSslQuery(
    public var queryDesc: HttpServiceConfigQueryType = 0,
    public var keyDesc: HttpServiceConfigSslKey = HttpServiceConfigSslKey(),
    public var dwToken: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpServiceConfigSslQuery> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpServiceConfigSslQuery> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): HttpServiceConfigSslQuery =
                    HttpServiceConfigSslQuery(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (HttpServiceConfigSslKey.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: HttpServiceConfigSslQuery) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.queryDesc)
                    (HttpServiceConfigSslKey.typeLayout()).writeNative(addr + 8L, value.keyDesc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwToken)
                }
            }
    }
}

public data class HttpServiceConfigSslQueryEx(
    public var queryDesc: HttpServiceConfigQueryType = 0,
    public var keyDesc: HttpServiceConfigSslKeyEx = HttpServiceConfigSslKeyEx(),
    public var dwToken: UInt = 0u,
    public var paramType: HttpSslServiceConfigExParamType = 0,
)

public data class HttpServiceConfigSslSet(
    public var keyDesc: HttpServiceConfigSslKey = HttpServiceConfigSslKey(),
    public var paramDesc: HttpServiceConfigSslParam = HttpServiceConfigSslParam(),
)

public data class HttpServiceConfigSslSetEx(
    public var keyDesc: HttpServiceConfigSslKeyEx = HttpServiceConfigSslKeyEx(),
    public var paramDesc: HttpServiceConfigSslParamEx = HttpServiceConfigSslParamEx(),
)

public class HttpServiceConfigSslSniKey internal constructor(
    public var ipPort: SockaddrStorage,
    hostCtorArg: Pwstr,
) {
    public var host: Pwstr = hostCtorArg
        internal set

    public constructor() : this(
        ipPort = SockaddrStorage(),
        hostCtorArg = MutPtr(0L),
    )

    public operator fun component1(): SockaddrStorage = this.ipPort

    public operator fun component2(): Pwstr = this.host

    public fun copy(ipPort: SockaddrStorage = this.ipPort, host: Pwstr = this.host): HttpServiceConfigSslSniKey = HttpServiceConfigSslSniKey(ipPort = ipPort, hostCtorArg = host)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpServiceConfigSslSniKey) return false
        if (this.ipPort != other.ipPort) return false
        if (this.host != other.host) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ipPort.hashCode()
        result = 31 * result + this.host.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ipPort: SockaddrStorage = SockaddrStorage(),
            host: Pwstr = MutPtr(0L),
        ): HttpServiceConfigSslSniKey =
            HttpServiceConfigSslSniKey(
                ipPort = ipPort,
                hostCtorArg = host,
            )
    }
}

public data class HttpServiceConfigSslSniQuery(
    public var queryDesc: HttpServiceConfigQueryType = 0,
    public var keyDesc: HttpServiceConfigSslSniKey = HttpServiceConfigSslSniKey(),
    public var dwToken: UInt = 0u,
)

public data class HttpServiceConfigSslSniQueryEx(
    public var queryDesc: HttpServiceConfigQueryType = 0,
    public var keyDesc: HttpServiceConfigSslSniKey = HttpServiceConfigSslSniKey(),
    public var dwToken: UInt = 0u,
    public var paramType: HttpSslServiceConfigExParamType = 0,
)

public data class HttpServiceConfigSslSniSet(
    public var keyDesc: HttpServiceConfigSslSniKey = HttpServiceConfigSslSniKey(),
    public var paramDesc: HttpServiceConfigSslParam = HttpServiceConfigSslParam(),
)

public data class HttpServiceConfigSslSniSetEx(
    public var keyDesc: HttpServiceConfigSslSniKey = HttpServiceConfigSslSniKey(),
    public var paramDesc: HttpServiceConfigSslParamEx = HttpServiceConfigSslParamEx(),
)

public data class HttpServiceConfigTimeoutSet(
    public var keyDesc: HttpServiceConfigTimeoutKey = 0,
    public var paramDesc: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpServiceConfigTimeoutSet> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpServiceConfigTimeoutSet> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): HttpServiceConfigTimeoutSet =
                    HttpServiceConfigTimeoutSet(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: HttpServiceConfigTimeoutSet) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.keyDesc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.paramDesc)
                }
            }
    }
}

public class HttpServiceConfigUrlaclKey internal constructor(
    pUrlPrefixCtorArg: Pwstr,
) {
    public var pUrlPrefix: Pwstr = pUrlPrefixCtorArg
        internal set

    public constructor() : this(
        pUrlPrefixCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pUrlPrefix

    public fun copy(pUrlPrefix: Pwstr = this.pUrlPrefix): HttpServiceConfigUrlaclKey = HttpServiceConfigUrlaclKey(pUrlPrefixCtorArg = pUrlPrefix)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpServiceConfigUrlaclKey) return false
        if (this.pUrlPrefix != other.pUrlPrefix) return false
        return true
    }

    override fun hashCode(): Int = this.pUrlPrefix.hashCode()

    public companion object {
        public operator fun invoke(
            pUrlPrefix: Pwstr = MutPtr(0L),
        ): HttpServiceConfigUrlaclKey =
            HttpServiceConfigUrlaclKey(
                pUrlPrefixCtorArg = pUrlPrefix,
            )
    }
}

public class HttpServiceConfigUrlaclParam internal constructor(
    pStringSecurityDescriptorCtorArg: Pwstr,
) {
    public var pStringSecurityDescriptor: Pwstr = pStringSecurityDescriptorCtorArg
        internal set

    public constructor() : this(
        pStringSecurityDescriptorCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pStringSecurityDescriptor

    public fun copy(pStringSecurityDescriptor: Pwstr = this.pStringSecurityDescriptor): HttpServiceConfigUrlaclParam = HttpServiceConfigUrlaclParam(pStringSecurityDescriptorCtorArg = pStringSecurityDescriptor)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpServiceConfigUrlaclParam) return false
        if (this.pStringSecurityDescriptor != other.pStringSecurityDescriptor) return false
        return true
    }

    override fun hashCode(): Int = this.pStringSecurityDescriptor.hashCode()

    public companion object {
        public operator fun invoke(
            pStringSecurityDescriptor: Pwstr = MutPtr(0L),
        ): HttpServiceConfigUrlaclParam =
            HttpServiceConfigUrlaclParam(
                pStringSecurityDescriptorCtorArg = pStringSecurityDescriptor,
            )
    }
}

public data class HttpServiceConfigUrlaclQuery(
    public var queryDesc: HttpServiceConfigQueryType = 0,
    public var keyDesc: HttpServiceConfigUrlaclKey = HttpServiceConfigUrlaclKey(),
    public var dwToken: UInt = 0u,
)

public data class HttpServiceConfigUrlaclSet(
    public var keyDesc: HttpServiceConfigUrlaclKey = HttpServiceConfigUrlaclKey(),
    public var paramDesc: HttpServiceConfigUrlaclParam = HttpServiceConfigUrlaclParam(),
)

public class HttpSslClientCertInfo internal constructor(
    public var certFlags: UInt,
    public var certEncodedSize: UInt,
    pCertEncodedCtorArg: MutPtr<UByte>,
    tokenCtorArg: Handle,
    public var certDeniedByMapper: Boolean,
) {
    public var pCertEncoded: MutPtr<UByte> = pCertEncodedCtorArg
        internal set

    public var token: Handle = tokenCtorArg
        internal set

    public constructor() : this(
        certFlags = 0u,
        certEncodedSize = 0u,
        pCertEncodedCtorArg = MutPtr(0L),
        tokenCtorArg = MutPtr(0L),
        certDeniedByMapper = false,
    )

    public operator fun component1(): UInt = this.certFlags

    public operator fun component2(): UInt = this.certEncodedSize

    public operator fun component3(): MutPtr<UByte> = this.pCertEncoded

    public operator fun component4(): Handle = this.token

    public operator fun component5(): Boolean = this.certDeniedByMapper

    public fun copy(certFlags: UInt = this.certFlags, certEncodedSize: UInt = this.certEncodedSize, pCertEncoded: MutPtr<UByte> = this.pCertEncoded, token: Handle = this.token, certDeniedByMapper: Boolean = this.certDeniedByMapper): HttpSslClientCertInfo = HttpSslClientCertInfo(certFlags = certFlags, certEncodedSize = certEncodedSize, pCertEncodedCtorArg = pCertEncoded, tokenCtorArg = token, certDeniedByMapper = certDeniedByMapper)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpSslClientCertInfo) return false
        if (this.certFlags != other.certFlags) return false
        if (this.certEncodedSize != other.certEncodedSize) return false
        if (this.pCertEncoded != other.pCertEncoded) return false
        if (this.token != other.token) return false
        if (this.certDeniedByMapper != other.certDeniedByMapper) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.certFlags.hashCode()
        result = 31 * result + this.certEncodedSize.hashCode()
        result = 31 * result + this.pCertEncoded.hashCode()
        result = 31 * result + this.token.hashCode()
        result = 31 * result + this.certDeniedByMapper.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            certFlags: UInt = 0u,
            certEncodedSize: UInt = 0u,
            pCertEncoded: MutPtr<UByte> = MutPtr(0L),
            token: Handle = MutPtr(0L),
            certDeniedByMapper: Boolean = false,
        ): HttpSslClientCertInfo =
            HttpSslClientCertInfo(
                certFlags = certFlags,
                certEncodedSize = certEncodedSize,
                pCertEncodedCtorArg = pCertEncoded,
                tokenCtorArg = token,
                certDeniedByMapper = certDeniedByMapper,
            )
    }
}

public class HttpSslInfo internal constructor(
    public var serverCertKeySize: UShort,
    public var connectionKeySize: UShort,
    public var serverCertIssuerSize: UInt,
    public var serverCertSubjectSize: UInt,
    pServerCertIssuerCtorArg: Pcstr,
    pServerCertSubjectCtorArg: Pcstr,
    pClientCertInfoCtorArg: MutPtr<HttpSslClientCertInfo>,
    public var sslClientCertNegotiated: UInt,
) {
    public var pServerCertIssuer: Pcstr = pServerCertIssuerCtorArg
        internal set

    public var pServerCertSubject: Pcstr = pServerCertSubjectCtorArg
        internal set

    public var pClientCertInfo: MutPtr<HttpSslClientCertInfo> = pClientCertInfoCtorArg
        internal set

    public constructor() : this(
        serverCertKeySize = 0u,
        connectionKeySize = 0u,
        serverCertIssuerSize = 0u,
        serverCertSubjectSize = 0u,
        pServerCertIssuerCtorArg = ConstPtr(0L),
        pServerCertSubjectCtorArg = ConstPtr(0L),
        pClientCertInfoCtorArg = MutPtr(0L),
        sslClientCertNegotiated = 0u,
    )

    public operator fun component1(): UShort = this.serverCertKeySize

    public operator fun component2(): UShort = this.connectionKeySize

    public operator fun component3(): UInt = this.serverCertIssuerSize

    public operator fun component4(): UInt = this.serverCertSubjectSize

    public operator fun component5(): Pcstr = this.pServerCertIssuer

    public operator fun component6(): Pcstr = this.pServerCertSubject

    public operator fun component7(): MutPtr<HttpSslClientCertInfo> = this.pClientCertInfo

    public operator fun component8(): UInt = this.sslClientCertNegotiated

    public fun copy(serverCertKeySize: UShort = this.serverCertKeySize, connectionKeySize: UShort = this.connectionKeySize, serverCertIssuerSize: UInt = this.serverCertIssuerSize, serverCertSubjectSize: UInt = this.serverCertSubjectSize, pServerCertIssuer: Pcstr = this.pServerCertIssuer, pServerCertSubject: Pcstr = this.pServerCertSubject, pClientCertInfo: MutPtr<HttpSslClientCertInfo> = this.pClientCertInfo, sslClientCertNegotiated: UInt = this.sslClientCertNegotiated): HttpSslInfo = HttpSslInfo(serverCertKeySize = serverCertKeySize, connectionKeySize = connectionKeySize, serverCertIssuerSize = serverCertIssuerSize, serverCertSubjectSize = serverCertSubjectSize, pServerCertIssuerCtorArg = pServerCertIssuer, pServerCertSubjectCtorArg = pServerCertSubject, pClientCertInfoCtorArg = pClientCertInfo, sslClientCertNegotiated = sslClientCertNegotiated)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpSslInfo) return false
        if (this.serverCertKeySize != other.serverCertKeySize) return false
        if (this.connectionKeySize != other.connectionKeySize) return false
        if (this.serverCertIssuerSize != other.serverCertIssuerSize) return false
        if (this.serverCertSubjectSize != other.serverCertSubjectSize) return false
        if (this.pServerCertIssuer != other.pServerCertIssuer) return false
        if (this.pServerCertSubject != other.pServerCertSubject) return false
        if (this.pClientCertInfo != other.pClientCertInfo) return false
        if (this.sslClientCertNegotiated != other.sslClientCertNegotiated) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.serverCertKeySize.hashCode()
        result = 31 * result + this.connectionKeySize.hashCode()
        result = 31 * result + this.serverCertIssuerSize.hashCode()
        result = 31 * result + this.serverCertSubjectSize.hashCode()
        result = 31 * result + this.pServerCertIssuer.hashCode()
        result = 31 * result + this.pServerCertSubject.hashCode()
        result = 31 * result + this.pClientCertInfo.hashCode()
        result = 31 * result + this.sslClientCertNegotiated.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            serverCertKeySize: UShort = 0u,
            connectionKeySize: UShort = 0u,
            serverCertIssuerSize: UInt = 0u,
            serverCertSubjectSize: UInt = 0u,
            pServerCertIssuer: Pcstr = ConstPtr(0L),
            pServerCertSubject: Pcstr = ConstPtr(0L),
            pClientCertInfo: MutPtr<HttpSslClientCertInfo> = MutPtr(0L),
            sslClientCertNegotiated: UInt = 0u,
        ): HttpSslInfo =
            HttpSslInfo(
                serverCertKeySize = serverCertKeySize,
                connectionKeySize = connectionKeySize,
                serverCertIssuerSize = serverCertIssuerSize,
                serverCertSubjectSize = serverCertSubjectSize,
                pServerCertIssuerCtorArg = pServerCertIssuer,
                pServerCertSubjectCtorArg = pServerCertSubject,
                pClientCertInfoCtorArg = pClientCertInfo,
                sslClientCertNegotiated = sslClientCertNegotiated,
            )
    }
}

public data class HttpSslProtocolInfo(
    public var protocol: UInt = 0u,
    public var cipherType: UInt = 0u,
    public var cipherStrength: UInt = 0u,
    public var hashType: UInt = 0u,
    public var hashStrength: UInt = 0u,
    public var keyExchangeType: UInt = 0u,
    public var keyExchangeStrength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpSslProtocolInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpSslProtocolInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): HttpSslProtocolInfo =
                    HttpSslProtocolInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: HttpSslProtocolInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.protocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cipherType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cipherStrength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.hashType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.hashStrength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.keyExchangeType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.keyExchangeStrength)
                }
            }
    }
}

public data class HttpStateInfo(
    public var flags: HttpPropertyFlags = HttpPropertyFlags(),
    public var state: HttpEnabledState = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpStateInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpStateInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): HttpStateInfo =
                    HttpStateInfo(
                        (HttpPropertyFlags.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: HttpStateInfo) {
                    (HttpPropertyFlags.typeLayout()).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.state)
                }
            }
    }
}

public data class HttpTimeoutLimitInfo(
    public var flags: HttpPropertyFlags = HttpPropertyFlags(),
    public var entityBody: UShort = 0u,
    public var drainEntityBody: UShort = 0u,
    public var requestQueue: UShort = 0u,
    public var idleConnection: UShort = 0u,
    public var headerWait: UShort = 0u,
    public var minSendRate: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpTimeoutLimitInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpTimeoutLimitInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): HttpTimeoutLimitInfo =
                    HttpTimeoutLimitInfo(
                        (HttpPropertyFlags.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: HttpTimeoutLimitInfo) {
                    (HttpPropertyFlags.typeLayout()).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.entityBody)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.drainEntityBody)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.requestQueue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.idleConnection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.headerWait)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.minSendRate)
                }
            }
    }
}

public class HttpTlsRestrictionsParam internal constructor(
    public var restrictionCount: UInt,
    tlsRestrictionsCtorArg: MutPtr<CVoid>,
) {
    public var tlsRestrictions: MutPtr<CVoid> = tlsRestrictionsCtorArg
        internal set

    public constructor() : this(
        restrictionCount = 0u,
        tlsRestrictionsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.restrictionCount

    public operator fun component2(): MutPtr<CVoid> = this.tlsRestrictions

    public fun copy(restrictionCount: UInt = this.restrictionCount, tlsRestrictions: MutPtr<CVoid> = this.tlsRestrictions): HttpTlsRestrictionsParam = HttpTlsRestrictionsParam(restrictionCount = restrictionCount, tlsRestrictionsCtorArg = tlsRestrictions)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpTlsRestrictionsParam) return false
        if (this.restrictionCount != other.restrictionCount) return false
        if (this.tlsRestrictions != other.tlsRestrictions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.restrictionCount.hashCode()
        result = 31 * result + this.tlsRestrictions.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpTlsRestrictionsParam> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpTlsRestrictionsParam> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): HttpTlsRestrictionsParam =
                    HttpTlsRestrictionsParam(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: HttpTlsRestrictionsParam) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.restrictionCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.tlsRestrictions)
                }
            }

        public operator fun invoke(
            restrictionCount: UInt = 0u,
            tlsRestrictions: MutPtr<CVoid> = MutPtr(0L),
        ): HttpTlsRestrictionsParam =
            HttpTlsRestrictionsParam(
                restrictionCount = restrictionCount,
                tlsRestrictionsCtorArg = tlsRestrictions,
            )
    }
}

public class HttpTlsSessionTicketKeysParam internal constructor(
    public var sessionTicketKeyCount: UInt,
    sessionTicketKeysCtorArg: MutPtr<CVoid>,
) {
    public var sessionTicketKeys: MutPtr<CVoid> = sessionTicketKeysCtorArg
        internal set

    public constructor() : this(
        sessionTicketKeyCount = 0u,
        sessionTicketKeysCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.sessionTicketKeyCount

    public operator fun component2(): MutPtr<CVoid> = this.sessionTicketKeys

    public fun copy(sessionTicketKeyCount: UInt = this.sessionTicketKeyCount, sessionTicketKeys: MutPtr<CVoid> = this.sessionTicketKeys): HttpTlsSessionTicketKeysParam = HttpTlsSessionTicketKeysParam(sessionTicketKeyCount = sessionTicketKeyCount, sessionTicketKeysCtorArg = sessionTicketKeys)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpTlsSessionTicketKeysParam) return false
        if (this.sessionTicketKeyCount != other.sessionTicketKeyCount) return false
        if (this.sessionTicketKeys != other.sessionTicketKeys) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sessionTicketKeyCount.hashCode()
        result = 31 * result + this.sessionTicketKeys.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpTlsSessionTicketKeysParam> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpTlsSessionTicketKeysParam> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): HttpTlsSessionTicketKeysParam =
                    HttpTlsSessionTicketKeysParam(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: HttpTlsSessionTicketKeysParam) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sessionTicketKeyCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.sessionTicketKeys)
                }
            }

        public operator fun invoke(
            sessionTicketKeyCount: UInt = 0u,
            sessionTicketKeys: MutPtr<CVoid> = MutPtr(0L),
        ): HttpTlsSessionTicketKeysParam =
            HttpTlsSessionTicketKeysParam(
                sessionTicketKeyCount = sessionTicketKeyCount,
                sessionTicketKeysCtorArg = sessionTicketKeys,
            )
    }
}

public class HttpTransportAddress internal constructor(
    pRemoteAddressCtorArg: MutPtr<Sockaddr>,
    pLocalAddressCtorArg: MutPtr<Sockaddr>,
) {
    public var pRemoteAddress: MutPtr<Sockaddr> = pRemoteAddressCtorArg
        internal set

    public var pLocalAddress: MutPtr<Sockaddr> = pLocalAddressCtorArg
        internal set

    public constructor() : this(
        pRemoteAddressCtorArg = MutPtr(0L),
        pLocalAddressCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Sockaddr> = this.pRemoteAddress

    public operator fun component2(): MutPtr<Sockaddr> = this.pLocalAddress

    public fun copy(pRemoteAddress: MutPtr<Sockaddr> = this.pRemoteAddress, pLocalAddress: MutPtr<Sockaddr> = this.pLocalAddress): HttpTransportAddress = HttpTransportAddress(pRemoteAddressCtorArg = pRemoteAddress, pLocalAddressCtorArg = pLocalAddress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpTransportAddress) return false
        if (this.pRemoteAddress != other.pRemoteAddress) return false
        if (this.pLocalAddress != other.pLocalAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pRemoteAddress.hashCode()
        result = 31 * result + this.pLocalAddress.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpTransportAddress> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpTransportAddress> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): HttpTransportAddress =
                    HttpTransportAddress(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Sockaddr>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Sockaddr>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: HttpTransportAddress) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Sockaddr>(64)
                    ).writeNative(addr, value.pRemoteAddress)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Sockaddr>(64)
                    ).writeNative(addr + 8L, value.pLocalAddress)
                }
            }

        public operator fun invoke(
            pRemoteAddress: MutPtr<Sockaddr> = MutPtr(0L),
            pLocalAddress: MutPtr<Sockaddr> = MutPtr(0L),
        ): HttpTransportAddress =
            HttpTransportAddress(
                pRemoteAddressCtorArg = pRemoteAddress,
                pLocalAddressCtorArg = pLocalAddress,
            )
    }
}

public class HttpUnknownHeader internal constructor(
    public var nameLength: UShort,
    public var rawValueLength: UShort,
    pNameCtorArg: Pcstr,
    pRawValueCtorArg: Pcstr,
) {
    public var pName: Pcstr = pNameCtorArg
        internal set

    public var pRawValue: Pcstr = pRawValueCtorArg
        internal set

    public constructor() : this(
        nameLength = 0u,
        rawValueLength = 0u,
        pNameCtorArg = ConstPtr(0L),
        pRawValueCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UShort = this.nameLength

    public operator fun component2(): UShort = this.rawValueLength

    public operator fun component3(): Pcstr = this.pName

    public operator fun component4(): Pcstr = this.pRawValue

    public fun copy(nameLength: UShort = this.nameLength, rawValueLength: UShort = this.rawValueLength, pName: Pcstr = this.pName, pRawValue: Pcstr = this.pRawValue): HttpUnknownHeader = HttpUnknownHeader(nameLength = nameLength, rawValueLength = rawValueLength, pNameCtorArg = pName, pRawValueCtorArg = pRawValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpUnknownHeader) return false
        if (this.nameLength != other.nameLength) return false
        if (this.rawValueLength != other.rawValueLength) return false
        if (this.pName != other.pName) return false
        if (this.pRawValue != other.pRawValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nameLength.hashCode()
        result = 31 * result + this.rawValueLength.hashCode()
        result = 31 * result + this.pName.hashCode()
        result = 31 * result + this.pRawValue.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            nameLength: UShort = 0u,
            rawValueLength: UShort = 0u,
            pName: Pcstr = ConstPtr(0L),
            pRawValue: Pcstr = ConstPtr(0L),
        ): HttpUnknownHeader =
            HttpUnknownHeader(
                nameLength = nameLength,
                rawValueLength = rawValueLength,
                pNameCtorArg = pName,
                pRawValueCtorArg = pRawValue,
            )
    }
}

public data class HttpVersion(
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpVersion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpVersion> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): HttpVersion =
                    HttpVersion(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: HttpVersion) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.majorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.minorVersion)
                }
            }
    }
}

public data class HttpWskApiTimings(
    public var connectCount: ULong = 0uL,
    public var connectSum: ULong = 0uL,
    public var disconnectCount: ULong = 0uL,
    public var disconnectSum: ULong = 0uL,
    public var sendCount: ULong = 0uL,
    public var sendSum: ULong = 0uL,
    public var receiveCount: ULong = 0uL,
    public var receiveSum: ULong = 0uL,
    public var releaseCount: ULong = 0uL,
    public var releaseSum: ULong = 0uL,
    public var controlSocketCount: ULong = 0uL,
    public var controlSocketSum: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpWskApiTimings> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpWskApiTimings> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 96L
                override fun readNative(addr: Long): HttpWskApiTimings =
                    HttpWskApiTimings(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                    )
                override fun writeNative(addr: Long, value: HttpWskApiTimings) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.connectCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.connectSum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.disconnectCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.disconnectSum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.sendCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.sendSum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.receiveCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.receiveSum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.releaseCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.releaseSum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.controlSocketCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.controlSocketSum)
                }
            }
    }
}
