package io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertContext
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.Hcertstore

public class RequestbodyGetStatus internal constructor(
    anyCtorArg: MutPtr<WsdxmlElement>,
) {
    public var any: MutPtr<WsdxmlElement> = anyCtorArg
        internal set

    public constructor() : this(
        anyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdxmlElement> = this.any

    public fun copy(any: MutPtr<WsdxmlElement> = this.any): RequestbodyGetStatus = RequestbodyGetStatus(anyCtorArg = any)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RequestbodyGetStatus) return false
        if (this.any != other.any) return false
        return true
    }

    override fun hashCode(): Int = this.any.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RequestbodyGetStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RequestbodyGetStatus> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RequestbodyGetStatus =
                    RequestbodyGetStatus(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdxmlElement>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: RequestbodyGetStatus) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdxmlElement>(64)
                    ).writeNative(addr, value.any)
                }
            }

        public operator fun invoke(
            any: MutPtr<WsdxmlElement> = MutPtr(0L),
        ): RequestbodyGetStatus =
            RequestbodyGetStatus(
                anyCtorArg = any,
            )
    }
}

public class RequestbodyRenew internal constructor(
    expiresCtorArg: MutPtr<WsdEventingExpires>,
    anyCtorArg: MutPtr<WsdxmlElement>,
) {
    public var expires: MutPtr<WsdEventingExpires> = expiresCtorArg
        internal set

    public var any: MutPtr<WsdxmlElement> = anyCtorArg
        internal set

    public constructor() : this(
        expiresCtorArg = MutPtr(0L),
        anyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdEventingExpires> = this.expires

    public operator fun component2(): MutPtr<WsdxmlElement> = this.any

    public fun copy(expires: MutPtr<WsdEventingExpires> = this.expires, any: MutPtr<WsdxmlElement> = this.any): RequestbodyRenew = RequestbodyRenew(expiresCtorArg = expires, anyCtorArg = any)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RequestbodyRenew) return false
        if (this.expires != other.expires) return false
        if (this.any != other.any) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.expires.hashCode()
        result = 31 * result + this.any.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RequestbodyRenew> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RequestbodyRenew> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RequestbodyRenew =
                    RequestbodyRenew(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdEventingExpires>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdxmlElement>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: RequestbodyRenew) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdEventingExpires>(64)
                    ).writeNative(addr, value.expires)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdxmlElement>(64)
                    ).writeNative(addr + 8L, value.any)
                }
            }

        public operator fun invoke(
            expires: MutPtr<WsdEventingExpires> = MutPtr(0L),
            any: MutPtr<WsdxmlElement> = MutPtr(0L),
        ): RequestbodyRenew =
            RequestbodyRenew(
                expiresCtorArg = expires,
                anyCtorArg = any,
            )
    }
}

public class RequestbodySubscribe internal constructor(
    endToCtorArg: MutPtr<WsdEndpointReference>,
    deliveryCtorArg: MutPtr<WsdEventingDeliveryMode>,
    expiresCtorArg: MutPtr<WsdEventingExpires>,
    filterCtorArg: MutPtr<WsdEventingFilter>,
    anyCtorArg: MutPtr<WsdxmlElement>,
) {
    public var endTo: MutPtr<WsdEndpointReference> = endToCtorArg
        internal set

    public var delivery: MutPtr<WsdEventingDeliveryMode> = deliveryCtorArg
        internal set

    public var expires: MutPtr<WsdEventingExpires> = expiresCtorArg
        internal set

    public var filter: MutPtr<WsdEventingFilter> = filterCtorArg
        internal set

    public var any: MutPtr<WsdxmlElement> = anyCtorArg
        internal set

    public constructor() : this(
        endToCtorArg = MutPtr(0L),
        deliveryCtorArg = MutPtr(0L),
        expiresCtorArg = MutPtr(0L),
        filterCtorArg = MutPtr(0L),
        anyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdEndpointReference> = this.endTo

    public operator fun component2(): MutPtr<WsdEventingDeliveryMode> = this.delivery

    public operator fun component3(): MutPtr<WsdEventingExpires> = this.expires

    public operator fun component4(): MutPtr<WsdEventingFilter> = this.filter

    public operator fun component5(): MutPtr<WsdxmlElement> = this.any

    public fun copy(endTo: MutPtr<WsdEndpointReference> = this.endTo, delivery: MutPtr<WsdEventingDeliveryMode> = this.delivery, expires: MutPtr<WsdEventingExpires> = this.expires, filter: MutPtr<WsdEventingFilter> = this.filter, any: MutPtr<WsdxmlElement> = this.any): RequestbodySubscribe = RequestbodySubscribe(endToCtorArg = endTo, deliveryCtorArg = delivery, expiresCtorArg = expires, filterCtorArg = filter, anyCtorArg = any)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RequestbodySubscribe) return false
        if (this.endTo != other.endTo) return false
        if (this.delivery != other.delivery) return false
        if (this.expires != other.expires) return false
        if (this.filter != other.filter) return false
        if (this.any != other.any) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.endTo.hashCode()
        result = 31 * result + this.delivery.hashCode()
        result = 31 * result + this.expires.hashCode()
        result = 31 * result + this.filter.hashCode()
        result = 31 * result + this.any.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RequestbodySubscribe> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RequestbodySubscribe> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RequestbodySubscribe =
                    RequestbodySubscribe(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdEndpointReference>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdEventingDeliveryMode>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdEventingExpires>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdEventingFilter>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdxmlElement>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: RequestbodySubscribe) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdEndpointReference>(64)
                    ).writeNative(addr, value.endTo)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdEventingDeliveryMode>(64)
                    ).writeNative(addr + 8L, value.delivery)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdEventingExpires>(64)
                    ).writeNative(addr + 16L, value.expires)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdEventingFilter>(64)
                    ).writeNative(addr + 24L, value.filter)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdxmlElement>(64)
                    ).writeNative(addr + 32L, value.any)
                }
            }

        public operator fun invoke(
            endTo: MutPtr<WsdEndpointReference> = MutPtr(0L),
            delivery: MutPtr<WsdEventingDeliveryMode> = MutPtr(0L),
            expires: MutPtr<WsdEventingExpires> = MutPtr(0L),
            filter: MutPtr<WsdEventingFilter> = MutPtr(0L),
            any: MutPtr<WsdxmlElement> = MutPtr(0L),
        ): RequestbodySubscribe =
            RequestbodySubscribe(
                endToCtorArg = endTo,
                deliveryCtorArg = delivery,
                expiresCtorArg = expires,
                filterCtorArg = filter,
                anyCtorArg = any,
            )
    }
}

public class RequestbodyUnsubscribe internal constructor(
    anyCtorArg: MutPtr<WsdxmlElement>,
) {
    public var any: MutPtr<WsdxmlElement> = anyCtorArg
        internal set

    public constructor() : this(
        anyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdxmlElement> = this.any

    public fun copy(any: MutPtr<WsdxmlElement> = this.any): RequestbodyUnsubscribe = RequestbodyUnsubscribe(anyCtorArg = any)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RequestbodyUnsubscribe) return false
        if (this.any != other.any) return false
        return true
    }

    override fun hashCode(): Int = this.any.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RequestbodyUnsubscribe> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RequestbodyUnsubscribe> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RequestbodyUnsubscribe =
                    RequestbodyUnsubscribe(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdxmlElement>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: RequestbodyUnsubscribe) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdxmlElement>(64)
                    ).writeNative(addr, value.any)
                }
            }

        public operator fun invoke(
            any: MutPtr<WsdxmlElement> = MutPtr(0L),
        ): RequestbodyUnsubscribe =
            RequestbodyUnsubscribe(
                anyCtorArg = any,
            )
    }
}

public class ResponsebodyGetMetadata internal constructor(
    metadataCtorArg: MutPtr<WsdMetadataSectionList>,
) {
    public var metadata: MutPtr<WsdMetadataSectionList> = metadataCtorArg
        internal set

    public constructor() : this(
        metadataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdMetadataSectionList> = this.metadata

    public fun copy(metadata: MutPtr<WsdMetadataSectionList> = this.metadata): ResponsebodyGetMetadata = ResponsebodyGetMetadata(metadataCtorArg = metadata)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ResponsebodyGetMetadata) return false
        if (this.metadata != other.metadata) return false
        return true
    }

    override fun hashCode(): Int = this.metadata.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ResponsebodyGetMetadata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ResponsebodyGetMetadata> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ResponsebodyGetMetadata =
                    ResponsebodyGetMetadata(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdMetadataSectionList>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ResponsebodyGetMetadata) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdMetadataSectionList>(64)
                    ).writeNative(addr, value.metadata)
                }
            }

        public operator fun invoke(
            metadata: MutPtr<WsdMetadataSectionList> = MutPtr(0L),
        ): ResponsebodyGetMetadata =
            ResponsebodyGetMetadata(
                metadataCtorArg = metadata,
            )
    }
}

public class ResponsebodyGetStatus internal constructor(
    expiresCtorArg: MutPtr<WsdEventingExpires>,
    anyCtorArg: MutPtr<WsdxmlElement>,
) {
    public var expires: MutPtr<WsdEventingExpires> = expiresCtorArg
        internal set

    public var any: MutPtr<WsdxmlElement> = anyCtorArg
        internal set

    public constructor() : this(
        expiresCtorArg = MutPtr(0L),
        anyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdEventingExpires> = this.expires

    public operator fun component2(): MutPtr<WsdxmlElement> = this.any

    public fun copy(expires: MutPtr<WsdEventingExpires> = this.expires, any: MutPtr<WsdxmlElement> = this.any): ResponsebodyGetStatus = ResponsebodyGetStatus(expiresCtorArg = expires, anyCtorArg = any)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ResponsebodyGetStatus) return false
        if (this.expires != other.expires) return false
        if (this.any != other.any) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.expires.hashCode()
        result = 31 * result + this.any.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ResponsebodyGetStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ResponsebodyGetStatus> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ResponsebodyGetStatus =
                    ResponsebodyGetStatus(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdEventingExpires>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdxmlElement>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ResponsebodyGetStatus) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdEventingExpires>(64)
                    ).writeNative(addr, value.expires)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdxmlElement>(64)
                    ).writeNative(addr + 8L, value.any)
                }
            }

        public operator fun invoke(
            expires: MutPtr<WsdEventingExpires> = MutPtr(0L),
            any: MutPtr<WsdxmlElement> = MutPtr(0L),
        ): ResponsebodyGetStatus =
            ResponsebodyGetStatus(
                expiresCtorArg = expires,
                anyCtorArg = any,
            )
    }
}

public class ResponsebodyRenew internal constructor(
    expiresCtorArg: MutPtr<WsdEventingExpires>,
    anyCtorArg: MutPtr<WsdxmlElement>,
) {
    public var expires: MutPtr<WsdEventingExpires> = expiresCtorArg
        internal set

    public var any: MutPtr<WsdxmlElement> = anyCtorArg
        internal set

    public constructor() : this(
        expiresCtorArg = MutPtr(0L),
        anyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdEventingExpires> = this.expires

    public operator fun component2(): MutPtr<WsdxmlElement> = this.any

    public fun copy(expires: MutPtr<WsdEventingExpires> = this.expires, any: MutPtr<WsdxmlElement> = this.any): ResponsebodyRenew = ResponsebodyRenew(expiresCtorArg = expires, anyCtorArg = any)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ResponsebodyRenew) return false
        if (this.expires != other.expires) return false
        if (this.any != other.any) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.expires.hashCode()
        result = 31 * result + this.any.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ResponsebodyRenew> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ResponsebodyRenew> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ResponsebodyRenew =
                    ResponsebodyRenew(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdEventingExpires>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdxmlElement>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ResponsebodyRenew) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdEventingExpires>(64)
                    ).writeNative(addr, value.expires)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdxmlElement>(64)
                    ).writeNative(addr + 8L, value.any)
                }
            }

        public operator fun invoke(
            expires: MutPtr<WsdEventingExpires> = MutPtr(0L),
            any: MutPtr<WsdxmlElement> = MutPtr(0L),
        ): ResponsebodyRenew =
            ResponsebodyRenew(
                expiresCtorArg = expires,
                anyCtorArg = any,
            )
    }
}

public class ResponsebodySubscribe internal constructor(
    subscriptionManagerCtorArg: MutPtr<WsdEndpointReference>,
    expiresCtorArg: MutPtr<WsdEventingExpires>,
    anyCtorArg: MutPtr<WsdxmlElement>,
) {
    public var subscriptionManager: MutPtr<WsdEndpointReference> = subscriptionManagerCtorArg
        internal set

    public var expires: MutPtr<WsdEventingExpires> = expiresCtorArg
        internal set

    public var any: MutPtr<WsdxmlElement> = anyCtorArg
        internal set

    public constructor() : this(
        subscriptionManagerCtorArg = MutPtr(0L),
        expiresCtorArg = MutPtr(0L),
        anyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdEndpointReference> = this.subscriptionManager

    public operator fun component2(): MutPtr<WsdEventingExpires> = this.expires

    public operator fun component3(): MutPtr<WsdxmlElement> = this.any

    public fun copy(subscriptionManager: MutPtr<WsdEndpointReference> = this.subscriptionManager, expires: MutPtr<WsdEventingExpires> = this.expires, any: MutPtr<WsdxmlElement> = this.any): ResponsebodySubscribe = ResponsebodySubscribe(subscriptionManagerCtorArg = subscriptionManager, expiresCtorArg = expires, anyCtorArg = any)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ResponsebodySubscribe) return false
        if (this.subscriptionManager != other.subscriptionManager) return false
        if (this.expires != other.expires) return false
        if (this.any != other.any) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.subscriptionManager.hashCode()
        result = 31 * result + this.expires.hashCode()
        result = 31 * result + this.any.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ResponsebodySubscribe> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ResponsebodySubscribe> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ResponsebodySubscribe =
                    ResponsebodySubscribe(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdEndpointReference>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdEventingExpires>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdxmlElement>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ResponsebodySubscribe) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdEndpointReference>(64)
                    ).writeNative(addr, value.subscriptionManager)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdEventingExpires>(64)
                    ).writeNative(addr + 8L, value.expires)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdxmlElement>(64)
                    ).writeNative(addr + 16L, value.any)
                }
            }

        public operator fun invoke(
            subscriptionManager: MutPtr<WsdEndpointReference> = MutPtr(0L),
            expires: MutPtr<WsdEventingExpires> = MutPtr(0L),
            any: MutPtr<WsdxmlElement> = MutPtr(0L),
        ): ResponsebodySubscribe =
            ResponsebodySubscribe(
                subscriptionManagerCtorArg = subscriptionManager,
                expiresCtorArg = expires,
                anyCtorArg = any,
            )
    }
}

public class ResponsebodySubscriptionEnd internal constructor(
    subscriptionManagerCtorArg: MutPtr<WsdEndpointReference>,
    statusCtorArg: Pcwstr,
    reasonCtorArg: MutPtr<WsdLocalizedString>,
    anyCtorArg: MutPtr<WsdxmlElement>,
) {
    public var subscriptionManager: MutPtr<WsdEndpointReference> = subscriptionManagerCtorArg
        internal set

    public var status: Pcwstr = statusCtorArg
        internal set

    public var reason: MutPtr<WsdLocalizedString> = reasonCtorArg
        internal set

    public var any: MutPtr<WsdxmlElement> = anyCtorArg
        internal set

    public constructor() : this(
        subscriptionManagerCtorArg = MutPtr(0L),
        statusCtorArg = ConstPtr(0L),
        reasonCtorArg = MutPtr(0L),
        anyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdEndpointReference> = this.subscriptionManager

    public operator fun component2(): Pcwstr = this.status

    public operator fun component3(): MutPtr<WsdLocalizedString> = this.reason

    public operator fun component4(): MutPtr<WsdxmlElement> = this.any

    public fun copy(subscriptionManager: MutPtr<WsdEndpointReference> = this.subscriptionManager, status: Pcwstr = this.status, reason: MutPtr<WsdLocalizedString> = this.reason, any: MutPtr<WsdxmlElement> = this.any): ResponsebodySubscriptionEnd = ResponsebodySubscriptionEnd(subscriptionManagerCtorArg = subscriptionManager, statusCtorArg = status, reasonCtorArg = reason, anyCtorArg = any)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ResponsebodySubscriptionEnd) return false
        if (this.subscriptionManager != other.subscriptionManager) return false
        if (this.status != other.status) return false
        if (this.reason != other.reason) return false
        if (this.any != other.any) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.subscriptionManager.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.reason.hashCode()
        result = 31 * result + this.any.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            subscriptionManager: MutPtr<WsdEndpointReference> = MutPtr(0L),
            status: Pcwstr = ConstPtr(0L),
            reason: MutPtr<WsdLocalizedString> = MutPtr(0L),
            any: MutPtr<WsdxmlElement> = MutPtr(0L),
        ): ResponsebodySubscriptionEnd =
            ResponsebodySubscriptionEnd(
                subscriptionManagerCtorArg = subscriptionManager,
                statusCtorArg = status,
                reasonCtorArg = reason,
                anyCtorArg = any,
            )
    }
}

public data class WSDUdpRetransmitParams(
    public var ulSendDelay: UInt = 0u,
    public var ulRepeat: UInt = 0u,
    public var ulRepeatMinDelay: UInt = 0u,
    public var ulRepeatMaxDelay: UInt = 0u,
    public var ulRepeatUpperDelay: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WSDUdpRetransmitParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WSDUdpRetransmitParams> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WSDUdpRetransmitParams =
                    WSDUdpRetransmitParams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WSDUdpRetransmitParams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulSendDelay)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ulRepeat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ulRepeatMinDelay)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.ulRepeatMaxDelay)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.ulRepeatUpperDelay)
                }
            }
    }
}

