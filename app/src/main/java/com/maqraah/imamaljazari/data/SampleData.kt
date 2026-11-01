package com.maqraah.imamaljazari.data

object SampleData {
    val programs = listOf(
        Program(
            id = "program_talqin",
            title = "التلقين وتصحيح الأداء",
            description = "برنامج عملي يركز على تثبيت الحفظ وتجويد الأداء الصوتي وتدارس الملاحظات بشكل مستمر.",
            features = listOf("تلقين يومي", "تصحيح الأداء", "مراجعة مستمرة"),
            conditions = "المستوى المتوسط فأعلى، حضور منتظم، إمكانية متابعة الصوت عبر المجموعة.",
            duration = "8 أسابيع",
            targetAudience = "الطلاب المبتدئون والمتوسطون",
            gender = "مشترك",
            isActive = true
        ),
        Program(
            id = "program_hifz",
            title = "الحفظ المكثف",
            description = "دورة مكثفة للحفظ مع مراجعة يومية ومتابعة شخصية للطالب من قبل المعلم.",
            features = listOf("خطة حفظ مبرمجة", "مراجعة يومية", "تقييم شهري"),
            conditions = "قدرة على الالتزام بالحفظ اليومي، استيعاب جيد، وجود وقت كافٍ.",
            duration = "12 أسبوعًا",
            targetAudience = "الطلاب المستعدين للحفظ المكثف",
            gender = "مشترك",
            isActive = true
        ),
        Program(
            id = "program_hafs",
            title = "الإجازة برواية حفص",
            description = "برنامج إجازة متقدم يركز على الرواية الصحيحة وتوثيق السند عبر الرواية المعتبرة.",
            features = listOf("رواية حفص", "إجازة معتمدة", "تدقيق السند"),
            conditions = "مستوى حفظ متقدم، القدرة على القراءة والتنقيط، الالتزام بالمتابعة.",
            duration = "3 أشهر",
            targetAudience = "الطلاب المتقدمون والمتدربون",
            gender = "مشترك",
            isActive = true
        ),
        Program(
            id = "program_seven",
            title = "الإجازة بالقراءات السبع",
            description = "البرنامج المتقدم للإجازة في القراءات السبع مع متابعة شاملة في الأداء والسند.",
            features = listOf("القراءات السبع", "إجازة منضبطة", "مراجعة سندية"),
            conditions = "خبرة في القراءات، متابعة مستمرة، التزام بالتجويد.",
            duration = "4 أشهر",
            targetAudience = "الطلبة المتقدمون في القراءة",
            gender = "مشترك",
            isActive = true
        )
    )

    val paymentPackages = listOf(
        PaymentPackage("pkg_100", 100, 500),
        PaymentPackage("pkg_200", 200, 1000),
        PaymentPackage("pkg_300", 300, 1470),
        PaymentPackage("pkg_400", 400, 1920),
        PaymentPackage("pkg_500", 500, 2350),
        PaymentPackage("pkg_600", 600, 2760),
        PaymentPackage("pkg_1000", 1000, 4500)
    )

    val paymentMethods = listOf(
        PaymentMethod(
            id = "cbe",
            name = "CBE",
            accountName = "Imam Al-Jazari Center",
            accountNumber = "1000000000",
            instructions = "قم بتحويل المبلغ إلى الحساب المذكور ثم أرسل إثبات الدفع في النموذج التالي."
        ),
        PaymentMethod(
            id = "boa",
            name = "BOA",
            accountName = "Imam Al-Jazari Center",
            accountNumber = "2000000000",
            instructions = "أدخل بياناتك الصحيحة، ثم أرسل صورة الإيصال أو رقم العملية في النموذج."
        ),
        PaymentMethod(
            id = "telebirr",
            name = "Telebirr",
            accountName = "Imam Al-Jazari Center",
            accountNumber = "+251900000000",
            instructions = "قم بإرسال المبلغ من خلال رقم الهاتف المذكور ثم املأ تفاصيل الدفع."
        ),
        PaymentMethod(
            id = "mpesa",
            name = "M-Pesa",
            accountName = "Imam Al-Jazari Center",
            accountNumber = "+254700000000",
            instructions = "قم بتحويل الرصيد إلى رقم الدفع المعلن ثم أرسل تفاصيل الإيصال."
        )
    )

    val walletTransactions = listOf(
        WalletTransaction(
            id = "txn_001",
            type = "Recharge",
            amountMinutes = 300,
            previousBalance = 0,
            newBalance = 300,
            reason = "شحن أولي",
            createdAt = "2026-10-01",
            byUser = "Admin"
        ),
        WalletTransaction(
            id = "txn_002",
            type = "Usage",
            amountMinutes = -40,
            previousBalance = 300,
            newBalance = 260,
            reason = "جلسة تعليمية",
            createdAt = "2026-10-08",
            byUser = "System"
        )
    )

    val adminPermissions = listOf(
        AdminPermission("perm_registrations", "إدارة طلبات التسجيل", true),
        AdminPermission("perm_payments", "إدارة طلبات الدفع", true),
        AdminPermission("perm_programs", "إدارة البرامج", true),
        AdminPermission("perm_groups", "إدارة المجموعات", false),
        AdminPermission("perm_users", "إدارة المستخدمين", false)
    )

    val supportContact = SupportContact(
        phone = "0990161372",
        email = "kalidahd7@gmil.com"
    )

    val roles = listOf(
        UserRole("role_admin", "المدير العام", "إدارة كاملة للنظام ومشرفي التطبيق."),
        UserRole("role_supervisor", "المشرف", "إدارة الطلبات والمجالات المفوضة."),
        UserRole("role_teacher", "المعلم", "متابعة الطلاب والبرامج."),
        UserRole("role_student", "الطالب", "الالتزام بالبرامج والمجموعات والرصيد.")
    )
}
