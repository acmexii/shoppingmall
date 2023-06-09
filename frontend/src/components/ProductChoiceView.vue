<template>

    <v-data-table
        :headers="headers"
        :items="productChoice"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'ProductChoiceView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            productChoice : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/productChoices'))

            temp.data._embedded.productChoices.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.productChoice = temp.data._embedded.productChoices;
        },
        methods: {
        }
    }
</script>