public class WsdxmlAttribute internal constructor(
    elementCtorArg: MutPtr<WsdxmlElement>,
    nextCtorArg: MutPtr<WsdxmlAttribute>,
    nameCtorArg: MutPtr<WsdxmlName>,
    valueCtorArg: Pwstr,
) {
    public var element: MutPtr<WsdxmlElement> = elementCtorArg
        internal set

    public var next: MutPtr<WsdxmlAttribute> = nextCtorArg
        internal set

    public var name: MutPtr<WsdxmlName> = nameCtorArg
        internal set

    public var value: Pwstr = valueCtorArg
        internal set

    public constructor() : this(
        elementCtorArg = MutPtr(0L),
        nextCtorArg = MutPtr(0L),
        nameCtorArg = MutPtr(0L),
        valueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdxmlElement> = this.element

    public operator fun component2(): MutPtr<WsdxmlAttribute> = this.next

    public operator fun component3(): MutPtr<WsdxmlName> = this.name

    public operator fun component4(): Pwstr = this.value

    public fun copy(element: MutPtr<WsdxmlElement> = this.element, next: MutPtr<WsdxmlAttribute> = this.next, name: MutPtr<WsdxmlName> = this.name, value: Pwstr = this.value): WsdxmlAttribute = WsdxmlAttribute(elementCtorArg = element, nextCtorArg = next, nameCtorArg = name, valueCtorArg = value)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdxmlAttribute) return false
        if (this.element != other.element) return false
        if (this.next != other.next) return false
        if (this.name != other.name) return false
        if (this.value != other.value) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.element.hashCode()
        result = 31 * result + this.next.hashCode()
        result = 31 * result + this.name.hashCode()
        result = 31 * result + this.value.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            element: MutPtr<WsdxmlElement> = MutPtr(0L),
            next: MutPtr<WsdxmlAttribute> = MutPtr(0L),
            name: MutPtr<WsdxmlName> = MutPtr(0L),
            value: Pwstr = MutPtr(0L),
        ): WsdxmlAttribute =
            WsdxmlAttribute(
                elementCtorArg = element,
                nextCtorArg = next,
                nameCtorArg = name,
                valueCtorArg = value,
            )
    }
}

public class WsdxmlElement internal constructor(
    public var node: WsdxmlNode,
    nameCtorArg: MutPtr<WsdxmlName>,
    firstAttributeCtorArg: MutPtr<WsdxmlAttribute>,
    firstChildCtorArg: MutPtr<WsdxmlNode>,
    prefixMappingsCtorArg: MutPtr<WsdxmlPrefixMapping>,
) {
    public var name: MutPtr<WsdxmlName> = nameCtorArg
        internal set

    public var firstAttribute: MutPtr<WsdxmlAttribute> = firstAttributeCtorArg
        internal set

    public var firstChild: MutPtr<WsdxmlNode> = firstChildCtorArg
        internal set

    public var prefixMappings: MutPtr<WsdxmlPrefixMapping> = prefixMappingsCtorArg
        internal set

    public constructor() : this(
        node = WsdxmlNode(),
        nameCtorArg = MutPtr(0L),
        firstAttributeCtorArg = MutPtr(0L),
        firstChildCtorArg = MutPtr(0L),
        prefixMappingsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WsdxmlNode = this.node

    public operator fun component2(): MutPtr<WsdxmlName> = this.name

    public operator fun component3(): MutPtr<WsdxmlAttribute> = this.firstAttribute

    public operator fun component4(): MutPtr<WsdxmlNode> = this.firstChild

    public operator fun component5(): MutPtr<WsdxmlPrefixMapping> = this.prefixMappings

    public fun copy(node: WsdxmlNode = this.node, name: MutPtr<WsdxmlName> = this.name, firstAttribute: MutPtr<WsdxmlAttribute> = this.firstAttribute, firstChild: MutPtr<WsdxmlNode> = this.firstChild, prefixMappings: MutPtr<WsdxmlPrefixMapping> = this.prefixMappings): WsdxmlElement = WsdxmlElement(node = node, nameCtorArg = name, firstAttributeCtorArg = firstAttribute, firstChildCtorArg = firstChild, prefixMappingsCtorArg = prefixMappings)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdxmlElement) return false
        if (this.node != other.node) return false
        if (this.name != other.name) return false
        if (this.firstAttribute != other.firstAttribute) return false
        if (this.firstChild != other.firstChild) return false
        if (this.prefixMappings != other.prefixMappings) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.node.hashCode()
        result = 31 * result + this.name.hashCode()
        result = 31 * result + this.firstAttribute.hashCode()
        result = 31 * result + this.firstChild.hashCode()
        result = 31 * result + this.prefixMappings.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdxmlElement> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdxmlElement> {
                override val sizeBytes: Long = 56L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsdxmlElement =
                    WsdxmlElement(
                        (WsdxmlNode.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdxmlName>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdxmlAttribute>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdxmlNode>(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdxmlPrefixMapping>(64)
                        ).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: WsdxmlElement) {
                    (WsdxmlNode.typeLayout()).writeNative(addr, value.node)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdxmlName>(64)
                    ).writeNative(addr + 24L, value.name)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdxmlAttribute>(64)
                    ).writeNative(addr + 32L, value.firstAttribute)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdxmlNode>(64)
                    ).writeNative(addr + 40L, value.firstChild)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdxmlPrefixMapping>(64)
                    ).writeNative(addr + 48L, value.prefixMappings)
                }
            }

        public operator fun invoke(
            node: WsdxmlNode = WsdxmlNode(),
            name: MutPtr<WsdxmlName> = MutPtr(0L),
            firstAttribute: MutPtr<WsdxmlAttribute> = MutPtr(0L),
            firstChild: MutPtr<WsdxmlNode> = MutPtr(0L),
            prefixMappings: MutPtr<WsdxmlPrefixMapping> = MutPtr(0L),
        ): WsdxmlElement =
            WsdxmlElement(
                node = node,
                nameCtorArg = name,
                firstAttributeCtorArg = firstAttribute,
                firstChildCtorArg = firstChild,
                prefixMappingsCtorArg = prefixMappings,
            )
    }
}

public class WsdxmlElementList internal constructor(
    nextCtorArg: MutPtr<WsdxmlElementList>,
    elementCtorArg: MutPtr<WsdxmlElement>,
) {
    public var next: MutPtr<WsdxmlElementList> = nextCtorArg
        internal set

    public var element: MutPtr<WsdxmlElement> = elementCtorArg
        internal set

    public constructor() : this(
        nextCtorArg = MutPtr(0L),
        elementCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdxmlElementList> = this.next

    public operator fun component2(): MutPtr<WsdxmlElement> = this.element

    public fun copy(next: MutPtr<WsdxmlElementList> = this.next, element: MutPtr<WsdxmlElement> = this.element): WsdxmlElementList = WsdxmlElementList(nextCtorArg = next, elementCtorArg = element)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdxmlElementList) return false
        if (this.next != other.next) return false
        if (this.element != other.element) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.next.hashCode()
        result = 31 * result + this.element.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdxmlElementList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdxmlElementList> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsdxmlElementList =
                    WsdxmlElementList(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdxmlElementList>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdxmlElement>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsdxmlElementList) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdxmlElementList>(64)
                    ).writeNative(addr, value.next)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdxmlElement>(64)
                    ).writeNative(addr + 8L, value.element)
                }
            }

        public operator fun invoke(
            next: MutPtr<WsdxmlElementList> = MutPtr(0L),
            element: MutPtr<WsdxmlElement> = MutPtr(0L),
        ): WsdxmlElementList =
            WsdxmlElementList(
                nextCtorArg = next,
                elementCtorArg = element,
            )
    }
}

public class WsdxmlName internal constructor(
    spaceCtorArg: MutPtr<WsdxmlNamespace>,
    localNameCtorArg: Pwstr,
) {
    public var space: MutPtr<WsdxmlNamespace> = spaceCtorArg
        internal set

    public var localName: Pwstr = localNameCtorArg
        internal set

    public constructor() : this(
        spaceCtorArg = MutPtr(0L),
        localNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdxmlNamespace> = this.space

    public operator fun component2(): Pwstr = this.localName

    public fun copy(space: MutPtr<WsdxmlNamespace> = this.space, localName: Pwstr = this.localName): WsdxmlName = WsdxmlName(spaceCtorArg = space, localNameCtorArg = localName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdxmlName) return false
        if (this.space != other.space) return false
        if (this.localName != other.localName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.space.hashCode()
        result = 31 * result + this.localName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            space: MutPtr<WsdxmlNamespace> = MutPtr(0L),
            localName: Pwstr = MutPtr(0L),
        ): WsdxmlName =
            WsdxmlName(
                spaceCtorArg = space,
                localNameCtorArg = localName,
            )
    }
}

public class WsdxmlNamespace internal constructor(
    uriCtorArg: Pcwstr,
    preferredPrefixCtorArg: Pcwstr,
    namesCtorArg: MutPtr<WsdxmlName>,
    public var namesCount: UShort,
    public var encoding: UShort,
) {
    public var uri: Pcwstr = uriCtorArg
        internal set

    public var preferredPrefix: Pcwstr = preferredPrefixCtorArg
        internal set

    public var names: MutPtr<WsdxmlName> = namesCtorArg
        internal set

    public constructor() : this(
        uriCtorArg = ConstPtr(0L),
        preferredPrefixCtorArg = ConstPtr(0L),
        namesCtorArg = MutPtr(0L),
        namesCount = 0u,
        encoding = 0u,
    )

    public operator fun component1(): Pcwstr = this.uri

    public operator fun component2(): Pcwstr = this.preferredPrefix

    public operator fun component3(): MutPtr<WsdxmlName> = this.names

    public operator fun component4(): UShort = this.namesCount

    public operator fun component5(): UShort = this.encoding

    public fun copy(uri: Pcwstr = this.uri, preferredPrefix: Pcwstr = this.preferredPrefix, names: MutPtr<WsdxmlName> = this.names, namesCount: UShort = this.namesCount, encoding: UShort = this.encoding): WsdxmlNamespace = WsdxmlNamespace(uriCtorArg = uri, preferredPrefixCtorArg = preferredPrefix, namesCtorArg = names, namesCount = namesCount, encoding = encoding)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdxmlNamespace) return false
        if (this.uri != other.uri) return false
        if (this.preferredPrefix != other.preferredPrefix) return false
        if (this.names != other.names) return false
        if (this.namesCount != other.namesCount) return false
        if (this.encoding != other.encoding) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uri.hashCode()
        result = 31 * result + this.preferredPrefix.hashCode()
        result = 31 * result + this.names.hashCode()
        result = 31 * result + this.namesCount.hashCode()
        result = 31 * result + this.encoding.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            uri: Pcwstr = ConstPtr(0L),
            preferredPrefix: Pcwstr = ConstPtr(0L),
            names: MutPtr<WsdxmlName> = MutPtr(0L),
            namesCount: UShort = 0u,
            encoding: UShort = 0u,
        ): WsdxmlNamespace =
            WsdxmlNamespace(
                uriCtorArg = uri,
                preferredPrefixCtorArg = preferredPrefix,
                namesCtorArg = names,
                namesCount = namesCount,
                encoding = encoding,
            )
    }
}

public class WsdxmlNode internal constructor(
    public var type: Int,
    parentCtorArg: MutPtr<WsdxmlElement>,
    nextCtorArg: MutPtr<WsdxmlNode>,
) {
    public var parent: MutPtr<WsdxmlElement> = parentCtorArg
        internal set

    public var next: MutPtr<WsdxmlNode> = nextCtorArg
        internal set

    public constructor() : this(
        type = 0,
        parentCtorArg = MutPtr(0L),
        nextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.type

    public operator fun component2(): MutPtr<WsdxmlElement> = this.parent

    public operator fun component3(): MutPtr<WsdxmlNode> = this.next

    public fun copy(type: Int = this.type, parent: MutPtr<WsdxmlElement> = this.parent, next: MutPtr<WsdxmlNode> = this.next): WsdxmlNode = WsdxmlNode(type = type, parentCtorArg = parent, nextCtorArg = next)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdxmlNode) return false
        if (this.type != other.type) return false
        if (this.parent != other.parent) return false
        if (this.next != other.next) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.parent.hashCode()
        result = 31 * result + this.next.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdxmlNode> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdxmlNode> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsdxmlNode =
                    WsdxmlNode(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdxmlElement>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdxmlNode>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsdxmlNode) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.type)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdxmlElement>(64)
                    ).writeNative(addr + 8L, value.parent)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdxmlNode>(64)
                    ).writeNative(addr + 16L, value.next)
                }
            }

        public operator fun invoke(
            type: Int = 0,
            parent: MutPtr<WsdxmlElement> = MutPtr(0L),
            next: MutPtr<WsdxmlNode> = MutPtr(0L),
        ): WsdxmlNode =
            WsdxmlNode(
                type = type,
                parentCtorArg = parent,
                nextCtorArg = next,
            )

        public val ELEMENT_TYPE: Int = 0

        public val TEXT_TYPE: Int = 1
    }
}

public class WsdxmlPrefixMapping internal constructor(
    public var refs: UInt,
    nextCtorArg: MutPtr<WsdxmlPrefixMapping>,
    spaceCtorArg: MutPtr<WsdxmlNamespace>,
    prefixCtorArg: Pwstr,
) {
    public var next: MutPtr<WsdxmlPrefixMapping> = nextCtorArg
        internal set

    public var space: MutPtr<WsdxmlNamespace> = spaceCtorArg
        internal set

    public var prefix: Pwstr = prefixCtorArg
        internal set

    public constructor() : this(
        refs = 0u,
        nextCtorArg = MutPtr(0L),
        spaceCtorArg = MutPtr(0L),
        prefixCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.refs

    public operator fun component2(): MutPtr<WsdxmlPrefixMapping> = this.next

    public operator fun component3(): MutPtr<WsdxmlNamespace> = this.space

    public operator fun component4(): Pwstr = this.prefix

    public fun copy(refs: UInt = this.refs, next: MutPtr<WsdxmlPrefixMapping> = this.next, space: MutPtr<WsdxmlNamespace> = this.space, prefix: Pwstr = this.prefix): WsdxmlPrefixMapping = WsdxmlPrefixMapping(refs = refs, nextCtorArg = next, spaceCtorArg = space, prefixCtorArg = prefix)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdxmlPrefixMapping) return false
        if (this.refs != other.refs) return false
        if (this.next != other.next) return false
        if (this.space != other.space) return false
        if (this.prefix != other.prefix) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.refs.hashCode()
        result = 31 * result + this.next.hashCode()
        result = 31 * result + this.space.hashCode()
        result = 31 * result + this.prefix.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            refs: UInt = 0u,
            next: MutPtr<WsdxmlPrefixMapping> = MutPtr(0L),
            space: MutPtr<WsdxmlNamespace> = MutPtr(0L),
            prefix: Pwstr = MutPtr(0L),
        ): WsdxmlPrefixMapping =
            WsdxmlPrefixMapping(
                refs = refs,
                nextCtorArg = next,
                spaceCtorArg = space,
                prefixCtorArg = prefix,
            )
    }
}

public class WsdxmlText internal constructor(
    public var node: WsdxmlNode,
    textCtorArg: Pwstr,
) {
    public var text: Pwstr = textCtorArg
        internal set

    public constructor() : this(
        node = WsdxmlNode(),
        textCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WsdxmlNode = this.node

    public operator fun component2(): Pwstr = this.text

    public fun copy(node: WsdxmlNode = this.node, text: Pwstr = this.text): WsdxmlText = WsdxmlText(node = node, textCtorArg = text)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdxmlText) return false
        if (this.node != other.node) return false
        if (this.text != other.text) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.node.hashCode()
        result = 31 * result + this.text.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            node: WsdxmlNode = WsdxmlNode(),
            text: Pwstr = MutPtr(0L),
        ): WsdxmlText =
            WsdxmlText(
                node = node,
                textCtorArg = text,
            )
    }
}

public class WsdxmlType internal constructor(
    uriCtorArg: Pcwstr,
    tableCtorArg: ConstPtr<UByte>,
) {
    public var uri: Pcwstr = uriCtorArg
        internal set

    public var table: ConstPtr<UByte> = tableCtorArg
        internal set

    public constructor() : this(
        uriCtorArg = ConstPtr(0L),
        tableCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.uri

    public operator fun component2(): ConstPtr<UByte> = this.table

    public fun copy(uri: Pcwstr = this.uri, table: ConstPtr<UByte> = this.table): WsdxmlType = WsdxmlType(uriCtorArg = uri, tableCtorArg = table)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdxmlType) return false
        if (this.uri != other.uri) return false
        if (this.table != other.table) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uri.hashCode()
        result = 31 * result + this.table.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            uri: Pcwstr = ConstPtr(0L),
            table: ConstPtr<UByte> = ConstPtr(0L),
        ): WsdxmlType =
            WsdxmlType(
                uriCtorArg = uri,
                tableCtorArg = table,
            )
    }
}

public class WsdAppSequence internal constructor(
    public var instanceId: ULong,
    sequenceIdCtorArg: Pcwstr,
    public var messageNumber: ULong,
) {
    public var sequenceId: Pcwstr = sequenceIdCtorArg
        internal set

    public constructor() : this(
        instanceId = 0uL,
        sequenceIdCtorArg = ConstPtr(0L),
        messageNumber = 0uL,
    )

    public operator fun component1(): ULong = this.instanceId

    public operator fun component2(): Pcwstr = this.sequenceId

    public operator fun component3(): ULong = this.messageNumber

    public fun copy(instanceId: ULong = this.instanceId, sequenceId: Pcwstr = this.sequenceId, messageNumber: ULong = this.messageNumber): WsdAppSequence = WsdAppSequence(instanceId = instanceId, sequenceIdCtorArg = sequenceId, messageNumber = messageNumber)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdAppSequence) return false
        if (this.instanceId != other.instanceId) return false
        if (this.sequenceId != other.sequenceId) return false
        if (this.messageNumber != other.messageNumber) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.instanceId.hashCode()
        result = 31 * result + this.sequenceId.hashCode()
        result = 31 * result + this.messageNumber.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            instanceId: ULong = 0uL,
            sequenceId: Pcwstr = ConstPtr(0L),
            messageNumber: ULong = 0uL,
        ): WsdAppSequence =
            WsdAppSequence(
                instanceId = instanceId,
                sequenceIdCtorArg = sequenceId,
                messageNumber = messageNumber,
            )
    }
}

public class WsdBye internal constructor(
    endpointReferenceCtorArg: MutPtr<WsdEndpointReference>,
    anyCtorArg: MutPtr<WsdxmlElement>,
) {
    public var endpointReference: MutPtr<WsdEndpointReference> = endpointReferenceCtorArg
        internal set

    public var any: MutPtr<WsdxmlElement> = anyCtorArg
        internal set

    public constructor() : this(
        endpointReferenceCtorArg = MutPtr(0L),
        anyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdEndpointReference> = this.endpointReference

    public operator fun component2(): MutPtr<WsdxmlElement> = this.any

    public fun copy(endpointReference: MutPtr<WsdEndpointReference> = this.endpointReference, any: MutPtr<WsdxmlElement> = this.any): WsdBye = WsdBye(endpointReferenceCtorArg = endpointReference, anyCtorArg = any)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdBye) return false
        if (this.endpointReference != other.endpointReference) return false
        if (this.any != other.any) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.endpointReference.hashCode()
        result = 31 * result + this.any.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdBye> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdBye> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsdBye =
                    WsdBye(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdEndpointReference>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdxmlElement>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsdBye) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdEndpointReference>(64)
                    ).writeNative(addr, value.endpointReference)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdxmlElement>(64)
                    ).writeNative(addr + 8L, value.any)
                }
            }

        public operator fun invoke(
            endpointReference: MutPtr<WsdEndpointReference> = MutPtr(0L),
            any: MutPtr<WsdxmlElement> = MutPtr(0L),
        ): WsdBye =
            WsdBye(
                endpointReferenceCtorArg = endpointReference,
                anyCtorArg = any,
            )
    }
}

public class WsdConfigAddresses internal constructor(
    addressesCtorArg: MutPtr<MutPtr<CVoid>>,
    public var dwAddressCount: UInt,
) {
    public var addresses: MutPtr<MutPtr<CVoid>> = addressesCtorArg
        internal set

    public constructor() : this(
        addressesCtorArg = MutPtr(0L),
        dwAddressCount = 0u,
    )

    public operator fun component1(): MutPtr<MutPtr<CVoid>> = this.addresses

    public operator fun component2(): UInt = this.dwAddressCount

    public fun copy(addresses: MutPtr<MutPtr<CVoid>> = this.addresses, dwAddressCount: UInt = this.dwAddressCount): WsdConfigAddresses = WsdConfigAddresses(addressesCtorArg = addresses, dwAddressCount = dwAddressCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdConfigAddresses) return false
        if (this.addresses != other.addresses) return false
        if (this.dwAddressCount != other.dwAddressCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.addresses.hashCode()
        result = 31 * result + this.dwAddressCount.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdConfigAddresses> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdConfigAddresses> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsdConfigAddresses =
                    WsdConfigAddresses(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<CVoid>>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsdConfigAddresses) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<CVoid>>(64)
                    ).writeNative(addr, value.addresses)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwAddressCount)
                }
            }

        public operator fun invoke(
            addresses: MutPtr<MutPtr<CVoid>> = MutPtr(0L),
            dwAddressCount: UInt = 0u,
        ): WsdConfigAddresses =
            WsdConfigAddresses(
                addressesCtorArg = addresses,
                dwAddressCount = dwAddressCount,
            )
    }
}

public class WsdConfigParam internal constructor(
    public var configParamType: WsdConfigParamType,
    pConfigDataCtorArg: MutPtr<CVoid>,
    public var dwConfigDataSize: UInt,
) {
    public var pConfigData: MutPtr<CVoid> = pConfigDataCtorArg
        internal set

    public constructor() : this(
        configParamType = 0,
        pConfigDataCtorArg = MutPtr(0L),
        dwConfigDataSize = 0u,
    )

    public operator fun component1(): WsdConfigParamType = this.configParamType

    public operator fun component2(): MutPtr<CVoid> = this.pConfigData

    public operator fun component3(): UInt = this.dwConfigDataSize

    public fun copy(configParamType: WsdConfigParamType = this.configParamType, pConfigData: MutPtr<CVoid> = this.pConfigData, dwConfigDataSize: UInt = this.dwConfigDataSize): WsdConfigParam = WsdConfigParam(configParamType = configParamType, pConfigDataCtorArg = pConfigData, dwConfigDataSize = dwConfigDataSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdConfigParam) return false
        if (this.configParamType != other.configParamType) return false
        if (this.pConfigData != other.pConfigData) return false
        if (this.dwConfigDataSize != other.dwConfigDataSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.configParamType.hashCode()
        result = 31 * result + this.pConfigData.hashCode()
        result = 31 * result + this.dwConfigDataSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdConfigParam> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdConfigParam> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsdConfigParam =
                    WsdConfigParam(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsdConfigParam) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.configParamType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.pConfigData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwConfigDataSize)
                }
            }

        public operator fun invoke(
            configParamType: WsdConfigParamType = 0,
            pConfigData: MutPtr<CVoid> = MutPtr(0L),
            dwConfigDataSize: UInt = 0u,
        ): WsdConfigParam =
            WsdConfigParam(
                configParamType = configParamType,
                pConfigDataCtorArg = pConfigData,
                dwConfigDataSize = dwConfigDataSize,
            )
    }
}

public data class WsdDatetime(
    public var isPositive: Bool = 0,
    public var year: UInt = 0u,
    public var month: UByte = 0u,
    public var day: UByte = 0u,
    public var hour: UByte = 0u,
    public var minute: UByte = 0u,
    public var second: UByte = 0u,
    public var millisecond: UInt = 0u,
    public var tZIsLocal: Bool = 0,
    public var tZIsPositive: Bool = 0,
    public var tZHour: UByte = 0u,
    public var tZMinute: UByte = 0u,
)

public data class WsdDuration(
    public var isPositive: Bool = 0,
    public var year: UInt = 0u,
    public var month: UInt = 0u,
    public var day: UInt = 0u,
    public var hour: UInt = 0u,
    public var minute: UInt = 0u,
    public var second: UInt = 0u,
    public var millisecond: UInt = 0u,
)

public class WsdEndpointReference internal constructor(
    addressCtorArg: Pcwstr,
    public var referenceProperties: WsdReferenceProperties,
    public var referenceParameters: WsdReferenceParameters,
    portTypeCtorArg: MutPtr<WsdxmlName>,
    serviceNameCtorArg: MutPtr<WsdxmlName>,
    anyCtorArg: MutPtr<WsdxmlElement>,
) {
    public var address: Pcwstr = addressCtorArg
        internal set

    public var portType: MutPtr<WsdxmlName> = portTypeCtorArg
        internal set

    public var serviceName: MutPtr<WsdxmlName> = serviceNameCtorArg
        internal set

    public var any: MutPtr<WsdxmlElement> = anyCtorArg
        internal set

    public constructor() : this(
        addressCtorArg = ConstPtr(0L),
        referenceProperties = WsdReferenceProperties(),
        referenceParameters = WsdReferenceParameters(),
        portTypeCtorArg = MutPtr(0L),
        serviceNameCtorArg = MutPtr(0L),
        anyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.address

    public operator fun component2(): WsdReferenceProperties = this.referenceProperties

    public operator fun component3(): WsdReferenceParameters = this.referenceParameters

    public operator fun component4(): MutPtr<WsdxmlName> = this.portType

    public operator fun component5(): MutPtr<WsdxmlName> = this.serviceName

    public operator fun component6(): MutPtr<WsdxmlElement> = this.any

    public fun copy(address: Pcwstr = this.address, referenceProperties: WsdReferenceProperties = this.referenceProperties, referenceParameters: WsdReferenceParameters = this.referenceParameters, portType: MutPtr<WsdxmlName> = this.portType, serviceName: MutPtr<WsdxmlName> = this.serviceName, any: MutPtr<WsdxmlElement> = this.any): WsdEndpointReference = WsdEndpointReference(addressCtorArg = address, referenceProperties = referenceProperties, referenceParameters = referenceParameters, portTypeCtorArg = portType, serviceNameCtorArg = serviceName, anyCtorArg = any)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdEndpointReference) return false
        if (this.address != other.address) return false
        if (this.referenceProperties != other.referenceProperties) return false
        if (this.referenceParameters != other.referenceParameters) return false
        if (this.portType != other.portType) return false
        if (this.serviceName != other.serviceName) return false
        if (this.any != other.any) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.address.hashCode()
        result = 31 * result + this.referenceProperties.hashCode()
        result = 31 * result + this.referenceParameters.hashCode()
        result = 31 * result + this.portType.hashCode()
        result = 31 * result + this.serviceName.hashCode()
        result = 31 * result + this.any.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            address: Pcwstr = ConstPtr(0L),
            referenceProperties: WsdReferenceProperties = WsdReferenceProperties(),
            referenceParameters: WsdReferenceParameters = WsdReferenceParameters(),
            portType: MutPtr<WsdxmlName> = MutPtr(0L),
            serviceName: MutPtr<WsdxmlName> = MutPtr(0L),
            any: MutPtr<WsdxmlElement> = MutPtr(0L),
        ): WsdEndpointReference =
            WsdEndpointReference(
                addressCtorArg = address,
                referenceProperties = referenceProperties,
                referenceParameters = referenceParameters,
                portTypeCtorArg = portType,
                serviceNameCtorArg = serviceName,
                anyCtorArg = any,
            )
    }
}

public class WsdEndpointReferenceList internal constructor(
    nextCtorArg: MutPtr<WsdEndpointReferenceList>,
    elementCtorArg: MutPtr<WsdEndpointReference>,
) {
    public var next: MutPtr<WsdEndpointReferenceList> = nextCtorArg
        internal set

    public var element: MutPtr<WsdEndpointReference> = elementCtorArg
        internal set

    public constructor() : this(
        nextCtorArg = MutPtr(0L),
        elementCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdEndpointReferenceList> = this.next

    public operator fun component2(): MutPtr<WsdEndpointReference> = this.element

    public fun copy(next: MutPtr<WsdEndpointReferenceList> = this.next, element: MutPtr<WsdEndpointReference> = this.element): WsdEndpointReferenceList = WsdEndpointReferenceList(nextCtorArg = next, elementCtorArg = element)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdEndpointReferenceList) return false
        if (this.next != other.next) return false
        if (this.element != other.element) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.next.hashCode()
        result = 31 * result + this.element.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdEndpointReferenceList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdEndpointReferenceList> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsdEndpointReferenceList =
                    WsdEndpointReferenceList(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdEndpointReferenceList>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdEndpointReference>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsdEndpointReferenceList) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdEndpointReferenceList>(64)
                    ).writeNative(addr, value.next)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdEndpointReference>(64)
                    ).writeNative(addr + 8L, value.element)
                }
            }

        public operator fun invoke(
            next: MutPtr<WsdEndpointReferenceList> = MutPtr(0L),
            element: MutPtr<WsdEndpointReference> = MutPtr(0L),
        ): WsdEndpointReferenceList =
            WsdEndpointReferenceList(
                nextCtorArg = next,
                elementCtorArg = element,
            )
    }
}

public class WsdEvent internal constructor(
    public var hr: Hresult,
    public var eventType: UInt,
    dispatchTagCtorArg: Pwstr,
    public var handlerContext: WsdHandlerContext,
    soapCtorArg: MutPtr<WsdSoapMessage>,
    operationCtorArg: MutPtr<WsdOperation>,
    messageParametersCtorArg: MutPtr<CVoid>,
) {
    public var dispatchTag: Pwstr = dispatchTagCtorArg
        internal set

    public var soap: MutPtr<WsdSoapMessage> = soapCtorArg
        internal set

    public var operation: MutPtr<WsdOperation> = operationCtorArg
        internal set

    public var messageParameters: MutPtr<CVoid> = messageParametersCtorArg
        internal set

    public constructor() : this(
        hr = 0,
        eventType = 0u,
        dispatchTagCtorArg = MutPtr(0L),
        handlerContext = WsdHandlerContext(),
        soapCtorArg = MutPtr(0L),
        operationCtorArg = MutPtr(0L),
        messageParametersCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Hresult = this.hr

    public operator fun component2(): UInt = this.eventType

    public operator fun component3(): Pwstr = this.dispatchTag

    public operator fun component4(): WsdHandlerContext = this.handlerContext

    public operator fun component5(): MutPtr<WsdSoapMessage> = this.soap

    public operator fun component6(): MutPtr<WsdOperation> = this.operation

    public operator fun component7(): MutPtr<CVoid> = this.messageParameters

    public fun copy(hr: Hresult = this.hr, eventType: UInt = this.eventType, dispatchTag: Pwstr = this.dispatchTag, handlerContext: WsdHandlerContext = this.handlerContext, soap: MutPtr<WsdSoapMessage> = this.soap, operation: MutPtr<WsdOperation> = this.operation, messageParameters: MutPtr<CVoid> = this.messageParameters): WsdEvent = WsdEvent(hr = hr, eventType = eventType, dispatchTagCtorArg = dispatchTag, handlerContext = handlerContext, soapCtorArg = soap, operationCtorArg = operation, messageParametersCtorArg = messageParameters)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdEvent) return false
        if (this.hr != other.hr) return false
        if (this.eventType != other.eventType) return false
        if (this.dispatchTag != other.dispatchTag) return false
        if (this.handlerContext != other.handlerContext) return false
        if (this.soap != other.soap) return false
        if (this.operation != other.operation) return false
        if (this.messageParameters != other.messageParameters) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hr.hashCode()
        result = 31 * result + this.eventType.hashCode()
        result = 31 * result + this.dispatchTag.hashCode()
        result = 31 * result + this.handlerContext.hashCode()
        result = 31 * result + this.soap.hashCode()
        result = 31 * result + this.operation.hashCode()
        result = 31 * result + this.messageParameters.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hr: Hresult = 0,
            eventType: UInt = 0u,
            dispatchTag: Pwstr = MutPtr(0L),
            handlerContext: WsdHandlerContext = WsdHandlerContext(),
            soap: MutPtr<WsdSoapMessage> = MutPtr(0L),
            operation: MutPtr<WsdOperation> = MutPtr(0L),
            messageParameters: MutPtr<CVoid> = MutPtr(0L),
        ): WsdEvent =
            WsdEvent(
                hr = hr,
                eventType = eventType,
                dispatchTagCtorArg = dispatchTag,
                handlerContext = handlerContext,
                soapCtorArg = soap,
                operationCtorArg = operation,
                messageParametersCtorArg = messageParameters,
            )
    }
}

public class WsdEventingDeliveryMode internal constructor(
    modeCtorArg: Pcwstr,
    pushCtorArg: MutPtr<WsdEventingDeliveryModePush>,
    dataCtorArg: MutPtr<CVoid>,
) {
    public var mode: Pcwstr = modeCtorArg
        internal set

    public var push: MutPtr<WsdEventingDeliveryModePush> = pushCtorArg
        internal set

    public var data: MutPtr<CVoid> = dataCtorArg
        internal set

    public constructor() : this(
        modeCtorArg = ConstPtr(0L),
        pushCtorArg = MutPtr(0L),
        dataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.mode

    public operator fun component2(): MutPtr<WsdEventingDeliveryModePush> = this.push

    public operator fun component3(): MutPtr<CVoid> = this.data

    public fun copy(mode: Pcwstr = this.mode, push: MutPtr<WsdEventingDeliveryModePush> = this.push, data: MutPtr<CVoid> = this.data): WsdEventingDeliveryMode = WsdEventingDeliveryMode(modeCtorArg = mode, pushCtorArg = push, dataCtorArg = data)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdEventingDeliveryMode) return false
        if (this.mode != other.mode) return false
        if (this.push != other.push) return false
        if (this.data != other.data) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mode.hashCode()
        result = 31 * result + this.push.hashCode()
        result = 31 * result + this.data.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            mode: Pcwstr = ConstPtr(0L),
            push: MutPtr<WsdEventingDeliveryModePush> = MutPtr(0L),
            data: MutPtr<CVoid> = MutPtr(0L),
        ): WsdEventingDeliveryMode =
            WsdEventingDeliveryMode(
                modeCtorArg = mode,
                pushCtorArg = push,
                dataCtorArg = data,
            )
    }
}

public class WsdEventingDeliveryModePush internal constructor(
    notifyToCtorArg: MutPtr<WsdEndpointReference>,
) {
    public var notifyTo: MutPtr<WsdEndpointReference> = notifyToCtorArg
        internal set

    public constructor() : this(
        notifyToCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdEndpointReference> = this.notifyTo

    public fun copy(notifyTo: MutPtr<WsdEndpointReference> = this.notifyTo): WsdEventingDeliveryModePush = WsdEventingDeliveryModePush(notifyToCtorArg = notifyTo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdEventingDeliveryModePush) return false
        if (this.notifyTo != other.notifyTo) return false
        return true
    }

    override fun hashCode(): Int = this.notifyTo.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdEventingDeliveryModePush> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdEventingDeliveryModePush> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsdEventingDeliveryModePush =
                    WsdEventingDeliveryModePush(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdEndpointReference>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsdEventingDeliveryModePush) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdEndpointReference>(64)
                    ).writeNative(addr, value.notifyTo)
                }
            }

        public operator fun invoke(
            notifyTo: MutPtr<WsdEndpointReference> = MutPtr(0L),
        ): WsdEventingDeliveryModePush =
            WsdEventingDeliveryModePush(
                notifyToCtorArg = notifyTo,
            )
    }
}

public class WsdEventingExpires internal constructor(
    durationCtorArg: MutPtr<WsdDuration>,
    dateTimeCtorArg: MutPtr<WsdDatetime>,
) {
    public var duration: MutPtr<WsdDuration> = durationCtorArg
        internal set

    public var dateTime: MutPtr<WsdDatetime> = dateTimeCtorArg
        internal set

    public constructor() : this(
        durationCtorArg = MutPtr(0L),
        dateTimeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdDuration> = this.duration

    public operator fun component2(): MutPtr<WsdDatetime> = this.dateTime

    public fun copy(duration: MutPtr<WsdDuration> = this.duration, dateTime: MutPtr<WsdDatetime> = this.dateTime): WsdEventingExpires = WsdEventingExpires(durationCtorArg = duration, dateTimeCtorArg = dateTime)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdEventingExpires) return false
        if (this.duration != other.duration) return false
        if (this.dateTime != other.dateTime) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.duration.hashCode()
        result = 31 * result + this.dateTime.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdEventingExpires> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdEventingExpires> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsdEventingExpires =
                    WsdEventingExpires(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdDuration>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdDatetime>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsdEventingExpires) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdDuration>(64)
                    ).writeNative(addr, value.duration)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdDatetime>(64)
                    ).writeNative(addr + 8L, value.dateTime)
                }
            }

        public operator fun invoke(
            duration: MutPtr<WsdDuration> = MutPtr(0L),
            dateTime: MutPtr<WsdDatetime> = MutPtr(0L),
        ): WsdEventingExpires =
            WsdEventingExpires(
                durationCtorArg = duration,
                dateTimeCtorArg = dateTime,
            )
    }
}

public class WsdEventingFilter internal constructor(
    dialectCtorArg: Pcwstr,
    filterActionCtorArg: MutPtr<WsdEventingFilterAction>,
    dataCtorArg: MutPtr<CVoid>,
) {
    public var dialect: Pcwstr = dialectCtorArg
        internal set

    public var filterAction: MutPtr<WsdEventingFilterAction> = filterActionCtorArg
        internal set

    public var data: MutPtr<CVoid> = dataCtorArg
        internal set

    public constructor() : this(
        dialectCtorArg = ConstPtr(0L),
        filterActionCtorArg = MutPtr(0L),
        dataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.dialect

    public operator fun component2(): MutPtr<WsdEventingFilterAction> = this.filterAction

    public operator fun component3(): MutPtr<CVoid> = this.data

    public fun copy(dialect: Pcwstr = this.dialect, filterAction: MutPtr<WsdEventingFilterAction> = this.filterAction, data: MutPtr<CVoid> = this.data): WsdEventingFilter = WsdEventingFilter(dialectCtorArg = dialect, filterActionCtorArg = filterAction, dataCtorArg = data)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdEventingFilter) return false
        if (this.dialect != other.dialect) return false
        if (this.filterAction != other.filterAction) return false
        if (this.data != other.data) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dialect.hashCode()
        result = 31 * result + this.filterAction.hashCode()
        result = 31 * result + this.data.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dialect: Pcwstr = ConstPtr(0L),
            filterAction: MutPtr<WsdEventingFilterAction> = MutPtr(0L),
            data: MutPtr<CVoid> = MutPtr(0L),
        ): WsdEventingFilter =
            WsdEventingFilter(
                dialectCtorArg = dialect,
                filterActionCtorArg = filterAction,
                dataCtorArg = data,
            )
    }
}

public class WsdEventingFilterAction internal constructor(
    actionsCtorArg: MutPtr<WsdUriList>,
) {
    public var actions: MutPtr<WsdUriList> = actionsCtorArg
        internal set

    public constructor() : this(
        actionsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdUriList> = this.actions

    public fun copy(actions: MutPtr<WsdUriList> = this.actions): WsdEventingFilterAction = WsdEventingFilterAction(actionsCtorArg = actions)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdEventingFilterAction) return false
        if (this.actions != other.actions) return false
        return true
    }

    override fun hashCode(): Int = this.actions.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdEventingFilterAction> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdEventingFilterAction> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsdEventingFilterAction =
                    WsdEventingFilterAction(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdUriList>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsdEventingFilterAction) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdUriList>(64)
                    ).writeNative(addr, value.actions)
                }
            }

        public operator fun invoke(
            actions: MutPtr<WsdUriList> = MutPtr(0L),
        ): WsdEventingFilterAction =
            WsdEventingFilterAction(
                actionsCtorArg = actions,
            )
    }
}

public class WsdHandlerContext internal constructor(
    public var handler: PwsdSoapMessageHandler,
    pVoidCtorArg: MutPtr<CVoid>,
    unknownCtorArg: MutPtr<CVoid>,
) {
    public var pVoid: MutPtr<CVoid> = pVoidCtorArg
        internal set

    public var unknown: MutPtr<CVoid> = unknownCtorArg
        internal set

    public constructor() : this(
        handler = null,
        pVoidCtorArg = MutPtr(0L),
        unknownCtorArg = MutPtr(0L),
    )

    public operator fun component1(): PwsdSoapMessageHandler = this.handler

    public operator fun component2(): MutPtr<CVoid> = this.pVoid

    public operator fun component3(): MutPtr<CVoid> = this.unknown

    public fun copy(handler: PwsdSoapMessageHandler = this.handler, pVoid: MutPtr<CVoid> = this.pVoid, unknown: MutPtr<CVoid> = this.unknown): WsdHandlerContext = WsdHandlerContext(handler = handler, pVoidCtorArg = pVoid, unknownCtorArg = unknown)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdHandlerContext) return false
        if (this.handler != other.handler) return false
        if (this.pVoid != other.pVoid) return false
        if (this.unknown != other.unknown) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.handler.hashCode()
        result = 31 * result + this.pVoid.hashCode()
        result = 31 * result + this.unknown.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            handler: PwsdSoapMessageHandler = null,
            pVoid: MutPtr<CVoid> = MutPtr(0L),
            unknown: MutPtr<CVoid> = MutPtr(0L),
        ): WsdHandlerContext =
            WsdHandlerContext(
                handler = handler,
                pVoidCtorArg = pVoid,
                unknownCtorArg = unknown,
            )
    }
}

public class WsdHeaderRelatesto internal constructor(
    relationshipTypeCtorArg: MutPtr<WsdxmlName>,
    messageIDCtorArg: Pcwstr,
) {
    public var relationshipType: MutPtr<WsdxmlName> = relationshipTypeCtorArg
        internal set

    public var messageID: Pcwstr = messageIDCtorArg
        internal set

    public constructor() : this(
        relationshipTypeCtorArg = MutPtr(0L),
        messageIDCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdxmlName> = this.relationshipType

    public operator fun component2(): Pcwstr = this.messageID

    public fun copy(relationshipType: MutPtr<WsdxmlName> = this.relationshipType, messageID: Pcwstr = this.messageID): WsdHeaderRelatesto = WsdHeaderRelatesto(relationshipTypeCtorArg = relationshipType, messageIDCtorArg = messageID)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdHeaderRelatesto) return false
        if (this.relationshipType != other.relationshipType) return false
        if (this.messageID != other.messageID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.relationshipType.hashCode()
        result = 31 * result + this.messageID.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            relationshipType: MutPtr<WsdxmlName> = MutPtr(0L),
            messageID: Pcwstr = ConstPtr(0L),
        ): WsdHeaderRelatesto =
            WsdHeaderRelatesto(
                relationshipTypeCtorArg = relationshipType,
                messageIDCtorArg = messageID,
            )
    }
}

public class WsdHello internal constructor(
    endpointReferenceCtorArg: MutPtr<WsdEndpointReference>,
    typesCtorArg: MutPtr<WsdNameList>,
    scopesCtorArg: MutPtr<WsdScopes>,
    xAddrsCtorArg: MutPtr<WsdUriList>,
    public var metadataVersion: ULong,
    anyCtorArg: MutPtr<WsdxmlElement>,
) {
    public var endpointReference: MutPtr<WsdEndpointReference> = endpointReferenceCtorArg
        internal set

    public var types: MutPtr<WsdNameList> = typesCtorArg
        internal set

    public var scopes: MutPtr<WsdScopes> = scopesCtorArg
        internal set

    public var xAddrs: MutPtr<WsdUriList> = xAddrsCtorArg
        internal set

    public var any: MutPtr<WsdxmlElement> = anyCtorArg
        internal set

    public constructor() : this(
        endpointReferenceCtorArg = MutPtr(0L),
        typesCtorArg = MutPtr(0L),
        scopesCtorArg = MutPtr(0L),
        xAddrsCtorArg = MutPtr(0L),
        metadataVersion = 0uL,
        anyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdEndpointReference> = this.endpointReference

    public operator fun component2(): MutPtr<WsdNameList> = this.types

    public operator fun component3(): MutPtr<WsdScopes> = this.scopes

    public operator fun component4(): MutPtr<WsdUriList> = this.xAddrs

    public operator fun component5(): ULong = this.metadataVersion

    public operator fun component6(): MutPtr<WsdxmlElement> = this.any

    public fun copy(endpointReference: MutPtr<WsdEndpointReference> = this.endpointReference, types: MutPtr<WsdNameList> = this.types, scopes: MutPtr<WsdScopes> = this.scopes, xAddrs: MutPtr<WsdUriList> = this.xAddrs, metadataVersion: ULong = this.metadataVersion, any: MutPtr<WsdxmlElement> = this.any): WsdHello = WsdHello(endpointReferenceCtorArg = endpointReference, typesCtorArg = types, scopesCtorArg = scopes, xAddrsCtorArg = xAddrs, metadataVersion = metadataVersion, anyCtorArg = any)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdHello) return false
        if (this.endpointReference != other.endpointReference) return false
        if (this.types != other.types) return false
        if (this.scopes != other.scopes) return false
        if (this.xAddrs != other.xAddrs) return false
        if (this.metadataVersion != other.metadataVersion) return false
        if (this.any != other.any) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.endpointReference.hashCode()
        result = 31 * result + this.types.hashCode()
        result = 31 * result + this.scopes.hashCode()
        result = 31 * result + this.xAddrs.hashCode()
        result = 31 * result + this.metadataVersion.hashCode()
        result = 31 * result + this.any.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdHello> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdHello> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsdHello =
                    WsdHello(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdEndpointReference>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdNameList>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdScopes>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdUriList>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdxmlElement>(64)
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: WsdHello) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdEndpointReference>(64)
                    ).writeNative(addr, value.endpointReference)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdNameList>(64)
                    ).writeNative(addr + 8L, value.types)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdScopes>(64)
                    ).writeNative(addr + 16L, value.scopes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdUriList>(64)
                    ).writeNative(addr + 24L, value.xAddrs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.metadataVersion)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdxmlElement>(64)
                    ).writeNative(addr + 40L, value.any)
                }
            }

        public operator fun invoke(
            endpointReference: MutPtr<WsdEndpointReference> = MutPtr(0L),
            types: MutPtr<WsdNameList> = MutPtr(0L),
            scopes: MutPtr<WsdScopes> = MutPtr(0L),
            xAddrs: MutPtr<WsdUriList> = MutPtr(0L),
            metadataVersion: ULong = 0uL,
            any: MutPtr<WsdxmlElement> = MutPtr(0L),
        ): WsdHello =
            WsdHello(
                endpointReferenceCtorArg = endpointReference,
                typesCtorArg = types,
                scopesCtorArg = scopes,
                xAddrsCtorArg = xAddrs,
                metadataVersion = metadataVersion,
                anyCtorArg = any,
            )
    }
}

public class WsdHostMetadata internal constructor(
    hostCtorArg: MutPtr<WsdServiceMetadata>,
    hostedCtorArg: MutPtr<WsdServiceMetadataList>,
) {
    public var host: MutPtr<WsdServiceMetadata> = hostCtorArg
        internal set

    public var hosted: MutPtr<WsdServiceMetadataList> = hostedCtorArg
        internal set

    public constructor() : this(
        hostCtorArg = MutPtr(0L),
        hostedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdServiceMetadata> = this.host

    public operator fun component2(): MutPtr<WsdServiceMetadataList> = this.hosted

    public fun copy(host: MutPtr<WsdServiceMetadata> = this.host, hosted: MutPtr<WsdServiceMetadataList> = this.hosted): WsdHostMetadata = WsdHostMetadata(hostCtorArg = host, hostedCtorArg = hosted)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdHostMetadata) return false
        if (this.host != other.host) return false
        if (this.hosted != other.hosted) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.host.hashCode()
        result = 31 * result + this.hosted.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdHostMetadata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdHostMetadata> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsdHostMetadata =
                    WsdHostMetadata(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdServiceMetadata>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdServiceMetadataList>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsdHostMetadata) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdServiceMetadata>(64)
                    ).writeNative(addr, value.host)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdServiceMetadataList>(64)
                    ).writeNative(addr + 8L, value.hosted)
                }
            }

        public operator fun invoke(
            host: MutPtr<WsdServiceMetadata> = MutPtr(0L),
            hosted: MutPtr<WsdServiceMetadataList> = MutPtr(0L),
        ): WsdHostMetadata =
            WsdHostMetadata(
                hostCtorArg = host,
                hostedCtorArg = hosted,
            )
    }
}

public class WsdLocalizedString internal constructor(
    langCtorArg: Pcwstr,
    stringCtorArg: Pcwstr,
) {
    public var lang: Pcwstr = langCtorArg
        internal set

    public var string: Pcwstr = stringCtorArg
        internal set

    public constructor() : this(
        langCtorArg = ConstPtr(0L),
        stringCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.lang

    public operator fun component2(): Pcwstr = this.string

    public fun copy(lang: Pcwstr = this.lang, string: Pcwstr = this.string): WsdLocalizedString = WsdLocalizedString(langCtorArg = lang, stringCtorArg = string)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdLocalizedString) return false
        if (this.lang != other.lang) return false
        if (this.string != other.string) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lang.hashCode()
        result = 31 * result + this.string.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lang: Pcwstr = ConstPtr(0L),
            string: Pcwstr = ConstPtr(0L),
        ): WsdLocalizedString =
            WsdLocalizedString(
                langCtorArg = lang,
                stringCtorArg = string,
            )
    }
}

public class WsdLocalizedStringList internal constructor(
    nextCtorArg: MutPtr<WsdLocalizedStringList>,
    elementCtorArg: MutPtr<WsdLocalizedString>,
) {
    public var next: MutPtr<WsdLocalizedStringList> = nextCtorArg
        internal set

    public var element: MutPtr<WsdLocalizedString> = elementCtorArg
        internal set

    public constructor() : this(
        nextCtorArg = MutPtr(0L),
        elementCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdLocalizedStringList> = this.next

    public operator fun component2(): MutPtr<WsdLocalizedString> = this.element

    public fun copy(next: MutPtr<WsdLocalizedStringList> = this.next, element: MutPtr<WsdLocalizedString> = this.element): WsdLocalizedStringList = WsdLocalizedStringList(nextCtorArg = next, elementCtorArg = element)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdLocalizedStringList) return false
        if (this.next != other.next) return false
        if (this.element != other.element) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.next.hashCode()
        result = 31 * result + this.element.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdLocalizedStringList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdLocalizedStringList> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsdLocalizedStringList =
                    WsdLocalizedStringList(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdLocalizedStringList>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdLocalizedString>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsdLocalizedStringList) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdLocalizedStringList>(64)
                    ).writeNative(addr, value.next)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdLocalizedString>(64)
                    ).writeNative(addr + 8L, value.element)
                }
            }

        public operator fun invoke(
            next: MutPtr<WsdLocalizedStringList> = MutPtr(0L),
            element: MutPtr<WsdLocalizedString> = MutPtr(0L),
        ): WsdLocalizedStringList =
            WsdLocalizedStringList(
                nextCtorArg = next,
                elementCtorArg = element,
            )
    }
}

public class WsdMetadataSection internal constructor(
    dialectCtorArg: Pcwstr,
    identifierCtorArg: Pcwstr,
    dataCtorArg: MutPtr<CVoid>,
    metadataReferenceCtorArg: MutPtr<WsdEndpointReference>,
    locationCtorArg: Pcwstr,
    anyCtorArg: MutPtr<WsdxmlElement>,
) {
    public var dialect: Pcwstr = dialectCtorArg
        internal set

    public var identifier: Pcwstr = identifierCtorArg
        internal set

    public var data: MutPtr<CVoid> = dataCtorArg
        internal set

    public var metadataReference: MutPtr<WsdEndpointReference> = metadataReferenceCtorArg
        internal set

    public var location: Pcwstr = locationCtorArg
        internal set

    public var any: MutPtr<WsdxmlElement> = anyCtorArg
        internal set

    public constructor() : this(
        dialectCtorArg = ConstPtr(0L),
        identifierCtorArg = ConstPtr(0L),
        dataCtorArg = MutPtr(0L),
        metadataReferenceCtorArg = MutPtr(0L),
        locationCtorArg = ConstPtr(0L),
        anyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.dialect

    public operator fun component2(): Pcwstr = this.identifier

    public operator fun component3(): MutPtr<CVoid> = this.data

    public operator fun component4(): MutPtr<WsdEndpointReference> = this.metadataReference

    public operator fun component5(): Pcwstr = this.location

    public operator fun component6(): MutPtr<WsdxmlElement> = this.any

    public fun copy(dialect: Pcwstr = this.dialect, identifier: Pcwstr = this.identifier, data: MutPtr<CVoid> = this.data, metadataReference: MutPtr<WsdEndpointReference> = this.metadataReference, location: Pcwstr = this.location, any: MutPtr<WsdxmlElement> = this.any): WsdMetadataSection = WsdMetadataSection(dialectCtorArg = dialect, identifierCtorArg = identifier, dataCtorArg = data, metadataReferenceCtorArg = metadataReference, locationCtorArg = location, anyCtorArg = any)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdMetadataSection) return false
        if (this.dialect != other.dialect) return false
        if (this.identifier != other.identifier) return false
        if (this.data != other.data) return false
        if (this.metadataReference != other.metadataReference) return false
        if (this.location != other.location) return false
        if (this.any != other.any) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dialect.hashCode()
        result = 31 * result + this.identifier.hashCode()
        result = 31 * result + this.data.hashCode()
        result = 31 * result + this.metadataReference.hashCode()
        result = 31 * result + this.location.hashCode()
        result = 31 * result + this.any.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dialect: Pcwstr = ConstPtr(0L),
            identifier: Pcwstr = ConstPtr(0L),
            data: MutPtr<CVoid> = MutPtr(0L),
            metadataReference: MutPtr<WsdEndpointReference> = MutPtr(0L),
            location: Pcwstr = ConstPtr(0L),
            any: MutPtr<WsdxmlElement> = MutPtr(0L),
        ): WsdMetadataSection =
            WsdMetadataSection(
                dialectCtorArg = dialect,
                identifierCtorArg = identifier,
                dataCtorArg = data,
                metadataReferenceCtorArg = metadataReference,
                locationCtorArg = location,
                anyCtorArg = any,
            )
    }
}

public class WsdMetadataSectionList internal constructor(
    nextCtorArg: MutPtr<WsdMetadataSectionList>,
    elementCtorArg: MutPtr<WsdMetadataSection>,
) {
    public var next: MutPtr<WsdMetadataSectionList> = nextCtorArg
        internal set

    public var element: MutPtr<WsdMetadataSection> = elementCtorArg
        internal set

    public constructor() : this(
        nextCtorArg = MutPtr(0L),
        elementCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdMetadataSectionList> = this.next

    public operator fun component2(): MutPtr<WsdMetadataSection> = this.element

    public fun copy(next: MutPtr<WsdMetadataSectionList> = this.next, element: MutPtr<WsdMetadataSection> = this.element): WsdMetadataSectionList = WsdMetadataSectionList(nextCtorArg = next, elementCtorArg = element)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdMetadataSectionList) return false
        if (this.next != other.next) return false
        if (this.element != other.element) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.next.hashCode()
        result = 31 * result + this.element.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdMetadataSectionList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdMetadataSectionList> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsdMetadataSectionList =
                    WsdMetadataSectionList(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdMetadataSectionList>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdMetadataSection>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsdMetadataSectionList) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdMetadataSectionList>(64)
                    ).writeNative(addr, value.next)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdMetadataSection>(64)
                    ).writeNative(addr + 8L, value.element)
                }
            }

        public operator fun invoke(
            next: MutPtr<WsdMetadataSectionList> = MutPtr(0L),
            element: MutPtr<WsdMetadataSection> = MutPtr(0L),
        ): WsdMetadataSectionList =
            WsdMetadataSectionList(
                nextCtorArg = next,
                elementCtorArg = element,
            )
    }
}

public class WsdNameList internal constructor(
    nextCtorArg: MutPtr<WsdNameList>,
    elementCtorArg: MutPtr<WsdxmlName>,
) {
    public var next: MutPtr<WsdNameList> = nextCtorArg
        internal set

    public var element: MutPtr<WsdxmlName> = elementCtorArg
        internal set

    public constructor() : this(
        nextCtorArg = MutPtr(0L),
        elementCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdNameList> = this.next

    public operator fun component2(): MutPtr<WsdxmlName> = this.element

    public fun copy(next: MutPtr<WsdNameList> = this.next, element: MutPtr<WsdxmlName> = this.element): WsdNameList = WsdNameList(nextCtorArg = next, elementCtorArg = element)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdNameList) return false
        if (this.next != other.next) return false
        if (this.element != other.element) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.next.hashCode()
        result = 31 * result + this.element.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdNameList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdNameList> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsdNameList =
                    WsdNameList(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdNameList>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdxmlName>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsdNameList) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdNameList>(64)
                    ).writeNative(addr, value.next)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdxmlName>(64)
                    ).writeNative(addr + 8L, value.element)
                }
            }

        public operator fun invoke(
            next: MutPtr<WsdNameList> = MutPtr(0L),
            element: MutPtr<WsdxmlName> = MutPtr(0L),
        ): WsdNameList =
            WsdNameList(
                nextCtorArg = next,
                elementCtorArg = element,
            )
    }
}

public class WsdOperation internal constructor(
    requestTypeCtorArg: MutPtr<WsdxmlType>,
    responseTypeCtorArg: MutPtr<WsdxmlType>,
    public var requestStubFunction: WsdStubFunction,
) {
    public var requestType: MutPtr<WsdxmlType> = requestTypeCtorArg
        internal set

    public var responseType: MutPtr<WsdxmlType> = responseTypeCtorArg
        internal set

    public constructor() : this(
        requestTypeCtorArg = MutPtr(0L),
        responseTypeCtorArg = MutPtr(0L),
        requestStubFunction = null,
    )

    public operator fun component1(): MutPtr<WsdxmlType> = this.requestType

    public operator fun component2(): MutPtr<WsdxmlType> = this.responseType

    public operator fun component3(): WsdStubFunction = this.requestStubFunction

    public fun copy(requestType: MutPtr<WsdxmlType> = this.requestType, responseType: MutPtr<WsdxmlType> = this.responseType, requestStubFunction: WsdStubFunction = this.requestStubFunction): WsdOperation = WsdOperation(requestTypeCtorArg = requestType, responseTypeCtorArg = responseType, requestStubFunction = requestStubFunction)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdOperation) return false
        if (this.requestType != other.requestType) return false
        if (this.responseType != other.responseType) return false
        if (this.requestStubFunction != other.requestStubFunction) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.requestType.hashCode()
        result = 31 * result + this.responseType.hashCode()
        result = 31 * result + this.requestStubFunction.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            requestType: MutPtr<WsdxmlType> = MutPtr(0L),
            responseType: MutPtr<WsdxmlType> = MutPtr(0L),
            requestStubFunction: WsdStubFunction = null,
        ): WsdOperation =
            WsdOperation(
                requestTypeCtorArg = requestType,
                responseTypeCtorArg = responseType,
                requestStubFunction = requestStubFunction,
            )
    }
}

public class WsdPortType internal constructor(
    public var encodedName: UInt,
    public var operationCount: UInt,
    operationsCtorArg: MutPtr<WsdOperation>,
    public var protocolType: WsdProtocolType,
) {
    public var operations: MutPtr<WsdOperation> = operationsCtorArg
        internal set

    public constructor() : this(
        encodedName = 0u,
        operationCount = 0u,
        operationsCtorArg = MutPtr(0L),
        protocolType = 0,
    )

    public operator fun component1(): UInt = this.encodedName

    public operator fun component2(): UInt = this.operationCount

    public operator fun component3(): MutPtr<WsdOperation> = this.operations

    public operator fun component4(): WsdProtocolType = this.protocolType

    public fun copy(encodedName: UInt = this.encodedName, operationCount: UInt = this.operationCount, operations: MutPtr<WsdOperation> = this.operations, protocolType: WsdProtocolType = this.protocolType): WsdPortType = WsdPortType(encodedName = encodedName, operationCount = operationCount, operationsCtorArg = operations, protocolType = protocolType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdPortType) return false
        if (this.encodedName != other.encodedName) return false
        if (this.operationCount != other.operationCount) return false
        if (this.operations != other.operations) return false
        if (this.protocolType != other.protocolType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.encodedName.hashCode()
        result = 31 * result + this.operationCount.hashCode()
        result = 31 * result + this.operations.hashCode()
        result = 31 * result + this.protocolType.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdPortType> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdPortType> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsdPortType =
                    WsdPortType(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdOperation>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsdPortType) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.encodedName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.operationCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdOperation>(64)
                    ).writeNative(addr + 8L, value.operations)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.protocolType)
                }
            }

        public operator fun invoke(
            encodedName: UInt = 0u,
            operationCount: UInt = 0u,
            operations: MutPtr<WsdOperation> = MutPtr(0L),
            protocolType: WsdProtocolType = 0,
        ): WsdPortType =
            WsdPortType(
                encodedName = encodedName,
                operationCount = operationCount,
                operationsCtorArg = operations,
                protocolType = protocolType,
            )
    }
}

public class WsdProbe internal constructor(
    typesCtorArg: MutPtr<WsdNameList>,
    scopesCtorArg: MutPtr<WsdScopes>,
    anyCtorArg: MutPtr<WsdxmlElement>,
) {
    public var types: MutPtr<WsdNameList> = typesCtorArg
        internal set

    public var scopes: MutPtr<WsdScopes> = scopesCtorArg
        internal set

    public var any: MutPtr<WsdxmlElement> = anyCtorArg
        internal set

    public constructor() : this(
        typesCtorArg = MutPtr(0L),
        scopesCtorArg = MutPtr(0L),
        anyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdNameList> = this.types

    public operator fun component2(): MutPtr<WsdScopes> = this.scopes

    public operator fun component3(): MutPtr<WsdxmlElement> = this.any

    public fun copy(types: MutPtr<WsdNameList> = this.types, scopes: MutPtr<WsdScopes> = this.scopes, any: MutPtr<WsdxmlElement> = this.any): WsdProbe = WsdProbe(typesCtorArg = types, scopesCtorArg = scopes, anyCtorArg = any)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdProbe) return false
        if (this.types != other.types) return false
        if (this.scopes != other.scopes) return false
        if (this.any != other.any) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.types.hashCode()
        result = 31 * result + this.scopes.hashCode()
        result = 31 * result + this.any.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdProbe> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdProbe> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsdProbe =
                    WsdProbe(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdNameList>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdScopes>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdxmlElement>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsdProbe) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdNameList>(64)
                    ).writeNative(addr, value.types)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdScopes>(64)
                    ).writeNative(addr + 8L, value.scopes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdxmlElement>(64)
                    ).writeNative(addr + 16L, value.any)
                }
            }

        public operator fun invoke(
            types: MutPtr<WsdNameList> = MutPtr(0L),
            scopes: MutPtr<WsdScopes> = MutPtr(0L),
            any: MutPtr<WsdxmlElement> = MutPtr(0L),
        ): WsdProbe =
            WsdProbe(
                typesCtorArg = types,
                scopesCtorArg = scopes,
                anyCtorArg = any,
            )
    }
}

public class WsdProbeMatch internal constructor(
    endpointReferenceCtorArg: MutPtr<WsdEndpointReference>,
    typesCtorArg: MutPtr<WsdNameList>,
    scopesCtorArg: MutPtr<WsdScopes>,
    xAddrsCtorArg: MutPtr<WsdUriList>,
    public var metadataVersion: ULong,
    anyCtorArg: MutPtr<WsdxmlElement>,
) {
    public var endpointReference: MutPtr<WsdEndpointReference> = endpointReferenceCtorArg
        internal set

    public var types: MutPtr<WsdNameList> = typesCtorArg
        internal set

    public var scopes: MutPtr<WsdScopes> = scopesCtorArg
        internal set

    public var xAddrs: MutPtr<WsdUriList> = xAddrsCtorArg
        internal set

    public var any: MutPtr<WsdxmlElement> = anyCtorArg
        internal set

    public constructor() : this(
        endpointReferenceCtorArg = MutPtr(0L),
        typesCtorArg = MutPtr(0L),
        scopesCtorArg = MutPtr(0L),
        xAddrsCtorArg = MutPtr(0L),
        metadataVersion = 0uL,
        anyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdEndpointReference> = this.endpointReference

    public operator fun component2(): MutPtr<WsdNameList> = this.types

    public operator fun component3(): MutPtr<WsdScopes> = this.scopes

    public operator fun component4(): MutPtr<WsdUriList> = this.xAddrs

    public operator fun component5(): ULong = this.metadataVersion

    public operator fun component6(): MutPtr<WsdxmlElement> = this.any

    public fun copy(endpointReference: MutPtr<WsdEndpointReference> = this.endpointReference, types: MutPtr<WsdNameList> = this.types, scopes: MutPtr<WsdScopes> = this.scopes, xAddrs: MutPtr<WsdUriList> = this.xAddrs, metadataVersion: ULong = this.metadataVersion, any: MutPtr<WsdxmlElement> = this.any): WsdProbeMatch = WsdProbeMatch(endpointReferenceCtorArg = endpointReference, typesCtorArg = types, scopesCtorArg = scopes, xAddrsCtorArg = xAddrs, metadataVersion = metadataVersion, anyCtorArg = any)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdProbeMatch) return false
        if (this.endpointReference != other.endpointReference) return false
        if (this.types != other.types) return false
        if (this.scopes != other.scopes) return false
        if (this.xAddrs != other.xAddrs) return false
        if (this.metadataVersion != other.metadataVersion) return false
        if (this.any != other.any) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.endpointReference.hashCode()
        result = 31 * result + this.types.hashCode()
        result = 31 * result + this.scopes.hashCode()
        result = 31 * result + this.xAddrs.hashCode()
        result = 31 * result + this.metadataVersion.hashCode()
        result = 31 * result + this.any.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdProbeMatch> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdProbeMatch> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsdProbeMatch =
                    WsdProbeMatch(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdEndpointReference>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdNameList>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdScopes>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdUriList>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdxmlElement>(64)
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: WsdProbeMatch) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdEndpointReference>(64)
                    ).writeNative(addr, value.endpointReference)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdNameList>(64)
                    ).writeNative(addr + 8L, value.types)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdScopes>(64)
                    ).writeNative(addr + 16L, value.scopes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdUriList>(64)
                    ).writeNative(addr + 24L, value.xAddrs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.metadataVersion)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdxmlElement>(64)
                    ).writeNative(addr + 40L, value.any)
                }
            }

        public operator fun invoke(
            endpointReference: MutPtr<WsdEndpointReference> = MutPtr(0L),
            types: MutPtr<WsdNameList> = MutPtr(0L),
            scopes: MutPtr<WsdScopes> = MutPtr(0L),
            xAddrs: MutPtr<WsdUriList> = MutPtr(0L),
            metadataVersion: ULong = 0uL,
            any: MutPtr<WsdxmlElement> = MutPtr(0L),
        ): WsdProbeMatch =
            WsdProbeMatch(
                endpointReferenceCtorArg = endpointReference,
                typesCtorArg = types,
                scopesCtorArg = scopes,
                xAddrsCtorArg = xAddrs,
                metadataVersion = metadataVersion,
                anyCtorArg = any,
            )
    }
}

public class WsdProbeMatches internal constructor(
    probeMatchCtorArg: MutPtr<WsdProbeMatchList>,
    anyCtorArg: MutPtr<WsdxmlElement>,
) {
    public var probeMatch: MutPtr<WsdProbeMatchList> = probeMatchCtorArg
        internal set

    public var any: MutPtr<WsdxmlElement> = anyCtorArg
        internal set

    public constructor() : this(
        probeMatchCtorArg = MutPtr(0L),
        anyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdProbeMatchList> = this.probeMatch

    public operator fun component2(): MutPtr<WsdxmlElement> = this.any

    public fun copy(probeMatch: MutPtr<WsdProbeMatchList> = this.probeMatch, any: MutPtr<WsdxmlElement> = this.any): WsdProbeMatches = WsdProbeMatches(probeMatchCtorArg = probeMatch, anyCtorArg = any)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdProbeMatches) return false
        if (this.probeMatch != other.probeMatch) return false
        if (this.any != other.any) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.probeMatch.hashCode()
        result = 31 * result + this.any.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdProbeMatches> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdProbeMatches> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsdProbeMatches =
                    WsdProbeMatches(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdProbeMatchList>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdxmlElement>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsdProbeMatches) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdProbeMatchList>(64)
                    ).writeNative(addr, value.probeMatch)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdxmlElement>(64)
                    ).writeNative(addr + 8L, value.any)
                }
            }

        public operator fun invoke(
            probeMatch: MutPtr<WsdProbeMatchList> = MutPtr(0L),
            any: MutPtr<WsdxmlElement> = MutPtr(0L),
        ): WsdProbeMatches =
            WsdProbeMatches(
                probeMatchCtorArg = probeMatch,
                anyCtorArg = any,
            )
    }
}

public class WsdProbeMatchList internal constructor(
    nextCtorArg: MutPtr<WsdProbeMatchList>,
    elementCtorArg: MutPtr<WsdProbeMatch>,
) {
    public var next: MutPtr<WsdProbeMatchList> = nextCtorArg
        internal set

    public var element: MutPtr<WsdProbeMatch> = elementCtorArg
        internal set

    public constructor() : this(
        nextCtorArg = MutPtr(0L),
        elementCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdProbeMatchList> = this.next

    public operator fun component2(): MutPtr<WsdProbeMatch> = this.element

    public fun copy(next: MutPtr<WsdProbeMatchList> = this.next, element: MutPtr<WsdProbeMatch> = this.element): WsdProbeMatchList = WsdProbeMatchList(nextCtorArg = next, elementCtorArg = element)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdProbeMatchList) return false
        if (this.next != other.next) return false
        if (this.element != other.element) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.next.hashCode()
        result = 31 * result + this.element.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdProbeMatchList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdProbeMatchList> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsdProbeMatchList =
                    WsdProbeMatchList(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdProbeMatchList>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdProbeMatch>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsdProbeMatchList) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdProbeMatchList>(64)
                    ).writeNative(addr, value.next)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdProbeMatch>(64)
                    ).writeNative(addr + 8L, value.element)
                }
            }

        public operator fun invoke(
            next: MutPtr<WsdProbeMatchList> = MutPtr(0L),
            element: MutPtr<WsdProbeMatch> = MutPtr(0L),
        ): WsdProbeMatchList =
            WsdProbeMatchList(
                nextCtorArg = next,
                elementCtorArg = element,
            )
    }
}

public class WsdReferenceParameters internal constructor(
    anyCtorArg: MutPtr<WsdxmlElement>,
) {
    public var any: MutPtr<WsdxmlElement> = anyCtorArg
        internal set

    public constructor() : this(
        anyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdxmlElement> = this.any

    public fun copy(any: MutPtr<WsdxmlElement> = this.any): WsdReferenceParameters = WsdReferenceParameters(anyCtorArg = any)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdReferenceParameters) return false
        if (this.any != other.any) return false
        return true
    }

    override fun hashCode(): Int = this.any.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdReferenceParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdReferenceParameters> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsdReferenceParameters =
                    WsdReferenceParameters(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdxmlElement>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsdReferenceParameters) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdxmlElement>(64)
                    ).writeNative(addr, value.any)
                }
            }

        public operator fun invoke(
            any: MutPtr<WsdxmlElement> = MutPtr(0L),
        ): WsdReferenceParameters =
            WsdReferenceParameters(
                anyCtorArg = any,
            )
    }
}

public class WsdReferenceProperties internal constructor(
    anyCtorArg: MutPtr<WsdxmlElement>,
) {
    public var any: MutPtr<WsdxmlElement> = anyCtorArg
        internal set

    public constructor() : this(
        anyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdxmlElement> = this.any

    public fun copy(any: MutPtr<WsdxmlElement> = this.any): WsdReferenceProperties = WsdReferenceProperties(anyCtorArg = any)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdReferenceProperties) return false
        if (this.any != other.any) return false
        return true
    }

    override fun hashCode(): Int = this.any.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdReferenceProperties> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdReferenceProperties> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsdReferenceProperties =
                    WsdReferenceProperties(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdxmlElement>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsdReferenceProperties) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdxmlElement>(64)
                    ).writeNative(addr, value.any)
                }
            }

        public operator fun invoke(
            any: MutPtr<WsdxmlElement> = MutPtr(0L),
        ): WsdReferenceProperties =
            WsdReferenceProperties(
                anyCtorArg = any,
            )
    }
}

public class WsdRelationshipMetadata internal constructor(
    typeCtorArg: Pcwstr,
    dataCtorArg: MutPtr<WsdHostMetadata>,
    anyCtorArg: MutPtr<WsdxmlElement>,
) {
    public var type: Pcwstr = typeCtorArg
        internal set

    public var data: MutPtr<WsdHostMetadata> = dataCtorArg
        internal set

    public var any: MutPtr<WsdxmlElement> = anyCtorArg
        internal set

    public constructor() : this(
        typeCtorArg = ConstPtr(0L),
        dataCtorArg = MutPtr(0L),
        anyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.type

    public operator fun component2(): MutPtr<WsdHostMetadata> = this.data

    public operator fun component3(): MutPtr<WsdxmlElement> = this.any

    public fun copy(type: Pcwstr = this.type, data: MutPtr<WsdHostMetadata> = this.data, any: MutPtr<WsdxmlElement> = this.any): WsdRelationshipMetadata = WsdRelationshipMetadata(typeCtorArg = type, dataCtorArg = data, anyCtorArg = any)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdRelationshipMetadata) return false
        if (this.type != other.type) return false
        if (this.data != other.data) return false
        if (this.any != other.any) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.data.hashCode()
        result = 31 * result + this.any.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            type: Pcwstr = ConstPtr(0L),
            data: MutPtr<WsdHostMetadata> = MutPtr(0L),
            any: MutPtr<WsdxmlElement> = MutPtr(0L),
        ): WsdRelationshipMetadata =
            WsdRelationshipMetadata(
                typeCtorArg = type,
                dataCtorArg = data,
                anyCtorArg = any,
            )
    }
}

public class WsdResolve internal constructor(
    endpointReferenceCtorArg: MutPtr<WsdEndpointReference>,
    anyCtorArg: MutPtr<WsdxmlElement>,
) {
    public var endpointReference: MutPtr<WsdEndpointReference> = endpointReferenceCtorArg
        internal set

    public var any: MutPtr<WsdxmlElement> = anyCtorArg
        internal set

    public constructor() : this(
        endpointReferenceCtorArg = MutPtr(0L),
        anyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdEndpointReference> = this.endpointReference

    public operator fun component2(): MutPtr<WsdxmlElement> = this.any

    public fun copy(endpointReference: MutPtr<WsdEndpointReference> = this.endpointReference, any: MutPtr<WsdxmlElement> = this.any): WsdResolve = WsdResolve(endpointReferenceCtorArg = endpointReference, anyCtorArg = any)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdResolve) return false
        if (this.endpointReference != other.endpointReference) return false
        if (this.any != other.any) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.endpointReference.hashCode()
        result = 31 * result + this.any.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdResolve> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdResolve> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsdResolve =
                    WsdResolve(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdEndpointReference>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdxmlElement>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsdResolve) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdEndpointReference>(64)
                    ).writeNative(addr, value.endpointReference)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdxmlElement>(64)
                    ).writeNative(addr + 8L, value.any)
                }
            }

        public operator fun invoke(
            endpointReference: MutPtr<WsdEndpointReference> = MutPtr(0L),
            any: MutPtr<WsdxmlElement> = MutPtr(0L),
        ): WsdResolve =
            WsdResolve(
                endpointReferenceCtorArg = endpointReference,
                anyCtorArg = any,
            )
    }
}

public class WsdResolveMatch internal constructor(
    endpointReferenceCtorArg: MutPtr<WsdEndpointReference>,
    typesCtorArg: MutPtr<WsdNameList>,
    scopesCtorArg: MutPtr<WsdScopes>,
    xAddrsCtorArg: MutPtr<WsdUriList>,
    public var metadataVersion: ULong,
    anyCtorArg: MutPtr<WsdxmlElement>,
) {
    public var endpointReference: MutPtr<WsdEndpointReference> = endpointReferenceCtorArg
        internal set

    public var types: MutPtr<WsdNameList> = typesCtorArg
        internal set

    public var scopes: MutPtr<WsdScopes> = scopesCtorArg
        internal set

    public var xAddrs: MutPtr<WsdUriList> = xAddrsCtorArg
        internal set

    public var any: MutPtr<WsdxmlElement> = anyCtorArg
        internal set

    public constructor() : this(
        endpointReferenceCtorArg = MutPtr(0L),
        typesCtorArg = MutPtr(0L),
        scopesCtorArg = MutPtr(0L),
        xAddrsCtorArg = MutPtr(0L),
        metadataVersion = 0uL,
        anyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdEndpointReference> = this.endpointReference

    public operator fun component2(): MutPtr<WsdNameList> = this.types

    public operator fun component3(): MutPtr<WsdScopes> = this.scopes

    public operator fun component4(): MutPtr<WsdUriList> = this.xAddrs

    public operator fun component5(): ULong = this.metadataVersion

    public operator fun component6(): MutPtr<WsdxmlElement> = this.any

    public fun copy(endpointReference: MutPtr<WsdEndpointReference> = this.endpointReference, types: MutPtr<WsdNameList> = this.types, scopes: MutPtr<WsdScopes> = this.scopes, xAddrs: MutPtr<WsdUriList> = this.xAddrs, metadataVersion: ULong = this.metadataVersion, any: MutPtr<WsdxmlElement> = this.any): WsdResolveMatch = WsdResolveMatch(endpointReferenceCtorArg = endpointReference, typesCtorArg = types, scopesCtorArg = scopes, xAddrsCtorArg = xAddrs, metadataVersion = metadataVersion, anyCtorArg = any)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdResolveMatch) return false
        if (this.endpointReference != other.endpointReference) return false
        if (this.types != other.types) return false
        if (this.scopes != other.scopes) return false
        if (this.xAddrs != other.xAddrs) return false
        if (this.metadataVersion != other.metadataVersion) return false
        if (this.any != other.any) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.endpointReference.hashCode()
        result = 31 * result + this.types.hashCode()
        result = 31 * result + this.scopes.hashCode()
        result = 31 * result + this.xAddrs.hashCode()
        result = 31 * result + this.metadataVersion.hashCode()
        result = 31 * result + this.any.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdResolveMatch> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdResolveMatch> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsdResolveMatch =
                    WsdResolveMatch(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdEndpointReference>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdNameList>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdScopes>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdUriList>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdxmlElement>(64)
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: WsdResolveMatch) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdEndpointReference>(64)
                    ).writeNative(addr, value.endpointReference)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdNameList>(64)
                    ).writeNative(addr + 8L, value.types)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdScopes>(64)
                    ).writeNative(addr + 16L, value.scopes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdUriList>(64)
                    ).writeNative(addr + 24L, value.xAddrs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.metadataVersion)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdxmlElement>(64)
                    ).writeNative(addr + 40L, value.any)
                }
            }

        public operator fun invoke(
            endpointReference: MutPtr<WsdEndpointReference> = MutPtr(0L),
            types: MutPtr<WsdNameList> = MutPtr(0L),
            scopes: MutPtr<WsdScopes> = MutPtr(0L),
            xAddrs: MutPtr<WsdUriList> = MutPtr(0L),
            metadataVersion: ULong = 0uL,
            any: MutPtr<WsdxmlElement> = MutPtr(0L),
        ): WsdResolveMatch =
            WsdResolveMatch(
                endpointReferenceCtorArg = endpointReference,
                typesCtorArg = types,
                scopesCtorArg = scopes,
                xAddrsCtorArg = xAddrs,
                metadataVersion = metadataVersion,
                anyCtorArg = any,
            )
    }
}

public class WsdResolveMatches internal constructor(
    resolveMatchCtorArg: MutPtr<WsdResolveMatch>,
    anyCtorArg: MutPtr<WsdxmlElement>,
) {
    public var resolveMatch: MutPtr<WsdResolveMatch> = resolveMatchCtorArg
        internal set

    public var any: MutPtr<WsdxmlElement> = anyCtorArg
        internal set

    public constructor() : this(
        resolveMatchCtorArg = MutPtr(0L),
        anyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdResolveMatch> = this.resolveMatch

    public operator fun component2(): MutPtr<WsdxmlElement> = this.any

    public fun copy(resolveMatch: MutPtr<WsdResolveMatch> = this.resolveMatch, any: MutPtr<WsdxmlElement> = this.any): WsdResolveMatches = WsdResolveMatches(resolveMatchCtorArg = resolveMatch, anyCtorArg = any)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdResolveMatches) return false
        if (this.resolveMatch != other.resolveMatch) return false
        if (this.any != other.any) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.resolveMatch.hashCode()
        result = 31 * result + this.any.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdResolveMatches> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdResolveMatches> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsdResolveMatches =
                    WsdResolveMatches(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdResolveMatch>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdxmlElement>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsdResolveMatches) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdResolveMatch>(64)
                    ).writeNative(addr, value.resolveMatch)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdxmlElement>(64)
                    ).writeNative(addr + 8L, value.any)
                }
            }

        public operator fun invoke(
            resolveMatch: MutPtr<WsdResolveMatch> = MutPtr(0L),
            any: MutPtr<WsdxmlElement> = MutPtr(0L),
        ): WsdResolveMatches =
            WsdResolveMatches(
                resolveMatchCtorArg = resolveMatch,
                anyCtorArg = any,
            )
    }
}

public class WsdScopes internal constructor(
    matchByCtorArg: Pcwstr,
    scopesCtorArg: MutPtr<WsdUriList>,
) {
    public var matchBy: Pcwstr = matchByCtorArg
        internal set

    public var scopes: MutPtr<WsdUriList> = scopesCtorArg
        internal set

    public constructor() : this(
        matchByCtorArg = ConstPtr(0L),
        scopesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.matchBy

    public operator fun component2(): MutPtr<WsdUriList> = this.scopes

    public fun copy(matchBy: Pcwstr = this.matchBy, scopes: MutPtr<WsdUriList> = this.scopes): WsdScopes = WsdScopes(matchByCtorArg = matchBy, scopesCtorArg = scopes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdScopes) return false
        if (this.matchBy != other.matchBy) return false
        if (this.scopes != other.scopes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.matchBy.hashCode()
        result = 31 * result + this.scopes.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            matchBy: Pcwstr = ConstPtr(0L),
            scopes: MutPtr<WsdUriList> = MutPtr(0L),
        ): WsdScopes =
            WsdScopes(
                matchByCtorArg = matchBy,
                scopesCtorArg = scopes,
            )
    }
}

public class WsdSecurityCertValidation internal constructor(
    certMatchArrayCtorArg: MutPtr<MutPtr<CertContext>>,
    public var dwCertMatchArrayCount: UInt,
    hCertMatchStoreCtorArg: Hcertstore,
    hCertIssuerStoreCtorArg: Hcertstore,
    public var dwCertCheckOptions: UInt,
    pszCNGHashAlgIdCtorArg: Pcwstr,
    pbCertHashCtorArg: MutPtr<UByte>,
    public var dwCertHashSize: UInt,
) {
    public var certMatchArray: MutPtr<MutPtr<CertContext>> = certMatchArrayCtorArg
        internal set

    public var hCertMatchStore: Hcertstore = hCertMatchStoreCtorArg
        internal set

    public var hCertIssuerStore: Hcertstore = hCertIssuerStoreCtorArg
        internal set

    public var pszCNGHashAlgId: Pcwstr = pszCNGHashAlgIdCtorArg
        internal set

    public var pbCertHash: MutPtr<UByte> = pbCertHashCtorArg
        internal set

    public constructor() : this(
        certMatchArrayCtorArg = MutPtr(0L),
        dwCertMatchArrayCount = 0u,
        hCertMatchStoreCtorArg = MutPtr(0L),
        hCertIssuerStoreCtorArg = MutPtr(0L),
        dwCertCheckOptions = 0u,
        pszCNGHashAlgIdCtorArg = ConstPtr(0L),
        pbCertHashCtorArg = MutPtr(0L),
        dwCertHashSize = 0u,
    )

    public operator fun component1(): MutPtr<MutPtr<CertContext>> = this.certMatchArray

    public operator fun component2(): UInt = this.dwCertMatchArrayCount

    public operator fun component3(): Hcertstore = this.hCertMatchStore

    public operator fun component4(): Hcertstore = this.hCertIssuerStore

    public operator fun component5(): UInt = this.dwCertCheckOptions

    public operator fun component6(): Pcwstr = this.pszCNGHashAlgId

    public operator fun component7(): MutPtr<UByte> = this.pbCertHash

    public operator fun component8(): UInt = this.dwCertHashSize

    public fun copy(certMatchArray: MutPtr<MutPtr<CertContext>> = this.certMatchArray, dwCertMatchArrayCount: UInt = this.dwCertMatchArrayCount, hCertMatchStore: Hcertstore = this.hCertMatchStore, hCertIssuerStore: Hcertstore = this.hCertIssuerStore, dwCertCheckOptions: UInt = this.dwCertCheckOptions, pszCNGHashAlgId: Pcwstr = this.pszCNGHashAlgId, pbCertHash: MutPtr<UByte> = this.pbCertHash, dwCertHashSize: UInt = this.dwCertHashSize): WsdSecurityCertValidation = WsdSecurityCertValidation(certMatchArrayCtorArg = certMatchArray, dwCertMatchArrayCount = dwCertMatchArrayCount, hCertMatchStoreCtorArg = hCertMatchStore, hCertIssuerStoreCtorArg = hCertIssuerStore, dwCertCheckOptions = dwCertCheckOptions, pszCNGHashAlgIdCtorArg = pszCNGHashAlgId, pbCertHashCtorArg = pbCertHash, dwCertHashSize = dwCertHashSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdSecurityCertValidation) return false
        if (this.certMatchArray != other.certMatchArray) return false
        if (this.dwCertMatchArrayCount != other.dwCertMatchArrayCount) return false
        if (this.hCertMatchStore != other.hCertMatchStore) return false
        if (this.hCertIssuerStore != other.hCertIssuerStore) return false
        if (this.dwCertCheckOptions != other.dwCertCheckOptions) return false
        if (this.pszCNGHashAlgId != other.pszCNGHashAlgId) return false
        if (this.pbCertHash != other.pbCertHash) return false
        if (this.dwCertHashSize != other.dwCertHashSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.certMatchArray.hashCode()
        result = 31 * result + this.dwCertMatchArrayCount.hashCode()
        result = 31 * result + this.hCertMatchStore.hashCode()
        result = 31 * result + this.hCertIssuerStore.hashCode()
        result = 31 * result + this.dwCertCheckOptions.hashCode()
        result = 31 * result + this.pszCNGHashAlgId.hashCode()
        result = 31 * result + this.pbCertHash.hashCode()
        result = 31 * result + this.dwCertHashSize.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            certMatchArray: MutPtr<MutPtr<CertContext>> = MutPtr(0L),
            dwCertMatchArrayCount: UInt = 0u,
            hCertMatchStore: Hcertstore = MutPtr(0L),
            hCertIssuerStore: Hcertstore = MutPtr(0L),
            dwCertCheckOptions: UInt = 0u,
            pszCNGHashAlgId: Pcwstr = ConstPtr(0L),
            pbCertHash: MutPtr<UByte> = MutPtr(0L),
            dwCertHashSize: UInt = 0u,
        ): WsdSecurityCertValidation =
            WsdSecurityCertValidation(
                certMatchArrayCtorArg = certMatchArray,
                dwCertMatchArrayCount = dwCertMatchArrayCount,
                hCertMatchStoreCtorArg = hCertMatchStore,
                hCertIssuerStoreCtorArg = hCertIssuerStore,
                dwCertCheckOptions = dwCertCheckOptions,
                pszCNGHashAlgIdCtorArg = pszCNGHashAlgId,
                pbCertHashCtorArg = pbCertHash,
                dwCertHashSize = dwCertHashSize,
            )
    }
}

public class WsdSecurityCertValidationV1 internal constructor(
    certMatchArrayCtorArg: MutPtr<MutPtr<CertContext>>,
    public var dwCertMatchArrayCount: UInt,
    hCertMatchStoreCtorArg: Hcertstore,
    hCertIssuerStoreCtorArg: Hcertstore,
    public var dwCertCheckOptions: UInt,
) {
    public var certMatchArray: MutPtr<MutPtr<CertContext>> = certMatchArrayCtorArg
        internal set

    public var hCertMatchStore: Hcertstore = hCertMatchStoreCtorArg
        internal set

    public var hCertIssuerStore: Hcertstore = hCertIssuerStoreCtorArg
        internal set

    public constructor() : this(
        certMatchArrayCtorArg = MutPtr(0L),
        dwCertMatchArrayCount = 0u,
        hCertMatchStoreCtorArg = MutPtr(0L),
        hCertIssuerStoreCtorArg = MutPtr(0L),
        dwCertCheckOptions = 0u,
    )

    public operator fun component1(): MutPtr<MutPtr<CertContext>> = this.certMatchArray

    public operator fun component2(): UInt = this.dwCertMatchArrayCount

    public operator fun component3(): Hcertstore = this.hCertMatchStore

    public operator fun component4(): Hcertstore = this.hCertIssuerStore

    public operator fun component5(): UInt = this.dwCertCheckOptions

    public fun copy(certMatchArray: MutPtr<MutPtr<CertContext>> = this.certMatchArray, dwCertMatchArrayCount: UInt = this.dwCertMatchArrayCount, hCertMatchStore: Hcertstore = this.hCertMatchStore, hCertIssuerStore: Hcertstore = this.hCertIssuerStore, dwCertCheckOptions: UInt = this.dwCertCheckOptions): WsdSecurityCertValidationV1 = WsdSecurityCertValidationV1(certMatchArrayCtorArg = certMatchArray, dwCertMatchArrayCount = dwCertMatchArrayCount, hCertMatchStoreCtorArg = hCertMatchStore, hCertIssuerStoreCtorArg = hCertIssuerStore, dwCertCheckOptions = dwCertCheckOptions)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdSecurityCertValidationV1) return false
        if (this.certMatchArray != other.certMatchArray) return false
        if (this.dwCertMatchArrayCount != other.dwCertMatchArrayCount) return false
        if (this.hCertMatchStore != other.hCertMatchStore) return false
        if (this.hCertIssuerStore != other.hCertIssuerStore) return false
        if (this.dwCertCheckOptions != other.dwCertCheckOptions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.certMatchArray.hashCode()
        result = 31 * result + this.dwCertMatchArrayCount.hashCode()
        result = 31 * result + this.hCertMatchStore.hashCode()
        result = 31 * result + this.hCertIssuerStore.hashCode()
        result = 31 * result + this.dwCertCheckOptions.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            certMatchArray: MutPtr<MutPtr<CertContext>> = MutPtr(0L),
            dwCertMatchArrayCount: UInt = 0u,
            hCertMatchStore: Hcertstore = MutPtr(0L),
            hCertIssuerStore: Hcertstore = MutPtr(0L),
            dwCertCheckOptions: UInt = 0u,
        ): WsdSecurityCertValidationV1 =
            WsdSecurityCertValidationV1(
                certMatchArrayCtorArg = certMatchArray,
                dwCertMatchArrayCount = dwCertMatchArrayCount,
                hCertMatchStoreCtorArg = hCertMatchStore,
                hCertIssuerStoreCtorArg = hCertIssuerStore,
                dwCertCheckOptions = dwCertCheckOptions,
            )
    }
}

public class WsdSecuritySignatureValidation internal constructor(
    signingCertArrayCtorArg: MutPtr<MutPtr<CertContext>>,
    public var dwSigningCertArrayCount: UInt,
    hSigningCertStoreCtorArg: Hcertstore,
    public var dwFlags: UInt,
) {
    public var signingCertArray: MutPtr<MutPtr<CertContext>> = signingCertArrayCtorArg
        internal set

    public var hSigningCertStore: Hcertstore = hSigningCertStoreCtorArg
        internal set

    public constructor() : this(
        signingCertArrayCtorArg = MutPtr(0L),
        dwSigningCertArrayCount = 0u,
        hSigningCertStoreCtorArg = MutPtr(0L),
        dwFlags = 0u,
    )

    public operator fun component1(): MutPtr<MutPtr<CertContext>> = this.signingCertArray

    public operator fun component2(): UInt = this.dwSigningCertArrayCount

    public operator fun component3(): Hcertstore = this.hSigningCertStore

    public operator fun component4(): UInt = this.dwFlags

    public fun copy(signingCertArray: MutPtr<MutPtr<CertContext>> = this.signingCertArray, dwSigningCertArrayCount: UInt = this.dwSigningCertArrayCount, hSigningCertStore: Hcertstore = this.hSigningCertStore, dwFlags: UInt = this.dwFlags): WsdSecuritySignatureValidation = WsdSecuritySignatureValidation(signingCertArrayCtorArg = signingCertArray, dwSigningCertArrayCount = dwSigningCertArrayCount, hSigningCertStoreCtorArg = hSigningCertStore, dwFlags = dwFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdSecuritySignatureValidation) return false
        if (this.signingCertArray != other.signingCertArray) return false
        if (this.dwSigningCertArrayCount != other.dwSigningCertArrayCount) return false
        if (this.hSigningCertStore != other.hSigningCertStore) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.signingCertArray.hashCode()
        result = 31 * result + this.dwSigningCertArrayCount.hashCode()
        result = 31 * result + this.hSigningCertStore.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            signingCertArray: MutPtr<MutPtr<CertContext>> = MutPtr(0L),
            dwSigningCertArrayCount: UInt = 0u,
            hSigningCertStore: Hcertstore = MutPtr(0L),
            dwFlags: UInt = 0u,
        ): WsdSecuritySignatureValidation =
            WsdSecuritySignatureValidation(
                signingCertArrayCtorArg = signingCertArray,
                dwSigningCertArrayCount = dwSigningCertArrayCount,
                hSigningCertStoreCtorArg = hSigningCertStore,
                dwFlags = dwFlags,
            )
    }
}

public class WsdServiceMetadata internal constructor(
    endpointReferenceCtorArg: MutPtr<WsdEndpointReferenceList>,
    typesCtorArg: MutPtr<WsdNameList>,
    serviceIdCtorArg: Pcwstr,
    anyCtorArg: MutPtr<WsdxmlElement>,
) {
    public var endpointReference: MutPtr<WsdEndpointReferenceList> = endpointReferenceCtorArg
        internal set

    public var types: MutPtr<WsdNameList> = typesCtorArg
        internal set

    public var serviceId: Pcwstr = serviceIdCtorArg
        internal set

    public var any: MutPtr<WsdxmlElement> = anyCtorArg
        internal set

    public constructor() : this(
        endpointReferenceCtorArg = MutPtr(0L),
        typesCtorArg = MutPtr(0L),
        serviceIdCtorArg = ConstPtr(0L),
        anyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdEndpointReferenceList> = this.endpointReference

    public operator fun component2(): MutPtr<WsdNameList> = this.types

    public operator fun component3(): Pcwstr = this.serviceId

    public operator fun component4(): MutPtr<WsdxmlElement> = this.any

    public fun copy(endpointReference: MutPtr<WsdEndpointReferenceList> = this.endpointReference, types: MutPtr<WsdNameList> = this.types, serviceId: Pcwstr = this.serviceId, any: MutPtr<WsdxmlElement> = this.any): WsdServiceMetadata = WsdServiceMetadata(endpointReferenceCtorArg = endpointReference, typesCtorArg = types, serviceIdCtorArg = serviceId, anyCtorArg = any)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdServiceMetadata) return false
        if (this.endpointReference != other.endpointReference) return false
        if (this.types != other.types) return false
        if (this.serviceId != other.serviceId) return false
        if (this.any != other.any) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.endpointReference.hashCode()
        result = 31 * result + this.types.hashCode()
        result = 31 * result + this.serviceId.hashCode()
        result = 31 * result + this.any.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            endpointReference: MutPtr<WsdEndpointReferenceList> = MutPtr(0L),
            types: MutPtr<WsdNameList> = MutPtr(0L),
            serviceId: Pcwstr = ConstPtr(0L),
            any: MutPtr<WsdxmlElement> = MutPtr(0L),
        ): WsdServiceMetadata =
            WsdServiceMetadata(
                endpointReferenceCtorArg = endpointReference,
                typesCtorArg = types,
                serviceIdCtorArg = serviceId,
                anyCtorArg = any,
            )
    }
}

public class WsdServiceMetadataList internal constructor(
    nextCtorArg: MutPtr<WsdServiceMetadataList>,
    elementCtorArg: MutPtr<WsdServiceMetadata>,
) {
    public var next: MutPtr<WsdServiceMetadataList> = nextCtorArg
        internal set

    public var element: MutPtr<WsdServiceMetadata> = elementCtorArg
        internal set

    public constructor() : this(
        nextCtorArg = MutPtr(0L),
        elementCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdServiceMetadataList> = this.next

    public operator fun component2(): MutPtr<WsdServiceMetadata> = this.element

    public fun copy(next: MutPtr<WsdServiceMetadataList> = this.next, element: MutPtr<WsdServiceMetadata> = this.element): WsdServiceMetadataList = WsdServiceMetadataList(nextCtorArg = next, elementCtorArg = element)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdServiceMetadataList) return false
        if (this.next != other.next) return false
        if (this.element != other.element) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.next.hashCode()
        result = 31 * result + this.element.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdServiceMetadataList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdServiceMetadataList> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsdServiceMetadataList =
                    WsdServiceMetadataList(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdServiceMetadataList>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdServiceMetadata>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsdServiceMetadataList) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdServiceMetadataList>(64)
                    ).writeNative(addr, value.next)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdServiceMetadata>(64)
                    ).writeNative(addr + 8L, value.element)
                }
            }

        public operator fun invoke(
            next: MutPtr<WsdServiceMetadataList> = MutPtr(0L),
            element: MutPtr<WsdServiceMetadata> = MutPtr(0L),
        ): WsdServiceMetadataList =
            WsdServiceMetadataList(
                nextCtorArg = next,
                elementCtorArg = element,
            )
    }
}

public class WsdSoapFault internal constructor(
    codeCtorArg: MutPtr<WsdSoapFaultCode>,
    reasonCtorArg: MutPtr<WsdSoapFaultReason>,
    nodeCtorArg: Pcwstr,
    roleCtorArg: Pcwstr,
    detailCtorArg: MutPtr<WsdxmlElement>,
) {
    public var code: MutPtr<WsdSoapFaultCode> = codeCtorArg
        internal set

    public var reason: MutPtr<WsdSoapFaultReason> = reasonCtorArg
        internal set

    public var node: Pcwstr = nodeCtorArg
        internal set

    public var role: Pcwstr = roleCtorArg
        internal set

    public var detail: MutPtr<WsdxmlElement> = detailCtorArg
        internal set

    public constructor() : this(
        codeCtorArg = MutPtr(0L),
        reasonCtorArg = MutPtr(0L),
        nodeCtorArg = ConstPtr(0L),
        roleCtorArg = ConstPtr(0L),
        detailCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdSoapFaultCode> = this.code

    public operator fun component2(): MutPtr<WsdSoapFaultReason> = this.reason

    public operator fun component3(): Pcwstr = this.node

    public operator fun component4(): Pcwstr = this.role

    public operator fun component5(): MutPtr<WsdxmlElement> = this.detail

    public fun copy(code: MutPtr<WsdSoapFaultCode> = this.code, reason: MutPtr<WsdSoapFaultReason> = this.reason, node: Pcwstr = this.node, role: Pcwstr = this.role, detail: MutPtr<WsdxmlElement> = this.detail): WsdSoapFault = WsdSoapFault(codeCtorArg = code, reasonCtorArg = reason, nodeCtorArg = node, roleCtorArg = role, detailCtorArg = detail)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdSoapFault) return false
        if (this.code != other.code) return false
        if (this.reason != other.reason) return false
        if (this.node != other.node) return false
        if (this.role != other.role) return false
        if (this.detail != other.detail) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.code.hashCode()
        result = 31 * result + this.reason.hashCode()
        result = 31 * result + this.node.hashCode()
        result = 31 * result + this.role.hashCode()
        result = 31 * result + this.detail.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            code: MutPtr<WsdSoapFaultCode> = MutPtr(0L),
            reason: MutPtr<WsdSoapFaultReason> = MutPtr(0L),
            node: Pcwstr = ConstPtr(0L),
            role: Pcwstr = ConstPtr(0L),
            detail: MutPtr<WsdxmlElement> = MutPtr(0L),
        ): WsdSoapFault =
            WsdSoapFault(
                codeCtorArg = code,
                reasonCtorArg = reason,
                nodeCtorArg = node,
                roleCtorArg = role,
                detailCtorArg = detail,
            )
    }
}

public class WsdSoapFaultCode internal constructor(
    valueCtorArg: MutPtr<WsdxmlName>,
    subcodeCtorArg: MutPtr<WsdSoapFaultSubcode>,
) {
    public var value: MutPtr<WsdxmlName> = valueCtorArg
        internal set

    public var subcode: MutPtr<WsdSoapFaultSubcode> = subcodeCtorArg
        internal set

    public constructor() : this(
        valueCtorArg = MutPtr(0L),
        subcodeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdxmlName> = this.value

    public operator fun component2(): MutPtr<WsdSoapFaultSubcode> = this.subcode

    public fun copy(value: MutPtr<WsdxmlName> = this.value, subcode: MutPtr<WsdSoapFaultSubcode> = this.subcode): WsdSoapFaultCode = WsdSoapFaultCode(valueCtorArg = value, subcodeCtorArg = subcode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdSoapFaultCode) return false
        if (this.value != other.value) return false
        if (this.subcode != other.subcode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.value.hashCode()
        result = 31 * result + this.subcode.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdSoapFaultCode> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdSoapFaultCode> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsdSoapFaultCode =
                    WsdSoapFaultCode(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdxmlName>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdSoapFaultSubcode>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsdSoapFaultCode) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdxmlName>(64)
                    ).writeNative(addr, value.value)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdSoapFaultSubcode>(64)
                    ).writeNative(addr + 8L, value.subcode)
                }
            }

        public operator fun invoke(
            value: MutPtr<WsdxmlName> = MutPtr(0L),
            subcode: MutPtr<WsdSoapFaultSubcode> = MutPtr(0L),
        ): WsdSoapFaultCode =
            WsdSoapFaultCode(
                valueCtorArg = value,
                subcodeCtorArg = subcode,
            )
    }
}

public class WsdSoapFaultReason internal constructor(
    textCtorArg: MutPtr<WsdLocalizedStringList>,
) {
    public var text: MutPtr<WsdLocalizedStringList> = textCtorArg
        internal set

    public constructor() : this(
        textCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdLocalizedStringList> = this.text

    public fun copy(text: MutPtr<WsdLocalizedStringList> = this.text): WsdSoapFaultReason = WsdSoapFaultReason(textCtorArg = text)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdSoapFaultReason) return false
        if (this.text != other.text) return false
        return true
    }

    override fun hashCode(): Int = this.text.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdSoapFaultReason> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdSoapFaultReason> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsdSoapFaultReason =
                    WsdSoapFaultReason(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdLocalizedStringList>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsdSoapFaultReason) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdLocalizedStringList>(64)
                    ).writeNative(addr, value.text)
                }
            }

        public operator fun invoke(
            text: MutPtr<WsdLocalizedStringList> = MutPtr(0L),
        ): WsdSoapFaultReason =
            WsdSoapFaultReason(
                textCtorArg = text,
            )
    }
}

public class WsdSoapFaultSubcode internal constructor(
    valueCtorArg: MutPtr<WsdxmlName>,
    subcodeCtorArg: MutPtr<WsdSoapFaultSubcode>,
) {
    public var value: MutPtr<WsdxmlName> = valueCtorArg
        internal set

    public var subcode: MutPtr<WsdSoapFaultSubcode> = subcodeCtorArg
        internal set

    public constructor() : this(
        valueCtorArg = MutPtr(0L),
        subcodeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdxmlName> = this.value

    public operator fun component2(): MutPtr<WsdSoapFaultSubcode> = this.subcode

    public fun copy(value: MutPtr<WsdxmlName> = this.value, subcode: MutPtr<WsdSoapFaultSubcode> = this.subcode): WsdSoapFaultSubcode = WsdSoapFaultSubcode(valueCtorArg = value, subcodeCtorArg = subcode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdSoapFaultSubcode) return false
        if (this.value != other.value) return false
        if (this.subcode != other.subcode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.value.hashCode()
        result = 31 * result + this.subcode.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdSoapFaultSubcode> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdSoapFaultSubcode> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsdSoapFaultSubcode =
                    WsdSoapFaultSubcode(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdxmlName>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdSoapFaultSubcode>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsdSoapFaultSubcode) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdxmlName>(64)
                    ).writeNative(addr, value.value)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdSoapFaultSubcode>(64)
                    ).writeNative(addr + 8L, value.subcode)
                }
            }

        public operator fun invoke(
            value: MutPtr<WsdxmlName> = MutPtr(0L),
            subcode: MutPtr<WsdSoapFaultSubcode> = MutPtr(0L),
        ): WsdSoapFaultSubcode =
            WsdSoapFaultSubcode(
                valueCtorArg = value,
                subcodeCtorArg = subcode,
            )
    }
}

public class WsdSoapHeader internal constructor(
    toCtorArg: Pcwstr,
    actionCtorArg: Pcwstr,
    messageIDCtorArg: Pcwstr,
    public var relatesTo: WsdHeaderRelatesto,
    replyToCtorArg: MutPtr<WsdEndpointReference>,
    fromCtorArg: MutPtr<WsdEndpointReference>,
    faultToCtorArg: MutPtr<WsdEndpointReference>,
    appSequenceCtorArg: MutPtr<WsdAppSequence>,
    anyHeadersCtorArg: MutPtr<WsdxmlElement>,
) {
    public var to: Pcwstr = toCtorArg
        internal set

    public var action: Pcwstr = actionCtorArg
        internal set

    public var messageID: Pcwstr = messageIDCtorArg
        internal set

    public var replyTo: MutPtr<WsdEndpointReference> = replyToCtorArg
        internal set

    public var from: MutPtr<WsdEndpointReference> = fromCtorArg
        internal set

    public var faultTo: MutPtr<WsdEndpointReference> = faultToCtorArg
        internal set

    public var appSequence: MutPtr<WsdAppSequence> = appSequenceCtorArg
        internal set

    public var anyHeaders: MutPtr<WsdxmlElement> = anyHeadersCtorArg
        internal set

    public constructor() : this(
        toCtorArg = ConstPtr(0L),
        actionCtorArg = ConstPtr(0L),
        messageIDCtorArg = ConstPtr(0L),
        relatesTo = WsdHeaderRelatesto(),
        replyToCtorArg = MutPtr(0L),
        fromCtorArg = MutPtr(0L),
        faultToCtorArg = MutPtr(0L),
        appSequenceCtorArg = MutPtr(0L),
        anyHeadersCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.to

    public operator fun component2(): Pcwstr = this.action

    public operator fun component3(): Pcwstr = this.messageID

    public operator fun component4(): WsdHeaderRelatesto = this.relatesTo

    public operator fun component5(): MutPtr<WsdEndpointReference> = this.replyTo

    public operator fun component6(): MutPtr<WsdEndpointReference> = this.from

    public operator fun component7(): MutPtr<WsdEndpointReference> = this.faultTo

    public operator fun component8(): MutPtr<WsdAppSequence> = this.appSequence

    public operator fun component9(): MutPtr<WsdxmlElement> = this.anyHeaders

    public fun copy(to: Pcwstr = this.to, action: Pcwstr = this.action, messageID: Pcwstr = this.messageID, relatesTo: WsdHeaderRelatesto = this.relatesTo, replyTo: MutPtr<WsdEndpointReference> = this.replyTo, from: MutPtr<WsdEndpointReference> = this.from, faultTo: MutPtr<WsdEndpointReference> = this.faultTo, appSequence: MutPtr<WsdAppSequence> = this.appSequence, anyHeaders: MutPtr<WsdxmlElement> = this.anyHeaders): WsdSoapHeader = WsdSoapHeader(toCtorArg = to, actionCtorArg = action, messageIDCtorArg = messageID, relatesTo = relatesTo, replyToCtorArg = replyTo, fromCtorArg = from, faultToCtorArg = faultTo, appSequenceCtorArg = appSequence, anyHeadersCtorArg = anyHeaders)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdSoapHeader) return false
        if (this.to != other.to) return false
        if (this.action != other.action) return false
        if (this.messageID != other.messageID) return false
        if (this.relatesTo != other.relatesTo) return false
        if (this.replyTo != other.replyTo) return false
        if (this.from != other.from) return false
        if (this.faultTo != other.faultTo) return false
        if (this.appSequence != other.appSequence) return false
        if (this.anyHeaders != other.anyHeaders) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.to.hashCode()
        result = 31 * result + this.action.hashCode()
        result = 31 * result + this.messageID.hashCode()
        result = 31 * result + this.relatesTo.hashCode()
        result = 31 * result + this.replyTo.hashCode()
        result = 31 * result + this.from.hashCode()
        result = 31 * result + this.faultTo.hashCode()
        result = 31 * result + this.appSequence.hashCode()
        result = 31 * result + this.anyHeaders.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            to: Pcwstr = ConstPtr(0L),
            action: Pcwstr = ConstPtr(0L),
            messageID: Pcwstr = ConstPtr(0L),
            relatesTo: WsdHeaderRelatesto = WsdHeaderRelatesto(),
            replyTo: MutPtr<WsdEndpointReference> = MutPtr(0L),
            from: MutPtr<WsdEndpointReference> = MutPtr(0L),
            faultTo: MutPtr<WsdEndpointReference> = MutPtr(0L),
            appSequence: MutPtr<WsdAppSequence> = MutPtr(0L),
            anyHeaders: MutPtr<WsdxmlElement> = MutPtr(0L),
        ): WsdSoapHeader =
            WsdSoapHeader(
                toCtorArg = to,
                actionCtorArg = action,
                messageIDCtorArg = messageID,
                relatesTo = relatesTo,
                replyToCtorArg = replyTo,
                fromCtorArg = from,
                faultToCtorArg = faultTo,
                appSequenceCtorArg = appSequence,
                anyHeadersCtorArg = anyHeaders,
            )
    }
}

public class WsdSoapMessage internal constructor(
    public var header: WsdSoapHeader,
    bodyCtorArg: MutPtr<CVoid>,
    bodyTypeCtorArg: MutPtr<WsdxmlType>,
) {
    public var body: MutPtr<CVoid> = bodyCtorArg
        internal set

    public var bodyType: MutPtr<WsdxmlType> = bodyTypeCtorArg
        internal set

    public constructor() : this(
        header = WsdSoapHeader(),
        bodyCtorArg = MutPtr(0L),
        bodyTypeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WsdSoapHeader = this.header

    public operator fun component2(): MutPtr<CVoid> = this.body

    public operator fun component3(): MutPtr<WsdxmlType> = this.bodyType

    public fun copy(header: WsdSoapHeader = this.header, body: MutPtr<CVoid> = this.body, bodyType: MutPtr<WsdxmlType> = this.bodyType): WsdSoapMessage = WsdSoapMessage(header = header, bodyCtorArg = body, bodyTypeCtorArg = bodyType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdSoapMessage) return false
        if (this.header != other.header) return false
        if (this.body != other.body) return false
        if (this.bodyType != other.bodyType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.body.hashCode()
        result = 31 * result + this.bodyType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            header: WsdSoapHeader = WsdSoapHeader(),
            body: MutPtr<CVoid> = MutPtr(0L),
            bodyType: MutPtr<WsdxmlType> = MutPtr(0L),
        ): WsdSoapMessage =
            WsdSoapMessage(
                header = header,
                bodyCtorArg = body,
                bodyTypeCtorArg = bodyType,
            )
    }
}

public class WsdSynchronousResponseContext internal constructor(
    public var hr: Hresult,
    eventHandleCtorArg: Handle,
    messageParametersCtorArg: MutPtr<CVoid>,
    resultsCtorArg: MutPtr<CVoid>,
) {
    public var eventHandle: Handle = eventHandleCtorArg
        internal set

    public var messageParameters: MutPtr<CVoid> = messageParametersCtorArg
        internal set

    public var results: MutPtr<CVoid> = resultsCtorArg
        internal set

    public constructor() : this(
        hr = 0,
        eventHandleCtorArg = MutPtr(0L),
        messageParametersCtorArg = MutPtr(0L),
        resultsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Hresult = this.hr

    public operator fun component2(): Handle = this.eventHandle

    public operator fun component3(): MutPtr<CVoid> = this.messageParameters

    public operator fun component4(): MutPtr<CVoid> = this.results

    public fun copy(hr: Hresult = this.hr, eventHandle: Handle = this.eventHandle, messageParameters: MutPtr<CVoid> = this.messageParameters, results: MutPtr<CVoid> = this.results): WsdSynchronousResponseContext = WsdSynchronousResponseContext(hr = hr, eventHandleCtorArg = eventHandle, messageParametersCtorArg = messageParameters, resultsCtorArg = results)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdSynchronousResponseContext) return false
        if (this.hr != other.hr) return false
        if (this.eventHandle != other.eventHandle) return false
        if (this.messageParameters != other.messageParameters) return false
        if (this.results != other.results) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hr.hashCode()
        result = 31 * result + this.eventHandle.hashCode()
        result = 31 * result + this.messageParameters.hashCode()
        result = 31 * result + this.results.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hr: Hresult = 0,
            eventHandle: Handle = MutPtr(0L),
            messageParameters: MutPtr<CVoid> = MutPtr(0L),
            results: MutPtr<CVoid> = MutPtr(0L),
        ): WsdSynchronousResponseContext =
            WsdSynchronousResponseContext(
                hr = hr,
                eventHandleCtorArg = eventHandle,
                messageParametersCtorArg = messageParameters,
                resultsCtorArg = results,
            )
    }
}

public class WsdThisDeviceMetadata internal constructor(
    friendlyNameCtorArg: MutPtr<WsdLocalizedStringList>,
    firmwareVersionCtorArg: Pcwstr,
    serialNumberCtorArg: Pcwstr,
    anyCtorArg: MutPtr<WsdxmlElement>,
) {
    public var friendlyName: MutPtr<WsdLocalizedStringList> = friendlyNameCtorArg
        internal set

    public var firmwareVersion: Pcwstr = firmwareVersionCtorArg
        internal set

    public var serialNumber: Pcwstr = serialNumberCtorArg
        internal set

    public var any: MutPtr<WsdxmlElement> = anyCtorArg
        internal set

    public constructor() : this(
        friendlyNameCtorArg = MutPtr(0L),
        firmwareVersionCtorArg = ConstPtr(0L),
        serialNumberCtorArg = ConstPtr(0L),
        anyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdLocalizedStringList> = this.friendlyName

    public operator fun component2(): Pcwstr = this.firmwareVersion

    public operator fun component3(): Pcwstr = this.serialNumber

    public operator fun component4(): MutPtr<WsdxmlElement> = this.any

    public fun copy(friendlyName: MutPtr<WsdLocalizedStringList> = this.friendlyName, firmwareVersion: Pcwstr = this.firmwareVersion, serialNumber: Pcwstr = this.serialNumber, any: MutPtr<WsdxmlElement> = this.any): WsdThisDeviceMetadata = WsdThisDeviceMetadata(friendlyNameCtorArg = friendlyName, firmwareVersionCtorArg = firmwareVersion, serialNumberCtorArg = serialNumber, anyCtorArg = any)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdThisDeviceMetadata) return false
        if (this.friendlyName != other.friendlyName) return false
        if (this.firmwareVersion != other.firmwareVersion) return false
        if (this.serialNumber != other.serialNumber) return false
        if (this.any != other.any) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.friendlyName.hashCode()
        result = 31 * result + this.firmwareVersion.hashCode()
        result = 31 * result + this.serialNumber.hashCode()
        result = 31 * result + this.any.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            friendlyName: MutPtr<WsdLocalizedStringList> = MutPtr(0L),
            firmwareVersion: Pcwstr = ConstPtr(0L),
            serialNumber: Pcwstr = ConstPtr(0L),
            any: MutPtr<WsdxmlElement> = MutPtr(0L),
        ): WsdThisDeviceMetadata =
            WsdThisDeviceMetadata(
                friendlyNameCtorArg = friendlyName,
                firmwareVersionCtorArg = firmwareVersion,
                serialNumberCtorArg = serialNumber,
                anyCtorArg = any,
            )
    }
}

public class WsdThisModelMetadata internal constructor(
    manufacturerCtorArg: MutPtr<WsdLocalizedStringList>,
    manufacturerUrlCtorArg: Pcwstr,
    modelNameCtorArg: MutPtr<WsdLocalizedStringList>,
    modelNumberCtorArg: Pcwstr,
    modelUrlCtorArg: Pcwstr,
    presentationUrlCtorArg: Pcwstr,
    anyCtorArg: MutPtr<WsdxmlElement>,
) {
    public var manufacturer: MutPtr<WsdLocalizedStringList> = manufacturerCtorArg
        internal set

    public var manufacturerUrl: Pcwstr = manufacturerUrlCtorArg
        internal set

    public var modelName: MutPtr<WsdLocalizedStringList> = modelNameCtorArg
        internal set

    public var modelNumber: Pcwstr = modelNumberCtorArg
        internal set

    public var modelUrl: Pcwstr = modelUrlCtorArg
        internal set

    public var presentationUrl: Pcwstr = presentationUrlCtorArg
        internal set

    public var any: MutPtr<WsdxmlElement> = anyCtorArg
        internal set

    public constructor() : this(
        manufacturerCtorArg = MutPtr(0L),
        manufacturerUrlCtorArg = ConstPtr(0L),
        modelNameCtorArg = MutPtr(0L),
        modelNumberCtorArg = ConstPtr(0L),
        modelUrlCtorArg = ConstPtr(0L),
        presentationUrlCtorArg = ConstPtr(0L),
        anyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdLocalizedStringList> = this.manufacturer

    public operator fun component2(): Pcwstr = this.manufacturerUrl

    public operator fun component3(): MutPtr<WsdLocalizedStringList> = this.modelName

    public operator fun component4(): Pcwstr = this.modelNumber

    public operator fun component5(): Pcwstr = this.modelUrl

    public operator fun component6(): Pcwstr = this.presentationUrl

    public operator fun component7(): MutPtr<WsdxmlElement> = this.any

    public fun copy(manufacturer: MutPtr<WsdLocalizedStringList> = this.manufacturer, manufacturerUrl: Pcwstr = this.manufacturerUrl, modelName: MutPtr<WsdLocalizedStringList> = this.modelName, modelNumber: Pcwstr = this.modelNumber, modelUrl: Pcwstr = this.modelUrl, presentationUrl: Pcwstr = this.presentationUrl, any: MutPtr<WsdxmlElement> = this.any): WsdThisModelMetadata = WsdThisModelMetadata(manufacturerCtorArg = manufacturer, manufacturerUrlCtorArg = manufacturerUrl, modelNameCtorArg = modelName, modelNumberCtorArg = modelNumber, modelUrlCtorArg = modelUrl, presentationUrlCtorArg = presentationUrl, anyCtorArg = any)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdThisModelMetadata) return false
        if (this.manufacturer != other.manufacturer) return false
        if (this.manufacturerUrl != other.manufacturerUrl) return false
        if (this.modelName != other.modelName) return false
        if (this.modelNumber != other.modelNumber) return false
        if (this.modelUrl != other.modelUrl) return false
        if (this.presentationUrl != other.presentationUrl) return false
        if (this.any != other.any) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.manufacturer.hashCode()
        result = 31 * result + this.manufacturerUrl.hashCode()
        result = 31 * result + this.modelName.hashCode()
        result = 31 * result + this.modelNumber.hashCode()
        result = 31 * result + this.modelUrl.hashCode()
        result = 31 * result + this.presentationUrl.hashCode()
        result = 31 * result + this.any.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            manufacturer: MutPtr<WsdLocalizedStringList> = MutPtr(0L),
            manufacturerUrl: Pcwstr = ConstPtr(0L),
            modelName: MutPtr<WsdLocalizedStringList> = MutPtr(0L),
            modelNumber: Pcwstr = ConstPtr(0L),
            modelUrl: Pcwstr = ConstPtr(0L),
            presentationUrl: Pcwstr = ConstPtr(0L),
            any: MutPtr<WsdxmlElement> = MutPtr(0L),
        ): WsdThisModelMetadata =
            WsdThisModelMetadata(
                manufacturerCtorArg = manufacturer,
                manufacturerUrlCtorArg = manufacturerUrl,
                modelNameCtorArg = modelName,
                modelNumberCtorArg = modelNumber,
                modelUrlCtorArg = modelUrl,
                presentationUrlCtorArg = presentationUrl,
                anyCtorArg = any,
            )
    }
}

public class WsdUnknownLookup internal constructor(
    anyCtorArg: MutPtr<WsdxmlElement>,
) {
    public var any: MutPtr<WsdxmlElement> = anyCtorArg
        internal set

    public constructor() : this(
        anyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdxmlElement> = this.any

    public fun copy(any: MutPtr<WsdxmlElement> = this.any): WsdUnknownLookup = WsdUnknownLookup(anyCtorArg = any)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdUnknownLookup) return false
        if (this.any != other.any) return false
        return true
    }

    override fun hashCode(): Int = this.any.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdUnknownLookup> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsdUnknownLookup> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsdUnknownLookup =
                    WsdUnknownLookup(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsdxmlElement>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsdUnknownLookup) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsdxmlElement>(64)
                    ).writeNative(addr, value.any)
                }
            }

        public operator fun invoke(
            any: MutPtr<WsdxmlElement> = MutPtr(0L),
        ): WsdUnknownLookup =
            WsdUnknownLookup(
                anyCtorArg = any,
            )
    }
}

public class WsdUriList internal constructor(
    nextCtorArg: MutPtr<WsdUriList>,
    elementCtorArg: Pcwstr,
) {
    public var next: MutPtr<WsdUriList> = nextCtorArg
        internal set

    public var element: Pcwstr = elementCtorArg
        internal set

    public constructor() : this(
        nextCtorArg = MutPtr(0L),
        elementCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): MutPtr<WsdUriList> = this.next

    public operator fun component2(): Pcwstr = this.element

    public fun copy(next: MutPtr<WsdUriList> = this.next, element: Pcwstr = this.element): WsdUriList = WsdUriList(nextCtorArg = next, elementCtorArg = element)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsdUriList) return false
        if (this.next != other.next) return false
        if (this.element != other.element) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.next.hashCode()
        result = 31 * result + this.element.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            next: MutPtr<WsdUriList> = MutPtr(0L),
            element: Pcwstr = ConstPtr(0L),
        ): WsdUriList =
            WsdUriList(
                nextCtorArg = next,
                elementCtorArg = element,
            )
    }
}
